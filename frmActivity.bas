B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private frm As Form
	Private jsonMain As String
	Private userRegionMain As String
	Private xui As XUI
	Private ivScreenshot As B4XView
	Private lblFileInfo As B4XView
	Private lblDeviceInfo As B4XView
	Private clvActivity As CustomListView
	Public authToken As String
	Private wvMedia As WebView
	Private lblDate As B4XView
	Private lblTimestamp As Label
	Private previousSelectedIndex As Int
	Private ivWatched As B4XView
	Private kvs As KeyValueStore
	Type VideoInfo (ThumbnailPath As String, DateCreated As String, Watched As String, DeviceName As String, VideoID As String, ThumbnailBLOB() As Byte)
	Private cutils As ControlsUtils
	Private B4XLoadingIndicator1 As B4XLoadingIndicator
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(Parent As Form)
	frm.Initialize("frm", 600dip, 600dip)
	frm.SetFormStyle("UTILITY")
	frm.RootPane.LoadLayout("activity")
	frm.Icon = fx.LoadImage(File.DirAssets, "home.png")
	frm.Title = "Catanaoan Blink XT2 Cameras Activity Viewer"
	frm.SetOwner(Parent)
	frm.WindowWidth = CheckMonitor.MaxX - CheckMonitor.MinX
	frm.WindowLeft = CheckMonitor.MinX
	frm.WindowHeight = CheckMonitor.MaxY - CheckMonitor.MinY
	frm.WindowTop = CheckMonitor.MinY
	Dim Obj As Reflector
	Obj.Target = frm.RootPane
	Obj.AddEventHandler("RootPaneKeyEvent", "javafx.scene.input.KeyEvent.ANY")
End Sub

Public Sub Show(json As String, userRegion As String)

	jsonMain = json
	userRegionMain = userRegion
	B4XLoadingIndicator1.Show
	GetVideos(json, userRegion)
	B4XLoadingIndicator1.Hide
	frm.ShowAndWait

End Sub

Sub GetVideos(json As String, userRegion As String)
	Try
		Dim parser As JSONParser
		parser.Initialize(json)
		Dim root As Map = parser.NextObject
'		Dim purge_id As Int = root.Get("purge_id")
'		Dim limit As Int = root.Get("limit")
		
		Dim media As List = root.Get("media")
		
		kvs.Initialize(File.DirApp, "datastore")
		
		For Each colmedia As Map In media
			Dim thumbnail As String = colmedia.Get("thumbnail")
'			Dim device_id As Int = colmedia.Get("device_id")
'			Dim network_name As String = colmedia.Get("network_name")
			Dim created_at As String = colmedia.Get("created_at")
'			Dim source As String = colmedia.Get("source")
'			Dim medianame As String = colmedia.Get("media")
'			Dim Type As String = colmedia.Get("type")
'			Dim time_zone As String = colmedia.Get("time_zone")
			Dim device_name As String = colmedia.Get("device_name")
'			Dim network_id As Int = colmedia.Get("network_id")
			Dim watched As String = colmedia.Get("watched")
'			Dim deleted As String = colmedia.Get("deleted")
'			Dim updated_at As String = colmedia.Get("updated_at")
			Dim VideoID As String = colmedia.Get("id")
