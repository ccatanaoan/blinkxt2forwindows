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
public static String _twoclientfaverificationrequired = "";
public static String _twofaclientid = "";
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
public static String _drivewayarmedstatus = "";
public static String _frontdoorarmedstatus = "";
public static String _sideyardarmedstatus = "";
public static anywheresoftware.b4j.objects.ButtonWrapper _btndrivewaynewclip = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnfrontdoornewclip = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnsideyardnewclip = null;
public static cloyd.blink.badger _badger1 = null;
public static String _prevcamerathumbnail = "";
public static cloyd.blink.keyvaluestore _kvs = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btndrivewayrefresh = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnfrontdoorrefresh = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnsideyardrefresh = null;
public static cloyd.blink.b4xswitch _swarmed = null;
public static cloyd.blink.b4xdialog _dialog = null;
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
 //BA.debugLineNum = 131076;BA.debugLine="btnDrivewayNewClip.Enabled = True";
_btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
_btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="btnSideYardNewClip.Enabled = True";
_btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="fx.msgbox2(MainForm,Error.Message,MainForm.Title,";
_fx.Msgbox2(_mainform,_error.getMessage(),_mainform.getTitle(),"OK","","",_fx.MSGBOX_ERROR);
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="Dim shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="Try";
try {RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="shl.Initialize(\"shl\", \"java.exe\" , Array As Stri";
_shl.Initialize("shl","java.exe",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"-jar","Blink4Java.jar"}));
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="shl.WorkingDirectory = File.DirApp";
_shl.setWorkingDirectory(anywheresoftware.b4a.keywords.Common.File.getDirApp());
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=131086;
 //BA.debugLineNum = 131086;BA.debugLine="Log(\"Application_Error: \" & LastException.Messag";
anywheresoftware.b4a.keywords.Common.Log("Application_Error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=131089;
 //BA.debugLineNum = 131089;BA.debugLine="Return False ' handled";
if (true) return anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=131090;
 //BA.debugLineNum = 131090;BA.debugLine="End Sub";
return false;
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args}));}
String _skintemp = "";
String _skindefault = "";
anywheresoftware.b4j.agraham.reflection.Reflection _obj = null;
anywheresoftware.b4a.objects.collections.List _list1 = null;
int _i = 0;
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
RDebugUtils.currentLine=65593;
 //BA.debugLineNum = 65593;BA.debugLine="dialog.Initialize(MainForm.RootPane)";
_dialog._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_mainform.getRootPane().getObject())));
RDebugUtils.currentLine=65594;
 //BA.debugLineNum = 65594;BA.debugLine="dialog.Title = \"Smart Home Monitor\"";
_dialog._title /*Object*/  = (Object)("Smart Home Monitor");
RDebugUtils.currentLine=65596;
 //BA.debugLineNum = 65596;BA.debugLine="If File.Exists(File.DirApp, \"account.txt\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"account.txt")) { 
RDebugUtils.currentLine=65597;
 //BA.debugLineNum = 65597;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=65598;
 //BA.debugLineNum = 65598;BA.debugLine="List1 = File.ReadList(File.DirApp, \"account.txt";
_list1 = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"account.txt");
RDebugUtils.currentLine=65599;
 //BA.debugLineNum = 65599;BA.debugLine="For i = 0 To List1.Size - 1";
{
final int step52 = 1;
final int limit52 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit52 ;_i = _i + step52 ) {
RDebugUtils.currentLine=65600;
 //BA.debugLineNum = 65600;BA.debugLine="If i = 0 Then";
if (_i==0) { 
RDebugUtils.currentLine=65601;
 //BA.debugLineNum = 65601;BA.debugLine="emailAddress = List1.Get(i)";
_emailaddress = BA.ObjectToString(_list1.Get(_i));
 }else 
{RDebugUtils.currentLine=65602;
 //BA.debugLineNum = 65602;BA.debugLine="Else if i = 1 Then";
if (_i==1) { 
RDebugUtils.currentLine=65603;
 //BA.debugLineNum = 65603;BA.debugLine="password = List1.Get(i)";
_password = BA.ObjectToString(_list1.Get(_i));
 }}
;
 }
};
 }else {
RDebugUtils.currentLine=65607;
 //BA.debugLineNum = 65607;BA.debugLine="fx.Msgbox2(MainForm,\"Account.txt not found!\", \"";
_fx.Msgbox2(_mainform,"Account.txt not found!","Catanaoan Blink XT2 Cameras v1.0","OK","","",_fx.MSGBOX_ERROR);
RDebugUtils.currentLine=65608;
 //BA.debugLineNum = 65608;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
RDebugUtils.currentLine=65611;
 //BA.debugLineNum = 65611;BA.debugLine="btnDriveway.Enabled = False";
_btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=65612;
 //BA.debugLineNum = 65612;BA.debugLine="btnRefresh.Enabled = False";
_btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=65613;
 //BA.debugLineNum = 65613;BA.debugLine="btnActivity.Enabled = False";
_btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=65614;
 //BA.debugLineNum = 65614;BA.debugLine="btnDrivewayNewClip.Enabled = False";
_btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=65615;
 //BA.debugLineNum = 65615;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
_btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=65616;
 //BA.debugLineNum = 65616;BA.debugLine="btnSideYardNewClip.Enabled = False";
_btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=65617;
 //BA.debugLineNum = 65617;BA.debugLine="badger1.Initialize";
_badger1._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=65618;
 //BA.debugLineNum = 65618;BA.debugLine="RequestAuthToken";
_requestauthtoken();
 } 
       catch (Exception e72) {
			ba.setLastException(e72);RDebugUtils.currentLine=65620;
 //BA.debugLineNum = 65620;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=65623;
 //BA.debugLineNum = 65623;BA.debugLine="End Sub";
return "";
}
public static String  _get_css() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "get_css", false))
	 {return ((String) Debug.delegate(ba, "get_css", null));}
anywheresoftware.b4j.object.JavaObject _jform = null;
anywheresoftware.b4j.object.JavaObject _scene = null;
anywheresoftware.b4a.objects.collections.List _stylesheets = null;
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Public Sub Get_css";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Try";
try {RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Dim jForm As JavaObject = MainForm";
_jform = new anywheresoftware.b4j.object.JavaObject();
_jform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_mainform));
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="Dim scene As JavaObject = jForm.GetField(\"scene\"";
_scene = new anywheresoftware.b4j.object.JavaObject();
_scene = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jform.GetField("scene")));
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="Dim stylesheets As List = scene.RunMethod(\"getSt";
_stylesheets = new anywheresoftware.b4a.objects.collections.List();
_stylesheets = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_scene.RunMethod("getStylesheets",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="stylesheets.Clear";
_stylesheets.Clear();
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="stylesheets.Add(File.GetUri(File.DirAssets, imgI";
_stylesheets.Add((Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+".css")));
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=1966090;
 //BA.debugLineNum = 1966090;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.JFX.ScreenWrapper  _checkmonitor() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "checkmonitor", false))
	 {return ((anywheresoftware.b4j.objects.JFX.ScreenWrapper) Debug.delegate(ba, "checkmonitor", null));}
anywheresoftware.b4a.objects.collections.List _slist = null;
anywheresoftware.b4j.objects.JFX.ScreenWrapper _s = null;
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub CheckMonitor() As Screen";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Try";
try {RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="If fx.Screens.Size= 1 Then";
if (_fx.getScreens().getSize()==1) { 
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s = (anywheresoftware.b4j.objects.JFX.ScreenWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.ScreenWrapper(), (javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="Return S";
if (true) return _s;
 }else 
{RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="Else If fx.Screens.Size> 1 Then";
if (_fx.getScreens().getSize()>1) { 
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="Dim S As Screen = SList.Get(2)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s = (anywheresoftware.b4j.objects.JFX.ScreenWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.ScreenWrapper(), (javafx.stage.Screen)(_slist.Get((int) (2))));
RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="Return S";
if (true) return _s;
 }else {
RDebugUtils.currentLine=2031629;
 //BA.debugLineNum = 2031629;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
RDebugUtils.currentLine=2031630;
 //BA.debugLineNum = 2031630;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s = (anywheresoftware.b4j.objects.JFX.ScreenWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.ScreenWrapper(), (javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=2031632;
 //BA.debugLineNum = 2031632;BA.debugLine="Return S";
if (true) return _s;
 }}
;
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=2031635;
 //BA.debugLineNum = 2031635;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
RDebugUtils.currentLine=2031636;
 //BA.debugLineNum = 2031636;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s = (anywheresoftware.b4j.objects.JFX.ScreenWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.ScreenWrapper(), (javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=2031638;
 //BA.debugLineNum = 2031638;BA.debugLine="Return S";
if (true) return _s;
 };
RDebugUtils.currentLine=2031640;
 //BA.debugLineNum = 2031640;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _requestauthtoken() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "requestauthtoken", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "requestauthtoken", null));}
ResumableSub_RequestAuthToken rsub = new ResumableSub_RequestAuthToken(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RequestAuthToken extends BA.ResumableSub {
public ResumableSub_RequestAuthToken(cloyd.blink.main parent) {
this.parent = parent;
}
cloyd.blink.main parent;
cloyd.blink.httpjob _joblogin = null;
cloyd.blink.b4xinputtemplate _input = null;
int _diagresult = 0;
int _res = 0;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
Object _result = null;

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
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 29;
this.catchState = 28;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 28;
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="lblStatus.Text = \"Authenticating...\"";
parent._lblstatus.setText("Authenticating...");
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="Dim jobLogin As HttpJob";
_joblogin = new cloyd.blink.httpjob();
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="jobLogin.Initialize(\"\", Me)";
_joblogin._initialize /*String*/ (null,ba,"",main.getObject());
RDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="jobLogin.PostString(\"https://rest-prod.immedia-s";
_joblogin._poststring /*String*/ (null,"https://rest-prod.immedia-semi.com/api/v4/account/login","email="+parent._emailaddress+"&password="+parent._password);
RDebugUtils.currentLine=262150;
 //BA.debugLineNum = 262150;BA.debugLine="jobLogin.GetRequest.SetContentType(\"application/";
_joblogin._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/x-www-form-urlencoded");
RDebugUtils.currentLine=262151;
 //BA.debugLineNum = 262151;BA.debugLine="jobLogin.GetRequest.SetHeader(\"User-Agent\",Rando";
_joblogin._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("User-Agent",_randomstring((int) (12)));
RDebugUtils.currentLine=262153;
 //BA.debugLineNum = 262153;BA.debugLine="Wait For (jobLogin) JobDone(jobLogin As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "requestauthtoken"), (Object)(_joblogin));
this.state = 30;
return;
case 30:
//C
this.state = 4;
_joblogin = (cloyd.blink.httpjob) result[0];
;
RDebugUtils.currentLine=262154;
 //BA.debugLineNum = 262154;BA.debugLine="If jobLogin.Success Then";
if (true) break;

case 4:
//if
this.state = 26;
if (_joblogin._success /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 25;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=262155;
 //BA.debugLineNum = 262155;BA.debugLine="lblStatus.Text = \"Successfully logged in to the";
parent._lblstatus.setText("Successfully logged in to the Blink server...");
RDebugUtils.currentLine=262156;
 //BA.debugLineNum = 262156;BA.debugLine="File.WriteString(File.DirApp,\"response_login.tx";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"response_login.txt",_joblogin._getstring /*String*/ (null));
RDebugUtils.currentLine=262157;
 //BA.debugLineNum = 262157;BA.debugLine="GetAuthInfo(jobLogin.GetString)";
_getauthinfo(_joblogin._getstring /*String*/ (null));
RDebugUtils.currentLine=262159;
 //BA.debugLineNum = 262159;BA.debugLine="If TwoClientFAVerificationRequired Then";
if (true) break;

case 7:
//if
this.state = 18;
if (BA.ObjectToBoolean(parent._twoclientfaverificationrequired)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=262160;
 //BA.debugLineNum = 262160;BA.debugLine="Dim input As B4XInputTemplate";
_input = new cloyd.blink.b4xinputtemplate();
RDebugUtils.currentLine=262161;
 //BA.debugLineNum = 262161;BA.debugLine="Dim diagResult As Int";
_diagresult = 0;
RDebugUtils.currentLine=262162;
 //BA.debugLineNum = 262162;BA.debugLine="input.Initialize";
_input._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=262163;
 //BA.debugLineNum = 262163;BA.debugLine="input.lblTitle.Text = \"Enter verification code";
_input._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("Enter verification code:");
RDebugUtils.currentLine=262164;
 //BA.debugLineNum = 262164;BA.debugLine="input.ConfigureForNumbers(False, False) 'Allow";
_input._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=262165;
 //BA.debugLineNum = 262165;BA.debugLine="Wait For (dialog.ShowTemplate(input, \"OK\", \"\",";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "requestauthtoken"), parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_input),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 31;
return;
case 31:
//C
this.state = 10;
_diagresult = (int) result[0];
;
RDebugUtils.currentLine=262166;
 //BA.debugLineNum = 262166;BA.debugLine="If diagResult = xui.DialogResponse_Positive Th";
if (true) break;

case 10:
//if
this.state = 17;
if (_diagresult==parent._xui.DialogResponse_Positive) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=262167;
 //BA.debugLineNum = 262167;BA.debugLine="Dim res As Int = input.Text 'no need to check";
_res = (int)(Double.parseDouble(_input._text /*String*/ ));
RDebugUtils.currentLine=262168;
 //BA.debugLineNum = 262168;BA.debugLine="Log(res)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_res));
RDebugUtils.currentLine=262169;
 //BA.debugLineNum = 262169;BA.debugLine="jobLogin.PostString(\"https://rest-u006.immedi";
_joblogin._poststring /*String*/ (null,"https://rest-u006.immedia-semi.com/api/v4/account/88438/client/"+parent._twofaclientid+"/pin/verify/","pin="+BA.NumberToString(_res));
RDebugUtils.currentLine=262170;
 //BA.debugLineNum = 262170;BA.debugLine="jobLogin.GetRequest.SetContentType(\"applicati";
_joblogin._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/x-www-form-urlencoded");
RDebugUtils.currentLine=262171;
 //BA.debugLineNum = 262171;BA.debugLine="Wait For (jobLogin) JobDone(jobLogin As HttpJ";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "requestauthtoken"), (Object)(_joblogin));
this.state = 32;
return;
case 32:
//C
this.state = 13;
_joblogin = (cloyd.blink.httpjob) result[0];
;
RDebugUtils.currentLine=262172;
 //BA.debugLineNum = 262172;BA.debugLine="If jobLogin.Success = False Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_joblogin._success /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=262173;
 //BA.debugLineNum = 262173;BA.debugLine="lblStatus.Text = GetRESTError(jobLogin.Error";
parent._lblstatus.setText(_getresterror(_joblogin._errormessage /*String*/ ));
RDebugUtils.currentLine=262174;
 //BA.debugLineNum = 262174;BA.debugLine="Log(\"2FA error: \" & jobLogin.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.Log("2FA error: "+_joblogin._errormessage /*String*/ );
RDebugUtils.currentLine=262175;
 //BA.debugLineNum = 262175;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=262176;
 //BA.debugLineNum = 262176;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=262177;
 //BA.debugLineNum = 262177;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=262178;
 //BA.debugLineNum = 262178;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=262179;
 //BA.debugLineNum = 262179;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=262180;
 //BA.debugLineNum = 262180;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=262181;
 //BA.debugLineNum = 262181;BA.debugLine="jobLogin.Release";
_joblogin._release /*String*/ (null);
RDebugUtils.currentLine=262182;
 //BA.debugLineNum = 262182;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;
;
RDebugUtils.currentLine=262187;
 //BA.debugLineNum = 262187;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.C";

case 18:
//if
this.state = 23;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
RDebugUtils.currentLine=262188;
 //BA.debugLineNum = 262188;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=262189;
 //BA.debugLineNum = 262189;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=262190;
 //BA.debugLineNum = 262190;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=262191;
 //BA.debugLineNum = 262191;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=262192;
 //BA.debugLineNum = 262192;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=262193;
 //BA.debugLineNum = 262193;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=262194;
 //BA.debugLineNum = 262194;BA.debugLine="jobLogin.Release";
_joblogin._release /*String*/ (null);
RDebugUtils.currentLine=262195;
 //BA.debugLineNum = 262195;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=262197;
 //BA.debugLineNum = 262197;BA.debugLine="lblStatus.Text = \"AuthToken acquired...\"";
parent._lblstatus.setText("AuthToken acquired...");
 if (true) break;

case 23:
//C
this.state = 26;
;
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=262200;
 //BA.debugLineNum = 262200;BA.debugLine="lblStatus.Text = GetRESTError(jobLogin.ErrorMes";
parent._lblstatus.setText(_getresterror(_joblogin._errormessage /*String*/ ));
RDebugUtils.currentLine=262201;
 //BA.debugLineNum = 262201;BA.debugLine="Log(\"RequestAuthToken error: \" & jobLogin.Error";
anywheresoftware.b4a.keywords.Common.Log("RequestAuthToken error: "+_joblogin._errormessage /*String*/ );
RDebugUtils.currentLine=262202;
 //BA.debugLineNum = 262202;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=262203;
 //BA.debugLineNum = 262203;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=262204;
 //BA.debugLineNum = 262204;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=262205;
 //BA.debugLineNum = 262205;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=262206;
 //BA.debugLineNum = 262206;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=262207;
 //BA.debugLineNum = 262207;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=262208;
 //BA.debugLineNum = 262208;BA.debugLine="jobLogin.Release";
_joblogin._release /*String*/ (null);
RDebugUtils.currentLine=262209;
 //BA.debugLineNum = 262209;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 26:
//C
this.state = 29;
;
RDebugUtils.currentLine=262211;
 //BA.debugLineNum = 262211;BA.debugLine="jobLogin.Release";
_joblogin._release /*String*/ (null);
RDebugUtils.currentLine=262212;
 //BA.debugLineNum = 262212;BA.debugLine="Dim rs As ResumableSub = RefreshCameras(True, \"A";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _refreshcameras(anywheresoftware.b4a.keywords.Common.True,"All");
RDebugUtils.currentLine=262213;
 //BA.debugLineNum = 262213;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "requestauthtoken"), _rs);
this.state = 33;
return;
case 33:
//C
this.state = 29;
_result = (Object) result[0];
;
 if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 0;
RDebugUtils.currentLine=262215;
 //BA.debugLineNum = 262215;BA.debugLine="Log(\"RequestAuthToken LastException: \" & LastExc";
anywheresoftware.b4a.keywords.Common.Log("RequestAuthToken LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 29:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=262217;
 //BA.debugLineNum = 262217;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
RDebugUtils.currentLine=262218;
 //BA.debugLineNum = 262218;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Private Sub Blur (bmp As B4XBitmap) As B4XBitmap";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Try";
try {RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4j.example.bitmapcreator();
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Dim ReduceScale As Int = 2";
_reducescale = (int) (2);
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="bc.Initialize(bmp.Width / ReduceScale / bmp.Scal";
_bc._initialize(ba,(int) (_bmp.getWidth()/(double)_reducescale/(double)_bmp.getScale()),(int) (_bmp.getHeight()/(double)_reducescale/(double)_bmp.getScale()));
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="bc.CopyPixelsFromBitmap(bmp)";
_bc._copypixelsfrombitmap(_bmp);
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="Dim count As Int = 3";
_count = (int) (3);
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="Dim clrs(3) As ARGBColor";
_clrs = new b4j.example.bitmapcreator._argbcolor[(int) (3)];
{
int d0 = _clrs.length;
for (int i0 = 0;i0 < d0;i0++) {
_clrs[i0] = new b4j.example.bitmapcreator._argbcolor();
}
}
;
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="Dim temp As ARGBColor";
_temp = new b4j.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="Dim m As Int";
_m = 0;
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="For steps = 1 To count";
{
final int step10 = 1;
final int limit10 = _count;
_steps = (int) (1) ;
for (;_steps <= limit10 ;_steps = _steps + step10 ) {
RDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="For y = 0 To bc.mHeight - 1";
{
final int step11 = 1;
final int limit11 = (int) (_bc._mheight-1);
_y = (int) (0) ;
for (;_y <= limit11 ;_y = _y + step11 ) {
RDebugUtils.currentLine=2621452;
 //BA.debugLineNum = 2621452;BA.debugLine="For x = 0 To 2";
{
final int step12 = 1;
final int limit12 = (int) (2);
_x = (int) (0) ;
for (;_x <= limit12 ;_x = _x + step12 ) {
RDebugUtils.currentLine=2621453;
 //BA.debugLineNum = 2621453;BA.debugLine="bc.GetARGB(x, y, clrs(x))";
_bc._getargb(_x,_y,_clrs[_x]);
 }
};
RDebugUtils.currentLine=2621455;
 //BA.debugLineNum = 2621455;BA.debugLine="SetAvg(bc, 1, y, clrs, temp)";
_setavg(_bc,(int) (1),_y,_clrs,_temp);
RDebugUtils.currentLine=2621456;
 //BA.debugLineNum = 2621456;BA.debugLine="m = 0";
_m = (int) (0);
RDebugUtils.currentLine=2621457;
 //BA.debugLineNum = 2621457;BA.debugLine="For x = 2 To bc.mWidth - 2";
{
final int step17 = 1;
final int limit17 = (int) (_bc._mwidth-2);
_x = (int) (2) ;
for (;_x <= limit17 ;_x = _x + step17 ) {
RDebugUtils.currentLine=2621458;
 //BA.debugLineNum = 2621458;BA.debugLine="bc.GetARGB(x + 1, y, clrs(m))";
_bc._getargb((int) (_x+1),_y,_clrs[_m]);
RDebugUtils.currentLine=2621459;
 //BA.debugLineNum = 2621459;BA.debugLine="m = (m + 1) Mod clrs.Length";
_m = (int) ((_m+1)%_clrs.length);
RDebugUtils.currentLine=2621460;
 //BA.debugLineNum = 2621460;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
_setavg(_bc,_x,_y,_clrs,_temp);
 }
};
 }
};
RDebugUtils.currentLine=2621463;
 //BA.debugLineNum = 2621463;BA.debugLine="For x = 0 To bc.mWidth - 1";
{
final int step23 = 1;
final int limit23 = (int) (_bc._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit23 ;_x = _x + step23 ) {
RDebugUtils.currentLine=2621464;
 //BA.debugLineNum = 2621464;BA.debugLine="For y = 0 To 2";
{
final int step24 = 1;
final int limit24 = (int) (2);
_y = (int) (0) ;
for (;_y <= limit24 ;_y = _y + step24 ) {
RDebugUtils.currentLine=2621465;
 //BA.debugLineNum = 2621465;BA.debugLine="bc.GetARGB(x, y, clrs(y))";
_bc._getargb(_x,_y,_clrs[_y]);
 }
};
RDebugUtils.currentLine=2621467;
 //BA.debugLineNum = 2621467;BA.debugLine="SetAvg(bc, x, 1, clrs, temp)";
_setavg(_bc,_x,(int) (1),_clrs,_temp);
RDebugUtils.currentLine=2621468;
 //BA.debugLineNum = 2621468;BA.debugLine="m = 0";
_m = (int) (0);
RDebugUtils.currentLine=2621469;
 //BA.debugLineNum = 2621469;BA.debugLine="For y = 2 To bc.mHeight - 2";
{
final int step29 = 1;
final int limit29 = (int) (_bc._mheight-2);
_y = (int) (2) ;
for (;_y <= limit29 ;_y = _y + step29 ) {
RDebugUtils.currentLine=2621470;
 //BA.debugLineNum = 2621470;BA.debugLine="bc.GetARGB(x, y + 1, clrs(m))";
_bc._getargb(_x,(int) (_y+1),_clrs[_m]);
RDebugUtils.currentLine=2621471;
 //BA.debugLineNum = 2621471;BA.debugLine="m = (m + 1) Mod clrs.Length";
_m = (int) ((_m+1)%_clrs.length);
RDebugUtils.currentLine=2621472;
 //BA.debugLineNum = 2621472;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
_setavg(_bc,_x,_y,_clrs,_temp);
 }
};
 }
};
 }
};
 } 
       catch (Exception e37) {
			ba.setLastException(e37);RDebugUtils.currentLine=2621477;
 //BA.debugLineNum = 2621477;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=2621479;
 //BA.debugLineNum = 2621479;BA.debugLine="Return bc.Bitmap";
if (true) return _bc._getbitmap();
RDebugUtils.currentLine=2621480;
 //BA.debugLineNum = 2621480;BA.debugLine="End Sub";
return null;
}
public static String  _setavg(b4j.example.bitmapcreator _bc,int _x,int _y,b4j.example.bitmapcreator._argbcolor[] _clrs,b4j.example.bitmapcreator._argbcolor _temp) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "setavg", false))
	 {return ((String) Debug.delegate(ba, "setavg", new Object[] {_bc,_x,_y,_clrs,_temp}));}
b4j.example.bitmapcreator._argbcolor _c = null;
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Private Sub SetAvg(bc As BitmapCreator, x As Int,";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Try";
try {RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="temp.Initialize";
_temp.Initialize();
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="For Each c As ARGBColor In clrs";
{
final b4j.example.bitmapcreator._argbcolor[] group3 = _clrs;
final int groupLen3 = group3.length
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_c = group3[index3];
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="temp.r = temp.r + c.r";
_temp.r = (int) (_temp.r+_c.r);
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="temp.g = temp.g + c.g";
_temp.g = (int) (_temp.g+_c.g);
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="temp.b = temp.b + c.b";
_temp.b = (int) (_temp.b+_c.b);
 }
};
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="temp.a = 255";
_temp.a = (int) (255);
RDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="temp.r = temp.r / clrs.Length";
_temp.r = (int) (_temp.r/(double)_clrs.length);
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="temp.g = temp.g / clrs.Length";
_temp.g = (int) (_temp.g/(double)_clrs.length);
RDebugUtils.currentLine=2686987;
 //BA.debugLineNum = 2686987;BA.debugLine="temp.b = temp.b / clrs.Length";
_temp.b = (int) (_temp.b/(double)_clrs.length);
RDebugUtils.currentLine=2686988;
 //BA.debugLineNum = 2686988;BA.debugLine="bc.SetARGB(x, y, temp)";
_bc._setargb(_x,_y,_temp);
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=2686990;
 //BA.debugLineNum = 2686990;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=2686992;
 //BA.debugLineNum = 2686992;BA.debugLine="End Sub";
return "";
}
public static String  _bluriv(String _image,anywheresoftware.b4j.objects.ImageViewWrapper _iv) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "bluriv", false))
	 {return ((String) Debug.delegate(ba, "bluriv", new Object[] {_image,_iv}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub BlurIV (image As String,iv As ImageView)";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Try";
try {RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Dim bmp As B4XBitmap = xui.LoadBitmapResize(File";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _xui.LoadBitmapResize(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_image,(int) (_iv.getWidth()),(int) (_iv.getHeight()),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="iv.SetImage(Blur(bmp))";
_iv.SetImage((javafx.scene.image.Image)(_blur(_bmp).getObject()));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="End Sub";
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
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
Object _result = null;
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
this.state = 1;
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="btnDriveway.Enabled = False";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="btnRefresh.Enabled = False";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="btnActivity.Enabled = False";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="btnDrivewayNewClip.Enabled = False";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="btnSideYardNewClip.Enabled = False";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-\"";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/api/v1/accounts/88438/media/changed?since=-999999999-01-01T00:00:00+18:00&page=1");
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btnactivity_click"), _rs);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Object) result[0];
;
RDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="File.WriteString(File.DirApp,\"btnActivity_Click.t";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"btnActivity_Click.txt",parent._response);
RDebugUtils.currentLine=2752525;
 //BA.debugLineNum = 2752525;BA.debugLine="If response.StartsWith(\"{\"\"limit\"\":25\") = False T";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._response.startsWith("{\"limit\":25")==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=2752527;
 //BA.debugLineNum = 2752527;BA.debugLine="Dim rs As ResumableSub = GetUnwatchedVideos";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getunwatchedvideos();
RDebugUtils.currentLine=2752528;
 //BA.debugLineNum = 2752528;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btnactivity_click"), _rs);
this.state = 6;
return;
case 6:
//C
this.state = 4;
_result = (Object) result[0];
;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=2752530;
 //BA.debugLineNum = 2752530;BA.debugLine="Dim mf As frmActivity";
_mf = new cloyd.blink.frmactivity();
RDebugUtils.currentLine=2752531;
 //BA.debugLineNum = 2752531;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (null,ba,parent._mainform);
RDebugUtils.currentLine=2752532;
 //BA.debugLineNum = 2752532;BA.debugLine="mf.authToken = authToken";
_mf._authtoken /*String*/  = parent._authtoken;
RDebugUtils.currentLine=2752533;
 //BA.debugLineNum = 2752533;BA.debugLine="mf.Show(response,userRegion)";
_mf._show /*String*/ (null,parent._response,parent._userregion);
RDebugUtils.currentLine=2752536;
 //BA.debugLineNum = 2752536;BA.debugLine="Dim rs As ResumableSub = GetUnwatchedVideos";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getunwatchedvideos();
RDebugUtils.currentLine=2752537;
 //BA.debugLineNum = 2752537;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btnactivity_click"), _rs);
this.state = 7;
return;
case 7:
//C
this.state = -1;
_result = (Object) result[0];
;
RDebugUtils.currentLine=2752539;
 //BA.debugLineNum = 2752539;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2752540;
 //BA.debugLineNum = 2752540;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2752541;
 //BA.debugLineNum = 2752541;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2752542;
 //BA.debugLineNum = 2752542;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2752543;
 //BA.debugLineNum = 2752543;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2752544;
 //BA.debugLineNum = 2752544;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2752545;
 //BA.debugLineNum = 2752545;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Try";
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
 //BA.debugLineNum = 458757;BA.debugLine="j.Download(url)";
_j._download /*String*/ (null,_url);
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("TOKEN_AUTH",parent._authtoken);
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "restget"), (Object)(_j));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[0];
;
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="response = j.GetString";
parent._response = _j._getstring /*String*/ (null);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
parent._response = "ERROR: "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="lblStatus.Text = GetRESTError(j.ErrorMessage)";
parent._lblstatus.setText(_getresterror(_j._errormessage /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=458766;
 //BA.debugLineNum = 458766;BA.debugLine="If response.Contains(\"System is busy, please wai";

case 9:
//if
this.state = 12;
if (parent._response.contains("System is busy, please wait")) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="lblStatus.Text = \"System is busy, please wait\"";
parent._lblstatus.setText("System is busy, please wait");
 if (true) break;

case 12:
//C
this.state = 15;
;
RDebugUtils.currentLine=458769;
 //BA.debugLineNum = 458769;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
RDebugUtils.currentLine=458771;
 //BA.debugLineNum = 458771;BA.debugLine="response = \"ERROR: \" & LastException";
parent._response = "ERROR: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba));
RDebugUtils.currentLine=458772;
 //BA.debugLineNum = 458772;BA.debugLine="Log(\"RESTGet LastException: \" & LastException)";
anywheresoftware.b4a.keywords.Common.Log("RESTGet LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 15:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=458774;
 //BA.debugLineNum = 458774;BA.debugLine="Log(\"URL: \" & url)";
anywheresoftware.b4a.keywords.Common.Log("URL: "+_url);
RDebugUtils.currentLine=458775;
 //BA.debugLineNum = 458775;BA.debugLine="Log(\"Response: \" & response)";
anywheresoftware.b4a.keywords.Common.Log("Response: "+parent._response);
RDebugUtils.currentLine=458776;
 //BA.debugLineNum = 458776;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
RDebugUtils.currentLine=458777;
 //BA.debugLineNum = 458777;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getunwatchedvideos() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getunwatchedvideos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "getunwatchedvideos", null));}
ResumableSub_GetUnwatchedVideos rsub = new ResumableSub_GetUnwatchedVideos(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetUnwatchedVideos extends BA.ResumableSub {
public ResumableSub_GetUnwatchedVideos(cloyd.blink.main parent) {
this.parent = parent;
}
cloyd.blink.main parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
Object _result = null;
int _unwatchedvideocount = 0;
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _media = null;
long _n = 0L;
anywheresoftware.b4a.objects.collections.Map _colmedia = null;
String _watched = "";
anywheresoftware.b4a.BA.IterableList group11;
int index11;
int groupLen11;

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
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 14;
this.catchState = 13;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 13;
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-\"";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/api/v1/accounts/88438/media/changed?since=-999999999-01-01T00:00:00+18:00&page=1");
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "getunwatchedvideos"), _rs);
this.state = 15;
return;
case 15:
//C
this.state = 4;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="Dim unwatchedVideoCount As Int = 0";
_unwatchedvideocount = (int) (0);
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="parser.Initialize(response)";
_parser.Initialize(parent._response);
RDebugUtils.currentLine=3342344;
 //BA.debugLineNum = 3342344;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=3342345;
 //BA.debugLineNum = 3342345;BA.debugLine="Dim media As List = root.Get(\"media\")";
_media = new anywheresoftware.b4a.objects.collections.List();
_media = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("media"))));
RDebugUtils.currentLine=3342346;
 //BA.debugLineNum = 3342346;BA.debugLine="kvs.Initialize(File.DirApp, \"datastore\")";
parent._kvs._initialize /*String*/ (null,ba,anywheresoftware.b4a.keywords.Common.File.getDirApp(),"datastore");
RDebugUtils.currentLine=3342347;
 //BA.debugLineNum = 3342347;BA.debugLine="Dim n As Long = DateTime.Now";
_n = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=3342348;
 //BA.debugLineNum = 3342348;BA.debugLine="For Each colmedia As Map In media";
if (true) break;

case 4:
//for
this.state = 11;
_colmedia = new anywheresoftware.b4a.objects.collections.Map();
group11 = _media;
index11 = 0;
groupLen11 = group11.getSize();
this.state = 16;
if (true) break;

case 16:
//C
this.state = 11;
if (index11 < groupLen11) {
this.state = 6;
_colmedia = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group11.Get(index11)));}
if (true) break;

case 17:
//C
this.state = 16;
index11++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=3342349;
 //BA.debugLineNum = 3342349;BA.debugLine="Dim watched As String = colmedia.Get(\"watched\")";
_watched = BA.ObjectToString(_colmedia.Get((Object)("watched")));
RDebugUtils.currentLine=3342353;
 //BA.debugLineNum = 3342353;BA.debugLine="If watched = False Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_watched).equals(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=3342354;
 //BA.debugLineNum = 3342354;BA.debugLine="unwatchedVideoCount = unwatchedVideoCount + 1";
_unwatchedvideocount = (int) (_unwatchedvideocount+1);
 if (true) break;

case 10:
//C
this.state = 17;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
;
RDebugUtils.currentLine=3342357;
 //BA.debugLineNum = 3342357;BA.debugLine="Log(\"Loading unwatched videos took: \" & (DateTim";
anywheresoftware.b4a.keywords.Common.Log("Loading unwatched videos took: "+BA.NumberToString((anywheresoftware.b4a.keywords.Common.DateTime.getNow()-_n))+"ms");
RDebugUtils.currentLine=3342358;
 //BA.debugLineNum = 3342358;BA.debugLine="badger1.SetBadge(btnActivity, unwatchedVideoCoun";
parent._badger1._setbadge /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._btnactivity.getObject())),_unwatchedvideocount);
 if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
