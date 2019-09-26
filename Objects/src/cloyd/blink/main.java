package cloyd.blink;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("cloyd.blink", "cloyd.blink.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("cloyd.blink", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "cloyd.blink.main", ba);
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


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4j.example.dateutils._process_globals();
b4j.example.cssutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
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
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnactivity = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnrefresh = null;
public static String _prevdrivewayupdatetime = "";
public static String _prevfrontdoorupdatetime = "";
public static anywheresoftware.b4j.objects.ImageViewWrapper _ivsyncmodule = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper _ivsyncmodulewifi = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static cloyd.blink.httputils2service _httputils2service = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "application_error", false))
	 {return ((Boolean) Debug.delegate(ba, "application_error", new Object[] {_error,_stacktrace}));}
anywheresoftware.b4j.objects.Shell _shl = null;
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="btnDriveway.Enabled = True";
_btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="btnRefresh.Enabled = True";
_btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="btnActivity.Enabled = True";
_btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="fx.msgbox2(MainForm,Error.Message,MainForm.Title,";
_fx.Msgbox2(_mainform,_error.getMessage(),_mainform.getTitle(),"OK","","",_fx.MSGBOX_ERROR);
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="Dim shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="Try";
try {RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="shl.Initialize(\"shl\", \"java.exe\" , Array As Stri";
_shl.Initialize("shl","java.exe",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"-jar","Blink4Java.jar"}));
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="shl.WorkingDirectory = File.DirApp";
_shl.setWorkingDirectory(anywheresoftware.b4a.keywords.Common.File.getDirApp());
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="Log(\"Application_Error: \" & LastException.Messag";
anywheresoftware.b4a.keywords.Common.Log("Application_Error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=131086;
 //BA.debugLineNum = 131086;BA.debugLine="Return False ' handled";
if (true) return anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=131087;
 //BA.debugLineNum = 131087;BA.debugLine="End Sub";
return false;
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args}));}
String _skintemp = "";
String _skindefault = "";
anywheresoftware.b4j.agraham.reflection.Reflection _obj = null;
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="Try";
try {RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="Dim skinTemp As String";
_skintemp = "";
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="Dim skinDefault As String";
_skindefault = "";
RDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="If File.Exists(File.DirApp, \"skin.ini\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"skin.ini")) { 
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="skinTemp = File.ReadString(File.DirApp, \"skin.i";
_skintemp = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"skin.ini");
 }else {
RDebugUtils.currentLine=65545;
 //BA.debugLineNum = 65545;BA.debugLine="skinTemp = \"vdSk03\"";
_skintemp = "vdSk03";
 };
RDebugUtils.currentLine=65548;
 //BA.debugLineNum = 65548;BA.debugLine="If skinTemp = \"\" Then";
if ((_skintemp).equals("")) { 
RDebugUtils.currentLine=65549;
 //BA.debugLineNum = 65549;BA.debugLine="skinDefault = \"vdSk03\"";
_skindefault = "vdSk03";
 }else {
RDebugUtils.currentLine=65551;
 //BA.debugLineNum = 65551;BA.debugLine="If skinTemp = \"vdSk01\" Or skinTemp = \"vdSk02\" O";
if ((_skintemp).equals("vdSk01") || (_skintemp).equals("vdSk02") || (_skintemp).equals("vdSk03") || (_skintemp).equals("vdSk04") || (_skintemp).equals("vdSk05") || (_skintemp).equals("vdSk06")) { 
RDebugUtils.currentLine=65552;
 //BA.debugLineNum = 65552;BA.debugLine="skinDefault = skinTemp";
_skindefault = _skintemp;
 }else {
RDebugUtils.currentLine=65554;
 //BA.debugLineNum = 65554;BA.debugLine="skinDefault = \"vdSk03\"";
_skindefault = "vdSk03";
 };
 };
RDebugUtils.currentLine=65558;
 //BA.debugLineNum = 65558;BA.debugLine="MainForm = Form1";
_mainform = _form1;
RDebugUtils.currentLine=65559;
 //BA.debugLineNum = 65559;BA.debugLine="MainForm.SetFormStyle(\"TRANSPARENT\")";
_mainform.SetFormStyle("TRANSPARENT");
RDebugUtils.currentLine=65560;
 //BA.debugLineNum = 65560;BA.debugLine="MainForm.RootPane.LoadLayout(skinDefault) 'Load";
_mainform.getRootPane().LoadLayout(ba,_skindefault);
RDebugUtils.currentLine=65561;
 //BA.debugLineNum = 65561;BA.debugLine="AtualSkin = skinDefault";
_atualskin = _skindefault;
RDebugUtils.currentLine=65562;
 //BA.debugLineNum = 65562;BA.debugLine="MainForm.BackColor = fx.Colors.Transparent";
_mainform.setBackColor(_fx.Colors.Transparent);
RDebugUtils.currentLine=65563;
 //BA.debugLineNum = 65563;BA.debugLine="MainForm.RootPane.Style = \"-fx-background-color:";
_mainform.getRootPane().setStyle("-fx-background-color:transparent;-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 1.0) , 15,0, 0.0, 0.0);");
RDebugUtils.currentLine=65564;
 //BA.debugLineNum = 65564;BA.debugLine="MainForm.Resizable = True";
_mainform.setResizable(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=65565;
 //BA.debugLineNum = 65565;BA.debugLine="MainForm.Icon = fx.LoadImage(File.DirAssets, \"ho";
_mainform.setIcon((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"home.png").getObject()));
RDebugUtils.currentLine=65566;
 //BA.debugLineNum = 65566;BA.debugLine="MainForm.Title = \"Catanaoan Blink XT2 Cameras v1";
_mainform.setTitle("Catanaoan Blink XT2 Cameras v1.0");
RDebugUtils.currentLine=65567;
 //BA.debugLineNum = 65567;BA.debugLine="lbTitle.MouseCursor = fx.Cursors.MOVE";
_lbtitle.setMouseCursor(_fx.Cursors.MOVE);
RDebugUtils.currentLine=65568;
 //BA.debugLineNum = 65568;BA.debugLine="lbTitle.Text = \"Catanaoan Blink XT2 Cameras v1.0";
_lbtitle.setText("Catanaoan Blink XT2 Cameras v1.0");
RDebugUtils.currentLine=65569;
 //BA.debugLineNum = 65569;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=65570;
 //BA.debugLineNum = 65570;BA.debugLine="Obj.Target = ivClose";
_obj.Target = (Object)(_ivclose.getObject());
RDebugUtils.currentLine=65571;
 //BA.debugLineNum = 65571;BA.debugLine="Obj.AddEventHandler2(\"Close_Entered\", \"onMouseEn";
_obj.AddEventHandler2(ba,"Close_Entered","onMouseEnteredProperty");
RDebugUtils.currentLine=65572;
 //BA.debugLineNum = 65572;BA.debugLine="Obj.AddEventHandler2(\"Close_Exited\", \"onMouseExi";
_obj.AddEventHandler2(ba,"Close_Exited","onMouseExitedProperty");
RDebugUtils.currentLine=65573;
 //BA.debugLineNum = 65573;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=65574;
 //BA.debugLineNum = 65574;BA.debugLine="Obj.Target = ivMax";
_obj.Target = (Object)(_ivmax.getObject());
RDebugUtils.currentLine=65575;
 //BA.debugLineNum = 65575;BA.debugLine="Obj.AddEventHandler2(\"Max_Entered\", \"onMouseEnte";
_obj.AddEventHandler2(ba,"Max_Entered","onMouseEnteredProperty");
RDebugUtils.currentLine=65576;
 //BA.debugLineNum = 65576;BA.debugLine="Obj.AddEventHandler2(\"Max_Exited\", \"onMouseExite";
_obj.AddEventHandler2(ba,"Max_Exited","onMouseExitedProperty");
RDebugUtils.currentLine=65577;
 //BA.debugLineNum = 65577;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=65578;
 //BA.debugLineNum = 65578;BA.debugLine="Obj.Target = ivMin";
_obj.Target = (Object)(_ivmin.getObject());
RDebugUtils.currentLine=65579;
 //BA.debugLineNum = 65579;BA.debugLine="Obj.AddEventHandler2(\"Min_Entered\", \"onMouseEnte";
_obj.AddEventHandler2(ba,"Min_Entered","onMouseEnteredProperty");
RDebugUtils.currentLine=65580;
 //BA.debugLineNum = 65580;BA.debugLine="Obj.AddEventHandler2(\"Min_Exited\", \"onMouseExite";
_obj.AddEventHandler2(ba,"Min_Exited","onMouseExitedProperty");
RDebugUtils.currentLine=65581;
 //BA.debugLineNum = 65581;BA.debugLine="imgInit = AtualSkin.SubString(2).ToLowerCase";
_imginit = _atualskin.substring((int) (2)).toLowerCase();
RDebugUtils.currentLine=65582;
 //BA.debugLineNum = 65582;BA.debugLine="Get_css";
_get_css();
RDebugUtils.currentLine=65587;
 //BA.debugLineNum = 65587;BA.debugLine="MainForm.WindowLeft = CheckMonitor.MaxX	- MainFo";
_mainform.setWindowLeft(_checkmonitor().getMaxX()-_mainform.getWidth()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=65588;
 //BA.debugLineNum = 65588;BA.debugLine="MainForm.WindowTop = CheckMonitor.MaxY - MainFor";
_mainform.setWindowTop(_checkmonitor().getMaxY()-_mainform.getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=65590;
 //BA.debugLineNum = 65590;BA.debugLine="lblStatus.TextColor = fx.Colors.White";
_lblstatus.setTextColor(_fx.Colors.White);
RDebugUtils.currentLine=65591;
 //BA.debugLineNum = 65591;BA.debugLine="MainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=65592;
 //BA.debugLineNum = 65592;BA.debugLine="btnDriveway.Enabled = False";
_btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=65593;
 //BA.debugLineNum = 65593;BA.debugLine="btnRefresh.Enabled = False";
_btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=65594;
 //BA.debugLineNum = 65594;BA.debugLine="btnActivity.Enabled = False";
_btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=65595;
 //BA.debugLineNum = 65595;BA.debugLine="RequestAuthToken";
_requestauthtoken();
 } 
       catch (Exception e52) {
			ba.setLastException(e52);RDebugUtils.currentLine=65597;
 //BA.debugLineNum = 65597;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=65600;
 //BA.debugLineNum = 65600;BA.debugLine="End Sub";
return "";
}
public static String  _get_css() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "get_css", false))
	 {return ((String) Debug.delegate(ba, "get_css", null));}
anywheresoftware.b4j.object.JavaObject _jform = null;
anywheresoftware.b4j.object.JavaObject _scene = null;
anywheresoftware.b4a.objects.collections.List _stylesheets = null;
RDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Public Sub Get_css";
RDebugUtils.currentLine=22347777;
 //BA.debugLineNum = 22347777;BA.debugLine="Try";
try {RDebugUtils.currentLine=22347778;
 //BA.debugLineNum = 22347778;BA.debugLine="Dim jForm As JavaObject = MainForm";
_jform = new anywheresoftware.b4j.object.JavaObject();
_jform.setObject((java.lang.Object)(_mainform));
RDebugUtils.currentLine=22347779;
 //BA.debugLineNum = 22347779;BA.debugLine="Dim scene As JavaObject = jForm.GetField(\"scene\"";
_scene = new anywheresoftware.b4j.object.JavaObject();
_scene.setObject((java.lang.Object)(_jform.GetField("scene")));
RDebugUtils.currentLine=22347780;
 //BA.debugLineNum = 22347780;BA.debugLine="Dim stylesheets As List = scene.RunMethod(\"getSt";
_stylesheets = new anywheresoftware.b4a.objects.collections.List();
_stylesheets.setObject((java.util.List)(_scene.RunMethod("getStylesheets",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=22347781;
 //BA.debugLineNum = 22347781;BA.debugLine="stylesheets.Clear";
_stylesheets.Clear();
RDebugUtils.currentLine=22347782;
 //BA.debugLineNum = 22347782;BA.debugLine="stylesheets.Add(File.GetUri(File.DirAssets, imgI";
_stylesheets.Add((Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+".css")));
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=22347784;
 //BA.debugLineNum = 22347784;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=22347786;
 //BA.debugLineNum = 22347786;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.JFX.ScreenWrapper  _checkmonitor() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "checkmonitor", false))
	 {return ((anywheresoftware.b4j.objects.JFX.ScreenWrapper) Debug.delegate(ba, "checkmonitor", null));}
anywheresoftware.b4a.objects.collections.List _slist = null;
anywheresoftware.b4j.objects.JFX.ScreenWrapper _s = null;
RDebugUtils.currentLine=22413312;
 //BA.debugLineNum = 22413312;BA.debugLine="Sub CheckMonitor() As Screen";
RDebugUtils.currentLine=22413313;
 //BA.debugLineNum = 22413313;BA.debugLine="Try";
try {RDebugUtils.currentLine=22413314;
 //BA.debugLineNum = 22413314;BA.debugLine="If fx.Screens.Size= 1 Then";
if (_fx.getScreens().getSize()==1) { 
RDebugUtils.currentLine=22413315;
 //BA.debugLineNum = 22413315;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
RDebugUtils.currentLine=22413316;
 //BA.debugLineNum = 22413316;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=22413318;
 //BA.debugLineNum = 22413318;BA.debugLine="Return S";
if (true) return _s;
 }else 
{RDebugUtils.currentLine=22413319;
 //BA.debugLineNum = 22413319;BA.debugLine="Else If fx.Screens.Size> 1 Then";
if (_fx.getScreens().getSize()>1) { 
RDebugUtils.currentLine=22413320;
 //BA.debugLineNum = 22413320;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
RDebugUtils.currentLine=22413321;
 //BA.debugLineNum = 22413321;BA.debugLine="Dim S As Screen = SList.Get(2)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (2))));
RDebugUtils.currentLine=22413323;
 //BA.debugLineNum = 22413323;BA.debugLine="Return S";
if (true) return _s;
 }else {
RDebugUtils.currentLine=22413325;
 //BA.debugLineNum = 22413325;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
RDebugUtils.currentLine=22413326;
 //BA.debugLineNum = 22413326;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=22413328;
 //BA.debugLineNum = 22413328;BA.debugLine="Return S";
if (true) return _s;
 }}
;
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=22413331;
 //BA.debugLineNum = 22413331;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
RDebugUtils.currentLine=22413332;
 //BA.debugLineNum = 22413332;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=22413334;
 //BA.debugLineNum = 22413334;BA.debugLine="Return S";
if (true) return _s;
 };
RDebugUtils.currentLine=22413336;
 //BA.debugLineNum = 22413336;BA.debugLine="End Sub";
return null;
}
public static void  _requestauthtoken() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "requestauthtoken", false))
	 {Debug.delegate(ba, "requestauthtoken", null); return;}