'			Dim additional_devices As List = colmedia.Get("additional_devices")
'			Dim device As String = colmedia.Get("device")
'			Dim partial As String = colmedia.Get("partial")

			Dim medianame As String = colmedia.Get("media")

			' Save to a JPG file
			'File.WriteString(File.DirApp,"frmActivity_GetVideos.txt",json)
			' https://www.b4x.com/android/forum/threads/b4x-xui-image-to-jpeg-byte-array-with-resize-quality-options.91774/#content
			' https://www.b4x.com/android/forum/threads/b4x-bytes-to-file.70111/#post-445167
			If kvs.ContainsKey(VideoID) = False Then
				Dim j As HttpJob
				j.Initialize("", Me)
				j.Download("https://rest-" & userRegion &".immedia-semi.com" & thumbnail & ".jpg")
				j.GetRequest.SetHeader("TOKEN_AUTH", authToken)
				Wait For (j) JobDone(j As HttpJob)
				If j.Success Then
					Dim image As B4XBitmap = j.GetBitmap
					'Convert image to JPEG byte array
					Dim out As OutputStream
					out.InitializeToBytesArray(0)
					image.WriteToStream(out, 100, "JPEG")
					kvs.Put(VideoID, CreateCustomType(medianame,created_at,watched,device_name,VideoID,out.ToBytesArray))
					out.Close
				End If
				j.Release
			Else
				Dim mytypes As Object = kvs.Get(VideoID)
				Dim videos = mytypes As VideoInfo
				If  watched <> videos.Watched Then
					Dim j As HttpJob
					j.Initialize("", Me)
					j.Download("https://rest-" & userRegion &".immedia-semi.com" & thumbnail & ".jpg")
					j.GetRequest.SetHeader("TOKEN_AUTH", authToken)
					Wait For (j) JobDone(j As HttpJob)
					If j.Success Then
						Dim image As B4XBitmap = j.GetBitmap
						'Convert image to JPEG byte array
						Dim out As OutputStream
						out.InitializeToBytesArray(0)
						image.WriteToStream(out, 100, "JPEG")
						kvs.Put(VideoID, CreateCustomType(medianame,created_at,watched,device_name,VideoID,out.ToBytesArray))
						out.Close
					End If
					j.Release
				End If
			End If
		Next

		Dim list1 As List = kvs.ListKeys
		For i =  0 To list1.Size-1  
			Dim mytypes As Object = kvs.Get(list1.Get(i))
			Dim videos = mytypes As VideoInfo
			
			Log("kvs.ListKeys " & i & " | " & videos.VideoID & " | " & videos.Watched & " | " & GetTimestampForSorting)
			
			Dim In As InputStream
			In.InitializeFromBytesArray(videos.ThumbnailBLOB, 0, videos.ThumbnailBLOB.Length)
			Dim bmp As Image
			bmp.Initialize2(In)
			
			Dim p As B4XView = CreateListItem(bmp,videos.DateCreated, videos.DeviceName, watched)
			clvActivity.Add(p,"https://rest-" & userRegion &".immedia-semi.com" & videos.ThumbnailPath & "|" & videos.DeviceName & " " & ConvertFullDateTime(videos.DateCreated))
			If videos.Watched <> "true" Then
				ivWatched.Visible = True
			Else
				ivWatched.Visible = False
			End If

			If i > 100 Then
				kvs.Remove(list1.Get(i))
			End If
		Next
		If list1.Size > 0 Then
			clvActivity.JumpToItem(0)
			Sleep(100)
			clvActivity_ItemClick(0,"") '"https://rest-" & userRegion &".immedia-semi.com" & videos.ThumbnailPath & "|" & videos.DeviceName & " " & ConvertFullDateTime(videos.DateCreated))
			Sleep(100)
		End If
	Catch
		Log(LastException)
	End Try
End Sub

Private Sub CreateCustomType(ThumbnailPath As String, DateCreated As String, Watched As String, DeviceName As String, VideoID As String, ThumbnailBLOB() As Byte) As VideoInfo
	Dim ct As VideoInfo
	ct.Initialize
	ct.ThumbnailPath = ThumbnailPath
	ct.DateCreated = DateCreated
	ct.Watched = Watched
	ct.DeviceName = DeviceName
	ct.ThumbnailBLOB = ThumbnailBLOB
	ct.VideoID = VideoID
	Return ct
End Sub

Sub CreateListItem(screenshot As B4XBitmap, fileinfo As String, devicename As String, watched As String) As B4XView
	Try
		'https://www.b4x.com/android/forum/threads/customlistview.103498/#post-648747
		'https://www.b4x.com/android/forum/threads/customlistview-b4a-to-b4j.85047/#post-539068
		'https://www.b4x.com/android/forum/threads/b4x-xui-xcustomlistview.90789/#post-573958
		Dim p As B4XView = xui.CreatePanel("")
		p.SetLayoutAnimated(0, 0, 0, 400dip, 80dip)
		p.LoadLayout("cellitem")
		ivScreenshot.SetBitmap(screenshot)
		Dim dayname As String
		dayname = ConvertDayName(fileinfo)
		If watched<>"true" Then
			ivWatched.Visible = True
			lblDate.Text = "   " & dayname & " " & ConvertDateTimePeriod(fileinfo, dayname)
		Else
			ivWatched.Visible = False
			lblDate.Text = "   " & dayname
		End If
		lblFileInfo.Text = "   " & ConvertFullDateTime(fileinfo)
		lblDeviceInfo.Text = "   " & devicename
		ivWatched.SetBitmap(fx.LoadImage(File.DirAssets,"blink_clip_roll_blue_dot_icon.png"))
		Return p
	Catch
		Log(LastException)
		Return Null
	End Try

End Sub