RDebugUtils.currentLine=3342360;
 //BA.debugLineNum = 3342360;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=3342362;
 //BA.debugLineNum = 3342362;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
RDebugUtils.currentLine=3342363;
 //BA.debugLineNum = 3342363;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
RDebugUtils.currentLine=3342364;
 //BA.debugLineNum = 3342364;BA.debugLine="End Sub";
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
public static void  _btndriveway_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btndriveway_click", false))
	 {Debug.delegate(ba, "btndriveway_click", null); return;}
ResumableSub_btnDriveway_Click rsub = new ResumableSub_btnDriveway_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnDriveway_Click extends BA.ResumableSub {
public ResumableSub_btnDriveway_Click(cloyd.blink.main parent) {
this.parent = parent;
}
cloyd.blink.main parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
Object _result = null;

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
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="clvDriveway.Clear";
parent._clvdriveway._clear();
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="clvFrontDoor.Clear";
parent._clvfrontdoor._clear();
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="clvSideYard.Clear";
parent._clvsideyard._clear();
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="btnDriveway.Enabled = False";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="btnRefresh.Enabled = False";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="btnActivity.Enabled = False";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=196615;
 //BA.debugLineNum = 196615;BA.debugLine="btnDrivewayNewClip.Enabled = False";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=196616;
 //BA.debugLineNum = 196616;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=196617;
 //BA.debugLineNum = 196617;BA.debugLine="btnSideYardNewClip.Enabled = False";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=196622;
 //BA.debugLineNum = 196622;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
_bluriv("Driveway.jpg",parent._ivdriveway);
RDebugUtils.currentLine=196623;
 //BA.debugLineNum = 196623;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
_bluriv("FrontDoor.jpg",parent._ivfrontdoor);
RDebugUtils.currentLine=196624;
 //BA.debugLineNum = 196624;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
_bluriv("SideYard.jpg",parent._ivsideyard);
RDebugUtils.currentLine=196626;
 //BA.debugLineNum = 196626;BA.debugLine="Dim rs As ResumableSub = RefreshCameras(False, \"3";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _refreshcameras(anywheresoftware.b4a.keywords.Common.False,"347574");
RDebugUtils.currentLine=196627;
 //BA.debugLineNum = 196627;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btndriveway_click"), _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (Object) result[0];
;
RDebugUtils.currentLine=196629;
 //BA.debugLineNum = 196629;BA.debugLine="Dim rs As ResumableSub = RefreshCameras(False, \"2";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _refreshcameras(anywheresoftware.b4a.keywords.Common.False,"236967");
RDebugUtils.currentLine=196630;
 //BA.debugLineNum = 196630;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btndriveway_click"), _rs);
this.state = 2;
return;
case 2:
//C
this.state = -1;
_result = (Object) result[0];
;
RDebugUtils.currentLine=196632;
 //BA.debugLineNum = 196632;BA.debugLine="Dim rs As ResumableSub = RefreshCameras(False, \"4";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _refreshcameras(anywheresoftware.b4a.keywords.Common.False,"458236");
RDebugUtils.currentLine=196633;
 //BA.debugLineNum = 196633;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btndriveway_click"), _rs);
this.state = 3;
return;
case 3:
//C
this.state = -1;
_result = (Object) result[0];
;
RDebugUtils.currentLine=196635;
 //BA.debugLineNum = 196635;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _refreshcameras(boolean _firstrun,String _whatcamera) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "refreshcameras", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "refreshcameras", new Object[] {_firstrun,_whatcamera}));}
ResumableSub_RefreshCameras rsub = new ResumableSub_RefreshCameras(null,_firstrun,_whatcamera);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RefreshCameras extends BA.ResumableSub {
public ResumableSub_RefreshCameras(cloyd.blink.main parent,boolean _firstrun,String _whatcamera) {
this.parent = parent;
this._firstrun = _firstrun;
this._whatcamera = _whatcamera;
}
cloyd.blink.main parent;
boolean _firstrun;
String _whatcamera;
String _camera = "";
anywheresoftware.b4j.objects.ImageViewWrapper _iv = null;
b4j.example.customlistview _clv = null;
anywheresoftware.b4a.objects.collections.List _links = null;
int _attempts = 0;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
Object _result = null;
String _link = "";
boolean _rechecked = false;
int _i = 0;
anywheresoftware.b4a.BA.IterableList group42;
int index42;
int groupLen42;
int step117;
int limit117;

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
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 97;
this.catchState = 96;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 96;
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="Dim camera As String";
_camera = "";
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="Dim clv As CustomListView";
_clv = new b4j.example.customlistview();
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="Dim links As List";
_links = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="Dim attempts As Int";
_attempts = 0;
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="links = Array(\"347574\", \"236967\", \"458236\")";
_links = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("347574"),(Object)("236967"),(Object)("458236")});
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-\"";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/syncmodules");
RDebugUtils.currentLine=327690;
 //BA.debugLineNum = 327690;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"), _rs);
this.state = 106;
return;
case 106:
//C
this.state = 4;
_result = (Object) result[0];
;
RDebugUtils.currentLine=327692;
 //BA.debugLineNum = 327692;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.Co";
if (true) break;

case 4:
//if
this.state = 7;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=327693;
 //BA.debugLineNum = 327693;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327694;
 //BA.debugLineNum = 327694;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327695;
 //BA.debugLineNum = 327695;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327696;
 //BA.debugLineNum = 327696;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327697;
 //BA.debugLineNum = 327697;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327698;
 //BA.debugLineNum = 327698;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327699;
 //BA.debugLineNum = 327699;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=327703;
 //BA.debugLineNum = 327703;BA.debugLine="Dim rs As ResumableSub = GetSyncModuleInfo(respo";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getsyncmoduleinfo(parent._response);
RDebugUtils.currentLine=327704;
 //BA.debugLineNum = 327704;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"), _rs);
this.state = 107;
return;
case 107:
//C
this.state = 8;
_result = (Object) result[0];
;
RDebugUtils.currentLine=327706;
 //BA.debugLineNum = 327706;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-\"";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/homescreen");
RDebugUtils.currentLine=327707;
 //BA.debugLineNum = 327707;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"), _rs);
this.state = 108;
return;
case 108:
//C
this.state = 8;
_result = (Object) result[0];
;
RDebugUtils.currentLine=327709;
 //BA.debugLineNum = 327709;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.Co";
if (true) break;

case 8:
//if
this.state = 11;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=327710;
 //BA.debugLineNum = 327710;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327711;
 //BA.debugLineNum = 327711;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327712;
 //BA.debugLineNum = 327712;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327713;
 //BA.debugLineNum = 327713;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327714;
 //BA.debugLineNum = 327714;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327715;
 //BA.debugLineNum = 327715;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327716;
 //BA.debugLineNum = 327716;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=327719;
 //BA.debugLineNum = 327719;BA.debugLine="File.WriteString(File.DirApp,\"GetHomescreen.txt\"";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"GetHomescreen.txt",parent._response);
RDebugUtils.currentLine=327721;
 //BA.debugLineNum = 327721;BA.debugLine="Dim rs As ResumableSub = GetHomescreen(response)";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _gethomescreen(parent._response);
RDebugUtils.currentLine=327722;
 //BA.debugLineNum = 327722;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"), _rs);
this.state = 109;
return;
case 109:
//C
this.state = 12;
_result = (Object) result[0];
;
RDebugUtils.currentLine=327724;
 //BA.debugLineNum = 327724;BA.debugLine="If FirstRun= False And whatCamera = \"All\"  Then";
if (true) break;

case 12:
//if
this.state = 15;
if (_firstrun==anywheresoftware.b4a.keywords.Common.False && (_whatcamera).equals("All")) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=327725;
 //BA.debugLineNum = 327725;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
_bluriv("Driveway.jpg",parent._ivdriveway);
RDebugUtils.currentLine=327726;
 //BA.debugLineNum = 327726;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
_bluriv("FrontDoor.jpg",parent._ivfrontdoor);
RDebugUtils.currentLine=327727;
 //BA.debugLineNum = 327727;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
_bluriv("SideYard.jpg",parent._ivsideyard);
 if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=327731;
 //BA.debugLineNum = 327731;BA.debugLine="Dim rs As ResumableSub = GetUnwatchedVideos";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getunwatchedvideos();
RDebugUtils.currentLine=327732;
 //BA.debugLineNum = 327732;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"), _rs);
this.state = 110;
return;
case 110:
//C
this.state = 16;
_result = (Object) result[0];
;
RDebugUtils.currentLine=327734;
 //BA.debugLineNum = 327734;BA.debugLine="For Each link As String In links";
if (true) break;

case 16:
//for
this.state = 94;
group42 = _links;
index42 = 0;
groupLen42 = group42.getSize();
this.state = 111;
if (true) break;

case 111:
//C
this.state = 94;
if (index42 < groupLen42) {
this.state = 18;
_link = BA.ObjectToString(group42.Get(index42));}
if (true) break;

case 112:
//C
this.state = 111;
index42++;
if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=327735;
 //BA.debugLineNum = 327735;BA.debugLine="camera = link";
_camera = _link;
RDebugUtils.currentLine=327736;
 //BA.debugLineNum = 327736;BA.debugLine="If camera <> whatCamera And whatCamera <> \"All\"";
if (true) break;

case 19:
//if
this.state = 22;
if ((_camera).equals(_whatcamera) == false && (_whatcamera).equals("All") == false) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=327737;
 //BA.debugLineNum = 327737;BA.debugLine="Continue";
this.state = 112;
if (true) break;;
 if (true) break;
;
RDebugUtils.currentLine=327740;
 //BA.debugLineNum = 327740;BA.debugLine="If FirstRun Then";