ResumableSub_RequestAuthToken rsub = new ResumableSub_RequestAuthToken(null);
rsub.resume(ba, null);
}
public static class ResumableSub_RequestAuthToken extends BA.ResumableSub {
public ResumableSub_RequestAuthToken(cloyd.blink.main parent) {
this.parent = parent;
}
cloyd.blink.main parent;
cloyd.blink.httpjob _joblogin = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=20643846;
 //BA.debugLineNum = 20643846;BA.debugLine="Try";
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
RDebugUtils.currentLine=20643847;
 //BA.debugLineNum = 20643847;BA.debugLine="lblStatus.Text = \"Authenticating...\"";
parent._lblstatus.setText("Authenticating...");
RDebugUtils.currentLine=20643848;
 //BA.debugLineNum = 20643848;BA.debugLine="Dim jobLogin As HttpJob";
_joblogin = new cloyd.blink.httpjob();
RDebugUtils.currentLine=20643849;
 //BA.debugLineNum = 20643849;BA.debugLine="jobLogin.Initialize(\"\", Me)";
_joblogin._initialize /*String*/ (null,ba,"",main.getObject());
RDebugUtils.currentLine=20643850;
 //BA.debugLineNum = 20643850;BA.debugLine="jobLogin.PostString(\"https://rest.prod.immedia-s";
_joblogin._poststring /*String*/ (null,"https://rest.prod.immedia-semi.com/login","email="+parent._emailaddress+"&password="+parent._password);
RDebugUtils.currentLine=20643851;
 //BA.debugLineNum = 20643851;BA.debugLine="jobLogin.GetRequest.SetContentType(\"application/";
_joblogin._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/x-www-form-urlencoded");
RDebugUtils.currentLine=20643852;
 //BA.debugLineNum = 20643852;BA.debugLine="Wait For (jobLogin) JobDone(jobLogin As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "requestauthtoken"), (Object)(_joblogin));
this.state = 25;
return;
case 25:
//C
this.state = 4;
_joblogin = (cloyd.blink.httpjob) result[0];
;
RDebugUtils.currentLine=20643853;
 //BA.debugLineNum = 20643853;BA.debugLine="If jobLogin.Success Then";
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
RDebugUtils.currentLine=20643854;
 //BA.debugLineNum = 20643854;BA.debugLine="lblStatus.Text = \"Successfully logged in to the";
parent._lblstatus.setText("Successfully logged in to the Blink server...");
RDebugUtils.currentLine=20643856;
 //BA.debugLineNum = 20643856;BA.debugLine="GetAuthInfo(jobLogin.GetString)";
_getauthinfo(_joblogin._getstring /*String*/ (null));
RDebugUtils.currentLine=20643858;
 //BA.debugLineNum = 20643858;BA.debugLine="RESTGet(\"https://rest-\" & userRegion & \".immedi";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/user");
RDebugUtils.currentLine=20643859;
 //BA.debugLineNum = 20643859;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "requestauthtoken"),(int) (1000));
this.state = 26;
return;
case 26:
//C
this.state = 7;
;
RDebugUtils.currentLine=20643861;
 //BA.debugLineNum = 20643861;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.C";
if (true) break;

case 7:
//if
this.state = 12;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=20643862;
 //BA.debugLineNum = 20643862;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20643863;
 //BA.debugLineNum = 20643863;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20643864;
 //BA.debugLineNum = 20643864;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20643865;
 //BA.debugLineNum = 20643865;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=20643867;
 //BA.debugLineNum = 20643867;BA.debugLine="lblStatus.Text = \"AuthToken acquired...\"";
parent._lblstatus.setText("AuthToken acquired...");
RDebugUtils.currentLine=20643868;
 //BA.debugLineNum = 20643868;BA.debugLine="GetUserInfo(response)";
_getuserinfo(parent._response);
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=20643871;
 //BA.debugLineNum = 20643871;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/api/v1/camera/usage");
RDebugUtils.currentLine=20643872;
 //BA.debugLineNum = 20643872;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "requestauthtoken"),(int) (1000));
this.state = 27;
return;
case 27:
//C
this.state = 13;
;
RDebugUtils.currentLine=20643874;
 //BA.debugLineNum = 20643874;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.C";
if (true) break;

case 13:
//if
this.state = 18;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
RDebugUtils.currentLine=20643875;
 //BA.debugLineNum = 20643875;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20643876;
 //BA.debugLineNum = 20643876;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20643877;
 //BA.debugLineNum = 20643877;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20643878;
 //BA.debugLineNum = 20643878;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=20643880;
 //BA.debugLineNum = 20643880;BA.debugLine="GetAllCameras(response)";
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
RDebugUtils.currentLine=20643883;
 //BA.debugLineNum = 20643883;BA.debugLine="lblStatus.Text = GetRESTError(jobLogin.ErrorMes";
parent._lblstatus.setText(_getresterror(_joblogin._errormessage /*String*/ ));
RDebugUtils.currentLine=20643884;
 //BA.debugLineNum = 20643884;BA.debugLine="Log(\"RequestAuthToken error: \" & jobLogin.Error";
anywheresoftware.b4a.keywords.Common.Log("RequestAuthToken error: "+_joblogin._errormessage /*String*/ );
RDebugUtils.currentLine=20643885;
 //BA.debugLineNum = 20643885;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20643886;
 //BA.debugLineNum = 20643886;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20643887;
 //BA.debugLineNum = 20643887;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20643888;
 //BA.debugLineNum = 20643888;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 21:
//C
this.state = 24;
;
RDebugUtils.currentLine=20643890;
 //BA.debugLineNum = 20643890;BA.debugLine="jobLogin.Release";
_joblogin._release /*String*/ (null);
RDebugUtils.currentLine=20643891;
 //BA.debugLineNum = 20643891;BA.debugLine="RefreshCameras(True)";
_refreshcameras(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
RDebugUtils.currentLine=20643893;
 //BA.debugLineNum = 20643893;BA.debugLine="fx.msgbox(MainForm,\"RequestAuthToken LastExcepti";
parent._fx.Msgbox(parent._mainform,"RequestAuthToken LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),parent._mainform.getTitle());
RDebugUtils.currentLine=20643894;
 //BA.debugLineNum = 20643894;BA.debugLine="Log(\"RequestAuthToken LastException: \" & LastExc";
anywheresoftware.b4a.keywords.Common.Log("RequestAuthToken LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=20643896;
 //BA.debugLineNum = 20643896;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _blur(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "blur", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "blur", new Object[] {_bmp}));}
b4j.example.bitmapcreator _bc = null;
int _reducescale = 0;
int _count = 0;
b4j.example.bitmapcreator._argbcolor[] _clrs = null;
b4j.example.bitmapcreator._argbcolor _temp = null;
int _m = 0;
int _steps = 0;
int _y = 0;
int _x = 0;
RDebugUtils.currentLine=23003136;
 //BA.debugLineNum = 23003136;BA.debugLine="Private Sub Blur (bmp As B4XBitmap) As B4XBitmap";
RDebugUtils.currentLine=23003137;
 //BA.debugLineNum = 23003137;BA.debugLine="Try";
try {RDebugUtils.currentLine=23003138;
 //BA.debugLineNum = 23003138;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=23003139;
 //BA.debugLineNum = 23003139;BA.debugLine="Dim ReduceScale As Int = 2";
_reducescale = (int) (2);
RDebugUtils.currentLine=23003140;
 //BA.debugLineNum = 23003140;BA.debugLine="bc.Initialize(bmp.Width / ReduceScale / bmp.Scal";
_bc._initialize(ba,(int) (_bmp.getWidth()/(double)_reducescale/(double)_bmp.getScale()),(int) (_bmp.getHeight()/(double)_reducescale/(double)_bmp.getScale()));
RDebugUtils.currentLine=23003141;
 //BA.debugLineNum = 23003141;BA.debugLine="bc.CopyPixelsFromBitmap(bmp)";
_bc._copypixelsfrombitmap(_bmp);
RDebugUtils.currentLine=23003142;
 //BA.debugLineNum = 23003142;BA.debugLine="Dim count As Int = 3";
_count = (int) (3);
RDebugUtils.currentLine=23003143;
 //BA.debugLineNum = 23003143;BA.debugLine="Dim clrs(3) As ARGBColor";
_clrs = new b4j.example.bitmapcreator._argbcolor[(int) (3)];
{
int d0 = _clrs.length;
for (int i0 = 0;i0 < d0;i0++) {
_clrs[i0] = new b4j.example.bitmapcreator._argbcolor();
}
}
;
RDebugUtils.currentLine=23003144;
 //BA.debugLineNum = 23003144;BA.debugLine="Dim temp As ARGBColor";
_temp = new b4j.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=23003145;
 //BA.debugLineNum = 23003145;BA.debugLine="Dim m As Int";
_m = 0;
RDebugUtils.currentLine=23003146;
 //BA.debugLineNum = 23003146;BA.debugLine="For steps = 1 To count";
{
final int step10 = 1;
final int limit10 = _count;
_steps = (int) (1) ;
for (;_steps <= limit10 ;_steps = _steps + step10 ) {
RDebugUtils.currentLine=23003147;
 //BA.debugLineNum = 23003147;BA.debugLine="For y = 0 To bc.mHeight - 1";
{
final int step11 = 1;
final int limit11 = (int) (_bc._mheight-1);
_y = (int) (0) ;
for (;_y <= limit11 ;_y = _y + step11 ) {
RDebugUtils.currentLine=23003148;
 //BA.debugLineNum = 23003148;BA.debugLine="For x = 0 To 2";
{
final int step12 = 1;
final int limit12 = (int) (2);
_x = (int) (0) ;
for (;_x <= limit12 ;_x = _x + step12 ) {
RDebugUtils.currentLine=23003149;
 //BA.debugLineNum = 23003149;BA.debugLine="bc.GetARGB(x, y, clrs(x))";
_bc._getargb(_x,_y,_clrs[_x]);
 }
};
RDebugUtils.currentLine=23003151;
 //BA.debugLineNum = 23003151;BA.debugLine="SetAvg(bc, 1, y, clrs, temp)";
_setavg(_bc,(int) (1),_y,_clrs,_temp);
RDebugUtils.currentLine=23003152;
 //BA.debugLineNum = 23003152;BA.debugLine="m = 0";
_m = (int) (0);
RDebugUtils.currentLine=23003153;
 //BA.debugLineNum = 23003153;BA.debugLine="For x = 2 To bc.mWidth - 2";
{
final int step17 = 1;
final int limit17 = (int) (_bc._mwidth-2);
_x = (int) (2) ;
for (;_x <= limit17 ;_x = _x + step17 ) {
RDebugUtils.currentLine=23003154;
 //BA.debugLineNum = 23003154;BA.debugLine="bc.GetARGB(x + 1, y, clrs(m))";
_bc._getargb((int) (_x+1),_y,_clrs[_m]);
RDebugUtils.currentLine=23003155;
 //BA.debugLineNum = 23003155;BA.debugLine="m = (m + 1) Mod clrs.Length";
_m = (int) ((_m+1)%_clrs.length);
RDebugUtils.currentLine=23003156;
 //BA.debugLineNum = 23003156;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
_setavg(_bc,_x,_y,_clrs,_temp);
 }
};
 }
};
RDebugUtils.currentLine=23003159;
 //BA.debugLineNum = 23003159;BA.debugLine="For x = 0 To bc.mWidth - 1";
{
final int step23 = 1;
final int limit23 = (int) (_bc._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit23 ;_x = _x + step23 ) {
RDebugUtils.currentLine=23003160;
 //BA.debugLineNum = 23003160;BA.debugLine="For y = 0 To 2";
{
final int step24 = 1;
final int limit24 = (int) (2);
_y = (int) (0) ;
for (;_y <= limit24 ;_y = _y + step24 ) {
RDebugUtils.currentLine=23003161;
 //BA.debugLineNum = 23003161;BA.debugLine="bc.GetARGB(x, y, clrs(y))";
_bc._getargb(_x,_y,_clrs[_y]);
 }
};
RDebugUtils.currentLine=23003163;
 //BA.debugLineNum = 23003163;BA.debugLine="SetAvg(bc, x, 1, clrs, temp)";
_setavg(_bc,_x,(int) (1),_clrs,_temp);
RDebugUtils.currentLine=23003164;
 //BA.debugLineNum = 23003164;BA.debugLine="m = 0";
_m = (int) (0);
RDebugUtils.currentLine=23003165;
 //BA.debugLineNum = 23003165;BA.debugLine="For y = 2 To bc.mHeight - 2";
{
final int step29 = 1;
final int limit29 = (int) (_bc._mheight-2);
_y = (int) (2) ;
for (;_y <= limit29 ;_y = _y + step29 ) {
RDebugUtils.currentLine=23003166;
 //BA.debugLineNum = 23003166;BA.debugLine="bc.GetARGB(x, y + 1, clrs(m))";
_bc._getargb(_x,(int) (_y+1),_clrs[_m]);
RDebugUtils.currentLine=23003167;
 //BA.debugLineNum = 23003167;BA.debugLine="m = (m + 1) Mod clrs.Length";
_m = (int) ((_m+1)%_clrs.length);
RDebugUtils.currentLine=23003168;
 //BA.debugLineNum = 23003168;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
_setavg(_bc,_x,_y,_clrs,_temp);
 }
};
 }
};
 }
};
 } 
       catch (Exception e37) {
			ba.setLastException(e37);RDebugUtils.currentLine=23003173;
 //BA.debugLineNum = 23003173;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=23003174;
 //BA.debugLineNum = 23003174;BA.debugLine="fx.msgbox(MainForm,\"Blur LastException: \" & Last";
_fx.Msgbox(_mainform,"Blur LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 };
RDebugUtils.currentLine=23003176;
 //BA.debugLineNum = 23003176;BA.debugLine="Return bc.Bitmap";
if (true) return _bc._getbitmap();
RDebugUtils.currentLine=23003177;
 //BA.debugLineNum = 23003177;BA.debugLine="End Sub";
return null;
}
public static String  _setavg(b4j.example.bitmapcreator _bc,int _x,int _y,b4j.example.bitmapcreator._argbcolor[] _clrs,b4j.example.bitmapcreator._argbcolor _temp) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "setavg", false))
	 {return ((String) Debug.delegate(ba, "setavg", new Object[] {_bc,_x,_y,_clrs,_temp}));}
b4j.example.bitmapcreator._argbcolor _c = null;
RDebugUtils.currentLine=23068672;
 //BA.debugLineNum = 23068672;BA.debugLine="Private Sub SetAvg(bc As BitmapCreator, x As Int,";
RDebugUtils.currentLine=23068673;
 //BA.debugLineNum = 23068673;BA.debugLine="Try";
try {RDebugUtils.currentLine=23068674;
 //BA.debugLineNum = 23068674;BA.debugLine="temp.Initialize";
_temp.Initialize();
RDebugUtils.currentLine=23068675;
 //BA.debugLineNum = 23068675;BA.debugLine="For Each c As ARGBColor In clrs";
{
final b4j.example.bitmapcreator._argbcolor[] group3 = _clrs;
final int groupLen3 = group3.length
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_c = group3[index3];
RDebugUtils.currentLine=23068676;
 //BA.debugLineNum = 23068676;BA.debugLine="temp.r = temp.r + c.r";
_temp.r = (int) (_temp.r+_c.r);
RDebugUtils.currentLine=23068677;
 //BA.debugLineNum = 23068677;BA.debugLine="temp.g = temp.g + c.g";
_temp.g = (int) (_temp.g+_c.g);
RDebugUtils.currentLine=23068678;
 //BA.debugLineNum = 23068678;BA.debugLine="temp.b = temp.b + c.b";
_temp.b = (int) (_temp.b+_c.b);
 }
};
RDebugUtils.currentLine=23068680;
 //BA.debugLineNum = 23068680;BA.debugLine="temp.a = 255";
_temp.a = (int) (255);
RDebugUtils.currentLine=23068681;
 //BA.debugLineNum = 23068681;BA.debugLine="temp.r = temp.r / clrs.Length";
_temp.r = (int) (_temp.r/(double)_clrs.length);
RDebugUtils.currentLine=23068682;
 //BA.debugLineNum = 23068682;BA.debugLine="temp.g = temp.g / clrs.Length";
_temp.g = (int) (_temp.g/(double)_clrs.length);
RDebugUtils.currentLine=23068683;
 //BA.debugLineNum = 23068683;BA.debugLine="temp.b = temp.b / clrs.Length";
_temp.b = (int) (_temp.b/(double)_clrs.length);
RDebugUtils.currentLine=23068684;
 //BA.debugLineNum = 23068684;BA.debugLine="bc.SetARGB(x, y, temp)";
_bc._setargb(_x,_y,_temp);
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=23068686;
 //BA.debugLineNum = 23068686;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=23068687;
 //BA.debugLineNum = 23068687;BA.debugLine="fx.msgbox(MainForm,\"SetAvg LastException: \" & La";
_fx.Msgbox(_mainform,"SetAvg LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 };
RDebugUtils.currentLine=23068689;
 //BA.debugLineNum = 23068689;BA.debugLine="End Sub";
return "";
}
public static String  _bluriv(String _image,anywheresoftware.b4j.objects.ImageViewWrapper _iv) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "bluriv", false))
	 {return ((String) Debug.delegate(ba, "bluriv", new Object[] {_image,_iv}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
RDebugUtils.currentLine=22937600;
 //BA.debugLineNum = 22937600;BA.debugLine="Sub BlurIV (image As String,iv As ImageView)";
RDebugUtils.currentLine=22937601;
 //BA.debugLineNum = 22937601;BA.debugLine="Try";
try {RDebugUtils.currentLine=22937602;
 //BA.debugLineNum = 22937602;BA.debugLine="Dim bmp As B4XBitmap = xui.LoadBitmapResize(File";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _xui.LoadBitmapResize(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_image,(int) (_iv.getWidth()),(int) (_iv.getHeight()),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=22937603;
 //BA.debugLineNum = 22937603;BA.debugLine="iv.SetImage(Blur(bmp))";
_iv.SetImage((javafx.scene.image.Image)(_blur(_bmp).getObject()));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=22937605;
 //BA.debugLineNum = 22937605;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=22937606;
 //BA.debugLineNum = 22937606;BA.debugLine="fx.msgbox(MainForm,\"BlurIV LastException: \" & La";
_fx.Msgbox(_mainform,"BlurIV LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 };
RDebugUtils.currentLine=22937608;
 //BA.debugLineNum = 22937608;BA.debugLine="End Sub";
return "";
}
public static void  _btnactivity_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnactivity_click", false))
	 {Debug.delegate(ba, "btnactivity_click", null); return;}
ResumableSub_btnActivity_Click rsub = new ResumableSub_btnActivity_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnActivity_Click extends BA.ResumableSub {
public ResumableSub_btnActivity_Click(cloyd.blink.main parent) {
this.parent = parent;
}
cloyd.blink.main parent;
cloyd.blink.frmactivity _mf = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=23134209;
 //BA.debugLineNum = 23134209;BA.debugLine="btnDriveway.Enabled = False";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23134210;
 //BA.debugLineNum = 23134210;BA.debugLine="btnRefresh.Enabled = False";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23134211;
 //BA.debugLineNum = 23134211;BA.debugLine="btnActivity.Enabled = False";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23134213;
 //BA.debugLineNum = 23134213;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia-s";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/api/v1/accounts/88438/media/changed?since=-999999999-01-01T00:00:00+18:00&page=1");
RDebugUtils.currentLine=23134215;
 //BA.debugLineNum = 23134215;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btnactivity_click"),(int) (1000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=23134217;
 //BA.debugLineNum = 23134217;BA.debugLine="Dim mf As frmActivity";
_mf = new cloyd.blink.frmactivity();
RDebugUtils.currentLine=23134218;
 //BA.debugLineNum = 23134218;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (null,ba,parent._mainform);
RDebugUtils.currentLine=23134219;
 //BA.debugLineNum = 23134219;BA.debugLine="mf.authToken = authToken";
_mf._authtoken /*String*/  = parent._authtoken;
RDebugUtils.currentLine=23134220;
 //BA.debugLineNum = 23134220;BA.debugLine="mf.Show(response,userRegion)";
_mf._show /*String*/ (null,parent._response,parent._userregion);
RDebugUtils.currentLine=23134221;
 //BA.debugLineNum = 23134221;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23134222;
 //BA.debugLineNum = 23134222;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23134223;
 //BA.debugLineNum = 23134223;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23134224;
 //BA.debugLineNum = 23134224;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _restget(String _url) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "restget", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "restget", new Object[] {_url}));}
ResumableSub_RESTGet rsub = new ResumableSub_RESTGet(null,_url);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RESTGet extends BA.ResumableSub {
public ResumableSub_RESTGet(cloyd.blink.main parent,String _url) {
this.parent = parent;
this._url = _url;
}
cloyd.blink.main parent;
String _url;
cloyd.blink.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=20774913;
 //BA.debugLineNum = 20774913;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 15;
this.catchState = 14;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 14;
RDebugUtils.currentLine=20774914;
 //BA.debugLineNum = 20774914;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
RDebugUtils.currentLine=20774915;
 //BA.debugLineNum = 20774915;BA.debugLine="response = \"\"";
parent._response = "";
RDebugUtils.currentLine=20774916;
 //BA.debugLineNum = 20774916;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no";
_j._initialize /*String*/ (null,ba,"",main.getObject());
RDebugUtils.currentLine=20774917;
 //BA.debugLineNum = 20774917;BA.debugLine="j.Download(url)";
_j._download /*String*/ (null,_url);
RDebugUtils.currentLine=20774918;
 //BA.debugLineNum = 20774918;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("TOKEN_AUTH",parent._authtoken);
RDebugUtils.currentLine=20774919;
 //BA.debugLineNum = 20774919;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "restget"), (Object)(_j));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[0];
;
RDebugUtils.currentLine=20774920;
 //BA.debugLineNum = 20774920;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=20774921;
 //BA.debugLineNum = 20774921;BA.debugLine="response = j.GetString";
parent._response = _j._getstring /*String*/ (null);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=20774923;
 //BA.debugLineNum = 20774923;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
parent._response = "ERROR: "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=20774924;
 //BA.debugLineNum = 20774924;BA.debugLine="lblStatus.Text = GetRESTError(j.ErrorMessage)";
parent._lblstatus.setText(_getresterror(_j._errormessage /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=20774926;
 //BA.debugLineNum = 20774926;BA.debugLine="If response.Contains(\"System is busy, please wai";

case 9:
//if
this.state = 12;
if (parent._response.contains("System is busy, please wait")) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=20774927;
 //BA.debugLineNum = 20774927;BA.debugLine="lblStatus.Text = \"System is busy, please wait\"";
parent._lblstatus.setText("System is busy, please wait");
 if (true) break;

case 12:
//C
this.state = 15;
;
RDebugUtils.currentLine=20774929;
 //BA.debugLineNum = 20774929;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
RDebugUtils.currentLine=20774931;
 //BA.debugLineNum = 20774931;BA.debugLine="response = \"ERROR: \" & LastException";
parent._response = "ERROR: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba));
RDebugUtils.currentLine=20774932;
 //BA.debugLineNum = 20774932;BA.debugLine="Log(\"RESTGet LastException: \" & LastException)";
anywheresoftware.b4a.keywords.Common.Log("RESTGet LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=20774933;
 //BA.debugLineNum = 20774933;BA.debugLine="fx.msgbox(MainForm,\"RESTGet LastException: \" & L";
parent._fx.Msgbox(parent._mainform,"RESTGet LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),parent._mainform.getTitle());
 if (true) break;
if (true) break;

case 15:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=20774935;
 //BA.debugLineNum = 20774935;BA.debugLine="Log(\"URL: \" & url)";
anywheresoftware.b4a.keywords.Common.Log("URL: "+_url);
RDebugUtils.currentLine=20774936;
 //BA.debugLineNum = 20774936;BA.debugLine="Log(\"Response: \" & response)";
anywheresoftware.b4a.keywords.Common.Log("Response: "+parent._response);
RDebugUtils.currentLine=20774937;
 //BA.debugLineNum = 20774937;BA.debugLine="Return(response)";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)((parent._response)));return;};
RDebugUtils.currentLine=20774938;
 //BA.debugLineNum = 20774938;BA.debugLine="End Sub";
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
public static String  _btndriveway_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btndriveway_click", false))
	 {return ((String) Debug.delegate(ba, "btndriveway_click", null));}
RDebugUtils.currentLine=20578304;
 //BA.debugLineNum = 20578304;BA.debugLine="Sub btnDriveway_Click";
RDebugUtils.currentLine=20578305;
 //BA.debugLineNum = 20578305;BA.debugLine="clvDriveway.Clear";
_clvdriveway._clear();
RDebugUtils.currentLine=20578306;
 //BA.debugLineNum = 20578306;BA.debugLine="clvFrontDoor.Clear";
_clvfrontdoor._clear();
RDebugUtils.currentLine=20578307;
 //BA.debugLineNum = 20578307;BA.debugLine="clvSideYard.Clear";
_clvsideyard._clear();
RDebugUtils.currentLine=20578308;
 //BA.debugLineNum = 20578308;BA.debugLine="btnDriveway.Enabled = False";
_btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20578309;
 //BA.debugLineNum = 20578309;BA.debugLine="btnRefresh.Enabled = False";
_btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20578310;
 //BA.debugLineNum = 20578310;BA.debugLine="btnActivity.Enabled = False";
_btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20578311;
 //BA.debugLineNum = 20578311;BA.debugLine="RefreshCameras(False)";
_refreshcameras(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=20578312;
 //BA.debugLineNum = 20578312;BA.debugLine="End Sub";
return "";
}
public static void  _refreshcameras(boolean _firstrun) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "refreshcameras", false))
	 {Debug.delegate(ba, "refreshcameras", new Object[] {_firstrun}); return;}
ResumableSub_RefreshCameras rsub = new ResumableSub_RefreshCameras(null,_firstrun);
rsub.resume(ba, null);
}
public static class ResumableSub_RefreshCameras extends BA.ResumableSub {
public ResumableSub_RefreshCameras(cloyd.blink.main parent,boolean _firstrun) {
this.parent = parent;
this._firstrun = _firstrun;
}
cloyd.blink.main parent;
boolean _firstrun;
String _camera = "";
anywheresoftware.b4j.objects.ImageViewWrapper _iv = null;
b4j.example.customlistview _clv = null;
anywheresoftware.b4a.objects.collections.List _links = null;
int _attempts = 0;
String _link = "";
int _i = 0;
anywheresoftware.b4a.BA.IterableList group16;
int index16;
int groupLen16;
int step73;
int limit73;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=20709377;
 //BA.debugLineNum = 20709377;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 87;
this.catchState = 86;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 86;
RDebugUtils.currentLine=20709378;
 //BA.debugLineNum = 20709378;BA.debugLine="Dim camera As String";
_camera = "";
RDebugUtils.currentLine=20709379;
 //BA.debugLineNum = 20709379;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=20709380;
 //BA.debugLineNum = 20709380;BA.debugLine="Dim clv As CustomListView";
_clv = new b4j.example.customlistview();
RDebugUtils.currentLine=20709381;
 //BA.debugLineNum = 20709381;BA.debugLine="Dim links As List";
_links = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=20709382;
 //BA.debugLineNum = 20709382;BA.debugLine="Dim attempts As Int";
_attempts = 0;
RDebugUtils.currentLine=20709383;
 //BA.debugLineNum = 20709383;BA.debugLine="links = Array(\"347574\", \"236967\", \"226821\")";
_links = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("347574"),(Object)("236967"),(Object)("226821")});
RDebugUtils.currentLine=20709385;
 //BA.debugLineNum = 20709385;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia-";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/syncmodules");
RDebugUtils.currentLine=20709386;
 //BA.debugLineNum = 20709386;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"),(int) (1000));
this.state = 88;
return;
case 88:
//C
this.state = 4;
;
RDebugUtils.currentLine=20709388;
 //BA.debugLineNum = 20709388;BA.debugLine="GetSyncModuleInfo(response)";
_getsyncmoduleinfo(parent._response);
RDebugUtils.currentLine=20709390;
 //BA.debugLineNum = 20709390;BA.debugLine="If FirstRun= False Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_firstrun==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=20709391;
 //BA.debugLineNum = 20709391;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
_bluriv("Driveway.jpg",parent._ivdriveway);
RDebugUtils.currentLine=20709392;
 //BA.debugLineNum = 20709392;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
_bluriv("FrontDoor.jpg",parent._ivfrontdoor);
RDebugUtils.currentLine=20709393;
 //BA.debugLineNum = 20709393;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
_bluriv("SideYard.jpg",parent._ivsideyard);
 if (true) break;
;
RDebugUtils.currentLine=20709396;
 //BA.debugLineNum = 20709396;BA.debugLine="For Each link As String In links";

case 7:
//for
this.state = 84;
group16 = _links;
index16 = 0;
groupLen16 = group16.getSize();
this.state = 89;
if (true) break;

case 89:
//C
this.state = 84;
if (index16 < groupLen16) {
this.state = 9;
_link = BA.ObjectToString(group16.Get(index16));}
if (true) break;

case 90:
//C
this.state = 89;
index16++;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=20709397;
 //BA.debugLineNum = 20709397;BA.debugLine="camera = link";
_camera = _link;
RDebugUtils.currentLine=20709399;
 //BA.debugLineNum = 20709399;BA.debugLine="If FirstRun Then";
if (true) break;

case 10:
//if
this.state = 31;
if (_firstrun) { 
this.state = 12;
}else {
this.state = 22;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=20709400;
 //BA.debugLineNum = 20709400;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 13:
//if
this.state = 20;
if ((_camera).equals("347574")) { 
this.state = 15;
}else 
{RDebugUtils.currentLine=20709404;
 //BA.debugLineNum = 20709404;BA.debugLine="Else If camera = \"236967\" Then";
if ((_camera).equals("236967")) { 
this.state = 17;
}else 
{RDebugUtils.currentLine=20709408;
 //BA.debugLineNum = 20709408;BA.debugLine="Else If camera = \"226821\" Then";
if ((_camera).equals("226821")) { 
this.state = 19;
}}}
if (true) break;

case 15:
//C
this.state = 20;
RDebugUtils.currentLine=20709401;
 //BA.debugLineNum = 20709401;BA.debugLine="lblStatus.Text = \"Retrieving Driveway thumbna";
parent._lblstatus.setText("Retrieving Driveway thumbnail...");
RDebugUtils.currentLine=20709402;
 //BA.debugLineNum = 20709402;BA.debugLine="iv = ivDriveway";
_iv = parent._ivdriveway;
RDebugUtils.currentLine=20709403;
 //BA.debugLineNum = 20709403;BA.debugLine="clv = clvDriveway";
_clv = parent._clvdriveway;
 if (true) break;

case 17:
//C
this.state = 20;
RDebugUtils.currentLine=20709405;
 //BA.debugLineNum = 20709405;BA.debugLine="lblStatus.Text = \"Retrieving Front Door thumb";
parent._lblstatus.setText("Retrieving Front Door thumbnail...");
RDebugUtils.currentLine=20709406;
 //BA.debugLineNum = 20709406;BA.debugLine="iv = ivFrontDoor";
_iv = parent._ivfrontdoor;
RDebugUtils.currentLine=20709407;
 //BA.debugLineNum = 20709407;BA.debugLine="clv = clvFrontDoor";
_clv = parent._clvfrontdoor;
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=20709409;
 //BA.debugLineNum = 20709409;BA.debugLine="lblStatus.Text = \"Retrieving Side Yard thumbn";
parent._lblstatus.setText("Retrieving Side Yard thumbnail...");
RDebugUtils.currentLine=20709410;
 //BA.debugLineNum = 20709410;BA.debugLine="iv = ivSideYard";
_iv = parent._ivsideyard;
RDebugUtils.currentLine=20709411;
 //BA.debugLineNum = 20709411;BA.debugLine="clv = clvSideYard";
_clv = parent._clvsideyard;
 if (true) break;

case 20:
//C
this.state = 31;
;
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=20709414;
 //BA.debugLineNum = 20709414;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 23:
//if
this.state = 30;
if ((_camera).equals("347574")) { 
this.state = 25;
}else 
{RDebugUtils.currentLine=20709419;
 //BA.debugLineNum = 20709419;BA.debugLine="Else If camera = \"236967\" Then";
if ((_camera).equals("236967")) { 
this.state = 27;
}else 
{RDebugUtils.currentLine=20709424;
 //BA.debugLineNum = 20709424;BA.debugLine="Else If camera = \"226821\" Then";
if ((_camera).equals("226821")) { 
this.state = 29;
}}}
if (true) break;

case 25:
//C
this.state = 30;
RDebugUtils.currentLine=20709415;
 //BA.debugLineNum = 20709415;BA.debugLine="lblStatus.Text = \"Capturing a new Driveway th";
parent._lblstatus.setText("Capturing a new Driveway thumbnail...");
RDebugUtils.currentLine=20709416;
 //BA.debugLineNum = 20709416;BA.debugLine="iv = ivDriveway";
_iv = parent._ivdriveway;
RDebugUtils.currentLine=20709417;
 //BA.debugLineNum = 20709417;BA.debugLine="clv = clvDriveway";
_clv = parent._clvdriveway;
RDebugUtils.currentLine=20709418;
 //BA.debugLineNum = 20709418;BA.debugLine="attempts = 10";
_attempts = (int) (10);
 if (true) break;

case 27:
//C
this.state = 30;
RDebugUtils.currentLine=20709420;
 //BA.debugLineNum = 20709420;BA.debugLine="lblStatus.Text = \"Capturing a new Front Door";
parent._lblstatus.setText("Capturing a new Front Door thumbnail...");
RDebugUtils.currentLine=20709421;
 //BA.debugLineNum = 20709421;BA.debugLine="iv = ivFrontDoor";
_iv = parent._ivfrontdoor;
RDebugUtils.currentLine=20709422;
 //BA.debugLineNum = 20709422;BA.debugLine="clv = clvFrontDoor";
_clv = parent._clvfrontdoor;
RDebugUtils.currentLine=20709423;
 //BA.debugLineNum = 20709423;BA.debugLine="attempts = 15";
_attempts = (int) (15);
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=20709425;
 //BA.debugLineNum = 20709425;BA.debugLine="lblStatus.Text = \"Capturing a new Side Yard t";
parent._lblstatus.setText("Capturing a new Side Yard thumbnail...");
RDebugUtils.currentLine=20709426;
 //BA.debugLineNum = 20709426;BA.debugLine="iv = ivSideYard";
_iv = parent._ivsideyard;
RDebugUtils.currentLine=20709427;
 //BA.debugLineNum = 20709427;BA.debugLine="clv = clvSideYard";
_clv = parent._clvsideyard;
RDebugUtils.currentLine=20709428;
 //BA.debugLineNum = 20709428;BA.debugLine="attempts = 15";
_attempts = (int) (15);
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;
;
RDebugUtils.currentLine=20709432;
 //BA.debugLineNum = 20709432;BA.debugLine="If FirstRun Then";

case 31:
//if
this.state = 83;
if (_firstrun) { 
this.state = 33;
}else {
this.state = 35;
}if (true) break;

case 33:
//C
this.state = 83;
RDebugUtils.currentLine=20709433;
 //BA.debugLineNum = 20709433;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedi";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera);
RDebugUtils.currentLine=20709434;
 //BA.debugLineNum = 20709434;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"),(int) (1000));
this.state = 91;
return;
case 91:
//C
this.state = 83;
;
RDebugUtils.currentLine=20709436;
 //BA.debugLineNum = 20709436;BA.debugLine="GetCameraInfo(response,clv)";
_getcamerainfo(parent._response,_clv);
RDebugUtils.currentLine=20709437;
 //BA.debugLineNum = 20709437;BA.debugLine="DownloadImage(\"https://rest-\" & userRegion &\".";
_downloadimage("https://rest-"+parent._userregion+".immedia-semi.com/"+parent._camerathumbnail+".jpg",_iv,_camera);
 if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=20709439;
 //BA.debugLineNum = 20709439;BA.debugLine="RESTPost(\"https://rest-\" & userRegion &\".immed";
_restpost("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera+"/thumbnail");
RDebugUtils.currentLine=20709440;
 //BA.debugLineNum = 20709440;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"),(int) (1000));
this.state = 92;
return;
case 92:
//C
this.state = 36;
;
RDebugUtils.currentLine=20709442;
 //BA.debugLineNum = 20709442;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.";
if (true) break;

case 36:
//if
this.state = 82;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 38;
}else {
this.state = 40;
}if (true) break;

case 38:
//C
this.state = 82;
RDebugUtils.currentLine=20709443;
 //BA.debugLineNum = 20709443;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20709444;
 //BA.debugLineNum = 20709444;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20709445;
 //BA.debugLineNum = 20709445;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20709446;
 //BA.debugLineNum = 20709446;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=20709448;
 //BA.debugLineNum = 20709448;BA.debugLine="GetCommandID(response)";
_getcommandid(parent._response);
RDebugUtils.currentLine=20709449;
 //BA.debugLineNum = 20709449;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immed";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
RDebugUtils.currentLine=20709450;
 //BA.debugLineNum = 20709450;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"),(int) (1000));
this.state = 93;
return;
case 93:
//C
this.state = 41;
;
RDebugUtils.currentLine=20709452;
 //BA.debugLineNum = 20709452;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response";
if (true) break;

case 41:
//if
this.state = 81;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 43;
}else {
this.state = 45;
}if (true) break;

case 43:
//C
this.state = 81;
RDebugUtils.currentLine=20709453;
 //BA.debugLineNum = 20709453;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20709454;
 //BA.debugLineNum = 20709454;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20709455;
 //BA.debugLineNum = 20709455;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20709456;
 //BA.debugLineNum = 20709456;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=20709458;
 //BA.debugLineNum = 20709458;BA.debugLine="For i = 1 To attempts";
if (true) break;

case 46:
//for
this.state = 67;
step73 = 1;
limit73 = _attempts;
_i = (int) (1) ;
this.state = 94;
if (true) break;

case 94:
//C
this.state = 67;
if ((step73 > 0 && _i <= limit73) || (step73 < 0 && _i >= limit73)) this.state = 48;
if (true) break;

case 95:
//C
this.state = 94;
_i = ((int)(0 + _i + step73)) ;
if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=20709459;
 //BA.debugLineNum = 20709459;BA.debugLine="GetCommandStatus(response)";
_getcommandstatus(parent._response);
RDebugUtils.currentLine=20709460;
 //BA.debugLineNum = 20709460;BA.debugLine="If commandComplete Then";
if (true) break;

case 49:
//if
this.state = 62;
if (parent._commandcomplete) { 
this.state = 51;
}else {
this.state = 53;
}if (true) break;

case 51:
//C
this.state = 62;
RDebugUtils.currentLine=20709461;
 //BA.debugLineNum = 20709461;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".im";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera);
RDebugUtils.currentLine=20709462;
 //BA.debugLineNum = 20709462;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"),(int) (1000));
this.state = 96;
return;
case 96:
//C
this.state = 62;
;
RDebugUtils.currentLine=20709464;
 //BA.debugLineNum = 20709464;BA.debugLine="GetCameraInfo(response,clv)";
_getcamerainfo(parent._response,_clv);
RDebugUtils.currentLine=20709465;
 //BA.debugLineNum = 20709465;BA.debugLine="DownloadImage(\"https://rest-\" & userRegion";
_downloadimage("https://rest-"+parent._userregion+".immedia-semi.com/"+parent._camerathumbnail+".jpg",_iv,_camera);
RDebugUtils.currentLine=20709467;
 //BA.debugLineNum = 20709467;BA.debugLine="Exit";
this.state = 67;
if (true) break;
 if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=20709469;
 //BA.debugLineNum = 20709469;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 54:
//if
this.state = 61;
if ((_camera).equals("347574")) { 
this.state = 56;
}else 
{RDebugUtils.currentLine=20709471;
 //BA.debugLineNum = 20709471;BA.debugLine="Else If camera = \"236967\" Then";
if ((_camera).equals("236967")) { 
this.state = 58;
}else 
{RDebugUtils.currentLine=20709473;
 //BA.debugLineNum = 20709473;BA.debugLine="Else If camera = \"226821\" Then";
if ((_camera).equals("226821")) { 
this.state = 60;
}}}
if (true) break;

case 56:
//C
this.state = 61;
RDebugUtils.currentLine=20709470;
 //BA.debugLineNum = 20709470;BA.debugLine="lblStatus.Text = \"Awaiting for the Drivew";
parent._lblstatus.setText("Awaiting for the Driveway thumbnail... "+BA.NumberToString(_i)+"/"+BA.NumberToString(_attempts));
 if (true) break;

case 58:
//C
this.state = 61;
RDebugUtils.currentLine=20709472;
 //BA.debugLineNum = 20709472;BA.debugLine="lblStatus.Text = \"Awaiting for the Front";
parent._lblstatus.setText("Awaiting for the Front Door thumbnail...  "+BA.NumberToString(_i)+"/"+BA.NumberToString(_attempts));
 if (true) break;

case 60:
//C
this.state = 61;
RDebugUtils.currentLine=20709474;
 //BA.debugLineNum = 20709474;BA.debugLine="lblStatus.Text = \"Awaiting for the Side Y";
parent._lblstatus.setText("Awaiting for the Side Yard thumbnail... "+BA.NumberToString(_i)+"/"+BA.NumberToString(_attempts));
 if (true) break;

case 61:
//C
this.state = 62;
;
 if (true) break;

case 62:
//C
this.state = 63;
;
RDebugUtils.currentLine=20709477;
 //BA.debugLineNum = 20709477;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".imm";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
RDebugUtils.currentLine=20709478;
 //BA.debugLineNum = 20709478;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"),(int) (1000));
this.state = 97;
return;
case 97:
//C
this.state = 63;
;
RDebugUtils.currentLine=20709479;
 //BA.debugLineNum = 20709479;BA.debugLine="If response.StartsWith(\"ERROR: \") Or respon";
if (true) break;

case 63:
//if
this.state = 66;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=20709480;
 //BA.debugLineNum = 20709480;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20709481;
 //BA.debugLineNum = 20709481;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20709482;
 //BA.debugLineNum = 20709482;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20709483;
 //BA.debugLineNum = 20709483;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 66:
//C
this.state = 95;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=20709486;
 //BA.debugLineNum = 20709486;BA.debugLine="If commandComplete = False Then";

case 67:
//if
this.state = 80;
if (parent._commandcomplete==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 69;
}else {
this.state = 79;
}if (true) break;

case 69:
//C
this.state = 70;
RDebugUtils.currentLine=20709487;
 //BA.debugLineNum = 20709487;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 70:
//if
this.state = 77;
if ((_camera).equals("347574")) { 
this.state = 72;
}else 
{RDebugUtils.currentLine=20709489;
 //BA.debugLineNum = 20709489;BA.debugLine="Else If camera = \"236967\" Then";
if ((_camera).equals("236967")) { 
this.state = 74;
}else 
{RDebugUtils.currentLine=20709491;
 //BA.debugLineNum = 20709491;BA.debugLine="Else If camera = \"226821\" Then";
if ((_camera).equals("226821")) { 
this.state = 76;
}}}
if (true) break;

case 72:
//C
this.state = 77;
RDebugUtils.currentLine=20709488;
 //BA.debugLineNum = 20709488;BA.debugLine="lblStatus.Text = \"Failed to retrieve Drive";
parent._lblstatus.setText("Failed to retrieve Driveway thumbnail...");
 if (true) break;

case 74:
//C
this.state = 77;
RDebugUtils.currentLine=20709490;
 //BA.debugLineNum = 20709490;BA.debugLine="lblStatus.Text = \"Failed to retrieve Front";
parent._lblstatus.setText("Failed to retrieve Front Door thumbnail...");
 if (true) break;

case 76:
//C
this.state = 77;
RDebugUtils.currentLine=20709492;
 //BA.debugLineNum = 20709492;BA.debugLine="lblStatus.Text = \"Failed to retrieve Side";
parent._lblstatus.setText("Failed to retrieve Side Yard thumbnail...");
 if (true) break;

case 77:
//C
this.state = 80;
;
 if (true) break;

case 79:
//C
this.state = 80;
 if (true) break;

case 80:
//C
this.state = 81;
;
 if (true) break;

case 81:
//C
this.state = 82;
;
 if (true) break;

case 82:
//C
this.state = 83;
;
 if (true) break;

case 83:
//C
this.state = 90;
;
 if (true) break;
if (true) break;

case 84:
//C
this.state = 87;
;
RDebugUtils.currentLine=20709504;
 //BA.debugLineNum = 20709504;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
 if (true) break;

case 86:
//C
this.state = 87;
this.catchState = 0;
RDebugUtils.currentLine=20709506;
 //BA.debugLineNum = 20709506;BA.debugLine="response = \"ERROR: \" & LastException";
parent._response = "ERROR: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba));
RDebugUtils.currentLine=20709507;
 //BA.debugLineNum = 20709507;BA.debugLine="Log(\"RefreshCamera LastException: \" & LastExcept";
anywheresoftware.b4a.keywords.Common.Log("RefreshCamera LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=20709508;
 //BA.debugLineNum = 20709508;BA.debugLine="fx.msgbox(MainForm,\"RefreshCamera LastException:";
parent._fx.Msgbox(parent._mainform,"RefreshCamera LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),parent._mainform.getTitle());
 if (true) break;
if (true) break;

case 87:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=20709510;
 //BA.debugLineNum = 20709510;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20709511;
 //BA.debugLineNum = 20709511;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20709512;
 //BA.debugLineNum = 20709512;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=20709513;
 //BA.debugLineNum = 20709513;BA.debugLine="End Sub";
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
public static String  _btnrefresh_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnrefresh_click", false))
	 {return ((String) Debug.delegate(ba, "btnrefresh_click", null));}
RDebugUtils.currentLine=23461888;
 //BA.debugLineNum = 23461888;BA.debugLine="Sub btnRefresh_Click";
RDebugUtils.currentLine=23461889;
 //BA.debugLineNum = 23461889;BA.debugLine="btnDriveway.Enabled = False";
_btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23461890;
 //BA.debugLineNum = 23461890;BA.debugLine="btnRefresh.Enabled = False";
_btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23461891;
 //BA.debugLineNum = 23461891;BA.debugLine="btnActivity.Enabled = False";
_btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23461892;
 //BA.debugLineNum = 23461892;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
_bluriv("Driveway.jpg",_ivdriveway);
RDebugUtils.currentLine=23461893;
 //BA.debugLineNum = 23461893;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
_bluriv("FrontDoor.jpg",_ivfrontdoor);
RDebugUtils.currentLine=23461894;
 //BA.debugLineNum = 23461894;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
_bluriv("SideYard.jpg",_ivsideyard);
RDebugUtils.currentLine=23461895;
 //BA.debugLineNum = 23461895;BA.debugLine="RefreshCameras(True)";
_refreshcameras(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23461896;
 //BA.debugLineNum = 23461896;BA.debugLine="End Sub";
return "";
}
public static String  _checkbattlife(int _battlevel) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "checkbattlife", false))
	 {return ((String) Debug.delegate(ba, "checkbattlife", new Object[] {_battlevel}));}
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Sub CheckBattLife(battlevel As Int) As String";
RDebugUtils.currentLine=21495809;
 //BA.debugLineNum = 21495809;BA.debugLine="Try";
try {RDebugUtils.currentLine=21495811;
 //BA.debugLineNum = 21495811;BA.debugLine="If battlevel <= 136 Then";
if (_battlevel<=136) { 
RDebugUtils.currentLine=21495812;
 //BA.debugLineNum = 21495812;BA.debugLine="Return \"Replace battery now!\"";
if (true) return "Replace battery now!";
 }else 
{RDebugUtils.currentLine=21495813;
 //BA.debugLineNum = 21495813;BA.debugLine="else If battlevel >= 160 Then";
if (_battlevel>=160) { 
RDebugUtils.currentLine=21495814;
 //BA.debugLineNum = 21495814;BA.debugLine="Return \"Very high\"";
if (true) return "Very high";
 }else 
{RDebugUtils.currentLine=21495815;
 //BA.debugLineNum = 21495815;BA.debugLine="else If battlevel > 136 And battlevel < 138 Then";
if (_battlevel>136 && _battlevel<138) { 
RDebugUtils.currentLine=21495816;
 //BA.debugLineNum = 21495816;BA.debugLine="Return \"Very low\"";
if (true) return "Very low";
 }else {
RDebugUtils.currentLine=21495818;
 //BA.debugLineNum = 21495818;BA.debugLine="Return \"High\"";
if (true) return "High";
 }}}
;
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=21495821;
 //BA.debugLineNum = 21495821;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=21495822;
 //BA.debugLineNum = 21495822;BA.debugLine="fx.msgbox(MainForm,\"CheckBattLife LastException:";
_fx.Msgbox(_mainform,"CheckBattLife LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
RDebugUtils.currentLine=21495823;
 //BA.debugLineNum = 21495823;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=21495825;
 //BA.debugLineNum = 21495825;BA.debugLine="End Sub";
return "";
}
public static String  _checklfrlevel(int _lfrlevel) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "checklfrlevel", false))
	 {return ((String) Debug.delegate(ba, "checklfrlevel", new Object[] {_lfrlevel}));}
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Sub CheckLFRLevel(lfrlevel As Int) As String";
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="Try";
try {RDebugUtils.currentLine=21561347;
 //BA.debugLineNum = 21561347;BA.debugLine="If lfrlevel > -67 Then";
if (_lfrlevel>-67) { 
RDebugUtils.currentLine=21561348;
 //BA.debugLineNum = 21561348;BA.debugLine="Return \"Amazing\"";
if (true) return "Amazing";
 }else 
{RDebugUtils.currentLine=21561349;
 //BA.debugLineNum = 21561349;BA.debugLine="else If lfrlevel > -70 And lfrlevel <= -67 Then";
if (_lfrlevel>-70 && _lfrlevel<=-67) { 
RDebugUtils.currentLine=21561350;
 //BA.debugLineNum = 21561350;BA.debugLine="Return \"Very good\"";
if (true) return "Very good";
 }else 
{RDebugUtils.currentLine=21561351;
 //BA.debugLineNum = 21561351;BA.debugLine="else If lfrlevel > -80 And lfrlevel <= -70 Then";
if (_lfrlevel>-80 && _lfrlevel<=-70) { 
RDebugUtils.currentLine=21561352;
 //BA.debugLineNum = 21561352;BA.debugLine="Return \"OK\"";
if (true) return "OK";
 }else 
{RDebugUtils.currentLine=21561353;
 //BA.debugLineNum = 21561353;BA.debugLine="else If lfrlevel > -90 And lfrlevel <= -80 Then";
if (_lfrlevel>-90 && _lfrlevel<=-80) { 
RDebugUtils.currentLine=21561354;
 //BA.debugLineNum = 21561354;BA.debugLine="Return \"Not Good\"";
if (true) return "Not Good";
 }else {
RDebugUtils.currentLine=21561356;
 //BA.debugLineNum = 21561356;BA.debugLine="Return \"Unusable\"";
if (true) return "Unusable";
 }}}}
;
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=21561359;
 //BA.debugLineNum = 21561359;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=21561360;
 //BA.debugLineNum = 21561360;BA.debugLine="fx.msgbox(MainForm,\"CheckLFRLevel LastException:";
_fx.Msgbox(_mainform,"CheckLFRLevel LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
RDebugUtils.currentLine=21561361;
 //BA.debugLineNum = 21561361;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=21561363;
 //BA.debugLineNum = 21561363;BA.debugLine="End Sub";
return "";
}
public static String  _close_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "close_entered_event", false))
	 {return ((String) Debug.delegate(ba, "close_entered_event", new Object[] {_e}));}
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Private Sub Close_Entered_Event(e As Event)";
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="Try";
try {RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
_ivclose.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btCloseEnt.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=21823492;
 //BA.debugLineNum = 21823492;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=21823494;
 //BA.debugLineNum = 21823494;BA.debugLine="End Sub";
return "";
}
public static String  _close_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "close_exited_event", false))
	 {return ((String) Debug.delegate(ba, "close_exited_event", new Object[] {_e}));}
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Private Sub Close_Exited_Event(e As Event)";
RDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="Try";
try {RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
_ivclose.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btClose.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=21889028;
 //BA.debugLineNum = 21889028;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=21889030;
 //BA.debugLineNum = 21889030;BA.debugLine="End Sub";
return "";
}
public static String  _clvdriveway_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "clvdriveway_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvdriveway_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=22609920;
 //BA.debugLineNum = 22609920;BA.debugLine="Sub clvDriveway_ItemClick (Index As Int, Value As";
RDebugUtils.currentLine=22609921;
 //BA.debugLineNum = 22609921;BA.debugLine="Try";
try {RDebugUtils.currentLine=22609922;
 //BA.debugLineNum = 22609922;BA.debugLine="clvDriveway.JumpToItem(Index)";
_clvdriveway._jumptoitem(_index);
RDebugUtils.currentLine=22609923;
 //BA.debugLineNum = 22609923;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
_clvfrontdoor._jumptoitem(_index);
RDebugUtils.currentLine=22609924;
 //BA.debugLineNum = 22609924;BA.debugLine="clvSideYard.JumpToItem(Index)";
_clvsideyard._jumptoitem(_index);
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=22609926;
 //BA.debugLineNum = 22609926;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=22609928;
 //BA.debugLineNum = 22609928;BA.debugLine="End Sub";
return "";
}
public static String  _clvfrontdoor_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "clvfrontdoor_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvfrontdoor_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=22544384;
 //BA.debugLineNum = 22544384;BA.debugLine="Sub clvFrontDoor_ItemClick (Index As Int, Value As";
RDebugUtils.currentLine=22544385;
 //BA.debugLineNum = 22544385;BA.debugLine="Try";
try {RDebugUtils.currentLine=22544386;
 //BA.debugLineNum = 22544386;BA.debugLine="clvDriveway.JumpToItem(Index)";
_clvdriveway._jumptoitem(_index);
RDebugUtils.currentLine=22544387;
 //BA.debugLineNum = 22544387;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
_clvfrontdoor._jumptoitem(_index);
RDebugUtils.currentLine=22544388;
 //BA.debugLineNum = 22544388;BA.debugLine="clvSideYard.JumpToItem(Index)";
_clvsideyard._jumptoitem(_index);
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=22544390;
 //BA.debugLineNum = 22544390;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=22544392;
 //BA.debugLineNum = 22544392;BA.debugLine="End Sub";
return "";
}
public static String  _clvsideyard_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "clvsideyard_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvsideyard_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=22478848;
 //BA.debugLineNum = 22478848;BA.debugLine="Sub clvSideYard_ItemClick (Index As Int, Value As";
RDebugUtils.currentLine=22478849;
 //BA.debugLineNum = 22478849;BA.debugLine="Try";
try {RDebugUtils.currentLine=22478850;
 //BA.debugLineNum = 22478850;BA.debugLine="clvDriveway.JumpToItem(Index)";
_clvdriveway._jumptoitem(_index);
RDebugUtils.currentLine=22478851;
 //BA.debugLineNum = 22478851;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
_clvfrontdoor._jumptoitem(_index);
RDebugUtils.currentLine=22478852;
 //BA.debugLineNum = 22478852;BA.debugLine="clvSideYard.JumpToItem(Index)";
_clvsideyard._jumptoitem(_index);
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=22478854;
 //BA.debugLineNum = 22478854;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=22478856;
 //BA.debugLineNum = 22478856;BA.debugLine="End Sub";
return "";
}
public static String  _convertdatetime(String _inputtime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "convertdatetime", false))
	 {return ((String) Debug.delegate(ba, "convertdatetime", new Object[] {_inputtime}));}
String _timestampprocessed = "";
long _ticks = 0L;
long _lngticks = 0L;
b4j.example.dateutils._period _p = null;
RDebugUtils.currentLine=23265280;
 //BA.debugLineNum = 23265280;BA.debugLine="Sub ConvertDateTime(inputTime As String) As String";
RDebugUtils.currentLine=23265282;
 //BA.debugLineNum = 23265282;BA.debugLine="Dim timestampProcessed As String";
_timestampprocessed = "";
RDebugUtils.currentLine=23265283;
 //BA.debugLineNum = 23265283;BA.debugLine="timestampProcessed =  ConvertFullDateTime(inputTi";
_timestampprocessed = _convertfulldatetime(_inputtime);
RDebugUtils.currentLine=23265285;
 //BA.debugLineNum = 23265285;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = _parseutcstring(_inputtime.replace("+00:00","+0000"));
RDebugUtils.currentLine=23265286;
 //BA.debugLineNum = 23265286;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a");
RDebugUtils.currentLine=23265287;
 //BA.debugLineNum = 23265287;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
RDebugUtils.currentLine=23265288;
 //BA.debugLineNum = 23265288;BA.debugLine="Dim p As Period = DateUtils.PeriodBetween(lngTick";
_p = _dateutils._periodbetween(_lngticks,anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=23265290;
 //BA.debugLineNum = 23265290;BA.debugLine="If timestampProcessed.Contains(\"Yesterday\") Or ti";
if (_timestampprocessed.contains("Yesterday") || _timestampprocessed.contains("Today")) { 
RDebugUtils.currentLine=23265291;
 //BA.debugLineNum = 23265291;BA.debugLine="If p.Days = 0 Then";
if (_p.Days==0) { 
RDebugUtils.currentLine=23265292;
 //BA.debugLineNum = 23265292;BA.debugLine="If p.Hours = 0 Then";
if (_p.Hours==0) { 
RDebugUtils.currentLine=23265293;
 //BA.debugLineNum = 23265293;BA.debugLine="If p.Minutes = 0 Then";
if (_p.Minutes==0) { 
RDebugUtils.currentLine=23265294;
 //BA.debugLineNum = 23265294;BA.debugLine="Return timestampProcessed & \" (\" & p.Seconds";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Seconds)+"s ago)";
 }else {
RDebugUtils.currentLine=23265296;
 //BA.debugLineNum = 23265296;BA.debugLine="Return timestampProcessed & \" (\" & p.Minutes";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago)";
 };
 }else {
RDebugUtils.currentLine=23265299;
 //BA.debugLineNum = 23265299;BA.debugLine="Return timestampProcessed & \" (\" & p.Hours & \"";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago)";
 };
 }else 
{RDebugUtils.currentLine=23265301;
 //BA.debugLineNum = 23265301;BA.debugLine="else If p.Hours = 0 Then";
if (_p.Hours==0) { 
RDebugUtils.currentLine=23265302;
 //BA.debugLineNum = 23265302;BA.debugLine="If p.Minutes = 0 Then";
if (_p.Minutes==0) { 
RDebugUtils.currentLine=23265303;
 //BA.debugLineNum = 23265303;BA.debugLine="Return timestampProcessed & \" (\" & p.Seconds &";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Seconds)+"s ago)";
 }else {
RDebugUtils.currentLine=23265305;
 //BA.debugLineNum = 23265305;BA.debugLine="Return timestampProcessed & \" (\" & p.Minutes &";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago)";
 };
 }else 
{RDebugUtils.currentLine=23265307;
 //BA.debugLineNum = 23265307;BA.debugLine="else If p.Minutes = 0 Then";
if (_p.Minutes==0) { 
RDebugUtils.currentLine=23265308;
 //BA.debugLineNum = 23265308;BA.debugLine="Return timestampProcessed & \" (\" & p.Seconds &";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Seconds)+"s ago)";
 }else {
RDebugUtils.currentLine=23265310;
 //BA.debugLineNum = 23265310;BA.debugLine="Return timestampProcessed & \" (\" & p.Days & \"d";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Days)+"d "+BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago)";
 }}}
;
 }else {
RDebugUtils.currentLine=23265313;
 //BA.debugLineNum = 23265313;BA.debugLine="Return timestampProcessed & \" (\" & p.Days & \"d \"";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Days)+"d "+BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago)";
 };
RDebugUtils.currentLine=23265316;
 //BA.debugLineNum = 23265316;BA.debugLine="End Sub";
return "";
}
public static String  _convertfulldatetime(String _inputtime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "convertfulldatetime", false))
	 {return ((String) Debug.delegate(ba, "convertfulldatetime", new Object[] {_inputtime}));}
long _ticks = 0L;
long _lngticks = 0L;
long _yesterday = 0L;
long _timestamp = 0L;
RDebugUtils.currentLine=23330816;
 //BA.debugLineNum = 23330816;BA.debugLine="Sub ConvertFullDateTime(inputTime As String) As St";
RDebugUtils.currentLine=23330818;
 //BA.debugLineNum = 23330818;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = _parseutcstring(_inputtime.replace("+00:00","+0000"));
RDebugUtils.currentLine=23330819;
 //BA.debugLineNum = 23330819;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a");
RDebugUtils.currentLine=23330820;
 //BA.debugLineNum = 23330820;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
RDebugUtils.currentLine=23330822;
 //BA.debugLineNum = 23330822;BA.debugLine="Dim Yesterday As Long";
_yesterday = 0L;
RDebugUtils.currentLine=23330823;
 //BA.debugLineNum = 23330823;BA.debugLine="Dim timestamp As Long";
_timestamp = 0L;
RDebugUtils.currentLine=23330824;
 //BA.debugLineNum = 23330824;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyyMMdd");
RDebugUtils.currentLine=23330825;
 //BA.debugLineNum = 23330825;BA.debugLine="Yesterday = DateTime.Date(DateTime.add(DateTime.N";
_yesterday = (long)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.Add(anywheresoftware.b4a.keywords.Common.DateTime.getNow(),(int) (0),(int) (0),(int) (-1)))));
RDebugUtils.currentLine=23330826;
 //BA.debugLineNum = 23330826;BA.debugLine="timestamp = DateTime.Date(lngTicks)";
