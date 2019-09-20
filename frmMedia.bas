B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private frm As Form
	Public url As String
	Private imgScreenshot As ImageView
	Private lblTimestamp As Label
	Public timestamp As String
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
	'Obj.AddEventHandler("RootPaneKeyEvent", "javafx.scene.input.KeyEvent.ANY")
	Obj.AddEventHandler("keypressed", "javafx.scene.input.KeyEvent.KEY_PRESSED")
End Sub

Public Sub Show
	If url.Contains("Driveway") Then
		imgScreenshot.SetImage(fx.LoadImage(File.DirApp,"Driveway.jpg"))
	Else if url.Contains("FrontDoor") Then
		imgScreenshot.SetImage(fx.LoadImage(File.DirApp,"FrontDoor.jpg"))
	Else if url.Contains("SideYard") Then
		imgScreenshot.SetImage(fx.LoadImage(File.DirApp,"SideYard.jpg"))
	End If
	lblTimestamp.Text = timestamp
	frm.ShowAndWait
End Sub

Sub KeyPressed_Event (e As Event)
Log("here")
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


