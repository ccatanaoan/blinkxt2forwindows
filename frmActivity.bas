B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private frm As Form
	Public clvActivity As CustomListView
	Public jsonMain As String
	Type CardData (Title As String, Content As String, BitmapFile As String)
	Private xui As XUI
	Private ivScreenshot As B4XView
	Private lblFileInfo As B4XView
	Private lblDeviceInfo As B4XView
	Private screenshotBitmap As B4XBitmap
	Private lv As ListView
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(Parent As Form)
	frm.Initialize("frm", 600dip, 600dip)
	frm.SetFormStyle("UTILITY")
	frm.RootPane.LoadLayout("main")
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

Public Sub Show(json As String, userRegion As String, authToken As String)

	GetVideos(json, userRegion, authToken)
	frm.ShowAndWait
	'clvActivity.Add(CreateListItem("test", "device_id",180, 120), "teT")

End Sub

Sub GetVideos(json As String, userRegion As String, authToken As String)
	Try
		Dim parser As JSONParser
		parser.Initialize(json)
		Dim root As Map = parser.NextObject
'		Dim purge_id As Int = root.Get("purge_id")
'		Dim limit As Int = root.Get("limit")
		
		
		lv.Initialize( "lv")
		frm.RootPane.AddNode(lv, frm.WindowWidth-frm.WindowWidth/4, 0, frm.WindowWidth/4, frm.WindowHeight)
		
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
			
			'If medianame = "/api/v2/accounts/88438/media/clip/419225488.mp4" Then
				'ShowVideo("https://rest-" & userRegion &".immedia-semi.com" & medianame,authToken)
				'clvActivity.Add(CreateListItem(medianame, device_id,clvActivity.AsView.Width, 120), medianame)
			'End If
			

			'For i=0 To 9
			'lv.Items.Add(CreateListItem(medianame, device_id,frm.WindowWidth, 120dip))'( CreateListItem( "Text1 - "&i, "Text2", 300dip, 75dip, fx.LoadImage( File.DirApp, "screenshot.jpg")))
			'Next
			
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
				clvActivity.Add(p,"")
				'lv.Items.Add(CreateListItem(j.GetBitmap,created_at, device_name,lv.Width, 90dip))'( CreateListItem( "Text1 - "&i, "Text2", 300dip, 75dip, fx.LoadImage( File.DirApp, "screenshot.jpg")))
			Else

			End If
			j.Release
		Next

		'Dim refresh_count As Int = root.Get("refresh_count")
	Catch
		Log(LastException)
	End Try
End Sub

Sub lv_SelectedIndexChanged(Index As Int)
	If Index > -1 Then
		'Dim lbl As Label = lv.SelectedIndex
		'lv.Tag
	End If
End Sub

Sub CreateListItem(screenshot As Image, fileinfo As String, devicename As String) As B4XView
	Try
		'https://www.b4x.com/android/forum/threads/customlistview.103498/#post-648747
		'https://www.b4x.com/android/forum/threads/customlistview-b4a-to-b4j.85047/#post-539068
		'https://www.b4x.com/android/forum/threads/b4x-xui-xcustomlistview.90789/#post-573958
		Dim p As B4XView = xui.CreatePanel("")
		
		'p.Initialize("")
		'p.SetSize(Width, Height)
		p.LoadLayout("cellitem")
		p.SetLayoutAnimated(0, 0, 0, 400dip, 300dip)
		'Dim xivscreenshot As B4XView = ivScreenshot
		ivScreenshot.SetBitmap(screenshot)
		'Dim xlblFileInfo As B4XView = lblFileInfo
		lblFileInfo.Text = fileinfo
		'Dim xlblDeviceInfo As B4XView = lblDeviceInfo
		lblDeviceInfo.Text = devicename
		Return p
	Catch
		Log(LastException)
		Return Null
	End Try

End Sub

Sub DownloadImage (Link As String, authToken As String)
	Dim a As B4XBitmap
	Try
		Dim j As HttpJob
		j.Initialize("", Me)
		j.Download(Link)
		j.GetRequest.SetHeader("TOKEN_AUTH", authToken)
		Wait For (j) JobDone(j As HttpJob)
		If j.Success Then
			' Save to a JPG file

			Dim out As OutputStream = File.OpenOutput(File.DirApp, "screenshot.jpg", False)
			File.Copy2(j.GetInputStream, out)
			out.Close '<------ very important
			
			' Display in ImageView
			'a = j.GetBitmap
		Else
			a = Null
		End If
		j.Release
	Catch
		a = Null
		Log(LastException)
	End Try
	screenshotBitmap = a
End Sub

Sub ShowVideo (Link As String, authToken As String)
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
			
'			Dim mf As frmMedia
'			mf.Initialize(MainForm)
'			mf.isVideo = True
'			mf.url=File.GetUri(File.DirApp, "media.mp4")
'			mf.Show
		Else

		End If
		j.Release
	Catch
		Log(LastException)
	End Try
End Sub

Sub frm_CloseRequest (EventData As Event)
	
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


