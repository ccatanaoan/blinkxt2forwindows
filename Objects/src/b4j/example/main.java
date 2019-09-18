package b4j.example;


import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 900, 1000);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static String _emailaddress = "";
public static String _password = "";
public static String _authtoken = "";
public static String _userregion = "";
public static String _accountid = "";
public static String _networkid = "";
public static String _commandid = "";
public static boolean _commandcomplete = false;
public static String _camerathumbnail = "";
public static anywheresoftware.b4j.objects.LabelWrapper _lbtitle = null;
public static double _xmouse = 0;
public static double _ymouse = 0;
public static boolean _ismaximized = false;
public static anywheresoftware.b4j.objects.ImageViewWrapper _ivclose = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper _ivmax = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper _ivmin = null;
public static String _atualskin = "";
public static String _imginit = "";
public static double _f_x = 0;
public static double _f_y = 0;
public static double _f_w = 0;
public static double _f_h = 0;
public static anywheresoftware.b4j.objects.ButtonWrapper _btndriveway = null;
public static String _response = "";
public static anywheresoftware.b4j.objects.ImageViewWrapper _ivdriveway = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblstatus = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper _ivfrontdoor = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper _ivsideyard = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbldriveway = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblfrontdoor = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblsideyard = null;
public static b4j.example.customlistview _clvdriveway = null;
public static b4j.example.customlistview _clvfrontdoor = null;
public static b4j.example.customlistview _clvsideyard = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblsyncmodule = null;
public static b4j.example.httputils2service _httputils2service = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 110;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return false;
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
String _skintemp = "";
String _skindefault = "";
anywheresoftware.b4j.agraham.reflection.Reflection _obj = null;
 //BA.debugLineNum = 45;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 46;BA.debugLine="Try";
try { //BA.debugLineNum = 47;BA.debugLine="Dim skinTemp As String";
_skintemp = "";
 //BA.debugLineNum = 48;BA.debugLine="Dim skinDefault As String";
_skindefault = "";
 //BA.debugLineNum = 50;BA.debugLine="If File.Exists(File.DirApp, \"skin.ini\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"skin.ini")) { 
 //BA.debugLineNum = 51;BA.debugLine="skinTemp = File.ReadString(File.DirApp, \"skin.i";
_skintemp = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"skin.ini");
 }else {
 //BA.debugLineNum = 53;BA.debugLine="File.WriteString(File.DirApp, \"skin.ini\", \"vdSk";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"skin.ini","vdSk03");
 //BA.debugLineNum = 54;BA.debugLine="skinTemp = \"vdSk03\"";
_skintemp = "vdSk03";
 };
 //BA.debugLineNum = 57;BA.debugLine="If skinTemp = \"\" Then";
if ((_skintemp).equals("")) { 
 //BA.debugLineNum = 58;BA.debugLine="skinDefault = \"vdSk03\"";
_skindefault = "vdSk03";
 }else {
 //BA.debugLineNum = 60;BA.debugLine="If skinTemp = \"vdSk01\" Or skinTemp = \"vdSk02\" O";
if ((_skintemp).equals("vdSk01") || (_skintemp).equals("vdSk02") || (_skintemp).equals("vdSk03") || (_skintemp).equals("vdSk04") || (_skintemp).equals("vdSk05") || (_skintemp).equals("vdSk06")) { 
 //BA.debugLineNum = 61;BA.debugLine="skinDefault = skinTemp";
_skindefault = _skintemp;
 }else {
 //BA.debugLineNum = 63;BA.debugLine="skinDefault = \"vdSk03\"";
_skindefault = "vdSk03";
 };
 };
 //BA.debugLineNum = 67;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 68;BA.debugLine="MainForm.SetFormStyle(\"TRANSPARENT\")";
_mainform.SetFormStyle("TRANSPARENT");
 //BA.debugLineNum = 69;BA.debugLine="MainForm.RootPane.LoadLayout(skinDefault) 'Load";
_mainform.getRootPane().LoadLayout(ba,_skindefault);
 //BA.debugLineNum = 70;BA.debugLine="AtualSkin = skinDefault";
_atualskin = _skindefault;
 //BA.debugLineNum = 71;BA.debugLine="MainForm.BackColor = fx.Colors.Transparent";
_mainform.setBackColor(_fx.Colors.Transparent);
 //BA.debugLineNum = 72;BA.debugLine="MainForm.RootPane.Style = \"-fx-background-color:";
_mainform.getRootPane().setStyle("-fx-background-color:transparent;-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 1.0) , 15,0, 0.0, 0.0);");
 //BA.debugLineNum = 73;BA.debugLine="MainForm.Resizable = True";
_mainform.setResizable(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 74;BA.debugLine="MainForm.Icon = fx.LoadImage(File.DirAssets, \"ho";
_mainform.setIcon((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"home.png").getObject()));
 //BA.debugLineNum = 75;BA.debugLine="MainForm.Title = \"Catanaoan Blink XT2 Cameras v1";
_mainform.setTitle("Catanaoan Blink XT2 Cameras v1.0");
 //BA.debugLineNum = 76;BA.debugLine="lbTitle.MouseCursor = fx.Cursors.MOVE";
_lbtitle.setMouseCursor(_fx.Cursors.MOVE);
 //BA.debugLineNum = 77;BA.debugLine="lbTitle.Text = \"Catanaoan Blink XT2 Cameras v1.0";
_lbtitle.setText("Catanaoan Blink XT2 Cameras v1.0");
 //BA.debugLineNum = 78;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 79;BA.debugLine="Obj.Target = ivClose";
_obj.Target = (Object)(_ivclose.getObject());
 //BA.debugLineNum = 80;BA.debugLine="Obj.AddEventHandler2(\"Close_Entered\", \"onMouseEn";
_obj.AddEventHandler2(ba,"Close_Entered","onMouseEnteredProperty");
 //BA.debugLineNum = 81;BA.debugLine="Obj.AddEventHandler2(\"Close_Exited\", \"onMouseExi";
_obj.AddEventHandler2(ba,"Close_Exited","onMouseExitedProperty");
 //BA.debugLineNum = 82;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 83;BA.debugLine="Obj.Target = ivMax";
_obj.Target = (Object)(_ivmax.getObject());
 //BA.debugLineNum = 84;BA.debugLine="Obj.AddEventHandler2(\"Max_Entered\", \"onMouseEnte";
_obj.AddEventHandler2(ba,"Max_Entered","onMouseEnteredProperty");
 //BA.debugLineNum = 85;BA.debugLine="Obj.AddEventHandler2(\"Max_Exited\", \"onMouseExite";
_obj.AddEventHandler2(ba,"Max_Exited","onMouseExitedProperty");
 //BA.debugLineNum = 86;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 87;BA.debugLine="Obj.Target = ivMin";
_obj.Target = (Object)(_ivmin.getObject());
 //BA.debugLineNum = 88;BA.debugLine="Obj.AddEventHandler2(\"Min_Entered\", \"onMouseEnte";
_obj.AddEventHandler2(ba,"Min_Entered","onMouseEnteredProperty");
 //BA.debugLineNum = 89;BA.debugLine="Obj.AddEventHandler2(\"Min_Exited\", \"onMouseExite";
_obj.AddEventHandler2(ba,"Min_Exited","onMouseExitedProperty");
 //BA.debugLineNum = 90;BA.debugLine="imgInit = AtualSkin.SubString(2).ToLowerCase";
_imginit = _atualskin.substring((int) (2)).toLowerCase();
 //BA.debugLineNum = 91;BA.debugLine="Get_css";
_get_css();
 //BA.debugLineNum = 96;BA.debugLine="MainForm.WindowLeft = CheckMonitor.MaxX	- MainFo";