_timestamp = (long)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.DateTime.Date(_lngticks)));
RDebugUtils.currentLine=23330828;
 //BA.debugLineNum = 23330828;BA.debugLine="DateTime.DateFormat = \"h:mm:ss a\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("h:mm:ss a");
RDebugUtils.currentLine=23330829;
 //BA.debugLineNum = 23330829;BA.debugLine="If DateUtils.IsSameDay(lngTicks,DateTime.now) The";
if (_dateutils._issameday(_lngticks,anywheresoftware.b4a.keywords.Common.DateTime.getNow())) { 
RDebugUtils.currentLine=23330830;
 //BA.debugLineNum = 23330830;BA.debugLine="Return \"Today \" & DateTime.Date(lngTicks)";
if (true) return "Today "+anywheresoftware.b4a.keywords.Common.DateTime.Date(_lngticks);
 }else 
{RDebugUtils.currentLine=23330831;
 //BA.debugLineNum = 23330831;BA.debugLine="Else If Yesterday = timestamp Then";
if (_yesterday==_timestamp) { 
RDebugUtils.currentLine=23330832;
 //BA.debugLineNum = 23330832;BA.debugLine="Return \"Yesterday \" & DateTime.Date(lngTicks)";
if (true) return "Yesterday "+anywheresoftware.b4a.keywords.Common.DateTime.Date(_lngticks);
 }else {
RDebugUtils.currentLine=23330834;
 //BA.debugLineNum = 23330834;BA.debugLine="Return DateUtils.GetDayOfWeekName(lngTicks) & \"";
if (true) return _dateutils._getdayofweekname(_lngticks)+" "+anywheresoftware.b4a.keywords.Common.DateTime.Date(_lngticks);
 }}