case 22:
//if
this.state = 43;
if (_firstrun) { 
this.state = 24;
}else {
this.state = 34;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=327741;
 //BA.debugLineNum = 327741;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 25:
//if
this.state = 32;
if ((_camera).equals("347574")) { 
this.state = 27;
}else 
{RDebugUtils.currentLine=327745;
 //BA.debugLineNum = 327745;BA.debugLine="Else If camera = \"236967\" Then";
if ((_camera).equals("236967")) { 
this.state = 29;
}else 
{RDebugUtils.currentLine=327749;
 //BA.debugLineNum = 327749;BA.debugLine="Else If camera = \"458236\" Then";
if ((_camera).equals("458236")) { 
this.state = 31;
}}}
if (true) break;

case 27:
//C
this.state = 32;
RDebugUtils.currentLine=327742;
 //BA.debugLineNum = 327742;BA.debugLine="lblStatus.Text = \"Retrieving Driveway thumbna";
parent._lblstatus.setText("Retrieving Driveway thumbnail...");
RDebugUtils.currentLine=327743;
 //BA.debugLineNum = 327743;BA.debugLine="iv = ivDriveway";
_iv = parent._ivdriveway;
RDebugUtils.currentLine=327744;
 //BA.debugLineNum = 327744;BA.debugLine="clv = clvDriveway";
_clv = parent._clvdriveway;
 if (true) break;

case 29:
//C
this.state = 32;
RDebugUtils.currentLine=327746;
 //BA.debugLineNum = 327746;BA.debugLine="lblStatus.Text = \"Retrieving Front Door thumb";
parent._lblstatus.setText("Retrieving Front Door thumbnail...");
RDebugUtils.currentLine=327747;
 //BA.debugLineNum = 327747;BA.debugLine="iv = ivFrontDoor";
_iv = parent._ivfrontdoor;
RDebugUtils.currentLine=327748;
 //BA.debugLineNum = 327748;BA.debugLine="clv = clvFrontDoor";
_clv = parent._clvfrontdoor;
 if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=327750;
 //BA.debugLineNum = 327750;BA.debugLine="lblStatus.Text = \"Retrieving Side Yard thumbn";
parent._lblstatus.setText("Retrieving Side Yard thumbnail...");
RDebugUtils.currentLine=327751;
 //BA.debugLineNum = 327751;BA.debugLine="iv = ivSideYard";
_iv = parent._ivsideyard;
RDebugUtils.currentLine=327752;
 //BA.debugLineNum = 327752;BA.debugLine="clv = clvSideYard";
_clv = parent._clvsideyard;
 if (true) break;

case 32:
//C
this.state = 43;
;
 if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=327755;
 //BA.debugLineNum = 327755;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 35:
//if
this.state = 42;
if ((_camera).equals("347574")) { 
this.state = 37;
}else 
{RDebugUtils.currentLine=327760;
 //BA.debugLineNum = 327760;BA.debugLine="Else If camera = \"236967\" Then";
if ((_camera).equals("236967")) { 
this.state = 39;
}else 
{RDebugUtils.currentLine=327765;
 //BA.debugLineNum = 327765;BA.debugLine="Else If camera = \"458236\" Then";
if ((_camera).equals("458236")) { 
this.state = 41;
}}}
if (true) break;

case 37:
//C
this.state = 42;
RDebugUtils.currentLine=327756;
 //BA.debugLineNum = 327756;BA.debugLine="lblStatus.Text = \"Capturing a new Driveway th";
parent._lblstatus.setText("Capturing a new Driveway thumbnail...");
RDebugUtils.currentLine=327757;
 //BA.debugLineNum = 327757;BA.debugLine="iv = ivDriveway";
_iv = parent._ivdriveway;
RDebugUtils.currentLine=327758;
 //BA.debugLineNum = 327758;BA.debugLine="clv = clvDriveway";
_clv = parent._clvdriveway;
RDebugUtils.currentLine=327759;
 //BA.debugLineNum = 327759;BA.debugLine="attempts = 15";
_attempts = (int) (15);
 if (true) break;

case 39:
//C
this.state = 42;
RDebugUtils.currentLine=327761;
 //BA.debugLineNum = 327761;BA.debugLine="lblStatus.Text = \"Capturing a new Front Door";
parent._lblstatus.setText("Capturing a new Front Door thumbnail...");
RDebugUtils.currentLine=327762;
 //BA.debugLineNum = 327762;BA.debugLine="iv = ivFrontDoor";
_iv = parent._ivfrontdoor;
RDebugUtils.currentLine=327763;
 //BA.debugLineNum = 327763;BA.debugLine="clv = clvFrontDoor";
_clv = parent._clvfrontdoor;
RDebugUtils.currentLine=327764;
 //BA.debugLineNum = 327764;BA.debugLine="attempts = 15";
_attempts = (int) (15);
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=327766;
 //BA.debugLineNum = 327766;BA.debugLine="lblStatus.Text = \"Capturing a new Side Yard t";
parent._lblstatus.setText("Capturing a new Side Yard thumbnail...");
RDebugUtils.currentLine=327767;
 //BA.debugLineNum = 327767;BA.debugLine="iv = ivSideYard";
_iv = parent._ivsideyard;
RDebugUtils.currentLine=327768;
 //BA.debugLineNum = 327768;BA.debugLine="clv = clvSideYard";
_clv = parent._clvsideyard;
RDebugUtils.currentLine=327769;
 //BA.debugLineNum = 327769;BA.debugLine="attempts = 15";
_attempts = (int) (15);
 if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;
;
RDebugUtils.currentLine=327773;
 //BA.debugLineNum = 327773;BA.debugLine="If FirstRun Then";

case 43:
//if
this.state = 93;
if (_firstrun) { 
this.state = 45;
}else {
this.state = 47;
}if (true) break;

case 45:
//C
this.state = 93;
RDebugUtils.currentLine=327774;
 //BA.debugLineNum = 327774;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera);
RDebugUtils.currentLine=327775;
 //BA.debugLineNum = 327775;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"), _rs);
this.state = 113;
return;
case 113:
//C
this.state = 93;
_result = (Object) result[0];
;
RDebugUtils.currentLine=327778;
 //BA.debugLineNum = 327778;BA.debugLine="Dim rs As ResumableSub = GetCameraInfo(respons";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcamerainfo(parent._response,_clv);
RDebugUtils.currentLine=327779;
 //BA.debugLineNum = 327779;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"), _rs);
this.state = 114;
return;
case 114:
//C
this.state = 93;
_result = (Object) result[0];
;
RDebugUtils.currentLine=327781;
 //BA.debugLineNum = 327781;BA.debugLine="Dim rs As ResumableSub = DownloadImage(\"https:";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _downloadimage("https://rest-"+parent._userregion+".immedia-semi.com/"+parent._camerathumbnail+".jpg",_iv,_camera);
RDebugUtils.currentLine=327782;
 //BA.debugLineNum = 327782;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"), _rs);
this.state = 115;
return;
case 115:
//C
this.state = 93;
_result = (Object) result[0];
;
 if (true) break;

case 47:
//C
this.state = 48;
RDebugUtils.currentLine=327785;
 //BA.debugLineNum = 327785;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera);
RDebugUtils.currentLine=327786;
 //BA.debugLineNum = 327786;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"), _rs);
this.state = 116;
return;
case 116:
//C
this.state = 48;
_result = (Object) result[0];
;
RDebugUtils.currentLine=327789;
 //BA.debugLineNum = 327789;BA.debugLine="Dim rs As ResumableSub = GetCameraInfo(respons";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcamerainfo(parent._response,(b4j.example.customlistview)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=327790;
 //BA.debugLineNum = 327790;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"), _rs);
this.state = 117;
return;
case 117:
//C
this.state = 48;
_result = (Object) result[0];
;
RDebugUtils.currentLine=327792;
 //BA.debugLineNum = 327792;BA.debugLine="prevCameraThumbnail = cameraThumbnail";
parent._prevcamerathumbnail = parent._camerathumbnail;
RDebugUtils.currentLine=327794;
 //BA.debugLineNum = 327794;BA.debugLine="Dim rs As ResumableSub = RESTPost(\"https://res";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restpost("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera+"/thumbnail");
RDebugUtils.currentLine=327795;
 //BA.debugLineNum = 327795;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"), _rs);
this.state = 118;
return;
case 118:
//C
this.state = 48;
_result = (Object) result[0];
;
RDebugUtils.currentLine=327798;
 //BA.debugLineNum = 327798;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.";
if (true) break;

case 48:
//if
this.state = 92;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 50;
}else {
this.state = 52;
}if (true) break;

case 50:
//C
this.state = 92;
RDebugUtils.currentLine=327799;
 //BA.debugLineNum = 327799;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327800;
 //BA.debugLineNum = 327800;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327801;
 //BA.debugLineNum = 327801;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327802;
 //BA.debugLineNum = 327802;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327803;
 //BA.debugLineNum = 327803;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327804;
 //BA.debugLineNum = 327804;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327805;
 //BA.debugLineNum = 327805;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=327807;
 //BA.debugLineNum = 327807;BA.debugLine="Dim rs As ResumableSub = GetCommandID(respons";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcommandid(parent._response);
RDebugUtils.currentLine=327808;
 //BA.debugLineNum = 327808;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"), _rs);
this.state = 119;
return;
case 119:
//C
this.state = 53;
_result = (Object) result[0];
;
RDebugUtils.currentLine=327810;
 //BA.debugLineNum = 327810;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://res";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
RDebugUtils.currentLine=327811;
 //BA.debugLineNum = 327811;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"), _rs);
this.state = 120;
return;
case 120:
//C
this.state = 53;
_result = (Object) result[0];
;
RDebugUtils.currentLine=327814;
 //BA.debugLineNum = 327814;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response";
if (true) break;

case 53:
//if
this.state = 91;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 55;
}else {
this.state = 57;
}if (true) break;

case 55:
//C
this.state = 91;
RDebugUtils.currentLine=327815;
 //BA.debugLineNum = 327815;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327816;
 //BA.debugLineNum = 327816;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327817;
 //BA.debugLineNum = 327817;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327818;
 //BA.debugLineNum = 327818;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327819;
 //BA.debugLineNum = 327819;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327820;
 //BA.debugLineNum = 327820;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327821;
 //BA.debugLineNum = 327821;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=327823;
 //BA.debugLineNum = 327823;BA.debugLine="Dim reChecked As Boolean";
_rechecked = false;
RDebugUtils.currentLine=327824;
 //BA.debugLineNum = 327824;BA.debugLine="For i = 1 To attempts";
if (true) break;

case 58:
//for
this.state = 77;
step117 = 1;
limit117 = _attempts;
_i = (int) (1) ;
this.state = 121;
if (true) break;

case 121:
//C
this.state = 77;
if ((step117 > 0 && _i <= limit117) || (step117 < 0 && _i >= limit117)) this.state = 60;
if (true) break;

case 122:
//C
this.state = 121;
_i = ((int)(0 + _i + step117)) ;
if (true) break;

case 60:
//C
this.state = 61;
RDebugUtils.currentLine=327827;
 //BA.debugLineNum = 327827;BA.debugLine="Dim rs As ResumableSub = GetCommandResponse";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcommandresponse(_iv,_clv,_camera,BA.NumberToString(_i),BA.NumberToString(_attempts));
RDebugUtils.currentLine=327828;
 //BA.debugLineNum = 327828;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"), _rs);
this.state = 123;
return;
case 123:
//C
this.state = 61;
_result = (Object) result[0];
;
RDebugUtils.currentLine=327829;
 //BA.debugLineNum = 327829;BA.debugLine="If Result Then Exit";
if (true) break;

case 61:
//if
this.state = 66;
if (BA.ObjectToBoolean(_result)) { 
this.state = 63;
;}if (true) break;

case 63:
//C
this.state = 66;
this.state = 77;
if (true) break;
if (true) break;

case 66:
//C
this.state = 67;
;
RDebugUtils.currentLine=327830;
 //BA.debugLineNum = 327830;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://r";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
RDebugUtils.currentLine=327831;
 //BA.debugLineNum = 327831;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"), _rs);
this.state = 124;
return;
case 124:
//C
this.state = 67;
_result = (Object) result[0];
;
RDebugUtils.currentLine=327832;
 //BA.debugLineNum = 327832;BA.debugLine="Sleep(1000) ' 1 second";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"),(int) (1000));
this.state = 125;
return;
case 125:
//C
this.state = 67;
;
RDebugUtils.currentLine=327834;
 //BA.debugLineNum = 327834;BA.debugLine="If i = attempts And reChecked =  False Then";
if (true) break;

case 67:
//if
this.state = 76;
if (_i==_attempts && _rechecked==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 69;
}if (true) break;

case 69:
//C
this.state = 70;
RDebugUtils.currentLine=327835;
 //BA.debugLineNum = 327835;BA.debugLine="reChecked = True";
_rechecked = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=327836;
 //BA.debugLineNum = 327836;BA.debugLine="Log(\"*********** HERE *********** i = \" &";
anywheresoftware.b4a.keywords.Common.Log("*********** HERE *********** i = "+BA.NumberToString(_i));
RDebugUtils.currentLine=327837;
 //BA.debugLineNum = 327837;BA.debugLine="Dim rs As ResumableSub = RESTPost(\"https:/";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restpost("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera+"/thumbnail");
RDebugUtils.currentLine=327838;
 //BA.debugLineNum = 327838;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"), _rs);
this.state = 126;
return;
case 126:
//C
this.state = 70;
_result = (Object) result[0];
;
RDebugUtils.currentLine=327840;
 //BA.debugLineNum = 327840;BA.debugLine="If response.StartsWith(\"ERROR: \") Or respo";
if (true) break;

case 70:
//if
this.state = 75;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 72;
}else {
this.state = 74;
}if (true) break;

case 72:
//C
this.state = 75;
RDebugUtils.currentLine=327841;
 //BA.debugLineNum = 327841;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327842;
 //BA.debugLineNum = 327842;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327843;
 //BA.debugLineNum = 327843;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327844;
 //BA.debugLineNum = 327844;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327845;
 //BA.debugLineNum = 327845;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327846;
 //BA.debugLineNum = 327846;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327847;
 //BA.debugLineNum = 327847;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 74:
//C
this.state = 75;
RDebugUtils.currentLine=327849;
 //BA.debugLineNum = 327849;BA.debugLine="i = 1";
_i = (int) (1);
 if (true) break;

case 75:
//C
this.state = 76;
;
RDebugUtils.currentLine=327851;
 //BA.debugLineNum = 327851;BA.debugLine="Log(\"*********** HERE TWO ***********\")";
anywheresoftware.b4a.keywords.Common.Log("*********** HERE TWO ***********");
RDebugUtils.currentLine=327852;
 //BA.debugLineNum = 327852;BA.debugLine="Dim rs As ResumableSub = GetCommandID(resp";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcommandid(parent._response);
RDebugUtils.currentLine=327853;
 //BA.debugLineNum = 327853;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"), _rs);
this.state = 127;
return;
case 127:
//C
this.state = 76;
_result = (Object) result[0];
;
RDebugUtils.currentLine=327855;
 //BA.debugLineNum = 327855;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
RDebugUtils.currentLine=327856;
 //BA.debugLineNum = 327856;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "refreshcameras"), _rs);
this.state = 128;
return;
case 128:
//C
this.state = 76;
_result = (Object) result[0];
;
 if (true) break;

case 76:
//C
this.state = 122;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=327860;
 //BA.debugLineNum = 327860;BA.debugLine="If response.StartsWith(\"ERROR: \") Or respons";

case 77:
//if
this.state = 90;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 79;
}else 
{RDebugUtils.currentLine=327868;
 //BA.debugLineNum = 327868;BA.debugLine="else If commandComplete = False Then";
if (parent._commandcomplete==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 81;
}}
if (true) break;

case 79:
//C
this.state = 90;
RDebugUtils.currentLine=327861;
 //BA.debugLineNum = 327861;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327862;
 //BA.debugLineNum = 327862;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327863;
 //BA.debugLineNum = 327863;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327864;
 //BA.debugLineNum = 327864;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327865;
 //BA.debugLineNum = 327865;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327866;
 //BA.debugLineNum = 327866;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327867;
 //BA.debugLineNum = 327867;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 81:
//C
this.state = 82;
RDebugUtils.currentLine=327869;
 //BA.debugLineNum = 327869;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 82:
//if
this.state = 89;
if ((_camera).equals("347574")) { 
this.state = 84;
}else 
{RDebugUtils.currentLine=327871;
 //BA.debugLineNum = 327871;BA.debugLine="Else If camera = \"236967\" Then";
if ((_camera).equals("236967")) { 
this.state = 86;
}else 
{RDebugUtils.currentLine=327873;
 //BA.debugLineNum = 327873;BA.debugLine="Else If camera = \"458236\" Then";
if ((_camera).equals("458236")) { 
this.state = 88;
}}}
if (true) break;

case 84:
//C
this.state = 89;
RDebugUtils.currentLine=327870;
 //BA.debugLineNum = 327870;BA.debugLine="lblStatus.Text = \"Failed to retrieve Drive";
parent._lblstatus.setText("Failed to retrieve Driveway thumbnail...");
 if (true) break;

case 86:
//C
this.state = 89;
RDebugUtils.currentLine=327872;
 //BA.debugLineNum = 327872;BA.debugLine="lblStatus.Text = \"Failed to retrieve Front";
parent._lblstatus.setText("Failed to retrieve Front Door thumbnail...");
 if (true) break;

case 88:
//C
this.state = 89;
RDebugUtils.currentLine=327874;
 //BA.debugLineNum = 327874;BA.debugLine="lblStatus.Text = \"Failed to retrieve Side";
parent._lblstatus.setText("Failed to retrieve Side Yard thumbnail...");
 if (true) break;

case 89:
//C
this.state = 90;
;
 if (true) break;

case 90:
//C
this.state = 91;
;
 if (true) break;

case 91:
//C
this.state = 92;
;
 if (true) break;

case 92:
//C
this.state = 93;
;
 if (true) break;

case 93:
//C
this.state = 112;
;
 if (true) break;
if (true) break;

case 94:
//C
this.state = 97;
;
RDebugUtils.currentLine=327884;
 //BA.debugLineNum = 327884;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
 if (true) break;

case 96:
//C
this.state = 97;
this.catchState = 0;
RDebugUtils.currentLine=327886;
 //BA.debugLineNum = 327886;BA.debugLine="response = \"ERROR: \" & LastException";
parent._response = "ERROR: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba));
RDebugUtils.currentLine=327887;
 //BA.debugLineNum = 327887;BA.debugLine="Log(\"RefreshCamera LastException: \" & LastExcept";
