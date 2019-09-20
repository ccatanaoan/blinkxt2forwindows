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
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static cloyd.blink.httputils2service _httputils2service = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "application_error", false))
	 {return ((Boolean) Debug.delegate(ba, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="File.WriteString(File.DirApp, \"skin.ini\", \"vdSk";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"skin.ini","vdSk03");
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
 //BA.debugLineNum = 65592;BA.debugLine="RequestAuthToken";
_requestauthtoken();
 } 
       catch (Exception e50) {
			ba.setLastException(e50);RDebugUtils.currentLine=65594;
 //BA.debugLineNum = 65594;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=65597;
 //BA.debugLineNum = 65597;BA.debugLine="End Sub";
return "";
}
public static String  _get_css() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "get_css", false))
	 {return ((String) Debug.delegate(ba, "get_css", null));}
anywheresoftware.b4j.object.JavaObject _jform = null;
anywheresoftware.b4j.object.JavaObject _scene = null;
anywheresoftware.b4a.objects.collections.List _stylesheets = null;
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub Get_css";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Try";
try {RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Dim jForm As JavaObject = MainForm";
_jform = new anywheresoftware.b4j.object.JavaObject();
_jform.setObject((java.lang.Object)(_mainform));
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="Dim scene As JavaObject = jForm.GetField(\"scene\"";
_scene = new anywheresoftware.b4j.object.JavaObject();
_scene.setObject((java.lang.Object)(_jform.GetField("scene")));
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="Dim stylesheets As List = scene.RunMethod(\"getSt";
_stylesheets = new anywheresoftware.b4a.objects.collections.List();
_stylesheets.setObject((java.util.List)(_scene.RunMethod("getStylesheets",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="stylesheets.Clear";
_stylesheets.Clear();
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="stylesheets.Add(File.GetUri(File.DirAssets, imgI";
_stylesheets.Add((Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+".css")));
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.JFX.ScreenWrapper  _checkmonitor() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "checkmonitor", false))
	 {return ((anywheresoftware.b4j.objects.JFX.ScreenWrapper) Debug.delegate(ba, "checkmonitor", null));}
anywheresoftware.b4a.objects.collections.List _slist = null;
anywheresoftware.b4j.objects.JFX.ScreenWrapper _s = null;
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub CheckMonitor() As Screen";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Try";
try {RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="If fx.Screens.Size= 1 Then";
if (_fx.getScreens().getSize()==1) { 
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="Return S";
if (true) return _s;
 }else 
{RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="Else If fx.Screens.Size> 1 Then";
if (_fx.getScreens().getSize()>1) { 
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
RDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="Dim S As Screen = SList.Get(2)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (2))));
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="Return S";
if (true) return _s;
 }else {
RDebugUtils.currentLine=1966093;
 //BA.debugLineNum = 1966093;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
RDebugUtils.currentLine=1966094;
 //BA.debugLineNum = 1966094;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=1966096;
 //BA.debugLineNum = 1966096;BA.debugLine="Return S";
if (true) return _s;
 }}
;
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=1966099;
 //BA.debugLineNum = 1966099;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
RDebugUtils.currentLine=1966100;
 //BA.debugLineNum = 1966100;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=1966102;
 //BA.debugLineNum = 1966102;BA.debugLine="Return S";
if (true) return _s;
 };
RDebugUtils.currentLine=1966104;
 //BA.debugLineNum = 1966104;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=262150;
 //BA.debugLineNum = 262150;BA.debugLine="Try";
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
RDebugUtils.currentLine=262151;
 //BA.debugLineNum = 262151;BA.debugLine="lblStatus.Text = \"Authenticating...\"";
parent._lblstatus.setText("Authenticating...");
RDebugUtils.currentLine=262152;
 //BA.debugLineNum = 262152;BA.debugLine="Dim jobLogin As HttpJob";
_joblogin = new cloyd.blink.httpjob();
RDebugUtils.currentLine=262153;
 //BA.debugLineNum = 262153;BA.debugLine="jobLogin.Initialize(\"\", Me)";
_joblogin._initialize /*String*/ (null,ba,"",main.getObject());
RDebugUtils.currentLine=262154;
 //BA.debugLineNum = 262154;BA.debugLine="jobLogin.PostString(\"https://rest.prod.immedia-s";
_joblogin._poststring /*String*/ (null,"https://rest.prod.immedia-semi.com/login","email="+parent._emailaddress+"&password="+parent._password);
RDebugUtils.currentLine=262155;
 //BA.debugLineNum = 262155;BA.debugLine="jobLogin.GetRequest.SetContentType(\"application/";
_joblogin._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/x-www-form-urlencoded");
RDebugUtils.currentLine=262156;
 //BA.debugLineNum = 262156;BA.debugLine="Wait For (jobLogin) JobDone(jobLogin As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "requestauthtoken"), (Object)(_joblogin));
this.state = 25;
return;
case 25:
//C
this.state = 4;
_joblogin = (cloyd.blink.httpjob) result[0];
;
RDebugUtils.currentLine=262157;
 //BA.debugLineNum = 262157;BA.debugLine="If jobLogin.Success Then";
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
RDebugUtils.currentLine=262158;
 //BA.debugLineNum = 262158;BA.debugLine="lblStatus.Text = \"Successfully logged in to the";
parent._lblstatus.setText("Successfully logged in to the Blink server...");
RDebugUtils.currentLine=262160;
 //BA.debugLineNum = 262160;BA.debugLine="GetAuthInfo(jobLogin.GetString)";
_getauthinfo(_joblogin._getstring /*String*/ (null));
RDebugUtils.currentLine=262162;
 //BA.debugLineNum = 262162;BA.debugLine="RESTGet(\"https://rest-\" & userRegion & \".immedi";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/user");
RDebugUtils.currentLine=262163;
 //BA.debugLineNum = 262163;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "requestauthtoken"),(int) (1000));
this.state = 26;
return;
case 26:
//C
this.state = 7;
;
RDebugUtils.currentLine=262164;
 //BA.debugLineNum = 262164;BA.debugLine="If response.StartsWith(\"ERROR: \") Then";
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
RDebugUtils.currentLine=262165;
 //BA.debugLineNum = 262165;BA.debugLine="Log(response)";
anywheresoftware.b4a.keywords.Common.Log(parent._response);
RDebugUtils.currentLine=262166;
 //BA.debugLineNum = 262166;BA.debugLine="lblStatus.Text = response";
parent._lblstatus.setText(parent._response);
RDebugUtils.currentLine=262167;
 //BA.debugLineNum = 262167;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=262169;
 //BA.debugLineNum = 262169;BA.debugLine="lblStatus.Text = \"AuthToken acquired...\"";
parent._lblstatus.setText("AuthToken acquired...");
RDebugUtils.currentLine=262170;
 //BA.debugLineNum = 262170;BA.debugLine="GetUserInfo(response)";
_getuserinfo(parent._response);
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=262173;
 //BA.debugLineNum = 262173;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/api/v1/camera/usage");
RDebugUtils.currentLine=262174;
 //BA.debugLineNum = 262174;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "requestauthtoken"),(int) (1000));
this.state = 27;
return;
case 27:
//C
this.state = 13;
;
RDebugUtils.currentLine=262175;
 //BA.debugLineNum = 262175;BA.debugLine="If response.StartsWith(\"ERROR: \") Then";
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
RDebugUtils.currentLine=262176;
 //BA.debugLineNum = 262176;BA.debugLine="Log(response)";
anywheresoftware.b4a.keywords.Common.Log(parent._response);
RDebugUtils.currentLine=262177;
 //BA.debugLineNum = 262177;BA.debugLine="lblStatus.Text = response";
parent._lblstatus.setText(parent._response);
RDebugUtils.currentLine=262178;
 //BA.debugLineNum = 262178;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=262180;
 //BA.debugLineNum = 262180;BA.debugLine="GetAllCameras(response)";
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
RDebugUtils.currentLine=262183;
 //BA.debugLineNum = 262183;BA.debugLine="lblStatus.Text = \"RequestAuthToken error: \" & j";
parent._lblstatus.setText("RequestAuthToken error: "+_joblogin._getstring /*String*/ (null));
RDebugUtils.currentLine=262184;
 //BA.debugLineNum = 262184;BA.debugLine="Log(\"RequestAuthToken error: \" & jobLogin.GetSt";
anywheresoftware.b4a.keywords.Common.Log("RequestAuthToken error: "+_joblogin._getstring /*String*/ (null));
RDebugUtils.currentLine=262185;
 //BA.debugLineNum = 262185;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 21:
//C
this.state = 24;
;
RDebugUtils.currentLine=262187;
 //BA.debugLineNum = 262187;BA.debugLine="jobLogin.Release";
_joblogin._release /*String*/ (null);
RDebugUtils.currentLine=262188;
 //BA.debugLineNum = 262188;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
RDebugUtils.currentLine=262190;
 //BA.debugLineNum = 262190;BA.debugLine="RefreshCameras(True)";
_refreshcameras(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
RDebugUtils.currentLine=262192;
 //BA.debugLineNum = 262192;BA.debugLine="lblStatus.Text = \"RequestAuthToken LastException";
parent._lblstatus.setText("RequestAuthToken LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=262193;
 //BA.debugLineNum = 262193;BA.debugLine="Log(\"RequestAuthToken LastException: \" & LastExc";
anywheresoftware.b4a.keywords.Common.Log("RequestAuthToken LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=262195;
 //BA.debugLineNum = 262195;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Private Sub Blur (bmp As B4XBitmap) As B4XBitmap";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Try";
try {RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="Dim ReduceScale As Int = 2";
_reducescale = (int) (2);
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="bc.Initialize(bmp.Width / ReduceScale / bmp.Scal";
_bc._initialize(ba,(int) (_bmp.getWidth()/(double)_reducescale/(double)_bmp.getScale()),(int) (_bmp.getHeight()/(double)_reducescale/(double)_bmp.getScale()));
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="bc.CopyPixelsFromBitmap(bmp)";
_bc._copypixelsfrombitmap(_bmp);
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="Dim count As Int = 3";
_count = (int) (3);
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="Dim clrs(3) As ARGBColor";
_clrs = new b4j.example.bitmapcreator._argbcolor[(int) (3)];
{
int d0 = _clrs.length;
for (int i0 = 0;i0 < d0;i0++) {
_clrs[i0] = new b4j.example.bitmapcreator._argbcolor();
}
}
;
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="Dim temp As ARGBColor";
_temp = new b4j.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="Dim m As Int";
_m = 0;
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="For steps = 1 To count";
{
final int step10 = 1;
final int limit10 = _count;
_steps = (int) (1) ;
for (;_steps <= limit10 ;_steps = _steps + step10 ) {
RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="For y = 0 To bc.mHeight - 1";
{
final int step11 = 1;
final int limit11 = (int) (_bc._mheight-1);
_y = (int) (0) ;
for (;_y <= limit11 ;_y = _y + step11 ) {
RDebugUtils.currentLine=2490380;
 //BA.debugLineNum = 2490380;BA.debugLine="For x = 0 To 2";
{
final int step12 = 1;
final int limit12 = (int) (2);
_x = (int) (0) ;
for (;_x <= limit12 ;_x = _x + step12 ) {
RDebugUtils.currentLine=2490381;
 //BA.debugLineNum = 2490381;BA.debugLine="bc.GetARGB(x, y, clrs(x))";
_bc._getargb(_x,_y,_clrs[_x]);
 }
};
RDebugUtils.currentLine=2490383;
 //BA.debugLineNum = 2490383;BA.debugLine="SetAvg(bc, 1, y, clrs, temp)";
_setavg(_bc,(int) (1),_y,_clrs,_temp);
RDebugUtils.currentLine=2490384;
 //BA.debugLineNum = 2490384;BA.debugLine="m = 0";
_m = (int) (0);
RDebugUtils.currentLine=2490385;
 //BA.debugLineNum = 2490385;BA.debugLine="For x = 2 To bc.mWidth - 2";
{
final int step17 = 1;
final int limit17 = (int) (_bc._mwidth-2);
_x = (int) (2) ;
for (;_x <= limit17 ;_x = _x + step17 ) {
RDebugUtils.currentLine=2490386;
 //BA.debugLineNum = 2490386;BA.debugLine="bc.GetARGB(x + 1, y, clrs(m))";
_bc._getargb((int) (_x+1),_y,_clrs[_m]);
RDebugUtils.currentLine=2490387;
 //BA.debugLineNum = 2490387;BA.debugLine="m = (m + 1) Mod clrs.Length";
_m = (int) ((_m+1)%_clrs.length);
RDebugUtils.currentLine=2490388;
 //BA.debugLineNum = 2490388;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
_setavg(_bc,_x,_y,_clrs,_temp);
 }
};
 }
};
RDebugUtils.currentLine=2490391;
 //BA.debugLineNum = 2490391;BA.debugLine="For x = 0 To bc.mWidth - 1";
{
final int step23 = 1;
final int limit23 = (int) (_bc._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit23 ;_x = _x + step23 ) {
RDebugUtils.currentLine=2490392;
 //BA.debugLineNum = 2490392;BA.debugLine="For y = 0 To 2";
{
final int step24 = 1;
final int limit24 = (int) (2);
_y = (int) (0) ;
for (;_y <= limit24 ;_y = _y + step24 ) {
RDebugUtils.currentLine=2490393;
 //BA.debugLineNum = 2490393;BA.debugLine="bc.GetARGB(x, y, clrs(y))";
_bc._getargb(_x,_y,_clrs[_y]);
 }
};
RDebugUtils.currentLine=2490395;
 //BA.debugLineNum = 2490395;BA.debugLine="SetAvg(bc, x, 1, clrs, temp)";
_setavg(_bc,_x,(int) (1),_clrs,_temp);
RDebugUtils.currentLine=2490396;
 //BA.debugLineNum = 2490396;BA.debugLine="m = 0";
_m = (int) (0);
RDebugUtils.currentLine=2490397;
 //BA.debugLineNum = 2490397;BA.debugLine="For y = 2 To bc.mHeight - 2";
{
final int step29 = 1;
final int limit29 = (int) (_bc._mheight-2);
_y = (int) (2) ;
for (;_y <= limit29 ;_y = _y + step29 ) {
RDebugUtils.currentLine=2490398;
 //BA.debugLineNum = 2490398;BA.debugLine="bc.GetARGB(x, y + 1, clrs(m))";
_bc._getargb(_x,(int) (_y+1),_clrs[_m]);
RDebugUtils.currentLine=2490399;
 //BA.debugLineNum = 2490399;BA.debugLine="m = (m + 1) Mod clrs.Length";
_m = (int) ((_m+1)%_clrs.length);
RDebugUtils.currentLine=2490400;
 //BA.debugLineNum = 2490400;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
_setavg(_bc,_x,_y,_clrs,_temp);
 }
};
 }
};
 }
};
 } 
       catch (Exception e37) {
			ba.setLastException(e37);RDebugUtils.currentLine=2490405;
 //BA.debugLineNum = 2490405;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=2490406;
 //BA.debugLineNum = 2490406;BA.debugLine="lblStatus.Text = \"Blur LastException: \" & LastEx";
_lblstatus.setText("Blur LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=2490408;
 //BA.debugLineNum = 2490408;BA.debugLine="Return bc.Bitmap";
if (true) return _bc._getbitmap();
RDebugUtils.currentLine=2490409;
 //BA.debugLineNum = 2490409;BA.debugLine="End Sub";
return null;
}
public static String  _setavg(b4j.example.bitmapcreator _bc,int _x,int _y,b4j.example.bitmapcreator._argbcolor[] _clrs,b4j.example.bitmapcreator._argbcolor _temp) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "setavg", false))
	 {return ((String) Debug.delegate(ba, "setavg", new Object[] {_bc,_x,_y,_clrs,_temp}));}
b4j.example.bitmapcreator._argbcolor _c = null;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub SetAvg(bc As BitmapCreator, x As Int,";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Try";
try {RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="temp.Initialize";
_temp.Initialize();
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="For Each c As ARGBColor In clrs";
{
final b4j.example.bitmapcreator._argbcolor[] group3 = _clrs;
final int groupLen3 = group3.length
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_c = group3[index3];
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="temp.r = temp.r + c.r";
_temp.r = (int) (_temp.r+_c.r);
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="temp.g = temp.g + c.g";
_temp.g = (int) (_temp.g+_c.g);
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="temp.b = temp.b + c.b";
_temp.b = (int) (_temp.b+_c.b);
 }
};
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="temp.a = 255";
_temp.a = (int) (255);
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="temp.r = temp.r / clrs.Length";
_temp.r = (int) (_temp.r/(double)_clrs.length);
RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="temp.g = temp.g / clrs.Length";
_temp.g = (int) (_temp.g/(double)_clrs.length);
RDebugUtils.currentLine=2555915;
 //BA.debugLineNum = 2555915;BA.debugLine="temp.b = temp.b / clrs.Length";
_temp.b = (int) (_temp.b/(double)_clrs.length);
RDebugUtils.currentLine=2555916;
 //BA.debugLineNum = 2555916;BA.debugLine="bc.SetARGB(x, y, temp)";
_bc._setargb(_x,_y,_temp);
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=2555918;
 //BA.debugLineNum = 2555918;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=2555919;
 //BA.debugLineNum = 2555919;BA.debugLine="lblStatus.Text = \"SetAvg LastException: \" & Last";
_lblstatus.setText("SetAvg LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=2555921;
 //BA.debugLineNum = 2555921;BA.debugLine="End Sub";
return "";
}
public static String  _bluriv(String _image,anywheresoftware.b4j.objects.ImageViewWrapper _iv) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "bluriv", false))
	 {return ((String) Debug.delegate(ba, "bluriv", new Object[] {_image,_iv}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub BlurIV (image As String,iv As ImageView)";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Try";
try {RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Dim bmp As B4XBitmap = xui.LoadBitmapResize(File";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _xui.LoadBitmapResize(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_image,(int) (_iv.getWidth()),(int) (_iv.getHeight()),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="iv.SetImage(Blur(bmp))";
_iv.SetImage((javafx.scene.image.Image)(_blur(_bmp).getObject()));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="lblStatus.Text = \"BlurIV LastException: \" & Last";
_lblstatus.setText("BlurIV LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia-s";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/api/v1/accounts/88438/media/changed?since=2019-04-19T23:11:20+0000&page=1");
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btnactivity_click"),(int) (1000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="Dim mf As frmActivity";
_mf = new cloyd.blink.frmactivity();
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (null,ba,parent._mainform);
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="mf.authToken = authToken";
_mf._authtoken /*String*/  = parent._authtoken;
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="mf.Show(response,userRegion)";
_mf._show /*String*/ (null,parent._response,parent._userregion);
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="Try";
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
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="response = \"\"";
parent._response = "";
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no";
_j._initialize /*String*/ (null,ba,"",main.getObject());
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="j.Download(url)";
_j._download /*String*/ (null,_url);
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("TOKEN_AUTH",parent._authtoken);
RDebugUtils.currentLine=393223;
 //BA.debugLineNum = 393223;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "restget"), (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[0];
;
RDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="response = j.GetString";
parent._response = _j._getstring /*String*/ (null);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=393227;
 //BA.debugLineNum = 393227;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
parent._response = "ERROR: "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=393228;
 //BA.debugLineNum = 393228;BA.debugLine="lblStatus.Text = \"ERROR: \" & j.ErrorMessage";
parent._lblstatus.setText("ERROR: "+_j._errormessage /*String*/ );
 if (true) break;

case 9:
//C
this.state = 12;
;
RDebugUtils.currentLine=393230;
 //BA.debugLineNum = 393230;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=393232;
 //BA.debugLineNum = 393232;BA.debugLine="response = \"ERROR: \" & LastException";
parent._response = "ERROR: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba));
RDebugUtils.currentLine=393233;
 //BA.debugLineNum = 393233;BA.debugLine="Log(\"RESTDownload LastException: \" & LastExcepti";
anywheresoftware.b4a.keywords.Common.Log("RESTDownload LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=393234;
 //BA.debugLineNum = 393234;BA.debugLine="lblStatus.Text = \"RESTGet LastException: \" & Las";
parent._lblstatus.setText("RESTGet LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=393236;
 //BA.debugLineNum = 393236;BA.debugLine="Log(\"URL: \" & url)";
anywheresoftware.b4a.keywords.Common.Log("URL: "+_url);
RDebugUtils.currentLine=393237;
 //BA.debugLineNum = 393237;BA.debugLine="Log(\"Response: \" & response)";
anywheresoftware.b4a.keywords.Common.Log("Response: "+parent._response);
RDebugUtils.currentLine=393238;
 //BA.debugLineNum = 393238;BA.debugLine="Return(response)";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)((parent._response)));return;};
RDebugUtils.currentLine=393239;
 //BA.debugLineNum = 393239;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub btnDriveway_Click";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="clvDriveway.Clear";
_clvdriveway._clear();
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="clvFrontDoor.Clear";
_clvfrontdoor._clear();
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="clvSideYard.Clear";
_clvsideyard._clear();
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="RefreshCameras(False)";
_refreshcameras(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="End Sub";
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
String _link = "";
int _i = 0;
anywheresoftware.b4a.BA.IterableList group13;
int index13;
int groupLen13;
int step50;
int limit50;

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
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 66;
this.catchState = 65;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 65;
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="Dim camera As String";
_camera = "";
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="Dim clv As CustomListView";
_clv = new b4j.example.customlistview();
RDebugUtils.currentLine=327690;
 //BA.debugLineNum = 327690;BA.debugLine="Dim links As List";
_links = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=327691;
 //BA.debugLineNum = 327691;BA.debugLine="links = Array(\"347574\", \"236967\", \"226821\")";
_links = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("347574"),(Object)("236967"),(Object)("226821")});
RDebugUtils.currentLine=327693;
 //BA.debugLineNum = 327693;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia-";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/syncmodules");
RDebugUtils.currentLine=327694;
 //BA.debugLineNum = 327694;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"),(int) (1000));
this.state = 67;
return;
case 67:
//C
this.state = 4;
;
RDebugUtils.currentLine=327695;
 //BA.debugLineNum = 327695;BA.debugLine="GetSyncModuleInfo(response)";
_getsyncmoduleinfo(parent._response);
RDebugUtils.currentLine=327697;
 //BA.debugLineNum = 327697;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
_bluriv("Driveway.jpg",parent._ivdriveway);
RDebugUtils.currentLine=327698;
 //BA.debugLineNum = 327698;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
_bluriv("FrontDoor.jpg",parent._ivfrontdoor);
RDebugUtils.currentLine=327699;
 //BA.debugLineNum = 327699;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
_bluriv("SideYard.jpg",parent._ivsideyard);
RDebugUtils.currentLine=327701;
 //BA.debugLineNum = 327701;BA.debugLine="For Each link As String In links";
if (true) break;

case 4:
//for
this.state = 63;
group13 = _links;
index13 = 0;
groupLen13 = group13.getSize();
this.state = 68;
if (true) break;

case 68:
//C
this.state = 63;
if (index13 < groupLen13) {
this.state = 6;
_link = BA.ObjectToString(group13.Get(index13));}
if (true) break;

case 69:
//C
this.state = 68;
index13++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=327702;
 //BA.debugLineNum = 327702;BA.debugLine="camera = link";
_camera = _link;
RDebugUtils.currentLine=327703;
 //BA.debugLineNum = 327703;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 7:
//if
this.state = 14;
if ((_camera).equals("347574")) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=327707;
 //BA.debugLineNum = 327707;BA.debugLine="Else If camera = \"236967\" Then";
if ((_camera).equals("236967")) { 
this.state = 11;
}else 
{RDebugUtils.currentLine=327711;
 //BA.debugLineNum = 327711;BA.debugLine="Else If camera = \"226821\" Then";
if ((_camera).equals("226821")) { 
this.state = 13;
}}}
if (true) break;

case 9:
//C
this.state = 14;
RDebugUtils.currentLine=327704;
 //BA.debugLineNum = 327704;BA.debugLine="lblStatus.Text = \"Capturing a new thumbnail fo";
parent._lblstatus.setText("Capturing a new thumbnail for the Driveway...");
RDebugUtils.currentLine=327705;
 //BA.debugLineNum = 327705;BA.debugLine="iv = ivDriveway";
_iv = parent._ivdriveway;
RDebugUtils.currentLine=327706;
 //BA.debugLineNum = 327706;BA.debugLine="clv = clvDriveway";
_clv = parent._clvdriveway;
 if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=327708;
 //BA.debugLineNum = 327708;BA.debugLine="lblStatus.Text = \"Capturing a new thumbnail fo";
parent._lblstatus.setText("Capturing a new thumbnail for the Front Door...");
RDebugUtils.currentLine=327709;
 //BA.debugLineNum = 327709;BA.debugLine="iv = ivFrontDoor";
_iv = parent._ivfrontdoor;
RDebugUtils.currentLine=327710;
 //BA.debugLineNum = 327710;BA.debugLine="clv = clvFrontDoor";
_clv = parent._clvfrontdoor;
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=327712;
 //BA.debugLineNum = 327712;BA.debugLine="lblStatus.Text = \"Capturing a new thumbnail fo";
parent._lblstatus.setText("Capturing a new thumbnail for the Side Yard...");
RDebugUtils.currentLine=327713;
 //BA.debugLineNum = 327713;BA.debugLine="iv = ivSideYard";
_iv = parent._ivsideyard;
RDebugUtils.currentLine=327714;
 //BA.debugLineNum = 327714;BA.debugLine="clv = clvSideYard";
_clv = parent._clvsideyard;
 if (true) break;
;
RDebugUtils.currentLine=327717;
 //BA.debugLineNum = 327717;BA.debugLine="If FirstRun Then";

case 14:
//if
this.state = 62;
if (_firstrun) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 62;
RDebugUtils.currentLine=327719;
 //BA.debugLineNum = 327719;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedi";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera);
RDebugUtils.currentLine=327720;
 //BA.debugLineNum = 327720;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"),(int) (1000));
this.state = 70;
return;
case 70:
//C
this.state = 62;
;
RDebugUtils.currentLine=327721;
 //BA.debugLineNum = 327721;BA.debugLine="GetCameraInfo(response,clv)";
_getcamerainfo(parent._response,_clv);
RDebugUtils.currentLine=327722;
 //BA.debugLineNum = 327722;BA.debugLine="DownloadImage(\"https://rest-\" & userRegion &\".";
_downloadimage("https://rest-"+parent._userregion+".immedia-semi.com/"+parent._camerathumbnail+".jpg",_iv,_camera);
RDebugUtils.currentLine=327723;
 //BA.debugLineNum = 327723;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=327725;
 //BA.debugLineNum = 327725;BA.debugLine="RESTPost(\"https://rest-\" & userRegion &\".immed";
_restpost("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera+"/thumbnail");
RDebugUtils.currentLine=327726;
 //BA.debugLineNum = 327726;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"),(int) (1000));
this.state = 71;
return;
case 71:
//C
this.state = 19;
;
RDebugUtils.currentLine=327727;
 //BA.debugLineNum = 327727;BA.debugLine="If response.StartsWith(\"ERROR: \") Then";
if (true) break;

case 19:
//if
this.state = 61;
if (parent._response.startsWith("ERROR: ")) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 61;
RDebugUtils.currentLine=327728;
 //BA.debugLineNum = 327728;BA.debugLine="Log(response)";
anywheresoftware.b4a.keywords.Common.Log(parent._response);
RDebugUtils.currentLine=327729;
 //BA.debugLineNum = 327729;BA.debugLine="lblStatus.Text = response";
parent._lblstatus.setText(parent._response);
RDebugUtils.currentLine=327730;
 //BA.debugLineNum = 327730;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=327732;
 //BA.debugLineNum = 327732;BA.debugLine="GetCommandID(response)";
_getcommandid(parent._response);
RDebugUtils.currentLine=327733;
 //BA.debugLineNum = 327733;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immed";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
RDebugUtils.currentLine=327734;
 //BA.debugLineNum = 327734;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"),(int) (1000));
this.state = 72;
return;
case 72:
//C
this.state = 24;
;
RDebugUtils.currentLine=327735;
 //BA.debugLineNum = 327735;BA.debugLine="If response.StartsWith(\"ERROR: \") Then";
if (true) break;

case 24:
//if
this.state = 60;
if (parent._response.startsWith("ERROR: ")) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 60;
RDebugUtils.currentLine=327736;
 //BA.debugLineNum = 327736;BA.debugLine="Log(response)";
anywheresoftware.b4a.keywords.Common.Log(parent._response);
RDebugUtils.currentLine=327737;
 //BA.debugLineNum = 327737;BA.debugLine="lblStatus.Text = response";
parent._lblstatus.setText(parent._response);
RDebugUtils.currentLine=327738;
 //BA.debugLineNum = 327738;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=327740;
 //BA.debugLineNum = 327740;BA.debugLine="For i = 1 To 30";
if (true) break;

case 29:
//for
this.state = 46;
step50 = 1;
limit50 = (int) (30);
_i = (int) (1) ;
this.state = 73;
if (true) break;

case 73:
//C
this.state = 46;
if ((step50 > 0 && _i <= limit50) || (step50 < 0 && _i >= limit50)) this.state = 31;
if (true) break;

case 74:
//C
this.state = 73;
_i = ((int)(0 + _i + step50)) ;
if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=327741;
 //BA.debugLineNum = 327741;BA.debugLine="GetCommandStatus(response)";
_getcommandstatus(parent._response);
RDebugUtils.currentLine=327742;
 //BA.debugLineNum = 327742;BA.debugLine="If commandComplete Then";
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
RDebugUtils.currentLine=327743;
 //BA.debugLineNum = 327743;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".im";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera);
RDebugUtils.currentLine=327744;
 //BA.debugLineNum = 327744;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"),(int) (1000));
this.state = 75;
return;
case 75:
//C
this.state = 45;
;
RDebugUtils.currentLine=327745;
 //BA.debugLineNum = 327745;BA.debugLine="GetCameraInfo(response,clv)";
_getcamerainfo(parent._response,_clv);
RDebugUtils.currentLine=327746;
 //BA.debugLineNum = 327746;BA.debugLine="DownloadImage(\"https://rest-\" & userRegion";
_downloadimage("https://rest-"+parent._userregion+".immedia-semi.com/"+parent._camerathumbnail+".jpg",_iv,_camera);
RDebugUtils.currentLine=327747;
 //BA.debugLineNum = 327747;BA.debugLine="Exit";
this.state = 46;
if (true) break;
 if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=327749;
 //BA.debugLineNum = 327749;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 37:
//if
this.state = 44;
if ((_camera).equals("347574")) { 
this.state = 39;
}else 
{RDebugUtils.currentLine=327751;
 //BA.debugLineNum = 327751;BA.debugLine="Else If camera = \"236967\" Then";
if ((_camera).equals("236967")) { 
this.state = 41;
}else 
{RDebugUtils.currentLine=327753;
 //BA.debugLineNum = 327753;BA.debugLine="Else If camera = \"226821\" Then";
if ((_camera).equals("226821")) { 
this.state = 43;
}}}
if (true) break;

case 39:
//C
this.state = 44;
RDebugUtils.currentLine=327750;
 //BA.debugLineNum = 327750;BA.debugLine="lblStatus.Text = \"Awaiting for the Drivew";
parent._lblstatus.setText("Awaiting for the Driveway thumbnail... "+BA.NumberToString(_i)+"/30");
 if (true) break;

case 41:
//C
this.state = 44;
RDebugUtils.currentLine=327752;
 //BA.debugLineNum = 327752;BA.debugLine="lblStatus.Text = \"Awaiting for the Front";
parent._lblstatus.setText("Awaiting for the Front Door thumbnail...  "+BA.NumberToString(_i)+"/30");
 if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=327754;
 //BA.debugLineNum = 327754;BA.debugLine="lblStatus.Text = \"Awaiting for the Side Y";
parent._lblstatus.setText("Awaiting for the Side Yard thumbnail... "+BA.NumberToString(_i)+"/30");
 if (true) break;

case 44:
//C
this.state = 45;
;
 if (true) break;

case 45:
//C
this.state = 74;
;
RDebugUtils.currentLine=327757;
 //BA.debugLineNum = 327757;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".imm";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
RDebugUtils.currentLine=327758;
 //BA.debugLineNum = 327758;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"),(int) (1000));
this.state = 76;
return;
case 76:
//C
this.state = 74;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=327760;
 //BA.debugLineNum = 327760;BA.debugLine="If commandComplete = False Then";

case 46:
//if
this.state = 59;
if (parent._commandcomplete==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 48;
}else {
this.state = 58;
}if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=327761;
 //BA.debugLineNum = 327761;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 49:
//if
this.state = 56;
if ((_camera).equals("347574")) { 
this.state = 51;
}else 
{RDebugUtils.currentLine=327764;
 //BA.debugLineNum = 327764;BA.debugLine="Else If camera = \"236967\" Then";
if ((_camera).equals("236967")) { 
this.state = 53;
}else 
{RDebugUtils.currentLine=327767;
 //BA.debugLineNum = 327767;BA.debugLine="Else If camera = \"226821\" Then";
if ((_camera).equals("226821")) { 
this.state = 55;
}}}
if (true) break;

case 51:
//C
this.state = 56;
RDebugUtils.currentLine=327762;
 //BA.debugLineNum = 327762;BA.debugLine="lblStatus.Text = \"Failed to retrieve Drive";
parent._lblstatus.setText("Failed to retrieve Driveway thumbnail...");
 if (true) break;

case 53:
//C
this.state = 56;
RDebugUtils.currentLine=327765;
 //BA.debugLineNum = 327765;BA.debugLine="lblStatus.Text = \"Failed to retrieve Front";
parent._lblstatus.setText("Failed to retrieve Front Door thumbnail...");
 if (true) break;

case 55:
//C
this.state = 56;
RDebugUtils.currentLine=327768;
 //BA.debugLineNum = 327768;BA.debugLine="lblStatus.Text = \"Failed to retrieve Side";
parent._lblstatus.setText("Failed to retrieve Side Yard thumbnail...");
 if (true) break;

case 56:
//C
this.state = 59;
;
 if (true) break;

case 58:
//C
this.state = 59;
 if (true) break;

case 59:
//C
this.state = 60;
;
 if (true) break;

case 60:
//C
this.state = 61;
;
 if (true) break;

case 61:
//C
this.state = 62;
;
 if (true) break;

case 62:
//C
this.state = 69;
;
 if (true) break;
if (true) break;

case 63:
//C
this.state = 66;
;
 if (true) break;

case 65:
//C
this.state = 66;
this.catchState = 0;
RDebugUtils.currentLine=327789;
 //BA.debugLineNum = 327789;BA.debugLine="Log(\"RefreshCamera LastException: \" & LastExcept";
anywheresoftware.b4a.keywords.Common.Log("RefreshCamera LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=327790;
 //BA.debugLineNum = 327790;BA.debugLine="lblStatus.Text = \"RefreshCamera LastException: \"";
parent._lblstatus.setText("RefreshCamera LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 66:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=327792;
 //BA.debugLineNum = 327792;BA.debugLine="End Sub";
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
public static String  _checkbattlife(int _battlevel) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "checkbattlife", false))
	 {return ((String) Debug.delegate(ba, "checkbattlife", new Object[] {_battlevel}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub CheckBattLife(battlevel As Int) As String";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Try";
try {RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="If battlevel <= 136 Then";
if (_battlevel<=136) { 
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="Return \"Replace battery now!\"";
if (true) return "Replace battery now!";
 }else 
{RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="else If battlevel >= 160 Then";
if (_battlevel>=160) { 
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="Return \"Very high\"";
if (true) return "Very high";
 }else 
{RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="else If battlevel > 136 And battlevel < 138 Then";
if (_battlevel>136 && _battlevel<138) { 
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="Return \"Very low\"";
if (true) return "Very low";
 }else {
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="Return \"High\"";
if (true) return "High";
 }}}
;
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="lblStatus.Text = \"CheckBattLife LastException: \"";
_lblstatus.setText("CheckBattLife LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=1048591;
 //BA.debugLineNum = 1048591;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=1048593;
 //BA.debugLineNum = 1048593;BA.debugLine="End Sub";
return "";
}
public static String  _checklfrlevel(int _lfrlevel) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "checklfrlevel", false))
	 {return ((String) Debug.delegate(ba, "checklfrlevel", new Object[] {_lfrlevel}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub CheckLFRLevel(lfrlevel As Int) As String";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Try";
try {RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="If lfrlevel > -67 Then";
if (_lfrlevel>-67) { 
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="Return \"Amazing\"";
if (true) return "Amazing";
 }else 
{RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="else If lfrlevel > -70 And lfrlevel <= -67 Then";
if (_lfrlevel>-70 && _lfrlevel<=-67) { 
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="Return \"Very good\"";
if (true) return "Very good";
 }else 
{RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="else If lfrlevel > -80 And lfrlevel <= -70 Then";
if (_lfrlevel>-80 && _lfrlevel<=-70) { 
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="Return \"OK\"";
if (true) return "OK";
 }else 
{RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="else If lfrlevel > -90 And lfrlevel <= -80 Then";
if (_lfrlevel>-90 && _lfrlevel<=-80) { 
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="Return \"Not Good\"";
if (true) return "Not Good";
 }else {
RDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="Return \"Unusable\"";
if (true) return "Unusable";
 }}}}
;
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=1114127;
 //BA.debugLineNum = 1114127;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=1114128;
 //BA.debugLineNum = 1114128;BA.debugLine="lblStatus.Text = \"CheckLFRLevel LastException: \"";
_lblstatus.setText("CheckLFRLevel LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=1114129;
 //BA.debugLineNum = 1114129;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=1114131;
 //BA.debugLineNum = 1114131;BA.debugLine="End Sub";
return "";
}
public static String  _close_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "close_entered_event", false))
	 {return ((String) Debug.delegate(ba, "close_entered_event", new Object[] {_e}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Private Sub Close_Entered_Event(e As Event)";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Try";
try {RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
_ivclose.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btCloseEnt.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="End Sub";
return "";
}
public static String  _close_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "close_exited_event", false))
	 {return ((String) Debug.delegate(ba, "close_exited_event", new Object[] {_e}));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Private Sub Close_Exited_Event(e As Event)";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Try";
try {RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
_ivclose.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btClose.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="End Sub";
return "";
}
public static String  _clvdriveway_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "clvdriveway_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvdriveway_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub clvDriveway_ItemClick (Index As Int, Value As";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="clvDriveway.JumpToItem(Index)";
_clvdriveway._jumptoitem(_index);
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
_clvfrontdoor._jumptoitem(_index);
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="clvSideYard.JumpToItem(Index)";
_clvsideyard._jumptoitem(_index);
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="End Sub";
return "";
}
public static String  _clvfrontdoor_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "clvfrontdoor_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvfrontdoor_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub clvFrontDoor_ItemClick (Index As Int, Value As";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="clvDriveway.JumpToItem(Index)";
_clvdriveway._jumptoitem(_index);
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
_clvfrontdoor._jumptoitem(_index);
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="clvSideYard.JumpToItem(Index)";
_clvsideyard._jumptoitem(_index);
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="End Sub";
return "";
}
public static String  _clvsideyard_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "clvsideyard_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvsideyard_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub clvSideYard_ItemClick (Index As Int, Value As";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="clvDriveway.JumpToItem(Index)";
_clvdriveway._jumptoitem(_index);
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
_clvfrontdoor._jumptoitem(_index);
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="clvSideYard.JumpToItem(Index)";
_clvsideyard._jumptoitem(_index);
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="End Sub";
return "";
}
public static String  _convertdatetime(String _inputtime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "convertdatetime", false))
	 {return ((String) Debug.delegate(ba, "convertdatetime", new Object[] {_inputtime}));}
long _ticks = 0L;
long _lngticks = 0L;
RDebugUtils.currentLine=25755648;
 //BA.debugLineNum = 25755648;BA.debugLine="Sub ConvertDateTime(inputTime As String) As String";
RDebugUtils.currentLine=25755650;
 //BA.debugLineNum = 25755650;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = _parseutcstring(_inputtime.replace("+00:00","+0000"));
RDebugUtils.currentLine=25755651;
 //BA.debugLineNum = 25755651;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a z\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a z");
RDebugUtils.currentLine=25755652;
 //BA.debugLineNum = 25755652;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
RDebugUtils.currentLine=25755655;
 //BA.debugLineNum = 25755655;BA.debugLine="Return DateTime.Date(lngTicks)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(_lngticks);
RDebugUtils.currentLine=25755656;
 //BA.debugLineNum = 25755656;BA.debugLine="End Sub";
return "";
}
public static long  _parseutcstring(String _utc) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "parseutcstring", false))
	 {return ((Long) Debug.delegate(ba, "parseutcstring", new Object[] {_utc}));}
String _df = "";
long _res = 0L;
RDebugUtils.currentLine=25821184;
 //BA.debugLineNum = 25821184;BA.debugLine="Sub ParseUTCstring(utc As String) As Long";
RDebugUtils.currentLine=25821185;
 //BA.debugLineNum = 25821185;BA.debugLine="Dim df As String = DateTime.DateFormat";
_df = anywheresoftware.b4a.keywords.Common.DateTime.getDateFormat();
RDebugUtils.currentLine=25821186;
 //BA.debugLineNum = 25821186;BA.debugLine="Dim res As Long";
_res = 0L;
RDebugUtils.currentLine=25821187;
 //BA.debugLineNum = 25821187;BA.debugLine="If utc.CharAt(10) = \"T\" Then";
if (_utc.charAt((int) (10))==BA.ObjectToChar("T")) { 
RDebugUtils.currentLine=25821189;
 //BA.debugLineNum = 25821189;BA.debugLine="If utc.CharAt(19) = \".\" Then utc = utc.SubString";
if (_utc.charAt((int) (19))==BA.ObjectToChar(".")) { 
_utc = _utc.substring((int) (0),(int) (19))+"+0000";};
RDebugUtils.currentLine=25821190;
 //BA.debugLineNum = 25821190;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd'T'HH:mm:ssZ\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
 }else {
RDebugUtils.currentLine=25821193;
 //BA.debugLineNum = 25821193;BA.debugLine="DateTime.DateFormat = \"EEE MMM dd HH:mm:ss Z yyy";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("EEE MMM dd HH:mm:ss Z yyyy");
 };
RDebugUtils.currentLine=25821195;
 //BA.debugLineNum = 25821195;BA.debugLine="Try";
try {RDebugUtils.currentLine=25821196;
 //BA.debugLineNum = 25821196;BA.debugLine="res = DateTime.DateParse(utc)";
_res = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_utc);
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=25821198;
 //BA.debugLineNum = 25821198;BA.debugLine="res = 0";
_res = (long) (0);
 };
RDebugUtils.currentLine=25821200;
 //BA.debugLineNum = 25821200;BA.debugLine="DateTime.DateFormat = df";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(_df);
RDebugUtils.currentLine=25821201;
 //BA.debugLineNum = 25821201;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=25821202;
 //BA.debugLineNum = 25821202;BA.debugLine="End Sub";
return 0L;
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
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Try";
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
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="response = \"\"";
parent._response = "";
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",main.getObject());
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="j.Download(Link)";
_j._download /*String*/ (null,_link);
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("TOKEN_AUTH",parent._authtoken);
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "downloadimage"), (Object)(_j));
this.state = 21;
return;
case 21:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[0];
;
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 7:
//if
this.state = 14;
if ((_camera).equals("347574")) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="Else If camera = \"236967\" Then";
if ((_camera).equals("236967")) { 
this.state = 11;
}else 
{RDebugUtils.currentLine=524302;
 //BA.debugLineNum = 524302;BA.debugLine="Else If camera = \"226821\" Then";
if ((_camera).equals("226821")) { 
this.state = 13;
}}}
if (true) break;

case 9:
//C
this.state = 14;
RDebugUtils.currentLine=524299;
 //BA.debugLineNum = 524299;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Driveway.jpg",anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"FrontDoor.jpg",anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"SideYard.jpg",anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 14:
//C
this.state = 17;
;
RDebugUtils.currentLine=524305;
 //BA.debugLineNum = 524305;BA.debugLine="File.Copy2(j.GetInputStream, out)";
anywheresoftware.b4a.keywords.Common.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="out.Close '<------ very important";
_out.Close();
RDebugUtils.currentLine=524309;
 //BA.debugLineNum = 524309;BA.debugLine="iv.SetImage(j.GetBitmap)";
_iv.SetImage((javafx.scene.image.Image)(_j._getbitmap /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ (null).getObject()));
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=524311;
 //BA.debugLineNum = 524311;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
parent._response = "ERROR: "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=524312;
 //BA.debugLineNum = 524312;BA.debugLine="lblStatus.Text = \"ERROR: \" & j.ErrorMessage";
parent._lblstatus.setText("ERROR: "+_j._errormessage /*String*/ );
 if (true) break;

case 17:
//C
this.state = 20;
;
RDebugUtils.currentLine=524314;
 //BA.debugLineNum = 524314;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
RDebugUtils.currentLine=524316;
 //BA.debugLineNum = 524316;BA.debugLine="lblStatus.Text = \"DownloadImage LastException: \"";
parent._lblstatus.setText("DownloadImage LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=524317;
 //BA.debugLineNum = 524317;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 20:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=524319;
 //BA.debugLineNum = 524319;BA.debugLine="End Sub";
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
public static String  _getallcameras(String _json) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getallcameras", false))
	 {return ((String) Debug.delegate(ba, "getallcameras", new Object[] {_json}));}
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _networks = null;
anywheresoftware.b4a.objects.collections.Map _colnetworks = null;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub GetAllCameras(json As String)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Try";
try {RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="lblStatus.Text = \"Getting all cameras informatio";
_lblstatus.setText("Getting all cameras information...");
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="Dim networks As List = root.Get(\"networks\")";
_networks = new anywheresoftware.b4a.objects.collections.List();
_networks.setObject((java.util.List)(_root.Get((Object)("networks"))));
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="For Each colnetworks As Map In networks";
_colnetworks = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group7 = _networks;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_colnetworks.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group7.Get(index7)));
RDebugUtils.currentLine=720915;
 //BA.debugLineNum = 720915;BA.debugLine="networkID = colnetworks.Get(\"network_id\")";
_networkid = BA.ObjectToString(_colnetworks.Get((Object)("network_id")));
RDebugUtils.currentLine=720916;
 //BA.debugLineNum = 720916;BA.debugLine="Log(\"networkID: \" &  networkID)";
anywheresoftware.b4a.keywords.Common.Log("networkID: "+_networkid);
 }
};
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=720920;
 //BA.debugLineNum = 720920;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=720921;
 //BA.debugLineNum = 720921;BA.debugLine="lblStatus.Text = \"GetAllCameras LastException: \"";
_lblstatus.setText("GetAllCameras LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=720923;
 //BA.debugLineNum = 720923;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub GetAuthInfo(json As String)";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Try";
try {RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="lblStatus.Text = \"Getting authtoken...\"";
_lblstatus.setText("Getting authtoken...");
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="Dim authtokenmap As Map = root.Get(\"authtoken\")";
_authtokenmap = new anywheresoftware.b4a.objects.collections.Map();
_authtokenmap.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("authtoken"))));
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="authToken = authtokenmap.Get(\"authtoken\")";
_authtoken = BA.ObjectToString(_authtokenmap.Get((Object)("authtoken")));
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="Log(\"authToken: \" &  authToken)";
anywheresoftware.b4a.keywords.Common.Log("authToken: "+_authtoken);
RDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="Dim region As Map = root.Get(\"region\")";
_region = new anywheresoftware.b4a.objects.collections.Map();
_region.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("region"))));
RDebugUtils.currentLine=589841;
 //BA.debugLineNum = 589841;BA.debugLine="userRegion = region.GetKeyAt(0)";
