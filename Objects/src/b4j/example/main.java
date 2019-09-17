package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("b4j.example", null, null);
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


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
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
public static b4j.example.httputils2service _httputils2service = null;
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
RDebugUtils.currentLine=65584;
 //BA.debugLineNum = 65584;BA.debugLine="MainForm.WindowLeft = CheckMonitor.MinX 'fx.Prim";
_mainform.setWindowLeft(_checkmonitor().getMinX());
RDebugUtils.currentLine=65586;
 //BA.debugLineNum = 65586;BA.debugLine="MainForm.WindowTop = CheckMonitor.MinY 'fx.Prima";
_mainform.setWindowTop(_checkmonitor().getMinY());
RDebugUtils.currentLine=65588;
 //BA.debugLineNum = 65588;BA.debugLine="lblStatus.TextColor = fx.Colors.White";
_lblstatus.setTextColor(_fx.Colors.White);
RDebugUtils.currentLine=65589;
 //BA.debugLineNum = 65589;BA.debugLine="MainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=65590;
 //BA.debugLineNum = 65590;BA.debugLine="RequestAuthToken";
_requestauthtoken();
 } 
       catch (Exception e49) {
			ba.setLastException(e49);RDebugUtils.currentLine=65592;
 //BA.debugLineNum = 65592;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=65595;
 //BA.debugLineNum = 65595;BA.debugLine="End Sub";
return "";
}
public static String  _get_css() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "get_css", false))
	 {return ((String) Debug.delegate(ba, "get_css", null));}
anywheresoftware.b4j.object.JavaObject _jform = null;
anywheresoftware.b4j.object.JavaObject _scene = null;
anywheresoftware.b4a.objects.collections.List _stylesheets = null;
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Public Sub Get_css";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Try";
try {RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="Dim jForm As JavaObject = MainForm";
_jform = new anywheresoftware.b4j.object.JavaObject();
_jform.setObject((java.lang.Object)(_mainform));
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="Dim scene As JavaObject = jForm.GetField(\"scene\"";
_scene = new anywheresoftware.b4j.object.JavaObject();
_scene.setObject((java.lang.Object)(_jform.GetField("scene")));
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="Dim stylesheets As List = scene.RunMethod(\"getSt";
_stylesheets = new anywheresoftware.b4a.objects.collections.List();
_stylesheets.setObject((java.util.List)(_scene.RunMethod("getStylesheets",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="stylesheets.Clear";
_stylesheets.Clear();
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="stylesheets.Add(File.GetUri(File.DirAssets, imgI";
_stylesheets.Add((Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+".css")));
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=3342344;
 //BA.debugLineNum = 3342344;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=3342346;
 //BA.debugLineNum = 3342346;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.JFX.ScreenWrapper  _checkmonitor() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "checkmonitor", false))
	 {return ((anywheresoftware.b4j.objects.JFX.ScreenWrapper) Debug.delegate(ba, "checkmonitor", null));}
anywheresoftware.b4a.objects.collections.List _slist = null;
anywheresoftware.b4j.objects.JFX.ScreenWrapper _s = null;
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub CheckMonitor() As Screen";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Try";
try {RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="If fx.Screens.Size= 1 Then";
if (_fx.getScreens().getSize()==1) { 
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="Return S";
if (true) return _s;
 }else 
{RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="Else If fx.Screens.Size> 1 Then";
if (_fx.getScreens().getSize()>1) { 
RDebugUtils.currentLine=3604488;
 //BA.debugLineNum = 3604488;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
RDebugUtils.currentLine=3604489;
 //BA.debugLineNum = 3604489;BA.debugLine="Dim S As Screen = SList.Get(2)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (2))));
RDebugUtils.currentLine=3604491;
 //BA.debugLineNum = 3604491;BA.debugLine="Return S";
if (true) return _s;
 }else {
RDebugUtils.currentLine=3604493;
 //BA.debugLineNum = 3604493;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
RDebugUtils.currentLine=3604494;
 //BA.debugLineNum = 3604494;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=3604496;
 //BA.debugLineNum = 3604496;BA.debugLine="Return S";
if (true) return _s;
 }}
;
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=3604499;
 //BA.debugLineNum = 3604499;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
RDebugUtils.currentLine=3604500;
 //BA.debugLineNum = 3604500;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=3604502;
 //BA.debugLineNum = 3604502;BA.debugLine="Return S";
if (true) return _s;
 };
RDebugUtils.currentLine=3604504;
 //BA.debugLineNum = 3604504;BA.debugLine="End Sub";
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
public ResumableSub_RequestAuthToken(b4j.example.main parent) {
this.parent = parent;
}
b4j.example.main parent;
b4j.example.httpjob _joblogin = null;

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
RDebugUtils.currentLine=12582918;
 //BA.debugLineNum = 12582918;BA.debugLine="Try";
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
RDebugUtils.currentLine=12582919;
 //BA.debugLineNum = 12582919;BA.debugLine="lblStatus.Text = \"Authenticating...\"";
parent._lblstatus.setText("Authenticating...");
RDebugUtils.currentLine=12582920;
 //BA.debugLineNum = 12582920;BA.debugLine="Dim jobLogin As HttpJob";
_joblogin = new b4j.example.httpjob();
RDebugUtils.currentLine=12582921;
 //BA.debugLineNum = 12582921;BA.debugLine="jobLogin.Initialize(\"\", Me)";
_joblogin._initialize /*String*/ (null,ba,"",main.getObject());
RDebugUtils.currentLine=12582922;
 //BA.debugLineNum = 12582922;BA.debugLine="jobLogin.PostString(\"https://rest.prod.immedia-s";
_joblogin._poststring /*String*/ (null,"https://rest.prod.immedia-semi.com/login","email="+parent._emailaddress+"&password="+parent._password);
RDebugUtils.currentLine=12582923;
 //BA.debugLineNum = 12582923;BA.debugLine="jobLogin.GetRequest.SetContentType(\"application/";
_joblogin._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/x-www-form-urlencoded");
RDebugUtils.currentLine=12582924;
 //BA.debugLineNum = 12582924;BA.debugLine="Wait For (jobLogin) JobDone(jobLogin As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "requestauthtoken"), (Object)(_joblogin));
this.state = 25;
return;
case 25:
//C
this.state = 4;
_joblogin = (b4j.example.httpjob) result[0];
;
RDebugUtils.currentLine=12582925;
 //BA.debugLineNum = 12582925;BA.debugLine="If jobLogin.Success Then";
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
RDebugUtils.currentLine=12582926;
 //BA.debugLineNum = 12582926;BA.debugLine="lblStatus.Text = \"Successfully logged in to the";
parent._lblstatus.setText("Successfully logged in to the Blink server...");
RDebugUtils.currentLine=12582928;
 //BA.debugLineNum = 12582928;BA.debugLine="GetAuthInfo(jobLogin.GetString)";
_getauthinfo(_joblogin._getstring /*String*/ (null));
RDebugUtils.currentLine=12582930;
 //BA.debugLineNum = 12582930;BA.debugLine="RESTGet(\"https://rest-\" & userRegion & \".immedi";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/user");
RDebugUtils.currentLine=12582931;
 //BA.debugLineNum = 12582931;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "requestauthtoken"),(int) (1000));
this.state = 26;
return;
case 26:
//C
this.state = 7;
;
RDebugUtils.currentLine=12582932;
 //BA.debugLineNum = 12582932;BA.debugLine="If response.StartsWith(\"ERROR: \") Then";
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
RDebugUtils.currentLine=12582933;
 //BA.debugLineNum = 12582933;BA.debugLine="Log(response)";
anywheresoftware.b4a.keywords.Common.Log(parent._response);
RDebugUtils.currentLine=12582934;
 //BA.debugLineNum = 12582934;BA.debugLine="lblStatus.Text = response";
parent._lblstatus.setText(parent._response);
RDebugUtils.currentLine=12582935;
 //BA.debugLineNum = 12582935;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=12582937;
 //BA.debugLineNum = 12582937;BA.debugLine="lblStatus.Text = \"AuthToken acquired...\"";
parent._lblstatus.setText("AuthToken acquired...");
RDebugUtils.currentLine=12582938;
 //BA.debugLineNum = 12582938;BA.debugLine="GetUserInfo(response)";
_getuserinfo(parent._response);
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=12582941;
 //BA.debugLineNum = 12582941;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/api/v1/camera/usage");
RDebugUtils.currentLine=12582942;
 //BA.debugLineNum = 12582942;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "requestauthtoken"),(int) (1000));
this.state = 27;
return;
case 27:
//C
this.state = 13;
;
RDebugUtils.currentLine=12582943;
 //BA.debugLineNum = 12582943;BA.debugLine="If response.StartsWith(\"ERROR: \") Then";
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
RDebugUtils.currentLine=12582944;
 //BA.debugLineNum = 12582944;BA.debugLine="Log(response)";
anywheresoftware.b4a.keywords.Common.Log(parent._response);
RDebugUtils.currentLine=12582945;
 //BA.debugLineNum = 12582945;BA.debugLine="lblStatus.Text = response";
parent._lblstatus.setText(parent._response);
RDebugUtils.currentLine=12582946;
 //BA.debugLineNum = 12582946;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=12582948;
 //BA.debugLineNum = 12582948;BA.debugLine="GetAllCameras(response)";
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
RDebugUtils.currentLine=12582951;
 //BA.debugLineNum = 12582951;BA.debugLine="lblStatus.Text = \"RequestAuthToken error: \" & j";
parent._lblstatus.setText("RequestAuthToken error: "+_joblogin._getstring /*String*/ (null));
RDebugUtils.currentLine=12582952;
 //BA.debugLineNum = 12582952;BA.debugLine="Log(\"RequestAuthToken error: \" & jobLogin.GetSt";
anywheresoftware.b4a.keywords.Common.Log("RequestAuthToken error: "+_joblogin._getstring /*String*/ (null));
RDebugUtils.currentLine=12582953;
 //BA.debugLineNum = 12582953;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 21:
//C
this.state = 24;
;
RDebugUtils.currentLine=12582955;
 //BA.debugLineNum = 12582955;BA.debugLine="jobLogin.Release";
_joblogin._release /*String*/ (null);
RDebugUtils.currentLine=12582956;
 //BA.debugLineNum = 12582956;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
RDebugUtils.currentLine=12582958;
 //BA.debugLineNum = 12582958;BA.debugLine="RefreshCameras";
_refreshcameras();
 if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
RDebugUtils.currentLine=12582960;
 //BA.debugLineNum = 12582960;BA.debugLine="lblStatus.Text = \"RequestAuthToken LastException";
parent._lblstatus.setText("RequestAuthToken LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=12582961;
 //BA.debugLineNum = 12582961;BA.debugLine="Log(\"RequestAuthToken LastException: \" & LastExc";
anywheresoftware.b4a.keywords.Common.Log("RequestAuthToken LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=12582963;
 //BA.debugLineNum = 12582963;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Sub btnDriveway_Click";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="RefreshCameras";
_refreshcameras();
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="End Sub";
return "";
}
public static void  _refreshcameras() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "refreshcameras", false))
	 {Debug.delegate(ba, "refreshcameras", null); return;}
ResumableSub_RefreshCameras rsub = new ResumableSub_RefreshCameras(null);
rsub.resume(ba, null);
}
public static class ResumableSub_RefreshCameras extends BA.ResumableSub {
public ResumableSub_RefreshCameras(b4j.example.main parent) {
this.parent = parent;
}
b4j.example.main parent;
String _camera = "";
anywheresoftware.b4j.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.collections.List _links = null;
String _link = "";
int _i = 0;
anywheresoftware.b4a.BA.IterableList group6;
int index6;
int groupLen6;
int step33;
int limit33;

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
RDebugUtils.currentLine=12058630;
 //BA.debugLineNum = 12058630;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 69;
this.catchState = 68;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 68;
RDebugUtils.currentLine=12058631;
 //BA.debugLineNum = 12058631;BA.debugLine="Dim camera As String";
_camera = "";
RDebugUtils.currentLine=12058632;
 //BA.debugLineNum = 12058632;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=12058633;
 //BA.debugLineNum = 12058633;BA.debugLine="Dim links As List";
_links = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12058634;
 //BA.debugLineNum = 12058634;BA.debugLine="links = Array(\"347574\", \"236967\", \"226821\")";
_links = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("347574"),(Object)("236967"),(Object)("226821")});
RDebugUtils.currentLine=12058636;
 //BA.debugLineNum = 12058636;BA.debugLine="For Each link As String In links";