;
RDebugUtils.currentLine=23330836;
 //BA.debugLineNum = 23330836;BA.debugLine="End Sub";
return "";
}
public static long  _parseutcstring(String _utc) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "parseutcstring", false))
	 {return ((Long) Debug.delegate(ba, "parseutcstring", new Object[] {_utc}));}
String _df = "";
long _res = 0L;
RDebugUtils.currentLine=23396352;
 //BA.debugLineNum = 23396352;BA.debugLine="Sub ParseUTCstring(utc As String) As Long";
RDebugUtils.currentLine=23396353;
 //BA.debugLineNum = 23396353;BA.debugLine="Dim df As String = DateTime.DateFormat";
_df = anywheresoftware.b4a.keywords.Common.DateTime.getDateFormat();
RDebugUtils.currentLine=23396354;
 //BA.debugLineNum = 23396354;BA.debugLine="Dim res As Long";
_res = 0L;
RDebugUtils.currentLine=23396355;
 //BA.debugLineNum = 23396355;BA.debugLine="If utc.CharAt(10) = \"T\" Then";
if (_utc.charAt((int) (10))==BA.ObjectToChar("T")) { 
RDebugUtils.currentLine=23396357;
 //BA.debugLineNum = 23396357;BA.debugLine="If utc.CharAt(19) = \".\" Then utc = utc.SubString";
if (_utc.charAt((int) (19))==BA.ObjectToChar(".")) { 
_utc = _utc.substring((int) (0),(int) (19))+"+0000";};
RDebugUtils.currentLine=23396358;
 //BA.debugLineNum = 23396358;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd'T'HH:mm:ssZ\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
 }else {
RDebugUtils.currentLine=23396361;
 //BA.debugLineNum = 23396361;BA.debugLine="DateTime.DateFormat = \"EEE MMM dd HH:mm:ss Z yyy";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("EEE MMM dd HH:mm:ss Z yyyy");
 };
