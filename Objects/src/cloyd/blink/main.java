package cloyd.blink;


import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("cloyd.blink", "cloyd.blink.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
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
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static cloyd.blink.httputils2service _httputils2service = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
anywheresoftware.b4j.objects.Shell _shl = null;
 //BA.debugLineNum = 154;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 155;BA.debugLine="btnDriveway.Enabled = True";
_btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 156;BA.debugLine="btnRefresh.Enabled = True";
_btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 157;BA.debugLine="btnActivity.Enabled = True";
_btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 158;BA.debugLine="btnDrivewayNewClip.Enabled = True";
_btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 159;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
_btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 160;BA.debugLine="btnSideYardNewClip.Enabled = True";
_btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 161;BA.debugLine="fx.msgbox2(MainForm,Error.Message,MainForm.Title,";
_fx.Msgbox2(_mainform,_error.getMessage(),_mainform.getTitle(),"OK","","",_fx.MSGBOX_ERROR);
 //BA.debugLineNum = 162;BA.debugLine="Dim shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
 //BA.debugLineNum = 163;BA.debugLine="Try";
try { //BA.debugLineNum = 164;BA.debugLine="shl.Initialize(\"shl\", \"java.exe\" , Array As Stri";
_shl.Initialize("shl","java.exe",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"-jar","Blink4Java.jar"}));
 //BA.debugLineNum = 165;BA.debugLine="shl.WorkingDirectory = File.DirApp";
_shl.setWorkingDirectory(anywheresoftware.b4a.keywords.Common.File.getDirApp());
 //BA.debugLineNum = 166;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
 } 
       catch (Exception e14) {
			ba.setLastException(e14); //BA.debugLineNum = 168;BA.debugLine="Log(\"Application_Error: \" & LastException.Messag";
anywheresoftware.b4a.keywords.Common.Log("Application_Error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
 };
 //BA.debugLineNum = 171;BA.debugLine="Return False ' handled";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return false;
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
String _skintemp = "";
String _skindefault = "";
anywheresoftware.b4j.agraham.reflection.Reflection _obj = null;
anywheresoftware.b4a.objects.collections.List _list1 = null;
int _i = 0;
 //BA.debugLineNum = 67;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 68;BA.debugLine="Try";
try { //BA.debugLineNum = 69;BA.debugLine="Dim skinTemp As String";
_skintemp = "";
 //BA.debugLineNum = 70;BA.debugLine="Dim skinDefault As String";
_skindefault = "";
 //BA.debugLineNum = 72;BA.debugLine="If File.Exists(File.DirApp, \"skin.ini\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"skin.ini")) { 
 //BA.debugLineNum = 73;BA.debugLine="skinTemp = File.ReadString(File.DirApp, \"skin.i";
_skintemp = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"skin.ini");
 }else {
 //BA.debugLineNum = 76;BA.debugLine="skinTemp = \"vdSk03\"";
_skintemp = "vdSk03";
 };
 //BA.debugLineNum = 79;BA.debugLine="If skinTemp = \"\" Then";
if ((_skintemp).equals("")) { 
 //BA.debugLineNum = 80;BA.debugLine="skinDefault = \"vdSk03\"";
_skindefault = "vdSk03";
 }else {
 //BA.debugLineNum = 82;BA.debugLine="If skinTemp = \"vdSk01\" Or skinTemp = \"vdSk02\" O";
if ((_skintemp).equals("vdSk01") || (_skintemp).equals("vdSk02") || (_skintemp).equals("vdSk03") || (_skintemp).equals("vdSk04") || (_skintemp).equals("vdSk05") || (_skintemp).equals("vdSk06")) { 
 //BA.debugLineNum = 83;BA.debugLine="skinDefault = skinTemp";
_skindefault = _skintemp;
 }else {
 //BA.debugLineNum = 85;BA.debugLine="skinDefault = \"vdSk03\"";
_skindefault = "vdSk03";
 };
 };
 //BA.debugLineNum = 89;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 90;BA.debugLine="MainForm.SetFormStyle(\"TRANSPARENT\")";
_mainform.SetFormStyle("TRANSPARENT");
 //BA.debugLineNum = 91;BA.debugLine="MainForm.RootPane.LoadLayout(skinDefault) 'Load";
_mainform.getRootPane().LoadLayout(ba,_skindefault);
 //BA.debugLineNum = 92;BA.debugLine="AtualSkin = skinDefault";
_atualskin = _skindefault;
 //BA.debugLineNum = 93;BA.debugLine="MainForm.BackColor = fx.Colors.Transparent";
_mainform.setBackColor(_fx.Colors.Transparent);
 //BA.debugLineNum = 94;BA.debugLine="MainForm.RootPane.Style = \"-fx-background-color:";
_mainform.getRootPane().setStyle("-fx-background-color:transparent;-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 1.0) , 15,0, 0.0, 0.0);");
 //BA.debugLineNum = 95;BA.debugLine="MainForm.Resizable = True";
_mainform.setResizable(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 96;BA.debugLine="MainForm.Icon = fx.LoadImage(File.DirAssets, \"ho";
_mainform.setIcon((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"home.png").getObject()));
 //BA.debugLineNum = 97;BA.debugLine="MainForm.Title = \"Catanaoan Blink XT2 Cameras v1";
_mainform.setTitle("Catanaoan Blink XT2 Cameras v1.0");
 //BA.debugLineNum = 98;BA.debugLine="lbTitle.MouseCursor = fx.Cursors.MOVE";
_lbtitle.setMouseCursor(_fx.Cursors.MOVE);
 //BA.debugLineNum = 99;BA.debugLine="lbTitle.Text = \"Catanaoan Blink XT2 Cameras v1.0";
_lbtitle.setText("Catanaoan Blink XT2 Cameras v1.0");
 //BA.debugLineNum = 100;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 101;BA.debugLine="Obj.Target = ivClose";
_obj.Target = (Object)(_ivclose.getObject());
 //BA.debugLineNum = 102;BA.debugLine="Obj.AddEventHandler2(\"Close_Entered\", \"onMouseEn";
_obj.AddEventHandler2(ba,"Close_Entered","onMouseEnteredProperty");
 //BA.debugLineNum = 103;BA.debugLine="Obj.AddEventHandler2(\"Close_Exited\", \"onMouseExi";
_obj.AddEventHandler2(ba,"Close_Exited","onMouseExitedProperty");
 //BA.debugLineNum = 104;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 105;BA.debugLine="Obj.Target = ivMax";
_obj.Target = (Object)(_ivmax.getObject());
 //BA.debugLineNum = 106;BA.debugLine="Obj.AddEventHandler2(\"Max_Entered\", \"onMouseEnte";
_obj.AddEventHandler2(ba,"Max_Entered","onMouseEnteredProperty");
 //BA.debugLineNum = 107;BA.debugLine="Obj.AddEventHandler2(\"Max_Exited\", \"onMouseExite";
_obj.AddEventHandler2(ba,"Max_Exited","onMouseExitedProperty");
 //BA.debugLineNum = 108;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 109;BA.debugLine="Obj.Target = ivMin";
_obj.Target = (Object)(_ivmin.getObject());
 //BA.debugLineNum = 110;BA.debugLine="Obj.AddEventHandler2(\"Min_Entered\", \"onMouseEnte";
_obj.AddEventHandler2(ba,"Min_Entered","onMouseEnteredProperty");
 //BA.debugLineNum = 111;BA.debugLine="Obj.AddEventHandler2(\"Min_Exited\", \"onMouseExite";
_obj.AddEventHandler2(ba,"Min_Exited","onMouseExitedProperty");
 //BA.debugLineNum = 112;BA.debugLine="imgInit = AtualSkin.SubString(2).ToLowerCase";
_imginit = _atualskin.substring((int) (2)).toLowerCase();
 //BA.debugLineNum = 113;BA.debugLine="Get_css";
_get_css();
 //BA.debugLineNum = 118;BA.debugLine="MainForm.WindowLeft = CheckMonitor.MaxX	- MainFo";
_mainform.setWindowLeft(_checkmonitor().getMaxX()-_mainform.getWidth()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
 //BA.debugLineNum = 119;BA.debugLine="MainForm.WindowTop = CheckMonitor.MaxY - MainFor";
_mainform.setWindowTop(_checkmonitor().getMaxY()-_mainform.getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
 //BA.debugLineNum = 121;BA.debugLine="lblStatus.TextColor = fx.Colors.White";
_lblstatus.setTextColor(_fx.Colors.White);
 //BA.debugLineNum = 122;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 124;BA.debugLine="If File.Exists(File.DirApp, \"account.txt\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"account.txt")) { 
 //BA.debugLineNum = 125;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 126;BA.debugLine="List1 = File.ReadList(File.DirApp, \"account.txt";
_list1 = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"account.txt");
 //BA.debugLineNum = 127;BA.debugLine="For i = 0 To List1.Size - 1";
{
final int step50 = 1;
final int limit50 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit50 ;_i = _i + step50 ) {
 //BA.debugLineNum = 128;BA.debugLine="If i = 0 Then";
if (_i==0) { 
 //BA.debugLineNum = 129;BA.debugLine="emailAddress = List1.Get(i)";
_emailaddress = BA.ObjectToString(_list1.Get(_i));
 }else if(_i==1) { 
 //BA.debugLineNum = 131;BA.debugLine="password = List1.Get(i)";
_password = BA.ObjectToString(_list1.Get(_i));
 };
 }
};
 }else {
 //BA.debugLineNum = 135;BA.debugLine="fx.Msgbox2(MainForm,\"Account.txt not found!\", \"";
_fx.Msgbox2(_mainform,"Account.txt not found!","Catanaoan Blink XT2 Cameras v1.0","OK","","",_fx.MSGBOX_ERROR);
 //BA.debugLineNum = 136;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
 //BA.debugLineNum = 139;BA.debugLine="btnDriveway.Enabled = False";
_btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 140;BA.debugLine="btnRefresh.Enabled = False";
_btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 141;BA.debugLine="btnActivity.Enabled = False";
_btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 142;BA.debugLine="btnDrivewayNewClip.Enabled = False";
_btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 143;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
_btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 144;BA.debugLine="btnSideYardNewClip.Enabled = False";
_btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 145;BA.debugLine="badger1.Initialize";
_badger1._initialize /*String*/ (ba);
 //BA.debugLineNum = 146;BA.debugLine="RequestAuthToken";
_requestauthtoken();
 } 
       catch (Exception e70) {
			ba.setLastException(e70); //BA.debugLineNum = 148;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _blur(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
b4j.example.bitmapcreator _bc = null;
int _reducescale = 0;
int _count = 0;
b4j.example.bitmapcreator._argbcolor[] _clrs = null;
b4j.example.bitmapcreator._argbcolor _temp = null;
int _m = 0;
int _steps = 0;
int _y = 0;
int _x = 0;
 //BA.debugLineNum = 1433;BA.debugLine="Private Sub Blur (bmp As B4XBitmap) As B4XBitmap";
 //BA.debugLineNum = 1434;BA.debugLine="Try";
try { //BA.debugLineNum = 1435;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4j.example.bitmapcreator();
 //BA.debugLineNum = 1436;BA.debugLine="Dim ReduceScale As Int = 2";
_reducescale = (int) (2);
 //BA.debugLineNum = 1437;BA.debugLine="bc.Initialize(bmp.Width / ReduceScale / bmp.Scal";
_bc._initialize(ba,(int) (_bmp.getWidth()/(double)_reducescale/(double)_bmp.getScale()),(int) (_bmp.getHeight()/(double)_reducescale/(double)_bmp.getScale()));
 //BA.debugLineNum = 1438;BA.debugLine="bc.CopyPixelsFromBitmap(bmp)";
_bc._copypixelsfrombitmap(_bmp);
 //BA.debugLineNum = 1439;BA.debugLine="Dim count As Int = 3";
_count = (int) (3);
 //BA.debugLineNum = 1440;BA.debugLine="Dim clrs(3) As ARGBColor";
_clrs = new b4j.example.bitmapcreator._argbcolor[(int) (3)];
{
int d0 = _clrs.length;
for (int i0 = 0;i0 < d0;i0++) {
_clrs[i0] = new b4j.example.bitmapcreator._argbcolor();
}
}
;
 //BA.debugLineNum = 1441;BA.debugLine="Dim temp As ARGBColor";
_temp = new b4j.example.bitmapcreator._argbcolor();
 //BA.debugLineNum = 1442;BA.debugLine="Dim m As Int";
_m = 0;
 //BA.debugLineNum = 1443;BA.debugLine="For steps = 1 To count";
{
final int step10 = 1;
final int limit10 = _count;
_steps = (int) (1) ;
for (;_steps <= limit10 ;_steps = _steps + step10 ) {
 //BA.debugLineNum = 1444;BA.debugLine="For y = 0 To bc.mHeight - 1";
{
final int step11 = 1;
final int limit11 = (int) (_bc._mheight-1);
_y = (int) (0) ;
for (;_y <= limit11 ;_y = _y + step11 ) {
 //BA.debugLineNum = 1445;BA.debugLine="For x = 0 To 2";
{
final int step12 = 1;
final int limit12 = (int) (2);
_x = (int) (0) ;
for (;_x <= limit12 ;_x = _x + step12 ) {
 //BA.debugLineNum = 1446;BA.debugLine="bc.GetARGB(x, y, clrs(x))";
_bc._getargb(_x,_y,_clrs[_x]);
 }
};
 //BA.debugLineNum = 1448;BA.debugLine="SetAvg(bc, 1, y, clrs, temp)";
_setavg(_bc,(int) (1),_y,_clrs,_temp);
 //BA.debugLineNum = 1449;BA.debugLine="m = 0";
_m = (int) (0);
 //BA.debugLineNum = 1450;BA.debugLine="For x = 2 To bc.mWidth - 2";
{
final int step17 = 1;
final int limit17 = (int) (_bc._mwidth-2);
_x = (int) (2) ;
for (;_x <= limit17 ;_x = _x + step17 ) {
 //BA.debugLineNum = 1451;BA.debugLine="bc.GetARGB(x + 1, y, clrs(m))";
_bc._getargb((int) (_x+1),_y,_clrs[_m]);
 //BA.debugLineNum = 1452;BA.debugLine="m = (m + 1) Mod clrs.Length";
_m = (int) ((_m+1)%_clrs.length);
 //BA.debugLineNum = 1453;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
_setavg(_bc,_x,_y,_clrs,_temp);
 }
};
 }
};
 //BA.debugLineNum = 1456;BA.debugLine="For x = 0 To bc.mWidth - 1";
{
final int step23 = 1;
final int limit23 = (int) (_bc._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit23 ;_x = _x + step23 ) {
 //BA.debugLineNum = 1457;BA.debugLine="For y = 0 To 2";
{
final int step24 = 1;
final int limit24 = (int) (2);
_y = (int) (0) ;
for (;_y <= limit24 ;_y = _y + step24 ) {
 //BA.debugLineNum = 1458;BA.debugLine="bc.GetARGB(x, y, clrs(y))";
_bc._getargb(_x,_y,_clrs[_y]);
 }
};
 //BA.debugLineNum = 1460;BA.debugLine="SetAvg(bc, x, 1, clrs, temp)";
_setavg(_bc,_x,(int) (1),_clrs,_temp);
 //BA.debugLineNum = 1461;BA.debugLine="m = 0";
_m = (int) (0);
 //BA.debugLineNum = 1462;BA.debugLine="For y = 2 To bc.mHeight - 2";
{
final int step29 = 1;
final int limit29 = (int) (_bc._mheight-2);
_y = (int) (2) ;
for (;_y <= limit29 ;_y = _y + step29 ) {
 //BA.debugLineNum = 1463;BA.debugLine="bc.GetARGB(x, y + 1, clrs(m))";
_bc._getargb(_x,(int) (_y+1),_clrs[_m]);
 //BA.debugLineNum = 1464;BA.debugLine="m = (m + 1) Mod clrs.Length";
_m = (int) ((_m+1)%_clrs.length);
 //BA.debugLineNum = 1465;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
_setavg(_bc,_x,_y,_clrs,_temp);
 }
};
 }
};
 }
};
 } 
       catch (Exception e37) {
			ba.setLastException(e37); //BA.debugLineNum = 1470;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1472;BA.debugLine="Return bc.Bitmap";
if (true) return _bc._getbitmap();
 //BA.debugLineNum = 1473;BA.debugLine="End Sub";
return null;
}
public static String  _bluriv(String _image,anywheresoftware.b4j.objects.ImageViewWrapper _iv) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
 //BA.debugLineNum = 1424;BA.debugLine="Sub BlurIV (image As String,iv As ImageView)";
 //BA.debugLineNum = 1425;BA.debugLine="Try";
try { //BA.debugLineNum = 1426;BA.debugLine="Dim bmp As B4XBitmap = xui.LoadBitmapResize(File";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _xui.LoadBitmapResize(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_image,(int) (_iv.getWidth()),(int) (_iv.getHeight()),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1427;BA.debugLine="iv.SetImage(Blur(bmp))";
_iv.SetImage((javafx.scene.image.Image)(_blur(_bmp).getObject()));
 } 
       catch (Exception e5) {
			ba.setLastException(e5); //BA.debugLineNum = 1429;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1431;BA.debugLine="End Sub";
return "";
}
public static void  _btnactivity_click() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1495;BA.debugLine="btnDriveway.Enabled = False";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1496;BA.debugLine="btnRefresh.Enabled = False";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1497;BA.debugLine="btnActivity.Enabled = False";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1498;BA.debugLine="btnDrivewayNewClip.Enabled = False";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1499;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1500;BA.debugLine="btnSideYardNewClip.Enabled = False";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1504;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-\"";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/api/v1/accounts/88438/media/changed?since=-999999999-01-01T00:00:00+18:00&page=1");
 //BA.debugLineNum = 1505;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Object) result[0];
;
 //BA.debugLineNum = 1506;BA.debugLine="File.WriteString(File.DirApp,\"btnActivity_Click.t";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"btnActivity_Click.txt",parent._response);
 //BA.debugLineNum = 1507;BA.debugLine="If response.StartsWith(\"{\"\"limit\"\":25\") = False T";
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
 //BA.debugLineNum = 1509;BA.debugLine="Dim rs As ResumableSub = GetUnwatchedVideos";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getunwatchedvideos();
 //BA.debugLineNum = 1510;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
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
 //BA.debugLineNum = 1512;BA.debugLine="Dim mf As frmActivity";
_mf = new cloyd.blink.frmactivity();
 //BA.debugLineNum = 1513;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (ba,parent._mainform);
 //BA.debugLineNum = 1514;BA.debugLine="mf.authToken = authToken";
_mf._authtoken /*String*/  = parent._authtoken;
 //BA.debugLineNum = 1515;BA.debugLine="mf.Show(response,userRegion)";
_mf._show /*String*/ (parent._response,parent._userregion);
 //BA.debugLineNum = 1518;BA.debugLine="Dim rs As ResumableSub = GetUnwatchedVideos";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getunwatchedvideos();
 //BA.debugLineNum = 1519;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 7;
return;
case 7:
//C
this.state = -1;
_result = (Object) result[0];
;
 //BA.debugLineNum = 1521;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1522;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1523;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1524;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1525;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1526;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1527;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(Object _result) throws Exception{
}
public static void  _btndriveway_click() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 175;BA.debugLine="clvDriveway.Clear";
parent._clvdriveway._clear();
 //BA.debugLineNum = 176;BA.debugLine="clvFrontDoor.Clear";