if (true) break;

case 4:
//for
this.state = 66;
group6 = _links;
index6 = 0;
groupLen6 = group6.getSize();
this.state = 70;
if (true) break;

case 70:
//C
this.state = 66;
if (index6 < groupLen6) {
this.state = 6;
_link = BA.ObjectToString(group6.Get(index6));}
if (true) break;

case 71:
//C
this.state = 70;
index6++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=12058637;
 //BA.debugLineNum = 12058637;BA.debugLine="camera = link";
_camera = _link;
RDebugUtils.currentLine=12058638;
 //BA.debugLineNum = 12058638;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 7:
//if
this.state = 14;
if ((_camera).equals("347574")) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=12058641;
 //BA.debugLineNum = 12058641;BA.debugLine="Else If camera = \"236967\" Then";
if ((_camera).equals("236967")) { 
this.state = 11;
}else 
{RDebugUtils.currentLine=12058644;
 //BA.debugLineNum = 12058644;BA.debugLine="Else If camera = \"226821\" Then";
if ((_camera).equals("226821")) { 
this.state = 13;
}}}
if (true) break;

case 9:
//C
this.state = 14;
RDebugUtils.currentLine=12058639;
 //BA.debugLineNum = 12058639;BA.debugLine="lblStatus.Text = \"Capturing a new thumbnail fo";
parent._lblstatus.setText("Capturing a new thumbnail for the Driveway...");
RDebugUtils.currentLine=12058640;
 //BA.debugLineNum = 12058640;BA.debugLine="iv = ivDriveway";
_iv = parent._ivdriveway;
 if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=12058642;
 //BA.debugLineNum = 12058642;BA.debugLine="lblStatus.Text = \"Capturing a new thumbnail fo";
parent._lblstatus.setText("Capturing a new thumbnail for the Front Door...");
RDebugUtils.currentLine=12058643;
 //BA.debugLineNum = 12058643;BA.debugLine="iv = ivFrontDoor";