_mainform.setWindowLeft(_checkmonitor().getMaxX()-_mainform.getWidth()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
 //BA.debugLineNum = 97;BA.debugLine="MainForm.WindowTop = CheckMonitor.MaxY - MainFor";
_mainform.setWindowTop(_checkmonitor().getMaxY()-_mainform.getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
 //BA.debugLineNum = 99;BA.debugLine="lblStatus.TextColor = fx.Colors.White";
_lblstatus.setTextColor(_fx.Colors.White);
 //BA.debugLineNum = 100;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 101;BA.debugLine="RequestAuthToken";
_requestauthtoken();
 } 
       catch (Exception e50) {
			ba.setLastException(e50); //BA.debugLineNum = 103;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public static String  _btndriveway_click() throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub btnDriveway_Click";
 //BA.debugLineNum = 114;BA.debugLine="RefreshCameras(False)";
_refreshcameras(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public static String  _checkbattlife(int _battlevel) throws Exception{
 //BA.debugLineNum = 621;BA.debugLine="Sub CheckBattLife(battlevel As Int) As String";
 //BA.debugLineNum = 623;BA.debugLine="If battlevel <= 136 Then";
if (_battlevel<=136) { 
 //BA.debugLineNum = 624;BA.debugLine="Return \"Replace battery now!\"";
if (true) return "Replace battery now!";
 }else if(_battlevel>=160) { 
 //BA.debugLineNum = 626;BA.debugLine="Return \"Very high\"";
if (true) return "Very high";
 }else if(_battlevel>136 && _battlevel<138) { 
 //BA.debugLineNum = 628;BA.debugLine="Return \"Very low\"";
if (true) return "Very low";
 }else {
 //BA.debugLineNum = 630;BA.debugLine="Return \"High\"";
if (true) return "High";
 };
 //BA.debugLineNum = 632;BA.debugLine="End Sub";
return "";
}
public static String  _checklfrlevel(int _lfrlevel) throws Exception{
 //BA.debugLineNum = 634;BA.debugLine="Sub CheckLFRLevel(lfrlevel As Int) As String";
 //BA.debugLineNum = 636;BA.debugLine="If lfrlevel > -67 Then";
if (_lfrlevel>-67) { 
 //BA.debugLineNum = 637;BA.debugLine="Return \"Amazing\"";
if (true) return "Amazing";
 }else if(_lfrlevel>-70 && _lfrlevel<=-67) { 
 //BA.debugLineNum = 639;BA.debugLine="Return \"Very good\"";
if (true) return "Very good";
 }else if(_lfrlevel>-80 && _lfrlevel<=-70) { 
 //BA.debugLineNum = 641;BA.debugLine="Return \"OK\"";
if (true) return "OK";
 }else if(_lfrlevel>-90 && _lfrlevel<=-80) { 
 //BA.debugLineNum = 643;BA.debugLine="Return \"Not Good\"";
if (true) return "Not Good";
 }else {
 //BA.debugLineNum = 645;BA.debugLine="Return \"Unusable\"";
if (true) return "Unusable";
 };
 //BA.debugLineNum = 647;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.JFX.ScreenWrapper  _checkmonitor() throws Exception{
anywheresoftware.b4a.objects.collections.List _slist = null;
anywheresoftware.b4j.objects.JFX.ScreenWrapper _s = null;
 //BA.debugLineNum = 770;BA.debugLine="Sub CheckMonitor() As Screen";
 //BA.debugLineNum = 771;BA.debugLine="Try";
try { //BA.debugLineNum = 772;BA.debugLine="If fx.Screens.Size= 1 Then";
if (_fx.getScreens().getSize()==1) { 
 //BA.debugLineNum = 773;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 774;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 776;BA.debugLine="Return S";
if (true) return _s;
 }else if(_fx.getScreens().getSize()>1) { 
 //BA.debugLineNum = 778;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 779;BA.debugLine="Dim S As Screen = SList.Get(2)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (2))));
 //BA.debugLineNum = 781;BA.debugLine="Return S";
if (true) return _s;
 }else {
 //BA.debugLineNum = 783;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 784;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 786;BA.debugLine="Return S";
if (true) return _s;
 };
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 789;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 790;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 792;BA.debugLine="Return S";
if (true) return _s;
 };
 //BA.debugLineNum = 794;BA.debugLine="End Sub";
return null;
}
public static String  _close_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 676;BA.debugLine="Private Sub Close_Entered_Event(e As Event)";
 //BA.debugLineNum = 677;BA.debugLine="Try";
try { //BA.debugLineNum = 678;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
_ivclose.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btCloseEnt.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 680;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 682;BA.debugLine="End Sub";
return "";
}
public static String  _close_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 684;BA.debugLine="Private Sub Close_Exited_Event(e As Event)";
 //BA.debugLineNum = 685;BA.debugLine="Try";
try { //BA.debugLineNum = 686;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
_ivclose.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btClose.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 688;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 690;BA.debugLine="End Sub";
return "";
}
public static String  _clvdriveway_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 922;BA.debugLine="Sub clvDriveway_ItemClick (Index As Int, Value As";
 //BA.debugLineNum = 923;BA.debugLine="clvDriveway.JumpToItem(Index)";
_clvdriveway._jumptoitem(_index);
 //BA.debugLineNum = 924;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
_clvfrontdoor._jumptoitem(_index);
 //BA.debugLineNum = 925;BA.debugLine="clvSideYard.JumpToItem(Index)";
_clvsideyard._jumptoitem(_index);
 //BA.debugLineNum = 926;BA.debugLine="End Sub";
return "";
}
public static String  _clvfrontdoor_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 916;BA.debugLine="Sub clvFrontDoor_ItemClick (Index As Int, Value As";
 //BA.debugLineNum = 917;BA.debugLine="clvDriveway.JumpToItem(Index)";
_clvdriveway._jumptoitem(_index);
 //BA.debugLineNum = 918;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
_clvfrontdoor._jumptoitem(_index);
 //BA.debugLineNum = 919;BA.debugLine="clvSideYard.JumpToItem(Index)";
_clvsideyard._jumptoitem(_index);
 //BA.debugLineNum = 920;BA.debugLine="End Sub";
return "";
}
public static String  _clvsideyard_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 910;BA.debugLine="Sub clvSideYard_ItemClick (Index As Int, Value As";
 //BA.debugLineNum = 911;BA.debugLine="clvDriveway.JumpToItem(Index)";
_clvdriveway._jumptoitem(_index);
 //BA.debugLineNum = 912;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
_clvfrontdoor._jumptoitem(_index);
 //BA.debugLineNum = 913;BA.debugLine="clvSideYard.JumpToItem(Index)";
_clvsideyard._jumptoitem(_index);
 //BA.debugLineNum = 914;BA.debugLine="End Sub";
return "";
}
public static void  _downloadimage(String _link,anywheresoftware.b4j.objects.ImageViewWrapper _iv,String _camera) throws Exception{
ResumableSub_DownloadImage rsub = new ResumableSub_DownloadImage(null,_link,_iv,_camera);
rsub.resume(ba, null);
}
public static class ResumableSub_DownloadImage extends BA.ResumableSub {
public ResumableSub_DownloadImage(b4j.example.main parent,String _link,anywheresoftware.b4j.objects.ImageViewWrapper _iv,String _camera) {
this.parent = parent;
this._link = _link;
this._iv = _iv;
this._camera = _camera;
}
b4j.example.main parent;
String _link;
anywheresoftware.b4j.objects.ImageViewWrapper _iv;
String _camera;
b4j.example.httpjob _j = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 327;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 20;
this.catchState = 19;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 19;
 //BA.debugLineNum = 328;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
 //BA.debugLineNum = 329;BA.debugLine="response = \"\"";
parent._response = "";
 //BA.debugLineNum = 330;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",main.getObject());
 //BA.debugLineNum = 331;BA.debugLine="j.Download(Link)";
_j._download /*String*/ (_link);
 //BA.debugLineNum = 332;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("TOKEN_AUTH",parent._authtoken);
 //BA.debugLineNum = 333;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 21;
return;
case 21:
//C
this.state = 4;
_j = (b4j.example.httpjob) result[0];
;
 //BA.debugLineNum = 334;BA.debugLine="If j.Success Then";
if (true) break;

case 4:
//if
this.state = 17;
if (_j._success /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 16;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 336;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 7:
//if
this.state = 14;
if ((_camera).equals("347574")) { 
this.state = 9;
}else if((_camera).equals("236967")) { 
this.state = 11;
}else if((_camera).equals("226821")) { 
this.state = 13;
}if (true) break;

case 9:
//C
this.state = 14;
 //BA.debugLineNum = 337;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Driveway.jpg",anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 11:
//C
this.state = 14;
 //BA.debugLineNum = 339;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"FrontYard.jpg",anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 341;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"SideYard.jpg",anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 14:
//C
this.state = 17;
;
 //BA.debugLineNum = 343;BA.debugLine="File.Copy2(j.GetInputStream, out)";
anywheresoftware.b4a.keywords.Common.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ ().getObject()),(java.io.OutputStream)(_out.getObject()));
 //BA.debugLineNum = 344;BA.debugLine="out.Close '<------ very important";
_out.Close();
 //BA.debugLineNum = 347;BA.debugLine="iv.SetImage(j.GetBitmap)";
_iv.SetImage((javafx.scene.image.Image)(_j._getbitmap /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ ().getObject()));
 if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 349;BA.debugLine="response = \"ERROR: \" & j.GetString";
parent._response = "ERROR: "+_j._getstring /*String*/ ();
 if (true) break;

case 17:
//C
this.state = 20;
;
 //BA.debugLineNum = 351;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
 //BA.debugLineNum = 353;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 20:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public static void  _jobdone(b4j.example.httpjob _j) throws Exception{
}
public static String  _get_css() throws Exception{
anywheresoftware.b4j.object.JavaObject _jform = null;
anywheresoftware.b4j.object.JavaObject _scene = null;
anywheresoftware.b4a.objects.collections.List _stylesheets = null;
 //BA.debugLineNum = 758;BA.debugLine="Public Sub Get_css";
 //BA.debugLineNum = 759;BA.debugLine="Try";
try { //BA.debugLineNum = 760;BA.debugLine="Dim jForm As JavaObject = MainForm";
_jform = new anywheresoftware.b4j.object.JavaObject();
_jform.setObject((java.lang.Object)(_mainform));
 //BA.debugLineNum = 761;BA.debugLine="Dim scene As JavaObject = jForm.GetField(\"scene\"";
_scene = new anywheresoftware.b4j.object.JavaObject();
_scene.setObject((java.lang.Object)(_jform.GetField("scene")));
 //BA.debugLineNum = 762;BA.debugLine="Dim stylesheets As List = scene.RunMethod(\"getSt";
_stylesheets = new anywheresoftware.b4a.objects.collections.List();
_stylesheets.setObject((java.util.List)(_scene.RunMethod("getStylesheets",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
 //BA.debugLineNum = 763;BA.debugLine="stylesheets.Clear";
_stylesheets.Clear();
 //BA.debugLineNum = 764;BA.debugLine="stylesheets.Add(File.GetUri(File.DirAssets, imgI";
_stylesheets.Add((Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+".css")));
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 766;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 768;BA.debugLine="End Sub";
return "";
}
public static String  _getallcameras(String _json) throws Exception{
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _networks = null;
anywheresoftware.b4a.objects.collections.Map _colnetworks = null;
 //BA.debugLineNum = 405;BA.debugLine="Sub GetAllCameras(json As String)";
 //BA.debugLineNum = 406;BA.debugLine="lblStatus.Text = \"Getting all cameras information";
_lblstatus.setText("Getting all cameras information...");
 //BA.debugLineNum = 407;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 408;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 409;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 413;BA.debugLine="Dim networks As List = root.Get(\"networks\")";
_networks = new anywheresoftware.b4a.objects.collections.List();
_networks.setObject((java.util.List)(_root.Get((Object)("networks"))));
 //BA.debugLineNum = 414;BA.debugLine="For Each colnetworks As Map In networks";
_colnetworks = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group6 = _networks;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_colnetworks.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group6.Get(index6)));
 //BA.debugLineNum = 423;BA.debugLine="networkID = colnetworks.Get(\"network_id\")";
_networkid = BA.ObjectToString(_colnetworks.Get((Object)("network_id")));
 //BA.debugLineNum = 424;BA.debugLine="Log(\"networkID: \" &  networkID)";
anywheresoftware.b4a.keywords.Common.Log("networkID: "+_networkid);
 }
};
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return "";
}
public static String  _getauthinfo(String _json) throws Exception{
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.Map _authtokenmap = null;
anywheresoftware.b4a.objects.collections.Map _region = null;
 //BA.debugLineNum = 358;BA.debugLine="Sub GetAuthInfo(json As String)";
 //BA.debugLineNum = 359;BA.debugLine="lblStatus.Text = \"Getting authtoken...\"";
_lblstatus.setText("Getting authtoken...");
 //BA.debugLineNum = 360;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 361;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 362;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 363;BA.debugLine="Dim authtokenmap As Map = root.Get(\"authtoken\")";
_authtokenmap = new anywheresoftware.b4a.objects.collections.Map();
_authtokenmap.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("authtoken"))));
 //BA.debugLineNum = 364;BA.debugLine="authToken = authtokenmap.Get(\"authtoken\")";