parent._clvfrontdoor._clear();
 //BA.debugLineNum = 177;BA.debugLine="clvSideYard.Clear";
parent._clvsideyard._clear();
 //BA.debugLineNum = 178;BA.debugLine="btnDriveway.Enabled = False";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 179;BA.debugLine="btnRefresh.Enabled = False";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 180;BA.debugLine="btnActivity.Enabled = False";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 181;BA.debugLine="btnDrivewayNewClip.Enabled = False";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 182;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 183;BA.debugLine="btnSideYardNewClip.Enabled = False";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 188;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
_bluriv("Driveway.jpg",parent._ivdriveway);
 //BA.debugLineNum = 189;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
_bluriv("FrontDoor.jpg",parent._ivfrontdoor);
 //BA.debugLineNum = 190;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
_bluriv("SideYard.jpg",parent._ivsideyard);
 //BA.debugLineNum = 192;BA.debugLine="Dim rs As ResumableSub = RefreshCameras(False, \"3";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _refreshcameras(anywheresoftware.b4a.keywords.Common.False,"347574");
 //BA.debugLineNum = 193;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (Object) result[0];
;
 //BA.debugLineNum = 195;BA.debugLine="Dim rs As ResumableSub = RefreshCameras(False, \"2";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _refreshcameras(anywheresoftware.b4a.keywords.Common.False,"236967");
 //BA.debugLineNum = 196;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 2;
return;
case 2:
//C
this.state = -1;
_result = (Object) result[0];
;
 //BA.debugLineNum = 198;BA.debugLine="Dim rs As ResumableSub = RefreshCameras(False, \"4";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _refreshcameras(anywheresoftware.b4a.keywords.Common.False,"458236");
 //BA.debugLineNum = 199;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 3;
return;
case 3:
//C
this.state = -1;
_result = (Object) result[0];
;
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btndrivewaynewclip_click() throws Exception{
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

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1635;BA.debugLine="If fx.Msgbox2(MainForm, \"Capture a new video for";
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
 //BA.debugLineNum = 1636;BA.debugLine="Try";
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
 //BA.debugLineNum = 1637;BA.debugLine="btnDriveway.Enabled = False";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1638;BA.debugLine="btnRefresh.Enabled = False";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1639;BA.debugLine="btnActivity.Enabled = False";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1640;BA.debugLine="btnDrivewayNewClip.Enabled = False";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1641;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1642;BA.debugLine="btnSideYardNewClip.Enabled = False";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1643;BA.debugLine="lblStatus.Text = \"Capturing a new Driveway vide";
parent._lblstatus.setText("Capturing a new Driveway video clip...");
 //BA.debugLineNum = 1645;BA.debugLine="Dim rs As ResumableSub = RESTPost(\"https://rest";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restpost("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/347574/clip");
 //BA.debugLineNum = 1646;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 29;
return;
case 29:
//C
this.state = 7;
_result = (Object) result[0];
;
 //BA.debugLineNum = 1648;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.C";
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
 //BA.debugLineNum = 1649;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1650;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1651;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1652;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1653;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1654;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1655;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1656;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1657;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1658;BA.debugLine="lblStatus.Text = response";
parent._lblstatus.setText(parent._response);
 //BA.debugLineNum = 1659;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 1661;BA.debugLine="Dim rs As ResumableSub = GetCommandID(response)";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcommandid(parent._response);
 //BA.debugLineNum = 1662;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 30;
return;
case 30:
//C
this.state = 11;
_result = (Object) result[0];
;
 //BA.debugLineNum = 1664;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
 //BA.debugLineNum = 1665;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 31;
return;
case 31:
//C
this.state = 11;
_result = (Object) result[0];
;
 //BA.debugLineNum = 1667;BA.debugLine="For i = 1 To 70";
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
 //BA.debugLineNum = 1668;BA.debugLine="Dim rs As ResumableSub = GetCommandStatus(resp";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcommandstatus(parent._response);
 //BA.debugLineNum = 1669;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 34;
return;
case 34:
//C
this.state = 14;
_result = (Object) result[0];
;
 //BA.debugLineNum = 1670;BA.debugLine="If commandComplete Then";
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
 //BA.debugLineNum = 1671;BA.debugLine="For i = 3 To 1 Step -1";
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
 //BA.debugLineNum = 1672;BA.debugLine="lblStatus.Text = \"New Driveway video clip wi";
parent._lblstatus.setText("New Driveway video clip will be shown in "+BA.NumberToString(_i)+" seconds...");
 //BA.debugLineNum = 1673;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
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
 //BA.debugLineNum = 1675;BA.debugLine="btnActivity_Click";
_btnactivity_click();
 //BA.debugLineNum = 1676;BA.debugLine="Exit";
this.state = 24;
if (true) break;
 if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 1678;BA.debugLine="lblStatus.Text = \"Awaiting for the Driveway v";
parent._lblstatus.setText("Awaiting for the Driveway video clip... "+BA.NumberToString(_i)+"/70");
 if (true) break;

case 23:
//C
this.state = 33;
;
 //BA.debugLineNum = 1680;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
 //BA.debugLineNum = 1681;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 38;
return;
case 38:
//C
this.state = 33;
_result = (Object) result[0];
;
 //BA.debugLineNum = 1682;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
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
 //BA.debugLineNum = 1685;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 0;
;
 //BA.debugLineNum = 1687;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1688;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1689;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1690;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1691;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1692;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1693;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
 if (true) break;

case 28:
//C
this.state = -1;
;
 //BA.debugLineNum = 1695;BA.debugLine="End Sub";
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 1905;BA.debugLine="Dim rs As ResumableSub = RefreshCameras(False, \"3";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _refreshcameras(anywheresoftware.b4a.keywords.Common.False,"347574");
 //BA.debugLineNum = 1906;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (Object) result[0];
;
 //BA.debugLineNum = 1907;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btnfrontdoornewclip_click() throws Exception{
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

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1698;BA.debugLine="If fx.Msgbox2(MainForm, \"Capture a new video for";
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
 //BA.debugLineNum = 1699;BA.debugLine="Try";
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
 //BA.debugLineNum = 1700;BA.debugLine="btnDriveway.Enabled = False";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1701;BA.debugLine="btnRefresh.Enabled = False";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1702;BA.debugLine="btnActivity.Enabled = False";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1703;BA.debugLine="btnDrivewayNewClip.Enabled = False";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1704;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1705;BA.debugLine="btnSideYardNewClip.Enabled = False";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1706;BA.debugLine="lblStatus.Text = \"Capturing a new Front Door vi";
parent._lblstatus.setText("Capturing a new Front Door video clip...");
 //BA.debugLineNum = 1708;BA.debugLine="Dim rs As ResumableSub = RESTPost(\"https://rest";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restpost("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/236967/clip");
 //BA.debugLineNum = 1709;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 29;
return;
case 29:
//C
this.state = 7;
_result = (Object) result[0];
;
 //BA.debugLineNum = 1710;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.C";
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
 //BA.debugLineNum = 1711;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1712;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1713;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1714;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1715;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1716;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1717;BA.debugLine="lblStatus.Text = response";
parent._lblstatus.setText(parent._response);
 //BA.debugLineNum = 1718;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 1721;BA.debugLine="Dim rs As ResumableSub = GetCommandID(response)";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcommandid(parent._response);
 //BA.debugLineNum = 1722;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 30;
return;
case 30:
//C
this.state = 11;
_result = (Object) result[0];
;
 //BA.debugLineNum = 1724;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
 //BA.debugLineNum = 1725;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 31;
return;
case 31:
//C
this.state = 11;
_result = (Object) result[0];
;
 //BA.debugLineNum = 1727;BA.debugLine="For i = 1 To 70";
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
 //BA.debugLineNum = 1728;BA.debugLine="Dim rs As ResumableSub = GetCommandStatus(resp";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcommandstatus(parent._response);
 //BA.debugLineNum = 1729;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 34;
return;
case 34:
//C
this.state = 14;
_result = (Object) result[0];
;
 //BA.debugLineNum = 1730;BA.debugLine="If commandComplete Then";
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
 //BA.debugLineNum = 1731;BA.debugLine="For i = 3 To 1  Step -1";
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
 //BA.debugLineNum = 1732;BA.debugLine="lblStatus.Text = \"New Front Door video clip";
parent._lblstatus.setText("New Front Door video clip will be shown in "+BA.NumberToString(_i)+" seconds...");
 //BA.debugLineNum = 1733;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
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
 //BA.debugLineNum = 1735;BA.debugLine="btnActivity_Click";
_btnactivity_click();
 //BA.debugLineNum = 1736;BA.debugLine="Exit";
this.state = 24;
if (true) break;
 if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 1738;BA.debugLine="lblStatus.Text = \"Awaiting for the Front Door";
parent._lblstatus.setText("Awaiting for the Front Door video clip... "+BA.NumberToString(_i)+"/70");
 if (true) break;

case 23:
//C
this.state = 33;
;
 //BA.debugLineNum = 1740;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
 //BA.debugLineNum = 1741;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 38;
return;
case 38:
//C
this.state = 33;
_result = (Object) result[0];
;
 //BA.debugLineNum = 1742;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
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
 //BA.debugLineNum = 1745;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 0;
;
 //BA.debugLineNum = 1747;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1748;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1749;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1750;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1751;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1752;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1753;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
 if (true) break;

case 28:
//C
this.state = -1;
;
 //BA.debugLineNum = 1755;BA.debugLine="End Sub";
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 1900;BA.debugLine="Dim rs As ResumableSub = RefreshCameras(False, \"2";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _refreshcameras(anywheresoftware.b4a.keywords.Common.False,"236967");
 //BA.debugLineNum = 1901;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (Object) result[0];
;
 //BA.debugLineNum = 1902;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btnrefresh_click() throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 1620;BA.debugLine="btnDriveway.Enabled = False";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1621;BA.debugLine="btnRefresh.Enabled = False";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1622;BA.debugLine="btnActivity.Enabled = False";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1623;BA.debugLine="btnDrivewayNewClip.Enabled = False";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1624;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1625;BA.debugLine="btnSideYardNewClip.Enabled = False";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1626;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
_bluriv("Driveway.jpg",parent._ivdriveway);
 //BA.debugLineNum = 1627;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
_bluriv("FrontDoor.jpg",parent._ivfrontdoor);
 //BA.debugLineNum = 1628;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
_bluriv("SideYard.jpg",parent._ivsideyard);
 //BA.debugLineNum = 1630;BA.debugLine="Dim rs As ResumableSub = RefreshCameras(True, \"Al";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _refreshcameras(anywheresoftware.b4a.keywords.Common.True,"All");
 //BA.debugLineNum = 1631;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (Object) result[0];
;
 //BA.debugLineNum = 1632;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btnsideyardnewclip_click() throws Exception{
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

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1758;BA.debugLine="If fx.Msgbox2(MainForm, \"Capture a new video for";
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
 //BA.debugLineNum = 1759;BA.debugLine="Try";
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
 //BA.debugLineNum = 1760;BA.debugLine="btnDriveway.Enabled = False";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1761;BA.debugLine="btnRefresh.Enabled = False";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1762;BA.debugLine="btnActivity.Enabled = False";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1763;BA.debugLine="btnDrivewayNewClip.Enabled = False";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1764;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1765;BA.debugLine="btnSideYardNewClip.Enabled = False";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1766;BA.debugLine="lblStatus.Text = \"Capturing a new Side Yard vid";
parent._lblstatus.setText("Capturing a new Side Yard video clip...");
 //BA.debugLineNum = 1767;BA.debugLine="Dim rs As ResumableSub = RESTPost(\"https://rest";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restpost("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/458236/clip");
 //BA.debugLineNum = 1768;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 29;
return;
case 29:
//C
this.state = 7;
_result = (Object) result[0];
;
 //BA.debugLineNum = 1769;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.C";
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
 //BA.debugLineNum = 1770;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1771;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1772;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1773;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1774;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1775;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1776;BA.debugLine="lblStatus.Text = response";
parent._lblstatus.setText(parent._response);
 //BA.debugLineNum = 1777;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 1780;BA.debugLine="Dim rs As ResumableSub = GetCommandID(response)";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcommandid(parent._response);
 //BA.debugLineNum = 1781;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 30;
return;
case 30:
//C
this.state = 11;
_result = (Object) result[0];
;
 //BA.debugLineNum = 1783;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
 //BA.debugLineNum = 1784;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 31;
return;
case 31:
//C
this.state = 11;
_result = (Object) result[0];
;
 //BA.debugLineNum = 1786;BA.debugLine="For i = 1 To 70";
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
 //BA.debugLineNum = 1787;BA.debugLine="Dim rs As ResumableSub = GetCommandStatus(resp";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcommandstatus(parent._response);
 //BA.debugLineNum = 1788;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 34;
return;
case 34:
//C
this.state = 14;
_result = (Object) result[0];
;
 //BA.debugLineNum = 1789;BA.debugLine="If commandComplete Then";
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
 //BA.debugLineNum = 1790;BA.debugLine="For i = 3 To 1 Step -1";
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
 //BA.debugLineNum = 1791;BA.debugLine="lblStatus.Text = \"New Side Yard video clip w";
parent._lblstatus.setText("New Side Yard video clip will be shown in "+BA.NumberToString(_i)+" seconds...");
 //BA.debugLineNum = 1792;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
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
 //BA.debugLineNum = 1794;BA.debugLine="btnActivity_Click";
_btnactivity_click();
 //BA.debugLineNum = 1795;BA.debugLine="Exit";
this.state = 24;
if (true) break;
 if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 1797;BA.debugLine="lblStatus.Text = \"Awaiting for the Side Yard";
parent._lblstatus.setText("Awaiting for the Side Yard video clip... "+BA.NumberToString(_i)+"/70");
 if (true) break;

case 23:
//C
this.state = 33;
;
 //BA.debugLineNum = 1799;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
 //BA.debugLineNum = 1800;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 38;
return;
case 38:
//C
this.state = 33;
_result = (Object) result[0];
;
 //BA.debugLineNum = 1801;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
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
 //BA.debugLineNum = 1804;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 0;
;
 //BA.debugLineNum = 1806;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1807;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1808;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1809;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1810;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1811;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1812;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
 if (true) break;

case 28:
//C
this.state = -1;
;
 //BA.debugLineNum = 1814;BA.debugLine="End Sub";
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 1895;BA.debugLine="Dim rs As ResumableSub = RefreshCameras(False, \"4";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _refreshcameras(anywheresoftware.b4a.keywords.Common.False,"458236");
 //BA.debugLineNum = 1896;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (Object) result[0];
;
 //BA.debugLineNum = 1897;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _checklfrlevel(int _lfrlevel) throws Exception{
 //BA.debugLineNum = 1060;BA.debugLine="Sub CheckLFRLevel(lfrlevel As Int) As String";
 //BA.debugLineNum = 1061;BA.debugLine="Try";
try { //BA.debugLineNum = 1063;BA.debugLine="If lfrlevel > -67 Then";
if (_lfrlevel>-67) { 
 //BA.debugLineNum = 1064;BA.debugLine="Return \"Amazing\"";
if (true) return "Amazing";
 }else if(_lfrlevel>-70 && _lfrlevel<=-67) { 
 //BA.debugLineNum = 1066;BA.debugLine="Return \"Very good\"";
if (true) return "Very good";
 }else if(_lfrlevel>-80 && _lfrlevel<=-70) { 
 //BA.debugLineNum = 1068;BA.debugLine="Return \"OK\"";
if (true) return "OK";
 }else if(_lfrlevel>-90 && _lfrlevel<=-80) { 
 //BA.debugLineNum = 1070;BA.debugLine="Return \"Not Good\"";
if (true) return "Not Good";
 }else {
 //BA.debugLineNum = 1072;BA.debugLine="Return \"Unusable\"";
if (true) return "Unusable";
 };
 } 
       catch (Exception e14) {
			ba.setLastException(e14); //BA.debugLineNum = 1075;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 1076;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 1078;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.JFX.ScreenWrapper  _checkmonitor() throws Exception{
anywheresoftware.b4a.objects.collections.List _slist = null;
anywheresoftware.b4j.objects.JFX.ScreenWrapper _s = null;
 //BA.debugLineNum = 1191;BA.debugLine="Sub CheckMonitor() As Screen";
 //BA.debugLineNum = 1192;BA.debugLine="Try";
try { //BA.debugLineNum = 1193;BA.debugLine="If fx.Screens.Size= 1 Then";
if (_fx.getScreens().getSize()==1) { 
 //BA.debugLineNum = 1194;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 1195;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 1197;BA.debugLine="Return S";
if (true) return _s;
 }else if(_fx.getScreens().getSize()>1) { 
 //BA.debugLineNum = 1199;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 1200;BA.debugLine="Dim S As Screen = SList.Get(2)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (2))));
 //BA.debugLineNum = 1202;BA.debugLine="Return S";
if (true) return _s;
 }else {
 //BA.debugLineNum = 1204;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 1205;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 1207;BA.debugLine="Return S";
if (true) return _s;
 };
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 1210;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 1211;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 1213;BA.debugLine="Return S";
if (true) return _s;
 };
 //BA.debugLineNum = 1215;BA.debugLine="End Sub";
return null;
}
public static String  _close_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 1117;BA.debugLine="Private Sub Close_Entered_Event(e As Event)";
 //BA.debugLineNum = 1118;BA.debugLine="Try";
try { //BA.debugLineNum = 1119;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
_ivclose.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btCloseEnt.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 1121;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1123;BA.debugLine="End Sub";
return "";
}
public static String  _close_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 1125;BA.debugLine="Private Sub Close_Exited_Event(e As Event)";
 //BA.debugLineNum = 1126;BA.debugLine="Try";
try { //BA.debugLineNum = 1127;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
_ivclose.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btClose.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 1129;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1131;BA.debugLine="End Sub";
return "";
}
public static String  _clvdriveway_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 1237;BA.debugLine="Sub clvDriveway_ItemClick (Index As Int, Value As";
 //BA.debugLineNum = 1238;BA.debugLine="Try";
try { //BA.debugLineNum = 1239;BA.debugLine="clvDriveway.JumpToItem(Index)";
_clvdriveway._jumptoitem(_index);
 //BA.debugLineNum = 1240;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
_clvfrontdoor._jumptoitem(_index);
 //BA.debugLineNum = 1241;BA.debugLine="clvSideYard.JumpToItem(Index)";
_clvsideyard._jumptoitem(_index);
 } 
       catch (Exception e6) {
			ba.setLastException(e6); //BA.debugLineNum = 1243;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1245;BA.debugLine="End Sub";
return "";
}
public static String  _clvfrontdoor_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 1227;BA.debugLine="Sub clvFrontDoor_ItemClick (Index As Int, Value As";
 //BA.debugLineNum = 1228;BA.debugLine="Try";
try { //BA.debugLineNum = 1229;BA.debugLine="clvDriveway.JumpToItem(Index)";
_clvdriveway._jumptoitem(_index);
 //BA.debugLineNum = 1230;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
_clvfrontdoor._jumptoitem(_index);
 //BA.debugLineNum = 1231;BA.debugLine="clvSideYard.JumpToItem(Index)";
_clvsideyard._jumptoitem(_index);
 } 
       catch (Exception e6) {
			ba.setLastException(e6); //BA.debugLineNum = 1233;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1235;BA.debugLine="End Sub";
return "";
}
public static String  _clvsideyard_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 1217;BA.debugLine="Sub clvSideYard_ItemClick (Index As Int, Value As";
 //BA.debugLineNum = 1218;BA.debugLine="Try";
try { //BA.debugLineNum = 1219;BA.debugLine="clvDriveway.JumpToItem(Index)";
_clvdriveway._jumptoitem(_index);
 //BA.debugLineNum = 1220;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
_clvfrontdoor._jumptoitem(_index);
 //BA.debugLineNum = 1221;BA.debugLine="clvSideYard.JumpToItem(Index)";
_clvsideyard._jumptoitem(_index);
 } 
       catch (Exception e6) {
			ba.setLastException(e6); //BA.debugLineNum = 1223;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1225;BA.debugLine="End Sub";
return "";
}
public static String  _convertdatetime(String _inputtime) throws Exception{
String _timestampprocessed = "";
long _ticks = 0L;
long _lngticks = 0L;
b4j.example.dateutils._period _p = null;
 //BA.debugLineNum = 1539;BA.debugLine="Sub ConvertDateTime(inputTime As String) As String";
 //BA.debugLineNum = 1541;BA.debugLine="Dim timestampProcessed As String";
_timestampprocessed = "";
 //BA.debugLineNum = 1542;BA.debugLine="timestampProcessed =  ConvertFullDateTime(inputTi";
_timestampprocessed = _convertfulldatetime(_inputtime);
 //BA.debugLineNum = 1544;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = _parseutcstring(_inputtime.replace("+00:00","+0000"));
 //BA.debugLineNum = 1545;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a");
 //BA.debugLineNum = 1546;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
 //BA.debugLineNum = 1547;BA.debugLine="Dim p As Period = DateUtils.PeriodBetween(lngTick";
_p = _dateutils._periodbetween(_lngticks,anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 1549;BA.debugLine="If timestampProcessed.Contains(\"Yesterday\") Or ti";
if (_timestampprocessed.contains("Yesterday") || _timestampprocessed.contains("Today")) { 
 //BA.debugLineNum = 1550;BA.debugLine="If p.Days = 0 Then";
if (_p.Days==0) { 
 //BA.debugLineNum = 1551;BA.debugLine="If p.Hours = 0 Then";
if (_p.Hours==0) { 
 //BA.debugLineNum = 1552;BA.debugLine="If p.Minutes = 0 Then";
if (_p.Minutes==0) { 
 //BA.debugLineNum = 1553;BA.debugLine="Return timestampProcessed & \" (\" & p.Seconds";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Seconds)+"s ago)";
 }else {
 //BA.debugLineNum = 1555;BA.debugLine="Return timestampProcessed & \" (\" & p.Minutes";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago)";
 };
 }else {
 //BA.debugLineNum = 1558;BA.debugLine="Return timestampProcessed & \" (\" & p.Hours & \"";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago)";
 };
 }else if(_p.Hours==0) { 
 //BA.debugLineNum = 1561;BA.debugLine="If p.Minutes = 0 Then";
if (_p.Minutes==0) { 
 //BA.debugLineNum = 1562;BA.debugLine="Return timestampProcessed & \" (\" & p.Seconds &";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Seconds)+"s ago)";
 }else {
 //BA.debugLineNum = 1564;BA.debugLine="Return timestampProcessed & \" (\" & p.Minutes &";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago)";
 };
 }else if(_p.Minutes==0) { 
 //BA.debugLineNum = 1567;BA.debugLine="Return timestampProcessed & \" (\" & p.Seconds &";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Seconds)+"s ago)";
 }else {
 //BA.debugLineNum = 1569;BA.debugLine="Return timestampProcessed & \" (\" & p.Days & \"d";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Days)+"d "+BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago)";
 };
 }else {
 //BA.debugLineNum = 1572;BA.debugLine="Return timestampProcessed & \" (\" & p.Days & \"d \"";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Days)+"d "+BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago)";
 };
 //BA.debugLineNum = 1575;BA.debugLine="End Sub";
return "";
}
public static String  _convertdatetimeplain(String _inputtime) throws Exception{
long _ticks = 0L;
long _lngticks = 0L;
 //BA.debugLineNum = 1529;BA.debugLine="Sub ConvertDateTimePlain(inputTime As String) As S";
 //BA.debugLineNum = 1531;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = _parseutcstring(_inputtime.replace("+00:00","+0000"));
 //BA.debugLineNum = 1532;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a");
 //BA.debugLineNum = 1533;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
 //BA.debugLineNum = 1536;BA.debugLine="Return DateTime.Date(lngTicks)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(_lngticks);
 //BA.debugLineNum = 1537;BA.debugLine="End Sub";
return "";
}
public static String  _convertfulldatetime(String _inputtime) throws Exception{
long _ticks = 0L;
long _lngticks = 0L;
long _yesterday = 0L;
long _timestamp = 0L;
 //BA.debugLineNum = 1577;BA.debugLine="Sub ConvertFullDateTime(inputTime As String) As St";
 //BA.debugLineNum = 1579;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = _parseutcstring(_inputtime.replace("+00:00","+0000"));
 //BA.debugLineNum = 1580;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a");
 //BA.debugLineNum = 1581;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
 //BA.debugLineNum = 1583;BA.debugLine="Dim Yesterday As Long";
_yesterday = 0L;
 //BA.debugLineNum = 1584;BA.debugLine="Dim timestamp As Long";
_timestamp = 0L;
 //BA.debugLineNum = 1585;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyyMMdd");
 //BA.debugLineNum = 1586;BA.debugLine="Yesterday = DateTime.Date(DateTime.add(DateTime.N";
_yesterday = (long)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.Add(anywheresoftware.b4a.keywords.Common.DateTime.getNow(),(int) (0),(int) (0),(int) (-1)))));
 //BA.debugLineNum = 1587;BA.debugLine="timestamp = DateTime.Date(lngTicks)";