_userregion = BA.ObjectToString(_region.GetKeyAt((int) (0)));
RDebugUtils.currentLine=589842;
 //BA.debugLineNum = 589842;BA.debugLine="Log(\"userRegion: \" &  userRegion)";
anywheresoftware.b4a.keywords.Common.Log("userRegion: "+_userregion);
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=589847;
 //BA.debugLineNum = 589847;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=589848;
 //BA.debugLineNum = 589848;BA.debugLine="lblStatus.Text = \"GetAuthInfo LastException: \" &";
_lblstatus.setText("GetAuthInfo LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=589851;
 //BA.debugLineNum = 589851;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub GetCameraInfo(json As String, clv As CustomLis";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Try";
try {RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="Dim camera_status As Map = root.Get(\"camera_stat";
_camera_status = new anywheresoftware.b4a.objects.collections.Map();
_camera_status.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("camera_status"))));
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="Dim total_108_wakeups As Int = camera_status.Get";
_total_108_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("total_108_wakeups"))));
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="Dim battery_voltage As Int = camera_status.Get(\"";
_battery_voltage = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("battery_voltage"))));
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="Dim light_sensor_data_valid As String = camera_s";
_light_sensor_data_valid = BA.ObjectToString(_camera_status.Get((Object)("light_sensor_data_valid")));
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="Dim lfr_tb_wakeups As Int = camera_status.Get(\"l";
_lfr_tb_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lfr_tb_wakeups"))));
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="Dim fw_git_hash As String = camera_status.Get(\"f";
_fw_git_hash = BA.ObjectToString(_camera_status.Get((Object)("fw_git_hash")));
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="Dim wifi_strength As Int = camera_status.Get(\"wi";
_wifi_strength = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("wifi_strength"))));
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="Dim lfr_strength As Int = camera_status.Get(\"lfr";
_lfr_strength = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lfr_strength"))));
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="Dim total_tb_wakeups As Int = camera_status.Get(";
_total_tb_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("total_tb_wakeups"))));
RDebugUtils.currentLine=917518;
 //BA.debugLineNum = 917518;BA.debugLine="Dim created_at As String = camera_status.Get(\"cr";