anywheresoftware.b4a.keywords.Common.Log("RefreshCamera LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 97:
//C
this.state = 98;
this.catchState = 0;
;
RDebugUtils.currentLine=327889;
 //BA.debugLineNum = 327889;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327890;
 //BA.debugLineNum = 327890;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327891;
 //BA.debugLineNum = 327891;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327892;
 //BA.debugLineNum = 327892;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327893;
 //BA.debugLineNum = 327893;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327894;
 //BA.debugLineNum = 327894;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327895;
 //BA.debugLineNum = 327895;BA.debugLine="If lblSideYard.Text.Contains(\"OFFLINE\") Then";
if (true) break;

case 98:
//if
this.state = 105;
if (parent._lblsideyard.getText().contains("OFFLINE")) { 
this.state = 100;
}else 
{RDebugUtils.currentLine=327898;
 //BA.debugLineNum = 327898;BA.debugLine="Else if lblDriveway.Text.Contains(\"OFFLINE\") Then";
if (parent._lbldriveway.getText().contains("OFFLINE")) { 
this.state = 102;
}else 
{RDebugUtils.currentLine=327901;
 //BA.debugLineNum = 327901;BA.debugLine="Else if lblFrontDoor.Text.Contains(\"OFFLINE\") The";
if (parent._lblfrontdoor.getText().contains("OFFLINE")) { 
this.state = 104;
}}}
if (true) break;

case 100:
//C
this.state = 105;
RDebugUtils.currentLine=327896;
 //BA.debugLineNum = 327896;BA.debugLine="lblSideYard.Text = sideyardArmedStatus";
parent._lblsideyard.setText(parent._sideyardarmedstatus);
RDebugUtils.currentLine=327897;
 //BA.debugLineNum = 327897;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
_bluriv("SideYard.jpg",parent._ivsideyard);
 if (true) break;

case 102:
//C
this.state = 105;
RDebugUtils.currentLine=327899;
 //BA.debugLineNum = 327899;BA.debugLine="lblDriveway.Text = drivewayArmedStatus";
parent._lbldriveway.setText(parent._drivewayarmedstatus);
RDebugUtils.currentLine=327900;
 //BA.debugLineNum = 327900;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
_bluriv("Driveway.jpg",parent._ivdriveway);
 if (true) break;

case 104:
//C
this.state = 105;
RDebugUtils.currentLine=327902;
 //BA.debugLineNum = 327902;BA.debugLine="lblFrontDoor.Text = frontdoorArmedStatus";
parent._lblfrontdoor.setText(parent._frontdoorarmedstatus);
RDebugUtils.currentLine=327903;
 //BA.debugLineNum = 327903;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
_bluriv("FrontDoor.jpg",parent._ivfrontdoor);
 if (true) break;

case 105:
//C
this.state = -1;
;
RDebugUtils.currentLine=327905;
 //BA.debugLineNum = 327905;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
RDebugUtils.currentLine=327906;
 //BA.debugLineNum = 327906;BA.debugLine="End Sub";
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
public static void  _btndrivewaynewclip_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btndrivewaynewclip_click", false))
	 {Debug.delegate(ba, "btndrivewaynewclip_click", null); return;}
ResumableSub_btnDrivewayNewClip_Click rsub = new ResumableSub_btnDrivewayNewClip_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnDrivewayNewClip_Click extends BA.ResumableSub {
public ResumableSub_btnDrivewayNewClip_Click(cloyd.blink.main parent) {
this.parent = parent;
}
cloyd.blink.main parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
Object _result = null;
int _i = 0;
int step29;
int limit29;
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
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="If fx.Msgbox2(MainForm, \"Capture a new video for";
if (true) break;

case 1:
//if
this.state = 28;
if (parent._fx.Msgbox2(parent._mainform,"Capture a new video for the Driveway camera?",parent._mainform.getTitle(),"Yes","","No",parent._fx.MSGBOX_CONFIRMATION)==parent._fx.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Try";
if (true) break;

case 4:
//try
this.state = 27;
this.catchState = 26;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 26;
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="btnDriveway.Enabled = False";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="btnRefresh.Enabled = False";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="btnActivity.Enabled = False";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="btnDrivewayNewClip.Enabled = False";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="btnSideYardNewClip.Enabled = False";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="lblStatus.Text = \"Capturing a new Driveway vide";
parent._lblstatus.setText("Capturing a new Driveway video clip...");
RDebugUtils.currentLine=3145739;
 //BA.debugLineNum = 3145739;BA.debugLine="Dim rs As ResumableSub = RESTPost(\"https://rest";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restpost("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/347574/clip");
RDebugUtils.currentLine=3145740;
 //BA.debugLineNum = 3145740;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btndrivewaynewclip_click"), _rs);
this.state = 29;
return;
case 29:
//C
this.state = 7;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3145742;
 //BA.debugLineNum = 3145742;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.C";
if (true) break;

case 7:
//if
this.state = 10;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=3145743;
 //BA.debugLineNum = 3145743;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3145744;
 //BA.debugLineNum = 3145744;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3145745;
 //BA.debugLineNum = 3145745;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3145746;
 //BA.debugLineNum = 3145746;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3145747;
 //BA.debugLineNum = 3145747;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3145748;
 //BA.debugLineNum = 3145748;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3145749;
 //BA.debugLineNum = 3145749;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3145750;
 //BA.debugLineNum = 3145750;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3145751;
 //BA.debugLineNum = 3145751;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3145752;
 //BA.debugLineNum = 3145752;BA.debugLine="lblStatus.Text = response";
parent._lblstatus.setText(parent._response);
RDebugUtils.currentLine=3145753;
 //BA.debugLineNum = 3145753;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=3145755;
 //BA.debugLineNum = 3145755;BA.debugLine="Dim rs As ResumableSub = GetCommandID(response)";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcommandid(parent._response);
RDebugUtils.currentLine=3145756;
 //BA.debugLineNum = 3145756;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btndrivewaynewclip_click"), _rs);
this.state = 30;
return;
case 30:
//C
this.state = 11;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3145758;
 //BA.debugLineNum = 3145758;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
RDebugUtils.currentLine=3145759;
 //BA.debugLineNum = 3145759;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btndrivewaynewclip_click"), _rs);
this.state = 31;
return;
case 31:
//C
this.state = 11;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3145761;
 //BA.debugLineNum = 3145761;BA.debugLine="For i = 1 To 70";
if (true) break;

case 11:
//for
this.state = 24;
step29 = 1;
limit29 = (int) (70);
_i = (int) (1) ;
this.state = 32;
if (true) break;

case 32:
//C
this.state = 24;
if ((step29 > 0 && _i <= limit29) || (step29 < 0 && _i >= limit29)) this.state = 13;
if (true) break;

case 33:
//C
this.state = 32;
_i = ((int)(0 + _i + step29)) ;
if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=3145762;
 //BA.debugLineNum = 3145762;BA.debugLine="Dim rs As ResumableSub = GetCommandStatus(resp";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcommandstatus(parent._response);
RDebugUtils.currentLine=3145763;
 //BA.debugLineNum = 3145763;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btndrivewaynewclip_click"), _rs);
this.state = 34;
return;
case 34:
//C
this.state = 14;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3145764;
 //BA.debugLineNum = 3145764;BA.debugLine="If commandComplete Then";
if (true) break;

case 14:
//if
this.state = 23;
if (parent._commandcomplete) { 
this.state = 16;
}else {
this.state = 22;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=3145765;
 //BA.debugLineNum = 3145765;BA.debugLine="For i = 3 To 1 Step -1";
if (true) break;

case 17:
//for
this.state = 20;
step33 = -1;
limit33 = (int) (1);
_i = (int) (3) ;
this.state = 35;
if (true) break;

case 35:
//C
this.state = 20;
if ((step33 > 0 && _i <= limit33) || (step33 < 0 && _i >= limit33)) this.state = 19;
if (true) break;

case 36:
//C
this.state = 35;
_i = ((int)(0 + _i + step33)) ;
if (true) break;

case 19:
//C
this.state = 36;
RDebugUtils.currentLine=3145766;
 //BA.debugLineNum = 3145766;BA.debugLine="lblStatus.Text = \"New Driveway video clip wi";
parent._lblstatus.setText("New Driveway video clip will be shown in "+BA.NumberToString(_i)+" seconds...");
RDebugUtils.currentLine=3145767;
 //BA.debugLineNum = 3145767;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btndrivewaynewclip_click"),(int) (1000));
this.state = 37;
return;
case 37:
//C
this.state = 36;
;
 if (true) break;
if (true) break;

case 20:
//C
this.state = 23;
;
RDebugUtils.currentLine=3145769;
 //BA.debugLineNum = 3145769;BA.debugLine="btnActivity_Click";
_btnactivity_click();
RDebugUtils.currentLine=3145770;
 //BA.debugLineNum = 3145770;BA.debugLine="Exit";
this.state = 24;
if (true) break;
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=3145772;
 //BA.debugLineNum = 3145772;BA.debugLine="lblStatus.Text = \"Awaiting for the Driveway v";
parent._lblstatus.setText("Awaiting for the Driveway video clip... "+BA.NumberToString(_i)+"/70");
 if (true) break;

case 23:
//C
this.state = 33;
;
RDebugUtils.currentLine=3145774;
 //BA.debugLineNum = 3145774;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
RDebugUtils.currentLine=3145775;
 //BA.debugLineNum = 3145775;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btndrivewaynewclip_click"), _rs);
this.state = 38;
return;
case 38:
//C
this.state = 33;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3145776;
 //BA.debugLineNum = 3145776;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btndrivewaynewclip_click"),(int) (1000));
this.state = 39;
return;
case 39:
//C
this.state = 33;
;
 if (true) break;
if (true) break;

case 24:
//C
this.state = 27;
;
 if (true) break;

case 26:
//C
this.state = 27;
this.catchState = 0;
RDebugUtils.currentLine=3145779;
 //BA.debugLineNum = 3145779;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 0;
;
RDebugUtils.currentLine=3145781;
 //BA.debugLineNum = 3145781;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3145782;
 //BA.debugLineNum = 3145782;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3145783;
 //BA.debugLineNum = 3145783;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3145784;
 //BA.debugLineNum = 3145784;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3145785;
 //BA.debugLineNum = 3145785;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3145786;
 //BA.debugLineNum = 3145786;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3145787;
 //BA.debugLineNum = 3145787;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
 if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=3145789;
 //BA.debugLineNum = 3145789;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Try";
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
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="response = \"\"";
parent._response = "";
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no";
_j._initialize /*String*/ (null,ba,"",main.getObject());
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="j.PostString(url,\"\")";
_j._poststring /*String*/ (null,_url,"");
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="j.GetRequest.SetContentType(\"application/x-www-f";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/x-www-form-urlencoded");
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("TOKEN_AUTH",parent._authtoken);
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "restpost"), (Object)(_j));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[0];
;
RDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="response = j.GetString";
parent._response = _j._getstring /*String*/ (null);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
parent._response = "ERROR: "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="lblStatus.Text = GetRESTError(j.ErrorMessage)";
parent._lblstatus.setText(_getresterror(_j._errormessage /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="If response.Contains(\"System is busy, please wai";

case 9:
//if
this.state = 12;
if (parent._response.contains("System is busy, please wait")) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="lblStatus.Text = \"System is busy, please wait\"";
parent._lblstatus.setText("System is busy, please wait");
 if (true) break;

case 12:
//C
this.state = 15;
;
RDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
RDebugUtils.currentLine=524308;
 //BA.debugLineNum = 524308;BA.debugLine="response = \"ERROR: \" & LastException";
parent._response = "ERROR: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba));
RDebugUtils.currentLine=524309;
 //BA.debugLineNum = 524309;BA.debugLine="Log(\"RESTPost LastException: \" & LastException)";
anywheresoftware.b4a.keywords.Common.Log("RESTPost LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 15:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=524311;
 //BA.debugLineNum = 524311;BA.debugLine="Log(\"URL: \" & url)";
anywheresoftware.b4a.keywords.Common.Log("URL: "+_url);
RDebugUtils.currentLine=524312;
 //BA.debugLineNum = 524312;BA.debugLine="Log(\"Response: \" & response)";
anywheresoftware.b4a.keywords.Common.Log("Response: "+parent._response);
RDebugUtils.currentLine=524313;
 //BA.debugLineNum = 524313;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
RDebugUtils.currentLine=524314;
 //BA.debugLineNum = 524314;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getcommandid(String _json) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getcommandid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "getcommandid", new Object[] {_json}));}
ResumableSub_GetCommandID rsub = new ResumableSub_GetCommandID(null,_json);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetCommandID extends BA.ResumableSub {
public ResumableSub_GetCommandID(cloyd.blink.main parent,String _json) {
this.parent = parent;
this._json = _json;
}
cloyd.blink.main parent;
String _json;
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;

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
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Try";
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
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=720915;
 //BA.debugLineNum = 720915;BA.debugLine="commandID = root.Get(\"id\")";
parent._commandid = BA.ObjectToString(_root.Get((Object)("id")));
RDebugUtils.currentLine=720916;
 //BA.debugLineNum = 720916;BA.debugLine="Log(\"commandID: \" & commandID)";
anywheresoftware.b4a.keywords.Common.Log("commandID: "+parent._commandid);
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=720938;
 //BA.debugLineNum = 720938;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=720940;
 //BA.debugLineNum = 720940;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
RDebugUtils.currentLine=720941;
 //BA.debugLineNum = 720941;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getcommandstatus(String _json) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getcommandstatus", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "getcommandstatus", new Object[] {_json}));}
ResumableSub_GetCommandStatus rsub = new ResumableSub_GetCommandStatus(null,_json);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetCommandStatus extends BA.ResumableSub {
public ResumableSub_GetCommandStatus(cloyd.blink.main parent,String _json) {
this.parent = parent;
this._json = _json;
}
cloyd.blink.main parent;
String _json;
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;

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
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Try";
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
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="commandComplete = root.Get(\"complete\")";
parent._commandcomplete = BA.ObjectToBoolean(_root.Get((Object)("complete")));
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="Log(\"commandComplete: \" & commandComplete)";
anywheresoftware.b4a.keywords.Common.Log("commandComplete: "+BA.ObjectToString(parent._commandcomplete));
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="End Sub";
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
public static void  _btndrivewayrefresh_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btndrivewayrefresh_click", false))
	 {Debug.delegate(ba, "btndrivewayrefresh_click", null); return;}
ResumableSub_btnDrivewayRefresh_Click rsub = new ResumableSub_btnDrivewayRefresh_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnDrivewayRefresh_Click extends BA.ResumableSub {
public ResumableSub_btnDrivewayRefresh_Click(cloyd.blink.main parent) {
this.parent = parent;
}
cloyd.blink.main parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
Object _result = null;

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
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Dim rs As ResumableSub = RefreshCameras(False, \"3";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _refreshcameras(anywheresoftware.b4a.keywords.Common.False,"347574");
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btndrivewayrefresh_click"), _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btnfrontdoornewclip_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnfrontdoornewclip_click", false))
	 {Debug.delegate(ba, "btnfrontdoornewclip_click", null); return;}
ResumableSub_btnFrontDoorNewClip_Click rsub = new ResumableSub_btnFrontDoorNewClip_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnFrontDoorNewClip_Click extends BA.ResumableSub {
public ResumableSub_btnFrontDoorNewClip_Click(cloyd.blink.main parent) {
this.parent = parent;
}
cloyd.blink.main parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
Object _result = null;
int _i = 0;
int step26;
int limit26;
int step30;
int limit30;

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
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="If fx.Msgbox2(MainForm, \"Capture a new video for";
if (true) break;

case 1:
//if
this.state = 28;
if (parent._fx.Msgbox2(parent._mainform,"Capture a new video for the Front Door camera?",parent._mainform.getTitle(),"Yes","","No",parent._fx.MSGBOX_CONFIRMATION)==parent._fx.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Try";
if (true) break;

case 4:
//try
this.state = 27;
this.catchState = 26;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 26;
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="btnDriveway.Enabled = False";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="btnRefresh.Enabled = False";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="btnActivity.Enabled = False";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="btnDrivewayNewClip.Enabled = False";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="btnSideYardNewClip.Enabled = False";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3211273;
 //BA.debugLineNum = 3211273;BA.debugLine="lblStatus.Text = \"Capturing a new Front Door vi";
parent._lblstatus.setText("Capturing a new Front Door video clip...");
RDebugUtils.currentLine=3211275;
 //BA.debugLineNum = 3211275;BA.debugLine="Dim rs As ResumableSub = RESTPost(\"https://rest";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restpost("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/236967/clip");
RDebugUtils.currentLine=3211276;
 //BA.debugLineNum = 3211276;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btnfrontdoornewclip_click"), _rs);
this.state = 29;
return;
case 29:
//C
this.state = 7;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3211277;
 //BA.debugLineNum = 3211277;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.C";
if (true) break;

case 7:
//if
this.state = 10;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=3211278;
 //BA.debugLineNum = 3211278;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3211279;
 //BA.debugLineNum = 3211279;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3211280;
 //BA.debugLineNum = 3211280;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3211281;
 //BA.debugLineNum = 3211281;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3211282;
 //BA.debugLineNum = 3211282;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3211283;
 //BA.debugLineNum = 3211283;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3211284;
 //BA.debugLineNum = 3211284;BA.debugLine="lblStatus.Text = response";
parent._lblstatus.setText(parent._response);
RDebugUtils.currentLine=3211285;
 //BA.debugLineNum = 3211285;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=3211288;
 //BA.debugLineNum = 3211288;BA.debugLine="Dim rs As ResumableSub = GetCommandID(response)";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcommandid(parent._response);
RDebugUtils.currentLine=3211289;
 //BA.debugLineNum = 3211289;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btnfrontdoornewclip_click"), _rs);
this.state = 30;
return;
case 30:
//C
this.state = 11;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3211291;
 //BA.debugLineNum = 3211291;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
RDebugUtils.currentLine=3211292;
 //BA.debugLineNum = 3211292;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btnfrontdoornewclip_click"), _rs);
this.state = 31;
return;
case 31:
//C
this.state = 11;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3211294;
 //BA.debugLineNum = 3211294;BA.debugLine="For i = 1 To 70";
if (true) break;

case 11:
//for
this.state = 24;
step26 = 1;
limit26 = (int) (70);
_i = (int) (1) ;
this.state = 32;
if (true) break;

case 32:
//C
this.state = 24;
if ((step26 > 0 && _i <= limit26) || (step26 < 0 && _i >= limit26)) this.state = 13;
if (true) break;

case 33:
//C
this.state = 32;
_i = ((int)(0 + _i + step26)) ;
if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=3211295;
 //BA.debugLineNum = 3211295;BA.debugLine="Dim rs As ResumableSub = GetCommandStatus(resp";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcommandstatus(parent._response);
RDebugUtils.currentLine=3211296;
 //BA.debugLineNum = 3211296;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btnfrontdoornewclip_click"), _rs);
this.state = 34;
return;
case 34:
//C
this.state = 14;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3211297;
 //BA.debugLineNum = 3211297;BA.debugLine="If commandComplete Then";
if (true) break;

case 14:
//if
this.state = 23;
if (parent._commandcomplete) { 
this.state = 16;
}else {
this.state = 22;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=3211298;
 //BA.debugLineNum = 3211298;BA.debugLine="For i = 3 To 1  Step -1";
if (true) break;

case 17:
//for
this.state = 20;
step30 = -1;
limit30 = (int) (1);
_i = (int) (3) ;
this.state = 35;
if (true) break;

case 35:
//C
this.state = 20;
if ((step30 > 0 && _i <= limit30) || (step30 < 0 && _i >= limit30)) this.state = 19;
if (true) break;

case 36:
//C
this.state = 35;
_i = ((int)(0 + _i + step30)) ;
if (true) break;

case 19:
//C
this.state = 36;
RDebugUtils.currentLine=3211299;
 //BA.debugLineNum = 3211299;BA.debugLine="lblStatus.Text = \"New Front Door video clip";
parent._lblstatus.setText("New Front Door video clip will be shown in "+BA.NumberToString(_i)+" seconds...");
RDebugUtils.currentLine=3211300;
 //BA.debugLineNum = 3211300;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btnfrontdoornewclip_click"),(int) (1000));
this.state = 37;
return;
case 37:
//C
this.state = 36;
;
 if (true) break;
if (true) break;

case 20:
//C
this.state = 23;
;
RDebugUtils.currentLine=3211302;
 //BA.debugLineNum = 3211302;BA.debugLine="btnActivity_Click";
_btnactivity_click();
RDebugUtils.currentLine=3211303;
 //BA.debugLineNum = 3211303;BA.debugLine="Exit";
this.state = 24;
if (true) break;
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=3211305;
 //BA.debugLineNum = 3211305;BA.debugLine="lblStatus.Text = \"Awaiting for the Front Door";
parent._lblstatus.setText("Awaiting for the Front Door video clip... "+BA.NumberToString(_i)+"/70");
 if (true) break;

case 23:
//C
this.state = 33;
;
RDebugUtils.currentLine=3211307;
 //BA.debugLineNum = 3211307;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
RDebugUtils.currentLine=3211308;
 //BA.debugLineNum = 3211308;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btnfrontdoornewclip_click"), _rs);
this.state = 38;
return;
case 38:
//C
this.state = 33;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3211309;
 //BA.debugLineNum = 3211309;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btnfrontdoornewclip_click"),(int) (1000));
this.state = 39;
return;
case 39:
//C
this.state = 33;
;
 if (true) break;
if (true) break;

case 24:
//C
this.state = 27;
;
 if (true) break;

case 26:
//C
this.state = 27;
this.catchState = 0;
RDebugUtils.currentLine=3211312;
 //BA.debugLineNum = 3211312;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 0;
;
RDebugUtils.currentLine=3211314;
 //BA.debugLineNum = 3211314;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3211315;
 //BA.debugLineNum = 3211315;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3211316;
 //BA.debugLineNum = 3211316;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3211317;
 //BA.debugLineNum = 3211317;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3211318;
 //BA.debugLineNum = 3211318;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3211319;
 //BA.debugLineNum = 3211319;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3211320;
 //BA.debugLineNum = 3211320;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
 if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=3211322;
 //BA.debugLineNum = 3211322;BA.debugLine="End Sub";
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
public static void  _btnfrontdoorrefresh_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnfrontdoorrefresh_click", false))
	 {Debug.delegate(ba, "btnfrontdoorrefresh_click", null); return;}
ResumableSub_btnFrontDoorRefresh_Click rsub = new ResumableSub_btnFrontDoorRefresh_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnFrontDoorRefresh_Click extends BA.ResumableSub {
public ResumableSub_btnFrontDoorRefresh_Click(cloyd.blink.main parent) {
this.parent = parent;
}
cloyd.blink.main parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
Object _result = null;

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
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Dim rs As ResumableSub = RefreshCameras(False, \"2";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _refreshcameras(anywheresoftware.b4a.keywords.Common.False,"236967");
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btnfrontdoorrefresh_click"), _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btnrefresh_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnrefresh_click", false))
	 {Debug.delegate(ba, "btnrefresh_click", null); return;}
ResumableSub_btnRefresh_Click rsub = new ResumableSub_btnRefresh_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnRefresh_Click extends BA.ResumableSub {
public ResumableSub_btnRefresh_Click(cloyd.blink.main parent) {
this.parent = parent;
}
cloyd.blink.main parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
Object _result = null;

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
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="btnDriveway.Enabled = False";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="btnRefresh.Enabled = False";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="btnActivity.Enabled = False";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="btnDrivewayNewClip.Enabled = False";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="btnSideYardNewClip.Enabled = False";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
_bluriv("Driveway.jpg",parent._ivdriveway);
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
_bluriv("FrontDoor.jpg",parent._ivfrontdoor);
RDebugUtils.currentLine=3080201;
 //BA.debugLineNum = 3080201;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
_bluriv("SideYard.jpg",parent._ivsideyard);
RDebugUtils.currentLine=3080203;
 //BA.debugLineNum = 3080203;BA.debugLine="Dim rs As ResumableSub = RefreshCameras(True, \"Al";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _refreshcameras(anywheresoftware.b4a.keywords.Common.True,"All");
RDebugUtils.currentLine=3080204;
 //BA.debugLineNum = 3080204;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btnrefresh_click"), _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3080205;
 //BA.debugLineNum = 3080205;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btnsideyardnewclip_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnsideyardnewclip_click", false))
	 {Debug.delegate(ba, "btnsideyardnewclip_click", null); return;}
ResumableSub_btnSideYardNewClip_Click rsub = new ResumableSub_btnSideYardNewClip_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSideYardNewClip_Click extends BA.ResumableSub {
public ResumableSub_btnSideYardNewClip_Click(cloyd.blink.main parent) {
this.parent = parent;
}
cloyd.blink.main parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
Object _result = null;
int _i = 0;
int step26;
int limit26;
int step30;
int limit30;

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
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="If fx.Msgbox2(MainForm, \"Capture a new video for";
if (true) break;

case 1:
//if
this.state = 28;
if (parent._fx.Msgbox2(parent._mainform,"Capture a new video for the Side Yard camera?",parent._mainform.getTitle(),"Yes","","No",parent._fx.MSGBOX_CONFIRMATION)==parent._fx.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Try";
if (true) break;

case 4:
//try
this.state = 27;
this.catchState = 26;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 26;
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="btnDriveway.Enabled = False";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="btnRefresh.Enabled = False";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="btnActivity.Enabled = False";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="btnDrivewayNewClip.Enabled = False";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="btnSideYardNewClip.Enabled = False";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3276809;
 //BA.debugLineNum = 3276809;BA.debugLine="lblStatus.Text = \"Capturing a new Side Yard vid";
parent._lblstatus.setText("Capturing a new Side Yard video clip...");
RDebugUtils.currentLine=3276810;
 //BA.debugLineNum = 3276810;BA.debugLine="Dim rs As ResumableSub = RESTPost(\"https://rest";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restpost("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/458236/clip");
RDebugUtils.currentLine=3276811;
 //BA.debugLineNum = 3276811;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btnsideyardnewclip_click"), _rs);
this.state = 29;
return;
case 29:
//C
this.state = 7;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3276812;
 //BA.debugLineNum = 3276812;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.C";
if (true) break;

case 7:
//if
this.state = 10;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=3276813;
 //BA.debugLineNum = 3276813;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3276814;
 //BA.debugLineNum = 3276814;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3276815;
 //BA.debugLineNum = 3276815;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3276816;
 //BA.debugLineNum = 3276816;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3276817;
 //BA.debugLineNum = 3276817;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3276818;
 //BA.debugLineNum = 3276818;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3276819;
 //BA.debugLineNum = 3276819;BA.debugLine="lblStatus.Text = response";
parent._lblstatus.setText(parent._response);
RDebugUtils.currentLine=3276820;
 //BA.debugLineNum = 3276820;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=3276823;
 //BA.debugLineNum = 3276823;BA.debugLine="Dim rs As ResumableSub = GetCommandID(response)";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcommandid(parent._response);
RDebugUtils.currentLine=3276824;
 //BA.debugLineNum = 3276824;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btnsideyardnewclip_click"), _rs);
this.state = 30;
return;
case 30:
//C
this.state = 11;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3276826;
 //BA.debugLineNum = 3276826;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
RDebugUtils.currentLine=3276827;
 //BA.debugLineNum = 3276827;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btnsideyardnewclip_click"), _rs);
this.state = 31;
return;
case 31:
//C
this.state = 11;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3276829;
 //BA.debugLineNum = 3276829;BA.debugLine="For i = 1 To 70";
if (true) break;

case 11:
//for
this.state = 24;
step26 = 1;
limit26 = (int) (70);
_i = (int) (1) ;
this.state = 32;
if (true) break;

case 32:
//C
this.state = 24;
if ((step26 > 0 && _i <= limit26) || (step26 < 0 && _i >= limit26)) this.state = 13;
if (true) break;

case 33:
//C
this.state = 32;
_i = ((int)(0 + _i + step26)) ;
if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=3276830;
 //BA.debugLineNum = 3276830;BA.debugLine="Dim rs As ResumableSub = GetCommandStatus(resp";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcommandstatus(parent._response);
RDebugUtils.currentLine=3276831;
 //BA.debugLineNum = 3276831;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btnsideyardnewclip_click"), _rs);
this.state = 34;
return;
case 34:
//C
this.state = 14;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3276832;
 //BA.debugLineNum = 3276832;BA.debugLine="If commandComplete Then";
if (true) break;

case 14:
//if
this.state = 23;
if (parent._commandcomplete) { 
this.state = 16;
}else {
this.state = 22;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=3276833;
 //BA.debugLineNum = 3276833;BA.debugLine="For i = 3 To 1 Step -1";
if (true) break;

case 17:
//for
this.state = 20;
step30 = -1;
limit30 = (int) (1);
_i = (int) (3) ;
this.state = 35;
if (true) break;

case 35:
//C
this.state = 20;
if ((step30 > 0 && _i <= limit30) || (step30 < 0 && _i >= limit30)) this.state = 19;
if (true) break;

case 36:
//C
this.state = 35;
_i = ((int)(0 + _i + step30)) ;
if (true) break;

case 19:
//C
this.state = 36;
RDebugUtils.currentLine=3276834;
 //BA.debugLineNum = 3276834;BA.debugLine="lblStatus.Text = \"New Side Yard video clip w";
parent._lblstatus.setText("New Side Yard video clip will be shown in "+BA.NumberToString(_i)+" seconds...");
RDebugUtils.currentLine=3276835;
 //BA.debugLineNum = 3276835;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btnsideyardnewclip_click"),(int) (1000));
this.state = 37;
return;
case 37:
//C
this.state = 36;
;
 if (true) break;
if (true) break;

case 20:
//C
this.state = 23;
;
RDebugUtils.currentLine=3276837;
 //BA.debugLineNum = 3276837;BA.debugLine="btnActivity_Click";
_btnactivity_click();
RDebugUtils.currentLine=3276838;
 //BA.debugLineNum = 3276838;BA.debugLine="Exit";
this.state = 24;
if (true) break;
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=3276840;
 //BA.debugLineNum = 3276840;BA.debugLine="lblStatus.Text = \"Awaiting for the Side Yard";
parent._lblstatus.setText("Awaiting for the Side Yard video clip... "+BA.NumberToString(_i)+"/70");
 if (true) break;

case 23:
//C
this.state = 33;
;
RDebugUtils.currentLine=3276842;
 //BA.debugLineNum = 3276842;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
RDebugUtils.currentLine=3276843;
 //BA.debugLineNum = 3276843;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btnsideyardnewclip_click"), _rs);
this.state = 38;
return;
case 38:
//C
this.state = 33;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3276844;
 //BA.debugLineNum = 3276844;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btnsideyardnewclip_click"),(int) (1000));
this.state = 39;
return;
case 39:
//C
this.state = 33;
;
 if (true) break;
if (true) break;

case 24:
//C
this.state = 27;
;
 if (true) break;

case 26:
//C
this.state = 27;
this.catchState = 0;
RDebugUtils.currentLine=3276847;
 //BA.debugLineNum = 3276847;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 0;
;
RDebugUtils.currentLine=3276849;
 //BA.debugLineNum = 3276849;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3276850;
 //BA.debugLineNum = 3276850;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3276851;
 //BA.debugLineNum = 3276851;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3276852;
 //BA.debugLineNum = 3276852;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3276853;
 //BA.debugLineNum = 3276853;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3276854;
 //BA.debugLineNum = 3276854;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3276855;
 //BA.debugLineNum = 3276855;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
 if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=3276857;
 //BA.debugLineNum = 3276857;BA.debugLine="End Sub";
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
public static void  _btnsideyardrefresh_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnsideyardrefresh_click", false))
	 {Debug.delegate(ba, "btnsideyardrefresh_click", null); return;}
ResumableSub_btnSideYardRefresh_Click rsub = new ResumableSub_btnSideYardRefresh_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSideYardRefresh_Click extends BA.ResumableSub {
public ResumableSub_btnSideYardRefresh_Click(cloyd.blink.main parent) {
this.parent = parent;
}
cloyd.blink.main parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
Object _result = null;

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
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Dim rs As ResumableSub = RefreshCameras(False, \"4";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _refreshcameras(anywheresoftware.b4a.keywords.Common.False,"458236");
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btnsideyardrefresh_click"), _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
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
 //BA.debugLineNum = 1114128;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=1114130;
 //BA.debugLineNum = 1114130;BA.debugLine="End Sub";
return "";
}
public static String  _close_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "close_entered_event", false))
	 {return ((String) Debug.delegate(ba, "close_entered_event", new Object[] {_e}));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Private Sub Close_Entered_Event(e As Event)";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Try";
try {RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
_ivclose.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btCloseEnt.png").getObject()));
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
public static String  _close_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "close_exited_event", false))
	 {return ((String) Debug.delegate(ba, "close_exited_event", new Object[] {_e}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Private Sub Close_Exited_Event(e As Event)";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Try";
try {RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
_ivclose.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btClose.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="End Sub";
return "";
}
public static String  _clvdriveway_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "clvdriveway_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvdriveway_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub clvDriveway_ItemClick (Index As Int, Value As";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Try";
try {RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="clvDriveway.JumpToItem(Index)";
_clvdriveway._jumptoitem(_index);
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
_clvfrontdoor._jumptoitem(_index);
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="clvSideYard.JumpToItem(Index)";
_clvsideyard._jumptoitem(_index);
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=2228232;
 //BA.debugLineNum = 2228232;BA.debugLine="End Sub";
return "";
}
public static String  _clvfrontdoor_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "clvfrontdoor_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvfrontdoor_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub clvFrontDoor_ItemClick (Index As Int, Value As";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Try";
try {RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="clvDriveway.JumpToItem(Index)";
_clvdriveway._jumptoitem(_index);
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
_clvfrontdoor._jumptoitem(_index);
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="clvSideYard.JumpToItem(Index)";
_clvsideyard._jumptoitem(_index);
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="End Sub";
return "";
}
public static String  _clvsideyard_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "clvsideyard_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvsideyard_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub clvSideYard_ItemClick (Index As Int, Value As";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Try";
try {RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="clvDriveway.JumpToItem(Index)";
_clvdriveway._jumptoitem(_index);
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
_clvfrontdoor._jumptoitem(_index);
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="clvSideYard.JumpToItem(Index)";
_clvsideyard._jumptoitem(_index);
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub ConvertDateTime(inputTime As String) As String";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="Dim timestampProcessed As String";
_timestampprocessed = "";
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="timestampProcessed =  ConvertFullDateTime(inputTi";
_timestampprocessed = _convertfulldatetime(_inputtime);
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = _parseutcstring(_inputtime.replace("+00:00","+0000"));
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a");
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="Dim p As Period = DateUtils.PeriodBetween(lngTick";
_p = _dateutils._periodbetween(_lngticks,anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=2883594;
 //BA.debugLineNum = 2883594;BA.debugLine="If timestampProcessed.Contains(\"Yesterday\") Or ti";
if (_timestampprocessed.contains("Yesterday") || _timestampprocessed.contains("Today")) { 
RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="If p.Days = 0 Then";
if (_p.Days==0) { 
RDebugUtils.currentLine=2883596;
 //BA.debugLineNum = 2883596;BA.debugLine="If p.Hours = 0 Then";
if (_p.Hours==0) { 
RDebugUtils.currentLine=2883597;
 //BA.debugLineNum = 2883597;BA.debugLine="If p.Minutes = 0 Then";
if (_p.Minutes==0) { 
RDebugUtils.currentLine=2883598;
 //BA.debugLineNum = 2883598;BA.debugLine="Return timestampProcessed & \" (\" & p.Seconds";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Seconds)+"s ago)";
 }else {
RDebugUtils.currentLine=2883600;
 //BA.debugLineNum = 2883600;BA.debugLine="Return timestampProcessed & \" (\" & p.Minutes";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago)";
 };
 }else {
RDebugUtils.currentLine=2883603;
 //BA.debugLineNum = 2883603;BA.debugLine="Return timestampProcessed & \" (\" & p.Hours & \"";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago)";
 };
 }else 
{RDebugUtils.currentLine=2883605;
 //BA.debugLineNum = 2883605;BA.debugLine="else If p.Hours = 0 Then";
if (_p.Hours==0) { 
RDebugUtils.currentLine=2883606;
 //BA.debugLineNum = 2883606;BA.debugLine="If p.Minutes = 0 Then";
if (_p.Minutes==0) { 
RDebugUtils.currentLine=2883607;
 //BA.debugLineNum = 2883607;BA.debugLine="Return timestampProcessed & \" (\" & p.Seconds &";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Seconds)+"s ago)";
 }else {
RDebugUtils.currentLine=2883609;
 //BA.debugLineNum = 2883609;BA.debugLine="Return timestampProcessed & \" (\" & p.Minutes &";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago)";
 };
 }else 
{RDebugUtils.currentLine=2883611;
 //BA.debugLineNum = 2883611;BA.debugLine="else If p.Minutes = 0 Then";
if (_p.Minutes==0) { 
RDebugUtils.currentLine=2883612;
 //BA.debugLineNum = 2883612;BA.debugLine="Return timestampProcessed & \" (\" & p.Seconds &";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Seconds)+"s ago)";
 }else {
RDebugUtils.currentLine=2883614;
 //BA.debugLineNum = 2883614;BA.debugLine="Return timestampProcessed & \" (\" & p.Days & \"d";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Days)+"d "+BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago)";
 }}}
;
 }else {
RDebugUtils.currentLine=2883617;
 //BA.debugLineNum = 2883617;BA.debugLine="Return timestampProcessed & \" (\" & p.Days & \"d \"";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Days)+"d "+BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago)";
 };
RDebugUtils.currentLine=2883620;
 //BA.debugLineNum = 2883620;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub ConvertFullDateTime(inputTime As String) As St";
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = _parseutcstring(_inputtime.replace("+00:00","+0000"));
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a");
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="Dim Yesterday As Long";
_yesterday = 0L;
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="Dim timestamp As Long";
_timestamp = 0L;
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyyMMdd");
RDebugUtils.currentLine=2949129;
 //BA.debugLineNum = 2949129;BA.debugLine="Yesterday = DateTime.Date(DateTime.add(DateTime.N";
_yesterday = (long)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.Add(anywheresoftware.b4a.keywords.Common.DateTime.getNow(),(int) (0),(int) (0),(int) (-1)))));
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="timestamp = DateTime.Date(lngTicks)";
_timestamp = (long)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.DateTime.Date(_lngticks)));
RDebugUtils.currentLine=2949132;
 //BA.debugLineNum = 2949132;BA.debugLine="DateTime.DateFormat = \"h:mm:ss a\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("h:mm:ss a");
RDebugUtils.currentLine=2949133;
 //BA.debugLineNum = 2949133;BA.debugLine="If DateUtils.IsSameDay(lngTicks,DateTime.now) The";
if (_dateutils._issameday(_lngticks,anywheresoftware.b4a.keywords.Common.DateTime.getNow())) { 
RDebugUtils.currentLine=2949134;
 //BA.debugLineNum = 2949134;BA.debugLine="Return \"Today \" & DateTime.Date(lngTicks)";
if (true) return "Today "+anywheresoftware.b4a.keywords.Common.DateTime.Date(_lngticks);
 }else 
{RDebugUtils.currentLine=2949135;
 //BA.debugLineNum = 2949135;BA.debugLine="Else If Yesterday = timestamp Then";
if (_yesterday==_timestamp) { 
RDebugUtils.currentLine=2949136;
 //BA.debugLineNum = 2949136;BA.debugLine="Return \"Yesterday \" & DateTime.Date(lngTicks)";
if (true) return "Yesterday "+anywheresoftware.b4a.keywords.Common.DateTime.Date(_lngticks);
 }else {
RDebugUtils.currentLine=2949138;
 //BA.debugLineNum = 2949138;BA.debugLine="Return DateUtils.GetDayOfWeekName(lngTicks) & \"";
if (true) return _dateutils._getdayofweekname(_lngticks)+" "+anywheresoftware.b4a.keywords.Common.DateTime.Date(_lngticks);
 }}
;
RDebugUtils.currentLine=2949140;
 //BA.debugLineNum = 2949140;BA.debugLine="End Sub";
return "";
}
public static long  _parseutcstring(String _utc) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "parseutcstring", false))
	 {return ((Long) Debug.delegate(ba, "parseutcstring", new Object[] {_utc}));}
String _df = "";
long _res = 0L;
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub ParseUTCstring(utc As String) As Long";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Dim df As String = DateTime.DateFormat";
_df = anywheresoftware.b4a.keywords.Common.DateTime.getDateFormat();
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="Dim res As Long";
_res = 0L;
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="If utc.CharAt(10) = \"T\" Then";
if (_utc.charAt((int) (10))==BA.ObjectToChar("T")) { 
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="If utc.CharAt(19) = \".\" Then utc = utc.SubString";
if (_utc.charAt((int) (19))==BA.ObjectToChar(".")) { 
_utc = _utc.substring((int) (0),(int) (19))+"+0000";};
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd'T'HH:mm:ssZ\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
 }else {
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="DateTime.DateFormat = \"EEE MMM dd HH:mm:ss Z yyy";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("EEE MMM dd HH:mm:ss Z yyyy");
 };
RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="Try";
try {RDebugUtils.currentLine=3014668;
 //BA.debugLineNum = 3014668;BA.debugLine="res = DateTime.DateParse(utc)";
_res = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_utc);
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=3014670;
 //BA.debugLineNum = 3014670;BA.debugLine="res = 0";
_res = (long) (0);
 };
RDebugUtils.currentLine=3014672;
 //BA.debugLineNum = 3014672;BA.debugLine="DateTime.DateFormat = df";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(_df);
RDebugUtils.currentLine=3014673;
 //BA.debugLineNum = 3014673;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=3014674;
 //BA.debugLineNum = 3014674;BA.debugLine="End Sub";
return 0L;
}
public static String  _convertdatetimeplain(String _inputtime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "convertdatetimeplain", false))
	 {return ((String) Debug.delegate(ba, "convertdatetimeplain", new Object[] {_inputtime}));}
long _ticks = 0L;
long _lngticks = 0L;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub ConvertDateTimePlain(inputTime As String) As S";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = _parseutcstring(_inputtime.replace("+00:00","+0000"));
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a");
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="Return DateTime.Date(lngTicks)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(_lngticks);
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _downloadimage(String _link,anywheresoftware.b4j.objects.ImageViewWrapper _iv,String _camera) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "downloadimage", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "downloadimage", new Object[] {_link,_iv,_camera}));}
ResumableSub_DownloadImage rsub = new ResumableSub_DownloadImage(null,_link,_iv,_camera);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
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
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Try";
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
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="response = \"\"";
parent._response = "";
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",main.getObject());
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="j.Download(Link)";
_j._download /*String*/ (null,_link);
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("TOKEN_AUTH",parent._authtoken);
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "downloadimage"), (Object)(_j));
this.state = 21;
return;
case 21:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[0];
;
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 7:
//if
this.state = 14;
if ((_camera).equals("347574")) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="Else If camera = \"236967\" Then";
if ((_camera).equals("236967")) { 
this.state = 11;
}else 
{RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="Else If camera = \"458236\" Then";
if ((_camera).equals("458236")) { 
this.state = 13;
}}}
if (true) break;

case 9:
//C
this.state = 14;
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Driveway.jpg",anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"FrontDoor.jpg",anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=589839;
 //BA.debugLineNum = 589839;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"SideYard.jpg",anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 14:
//C
this.state = 17;
;
RDebugUtils.currentLine=589841;
 //BA.debugLineNum = 589841;BA.debugLine="File.Copy2(j.GetInputStream, out)";
anywheresoftware.b4a.keywords.Common.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=589842;
 //BA.debugLineNum = 589842;BA.debugLine="out.Close '<------ very important";
_out.Close();
RDebugUtils.currentLine=589845;
 //BA.debugLineNum = 589845;BA.debugLine="iv.SetImage(j.GetBitmap)";
_iv.SetImage((javafx.scene.image.Image)(_j._getbitmap /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ (null).getObject()));
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=589847;
 //BA.debugLineNum = 589847;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
parent._response = "ERROR: "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=589848;
 //BA.debugLineNum = 589848;BA.debugLine="lblStatus.Text = GetRESTError(j.ErrorMessage)";
parent._lblstatus.setText(_getresterror(_j._errormessage /*String*/ ));
 if (true) break;

case 17:
//C
this.state = 20;
;
RDebugUtils.currentLine=589850;
 //BA.debugLineNum = 589850;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
RDebugUtils.currentLine=589852;
 //BA.debugLineNum = 589852;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 20:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=589854;
 //BA.debugLineNum = 589854;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
RDebugUtils.currentLine=589855;
 //BA.debugLineNum = 589855;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub GetRESTError(json As String) As String";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Try";
try {RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="If json.Contains(\"<h1>Not Found</h1>\") Then";
if (_json.contains("<h1>Not Found</h1>")) { 
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="Return \"REST endpoint URL not found. Try again.";
if (true) return "REST endpoint URL not found. Try again.";
 }else {
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="If json.IndexOf(\"{\") <> -1 Then";
if (_json.indexOf("{")!=-1) { 
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="json = json.SubString(json.IndexOf(\"{\"))";
_json = _json.substring(_json.indexOf("{"));
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=851980;
 //BA.debugLineNum = 851980;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="Dim code As Int = root.Get(\"code\")";
_code = (int)(BA.ObjectToNumber(_root.Get((Object)("code"))));
RDebugUtils.currentLine=851982;
 //BA.debugLineNum = 851982;BA.debugLine="Dim message As String = root.Get(\"message\")";
_message = BA.ObjectToString(_root.Get((Object)("message")));
RDebugUtils.currentLine=851983;
 //BA.debugLineNum = 851983;BA.debugLine="Log(\"Code: \" & code & \" Message: \" & message)";
anywheresoftware.b4a.keywords.Common.Log("Code: "+BA.NumberToString(_code)+" Message: "+_message);
RDebugUtils.currentLine=851984;
 //BA.debugLineNum = 851984;BA.debugLine="Return \"Code: \" & code & \" Message: \" & messag";
if (true) return "Code: "+BA.NumberToString(_code)+" Message: "+_message;
 }else {
RDebugUtils.currentLine=851986;
 //BA.debugLineNum = 851986;BA.debugLine="Return json";
if (true) return _json;
 };
 };
 } 
       catch (Exception e19) {
			ba.setLastException(e19);RDebugUtils.currentLine=851990;
 //BA.debugLineNum = 851990;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=851991;
 //BA.debugLineNum = 851991;BA.debugLine="Return json";
if (true) return _json;
 };
RDebugUtils.currentLine=851993;
 //BA.debugLineNum = 851993;BA.debugLine="End Sub";
return "";
}
public static String  _getauthinfo(String _json) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getauthinfo", false))
	 {return ((String) Debug.delegate(ba, "getauthinfo", new Object[] {_json}));}
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
String _force_password_reset = "";
int _lockout_time_remaining = 0;
anywheresoftware.b4a.objects.collections.Map _authtokenmap = null;
String _message = "";
anywheresoftware.b4a.objects.collections.Map _client = null;
int _allow_pin_resend_seconds = 0;
anywheresoftware.b4a.objects.collections.Map _region = null;
String _code = "";
String _description = "";
anywheresoftware.b4a.objects.collections.Map _account = null;
String _verification_required = "";
int _id = 0;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub GetAuthInfo(json As String)";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Try";
try {RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="lblStatus.Text = \"Getting authtoken...\"";
_lblstatus.setText("Getting authtoken...");
RDebugUtils.currentLine=655378;
 //BA.debugLineNum = 655378;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=655379;
 //BA.debugLineNum = 655379;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=655380;
 //BA.debugLineNum = 655380;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=655381;
 //BA.debugLineNum = 655381;BA.debugLine="Dim force_password_reset As String = root.Get(\"f";
_force_password_reset = BA.ObjectToString(_root.Get((Object)("force_password_reset")));
RDebugUtils.currentLine=655382;
 //BA.debugLineNum = 655382;BA.debugLine="Dim lockout_time_remaining As Int = root.Get(\"lo";
_lockout_time_remaining = (int)(BA.ObjectToNumber(_root.Get((Object)("lockout_time_remaining"))));
RDebugUtils.currentLine=655383;
 //BA.debugLineNum = 655383;BA.debugLine="Dim authtokenmap As Map = root.Get(\"authtoken\")";
_authtokenmap = new anywheresoftware.b4a.objects.collections.Map();
_authtokenmap = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("authtoken"))));
RDebugUtils.currentLine=655384;
 //BA.debugLineNum = 655384;BA.debugLine="authToken = authtokenmap.Get(\"authtoken\")";