RDebugUtils.currentLine=23396363;
 //BA.debugLineNum = 23396363;BA.debugLine="Try";
try {RDebugUtils.currentLine=23396364;
 //BA.debugLineNum = 23396364;BA.debugLine="res = DateTime.DateParse(utc)";
_res = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_utc);
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=23396366;
 //BA.debugLineNum = 23396366;BA.debugLine="res = 0";
_res = (long) (0);
 };
RDebugUtils.currentLine=23396368;
 //BA.debugLineNum = 23396368;BA.debugLine="DateTime.DateFormat = df";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(_df);
RDebugUtils.currentLine=23396369;
 //BA.debugLineNum = 23396369;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=23396370;
 //BA.debugLineNum = 23396370;BA.debugLine="End Sub";
return 0L;
}
public static String  _convertdatetimeplain(String _inputtime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "convertdatetimeplain", false))
	 {return ((String) Debug.delegate(ba, "convertdatetimeplain", new Object[] {_inputtime}));}
long _ticks = 0L;
long _lngticks = 0L;
RDebugUtils.currentLine=23199744;
 //BA.debugLineNum = 23199744;BA.debugLine="Sub ConvertDateTimePlain(inputTime As String) As S";
RDebugUtils.currentLine=23199746;
 //BA.debugLineNum = 23199746;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = _parseutcstring(_inputtime.replace("+00:00","+0000"));
RDebugUtils.currentLine=23199747;
 //BA.debugLineNum = 23199747;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a");
RDebugUtils.currentLine=23199748;
 //BA.debugLineNum = 23199748;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
RDebugUtils.currentLine=23199751;
 //BA.debugLineNum = 23199751;BA.debugLine="Return DateTime.Date(lngTicks)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(_lngticks);
RDebugUtils.currentLine=23199752;
 //BA.debugLineNum = 23199752;BA.debugLine="End Sub";
return "";
}
public static void  _downloadimage(String _link,anywheresoftware.b4j.objects.ImageViewWrapper _iv,String _camera) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "downloadimage", false))
	 {Debug.delegate(ba, "downloadimage", new Object[] {_link,_iv,_camera}); return;}
ResumableSub_DownloadImage rsub = new ResumableSub_DownloadImage(null,_link,_iv,_camera);
rsub.resume(ba, null);
}
public static class ResumableSub_DownloadImage extends BA.ResumableSub {
public ResumableSub_DownloadImage(cloyd.blink.main parent,String _link,anywheresoftware.b4j.objects.ImageViewWrapper _iv,String _camera) {
this.parent = parent;
this._link = _link;
this._iv = _iv;
this._camera = _camera;
}
cloyd.blink.main parent;
String _link;
anywheresoftware.b4j.objects.ImageViewWrapper _iv;
String _camera;
cloyd.blink.httpjob _j = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=20905985;
 //BA.debugLineNum = 20905985;BA.debugLine="Try";
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
RDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
RDebugUtils.currentLine=20905987;
 //BA.debugLineNum = 20905987;BA.debugLine="response = \"\"";
parent._response = "";
RDebugUtils.currentLine=20905988;
 //BA.debugLineNum = 20905988;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",main.getObject());
RDebugUtils.currentLine=20905989;
 //BA.debugLineNum = 20905989;BA.debugLine="j.Download(Link)";
_j._download /*String*/ (null,_link);
RDebugUtils.currentLine=20905990;
 //BA.debugLineNum = 20905990;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("TOKEN_AUTH",parent._authtoken);
RDebugUtils.currentLine=20905991;
 //BA.debugLineNum = 20905991;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "downloadimage"), (Object)(_j));
this.state = 21;
return;
case 21:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[0];
;
RDebugUtils.currentLine=20905992;
 //BA.debugLineNum = 20905992;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=20905994;
 //BA.debugLineNum = 20905994;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 7:
//if
this.state = 14;
if ((_camera).equals("347574")) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=20905996;
 //BA.debugLineNum = 20905996;BA.debugLine="Else If camera = \"236967\" Then";
if ((_camera).equals("236967")) { 
this.state = 11;
}else 
{RDebugUtils.currentLine=20905998;
 //BA.debugLineNum = 20905998;BA.debugLine="Else If camera = \"226821\" Then";
if ((_camera).equals("226821")) { 
this.state = 13;
}}}
if (true) break;

case 9:
//C
this.state = 14;
RDebugUtils.currentLine=20905995;
 //BA.debugLineNum = 20905995;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Driveway.jpg",anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=20905997;
 //BA.debugLineNum = 20905997;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"FrontDoor.jpg",anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=20905999;
 //BA.debugLineNum = 20905999;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"SideYard.jpg",anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 14:
//C
this.state = 17;
;
RDebugUtils.currentLine=20906001;
 //BA.debugLineNum = 20906001;BA.debugLine="File.Copy2(j.GetInputStream, out)";
anywheresoftware.b4a.keywords.Common.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=20906002;
 //BA.debugLineNum = 20906002;BA.debugLine="out.Close '<------ very important";
_out.Close();
RDebugUtils.currentLine=20906005;
 //BA.debugLineNum = 20906005;BA.debugLine="iv.SetImage(j.GetBitmap)";
_iv.SetImage((javafx.scene.image.Image)(_j._getbitmap /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ (null).getObject()));
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=20906007;
 //BA.debugLineNum = 20906007;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
parent._response = "ERROR: "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=20906008;
 //BA.debugLineNum = 20906008;BA.debugLine="lblStatus.Text = GetRESTError(j.ErrorMessage)";
parent._lblstatus.setText(_getresterror(_j._errormessage /*String*/ ));
 if (true) break;

case 17:
//C
this.state = 20;
;
RDebugUtils.currentLine=20906010;
 //BA.debugLineNum = 20906010;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
RDebugUtils.currentLine=20906012;
 //BA.debugLineNum = 20906012;BA.debugLine="fx.msgbox(MainForm,\"DownloadImage LastException:";
parent._fx.Msgbox(parent._mainform,"DownloadImage LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),parent._mainform.getTitle());
RDebugUtils.currentLine=20906013;
 //BA.debugLineNum = 20906013;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 20:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=20906015;
 //BA.debugLineNum = 20906015;BA.debugLine="End Sub";
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
public static String  _getresterror(String _json) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getresterror", false))
	 {return ((String) Debug.delegate(ba, "getresterror", new Object[] {_json}));}
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
int _code = 0;
String _message = "";
RDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Sub GetRESTError(json As String) As String";
RDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="Try";
try {RDebugUtils.currentLine=21299205;
 //BA.debugLineNum = 21299205;BA.debugLine="If json.Contains(\"<h1>Not Found</h1>\") Then";
if (_json.contains("<h1>Not Found</h1>")) { 
RDebugUtils.currentLine=21299206;
 //BA.debugLineNum = 21299206;BA.debugLine="Return \"REST endpoint URL not found. Try again.";
if (true) return "REST endpoint URL not found. Try again.";
 }else {
RDebugUtils.currentLine=21299208;
 //BA.debugLineNum = 21299208;BA.debugLine="If json.IndexOf(\"{\") <> -1 Then";
if (_json.indexOf("{")!=-1) { 
RDebugUtils.currentLine=21299209;
 //BA.debugLineNum = 21299209;BA.debugLine="json = json.SubString(json.IndexOf(\"{\"))";
_json = _json.substring(_json.indexOf("{"));
RDebugUtils.currentLine=21299210;
 //BA.debugLineNum = 21299210;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=21299211;
 //BA.debugLineNum = 21299211;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=21299212;
 //BA.debugLineNum = 21299212;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=21299213;
 //BA.debugLineNum = 21299213;BA.debugLine="Dim code As Int = root.Get(\"code\")";
_code = (int)(BA.ObjectToNumber(_root.Get((Object)("code"))));
RDebugUtils.currentLine=21299214;
 //BA.debugLineNum = 21299214;BA.debugLine="Dim message As String = root.Get(\"message\")";
_message = BA.ObjectToString(_root.Get((Object)("message")));
RDebugUtils.currentLine=21299215;
 //BA.debugLineNum = 21299215;BA.debugLine="Log(\"Code: \" & code & \" Message: \" & message)";
anywheresoftware.b4a.keywords.Common.Log("Code: "+BA.NumberToString(_code)+" Message: "+_message);
RDebugUtils.currentLine=21299216;
 //BA.debugLineNum = 21299216;BA.debugLine="Return \"Code: \" & code & \" Message: \" & messag";
if (true) return "Code: "+BA.NumberToString(_code)+" Message: "+_message;
 }else {
RDebugUtils.currentLine=21299218;
 //BA.debugLineNum = 21299218;BA.debugLine="Return json";
if (true) return _json;
 };
 };
 } 
       catch (Exception e19) {
			ba.setLastException(e19);RDebugUtils.currentLine=21299222;
 //BA.debugLineNum = 21299222;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=21299223;
 //BA.debugLineNum = 21299223;BA.debugLine="fx.msgbox(MainForm,\"GetRESTError: \" & LastExcept";
_fx.Msgbox(_mainform,"GetRESTError: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
RDebugUtils.currentLine=21299224;
 //BA.debugLineNum = 21299224;BA.debugLine="Return json";
if (true) return _json;
 };
RDebugUtils.currentLine=21299226;
 //BA.debugLineNum = 21299226;BA.debugLine="End Sub";
return "";
}
public static String  _getallcameras(String _json) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getallcameras", false))
	 {return ((String) Debug.delegate(ba, "getallcameras", new Object[] {_json}));}
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _networks = null;
anywheresoftware.b4a.objects.collections.Map _colnetworks = null;
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Sub GetAllCameras(json As String)";
RDebugUtils.currentLine=21102593;
 //BA.debugLineNum = 21102593;BA.debugLine="Try";
try {RDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="lblStatus.Text = \"Getting all cameras informatio";
_lblstatus.setText("Getting all cameras information...");
RDebugUtils.currentLine=21102595;
 //BA.debugLineNum = 21102595;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=21102596;
 //BA.debugLineNum = 21102596;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=21102597;
 //BA.debugLineNum = 21102597;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=21102601;
 //BA.debugLineNum = 21102601;BA.debugLine="Dim networks As List = root.Get(\"networks\")";
_networks = new anywheresoftware.b4a.objects.collections.List();
_networks.setObject((java.util.List)(_root.Get((Object)("networks"))));
RDebugUtils.currentLine=21102602;
 //BA.debugLineNum = 21102602;BA.debugLine="For Each colnetworks As Map In networks";
_colnetworks = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group7 = _networks;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_colnetworks.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group7.Get(index7)));
RDebugUtils.currentLine=21102611;
 //BA.debugLineNum = 21102611;BA.debugLine="networkID = colnetworks.Get(\"network_id\")";
_networkid = BA.ObjectToString(_colnetworks.Get((Object)("network_id")));
RDebugUtils.currentLine=21102612;
 //BA.debugLineNum = 21102612;BA.debugLine="Log(\"networkID: \" &  networkID)";
anywheresoftware.b4a.keywords.Common.Log("networkID: "+_networkid);
 }
};
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=21102616;
 //BA.debugLineNum = 21102616;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=21102617;
 //BA.debugLineNum = 21102617;BA.debugLine="fx.msgbox(MainForm,\"GetAllCameras LastException:";
_fx.Msgbox(_mainform,"GetAllCameras LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 };
RDebugUtils.currentLine=21102619;
 //BA.debugLineNum = 21102619;BA.debugLine="End Sub";
return "";
}
public static String  _getauthinfo(String _json) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getauthinfo", false))
	 {return ((String) Debug.delegate(ba, "getauthinfo", new Object[] {_json}));}
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.Map _authtokenmap = null;
anywheresoftware.b4a.objects.collections.Map _region = null;
RDebugUtils.currentLine=20971520;
 //BA.debugLineNum = 20971520;BA.debugLine="Sub GetAuthInfo(json As String)";
RDebugUtils.currentLine=20971521;
 //BA.debugLineNum = 20971521;BA.debugLine="Try";
try {RDebugUtils.currentLine=20971522;
 //BA.debugLineNum = 20971522;BA.debugLine="lblStatus.Text = \"Getting authtoken...\"";
_lblstatus.setText("Getting authtoken...");
RDebugUtils.currentLine=20971523;
 //BA.debugLineNum = 20971523;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=20971524;
 //BA.debugLineNum = 20971524;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=20971525;
 //BA.debugLineNum = 20971525;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=20971526;
 //BA.debugLineNum = 20971526;BA.debugLine="Dim authtokenmap As Map = root.Get(\"authtoken\")";
_authtokenmap = new anywheresoftware.b4a.objects.collections.Map();
_authtokenmap.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("authtoken"))));
RDebugUtils.currentLine=20971527;
 //BA.debugLineNum = 20971527;BA.debugLine="authToken = authtokenmap.Get(\"authtoken\")";
_authtoken = BA.ObjectToString(_authtokenmap.Get((Object)("authtoken")));
RDebugUtils.currentLine=20971528;
 //BA.debugLineNum = 20971528;BA.debugLine="Log(\"authToken: \" &  authToken)";
anywheresoftware.b4a.keywords.Common.Log("authToken: "+_authtoken);
RDebugUtils.currentLine=20971536;
 //BA.debugLineNum = 20971536;BA.debugLine="Dim region As Map = root.Get(\"region\")";
_region = new anywheresoftware.b4a.objects.collections.Map();
_region.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("region"))));
RDebugUtils.currentLine=20971537;
 //BA.debugLineNum = 20971537;BA.debugLine="userRegion = region.GetKeyAt(0)";
_userregion = BA.ObjectToString(_region.GetKeyAt((int) (0)));
RDebugUtils.currentLine=20971538;
 //BA.debugLineNum = 20971538;BA.debugLine="Log(\"userRegion: \" &  userRegion)";
anywheresoftware.b4a.keywords.Common.Log("userRegion: "+_userregion);
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=20971543;
 //BA.debugLineNum = 20971543;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=20971544;
 //BA.debugLineNum = 20971544;BA.debugLine="fx.msgbox(MainForm,\"GetAuthInfo LastException: \"";
_fx.Msgbox(_mainform,"GetAuthInfo LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 };
RDebugUtils.currentLine=20971547;
 //BA.debugLineNum = 20971547;BA.debugLine="End Sub";
return "";
}
public static String  _getcamerainfo(String _json,b4j.example.customlistview _clv) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getcamerainfo", false))
	 {return ((String) Debug.delegate(ba, "getcamerainfo", new Object[] {_json,_clv}));}
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
String _strtimestamp = "";
int _i = 0;
String _item = "";
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Sub GetCameraInfo(json As String, clv As CustomLis";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="Try";
try {RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=21364739;
 //BA.debugLineNum = 21364739;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=21364740;
 //BA.debugLineNum = 21364740;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=21364741;
 //BA.debugLineNum = 21364741;BA.debugLine="Dim camera_status As Map = root.Get(\"camera_stat";
_camera_status = new anywheresoftware.b4a.objects.collections.Map();
_camera_status.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("camera_status"))));
RDebugUtils.currentLine=21364742;
 //BA.debugLineNum = 21364742;BA.debugLine="Dim total_108_wakeups As Int = camera_status.Get";
_total_108_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("total_108_wakeups"))));
RDebugUtils.currentLine=21364743;
 //BA.debugLineNum = 21364743;BA.debugLine="Dim battery_voltage As Int = camera_status.Get(\"";
_battery_voltage = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("battery_voltage"))));
RDebugUtils.currentLine=21364744;
 //BA.debugLineNum = 21364744;BA.debugLine="Dim light_sensor_data_valid As String = camera_s";
_light_sensor_data_valid = BA.ObjectToString(_camera_status.Get((Object)("light_sensor_data_valid")));
RDebugUtils.currentLine=21364745;
 //BA.debugLineNum = 21364745;BA.debugLine="Dim lfr_tb_wakeups As Int = camera_status.Get(\"l";
_lfr_tb_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lfr_tb_wakeups"))));
RDebugUtils.currentLine=21364746;
 //BA.debugLineNum = 21364746;BA.debugLine="Dim fw_git_hash As String = camera_status.Get(\"f";
_fw_git_hash = BA.ObjectToString(_camera_status.Get((Object)("fw_git_hash")));
RDebugUtils.currentLine=21364747;
 //BA.debugLineNum = 21364747;BA.debugLine="Dim wifi_strength As Int = camera_status.Get(\"wi";