_created_at = BA.ObjectToString(_camera_status.Get((Object)("created_at")));
RDebugUtils.currentLine=917519;
 //BA.debugLineNum = 917519;BA.debugLine="Dim light_sensor_ch0 As Int = camera_status.Get(";
_light_sensor_ch0 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("light_sensor_ch0"))));
RDebugUtils.currentLine=917520;
 //BA.debugLineNum = 917520;BA.debugLine="Dim mac As String = camera_status.Get(\"mac\")";
_mac = BA.ObjectToString(_camera_status.Get((Object)("mac")));
RDebugUtils.currentLine=917521;
 //BA.debugLineNum = 917521;BA.debugLine="Dim unit_number As Int = camera_status.Get(\"unit";
_unit_number = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("unit_number"))));
RDebugUtils.currentLine=917522;
 //BA.debugLineNum = 917522;BA.debugLine="Dim updated_at As String = camera_status.Get(\"up";
_updated_at = BA.ObjectToString(_camera_status.Get((Object)("updated_at")));
RDebugUtils.currentLine=917523;
 //BA.debugLineNum = 917523;BA.debugLine="Dim light_sensor_ch1 As Int = camera_status.Get(";
_light_sensor_ch1 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("light_sensor_ch1"))));
RDebugUtils.currentLine=917524;
 //BA.debugLineNum = 917524;BA.debugLine="Dim time_dhcp_lease As Int = camera_status.Get(\"";