Sub ConvertDateTimePeriod(inputTime As String, dayname As String) As String
	' https://www.b4x.com/android/forum/threads/convert-utc-to-ticks-and-vice-versa.36592/#content
	Dim ticks As Long = ParseUTCstring(inputTime.Replace("+00:00","+0000"))
	DateTime.DateFormat = "MMM d, yyyy h:mm:ss a"
	Dim lngTicks As Long = ticks
	Dim p As Period = DateUtils.PeriodBetween(lngTicks,DateTime.now)
	'Log("Time difference: " & p.Days & "d " & p.Hours & "h " & p.Minutes & "m " & p.Seconds & "s")
	If dayname.Contains("Today") Then
		If p.Days = 0 Then
			If p.Hours = 0 Then
				If p.Minutes = 0 Then
					Return p.Seconds & "s ago"
				Else
					Return p.Minutes & "m " & p.Seconds & "s ago"
				End If
			Else
				Return p.Hours & "h " & p.Minutes & "m " & p.Seconds & "s ago"
			End If
		else If p.Hours = 0 Then
			If p.Minutes = 0 Then
				Return p.Seconds & "s ago"
			Else
				Return p.Minutes & "m " & p.Seconds & "s ago"
			End If
		else If p.Minutes = 0 Then
			Return p.Seconds & "s ago"
		Else
			Return p.Days & "d " & p.Hours & "h " & p.Minutes & "m " & p.Seconds & "s ago"
		End If
	else if dayname.Contains("Yesterday") Then
		If p.Days = 0 Then
			If p.Hours = 0 Then
				If p.Minutes = 0 Then
					Return p.Seconds & "s ago"
				Else
					Return p.Minutes & "m " & p.Seconds & "s ago"
				End If
			Else
				Return p.Hours & "h " & p.Minutes & "m " & p.Seconds & "s ago"
			End If
		Else
			Return p.Days & "d " & p.Hours & "h " & p.Minutes & "m " & p.Seconds & "s ago"
		End If
	Else
		Return p.Days & "d " & p.Hours & "h " & p.Minutes & "m " & p.Seconds & "s ago"
	End If
End Sub

Sub ConvertDayName(inputTime As String) As String
	' https://www.b4x.com/android/forum/threads/convert-utc-to-ticks-and-vice-versa.36592/#content
	Dim ticks As Long = ParseUTCstring(inputTime.Replace("+00:00","+0000"))
	DateTime.DateFormat = "MMM d, yyyy h:mm:ss a"
	Dim lngTicks As Long = ticks

	Dim Yesterday As Long
	Dim timestamp As Long
	DateTime.DateFormat = "yyyyMMdd"
	Yesterday = DateTime.Date(DateTime.add(DateTime.Now, 0, 0, -1))
	timestamp = DateTime.Date(lngTicks)

	DateTime.DateFormat = "h:mm:ss a"
	If DateUtils.IsSameDay(lngTicks,DateTime.now) Then
		Return "Today" '& DateTime.Date(lngTicks)
	Else If Yesterday = timestamp Then
		Return "Yesterday" '& DateTime.Date(lngTicks)
	Else
		Return DateUtils.GetDayOfWeekName(lngTicks) '& " " & DateTime.Date(lngTicks)
	End If
End Sub


Sub ConvertFullDateTime(inputTime As String) As String
	' https://www.b4x.com/android/forum/threads/convert-utc-to-ticks-and-vice-versa.36592/#content
	Dim ticks As Long = ParseUTCstring(inputTime.Replace("+00:00","+0000"))
	DateTime.DateFormat = "MMM d, yyyy h:mm:ss a"
	Dim lngTicks As Long = ticks

	Dim Yesterday As Long
	Dim timestamp As Long
	DateTime.DateFormat = "yyyyMMdd"
	Yesterday = DateTime.Date(DateTime.add(DateTime.Now, 0, 0, -1))
	timestamp = DateTime.Date(lngTicks)

	DateTime.DateFormat = "h:mm:ss a"
	If DateUtils.IsSameDay(lngTicks,DateTime.now) Then
		Return DateTime.Date(lngTicks)
	Else If Yesterday = timestamp Then
		Return DateTime.Date(lngTicks)
	Else 
		Return DateTime.Date(lngTicks)
	End If
End Sub

Sub GetTimestampForSorting() As String
	DateTime.DateFormat = "yyyyMMddHHmmssSSS"
	Return DateTime.Date(DateTime.Now)
End Sub