_authtoken = BA.ObjectToString(_authtokenmap.Get((Object)("authtoken")));
 //BA.debugLineNum = 365;BA.debugLine="Log(\"authToken: \" &  authToken)";
anywheresoftware.b4a.keywords.Common.Log("authToken: "+_authtoken);
 //BA.debugLineNum = 373;BA.debugLine="Dim region As Map = root.Get(\"region\")";
_region = new anywheresoftware.b4a.objects.collections.Map();
_region.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("region"))));
 //BA.debugLineNum = 374;BA.debugLine="userRegion = region.GetKeyAt(0)";
_userregion = BA.ObjectToString(_region.GetKeyAt((int) (0)));
 //BA.debugLineNum = 375;BA.debugLine="Log(\"userRegion: \" &  userRegion)";
anywheresoftware.b4a.keywords.Common.Log("userRegion: "+_userregion);
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return "";
}
public static String  _getcamerainfo(String _json,b4j.example.customlistview _clv) throws Exception{
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.Map _camera_status = null;
int _total_108_wakeups = 0;
int _battery_voltage = 0;
String _light_sensor_data_valid = "";
int _lfr_tb_wakeups = 0;
String _fw_git_hash = "";
int _wifi_strength = 0;
int _lfr_strength = 0;
int _total_tb_wakeups = 0;
String _created_at = "";
int _light_sensor_ch0 = 0;
String _mac = "";
int _unit_number = 0;
String _updated_at = "";
int _light_sensor_ch1 = 0;
int _time_dhcp_lease = 0;
int _temperature = 0;
int _time_first_video = 0;
int _time_dns_resolve = 0;
int _id = 0;
String _temp_alert_status = "";
int _time_108_boot = 0;
int _lfr_108_wakeups = 0;
int _lifetime_duration = 0;
int _wifi_connect_failure_count = 0;
int _camera_id = 0;
String _battery_alert_status = "";
int _dhcp_failure_count = 0;
String _ip_address = "";
String _ipv = "";
String _light_sensor_data_new = "";
int _network_id = 0;
int _account_id = 0;
String _serial = "";
int _dev_1 = 0;
int _time_wlan_connect = 0;
int _dev_2 = 0;
int _socket_failure_count = 0;
int _dev_3 = 0;
int _pir_rejections = 0;
int _sync_module_id = 0;
int _lifetime_count = 0;
int _error_codes = 0;
String _fw_version = "";
String _ac_power = "";
int _i = 0;
String _item = "";
 //BA.debugLineNum = 479;BA.debugLine="Sub GetCameraInfo(json As String, clv As CustomLis";
 //BA.debugLineNum = 480;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 481;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 482;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 483;BA.debugLine="Dim camera_status As Map = root.Get(\"camera_statu";
_camera_status = new anywheresoftware.b4a.objects.collections.Map();
_camera_status.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("camera_status"))));
 //BA.debugLineNum = 484;BA.debugLine="Dim total_108_wakeups As Int = camera_status.Get(";
_total_108_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("total_108_wakeups"))));
 //BA.debugLineNum = 485;BA.debugLine="Dim battery_voltage As Int = camera_status.Get(\"b";
_battery_voltage = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("battery_voltage"))));
 //BA.debugLineNum = 486;BA.debugLine="Dim light_sensor_data_valid As String = camera_st";
_light_sensor_data_valid = BA.ObjectToString(_camera_status.Get((Object)("light_sensor_data_valid")));
 //BA.debugLineNum = 487;BA.debugLine="Dim lfr_tb_wakeups As Int = camera_status.Get(\"lf";
_lfr_tb_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lfr_tb_wakeups"))));
 //BA.debugLineNum = 488;BA.debugLine="Dim fw_git_hash As String = camera_status.Get(\"fw";
_fw_git_hash = BA.ObjectToString(_camera_status.Get((Object)("fw_git_hash")));
 //BA.debugLineNum = 489;BA.debugLine="Dim wifi_strength As Int = camera_status.Get(\"wif";
_wifi_strength = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("wifi_strength"))));
 //BA.debugLineNum = 490;BA.debugLine="Dim lfr_strength As Int = camera_status.Get(\"lfr_";
_lfr_strength = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lfr_strength"))));
 //BA.debugLineNum = 491;BA.debugLine="Dim total_tb_wakeups As Int = camera_status.Get(\"";
_total_tb_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("total_tb_wakeups"))));
 //BA.debugLineNum = 492;BA.debugLine="Dim created_at As String = camera_status.Get(\"cre";
_created_at = BA.ObjectToString(_camera_status.Get((Object)("created_at")));
 //BA.debugLineNum = 493;BA.debugLine="Dim light_sensor_ch0 As Int = camera_status.Get(\"";
_light_sensor_ch0 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("light_sensor_ch0"))));
 //BA.debugLineNum = 494;BA.debugLine="Dim mac As String = camera_status.Get(\"mac\")";
_mac = BA.ObjectToString(_camera_status.Get((Object)("mac")));
 //BA.debugLineNum = 495;BA.debugLine="Dim unit_number As Int = camera_status.Get(\"unit_";
_unit_number = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("unit_number"))));
 //BA.debugLineNum = 496;BA.debugLine="Dim updated_at As String = camera_status.Get(\"upd";
_updated_at = BA.ObjectToString(_camera_status.Get((Object)("updated_at")));
 //BA.debugLineNum = 497;BA.debugLine="Dim light_sensor_ch1 As Int = camera_status.Get(\"";
_light_sensor_ch1 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("light_sensor_ch1"))));
 //BA.debugLineNum = 498;BA.debugLine="Dim time_dhcp_lease As Int = camera_status.Get(\"t";
_time_dhcp_lease = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_dhcp_lease"))));
 //BA.debugLineNum = 499;BA.debugLine="Dim temperature As Int = camera_status.Get(\"tempe";
_temperature = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("temperature"))));
 //BA.debugLineNum = 500;BA.debugLine="Dim time_first_video As Int = camera_status.Get(\"";
_time_first_video = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_first_video"))));
 //BA.debugLineNum = 501;BA.debugLine="Dim time_dns_resolve As Int = camera_status.Get(\"";
_time_dns_resolve = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_dns_resolve"))));
 //BA.debugLineNum = 502;BA.debugLine="Dim id As Int = camera_status.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("id"))));
 //BA.debugLineNum = 503;BA.debugLine="Dim temp_alert_status As String = camera_status.G";
_temp_alert_status = BA.ObjectToString(_camera_status.Get((Object)("temp_alert_status")));
 //BA.debugLineNum = 504;BA.debugLine="Dim time_108_boot As Int = camera_status.Get(\"tim";
_time_108_boot = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_108_boot"))));
 //BA.debugLineNum = 505;BA.debugLine="Dim lfr_108_wakeups As Int = camera_status.Get(\"l";
_lfr_108_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lfr_108_wakeups"))));
 //BA.debugLineNum = 506;BA.debugLine="cameraThumbnail = camera_status.Get(\"thumbnail\")";
_camerathumbnail = BA.ObjectToString(_camera_status.Get((Object)("thumbnail")));
 //BA.debugLineNum = 507;BA.debugLine="Log(\"cameraThumbnail: \" & cameraThumbnail)";
anywheresoftware.b4a.keywords.Common.Log("cameraThumbnail: "+_camerathumbnail);
 //BA.debugLineNum = 508;BA.debugLine="Dim lifetime_duration As Int = camera_status.Get(";
_lifetime_duration = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lifetime_duration"))));
 //BA.debugLineNum = 509;BA.debugLine="Dim wifi_connect_failure_count As Int = camera_st";
_wifi_connect_failure_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("wifi_connect_failure_count"))));
 //BA.debugLineNum = 510;BA.debugLine="Dim camera_id As Int = camera_status.Get(\"camera_";
_camera_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("camera_id"))));
 //BA.debugLineNum = 511;BA.debugLine="Dim battery_alert_status As String = camera_statu";
_battery_alert_status = BA.ObjectToString(_camera_status.Get((Object)("battery_alert_status")));
 //BA.debugLineNum = 512;BA.debugLine="Dim dhcp_failure_count As Int = camera_status.Get";
_dhcp_failure_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dhcp_failure_count"))));
 //BA.debugLineNum = 513;BA.debugLine="Dim ip_address As String = camera_status.Get(\"ip_";
_ip_address = BA.ObjectToString(_camera_status.Get((Object)("ip_address")));
 //BA.debugLineNum = 514;BA.debugLine="Dim ipv As String = camera_status.Get(\"ipv\")";
_ipv = BA.ObjectToString(_camera_status.Get((Object)("ipv")));
 //BA.debugLineNum = 515;BA.debugLine="Dim light_sensor_data_new As String = camera_stat";
_light_sensor_data_new = BA.ObjectToString(_camera_status.Get((Object)("light_sensor_data_new")));
 //BA.debugLineNum = 516;BA.debugLine="Dim network_id As Int = camera_status.Get(\"networ";
_network_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("network_id"))));
 //BA.debugLineNum = 517;BA.debugLine="Dim account_id As Int = camera_status.Get(\"accoun";
_account_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("account_id"))));
 //BA.debugLineNum = 518;BA.debugLine="Dim serial As String = camera_status.Get(\"serial\"";
_serial = BA.ObjectToString(_camera_status.Get((Object)("serial")));
 //BA.debugLineNum = 519;BA.debugLine="Dim dev_1 As Int = camera_status.Get(\"dev_1\")";
_dev_1 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dev_1"))));
 //BA.debugLineNum = 520;BA.debugLine="Dim time_wlan_connect As Int = camera_status.Get(";
_time_wlan_connect = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_wlan_connect"))));
 //BA.debugLineNum = 521;BA.debugLine="Dim dev_2 As Int = camera_status.Get(\"dev_2\")";
_dev_2 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dev_2"))));
 //BA.debugLineNum = 522;BA.debugLine="Dim socket_failure_count As Int = camera_status.G";
_socket_failure_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("socket_failure_count"))));
 //BA.debugLineNum = 523;BA.debugLine="Dim dev_3 As Int = camera_status.Get(\"dev_3\")";
_dev_3 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dev_3"))));
 //BA.debugLineNum = 524;BA.debugLine="Dim pir_rejections As Int = camera_status.Get(\"pi";
_pir_rejections = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("pir_rejections"))));
 //BA.debugLineNum = 525;BA.debugLine="Dim sync_module_id As Int = camera_status.Get(\"sy";