_time_dhcp_lease = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_dhcp_lease"))));
RDebugUtils.currentLine=917525;
 //BA.debugLineNum = 917525;BA.debugLine="Dim temperature As Int = camera_status.Get(\"temp";
_temperature = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("temperature"))));
RDebugUtils.currentLine=917526;
 //BA.debugLineNum = 917526;BA.debugLine="Dim time_first_video As Int = camera_status.Get(";
_time_first_video = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_first_video"))));
RDebugUtils.currentLine=917527;
 //BA.debugLineNum = 917527;BA.debugLine="Dim time_dns_resolve As Int = camera_status.Get(";
_time_dns_resolve = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_dns_resolve"))));
RDebugUtils.currentLine=917528;
 //BA.debugLineNum = 917528;BA.debugLine="Dim id As Int = camera_status.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("id"))));
RDebugUtils.currentLine=917529;
 //BA.debugLineNum = 917529;BA.debugLine="Dim temp_alert_status As String = camera_status.";
_temp_alert_status = BA.ObjectToString(_camera_status.Get((Object)("temp_alert_status")));
RDebugUtils.currentLine=917530;
 //BA.debugLineNum = 917530;BA.debugLine="Dim time_108_boot As Int = camera_status.Get(\"ti";
_time_108_boot = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_108_boot"))));
RDebugUtils.currentLine=917531;
 //BA.debugLineNum = 917531;BA.debugLine="Dim lfr_108_wakeups As Int = camera_status.Get(\"";