_iv = parent._ivfrontdoor;
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=12058645;
 //BA.debugLineNum = 12058645;BA.debugLine="lblStatus.Text = \"Capturing a new thumbnail fo";
parent._lblstatus.setText("Capturing a new thumbnail for the Side Yard...");
RDebugUtils.currentLine=12058646;
 //BA.debugLineNum = 12058646;BA.debugLine="iv = ivSideYard";
_iv = parent._ivsideyard;
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=12058650;
 //BA.debugLineNum = 12058650;BA.debugLine="RESTPost(\"https://rest-\" & userRegion &\".immedi";
_restpost("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera+"/thumbnail");
RDebugUtils.currentLine=12058651;
 //BA.debugLineNum = 12058651;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"),(int) (1000));
this.state = 72;
return;
case 72:
//C
this.state = 15;
;
RDebugUtils.currentLine=12058652;
 //BA.debugLineNum = 12058652;BA.debugLine="If response.StartsWith(\"ERROR: \") Then";
if (true) break;

case 15:
//if
this.state = 65;
if (parent._response.startsWith("ERROR: ")) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 65;
RDebugUtils.currentLine=12058653;
 //BA.debugLineNum = 12058653;BA.debugLine="Log(response)";
anywheresoftware.b4a.keywords.Common.Log(parent._response);
RDebugUtils.currentLine=12058654;
 //BA.debugLineNum = 12058654;BA.debugLine="lblStatus.Text = response";
parent._lblstatus.setText(parent._response);
RDebugUtils.currentLine=12058655;
 //BA.debugLineNum = 12058655;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=12058657;
 //BA.debugLineNum = 12058657;BA.debugLine="GetCommandID(response)";
_getcommandid(parent._response);
RDebugUtils.currentLine=12058658;
 //BA.debugLineNum = 12058658;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedi";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
RDebugUtils.currentLine=12058659;
 //BA.debugLineNum = 12058659;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"),(int) (1000));
this.state = 73;
return;
case 73:
//C
this.state = 20;
;
RDebugUtils.currentLine=12058660;
 //BA.debugLineNum = 12058660;BA.debugLine="If response.StartsWith(\"ERROR: \") Then";
if (true) break;

case 20:
//if
this.state = 64;
if (parent._response.startsWith("ERROR: ")) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 64;
RDebugUtils.currentLine=12058661;
 //BA.debugLineNum = 12058661;BA.debugLine="Log(response)";
anywheresoftware.b4a.keywords.Common.Log(parent._response);
RDebugUtils.currentLine=12058662;
 //BA.debugLineNum = 12058662;BA.debugLine="lblStatus.Text = response";
parent._lblstatus.setText(parent._response);
RDebugUtils.currentLine=12058663;
 //BA.debugLineNum = 12058663;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=12058665;
 //BA.debugLineNum = 12058665;BA.debugLine="For i = 1 To 30";
if (true) break;

case 25:
//for
this.state = 42;
step33 = 1;
limit33 = (int) (30);
_i = (int) (1) ;
this.state = 74;
if (true) break;

case 74:
//C
this.state = 42;
if ((step33 > 0 && _i <= limit33) || (step33 < 0 && _i >= limit33)) this.state = 27;
if (true) break;

case 75:
//C
this.state = 74;
_i = ((int)(0 + _i + step33)) ;
if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=12058666;
 //BA.debugLineNum = 12058666;BA.debugLine="GetCommandStatus(response)";
_getcommandstatus(parent._response);
RDebugUtils.currentLine=12058667;
 //BA.debugLineNum = 12058667;BA.debugLine="If commandComplete Then";
if (true) break;

case 28:
//if
this.state = 41;
if (parent._commandcomplete) { 
this.state = 30;
}else {
this.state = 32;
}if (true) break;

case 30:
//C
this.state = 41;
RDebugUtils.currentLine=12058668;
 //BA.debugLineNum = 12058668;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".imm";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera);
RDebugUtils.currentLine=12058669;
 //BA.debugLineNum = 12058669;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"),(int) (1000));
this.state = 76;
return;
case 76:
//C
this.state = 41;
;
RDebugUtils.currentLine=12058670;
 //BA.debugLineNum = 12058670;BA.debugLine="GetCameraInfo(response)";
_getcamerainfo(parent._response);
RDebugUtils.currentLine=12058671;
 //BA.debugLineNum = 12058671;BA.debugLine="DownloadImage(\"https://rest-\" & userRegion";
_downloadimage("https://rest-"+parent._userregion+".immedia-semi.com/"+parent._camerathumbnail+".jpg",_iv);
RDebugUtils.currentLine=12058672;
 //BA.debugLineNum = 12058672;BA.debugLine="Exit";
this.state = 42;
if (true) break;
 if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=12058674;
 //BA.debugLineNum = 12058674;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 33:
//if
this.state = 40;
if ((_camera).equals("347574")) { 
this.state = 35;
}else 
{RDebugUtils.currentLine=12058676;
 //BA.debugLineNum = 12058676;BA.debugLine="Else If camera = \"236967\" Then";
if ((_camera).equals("236967")) { 
this.state = 37;
}else 
{RDebugUtils.currentLine=12058678;
 //BA.debugLineNum = 12058678;BA.debugLine="Else If camera = \"226821\" Then";
if ((_camera).equals("226821")) { 
this.state = 39;
}}}
if (true) break;

case 35:
//C
this.state = 40;
RDebugUtils.currentLine=12058675;
 //BA.debugLineNum = 12058675;BA.debugLine="lblStatus.Text = \"Awaiting for the Drivewa";
parent._lblstatus.setText("Awaiting for the Driveway thumbnail... "+BA.NumberToString(_i)+"/30");
 if (true) break;

case 37:
//C
this.state = 40;
RDebugUtils.currentLine=12058677;
 //BA.debugLineNum = 12058677;BA.debugLine="lblStatus.Text = \"Awaiting for the Front D";
parent._lblstatus.setText("Awaiting for the Front Door thumbnail...  "+BA.NumberToString(_i)+"/30");
 if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=12058679;
 //BA.debugLineNum = 12058679;BA.debugLine="lblStatus.Text = \"Awaiting for the Side Ya";
parent._lblstatus.setText("Awaiting for the Side Yard thumbnail... "+BA.NumberToString(_i)+"/30");
 if (true) break;

case 40:
//C
this.state = 41;
;
 if (true) break;

case 41:
//C
this.state = 75;
;
RDebugUtils.currentLine=12058682;
 //BA.debugLineNum = 12058682;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".imme";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
RDebugUtils.currentLine=12058683;
 //BA.debugLineNum = 12058683;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"),(int) (1000));
this.state = 77;
return;
case 77:
//C
this.state = 75;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=12058685;
 //BA.debugLineNum = 12058685;BA.debugLine="If commandComplete = False Then";

case 42:
//if
this.state = 63;
if (parent._commandcomplete==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 44;
}else {
this.state = 54;
}if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=12058686;
 //BA.debugLineNum = 12058686;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 45:
//if
this.state = 52;
if ((_camera).equals("347574")) { 
this.state = 47;
}else 
{RDebugUtils.currentLine=12058689;
 //BA.debugLineNum = 12058689;BA.debugLine="Else If camera = \"236967\" Then";
if ((_camera).equals("236967")) { 
this.state = 49;
}else 
{RDebugUtils.currentLine=12058692;
 //BA.debugLineNum = 12058692;BA.debugLine="Else If camera = \"226821\" Then";
if ((_camera).equals("226821")) { 
this.state = 51;
}}}
if (true) break;

case 47:
//C
this.state = 52;
RDebugUtils.currentLine=12058687;
 //BA.debugLineNum = 12058687;BA.debugLine="lblStatus.Text = \"Failed to retrieve Drivew";
parent._lblstatus.setText("Failed to retrieve Driveway thumbnail...");
RDebugUtils.currentLine=12058688;
 //BA.debugLineNum = 12058688;BA.debugLine="ivDriveway.SetImage(Null)";
parent._ivdriveway.SetImage((javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;

case 49:
//C
this.state = 52;
RDebugUtils.currentLine=12058690;
 //BA.debugLineNum = 12058690;BA.debugLine="lblStatus.Text = \"Failed to retrieve Front";
parent._lblstatus.setText("Failed to retrieve Front Door thumbnail...");
RDebugUtils.currentLine=12058691;
 //BA.debugLineNum = 12058691;BA.debugLine="ivFrontDoor.SetImage(Null)";
parent._ivfrontdoor.SetImage((javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=12058693;
 //BA.debugLineNum = 12058693;BA.debugLine="lblStatus.Text = \"Failed to retrieve Side Y";
parent._lblstatus.setText("Failed to retrieve Side Yard thumbnail...");
RDebugUtils.currentLine=12058694;
 //BA.debugLineNum = 12058694;BA.debugLine="ivSideYard.SetImage(Null)";
parent._ivsideyard.SetImage((javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
 if (true) break;

case 52:
//C
this.state = 63;
;
 if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=12058697;
 //BA.debugLineNum = 12058697;BA.debugLine="DateTime.DateFormat = \"h:mm:ss a\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("h:mm:ss a");
RDebugUtils.currentLine=12058698;
 //BA.debugLineNum = 12058698;BA.debugLine="lblStatus.Text = \"Last updated: \" & DateTime";
parent._lblstatus.setText("Last updated: "+anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
RDebugUtils.currentLine=12058699;
 //BA.debugLineNum = 12058699;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 55:
//if
this.state = 62;
if ((_camera).equals("347574")) { 
this.state = 57;
}else 
{RDebugUtils.currentLine=12058701;
 //BA.debugLineNum = 12058701;BA.debugLine="Else If camera = \"236967\" Then";
if ((_camera).equals("236967")) { 
this.state = 59;
}else 
{RDebugUtils.currentLine=12058703;
 //BA.debugLineNum = 12058703;BA.debugLine="Else If camera = \"226821\" Then";
if ((_camera).equals("226821")) { 
this.state = 61;
}}}
if (true) break;

case 57:
//C
this.state = 62;
RDebugUtils.currentLine=12058700;
 //BA.debugLineNum = 12058700;BA.debugLine="lblDriveway.Text = lblStatus.Text";
parent._lbldriveway.setText(parent._lblstatus.getText());
 if (true) break;

case 59:
//C
this.state = 62;
RDebugUtils.currentLine=12058702;
 //BA.debugLineNum = 12058702;BA.debugLine="lblFrontDoor.Text = lblStatus.Text";
parent._lblfrontdoor.setText(parent._lblstatus.getText());
 if (true) break;

case 61:
//C
this.state = 62;
RDebugUtils.currentLine=12058704;
 //BA.debugLineNum = 12058704;BA.debugLine="lblSideYard.Text = lblStatus.Text";
parent._lblsideyard.setText(parent._lblstatus.getText());
 if (true) break;

case 62:
//C
this.state = 63;
;
 if (true) break;

case 63:
//C
this.state = 64;
;
 if (true) break;

case 64:
//C
this.state = 65;
;
 if (true) break;

case 65:
//C
this.state = 71;
;
 if (true) break;
if (true) break;

case 66:
//C
this.state = 69;
;
 if (true) break;

case 68:
//C
this.state = 69;
this.catchState = 0;
RDebugUtils.currentLine=12058711;
 //BA.debugLineNum = 12058711;BA.debugLine="Log(\"RefreshCamera LastException: \" & LastExcept";
anywheresoftware.b4a.keywords.Common.Log("RefreshCamera LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=12058712;
 //BA.debugLineNum = 12058712;BA.debugLine="lblStatus.Text = \"RefreshCamera LastException: \"";
parent._lblstatus.setText("RefreshCamera LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 69:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=12058714;
 //BA.debugLineNum = 12058714;BA.debugLine="End Sub";
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
public static String  _button1_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "button1_action", false))
	 {return ((String) Debug.delegate(ba, "button1_action", null));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Private Sub Button1_Action";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Try";
try {RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="ivMax.Visible = Not(ivMax.Visible)";
_ivmax.setVisible(anywheresoftware.b4a.keywords.Common.Not(_ivmax.getVisible()));
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="ivMin.Visible = Not(ivMin.Visible)";
_ivmin.setVisible(anywheresoftware.b4a.keywords.Common.Not(_ivmin.getVisible()));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="End Sub";
return "";
}
public static String  _close_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "close_entered_event", false))
	 {return ((String) Debug.delegate(ba, "close_entered_event", new Object[] {_e}));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub Close_Entered_Event(e As Event)";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Try";
try {RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
_ivclose.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btCloseEnt.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="End Sub";
return "";
}
public static String  _close_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "close_exited_event", false))
	 {return ((String) Debug.delegate(ba, "close_exited_event", new Object[] {_e}));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Private Sub Close_Exited_Event(e As Event)";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Try";
try {RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
_ivclose.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btClose.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="End Sub";
return "";
}
public static void  _downloadimage(String _link,anywheresoftware.b4j.objects.ImageViewWrapper _iv) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "downloadimage", false))
	 {Debug.delegate(ba, "downloadimage", new Object[] {_link,_iv}); return;}
ResumableSub_DownloadImage rsub = new ResumableSub_DownloadImage(null,_link,_iv);
rsub.resume(ba, null);
}
public static class ResumableSub_DownloadImage extends BA.ResumableSub {
public ResumableSub_DownloadImage(b4j.example.main parent,String _link,anywheresoftware.b4j.objects.ImageViewWrapper _iv) {
this.parent = parent;
this._link = _link;
this._iv = _iv;
}
b4j.example.main parent;
String _link;
anywheresoftware.b4j.objects.ImageViewWrapper _iv;
b4j.example.httpjob _j = null;

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
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="Try";
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
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="response = \"\"";
parent._response = "";
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",main.getObject());
RDebugUtils.currentLine=11141125;
 //BA.debugLineNum = 11141125;BA.debugLine="j.Download(Link)";
_j._download /*String*/ (null,_link);
RDebugUtils.currentLine=11141126;
 //BA.debugLineNum = 11141126;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("TOKEN_AUTH",parent._authtoken);
RDebugUtils.currentLine=11141127;
 //BA.debugLineNum = 11141127;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "downloadimage"), (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_j = (b4j.example.httpjob) result[0];
;
RDebugUtils.currentLine=11141128;
 //BA.debugLineNum = 11141128;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=11141133;
 //BA.debugLineNum = 11141133;BA.debugLine="iv.SetImage(j.GetBitmap)";
_iv.SetImage((javafx.scene.image.Image)(_j._getbitmap /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ (null).getObject()));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=11141135;
 //BA.debugLineNum = 11141135;BA.debugLine="response = \"ERROR: \" & j.GetString";
parent._response = "ERROR: "+_j._getstring /*String*/ (null);
 if (true) break;

case 9:
//C
this.state = 12;
;
RDebugUtils.currentLine=11141137;
 //BA.debugLineNum = 11141137;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=11141139;
 //BA.debugLineNum = 11141139;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=11141141;
 //BA.debugLineNum = 11141141;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Sub GetAllCameras(json As String)";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="lblStatus.Text = \"Getting all cameras information";
_lblstatus.setText("Getting all cameras information...");
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=8192008;
 //BA.debugLineNum = 8192008;BA.debugLine="Dim networks As List = root.Get(\"networks\")";
_networks = new anywheresoftware.b4a.objects.collections.List();
_networks.setObject((java.util.List)(_root.Get((Object)("networks"))));
RDebugUtils.currentLine=8192009;
 //BA.debugLineNum = 8192009;BA.debugLine="For Each colnetworks As Map In networks";
_colnetworks = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group6 = _networks;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_colnetworks.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group6.Get(index6)));
RDebugUtils.currentLine=8192018;
 //BA.debugLineNum = 8192018;BA.debugLine="networkID = colnetworks.Get(\"network_id\")";
_networkid = BA.ObjectToString(_colnetworks.Get((Object)("network_id")));
RDebugUtils.currentLine=8192019;
 //BA.debugLineNum = 8192019;BA.debugLine="Log(\"networkID: \" &  networkID)";
anywheresoftware.b4a.keywords.Common.Log("networkID: "+_networkid);
 }
};
RDebugUtils.currentLine=8192022;
 //BA.debugLineNum = 8192022;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Sub GetAuthInfo(json As String)";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="lblStatus.Text = \"Getting authtoken...\"";
_lblstatus.setText("Getting authtoken...");
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=7012357;
 //BA.debugLineNum = 7012357;BA.debugLine="Dim authtokenmap As Map = root.Get(\"authtoken\")";
_authtokenmap = new anywheresoftware.b4a.objects.collections.Map();
_authtokenmap.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("authtoken"))));
RDebugUtils.currentLine=7012358;
 //BA.debugLineNum = 7012358;BA.debugLine="authToken = authtokenmap.Get(\"authtoken\")";