_sync_module_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("sync_module_id"))));
 //BA.debugLineNum = 526;BA.debugLine="Dim lifetime_count As Int = camera_status.Get(\"li";
_lifetime_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lifetime_count"))));
 //BA.debugLineNum = 527;BA.debugLine="Dim error_codes As Int = camera_status.Get(\"error";
_error_codes = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("error_codes"))));
 //BA.debugLineNum = 528;BA.debugLine="Dim fw_version As String = camera_status.Get(\"fw_";
_fw_version = BA.ObjectToString(_camera_status.Get((Object)("fw_version")));
 //BA.debugLineNum = 529;BA.debugLine="Dim ac_power As String = camera_status.Get(\"ac_po";
_ac_power = BA.ObjectToString(_camera_status.Get((Object)("ac_power")));
 //BA.debugLineNum = 531;BA.debugLine="clv.Clear";
_clv._clear();
 //BA.debugLineNum = 532;BA.debugLine="clv.AddTextItem(\"Battery voltage: \" & NumberForma";
_clv._addtextitem((Object)("Battery voltage: "+anywheresoftware.b4a.keywords.Common.NumberFormat((_battery_voltage/(double)100),(int) (0),(int) (2))+"V - "+_checkbattlife(_battery_voltage)),(Object)("battery_voltage"));
 //BA.debugLineNum = 533;BA.debugLine="clv.AddTextItem(\"Camera to WiFi strength: \" & wif";
_clv._addtextitem((Object)("Camera to WiFi strength: "+BA.NumberToString(_wifi_strength)+" - "+_checklfrlevel(_wifi_strength)),(Object)("wifi_strength"));
 //BA.debugLineNum = 534;BA.debugLine="clv.AddTextItem(\"Camera to Sync Module strength (";
_clv._addtextitem((Object)("Camera to Sync Module strength (LFR): "+BA.NumberToString(_lfr_strength)+" - "+_checklfrlevel(_lfr_strength)),(Object)("lfr_strength"));
 //BA.debugLineNum = 535;BA.debugLine="clv.AddTextItem(\"Temperature: \" & temperature & \"";
_clv._addtextitem((Object)("Temperature: "+BA.NumberToString(_temperature)+"ºF"),(Object)("temperature"));
 //BA.debugLineNum = 536;BA.debugLine="clv.AddTextItem(\"Firmware version: \" & fw_version";
_clv._addtextitem((Object)("Firmware version: "+_fw_version),(Object)("fw_version"));
 //BA.debugLineNum = 537;BA.debugLine="clv.AddTextItem(\"Firmware Git Hash: \" & fw_git_ha";
_clv._addtextitem((Object)("Firmware Git Hash: "+_fw_git_hash),(Object)("fw_git_hash"));
 //BA.debugLineNum = 538;BA.debugLine="clv.AddTextItem(\"Battery alert status: \" & batter";
_clv._addtextitem((Object)("Battery alert status: "+_battery_alert_status),(Object)("battery_alert_status"));
 //BA.debugLineNum = 539;BA.debugLine="clv.AddTextItem(\"Temperature alert status: \" & te";
_clv._addtextitem((Object)("Temperature alert status: "+_temp_alert_status),(Object)("temp_alert_status"));
 //BA.debugLineNum = 540;BA.debugLine="clv.AddTextItem(\"Updated at: \" & updated_at, \"upd";
_clv._addtextitem((Object)("Updated at: "+_updated_at),(Object)("updated_at"));
 //BA.debugLineNum = 541;BA.debugLine="clv.AddTextItem(\"Created at: \" & created_at, \"cre";
_clv._addtextitem((Object)("Created at: "+_created_at),(Object)("created_at"));
 //BA.debugLineNum = 542;BA.debugLine="clv.AddTextItem(\"IP address: \" & ip_address, \"ip_";
_clv._addtextitem((Object)("IP address: "+_ip_address),(Object)("ip_address"));
 //BA.debugLineNum = 543;BA.debugLine="clv.AddTextItem(\"MAC address: \" & mac, \"mac\")";
_clv._addtextitem((Object)("MAC address: "+_mac),(Object)("mac"));
 //BA.debugLineNum = 544;BA.debugLine="clv.AddTextItem(\"Camera ID: \" & camera_id, \"camer";
_clv._addtextitem((Object)("Camera ID: "+BA.NumberToString(_camera_id)),(Object)("camera_id"));
 //BA.debugLineNum = 545;BA.debugLine="clv.AddTextItem(\"Serial: \" & serial, \"serial\")";
_clv._addtextitem((Object)("Serial: "+_serial),(Object)("serial"));
 //BA.debugLineNum = 546;BA.debugLine="clv.AddTextItem(\"Network ID: \" & network_id, \"net";
_clv._addtextitem((Object)("Network ID: "+BA.NumberToString(_network_id)),(Object)("network_id"));
 //BA.debugLineNum = 547;BA.debugLine="clv.AddTextItem(\"Account ID: \" & account_id, \"acc";
_clv._addtextitem((Object)("Account ID: "+BA.NumberToString(_account_id)),(Object)("account_id"));
 //BA.debugLineNum = 548;BA.debugLine="clv.AddTextItem(\"ID: \" & id, \"id\")";
_clv._addtextitem((Object)("ID: "+BA.NumberToString(_id)),(Object)("id"));
 //BA.debugLineNum = 549;BA.debugLine="clv.AddTextItem(\"Sync Module ID: \" & sync_module_";
_clv._addtextitem((Object)("Sync Module ID: "+BA.NumberToString(_sync_module_id)),(Object)("sync_module_id"));
 //BA.debugLineNum = 550;BA.debugLine="clv.AddTextItem(\"Light sensor data valid: \" & lig";
_clv._addtextitem((Object)("Light sensor data valid: "+_light_sensor_data_valid),(Object)("light_sensor_data_valid"));
 //BA.debugLineNum = 551;BA.debugLine="clv.AddTextItem(\"DHCP failure count: \" & dhcp_fai";
_clv._addtextitem((Object)("DHCP failure count: "+BA.NumberToString(_dhcp_failure_count)),(Object)("dhcp_failure_count"));
 //BA.debugLineNum = 552;BA.debugLine="clv.AddTextItem(\"LFR tb wakeups: \" & lfr_tb_wakeu";
_clv._addtextitem((Object)("LFR tb wakeups: "+BA.NumberToString(_lfr_tb_wakeups)),(Object)("lfr_tb_wakeups"));
 //BA.debugLineNum = 553;BA.debugLine="clv.AddTextItem(\"Socket failure count: \" & socket";
_clv._addtextitem((Object)("Socket failure count: "+BA.NumberToString(_socket_failure_count)),(Object)("socket_failure_count"));
 //BA.debugLineNum = 554;BA.debugLine="clv.AddTextItem(\"Camera thumbnail: \" & cameraThum";
_clv._addtextitem((Object)("Camera thumbnail: "+_camerathumbnail),(Object)("thumbnail"));
 //BA.debugLineNum = 555;BA.debugLine="clv.AddTextItem(\"WiFi connect failure count: \" &";
_clv._addtextitem((Object)("WiFi connect failure count: "+BA.NumberToString(_wifi_connect_failure_count)),(Object)("wifi_connect_failure_count"));
 //BA.debugLineNum = 556;BA.debugLine="clv.AddTextItem(\"Error codes: \" & error_codes, \"e";
_clv._addtextitem((Object)("Error codes: "+BA.NumberToString(_error_codes)),(Object)("error_codes"));
 //BA.debugLineNum = 557;BA.debugLine="clv.AddTextItem(\"AC power: \" & ac_power, \"ac_powe";
_clv._addtextitem((Object)("AC power: "+_ac_power),(Object)("ac_power"));
 //BA.debugLineNum = 558;BA.debugLine="clv.AddTextItem(\"Total 108 wakeups: \" & total_108";
_clv._addtextitem((Object)("Total 108 wakeups: "+BA.NumberToString(_total_108_wakeups)),(Object)("total_108_wakeups"));
 //BA.debugLineNum = 559;BA.debugLine="clv.AddTextItem(\"Total Tb wakeups: \" & total_tb_w";
_clv._addtextitem((Object)("Total Tb wakeups: "+BA.NumberToString(_total_tb_wakeups)),(Object)("total_tb_wakeups"));
 //BA.debugLineNum = 560;BA.debugLine="clv.AddTextItem(\"Light sensor ch0: \" & light_sens";
_clv._addtextitem((Object)("Light sensor ch0: "+BA.NumberToString(_light_sensor_ch0)),(Object)("light_sensor_ch0"));
 //BA.debugLineNum = 561;BA.debugLine="clv.AddTextItem(\"Unit number: \" & unit_number, \"u";
_clv._addtextitem((Object)("Unit number: "+BA.NumberToString(_unit_number)),(Object)("unit_number"));
 //BA.debugLineNum = 562;BA.debugLine="clv.AddTextItem(\"Light sensor ch1: \" & light_sens";
_clv._addtextitem((Object)("Light sensor ch1: "+BA.NumberToString(_light_sensor_ch1)),(Object)("light_sensor_ch1"));
 //BA.debugLineNum = 563;BA.debugLine="clv.AddTextItem(\"Time dhcp lease: \" & time_dhcp_l";
_clv._addtextitem((Object)("Time dhcp lease: "+BA.NumberToString(_time_dhcp_lease)),(Object)("time_dhcp_lease"));
 //BA.debugLineNum = 564;BA.debugLine="clv.AddTextItem(\"Time first video: \" & time_first";
_clv._addtextitem((Object)("Time first video: "+BA.NumberToString(_time_first_video)),(Object)("time_first_video"));
 //BA.debugLineNum = 565;BA.debugLine="clv.AddTextItem(\"Time dns resolve: \" & time_dns_r";
_clv._addtextitem((Object)("Time dns resolve: "+BA.NumberToString(_time_dns_resolve)),(Object)("time_dns_resolve"));
 //BA.debugLineNum = 566;BA.debugLine="clv.AddTextItem(\"Time 108 boot: \" & time_108_boot";
_clv._addtextitem((Object)("Time 108 boot: "+BA.NumberToString(_time_108_boot)),(Object)("time_108_boot"));
 //BA.debugLineNum = 567;BA.debugLine="clv.AddTextItem(\"LFR 108 wakeups: \" & lfr_108_wak";