_lfr_108_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lfr_108_wakeups"))));
RDebugUtils.currentLine=917532;
 //BA.debugLineNum = 917532;BA.debugLine="cameraThumbnail = camera_status.Get(\"thumbnail\")";
_camerathumbnail = BA.ObjectToString(_camera_status.Get((Object)("thumbnail")));
RDebugUtils.currentLine=917533;
 //BA.debugLineNum = 917533;BA.debugLine="Log(\"cameraThumbnail: \" & cameraThumbnail)";
anywheresoftware.b4a.keywords.Common.Log("cameraThumbnail: "+_camerathumbnail);
RDebugUtils.currentLine=917534;
 //BA.debugLineNum = 917534;BA.debugLine="Dim lifetime_duration As Int = camera_status.Get";
_lifetime_duration = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lifetime_duration"))));
RDebugUtils.currentLine=917535;
 //BA.debugLineNum = 917535;BA.debugLine="Dim wifi_connect_failure_count As Int = camera_s";
_wifi_connect_failure_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("wifi_connect_failure_count"))));
RDebugUtils.currentLine=917536;
 //BA.debugLineNum = 917536;BA.debugLine="Dim camera_id As Int = camera_status.Get(\"camera";
_camera_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("camera_id"))));
RDebugUtils.currentLine=917537;
 //BA.debugLineNum = 917537;BA.debugLine="Dim battery_alert_status As String = camera_stat";
_battery_alert_status = BA.ObjectToString(_camera_status.Get((Object)("battery_alert_status")));
RDebugUtils.currentLine=917538;
 //BA.debugLineNum = 917538;BA.debugLine="Dim dhcp_failure_count As Int = camera_status.Ge";
_dhcp_failure_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dhcp_failure_count"))));
RDebugUtils.currentLine=917539;
 //BA.debugLineNum = 917539;BA.debugLine="Dim ip_address As String = camera_status.Get(\"ip";
_ip_address = BA.ObjectToString(_camera_status.Get((Object)("ip_address")));
RDebugUtils.currentLine=917540;
 //BA.debugLineNum = 917540;BA.debugLine="Dim ipv As String = camera_status.Get(\"ipv\")";
_ipv = BA.ObjectToString(_camera_status.Get((Object)("ipv")));
RDebugUtils.currentLine=917541;
 //BA.debugLineNum = 917541;BA.debugLine="Dim light_sensor_data_new As String = camera_sta";
_light_sensor_data_new = BA.ObjectToString(_camera_status.Get((Object)("light_sensor_data_new")));
RDebugUtils.currentLine=917542;
 //BA.debugLineNum = 917542;BA.debugLine="Dim network_id As Int = camera_status.Get(\"netwo";
_network_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("network_id"))));
RDebugUtils.currentLine=917543;
 //BA.debugLineNum = 917543;BA.debugLine="Dim account_id As Int = camera_status.Get(\"accou";
_account_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("account_id"))));
RDebugUtils.currentLine=917544;
 //BA.debugLineNum = 917544;BA.debugLine="Dim serial As String = camera_status.Get(\"serial";
_serial = BA.ObjectToString(_camera_status.Get((Object)("serial")));
RDebugUtils.currentLine=917545;
 //BA.debugLineNum = 917545;BA.debugLine="Dim dev_1 As Int = camera_status.Get(\"dev_1\")";