_wifi_strength = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("wifi_strength"))));
RDebugUtils.currentLine=21364748;
 //BA.debugLineNum = 21364748;BA.debugLine="Dim lfr_strength As Int = camera_status.Get(\"lfr";
_lfr_strength = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lfr_strength"))));
RDebugUtils.currentLine=21364749;
 //BA.debugLineNum = 21364749;BA.debugLine="Dim total_tb_wakeups As Int = camera_status.Get(";
_total_tb_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("total_tb_wakeups"))));
RDebugUtils.currentLine=21364750;
 //BA.debugLineNum = 21364750;BA.debugLine="Dim created_at As String = camera_status.Get(\"cr";
_created_at = BA.ObjectToString(_camera_status.Get((Object)("created_at")));
RDebugUtils.currentLine=21364751;
 //BA.debugLineNum = 21364751;BA.debugLine="Dim light_sensor_ch0 As Int = camera_status.Get(";
_light_sensor_ch0 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("light_sensor_ch0"))));
RDebugUtils.currentLine=21364752;
 //BA.debugLineNum = 21364752;BA.debugLine="Dim mac As String = camera_status.Get(\"mac\")";
_mac = BA.ObjectToString(_camera_status.Get((Object)("mac")));
RDebugUtils.currentLine=21364753;
 //BA.debugLineNum = 21364753;BA.debugLine="Dim unit_number As Int = camera_status.Get(\"unit";
_unit_number = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("unit_number"))));
RDebugUtils.currentLine=21364754;
 //BA.debugLineNum = 21364754;BA.debugLine="Dim updated_at As String = camera_status.Get(\"up";
_updated_at = BA.ObjectToString(_camera_status.Get((Object)("updated_at")));
RDebugUtils.currentLine=21364755;
 //BA.debugLineNum = 21364755;BA.debugLine="Dim light_sensor_ch1 As Int = camera_status.Get(";
_light_sensor_ch1 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("light_sensor_ch1"))));
RDebugUtils.currentLine=21364756;
 //BA.debugLineNum = 21364756;BA.debugLine="Dim time_dhcp_lease As Int = camera_status.Get(\"";
_time_dhcp_lease = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_dhcp_lease"))));
RDebugUtils.currentLine=21364757;
 //BA.debugLineNum = 21364757;BA.debugLine="Dim temperature As Int = camera_status.Get(\"temp";
_temperature = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("temperature"))));
RDebugUtils.currentLine=21364758;
 //BA.debugLineNum = 21364758;BA.debugLine="Dim time_first_video As Int = camera_status.Get(";
_time_first_video = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_first_video"))));
RDebugUtils.currentLine=21364759;
 //BA.debugLineNum = 21364759;BA.debugLine="Dim time_dns_resolve As Int = camera_status.Get(";
_time_dns_resolve = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_dns_resolve"))));
RDebugUtils.currentLine=21364760;
 //BA.debugLineNum = 21364760;BA.debugLine="Dim id As Int = camera_status.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("id"))));
RDebugUtils.currentLine=21364761;
 //BA.debugLineNum = 21364761;BA.debugLine="Dim temp_alert_status As String = camera_status.";
_temp_alert_status = BA.ObjectToString(_camera_status.Get((Object)("temp_alert_status")));
RDebugUtils.currentLine=21364762;
 //BA.debugLineNum = 21364762;BA.debugLine="Dim time_108_boot As Int = camera_status.Get(\"ti";
_time_108_boot = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_108_boot"))));
RDebugUtils.currentLine=21364763;
 //BA.debugLineNum = 21364763;BA.debugLine="Dim lfr_108_wakeups As Int = camera_status.Get(\"";
_lfr_108_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lfr_108_wakeups"))));
RDebugUtils.currentLine=21364764;
 //BA.debugLineNum = 21364764;BA.debugLine="cameraThumbnail = camera_status.Get(\"thumbnail\")";
_camerathumbnail = BA.ObjectToString(_camera_status.Get((Object)("thumbnail")));
RDebugUtils.currentLine=21364765;
 //BA.debugLineNum = 21364765;BA.debugLine="Log(\"cameraThumbnail: \" & cameraThumbnail)";
anywheresoftware.b4a.keywords.Common.Log("cameraThumbnail: "+_camerathumbnail);
RDebugUtils.currentLine=21364766;
 //BA.debugLineNum = 21364766;BA.debugLine="Dim lifetime_duration As Int = camera_status.Get";
_lifetime_duration = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lifetime_duration"))));
RDebugUtils.currentLine=21364767;
 //BA.debugLineNum = 21364767;BA.debugLine="Dim wifi_connect_failure_count As Int = camera_s";
_wifi_connect_failure_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("wifi_connect_failure_count"))));
RDebugUtils.currentLine=21364768;
 //BA.debugLineNum = 21364768;BA.debugLine="Dim camera_id As Int = camera_status.Get(\"camera";
_camera_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("camera_id"))));
RDebugUtils.currentLine=21364769;
 //BA.debugLineNum = 21364769;BA.debugLine="Dim battery_alert_status As String = camera_stat";
_battery_alert_status = BA.ObjectToString(_camera_status.Get((Object)("battery_alert_status")));
RDebugUtils.currentLine=21364770;
 //BA.debugLineNum = 21364770;BA.debugLine="Dim dhcp_failure_count As Int = camera_status.Ge";
_dhcp_failure_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dhcp_failure_count"))));
RDebugUtils.currentLine=21364771;
 //BA.debugLineNum = 21364771;BA.debugLine="Dim ip_address As String = camera_status.Get(\"ip";
_ip_address = BA.ObjectToString(_camera_status.Get((Object)("ip_address")));
RDebugUtils.currentLine=21364772;
 //BA.debugLineNum = 21364772;BA.debugLine="Dim ipv As String = camera_status.Get(\"ipv\")";
_ipv = BA.ObjectToString(_camera_status.Get((Object)("ipv")));
RDebugUtils.currentLine=21364773;
 //BA.debugLineNum = 21364773;BA.debugLine="Dim light_sensor_data_new As String = camera_sta";
_light_sensor_data_new = BA.ObjectToString(_camera_status.Get((Object)("light_sensor_data_new")));
RDebugUtils.currentLine=21364774;
 //BA.debugLineNum = 21364774;BA.debugLine="Dim network_id As Int = camera_status.Get(\"netwo";
_network_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("network_id"))));
RDebugUtils.currentLine=21364775;
 //BA.debugLineNum = 21364775;BA.debugLine="Dim account_id As Int = camera_status.Get(\"accou";
_account_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("account_id"))));
RDebugUtils.currentLine=21364776;
 //BA.debugLineNum = 21364776;BA.debugLine="Dim serial As String = camera_status.Get(\"serial";
_serial = BA.ObjectToString(_camera_status.Get((Object)("serial")));
RDebugUtils.currentLine=21364777;
 //BA.debugLineNum = 21364777;BA.debugLine="Dim dev_1 As Int = camera_status.Get(\"dev_1\")";
_dev_1 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dev_1"))));
RDebugUtils.currentLine=21364778;
 //BA.debugLineNum = 21364778;BA.debugLine="Dim time_wlan_connect As Int = camera_status.Get";
_time_wlan_connect = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_wlan_connect"))));
RDebugUtils.currentLine=21364779;
 //BA.debugLineNum = 21364779;BA.debugLine="Dim dev_2 As Int = camera_status.Get(\"dev_2\")";
_dev_2 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dev_2"))));
RDebugUtils.currentLine=21364780;
 //BA.debugLineNum = 21364780;BA.debugLine="Dim socket_failure_count As Int = camera_status.";
_socket_failure_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("socket_failure_count"))));
RDebugUtils.currentLine=21364781;
 //BA.debugLineNum = 21364781;BA.debugLine="Dim dev_3 As Int = camera_status.Get(\"dev_3\")";
_dev_3 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dev_3"))));
RDebugUtils.currentLine=21364782;
 //BA.debugLineNum = 21364782;BA.debugLine="Dim pir_rejections As Int = camera_status.Get(\"p";
_pir_rejections = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("pir_rejections"))));
RDebugUtils.currentLine=21364783;
 //BA.debugLineNum = 21364783;BA.debugLine="Dim sync_module_id As Int = camera_status.Get(\"s";
_sync_module_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("sync_module_id"))));
RDebugUtils.currentLine=21364784;
 //BA.debugLineNum = 21364784;BA.debugLine="Dim lifetime_count As Int = camera_status.Get(\"l";
_lifetime_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lifetime_count"))));
RDebugUtils.currentLine=21364785;
 //BA.debugLineNum = 21364785;BA.debugLine="Dim error_codes As Int = camera_status.Get(\"erro";
_error_codes = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("error_codes"))));
RDebugUtils.currentLine=21364786;
 //BA.debugLineNum = 21364786;BA.debugLine="Dim fw_version As String = camera_status.Get(\"fw";
_fw_version = BA.ObjectToString(_camera_status.Get((Object)("fw_version")));
RDebugUtils.currentLine=21364787;
 //BA.debugLineNum = 21364787;BA.debugLine="Dim ac_power As String = camera_status.Get(\"ac_p";
_ac_power = BA.ObjectToString(_camera_status.Get((Object)("ac_power")));
RDebugUtils.currentLine=21364789;
 //BA.debugLineNum = 21364789;BA.debugLine="clv.Clear";
_clv._clear();
RDebugUtils.currentLine=21364790;
 //BA.debugLineNum = 21364790;BA.debugLine="clv.AddTextItem(\"Battery voltage: \" & NumberForm";
_clv._addtextitem((Object)("Battery voltage: "+anywheresoftware.b4a.keywords.Common.NumberFormat((_battery_voltage/(double)100),(int) (0),(int) (2))+"V - "+_checkbattlife(_battery_voltage)),(Object)("battery_voltage"));
RDebugUtils.currentLine=21364791;
 //BA.debugLineNum = 21364791;BA.debugLine="clv.AddTextItem(\"Camera to WiFi strength: \" & wi";
_clv._addtextitem((Object)("Camera to WiFi strength: "+BA.NumberToString(_wifi_strength)+" dBm - "+_checklfrlevel(_wifi_strength)),(Object)("wifi_strength"));
RDebugUtils.currentLine=21364792;
 //BA.debugLineNum = 21364792;BA.debugLine="clv.AddTextItem(\"Camera to Sync Module strength";
_clv._addtextitem((Object)("Camera to Sync Module strength (LFR): "+BA.NumberToString(_lfr_strength)+" dBm - "+_checklfrlevel(_lfr_strength)),(Object)("lfr_strength"));
RDebugUtils.currentLine=21364793;
 //BA.debugLineNum = 21364793;BA.debugLine="clv.AddTextItem(\"Temperature: \" & temperature &";
_clv._addtextitem((Object)("Temperature: "+BA.NumberToString(_temperature)+"ºF"),(Object)("temperature"));
RDebugUtils.currentLine=21364794;
 //BA.debugLineNum = 21364794;BA.debugLine="clv.AddTextItem(\"Firmware version: \" & fw_versio";
_clv._addtextitem((Object)("Firmware version: "+_fw_version),(Object)("fw_version"));
RDebugUtils.currentLine=21364795;
 //BA.debugLineNum = 21364795;BA.debugLine="clv.AddTextItem(\"Firmware Git Hash: \" & fw_git_h";
_clv._addtextitem((Object)("Firmware Git Hash: "+_fw_git_hash),(Object)("fw_git_hash"));
RDebugUtils.currentLine=21364796;
 //BA.debugLineNum = 21364796;BA.debugLine="clv.AddTextItem(\"Battery alert status: \" & batte";
_clv._addtextitem((Object)("Battery alert status: "+_battery_alert_status),(Object)("battery_alert_status"));
RDebugUtils.currentLine=21364797;
 //BA.debugLineNum = 21364797;BA.debugLine="clv.AddTextItem(\"Temperature alert status: \" & t";
_clv._addtextitem((Object)("Temperature alert status: "+_temp_alert_status),(Object)("temp_alert_status"));
RDebugUtils.currentLine=21364798;
 //BA.debugLineNum = 21364798;BA.debugLine="clv.AddTextItem(\"Updated at: \" & ConvertDateTime";
_clv._addtextitem((Object)("Updated at: "+_convertdatetimeplain(_updated_at)),(Object)("updated_at"));
RDebugUtils.currentLine=21364799;
 //BA.debugLineNum = 21364799;BA.debugLine="clv.AddTextItem(\"Created at: \" & ConvertDateTime";
_clv._addtextitem((Object)("Created at: "+_convertdatetimeplain(_created_at)),(Object)("created_at"));
RDebugUtils.currentLine=21364800;
 //BA.debugLineNum = 21364800;BA.debugLine="clv.AddTextItem(\"IP address: \" & ip_address, \"ip";
_clv._addtextitem((Object)("IP address: "+_ip_address),(Object)("ip_address"));
RDebugUtils.currentLine=21364801;
 //BA.debugLineNum = 21364801;BA.debugLine="clv.AddTextItem(\"MAC address: \" & mac, \"mac\")";
_clv._addtextitem((Object)("MAC address: "+_mac),(Object)("mac"));
RDebugUtils.currentLine=21364802;
 //BA.debugLineNum = 21364802;BA.debugLine="clv.AddTextItem(\"Camera ID: \" & camera_id, \"came";
_clv._addtextitem((Object)("Camera ID: "+BA.NumberToString(_camera_id)),(Object)("camera_id"));
RDebugUtils.currentLine=21364803;
 //BA.debugLineNum = 21364803;BA.debugLine="clv.AddTextItem(\"Serial: \" & serial, \"serial\")";
_clv._addtextitem((Object)("Serial: "+_serial),(Object)("serial"));
RDebugUtils.currentLine=21364804;
 //BA.debugLineNum = 21364804;BA.debugLine="clv.AddTextItem(\"Network ID: \" & network_id, \"ne";
_clv._addtextitem((Object)("Network ID: "+BA.NumberToString(_network_id)),(Object)("network_id"));
RDebugUtils.currentLine=21364805;
 //BA.debugLineNum = 21364805;BA.debugLine="clv.AddTextItem(\"Account ID: \" & account_id, \"ac";
_clv._addtextitem((Object)("Account ID: "+BA.NumberToString(_account_id)),(Object)("account_id"));
RDebugUtils.currentLine=21364806;
 //BA.debugLineNum = 21364806;BA.debugLine="clv.AddTextItem(\"ID: \" & id, \"id\")";
_clv._addtextitem((Object)("ID: "+BA.NumberToString(_id)),(Object)("id"));
RDebugUtils.currentLine=21364807;
 //BA.debugLineNum = 21364807;BA.debugLine="clv.AddTextItem(\"Sync Module ID: \" & sync_module";
_clv._addtextitem((Object)("Sync Module ID: "+BA.NumberToString(_sync_module_id)),(Object)("sync_module_id"));
RDebugUtils.currentLine=21364808;
 //BA.debugLineNum = 21364808;BA.debugLine="clv.AddTextItem(\"Light sensor data valid: \" & li";
_clv._addtextitem((Object)("Light sensor data valid: "+_light_sensor_data_valid),(Object)("light_sensor_data_valid"));
RDebugUtils.currentLine=21364809;
 //BA.debugLineNum = 21364809;BA.debugLine="clv.AddTextItem(\"DHCP failure count: \" & dhcp_fa";
_clv._addtextitem((Object)("DHCP failure count: "+BA.NumberToString(_dhcp_failure_count)),(Object)("dhcp_failure_count"));
RDebugUtils.currentLine=21364810;
 //BA.debugLineNum = 21364810;BA.debugLine="clv.AddTextItem(\"LFR tb wakeups: \" & lfr_tb_wake";
_clv._addtextitem((Object)("LFR tb wakeups: "+BA.NumberToString(_lfr_tb_wakeups)),(Object)("lfr_tb_wakeups"));
RDebugUtils.currentLine=21364811;
 //BA.debugLineNum = 21364811;BA.debugLine="clv.AddTextItem(\"Socket failure count: \" & socke";
_clv._addtextitem((Object)("Socket failure count: "+BA.NumberToString(_socket_failure_count)),(Object)("socket_failure_count"));
RDebugUtils.currentLine=21364812;
 //BA.debugLineNum = 21364812;BA.debugLine="clv.AddTextItem(\"Camera thumbnail: \" & cameraThu";
_clv._addtextitem((Object)("Camera thumbnail: "+_camerathumbnail),(Object)("thumbnail"));
RDebugUtils.currentLine=21364813;
 //BA.debugLineNum = 21364813;BA.debugLine="clv.AddTextItem(\"WiFi connect failure count: \" &";
_clv._addtextitem((Object)("WiFi connect failure count: "+BA.NumberToString(_wifi_connect_failure_count)),(Object)("wifi_connect_failure_count"));
RDebugUtils.currentLine=21364814;
 //BA.debugLineNum = 21364814;BA.debugLine="clv.AddTextItem(\"Error codes: \" & error_codes, \"";
_clv._addtextitem((Object)("Error codes: "+BA.NumberToString(_error_codes)),(Object)("error_codes"));
RDebugUtils.currentLine=21364815;
 //BA.debugLineNum = 21364815;BA.debugLine="clv.AddTextItem(\"AC power: \" & ac_power, \"ac_pow";
_clv._addtextitem((Object)("AC power: "+_ac_power),(Object)("ac_power"));
RDebugUtils.currentLine=21364816;
 //BA.debugLineNum = 21364816;BA.debugLine="clv.AddTextItem(\"Total 108 wakeups: \" & total_10";
_clv._addtextitem((Object)("Total 108 wakeups: "+BA.NumberToString(_total_108_wakeups)),(Object)("total_108_wakeups"));
RDebugUtils.currentLine=21364817;
 //BA.debugLineNum = 21364817;BA.debugLine="clv.AddTextItem(\"Total Tb wakeups: \" & total_tb_";
_clv._addtextitem((Object)("Total Tb wakeups: "+BA.NumberToString(_total_tb_wakeups)),(Object)("total_tb_wakeups"));
RDebugUtils.currentLine=21364818;
 //BA.debugLineNum = 21364818;BA.debugLine="clv.AddTextItem(\"Light sensor ch0: \" & light_sen";
_clv._addtextitem((Object)("Light sensor ch0: "+BA.NumberToString(_light_sensor_ch0)),(Object)("light_sensor_ch0"));
RDebugUtils.currentLine=21364819;
 //BA.debugLineNum = 21364819;BA.debugLine="clv.AddTextItem(\"Unit number: \" & unit_number, \"";
_clv._addtextitem((Object)("Unit number: "+BA.NumberToString(_unit_number)),(Object)("unit_number"));
RDebugUtils.currentLine=21364820;
 //BA.debugLineNum = 21364820;BA.debugLine="clv.AddTextItem(\"Light sensor ch1: \" & light_sen";
_clv._addtextitem((Object)("Light sensor ch1: "+BA.NumberToString(_light_sensor_ch1)),(Object)("light_sensor_ch1"));
RDebugUtils.currentLine=21364821;
 //BA.debugLineNum = 21364821;BA.debugLine="clv.AddTextItem(\"Time dhcp lease: \" & time_dhcp_";
_clv._addtextitem((Object)("Time dhcp lease: "+BA.NumberToString(_time_dhcp_lease)),(Object)("time_dhcp_lease"));
RDebugUtils.currentLine=21364822;
 //BA.debugLineNum = 21364822;BA.debugLine="clv.AddTextItem(\"Time first video: \" & time_firs";