_timestamp = (long)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.DateTime.Date(_lngticks)));
 //BA.debugLineNum = 1589;BA.debugLine="DateTime.DateFormat = \"h:mm:ss a\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("h:mm:ss a");
 //BA.debugLineNum = 1590;BA.debugLine="If DateUtils.IsSameDay(lngTicks,DateTime.now) The";
if (_dateutils._issameday(_lngticks,anywheresoftware.b4a.keywords.Common.DateTime.getNow())) { 
 //BA.debugLineNum = 1591;BA.debugLine="Return \"Today \" & DateTime.Date(lngTicks)";
if (true) return "Today "+anywheresoftware.b4a.keywords.Common.DateTime.Date(_lngticks);
 }else if(_yesterday==_timestamp) { 
 //BA.debugLineNum = 1593;BA.debugLine="Return \"Yesterday \" & DateTime.Date(lngTicks)";
if (true) return "Yesterday "+anywheresoftware.b4a.keywords.Common.DateTime.Date(_lngticks);
 }else {
 //BA.debugLineNum = 1595;BA.debugLine="Return DateUtils.GetDayOfWeekName(lngTicks) & \"";
if (true) return _dateutils._getdayofweekname(_lngticks)+" "+anywheresoftware.b4a.keywords.Common.DateTime.Date(_lngticks);
 };
 //BA.debugLineNum = 1597;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _downloadimage(String _link,anywheresoftware.b4j.objects.ImageViewWrapper _iv,String _camera) throws Exception{
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

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 581;BA.debugLine="Try";
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
 //BA.debugLineNum = 582;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
 //BA.debugLineNum = 583;BA.debugLine="response = \"\"";
parent._response = "";
 //BA.debugLineNum = 584;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",main.getObject());
 //BA.debugLineNum = 585;BA.debugLine="j.Download(Link)";
_j._download /*String*/ (_link);
 //BA.debugLineNum = 586;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("TOKEN_AUTH",parent._authtoken);
 //BA.debugLineNum = 587;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 21;
return;
case 21:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[0];
;
 //BA.debugLineNum = 588;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 590;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 7:
//if
this.state = 14;
if ((_camera).equals("347574")) { 
this.state = 9;
}else if((_camera).equals("236967")) { 
this.state = 11;
}else if((_camera).equals("458236")) { 
this.state = 13;
}if (true) break;

case 9:
//C
this.state = 14;
 //BA.debugLineNum = 591;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Driveway.jpg",anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 11:
//C
this.state = 14;
 //BA.debugLineNum = 593;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"FrontDoor.jpg",anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 595;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"SideYard.jpg",anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 14:
//C
this.state = 17;
;
 //BA.debugLineNum = 597;BA.debugLine="File.Copy2(j.GetInputStream, out)";
anywheresoftware.b4a.keywords.Common.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ ().getObject()),(java.io.OutputStream)(_out.getObject()));
 //BA.debugLineNum = 598;BA.debugLine="out.Close '<------ very important";
_out.Close();
 //BA.debugLineNum = 601;BA.debugLine="iv.SetImage(j.GetBitmap)";
_iv.SetImage((javafx.scene.image.Image)(_j._getbitmap /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ ().getObject()));
 if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 603;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
parent._response = "ERROR: "+_j._errormessage /*String*/ ;
 //BA.debugLineNum = 604;BA.debugLine="lblStatus.Text = GetRESTError(j.ErrorMessage)";
parent._lblstatus.setText(_getresterror(_j._errormessage /*String*/ ));
 if (true) break;

case 17:
//C
this.state = 20;
;
 //BA.debugLineNum = 606;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
 //BA.debugLineNum = 608;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 20:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 610;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 //BA.debugLineNum = 611;BA.debugLine="End Sub";
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
public static void  _jobdone(cloyd.blink.httpjob _j) throws Exception{
}
public static String  _get_css() throws Exception{
anywheresoftware.b4j.object.JavaObject _jform = null;
anywheresoftware.b4j.object.JavaObject _scene = null;
anywheresoftware.b4a.objects.collections.List _stylesheets = null;
 //BA.debugLineNum = 1179;BA.debugLine="Public Sub Get_css";
 //BA.debugLineNum = 1180;BA.debugLine="Try";
try { //BA.debugLineNum = 1181;BA.debugLine="Dim jForm As JavaObject = MainForm";
_jform = new anywheresoftware.b4j.object.JavaObject();
_jform.setObject((java.lang.Object)(_mainform));
 //BA.debugLineNum = 1182;BA.debugLine="Dim scene As JavaObject = jForm.GetField(\"scene\"";
_scene = new anywheresoftware.b4j.object.JavaObject();
_scene.setObject((java.lang.Object)(_jform.GetField("scene")));
 //BA.debugLineNum = 1183;BA.debugLine="Dim stylesheets As List = scene.RunMethod(\"getSt";
_stylesheets = new anywheresoftware.b4a.objects.collections.List();
_stylesheets.setObject((java.util.List)(_scene.RunMethod("getStylesheets",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
 //BA.debugLineNum = 1184;BA.debugLine="stylesheets.Clear";
_stylesheets.Clear();
 //BA.debugLineNum = 1185;BA.debugLine="stylesheets.Add(File.GetUri(File.DirAssets, imgI";
_stylesheets.Add((Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+".css")));
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 1187;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1189;BA.debugLine="End Sub";
return "";
}
public static String  _getauthinfo(String _json) throws Exception{
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.Map _authtokenmap = null;
anywheresoftware.b4a.objects.collections.Map _networks = null;
anywheresoftware.b4a.objects.collections.Map _region = null;
 //BA.debugLineNum = 614;BA.debugLine="Sub GetAuthInfo(json As String)";
 //BA.debugLineNum = 615;BA.debugLine="Try";
try { //BA.debugLineNum = 616;BA.debugLine="lblStatus.Text = \"Getting authtoken...\"";
_lblstatus.setText("Getting authtoken...");
 //BA.debugLineNum = 617;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 618;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 619;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 620;BA.debugLine="Dim authtokenmap As Map = root.Get(\"authtoken\")";
_authtokenmap = new anywheresoftware.b4a.objects.collections.Map();
_authtokenmap.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("authtoken"))));
 //BA.debugLineNum = 621;BA.debugLine="authToken = authtokenmap.Get(\"authtoken\")";
_authtoken = BA.ObjectToString(_authtokenmap.Get((Object)("authtoken")));
 //BA.debugLineNum = 622;BA.debugLine="Log(\"authToken: \" &  authToken)";
anywheresoftware.b4a.keywords.Common.Log("authToken: "+_authtoken);
 //BA.debugLineNum = 626;BA.debugLine="Dim networks As Map = root.Get(\"networks\")";
_networks = new anywheresoftware.b4a.objects.collections.Map();
_networks.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("networks"))));
 //BA.debugLineNum = 627;BA.debugLine="Log(\"networkID: \" & networks.GetKeyAt(0))";
anywheresoftware.b4a.keywords.Common.Log("networkID: "+BA.ObjectToString(_networks.GetKeyAt((int) (0))));
 //BA.debugLineNum = 628;BA.debugLine="networkID = networks.GetKeyAt(0)";
_networkid = BA.ObjectToString(_networks.GetKeyAt((int) (0)));
 //BA.debugLineNum = 632;BA.debugLine="Dim region As Map = root.Get(\"region\")";
_region = new anywheresoftware.b4a.objects.collections.Map();
_region.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("region"))));
 //BA.debugLineNum = 633;BA.debugLine="userRegion = region.GetKeyAt(0)";
_userregion = BA.ObjectToString(_region.GetKeyAt((int) (0)));
 //BA.debugLineNum = 634;BA.debugLine="Log(\"userRegion: \" &  userRegion)";
anywheresoftware.b4a.keywords.Common.Log("userRegion: "+_userregion);
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 639;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 642;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getcamerainfo(String _json,b4j.example.customlistview _clv) throws Exception{
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

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 732;BA.debugLine="Try";
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
 //BA.debugLineNum = 733;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 734;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 735;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 736;BA.debugLine="Dim camera_status As Map = root.Get(\"camera_stat";
_camera_status = new anywheresoftware.b4a.objects.collections.Map();
_camera_status.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("camera_status"))));
 //BA.debugLineNum = 737;BA.debugLine="Dim total_108_wakeups As Int = camera_status.Get";
_total_108_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("total_108_wakeups"))));
 //BA.debugLineNum = 738;BA.debugLine="Dim battery_voltage As Int = camera_status.Get(\"";
_battery_voltage = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("battery_voltage"))));
 //BA.debugLineNum = 739;BA.debugLine="Dim light_sensor_data_valid As String = camera_s";
_light_sensor_data_valid = BA.ObjectToString(_camera_status.Get((Object)("light_sensor_data_valid")));
 //BA.debugLineNum = 740;BA.debugLine="Dim lfr_tb_wakeups As Int = camera_status.Get(\"l";
_lfr_tb_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lfr_tb_wakeups"))));
 //BA.debugLineNum = 741;BA.debugLine="Dim fw_git_hash As String = camera_status.Get(\"f";
_fw_git_hash = BA.ObjectToString(_camera_status.Get((Object)("fw_git_hash")));
 //BA.debugLineNum = 742;BA.debugLine="Dim wifi_strength As Int = camera_status.Get(\"wi";
_wifi_strength = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("wifi_strength"))));
 //BA.debugLineNum = 743;BA.debugLine="Dim lfr_strength As Int = camera_status.Get(\"lfr";
_lfr_strength = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lfr_strength"))));
 //BA.debugLineNum = 744;BA.debugLine="Dim total_tb_wakeups As Int = camera_status.Get(";
_total_tb_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("total_tb_wakeups"))));
 //BA.debugLineNum = 745;BA.debugLine="Dim created_at As String = camera_status.Get(\"cr";
_created_at = BA.ObjectToString(_camera_status.Get((Object)("created_at")));
 //BA.debugLineNum = 746;BA.debugLine="Dim light_sensor_ch0 As Int = camera_status.Get(";
_light_sensor_ch0 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("light_sensor_ch0"))));
 //BA.debugLineNum = 747;BA.debugLine="Dim mac As String = camera_status.Get(\"mac\")";
_mac = BA.ObjectToString(_camera_status.Get((Object)("mac")));
 //BA.debugLineNum = 748;BA.debugLine="Dim unit_number As Int = camera_status.Get(\"unit";
_unit_number = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("unit_number"))));
 //BA.debugLineNum = 749;BA.debugLine="Dim updated_at As String = camera_status.Get(\"up";
_updated_at = BA.ObjectToString(_camera_status.Get((Object)("updated_at")));
 //BA.debugLineNum = 750;BA.debugLine="Dim light_sensor_ch1 As Int = camera_status.Get(";
_light_sensor_ch1 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("light_sensor_ch1"))));
 //BA.debugLineNum = 751;BA.debugLine="Dim time_dhcp_lease As Int = camera_status.Get(\"";
_time_dhcp_lease = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_dhcp_lease"))));
 //BA.debugLineNum = 752;BA.debugLine="Dim temperature As Int = camera_status.Get(\"temp";
_temperature = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("temperature"))));
 //BA.debugLineNum = 753;BA.debugLine="Dim time_first_video As Int = camera_status.Get(";
_time_first_video = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_first_video"))));
 //BA.debugLineNum = 754;BA.debugLine="Dim time_dns_resolve As Int = camera_status.Get(";
_time_dns_resolve = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_dns_resolve"))));
 //BA.debugLineNum = 755;BA.debugLine="Dim id As Int = camera_status.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("id"))));
 //BA.debugLineNum = 756;BA.debugLine="Dim temp_alert_status As String = camera_status.";
_temp_alert_status = BA.ObjectToString(_camera_status.Get((Object)("temp_alert_status")));
 //BA.debugLineNum = 757;BA.debugLine="Dim time_108_boot As Int = camera_status.Get(\"ti";
_time_108_boot = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_108_boot"))));
 //BA.debugLineNum = 758;BA.debugLine="Dim lfr_108_wakeups As Int = camera_status.Get(\"";
_lfr_108_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lfr_108_wakeups"))));
 //BA.debugLineNum = 759;BA.debugLine="cameraThumbnail = camera_status.Get(\"thumbnail\")";
parent._camerathumbnail = BA.ObjectToString(_camera_status.Get((Object)("thumbnail")));
 //BA.debugLineNum = 760;BA.debugLine="Dim lifetime_duration As Int = camera_status.Get";
_lifetime_duration = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lifetime_duration"))));
 //BA.debugLineNum = 761;BA.debugLine="Dim wifi_connect_failure_count As Int = camera_s";
_wifi_connect_failure_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("wifi_connect_failure_count"))));
 //BA.debugLineNum = 762;BA.debugLine="Dim camera_id As Int = camera_status.Get(\"camera";
_camera_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("camera_id"))));
 //BA.debugLineNum = 763;BA.debugLine="Dim battery_alert_status As String = camera_stat";
_battery_alert_status = BA.ObjectToString(_camera_status.Get((Object)("battery_alert_status")));
 //BA.debugLineNum = 764;BA.debugLine="Dim dhcp_failure_count As Int = camera_status.Ge";
_dhcp_failure_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dhcp_failure_count"))));
 //BA.debugLineNum = 765;BA.debugLine="Dim ip_address As String = camera_status.Get(\"ip";
_ip_address = BA.ObjectToString(_camera_status.Get((Object)("ip_address")));
 //BA.debugLineNum = 766;BA.debugLine="Dim ipv As String = camera_status.Get(\"ipv\")";