_clv._addtextitem((Object)("LFR 108 wakeups: "+BA.NumberToString(_lfr_108_wakeups)),(Object)("lfr_108_wakeups"));
 //BA.debugLineNum = 568;BA.debugLine="clv.AddTextItem(\"lifetime duration: \" & lifetime_";
_clv._addtextitem((Object)("lifetime duration: "+BA.NumberToString(_lifetime_duration)),(Object)("lifetime_duration"));
 //BA.debugLineNum = 569;BA.debugLine="clv.AddTextItem(\"lpv: \" & ipv, \"ipv\")";
_clv._addtextitem((Object)("lpv: "+_ipv),(Object)("ipv"));
 //BA.debugLineNum = 570;BA.debugLine="clv.AddTextItem(\"light sensor data new: \" & light";
_clv._addtextitem((Object)("light sensor data new: "+_light_sensor_data_new),(Object)("light_sensor_data_new"));
 //BA.debugLineNum = 571;BA.debugLine="clv.AddTextItem(\"Dev_1: \" & dev_1, \"dev_1\")";
_clv._addtextitem((Object)("Dev_1: "+BA.NumberToString(_dev_1)),(Object)("dev_1"));
 //BA.debugLineNum = 572;BA.debugLine="clv.AddTextItem(\"Dev_2: \" & dev_2, \"dev_2\")";
_clv._addtextitem((Object)("Dev_2: "+BA.NumberToString(_dev_2)),(Object)("dev_2"));
 //BA.debugLineNum = 573;BA.debugLine="clv.AddTextItem(\"Dev_3: \" & dev_3, \"dev_3\")";
_clv._addtextitem((Object)("Dev_3: "+BA.NumberToString(_dev_3)),(Object)("dev_3"));
 //BA.debugLineNum = 574;BA.debugLine="clv.AddTextItem(\"Time wlan connect: \" & time_wlan";
_clv._addtextitem((Object)("Time wlan connect: "+BA.NumberToString(_time_wlan_connect)),(Object)("time_wlan_connect"));
 //BA.debugLineNum = 575;BA.debugLine="clv.AddTextItem(\"PIR rejections: \" & pir_rejectio";
_clv._addtextitem((Object)("PIR rejections: "+BA.NumberToString(_pir_rejections)),(Object)("pir_rejections"));
 //BA.debugLineNum = 576;BA.debugLine="clv.AddTextItem(\"Lifetime count: \" & lifetime_cou";
_clv._addtextitem((Object)("Lifetime count: "+BA.NumberToString(_lifetime_count)),(Object)("lifetime_count"));
 //BA.debugLineNum = 578;BA.debugLine="For i = 0 To clv.Size-1";
{
final int step97 = 1;
final int limit97 = (int) (_clv._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit97 ;_i = _i + step97 ) {
 //BA.debugLineNum = 579;BA.debugLine="Dim item As String";
_item = "";
 //BA.debugLineNum = 580;BA.debugLine="item = clv.GetValue(i)";
_item = BA.ObjectToString(_clv._getvalue(_i));
 //BA.debugLineNum = 581;BA.debugLine="If item.Contains(\"thumbnail\") Then";
if (_item.contains("thumbnail")) { 
 //BA.debugLineNum = 582;BA.debugLine="clv.ResizeItem(i,60dip)";
_clv._resizeitem(_i,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)));
 }else {
 //BA.debugLineNum = 584;BA.debugLine="clv.ResizeItem(i,35dip)";
_clv._resizeitem(_i,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (35)));
 };
 }
};
 //BA.debugLineNum = 587;BA.debugLine="End Sub";
return "";
}
public static String  _getcommandid(String _json) throws Exception{
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
 //BA.debugLineNum = 429;BA.debugLine="Sub GetCommandID(json As String)";
 //BA.debugLineNum = 430;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 431;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 432;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 447;BA.debugLine="commandID = root.Get(\"id\")";
_commandid = BA.ObjectToString(_root.Get((Object)("id")));
 //BA.debugLineNum = 448;BA.debugLine="Log(\"commandID: \" & commandID)";
anywheresoftware.b4a.keywords.Common.Log("commandID: "+_commandid);
 //BA.debugLineNum = 469;BA.debugLine="End Sub";
return "";
}
public static String  _getcommandstatus(String _json) throws Exception{
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
 //BA.debugLineNum = 471;BA.debugLine="Sub GetCommandStatus(json As String)";
 //BA.debugLineNum = 472;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 473;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 474;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 475;BA.debugLine="commandComplete = root.Get(\"complete\")";
_commandcomplete = BA.ObjectToBoolean(_root.Get((Object)("complete")));
 //BA.debugLineNum = 476;BA.debugLine="Log(\"commandComplete: \" & commandComplete)";
anywheresoftware.b4a.keywords.Common.Log("commandComplete: "+BA.ObjectToString(_commandcomplete));
 //BA.debugLineNum = 477;BA.debugLine="End Sub";
return "";
}
public static String  _getsyncmoduleinfo(String _json) throws Exception{
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.Map _syncmodule = null;
int _wifi_strength = 0;
String _os_version = "";
String _fw_version = "";
String _status = "";
 //BA.debugLineNum = 589;BA.debugLine="Sub GetSyncModuleInfo(json As String)";
 //BA.debugLineNum = 590;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 591;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 592;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 593;BA.debugLine="Dim syncmodule As Map = root.Get(\"syncmodule\")";
_syncmodule = new anywheresoftware.b4a.objects.collections.Map();
_syncmodule.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("syncmodule"))));
 //BA.debugLineNum = 597;BA.debugLine="Dim wifi_strength As Int = syncmodule.Get(\"wifi_s";
_wifi_strength = (int)(BA.ObjectToNumber(_syncmodule.Get((Object)("wifi_strength"))));
 //BA.debugLineNum = 598;BA.debugLine="Dim os_version As String = syncmodule.Get(\"os_ver";
_os_version = BA.ObjectToString(_syncmodule.Get((Object)("os_version")));
 //BA.debugLineNum = 615;BA.debugLine="Dim fw_version As String = syncmodule.Get(\"fw_ver";
_fw_version = BA.ObjectToString(_syncmodule.Get((Object)("fw_version")));
 //BA.debugLineNum = 617;BA.debugLine="Dim status As String = syncmodule.Get(\"status\")";
_status = BA.ObjectToString(_syncmodule.Get((Object)("status")));
 //BA.debugLineNum = 618;BA.debugLine="lblSyncModule.Text = \"Sync Module is \" & status &";
_lblsyncmodule.setText("Sync Module is "+_status+" | Wifi Strength: "+BA.NumberToString(_wifi_strength)+" bars | Firmware version: "+_fw_version+" | OS version: "+_os_version);
 //BA.debugLineNum = 619;BA.debugLine="End Sub";
return "";
}
public static String  _getuserinfo(String _json) throws Exception{
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
 //BA.debugLineNum = 381;BA.debugLine="Sub GetUserInfo(json As String)";
 //BA.debugLineNum = 382;BA.debugLine="lblStatus.Text = \"Getting user information...\"";
_lblstatus.setText("Getting user information...");
 //BA.debugLineNum = 383;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 384;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 385;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 400;BA.debugLine="accountID = root.Get(\"id\")";
_accountid = BA.ObjectToString(_root.Get((Object)("id")));
 //BA.debugLineNum = 401;BA.debugLine="Log(\"accountID: \" &  accountID)";
anywheresoftware.b4a.keywords.Common.Log("accountID: "+_accountid);
 //BA.debugLineNum = 403;BA.debugLine="End Sub";
return "";
}
public static String  _ivclose_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 669;BA.debugLine="Private Sub ivClose_MouseClicked (EventData As Mou";
 //BA.debugLineNum = 670;BA.debugLine="File.Delete(File.DirApp, \"Driveway.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Driveway.jpg");
 //BA.debugLineNum = 671;BA.debugLine="File.Delete(File.DirApp, \"FrontYard.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"FrontYard.jpg");
 //BA.debugLineNum = 672;BA.debugLine="File.Delete(File.DirApp, \"SideYard.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"SideYard.jpg");
 //BA.debugLineNum = 673;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 674;BA.debugLine="End Sub";
return "";
}
public static String  _ivdriveway_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
b4j.example.frmmedia _mf = null;
 //BA.debugLineNum = 928;BA.debugLine="Sub ivDriveway_MouseClicked (EventData As MouseEve";
 //BA.debugLineNum = 929;BA.debugLine="Dim mf As frmMedia";
_mf = new b4j.example.frmmedia();
 //BA.debugLineNum = 930;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (ba,_mainform);
 //BA.debugLineNum = 931;BA.debugLine="mf.url=$\"    <h1>Driveway</h1>    <img src=\"${Fil";
_mf._url /*String*/  = ("\n"+"   <h1>Driveway</h1>\n"+"   <img src=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Driveway.jpg")))+"\"/>\n"+"   \n"+"");
 //BA.debugLineNum = 936;BA.debugLine="mf.Show";
_mf._show /*String*/ ();
 //BA.debugLineNum = 937;BA.debugLine="End Sub";
return "";
}
public static String  _ivfrontdoor_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
b4j.example.frmmedia _mf = null;
 //BA.debugLineNum = 940;BA.debugLine="Sub ivFrontDoor_MouseClicked (EventData As MouseEv";
 //BA.debugLineNum = 941;BA.debugLine="Dim mf As frmMedia";
_mf = new b4j.example.frmmedia();
 //BA.debugLineNum = 942;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (ba,_mainform);
 //BA.debugLineNum = 943;BA.debugLine="mf.url=$\"    <h1>Front Door</h1>    <img src=\"${F";
_mf._url /*String*/  = ("\n"+"   <h1>Front Door</h1>\n"+"   <img src=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"FrontYard.jpg")))+"\"/>\n"+"   \n"+"");
 //BA.debugLineNum = 948;BA.debugLine="mf.Show";
_mf._show /*String*/ ();
 //BA.debugLineNum = 949;BA.debugLine="End Sub";
return "";
}
public static String  _ivmax_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 692;BA.debugLine="Private Sub ivMax_MouseClicked (EventData As Mouse";
 //BA.debugLineNum = 714;BA.debugLine="End Sub";
return "";
}
public static String  _ivmin_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
anywheresoftware.b4j.object.JavaObject _jmf = null;
anywheresoftware.b4j.object.JavaObject _stage = null;
 //BA.debugLineNum = 732;BA.debugLine="Private Sub ivMin_MouseClicked (EventData As Mouse";
 //BA.debugLineNum = 733;BA.debugLine="Try";