_authtoken = BA.ObjectToString(_authtokenmap.Get((Object)("authtoken")));
RDebugUtils.currentLine=7012359;
 //BA.debugLineNum = 7012359;BA.debugLine="Log(\"authToken: \" &  authToken)";
anywheresoftware.b4a.keywords.Common.Log("authToken: "+_authtoken);
RDebugUtils.currentLine=7012367;
 //BA.debugLineNum = 7012367;BA.debugLine="Dim region As Map = root.Get(\"region\")";
_region = new anywheresoftware.b4a.objects.collections.Map();
_region.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("region"))));
RDebugUtils.currentLine=7012368;
 //BA.debugLineNum = 7012368;BA.debugLine="userRegion = region.GetKeyAt(0)";
_userregion = BA.ObjectToString(_region.GetKeyAt((int) (0)));
RDebugUtils.currentLine=7012369;
 //BA.debugLineNum = 7012369;BA.debugLine="Log(\"userRegion: \" &  userRegion)";
anywheresoftware.b4a.keywords.Common.Log("userRegion: "+_userregion);
RDebugUtils.currentLine=7012373;
 //BA.debugLineNum = 7012373;BA.debugLine="End Sub";
return "";
}
public static String  _getcamerainfo(String _json) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getcamerainfo", false))
	 {return ((String) Debug.delegate(ba, "getcamerainfo", new Object[] {_json}));}
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
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Sub GetCameraInfo(json As String)";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="Dim camera_status As Map = root.Get(\"camera_statu";
_camera_status = new anywheresoftware.b4a.objects.collections.Map();
_camera_status.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("camera_status"))));
RDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="Dim total_108_wakeups As Int = camera_status.Get(";
_total_108_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("total_108_wakeups"))));
RDebugUtils.currentLine=10813446;
 //BA.debugLineNum = 10813446;BA.debugLine="Dim battery_voltage As Int = camera_status.Get(\"b";