_ipv = BA.ObjectToString(_camera_status.Get((Object)("ipv")));
 //BA.debugLineNum = 767;BA.debugLine="Dim light_sensor_data_new As String = camera_sta";
_light_sensor_data_new = BA.ObjectToString(_camera_status.Get((Object)("light_sensor_data_new")));
 //BA.debugLineNum = 768;BA.debugLine="Dim network_id As Int = camera_status.Get(\"netwo";
_network_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("network_id"))));
 //BA.debugLineNum = 769;BA.debugLine="Dim account_id As Int = camera_status.Get(\"accou";
_account_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("account_id"))));
 //BA.debugLineNum = 770;BA.debugLine="Dim serial As String = camera_status.Get(\"serial";
_serial = BA.ObjectToString(_camera_status.Get((Object)("serial")));
 //BA.debugLineNum = 771;BA.debugLine="Dim dev_1 As Int = camera_status.Get(\"dev_1\")";
_dev_1 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dev_1"))));
 //BA.debugLineNum = 772;BA.debugLine="Dim time_wlan_connect As Int = camera_status.Get";
_time_wlan_connect = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_wlan_connect"))));
 //BA.debugLineNum = 773;BA.debugLine="Dim dev_2 As Int = camera_status.Get(\"dev_2\")";
_dev_2 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dev_2"))));
 //BA.debugLineNum = 774;BA.debugLine="Dim socket_failure_count As Int = camera_status.";
_socket_failure_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("socket_failure_count"))));
 //BA.debugLineNum = 775;BA.debugLine="Dim dev_3 As Int = camera_status.Get(\"dev_3\")";
_dev_3 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dev_3"))));
 //BA.debugLineNum = 776;BA.debugLine="Dim pir_rejections As Int = camera_status.Get(\"p";
_pir_rejections = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("pir_rejections"))));
 //BA.debugLineNum = 777;BA.debugLine="Dim sync_module_id As Int = camera_status.Get(\"s";
_sync_module_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("sync_module_id"))));
 //BA.debugLineNum = 778;BA.debugLine="Dim lifetime_count As Int = camera_status.Get(\"l";
_lifetime_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lifetime_count"))));
 //BA.debugLineNum = 779;BA.debugLine="Dim error_codes As Int = camera_status.Get(\"erro";
_error_codes = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("error_codes"))));
 //BA.debugLineNum = 780;BA.debugLine="Dim fw_version As String = camera_status.Get(\"fw";
_fw_version = BA.ObjectToString(_camera_status.Get((Object)("fw_version")));
 //BA.debugLineNum = 781;BA.debugLine="Dim ac_power As String = camera_status.Get(\"ac_p";
_ac_power = BA.ObjectToString(_camera_status.Get((Object)("ac_power")));
 //BA.debugLineNum = 783;BA.debugLine="If clv = Null Then";
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
 //BA.debugLineNum = 784;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
 //BA.debugLineNum = 786;BA.debugLine="clv.Clear";
_clv._clear();
 //BA.debugLineNum = 787;BA.debugLine="clv.AddTextItem(\"Battery voltage: \" & NumberForm";
_clv._addtextitem((Object)("Battery voltage: "+anywheresoftware.b4a.keywords.Common.NumberFormat((_battery_voltage/(double)100),(int) (0),(int) (2))+"V"),(Object)("battery_voltage"));
 //BA.debugLineNum = 788;BA.debugLine="clv.AddTextItem(\"Camera to WiFi strength: \" & wi";
_clv._addtextitem((Object)("Camera to WiFi strength: "+BA.NumberToString(_wifi_strength)+" dBm - "+_checklfrlevel(_wifi_strength)),(Object)("wifi_strength"));
 //BA.debugLineNum = 789;BA.debugLine="clv.AddTextItem(\"Camera to Sync Module strength";
_clv._addtextitem((Object)("Camera to Sync Module strength (LFR): "+BA.NumberToString(_lfr_strength)+" dBm - "+_checklfrlevel(_lfr_strength)),(Object)("lfr_strength"));
 //BA.debugLineNum = 790;BA.debugLine="clv.AddTextItem(\"Temperature: \" & temperature &";
_clv._addtextitem((Object)("Temperature: "+BA.NumberToString(_temperature)+"ºF"),(Object)("temperature"));
 //BA.debugLineNum = 791;BA.debugLine="clv.AddTextItem(\"Firmware version: \" & fw_versio";
_clv._addtextitem((Object)("Firmware version: "+_fw_version),(Object)("fw_version"));
 //BA.debugLineNum = 792;BA.debugLine="clv.AddTextItem(\"Firmware Git Hash: \" & fw_git_h";
_clv._addtextitem((Object)("Firmware Git Hash: "+_fw_git_hash),(Object)("fw_git_hash"));
 //BA.debugLineNum = 793;BA.debugLine="clv.AddTextItem(\"Battery alert status: \" & batte";
_clv._addtextitem((Object)("Battery alert status: "+_battery_alert_status),(Object)("battery_alert_status"));
 //BA.debugLineNum = 794;BA.debugLine="clv.AddTextItem(\"Temperature alert status: \" & t";
_clv._addtextitem((Object)("Temperature alert status: "+_temp_alert_status),(Object)("temp_alert_status"));
 //BA.debugLineNum = 795;BA.debugLine="clv.AddTextItem(\"Updated at: \" & ConvertDateTime";
_clv._addtextitem((Object)("Updated at: "+_convertdatetimeplain(_updated_at)),(Object)("updated_at"));
 //BA.debugLineNum = 796;BA.debugLine="clv.AddTextItem(\"Created at: \" & ConvertDateTime";
_clv._addtextitem((Object)("Created at: "+_convertdatetimeplain(_created_at)),(Object)("created_at"));
 //BA.debugLineNum = 797;BA.debugLine="clv.AddTextItem(\"IP address: \" & ip_address, \"ip";
_clv._addtextitem((Object)("IP address: "+_ip_address),(Object)("ip_address"));
 //BA.debugLineNum = 798;BA.debugLine="clv.AddTextItem(\"MAC address: \" & mac, \"mac\")";
_clv._addtextitem((Object)("MAC address: "+_mac),(Object)("mac"));
 //BA.debugLineNum = 799;BA.debugLine="clv.AddTextItem(\"Camera ID: \" & camera_id, \"came";
_clv._addtextitem((Object)("Camera ID: "+BA.NumberToString(_camera_id)),(Object)("camera_id"));
 //BA.debugLineNum = 800;BA.debugLine="clv.AddTextItem(\"Serial: \" & serial, \"serial\")";
_clv._addtextitem((Object)("Serial: "+_serial),(Object)("serial"));
 //BA.debugLineNum = 801;BA.debugLine="clv.AddTextItem(\"Network ID: \" & network_id, \"ne";
_clv._addtextitem((Object)("Network ID: "+BA.NumberToString(_network_id)),(Object)("network_id"));
 //BA.debugLineNum = 802;BA.debugLine="clv.AddTextItem(\"Account ID: \" & account_id, \"ac";
_clv._addtextitem((Object)("Account ID: "+BA.NumberToString(_account_id)),(Object)("account_id"));
 //BA.debugLineNum = 803;BA.debugLine="clv.AddTextItem(\"ID: \" & id, \"id\")";
_clv._addtextitem((Object)("ID: "+BA.NumberToString(_id)),(Object)("id"));
 //BA.debugLineNum = 804;BA.debugLine="clv.AddTextItem(\"Sync Module ID: \" & sync_module";
_clv._addtextitem((Object)("Sync Module ID: "+BA.NumberToString(_sync_module_id)),(Object)("sync_module_id"));
 //BA.debugLineNum = 805;BA.debugLine="clv.AddTextItem(\"Light sensor data valid: \" & li";
_clv._addtextitem((Object)("Light sensor data valid: "+_light_sensor_data_valid),(Object)("light_sensor_data_valid"));
 //BA.debugLineNum = 806;BA.debugLine="clv.AddTextItem(\"DHCP failure count: \" & dhcp_fa";
_clv._addtextitem((Object)("DHCP failure count: "+BA.NumberToString(_dhcp_failure_count)),(Object)("dhcp_failure_count"));
 //BA.debugLineNum = 807;BA.debugLine="clv.AddTextItem(\"LFR tb wakeups: \" & lfr_tb_wake";
_clv._addtextitem((Object)("LFR tb wakeups: "+BA.NumberToString(_lfr_tb_wakeups)),(Object)("lfr_tb_wakeups"));
 //BA.debugLineNum = 808;BA.debugLine="clv.AddTextItem(\"Socket failure count: \" & socke";
_clv._addtextitem((Object)("Socket failure count: "+BA.NumberToString(_socket_failure_count)),(Object)("socket_failure_count"));
 //BA.debugLineNum = 809;BA.debugLine="clv.AddTextItem(\"Camera thumbnail: \" & cameraThu";
_clv._addtextitem((Object)("Camera thumbnail: "+parent._camerathumbnail),(Object)("thumbnail"));
 //BA.debugLineNum = 810;BA.debugLine="clv.AddTextItem(\"WiFi connect failure count: \" &";
_clv._addtextitem((Object)("WiFi connect failure count: "+BA.NumberToString(_wifi_connect_failure_count)),(Object)("wifi_connect_failure_count"));
 //BA.debugLineNum = 811;BA.debugLine="clv.AddTextItem(\"Error codes: \" & error_codes, \"";
_clv._addtextitem((Object)("Error codes: "+BA.NumberToString(_error_codes)),(Object)("error_codes"));
 //BA.debugLineNum = 812;BA.debugLine="clv.AddTextItem(\"AC power: \" & ac_power, \"ac_pow";
_clv._addtextitem((Object)("AC power: "+_ac_power),(Object)("ac_power"));
 //BA.debugLineNum = 813;BA.debugLine="clv.AddTextItem(\"Total 108 wakeups: \" & total_10";
_clv._addtextitem((Object)("Total 108 wakeups: "+BA.NumberToString(_total_108_wakeups)),(Object)("total_108_wakeups"));
 //BA.debugLineNum = 814;BA.debugLine="clv.AddTextItem(\"Total Tb wakeups: \" & total_tb_";
_clv._addtextitem((Object)("Total Tb wakeups: "+BA.NumberToString(_total_tb_wakeups)),(Object)("total_tb_wakeups"));
 //BA.debugLineNum = 815;BA.debugLine="clv.AddTextItem(\"Light sensor ch0: \" & light_sen";
_clv._addtextitem((Object)("Light sensor ch0: "+BA.NumberToString(_light_sensor_ch0)),(Object)("light_sensor_ch0"));
 //BA.debugLineNum = 816;BA.debugLine="clv.AddTextItem(\"Unit number: \" & unit_number, \"";
_clv._addtextitem((Object)("Unit number: "+BA.NumberToString(_unit_number)),(Object)("unit_number"));
 //BA.debugLineNum = 817;BA.debugLine="clv.AddTextItem(\"Light sensor ch1: \" & light_sen";
_clv._addtextitem((Object)("Light sensor ch1: "+BA.NumberToString(_light_sensor_ch1)),(Object)("light_sensor_ch1"));
 //BA.debugLineNum = 818;BA.debugLine="clv.AddTextItem(\"Time dhcp lease: \" & time_dhcp_";
_clv._addtextitem((Object)("Time dhcp lease: "+BA.NumberToString(_time_dhcp_lease)),(Object)("time_dhcp_lease"));
 //BA.debugLineNum = 819;BA.debugLine="clv.AddTextItem(\"Time first video: \" & time_firs";
_clv._addtextitem((Object)("Time first video: "+BA.NumberToString(_time_first_video)),(Object)("time_first_video"));
 //BA.debugLineNum = 820;BA.debugLine="clv.AddTextItem(\"Time dns resolve: \" & time_dns_";
_clv._addtextitem((Object)("Time dns resolve: "+BA.NumberToString(_time_dns_resolve)),(Object)("time_dns_resolve"));
 //BA.debugLineNum = 821;BA.debugLine="clv.AddTextItem(\"Time 108 boot: \" & time_108_boo";
_clv._addtextitem((Object)("Time 108 boot: "+BA.NumberToString(_time_108_boot)),(Object)("time_108_boot"));
 //BA.debugLineNum = 822;BA.debugLine="clv.AddTextItem(\"LFR 108 wakeups: \" & lfr_108_wa";
_clv._addtextitem((Object)("LFR 108 wakeups: "+BA.NumberToString(_lfr_108_wakeups)),(Object)("lfr_108_wakeups"));
 //BA.debugLineNum = 823;BA.debugLine="clv.AddTextItem(\"lifetime duration: \" & lifetime";
_clv._addtextitem((Object)("lifetime duration: "+BA.NumberToString(_lifetime_duration)),(Object)("lifetime_duration"));
 //BA.debugLineNum = 824;BA.debugLine="clv.AddTextItem(\"lpv: \" & ipv, \"ipv\")";
_clv._addtextitem((Object)("lpv: "+_ipv),(Object)("ipv"));
 //BA.debugLineNum = 825;BA.debugLine="clv.AddTextItem(\"light sensor data new: \" & ligh";
_clv._addtextitem((Object)("light sensor data new: "+_light_sensor_data_new),(Object)("light_sensor_data_new"));
 //BA.debugLineNum = 826;BA.debugLine="clv.AddTextItem(\"Dev_1: \" & dev_1, \"dev_1\")";
_clv._addtextitem((Object)("Dev_1: "+BA.NumberToString(_dev_1)),(Object)("dev_1"));
 //BA.debugLineNum = 827;BA.debugLine="clv.AddTextItem(\"Dev_2: \" & dev_2, \"dev_2\")";
_clv._addtextitem((Object)("Dev_2: "+BA.NumberToString(_dev_2)),(Object)("dev_2"));
 //BA.debugLineNum = 828;BA.debugLine="clv.AddTextItem(\"Dev_3: \" & dev_3, \"dev_3\")";
_clv._addtextitem((Object)("Dev_3: "+BA.NumberToString(_dev_3)),(Object)("dev_3"));
 //BA.debugLineNum = 829;BA.debugLine="clv.AddTextItem(\"Time wlan connect: \" & time_wla";
_clv._addtextitem((Object)("Time wlan connect: "+BA.NumberToString(_time_wlan_connect)),(Object)("time_wlan_connect"));
 //BA.debugLineNum = 830;BA.debugLine="clv.AddTextItem(\"PIR rejections: \" & pir_rejecti";
_clv._addtextitem((Object)("PIR rejections: "+BA.NumberToString(_pir_rejections)),(Object)("pir_rejections"));
 //BA.debugLineNum = 831;BA.debugLine="clv.AddTextItem(\"Lifetime count: \" & lifetime_co";
_clv._addtextitem((Object)("Lifetime count: "+BA.NumberToString(_lifetime_count)),(Object)("lifetime_count"));
 //BA.debugLineNum = 833;BA.debugLine="Dim strTimestamp As String";
_strtimestamp = "";
 //BA.debugLineNum = 834;BA.debugLine="strTimestamp = ConvertDateTime(updated_at)";
_strtimestamp = _convertdatetime(_updated_at);
 //BA.debugLineNum = 835;BA.debugLine="lblStatus.Text = \"Last updated: \" & strTimestamp";
parent._lblstatus.setText("Last updated: "+_strtimestamp);
 //BA.debugLineNum = 836;BA.debugLine="If clv = clvDriveway Then";
if (true) break;

case 8:
//if
this.state = 15;
if ((_clv).equals(parent._clvdriveway)) { 
this.state = 10;
}else if((_clv).equals(parent._clvfrontdoor)) { 
this.state = 12;
}else if((_clv).equals(parent._clvsideyard)) { 
this.state = 14;
}if (true) break;

case 10:
//C
this.state = 15;
 //BA.debugLineNum = 837;BA.debugLine="lblDriveway.Text = strTimestamp & \" \" & drivewa";
parent._lbldriveway.setText(_strtimestamp+" "+parent._drivewayarmedstatus);
 //BA.debugLineNum = 838;BA.debugLine="prevDrivewayUpdateTime = updated_at";
parent._prevdrivewayupdatetime = _updated_at;
 if (true) break;

case 12:
//C
this.state = 15;
 //BA.debugLineNum = 840;BA.debugLine="lblFrontDoor.Text = strTimestamp & \" \" & frontd";
parent._lblfrontdoor.setText(_strtimestamp+" "+parent._frontdoorarmedstatus);
 //BA.debugLineNum = 841;BA.debugLine="lblDriveway.Text = ConvertDateTime(prevDriveway";
parent._lbldriveway.setText(_convertdatetime(parent._prevdrivewayupdatetime)+" "+parent._drivewayarmedstatus);
 //BA.debugLineNum = 842;BA.debugLine="prevFrontDoorUpdateTime = updated_at";
parent._prevfrontdoorupdatetime = _updated_at;
 if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 844;BA.debugLine="lblSideYard.Text = strTimestamp & \" \" & sideyar";
parent._lblsideyard.setText(_strtimestamp+" "+parent._sideyardarmedstatus);
 //BA.debugLineNum = 845;BA.debugLine="lblDriveway.Text = ConvertDateTime(prevDriveway";
parent._lbldriveway.setText(_convertdatetime(parent._prevdrivewayupdatetime)+" "+parent._drivewayarmedstatus);
 //BA.debugLineNum = 846;BA.debugLine="lblFrontDoor.Text = ConvertDateTime(prevFrontDo";
parent._lblfrontdoor.setText(_convertdatetime(parent._prevfrontdoorupdatetime)+" "+parent._frontdoorarmedstatus);
 if (true) break;
;
 //BA.debugLineNum = 849;BA.debugLine="For i = 0 To clv.Size-1";

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
 //BA.debugLineNum = 850;BA.debugLine="Dim item As String";
_item = "";
 //BA.debugLineNum = 851;BA.debugLine="item = clv.GetValue(i)";
_item = BA.ObjectToString(_clv._getvalue(_i));
 //BA.debugLineNum = 852;BA.debugLine="If item.Contains(\"thumbnail\") Then";
if (true) break;

case 18:
//if
this.state = 25;
if (_item.contains("thumbnail")) { 
this.state = 20;
}else if(_item.contains("_strength")) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 20:
//C
this.state = 25;
 //BA.debugLineNum = 853;BA.debugLine="clv.ResizeItem(i,80dip)";
_clv._resizeitem(_i,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)));
 if (true) break;

case 22:
//C
this.state = 25;
 //BA.debugLineNum = 855;BA.debugLine="clv.ResizeItem(i,45dip)";
_clv._resizeitem(_i,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (45)));
 if (true) break;

case 24:
//C
this.state = 25;
 //BA.debugLineNum = 857;BA.debugLine="clv.ResizeItem(i,35dip)";
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
 //BA.debugLineNum = 861;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 29:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 863;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 //BA.debugLineNum = 864;BA.debugLine="End Sub";
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

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 645;BA.debugLine="Try";
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
 //BA.debugLineNum = 646;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 647;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 648;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 663;BA.debugLine="commandID = root.Get(\"id\")";
parent._commandid = BA.ObjectToString(_root.Get((Object)("id")));
 //BA.debugLineNum = 664;BA.debugLine="Log(\"commandID: \" & commandID)";
anywheresoftware.b4a.keywords.Common.Log("commandID: "+parent._commandid);
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 //BA.debugLineNum = 686;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 688;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 //BA.debugLineNum = 689;BA.debugLine="End Sub";
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

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 478;BA.debugLine="Dim rs As ResumableSub = GetCommandStatus(respons";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcommandstatus(parent._response);
 //BA.debugLineNum = 479;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_result = (Object) result[0];