_dev_1 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dev_1"))));
RDebugUtils.currentLine=917546;
 //BA.debugLineNum = 917546;BA.debugLine="Dim time_wlan_connect As Int = camera_status.Get";
_time_wlan_connect = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_wlan_connect"))));
RDebugUtils.currentLine=917547;
 //BA.debugLineNum = 917547;BA.debugLine="Dim dev_2 As Int = camera_status.Get(\"dev_2\")";
_dev_2 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dev_2"))));
RDebugUtils.currentLine=917548;
 //BA.debugLineNum = 917548;BA.debugLine="Dim socket_failure_count As Int = camera_status.";
_socket_failure_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("socket_failure_count"))));
RDebugUtils.currentLine=917549;
 //BA.debugLineNum = 917549;BA.debugLine="Dim dev_3 As Int = camera_status.Get(\"dev_3\")";
_dev_3 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dev_3"))));
RDebugUtils.currentLine=917550;
 //BA.debugLineNum = 917550;BA.debugLine="Dim pir_rejections As Int = camera_status.Get(\"p";
_pir_rejections = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("pir_rejections"))));
RDebugUtils.currentLine=917551;
 //BA.debugLineNum = 917551;BA.debugLine="Dim sync_module_id As Int = camera_status.Get(\"s";
_sync_module_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("sync_module_id"))));
RDebugUtils.currentLine=917552;
 //BA.debugLineNum = 917552;BA.debugLine="Dim lifetime_count As Int = camera_status.Get(\"l";
_lifetime_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lifetime_count"))));
RDebugUtils.currentLine=917553;
 //BA.debugLineNum = 917553;BA.debugLine="Dim error_codes As Int = camera_status.Get(\"erro";
_error_codes = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("error_codes"))));
RDebugUtils.currentLine=917554;
 //BA.debugLineNum = 917554;BA.debugLine="Dim fw_version As String = camera_status.Get(\"fw";
_fw_version = BA.ObjectToString(_camera_status.Get((Object)("fw_version")));
RDebugUtils.currentLine=917555;
 //BA.debugLineNum = 917555;BA.debugLine="Dim ac_power As String = camera_status.Get(\"ac_p";
_ac_power = BA.ObjectToString(_camera_status.Get((Object)("ac_power")));
RDebugUtils.currentLine=917557;
 //BA.debugLineNum = 917557;BA.debugLine="clv.Clear";
_clv._clear();
RDebugUtils.currentLine=917558;
 //BA.debugLineNum = 917558;BA.debugLine="clv.AddTextItem(\"Battery voltage: \" & NumberForm";
_clv._addtextitem((Object)("Battery voltage: "+anywheresoftware.b4a.keywords.Common.NumberFormat((_battery_voltage/(double)100),(int) (0),(int) (2))+"V - "+_checkbattlife(_battery_voltage)),(Object)("battery_voltage"));
RDebugUtils.currentLine=917559;
 //BA.debugLineNum = 917559;BA.debugLine="clv.AddTextItem(\"Camera to WiFi strength: \" & wi";
_clv._addtextitem((Object)("Camera to WiFi strength: "+BA.NumberToString(_wifi_strength)+" - "+_checklfrlevel(_wifi_strength)),(Object)("wifi_strength"));
RDebugUtils.currentLine=917560;
 //BA.debugLineNum = 917560;BA.debugLine="clv.AddTextItem(\"Camera to Sync Module strength";
_clv._addtextitem((Object)("Camera to Sync Module strength (LFR): "+BA.NumberToString(_lfr_strength)+" - "+_checklfrlevel(_lfr_strength)),(Object)("lfr_strength"));
RDebugUtils.currentLine=917561;
 //BA.debugLineNum = 917561;BA.debugLine="clv.AddTextItem(\"Temperature: \" & temperature &";
_clv._addtextitem((Object)("Temperature: "+BA.NumberToString(_temperature)+"ºF"),(Object)("temperature"));
RDebugUtils.currentLine=917562;
 //BA.debugLineNum = 917562;BA.debugLine="clv.AddTextItem(\"Firmware version: \" & fw_versio";
_clv._addtextitem((Object)("Firmware version: "+_fw_version),(Object)("fw_version"));
RDebugUtils.currentLine=917563;
 //BA.debugLineNum = 917563;BA.debugLine="clv.AddTextItem(\"Firmware Git Hash: \" & fw_git_h";
_clv._addtextitem((Object)("Firmware Git Hash: "+_fw_git_hash),(Object)("fw_git_hash"));
RDebugUtils.currentLine=917564;
 //BA.debugLineNum = 917564;BA.debugLine="clv.AddTextItem(\"Battery alert status: \" & batte";
_clv._addtextitem((Object)("Battery alert status: "+_battery_alert_status),(Object)("battery_alert_status"));
RDebugUtils.currentLine=917565;
 //BA.debugLineNum = 917565;BA.debugLine="clv.AddTextItem(\"Temperature alert status: \" & t";
_clv._addtextitem((Object)("Temperature alert status: "+_temp_alert_status),(Object)("temp_alert_status"));
RDebugUtils.currentLine=917566;
 //BA.debugLineNum = 917566;BA.debugLine="clv.AddTextItem(\"Updated at: \" & ConvertDateTime";
_clv._addtextitem((Object)("Updated at: "+_convertdatetime(_updated_at)),(Object)("updated_at"));
RDebugUtils.currentLine=917567;
 //BA.debugLineNum = 917567;BA.debugLine="clv.AddTextItem(\"Created at: \" & ConvertDateTime";
_clv._addtextitem((Object)("Created at: "+_convertdatetime(_created_at)),(Object)("created_at"));
RDebugUtils.currentLine=917568;
 //BA.debugLineNum = 917568;BA.debugLine="clv.AddTextItem(\"IP address: \" & ip_address, \"ip";
_clv._addtextitem((Object)("IP address: "+_ip_address),(Object)("ip_address"));
RDebugUtils.currentLine=917569;
 //BA.debugLineNum = 917569;BA.debugLine="clv.AddTextItem(\"MAC address: \" & mac, \"mac\")";
_clv._addtextitem((Object)("MAC address: "+_mac),(Object)("mac"));
RDebugUtils.currentLine=917570;
 //BA.debugLineNum = 917570;BA.debugLine="clv.AddTextItem(\"Camera ID: \" & camera_id, \"came";
_clv._addtextitem((Object)("Camera ID: "+BA.NumberToString(_camera_id)),(Object)("camera_id"));
RDebugUtils.currentLine=917571;
 //BA.debugLineNum = 917571;BA.debugLine="clv.AddTextItem(\"Serial: \" & serial, \"serial\")";
_clv._addtextitem((Object)("Serial: "+_serial),(Object)("serial"));
RDebugUtils.currentLine=917572;
 //BA.debugLineNum = 917572;BA.debugLine="clv.AddTextItem(\"Network ID: \" & network_id, \"ne";
_clv._addtextitem((Object)("Network ID: "+BA.NumberToString(_network_id)),(Object)("network_id"));
RDebugUtils.currentLine=917573;
 //BA.debugLineNum = 917573;BA.debugLine="clv.AddTextItem(\"Account ID: \" & account_id, \"ac";
_clv._addtextitem((Object)("Account ID: "+BA.NumberToString(_account_id)),(Object)("account_id"));
RDebugUtils.currentLine=917574;
 //BA.debugLineNum = 917574;BA.debugLine="clv.AddTextItem(\"ID: \" & id, \"id\")";
_clv._addtextitem((Object)("ID: "+BA.NumberToString(_id)),(Object)("id"));
RDebugUtils.currentLine=917575;
 //BA.debugLineNum = 917575;BA.debugLine="clv.AddTextItem(\"Sync Module ID: \" & sync_module";
_clv._addtextitem((Object)("Sync Module ID: "+BA.NumberToString(_sync_module_id)),(Object)("sync_module_id"));
RDebugUtils.currentLine=917576;
 //BA.debugLineNum = 917576;BA.debugLine="clv.AddTextItem(\"Light sensor data valid: \" & li";
_clv._addtextitem((Object)("Light sensor data valid: "+_light_sensor_data_valid),(Object)("light_sensor_data_valid"));
RDebugUtils.currentLine=917577;
 //BA.debugLineNum = 917577;BA.debugLine="clv.AddTextItem(\"DHCP failure count: \" & dhcp_fa";
_clv._addtextitem((Object)("DHCP failure count: "+BA.NumberToString(_dhcp_failure_count)),(Object)("dhcp_failure_count"));
RDebugUtils.currentLine=917578;
 //BA.debugLineNum = 917578;BA.debugLine="clv.AddTextItem(\"LFR tb wakeups: \" & lfr_tb_wake";
_clv._addtextitem((Object)("LFR tb wakeups: "+BA.NumberToString(_lfr_tb_wakeups)),(Object)("lfr_tb_wakeups"));
RDebugUtils.currentLine=917579;
 //BA.debugLineNum = 917579;BA.debugLine="clv.AddTextItem(\"Socket failure count: \" & socke";
_clv._addtextitem((Object)("Socket failure count: "+BA.NumberToString(_socket_failure_count)),(Object)("socket_failure_count"));
RDebugUtils.currentLine=917580;
 //BA.debugLineNum = 917580;BA.debugLine="clv.AddTextItem(\"Camera thumbnail: \" & cameraThu";
_clv._addtextitem((Object)("Camera thumbnail: "+_camerathumbnail),(Object)("thumbnail"));
RDebugUtils.currentLine=917581;
 //BA.debugLineNum = 917581;BA.debugLine="clv.AddTextItem(\"WiFi connect failure count: \" &";
_clv._addtextitem((Object)("WiFi connect failure count: "+BA.NumberToString(_wifi_connect_failure_count)),(Object)("wifi_connect_failure_count"));
RDebugUtils.currentLine=917582;
 //BA.debugLineNum = 917582;BA.debugLine="clv.AddTextItem(\"Error codes: \" & error_codes, \"";
_clv._addtextitem((Object)("Error codes: "+BA.NumberToString(_error_codes)),(Object)("error_codes"));
RDebugUtils.currentLine=917583;
 //BA.debugLineNum = 917583;BA.debugLine="clv.AddTextItem(\"AC power: \" & ac_power, \"ac_pow";
_clv._addtextitem((Object)("AC power: "+_ac_power),(Object)("ac_power"));
RDebugUtils.currentLine=917584;
 //BA.debugLineNum = 917584;BA.debugLine="clv.AddTextItem(\"Total 108 wakeups: \" & total_10";
_clv._addtextitem((Object)("Total 108 wakeups: "+BA.NumberToString(_total_108_wakeups)),(Object)("total_108_wakeups"));
RDebugUtils.currentLine=917585;
 //BA.debugLineNum = 917585;BA.debugLine="clv.AddTextItem(\"Total Tb wakeups: \" & total_tb_";
_clv._addtextitem((Object)("Total Tb wakeups: "+BA.NumberToString(_total_tb_wakeups)),(Object)("total_tb_wakeups"));
RDebugUtils.currentLine=917586;
 //BA.debugLineNum = 917586;BA.debugLine="clv.AddTextItem(\"Light sensor ch0: \" & light_sen";
_clv._addtextitem((Object)("Light sensor ch0: "+BA.NumberToString(_light_sensor_ch0)),(Object)("light_sensor_ch0"));
RDebugUtils.currentLine=917587;
 //BA.debugLineNum = 917587;BA.debugLine="clv.AddTextItem(\"Unit number: \" & unit_number, \"";
