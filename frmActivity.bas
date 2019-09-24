B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private frm As Form
	Public jsonMain As String
	Private xui As XUI
	Private ivScreenshot As B4XView
	Private lblFileInfo As B4XView
	Private lblDeviceInfo As B4XView
	Private clvActivity As CustomListView
	Public authToken As String
	Private wvMedia As WebView
	Private lblDate As B4XView
	Private lblTimestamp As Label
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

	GetVideos(json, userRegion)
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
'			Dim watched As String = colmedia.Get("watched")
'			Dim deleted As String = colmedia.Get("deleted")
'			Dim updated_at As String = colmedia.Get("updated_at")
'			Dim id As Int = colmedia.Get("id")
'			Dim additional_devices As List = colmedia.Get("additional_devices")
'			Dim device As String = colmedia.Get("device")
'			Dim partial As String = colmedia.Get("partial")

			Dim medianame As String = colmedia.Get("media")
			Dim j As HttpJob
			j.Initialize("", Me)
			j.Download("https://rest-" & userRegion &".immedia-semi.com" & thumbnail & ".jpg")
			j.GetRequest.SetHeader("TOKEN_AUTH", authToken)
			Wait For (j) JobDone(j As HttpJob)
			If j.Success Then
				' Save to a JPG file

				Dim out As OutputStream = File.OpenOutput(File.DirApp, "screenshot.jpg", False)
				File.Copy2(j.GetInputStream, out)
				out.Close '<------ very important

				' Display in ImageView
				'a = j.GetBitmap
				Dim p As B4XView = CreateListItem(j.GetBitmap,created_at, device_name)
				clvActivity.Add(p,"https://rest-" & userRegion &".immedia-semi.com" & medianame & "|" & device_name & " " & ConvertFullDateTime(created_at))
				If clvActivity.Size = 1 Then
					ShowVideo("https://rest-" & userRegion &".immedia-semi.com" & medianame,device_name & " " & ConvertFullDateTime(created_at))
				End If
			Else

			End If
			j.Release
		Next
		'Dim refresh_count As Int = root.Get("refresh_count")
	Catch
		Log(LastException)
		fx.Msgbox2(frm,LastException,"GetVideos Exception","OK","","",fx.MSGBOX_ERROR)
	End Try
End Sub

Sub CreateListItem(screenshot As B4XBitmap, fileinfo As String, devicename As String) As B4XView
	Try
		'https://www.b4x.com/android/forum/threads/customlistview.103498/#post-648747
		'https://www.b4x.com/android/forum/threads/customlistview-b4a-to-b4j.85047/#post-539068
		'https://www.b4x.com/android/forum/threads/b4x-xui-xcustomlistview.90789/#post-573958
		Dim p As B4XView = xui.CreatePanel("")
		p.SetLayoutAnimated(0, 0, 0, 400dip, 80dip)
		p.LoadLayout("cellitem")
		ivScreenshot.SetBitmap(screenshot)
		lblDate.Text = "   " & ConvertFullDateTime(fileinfo)
		lblFileInfo.Text = "   " & ConvertDateTime(fileinfo)
		lblDeviceInfo.Text = "   " & devicename
		Return p
	Catch
		Log(LastException)
		fx.Msgbox2(frm,LastException,"CreateListItem Exception","OK","","",fx.MSGBOX_ERROR)
		Return Null
	End Try

End Sub

Sub ConvertDateTime(inputTime As String) As String
	' https://www.b4x.com/android/forum/threads/convert-utc-to-ticks-and-vice-versa.36592/#content
	Dim ticks As Long = ParseUTCstring(inputTime.Replace("+00:00","+0000"))
	DateTime.DateFormat = "MMM d, yyyy h:mm:ss a"
	Dim lngTicks As Long = ticks
	Dim p As Period = DateUtils.PeriodBetween(lngTicks,DateTime.now)
	'Log("Time difference: " & p.Days & "d " & p.Hours & "h " & p.Minutes & "m " & p.Seconds & "s")
	If lblDate.Text.Contains("Yesterday") Or lblDate.Text.Contains("Today") Then
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
	Else
		Return p.Days & "d " & p.Hours & "h " & p.Minutes & "m " & p.Seconds & "s ago"
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
		Return "Today " & DateTime.Date(lngTicks)
	Else If Yesterday = timestamp Then
		Return "Yesterday " & DateTime.Date(lngTicks)
	Else 
		Return DateUtils.GetDayOfWeekName(lngTicks) & " " & DateTime.Date(lngTicks)
	End If
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
		wvMedia.LoadUrl("")
		Dim video As String
		video = clvActivity.GetValue(Index)
		Dim videoURL As String = Regex.Split("\|",video)(0)
		Dim videoTimestamp As String = Regex.Split("\|",video)(1)
		ShowVideo(videoURL,videoTimestamp)
	Catch
		Log(LastException)
		fx.Msgbox2(frm,LastException,"clvActivity ItemClick Exception","OK","","",fx.MSGBOX_ERROR)
	End Try

End Sub

Sub ShowVideo (Link As String, timestamp As String)
	Try
		Dim j As HttpJob
		j.Initialize("", Me)
		j.Download(Link)
		j.GetRequest.SetHeader("TOKEN_AUTH", authToken)
		Wait For (j) JobDone(j As HttpJob)
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
		j.Release
	Catch
		Log(LastException)
		fx.Msgbox2(frm,LastException,"ShowVideo Exception","OK","","",fx.MSGBOX_ERROR)
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