;
 //BA.debugLineNum = 480;BA.debugLine="If commandComplete Then";
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
 //BA.debugLineNum = 482;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-\"";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera);
 //BA.debugLineNum = 483;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 20;
return;
case 20:
//C
this.state = 4;
_result = (Object) result[0];
;
 //BA.debugLineNum = 485;BA.debugLine="Dim rs As ResumableSub = GetCameraInfo(response,";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcamerainfo(parent._response,_clv);
 //BA.debugLineNum = 486;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 21;
return;
case 21:
//C
this.state = 4;
_result = (Object) result[0];
;
 //BA.debugLineNum = 488;BA.debugLine="Dim rs As ResumableSub = DownloadImage(\"https://";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _downloadimage("https://rest-"+parent._userregion+".immedia-semi.com/"+parent._camerathumbnail+".jpg",_iv,_camera);
 //BA.debugLineNum = 489;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 22;
return;
case 22:
//C
this.state = 4;
_result = (Object) result[0];
;
 //BA.debugLineNum = 491;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 494;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-\"";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera);
 //BA.debugLineNum = 495;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 23;
return;
case 23:
//C
this.state = 5;
_result = (Object) result[0];
;
 //BA.debugLineNum = 498;BA.debugLine="Dim rs As ResumableSub = GetCameraInfo(response,N";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcamerainfo(parent._response,(b4j.example.customlistview)(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 499;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 24;
return;
case 24:
//C
this.state = 5;
_result = (Object) result[0];
;
 //BA.debugLineNum = 501;BA.debugLine="If prevCameraThumbnail <> \"\" And prevCameraThumbn";
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
 //BA.debugLineNum = 502;BA.debugLine="Log(\"**** ALRIGHT \" & attempts & \"/\" & attemptsA";
anywheresoftware.b4a.keywords.Common.Log("**** ALRIGHT "+_attempts+"/"+_attemptsallowed+" *****");
 //BA.debugLineNum = 503;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-\"";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera);
 //BA.debugLineNum = 504;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 25;
return;
case 25:
//C
this.state = 18;
_result = (Object) result[0];
;
 //BA.debugLineNum = 506;BA.debugLine="Dim rs As ResumableSub = GetCameraInfo(response,";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcamerainfo(parent._response,_clv);
 //BA.debugLineNum = 507;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 26;
return;
case 26:
//C
this.state = 18;
_result = (Object) result[0];
;
 //BA.debugLineNum = 509;BA.debugLine="Dim rs As ResumableSub = DownloadImage(\"https://";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _downloadimage("https://rest-"+parent._userregion+".immedia-semi.com/"+parent._camerathumbnail+".jpg",_iv,_camera);
 //BA.debugLineNum = 510;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 27;
return;
case 27:
//C
this.state = 18;
_result = (Object) result[0];
;
 //BA.debugLineNum = 512;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 514;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 10:
//if
this.state = 17;
if ((_camera).equals("347574")) { 
this.state = 12;
}else if((_camera).equals("236967")) { 
this.state = 14;
}else if((_camera).equals("458236")) { 
this.state = 16;
}if (true) break;

case 12:
//C
this.state = 17;
 //BA.debugLineNum = 515;BA.debugLine="lblStatus.Text = \"Awaiting for the Driveway thu";
parent._lblstatus.setText("Awaiting for the Driveway thumbnail... "+_attempts+"/"+_attemptsallowed);
 if (true) break;

case 14:
//C
this.state = 17;
 //BA.debugLineNum = 517;BA.debugLine="lblStatus.Text = \"Awaiting for the Front Door t";
parent._lblstatus.setText("Awaiting for the Front Door thumbnail...  "+_attempts+"/"+_attemptsallowed);
 if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 519;BA.debugLine="lblStatus.Text = \"Awaiting for the Side Yard th";
parent._lblstatus.setText("Awaiting for the Side Yard thumbnail... "+_attempts+"/"+_attemptsallowed);
 if (true) break;

case 17:
//C
this.state = 18;
;
 //BA.debugLineNum = 521;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 523;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getcommandstatus(String _json) throws Exception{
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

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 692;BA.debugLine="Try";
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
 //BA.debugLineNum = 693;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 694;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 695;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 696;BA.debugLine="commandComplete = root.Get(\"complete\")";
parent._commandcomplete = BA.ObjectToBoolean(_root.Get((Object)("complete")));
 //BA.debugLineNum = 697;BA.debugLine="Log(\"commandComplete: \" & commandComplete)";
anywheresoftware.b4a.keywords.Common.Log("commandComplete: "+BA.ObjectToString(parent._commandcomplete));
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 //BA.debugLineNum = 699;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 701;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 //BA.debugLineNum = 702;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _gethomescreen(String _json) throws Exception{
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

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 924;BA.debugLine="Try";
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
 //BA.debugLineNum = 925;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 926;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 927;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 928;BA.debugLine="Dim devices As List = root.Get(\"devices\")";
_devices = new anywheresoftware.b4a.objects.collections.List();
_devices.setObject((java.util.List)(_root.Get((Object)("devices"))));
 //BA.debugLineNum = 929;BA.debugLine="For Each coldevices As Map In devices";
if (true) break;

case 4:
//for
this.state = 90;
_coldevices = new anywheresoftware.b4a.objects.collections.Map();
group6 = _devices;
index6 = 0;
groupLen6 = group6.getSize();
this.state = 98;
if (true) break;

case 98:
//C
this.state = 90;
if (index6 < groupLen6) {
this.state = 6;
_coldevices.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group6.Get(index6)));}
if (true) break;

case 99:
//C
this.state = 98;
index6++;
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 930;BA.debugLine="Dim battery_state As String = coldevices.Get(\"b";
_battery_state = BA.ObjectToString(_coldevices.Get((Object)("battery_state")));
 //BA.debugLineNum = 934;BA.debugLine="Dim device_id As Int = coldevices.Get(\"device_i";
_device_id = (int)(BA.ObjectToNumber(_coldevices.Get((Object)("device_id"))));
 //BA.debugLineNum = 937;BA.debugLine="Dim active As String = coldevices.Get(\"active\")";
_active = BA.ObjectToString(_coldevices.Get((Object)("active")));
 //BA.debugLineNum = 940;BA.debugLine="Dim battery As Int = coldevices.Get(\"battery\")";
_battery = (int)(BA.ObjectToNumber(_coldevices.Get((Object)("battery"))));
 //BA.debugLineNum = 941;BA.debugLine="Dim enabled As String = coldevices.Get(\"enabled";
_enabled = BA.ObjectToString(_coldevices.Get((Object)("enabled")));
 //BA.debugLineNum = 949;BA.debugLine="Dim status As String = coldevices.Get(\"status\")";
_status = BA.ObjectToString(_coldevices.Get((Object)("status")));
 //BA.debugLineNum = 951;BA.debugLine="If device_id = \"347574\" Then";
if (true) break;

case 7:
//if
this.state = 89;
if (_device_id==(double)(Double.parseDouble("347574"))) { 
this.state = 9;
}else if(_device_id==(double)(Double.parseDouble("236967"))) { 
this.state = 36;
}else if(_device_id==(double)(Double.parseDouble("458236"))) { 
this.state = 63;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 952;BA.debugLine="If battery > 1 And battery_state = \"ok\" Then";
if (true) break;

case 10:
//if
this.state = 31;
if (_battery>1 && (_battery_state).equals("ok")) { 
this.state = 12;
}else {
this.state = 26;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 953;BA.debugLine="If active = \"armed\" Then";
if (true) break;

case 13:
//if
this.state = 24;
if ((_active).equals("armed")) { 
this.state = 15;
}else {
this.state = 23;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 954;BA.debugLine="If enabled = \"true\" Then";
if (true) break;

case 16:
//if
this.state = 21;
if ((_enabled).equals("true")) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
 //BA.debugLineNum = 955;BA.debugLine="drivewayArmedStatus = \"[Level \" & battery &";
parent._drivewayarmedstatus = "[Level "+BA.NumberToString(_battery)+" - "+_battery_state.toUpperCase()+"]";
 //BA.debugLineNum = 956;BA.debugLine="lblDriveway.Style = \"\"";
parent._lbldriveway.setStyle("");
 if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 958;BA.debugLine="drivewayArmedStatus = \"MOTION DETECTION IS";
parent._drivewayarmedstatus = "MOTION DETECTION IS DISABLED!";
 //BA.debugLineNum = 959;BA.debugLine="lblDriveway.Style = \"-fx-effect: dropshadow";
parent._lbldriveway.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
 //BA.debugLineNum = 962;BA.debugLine="drivewayArmedStatus = \"NOT ARMED!\"";
parent._drivewayarmedstatus = "NOT ARMED!";
 //BA.debugLineNum = 963;BA.debugLine="lblDriveway.Style = \"-fx-effect: dropshadow(";
parent._lbldriveway.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 if (true) break;

case 24:
//C
this.state = 31;
;
 if (true) break;

case 26:
//C
this.state = 27;
 //BA.debugLineNum = 966;BA.debugLine="drivewayArmedStatus = \"[Level \" & battery & \"";
parent._drivewayarmedstatus = "[Level "+BA.NumberToString(_battery)+" - "+_battery_state.toUpperCase()+"]";
 //BA.debugLineNum = 967;BA.debugLine="If drivewayArmedStatus = \"[Level 1 - LOW]\" Th";
if (true) break;

case 27:
//if
this.state = 30;
if ((parent._drivewayarmedstatus).equals("[Level 1 - LOW]")) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 //BA.debugLineNum = 968;BA.debugLine="drivewayArmedStatus = \"[REPLACE]\"";
parent._drivewayarmedstatus = "[REPLACE]";
 if (true) break;

case 30:
//C
this.state = 31;
;
 //BA.debugLineNum = 970;BA.debugLine="lblDriveway.Style = \"-fx-effect: dropshadow(";
parent._lbldriveway.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 if (true) break;
;
 //BA.debugLineNum = 972;BA.debugLine="If status = \"offline\" Then";

case 31:
//if
this.state = 34;
if ((_status).equals("offline")) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 //BA.debugLineNum = 973;BA.debugLine="drivewayArmedStatus = \"[Level \" & battery & \"";
parent._drivewayarmedstatus = "[Level "+BA.NumberToString(_battery)+" - "+_battery_state.toUpperCase()+" OFFLINE]";
 //BA.debugLineNum = 974;BA.debugLine="lblDriveway.Style = \"-fx-effect: dropshadow(";
parent._lbldriveway.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 //BA.debugLineNum = 975;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
_bluriv("Driveway.jpg",parent._ivdriveway);
 if (true) break;

case 34:
//C
this.state = 89;
;
 if (true) break;

case 36:
//C
this.state = 37;
 //BA.debugLineNum = 978;BA.debugLine="If battery > 1 And battery_state = \"ok\" Then";
if (true) break;

case 37:
//if
this.state = 58;
if (_battery>1 && (_battery_state).equals("ok")) { 
this.state = 39;
}else {
this.state = 53;
}if (true) break;

case 39:
//C
this.state = 40;
 //BA.debugLineNum = 979;BA.debugLine="If active = \"armed\" Then";
if (true) break;

case 40:
//if
this.state = 51;
if ((_active).equals("armed")) { 
this.state = 42;
}else {
this.state = 50;
}if (true) break;

case 42:
//C
this.state = 43;
 //BA.debugLineNum = 980;BA.debugLine="If enabled = \"true\" Then";
if (true) break;

case 43:
//if
this.state = 48;
if ((_enabled).equals("true")) { 
this.state = 45;
}else {
this.state = 47;
}if (true) break;

case 45:
//C
this.state = 48;
 //BA.debugLineNum = 981;BA.debugLine="frontdoorArmedStatus = \"[Level \" & battery";
parent._frontdoorarmedstatus = "[Level "+BA.NumberToString(_battery)+" - "+_battery_state.toUpperCase()+"]";
 //BA.debugLineNum = 982;BA.debugLine="lblFrontDoor.Style = \"\"";
parent._lblfrontdoor.setStyle("");
 if (true) break;

case 47:
//C
this.state = 48;
 //BA.debugLineNum = 984;BA.debugLine="frontdoorArmedStatus = \"MOTION DETECTION IS";
parent._frontdoorarmedstatus = "MOTION DETECTION IS DISABLED!";
 //BA.debugLineNum = 985;BA.debugLine="lblFrontDoor.Style = \"-fx-effect: dropshado";
parent._lblfrontdoor.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 if (true) break;

case 48:
//C
this.state = 51;
;
 if (true) break;

case 50:
//C
this.state = 51;
 //BA.debugLineNum = 988;BA.debugLine="frontdoorArmedStatus = \"NOT ARMED!\"";
parent._frontdoorarmedstatus = "NOT ARMED!";
 //BA.debugLineNum = 989;BA.debugLine="lblFrontDoor.Style = \"-fx-effect: dropshadow";
parent._lblfrontdoor.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 if (true) break;

case 51:
//C
this.state = 58;
;
 if (true) break;

case 53:
//C
this.state = 54;
 //BA.debugLineNum = 992;BA.debugLine="frontdoorArmedStatus = \"[Level \" & battery &";
parent._frontdoorarmedstatus = "[Level "+BA.NumberToString(_battery)+" - "+_battery_state.toUpperCase()+"]";
 //BA.debugLineNum = 993;BA.debugLine="If frontdoorArmedStatus = \"[Level 1 - LOW]\" T";
if (true) break;

case 54:
//if
this.state = 57;
if ((parent._frontdoorarmedstatus).equals("[Level 1 - LOW]")) { 
this.state = 56;
}if (true) break;

case 56:
//C
this.state = 57;
 //BA.debugLineNum = 994;BA.debugLine="frontdoorArmedStatus = \"[REPLACE]\"";
parent._frontdoorarmedstatus = "[REPLACE]";
 if (true) break;

case 57:
//C
this.state = 58;
;
 //BA.debugLineNum = 996;BA.debugLine="lblFrontDoor.Style = \"-fx-effect: dropshadow(";
parent._lblfrontdoor.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 if (true) break;
;
 //BA.debugLineNum = 998;BA.debugLine="If status = \"offline\" Then";

case 58:
//if
this.state = 61;
if ((_status).equals("offline")) { 
this.state = 60;
}if (true) break;

case 60:
//C
this.state = 61;
 //BA.debugLineNum = 999;BA.debugLine="frontdoorArmedStatus = \"[Level \" & battery &";
parent._frontdoorarmedstatus = "[Level "+BA.NumberToString(_battery)+" - "+_battery_state.toUpperCase()+" OFFLINE]";
 //BA.debugLineNum = 1000;BA.debugLine="lblFrontDoor.Style = \"-fx-effect: dropshadow(";
parent._lblfrontdoor.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 //BA.debugLineNum = 1001;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
_bluriv("FrontDoor.jpg",parent._ivfrontdoor);
 if (true) break;

case 61:
//C
this.state = 89;
;
 if (true) break;

case 63:
//C
this.state = 64;
 //BA.debugLineNum = 1004;BA.debugLine="If battery > 1 And battery_state = \"ok\" Then";
if (true) break;

case 64:
//if
this.state = 85;
if (_battery>1 && (_battery_state).equals("ok")) { 
this.state = 66;
}else {
this.state = 80;
}if (true) break;

case 66:
//C
this.state = 67;
 //BA.debugLineNum = 1005;BA.debugLine="If active = \"armed\" Then";
if (true) break;

case 67:
//if
this.state = 78;
if ((_active).equals("armed")) { 
this.state = 69;
}else {
this.state = 77;
}if (true) break;

case 69:
//C
this.state = 70;
 //BA.debugLineNum = 1006;BA.debugLine="If enabled = \"true\" Then";
if (true) break;

case 70:
//if
this.state = 75;
if ((_enabled).equals("true")) { 
this.state = 72;
}else {
this.state = 74;
}if (true) break;

case 72:
//C
this.state = 75;
 //BA.debugLineNum = 1007;BA.debugLine="sideyardArmedStatus = \"[Level \" & battery &";
parent._sideyardarmedstatus = "[Level "+BA.NumberToString(_battery)+" - "+_battery_state.toUpperCase()+"]";
 //BA.debugLineNum = 1008;BA.debugLine="lblSideYard.Style = \"\"";
parent._lblsideyard.setStyle("");
 if (true) break;

case 74:
//C
this.state = 75;
 //BA.debugLineNum = 1010;BA.debugLine="sideyardArmedStatus = \"MOTION DETECTION IS";
parent._sideyardarmedstatus = "MOTION DETECTION IS DISABLED!";
 //BA.debugLineNum = 1011;BA.debugLine="lblSideYard.Style = \"-fx-effect: dropshadow";
parent._lblsideyard.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 if (true) break;

case 75:
//C
this.state = 78;
;
 if (true) break;

case 77:
//C
this.state = 78;
 //BA.debugLineNum = 1014;BA.debugLine="sideyardArmedStatus = \"NOT ARMED!\"";
parent._sideyardarmedstatus = "NOT ARMED!";
 //BA.debugLineNum = 1015;BA.debugLine="lblSideYard.Style = \"-fx-effect: dropshadow(";
parent._lblsideyard.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 if (true) break;

case 78:
//C
this.state = 85;
;
 if (true) break;

case 80:
//C
this.state = 81;
 //BA.debugLineNum = 1018;BA.debugLine="sideyardArmedStatus = \"[Level \" & battery & \"";
parent._sideyardarmedstatus = "[Level "+BA.NumberToString(_battery)+" - "+_battery_state.toUpperCase()+"]";
 //BA.debugLineNum = 1019;BA.debugLine="If sideyardArmedStatus = \"[Level 1 - LOW]\" Th";
if (true) break;

case 81:
//if
this.state = 84;
if ((parent._sideyardarmedstatus).equals("[Level 1 - LOW]")) { 
this.state = 83;
}if (true) break;

case 83:
//C
this.state = 84;
 //BA.debugLineNum = 1020;BA.debugLine="sideyardArmedStatus = \"[REPLACE]\"";
parent._sideyardarmedstatus = "[REPLACE]";
 if (true) break;

case 84:
//C
this.state = 85;
;
 //BA.debugLineNum = 1022;BA.debugLine="lblSideYard.Style = \"-fx-effect: dropshadow(";
parent._lblsideyard.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 if (true) break;
;
 //BA.debugLineNum = 1024;BA.debugLine="If status = \"offline\" Then";

case 85:
//if
this.state = 88;
if ((_status).equals("offline")) { 
this.state = 87;
}if (true) break;

case 87:
//C
this.state = 88;
 //BA.debugLineNum = 1025;BA.debugLine="sideyardArmedStatus = \"[Level \" & battery & \"";
parent._sideyardarmedstatus = "[Level "+BA.NumberToString(_battery)+" - "+_battery_state.toUpperCase()+" OFFLINE]";
 //BA.debugLineNum = 1026;BA.debugLine="lblSideYard.Style = \"-fx-effect: dropshadow(";
parent._lblsideyard.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 //BA.debugLineNum = 1027;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
_bluriv("SideYard.jpg",parent._ivsideyard);
 if (true) break;

case 88:
//C
this.state = 89;
;
 if (true) break;

case 89:
//C
this.state = 99;
;
 if (true) break;
if (true) break;

case 90:
//C
this.state = 91;
;
 //BA.debugLineNum = 1034;BA.debugLine="Dim network As Map = root.Get(\"network\")";
_network = new anywheresoftware.b4a.objects.collections.Map();
_network.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("network"))));
 //BA.debugLineNum = 1038;BA.debugLine="Dim armedNetwork As String = network.Get(\"armed\"";