_authtoken = BA.ObjectToString(_authtokenmap.Get((Object)("authtoken")));
RDebugUtils.currentLine=655385;
 //BA.debugLineNum = 655385;BA.debugLine="Dim message As String = authtokenmap.Get(\"messag";
_message = BA.ObjectToString(_authtokenmap.Get((Object)("message")));
RDebugUtils.currentLine=655386;
 //BA.debugLineNum = 655386;BA.debugLine="Dim client As Map = root.Get(\"client\")";
_client = new anywheresoftware.b4a.objects.collections.Map();
_client = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("client"))));
RDebugUtils.currentLine=655387;
 //BA.debugLineNum = 655387;BA.debugLine="TwoClientFAVerificationRequired = client.Get(\"ve";
_twoclientfaverificationrequired = BA.ObjectToString(_client.Get((Object)("verification_required")));
RDebugUtils.currentLine=655388;
 //BA.debugLineNum = 655388;BA.debugLine="TwoFAClientID = client.Get(\"id\")";
_twofaclientid = BA.ObjectToString(_client.Get((Object)("id")));
RDebugUtils.currentLine=655389;
 //BA.debugLineNum = 655389;BA.debugLine="Dim allow_pin_resend_seconds As Int = root.Get(\"";
_allow_pin_resend_seconds = (int)(BA.ObjectToNumber(_root.Get((Object)("allow_pin_resend_seconds"))));
RDebugUtils.currentLine=655390;
 //BA.debugLineNum = 655390;BA.debugLine="Dim region As Map = root.Get(\"region\")";
_region = new anywheresoftware.b4a.objects.collections.Map();
_region = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("region"))));
RDebugUtils.currentLine=655391;
 //BA.debugLineNum = 655391;BA.debugLine="Dim code As String = region.Get(\"code\") 'ignore";
_code = BA.ObjectToString(_region.Get((Object)("code")));
RDebugUtils.currentLine=655392;
 //BA.debugLineNum = 655392;BA.debugLine="userRegion = region.Get(\"tier\")";
_userregion = BA.ObjectToString(_region.Get((Object)("tier")));
RDebugUtils.currentLine=655393;
 //BA.debugLineNum = 655393;BA.debugLine="Dim description As String = region.Get(\"descript";
_description = BA.ObjectToString(_region.Get((Object)("description")));
RDebugUtils.currentLine=655394;
 //BA.debugLineNum = 655394;BA.debugLine="Dim account As Map = root.Get(\"account\")";
_account = new anywheresoftware.b4a.objects.collections.Map();
_account = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("account"))));
RDebugUtils.currentLine=655395;
 //BA.debugLineNum = 655395;BA.debugLine="Dim verification_required As String = account.Ge";
_verification_required = BA.ObjectToString(_account.Get((Object)("verification_required")));
RDebugUtils.currentLine=655396;
 //BA.debugLineNum = 655396;BA.debugLine="Dim id As Int = account.Get(\"id\") 'ignore";
_id = (int)(BA.ObjectToNumber(_account.Get((Object)("id"))));
 } 
       catch (Exception e23) {
			ba.setLastException(e23);RDebugUtils.currentLine=655398;
 //BA.debugLineNum = 655398;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=655401;
 //BA.debugLineNum = 655401;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getcamerainfo(String _json,b4j.example.customlistview _clv) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getcamerainfo", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "getcamerainfo", new Object[] {_json,_clv}));}
ResumableSub_GetCameraInfo rsub = new ResumableSub_GetCameraInfo(null,_json,_clv);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetCameraInfo extends BA.ResumableSub {
public ResumableSub_GetCameraInfo(cloyd.blink.main parent,String _json,b4j.example.customlistview _clv) {
this.parent = parent;
this._json = _json;
this._clv = _clv;
}
cloyd.blink.main parent;
String _json;
b4j.example.customlistview _clv;
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
int step115;
int limit115;

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
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 29;
this.catchState = 28;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 28;
RDebugUtils.currentLine=917506;
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
_camera_status = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("camera_status"))));
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
parent._camerathumbnail = BA.ObjectToString(_camera_status.Get((Object)("thumbnail")));
RDebugUtils.currentLine=917533;
 //BA.debugLineNum = 917533;BA.debugLine="Dim lifetime_duration As Int = camera_status.Get";
_lifetime_duration = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lifetime_duration"))));
RDebugUtils.currentLine=917534;
 //BA.debugLineNum = 917534;BA.debugLine="Dim wifi_connect_failure_count As Int = camera_s";
_wifi_connect_failure_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("wifi_connect_failure_count"))));
RDebugUtils.currentLine=917535;
 //BA.debugLineNum = 917535;BA.debugLine="Dim camera_id As Int = camera_status.Get(\"camera";
_camera_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("camera_id"))));
RDebugUtils.currentLine=917536;
 //BA.debugLineNum = 917536;BA.debugLine="Dim battery_alert_status As String = camera_stat";
_battery_alert_status = BA.ObjectToString(_camera_status.Get((Object)("battery_alert_status")));
RDebugUtils.currentLine=917537;
 //BA.debugLineNum = 917537;BA.debugLine="Dim dhcp_failure_count As Int = camera_status.Ge";
_dhcp_failure_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dhcp_failure_count"))));
RDebugUtils.currentLine=917538;
 //BA.debugLineNum = 917538;BA.debugLine="Dim ip_address As String = camera_status.Get(\"ip";
_ip_address = BA.ObjectToString(_camera_status.Get((Object)("ip_address")));
RDebugUtils.currentLine=917539;
 //BA.debugLineNum = 917539;BA.debugLine="Dim ipv As String = camera_status.Get(\"ipv\")";
_ipv = BA.ObjectToString(_camera_status.Get((Object)("ipv")));
RDebugUtils.currentLine=917540;
 //BA.debugLineNum = 917540;BA.debugLine="Dim light_sensor_data_new As String = camera_sta";
_light_sensor_data_new = BA.ObjectToString(_camera_status.Get((Object)("light_sensor_data_new")));
RDebugUtils.currentLine=917541;
 //BA.debugLineNum = 917541;BA.debugLine="Dim network_id As Int = camera_status.Get(\"netwo";
_network_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("network_id"))));
RDebugUtils.currentLine=917542;
 //BA.debugLineNum = 917542;BA.debugLine="Dim account_id As Int = camera_status.Get(\"accou";
_account_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("account_id"))));
RDebugUtils.currentLine=917543;
 //BA.debugLineNum = 917543;BA.debugLine="Dim serial As String = camera_status.Get(\"serial";