Sub ParseUTCstring(utc As String) As Long
	Dim df As String = DateTime.DateFormat
	Dim res As Long
	If utc.CharAt(10) = "T" Then
		'convert the second format to the first one.
		If utc.CharAt(19) = "." Then utc = utc.SubString2(0, 19) & "+0000"
		DateTime.DateFormat = "yyyy-MM-dd'T'HH:mm:ssZ"
		' 2019-09-20T13:04:05+00:00
	Else
		DateTime.DateFormat = "EEE MMM dd HH:mm:ss Z yyyy"
	End If
	Try
		res = DateTime.DateParse(utc)
	Catch
		res = 0
	End Try
	DateTime.DateFormat = df
	Return res
End Sub

'Sub p_MouseClicked (EventData As MouseEvent)
'	ClickIndex = ClickIndex + 1
'	Dim MyIndex As Int = ClickIndex
'	EventData.Consume
'	Sleep(200)
'	If MyIndex = ClickIndex Then
'		If EventData.ClickCount = 1 Then
'			'Log("regular click")
'			Dim index As Int
'			index = clvActivity.GetItemFromView(Sender)
'			Log(index)
'		Else if EventData.ClickCount > 1 Then
'			Log("Double click")
'		End If
'	End If
'End Sub

Sub clvActivity_ItemClick (Index As Int, Value As Object)
	Try
		B4XLoadingIndicator1.Show
		UpdateItemColor(Index)
		wvMedia.LoadUrl("")
		Dim video As String
		video = clvActivity.GetValue(Index)
		Dim videoURL As String = Regex.Split("\|",video)(0)
		Dim videoTimestamp As String = Regex.Split("\|",video)(1)
		ShowVideo(videoURL,videoTimestamp)
		Dim list1 As List = kvs.ListKeys
		For i =  0 To list1.Size-1
			Dim mytypes As Object = kvs.Get(list1.Get(i))
			Dim videos = mytypes As VideoInfo
			If videoURL.Contains(videos.VideoID) Then
				kvs.Put(videos.VideoID,CreateCustomType(videos.ThumbnailPath,videos.DateCreated,"true",videos.DeviceName,videos.VideoID,videos.ThumbnailBLOB))
			End If
		Next
	Catch
		B4XLoadingIndicator1.Hide
		Log(LastException)
	End Try

End Sub

Sub ShowVideo (Link As String, timestamp As String)
	Try
		Dim j As HttpJob
		j.Initialize("", Me)
		j.Download(Link)
		j.GetRequest.SetHeader("TOKEN_AUTH", authToken)
		Wait For (j) JobDone(j As HttpJob)
		B4XLoadingIndicator1.Hide
		If j.Success Then
			' Save to a JPG file
			Dim out As OutputStream = File.OpenOutput(File.DirApp, "media.mp4", False)
			File.Copy2(j.GetInputStream, out)
			out.Close '<------ very important
		
			lblTimestamp.Text= timestamp
			Dim sb As StringBuilder
			sb.Initialize
			sb.Append("<video width='100%' height='100%' controls autoplay>")
			sb.Append("<source src='" & File.GetUri(File.DirApp ,"media.mp4") & "' Type='video/mp4'/>")
			sb.Append("</video>")
			wvMedia.LoadHtml(sb.ToString) 
		Else

		End If
		If j.ErrorMessage.Contains("Media not found") Then
			clvActivity.RemoveAt(previousSelectedIndex)
			Dim list1 As List = kvs.ListKeys
			For i =  0 To list1.Size-1
				Dim mytypes As Object = kvs.Get(list1.Get(i))
				Dim videos = mytypes As VideoInfo
				If Link.Contains(videos.VideoID) Then
					kvs.Remove(list1.Get(i))
					clvActivity.Clear
					cutils.ShowNotification("Catanaoan Blink XT2 Cameras v1.0","Media not found. Removed from the list.", cutils.ICON_INFORMATION)
					GetVideos(jsonMain,userRegionMain)
					Exit
				End If
			Next
		End If
		j.Release
	Catch
		Log(LastException)
	End Try
	
	Try
		Sleep(2000)
		Dim p As B4XView = clvActivity.GetPanel(previousSelectedIndex)
		If p.NumberOfViews > 0 Then
			'get the content label view (it is inside an additional panel)
			Dim ContentLabel As ImageView = p.GetView(0).GetView(1) ' imageview for unwatched videos
			ContentLabel.Visible = False
		End If
	Catch
		Log(LastException)
	End Try
End Sub

Sub frm_CloseRequest (EventData As Event)
	wvMedia.LoadUrl("")
	wvMedia.RemoveNodeFromParent
	File.Delete(File.DirApp,"screenshot.jpg")
	File.Delete(File.DirApp,"media.mp4")
End Sub