_armednetwork = BA.ObjectToString(_network.Get((Object)("armed")));
 //BA.debugLineNum = 1044;BA.debugLine="If armedNetwork <> \"true\" Then";
if (true) break;

case 91:
//if
this.state = 94;
if ((_armednetwork).equals("true") == false) { 
this.state = 93;
}if (true) break;

case 93:
//C
this.state = 94;
 //BA.debugLineNum = 1045;BA.debugLine="drivewayArmedStatus = \"SYSTEM NOT ARMED!\"";
parent._drivewayarmedstatus = "SYSTEM NOT ARMED!";
 //BA.debugLineNum = 1046;BA.debugLine="lblDriveway.Style = \"-fx-effect: dropshadow( ga";
parent._lbldriveway.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 //BA.debugLineNum = 1048;BA.debugLine="frontdoorArmedStatus = \"SYSTEM NOT ARMED!\"";
parent._frontdoorarmedstatus = "SYSTEM NOT ARMED!";
 //BA.debugLineNum = 1049;BA.debugLine="lblFrontDoor.Style = \"-fx-effect: dropshadow( g";
parent._lblfrontdoor.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 //BA.debugLineNum = 1051;BA.debugLine="sideyardArmedStatus = \"SYSTEM NOT ARMED!\"";
parent._sideyardarmedstatus = "SYSTEM NOT ARMED!";
 //BA.debugLineNum = 1052;BA.debugLine="lblSideYard.Style = \"-fx-effect: dropshadow( ga";
parent._lblsideyard.setStyle("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );");
 if (true) break;

case 94:
//C
this.state = 97;
;
 if (true) break;

case 96:
//C
this.state = 97;
this.catchState = 0;
 //BA.debugLineNum = 1055;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 97:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 1057;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 //BA.debugLineNum = 1058;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 1375;BA.debugLine="Sub GetLiveView(json As String) As String 'ignore";
 //BA.debugLineNum = 1376;BA.debugLine="Try";
try { //BA.debugLineNum = 1377;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 1378;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 1379;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 1380;BA.debugLine="Dim duration As Int = root.Get(\"duration\") 'igno";
_duration = (int)(BA.ObjectToNumber(_root.Get((Object)("duration"))));
 //BA.debugLineNum = 1381;BA.debugLine="Dim server As String = root.Get(\"server\")";
_server = BA.ObjectToString(_root.Get((Object)("server")));
 //BA.debugLineNum = 1382;BA.debugLine="Dim device_name As String = root.Get(\"device_nam";
_device_name = BA.ObjectToString(_root.Get((Object)("device_name")));
 //BA.debugLineNum = 1383;BA.debugLine="Dim network_id As Int = root.Get(\"network_id\") '";
_network_id = (int)(BA.ObjectToNumber(_root.Get((Object)("network_id"))));
 //BA.debugLineNum = 1384;BA.debugLine="Dim continue_interval As Int = root.Get(\"continu";
_continue_interval = (int)(BA.ObjectToNumber(_root.Get((Object)("continue_interval"))));
 //BA.debugLineNum = 1385;BA.debugLine="Dim continue_warning As Int = root.Get(\"continue";
_continue_warning = (int)(BA.ObjectToNumber(_root.Get((Object)("continue_warning"))));
 //BA.debugLineNum = 1386;BA.debugLine="Dim id As Int = root.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_root.Get((Object)("id"))));
 //BA.debugLineNum = 1387;BA.debugLine="Dim submit_logs As String = root.Get(\"submit_log";
_submit_logs = BA.ObjectToString(_root.Get((Object)("submit_logs")));
 //BA.debugLineNum = 1388;BA.debugLine="Dim camera_name As String = root.Get(\"camera_nam";
_camera_name = BA.ObjectToString(_root.Get((Object)("camera_name")));
 //BA.debugLineNum = 1389;BA.debugLine="Dim lv_save As String = root.Get(\"lv_save\") 'ign";
_lv_save = BA.ObjectToString(_root.Get((Object)("lv_save")));
 //BA.debugLineNum = 1390;BA.debugLine="Log(\"Liveview: \" & server)";
anywheresoftware.b4a.keywords.Common.Log("Liveview: "+_server);
 } 
       catch (Exception e17) {
			ba.setLastException(e17); //BA.debugLineNum = 1395;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1397;BA.debugLine="Return id";
if (true) return BA.NumberToString(_id);
 //BA.debugLineNum = 1398;BA.debugLine="End Sub";
return "";
}
public static String  _getresterror(String _json) throws Exception{
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
int _code = 0;
String _message = "";
 //BA.debugLineNum = 704;BA.debugLine="Sub GetRESTError(json As String) As String";
 //BA.debugLineNum = 705;BA.debugLine="Try";
try { //BA.debugLineNum = 709;BA.debugLine="If json.Contains(\"<h1>Not Found</h1>\") Then";
if (_json.contains("<h1>Not Found</h1>")) { 
 //BA.debugLineNum = 710;BA.debugLine="Return \"REST endpoint URL not found. Try again.";
if (true) return "REST endpoint URL not found. Try again.";
 }else {
 //BA.debugLineNum = 712;BA.debugLine="If json.IndexOf(\"{\") <> -1 Then";
if (_json.indexOf("{")!=-1) { 
 //BA.debugLineNum = 713;BA.debugLine="json = json.SubString(json.IndexOf(\"{\"))";
_json = _json.substring(_json.indexOf("{"));
 //BA.debugLineNum = 714;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 715;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 716;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 717;BA.debugLine="Dim code As Int = root.Get(\"code\")";
_code = (int)(BA.ObjectToNumber(_root.Get((Object)("code"))));
 //BA.debugLineNum = 718;BA.debugLine="Dim message As String = root.Get(\"message\")";
_message = BA.ObjectToString(_root.Get((Object)("message")));
 //BA.debugLineNum = 719;BA.debugLine="Log(\"Code: \" & code & \" Message: \" & message)";
anywheresoftware.b4a.keywords.Common.Log("Code: "+BA.NumberToString(_code)+" Message: "+_message);
 //BA.debugLineNum = 720;BA.debugLine="Return \"Code: \" & code & \" Message: \" & messag";
if (true) return "Code: "+BA.NumberToString(_code)+" Message: "+_message;
 }else {
 //BA.debugLineNum = 722;BA.debugLine="Return json";
if (true) return _json;
 };
 };
 } 
       catch (Exception e19) {
			ba.setLastException(e19); //BA.debugLineNum = 726;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 727;BA.debugLine="Return json";
if (true) return _json;
 };
 //BA.debugLineNum = 729;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getsyncmoduleinfo(String _json) throws Exception{
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

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 867;BA.debugLine="Try";
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
 //BA.debugLineNum = 868;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 869;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 870;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 871;BA.debugLine="Dim syncmodule As Map = root.Get(\"syncmodule\")";
_syncmodule = new anywheresoftware.b4a.objects.collections.Map();
_syncmodule.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("syncmodule"))));
 //BA.debugLineNum = 875;BA.debugLine="Dim wifi_strength As Int = syncmodule.Get(\"wifi_";
_wifi_strength = (int)(BA.ObjectToNumber(_syncmodule.Get((Object)("wifi_strength"))));
 //BA.debugLineNum = 876;BA.debugLine="Dim os_version As String = syncmodule.Get(\"os_ve";
_os_version = BA.ObjectToString(_syncmodule.Get((Object)("os_version")));
 //BA.debugLineNum = 893;BA.debugLine="Dim fw_version As String = syncmodule.Get(\"fw_ve";
_fw_version = BA.ObjectToString(_syncmodule.Get((Object)("fw_version")));
 //BA.debugLineNum = 895;BA.debugLine="Dim status As String = syncmodule.Get(\"status\")";
_status = BA.ObjectToString(_syncmodule.Get((Object)("status")));
 //BA.debugLineNum = 896;BA.debugLine="lblSyncModule.Text = \"Sync Module is \" & status";
parent._lblsyncmodule.setText("Sync Module is "+_status+anywheresoftware.b4a.keywords.Common.CRLF+"Wifi Strength: "+BA.NumberToString(_wifi_strength)+" bars"+anywheresoftware.b4a.keywords.Common.CRLF+"Firmware version: "+_fw_version+anywheresoftware.b4a.keywords.Common.CRLF+"OS version: "+_os_version);
 //BA.debugLineNum = 898;BA.debugLine="If status = \"online\" Then";
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
 //BA.debugLineNum = 899;BA.debugLine="ivSyncModule.SetImage(fx.LoadImage(File.DirAsse";
parent._ivsyncmodule.SetImage((javafx.scene.image.Image)(parent._fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"systemstatusonline.png").getObject()));
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 901;BA.debugLine="ivSyncModule.SetImage(fx.LoadImage(File.DirAsse";
parent._ivsyncmodule.SetImage((javafx.scene.image.Image)(parent._fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"systemstatusoffline.png").getObject()));
 if (true) break;
;
 //BA.debugLineNum = 904;BA.debugLine="If wifi_strength = \"5\" Then";

case 9:
//if
this.state = 22;
if (_wifi_strength==(double)(Double.parseDouble("5"))) { 
this.state = 11;
}else if(_wifi_strength==(double)(Double.parseDouble("4"))) { 
this.state = 13;
}else if(_wifi_strength==(double)(Double.parseDouble("3"))) { 
this.state = 15;
}else if(_wifi_strength==(double)(Double.parseDouble("2"))) { 
this.state = 17;
}else if(_wifi_strength==(double)(Double.parseDouble("1"))) { 
this.state = 19;
}else {
this.state = 21;
}if (true) break;

case 11:
//C
this.state = 22;
 //BA.debugLineNum = 905;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
parent._ivsyncmodulewifi.SetImage((javafx.scene.image.Image)(parent._fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bars5blue.png").getObject()));
 if (true) break;

case 13:
//C
this.state = 22;
 //BA.debugLineNum = 907;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
parent._ivsyncmodulewifi.SetImage((javafx.scene.image.Image)(parent._fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bars4blue.png").getObject()));
 if (true) break;

case 15:
//C
this.state = 22;
 //BA.debugLineNum = 909;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
parent._ivsyncmodulewifi.SetImage((javafx.scene.image.Image)(parent._fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bars3blue.png").getObject()));
 if (true) break;

case 17:
//C
this.state = 22;
 //BA.debugLineNum = 911;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
parent._ivsyncmodulewifi.SetImage((javafx.scene.image.Image)(parent._fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bars2blue.png").getObject()));
 if (true) break;

case 19:
//C
this.state = 22;
 //BA.debugLineNum = 913;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
parent._ivsyncmodulewifi.SetImage((javafx.scene.image.Image)(parent._fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bars1blue.png").getObject()));
 if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 915;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
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
 //BA.debugLineNum = 918;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 25:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 920;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 //BA.debugLineNum = 921;BA.debugLine="End Sub";
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
String _videoid = "";
Object _mytypes = null;
cloyd.blink.frmactivity._videoinfo _videos = null;
anywheresoftware.b4a.BA.IterableList group11;
int index11;
int groupLen11;

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
 //BA.debugLineNum = 1817;BA.debugLine="Try";
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
 //BA.debugLineNum = 1818;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-\"";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/api/v1/accounts/88438/media/changed?since=-999999999-01-01T00:00:00+18:00&page=1");
 //BA.debugLineNum = 1819;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 15;
return;
case 15:
//C
this.state = 4;
_result = (Object) result[0];
;
 //BA.debugLineNum = 1821;BA.debugLine="Dim unwatchedVideoCount As Int = 0";
_unwatchedvideocount = (int) (0);
 //BA.debugLineNum = 1822;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 1823;BA.debugLine="parser.Initialize(response)";
_parser.Initialize(parent._response);
 //BA.debugLineNum = 1824;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 1825;BA.debugLine="Dim media As List = root.Get(\"media\")";
_media = new anywheresoftware.b4a.objects.collections.List();
_media.setObject((java.util.List)(_root.Get((Object)("media"))));
 //BA.debugLineNum = 1826;BA.debugLine="kvs.Initialize(File.DirApp, \"datastore\")";
parent._kvs._initialize /*String*/ (ba,anywheresoftware.b4a.keywords.Common.File.getDirApp(),"datastore");
 //BA.debugLineNum = 1827;BA.debugLine="Dim n As Long = DateTime.Now";
_n = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 1828;BA.debugLine="For Each colmedia As Map In media";
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
_colmedia.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group11.Get(index11)));}
if (true) break;

case 17:
//C
this.state = 16;
index11++;
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 1829;BA.debugLine="Dim watched As String = colmedia.Get(\"watched\")";
_watched = BA.ObjectToString(_colmedia.Get((Object)("watched")));
 //BA.debugLineNum = 1830;BA.debugLine="Dim VideoID As String = colmedia.Get(\"id\")";
_videoid = BA.ObjectToString(_colmedia.Get((Object)("id")));
 //BA.debugLineNum = 1831;BA.debugLine="Dim mytypes As Object = kvs.Get(VideoID)";
_mytypes = parent._kvs._get /*Object*/ (_videoid);
 //BA.debugLineNum = 1832;BA.debugLine="Dim videos = mytypes As VideoInfo";
_videos = (cloyd.blink.frmactivity._videoinfo)(_mytypes);
 //BA.debugLineNum = 1833;BA.debugLine="If videos = Null Or watched = False Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_videos== null || (_watched).equals(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 1834;BA.debugLine="unwatchedVideoCount = unwatchedVideoCount + 1";
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
 //BA.debugLineNum = 1837;BA.debugLine="Log(\"Loading unwatched videos took: \" & (DateTim";
anywheresoftware.b4a.keywords.Common.Log("Loading unwatched videos took: "+BA.NumberToString((anywheresoftware.b4a.keywords.Common.DateTime.getNow()-_n))+"ms");
 //BA.debugLineNum = 1838;BA.debugLine="badger1.SetBadge(btnActivity, unwatchedVideoCoun";
parent._badger1._setbadge /*String*/ ((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._btnactivity.getObject())),_unwatchedvideocount);
 if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
 //BA.debugLineNum = 1840;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 1842;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
 //BA.debugLineNum = 1843;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 //BA.debugLineNum = 1844;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 1100;BA.debugLine="Private Sub ivClose_MouseClicked (EventData As Mou";
 //BA.debugLineNum = 1101;BA.debugLine="File.Delete(File.DirApp, \"Driveway.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Driveway.jpg");
 //BA.debugLineNum = 1102;BA.debugLine="File.Delete(File.DirApp, \"FrontDoor.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"FrontDoor.jpg");
 //BA.debugLineNum = 1103;BA.debugLine="File.Delete(File.DirApp, \"SideYard.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"SideYard.jpg");
 //BA.debugLineNum = 1104;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"screenshot.jpg");
 //BA.debugLineNum = 1105;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"media.mp4");
 //BA.debugLineNum = 1106;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 1107;BA.debugLine="End Sub";
return "";
}
public static String  _ivdriveway_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
cloyd.blink.frmmedia _mf = null;
 //BA.debugLineNum = 1247;BA.debugLine="Sub ivDriveway_MouseClicked (EventData As MouseEve";
 //BA.debugLineNum = 1248;BA.debugLine="Dim mf As frmMedia";
_mf = new cloyd.blink.frmmedia();
 //BA.debugLineNum = 1249;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (ba,_mainform);
 //BA.debugLineNum = 1250;BA.debugLine="mf.timestamp = lblDriveway.Text";
_mf._timestamp /*String*/  = _lbldriveway.getText();
 //BA.debugLineNum = 1251;BA.debugLine="mf.url=$\" 	   <h1>${lblDriveway.Text}</h1> 	   <i";
_mf._url /*String*/  = ("\n"+"	   <h1>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbldriveway.getText()))+"</h1>\n"+"	   <img src=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Driveway.jpg")))+"\"/>\n"+"	\n"+"	");
 //BA.debugLineNum = 1256;BA.debugLine="mf.Show";
_mf._show /*String*/ ();
 //BA.debugLineNum = 1257;BA.debugLine="Return";
if (true) return "";
 //BA.debugLineNum = 1373;BA.debugLine="End Sub";
return "";
}
public static String  _ivfrontdoor_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
cloyd.blink.frmmedia _mf = null;
 //BA.debugLineNum = 1400;BA.debugLine="Sub ivFrontDoor_MouseClicked (EventData As MouseEv";
 //BA.debugLineNum = 1401;BA.debugLine="Dim mf As frmMedia";
_mf = new cloyd.blink.frmmedia();
 //BA.debugLineNum = 1402;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (ba,_mainform);
 //BA.debugLineNum = 1403;BA.debugLine="mf.timestamp = lblFrontDoor.Text";
_mf._timestamp /*String*/  = _lblfrontdoor.getText();
 //BA.debugLineNum = 1404;BA.debugLine="mf.url=$\"    <h1>${lblFrontDoor.Text}</h1>    <im";
_mf._url /*String*/  = ("\n"+"   <h1>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lblfrontdoor.getText()))+"</h1>\n"+"   <img src=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"FrontDoor.jpg")))+"\"/>\n"+"   \n"+"");
 //BA.debugLineNum = 1409;BA.debugLine="mf.Show";
_mf._show /*String*/ ();
 //BA.debugLineNum = 1410;BA.debugLine="End Sub";
return "";
}
public static String  _ivmax_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 1133;BA.debugLine="Private Sub ivMax_MouseClicked (EventData As Mouse";
 //BA.debugLineNum = 1135;BA.debugLine="End Sub";
return "";
}
public static String  _ivmin_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
anywheresoftware.b4j.object.JavaObject _jmf = null;
anywheresoftware.b4j.object.JavaObject _stage = null;
 //BA.debugLineNum = 1153;BA.debugLine="Private Sub ivMin_MouseClicked (EventData As Mouse";
 //BA.debugLineNum = 1154;BA.debugLine="Try";
try { //BA.debugLineNum = 1155;BA.debugLine="Dim jmf As JavaObject = MainForm";
_jmf = new anywheresoftware.b4j.object.JavaObject();
_jmf.setObject((java.lang.Object)(_mainform));
 //BA.debugLineNum = 1156;BA.debugLine="Dim stage As JavaObject = jmf.GetField(\"stage\")";
_stage = new anywheresoftware.b4j.object.JavaObject();
_stage.setObject((java.lang.Object)(_jmf.GetField("stage")));
 //BA.debugLineNum = 1157;BA.debugLine="stage.RunMethod(\"setIconified\", Array As Object(";
_stage.RunMethod("setIconified",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.True)});
 } 
       catch (Exception e6) {
			ba.setLastException(e6); //BA.debugLineNum = 1159;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1161;BA.debugLine="End Sub";
return "";
}
public static String  _ivsideyard_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
cloyd.blink.frmmedia _mf = null;
 //BA.debugLineNum = 1412;BA.debugLine="Sub ivSideYard_MouseClicked (EventData As MouseEve";
 //BA.debugLineNum = 1413;BA.debugLine="Dim mf As frmMedia";