_battery_voltage = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("battery_voltage"))));
RDebugUtils.currentLine=10813447;
 //BA.debugLineNum = 10813447;BA.debugLine="Dim light_sensor_data_valid As String = camera_st";
_light_sensor_data_valid = BA.ObjectToString(_camera_status.Get((Object)("light_sensor_data_valid")));
RDebugUtils.currentLine=10813448;
 //BA.debugLineNum = 10813448;BA.debugLine="Dim lfr_tb_wakeups As Int = camera_status.Get(\"lf";
_lfr_tb_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lfr_tb_wakeups"))));
RDebugUtils.currentLine=10813449;
 //BA.debugLineNum = 10813449;BA.debugLine="Dim fw_git_hash As String = camera_status.Get(\"fw";
_fw_git_hash = BA.ObjectToString(_camera_status.Get((Object)("fw_git_hash")));
RDebugUtils.currentLine=10813450;
 //BA.debugLineNum = 10813450;BA.debugLine="Dim wifi_strength As Int = camera_status.Get(\"wif";
_wifi_strength = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("wifi_strength"))));
RDebugUtils.currentLine=10813451;
 //BA.debugLineNum = 10813451;BA.debugLine="Dim lfr_strength As Int = camera_status.Get(\"lfr_";
_lfr_strength = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lfr_strength"))));
RDebugUtils.currentLine=10813452;
 //BA.debugLineNum = 10813452;BA.debugLine="Dim total_tb_wakeups As Int = camera_status.Get(\"";
_total_tb_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("total_tb_wakeups"))));
RDebugUtils.currentLine=10813453;
 //BA.debugLineNum = 10813453;BA.debugLine="Dim created_at As String = camera_status.Get(\"cre";
_created_at = BA.ObjectToString(_camera_status.Get((Object)("created_at")));
RDebugUtils.currentLine=10813454;
 //BA.debugLineNum = 10813454;BA.debugLine="Dim light_sensor_ch0 As Int = camera_status.Get(\"";
_light_sensor_ch0 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("light_sensor_ch0"))));
RDebugUtils.currentLine=10813455;
 //BA.debugLineNum = 10813455;BA.debugLine="Dim mac As String = camera_status.Get(\"mac\")";
_mac = BA.ObjectToString(_camera_status.Get((Object)("mac")));
RDebugUtils.currentLine=10813456;
 //BA.debugLineNum = 10813456;BA.debugLine="Dim unit_number As Int = camera_status.Get(\"unit_";
_unit_number = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("unit_number"))));
RDebugUtils.currentLine=10813457;
 //BA.debugLineNum = 10813457;BA.debugLine="Dim updated_at As String = camera_status.Get(\"upd";
_updated_at = BA.ObjectToString(_camera_status.Get((Object)("updated_at")));
RDebugUtils.currentLine=10813458;
 //BA.debugLineNum = 10813458;BA.debugLine="Dim light_sensor_ch1 As Int = camera_status.Get(\"";