_serial = BA.ObjectToString(_camera_status.Get((Object)("serial")));
RDebugUtils.currentLine=917544;
 //BA.debugLineNum = 917544;BA.debugLine="Dim dev_1 As Int = camera_status.Get(\"dev_1\")";
_dev_1 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dev_1"))));
RDebugUtils.currentLine=917545;
 //BA.debugLineNum = 917545;BA.debugLine="Dim time_wlan_connect As Int = camera_status.Get";
_time_wlan_connect = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_wlan_connect"))));
RDebugUtils.currentLine=917546;
 //BA.debugLineNum = 917546;BA.debugLine="Dim dev_2 As Int = camera_status.Get(\"dev_2\")";
_dev_2 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dev_2"))));
RDebugUtils.currentLine=917547;
 //BA.debugLineNum = 917547;BA.debugLine="Dim socket_failure_count As Int = camera_status.";
_socket_failure_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("socket_failure_count"))));
RDebugUtils.currentLine=917548;
 //BA.debugLineNum = 917548;BA.debugLine="Dim dev_3 As Int = camera_status.Get(\"dev_3\")";
_dev_3 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dev_3"))));
RDebugUtils.currentLine=917549;
 //BA.debugLineNum = 917549;BA.debugLine="Dim pir_rejections As Int = camera_status.Get(\"p";
_pir_rejections = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("pir_rejections"))));
RDebugUtils.currentLine=917550;
 //BA.debugLineNum = 917550;BA.debugLine="Dim sync_module_id As Int = camera_status.Get(\"s";
_sync_module_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("sync_module_id"))));
RDebugUtils.currentLine=917551;
 //BA.debugLineNum = 917551;BA.debugLine="Dim lifetime_count As Int = camera_status.Get(\"l";
_lifetime_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lifetime_count"))));
RDebugUtils.currentLine=917552;
 //BA.debugLineNum = 917552;BA.debugLine="Dim error_codes As Int = camera_status.Get(\"erro";
_error_codes = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("error_codes"))));
RDebugUtils.currentLine=917553;
 //BA.debugLineNum = 917553;BA.debugLine="Dim fw_version As String = camera_status.Get(\"fw";
_fw_version = BA.ObjectToString(_camera_status.Get((Object)("fw_version")));
RDebugUtils.currentLine=917554;
 //BA.debugLineNum = 917554;BA.debugLine="Dim ac_power As String = camera_status.Get(\"ac_p";
_ac_power = BA.ObjectToString(_camera_status.Get((Object)("ac_power")));
RDebugUtils.currentLine=917556;
 //BA.debugLineNum = 917556;BA.debugLine="If clv = Null Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_clv== null) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=917557;
 //BA.debugLineNum = 917557;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=917559;
 //BA.debugLineNum = 917559;BA.debugLine="clv.Clear";
_clv._clear();
RDebugUtils.currentLine=917560;
 //BA.debugLineNum = 917560;BA.debugLine="clv.AddTextItem(\"Battery voltage: \" & NumberForm";
_clv._addtextitem((Object)("Battery voltage: "+anywheresoftware.b4a.keywords.Common.NumberFormat((_battery_voltage/(double)100),(int) (0),(int) (2))+"V"),(Object)("battery_voltage"));
RDebugUtils.currentLine=917561;
 //BA.debugLineNum = 917561;BA.debugLine="clv.AddTextItem(\"Camera to WiFi strength: \" & wi";
_clv._addtextitem((Object)("Camera to WiFi strength: "+BA.NumberToString(_wifi_strength)+" dBm - "+_checklfrlevel(_wifi_strength)),(Object)("wifi_strength"));
RDebugUtils.currentLine=917562;
 //BA.debugLineNum = 917562;BA.debugLine="clv.AddTextItem(\"Camera to Sync Module strength";
_clv._addtextitem((Object)("Camera to Sync Module strength (LFR): "+BA.NumberToString(_lfr_strength)+" dBm - "+_checklfrlevel(_lfr_strength)),(Object)("lfr_strength"));
RDebugUtils.currentLine=917563;
 //BA.debugLineNum = 917563;BA.debugLine="clv.AddTextItem(\"Temperature: \" & temperature &";
_clv._addtextitem((Object)("Temperature: "+BA.NumberToString(_temperature)+"ºF"),(Object)("temperature"));
RDebugUtils.currentLine=917564;
 //BA.debugLineNum = 917564;BA.debugLine="clv.AddTextItem(\"Firmware version: \" & fw_versio";
_clv._addtextitem((Object)("Firmware version: "+_fw_version),(Object)("fw_version"));
RDebugUtils.currentLine=917565;
 //BA.debugLineNum = 917565;BA.debugLine="clv.AddTextItem(\"Firmware Git Hash: \" & fw_git_h";
_clv._addtextitem((Object)("Firmware Git Hash: "+_fw_git_hash),(Object)("fw_git_hash"));
RDebugUtils.currentLine=917566;
 //BA.debugLineNum = 917566;BA.debugLine="clv.AddTextItem(\"Battery alert status: \" & batte";
_clv._addtextitem((Object)("Battery alert status: "+_battery_alert_status),(Object)("battery_alert_status"));
RDebugUtils.currentLine=917567;
 //BA.debugLineNum = 917567;BA.debugLine="clv.AddTextItem(\"Temperature alert status: \" & t";
_clv._addtextitem((Object)("Temperature alert status: "+_temp_alert_status),(Object)("temp_alert_status"));
RDebugUtils.currentLine=917568;
 //BA.debugLineNum = 917568;BA.debugLine="clv.AddTextItem(\"Updated at: \" & ConvertDateTime";
_clv._addtextitem((Object)("Updated at: "+_convertdatetimeplain(_updated_at)),(Object)("updated_at"));
RDebugUtils.currentLine=917569;
 //BA.debugLineNum = 917569;BA.debugLine="clv.AddTextItem(\"Created at: \" & ConvertDateTime";
_clv._addtextitem((Object)("Created at: "+_convertdatetimeplain(_created_at)),(Object)("created_at"));
RDebugUtils.currentLine=917570;
 //BA.debugLineNum = 917570;BA.debugLine="clv.AddTextItem(\"IP address: \" & ip_address, \"ip";
_clv._addtextitem((Object)("IP address: "+_ip_address),(Object)("ip_address"));
RDebugUtils.currentLine=917571;
 //BA.debugLineNum = 917571;BA.debugLine="clv.AddTextItem(\"MAC address: \" & mac, \"mac\")";
_clv._addtextitem((Object)("MAC address: "+_mac),(Object)("mac"));
RDebugUtils.currentLine=917572;
 //BA.debugLineNum = 917572;BA.debugLine="clv.AddTextItem(\"Camera ID: \" & camera_id, \"came";
_clv._addtextitem((Object)("Camera ID: "+BA.NumberToString(_camera_id)),(Object)("camera_id"));
RDebugUtils.currentLine=917573;
 //BA.debugLineNum = 917573;BA.debugLine="clv.AddTextItem(\"Serial: \" & serial, \"serial\")";
_clv._addtextitem((Object)("Serial: "+_serial),(Object)("serial"));
RDebugUtils.currentLine=917574;
 //BA.debugLineNum = 917574;BA.debugLine="clv.AddTextItem(\"Network ID: \" & network_id, \"ne";
_clv._addtextitem((Object)("Network ID: "+BA.NumberToString(_network_id)),(Object)("network_id"));
RDebugUtils.currentLine=917575;
 //BA.debugLineNum = 917575;BA.debugLine="clv.AddTextItem(\"Account ID: \" & account_id, \"ac";
_clv._addtextitem((Object)("Account ID: "+BA.NumberToString(_account_id)),(Object)("account_id"));
RDebugUtils.currentLine=917576;
 //BA.debugLineNum = 917576;BA.debugLine="clv.AddTextItem(\"ID: \" & id, \"id\")";
_clv._addtextitem((Object)("ID: "+BA.NumberToString(_id)),(Object)("id"));
RDebugUtils.currentLine=917577;
 //BA.debugLineNum = 917577;BA.debugLine="clv.AddTextItem(\"Sync Module ID: \" & sync_module";
_clv._addtextitem((Object)("Sync Module ID: "+BA.NumberToString(_sync_module_id)),(Object)("sync_module_id"));
RDebugUtils.currentLine=917578;
 //BA.debugLineNum = 917578;BA.debugLine="clv.AddTextItem(\"Light sensor data valid: \" & li";
_clv._addtextitem((Object)("Light sensor data valid: "+_light_sensor_data_valid),(Object)("light_sensor_data_valid"));
RDebugUtils.currentLine=917579;
 //BA.debugLineNum = 917579;BA.debugLine="clv.AddTextItem(\"DHCP failure count: \" & dhcp_fa";
_clv._addtextitem((Object)("DHCP failure count: "+BA.NumberToString(_dhcp_failure_count)),(Object)("dhcp_failure_count"));
RDebugUtils.currentLine=917580;
 //BA.debugLineNum = 917580;BA.debugLine="clv.AddTextItem(\"LFR tb wakeups: \" & lfr_tb_wake";
_clv._addtextitem((Object)("LFR tb wakeups: "+BA.NumberToString(_lfr_tb_wakeups)),(Object)("lfr_tb_wakeups"));
RDebugUtils.currentLine=917581;
 //BA.debugLineNum = 917581;BA.debugLine="clv.AddTextItem(\"Socket failure count: \" & socke";
_clv._addtextitem((Object)("Socket failure count: "+BA.NumberToString(_socket_failure_count)),(Object)("socket_failure_count"));
RDebugUtils.currentLine=917582;
 //BA.debugLineNum = 917582;BA.debugLine="clv.AddTextItem(\"Camera thumbnail: \" & cameraThu";
_clv._addtextitem((Object)("Camera thumbnail: "+parent._camerathumbnail),(Object)("thumbnail"));
RDebugUtils.currentLine=917583;
 //BA.debugLineNum = 917583;BA.debugLine="clv.AddTextItem(\"WiFi connect failure count: \" &";
_clv._addtextitem((Object)("WiFi connect failure count: "+BA.NumberToString(_wifi_connect_failure_count)),(Object)("wifi_connect_failure_count"));
RDebugUtils.currentLine=917584;
 //BA.debugLineNum = 917584;BA.debugLine="clv.AddTextItem(\"Error codes: \" & error_codes, \"";
_clv._addtextitem((Object)("Error codes: "+BA.NumberToString(_error_codes)),(Object)("error_codes"));
RDebugUtils.currentLine=917585;
 //BA.debugLineNum = 917585;BA.debugLine="clv.AddTextItem(\"AC power: \" & ac_power, \"ac_pow";
_clv._addtextitem((Object)("AC power: "+_ac_power),(Object)("ac_power"));
RDebugUtils.currentLine=917586;
 //BA.debugLineNum = 917586;BA.debugLine="clv.AddTextItem(\"Total 108 wakeups: \" & total_10";
_clv._addtextitem((Object)("Total 108 wakeups: "+BA.NumberToString(_total_108_wakeups)),(Object)("total_108_wakeups"));
RDebugUtils.currentLine=917587;
 //BA.debugLineNum = 917587;BA.debugLine="clv.AddTextItem(\"Total Tb wakeups: \" & total_tb_";
_clv._addtextitem((Object)("Total Tb wakeups: "+BA.NumberToString(_total_tb_wakeups)),(Object)("total_tb_wakeups"));
RDebugUtils.currentLine=917588;
 //BA.debugLineNum = 917588;BA.debugLine="clv.AddTextItem(\"Light sensor ch0: \" & light_sen";
_clv._addtextitem((Object)("Light sensor ch0: "+BA.NumberToString(_light_sensor_ch0)),(Object)("light_sensor_ch0"));
RDebugUtils.currentLine=917589;
 //BA.debugLineNum = 917589;BA.debugLine="clv.AddTextItem(\"Unit number: \" & unit_number, \"";
_clv._addtextitem((Object)("Unit number: "+BA.NumberToString(_unit_number)),(Object)("unit_number"));
RDebugUtils.currentLine=917590;
 //BA.debugLineNum = 917590;BA.debugLine="clv.AddTextItem(\"Light sensor ch1: \" & light_sen";
_clv._addtextitem((Object)("Light sensor ch1: "+BA.NumberToString(_light_sensor_ch1)),(Object)("light_sensor_ch1"));
RDebugUtils.currentLine=917591;
 //BA.debugLineNum = 917591;BA.debugLine="clv.AddTextItem(\"Time dhcp lease: \" & time_dhcp_";
_clv._addtextitem((Object)("Time dhcp lease: "+BA.NumberToString(_time_dhcp_lease)),(Object)("time_dhcp_lease"));
RDebugUtils.currentLine=917592;
 //BA.debugLineNum = 917592;BA.debugLine="clv.AddTextItem(\"Time first video: \" & time_firs";
_clv._addtextitem((Object)("Time first video: "+BA.NumberToString(_time_first_video)),(Object)("time_first_video"));
RDebugUtils.currentLine=917593;
 //BA.debugLineNum = 917593;BA.debugLine="clv.AddTextItem(\"Time dns resolve: \" & time_dns_";
_clv._addtextitem((Object)("Time dns resolve: "+BA.NumberToString(_time_dns_resolve)),(Object)("time_dns_resolve"));
RDebugUtils.currentLine=917594;
 //BA.debugLineNum = 917594;BA.debugLine="clv.AddTextItem(\"Time 108 boot: \" & time_108_boo";
_clv._addtextitem((Object)("Time 108 boot: "+BA.NumberToString(_time_108_boot)),(Object)("time_108_boot"));
RDebugUtils.currentLine=917595;
 //BA.debugLineNum = 917595;BA.debugLine="clv.AddTextItem(\"LFR 108 wakeups: \" & lfr_108_wa";
_clv._addtextitem((Object)("LFR 108 wakeups: "+BA.NumberToString(_lfr_108_wakeups)),(Object)("lfr_108_wakeups"));
RDebugUtils.currentLine=917596;
 //BA.debugLineNum = 917596;BA.debugLine="clv.AddTextItem(\"lifetime duration: \" & lifetime";
_clv._addtextitem((Object)("lifetime duration: "+BA.NumberToString(_lifetime_duration)),(Object)("lifetime_duration"));
RDebugUtils.currentLine=917597;
 //BA.debugLineNum = 917597;BA.debugLine="clv.AddTextItem(\"lpv: \" & ipv, \"ipv\")";
_clv._addtextitem((Object)("lpv: "+_ipv),(Object)("ipv"));
RDebugUtils.currentLine=917598;
 //BA.debugLineNum = 917598;BA.debugLine="clv.AddTextItem(\"light sensor data new: \" & ligh";
_clv._addtextitem((Object)("light sensor data new: "+_light_sensor_data_new),(Object)("light_sensor_data_new"));
RDebugUtils.currentLine=917599;
 //BA.debugLineNum = 917599;BA.debugLine="clv.AddTextItem(\"Dev_1: \" & dev_1, \"dev_1\")";
_clv._addtextitem((Object)("Dev_1: "+BA.NumberToString(_dev_1)),(Object)("dev_1"));
RDebugUtils.currentLine=917600;
 //BA.debugLineNum = 917600;BA.debugLine="clv.AddTextItem(\"Dev_2: \" & dev_2, \"dev_2\")";
_clv._addtextitem((Object)("Dev_2: "+BA.NumberToString(_dev_2)),(Object)("dev_2"));
RDebugUtils.currentLine=917601;
 //BA.debugLineNum = 917601;BA.debugLine="clv.AddTextItem(\"Dev_3: \" & dev_3, \"dev_3\")";
_clv._addtextitem((Object)("Dev_3: "+BA.NumberToString(_dev_3)),(Object)("dev_3"));
RDebugUtils.currentLine=917602;
 //BA.debugLineNum = 917602;BA.debugLine="clv.AddTextItem(\"Time wlan connect: \" & time_wla";
_clv._addtextitem((Object)("Time wlan connect: "+BA.NumberToString(_time_wlan_connect)),(Object)("time_wlan_connect"));
RDebugUtils.currentLine=917603;
 //BA.debugLineNum = 917603;BA.debugLine="clv.AddTextItem(\"PIR rejections: \" & pir_rejecti";
_clv._addtextitem((Object)("PIR rejections: "+BA.NumberToString(_pir_rejections)),(Object)("pir_rejections"));
RDebugUtils.currentLine=917604;
 //BA.debugLineNum = 917604;BA.debugLine="clv.AddTextItem(\"Lifetime count: \" & lifetime_co";
_clv._addtextitem((Object)("Lifetime count: "+BA.NumberToString(_lifetime_count)),(Object)("lifetime_count"));
RDebugUtils.currentLine=917606;
 //BA.debugLineNum = 917606;BA.debugLine="Dim strTimestamp As String";
_strtimestamp = "";
RDebugUtils.currentLine=917607;
 //BA.debugLineNum = 917607;BA.debugLine="strTimestamp = ConvertDateTime(updated_at)";
_strtimestamp = _convertdatetime(_updated_at);
RDebugUtils.currentLine=917608;
 //BA.debugLineNum = 917608;BA.debugLine="lblStatus.Text = \"Last updated: \" & strTimestamp";
parent._lblstatus.setText("Last updated: "+_strtimestamp);
RDebugUtils.currentLine=917609;
 //BA.debugLineNum = 917609;BA.debugLine="If clv = clvDriveway Then";
if (true) break;

case 8:
//if
this.state = 15;
if ((_clv).equals(parent._clvdriveway)) { 
this.state = 10;
}else 
{RDebugUtils.currentLine=917612;
 //BA.debugLineNum = 917612;BA.debugLine="Else If clv = clvFrontDoor Then";
if ((_clv).equals(parent._clvfrontdoor)) { 
this.state = 12;
}else 
{RDebugUtils.currentLine=917616;
 //BA.debugLineNum = 917616;BA.debugLine="Else If clv = clvSideYard Then";
if ((_clv).equals(parent._clvsideyard)) { 
this.state = 14;
}}}
if (true) break;

case 10:
//C
this.state = 15;
RDebugUtils.currentLine=917610;
 //BA.debugLineNum = 917610;BA.debugLine="lblDriveway.Text = strTimestamp & \" \" & drivewa";
parent._lbldriveway.setText(_strtimestamp+" "+parent._drivewayarmedstatus);
RDebugUtils.currentLine=917611;
 //BA.debugLineNum = 917611;BA.debugLine="prevDrivewayUpdateTime = updated_at";
parent._prevdrivewayupdatetime = _updated_at;
 if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=917613;
 //BA.debugLineNum = 917613;BA.debugLine="lblFrontDoor.Text = strTimestamp & \" \" & frontd";
parent._lblfrontdoor.setText(_strtimestamp+" "+parent._frontdoorarmedstatus);
RDebugUtils.currentLine=917614;
 //BA.debugLineNum = 917614;BA.debugLine="lblDriveway.Text = ConvertDateTime(prevDriveway";
parent._lbldriveway.setText(_convertdatetime(parent._prevdrivewayupdatetime)+" "+parent._drivewayarmedstatus);
RDebugUtils.currentLine=917615;
 //BA.debugLineNum = 917615;BA.debugLine="prevFrontDoorUpdateTime = updated_at";
parent._prevfrontdoorupdatetime = _updated_at;
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=917617;
 //BA.debugLineNum = 917617;BA.debugLine="lblSideYard.Text = strTimestamp & \" \" & sideyar";
parent._lblsideyard.setText(_strtimestamp+" "+parent._sideyardarmedstatus);
RDebugUtils.currentLine=917618;
 //BA.debugLineNum = 917618;BA.debugLine="lblDriveway.Text = ConvertDateTime(prevDriveway";
parent._lbldriveway.setText(_convertdatetime(parent._prevdrivewayupdatetime)+" "+parent._drivewayarmedstatus);
RDebugUtils.currentLine=917619;
 //BA.debugLineNum = 917619;BA.debugLine="lblFrontDoor.Text = ConvertDateTime(prevFrontDo";
parent._lblfrontdoor.setText(_convertdatetime(parent._prevfrontdoorupdatetime)+" "+parent._frontdoorarmedstatus);
 if (true) break;
;
RDebugUtils.currentLine=917622;
 //BA.debugLineNum = 917622;BA.debugLine="For i = 0 To clv.Size-1";

case 15:
//for
this.state = 26;
step115 = 1;
limit115 = (int) (_clv._getsize()-1);
_i = (int) (0) ;
this.state = 30;
if (true) break;

case 30:
//C
this.state = 26;
if ((step115 > 0 && _i <= limit115) || (step115 < 0 && _i >= limit115)) this.state = 17;
if (true) break;

case 31:
//C
this.state = 30;
_i = ((int)(0 + _i + step115)) ;
if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=917623;
 //BA.debugLineNum = 917623;BA.debugLine="Dim item As String";
_item = "";
RDebugUtils.currentLine=917624;
 //BA.debugLineNum = 917624;BA.debugLine="item = clv.GetValue(i)";
_item = BA.ObjectToString(_clv._getvalue(_i));
RDebugUtils.currentLine=917625;
 //BA.debugLineNum = 917625;BA.debugLine="If item.Contains(\"thumbnail\") Then";
if (true) break;

case 18:
//if
this.state = 25;
if (_item.contains("thumbnail")) { 
this.state = 20;
}else 
{RDebugUtils.currentLine=917627;
 //BA.debugLineNum = 917627;BA.debugLine="Else If item.Contains(\"_strength\") Then";
if (_item.contains("_strength")) { 
this.state = 22;
}else {
this.state = 24;
}}
if (true) break;

case 20:
//C
this.state = 25;
RDebugUtils.currentLine=917626;
 //BA.debugLineNum = 917626;BA.debugLine="clv.ResizeItem(i,80dip)";
_clv._resizeitem(_i,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)));
 if (true) break;

case 22:
//C
this.state = 25;
RDebugUtils.currentLine=917628;
 //BA.debugLineNum = 917628;BA.debugLine="clv.ResizeItem(i,45dip)";
_clv._resizeitem(_i,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (45)));
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=917630;
 //BA.debugLineNum = 917630;BA.debugLine="clv.ResizeItem(i,35dip)";
_clv._resizeitem(_i,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (35)));
 if (true) break;

case 25:
//C
this.state = 31;
;
 if (true) break;
if (true) break;

case 26:
//C
this.state = 29;
;
 if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 0;
RDebugUtils.currentLine=917634;
 //BA.debugLineNum = 917634;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 29:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=917636;
 //BA.debugLineNum = 917636;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
RDebugUtils.currentLine=917637;
 //BA.debugLineNum = 917637;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getcommandresponse(anywheresoftware.b4j.objects.ImageViewWrapper _iv,b4j.example.customlistview _clv,String _camera,String _attempts,String _attemptsallowed) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getcommandresponse", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "getcommandresponse", new Object[] {_iv,_clv,_camera,_attempts,_attemptsallowed}));}
ResumableSub_GetCommandResponse rsub = new ResumableSub_GetCommandResponse(null,_iv,_clv,_camera,_attempts,_attemptsallowed);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetCommandResponse extends BA.ResumableSub {
public ResumableSub_GetCommandResponse(cloyd.blink.main parent,anywheresoftware.b4j.objects.ImageViewWrapper _iv,b4j.example.customlistview _clv,String _camera,String _attempts,String _attemptsallowed) {
this.parent = parent;
this._iv = _iv;
this._clv = _clv;
this._camera = _camera;
this._attempts = _attempts;
this._attemptsallowed = _attemptsallowed;
}
cloyd.blink.main parent;
anywheresoftware.b4j.objects.ImageViewWrapper _iv;
b4j.example.customlistview _clv;
String _camera;
String _attempts;
String _attemptsallowed;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
Object _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="Dim rs As ResumableSub = GetCommandStatus(respons";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcommandstatus(parent._response);
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "getcommandresponse"), _rs);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_result = (Object) result[0];
;
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="If commandComplete Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._commandcomplete) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-\"";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera);
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "getcommandresponse"), _rs);
this.state = 20;
return;
case 20:
//C
this.state = 4;
_result = (Object) result[0];
;
RDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="Dim rs As ResumableSub = GetCameraInfo(response,";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcamerainfo(parent._response,_clv);
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "getcommandresponse"), _rs);
this.state = 21;
return;
case 21:
//C
this.state = 4;
_result = (Object) result[0];
;
RDebugUtils.currentLine=393227;
 //BA.debugLineNum = 393227;BA.debugLine="Dim rs As ResumableSub = DownloadImage(\"https://";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _downloadimage("https://rest-"+parent._userregion+".immedia-semi.com/"+parent._camerathumbnail+".jpg",_iv,_camera);