_mf = new cloyd.blink.frmmedia();
 //BA.debugLineNum = 1414;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (ba,_mainform);
 //BA.debugLineNum = 1415;BA.debugLine="mf.timestamp = lblSideYard.Text";
_mf._timestamp /*String*/  = _lblsideyard.getText();
 //BA.debugLineNum = 1416;BA.debugLine="mf.url=$\"    <h1>${lblSideYard.Text}</h1>    <img";
_mf._url /*String*/  = ("\n"+"   <h1>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lblsideyard.getText()))+"</h1>\n"+"   <img src=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"SideYard.jpg")))+"\"/>\n"+"   \n"+"");
 //BA.debugLineNum = 1421;BA.debugLine="mf.Show";
_mf._show /*String*/ ();
 //BA.debugLineNum = 1422;BA.debugLine="End Sub";
return "";
}
public static String  _lbtitle_mousedragged(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 1080;BA.debugLine="Private Sub lbTitle_MouseDragged (EventData As Mou";
 //BA.debugLineNum = 1081;BA.debugLine="Try";
try { //BA.debugLineNum = 1082;BA.debugLine="If isMaximized Then Return";
if (_ismaximized) { 
if (true) return "";};
 //BA.debugLineNum = 1083;BA.debugLine="Dim jo As JavaObject = EventData";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_eventdata.getObject()));
 //BA.debugLineNum = 1084;BA.debugLine="MainForm.WindowLeft = jo.RunMethod(\"getScreenX\",";
_mainform.setWindowLeft((double)(BA.ObjectToNumber(_jo.RunMethod("getScreenX",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))-_xmouse);
 //BA.debugLineNum = 1085;BA.debugLine="MainForm.WindowTop = jo.RunMethod(\"getScreenY\",";
_mainform.setWindowTop((double)(BA.ObjectToNumber(_jo.RunMethod("getScreenY",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))-_ymouse);
 } 
       catch (Exception e7) {
			ba.setLastException(e7); //BA.debugLineNum = 1087;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1089;BA.debugLine="End Sub";
return "";
}
public static String  _lbtitle_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 1091;BA.debugLine="Private Sub lbTitle_MousePressed (EventData As Mou";
 //BA.debugLineNum = 1092;BA.debugLine="Try";
try { //BA.debugLineNum = 1093;BA.debugLine="xMouse = EventData.X + lbTitle.Left + 15";
_xmouse = _eventdata.getX()+_lbtitle.getLeft()+15;
 //BA.debugLineNum = 1094;BA.debugLine="yMouse = EventData.Y + lbTitle.Top + 15";
_ymouse = _eventdata.getY()+_lbtitle.getTop()+15;
 } 
       catch (Exception e5) {
			ba.setLastException(e5); //BA.debugLineNum = 1096;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1098;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_closerequest(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 1109;BA.debugLine="Sub MainForm_CloseRequest (EventData As Event)";
 //BA.debugLineNum = 1110;BA.debugLine="File.Delete(File.DirApp, \"Driveway.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Driveway.jpg");
 //BA.debugLineNum = 1111;BA.debugLine="File.Delete(File.DirApp, \"FrontDoor.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"FrontDoor.jpg");
 //BA.debugLineNum = 1112;BA.debugLine="File.Delete(File.DirApp, \"SideYard.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"SideYard.jpg");
 //BA.debugLineNum = 1113;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"screenshot.jpg");
 //BA.debugLineNum = 1114;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"media.mp4");
 //BA.debugLineNum = 1115;BA.debugLine="End Sub";
return "";
}
public static String  _max_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 1137;BA.debugLine="Private Sub Max_Entered_Event(e As Event)";
 //BA.debugLineNum = 1138;BA.debugLine="Try";
try { //BA.debugLineNum = 1139;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmax.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMaxEnt.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 1141;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1143;BA.debugLine="End Sub";
return "";
}
public static String  _max_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 1145;BA.debugLine="Private Sub Max_Exited_Event(e As Event)";
 //BA.debugLineNum = 1146;BA.debugLine="Try";
try { //BA.debugLineNum = 1147;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmax.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMax.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 1149;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1151;BA.debugLine="End Sub";
return "";
}
public static String  _min_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 1163;BA.debugLine="Private Sub Min_Entered_Event(e As Event)";
 //BA.debugLineNum = 1164;BA.debugLine="Try";
try { //BA.debugLineNum = 1165;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmin.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMinEnt.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 1167;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1169;BA.debugLine="End Sub";
return "";
}
public static String  _min_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 1171;BA.debugLine="Private Sub Min_Exited_Event(e As Event)";
 //BA.debugLineNum = 1172;BA.debugLine="Try";
try { //BA.debugLineNum = 1173;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmin.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMin.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 1175;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1177;BA.debugLine="End Sub";
return "";
}
public static long  _parseutcstring(String _utc) throws Exception{
String _df = "";
long _res = 0L;
 //BA.debugLineNum = 1599;BA.debugLine="Sub ParseUTCstring(utc As String) As Long";
 //BA.debugLineNum = 1600;BA.debugLine="Dim df As String = DateTime.DateFormat";
_df = anywheresoftware.b4a.keywords.Common.DateTime.getDateFormat();
 //BA.debugLineNum = 1601;BA.debugLine="Dim res As Long";
_res = 0L;
 //BA.debugLineNum = 1602;BA.debugLine="If utc.CharAt(10) = \"T\" Then";
if (_utc.charAt((int) (10))==BA.ObjectToChar("T")) { 
 //BA.debugLineNum = 1604;BA.debugLine="If utc.CharAt(19) = \".\" Then utc = utc.SubString";
if (_utc.charAt((int) (19))==BA.ObjectToChar(".")) { 
_utc = _utc.substring((int) (0),(int) (19))+"+0000";};
 //BA.debugLineNum = 1605;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd'T'HH:mm:ssZ\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
 }else {
 //BA.debugLineNum = 1608;BA.debugLine="DateTime.DateFormat = \"EEE MMM dd HH:mm:ss Z yyy";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("EEE MMM dd HH:mm:ss Z yyyy");
 };
 //BA.debugLineNum = 1610;BA.debugLine="Try";
try { //BA.debugLineNum = 1611;BA.debugLine="res = DateTime.DateParse(utc)";
_res = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_utc);
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 1613;BA.debugLine="res = 0";
_res = (long) (0);
 };
 //BA.debugLineNum = 1615;BA.debugLine="DateTime.DateFormat = df";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(_df);
 //BA.debugLineNum = 1616;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 1617;BA.debugLine="End Sub";
return 0L;
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4j.example.dateutils._process_globals();
b4j.example.cssutils._process_globals();
main._process_globals();
httputils2service._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 11;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 12;BA.debugLine="Private emailAddress As String";
_emailaddress = "";
 //BA.debugLineNum = 13;BA.debugLine="Private password As String";
_password = "";
 //BA.debugLineNum = 14;BA.debugLine="Private authToken As String";
_authtoken = "";
 //BA.debugLineNum = 15;BA.debugLine="Private userRegion As String = \"u006\"";
_userregion = "u006";
 //BA.debugLineNum = 16;BA.debugLine="Private accountID As String = \"88438\" 'ignore";
_accountid = "88438";
 //BA.debugLineNum = 17;BA.debugLine="Private networkID As String = \"94896\"";
_networkid = "94896";
 //BA.debugLineNum = 18;BA.debugLine="Private commandID As String";
_commandid = "";
 //BA.debugLineNum = 19;BA.debugLine="Private commandComplete As Boolean";
_commandcomplete = false;
 //BA.debugLineNum = 20;BA.debugLine="Private cameraThumbnail As String";
_camerathumbnail = "";
 //BA.debugLineNum = 21;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 22;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 23;BA.debugLine="Private lbTitle As Label 'ignore";
_lbtitle = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private xMouse, yMouse As Double";
_xmouse = 0;
_ymouse = 0;
 //BA.debugLineNum = 25;BA.debugLine="Private isMaximized As Boolean = False";
_ismaximized = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 26;BA.debugLine="Private ivClose As ImageView";
_ivclose = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private ivMax As ImageView";
_ivmax = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private ivMin As ImageView";
_ivmin = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private AtualSkin As String";
_atualskin = "";
 //BA.debugLineNum = 30;BA.debugLine="Private imgInit As String";
_imginit = "";
 //BA.debugLineNum = 31;BA.debugLine="Private isMaximized As Boolean = False";
_ismaximized = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 32;BA.debugLine="Private f_X, f_Y, f_W, f_H As Double 'ignore";
_f_x = 0;
_f_y = 0;
_f_w = 0;
_f_h = 0;
 //BA.debugLineNum = 33;BA.debugLine="Private btnDriveway As Button 'ignore";
_btndriveway = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private response As String";
_response = "";
 //BA.debugLineNum = 35;BA.debugLine="Private ivDriveway As ImageView";
_ivdriveway = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private lblStatus As Label 'ignore";
_lblstatus = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private ivFrontDoor As ImageView";
_ivfrontdoor = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private ivSideYard As ImageView";
_ivsideyard = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private lblDriveway As Label 'ignore";
_lbldriveway = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private lblFrontDoor As Label 'ignore";
_lblfrontdoor = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private lblSideYard As Label 'ignore";
_lblsideyard = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private clvDriveway As CustomListView";
_clvdriveway = new b4j.example.customlistview();
 //BA.debugLineNum = 43;BA.debugLine="Private clvFrontDoor As CustomListView";
_clvfrontdoor = new b4j.example.customlistview();
 //BA.debugLineNum = 44;BA.debugLine="Private clvSideYard As CustomListView";
_clvsideyard = new b4j.example.customlistview();
 //BA.debugLineNum = 45;BA.debugLine="Private lblSyncModule As Label 'ignore";
_lblsyncmodule = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 47;BA.debugLine="Private btnActivity As Button 'ignore";
_btnactivity = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Private btnRefresh As Button 'ignore";
_btnrefresh = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 49;BA.debugLine="Private prevDrivewayUpdateTime As String";
_prevdrivewayupdatetime = "";
 //BA.debugLineNum = 50;BA.debugLine="Private prevFrontDoorUpdateTime As String";
_prevfrontdoorupdatetime = "";
 //BA.debugLineNum = 51;BA.debugLine="Private ivSyncModule As ImageView 'ignore";
_ivsyncmodule = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Private ivSyncModuleWiFi As ImageView 'ignore";
_ivsyncmodulewifi = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Private drivewayArmedStatus As String";
_drivewayarmedstatus = "";
 //BA.debugLineNum = 54;BA.debugLine="Private frontdoorArmedStatus As String";
_frontdoorarmedstatus = "";
 //BA.debugLineNum = 55;BA.debugLine="Private sideyardArmedStatus As String";
_sideyardarmedstatus = "";
 //BA.debugLineNum = 56;BA.debugLine="Private btnDrivewayNewClip As Button 'ignore";
_btndrivewaynewclip = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 57;BA.debugLine="Private btnFrontDoorNewClip As Button 'ignore";
_btnfrontdoornewclip = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 58;BA.debugLine="Private btnSideYardNewClip As Button 'ignore";
_btnsideyardnewclip = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 59;BA.debugLine="Private badger1 As Badger";
_badger1 = new cloyd.blink.badger();
 //BA.debugLineNum = 60;BA.debugLine="Private prevCameraThumbnail As String";
_prevcamerathumbnail = "";
 //BA.debugLineNum = 61;BA.debugLine="Private kvs As KeyValueStore";
_kvs = new cloyd.blink.keyvaluestore();
 //BA.debugLineNum = 62;BA.debugLine="Private btnDrivewayRefresh As Button 'ignore";
_btndrivewayrefresh = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 63;BA.debugLine="Private btnFrontDoorRefresh As Button 'ignore";
_btnfrontdoorrefresh = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 64;BA.debugLine="Private btnSideYardRefresh As Button 'ignore";
_btnsideyardrefresh = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _refreshcameras(boolean _firstrun,String _whatcamera) throws Exception{
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

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 250;BA.debugLine="Try";
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
 //BA.debugLineNum = 251;BA.debugLine="Dim camera As String";
_camera = "";
 //BA.debugLineNum = 252;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 253;BA.debugLine="Dim clv As CustomListView";
_clv = new b4j.example.customlistview();
 //BA.debugLineNum = 254;BA.debugLine="Dim links As List";
_links = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 255;BA.debugLine="Dim attempts As Int";
_attempts = 0;
 //BA.debugLineNum = 256;BA.debugLine="links = Array(\"347574\", \"236967\", \"458236\")";
_links = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("347574"),(Object)("236967"),(Object)("458236")});
 //BA.debugLineNum = 258;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-\"";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/syncmodules");
 //BA.debugLineNum = 259;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 106;
return;
case 106:
//C
this.state = 4;
_result = (Object) result[0];
;
 //BA.debugLineNum = 261;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.Co";
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
 //BA.debugLineNum = 262;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 263;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 264;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 265;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 266;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 267;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 268;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
 //BA.debugLineNum = 272;BA.debugLine="Dim rs As ResumableSub = GetSyncModuleInfo(respo";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getsyncmoduleinfo(parent._response);
 //BA.debugLineNum = 273;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 107;
return;
case 107:
//C
this.state = 8;
_result = (Object) result[0];
;
 //BA.debugLineNum = 275;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-\"";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/homescreen");
 //BA.debugLineNum = 276;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 108;
return;
case 108:
//C
this.state = 8;
_result = (Object) result[0];
;
 //BA.debugLineNum = 278;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.Co";
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
 //BA.debugLineNum = 279;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 280;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 281;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 282;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 283;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 284;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 285;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 11:
//C
this.state = 12;
;
 //BA.debugLineNum = 288;BA.debugLine="File.WriteString(File.DirApp,\"GetHomescreen.txt\"";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"GetHomescreen.txt",parent._response);
 //BA.debugLineNum = 290;BA.debugLine="Dim rs As ResumableSub = GetHomescreen(response)";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _gethomescreen(parent._response);
 //BA.debugLineNum = 291;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 109;
return;
case 109:
//C
this.state = 12;
_result = (Object) result[0];
;
 //BA.debugLineNum = 293;BA.debugLine="If FirstRun= False And whatCamera = \"All\"  Then";
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
 //BA.debugLineNum = 294;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
_bluriv("Driveway.jpg",parent._ivdriveway);
 //BA.debugLineNum = 295;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
_bluriv("FrontDoor.jpg",parent._ivfrontdoor);
 //BA.debugLineNum = 296;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
_bluriv("SideYard.jpg",parent._ivsideyard);
 if (true) break;

case 15:
//C
this.state = 16;
;
 //BA.debugLineNum = 300;BA.debugLine="Dim rs As ResumableSub = GetUnwatchedVideos";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getunwatchedvideos();
 //BA.debugLineNum = 301;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 110;
return;
case 110:
//C
this.state = 16;
_result = (Object) result[0];
;
 //BA.debugLineNum = 303;BA.debugLine="For Each link As String In links";
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
 //BA.debugLineNum = 304;BA.debugLine="camera = link";
_camera = _link;
 //BA.debugLineNum = 305;BA.debugLine="If camera <> whatCamera And whatCamera <> \"All\"";
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
 //BA.debugLineNum = 306;BA.debugLine="Continue";
this.state = 112;
if (true) break;;
 if (true) break;
;
 //BA.debugLineNum = 309;BA.debugLine="If FirstRun Then";

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
 //BA.debugLineNum = 310;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 25:
//if
this.state = 32;
if ((_camera).equals("347574")) { 
this.state = 27;
}else if((_camera).equals("236967")) { 
this.state = 29;
}else if((_camera).equals("458236")) { 
this.state = 31;
}if (true) break;

case 27:
//C
this.state = 32;
 //BA.debugLineNum = 311;BA.debugLine="lblStatus.Text = \"Retrieving Driveway thumbna";
parent._lblstatus.setText("Retrieving Driveway thumbnail...");
 //BA.debugLineNum = 312;BA.debugLine="iv = ivDriveway";
_iv = parent._ivdriveway;
 //BA.debugLineNum = 313;BA.debugLine="clv = clvDriveway";
_clv = parent._clvdriveway;
 if (true) break;

case 29:
//C
this.state = 32;
 //BA.debugLineNum = 315;BA.debugLine="lblStatus.Text = \"Retrieving Front Door thumb";
parent._lblstatus.setText("Retrieving Front Door thumbnail...");
 //BA.debugLineNum = 316;BA.debugLine="iv = ivFrontDoor";
_iv = parent._ivfrontdoor;
 //BA.debugLineNum = 317;BA.debugLine="clv = clvFrontDoor";
_clv = parent._clvfrontdoor;
 if (true) break;

case 31:
//C
this.state = 32;
 //BA.debugLineNum = 319;BA.debugLine="lblStatus.Text = \"Retrieving Side Yard thumbn";
parent._lblstatus.setText("Retrieving Side Yard thumbnail...");
 //BA.debugLineNum = 320;BA.debugLine="iv = ivSideYard";
_iv = parent._ivsideyard;
 //BA.debugLineNum = 321;BA.debugLine="clv = clvSideYard";
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
 //BA.debugLineNum = 324;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 35:
//if
this.state = 42;
if ((_camera).equals("347574")) { 
this.state = 37;
}else if((_camera).equals("236967")) { 
this.state = 39;
}else if((_camera).equals("458236")) { 
this.state = 41;
}if (true) break;

case 37:
//C
this.state = 42;
 //BA.debugLineNum = 325;BA.debugLine="lblStatus.Text = \"Capturing a new Driveway th";
parent._lblstatus.setText("Capturing a new Driveway thumbnail...");
 //BA.debugLineNum = 326;BA.debugLine="iv = ivDriveway";
_iv = parent._ivdriveway;
 //BA.debugLineNum = 327;BA.debugLine="clv = clvDriveway";
_clv = parent._clvdriveway;
 //BA.debugLineNum = 328;BA.debugLine="attempts = 15";
_attempts = (int) (15);
 if (true) break;

case 39:
//C
this.state = 42;
 //BA.debugLineNum = 330;BA.debugLine="lblStatus.Text = \"Capturing a new Front Door";
parent._lblstatus.setText("Capturing a new Front Door thumbnail...");
 //BA.debugLineNum = 331;BA.debugLine="iv = ivFrontDoor";
_iv = parent._ivfrontdoor;
 //BA.debugLineNum = 332;BA.debugLine="clv = clvFrontDoor";
_clv = parent._clvfrontdoor;
 //BA.debugLineNum = 333;BA.debugLine="attempts = 15";
_attempts = (int) (15);
 if (true) break;

case 41:
//C
this.state = 42;
 //BA.debugLineNum = 335;BA.debugLine="lblStatus.Text = \"Capturing a new Side Yard t";
parent._lblstatus.setText("Capturing a new Side Yard thumbnail...");
 //BA.debugLineNum = 336;BA.debugLine="iv = ivSideYard";
_iv = parent._ivsideyard;
 //BA.debugLineNum = 337;BA.debugLine="clv = clvSideYard";
_clv = parent._clvsideyard;
 //BA.debugLineNum = 338;BA.debugLine="attempts = 15";
_attempts = (int) (15);
 if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;
;
 //BA.debugLineNum = 342;BA.debugLine="If FirstRun Then";

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
 //BA.debugLineNum = 343;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera);
 //BA.debugLineNum = 344;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 113;
return;
case 113:
//C
this.state = 93;
_result = (Object) result[0];
;
 //BA.debugLineNum = 347;BA.debugLine="Dim rs As ResumableSub = GetCameraInfo(respons";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcamerainfo(parent._response,_clv);
 //BA.debugLineNum = 348;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 114;
return;
case 114:
//C
this.state = 93;
_result = (Object) result[0];
;
 //BA.debugLineNum = 350;BA.debugLine="Dim rs As ResumableSub = DownloadImage(\"https:";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _downloadimage("https://rest-"+parent._userregion+".immedia-semi.com/"+parent._camerathumbnail+".jpg",_iv,_camera);
 //BA.debugLineNum = 351;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
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
 //BA.debugLineNum = 354;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera);
 //BA.debugLineNum = 355;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 116;
return;
case 116:
//C
this.state = 48;
_result = (Object) result[0];
;
 //BA.debugLineNum = 358;BA.debugLine="Dim rs As ResumableSub = GetCameraInfo(respons";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcamerainfo(parent._response,(b4j.example.customlistview)(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 359;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 117;
return;
case 117:
//C
this.state = 48;
_result = (Object) result[0];
;
 //BA.debugLineNum = 361;BA.debugLine="prevCameraThumbnail = cameraThumbnail";
parent._prevcamerathumbnail = parent._camerathumbnail;
 //BA.debugLineNum = 363;BA.debugLine="Dim rs As ResumableSub = RESTPost(\"https://res";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restpost("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera+"/thumbnail");
 //BA.debugLineNum = 364;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 118;
return;
case 118:
//C
this.state = 48;
_result = (Object) result[0];
;
 //BA.debugLineNum = 367;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.";
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
 //BA.debugLineNum = 368;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 369;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 370;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 371;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 372;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 373;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 374;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 52:
//C
this.state = 53;
 //BA.debugLineNum = 376;BA.debugLine="Dim rs As ResumableSub = GetCommandID(respons";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcommandid(parent._response);
 //BA.debugLineNum = 377;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 119;
return;
case 119:
//C
this.state = 53;
_result = (Object) result[0];
;
 //BA.debugLineNum = 379;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://res";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
 //BA.debugLineNum = 380;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 120;
return;
case 120:
//C
this.state = 53;
_result = (Object) result[0];
;
 //BA.debugLineNum = 383;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response";
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
 //BA.debugLineNum = 384;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 385;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 386;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 387;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 388;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 389;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 390;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 57:
//C
this.state = 58;
 //BA.debugLineNum = 392;BA.debugLine="Dim reChecked As Boolean";
_rechecked = false;
 //BA.debugLineNum = 393;BA.debugLine="For i = 1 To attempts";
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
 //BA.debugLineNum = 396;BA.debugLine="Dim rs As ResumableSub = GetCommandResponse";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcommandresponse(_iv,_clv,_camera,BA.NumberToString(_i),BA.NumberToString(_attempts));
 //BA.debugLineNum = 397;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 123;
return;
case 123:
//C
this.state = 61;
_result = (Object) result[0];
;
 //BA.debugLineNum = 398;BA.debugLine="If Result Then Exit";
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
 //BA.debugLineNum = 399;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://r";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
 //BA.debugLineNum = 400;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 124;
return;
case 124:
//C
this.state = 67;
_result = (Object) result[0];
;
 //BA.debugLineNum = 401;BA.debugLine="Sleep(1000) ' 1 second";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 125;
return;
case 125:
//C
this.state = 67;
;
 //BA.debugLineNum = 403;BA.debugLine="If i = attempts And reChecked =  False Then";
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
 //BA.debugLineNum = 404;BA.debugLine="reChecked = True";
_rechecked = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 405;BA.debugLine="Log(\"*********** HERE *********** i = \" &";
anywheresoftware.b4a.keywords.Common.Log("*********** HERE *********** i = "+BA.NumberToString(_i));
 //BA.debugLineNum = 406;BA.debugLine="Dim rs As ResumableSub = RESTPost(\"https:/";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restpost("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera+"/thumbnail");
 //BA.debugLineNum = 407;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 126;
return;
case 126:
//C
this.state = 70;
_result = (Object) result[0];
;
 //BA.debugLineNum = 409;BA.debugLine="If response.StartsWith(\"ERROR: \") Or respo";
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
 //BA.debugLineNum = 410;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 411;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 412;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 413;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 414;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 415;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 416;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 74:
//C
this.state = 75;
 //BA.debugLineNum = 418;BA.debugLine="i = 1";
_i = (int) (1);
 if (true) break;

case 75:
//C
this.state = 76;
;
 //BA.debugLineNum = 420;BA.debugLine="Log(\"*********** HERE TWO ***********\")";
anywheresoftware.b4a.keywords.Common.Log("*********** HERE TWO ***********");
 //BA.debugLineNum = 421;BA.debugLine="Dim rs As ResumableSub = GetCommandID(resp";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcommandid(parent._response);
 //BA.debugLineNum = 422;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 127;
return;
case 127:
//C
this.state = 76;
_result = (Object) result[0];
;
 //BA.debugLineNum = 424;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
 //BA.debugLineNum = 425;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
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
 //BA.debugLineNum = 429;BA.debugLine="If response.StartsWith(\"ERROR: \") Or respons";

case 77:
//if
this.state = 90;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 79;
}else if(parent._commandcomplete==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 81;
}if (true) break;

case 79:
//C
this.state = 90;
 //BA.debugLineNum = 430;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 431;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 432;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 433;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 434;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 435;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 436;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 81:
//C
this.state = 82;
 //BA.debugLineNum = 438;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 82:
//if
this.state = 89;
if ((_camera).equals("347574")) { 
this.state = 84;
}else if((_camera).equals("236967")) { 
this.state = 86;
}else if((_camera).equals("458236")) { 
this.state = 88;
}if (true) break;

case 84:
//C
this.state = 89;
 //BA.debugLineNum = 439;BA.debugLine="lblStatus.Text = \"Failed to retrieve Drive";
parent._lblstatus.setText("Failed to retrieve Driveway thumbnail...");
 if (true) break;

case 86:
//C
this.state = 89;
 //BA.debugLineNum = 441;BA.debugLine="lblStatus.Text = \"Failed to retrieve Front";
parent._lblstatus.setText("Failed to retrieve Front Door thumbnail...");
 if (true) break;

case 88:
//C
this.state = 89;
 //BA.debugLineNum = 443;BA.debugLine="lblStatus.Text = \"Failed to retrieve Side";
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
 //BA.debugLineNum = 453;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
 if (true) break;

case 96:
//C
this.state = 97;
this.catchState = 0;
 //BA.debugLineNum = 455;BA.debugLine="response = \"ERROR: \" & LastException";
parent._response = "ERROR: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba));
 //BA.debugLineNum = 456;BA.debugLine="Log(\"RefreshCamera LastException: \" & LastExcept";
anywheresoftware.b4a.keywords.Common.Log("RefreshCamera LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 97:
//C
this.state = 98;
this.catchState = 0;
;
 //BA.debugLineNum = 458;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 459;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 460;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 461;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 462;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 463;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 464;BA.debugLine="If lblSideYard.Text.Contains(\"OFFLINE\") Then";
if (true) break;

case 98:
//if
this.state = 105;
if (parent._lblsideyard.getText().contains("OFFLINE")) { 
this.state = 100;
}else if(parent._lbldriveway.getText().contains("OFFLINE")) { 
this.state = 102;
}else if(parent._lblfrontdoor.getText().contains("OFFLINE")) { 
this.state = 104;
}if (true) break;

case 100:
//C
this.state = 105;
 //BA.debugLineNum = 465;BA.debugLine="lblSideYard.Text = sideyardArmedStatus";
parent._lblsideyard.setText(parent._sideyardarmedstatus);
 //BA.debugLineNum = 466;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
_bluriv("SideYard.jpg",parent._ivsideyard);
 if (true) break;

case 102:
//C
this.state = 105;
 //BA.debugLineNum = 468;BA.debugLine="lblDriveway.Text = drivewayArmedStatus";
parent._lbldriveway.setText(parent._drivewayarmedstatus);
 //BA.debugLineNum = 469;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
_bluriv("Driveway.jpg",parent._ivdriveway);
 if (true) break;

case 104:
//C
this.state = 105;
 //BA.debugLineNum = 471;BA.debugLine="lblFrontDoor.Text = frontdoorArmedStatus";
parent._lblfrontdoor.setText(parent._frontdoorarmedstatus);
 //BA.debugLineNum = 472;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
_bluriv("FrontDoor.jpg",parent._ivfrontdoor);
 if (true) break;

case 105:
//C
this.state = -1;
;
 //BA.debugLineNum = 474;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 //BA.debugLineNum = 475;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _requestauthtoken() throws Exception{
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
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
Object _result = null;

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
 //BA.debugLineNum = 204;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 18;
this.catchState = 17;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 17;
 //BA.debugLineNum = 205;BA.debugLine="lblStatus.Text = \"Authenticating...\"";
parent._lblstatus.setText("Authenticating...");
 //BA.debugLineNum = 206;BA.debugLine="Dim jobLogin As HttpJob";
_joblogin = new cloyd.blink.httpjob();
 //BA.debugLineNum = 207;BA.debugLine="jobLogin.Initialize(\"\", Me)";
_joblogin._initialize /*String*/ (ba,"",main.getObject());
 //BA.debugLineNum = 208;BA.debugLine="jobLogin.PostString(\"https://rest.prod.immedia-s";
_joblogin._poststring /*String*/ ("https://rest.prod.immedia-semi.com/login","email="+parent._emailaddress+"&password="+parent._password);
 //BA.debugLineNum = 209;BA.debugLine="jobLogin.GetRequest.SetContentType(\"application/";
_joblogin._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/x-www-form-urlencoded");
 //BA.debugLineNum = 210;BA.debugLine="Wait For (jobLogin) JobDone(jobLogin As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, this, (Object)(_joblogin));
this.state = 19;
return;
case 19:
//C
this.state = 4;
_joblogin = (cloyd.blink.httpjob) result[0];
;
 //BA.debugLineNum = 211;BA.debugLine="If jobLogin.Success Then";
if (true) break;

case 4:
//if
this.state = 15;
if (_joblogin._success /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 212;BA.debugLine="lblStatus.Text = \"Successfully logged in to the";
parent._lblstatus.setText("Successfully logged in to the Blink server...");
 //BA.debugLineNum = 214;BA.debugLine="GetAuthInfo(jobLogin.GetString)";
_getauthinfo(_joblogin._getstring /*String*/ ());
 //BA.debugLineNum = 216;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.C";
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
 //BA.debugLineNum = 217;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 218;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 219;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 220;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 221;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 222;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 223;BA.debugLine="jobLogin.Release";
_joblogin._release /*String*/ ();
 //BA.debugLineNum = 224;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 226;BA.debugLine="lblStatus.Text = \"AuthToken acquired...\"";
parent._lblstatus.setText("AuthToken acquired...");
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 229;BA.debugLine="lblStatus.Text = GetRESTError(jobLogin.ErrorMes";
parent._lblstatus.setText(_getresterror(_joblogin._errormessage /*String*/ ));
 //BA.debugLineNum = 230;BA.debugLine="Log(\"RequestAuthToken error: \" & jobLogin.Error";
anywheresoftware.b4a.keywords.Common.Log("RequestAuthToken error: "+_joblogin._errormessage /*String*/ );
 //BA.debugLineNum = 231;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 232;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 233;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 234;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 235;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 236;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 237;BA.debugLine="jobLogin.Release";
_joblogin._release /*String*/ ();
 //BA.debugLineNum = 238;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 15:
//C
this.state = 18;
;
 //BA.debugLineNum = 240;BA.debugLine="jobLogin.Release";
_joblogin._release /*String*/ ();
 //BA.debugLineNum = 241;BA.debugLine="Dim rs As ResumableSub = RefreshCameras(True, \"A";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _refreshcameras(anywheresoftware.b4a.keywords.Common.True,"All");
 //BA.debugLineNum = 242;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 20;
return;
case 20:
//C
this.state = 18;
_result = (Object) result[0];
;
 if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
 //BA.debugLineNum = 244;BA.debugLine="Log(\"RequestAuthToken LastException: \" & LastExc";
anywheresoftware.b4a.keywords.Common.Log("RequestAuthToken LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 18:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 246;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
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
public ResumableSub_RESTGet(cloyd.blink.main parent,String _url) {
this.parent = parent;
this._url = _url;
}
cloyd.blink.main parent;
String _url;
cloyd.blink.httpjob _j = null;

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
 //BA.debugLineNum = 526;BA.debugLine="Try";
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
 //BA.debugLineNum = 527;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
 //BA.debugLineNum = 528;BA.debugLine="response = \"\"";
parent._response = "";
 //BA.debugLineNum = 529;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no";
_j._initialize /*String*/ (ba,"",main.getObject());
 //BA.debugLineNum = 530;BA.debugLine="j.Download(url)";
_j._download /*String*/ (_url);
 //BA.debugLineNum = 531;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("TOKEN_AUTH",parent._authtoken);
 //BA.debugLineNum = 532;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[0];
;
 //BA.debugLineNum = 533;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 534;BA.debugLine="response = j.GetString";
parent._response = _j._getstring /*String*/ ();
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 536;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
parent._response = "ERROR: "+_j._errormessage /*String*/ ;
 //BA.debugLineNum = 537;BA.debugLine="lblStatus.Text = GetRESTError(j.ErrorMessage)";
parent._lblstatus.setText(_getresterror(_j._errormessage /*String*/ ));
 if (true) break;
;
 //BA.debugLineNum = 539;BA.debugLine="If response.Contains(\"System is busy, please wai";

case 9:
//if
this.state = 12;
if (parent._response.contains("System is busy, please wait")) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 540;BA.debugLine="lblStatus.Text = \"System is busy, please wait\"";
parent._lblstatus.setText("System is busy, please wait");
 if (true) break;

case 12:
//C
this.state = 15;
;
 //BA.debugLineNum = 542;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 //BA.debugLineNum = 544;BA.debugLine="response = \"ERROR: \" & LastException";
parent._response = "ERROR: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba));
 //BA.debugLineNum = 545;BA.debugLine="Log(\"RESTGet LastException: \" & LastException)";
anywheresoftware.b4a.keywords.Common.Log("RESTGet LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 15:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 547;BA.debugLine="Log(\"URL: \" & url)";
anywheresoftware.b4a.keywords.Common.Log("URL: "+_url);
 //BA.debugLineNum = 548;BA.debugLine="Log(\"Response: \" & response)";
anywheresoftware.b4a.keywords.Common.Log("Response: "+parent._response);
 //BA.debugLineNum = 549;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 //BA.debugLineNum = 550;BA.debugLine="End Sub";
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
public ResumableSub_RESTPost(cloyd.blink.main parent,String _url) {
this.parent = parent;
this._url = _url;
}
cloyd.blink.main parent;
String _url;
cloyd.blink.httpjob _j = null;

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
 //BA.debugLineNum = 553;BA.debugLine="Try";
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
 //BA.debugLineNum = 554;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
 //BA.debugLineNum = 555;BA.debugLine="response = \"\"";
parent._response = "";
 //BA.debugLineNum = 556;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no";
_j._initialize /*String*/ (ba,"",main.getObject());
 //BA.debugLineNum = 557;BA.debugLine="j.PostString(url,\"\")";
_j._poststring /*String*/ (_url,"");
 //BA.debugLineNum = 558;BA.debugLine="j.GetRequest.SetContentType(\"application/x-www-f";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/x-www-form-urlencoded");
 //BA.debugLineNum = 559;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("TOKEN_AUTH",parent._authtoken);
 //BA.debugLineNum = 560;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[0];
;
 //BA.debugLineNum = 561;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 562;BA.debugLine="response = j.GetString";
parent._response = _j._getstring /*String*/ ();
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 564;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
parent._response = "ERROR: "+_j._errormessage /*String*/ ;
 //BA.debugLineNum = 565;BA.debugLine="lblStatus.Text = GetRESTError(j.ErrorMessage)";
parent._lblstatus.setText(_getresterror(_j._errormessage /*String*/ ));
 if (true) break;
;
 //BA.debugLineNum = 567;BA.debugLine="If response.Contains(\"System is busy, please wai";

case 9:
//if
this.state = 12;
if (parent._response.contains("System is busy, please wait")) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 568;BA.debugLine="lblStatus.Text = \"System is busy, please wait\"";
parent._lblstatus.setText("System is busy, please wait");
 if (true) break;

case 12:
//C
this.state = 15;
;
 //BA.debugLineNum = 570;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 //BA.debugLineNum = 572;BA.debugLine="response = \"ERROR: \" & LastException";
parent._response = "ERROR: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba));
 //BA.debugLineNum = 573;BA.debugLine="Log(\"RESTPost LastException: \" & LastException)";
anywheresoftware.b4a.keywords.Common.Log("RESTPost LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 15:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 575;BA.debugLine="Log(\"URL: \" & url)";
anywheresoftware.b4a.keywords.Common.Log("URL: "+_url);
 //BA.debugLineNum = 576;BA.debugLine="Log(\"Response: \" & response)";
anywheresoftware.b4a.keywords.Common.Log("Response: "+parent._response);
 //BA.debugLineNum = 577;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 //BA.debugLineNum = 578;BA.debugLine="End Sub";
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
public static String  _setavg(b4j.example.bitmapcreator _bc,int _x,int _y,b4j.example.bitmapcreator._argbcolor[] _clrs,b4j.example.bitmapcreator._argbcolor _temp) throws Exception{
b4j.example.bitmapcreator._argbcolor _c = null;
 //BA.debugLineNum = 1475;BA.debugLine="Private Sub SetAvg(bc As BitmapCreator, x As Int,";
 //BA.debugLineNum = 1476;BA.debugLine="Try";
try { //BA.debugLineNum = 1477;BA.debugLine="temp.Initialize";
_temp.Initialize();
 //BA.debugLineNum = 1478;BA.debugLine="For Each c As ARGBColor In clrs";
{
final b4j.example.bitmapcreator._argbcolor[] group3 = _clrs;
final int groupLen3 = group3.length
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_c = group3[index3];
 //BA.debugLineNum = 1479;BA.debugLine="temp.r = temp.r + c.r";
_temp.r = (int) (_temp.r+_c.r);
 //BA.debugLineNum = 1480;BA.debugLine="temp.g = temp.g + c.g";
_temp.g = (int) (_temp.g+_c.g);
 //BA.debugLineNum = 1481;BA.debugLine="temp.b = temp.b + c.b";
_temp.b = (int) (_temp.b+_c.b);
 }
};
 //BA.debugLineNum = 1483;BA.debugLine="temp.a = 255";
_temp.a = (int) (255);
 //BA.debugLineNum = 1484;BA.debugLine="temp.r = temp.r / clrs.Length";
_temp.r = (int) (_temp.r/(double)_clrs.length);
 //BA.debugLineNum = 1485;BA.debugLine="temp.g = temp.g / clrs.Length";
_temp.g = (int) (_temp.g/(double)_clrs.length);
 //BA.debugLineNum = 1486;BA.debugLine="temp.b = temp.b / clrs.Length";
_temp.b = (int) (_temp.b/(double)_clrs.length);
 //BA.debugLineNum = 1487;BA.debugLine="bc.SetARGB(x, y, temp)";
_bc._setargb(_x,_y,_temp);
 } 
       catch (Exception e14) {
			ba.setLastException(e14); //BA.debugLineNum = 1489;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1491;BA.debugLine="End Sub";
return "";
}
}