_light_sensor_ch1 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("light_sensor_ch1"))));
RDebugUtils.currentLine=10813459;
 //BA.debugLineNum = 10813459;BA.debugLine="Dim time_dhcp_lease As Int = camera_status.Get(\"t";
_time_dhcp_lease = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_dhcp_lease"))));
RDebugUtils.currentLine=10813460;
 //BA.debugLineNum = 10813460;BA.debugLine="Dim temperature As Int = camera_status.Get(\"tempe";
_temperature = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("temperature"))));
RDebugUtils.currentLine=10813461;
 //BA.debugLineNum = 10813461;BA.debugLine="Dim time_first_video As Int = camera_status.Get(\"";
_time_first_video = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_first_video"))));
RDebugUtils.currentLine=10813462;
 //BA.debugLineNum = 10813462;BA.debugLine="Dim time_dns_resolve As Int = camera_status.Get(\"";
_time_dns_resolve = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_dns_resolve"))));
RDebugUtils.currentLine=10813463;
 //BA.debugLineNum = 10813463;BA.debugLine="Dim id As Int = camera_status.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("id"))));
RDebugUtils.currentLine=10813464;
 //BA.debugLineNum = 10813464;BA.debugLine="Dim temp_alert_status As String = camera_status.G";
_temp_alert_status = BA.ObjectToString(_camera_status.Get((Object)("temp_alert_status")));
RDebugUtils.currentLine=10813465;
 //BA.debugLineNum = 10813465;BA.debugLine="Dim time_108_boot As Int = camera_status.Get(\"tim";
_time_108_boot = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_108_boot"))));
RDebugUtils.currentLine=10813466;
 //BA.debugLineNum = 10813466;BA.debugLine="Dim lfr_108_wakeups As Int = camera_status.Get(\"l";
_lfr_108_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lfr_108_wakeups"))));
RDebugUtils.currentLine=10813467;
 //BA.debugLineNum = 10813467;BA.debugLine="cameraThumbnail = camera_status.Get(\"thumbnail\")";
_camerathumbnail = BA.ObjectToString(_camera_status.Get((Object)("thumbnail")));
RDebugUtils.currentLine=10813468;
 //BA.debugLineNum = 10813468;BA.debugLine="Log(\"cameraThumbnail: \" & cameraThumbnail)";
anywheresoftware.b4a.keywords.Common.Log("cameraThumbnail: "+_camerathumbnail);
RDebugUtils.currentLine=10813469;
 //BA.debugLineNum = 10813469;BA.debugLine="Dim lifetime_duration As Int = camera_status.Get(";
_lifetime_duration = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lifetime_duration"))));
RDebugUtils.currentLine=10813470;
 //BA.debugLineNum = 10813470;BA.debugLine="Dim wifi_connect_failure_count As Int = camera_st";
_wifi_connect_failure_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("wifi_connect_failure_count"))));
RDebugUtils.currentLine=10813471;
 //BA.debugLineNum = 10813471;BA.debugLine="Dim camera_id As Int = camera_status.Get(\"camera_";
_camera_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("camera_id"))));
RDebugUtils.currentLine=10813472;
 //BA.debugLineNum = 10813472;BA.debugLine="Dim battery_alert_status As String = camera_statu";
_battery_alert_status = BA.ObjectToString(_camera_status.Get((Object)("battery_alert_status")));
RDebugUtils.currentLine=10813473;
 //BA.debugLineNum = 10813473;BA.debugLine="Dim dhcp_failure_count As Int = camera_status.Get";
_dhcp_failure_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dhcp_failure_count"))));
RDebugUtils.currentLine=10813474;
 //BA.debugLineNum = 10813474;BA.debugLine="Dim ip_address As String = camera_status.Get(\"ip_";
_ip_address = BA.ObjectToString(_camera_status.Get((Object)("ip_address")));
RDebugUtils.currentLine=10813475;
 //BA.debugLineNum = 10813475;BA.debugLine="Dim ipv As String = camera_status.Get(\"ipv\")";
_ipv = BA.ObjectToString(_camera_status.Get((Object)("ipv")));
RDebugUtils.currentLine=10813476;
 //BA.debugLineNum = 10813476;BA.debugLine="Dim light_sensor_data_new As String = camera_stat";
_light_sensor_data_new = BA.ObjectToString(_camera_status.Get((Object)("light_sensor_data_new")));
RDebugUtils.currentLine=10813477;
 //BA.debugLineNum = 10813477;BA.debugLine="Dim network_id As Int = camera_status.Get(\"networ";
_network_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("network_id"))));
RDebugUtils.currentLine=10813478;
 //BA.debugLineNum = 10813478;BA.debugLine="Dim account_id As Int = camera_status.Get(\"accoun";
_account_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("account_id"))));
RDebugUtils.currentLine=10813479;
 //BA.debugLineNum = 10813479;BA.debugLine="Dim serial As String = camera_status.Get(\"serial\"";
_serial = BA.ObjectToString(_camera_status.Get((Object)("serial")));
RDebugUtils.currentLine=10813480;
 //BA.debugLineNum = 10813480;BA.debugLine="Dim dev_1 As Int = camera_status.Get(\"dev_1\")";
_dev_1 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dev_1"))));
RDebugUtils.currentLine=10813481;
 //BA.debugLineNum = 10813481;BA.debugLine="Dim time_wlan_connect As Int = camera_status.Get(";
_time_wlan_connect = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_wlan_connect"))));
RDebugUtils.currentLine=10813482;
 //BA.debugLineNum = 10813482;BA.debugLine="Dim dev_2 As Int = camera_status.Get(\"dev_2\")";
_dev_2 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dev_2"))));
RDebugUtils.currentLine=10813483;
 //BA.debugLineNum = 10813483;BA.debugLine="Dim socket_failure_count As Int = camera_status.G";
_socket_failure_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("socket_failure_count"))));
RDebugUtils.currentLine=10813484;
 //BA.debugLineNum = 10813484;BA.debugLine="Dim dev_3 As Int = camera_status.Get(\"dev_3\")";
_dev_3 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dev_3"))));
RDebugUtils.currentLine=10813485;
 //BA.debugLineNum = 10813485;BA.debugLine="Dim pir_rejections As Int = camera_status.Get(\"pi";
_pir_rejections = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("pir_rejections"))));
RDebugUtils.currentLine=10813486;
 //BA.debugLineNum = 10813486;BA.debugLine="Dim sync_module_id As Int = camera_status.Get(\"sy";
_sync_module_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("sync_module_id"))));
RDebugUtils.currentLine=10813487;
 //BA.debugLineNum = 10813487;BA.debugLine="Dim lifetime_count As Int = camera_status.Get(\"li";
_lifetime_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lifetime_count"))));
RDebugUtils.currentLine=10813488;
 //BA.debugLineNum = 10813488;BA.debugLine="Dim error_codes As Int = camera_status.Get(\"error";
_error_codes = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("error_codes"))));
RDebugUtils.currentLine=10813489;
 //BA.debugLineNum = 10813489;BA.debugLine="Dim fw_version As String = camera_status.Get(\"fw_";
