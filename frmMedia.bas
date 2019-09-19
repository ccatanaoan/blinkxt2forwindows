B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private frm As Form
	Private wvMedia As WebView
	Public url As String
	Public isVideo As Boolean = False
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize (Parent As Form)
	frm.Initialize("frm", 600dip, 600dip)
	frm.SetFormStyle("UTILITY")
	frm.RootPane.LoadLayout("main")
	frm.Icon = fx.LoadImage(File.DirAssets, "home.png")
	frm.Title = "Catanaoan Blink XT2 Cameras Media Viewer"
	frm.SetOwner(Parent)
	frm.WindowWidth = CheckMonitor.MaxX - CheckMonitor.MinX 
	frm.WindowLeft = CheckMonitor.MinX 
    frm.WindowHeight = CheckMonitor.MaxY - CheckMonitor.MinY 
	frm.WindowTop = CheckMonitor.MinY
	Dim Obj As Reflector
	Obj.Target = frm.RootPane
	Obj.AddEventHandler("RootPaneKeyEvent", "javafx.scene.input.KeyEvent.ANY")
End Sub

Public Sub Show 
	If isVideo Then
'		Dim sb As StringBuilder
'		sb.Initialize
'		sb.Append("<video width='100%' height='100%' controls>")
'		sb.Append("<source src='" & url & "' Type='video/mp4'/>")
'		sb.Append("</video>")
'		wvMedia.LoadHtml(sb.ToString)
'		
'		Dim mv As JavaObject
'		m.Initialize("m",File.GetUri(File.DirApp ,"media.mp4"))
'		mv.InitializeNewInstance("javafx.scene.media.MediaView",Array(m))
'		pnlVideo.AddNode(mv,0,0,frm.Width,frm.height)
'		
'		m.CycleCount=-1
'		m.Play
	Else
		wvMedia.Loadhtml(url)
	End If
	frm.ShowAndWait
End Sub

Sub frm_CloseRequest (EventData As Event)
	'm.Stop
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
		'm.Stop
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