_clv._addtextitem((Object)("Time first video: "+BA.NumberToString(_time_first_video)),(Object)("time_first_video"));
RDebugUtils.currentLine=21364823;
 //BA.debugLineNum = 21364823;BA.debugLine="clv.AddTextItem(\"Time dns resolve: \" & time_dns_";
_clv._addtextitem((Object)("Time dns resolve: "+BA.NumberToString(_time_dns_resolve)),(Object)("time_dns_resolve"));
RDebugUtils.currentLine=21364824;
 //BA.debugLineNum = 21364824;BA.debugLine="clv.AddTextItem(\"Time 108 boot: \" & time_108_boo";
_clv._addtextitem((Object)("Time 108 boot: "+BA.NumberToString(_time_108_boot)),(Object)("time_108_boot"));
RDebugUtils.currentLine=21364825;
 //BA.debugLineNum = 21364825;BA.debugLine="clv.AddTextItem(\"LFR 108 wakeups: \" & lfr_108_wa";
_clv._addtextitem((Object)("LFR 108 wakeups: "+BA.NumberToString(_lfr_108_wakeups)),(Object)("lfr_108_wakeups"));
RDebugUtils.currentLine=21364826;
 //BA.debugLineNum = 21364826;BA.debugLine="clv.AddTextItem(\"lifetime duration: \" & lifetime";
_clv._addtextitem((Object)("lifetime duration: "+BA.NumberToString(_lifetime_duration)),(Object)("lifetime_duration"));
RDebugUtils.currentLine=21364827;
 //BA.debugLineNum = 21364827;BA.debugLine="clv.AddTextItem(\"lpv: \" & ipv, \"ipv\")";
_clv._addtextitem((Object)("lpv: "+_ipv),(Object)("ipv"));
RDebugUtils.currentLine=21364828;
 //BA.debugLineNum = 21364828;BA.debugLine="clv.AddTextItem(\"light sensor data new: \" & ligh";
_clv._addtextitem((Object)("light sensor data new: "+_light_sensor_data_new),(Object)("light_sensor_data_new"));
RDebugUtils.currentLine=21364829;
 //BA.debugLineNum = 21364829;BA.debugLine="clv.AddTextItem(\"Dev_1: \" & dev_1, \"dev_1\")";
_clv._addtextitem((Object)("Dev_1: "+BA.NumberToString(_dev_1)),(Object)("dev_1"));
RDebugUtils.currentLine=21364830;
 //BA.debugLineNum = 21364830;BA.debugLine="clv.AddTextItem(\"Dev_2: \" & dev_2, \"dev_2\")";
_clv._addtextitem((Object)("Dev_2: "+BA.NumberToString(_dev_2)),(Object)("dev_2"));
RDebugUtils.currentLine=21364831;
 //BA.debugLineNum = 21364831;BA.debugLine="clv.AddTextItem(\"Dev_3: \" & dev_3, \"dev_3\")";
_clv._addtextitem((Object)("Dev_3: "+BA.NumberToString(_dev_3)),(Object)("dev_3"));
RDebugUtils.currentLine=21364832;
 //BA.debugLineNum = 21364832;BA.debugLine="clv.AddTextItem(\"Time wlan connect: \" & time_wla";
_clv._addtextitem((Object)("Time wlan connect: "+BA.NumberToString(_time_wlan_connect)),(Object)("time_wlan_connect"));
RDebugUtils.currentLine=21364833;
 //BA.debugLineNum = 21364833;BA.debugLine="clv.AddTextItem(\"PIR rejections: \" & pir_rejecti";
_clv._addtextitem((Object)("PIR rejections: "+BA.NumberToString(_pir_rejections)),(Object)("pir_rejections"));
RDebugUtils.currentLine=21364834;
 //BA.debugLineNum = 21364834;BA.debugLine="clv.AddTextItem(\"Lifetime count: \" & lifetime_co";
_clv._addtextitem((Object)("Lifetime count: "+BA.NumberToString(_lifetime_count)),(Object)("lifetime_count"));
RDebugUtils.currentLine=21364836;
 //BA.debugLineNum = 21364836;BA.debugLine="Dim strTimestamp As String";
_strtimestamp = "";
RDebugUtils.currentLine=21364837;
 //BA.debugLineNum = 21364837;BA.debugLine="strTimestamp = ConvertDateTime(updated_at)";
_strtimestamp = _convertdatetime(_updated_at);
RDebugUtils.currentLine=21364838;
 //BA.debugLineNum = 21364838;BA.debugLine="lblStatus.Text = \"Last updated: \" & strTimestamp";
_lblstatus.setText("Last updated: "+_strtimestamp);
RDebugUtils.currentLine=21364839;
 //BA.debugLineNum = 21364839;BA.debugLine="If clv = clvDriveway Then";
if ((_clv).equals(_clvdriveway)) { 
RDebugUtils.currentLine=21364840;
 //BA.debugLineNum = 21364840;BA.debugLine="lblDriveway.Text = \"Driveway \" & strTimestamp";
_lbldriveway.setText("Driveway "+_strtimestamp);
RDebugUtils.currentLine=21364841;
 //BA.debugLineNum = 21364841;BA.debugLine="prevDrivewayUpdateTime = updated_at";
_prevdrivewayupdatetime = _updated_at;
 }else 
{RDebugUtils.currentLine=21364842;
 //BA.debugLineNum = 21364842;BA.debugLine="Else If clv = clvFrontDoor Then";
if ((_clv).equals(_clvfrontdoor)) { 
RDebugUtils.currentLine=21364843;
 //BA.debugLineNum = 21364843;BA.debugLine="lblFrontDoor.Text = \"Front Door \" & strTimestam";
_lblfrontdoor.setText("Front Door "+_strtimestamp);
RDebugUtils.currentLine=21364844;
 //BA.debugLineNum = 21364844;BA.debugLine="lblDriveway.Text = \"Driveway \" & ConvertDateTim";
_lbldriveway.setText("Driveway "+_convertdatetime(_prevdrivewayupdatetime));
RDebugUtils.currentLine=21364845;
 //BA.debugLineNum = 21364845;BA.debugLine="prevFrontDoorUpdateTime = updated_at";
_prevfrontdoorupdatetime = _updated_at;
 }else 
{RDebugUtils.currentLine=21364846;
 //BA.debugLineNum = 21364846;BA.debugLine="Else If clv = clvSideYard Then";
if ((_clv).equals(_clvsideyard)) { 
RDebugUtils.currentLine=21364847;
 //BA.debugLineNum = 21364847;BA.debugLine="lblSideYard.Text = \"Side Yard \" & strTimestamp";
_lblsideyard.setText("Side Yard "+_strtimestamp);
RDebugUtils.currentLine=21364848;
 //BA.debugLineNum = 21364848;BA.debugLine="lblDriveway.Text = \"Driveway \" & ConvertDateTim";
_lbldriveway.setText("Driveway "+_convertdatetime(_prevdrivewayupdatetime));
RDebugUtils.currentLine=21364849;
 //BA.debugLineNum = 21364849;BA.debugLine="lblFrontDoor.Text = \"Front Door \" & ConvertDate";
_lblfrontdoor.setText("Front Door "+_convertdatetime(_prevfrontdoorupdatetime));
 }}}
;
RDebugUtils.currentLine=21364852;
 //BA.debugLineNum = 21364852;BA.debugLine="For i = 0 To clv.Size-1";
{
final int step113 = 1;
final int limit113 = (int) (_clv._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit113 ;_i = _i + step113 ) {
RDebugUtils.currentLine=21364853;
 //BA.debugLineNum = 21364853;BA.debugLine="Dim item As String";
_item = "";
RDebugUtils.currentLine=21364854;
 //BA.debugLineNum = 21364854;BA.debugLine="item = clv.GetValue(i)";
_item = BA.ObjectToString(_clv._getvalue(_i));
RDebugUtils.currentLine=21364855;
 //BA.debugLineNum = 21364855;BA.debugLine="If item.Contains(\"thumbnail\") Then";
if (_item.contains("thumbnail")) { 
RDebugUtils.currentLine=21364856;
 //BA.debugLineNum = 21364856;BA.debugLine="clv.ResizeItem(i,80dip)";
_clv._resizeitem(_i,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)));
 }else 
{RDebugUtils.currentLine=21364857;
 //BA.debugLineNum = 21364857;BA.debugLine="Else If item.Contains(\"_strength\") Then";
if (_item.contains("_strength")) { 
RDebugUtils.currentLine=21364858;
 //BA.debugLineNum = 21364858;BA.debugLine="clv.ResizeItem(i,45dip)";
_clv._resizeitem(_i,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (45)));
 }else {
RDebugUtils.currentLine=21364860;
 //BA.debugLineNum = 21364860;BA.debugLine="clv.ResizeItem(i,35dip)";
_clv._resizeitem(_i,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (35)));
 }}
;
 }
};
 } 
       catch (Exception e125) {
			ba.setLastException(e125);RDebugUtils.currentLine=21364864;
 //BA.debugLineNum = 21364864;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=21364865;
 //BA.debugLineNum = 21364865;BA.debugLine="fx.msgbox(MainForm,\"GetCameraInfo LastException:";
_fx.Msgbox(_mainform,"GetCameraInfo LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 };
RDebugUtils.currentLine=21364867;
 //BA.debugLineNum = 21364867;BA.debugLine="End Sub";
return "";
}
public static String  _getcommandid(String _json) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getcommandid", false))
	 {return ((String) Debug.delegate(ba, "getcommandid", new Object[] {_json}));}
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
RDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Sub GetCommandID(json As String)";
RDebugUtils.currentLine=21168129;
 //BA.debugLineNum = 21168129;BA.debugLine="Try";
try {RDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=21168131;
 //BA.debugLineNum = 21168131;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=21168132;
 //BA.debugLineNum = 21168132;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=21168147;
 //BA.debugLineNum = 21168147;BA.debugLine="commandID = root.Get(\"id\")";
_commandid = BA.ObjectToString(_root.Get((Object)("id")));
RDebugUtils.currentLine=21168148;
 //BA.debugLineNum = 21168148;BA.debugLine="Log(\"commandID: \" & commandID)";
anywheresoftware.b4a.keywords.Common.Log("commandID: "+_commandid);
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=21168170;
 //BA.debugLineNum = 21168170;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=21168171;
 //BA.debugLineNum = 21168171;BA.debugLine="fx.msgbox(MainForm,\"GetCommandID LastException:";
_fx.Msgbox(_mainform,"GetCommandID LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 };
RDebugUtils.currentLine=21168173;
 //BA.debugLineNum = 21168173;BA.debugLine="End Sub";
return "";
}
public static String  _getcommandstatus(String _json) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getcommandstatus", false))
	 {return ((String) Debug.delegate(ba, "getcommandstatus", new Object[] {_json}));}
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
RDebugUtils.currentLine=21233664;
 //BA.debugLineNum = 21233664;BA.debugLine="Sub GetCommandStatus(json As String)";
RDebugUtils.currentLine=21233665;
 //BA.debugLineNum = 21233665;BA.debugLine="Try";
try {RDebugUtils.currentLine=21233666;
 //BA.debugLineNum = 21233666;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=21233667;
 //BA.debugLineNum = 21233667;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=21233668;
 //BA.debugLineNum = 21233668;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=21233669;
 //BA.debugLineNum = 21233669;BA.debugLine="commandComplete = root.Get(\"complete\")";
_commandcomplete = BA.ObjectToBoolean(_root.Get((Object)("complete")));
RDebugUtils.currentLine=21233670;
 //BA.debugLineNum = 21233670;BA.debugLine="Log(\"commandComplete: \" & commandComplete)";
anywheresoftware.b4a.keywords.Common.Log("commandComplete: "+BA.ObjectToString(_commandcomplete));
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=21233672;
 //BA.debugLineNum = 21233672;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=21233673;
 //BA.debugLineNum = 21233673;BA.debugLine="fx.msgbox(MainForm,\"GetCommandStatus LastExcepti";
_fx.Msgbox(_mainform,"GetCommandStatus LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 };
RDebugUtils.currentLine=21233675;
 //BA.debugLineNum = 21233675;BA.debugLine="End Sub";
return "";
}
public static String  _getliveview(String _json) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getliveview", false))
	 {return ((String) Debug.delegate(ba, "getliveview", new Object[] {_json}));}
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
int _duration = 0;
String _server = "";
String _device_name = "";
int _network_id = 0;
int _continue_interval = 0;
int _continue_warning = 0;
int _id = 0;
String _submit_logs = "";
String _camera_name = "";
String _lv_save = "";
anywheresoftware.b4j.objects.MediaPlayerWrapper _mp = null;
RDebugUtils.currentLine=22740992;
 //BA.debugLineNum = 22740992;BA.debugLine="Sub GetLiveView(json As String)";
RDebugUtils.currentLine=22740993;
 //BA.debugLineNum = 22740993;BA.debugLine="Try";
try {RDebugUtils.currentLine=22740994;
 //BA.debugLineNum = 22740994;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=22740995;
 //BA.debugLineNum = 22740995;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=22740996;
 //BA.debugLineNum = 22740996;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=22740997;
 //BA.debugLineNum = 22740997;BA.debugLine="Dim duration As Int = root.Get(\"duration\")";
_duration = (int)(BA.ObjectToNumber(_root.Get((Object)("duration"))));
RDebugUtils.currentLine=22740998;
 //BA.debugLineNum = 22740998;BA.debugLine="Dim server As String = root.Get(\"server\")";
_server = BA.ObjectToString(_root.Get((Object)("server")));
RDebugUtils.currentLine=22740999;
 //BA.debugLineNum = 22740999;BA.debugLine="Dim device_name As String = root.Get(\"device_nam";
_device_name = BA.ObjectToString(_root.Get((Object)("device_name")));
RDebugUtils.currentLine=22741000;
 //BA.debugLineNum = 22741000;BA.debugLine="Dim network_id As Int = root.Get(\"network_id\")";
_network_id = (int)(BA.ObjectToNumber(_root.Get((Object)("network_id"))));
RDebugUtils.currentLine=22741001;
 //BA.debugLineNum = 22741001;BA.debugLine="Dim continue_interval As Int = root.Get(\"continu";
_continue_interval = (int)(BA.ObjectToNumber(_root.Get((Object)("continue_interval"))));
RDebugUtils.currentLine=22741002;
 //BA.debugLineNum = 22741002;BA.debugLine="Dim continue_warning As Int = root.Get(\"continue";
_continue_warning = (int)(BA.ObjectToNumber(_root.Get((Object)("continue_warning"))));
RDebugUtils.currentLine=22741003;
 //BA.debugLineNum = 22741003;BA.debugLine="Dim id As Int = root.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_root.Get((Object)("id"))));
RDebugUtils.currentLine=22741004;
 //BA.debugLineNum = 22741004;BA.debugLine="Dim submit_logs As String = root.Get(\"submit_log";
_submit_logs = BA.ObjectToString(_root.Get((Object)("submit_logs")));
RDebugUtils.currentLine=22741005;
 //BA.debugLineNum = 22741005;BA.debugLine="Dim camera_name As String = root.Get(\"camera_nam";
_camera_name = BA.ObjectToString(_root.Get((Object)("camera_name")));
RDebugUtils.currentLine=22741006;
 //BA.debugLineNum = 22741006;BA.debugLine="Dim lv_save As String = root.Get(\"lv_save\")";
_lv_save = BA.ObjectToString(_root.Get((Object)("lv_save")));
RDebugUtils.currentLine=22741007;
 //BA.debugLineNum = 22741007;BA.debugLine="Log(\"Liveview: \" & server)";
anywheresoftware.b4a.keywords.Common.Log("Liveview: "+_server);
RDebugUtils.currentLine=22741008;
 //BA.debugLineNum = 22741008;BA.debugLine="Dim mp As MediaPlayer";
_mp = new anywheresoftware.b4j.objects.MediaPlayerWrapper();
RDebugUtils.currentLine=22741009;
 //BA.debugLineNum = 22741009;BA.debugLine="mp.Initialize(\"mp\", server)";
_mp.Initialize(ba,"mp",_server);
RDebugUtils.currentLine=22741010;
 //BA.debugLineNum = 22741010;BA.debugLine="mp.Play";
_mp.Play();
 } 
       catch (Exception e20) {
			ba.setLastException(e20);RDebugUtils.currentLine=22741012;
 //BA.debugLineNum = 22741012;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=22741013;
 //BA.debugLineNum = 22741013;BA.debugLine="fx.msgbox(MainForm,\"GetCommandStatus LastExcepti";
_fx.Msgbox(_mainform,"GetCommandStatus LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 };
RDebugUtils.currentLine=22741015;
 //BA.debugLineNum = 22741015;BA.debugLine="End Sub";
return "";
}
public static String  _getsyncmoduleinfo(String _json) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getsyncmoduleinfo", false))
	 {return ((String) Debug.delegate(ba, "getsyncmoduleinfo", new Object[] {_json}));}
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.Map _syncmodule = null;
int _wifi_strength = 0;
String _os_version = "";
String _fw_version = "";
String _status = "";
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Sub GetSyncModuleInfo(json As String)";
RDebugUtils.currentLine=21430273;
 //BA.debugLineNum = 21430273;BA.debugLine="Try";
try {RDebugUtils.currentLine=21430274;
 //BA.debugLineNum = 21430274;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=21430275;
 //BA.debugLineNum = 21430275;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=21430276;
 //BA.debugLineNum = 21430276;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=21430277;
 //BA.debugLineNum = 21430277;BA.debugLine="Dim syncmodule As Map = root.Get(\"syncmodule\")";
_syncmodule = new anywheresoftware.b4a.objects.collections.Map();
_syncmodule.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("syncmodule"))));
RDebugUtils.currentLine=21430281;
 //BA.debugLineNum = 21430281;BA.debugLine="Dim wifi_strength As Int = syncmodule.Get(\"wifi_";
_wifi_strength = (int)(BA.ObjectToNumber(_syncmodule.Get((Object)("wifi_strength"))));
RDebugUtils.currentLine=21430282;
 //BA.debugLineNum = 21430282;BA.debugLine="Dim os_version As String = syncmodule.Get(\"os_ve";
_os_version = BA.ObjectToString(_syncmodule.Get((Object)("os_version")));
RDebugUtils.currentLine=21430299;
 //BA.debugLineNum = 21430299;BA.debugLine="Dim fw_version As String = syncmodule.Get(\"fw_ve";
_fw_version = BA.ObjectToString(_syncmodule.Get((Object)("fw_version")));
RDebugUtils.currentLine=21430301;
 //BA.debugLineNum = 21430301;BA.debugLine="Dim status As String = syncmodule.Get(\"status\")";
_status = BA.ObjectToString(_syncmodule.Get((Object)("status")));
RDebugUtils.currentLine=21430302;
 //BA.debugLineNum = 21430302;BA.debugLine="lblSyncModule.Text = \"Sync Module is \" & status";
_lblsyncmodule.setText("Sync Module is "+_status+anywheresoftware.b4a.keywords.Common.CRLF+"Wifi Strength: "+BA.NumberToString(_wifi_strength)+" bars"+anywheresoftware.b4a.keywords.Common.CRLF+"Firmware version: "+_fw_version+anywheresoftware.b4a.keywords.Common.CRLF+"OS version: "+_os_version);
RDebugUtils.currentLine=21430304;
 //BA.debugLineNum = 21430304;BA.debugLine="If status = \"online\" Then";
if ((_status).equals("online")) { 
RDebugUtils.currentLine=21430305;
 //BA.debugLineNum = 21430305;BA.debugLine="ivSyncModule.SetImage(fx.LoadImage(File.DirAsse";
_ivsyncmodule.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"systemstatusonline.png").getObject()));
 }else {
RDebugUtils.currentLine=21430307;
 //BA.debugLineNum = 21430307;BA.debugLine="ivSyncModule.SetImage(fx.LoadImage(File.DirAsse";
_ivsyncmodule.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"systemstatusoffline.png").getObject()));
 };