_fw_version = BA.ObjectToString(_camera_status.Get((Object)("fw_version")));
RDebugUtils.currentLine=10813490;
 //BA.debugLineNum = 10813490;BA.debugLine="Dim ac_power As String = camera_status.Get(\"ac_po";
_ac_power = BA.ObjectToString(_camera_status.Get((Object)("ac_power")));
RDebugUtils.currentLine=10813491;
 //BA.debugLineNum = 10813491;BA.debugLine="End Sub";
return "";
}
public static String  _getcommandid(String _json) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getcommandid", false))
	 {return ((String) Debug.delegate(ba, "getcommandid", new Object[] {_json}));}
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Sub GetCommandID(json As String)";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=9633810;
 //BA.debugLineNum = 9633810;BA.debugLine="commandID = root.Get(\"id\")";
_commandid = BA.ObjectToString(_root.Get((Object)("id")));
RDebugUtils.currentLine=9633811;
 //BA.debugLineNum = 9633811;BA.debugLine="Log(\"commandID: \" & commandID)";
anywheresoftware.b4a.keywords.Common.Log("commandID: "+_commandid);
RDebugUtils.currentLine=9633832;
 //BA.debugLineNum = 9633832;BA.debugLine="End Sub";
return "";
}
public static String  _getcommandstatus(String _json) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getcommandstatus", false))
	 {return ((String) Debug.delegate(ba, "getcommandstatus", new Object[] {_json}));}
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Sub GetCommandStatus(json As String)";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=10223619;
 //BA.debugLineNum = 10223619;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=10223620;
 //BA.debugLineNum = 10223620;BA.debugLine="commandComplete = root.Get(\"complete\")";
_commandcomplete = BA.ObjectToBoolean(_root.Get((Object)("complete")));
RDebugUtils.currentLine=10223621;
 //BA.debugLineNum = 10223621;BA.debugLine="Log(\"commandComplete: \" & commandComplete)";
anywheresoftware.b4a.keywords.Common.Log("commandComplete: "+BA.ObjectToString(_commandcomplete));
RDebugUtils.currentLine=10223622;
 //BA.debugLineNum = 10223622;BA.debugLine="End Sub";
return "";
}
public static String  _getuserinfo(String _json) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getuserinfo", false))
	 {return ((String) Debug.delegate(ba, "getuserinfo", new Object[] {_json}));}
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Sub GetUserInfo(json As String)";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="lblStatus.Text = \"Getting user information...\"";
_lblstatus.setText("Getting user information...");
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=7274515;
 //BA.debugLineNum = 7274515;BA.debugLine="accountID = root.Get(\"id\")";
_accountid = BA.ObjectToString(_root.Get((Object)("id")));
RDebugUtils.currentLine=7274516;
 //BA.debugLineNum = 7274516;BA.debugLine="Log(\"accountID: \" &  accountID)";
anywheresoftware.b4a.keywords.Common.Log("accountID: "+_accountid);
RDebugUtils.currentLine=7274518;
 //BA.debugLineNum = 7274518;BA.debugLine="End Sub";