RDebugUtils.currentLine=393228;
 //BA.debugLineNum = 393228;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "getcommandresponse"), _rs);
this.state = 22;
return;
case 22:
//C
this.state = 4;
_result = (Object) result[0];
;
RDebugUtils.currentLine=393230;
 //BA.debugLineNum = 393230;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=393233;
 //BA.debugLineNum = 393233;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-\"";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera);
RDebugUtils.currentLine=393234;
 //BA.debugLineNum = 393234;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "getcommandresponse"), _rs);
this.state = 23;
return;
case 23:
//C
this.state = 5;
_result = (Object) result[0];
;
RDebugUtils.currentLine=393237;
 //BA.debugLineNum = 393237;BA.debugLine="Dim rs As ResumableSub = GetCameraInfo(response,N";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcamerainfo(parent._response,(b4j.example.customlistview)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=393238;
 //BA.debugLineNum = 393238;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "getcommandresponse"), _rs);
this.state = 24;
return;
case 24:
//C
this.state = 5;
_result = (Object) result[0];
;
RDebugUtils.currentLine=393240;
 //BA.debugLineNum = 393240;BA.debugLine="If prevCameraThumbnail <> \"\" And prevCameraThumbn";
if (true) break;

case 5:
//if
this.state = 18;
if ((parent._prevcamerathumbnail).equals("") == false && (parent._prevcamerathumbnail).equals(parent._camerathumbnail) == false) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 18;
RDebugUtils.currentLine=393241;
 //BA.debugLineNum = 393241;BA.debugLine="Log(\"**** ALRIGHT \" & attempts & \"/\" & attemptsA";
anywheresoftware.b4a.keywords.Common.Log("**** ALRIGHT "+_attempts+"/"+_attemptsallowed+" *****");
RDebugUtils.currentLine=393242;
 //BA.debugLineNum = 393242;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-\"";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera);
RDebugUtils.currentLine=393243;
 //BA.debugLineNum = 393243;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "getcommandresponse"), _rs);
this.state = 25;
return;
case 25:
//C
this.state = 18;
_result = (Object) result[0];
;
RDebugUtils.currentLine=393245;
 //BA.debugLineNum = 393245;BA.debugLine="Dim rs As ResumableSub = GetCameraInfo(response,";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcamerainfo(parent._response,_clv);
RDebugUtils.currentLine=393246;
 //BA.debugLineNum = 393246;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "getcommandresponse"), _rs);
this.state = 26;
return;
case 26:
//C
this.state = 18;
_result = (Object) result[0];
;
RDebugUtils.currentLine=393248;
 //BA.debugLineNum = 393248;BA.debugLine="Dim rs As ResumableSub = DownloadImage(\"https://";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _downloadimage("https://rest-"+parent._userregion+".immedia-semi.com/"+parent._camerathumbnail+".jpg",_iv,_camera);
RDebugUtils.currentLine=393249;
 //BA.debugLineNum = 393249;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "getcommandresponse"), _rs);
this.state = 27;
return;
case 27:
//C
this.state = 18;
_result = (Object) result[0];
;
RDebugUtils.currentLine=393251;
 //BA.debugLineNum = 393251;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=393253;
 //BA.debugLineNum = 393253;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 10:
//if
this.state = 17;
if ((_camera).equals("347574")) { 
this.state = 12;
}else 
{RDebugUtils.currentLine=393255;
 //BA.debugLineNum = 393255;BA.debugLine="Else If camera = \"236967\" Then";
if ((_camera).equals("236967")) { 
this.state = 14;
}else 
{RDebugUtils.currentLine=393257;
 //BA.debugLineNum = 393257;BA.debugLine="Else If camera = \"458236\" Then";
if ((_camera).equals("458236")) { 
this.state = 16;
}}}
if (true) break;

case 12:
//C
this.state = 17;
RDebugUtils.currentLine=393254;
 //BA.debugLineNum = 393254;BA.debugLine="lblStatus.Text = \"Awaiting for the Driveway thu";
parent._lblstatus.setText("Awaiting for the Driveway thumbnail... "+_attempts+"/"+_attemptsallowed);
 if (true) break;

case 14:
//C
this.state = 17;
RDebugUtils.currentLine=393256;
 //BA.debugLineNum = 393256;BA.debugLine="lblStatus.Text = \"Awaiting for the Front Door t";
parent._lblstatus.setText("Awaiting for the Front Door thumbnail...  "+_attempts+"/"+_attemptsallowed);
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=393258;
 //BA.debugLineNum = 393258;BA.debugLine="lblStatus.Text = \"Awaiting for the Side Yard th";
parent._lblstatus.setText("Awaiting for the Side Yard thumbnail... "+_attempts+"/"+_attemptsallowed);
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=393260;
 //BA.debugLineNum = 393260;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=393262;
 //BA.debugLineNum = 393262;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _gethomescreen(String _json) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "gethomescreen", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "gethomescreen", new Object[] {_json}));}
ResumableSub_GetHomescreen rsub = new ResumableSub_GetHomescreen(null,_json);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetHomescreen extends BA.ResumableSub {
public ResumableSub_GetHomescreen(cloyd.blink.main parent,String _json) {
this.parent = parent;
this._json = _json;
}
cloyd.blink.main parent;
String _json;
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _devices = null;
anywheresoftware.b4a.objects.collections.Map _coldevices = null;
String _battery_state = "";
int _device_id = 0;
String _active = "";
String _device_type = "";
int _battery = 0;
String _enabled = "";
String _status = "";
anywheresoftware.b4a.objects.collections.Map _network = null;
String _armednetwork = "";
anywheresoftware.b4a.BA.IterableList group6;
int index6;
int groupLen6;

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
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 101;
this.catchState = 100;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 100;
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="Dim devices As List = root.Get(\"devices\")";
_devices = new anywheresoftware.b4a.objects.collections.List();
_devices = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("devices"))));
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="For Each coldevices As Map In devices";
if (true) break;

case 4:
//for
this.state = 94;
_coldevices = new anywheresoftware.b4a.objects.collections.Map();
group6 = _devices;
index6 = 0;
groupLen6 = group6.getSize();
this.state = 102;
if (true) break;

case 102:
//C
this.state = 94;
if (index6 < groupLen6) {
this.state = 6;
_coldevices = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group6.Get(index6)));}
if (true) break;

case 103:
//C
this.state = 102;
index6++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="Dim battery_state As String = coldevices.Get(\"b";
_battery_state = BA.ObjectToString(_coldevices.Get((Object)("battery_state")));
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="Dim device_id As Int = coldevices.Get(\"device_i";
_device_id = (int)(BA.ObjectToNumber(_coldevices.Get((Object)("device_id"))));
RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="Dim active As String = coldevices.Get(\"active\")";
_active = BA.ObjectToString(_coldevices.Get((Object)("active")));
RDebugUtils.currentLine=1048592;
 //BA.debugLineNum = 1048592;BA.debugLine="Dim device_type As String = coldevices.Get(\"dev";
_device_type = BA.ObjectToString(_coldevices.Get((Object)("device_type")));
RDebugUtils.currentLine=1048593;
 //BA.debugLineNum = 1048593;BA.debugLine="If device_type <> \"camera\" Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_device_type).equals("camera") == false) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="Continue";
this.state = 103;
if (true) break;;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=1048598;
 //BA.debugLineNum = 1048598;BA.debugLine="Dim battery As Int = coldevices.Get(\"battery\")";
_battery = (int)(BA.ObjectToNumber(_coldevices.Get((Object)("battery"))));
RDebugUtils.currentLine=1048599;
 //BA.debugLineNum = 1048599;BA.debugLine="Dim enabled As String = coldevices.Get(\"enabled";
_enabled = BA.ObjectToString(_coldevices.Get((Object)("enabled")));
RDebugUtils.currentLine=1048609;
 //BA.debugLineNum = 1048609;BA.debugLine="Dim status As String = coldevices.Get(\"status\")";
_status = BA.ObjectToString(_coldevices.Get((Object)("status")));
RDebugUtils.currentLine=1048611;
 //BA.debugLineNum = 1048611;BA.debugLine="If device_id = \"347574\" Then";
if (true) break;

case 11:
//if
this.state = 93;
if (_device_id==(double)(Double.parseDouble("347574"))) { 
this.state = 13;
}else 
{RDebugUtils.currentLine=1048637;
 //BA.debugLineNum = 1048637;BA.debugLine="Else If device_id = \"236967\" Then";
if (_device_id==(double)(Double.parseDouble("236967"))) { 
this.state = 40;
}else 
{RDebugUtils.currentLine=1048663;
 //BA.debugLineNum = 1048663;BA.debugLine="Else If device_id = \"458236\" Then";
if (_device_id==(double)(Double.parseDouble("458236"))) { 
this.state = 67;
}}}
if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=1048612;
 //BA.debugLineNum = 1048612;BA.debugLine="If battery > 1 And battery_state = \"ok\" Then";
if (true) break;

case 14:
//if
this.state = 35;
if (_battery>1 && (_battery_state).equals("ok")) { 
this.state = 16;
}else {
this.state = 30;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=1048613;
 //BA.debugLineNum = 1048613;BA.debugLine="If active = \"armed\" Then";
if (true) break;

case 17:
//if
this.state = 28;
if ((_active).equals("armed")) { 
this.state = 19;
}else {
this.state = 27;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=1048614;
 //BA.debugLineNum = 1048614;BA.debugLine="If enabled = \"true\" Then";
if (true) break;

case 20:
//if
this.state = 25;
if ((_enabled).equals("true")) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
RDebugUtils.currentLine=1048615;
 //BA.debugLineNum = 1048615;BA.debugLine="drivewayArmedStatus = \"[Level \" & battery &";
parent._drivewayarmedstatus = "[Level "+BA.NumberToString(_battery)+" - "+_battery_state.toUpperCase()+"]";
RDebugUtils.currentLine=1048616;
 //BA.debugLineNum = 1048616;BA.debugLine="lblDriveway.Style = \"\"";
parent._lbldriveway.setStyle("");
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=1048618;
 //BA.debugLineNum = 1048618;BA.debugLine="drivewayArmedStatus = \"MOTION DETECTION IS";
parent._drivewayarmedstatus = "MOTION DETECTION IS DISABLED!";
RDebugUtils.currentLine=1048619;
 //BA.debugLineNum = 1048619;BA.debugLine="lblDriveway.Style = \"-fx-effect: dropshadow";
parent._lbldriveway.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 if (true) break;

case 25:
//C
this.state = 28;
;
 if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=1048622;
 //BA.debugLineNum = 1048622;BA.debugLine="drivewayArmedStatus = \"CAMERA NOT ARMED!\"";
parent._drivewayarmedstatus = "CAMERA NOT ARMED!";
RDebugUtils.currentLine=1048623;
 //BA.debugLineNum = 1048623;BA.debugLine="lblDriveway.Style = \"-fx-effect: dropshadow(";
parent._lbldriveway.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 if (true) break;

case 28:
//C
this.state = 35;
;
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=1048626;
 //BA.debugLineNum = 1048626;BA.debugLine="drivewayArmedStatus = \"[Level \" & battery & \"";
parent._drivewayarmedstatus = "[Level "+BA.NumberToString(_battery)+" - "+_battery_state.toUpperCase()+"]";
RDebugUtils.currentLine=1048627;
 //BA.debugLineNum = 1048627;BA.debugLine="If drivewayArmedStatus = \"[Level 1 - LOW]\" Th";
if (true) break;

case 31:
//if
this.state = 34;
if ((parent._drivewayarmedstatus).equals("[Level 1 - LOW]")) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=1048628;
 //BA.debugLineNum = 1048628;BA.debugLine="drivewayArmedStatus = \"[REPLACE]\"";
parent._drivewayarmedstatus = "[REPLACE]";
 if (true) break;

case 34:
//C
this.state = 35;
;
RDebugUtils.currentLine=1048630;
 //BA.debugLineNum = 1048630;BA.debugLine="lblDriveway.Style = \"-fx-effect: dropshadow(";
parent._lbldriveway.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 if (true) break;
;
RDebugUtils.currentLine=1048632;
 //BA.debugLineNum = 1048632;BA.debugLine="If status = \"offline\" Then";

case 35:
//if
this.state = 38;
if ((_status).equals("offline")) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=1048633;
 //BA.debugLineNum = 1048633;BA.debugLine="drivewayArmedStatus = \"[Level \" & battery & \"";
parent._drivewayarmedstatus = "[Level "+BA.NumberToString(_battery)+" - "+_battery_state.toUpperCase()+" OFFLINE]";
RDebugUtils.currentLine=1048634;
 //BA.debugLineNum = 1048634;BA.debugLine="lblDriveway.Style = \"-fx-effect: dropshadow(";
parent._lbldriveway.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
RDebugUtils.currentLine=1048635;
 //BA.debugLineNum = 1048635;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
_bluriv("Driveway.jpg",parent._ivdriveway);
 if (true) break;

case 38:
//C
this.state = 93;
;
 if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=1048638;
 //BA.debugLineNum = 1048638;BA.debugLine="If battery > 1 And battery_state = \"ok\" Then";
if (true) break;

case 41:
//if
this.state = 62;
if (_battery>1 && (_battery_state).equals("ok")) { 
this.state = 43;
}else {
this.state = 57;
}if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=1048639;
 //BA.debugLineNum = 1048639;BA.debugLine="If active = \"armed\" Then";
if (true) break;

case 44:
//if
this.state = 55;
if ((_active).equals("armed")) { 
this.state = 46;
}else {
this.state = 54;
}if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=1048640;
 //BA.debugLineNum = 1048640;BA.debugLine="If enabled = \"true\" Then";
if (true) break;

case 47:
//if
this.state = 52;
if ((_enabled).equals("true")) { 
this.state = 49;
}else {
this.state = 51;
}if (true) break;

case 49:
//C
this.state = 52;
RDebugUtils.currentLine=1048641;
 //BA.debugLineNum = 1048641;BA.debugLine="frontdoorArmedStatus = \"[Level \" & battery";
parent._frontdoorarmedstatus = "[Level "+BA.NumberToString(_battery)+" - "+_battery_state.toUpperCase()+"]";
RDebugUtils.currentLine=1048642;
 //BA.debugLineNum = 1048642;BA.debugLine="lblFrontDoor.Style = \"\"";
parent._lblfrontdoor.setStyle("");
 if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=1048644;
 //BA.debugLineNum = 1048644;BA.debugLine="frontdoorArmedStatus = \"MOTION DETECTION IS";
parent._frontdoorarmedstatus = "MOTION DETECTION IS DISABLED!";
RDebugUtils.currentLine=1048645;
 //BA.debugLineNum = 1048645;BA.debugLine="lblFrontDoor.Style = \"-fx-effect: dropshado";
parent._lblfrontdoor.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 if (true) break;

case 52:
//C
this.state = 55;
;
 if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=1048648;
 //BA.debugLineNum = 1048648;BA.debugLine="frontdoorArmedStatus = \"CAMERA NOT ARMED!\"";
parent._frontdoorarmedstatus = "CAMERA NOT ARMED!";
RDebugUtils.currentLine=1048649;
 //BA.debugLineNum = 1048649;BA.debugLine="lblFrontDoor.Style = \"-fx-effect: dropshadow";
parent._lblfrontdoor.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 if (true) break;

case 55:
//C
this.state = 62;
;
 if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=1048652;
 //BA.debugLineNum = 1048652;BA.debugLine="frontdoorArmedStatus = \"[Level \" & battery &";
parent._frontdoorarmedstatus = "[Level "+BA.NumberToString(_battery)+" - "+_battery_state.toUpperCase()+"]";
RDebugUtils.currentLine=1048653;
 //BA.debugLineNum = 1048653;BA.debugLine="If frontdoorArmedStatus = \"[Level 1 - LOW]\" T";
if (true) break;

case 58:
//if
this.state = 61;
if ((parent._frontdoorarmedstatus).equals("[Level 1 - LOW]")) { 
this.state = 60;
}if (true) break;

case 60:
//C
this.state = 61;
RDebugUtils.currentLine=1048654;
 //BA.debugLineNum = 1048654;BA.debugLine="frontdoorArmedStatus = \"[REPLACE]\"";
parent._frontdoorarmedstatus = "[REPLACE]";
 if (true) break;

case 61:
//C
this.state = 62;
;
RDebugUtils.currentLine=1048656;
 //BA.debugLineNum = 1048656;BA.debugLine="lblFrontDoor.Style = \"-fx-effect: dropshadow(";
parent._lblfrontdoor.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 if (true) break;
;
RDebugUtils.currentLine=1048658;
 //BA.debugLineNum = 1048658;BA.debugLine="If status = \"offline\" Then";

case 62:
//if
this.state = 65;
if ((_status).equals("offline")) { 
this.state = 64;
}if (true) break;

case 64:
//C
this.state = 65;
RDebugUtils.currentLine=1048659;
 //BA.debugLineNum = 1048659;BA.debugLine="frontdoorArmedStatus = \"[Level \" & battery &";
parent._frontdoorarmedstatus = "[Level "+BA.NumberToString(_battery)+" - "+_battery_state.toUpperCase()+" OFFLINE]";
RDebugUtils.currentLine=1048660;
 //BA.debugLineNum = 1048660;BA.debugLine="lblFrontDoor.Style = \"-fx-effect: dropshadow(";
parent._lblfrontdoor.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
RDebugUtils.currentLine=1048661;
 //BA.debugLineNum = 1048661;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
_bluriv("FrontDoor.jpg",parent._ivfrontdoor);
 if (true) break;

case 65:
//C
this.state = 93;
;
 if (true) break;

case 67:
//C
this.state = 68;
RDebugUtils.currentLine=1048664;
 //BA.debugLineNum = 1048664;BA.debugLine="If battery > 1 And battery_state = \"ok\" Then";
if (true) break;

case 68:
//if
this.state = 89;
if (_battery>1 && (_battery_state).equals("ok")) { 
this.state = 70;
}else {
this.state = 84;
}if (true) break;

case 70:
//C
this.state = 71;
RDebugUtils.currentLine=1048665;
 //BA.debugLineNum = 1048665;BA.debugLine="If active = \"armed\" Then";
if (true) break;

case 71:
//if
this.state = 82;
if ((_active).equals("armed")) { 
this.state = 73;
}else {
this.state = 81;
}if (true) break;

case 73:
//C
this.state = 74;
RDebugUtils.currentLine=1048666;
 //BA.debugLineNum = 1048666;BA.debugLine="If enabled = \"true\" Then";
if (true) break;

case 74:
//if
this.state = 79;
if ((_enabled).equals("true")) { 
this.state = 76;
}else {
this.state = 78;
}if (true) break;

case 76:
//C
this.state = 79;
RDebugUtils.currentLine=1048667;
 //BA.debugLineNum = 1048667;BA.debugLine="sideyardArmedStatus = \"[Level \" & battery &";
parent._sideyardarmedstatus = "[Level "+BA.NumberToString(_battery)+" - "+_battery_state.toUpperCase()+"]";
RDebugUtils.currentLine=1048668;
 //BA.debugLineNum = 1048668;BA.debugLine="lblSideYard.Style = \"\"";
parent._lblsideyard.setStyle("");
 if (true) break;

case 78:
//C
this.state = 79;
RDebugUtils.currentLine=1048670;
 //BA.debugLineNum = 1048670;BA.debugLine="sideyardArmedStatus = \"MOTION DETECTION IS";
parent._sideyardarmedstatus = "MOTION DETECTION IS DISABLED!";
RDebugUtils.currentLine=1048671;
 //BA.debugLineNum = 1048671;BA.debugLine="lblSideYard.Style = \"-fx-effect: dropshadow";
parent._lblsideyard.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 if (true) break;

case 79:
//C
this.state = 82;
;
 if (true) break;

case 81:
//C
this.state = 82;
RDebugUtils.currentLine=1048674;
 //BA.debugLineNum = 1048674;BA.debugLine="sideyardArmedStatus = \"CAMERA NOT ARMED!\"";
parent._sideyardarmedstatus = "CAMERA NOT ARMED!";
RDebugUtils.currentLine=1048675;
 //BA.debugLineNum = 1048675;BA.debugLine="lblSideYard.Style = \"-fx-effect: dropshadow(";
parent._lblsideyard.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 if (true) break;

case 82:
//C
this.state = 89;
;
 if (true) break;

case 84:
//C
this.state = 85;
RDebugUtils.currentLine=1048678;
 //BA.debugLineNum = 1048678;BA.debugLine="sideyardArmedStatus = \"[Level \" & battery & \"";
parent._sideyardarmedstatus = "[Level "+BA.NumberToString(_battery)+" - "+_battery_state.toUpperCase()+"]";
RDebugUtils.currentLine=1048679;
 //BA.debugLineNum = 1048679;BA.debugLine="If sideyardArmedStatus = \"[Level 1 - LOW]\" Th";
if (true) break;

case 85:
//if
this.state = 88;
if ((parent._sideyardarmedstatus).equals("[Level 1 - LOW]")) { 
this.state = 87;
}if (true) break;

case 87:
//C
this.state = 88;
RDebugUtils.currentLine=1048680;
 //BA.debugLineNum = 1048680;BA.debugLine="sideyardArmedStatus = \"[REPLACE]\"";
parent._sideyardarmedstatus = "[REPLACE]";
 if (true) break;

case 88:
//C
this.state = 89;
;
RDebugUtils.currentLine=1048682;
 //BA.debugLineNum = 1048682;BA.debugLine="lblSideYard.Style = \"-fx-effect: dropshadow(";
parent._lblsideyard.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 if (true) break;
;
RDebugUtils.currentLine=1048684;
 //BA.debugLineNum = 1048684;BA.debugLine="If status = \"offline\" Then";

case 89:
//if
this.state = 92;
if ((_status).equals("offline")) { 
this.state = 91;
}if (true) break;

case 91:
//C
this.state = 92;
RDebugUtils.currentLine=1048685;
 //BA.debugLineNum = 1048685;BA.debugLine="sideyardArmedStatus = \"[Level \" & battery & \"";
parent._sideyardarmedstatus = "[Level "+BA.NumberToString(_battery)+" - "+_battery_state.toUpperCase()+" OFFLINE]";
RDebugUtils.currentLine=1048686;
 //BA.debugLineNum = 1048686;BA.debugLine="lblSideYard.Style = \"-fx-effect: dropshadow(";
parent._lblsideyard.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
RDebugUtils.currentLine=1048687;
 //BA.debugLineNum = 1048687;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
_bluriv("SideYard.jpg",parent._ivsideyard);
 if (true) break;

case 92:
//C
this.state = 93;
;
 if (true) break;

case 93:
//C
this.state = 103;
;
 if (true) break;
if (true) break;

case 94:
//C
this.state = 95;
;
RDebugUtils.currentLine=1048694;
 //BA.debugLineNum = 1048694;BA.debugLine="Dim network As Map = root.Get(\"network\")";
_network = new anywheresoftware.b4a.objects.collections.Map();
_network = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("network"))));
RDebugUtils.currentLine=1048698;
 //BA.debugLineNum = 1048698;BA.debugLine="Dim armedNetwork As String = network.Get(\"armed\"";