try { //BA.debugLineNum = 734;BA.debugLine="Dim jmf As JavaObject = MainForm";
_jmf = new anywheresoftware.b4j.object.JavaObject();
_jmf.setObject((java.lang.Object)(_mainform));
 //BA.debugLineNum = 735;BA.debugLine="Dim stage As JavaObject = jmf.GetField(\"stage\")";
_stage = new anywheresoftware.b4j.object.JavaObject();
_stage.setObject((java.lang.Object)(_jmf.GetField("stage")));
 //BA.debugLineNum = 736;BA.debugLine="stage.RunMethod(\"setIconified\", Array As Object(";
_stage.RunMethod("setIconified",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.True)});
 } 
       catch (Exception e6) {
			ba.setLastException(e6); //BA.debugLineNum = 738;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 740;BA.debugLine="End Sub";
return "";
}
public static String  _ivsideyard_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
b4j.example.frmmedia _mf = null;
 //BA.debugLineNum = 951;BA.debugLine="Sub ivSideYard_MouseClicked (EventData As MouseEve";
 //BA.debugLineNum = 952;BA.debugLine="Dim mf As frmMedia";
_mf = new b4j.example.frmmedia();
 //BA.debugLineNum = 953;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (ba,_mainform);
 //BA.debugLineNum = 954;BA.debugLine="mf.url=$\"    <h1>Side Yard</h1>    <img src=\"${Fi";
_mf._url /*String*/  = ("\n"+"   <h1>Side Yard</h1>\n"+"   <img src=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"SideYard.jpg")))+"\"/>\n"+"   \n"+"");
 //BA.debugLineNum = 959;BA.debugLine="mf.Show";
_mf._show /*String*/ ();
 //BA.debugLineNum = 960;BA.debugLine="End Sub";