_clv._addtextitem((Object)("Unit number: "+BA.NumberToString(_unit_number)),(Object)("unit_number"));
RDebugUtils.currentLine=917588;
 //BA.debugLineNum = 917588;BA.debugLine="clv.AddTextItem(\"Light sensor ch1: \" & light_sen";
_clv._addtextitem((Object)("Light sensor ch1: "+BA.NumberToString(_light_sensor_ch1)),(Object)("light_sensor_ch1"));
RDebugUtils.currentLine=917589;
 //BA.debugLineNum = 917589;BA.debugLine="clv.AddTextItem(\"Time dhcp lease: \" & time_dhcp_";
_clv._addtextitem((Object)("Time dhcp lease: "+BA.NumberToString(_time_dhcp_lease)),(Object)("time_dhcp_lease"));
RDebugUtils.currentLine=917590;
 //BA.debugLineNum = 917590;BA.debugLine="clv.AddTextItem(\"Time first video: \" & time_firs";
_clv._addtextitem((Object)("Time first video: "+BA.NumberToString(_time_first_video)),(Object)("time_first_video"));
RDebugUtils.currentLine=917591;
 //BA.debugLineNum = 917591;BA.debugLine="clv.AddTextItem(\"Time dns resolve: \" & time_dns_";
_clv._addtextitem((Object)("Time dns resolve: "+BA.NumberToString(_time_dns_resolve)),(Object)("time_dns_resolve"));
RDebugUtils.currentLine=917592;
 //BA.debugLineNum = 917592;BA.debugLine="clv.AddTextItem(\"Time 108 boot: \" & time_108_boo";
_clv._addtextitem((Object)("Time 108 boot: "+BA.NumberToString(_time_108_boot)),(Object)("time_108_boot"));
RDebugUtils.currentLine=917593;
 //BA.debugLineNum = 917593;BA.debugLine="clv.AddTextItem(\"LFR 108 wakeups: \" & lfr_108_wa";
_clv._addtextitem((Object)("LFR 108 wakeups: "+BA.NumberToString(_lfr_108_wakeups)),(Object)("lfr_108_wakeups"));
RDebugUtils.currentLine=917594;
 //BA.debugLineNum = 917594;BA.debugLine="clv.AddTextItem(\"lifetime duration: \" & lifetime";
_clv._addtextitem((Object)("lifetime duration: "+BA.NumberToString(_lifetime_duration)),(Object)("lifetime_duration"));
RDebugUtils.currentLine=917595;
 //BA.debugLineNum = 917595;BA.debugLine="clv.AddTextItem(\"lpv: \" & ipv, \"ipv\")";
_clv._addtextitem((Object)("lpv: "+_ipv),(Object)("ipv"));
RDebugUtils.currentLine=917596;
 //BA.debugLineNum = 917596;BA.debugLine="clv.AddTextItem(\"light sensor data new: \" & ligh";
_clv._addtextitem((Object)("light sensor data new: "+_light_sensor_data_new),(Object)("light_sensor_data_new"));
RDebugUtils.currentLine=917597;
 //BA.debugLineNum = 917597;BA.debugLine="clv.AddTextItem(\"Dev_1: \" & dev_1, \"dev_1\")";
_clv._addtextitem((Object)("Dev_1: "+BA.NumberToString(_dev_1)),(Object)("dev_1"));
RDebugUtils.currentLine=917598;
 //BA.debugLineNum = 917598;BA.debugLine="clv.AddTextItem(\"Dev_2: \" & dev_2, \"dev_2\")";
_clv._addtextitem((Object)("Dev_2: "+BA.NumberToString(_dev_2)),(Object)("dev_2"));
RDebugUtils.currentLine=917599;
 //BA.debugLineNum = 917599;BA.debugLine="clv.AddTextItem(\"Dev_3: \" & dev_3, \"dev_3\")";
_clv._addtextitem((Object)("Dev_3: "+BA.NumberToString(_dev_3)),(Object)("dev_3"));
RDebugUtils.currentLine=917600;
 //BA.debugLineNum = 917600;BA.debugLine="clv.AddTextItem(\"Time wlan connect: \" & time_wla";
_clv._addtextitem((Object)("Time wlan connect: "+BA.NumberToString(_time_wlan_connect)),(Object)("time_wlan_connect"));
RDebugUtils.currentLine=917601;
 //BA.debugLineNum = 917601;BA.debugLine="clv.AddTextItem(\"PIR rejections: \" & pir_rejecti";
_clv._addtextitem((Object)("PIR rejections: "+BA.NumberToString(_pir_rejections)),(Object)("pir_rejections"));
RDebugUtils.currentLine=917602;
 //BA.debugLineNum = 917602;BA.debugLine="clv.AddTextItem(\"Lifetime count: \" & lifetime_co";
_clv._addtextitem((Object)("Lifetime count: "+BA.NumberToString(_lifetime_count)),(Object)("lifetime_count"));
RDebugUtils.currentLine=917604;
 //BA.debugLineNum = 917604;BA.debugLine="Dim strTimestamp As String";
_strtimestamp = "";
RDebugUtils.currentLine=917605;
 //BA.debugLineNum = 917605;BA.debugLine="strTimestamp = ConvertDateTime(updated_at)";
_strtimestamp = _convertdatetime(_updated_at);
RDebugUtils.currentLine=917606;
 //BA.debugLineNum = 917606;BA.debugLine="lblStatus.Text = \"Last updated: \" & strTimestamp";
_lblstatus.setText("Last updated: "+_strtimestamp);
RDebugUtils.currentLine=917607;
 //BA.debugLineNum = 917607;BA.debugLine="If clv = clvDriveway Then";
if ((_clv).equals(_clvdriveway)) { 
RDebugUtils.currentLine=917608;
 //BA.debugLineNum = 917608;BA.debugLine="lblDriveway.Text = \"Driveway \" & strTimestamp";
_lbldriveway.setText("Driveway "+_strtimestamp);
 }else 
{RDebugUtils.currentLine=917609;
 //BA.debugLineNum = 917609;BA.debugLine="Else If clv = clvFrontDoor Then";
if ((_clv).equals(_clvfrontdoor)) { 
RDebugUtils.currentLine=917610;
 //BA.debugLineNum = 917610;BA.debugLine="lblFrontDoor.Text = \"Front Door \" & strTimestam";
_lblfrontdoor.setText("Front Door "+_strtimestamp);
 }else 
{RDebugUtils.currentLine=917611;
 //BA.debugLineNum = 917611;BA.debugLine="Else If clv = clvSideYard Then";
if ((_clv).equals(_clvsideyard)) { 
RDebugUtils.currentLine=917612;
 //BA.debugLineNum = 917612;BA.debugLine="lblSideYard.Text = \"Side Yard \" & strTimestamp";
_lblsideyard.setText("Side Yard "+_strtimestamp);
 }}}