Private Sub RootPaneKeyEvent_Event(e As Event)
	Dim KE As Reflector
	Dim sCode As String
	Dim sType As String 'ignore
	Dim result As Int 'ignore
	KE.Target = e	 ' e is a KeyEvent instance
	sCode = KE.RunMethod("getCode")
	sType = KE.RunMethod("getEventType")
	If sCode="ESCAPE" Then
		wvMedia.LoadUrl("")
		wvMedia.RemoveNodeFromParent
		File.Delete(File.DirApp,"screenshot.jpg")
		File.Delete(File.DirApp,"media.mp4")
		frm.Close
	End If
End Sub

Sub CheckMonitor() As Screen
	Try
		If fx.Screens.Size= 1 Then
			Dim SList As List = fx.Screens
			Dim S As Screen = SList.Get(0)
			'Msgbox.Show("Minimum X: " & S.MinX,"Screen")
			Return S
		Else If fx.Screens.Size> 1 Then
			Dim SList As List = fx.Screens
			Dim S As Screen = SList.Get(2)
			'Msgbox.Show("Minimum X: " & S.MinX,"Screen")
			Return S
		Else
			Dim SList As List = fx.Screens
			Dim S As Screen = SList.Get(0)
			'Msgbox.Show("Minimum X: " & S.MinX,"Screen")
			Return S
		End If
	Catch
		Dim SList As List = fx.Screens
		Dim S As Screen = SList.Get(0)
		'Msgbox.Show("Minimum X: " & S.MinX,"Screen")
		Return S
	End Try
End Sub


Sub wvMedia_PageFinished (Url As String)

End Sub

Sub UpdateItemColor (Index As Int)
	Try
		If previousSelectedIndex <> Index Then
			Dim p As B4XView = clvActivity.GetPanel(previousSelectedIndex)
			If p.NumberOfViews > 0 Then
				' https://www.b4x.com/android/forum/threads/class-css-utils.61824/#post-390334
				Dim backPanel As Pane = p.getview(0)
				CSSUtils.SetBackgroundColor(backPanel,fx.Colors.ARGB(255,217,215,222))
				CSSUtils.SetBorder(backPanel,1,fx.Colors.Black,1)
			End If
		End If
	
		Dim p As B4XView = clvActivity.GetPanel(Index)
		If p.NumberOfViews > 0 Then
			' https://www.b4x.com/android/forum/threads/class-css-utils.61824/#post-390334
			Dim backPanel As Pane = p.getview(0)
			CSSUtils.SetBackgroundColor(backPanel, fx.Colors.white)
			CSSUtils.SetBorder(backPanel,2,fx.Colors.Red,1)
		End If
	
		previousSelectedIndex = Index
	Catch
		Log(LastException)
	End Try
End Sub

'Sub UpdateItemColor (Index As Int, Color As Int)
'	Try
'		
'		If previousSelectedIndex <> Index Then
'			Dim p As B4XView = clvActivity.GetPanel(previousSelectedIndex)
'			If p.NumberOfViews > 0 Then
'				'get the content label view (it is inside an additional panel)
'				Dim ContentLabel As B4XView = p.GetView(0).GetView(0)
'				ContentLabel.TextColor = xui.Color_Black
'		
'				Dim ContentLabel As B4XView = p.GetView(0).GetView(1)
'				ContentLabel.TextColor = xui.Color_Black
'		
'				Dim ContentLabel As B4XView = p.GetView(0).GetView(2)
'				ContentLabel.TextColor = xui.Color_Black
'				
'				Dim ContentLabel As B4XView = p.GetView(1) ' lblDate. Check the Views Tree and it is not under pnlExpanded.
'				ContentLabel.TextColor = xui.Color_Black
'			End If
'		End If
'	
'		Dim p As B4XView = clvActivity.GetPanel(Index)
'		If p.NumberOfViews > 0 Then
'			'get the content label view (it is inside an additional panel)
'			Dim ContentLabel As B4XView = p.GetView(0).GetView(0)
'			ContentLabel.TextColor = Color
'		
'			Dim ContentLabel As B4XView = p.GetView(0).GetView(1)
'			ContentLabel.TextColor = Color
'		
'			Dim ContentLabel As B4XView = p.GetView(0).GetView(2)
'			ContentLabel.TextColor = Color
'			
'			Dim ContentLabel As B4XView = p.GetView(1) ' lblDate. Check the Views Tree and it is not under pnlExpanded.
'			ContentLabel.TextColor = Color
'			
'		End If
'	
'		previousSelectedIndex = Index
'	Catch
'		Log(LastException)
'	End Try
'End Sub