return "";
}
public static String  _ivclose_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "ivclose_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "ivclose_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Private Sub ivClose_MouseClicked (EventData As Mou";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="End Sub";
return "";
}
public static String  _ivmax_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "ivmax_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "ivmax_mouseclicked", new Object[] {_eventdata}));}
anywheresoftware.b4j.objects.JFX.ScreenWrapper _scr = null;
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Private Sub ivMax_MouseClicked (EventData As Mouse";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Try";
try {RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Dim scr As Screen = fx.PrimaryScreen";
_scr = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_scr = _fx.getPrimaryScreen();
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="If isMaximized Then";
if (_ismaximized) { 
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="MainForm.WindowLeft = f_X";
_mainform.setWindowLeft(_f_x);
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="MainForm.WindowTop = f_Y";
_mainform.setWindowTop(_f_y);
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="MainForm.WindowWidth = f_W";
_mainform.setWindowWidth(_f_w);
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="MainForm.WindowHeight = f_H";
_mainform.setWindowHeight(_f_h);
 }else {
RDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="f_X = MainForm.WindowLeft";
_f_x = _mainform.getWindowLeft();
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="f_Y = MainForm.WindowTop";
_f_y = _mainform.getWindowTop();
RDebugUtils.currentLine=2686987;
 //BA.debugLineNum = 2686987;BA.debugLine="f_W = MainForm.WindowWidth";
_f_w = _mainform.getWindowWidth();
RDebugUtils.currentLine=2686988;
 //BA.debugLineNum = 2686988;BA.debugLine="f_H = MainForm.WindowHeight";
_f_h = _mainform.getWindowHeight();
RDebugUtils.currentLine=2686989;
 //BA.debugLineNum = 2686989;BA.debugLine="MainForm.WindowLeft = 0";
_mainform.setWindowLeft(0);
RDebugUtils.currentLine=2686990;
 //BA.debugLineNum = 2686990;BA.debugLine="MainForm.WindowTop = 0";
_mainform.setWindowTop(0);
RDebugUtils.currentLine=2686991;
 //BA.debugLineNum = 2686991;BA.debugLine="MainForm.WindowWidth = scr.MaxX";
_mainform.setWindowWidth(_scr.getMaxX());
RDebugUtils.currentLine=2686992;
 //BA.debugLineNum = 2686992;BA.debugLine="MainForm.WindowHeight = scr.MaxY + 40";
_mainform.setWindowHeight(_scr.getMaxY()+40);
 };
RDebugUtils.currentLine=2686994;
 //BA.debugLineNum = 2686994;BA.debugLine="isMaximized = Not(isMaximized)";
_ismaximized = anywheresoftware.b4a.keywords.Common.Not(_ismaximized);
 } 
       catch (Exception e20) {
			ba.setLastException(e20);RDebugUtils.currentLine=2686996;
 //BA.debugLineNum = 2686996;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=2686998;
 //BA.debugLineNum = 2686998;BA.debugLine="End Sub";
return "";
}
public static String  _ivmin_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "ivmin_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "ivmin_mouseclicked", new Object[] {_eventdata}));}
anywheresoftware.b4j.object.JavaObject _jmf = null;
anywheresoftware.b4j.object.JavaObject _stage = null;
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Private Sub ivMin_MouseClicked (EventData As Mouse";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Try";
try {RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="Dim jmf As JavaObject = MainForm";
_jmf = new anywheresoftware.b4j.object.JavaObject();
_jmf.setObject((java.lang.Object)(_mainform));
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="Dim stage As JavaObject = jmf.GetField(\"stage\")";
_stage = new anywheresoftware.b4j.object.JavaObject();
_stage.setObject((java.lang.Object)(_jmf.GetField("stage")));
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="stage.RunMethod(\"setIconified\", Array As Object(";
_stage.RunMethod("setIconified",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.True)});
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="End Sub";
return "";
}
public static String  _lbtitle_mousedragged(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "lbtitle_mousedragged", false))
	 {return ((String) Debug.delegate(ba, "lbtitle_mousedragged", new Object[] {_eventdata}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Private Sub lbTitle_MouseDragged (EventData As Mou";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Try";
try {RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="If isMaximized Then Return";
if (_ismaximized) { 
if (true) return "";};
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="Dim jo As JavaObject = EventData";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_eventdata.getObject()));
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="MainForm.WindowLeft = jo.RunMethod(\"getScreenX\",";
_mainform.setWindowLeft((double)(BA.ObjectToNumber(_jo.RunMethod("getScreenX",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))-_xmouse);
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="MainForm.WindowTop = jo.RunMethod(\"getScreenY\",";
_mainform.setWindowTop((double)(BA.ObjectToNumber(_jo.RunMethod("getScreenY",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))-_ymouse);
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="End Sub";
return "";
}
public static String  _lbtitle_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "lbtitle_mousepressed", false))
	 {return ((String) Debug.delegate(ba, "lbtitle_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Private Sub lbTitle_MousePressed (EventData As Mou";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Try";
try {RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="xMouse = EventData.X + lbTitle.Left + 15";
_xmouse = _eventdata.getX()+_lbtitle.getLeft()+15;
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="yMouse = EventData.Y + lbTitle.Top + 15";
_ymouse = _eventdata.getY()+_lbtitle.getTop()+15;
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="End Sub";
return "";
}
public static String  _max_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "max_entered_event", false))
	 {return ((String) Debug.delegate(ba, "max_entered_event", new Object[] {_e}));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Private Sub Max_Entered_Event(e As Event)";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Try";
try {RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmax.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMaxEnt.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="End Sub";
return "";
}
public static String  _max_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "max_exited_event", false))
	 {return ((String) Debug.delegate(ba, "max_exited_event", new Object[] {_e}));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Private Sub Max_Exited_Event(e As Event)";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Try";
try {RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmax.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMax.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="End Sub";
return "";
}
public static String  _min_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "min_entered_event", false))
	 {return ((String) Debug.delegate(ba, "min_entered_event", new Object[] {_e}));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Private Sub Min_Entered_Event(e As Event)";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Try";
try {RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmin.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMinEnt.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="End Sub";
return "";
}
public static String  _min_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "min_exited_event", false))
	 {return ((String) Debug.delegate(ba, "min_exited_event", new Object[] {_e}));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Private Sub Min_Exited_Event(e As Event)";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Try";
try {RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmin.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMin.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="End Sub";
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
public ResumableSub_RESTPost(b4j.example.main parent,String _url) {
this.parent = parent;
this._url = _url;
}
b4j.example.main parent;
String _url;
b4j.example.httpjob _j = null;

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
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Try";
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
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="response = \"\"";
parent._response = "";
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no";
_j._initialize /*String*/ (null,ba,"",main.getObject());
RDebugUtils.currentLine=8454149;
 //BA.debugLineNum = 8454149;BA.debugLine="j.PostString(url,\"\")";
_j._poststring /*String*/ (null,_url,"");
RDebugUtils.currentLine=8454150;
 //BA.debugLineNum = 8454150;BA.debugLine="j.GetRequest.SetContentType(\"application/x-www-f";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/x-www-form-urlencoded");
RDebugUtils.currentLine=8454151;
 //BA.debugLineNum = 8454151;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("TOKEN_AUTH",parent._authtoken);
RDebugUtils.currentLine=8454152;
 //BA.debugLineNum = 8454152;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "restpost"), (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_j = (b4j.example.httpjob) result[0];
;
RDebugUtils.currentLine=8454153;
 //BA.debugLineNum = 8454153;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=8454154;
 //BA.debugLineNum = 8454154;BA.debugLine="response = j.GetString";
parent._response = _j._getstring /*String*/ (null);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=8454156;
 //BA.debugLineNum = 8454156;BA.debugLine="response = \"ERROR: \" & j.GetString";
parent._response = "ERROR: "+_j._getstring /*String*/ (null);
 if (true) break;

case 9:
//C
this.state = 12;
;
RDebugUtils.currentLine=8454158;
 //BA.debugLineNum = 8454158;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=8454160;
 //BA.debugLineNum = 8454160;BA.debugLine="response = \"ERROR: \" & LastException";
parent._response = "ERROR: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba));
RDebugUtils.currentLine=8454161;
 //BA.debugLineNum = 8454161;BA.debugLine="Log(\"RESTPost LastException: \" & LastException)";
anywheresoftware.b4a.keywords.Common.Log("RESTPost LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=8454163;
 //BA.debugLineNum = 8454163;BA.debugLine="Log(\"URL: \" & url)";
anywheresoftware.b4a.keywords.Common.Log("URL: "+_url);
RDebugUtils.currentLine=8454164;
 //BA.debugLineNum = 8454164;BA.debugLine="Log(\"Response: \" & response)";
anywheresoftware.b4a.keywords.Common.Log("Response: "+parent._response);
RDebugUtils.currentLine=8454165;
 //BA.debugLineNum = 8454165;BA.debugLine="Return(response)";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)((parent._response)));return;};
RDebugUtils.currentLine=8454166;
 //BA.debugLineNum = 8454166;BA.debugLine="End Sub";
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
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "restget", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "restget", new Object[] {_url}));}
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
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="Try";
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
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="Dim j As HttpJob";
_j = new b4j.example.httpjob();
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="response = \"\"";
parent._response = "";
RDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no";
_j._initialize /*String*/ (null,ba,"",main.getObject());
RDebugUtils.currentLine=9830405;
 //BA.debugLineNum = 9830405;BA.debugLine="j.Download(url)";
_j._download /*String*/ (null,_url);
RDebugUtils.currentLine=9830406;
 //BA.debugLineNum = 9830406;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("TOKEN_AUTH",parent._authtoken);
RDebugUtils.currentLine=9830407;
 //BA.debugLineNum = 9830407;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "restget"), (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_j = (b4j.example.httpjob) result[0];
;
RDebugUtils.currentLine=9830408;
 //BA.debugLineNum = 9830408;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=9830409;
 //BA.debugLineNum = 9830409;BA.debugLine="response = j.GetString";
parent._response = _j._getstring /*String*/ (null);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=9830411;
 //BA.debugLineNum = 9830411;BA.debugLine="response = \"ERROR: \" & j.GetString";
parent._response = "ERROR: "+_j._getstring /*String*/ (null);
 if (true) break;

case 9:
//C
this.state = 12;
;
RDebugUtils.currentLine=9830413;
 //BA.debugLineNum = 9830413;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=9830415;
 //BA.debugLineNum = 9830415;BA.debugLine="response = \"ERROR: \" & LastException";
parent._response = "ERROR: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba));
RDebugUtils.currentLine=9830416;
 //BA.debugLineNum = 9830416;BA.debugLine="Log(\"RESTDownload LastException: \" & LastExcepti";
anywheresoftware.b4a.keywords.Common.Log("RESTDownload LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=9830418;
 //BA.debugLineNum = 9830418;BA.debugLine="Log(\"URL: \" & url)";
anywheresoftware.b4a.keywords.Common.Log("URL: "+_url);
RDebugUtils.currentLine=9830419;
 //BA.debugLineNum = 9830419;BA.debugLine="Log(\"Response: \" & response)";
anywheresoftware.b4a.keywords.Common.Log("Response: "+parent._response);
RDebugUtils.currentLine=9830420;
 //BA.debugLineNum = 9830420;BA.debugLine="Return(response)";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)((parent._response)));return;};
RDebugUtils.currentLine=9830421;
 //BA.debugLineNum = 9830421;BA.debugLine="End Sub";
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