;
RDebugUtils.currentLine=917615;
 //BA.debugLineNum = 917615;BA.debugLine="For i = 0 To clv.Size-1";
{
final int step108 = 1;
final int limit108 = (int) (_clv._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit108 ;_i = _i + step108 ) {
RDebugUtils.currentLine=917616;
 //BA.debugLineNum = 917616;BA.debugLine="Dim item As String";
_item = "";
RDebugUtils.currentLine=917617;
 //BA.debugLineNum = 917617;BA.debugLine="item = clv.GetValue(i)";
_item = BA.ObjectToString(_clv._getvalue(_i));
RDebugUtils.currentLine=917618;
 //BA.debugLineNum = 917618;BA.debugLine="If item.Contains(\"thumbnail\") Then";
if (_item.contains("thumbnail")) { 
RDebugUtils.currentLine=917619;
 //BA.debugLineNum = 917619;BA.debugLine="clv.ResizeItem(i,80dip)";
_clv._resizeitem(_i,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)));
 }else {
RDebugUtils.currentLine=917621;
 //BA.debugLineNum = 917621;BA.debugLine="clv.ResizeItem(i,35dip)";
_clv._resizeitem(_i,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (35)));
 };
 }
};
 } 
       catch (Exception e118) {
			ba.setLastException(e118);RDebugUtils.currentLine=917625;
 //BA.debugLineNum = 917625;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=917626;
 //BA.debugLineNum = 917626;BA.debugLine="lblStatus.Text = \"GetCameraInfo LastException: \"";
_lblstatus.setText("GetCameraInfo LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=917628;
 //BA.debugLineNum = 917628;BA.debugLine="End Sub";
return "";
}
public static String  _getcommandid(String _json) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getcommandid", false))
	 {return ((String) Debug.delegate(ba, "getcommandid", new Object[] {_json}));}
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub GetCommandID(json As String)";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Try";
try {RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=786451;
 //BA.debugLineNum = 786451;BA.debugLine="commandID = root.Get(\"id\")";
_commandid = BA.ObjectToString(_root.Get((Object)("id")));
RDebugUtils.currentLine=786452;
 //BA.debugLineNum = 786452;BA.debugLine="Log(\"commandID: \" & commandID)";
anywheresoftware.b4a.keywords.Common.Log("commandID: "+_commandid);
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=786474;
 //BA.debugLineNum = 786474;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=786475;
 //BA.debugLineNum = 786475;BA.debugLine="lblStatus.Text = \"GetCommandID LastException: \"";
_lblstatus.setText("GetCommandID LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=786477;
 //BA.debugLineNum = 786477;BA.debugLine="End Sub";
return "";
}
public static String  _getcommandstatus(String _json) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getcommandstatus", false))
	 {return ((String) Debug.delegate(ba, "getcommandstatus", new Object[] {_json}));}
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub GetCommandStatus(json As String)";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Try";
try {RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="commandComplete = root.Get(\"complete\")";
_commandcomplete = BA.ObjectToBoolean(_root.Get((Object)("complete")));
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="Log(\"commandComplete: \" & commandComplete)";
anywheresoftware.b4a.keywords.Common.Log("commandComplete: "+BA.ObjectToString(_commandcomplete));
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="lblStatus.Text = \"GetCommandStatus LastException";
_lblstatus.setText("GetCommandStatus LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub GetSyncModuleInfo(json As String)";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Try";
try {RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="Dim syncmodule As Map = root.Get(\"syncmodule\")";
_syncmodule = new anywheresoftware.b4a.objects.collections.Map();
_syncmodule.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("syncmodule"))));
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="Dim wifi_strength As Int = syncmodule.Get(\"wifi_";
_wifi_strength = (int)(BA.ObjectToNumber(_syncmodule.Get((Object)("wifi_strength"))));
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="Dim os_version As String = syncmodule.Get(\"os_ve";
_os_version = BA.ObjectToString(_syncmodule.Get((Object)("os_version")));
RDebugUtils.currentLine=983067;
 //BA.debugLineNum = 983067;BA.debugLine="Dim fw_version As String = syncmodule.Get(\"fw_ve";
_fw_version = BA.ObjectToString(_syncmodule.Get((Object)("fw_version")));
RDebugUtils.currentLine=983069;
 //BA.debugLineNum = 983069;BA.debugLine="Dim status As String = syncmodule.Get(\"status\")";
_status = BA.ObjectToString(_syncmodule.Get((Object)("status")));
RDebugUtils.currentLine=983070;
 //BA.debugLineNum = 983070;BA.debugLine="lblSyncModule.Text = \"Sync Module is \" & status";
_lblsyncmodule.setText("Sync Module is "+_status+" | Wifi Strength: "+BA.NumberToString(_wifi_strength)+" bars | Firmware version: "+_fw_version+" | OS version: "+_os_version);
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=983072;
 //BA.debugLineNum = 983072;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=983073;
 //BA.debugLineNum = 983073;BA.debugLine="lblStatus.Text = \"GetSyncModuleInfo LastExceptio";
_lblstatus.setText("GetSyncModuleInfo LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=983075;
 //BA.debugLineNum = 983075;BA.debugLine="End Sub";
return "";
}
public static String  _getuserinfo(String _json) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getuserinfo", false))
	 {return ((String) Debug.delegate(ba, "getuserinfo", new Object[] {_json}));}
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub GetUserInfo(json As String)";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Try";
try {RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="lblStatus.Text = \"Getting user information...\"";
_lblstatus.setText("Getting user information...");
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=655380;
 //BA.debugLineNum = 655380;BA.debugLine="accountID = root.Get(\"account_id\") '88438";
_accountid = BA.ObjectToString(_root.Get((Object)("account_id")));
RDebugUtils.currentLine=655381;
 //BA.debugLineNum = 655381;BA.debugLine="Log(\"accountID: \" &  accountID)";
anywheresoftware.b4a.keywords.Common.Log("accountID: "+_accountid);
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=655384;
 //BA.debugLineNum = 655384;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=655385;
 //BA.debugLineNum = 655385;BA.debugLine="lblStatus.Text = \"GetUserInfo LastException: \" &";
_lblstatus.setText("GetUserInfo LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=655387;
 //BA.debugLineNum = 655387;BA.debugLine="End Sub";
return "";
}
public static String  _ivclose_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "ivclose_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "ivclose_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Private Sub ivClose_MouseClicked (EventData As Mou";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="File.Delete(File.DirApp, \"Driveway.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Driveway.jpg");
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="File.Delete(File.DirApp, \"FrontDoor.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"FrontDoor.jpg");
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="File.Delete(File.DirApp, \"SideYard.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"SideYard.jpg");
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"screenshot.jpg");
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"media.mp4");
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="End Sub";
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
cloyd.blink.frmmedia _mf = null;

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
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Dim mf As frmMedia";
_mf = new cloyd.blink.frmmedia();
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (null,ba,parent._mainform);
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="mf.timestamp = lblDriveway.Text";
_mf._timestamp /*String*/  = parent._lbldriveway.getText();
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="mf.url=$\"    <h1>${lblDriveway.Text}</h1>    <img";
_mf._url /*String*/  = ("\n"+"   <h1>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._lbldriveway.getText()))+"</h1>\n"+"   <img src=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Driveway.jpg")))+"\"/>\n"+"   \n"+"");
RDebugUtils.currentLine=2228233;
 //BA.debugLineNum = 2228233;BA.debugLine="mf.Show";
_mf._show /*String*/ (null);
RDebugUtils.currentLine=2228234;
 //BA.debugLineNum = 2228234;BA.debugLine="Return";
if (true) return ;
RDebugUtils.currentLine=2228272;
 //BA.debugLineNum = 2228272;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia-s";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/api/v1/accounts/88438/media/changed?since=2019-04-19T23:11:20+0000&page=1");
RDebugUtils.currentLine=2228274;
 //BA.debugLineNum = 2228274;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "ivdriveway_mouseclicked"),(int) (1000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=2228275;
 //BA.debugLineNum = 2228275;BA.debugLine="Log(response)";
anywheresoftware.b4a.keywords.Common.Log(parent._response);
RDebugUtils.currentLine=2228276;
 //BA.debugLineNum = 2228276;BA.debugLine="File.WriteString(File.DirApp,\"response.txt\",respo";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"response.txt",parent._response);
RDebugUtils.currentLine=2228307;
 //BA.debugLineNum = 2228307;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _ivfrontdoor_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "ivfrontdoor_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "ivfrontdoor_mouseclicked", new Object[] {_eventdata}));}
cloyd.blink.frmmedia _mf = null;
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub ivFrontDoor_MouseClicked (EventData As MouseEv";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Dim mf As frmMedia";
_mf = new cloyd.blink.frmmedia();
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (null,ba,_mainform);
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="mf.timestamp = lblFrontDoor.Text";
_mf._timestamp /*String*/  = _lblfrontdoor.getText();
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="mf.url=$\"    <h1>${lblFrontDoor.Text}</h1>    <im";
_mf._url /*String*/  = ("\n"+"   <h1>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lblfrontdoor.getText()))+"</h1>\n"+"   <img src=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"FrontDoor.jpg")))+"\"/>\n"+"   \n"+"");
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="mf.Show";
_mf._show /*String*/ (null);
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="End Sub";
return "";
}
public static String  _ivmax_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "ivmax_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "ivmax_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Private Sub ivMax_MouseClicked (EventData As Mouse";
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return "";
}
public static String  _ivmin_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "ivmin_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "ivmin_mouseclicked", new Object[] {_eventdata}));}
anywheresoftware.b4j.object.JavaObject _jmf = null;
anywheresoftware.b4j.object.JavaObject _stage = null;
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Private Sub ivMin_MouseClicked (EventData As Mouse";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Try";
try {RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Dim jmf As JavaObject = MainForm";
_jmf = new anywheresoftware.b4j.object.JavaObject();
_jmf.setObject((java.lang.Object)(_mainform));
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Dim stage As JavaObject = jmf.GetField(\"stage\")";
_stage = new anywheresoftware.b4j.object.JavaObject();
_stage.setObject((java.lang.Object)(_jmf.GetField("stage")));
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="stage.RunMethod(\"setIconified\", Array As Object(";
_stage.RunMethod("setIconified",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.True)});
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="End Sub";
return "";
}
public static String  _ivsideyard_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "ivsideyard_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "ivsideyard_mouseclicked", new Object[] {_eventdata}));}
cloyd.blink.frmmedia _mf = null;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub ivSideYard_MouseClicked (EventData As MouseEve";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Dim mf As frmMedia";
_mf = new cloyd.blink.frmmedia();
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (null,ba,_mainform);
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="mf.timestamp = lblSideYard.Text";
_mf._timestamp /*String*/  = _lblsideyard.getText();
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="mf.url=$\"    <h1>${lblSideYard.Text}</h1>    <img";
_mf._url /*String*/  = ("\n"+"   <h1>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lblsideyard.getText()))+"</h1>\n"+"   <img src=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"SideYard.jpg")))+"\"/>\n"+"   \n"+"");
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="mf.Show";
_mf._show /*String*/ (null);
RDebugUtils.currentLine=2359306;
 //BA.debugLineNum = 2359306;BA.debugLine="End Sub";
return "";
}
public static String  _lbtitle_mousedragged(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "lbtitle_mousedragged", false))
	 {return ((String) Debug.delegate(ba, "lbtitle_mousedragged", new Object[] {_eventdata}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub lbTitle_MouseDragged (EventData As Mou";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Try";
try {RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="If isMaximized Then Return";
if (_ismaximized) { 
if (true) return "";};
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="Dim jo As JavaObject = EventData";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_eventdata.getObject()));
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="MainForm.WindowLeft = jo.RunMethod(\"getScreenX\",";
_mainform.setWindowLeft((double)(BA.ObjectToNumber(_jo.RunMethod("getScreenX",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))-_xmouse);
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="MainForm.WindowTop = jo.RunMethod(\"getScreenY\",";
_mainform.setWindowTop((double)(BA.ObjectToNumber(_jo.RunMethod("getScreenY",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))-_ymouse);
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="End Sub";
return "";
}
public static String  _lbtitle_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "lbtitle_mousepressed", false))
	 {return ((String) Debug.delegate(ba, "lbtitle_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub lbTitle_MousePressed (EventData As Mou";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Try";
try {RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="xMouse = EventData.X + lbTitle.Left + 15";
_xmouse = _eventdata.getX()+_lbtitle.getLeft()+15;
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="yMouse = EventData.Y + lbTitle.Top + 15";
_ymouse = _eventdata.getY()+_lbtitle.getTop()+15;
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="End Sub";
return "";
}
public static String  _max_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "max_entered_event", false))
	 {return ((String) Debug.delegate(ba, "max_entered_event", new Object[] {_e}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Private Sub Max_Entered_Event(e As Event)";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Try";
try {RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmax.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMaxEnt.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="End Sub";
return "";
}
public static String  _max_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "max_exited_event", false))
	 {return ((String) Debug.delegate(ba, "max_exited_event", new Object[] {_e}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Private Sub Max_Exited_Event(e As Event)";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Try";
try {RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmax.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMax.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="End Sub";
return "";
}
public static String  _min_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "min_entered_event", false))
	 {return ((String) Debug.delegate(ba, "min_entered_event", new Object[] {_e}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Private Sub Min_Entered_Event(e As Event)";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Try";
try {RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmin.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMinEnt.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="End Sub";
return "";
}
public static String  _min_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "min_exited_event", false))
	 {return ((String) Debug.delegate(ba, "min_exited_event", new Object[] {_e}));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Private Sub Min_Exited_Event(e As Event)";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Try";
try {RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmin.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMin.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="End Sub";
return "";
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
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Try";
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
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="response = \"\"";
parent._response = "";
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no";
_j._initialize /*String*/ (null,ba,"",main.getObject());
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="j.PostString(url,\"\")";
_j._poststring /*String*/ (null,_url,"");
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="j.GetRequest.SetContentType(\"application/x-www-f";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/x-www-form-urlencoded");
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("TOKEN_AUTH",parent._authtoken);
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "restpost"), (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[0];
;
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="response = j.GetString";
parent._response = _j._getstring /*String*/ (null);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
parent._response = "ERROR: "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=458765;
 //BA.debugLineNum = 458765;BA.debugLine="lblStatus.Text = \"ERROR: \" & j.ErrorMessage";
parent._lblstatus.setText("ERROR: "+_j._errormessage /*String*/ );
 if (true) break;

case 9:
//C
this.state = 12;
;
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=458769;
 //BA.debugLineNum = 458769;BA.debugLine="response = \"ERROR: \" & LastException";
parent._response = "ERROR: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba));
RDebugUtils.currentLine=458770;
 //BA.debugLineNum = 458770;BA.debugLine="Log(\"RESTPost LastException: \" & LastException)";
anywheresoftware.b4a.keywords.Common.Log("RESTPost LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=458771;
 //BA.debugLineNum = 458771;BA.debugLine="lblStatus.Text = \"RESTPost LastException: \" & La";
parent._lblstatus.setText("RESTPost LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=458773;
 //BA.debugLineNum = 458773;BA.debugLine="Log(\"URL: \" & url)";
anywheresoftware.b4a.keywords.Common.Log("URL: "+_url);
RDebugUtils.currentLine=458774;
 //BA.debugLineNum = 458774;BA.debugLine="Log(\"Response: \" & response)";
anywheresoftware.b4a.keywords.Common.Log("Response: "+parent._response);
RDebugUtils.currentLine=458775;
 //BA.debugLineNum = 458775;BA.debugLine="Return(response)";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)((parent._response)));return;};
RDebugUtils.currentLine=458776;
 //BA.debugLineNum = 458776;BA.debugLine="End Sub";
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