return "";
}
public static String  _lbtitle_mousedragged(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 649;BA.debugLine="Private Sub lbTitle_MouseDragged (EventData As Mou";
 //BA.debugLineNum = 650;BA.debugLine="Try";
try { //BA.debugLineNum = 651;BA.debugLine="If isMaximized Then Return";
if (_ismaximized) { 
if (true) return "";};
 //BA.debugLineNum = 652;BA.debugLine="Dim jo As JavaObject = EventData";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_eventdata.getObject()));
 //BA.debugLineNum = 653;BA.debugLine="MainForm.WindowLeft = jo.RunMethod(\"getScreenX\",";
_mainform.setWindowLeft((double)(BA.ObjectToNumber(_jo.RunMethod("getScreenX",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))-_xmouse);
 //BA.debugLineNum = 654;BA.debugLine="MainForm.WindowTop = jo.RunMethod(\"getScreenY\",";
_mainform.setWindowTop((double)(BA.ObjectToNumber(_jo.RunMethod("getScreenY",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))-_ymouse);
 } 
       catch (Exception e7) {
			ba.setLastException(e7); //BA.debugLineNum = 656;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 658;BA.debugLine="End Sub";
return "";
}
public static String  _lbtitle_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 660;BA.debugLine="Private Sub lbTitle_MousePressed (EventData As Mou";
 //BA.debugLineNum = 661;BA.debugLine="Try";
try { //BA.debugLineNum = 662;BA.debugLine="xMouse = EventData.X + lbTitle.Left + 15";
_xmouse = _eventdata.getX()+_lbtitle.getLeft()+15;
 //BA.debugLineNum = 663;BA.debugLine="yMouse = EventData.Y + lbTitle.Top + 15";
_ymouse = _eventdata.getY()+_lbtitle.getTop()+15;
 } 
       catch (Exception e5) {
			ba.setLastException(e5); //BA.debugLineNum = 665;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 667;BA.debugLine="End Sub";
return "";
}
public static String  _max_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 716;BA.debugLine="Private Sub Max_Entered_Event(e As Event)";
 //BA.debugLineNum = 717;BA.debugLine="Try";
try { //BA.debugLineNum = 718;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmax.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMaxEnt.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 720;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 722;BA.debugLine="End Sub";
return "";
}
public static String  _max_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 724;BA.debugLine="Private Sub Max_Exited_Event(e As Event)";
 //BA.debugLineNum = 725;BA.debugLine="Try";
try { //BA.debugLineNum = 726;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmax.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMax.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 728;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 730;BA.debugLine="End Sub";
return "";
}
public static String  _min_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 742;BA.debugLine="Private Sub Min_Entered_Event(e As Event)";
 //BA.debugLineNum = 743;BA.debugLine="Try";
try { //BA.debugLineNum = 744;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmin.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMinEnt.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 746;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 748;BA.debugLine="End Sub";
return "";
}
public static String  _min_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 750;BA.debugLine="Private Sub Min_Exited_Event(e As Event)";
 //BA.debugLineNum = 751;BA.debugLine="Try";
try { //BA.debugLineNum = 752;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmin.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMin.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 754;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 756;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
httputils2service._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 9;BA.debugLine="Private emailAddress As String = \"antimone2001@ho";
_emailaddress = "[redacted] # replace with 'examplePass' instead";
 //BA.debugLineNum = 10;BA.debugLine="Private password As String = \"[redacted] # replace with the empty string\"";
_password = "[redacted] # replace with the empty string";
 //BA.debugLineNum = 11;BA.debugLine="Private authToken As String";
_authtoken = "";
 //BA.debugLineNum = 12;BA.debugLine="Private userRegion As String";
_userregion = "";
 //BA.debugLineNum = 13;BA.debugLine="Private accountID As String";
_accountid = "";
 //BA.debugLineNum = 14;BA.debugLine="Private networkID As String";
_networkid = "";
 //BA.debugLineNum = 15;BA.debugLine="Private commandID As String";
_commandid = "";
 //BA.debugLineNum = 16;BA.debugLine="Private commandComplete As Boolean";
_commandcomplete = false;
 //BA.debugLineNum = 17;BA.debugLine="Private cameraThumbnail As String";
_camerathumbnail = "";
 //BA.debugLineNum = 18;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 19;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 20;BA.debugLine="Private lbTitle As Label 'ignore";
_lbtitle = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private xMouse, yMouse As Double";
_xmouse = 0;
_ymouse = 0;
 //BA.debugLineNum = 22;BA.debugLine="Private isMaximized As Boolean = False";
_ismaximized = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 23;BA.debugLine="Private ivClose As ImageView";
_ivclose = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private ivMax As ImageView";
_ivmax = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private ivMin As ImageView";
_ivmin = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private AtualSkin As String";
_atualskin = "";
 //BA.debugLineNum = 27;BA.debugLine="Private imgInit As String";
_imginit = "";
 //BA.debugLineNum = 28;BA.debugLine="Private isMaximized As Boolean = False";
_ismaximized = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 29;BA.debugLine="Private f_X, f_Y, f_W, f_H As Double 'ignore";
_f_x = 0;
_f_y = 0;
_f_w = 0;
_f_h = 0;
 //BA.debugLineNum = 30;BA.debugLine="Private btnDriveway As Button 'ignore";
_btndriveway = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private response As String";
_response = "";
 //BA.debugLineNum = 32;BA.debugLine="Private ivDriveway As ImageView";
_ivdriveway = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private lblStatus As Label 'ignore";
_lblstatus = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private ivFrontDoor As ImageView";
_ivfrontdoor = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private ivSideYard As ImageView";
_ivsideyard = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private lblDriveway As Label 'ignore";
_lbldriveway = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private lblFrontDoor As Label 'ignore";
_lblfrontdoor = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private lblSideYard As Label 'ignore";
_lblsideyard = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private clvDriveway As CustomListView";
_clvdriveway = new b4j.example.customlistview();
 //BA.debugLineNum = 40;BA.debugLine="Private clvFrontDoor As CustomListView";
_clvfrontdoor = new b4j.example.customlistview();
 //BA.debugLineNum = 41;BA.debugLine="Private clvSideYard As CustomListView";
_clvsideyard = new b4j.example.customlistview();
 //BA.debugLineNum = 42;BA.debugLine="Private lblSyncModule As Label 'ignore";
_lblsyncmodule = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public static void  _refreshcameras(boolean _firstrun) throws Exception{
ResumableSub_RefreshCameras rsub = new ResumableSub_RefreshCameras(null,_firstrun);
rsub.resume(ba, null);
}
public static class ResumableSub_RefreshCameras extends BA.ResumableSub {
public ResumableSub_RefreshCameras(b4j.example.main parent,boolean _firstrun) {
this.parent = parent;
this._firstrun = _firstrun;
}
b4j.example.main parent;
boolean _firstrun;
String _camera = "";
anywheresoftware.b4j.objects.ImageViewWrapper _iv = null;
b4j.example.customlistview _clv = null;
anywheresoftware.b4a.objects.collections.List _links = null;
String _link = "";
int _i = 0;
String _strtimestamp = "";
anywheresoftware.b4a.BA.IterableList group10;
int index10;
int groupLen10;
int step48;
int limit48;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 175;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 74;
this.catchState = 73;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 73;
 //BA.debugLineNum = 176;BA.debugLine="Dim camera As String";
_camera = "";
 //BA.debugLineNum = 177;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 178;BA.debugLine="Dim clv As CustomListView";
_clv = new b4j.example.customlistview();
 //BA.debugLineNum = 179;BA.debugLine="Dim links As List";
_links = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 180;BA.debugLine="links = Array(\"347574\", \"236967\", \"226821\")";
_links = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("347574"),(Object)("236967"),(Object)("226821")});
 //BA.debugLineNum = 182;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia-";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/syncmodules");
 //BA.debugLineNum = 183;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 75;
return;
case 75:
//C
this.state = 4;
;
 //BA.debugLineNum = 184;BA.debugLine="GetSyncModuleInfo(response)";
_getsyncmoduleinfo(parent._response);
 //BA.debugLineNum = 186;BA.debugLine="For Each link As String In links";
if (true) break;

case 4:
//for
this.state = 71;
group10 = _links;
index10 = 0;
groupLen10 = group10.getSize();
this.state = 76;
if (true) break;

case 76:
//C
this.state = 71;
if (index10 < groupLen10) {
this.state = 6;
_link = BA.ObjectToString(group10.Get(index10));}
if (true) break;

case 77:
//C
this.state = 76;
index10++;
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 187;BA.debugLine="camera = link";
_camera = _link;
 //BA.debugLineNum = 188;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 7:
//if
this.state = 14;
if ((_camera).equals("347574")) { 
this.state = 9;
}else if((_camera).equals("236967")) { 
this.state = 11;
}else if((_camera).equals("226821")) { 
this.state = 13;
}if (true) break;

case 9:
//C
this.state = 14;
 //BA.debugLineNum = 189;BA.debugLine="lblStatus.Text = \"Capturing a new thumbnail fo";
parent._lblstatus.setText("Capturing a new thumbnail for the Driveway...");
 //BA.debugLineNum = 190;BA.debugLine="iv = ivDriveway";
_iv = parent._ivdriveway;
 //BA.debugLineNum = 191;BA.debugLine="clv = clvDriveway";
_clv = parent._clvdriveway;
 if (true) break;

case 11:
//C
this.state = 14;
 //BA.debugLineNum = 193;BA.debugLine="lblStatus.Text = \"Capturing a new thumbnail fo";
parent._lblstatus.setText("Capturing a new thumbnail for the Front Door...");
 //BA.debugLineNum = 194;BA.debugLine="iv = ivFrontDoor";
_iv = parent._ivfrontdoor;
 //BA.debugLineNum = 195;BA.debugLine="clv = clvFrontDoor";
_clv = parent._clvfrontdoor;
 if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 197;BA.debugLine="lblStatus.Text = \"Capturing a new thumbnail fo";
parent._lblstatus.setText("Capturing a new thumbnail for the Side Yard...");
 //BA.debugLineNum = 198;BA.debugLine="iv = ivSideYard";
_iv = parent._ivsideyard;
 //BA.debugLineNum = 199;BA.debugLine="clv = clvSideYard";
_clv = parent._clvsideyard;
 if (true) break;
;
 //BA.debugLineNum = 202;BA.debugLine="If FirstRun Then";

case 14:
//if
this.state = 70;
if (_firstrun) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 70;
 //BA.debugLineNum = 203;BA.debugLine="iv.SetImage(Null)";
_iv.SetImage((javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 204;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedi";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera);
 //BA.debugLineNum = 205;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 78;
return;
case 78:
//C
this.state = 70;
;
 //BA.debugLineNum = 206;BA.debugLine="GetCameraInfo(response,clv)";
_getcamerainfo(parent._response,_clv);
 //BA.debugLineNum = 207;BA.debugLine="DownloadImage(\"https://rest-\" & userRegion &\".";
_downloadimage("https://rest-"+parent._userregion+".immedia-semi.com/"+parent._camerathumbnail+".jpg",_iv,_camera);
 //BA.debugLineNum = 208;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
 if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 210;BA.debugLine="RESTPost(\"https://rest-\" & userRegion &\".immed";
_restpost("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera+"/thumbnail");
 //BA.debugLineNum = 211;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 79;
return;
case 79:
//C
this.state = 19;
;
 //BA.debugLineNum = 212;BA.debugLine="If response.StartsWith(\"ERROR: \") Then";
if (true) break;

case 19:
//if
this.state = 69;
if (parent._response.startsWith("ERROR: ")) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 69;
 //BA.debugLineNum = 213;BA.debugLine="Log(response)";
anywheresoftware.b4a.keywords.Common.Log(parent._response);
 //BA.debugLineNum = 214;BA.debugLine="lblStatus.Text = response";
parent._lblstatus.setText(parent._response);
 //BA.debugLineNum = 215;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 23:
//C
this.state = 24;
 //BA.debugLineNum = 217;BA.debugLine="GetCommandID(response)";
_getcommandid(parent._response);
 //BA.debugLineNum = 218;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immed";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
 //BA.debugLineNum = 219;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 80;
return;
case 80:
//C
this.state = 24;
;
 //BA.debugLineNum = 220;BA.debugLine="If response.StartsWith(\"ERROR: \") Then";
if (true) break;

case 24:
//if
this.state = 68;
if (parent._response.startsWith("ERROR: ")) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 68;
 //BA.debugLineNum = 221;BA.debugLine="Log(response)";
anywheresoftware.b4a.keywords.Common.Log(parent._response);
 //BA.debugLineNum = 222;BA.debugLine="lblStatus.Text = response";
parent._lblstatus.setText(parent._response);
 //BA.debugLineNum = 223;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 28:
//C
this.state = 29;
 //BA.debugLineNum = 225;BA.debugLine="For i = 1 To 30";
if (true) break;

case 29:
//for
this.state = 46;
step48 = 1;
limit48 = (int) (30);
_i = (int) (1) ;
this.state = 81;
if (true) break;

case 81:
//C
this.state = 46;
if ((step48 > 0 && _i <= limit48) || (step48 < 0 && _i >= limit48)) this.state = 31;
if (true) break;

case 82:
//C
this.state = 81;
_i = ((int)(0 + _i + step48)) ;
if (true) break;

case 31:
//C
this.state = 32;
 //BA.debugLineNum = 226;BA.debugLine="GetCommandStatus(response)";
_getcommandstatus(parent._response);
 //BA.debugLineNum = 227;BA.debugLine="If commandComplete Then";
if (true) break;

case 32:
//if
this.state = 45;
if (parent._commandcomplete) { 
this.state = 34;
}else {
this.state = 36;
}if (true) break;

case 34:
//C
this.state = 45;
 //BA.debugLineNum = 228;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".im";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera);
 //BA.debugLineNum = 229;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 83;
return;
case 83:
//C
this.state = 45;
;
 //BA.debugLineNum = 230;BA.debugLine="GetCameraInfo(response,clv)";
_getcamerainfo(parent._response,_clv);
 //BA.debugLineNum = 231;BA.debugLine="DownloadImage(\"https://rest-\" & userRegion";
_downloadimage("https://rest-"+parent._userregion+".immedia-semi.com/"+parent._camerathumbnail+".jpg",_iv,_camera);
 //BA.debugLineNum = 232;BA.debugLine="Exit";
this.state = 46;
if (true) break;
 if (true) break;

case 36:
//C
this.state = 37;
 //BA.debugLineNum = 234;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 37:
//if
this.state = 44;
if ((_camera).equals("347574")) { 
this.state = 39;
}else if((_camera).equals("236967")) { 
this.state = 41;
}else if((_camera).equals("226821")) { 
this.state = 43;
}if (true) break;

case 39:
//C
this.state = 44;
 //BA.debugLineNum = 235;BA.debugLine="lblStatus.Text = \"Awaiting for the Drivew";
parent._lblstatus.setText("Awaiting for the Driveway thumbnail... "+BA.NumberToString(_i)+"/30");
 if (true) break;

case 41:
//C
this.state = 44;
 //BA.debugLineNum = 237;BA.debugLine="lblStatus.Text = \"Awaiting for the Front";
parent._lblstatus.setText("Awaiting for the Front Door thumbnail...  "+BA.NumberToString(_i)+"/30");
 if (true) break;

case 43:
//C
this.state = 44;
 //BA.debugLineNum = 239;BA.debugLine="lblStatus.Text = \"Awaiting for the Side Y";
parent._lblstatus.setText("Awaiting for the Side Yard thumbnail... "+BA.NumberToString(_i)+"/30");
 if (true) break;

case 44:
//C
this.state = 45;
;
 if (true) break;

case 45:
//C
this.state = 82;
;
 //BA.debugLineNum = 242;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".imm";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
 //BA.debugLineNum = 243;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 84;
return;
case 84:
//C
this.state = 82;
;
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 245;BA.debugLine="If commandComplete = False Then";

case 46:
//if
this.state = 67;
if (parent._commandcomplete==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 48;
}else {
this.state = 58;
}if (true) break;

case 48:
//C
this.state = 49;
 //BA.debugLineNum = 246;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 49:
//if
this.state = 56;
if ((_camera).equals("347574")) { 
this.state = 51;
}else if((_camera).equals("236967")) { 
this.state = 53;
}else if((_camera).equals("226821")) { 
this.state = 55;
}if (true) break;

case 51:
//C
this.state = 56;
 //BA.debugLineNum = 247;BA.debugLine="lblStatus.Text = \"Failed to retrieve Drive";
parent._lblstatus.setText("Failed to retrieve Driveway thumbnail...");
 //BA.debugLineNum = 248;BA.debugLine="ivDriveway.SetImage(Null)";
parent._ivdriveway.SetImage((javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;

case 53:
//C
this.state = 56;
 //BA.debugLineNum = 250;BA.debugLine="lblStatus.Text = \"Failed to retrieve Front";
parent._lblstatus.setText("Failed to retrieve Front Door thumbnail...");
 //BA.debugLineNum = 251;BA.debugLine="ivFrontDoor.SetImage(Null)";
parent._ivfrontdoor.SetImage((javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;

case 55:
//C
this.state = 56;
 //BA.debugLineNum = 253;BA.debugLine="lblStatus.Text = \"Failed to retrieve Side";
parent._lblstatus.setText("Failed to retrieve Side Yard thumbnail...");
 //BA.debugLineNum = 254;BA.debugLine="ivSideYard.SetImage(Null)";
parent._ivsideyard.SetImage((javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;

case 56:
//C
this.state = 67;
;
 if (true) break;

case 58:
//C
this.state = 59;
 //BA.debugLineNum = 257;BA.debugLine="Dim strTimestamp As String";
_strtimestamp = "";
 //BA.debugLineNum = 258;BA.debugLine="DateTime.DateFormat = \"h:mm:ss a\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("h:mm:ss a");
 //BA.debugLineNum = 259;BA.debugLine="strTimestamp = DateTime.Date(DateTime.Now)";
_strtimestamp = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 260;BA.debugLine="lblStatus.Text = \"Last updated: \" & strTime";
parent._lblstatus.setText("Last updated: "+_strtimestamp);
 //BA.debugLineNum = 261;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 59:
//if
this.state = 66;
if ((_camera).equals("347574")) { 
this.state = 61;
}else if((_camera).equals("236967")) { 
this.state = 63;
}else if((_camera).equals("226821")) { 
this.state = 65;
}if (true) break;

case 61:
//C
this.state = 66;
 //BA.debugLineNum = 262;BA.debugLine="lblDriveway.Text = \"Driveway \" & strTimest";
parent._lbldriveway.setText("Driveway "+_strtimestamp);
 if (true) break;

case 63:
//C
this.state = 66;
 //BA.debugLineNum = 264;BA.debugLine="lblFrontDoor.Text = \"Front Door \" & strTim";
parent._lblfrontdoor.setText("Front Door "+_strtimestamp);
 if (true) break;

case 65:
//C
this.state = 66;
 //BA.debugLineNum = 266;BA.debugLine="lblSideYard.Text = \"Side Yard \" & strTimes";
parent._lblsideyard.setText("Side Yard "+_strtimestamp);
 if (true) break;

case 66:
//C
this.state = 67;
;
 if (true) break;

case 67:
//C
this.state = 68;
;
 if (true) break;

case 68:
//C
this.state = 69;
;
 if (true) break;

case 69:
//C
this.state = 70;
;
 if (true) break;

case 70:
//C
this.state = 77;
;
 if (true) break;
if (true) break;

case 71:
//C
this.state = 74;
;
 if (true) break;

case 73:
//C
this.state = 74;
this.catchState = 0;
 //BA.debugLineNum = 274;BA.debugLine="Log(\"RefreshCamera LastException: \" & LastExcept";
anywheresoftware.b4a.keywords.Common.Log("RefreshCamera LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 275;BA.debugLine="lblStatus.Text = \"RefreshCamera LastException: \"";
parent._lblstatus.setText("RefreshCamera LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 74:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public static void  _requestauthtoken() throws Exception{
ResumableSub_RequestAuthToken rsub = new ResumableSub_RequestAuthToken(null);
rsub.resume(ba, null);
}
public static class ResumableSub_RequestAuthToken extends BA.ResumableSub {
public ResumableSub_RequestAuthToken(b4j.example.main parent) {
this.parent = parent;
}
b4j.example.main parent;
b4j.example.httpjob _joblogin = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 122;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 24;
this.catchState = 23;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 23;
 //BA.debugLineNum = 123;BA.debugLine="lblStatus.Text = \"Authenticating...\"";
parent._lblstatus.setText("Authenticating...");
 //BA.debugLineNum = 124;BA.debugLine="Dim jobLogin As HttpJob";
_joblogin = new b4j.example.httpjob();
 //BA.debugLineNum = 125;BA.debugLine="jobLogin.Initialize(\"\", Me)";
_joblogin._initialize /*String*/ (ba,"",main.getObject());
 //BA.debugLineNum = 126;BA.debugLine="jobLogin.PostString(\"https://rest.prod.immedia-s";
_joblogin._poststring /*String*/ ("https://rest.prod.immedia-semi.com/login","email="+parent._emailaddress+"&password="+parent._password);
 //BA.debugLineNum = 127;BA.debugLine="jobLogin.GetRequest.SetContentType(\"application/";
_joblogin._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/x-www-form-urlencoded");
 //BA.debugLineNum = 128;BA.debugLine="Wait For (jobLogin) JobDone(jobLogin As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, this, (Object)(_joblogin));
this.state = 25;
return;
case 25:
//C
this.state = 4;
_joblogin = (b4j.example.httpjob) result[0];
;
 //BA.debugLineNum = 129;BA.debugLine="If jobLogin.Success Then";
if (true) break;

case 4:
//if
this.state = 21;
if (_joblogin._success /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 20;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 130;BA.debugLine="lblStatus.Text = \"Successfully logged in to the";
parent._lblstatus.setText("Successfully logged in to the Blink server...");
 //BA.debugLineNum = 132;BA.debugLine="GetAuthInfo(jobLogin.GetString)";
_getauthinfo(_joblogin._getstring /*String*/ ());
 //BA.debugLineNum = 134;BA.debugLine="RESTGet(\"https://rest-\" & userRegion & \".immedi";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/user");
 //BA.debugLineNum = 135;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 26;
return;
case 26:
//C
this.state = 7;
;
 //BA.debugLineNum = 136;BA.debugLine="If response.StartsWith(\"ERROR: \") Then";
if (true) break;

case 7:
//if
this.state = 12;
if (parent._response.startsWith("ERROR: ")) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 //BA.debugLineNum = 137;BA.debugLine="Log(response)";
anywheresoftware.b4a.keywords.Common.Log(parent._response);
 //BA.debugLineNum = 138;BA.debugLine="lblStatus.Text = response";
parent._lblstatus.setText(parent._response);
 //BA.debugLineNum = 139;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 141;BA.debugLine="lblStatus.Text = \"AuthToken acquired...\"";
parent._lblstatus.setText("AuthToken acquired...");
 //BA.debugLineNum = 142;BA.debugLine="GetUserInfo(response)";
_getuserinfo(parent._response);
 if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 145;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/api/v1/camera/usage");
 //BA.debugLineNum = 146;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 27;
return;
case 27:
//C
this.state = 13;
;
 //BA.debugLineNum = 147;BA.debugLine="If response.StartsWith(\"ERROR: \") Then";
if (true) break;

case 13:
//if
this.state = 18;
if (parent._response.startsWith("ERROR: ")) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 //BA.debugLineNum = 148;BA.debugLine="Log(response)";
anywheresoftware.b4a.keywords.Common.Log(parent._response);
 //BA.debugLineNum = 149;BA.debugLine="lblStatus.Text = response";
parent._lblstatus.setText(parent._response);
 //BA.debugLineNum = 150;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 152;BA.debugLine="GetAllCameras(response)";
_getallcameras(parent._response);
 if (true) break;

case 18:
//C
this.state = 21;
;
 if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 155;BA.debugLine="lblStatus.Text = \"RequestAuthToken error: \" & j";
parent._lblstatus.setText("RequestAuthToken error: "+_joblogin._getstring /*String*/ ());
 //BA.debugLineNum = 156;BA.debugLine="Log(\"RequestAuthToken error: \" & jobLogin.GetSt";
anywheresoftware.b4a.keywords.Common.Log("RequestAuthToken error: "+_joblogin._getstring /*String*/ ());
 //BA.debugLineNum = 157;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 21:
//C
this.state = 24;
;
 //BA.debugLineNum = 159;BA.debugLine="jobLogin.Release";
_joblogin._release /*String*/ ();
 //BA.debugLineNum = 160;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
 //BA.debugLineNum = 162;BA.debugLine="RefreshCameras(True)";
_refreshcameras(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
 //BA.debugLineNum = 164;BA.debugLine="lblStatus.Text = \"RequestAuthToken LastException";
parent._lblstatus.setText("RequestAuthToken LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 165;BA.debugLine="Log(\"RequestAuthToken LastException: \" & LastExc";
anywheresoftware.b4a.keywords.Common.Log("RequestAuthToken LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _restget(String _url) throws Exception{
ResumableSub_RESTGet rsub = new ResumableSub_RESTGet(null,_url);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RESTGet extends BA.ResumableSub {
public ResumableSub_RESTGet(b4j.example.main parent,String _url) {
this.parent = parent;
this._url = _url;
}
b4j.example.main parent;
String _url;
b4j.example.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 280;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 //BA.debugLineNum = 281;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
 //BA.debugLineNum = 282;BA.debugLine="response = \"\"";
parent._response = "";
 //BA.debugLineNum = 283;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no";
_j._initialize /*String*/ (ba,"",main.getObject());
 //BA.debugLineNum = 284;BA.debugLine="j.Download(url)";
_j._download /*String*/ (_url);
 //BA.debugLineNum = 285;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("TOKEN_AUTH",parent._authtoken);
 //BA.debugLineNum = 286;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_j = (b4j.example.httpjob) result[0];
;
 //BA.debugLineNum = 287;BA.debugLine="If j.Success Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_j._success /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 288;BA.debugLine="response = j.GetString";
parent._response = _j._getstring /*String*/ ();
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 290;BA.debugLine="response = \"ERROR: \" & j.GetString";
parent._response = "ERROR: "+_j._getstring /*String*/ ();
 if (true) break;

case 9:
//C
this.state = 12;
;
 //BA.debugLineNum = 292;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 //BA.debugLineNum = 294;BA.debugLine="response = \"ERROR: \" & LastException";
parent._response = "ERROR: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba));
 //BA.debugLineNum = 295;BA.debugLine="Log(\"RESTDownload LastException: \" & LastExcepti";
anywheresoftware.b4a.keywords.Common.Log("RESTDownload LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 297;BA.debugLine="Log(\"URL: \" & url)";
anywheresoftware.b4a.keywords.Common.Log("URL: "+_url);
 //BA.debugLineNum = 298;BA.debugLine="Log(\"Response: \" & response)";
anywheresoftware.b4a.keywords.Common.Log("Response: "+parent._response);
 //BA.debugLineNum = 299;BA.debugLine="Return(response)";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)((parent._response)));return;};
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _restpost(String _url) throws Exception{
ResumableSub_RESTPost rsub = new ResumableSub_RESTPost(null,_url);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RESTPost extends BA.ResumableSub {
public ResumableSub_RESTPost(b4j.example.main parent,String _url) {
this.parent = parent;
this._url = _url;
}
b4j.example.main parent;
String _url;
b4j.example.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 303;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 //BA.debugLineNum = 304;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
 //BA.debugLineNum = 305;BA.debugLine="response = \"\"";
parent._response = "";
 //BA.debugLineNum = 306;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no";
_j._initialize /*String*/ (ba,"",main.getObject());
 //BA.debugLineNum = 307;BA.debugLine="j.PostString(url,\"\")";
_j._poststring /*String*/ (_url,"");
 //BA.debugLineNum = 308;BA.debugLine="j.GetRequest.SetContentType(\"application/x-www-f";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/x-www-form-urlencoded");
 //BA.debugLineNum = 309;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("TOKEN_AUTH",parent._authtoken);
 //BA.debugLineNum = 310;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_j = (b4j.example.httpjob) result[0];
;
 //BA.debugLineNum = 311;BA.debugLine="If j.Success Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_j._success /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 312;BA.debugLine="response = j.GetString";
parent._response = _j._getstring /*String*/ ();
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 314;BA.debugLine="response = \"ERROR: \" & j.GetString";
parent._response = "ERROR: "+_j._getstring /*String*/ ();
 if (true) break;

case 9:
//C
this.state = 12;
;
 //BA.debugLineNum = 316;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 //BA.debugLineNum = 318;BA.debugLine="response = \"ERROR: \" & LastException";
parent._response = "ERROR: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba));
 //BA.debugLineNum = 319;BA.debugLine="Log(\"RESTPost LastException: \" & LastException)";
anywheresoftware.b4a.keywords.Common.Log("RESTPost LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 321;BA.debugLine="Log(\"URL: \" & url)";
anywheresoftware.b4a.keywords.Common.Log("URL: "+_url);
 //BA.debugLineNum = 322;BA.debugLine="Log(\"Response: \" & response)";
anywheresoftware.b4a.keywords.Common.Log("Response: "+parent._response);
 //BA.debugLineNum = 323;BA.debugLine="Return(response)";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)((parent._response)));return;};
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
}