_armednetwork = BA.ObjectToString(_network.Get((Object)("armed")));
RDebugUtils.currentLine=1048704;
 //BA.debugLineNum = 1048704;BA.debugLine="swArmed.Value = armedNetwork";
parent._swarmed._setvalue /*boolean*/ (null,BA.ObjectToBoolean(_armednetwork));
RDebugUtils.currentLine=1048706;
 //BA.debugLineNum = 1048706;BA.debugLine="If armedNetwork <> \"true\" Then";
if (true) break;

case 95:
//if
this.state = 98;
if ((_armednetwork).equals("true") == false) { 
this.state = 97;
}if (true) break;

case 97:
//C
this.state = 98;
RDebugUtils.currentLine=1048707;
 //BA.debugLineNum = 1048707;BA.debugLine="drivewayArmedStatus = \"SYSTEM NOT ARMED!\"";
parent._drivewayarmedstatus = "SYSTEM NOT ARMED!";
RDebugUtils.currentLine=1048708;
 //BA.debugLineNum = 1048708;BA.debugLine="lblDriveway.Style = \"-fx-effect: dropshadow( ga";
parent._lbldriveway.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
RDebugUtils.currentLine=1048710;
 //BA.debugLineNum = 1048710;BA.debugLine="frontdoorArmedStatus = \"SYSTEM NOT ARMED!\"";
parent._frontdoorarmedstatus = "SYSTEM NOT ARMED!";
RDebugUtils.currentLine=1048711;
 //BA.debugLineNum = 1048711;BA.debugLine="lblFrontDoor.Style = \"-fx-effect: dropshadow( g";
parent._lblfrontdoor.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
RDebugUtils.currentLine=1048713;
 //BA.debugLineNum = 1048713;BA.debugLine="sideyardArmedStatus = \"SYSTEM NOT ARMED!\"";
parent._sideyardarmedstatus = "SYSTEM NOT ARMED!";
RDebugUtils.currentLine=1048714;
 //BA.debugLineNum = 1048714;BA.debugLine="lblSideYard.Style = \"-fx-effect: dropshadow( ga";
parent._lblsideyard.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 if (true) break;

case 98:
//C
this.state = 101;
;
 if (true) break;

case 100:
//C
this.state = 101;
this.catchState = 0;
RDebugUtils.currentLine=1048717;
 //BA.debugLineNum = 1048717;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 101:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=1048719;
 //BA.debugLineNum = 1048719;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
RDebugUtils.currentLine=1048720;
 //BA.debugLineNum = 1048720;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub GetLiveView(json As String) As String 'ignore";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Try";
try {RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="Dim duration As Int = root.Get(\"duration\") 'igno";
_duration = (int)(BA.ObjectToNumber(_root.Get((Object)("duration"))));
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="Dim server As String = root.Get(\"server\")";
_server = BA.ObjectToString(_root.Get((Object)("server")));
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="Dim device_name As String = root.Get(\"device_nam";
_device_name = BA.ObjectToString(_root.Get((Object)("device_name")));
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="Dim network_id As Int = root.Get(\"network_id\") '";
_network_id = (int)(BA.ObjectToNumber(_root.Get((Object)("network_id"))));
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="Dim continue_interval As Int = root.Get(\"continu";
_continue_interval = (int)(BA.ObjectToNumber(_root.Get((Object)("continue_interval"))));
RDebugUtils.currentLine=2359306;
 //BA.debugLineNum = 2359306;BA.debugLine="Dim continue_warning As Int = root.Get(\"continue";
_continue_warning = (int)(BA.ObjectToNumber(_root.Get((Object)("continue_warning"))));
RDebugUtils.currentLine=2359307;
 //BA.debugLineNum = 2359307;BA.debugLine="Dim id As Int = root.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_root.Get((Object)("id"))));
RDebugUtils.currentLine=2359308;
 //BA.debugLineNum = 2359308;BA.debugLine="Dim submit_logs As String = root.Get(\"submit_log";
_submit_logs = BA.ObjectToString(_root.Get((Object)("submit_logs")));
RDebugUtils.currentLine=2359309;
 //BA.debugLineNum = 2359309;BA.debugLine="Dim camera_name As String = root.Get(\"camera_nam";
_camera_name = BA.ObjectToString(_root.Get((Object)("camera_name")));
RDebugUtils.currentLine=2359310;
 //BA.debugLineNum = 2359310;BA.debugLine="Dim lv_save As String = root.Get(\"lv_save\") 'ign";
_lv_save = BA.ObjectToString(_root.Get((Object)("lv_save")));
RDebugUtils.currentLine=2359311;
 //BA.debugLineNum = 2359311;BA.debugLine="Log(\"Liveview: \" & server)";
anywheresoftware.b4a.keywords.Common.Log("Liveview: "+_server);
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=2359316;
 //BA.debugLineNum = 2359316;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=2359318;
 //BA.debugLineNum = 2359318;BA.debugLine="Return id";
if (true) return BA.NumberToString(_id);
RDebugUtils.currentLine=2359319;
 //BA.debugLineNum = 2359319;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getsyncmoduleinfo(String _json) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "getsyncmoduleinfo", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "getsyncmoduleinfo", new Object[] {_json}));}
ResumableSub_GetSyncModuleInfo rsub = new ResumableSub_GetSyncModuleInfo(null,_json);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetSyncModuleInfo extends BA.ResumableSub {
public ResumableSub_GetSyncModuleInfo(cloyd.blink.main parent,String _json) {
this.parent = parent;
this._json = _json;
}
cloyd.blink.main parent;
String _json;
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.Map _syncmodule = null;
int _wifi_strength = 0;
String _os_version = "";
String _fw_version = "";
String _status = "";

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
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 25;
this.catchState = 24;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 24;
RDebugUtils.currentLine=983042;
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
_syncmodule = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("syncmodule"))));
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
parent._lblsyncmodule.setText("Sync Module is "+_status+anywheresoftware.b4a.keywords.Common.CRLF+"Wifi Strength: "+BA.NumberToString(_wifi_strength)+" bars"+anywheresoftware.b4a.keywords.Common.CRLF+"Firmware version: "+_fw_version+anywheresoftware.b4a.keywords.Common.CRLF+"OS version: "+_os_version);
RDebugUtils.currentLine=983072;
 //BA.debugLineNum = 983072;BA.debugLine="If status = \"online\" Then";
if (true) break;

case 4:
//if
this.state = 9;
if ((_status).equals("online")) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=983073;
 //BA.debugLineNum = 983073;BA.debugLine="ivSyncModule.SetImage(fx.LoadImage(File.DirAsse";
parent._ivsyncmodule.SetImage((javafx.scene.image.Image)(parent._fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"systemstatusonline.png").getObject()));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=983075;
 //BA.debugLineNum = 983075;BA.debugLine="ivSyncModule.SetImage(fx.LoadImage(File.DirAsse";
parent._ivsyncmodule.SetImage((javafx.scene.image.Image)(parent._fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"systemstatusoffline.png").getObject()));
 if (true) break;
;
RDebugUtils.currentLine=983078;
 //BA.debugLineNum = 983078;BA.debugLine="If wifi_strength = \"5\" Then";

case 9:
//if
this.state = 22;
if (_wifi_strength==(double)(Double.parseDouble("5"))) { 
this.state = 11;
}else 
{RDebugUtils.currentLine=983080;
 //BA.debugLineNum = 983080;BA.debugLine="Else If wifi_strength = \"4\" Then";
if (_wifi_strength==(double)(Double.parseDouble("4"))) { 
this.state = 13;
}else 
{RDebugUtils.currentLine=983082;
 //BA.debugLineNum = 983082;BA.debugLine="Else If wifi_strength = \"3\" Then";
if (_wifi_strength==(double)(Double.parseDouble("3"))) { 
this.state = 15;
}else 
{RDebugUtils.currentLine=983084;
 //BA.debugLineNum = 983084;BA.debugLine="Else If wifi_strength = \"2\" Then";
if (_wifi_strength==(double)(Double.parseDouble("2"))) { 
this.state = 17;
}else 
{RDebugUtils.currentLine=983086;
 //BA.debugLineNum = 983086;BA.debugLine="Else If wifi_strength = \"1\" Then";
if (_wifi_strength==(double)(Double.parseDouble("1"))) { 
this.state = 19;
}else {
this.state = 21;
}}}}}
if (true) break;

case 11:
//C
this.state = 22;
RDebugUtils.currentLine=983079;
 //BA.debugLineNum = 983079;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
parent._ivsyncmodulewifi.SetImage((javafx.scene.image.Image)(parent._fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bars5blue.png").getObject()));
 if (true) break;

case 13:
//C
this.state = 22;
RDebugUtils.currentLine=983081;
 //BA.debugLineNum = 983081;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
parent._ivsyncmodulewifi.SetImage((javafx.scene.image.Image)(parent._fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bars4blue.png").getObject()));
 if (true) break;

case 15:
//C
this.state = 22;
RDebugUtils.currentLine=983083;
 //BA.debugLineNum = 983083;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
parent._ivsyncmodulewifi.SetImage((javafx.scene.image.Image)(parent._fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bars3blue.png").getObject()));
 if (true) break;

case 17:
//C
this.state = 22;
RDebugUtils.currentLine=983085;
 //BA.debugLineNum = 983085;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
parent._ivsyncmodulewifi.SetImage((javafx.scene.image.Image)(parent._fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bars2blue.png").getObject()));
 if (true) break;

case 19:
//C
this.state = 22;
RDebugUtils.currentLine=983087;
 //BA.debugLineNum = 983087;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
parent._ivsyncmodulewifi.SetImage((javafx.scene.image.Image)(parent._fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bars1blue.png").getObject()));
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=983089;
 //BA.debugLineNum = 983089;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
parent._ivsyncmodulewifi.SetImage((javafx.scene.image.Image)(parent._fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bars_0bars.png").getObject()));
 if (true) break;

case 22:
//C
this.state = 25;
;
 if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 0;
RDebugUtils.currentLine=983092;
 //BA.debugLineNum = 983092;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 25:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=983094;
 //BA.debugLineNum = 983094;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
RDebugUtils.currentLine=983095;
 //BA.debugLineNum = 983095;BA.debugLine="End Sub";
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
public static String  _ivdriveway_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "ivdriveway_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "ivdriveway_mouseclicked", new Object[] {_eventdata}));}
cloyd.blink.frmmedia _mf = null;
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub ivDriveway_MouseClicked (EventData As MouseEve";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Dim mf As frmMedia";
_mf = new cloyd.blink.frmmedia();
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (null,ba,_mainform);
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="mf.timestamp = lblDriveway.Text";
_mf._timestamp /*String*/  = _lbldriveway.getText();
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="mf.url=$\" 	   <h1>${lblDriveway.Text}</h1> 	   <i";
_mf._url /*String*/  = ("\n"+"	   <h1>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbldriveway.getText()))+"</h1>\n"+"	   <img src=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Driveway.jpg")))+"\"/>\n"+"	\n"+"	");
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="mf.Show";
_mf._show /*String*/ (null);
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="Return";
if (true) return "";
RDebugUtils.currentLine=2293886;
 //BA.debugLineNum = 2293886;BA.debugLine="End Sub";
return "";
}
public static String  _ivfrontdoor_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "ivfrontdoor_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "ivfrontdoor_mouseclicked", new Object[] {_eventdata}));}
cloyd.blink.frmmedia _mf = null;
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub ivFrontDoor_MouseClicked (EventData As MouseEv";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Dim mf As frmMedia";
_mf = new cloyd.blink.frmmedia();
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (null,ba,_mainform);
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="mf.timestamp = lblFrontDoor.Text";
_mf._timestamp /*String*/  = _lblfrontdoor.getText();
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="mf.url=$\"    <h1>${lblFrontDoor.Text}</h1>    <im";
_mf._url /*String*/  = ("\n"+"   <h1>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lblfrontdoor.getText()))+"</h1>\n"+"   <img src=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"FrontDoor.jpg")))+"\"/>\n"+"   \n"+"");
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="mf.Show";
_mf._show /*String*/ (null);
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="End Sub";
return "";
}
public static String  _ivmax_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "ivmax_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "ivmax_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Private Sub ivMax_MouseClicked (EventData As Mouse";
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return "";
}
public static String  _ivmin_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "ivmin_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "ivmin_mouseclicked", new Object[] {_eventdata}));}
anywheresoftware.b4j.object.JavaObject _jmf = null;
anywheresoftware.b4j.object.JavaObject _stage = null;
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Private Sub ivMin_MouseClicked (EventData As Mouse";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Try";
try {RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Dim jmf As JavaObject = MainForm";
_jmf = new anywheresoftware.b4j.object.JavaObject();
_jmf = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_mainform));
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="Dim stage As JavaObject = jmf.GetField(\"stage\")";
_stage = new anywheresoftware.b4j.object.JavaObject();
_stage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jmf.GetField("stage")));
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="stage.RunMethod(\"setIconified\", Array As Object(";
_stage.RunMethod("setIconified",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.True)});
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="End Sub";
return "";
}
public static String  _ivsideyard_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "ivsideyard_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "ivsideyard_mouseclicked", new Object[] {_eventdata}));}
cloyd.blink.frmmedia _mf = null;
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub ivSideYard_MouseClicked (EventData As MouseEve";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Dim mf As frmMedia";
_mf = new cloyd.blink.frmmedia();
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (null,ba,_mainform);
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="mf.timestamp = lblSideYard.Text";
_mf._timestamp /*String*/  = _lblsideyard.getText();
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="mf.url=$\"    <h1>${lblSideYard.Text}</h1>    <img";
_mf._url /*String*/  = ("\n"+"   <h1>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lblsideyard.getText()))+"</h1>\n"+"   <img src=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"SideYard.jpg")))+"\"/>\n"+"   \n"+"");
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="mf.Show";
_mf._show /*String*/ (null);
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="End Sub";
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
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_eventdata.getObject()));
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
public static String  _mainform_closerequest(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "mainform_closerequest", false))
	 {return ((String) Debug.delegate(ba, "mainform_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub MainForm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="File.Delete(File.DirApp, \"Driveway.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Driveway.jpg");
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="File.Delete(File.DirApp, \"FrontDoor.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"FrontDoor.jpg");
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="File.Delete(File.DirApp, \"SideYard.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"SideYard.jpg");
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"screenshot.jpg");
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"media.mp4");
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="End Sub";
return "";
}
public static String  _max_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "max_entered_event", false))
	 {return ((String) Debug.delegate(ba, "max_entered_event", new Object[] {_e}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Private Sub Max_Entered_Event(e As Event)";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Try";
try {RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmax.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMaxEnt.png").getObject()));
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
public static String  _max_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "max_exited_event", false))
	 {return ((String) Debug.delegate(ba, "max_exited_event", new Object[] {_e}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Private Sub Max_Exited_Event(e As Event)";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Try";
try {RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmax.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMax.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="End Sub";
return "";
}
public static String  _min_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "min_entered_event", false))
	 {return ((String) Debug.delegate(ba, "min_entered_event", new Object[] {_e}));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Private Sub Min_Entered_Event(e As Event)";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Try";
try {RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmin.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMinEnt.png").getObject()));
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
public static String  _min_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "min_exited_event", false))
	 {return ((String) Debug.delegate(ba, "min_exited_event", new Object[] {_e}));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Private Sub Min_Exited_Event(e As Event)";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Try";
try {RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmin.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMin.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="End Sub";
return "";
}
public static String  _randomstring(int _length) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "randomstring", false))
	 {return ((String) Debug.delegate(ba, "randomstring", new Object[] {_length}));}
String _abc = "";
String _randomstr = "";
int _i = 0;
RDebugUtils.currentLine=28835840;
 //BA.debugLineNum = 28835840;BA.debugLine="Sub RandomString(length As Int) As String";
RDebugUtils.currentLine=28835841;
 //BA.debugLineNum = 28835841;BA.debugLine="Dim abc As String = \"0123456789ABCDEFGHIJKLMNOPQR";
_abc = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
RDebugUtils.currentLine=28835842;
 //BA.debugLineNum = 28835842;BA.debugLine="Dim randomstr As String = \"\"";
_randomstr = "";
RDebugUtils.currentLine=28835843;
 //BA.debugLineNum = 28835843;BA.debugLine="For i = 0 To length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_length-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=28835844;
 //BA.debugLineNum = 28835844;BA.debugLine="randomstr = randomstr & (abc.CharAt(Rnd(0,abc.Le";
_randomstr = _randomstr+BA.ObjectToString((_abc.charAt(anywheresoftware.b4a.keywords.Common.Rnd((int) (0),_abc.length()))));
 }
};
RDebugUtils.currentLine=28835846;
 //BA.debugLineNum = 28835846;BA.debugLine="Return randomstr";
if (true) return _randomstr;
RDebugUtils.currentLine=28835847;
 //BA.debugLineNum = 28835847;BA.debugLine="End Sub";
return "";
}
public static void  _swarmed_valuechanged(boolean _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "swarmed_valuechanged", false))
	 {Debug.delegate(ba, "swarmed_valuechanged", new Object[] {_value}); return;}
ResumableSub_swArmed_ValueChanged rsub = new ResumableSub_swArmed_ValueChanged(null,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_swArmed_ValueChanged extends BA.ResumableSub {
public ResumableSub_swArmed_ValueChanged(cloyd.blink.main parent,boolean _value) {
this.parent = parent;
this._value = _value;
}
cloyd.blink.main parent;
boolean _value;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
Object _result = null;
int _i = 0;
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
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 32;
this.catchState = 31;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 31;
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="btnDriveway.Enabled = False";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="btnRefresh.Enabled = False";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="btnActivity.Enabled = False";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="btnDrivewayNewClip.Enabled = False";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="btnSideYardNewClip.Enabled = False";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3604488;
 //BA.debugLineNum = 3604488;BA.debugLine="If Value Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_value) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=3604489;
 //BA.debugLineNum = 3604489;BA.debugLine="lblStatus.Text = \"Arming the system...\"";
parent._lblstatus.setText("Arming the system...");
RDebugUtils.currentLine=3604490;
 //BA.debugLineNum = 3604490;BA.debugLine="Dim rs As ResumableSub = RESTPost(\"https://res";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restpost("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/arm");
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=3604492;
 //BA.debugLineNum = 3604492;BA.debugLine="lblStatus.Text = \"Disarming the system...\"";
parent._lblstatus.setText("Disarming the system...");
RDebugUtils.currentLine=3604493;
 //BA.debugLineNum = 3604493;BA.debugLine="Dim rs As ResumableSub = RESTPost(\"https://res";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restpost("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/disarm");
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=3604496;
 //BA.debugLineNum = 3604496;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "swarmed_valuechanged"), _rs);
this.state = 33;
return;
case 33:
//C
this.state = 10;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3604498;
 //BA.debugLineNum = 3604498;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.C";
if (true) break;

case 10:
//if
this.state = 13;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=3604499;
 //BA.debugLineNum = 3604499;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3604500;
 //BA.debugLineNum = 3604500;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3604501;
 //BA.debugLineNum = 3604501;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3604502;
 //BA.debugLineNum = 3604502;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3604503;
 //BA.debugLineNum = 3604503;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3604504;
 //BA.debugLineNum = 3604504;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3604505;
 //BA.debugLineNum = 3604505;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3604506;
 //BA.debugLineNum = 3604506;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3604507;
 //BA.debugLineNum = 3604507;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3604508;
 //BA.debugLineNum = 3604508;BA.debugLine="lblStatus.Text = response";
parent._lblstatus.setText(parent._response);
RDebugUtils.currentLine=3604509;
 //BA.debugLineNum = 3604509;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=3604511;
 //BA.debugLineNum = 3604511;BA.debugLine="Dim rs As ResumableSub = GetCommandID(response)";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcommandid(parent._response);
RDebugUtils.currentLine=3604512;
 //BA.debugLineNum = 3604512;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "swarmed_valuechanged"), _rs);
this.state = 34;
return;
case 34:
//C
this.state = 14;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3604514;
 //BA.debugLineNum = 3604514;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
RDebugUtils.currentLine=3604515;
 //BA.debugLineNum = 3604515;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "swarmed_valuechanged"), _rs);
this.state = 35;
return;
case 35:
//C
this.state = 14;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3604517;
 //BA.debugLineNum = 3604517;BA.debugLine="For i = 1 To 30";
if (true) break;

case 14:
//for
this.state = 29;
step33 = 1;
limit33 = (int) (30);
_i = (int) (1) ;
this.state = 36;
if (true) break;

case 36:
//C
this.state = 29;
if ((step33 > 0 && _i <= limit33) || (step33 < 0 && _i >= limit33)) this.state = 16;
if (true) break;

case 37:
//C
this.state = 36;
_i = ((int)(0 + _i + step33)) ;
if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=3604518;
 //BA.debugLineNum = 3604518;BA.debugLine="Dim rs As ResumableSub = GetCommandStatus(resp";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcommandstatus(parent._response);
RDebugUtils.currentLine=3604519;
 //BA.debugLineNum = 3604519;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "swarmed_valuechanged"), _rs);
this.state = 38;
return;
case 38:
//C
this.state = 17;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3604520;
 //BA.debugLineNum = 3604520;BA.debugLine="If commandComplete Then";
if (true) break;

case 17:
//if
this.state = 28;
if (parent._commandcomplete) { 
this.state = 19;
}else {
this.state = 21;
}if (true) break;

case 19:
//C
this.state = 28;
RDebugUtils.currentLine=3604521;
 //BA.debugLineNum = 3604521;BA.debugLine="btnRefresh_Click";
_btnrefresh_click();
RDebugUtils.currentLine=3604522;
 //BA.debugLineNum = 3604522;BA.debugLine="Exit";
this.state = 29;
if (true) break;
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=3604524;
 //BA.debugLineNum = 3604524;BA.debugLine="If Value Then";
if (true) break;

case 22:
//if
this.state = 27;
if (_value) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 27;
RDebugUtils.currentLine=3604525;
 //BA.debugLineNum = 3604525;BA.debugLine="lblStatus.Text = \"Arming the system... \" & i";
parent._lblstatus.setText("Arming the system... "+BA.NumberToString(_i)+"/30");
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=3604527;
 //BA.debugLineNum = 3604527;BA.debugLine="lblStatus.Text = \"Disarming the system... \"";
parent._lblstatus.setText("Disarming the system... "+BA.NumberToString(_i)+"/30");
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = 37;
;
RDebugUtils.currentLine=3604530;
 //BA.debugLineNum = 3604530;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
RDebugUtils.currentLine=3604531;
 //BA.debugLineNum = 3604531;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "swarmed_valuechanged"), _rs);
this.state = 39;
return;
case 39:
//C
this.state = 37;
_result = (Object) result[0];
;
RDebugUtils.currentLine=3604532;
 //BA.debugLineNum = 3604532;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "swarmed_valuechanged"),(int) (1000));
this.state = 40;
return;
case 40:
//C
this.state = 37;
;
 if (true) break;
if (true) break;

case 29:
//C
this.state = 32;
;
RDebugUtils.currentLine=3604535;
 //BA.debugLineNum = 3604535;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3604536;
 //BA.debugLineNum = 3604536;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3604537;
 //BA.debugLineNum = 3604537;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3604538;
 //BA.debugLineNum = 3604538;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3604539;
 //BA.debugLineNum = 3604539;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3604540;
 //BA.debugLineNum = 3604540;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3604541;
 //BA.debugLineNum = 3604541;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
 if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 0;
RDebugUtils.currentLine=3604544;
 //BA.debugLineNum = 3604544;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 32:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=3604547;
 //BA.debugLineNum = 3604547;BA.debugLine="End Sub";
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