RDebugUtils.currentLine=21430310;
 //BA.debugLineNum = 21430310;BA.debugLine="If wifi_strength = \"5\" Then";
if (_wifi_strength==(double)(Double.parseDouble("5"))) { 
RDebugUtils.currentLine=21430311;
 //BA.debugLineNum = 21430311;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
_ivsyncmodulewifi.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bars5blue.png").getObject()));
 }else 
{RDebugUtils.currentLine=21430312;
 //BA.debugLineNum = 21430312;BA.debugLine="Else If wifi_strength = \"4\" Then";
if (_wifi_strength==(double)(Double.parseDouble("4"))) { 
RDebugUtils.currentLine=21430313;
 //BA.debugLineNum = 21430313;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
_ivsyncmodulewifi.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bars4blue.png").getObject()));
 }else 
{RDebugUtils.currentLine=21430314;
 //BA.debugLineNum = 21430314;BA.debugLine="Else If wifi_strength = \"3\" Then";
if (_wifi_strength==(double)(Double.parseDouble("3"))) { 
RDebugUtils.currentLine=21430315;
 //BA.debugLineNum = 21430315;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
_ivsyncmodulewifi.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bars3blue.png").getObject()));
 }else 
{RDebugUtils.currentLine=21430316;
 //BA.debugLineNum = 21430316;BA.debugLine="Else If wifi_strength = \"2\" Then";
if (_wifi_strength==(double)(Double.parseDouble("2"))) { 
RDebugUtils.currentLine=21430317;
 //BA.debugLineNum = 21430317;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
_ivsyncmodulewifi.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bars2blue.png").getObject()));
 }}}}
;
 } 
       catch (Exception e26) {
			ba.setLastException(e26);RDebugUtils.currentLine=21430320;
 //BA.debugLineNum = 21430320;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=21430321;
 //BA.debugLineNum = 21430321;BA.debugLine="fx.msgbox(MainForm,\"GetSyncModuleInfo LastExcept";
_fx.Msgbox(_mainform,"GetSyncModuleInfo LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 };
RDebugUtils.currentLine=21430323;
 //BA.debugLineNum = 21430323;BA.debugLine="End Sub";
return "";
}
public static String  _getuserinfo(String _json) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getuserinfo", false))
	 {return ((String) Debug.delegate(ba, "getuserinfo", new Object[] {_json}));}
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
RDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Sub GetUserInfo(json As String)";
RDebugUtils.currentLine=21037057;
 //BA.debugLineNum = 21037057;BA.debugLine="Try";
try {RDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="lblStatus.Text = \"Getting user information...\"";
_lblstatus.setText("Getting user information...");
RDebugUtils.currentLine=21037059;
 //BA.debugLineNum = 21037059;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=21037060;
 //BA.debugLineNum = 21037060;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=21037061;
 //BA.debugLineNum = 21037061;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=21037076;
 //BA.debugLineNum = 21037076;BA.debugLine="accountID = root.Get(\"account_id\") '88438";
_accountid = BA.ObjectToString(_root.Get((Object)("account_id")));
RDebugUtils.currentLine=21037077;
 //BA.debugLineNum = 21037077;BA.debugLine="Log(\"accountID: \" &  accountID)";
anywheresoftware.b4a.keywords.Common.Log("accountID: "+_accountid);
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=21037080;
 //BA.debugLineNum = 21037080;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=21037081;
 //BA.debugLineNum = 21037081;BA.debugLine="fx.msgbox(MainForm,\"GetUserInfo LastException: \"";
_fx.Msgbox(_mainform,"GetUserInfo LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 };
RDebugUtils.currentLine=21037083;
 //BA.debugLineNum = 21037083;BA.debugLine="End Sub";
return "";
}
public static String  _ivclose_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "ivclose_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "ivclose_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Private Sub ivClose_MouseClicked (EventData As Mou";
RDebugUtils.currentLine=21757953;
 //BA.debugLineNum = 21757953;BA.debugLine="File.Delete(File.DirApp, \"Driveway.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Driveway.jpg");
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="File.Delete(File.DirApp, \"FrontDoor.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"FrontDoor.jpg");
RDebugUtils.currentLine=21757955;
 //BA.debugLineNum = 21757955;BA.debugLine="File.Delete(File.DirApp, \"SideYard.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"SideYard.jpg");
RDebugUtils.currentLine=21757956;
 //BA.debugLineNum = 21757956;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"screenshot.jpg");
RDebugUtils.currentLine=21757957;
 //BA.debugLineNum = 21757957;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"media.mp4");
RDebugUtils.currentLine=21757958;
 //BA.debugLineNum = 21757958;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=21757959;
 //BA.debugLineNum = 21757959;BA.debugLine="End Sub";
return "";
}
public static void  _ivdriveway_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "ivdriveway_mouseclicked", false))
	 {Debug.delegate(ba, "ivdriveway_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_ivDriveway_MouseClicked rsub = new ResumableSub_ivDriveway_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_ivDriveway_MouseClicked extends BA.ResumableSub {
public ResumableSub_ivDriveway_MouseClicked(cloyd.blink.main parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
cloyd.blink.main parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=22675508;
 //BA.debugLineNum = 22675508;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
RDebugUtils.currentLine=22675509;
 //BA.debugLineNum = 22675509;BA.debugLine="RESTPost(\"https://rest-\" & userRegion & \".immedi";
_restpost("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/arm");
RDebugUtils.currentLine=22675511;
 //BA.debugLineNum = 22675511;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "ivdriveway_mouseclicked"),(int) (1000));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
RDebugUtils.currentLine=22675512;
 //BA.debugLineNum = 22675512;BA.debugLine="File.WriteString(File.DirApp,\"response_arm.txt\",";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"response_arm.txt",parent._response);
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=22675531;
 //BA.debugLineNum = 22675531;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=22675536;
 //BA.debugLineNum = 22675536;BA.debugLine="End Sub";
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
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "restpost", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "restpost", new Object[] {_url}));}
ResumableSub_RESTPost rsub = new ResumableSub_RESTPost(null,_url);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RESTPost extends BA.ResumableSub {
public ResumableSub_RESTPost(cloyd.blink.main parent,String _url) {
this.parent = parent;
this._url = _url;
}
cloyd.blink.main parent;
String _url;
cloyd.blink.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=20840449;
 //BA.debugLineNum = 20840449;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 15;
this.catchState = 14;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 14;
RDebugUtils.currentLine=20840450;
 //BA.debugLineNum = 20840450;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
RDebugUtils.currentLine=20840451;
 //BA.debugLineNum = 20840451;BA.debugLine="response = \"\"";
parent._response = "";
RDebugUtils.currentLine=20840452;
 //BA.debugLineNum = 20840452;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no";
_j._initialize /*String*/ (null,ba,"",main.getObject());
RDebugUtils.currentLine=20840453;
 //BA.debugLineNum = 20840453;BA.debugLine="j.PostString(url,\"\")";
_j._poststring /*String*/ (null,_url,"");
RDebugUtils.currentLine=20840454;
 //BA.debugLineNum = 20840454;BA.debugLine="j.GetRequest.SetContentType(\"application/x-www-f";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/x-www-form-urlencoded");
RDebugUtils.currentLine=20840455;
 //BA.debugLineNum = 20840455;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("TOKEN_AUTH",parent._authtoken);
RDebugUtils.currentLine=20840456;
 //BA.debugLineNum = 20840456;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "restpost"), (Object)(_j));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[0];
;
RDebugUtils.currentLine=20840457;
 //BA.debugLineNum = 20840457;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=20840458;
 //BA.debugLineNum = 20840458;BA.debugLine="response = j.GetString";
parent._response = _j._getstring /*String*/ (null);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=20840460;
 //BA.debugLineNum = 20840460;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
parent._response = "ERROR: "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=20840461;
 //BA.debugLineNum = 20840461;BA.debugLine="lblStatus.Text = GetRESTError(j.ErrorMessage)";
parent._lblstatus.setText(_getresterror(_j._errormessage /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=20840463;
 //BA.debugLineNum = 20840463;BA.debugLine="If response.Contains(\"System is busy, please wai";

case 9:
//if
this.state = 12;
if (parent._response.contains("System is busy, please wait")) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=20840464;
 //BA.debugLineNum = 20840464;BA.debugLine="lblStatus.Text = \"System is busy, please wait\"";
parent._lblstatus.setText("System is busy, please wait");
 if (true) break;

case 12:
//C
this.state = 15;
;
RDebugUtils.currentLine=20840466;
 //BA.debugLineNum = 20840466;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
RDebugUtils.currentLine=20840468;
 //BA.debugLineNum = 20840468;BA.debugLine="response = \"ERROR: \" & LastException";
parent._response = "ERROR: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba));
RDebugUtils.currentLine=20840469;
 //BA.debugLineNum = 20840469;BA.debugLine="Log(\"RESTPost LastException: \" & LastException)";
anywheresoftware.b4a.keywords.Common.Log("RESTPost LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=20840470;
 //BA.debugLineNum = 20840470;BA.debugLine="fx.msgbox(MainForm,\"RESTPost LastException: \" &";
parent._fx.Msgbox(parent._mainform,"RESTPost LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),parent._mainform.getTitle());
 if (true) break;
if (true) break;

case 15:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=20840472;
 //BA.debugLineNum = 20840472;BA.debugLine="Log(\"URL: \" & url)";
anywheresoftware.b4a.keywords.Common.Log("URL: "+_url);
RDebugUtils.currentLine=20840473;
 //BA.debugLineNum = 20840473;BA.debugLine="Log(\"Response: \" & response)";
anywheresoftware.b4a.keywords.Common.Log("Response: "+parent._response);
RDebugUtils.currentLine=20840474;
 //BA.debugLineNum = 20840474;BA.debugLine="Return(response)";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)((parent._response)));return;};
RDebugUtils.currentLine=20840475;
 //BA.debugLineNum = 20840475;BA.debugLine="End Sub";
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
public static String  _ivfrontdoor_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "ivfrontdoor_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "ivfrontdoor_mouseclicked", new Object[] {_eventdata}));}
cloyd.blink.frmmedia _mf = null;
RDebugUtils.currentLine=22806528;
 //BA.debugLineNum = 22806528;BA.debugLine="Sub ivFrontDoor_MouseClicked (EventData As MouseEv";
RDebugUtils.currentLine=22806529;
 //BA.debugLineNum = 22806529;BA.debugLine="Dim mf As frmMedia";
_mf = new cloyd.blink.frmmedia();
RDebugUtils.currentLine=22806530;
 //BA.debugLineNum = 22806530;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (null,ba,_mainform);
RDebugUtils.currentLine=22806531;
 //BA.debugLineNum = 22806531;BA.debugLine="mf.timestamp = lblFrontDoor.Text";
_mf._timestamp /*String*/  = _lblfrontdoor.getText();
RDebugUtils.currentLine=22806532;
 //BA.debugLineNum = 22806532;BA.debugLine="mf.url=$\"    <h1>${lblFrontDoor.Text}</h1>    <im";
_mf._url /*String*/  = ("\n"+"   <h1>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lblfrontdoor.getText()))+"</h1>\n"+"   <img src=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"FrontDoor.jpg")))+"\"/>\n"+"   \n"+"");
RDebugUtils.currentLine=22806537;
 //BA.debugLineNum = 22806537;BA.debugLine="mf.Show";
_mf._show /*String*/ (null);
RDebugUtils.currentLine=22806538;
 //BA.debugLineNum = 22806538;BA.debugLine="End Sub";
return "";
}
public static String  _ivmax_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "ivmax_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "ivmax_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Private Sub ivMax_MouseClicked (EventData As Mouse";
RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="End Sub";
return "";
}
public static String  _ivmin_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "ivmin_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "ivmin_mouseclicked", new Object[] {_eventdata}));}
anywheresoftware.b4j.object.JavaObject _jmf = null;
anywheresoftware.b4j.object.JavaObject _stage = null;
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Private Sub ivMin_MouseClicked (EventData As Mouse";
RDebugUtils.currentLine=22151169;
 //BA.debugLineNum = 22151169;BA.debugLine="Try";
try {RDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="Dim jmf As JavaObject = MainForm";
_jmf = new anywheresoftware.b4j.object.JavaObject();
_jmf.setObject((java.lang.Object)(_mainform));
RDebugUtils.currentLine=22151171;
 //BA.debugLineNum = 22151171;BA.debugLine="Dim stage As JavaObject = jmf.GetField(\"stage\")";
_stage = new anywheresoftware.b4j.object.JavaObject();
_stage.setObject((java.lang.Object)(_jmf.GetField("stage")));
RDebugUtils.currentLine=22151172;
 //BA.debugLineNum = 22151172;BA.debugLine="stage.RunMethod(\"setIconified\", Array As Object(";
_stage.RunMethod("setIconified",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.True)});
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=22151174;
 //BA.debugLineNum = 22151174;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=22151176;
 //BA.debugLineNum = 22151176;BA.debugLine="End Sub";
return "";
}
public static String  _ivsideyard_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "ivsideyard_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "ivsideyard_mouseclicked", new Object[] {_eventdata}));}
cloyd.blink.frmmedia _mf = null;
RDebugUtils.currentLine=22872064;
 //BA.debugLineNum = 22872064;BA.debugLine="Sub ivSideYard_MouseClicked (EventData As MouseEve";
RDebugUtils.currentLine=22872065;
 //BA.debugLineNum = 22872065;BA.debugLine="Dim mf As frmMedia";
_mf = new cloyd.blink.frmmedia();
RDebugUtils.currentLine=22872066;
 //BA.debugLineNum = 22872066;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (null,ba,_mainform);
RDebugUtils.currentLine=22872067;
 //BA.debugLineNum = 22872067;BA.debugLine="mf.timestamp = lblSideYard.Text";
_mf._timestamp /*String*/  = _lblsideyard.getText();
RDebugUtils.currentLine=22872068;
 //BA.debugLineNum = 22872068;BA.debugLine="mf.url=$\"    <h1>${lblSideYard.Text}</h1>    <img";
_mf._url /*String*/  = ("\n"+"   <h1>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lblsideyard.getText()))+"</h1>\n"+"   <img src=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"SideYard.jpg")))+"\"/>\n"+"   \n"+"");
RDebugUtils.currentLine=22872073;
 //BA.debugLineNum = 22872073;BA.debugLine="mf.Show";
_mf._show /*String*/ (null);
RDebugUtils.currentLine=22872074;
 //BA.debugLineNum = 22872074;BA.debugLine="End Sub";
return "";
}
public static String  _lbtitle_mousedragged(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "lbtitle_mousedragged", false))
	 {return ((String) Debug.delegate(ba, "lbtitle_mousedragged", new Object[] {_eventdata}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Private Sub lbTitle_MouseDragged (EventData As Mou";
RDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="Try";
try {RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="If isMaximized Then Return";
if (_ismaximized) { 
if (true) return "";};
RDebugUtils.currentLine=21626883;
 //BA.debugLineNum = 21626883;BA.debugLine="Dim jo As JavaObject = EventData";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_eventdata.getObject()));
RDebugUtils.currentLine=21626884;
 //BA.debugLineNum = 21626884;BA.debugLine="MainForm.WindowLeft = jo.RunMethod(\"getScreenX\",";
_mainform.setWindowLeft((double)(BA.ObjectToNumber(_jo.RunMethod("getScreenX",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))-_xmouse);
RDebugUtils.currentLine=21626885;
 //BA.debugLineNum = 21626885;BA.debugLine="MainForm.WindowTop = jo.RunMethod(\"getScreenY\",";
_mainform.setWindowTop((double)(BA.ObjectToNumber(_jo.RunMethod("getScreenY",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))-_ymouse);
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=21626887;
 //BA.debugLineNum = 21626887;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=21626889;
 //BA.debugLineNum = 21626889;BA.debugLine="End Sub";
return "";
}
public static String  _lbtitle_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "lbtitle_mousepressed", false))
	 {return ((String) Debug.delegate(ba, "lbtitle_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Private Sub lbTitle_MousePressed (EventData As Mou";
RDebugUtils.currentLine=21692417;
 //BA.debugLineNum = 21692417;BA.debugLine="Try";
try {RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="xMouse = EventData.X + lbTitle.Left + 15";
_xmouse = _eventdata.getX()+_lbtitle.getLeft()+15;
RDebugUtils.currentLine=21692419;
 //BA.debugLineNum = 21692419;BA.debugLine="yMouse = EventData.Y + lbTitle.Top + 15";
_ymouse = _eventdata.getY()+_lbtitle.getTop()+15;
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=21692421;
 //BA.debugLineNum = 21692421;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=21692423;
 //BA.debugLineNum = 21692423;BA.debugLine="End Sub";
return "";
}
public static String  _max_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "max_entered_event", false))
	 {return ((String) Debug.delegate(ba, "max_entered_event", new Object[] {_e}));}
RDebugUtils.currentLine=22020096;
 //BA.debugLineNum = 22020096;BA.debugLine="Private Sub Max_Entered_Event(e As Event)";
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="Try";
try {RDebugUtils.currentLine=22020098;
 //BA.debugLineNum = 22020098;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmax.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMaxEnt.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=22020100;
 //BA.debugLineNum = 22020100;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=22020102;
 //BA.debugLineNum = 22020102;BA.debugLine="End Sub";
return "";
}
public static String  _max_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "max_exited_event", false))
	 {return ((String) Debug.delegate(ba, "max_exited_event", new Object[] {_e}));}
RDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Private Sub Max_Exited_Event(e As Event)";
RDebugUtils.currentLine=22085633;
 //BA.debugLineNum = 22085633;BA.debugLine="Try";
try {RDebugUtils.currentLine=22085634;
 //BA.debugLineNum = 22085634;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmax.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMax.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=22085636;
 //BA.debugLineNum = 22085636;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=22085638;
 //BA.debugLineNum = 22085638;BA.debugLine="End Sub";
return "";
}
public static String  _min_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "min_entered_event", false))
	 {return ((String) Debug.delegate(ba, "min_entered_event", new Object[] {_e}));}
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Private Sub Min_Entered_Event(e As Event)";
RDebugUtils.currentLine=22216705;
 //BA.debugLineNum = 22216705;BA.debugLine="Try";
try {RDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmin.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMinEnt.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=22216708;
 //BA.debugLineNum = 22216708;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=22216710;
 //BA.debugLineNum = 22216710;BA.debugLine="End Sub";
return "";
}
public static String  _min_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "min_exited_event", false))
	 {return ((String) Debug.delegate(ba, "min_exited_event", new Object[] {_e}));}
RDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Private Sub Min_Exited_Event(e As Event)";
RDebugUtils.currentLine=22282241;
 //BA.debugLineNum = 22282241;BA.debugLine="Try";
try {RDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmin.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMin.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=22282244;
 //BA.debugLineNum = 22282244;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=22282246;
 //BA.debugLineNum = 22282246;BA.debugLine="End Sub";
return "";
}
}