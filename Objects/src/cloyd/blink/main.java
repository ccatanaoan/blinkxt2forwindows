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
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static cloyd.blink.httputils2service _httputils2service = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
anywheresoftware.b4j.objects.Shell _shl = null;
 //BA.debugLineNum = 149;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 150;BA.debugLine="btnDriveway.Enabled = True";
_btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 151;BA.debugLine="btnRefresh.Enabled = True";
_btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 152;BA.debugLine="btnActivity.Enabled = True";
_btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 153;BA.debugLine="btnDrivewayNewClip.Enabled = True";
_btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 154;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
_btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 155;BA.debugLine="btnSideYardNewClip.Enabled = True";
_btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 156;BA.debugLine="fx.msgbox2(MainForm,Error.Message,MainForm.Title,";
_fx.Msgbox2(_mainform,_error.getMessage(),_mainform.getTitle(),"OK","","",_fx.MSGBOX_ERROR);
 //BA.debugLineNum = 157;BA.debugLine="Dim shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
 //BA.debugLineNum = 158;BA.debugLine="Try";
try { //BA.debugLineNum = 159;BA.debugLine="shl.Initialize(\"shl\", \"java.exe\" , Array As Stri";
_shl.Initialize("shl","java.exe",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"-jar","Blink4Java.jar"}));
 //BA.debugLineNum = 160;BA.debugLine="shl.WorkingDirectory = File.DirApp";
_shl.setWorkingDirectory(anywheresoftware.b4a.keywords.Common.File.getDirApp());
 //BA.debugLineNum = 161;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
 } 
       catch (Exception e14) {
			ba.setLastException(e14); //BA.debugLineNum = 163;BA.debugLine="Log(\"Application_Error: \" & LastException.Messag";
anywheresoftware.b4a.keywords.Common.Log("Application_Error: "+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
 };
 //BA.debugLineNum = 166;BA.debugLine="Return False ' handled";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return false;
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
String _skintemp = "";
String _skindefault = "";
anywheresoftware.b4j.agraham.reflection.Reflection _obj = null;
anywheresoftware.b4a.objects.collections.List _list1 = null;
int _i = 0;
 //BA.debugLineNum = 62;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 63;BA.debugLine="Try";
try { //BA.debugLineNum = 64;BA.debugLine="Dim skinTemp As String";
_skintemp = "";
 //BA.debugLineNum = 65;BA.debugLine="Dim skinDefault As String";
_skindefault = "";
 //BA.debugLineNum = 67;BA.debugLine="If File.Exists(File.DirApp, \"skin.ini\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"skin.ini")) { 
 //BA.debugLineNum = 68;BA.debugLine="skinTemp = File.ReadString(File.DirApp, \"skin.i";
_skintemp = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"skin.ini");
 }else {
 //BA.debugLineNum = 71;BA.debugLine="skinTemp = \"vdSk03\"";
_skintemp = "vdSk03";
 };
 //BA.debugLineNum = 74;BA.debugLine="If skinTemp = \"\" Then";
if ((_skintemp).equals("")) { 
 //BA.debugLineNum = 75;BA.debugLine="skinDefault = \"vdSk03\"";
_skindefault = "vdSk03";
 }else {
 //BA.debugLineNum = 77;BA.debugLine="If skinTemp = \"vdSk01\" Or skinTemp = \"vdSk02\" O";
if ((_skintemp).equals("vdSk01") || (_skintemp).equals("vdSk02") || (_skintemp).equals("vdSk03") || (_skintemp).equals("vdSk04") || (_skintemp).equals("vdSk05") || (_skintemp).equals("vdSk06")) { 
 //BA.debugLineNum = 78;BA.debugLine="skinDefault = skinTemp";
_skindefault = _skintemp;
 }else {
 //BA.debugLineNum = 80;BA.debugLine="skinDefault = \"vdSk03\"";
_skindefault = "vdSk03";
 };
 };
 //BA.debugLineNum = 84;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 85;BA.debugLine="MainForm.SetFormStyle(\"TRANSPARENT\")";
_mainform.SetFormStyle("TRANSPARENT");
 //BA.debugLineNum = 86;BA.debugLine="MainForm.RootPane.LoadLayout(skinDefault) 'Load";
_mainform.getRootPane().LoadLayout(ba,_skindefault);
 //BA.debugLineNum = 87;BA.debugLine="AtualSkin = skinDefault";
_atualskin = _skindefault;
 //BA.debugLineNum = 88;BA.debugLine="MainForm.BackColor = fx.Colors.Transparent";
_mainform.setBackColor(_fx.Colors.Transparent);
 //BA.debugLineNum = 89;BA.debugLine="MainForm.RootPane.Style = \"-fx-background-color:";
_mainform.getRootPane().setStyle("-fx-background-color:transparent;-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 1.0) , 15,0, 0.0, 0.0);");
 //BA.debugLineNum = 90;BA.debugLine="MainForm.Resizable = True";
_mainform.setResizable(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 91;BA.debugLine="MainForm.Icon = fx.LoadImage(File.DirAssets, \"ho";
_mainform.setIcon((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"home.png").getObject()));
 //BA.debugLineNum = 92;BA.debugLine="MainForm.Title = \"Catanaoan Blink XT2 Cameras v1";
_mainform.setTitle("Catanaoan Blink XT2 Cameras v1.0");
 //BA.debugLineNum = 93;BA.debugLine="lbTitle.MouseCursor = fx.Cursors.MOVE";
_lbtitle.setMouseCursor(_fx.Cursors.MOVE);
 //BA.debugLineNum = 94;BA.debugLine="lbTitle.Text = \"Catanaoan Blink XT2 Cameras v1.0";
_lbtitle.setText("Catanaoan Blink XT2 Cameras v1.0");
 //BA.debugLineNum = 95;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 96;BA.debugLine="Obj.Target = ivClose";
_obj.Target = (Object)(_ivclose.getObject());
 //BA.debugLineNum = 97;BA.debugLine="Obj.AddEventHandler2(\"Close_Entered\", \"onMouseEn";
_obj.AddEventHandler2(ba,"Close_Entered","onMouseEnteredProperty");
 //BA.debugLineNum = 98;BA.debugLine="Obj.AddEventHandler2(\"Close_Exited\", \"onMouseExi";
_obj.AddEventHandler2(ba,"Close_Exited","onMouseExitedProperty");
 //BA.debugLineNum = 99;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 100;BA.debugLine="Obj.Target = ivMax";
_obj.Target = (Object)(_ivmax.getObject());
 //BA.debugLineNum = 101;BA.debugLine="Obj.AddEventHandler2(\"Max_Entered\", \"onMouseEnte";
_obj.AddEventHandler2(ba,"Max_Entered","onMouseEnteredProperty");
 //BA.debugLineNum = 102;BA.debugLine="Obj.AddEventHandler2(\"Max_Exited\", \"onMouseExite";
_obj.AddEventHandler2(ba,"Max_Exited","onMouseExitedProperty");
 //BA.debugLineNum = 103;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 104;BA.debugLine="Obj.Target = ivMin";
_obj.Target = (Object)(_ivmin.getObject());
 //BA.debugLineNum = 105;BA.debugLine="Obj.AddEventHandler2(\"Min_Entered\", \"onMouseEnte";
_obj.AddEventHandler2(ba,"Min_Entered","onMouseEnteredProperty");
 //BA.debugLineNum = 106;BA.debugLine="Obj.AddEventHandler2(\"Min_Exited\", \"onMouseExite";
_obj.AddEventHandler2(ba,"Min_Exited","onMouseExitedProperty");
 //BA.debugLineNum = 107;BA.debugLine="imgInit = AtualSkin.SubString(2).ToLowerCase";
_imginit = _atualskin.substring((int) (2)).toLowerCase();
 //BA.debugLineNum = 108;BA.debugLine="Get_css";
_get_css();
 //BA.debugLineNum = 113;BA.debugLine="MainForm.WindowLeft = CheckMonitor.MaxX	- MainFo";
_mainform.setWindowLeft(_checkmonitor().getMaxX()-_mainform.getWidth()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
 //BA.debugLineNum = 114;BA.debugLine="MainForm.WindowTop = CheckMonitor.MaxY - MainFor";
_mainform.setWindowTop(_checkmonitor().getMaxY()-_mainform.getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
 //BA.debugLineNum = 116;BA.debugLine="lblStatus.TextColor = fx.Colors.White";
_lblstatus.setTextColor(_fx.Colors.White);
 //BA.debugLineNum = 117;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 119;BA.debugLine="If File.Exists(File.DirApp, \"account.txt\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"account.txt")) { 
 //BA.debugLineNum = 120;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 121;BA.debugLine="List1 = File.ReadList(File.DirApp, \"account.txt";
_list1 = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"account.txt");
 //BA.debugLineNum = 122;BA.debugLine="For i = 0 To List1.Size - 1";
{
final int step50 = 1;
final int limit50 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit50 ;_i = _i + step50 ) {
 //BA.debugLineNum = 123;BA.debugLine="If i = 0 Then";
if (_i==0) { 
 //BA.debugLineNum = 124;BA.debugLine="emailAddress = List1.Get(i)";
_emailaddress = BA.ObjectToString(_list1.Get(_i));
 }else if(_i==1) { 
 //BA.debugLineNum = 126;BA.debugLine="password = List1.Get(i)";
_password = BA.ObjectToString(_list1.Get(_i));
 };
 }
};
 }else {
 //BA.debugLineNum = 130;BA.debugLine="fx.Msgbox2(MainForm,\"Account.txt not found!\", \"";
_fx.Msgbox2(_mainform,"Account.txt not found!","Catanaoan Blink XT2 Cameras v1.0","OK","","",_fx.MSGBOX_ERROR);
 //BA.debugLineNum = 131;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
 //BA.debugLineNum = 134;BA.debugLine="btnDriveway.Enabled = False";
_btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 135;BA.debugLine="btnRefresh.Enabled = False";
_btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 136;BA.debugLine="btnActivity.Enabled = False";
_btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 137;BA.debugLine="btnDrivewayNewClip.Enabled = False";
_btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 138;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
_btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 139;BA.debugLine="btnSideYardNewClip.Enabled = False";
_btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 140;BA.debugLine="badger1.Initialize";
_badger1._initialize /*String*/ (ba);
 //BA.debugLineNum = 141;BA.debugLine="RequestAuthToken";
_requestauthtoken();
 } 
       catch (Exception e70) {
			ba.setLastException(e70); //BA.debugLineNum = 143;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 1322;BA.debugLine="Private Sub Blur (bmp As B4XBitmap) As B4XBitmap";
 //BA.debugLineNum = 1323;BA.debugLine="Try";
try { //BA.debugLineNum = 1324;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4j.example.bitmapcreator();
 //BA.debugLineNum = 1325;BA.debugLine="Dim ReduceScale As Int = 2";
_reducescale = (int) (2);
 //BA.debugLineNum = 1326;BA.debugLine="bc.Initialize(bmp.Width / ReduceScale / bmp.Scal";
_bc._initialize(ba,(int) (_bmp.getWidth()/(double)_reducescale/(double)_bmp.getScale()),(int) (_bmp.getHeight()/(double)_reducescale/(double)_bmp.getScale()));
 //BA.debugLineNum = 1327;BA.debugLine="bc.CopyPixelsFromBitmap(bmp)";
_bc._copypixelsfrombitmap(_bmp);
 //BA.debugLineNum = 1328;BA.debugLine="Dim count As Int = 3";
_count = (int) (3);
 //BA.debugLineNum = 1329;BA.debugLine="Dim clrs(3) As ARGBColor";
_clrs = new b4j.example.bitmapcreator._argbcolor[(int) (3)];
{
int d0 = _clrs.length;
for (int i0 = 0;i0 < d0;i0++) {
_clrs[i0] = new b4j.example.bitmapcreator._argbcolor();
}
}
;
 //BA.debugLineNum = 1330;BA.debugLine="Dim temp As ARGBColor";
_temp = new b4j.example.bitmapcreator._argbcolor();
 //BA.debugLineNum = 1331;BA.debugLine="Dim m As Int";
_m = 0;
 //BA.debugLineNum = 1332;BA.debugLine="For steps = 1 To count";
{
final int step10 = 1;
final int limit10 = _count;
_steps = (int) (1) ;
for (;_steps <= limit10 ;_steps = _steps + step10 ) {
 //BA.debugLineNum = 1333;BA.debugLine="For y = 0 To bc.mHeight - 1";
{
final int step11 = 1;
final int limit11 = (int) (_bc._mheight-1);
_y = (int) (0) ;
for (;_y <= limit11 ;_y = _y + step11 ) {
 //BA.debugLineNum = 1334;BA.debugLine="For x = 0 To 2";
{
final int step12 = 1;
final int limit12 = (int) (2);
_x = (int) (0) ;
for (;_x <= limit12 ;_x = _x + step12 ) {
 //BA.debugLineNum = 1335;BA.debugLine="bc.GetARGB(x, y, clrs(x))";
_bc._getargb(_x,_y,_clrs[_x]);
 }
};
 //BA.debugLineNum = 1337;BA.debugLine="SetAvg(bc, 1, y, clrs, temp)";
_setavg(_bc,(int) (1),_y,_clrs,_temp);
 //BA.debugLineNum = 1338;BA.debugLine="m = 0";
_m = (int) (0);
 //BA.debugLineNum = 1339;BA.debugLine="For x = 2 To bc.mWidth - 2";
{
final int step17 = 1;
final int limit17 = (int) (_bc._mwidth-2);
_x = (int) (2) ;
for (;_x <= limit17 ;_x = _x + step17 ) {
 //BA.debugLineNum = 1340;BA.debugLine="bc.GetARGB(x + 1, y, clrs(m))";
_bc._getargb((int) (_x+1),_y,_clrs[_m]);
 //BA.debugLineNum = 1341;BA.debugLine="m = (m + 1) Mod clrs.Length";
_m = (int) ((_m+1)%_clrs.length);
 //BA.debugLineNum = 1342;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
_setavg(_bc,_x,_y,_clrs,_temp);
 }
};
 }
};
 //BA.debugLineNum = 1345;BA.debugLine="For x = 0 To bc.mWidth - 1";
{
final int step23 = 1;
final int limit23 = (int) (_bc._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit23 ;_x = _x + step23 ) {
 //BA.debugLineNum = 1346;BA.debugLine="For y = 0 To 2";
{
final int step24 = 1;
final int limit24 = (int) (2);
_y = (int) (0) ;
for (;_y <= limit24 ;_y = _y + step24 ) {
 //BA.debugLineNum = 1347;BA.debugLine="bc.GetARGB(x, y, clrs(y))";
_bc._getargb(_x,_y,_clrs[_y]);
 }
};
 //BA.debugLineNum = 1349;BA.debugLine="SetAvg(bc, x, 1, clrs, temp)";
_setavg(_bc,_x,(int) (1),_clrs,_temp);
 //BA.debugLineNum = 1350;BA.debugLine="m = 0";
_m = (int) (0);
 //BA.debugLineNum = 1351;BA.debugLine="For y = 2 To bc.mHeight - 2";
{
final int step29 = 1;
final int limit29 = (int) (_bc._mheight-2);
_y = (int) (2) ;
for (;_y <= limit29 ;_y = _y + step29 ) {
 //BA.debugLineNum = 1352;BA.debugLine="bc.GetARGB(x, y + 1, clrs(m))";
_bc._getargb(_x,(int) (_y+1),_clrs[_m]);
 //BA.debugLineNum = 1353;BA.debugLine="m = (m + 1) Mod clrs.Length";
_m = (int) ((_m+1)%_clrs.length);
 //BA.debugLineNum = 1354;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
_setavg(_bc,_x,_y,_clrs,_temp);
 }
};
 }
};
 }
};
 } 
       catch (Exception e37) {
			ba.setLastException(e37); //BA.debugLineNum = 1359;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1361;BA.debugLine="Return bc.Bitmap";
if (true) return _bc._getbitmap();
 //BA.debugLineNum = 1362;BA.debugLine="End Sub";
return null;
}
public static String  _bluriv(String _image,anywheresoftware.b4j.objects.ImageViewWrapper _iv) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
 //BA.debugLineNum = 1313;BA.debugLine="Sub BlurIV (image As String,iv As ImageView)";
 //BA.debugLineNum = 1314;BA.debugLine="Try";
try { //BA.debugLineNum = 1315;BA.debugLine="Dim bmp As B4XBitmap = xui.LoadBitmapResize(File";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _xui.LoadBitmapResize(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_image,(int) (_iv.getWidth()),(int) (_iv.getHeight()),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1316;BA.debugLine="iv.SetImage(Blur(bmp))";
_iv.SetImage((javafx.scene.image.Image)(_blur(_bmp).getObject()));
 } 
       catch (Exception e5) {
			ba.setLastException(e5); //BA.debugLineNum = 1318;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1320;BA.debugLine="End Sub";
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
int _i = 0;
cloyd.blink.frmactivity _mf = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
Object _result = null;
int step8;
int limit8;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1384;BA.debugLine="btnDriveway.Enabled = False";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1385;BA.debugLine="btnRefresh.Enabled = False";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1386;BA.debugLine="btnActivity.Enabled = False";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1387;BA.debugLine="btnDrivewayNewClip.Enabled = False";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1388;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1389;BA.debugLine="btnSideYardNewClip.Enabled = False";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1391;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia-s";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/api/v1/accounts/88438/media/changed?since=-999999999-01-01T00:00:00+18:00&page=1");
 //BA.debugLineNum = 1393;BA.debugLine="For i = 1 To 20";
if (true) break;

case 1:
//for
this.state = 10;
step8 = 1;
limit8 = (int) (20);
_i = (int) (1) ;
this.state = 11;
if (true) break;

case 11:
//C
this.state = 10;
if ((step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8)) this.state = 3;
if (true) break;

case 12:
//C
this.state = 11;
_i = ((int)(0 + _i + step8)) ;
if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1394;BA.debugLine="If response = \"\" Then";
if (true) break;

case 4:
//if
this.state = 9;
if ((parent._response).equals("")) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 1395;BA.debugLine="Sleep(50)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (50));
this.state = 13;
return;
case 13:
//C
this.state = 9;
;
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 1397;BA.debugLine="Exit";
this.state = 10;
if (true) break;
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 1401;BA.debugLine="Dim mf As frmActivity";
_mf = new cloyd.blink.frmactivity();
 //BA.debugLineNum = 1402;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (ba,parent._mainform);
 //BA.debugLineNum = 1403;BA.debugLine="mf.authToken = authToken";
_mf._authtoken /*String*/  = parent._authtoken;
 //BA.debugLineNum = 1404;BA.debugLine="mf.Show(response,userRegion)";
_mf._show /*String*/ (parent._response,parent._userregion);
 //BA.debugLineNum = 1407;BA.debugLine="Dim rs As ResumableSub = GetUnwatchedVideos";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getunwatchedvideos();
 //BA.debugLineNum = 1408;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 14;
return;
case 14:
//C
this.state = -1;
_result = (Object) result[0];
;
 //BA.debugLineNum = 1410;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1411;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1412;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1413;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1414;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1415;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1416;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(Object _result) throws Exception{
}
public static String  _btndriveway_click() throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub btnDriveway_Click";
 //BA.debugLineNum = 170;BA.debugLine="clvDriveway.Clear";
_clvdriveway._clear();
 //BA.debugLineNum = 171;BA.debugLine="clvFrontDoor.Clear";
_clvfrontdoor._clear();
 //BA.debugLineNum = 172;BA.debugLine="clvSideYard.Clear";
_clvsideyard._clear();
 //BA.debugLineNum = 173;BA.debugLine="btnDriveway.Enabled = False";
_btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 174;BA.debugLine="btnRefresh.Enabled = False";
_btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 175;BA.debugLine="btnActivity.Enabled = False";
_btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 176;BA.debugLine="btnDrivewayNewClip.Enabled = False";
_btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 177;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
_btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 178;BA.debugLine="btnSideYardNewClip.Enabled = False";
_btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 179;BA.debugLine="RefreshCameras(False)";
_refreshcameras(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
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
int _i = 0;
int step11;
int limit11;
int step33;
int limit33;
int step40;
int limit40;
int step43;
int limit43;

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
 //BA.debugLineNum = 1526;BA.debugLine="If fx.Msgbox2(MainForm, \"Capture a new video for";
if (true) break;

case 1:
//if
this.state = 46;
if (parent._fx.Msgbox2(parent._mainform,"Capture a new video for the Driveway camera?",parent._mainform.getTitle(),"Yes","","No",parent._fx.MSGBOX_CONFIRMATION)==parent._fx.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1527;BA.debugLine="Try";
if (true) break;

case 4:
//try
this.state = 45;
this.catchState = 44;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 44;
 //BA.debugLineNum = 1528;BA.debugLine="btnDriveway.Enabled = False";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1529;BA.debugLine="btnRefresh.Enabled = False";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1530;BA.debugLine="btnActivity.Enabled = False";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1531;BA.debugLine="btnDrivewayNewClip.Enabled = False";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1532;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1533;BA.debugLine="btnSideYardNewClip.Enabled = False";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1534;BA.debugLine="lblStatus.Text = \"Capturing a new Driveway vide";
parent._lblstatus.setText("Capturing a new Driveway video clip...");
 //BA.debugLineNum = 1535;BA.debugLine="RESTPost(\"https://rest-\" & userRegion & \".immed";
_restpost("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/347574/clip");
 //BA.debugLineNum = 1536;BA.debugLine="For i = 1 To 20";
if (true) break;

case 7:
//for
this.state = 16;
step11 = 1;
limit11 = (int) (20);
_i = (int) (1) ;
this.state = 47;
if (true) break;

case 47:
//C
this.state = 16;
if ((step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11)) this.state = 9;
if (true) break;

case 48:
//C
this.state = 47;
_i = ((int)(0 + _i + step11)) ;
if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 1537;BA.debugLine="If response = \"\" Then";
if (true) break;

case 10:
//if
this.state = 15;
if ((parent._response).equals("")) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 //BA.debugLineNum = 1538;BA.debugLine="Sleep(50)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (50));
this.state = 49;
return;
case 49:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 1540;BA.debugLine="Exit";
this.state = 16;
if (true) break;
 if (true) break;

case 15:
//C
this.state = 48;
;
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 1543;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.C";

case 16:
//if
this.state = 19;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 1544;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1545;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1546;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1547;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1548;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1549;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1550;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1551;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1552;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1553;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
 //BA.debugLineNum = 1554;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 19:
//C
this.state = 20;
;
 //BA.debugLineNum = 1556;BA.debugLine="GetCommandID(response)";
_getcommandid(parent._response);
 //BA.debugLineNum = 1557;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
 //BA.debugLineNum = 1558;BA.debugLine="For i = 1 To 20";
if (true) break;

case 20:
//for
this.state = 29;
step33 = 1;
limit33 = (int) (20);
_i = (int) (1) ;
this.state = 50;
if (true) break;

case 50:
//C
this.state = 29;
if ((step33 > 0 && _i <= limit33) || (step33 < 0 && _i >= limit33)) this.state = 22;
if (true) break;

case 51:
//C
this.state = 50;
_i = ((int)(0 + _i + step33)) ;
if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 1559;BA.debugLine="If response = \"\" Then";
if (true) break;

case 23:
//if
this.state = 28;
if ((parent._response).equals("")) { 
this.state = 25;
}else {
this.state = 27;
}if (true) break;

case 25:
//C
this.state = 28;
 //BA.debugLineNum = 1560;BA.debugLine="Sleep(50)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (50));
this.state = 52;
return;
case 52:
//C
this.state = 28;
;
 if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 1562;BA.debugLine="Exit";
this.state = 29;
if (true) break;
 if (true) break;

case 28:
//C
this.state = 51;
;
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 1565;BA.debugLine="For i = 1 To 70";

case 29:
//for
this.state = 42;
step40 = 1;
limit40 = (int) (70);
_i = (int) (1) ;
this.state = 53;
if (true) break;

case 53:
//C
this.state = 42;
if ((step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40)) this.state = 31;
if (true) break;

case 54:
//C
this.state = 53;
_i = ((int)(0 + _i + step40)) ;
if (true) break;

case 31:
//C
this.state = 32;
 //BA.debugLineNum = 1566;BA.debugLine="GetCommandStatus(response)";
_getcommandstatus(parent._response);
 //BA.debugLineNum = 1567;BA.debugLine="If commandComplete Then";
if (true) break;

case 32:
//if
this.state = 41;
if (parent._commandcomplete) { 
this.state = 34;
}else {
this.state = 40;
}if (true) break;

case 34:
//C
this.state = 35;
 //BA.debugLineNum = 1568;BA.debugLine="For i = 3 To 1 Step -1";
if (true) break;

case 35:
//for
this.state = 38;
step43 = -1;
limit43 = (int) (1);
_i = (int) (3) ;
this.state = 55;
if (true) break;

case 55:
//C
this.state = 38;
if ((step43 > 0 && _i <= limit43) || (step43 < 0 && _i >= limit43)) this.state = 37;
if (true) break;

case 56:
//C
this.state = 55;
_i = ((int)(0 + _i + step43)) ;
if (true) break;

case 37:
//C
this.state = 56;
 //BA.debugLineNum = 1569;BA.debugLine="lblStatus.Text = \"New Driveway video clip wi";
parent._lblstatus.setText("New Driveway video clip will be shown in "+BA.NumberToString(_i)+" seconds...");
 //BA.debugLineNum = 1570;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 57;
return;
case 57:
//C
this.state = 56;
;
 if (true) break;
if (true) break;

case 38:
//C
this.state = 41;
;
 //BA.debugLineNum = 1572;BA.debugLine="btnActivity_Click";
_btnactivity_click();
 //BA.debugLineNum = 1573;BA.debugLine="Exit";
this.state = 42;
if (true) break;
 if (true) break;

case 40:
//C
this.state = 41;
 //BA.debugLineNum = 1575;BA.debugLine="lblStatus.Text = \"Awaiting for the Driveway v";
parent._lblstatus.setText("Awaiting for the Driveway video clip... "+BA.NumberToString(_i)+"/70");
 if (true) break;

case 41:
//C
this.state = 54;
;
 //BA.debugLineNum = 1577;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedi";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
 //BA.debugLineNum = 1578;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 58;
return;
case 58:
//C
this.state = 54;
;
 if (true) break;
if (true) break;

case 42:
//C
this.state = 45;
;
 if (true) break;

case 44:
//C
this.state = 45;
this.catchState = 0;
 //BA.debugLineNum = 1581;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 45:
//C
this.state = 46;
this.catchState = 0;
;
 //BA.debugLineNum = 1583;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1584;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1585;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1586;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1587;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1588;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1589;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
 if (true) break;

case 46:
//C
this.state = -1;
;
 //BA.debugLineNum = 1591;BA.debugLine="End Sub";
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
public static void  _btnfrontdoornewclip_click() throws Exception{
ResumableSub_btnFrontDoorNewClip_Click rsub = new ResumableSub_btnFrontDoorNewClip_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnFrontDoorNewClip_Click extends BA.ResumableSub {
public ResumableSub_btnFrontDoorNewClip_Click(cloyd.blink.main parent) {
this.parent = parent;
}
cloyd.blink.main parent;
int _i = 0;
int step11;
int limit11;
int step30;
int limit30;
int step37;
int limit37;
int step40;
int limit40;

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
 //BA.debugLineNum = 1594;BA.debugLine="If fx.Msgbox2(MainForm, \"Capture a new video for";
if (true) break;

case 1:
//if
this.state = 46;
if (parent._fx.Msgbox2(parent._mainform,"Capture a new video for the Front Door camera?",parent._mainform.getTitle(),"Yes","","No",parent._fx.MSGBOX_CONFIRMATION)==parent._fx.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1595;BA.debugLine="Try";
if (true) break;

case 4:
//try
this.state = 45;
this.catchState = 44;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 44;
 //BA.debugLineNum = 1596;BA.debugLine="btnDriveway.Enabled = False";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1597;BA.debugLine="btnRefresh.Enabled = False";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1598;BA.debugLine="btnActivity.Enabled = False";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1599;BA.debugLine="btnDrivewayNewClip.Enabled = False";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1600;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1601;BA.debugLine="btnSideYardNewClip.Enabled = False";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1602;BA.debugLine="lblStatus.Text = \"Capturing a new Front Door vi";
parent._lblstatus.setText("Capturing a new Front Door video clip...");
 //BA.debugLineNum = 1603;BA.debugLine="RESTPost(\"https://rest-\" & userRegion & \".immed";
_restpost("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/236967/clip");
 //BA.debugLineNum = 1604;BA.debugLine="For i = 1 To 20";
if (true) break;

case 7:
//for
this.state = 16;
step11 = 1;
limit11 = (int) (20);
_i = (int) (1) ;
this.state = 47;
if (true) break;

case 47:
//C
this.state = 16;
if ((step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11)) this.state = 9;
if (true) break;

case 48:
//C
this.state = 47;
_i = ((int)(0 + _i + step11)) ;
if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 1605;BA.debugLine="If response = \"\" Then";
if (true) break;

case 10:
//if
this.state = 15;
if ((parent._response).equals("")) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 //BA.debugLineNum = 1606;BA.debugLine="Sleep(50)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (50));
this.state = 49;
return;
case 49:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 1608;BA.debugLine="Exit";
this.state = 16;
if (true) break;
 if (true) break;

case 15:
//C
this.state = 48;
;
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 1611;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.C";

case 16:
//if
this.state = 19;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 1612;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1613;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1614;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1615;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1616;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1617;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1618;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
 //BA.debugLineNum = 1619;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 19:
//C
this.state = 20;
;
 //BA.debugLineNum = 1621;BA.debugLine="GetCommandID(response)";
_getcommandid(parent._response);
 //BA.debugLineNum = 1622;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
 //BA.debugLineNum = 1623;BA.debugLine="For i = 1 To 20";
if (true) break;

case 20:
//for
this.state = 29;
step30 = 1;
limit30 = (int) (20);
_i = (int) (1) ;
this.state = 50;
if (true) break;

case 50:
//C
this.state = 29;
if ((step30 > 0 && _i <= limit30) || (step30 < 0 && _i >= limit30)) this.state = 22;
if (true) break;

case 51:
//C
this.state = 50;
_i = ((int)(0 + _i + step30)) ;
if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 1624;BA.debugLine="If response = \"\" Then";
if (true) break;

case 23:
//if
this.state = 28;
if ((parent._response).equals("")) { 
this.state = 25;
}else {
this.state = 27;
}if (true) break;

case 25:
//C
this.state = 28;
 //BA.debugLineNum = 1625;BA.debugLine="Sleep(50)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (50));
this.state = 52;
return;
case 52:
//C
this.state = 28;
;
 if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 1627;BA.debugLine="Exit";
this.state = 29;
if (true) break;
 if (true) break;

case 28:
//C
this.state = 51;
;
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 1630;BA.debugLine="For i = 1 To 70";

case 29:
//for
this.state = 42;
step37 = 1;
limit37 = (int) (70);
_i = (int) (1) ;
this.state = 53;
if (true) break;

case 53:
//C
this.state = 42;
if ((step37 > 0 && _i <= limit37) || (step37 < 0 && _i >= limit37)) this.state = 31;
if (true) break;

case 54:
//C
this.state = 53;
_i = ((int)(0 + _i + step37)) ;
if (true) break;

case 31:
//C
this.state = 32;
 //BA.debugLineNum = 1631;BA.debugLine="GetCommandStatus(response)";
_getcommandstatus(parent._response);
 //BA.debugLineNum = 1632;BA.debugLine="If commandComplete Then";
if (true) break;

case 32:
//if
this.state = 41;
if (parent._commandcomplete) { 
this.state = 34;
}else {
this.state = 40;
}if (true) break;

case 34:
//C
this.state = 35;
 //BA.debugLineNum = 1633;BA.debugLine="For i = 3 To 1  Step -1";
if (true) break;

case 35:
//for
this.state = 38;
step40 = -1;
limit40 = (int) (1);
_i = (int) (3) ;
this.state = 55;
if (true) break;

case 55:
//C
this.state = 38;
if ((step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40)) this.state = 37;
if (true) break;

case 56:
//C
this.state = 55;
_i = ((int)(0 + _i + step40)) ;
if (true) break;

case 37:
//C
this.state = 56;
 //BA.debugLineNum = 1634;BA.debugLine="lblStatus.Text = \"New Front Door video clip";
parent._lblstatus.setText("New Front Door video clip will be shown in "+BA.NumberToString(_i)+" seconds...");
 //BA.debugLineNum = 1635;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 57;
return;
case 57:
//C
this.state = 56;
;
 if (true) break;
if (true) break;

case 38:
//C
this.state = 41;
;
 //BA.debugLineNum = 1637;BA.debugLine="btnActivity_Click";
_btnactivity_click();
 //BA.debugLineNum = 1638;BA.debugLine="Exit";
this.state = 42;
if (true) break;
 if (true) break;

case 40:
//C
this.state = 41;
 //BA.debugLineNum = 1640;BA.debugLine="lblStatus.Text = \"Awaiting for the Front Door";
parent._lblstatus.setText("Awaiting for the Front Door video clip... "+BA.NumberToString(_i)+"/70");
 if (true) break;

case 41:
//C
this.state = 54;
;
 //BA.debugLineNum = 1642;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedi";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
 //BA.debugLineNum = 1643;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 58;
return;
case 58:
//C
this.state = 54;
;
 if (true) break;
if (true) break;

case 42:
//C
this.state = 45;
;
 if (true) break;

case 44:
//C
this.state = 45;
this.catchState = 0;
 //BA.debugLineNum = 1646;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 45:
//C
this.state = 46;
this.catchState = 0;
;
 //BA.debugLineNum = 1648;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1649;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1650;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1651;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1652;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1653;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1654;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
 if (true) break;

case 46:
//C
this.state = -1;
;
 //BA.debugLineNum = 1656;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 1508;BA.debugLine="Sub btnRefresh_Click";
 //BA.debugLineNum = 1509;BA.debugLine="btnDriveway.Enabled = False";
_btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1510;BA.debugLine="btnRefresh.Enabled = False";
_btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1511;BA.debugLine="btnActivity.Enabled = False";
_btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1512;BA.debugLine="btnDrivewayNewClip.Enabled = False";
_btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1513;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
_btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1514;BA.debugLine="btnSideYardNewClip.Enabled = False";
_btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1515;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
_bluriv("Driveway.jpg",_ivdriveway);
 //BA.debugLineNum = 1516;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
_bluriv("FrontDoor.jpg",_ivfrontdoor);
 //BA.debugLineNum = 1517;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
_bluriv("SideYard.jpg",_ivsideyard);
 //BA.debugLineNum = 1522;BA.debugLine="RefreshCameras(True)";
_refreshcameras(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1523;BA.debugLine="End Sub";
return "";
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
int _i = 0;
int step11;
int limit11;
int step30;
int limit30;
int step37;
int limit37;
int step40;
int limit40;

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
 //BA.debugLineNum = 1659;BA.debugLine="If fx.Msgbox2(MainForm, \"Capture a new video for";
if (true) break;

case 1:
//if
this.state = 46;
if (parent._fx.Msgbox2(parent._mainform,"Capture a new video for the Side Yard camera?",parent._mainform.getTitle(),"Yes","","No",parent._fx.MSGBOX_CONFIRMATION)==parent._fx.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1660;BA.debugLine="Try";
if (true) break;

case 4:
//try
this.state = 45;
this.catchState = 44;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 44;
 //BA.debugLineNum = 1661;BA.debugLine="btnDriveway.Enabled = False";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1662;BA.debugLine="btnRefresh.Enabled = False";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1663;BA.debugLine="btnActivity.Enabled = False";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1664;BA.debugLine="btnDrivewayNewClip.Enabled = False";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1665;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1666;BA.debugLine="btnSideYardNewClip.Enabled = False";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1667;BA.debugLine="lblStatus.Text = \"Capturing a new Side Yard vid";
parent._lblstatus.setText("Capturing a new Side Yard video clip...");
 //BA.debugLineNum = 1668;BA.debugLine="RESTPost(\"https://rest-\" & userRegion & \".immed";
_restpost("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/226821/clip");
 //BA.debugLineNum = 1669;BA.debugLine="For i = 1 To 20";
if (true) break;

case 7:
//for
this.state = 16;
step11 = 1;
limit11 = (int) (20);
_i = (int) (1) ;
this.state = 47;
if (true) break;

case 47:
//C
this.state = 16;
if ((step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11)) this.state = 9;
if (true) break;

case 48:
//C
this.state = 47;
_i = ((int)(0 + _i + step11)) ;
if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 1670;BA.debugLine="If response = \"\" Then";
if (true) break;

case 10:
//if
this.state = 15;
if ((parent._response).equals("")) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 //BA.debugLineNum = 1671;BA.debugLine="Sleep(50)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (50));
this.state = 49;
return;
case 49:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 1673;BA.debugLine="Exit";
this.state = 16;
if (true) break;
 if (true) break;

case 15:
//C
this.state = 48;
;
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 1676;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.C";

case 16:
//if
this.state = 19;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 1677;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1678;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1679;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1680;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1681;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1682;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1683;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
 //BA.debugLineNum = 1684;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 19:
//C
this.state = 20;
;
 //BA.debugLineNum = 1686;BA.debugLine="GetCommandID(response)";
_getcommandid(parent._response);
 //BA.debugLineNum = 1687;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
 //BA.debugLineNum = 1688;BA.debugLine="For i = 1 To 20";
if (true) break;

case 20:
//for
this.state = 29;
step30 = 1;
limit30 = (int) (20);
_i = (int) (1) ;
this.state = 50;
if (true) break;

case 50:
//C
this.state = 29;
if ((step30 > 0 && _i <= limit30) || (step30 < 0 && _i >= limit30)) this.state = 22;
if (true) break;

case 51:
//C
this.state = 50;
_i = ((int)(0 + _i + step30)) ;
if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 1689;BA.debugLine="If response = \"\" Then";
if (true) break;

case 23:
//if
this.state = 28;
if ((parent._response).equals("")) { 
this.state = 25;
}else {
this.state = 27;
}if (true) break;

case 25:
//C
this.state = 28;
 //BA.debugLineNum = 1690;BA.debugLine="Sleep(50)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (50));
this.state = 52;
return;
case 52:
//C
this.state = 28;
;
 if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 1692;BA.debugLine="Exit";
this.state = 29;
if (true) break;
 if (true) break;

case 28:
//C
this.state = 51;
;
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 1695;BA.debugLine="For i = 1 To 70";

case 29:
//for
this.state = 42;
step37 = 1;
limit37 = (int) (70);
_i = (int) (1) ;
this.state = 53;
if (true) break;

case 53:
//C
this.state = 42;
if ((step37 > 0 && _i <= limit37) || (step37 < 0 && _i >= limit37)) this.state = 31;
if (true) break;

case 54:
//C
this.state = 53;
_i = ((int)(0 + _i + step37)) ;
if (true) break;

case 31:
//C
this.state = 32;
 //BA.debugLineNum = 1696;BA.debugLine="GetCommandStatus(response)";
_getcommandstatus(parent._response);
 //BA.debugLineNum = 1697;BA.debugLine="If commandComplete Then";
if (true) break;

case 32:
//if
this.state = 41;
if (parent._commandcomplete) { 
this.state = 34;
}else {
this.state = 40;
}if (true) break;

case 34:
//C
this.state = 35;
 //BA.debugLineNum = 1698;BA.debugLine="For i = 3 To 1 Step -1";
if (true) break;

case 35:
//for
this.state = 38;
step40 = -1;
limit40 = (int) (1);
_i = (int) (3) ;
this.state = 55;
if (true) break;

case 55:
//C
this.state = 38;
if ((step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40)) this.state = 37;
if (true) break;

case 56:
//C
this.state = 55;
_i = ((int)(0 + _i + step40)) ;
if (true) break;

case 37:
//C
this.state = 56;
 //BA.debugLineNum = 1699;BA.debugLine="lblStatus.Text = \"New Side Yard video clip w";
parent._lblstatus.setText("New Side Yard video clip will be shown in "+BA.NumberToString(_i)+" seconds...");
 //BA.debugLineNum = 1700;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 57;
return;
case 57:
//C
this.state = 56;
;
 if (true) break;
if (true) break;

case 38:
//C
this.state = 41;
;
 //BA.debugLineNum = 1702;BA.debugLine="btnActivity_Click";
_btnactivity_click();
 //BA.debugLineNum = 1703;BA.debugLine="Exit";
this.state = 42;
if (true) break;
 if (true) break;

case 40:
//C
this.state = 41;
 //BA.debugLineNum = 1705;BA.debugLine="lblStatus.Text = \"Awaiting for the Side Yard";
parent._lblstatus.setText("Awaiting for the Side Yard video clip... "+BA.NumberToString(_i)+"/70");
 if (true) break;

case 41:
//C
this.state = 54;
;
 //BA.debugLineNum = 1707;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedi";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
 //BA.debugLineNum = 1708;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 58;
return;
case 58:
//C
this.state = 54;
;
 if (true) break;
if (true) break;

case 42:
//C
this.state = 45;
;
 if (true) break;

case 44:
//C
this.state = 45;
this.catchState = 0;
 //BA.debugLineNum = 1711;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 45:
//C
this.state = 46;
this.catchState = 0;
;
 //BA.debugLineNum = 1713;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1714;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1715;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1716;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1717;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1718;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1719;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
 if (true) break;

case 46:
//C
this.state = -1;
;
 //BA.debugLineNum = 1721;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 931;BA.debugLine="Sub CheckBattLife(battlevel As Int) As String";
 //BA.debugLineNum = 932;BA.debugLine="Try";
try { //BA.debugLineNum = 934;BA.debugLine="If battlevel <= 136 Then";
if (_battlevel<=136) { 
 //BA.debugLineNum = 935;BA.debugLine="Return \"Replace battery now!\"";
if (true) return "Replace battery now!";
 }else if(_battlevel>=160) { 
 //BA.debugLineNum = 937;BA.debugLine="Return \"Very high\"";
if (true) return "Very high";
 }else if(_battlevel>136 && _battlevel<140) { 
 //BA.debugLineNum = 939;BA.debugLine="Return \"Very low\"";
if (true) return "Very low";
 }else {
 //BA.debugLineNum = 941;BA.debugLine="Return \"High\"";
if (true) return "High";
 };
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 944;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 945;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 947;BA.debugLine="End Sub";
return "";
}
public static String  _checklfrlevel(int _lfrlevel) throws Exception{
 //BA.debugLineNum = 949;BA.debugLine="Sub CheckLFRLevel(lfrlevel As Int) As String";
 //BA.debugLineNum = 950;BA.debugLine="Try";
try { //BA.debugLineNum = 952;BA.debugLine="If lfrlevel > -67 Then";
if (_lfrlevel>-67) { 
 //BA.debugLineNum = 953;BA.debugLine="Return \"Amazing\"";
if (true) return "Amazing";
 }else if(_lfrlevel>-70 && _lfrlevel<=-67) { 
 //BA.debugLineNum = 955;BA.debugLine="Return \"Very good\"";
if (true) return "Very good";
 }else if(_lfrlevel>-80 && _lfrlevel<=-70) { 
 //BA.debugLineNum = 957;BA.debugLine="Return \"OK\"";
if (true) return "OK";
 }else if(_lfrlevel>-90 && _lfrlevel<=-80) { 
 //BA.debugLineNum = 959;BA.debugLine="Return \"Not Good\"";
if (true) return "Not Good";
 }else {
 //BA.debugLineNum = 961;BA.debugLine="Return \"Unusable\"";
if (true) return "Unusable";
 };
 } 
       catch (Exception e14) {
			ba.setLastException(e14); //BA.debugLineNum = 964;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 965;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 967;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.JFX.ScreenWrapper  _checkmonitor() throws Exception{
anywheresoftware.b4a.objects.collections.List _slist = null;
anywheresoftware.b4j.objects.JFX.ScreenWrapper _s = null;
 //BA.debugLineNum = 1080;BA.debugLine="Sub CheckMonitor() As Screen";
 //BA.debugLineNum = 1081;BA.debugLine="Try";
try { //BA.debugLineNum = 1082;BA.debugLine="If fx.Screens.Size= 1 Then";
if (_fx.getScreens().getSize()==1) { 
 //BA.debugLineNum = 1083;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 1084;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 1086;BA.debugLine="Return S";
if (true) return _s;
 }else if(_fx.getScreens().getSize()>1) { 
 //BA.debugLineNum = 1088;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 1089;BA.debugLine="Dim S As Screen = SList.Get(2)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (2))));
 //BA.debugLineNum = 1091;BA.debugLine="Return S";
if (true) return _s;
 }else {
 //BA.debugLineNum = 1093;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 1094;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 1096;BA.debugLine="Return S";
if (true) return _s;
 };
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 1099;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 1100;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 1102;BA.debugLine="Return S";
if (true) return _s;
 };
 //BA.debugLineNum = 1104;BA.debugLine="End Sub";
return null;
}
public static String  _close_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 1006;BA.debugLine="Private Sub Close_Entered_Event(e As Event)";
 //BA.debugLineNum = 1007;BA.debugLine="Try";
try { //BA.debugLineNum = 1008;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
_ivclose.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btCloseEnt.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 1010;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1012;BA.debugLine="End Sub";
return "";
}
public static String  _close_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 1014;BA.debugLine="Private Sub Close_Exited_Event(e As Event)";
 //BA.debugLineNum = 1015;BA.debugLine="Try";
try { //BA.debugLineNum = 1016;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
_ivclose.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btClose.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 1018;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1020;BA.debugLine="End Sub";
return "";
}
public static String  _clvdriveway_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 1126;BA.debugLine="Sub clvDriveway_ItemClick (Index As Int, Value As";
 //BA.debugLineNum = 1127;BA.debugLine="Try";
try { //BA.debugLineNum = 1128;BA.debugLine="clvDriveway.JumpToItem(Index)";
_clvdriveway._jumptoitem(_index);
 //BA.debugLineNum = 1129;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
_clvfrontdoor._jumptoitem(_index);
 //BA.debugLineNum = 1130;BA.debugLine="clvSideYard.JumpToItem(Index)";
_clvsideyard._jumptoitem(_index);
 } 
       catch (Exception e6) {
			ba.setLastException(e6); //BA.debugLineNum = 1132;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1134;BA.debugLine="End Sub";
return "";
}
public static String  _clvfrontdoor_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 1116;BA.debugLine="Sub clvFrontDoor_ItemClick (Index As Int, Value As";
 //BA.debugLineNum = 1117;BA.debugLine="Try";
try { //BA.debugLineNum = 1118;BA.debugLine="clvDriveway.JumpToItem(Index)";
_clvdriveway._jumptoitem(_index);
 //BA.debugLineNum = 1119;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
_clvfrontdoor._jumptoitem(_index);
 //BA.debugLineNum = 1120;BA.debugLine="clvSideYard.JumpToItem(Index)";
_clvsideyard._jumptoitem(_index);
 } 
       catch (Exception e6) {
			ba.setLastException(e6); //BA.debugLineNum = 1122;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1124;BA.debugLine="End Sub";
return "";
}
public static String  _clvsideyard_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 1106;BA.debugLine="Sub clvSideYard_ItemClick (Index As Int, Value As";
 //BA.debugLineNum = 1107;BA.debugLine="Try";
try { //BA.debugLineNum = 1108;BA.debugLine="clvDriveway.JumpToItem(Index)";
_clvdriveway._jumptoitem(_index);
 //BA.debugLineNum = 1109;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
_clvfrontdoor._jumptoitem(_index);
 //BA.debugLineNum = 1110;BA.debugLine="clvSideYard.JumpToItem(Index)";
_clvsideyard._jumptoitem(_index);
 } 
       catch (Exception e6) {
			ba.setLastException(e6); //BA.debugLineNum = 1112;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1114;BA.debugLine="End Sub";
return "";
}
public static String  _convertdatetime(String _inputtime) throws Exception{
String _timestampprocessed = "";
long _ticks = 0L;
long _lngticks = 0L;
b4j.example.dateutils._period _p = null;
 //BA.debugLineNum = 1428;BA.debugLine="Sub ConvertDateTime(inputTime As String) As String";
 //BA.debugLineNum = 1430;BA.debugLine="Dim timestampProcessed As String";
_timestampprocessed = "";
 //BA.debugLineNum = 1431;BA.debugLine="timestampProcessed =  ConvertFullDateTime(inputTi";
_timestampprocessed = _convertfulldatetime(_inputtime);
 //BA.debugLineNum = 1433;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = _parseutcstring(_inputtime.replace("+00:00","+0000"));
 //BA.debugLineNum = 1434;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a");
 //BA.debugLineNum = 1435;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
 //BA.debugLineNum = 1436;BA.debugLine="Dim p As Period = DateUtils.PeriodBetween(lngTick";
_p = _dateutils._periodbetween(_lngticks,anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 1438;BA.debugLine="If timestampProcessed.Contains(\"Yesterday\") Or ti";
if (_timestampprocessed.contains("Yesterday") || _timestampprocessed.contains("Today")) { 
 //BA.debugLineNum = 1439;BA.debugLine="If p.Days = 0 Then";
if (_p.Days==0) { 
 //BA.debugLineNum = 1440;BA.debugLine="If p.Hours = 0 Then";
if (_p.Hours==0) { 
 //BA.debugLineNum = 1441;BA.debugLine="If p.Minutes = 0 Then";
if (_p.Minutes==0) { 
 //BA.debugLineNum = 1442;BA.debugLine="Return timestampProcessed & \" (\" & p.Seconds";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Seconds)+"s ago)";
 }else {
 //BA.debugLineNum = 1444;BA.debugLine="Return timestampProcessed & \" (\" & p.Minutes";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago)";
 };
 }else {
 //BA.debugLineNum = 1447;BA.debugLine="Return timestampProcessed & \" (\" & p.Hours & \"";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago)";
 };
 }else if(_p.Hours==0) { 
 //BA.debugLineNum = 1450;BA.debugLine="If p.Minutes = 0 Then";
if (_p.Minutes==0) { 
 //BA.debugLineNum = 1451;BA.debugLine="Return timestampProcessed & \" (\" & p.Seconds &";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Seconds)+"s ago)";
 }else {
 //BA.debugLineNum = 1453;BA.debugLine="Return timestampProcessed & \" (\" & p.Minutes &";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago)";
 };
 }else if(_p.Minutes==0) { 
 //BA.debugLineNum = 1456;BA.debugLine="Return timestampProcessed & \" (\" & p.Seconds &";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Seconds)+"s ago)";
 }else {
 //BA.debugLineNum = 1458;BA.debugLine="Return timestampProcessed & \" (\" & p.Days & \"d";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Days)+"d "+BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago)";
 };
 }else {
 //BA.debugLineNum = 1461;BA.debugLine="Return timestampProcessed & \" (\" & p.Days & \"d \"";
if (true) return _timestampprocessed+" ("+BA.NumberToString(_p.Days)+"d "+BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago)";
 };
 //BA.debugLineNum = 1464;BA.debugLine="End Sub";
return "";
}
public static String  _convertdatetimeplain(String _inputtime) throws Exception{
long _ticks = 0L;
long _lngticks = 0L;
 //BA.debugLineNum = 1418;BA.debugLine="Sub ConvertDateTimePlain(inputTime As String) As S";
 //BA.debugLineNum = 1420;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = _parseutcstring(_inputtime.replace("+00:00","+0000"));
 //BA.debugLineNum = 1421;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a");
 //BA.debugLineNum = 1422;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
 //BA.debugLineNum = 1425;BA.debugLine="Return DateTime.Date(lngTicks)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(_lngticks);
 //BA.debugLineNum = 1426;BA.debugLine="End Sub";
return "";
}
public static String  _convertfulldatetime(String _inputtime) throws Exception{
long _ticks = 0L;
long _lngticks = 0L;
long _yesterday = 0L;
long _timestamp = 0L;
 //BA.debugLineNum = 1466;BA.debugLine="Sub ConvertFullDateTime(inputTime As String) As St";
 //BA.debugLineNum = 1468;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = _parseutcstring(_inputtime.replace("+00:00","+0000"));
 //BA.debugLineNum = 1469;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a");
 //BA.debugLineNum = 1470;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
 //BA.debugLineNum = 1472;BA.debugLine="Dim Yesterday As Long";
_yesterday = 0L;
 //BA.debugLineNum = 1473;BA.debugLine="Dim timestamp As Long";
_timestamp = 0L;
 //BA.debugLineNum = 1474;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyyMMdd");
 //BA.debugLineNum = 1475;BA.debugLine="Yesterday = DateTime.Date(DateTime.add(DateTime.N";
_yesterday = (long)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.Add(anywheresoftware.b4a.keywords.Common.DateTime.getNow(),(int) (0),(int) (0),(int) (-1)))));
 //BA.debugLineNum = 1476;BA.debugLine="timestamp = DateTime.Date(lngTicks)";
_timestamp = (long)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.DateTime.Date(_lngticks)));
 //BA.debugLineNum = 1478;BA.debugLine="DateTime.DateFormat = \"h:mm:ss a\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("h:mm:ss a");
 //BA.debugLineNum = 1479;BA.debugLine="If DateUtils.IsSameDay(lngTicks,DateTime.now) The";
if (_dateutils._issameday(_lngticks,anywheresoftware.b4a.keywords.Common.DateTime.getNow())) { 
 //BA.debugLineNum = 1480;BA.debugLine="Return \"Today \" & DateTime.Date(lngTicks)";
if (true) return "Today "+anywheresoftware.b4a.keywords.Common.DateTime.Date(_lngticks);
 }else if(_yesterday==_timestamp) { 
 //BA.debugLineNum = 1482;BA.debugLine="Return \"Yesterday \" & DateTime.Date(lngTicks)";
if (true) return "Yesterday "+anywheresoftware.b4a.keywords.Common.DateTime.Date(_lngticks);
 }else {
 //BA.debugLineNum = 1484;BA.debugLine="Return DateUtils.GetDayOfWeekName(lngTicks) & \"";
if (true) return _dateutils._getdayofweekname(_lngticks)+" "+anywheresoftware.b4a.keywords.Common.DateTime.Date(_lngticks);
 };
 //BA.debugLineNum = 1486;BA.debugLine="End Sub";
return "";
}
public static void  _downloadimage(String _link,anywheresoftware.b4j.objects.ImageViewWrapper _iv,String _camera) throws Exception{
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

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 508;BA.debugLine="Try";
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
 //BA.debugLineNum = 509;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
 //BA.debugLineNum = 510;BA.debugLine="response = \"\"";
parent._response = "";
 //BA.debugLineNum = 511;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",main.getObject());
 //BA.debugLineNum = 512;BA.debugLine="j.Download(Link)";
_j._download /*String*/ (_link);
 //BA.debugLineNum = 513;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("TOKEN_AUTH",parent._authtoken);
 //BA.debugLineNum = 514;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 21;
return;
case 21:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[0];
;
 //BA.debugLineNum = 515;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 517;BA.debugLine="If camera = \"347574\" Then";
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
 //BA.debugLineNum = 518;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Driveway.jpg",anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 11:
//C
this.state = 14;
 //BA.debugLineNum = 520;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"FrontDoor.jpg",anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 522;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"SideYard.jpg",anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 14:
//C
this.state = 17;
;
 //BA.debugLineNum = 524;BA.debugLine="File.Copy2(j.GetInputStream, out)";
anywheresoftware.b4a.keywords.Common.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ ().getObject()),(java.io.OutputStream)(_out.getObject()));
 //BA.debugLineNum = 525;BA.debugLine="out.Close '<------ very important";
_out.Close();
 //BA.debugLineNum = 528;BA.debugLine="iv.SetImage(j.GetBitmap)";
_iv.SetImage((javafx.scene.image.Image)(_j._getbitmap /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ ().getObject()));
 if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 530;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
parent._response = "ERROR: "+_j._errormessage /*String*/ ;
 //BA.debugLineNum = 531;BA.debugLine="lblStatus.Text = GetRESTError(j.ErrorMessage)";
parent._lblstatus.setText(_getresterror(_j._errormessage /*String*/ ));
 if (true) break;

case 17:
//C
this.state = 20;
;
 //BA.debugLineNum = 533;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
 //BA.debugLineNum = 535;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 20:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 537;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 1068;BA.debugLine="Public Sub Get_css";
 //BA.debugLineNum = 1069;BA.debugLine="Try";
try { //BA.debugLineNum = 1070;BA.debugLine="Dim jForm As JavaObject = MainForm";
_jform = new anywheresoftware.b4j.object.JavaObject();
_jform.setObject((java.lang.Object)(_mainform));
 //BA.debugLineNum = 1071;BA.debugLine="Dim scene As JavaObject = jForm.GetField(\"scene\"";
_scene = new anywheresoftware.b4j.object.JavaObject();
_scene.setObject((java.lang.Object)(_jform.GetField("scene")));
 //BA.debugLineNum = 1072;BA.debugLine="Dim stylesheets As List = scene.RunMethod(\"getSt";
_stylesheets = new anywheresoftware.b4a.objects.collections.List();
_stylesheets.setObject((java.util.List)(_scene.RunMethod("getStylesheets",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
 //BA.debugLineNum = 1073;BA.debugLine="stylesheets.Clear";
_stylesheets.Clear();
 //BA.debugLineNum = 1074;BA.debugLine="stylesheets.Add(File.GetUri(File.DirAssets, imgI";
_stylesheets.Add((Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+".css")));
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 1076;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1078;BA.debugLine="End Sub";
return "";
}
public static String  _getauthinfo(String _json) throws Exception{
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.Map _authtokenmap = null;
anywheresoftware.b4a.objects.collections.Map _networks = null;
anywheresoftware.b4a.objects.collections.Map _region = null;
 //BA.debugLineNum = 540;BA.debugLine="Sub GetAuthInfo(json As String)";
 //BA.debugLineNum = 541;BA.debugLine="Try";
try { //BA.debugLineNum = 542;BA.debugLine="lblStatus.Text = \"Getting authtoken...\"";
_lblstatus.setText("Getting authtoken...");
 //BA.debugLineNum = 543;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 544;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 545;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 546;BA.debugLine="Dim authtokenmap As Map = root.Get(\"authtoken\")";
_authtokenmap = new anywheresoftware.b4a.objects.collections.Map();
_authtokenmap.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("authtoken"))));
 //BA.debugLineNum = 547;BA.debugLine="authToken = authtokenmap.Get(\"authtoken\")";
_authtoken = BA.ObjectToString(_authtokenmap.Get((Object)("authtoken")));
 //BA.debugLineNum = 548;BA.debugLine="Log(\"authToken: \" &  authToken)";
anywheresoftware.b4a.keywords.Common.Log("authToken: "+_authtoken);
 //BA.debugLineNum = 552;BA.debugLine="Dim networks As Map = root.Get(\"networks\")";
_networks = new anywheresoftware.b4a.objects.collections.Map();
_networks.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("networks"))));
 //BA.debugLineNum = 553;BA.debugLine="Log(\"networkID: \" & networks.GetKeyAt(0))";
anywheresoftware.b4a.keywords.Common.Log("networkID: "+BA.ObjectToString(_networks.GetKeyAt((int) (0))));
 //BA.debugLineNum = 554;BA.debugLine="networkID = networks.GetKeyAt(0)";
_networkid = BA.ObjectToString(_networks.GetKeyAt((int) (0)));
 //BA.debugLineNum = 558;BA.debugLine="Dim region As Map = root.Get(\"region\")";
_region = new anywheresoftware.b4a.objects.collections.Map();
_region.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("region"))));
 //BA.debugLineNum = 559;BA.debugLine="userRegion = region.GetKeyAt(0)";
_userregion = BA.ObjectToString(_region.GetKeyAt((int) (0)));
 //BA.debugLineNum = 560;BA.debugLine="Log(\"userRegion: \" &  userRegion)";
anywheresoftware.b4a.keywords.Common.Log("userRegion: "+_userregion);
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 565;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 568;BA.debugLine="End Sub";
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
String _strtimestamp = "";
int _i = 0;
String _item = "";
 //BA.debugLineNum = 655;BA.debugLine="Sub GetCameraInfo(json As String, clv As CustomLis";
 //BA.debugLineNum = 656;BA.debugLine="Try";
try { //BA.debugLineNum = 657;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 658;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 659;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 660;BA.debugLine="Dim camera_status As Map = root.Get(\"camera_stat";
_camera_status = new anywheresoftware.b4a.objects.collections.Map();
_camera_status.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("camera_status"))));
 //BA.debugLineNum = 661;BA.debugLine="Dim total_108_wakeups As Int = camera_status.Get";
_total_108_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("total_108_wakeups"))));
 //BA.debugLineNum = 662;BA.debugLine="Dim battery_voltage As Int = camera_status.Get(\"";
_battery_voltage = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("battery_voltage"))));
 //BA.debugLineNum = 663;BA.debugLine="Dim light_sensor_data_valid As String = camera_s";
_light_sensor_data_valid = BA.ObjectToString(_camera_status.Get((Object)("light_sensor_data_valid")));
 //BA.debugLineNum = 664;BA.debugLine="Dim lfr_tb_wakeups As Int = camera_status.Get(\"l";
_lfr_tb_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lfr_tb_wakeups"))));
 //BA.debugLineNum = 665;BA.debugLine="Dim fw_git_hash As String = camera_status.Get(\"f";
_fw_git_hash = BA.ObjectToString(_camera_status.Get((Object)("fw_git_hash")));
 //BA.debugLineNum = 666;BA.debugLine="Dim wifi_strength As Int = camera_status.Get(\"wi";
_wifi_strength = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("wifi_strength"))));
 //BA.debugLineNum = 667;BA.debugLine="Dim lfr_strength As Int = camera_status.Get(\"lfr";
_lfr_strength = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lfr_strength"))));
 //BA.debugLineNum = 668;BA.debugLine="Dim total_tb_wakeups As Int = camera_status.Get(";
_total_tb_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("total_tb_wakeups"))));
 //BA.debugLineNum = 669;BA.debugLine="Dim created_at As String = camera_status.Get(\"cr";
_created_at = BA.ObjectToString(_camera_status.Get((Object)("created_at")));
 //BA.debugLineNum = 670;BA.debugLine="Dim light_sensor_ch0 As Int = camera_status.Get(";
_light_sensor_ch0 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("light_sensor_ch0"))));
 //BA.debugLineNum = 671;BA.debugLine="Dim mac As String = camera_status.Get(\"mac\")";
_mac = BA.ObjectToString(_camera_status.Get((Object)("mac")));
 //BA.debugLineNum = 672;BA.debugLine="Dim unit_number As Int = camera_status.Get(\"unit";
_unit_number = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("unit_number"))));
 //BA.debugLineNum = 673;BA.debugLine="Dim updated_at As String = camera_status.Get(\"up";
_updated_at = BA.ObjectToString(_camera_status.Get((Object)("updated_at")));
 //BA.debugLineNum = 674;BA.debugLine="Dim light_sensor_ch1 As Int = camera_status.Get(";
_light_sensor_ch1 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("light_sensor_ch1"))));
 //BA.debugLineNum = 675;BA.debugLine="Dim time_dhcp_lease As Int = camera_status.Get(\"";
_time_dhcp_lease = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_dhcp_lease"))));
 //BA.debugLineNum = 676;BA.debugLine="Dim temperature As Int = camera_status.Get(\"temp";
_temperature = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("temperature"))));
 //BA.debugLineNum = 677;BA.debugLine="Dim time_first_video As Int = camera_status.Get(";
_time_first_video = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_first_video"))));
 //BA.debugLineNum = 678;BA.debugLine="Dim time_dns_resolve As Int = camera_status.Get(";
_time_dns_resolve = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_dns_resolve"))));
 //BA.debugLineNum = 679;BA.debugLine="Dim id As Int = camera_status.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("id"))));
 //BA.debugLineNum = 680;BA.debugLine="Dim temp_alert_status As String = camera_status.";
_temp_alert_status = BA.ObjectToString(_camera_status.Get((Object)("temp_alert_status")));
 //BA.debugLineNum = 681;BA.debugLine="Dim time_108_boot As Int = camera_status.Get(\"ti";
_time_108_boot = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_108_boot"))));
 //BA.debugLineNum = 682;BA.debugLine="Dim lfr_108_wakeups As Int = camera_status.Get(\"";
_lfr_108_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lfr_108_wakeups"))));
 //BA.debugLineNum = 683;BA.debugLine="cameraThumbnail = camera_status.Get(\"thumbnail\")";
_camerathumbnail = BA.ObjectToString(_camera_status.Get((Object)("thumbnail")));
 //BA.debugLineNum = 684;BA.debugLine="Log(\"cameraThumbnail: \" & cameraThumbnail)";
anywheresoftware.b4a.keywords.Common.Log("cameraThumbnail: "+_camerathumbnail);
 //BA.debugLineNum = 685;BA.debugLine="Dim lifetime_duration As Int = camera_status.Get";
_lifetime_duration = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lifetime_duration"))));
 //BA.debugLineNum = 686;BA.debugLine="Dim wifi_connect_failure_count As Int = camera_s";
_wifi_connect_failure_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("wifi_connect_failure_count"))));
 //BA.debugLineNum = 687;BA.debugLine="Dim camera_id As Int = camera_status.Get(\"camera";
_camera_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("camera_id"))));
 //BA.debugLineNum = 688;BA.debugLine="Dim battery_alert_status As String = camera_stat";
_battery_alert_status = BA.ObjectToString(_camera_status.Get((Object)("battery_alert_status")));
 //BA.debugLineNum = 689;BA.debugLine="Dim dhcp_failure_count As Int = camera_status.Ge";
_dhcp_failure_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dhcp_failure_count"))));
 //BA.debugLineNum = 690;BA.debugLine="Dim ip_address As String = camera_status.Get(\"ip";
_ip_address = BA.ObjectToString(_camera_status.Get((Object)("ip_address")));
 //BA.debugLineNum = 691;BA.debugLine="Dim ipv As String = camera_status.Get(\"ipv\")";
_ipv = BA.ObjectToString(_camera_status.Get((Object)("ipv")));
 //BA.debugLineNum = 692;BA.debugLine="Dim light_sensor_data_new As String = camera_sta";
_light_sensor_data_new = BA.ObjectToString(_camera_status.Get((Object)("light_sensor_data_new")));
 //BA.debugLineNum = 693;BA.debugLine="Dim network_id As Int = camera_status.Get(\"netwo";
_network_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("network_id"))));
 //BA.debugLineNum = 694;BA.debugLine="Dim account_id As Int = camera_status.Get(\"accou";
_account_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("account_id"))));
 //BA.debugLineNum = 695;BA.debugLine="Dim serial As String = camera_status.Get(\"serial";
_serial = BA.ObjectToString(_camera_status.Get((Object)("serial")));
 //BA.debugLineNum = 696;BA.debugLine="Dim dev_1 As Int = camera_status.Get(\"dev_1\")";
_dev_1 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dev_1"))));
 //BA.debugLineNum = 697;BA.debugLine="Dim time_wlan_connect As Int = camera_status.Get";
_time_wlan_connect = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_wlan_connect"))));
 //BA.debugLineNum = 698;BA.debugLine="Dim dev_2 As Int = camera_status.Get(\"dev_2\")";
_dev_2 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dev_2"))));
 //BA.debugLineNum = 699;BA.debugLine="Dim socket_failure_count As Int = camera_status.";
_socket_failure_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("socket_failure_count"))));
 //BA.debugLineNum = 700;BA.debugLine="Dim dev_3 As Int = camera_status.Get(\"dev_3\")";
_dev_3 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dev_3"))));
 //BA.debugLineNum = 701;BA.debugLine="Dim pir_rejections As Int = camera_status.Get(\"p";
_pir_rejections = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("pir_rejections"))));
 //BA.debugLineNum = 702;BA.debugLine="Dim sync_module_id As Int = camera_status.Get(\"s";
_sync_module_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("sync_module_id"))));
 //BA.debugLineNum = 703;BA.debugLine="Dim lifetime_count As Int = camera_status.Get(\"l";
_lifetime_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lifetime_count"))));
 //BA.debugLineNum = 704;BA.debugLine="Dim error_codes As Int = camera_status.Get(\"erro";
_error_codes = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("error_codes"))));
 //BA.debugLineNum = 705;BA.debugLine="Dim fw_version As String = camera_status.Get(\"fw";
_fw_version = BA.ObjectToString(_camera_status.Get((Object)("fw_version")));
 //BA.debugLineNum = 706;BA.debugLine="Dim ac_power As String = camera_status.Get(\"ac_p";
_ac_power = BA.ObjectToString(_camera_status.Get((Object)("ac_power")));
 //BA.debugLineNum = 708;BA.debugLine="clv.Clear";
_clv._clear();
 //BA.debugLineNum = 709;BA.debugLine="clv.AddTextItem(\"Battery voltage: \" & NumberForm";
_clv._addtextitem((Object)("Battery voltage: "+anywheresoftware.b4a.keywords.Common.NumberFormat((_battery_voltage/(double)100),(int) (0),(int) (2))+"V - "+_checkbattlife(_battery_voltage)),(Object)("battery_voltage"));
 //BA.debugLineNum = 710;BA.debugLine="clv.AddTextItem(\"Camera to WiFi strength: \" & wi";
_clv._addtextitem((Object)("Camera to WiFi strength: "+BA.NumberToString(_wifi_strength)+" dBm - "+_checklfrlevel(_wifi_strength)),(Object)("wifi_strength"));
 //BA.debugLineNum = 711;BA.debugLine="clv.AddTextItem(\"Camera to Sync Module strength";
_clv._addtextitem((Object)("Camera to Sync Module strength (LFR): "+BA.NumberToString(_lfr_strength)+" dBm - "+_checklfrlevel(_lfr_strength)),(Object)("lfr_strength"));
 //BA.debugLineNum = 712;BA.debugLine="clv.AddTextItem(\"Temperature: \" & temperature &";
_clv._addtextitem((Object)("Temperature: "+BA.NumberToString(_temperature)+"ºF"),(Object)("temperature"));
 //BA.debugLineNum = 713;BA.debugLine="clv.AddTextItem(\"Firmware version: \" & fw_versio";
_clv._addtextitem((Object)("Firmware version: "+_fw_version),(Object)("fw_version"));
 //BA.debugLineNum = 714;BA.debugLine="clv.AddTextItem(\"Firmware Git Hash: \" & fw_git_h";
_clv._addtextitem((Object)("Firmware Git Hash: "+_fw_git_hash),(Object)("fw_git_hash"));
 //BA.debugLineNum = 715;BA.debugLine="clv.AddTextItem(\"Battery alert status: \" & batte";
_clv._addtextitem((Object)("Battery alert status: "+_battery_alert_status),(Object)("battery_alert_status"));
 //BA.debugLineNum = 716;BA.debugLine="clv.AddTextItem(\"Temperature alert status: \" & t";
_clv._addtextitem((Object)("Temperature alert status: "+_temp_alert_status),(Object)("temp_alert_status"));
 //BA.debugLineNum = 717;BA.debugLine="clv.AddTextItem(\"Updated at: \" & ConvertDateTime";
_clv._addtextitem((Object)("Updated at: "+_convertdatetimeplain(_updated_at)),(Object)("updated_at"));
 //BA.debugLineNum = 718;BA.debugLine="clv.AddTextItem(\"Created at: \" & ConvertDateTime";
_clv._addtextitem((Object)("Created at: "+_convertdatetimeplain(_created_at)),(Object)("created_at"));
 //BA.debugLineNum = 719;BA.debugLine="clv.AddTextItem(\"IP address: \" & ip_address, \"ip";
_clv._addtextitem((Object)("IP address: "+_ip_address),(Object)("ip_address"));
 //BA.debugLineNum = 720;BA.debugLine="clv.AddTextItem(\"MAC address: \" & mac, \"mac\")";
_clv._addtextitem((Object)("MAC address: "+_mac),(Object)("mac"));
 //BA.debugLineNum = 721;BA.debugLine="clv.AddTextItem(\"Camera ID: \" & camera_id, \"came";
_clv._addtextitem((Object)("Camera ID: "+BA.NumberToString(_camera_id)),(Object)("camera_id"));
 //BA.debugLineNum = 722;BA.debugLine="clv.AddTextItem(\"Serial: \" & serial, \"serial\")";
_clv._addtextitem((Object)("Serial: "+_serial),(Object)("serial"));
 //BA.debugLineNum = 723;BA.debugLine="clv.AddTextItem(\"Network ID: \" & network_id, \"ne";
_clv._addtextitem((Object)("Network ID: "+BA.NumberToString(_network_id)),(Object)("network_id"));
 //BA.debugLineNum = 724;BA.debugLine="clv.AddTextItem(\"Account ID: \" & account_id, \"ac";
_clv._addtextitem((Object)("Account ID: "+BA.NumberToString(_account_id)),(Object)("account_id"));
 //BA.debugLineNum = 725;BA.debugLine="clv.AddTextItem(\"ID: \" & id, \"id\")";
_clv._addtextitem((Object)("ID: "+BA.NumberToString(_id)),(Object)("id"));
 //BA.debugLineNum = 726;BA.debugLine="clv.AddTextItem(\"Sync Module ID: \" & sync_module";
_clv._addtextitem((Object)("Sync Module ID: "+BA.NumberToString(_sync_module_id)),(Object)("sync_module_id"));
 //BA.debugLineNum = 727;BA.debugLine="clv.AddTextItem(\"Light sensor data valid: \" & li";
_clv._addtextitem((Object)("Light sensor data valid: "+_light_sensor_data_valid),(Object)("light_sensor_data_valid"));
 //BA.debugLineNum = 728;BA.debugLine="clv.AddTextItem(\"DHCP failure count: \" & dhcp_fa";
_clv._addtextitem((Object)("DHCP failure count: "+BA.NumberToString(_dhcp_failure_count)),(Object)("dhcp_failure_count"));
 //BA.debugLineNum = 729;BA.debugLine="clv.AddTextItem(\"LFR tb wakeups: \" & lfr_tb_wake";
_clv._addtextitem((Object)("LFR tb wakeups: "+BA.NumberToString(_lfr_tb_wakeups)),(Object)("lfr_tb_wakeups"));
 //BA.debugLineNum = 730;BA.debugLine="clv.AddTextItem(\"Socket failure count: \" & socke";
_clv._addtextitem((Object)("Socket failure count: "+BA.NumberToString(_socket_failure_count)),(Object)("socket_failure_count"));
 //BA.debugLineNum = 731;BA.debugLine="clv.AddTextItem(\"Camera thumbnail: \" & cameraThu";
_clv._addtextitem((Object)("Camera thumbnail: "+_camerathumbnail),(Object)("thumbnail"));
 //BA.debugLineNum = 732;BA.debugLine="clv.AddTextItem(\"WiFi connect failure count: \" &";
_clv._addtextitem((Object)("WiFi connect failure count: "+BA.NumberToString(_wifi_connect_failure_count)),(Object)("wifi_connect_failure_count"));
 //BA.debugLineNum = 733;BA.debugLine="clv.AddTextItem(\"Error codes: \" & error_codes, \"";
_clv._addtextitem((Object)("Error codes: "+BA.NumberToString(_error_codes)),(Object)("error_codes"));
 //BA.debugLineNum = 734;BA.debugLine="clv.AddTextItem(\"AC power: \" & ac_power, \"ac_pow";
_clv._addtextitem((Object)("AC power: "+_ac_power),(Object)("ac_power"));
 //BA.debugLineNum = 735;BA.debugLine="clv.AddTextItem(\"Total 108 wakeups: \" & total_10";
_clv._addtextitem((Object)("Total 108 wakeups: "+BA.NumberToString(_total_108_wakeups)),(Object)("total_108_wakeups"));
 //BA.debugLineNum = 736;BA.debugLine="clv.AddTextItem(\"Total Tb wakeups: \" & total_tb_";
_clv._addtextitem((Object)("Total Tb wakeups: "+BA.NumberToString(_total_tb_wakeups)),(Object)("total_tb_wakeups"));
 //BA.debugLineNum = 737;BA.debugLine="clv.AddTextItem(\"Light sensor ch0: \" & light_sen";
_clv._addtextitem((Object)("Light sensor ch0: "+BA.NumberToString(_light_sensor_ch0)),(Object)("light_sensor_ch0"));
 //BA.debugLineNum = 738;BA.debugLine="clv.AddTextItem(\"Unit number: \" & unit_number, \"";
_clv._addtextitem((Object)("Unit number: "+BA.NumberToString(_unit_number)),(Object)("unit_number"));
 //BA.debugLineNum = 739;BA.debugLine="clv.AddTextItem(\"Light sensor ch1: \" & light_sen";
_clv._addtextitem((Object)("Light sensor ch1: "+BA.NumberToString(_light_sensor_ch1)),(Object)("light_sensor_ch1"));
 //BA.debugLineNum = 740;BA.debugLine="clv.AddTextItem(\"Time dhcp lease: \" & time_dhcp_";
_clv._addtextitem((Object)("Time dhcp lease: "+BA.NumberToString(_time_dhcp_lease)),(Object)("time_dhcp_lease"));
 //BA.debugLineNum = 741;BA.debugLine="clv.AddTextItem(\"Time first video: \" & time_firs";
_clv._addtextitem((Object)("Time first video: "+BA.NumberToString(_time_first_video)),(Object)("time_first_video"));
 //BA.debugLineNum = 742;BA.debugLine="clv.AddTextItem(\"Time dns resolve: \" & time_dns_";
_clv._addtextitem((Object)("Time dns resolve: "+BA.NumberToString(_time_dns_resolve)),(Object)("time_dns_resolve"));
 //BA.debugLineNum = 743;BA.debugLine="clv.AddTextItem(\"Time 108 boot: \" & time_108_boo";
_clv._addtextitem((Object)("Time 108 boot: "+BA.NumberToString(_time_108_boot)),(Object)("time_108_boot"));
 //BA.debugLineNum = 744;BA.debugLine="clv.AddTextItem(\"LFR 108 wakeups: \" & lfr_108_wa";
_clv._addtextitem((Object)("LFR 108 wakeups: "+BA.NumberToString(_lfr_108_wakeups)),(Object)("lfr_108_wakeups"));
 //BA.debugLineNum = 745;BA.debugLine="clv.AddTextItem(\"lifetime duration: \" & lifetime";
_clv._addtextitem((Object)("lifetime duration: "+BA.NumberToString(_lifetime_duration)),(Object)("lifetime_duration"));
 //BA.debugLineNum = 746;BA.debugLine="clv.AddTextItem(\"lpv: \" & ipv, \"ipv\")";
_clv._addtextitem((Object)("lpv: "+_ipv),(Object)("ipv"));
 //BA.debugLineNum = 747;BA.debugLine="clv.AddTextItem(\"light sensor data new: \" & ligh";
_clv._addtextitem((Object)("light sensor data new: "+_light_sensor_data_new),(Object)("light_sensor_data_new"));
 //BA.debugLineNum = 748;BA.debugLine="clv.AddTextItem(\"Dev_1: \" & dev_1, \"dev_1\")";
_clv._addtextitem((Object)("Dev_1: "+BA.NumberToString(_dev_1)),(Object)("dev_1"));
 //BA.debugLineNum = 749;BA.debugLine="clv.AddTextItem(\"Dev_2: \" & dev_2, \"dev_2\")";
_clv._addtextitem((Object)("Dev_2: "+BA.NumberToString(_dev_2)),(Object)("dev_2"));
 //BA.debugLineNum = 750;BA.debugLine="clv.AddTextItem(\"Dev_3: \" & dev_3, \"dev_3\")";
_clv._addtextitem((Object)("Dev_3: "+BA.NumberToString(_dev_3)),(Object)("dev_3"));
 //BA.debugLineNum = 751;BA.debugLine="clv.AddTextItem(\"Time wlan connect: \" & time_wla";
_clv._addtextitem((Object)("Time wlan connect: "+BA.NumberToString(_time_wlan_connect)),(Object)("time_wlan_connect"));
 //BA.debugLineNum = 752;BA.debugLine="clv.AddTextItem(\"PIR rejections: \" & pir_rejecti";
_clv._addtextitem((Object)("PIR rejections: "+BA.NumberToString(_pir_rejections)),(Object)("pir_rejections"));
 //BA.debugLineNum = 753;BA.debugLine="clv.AddTextItem(\"Lifetime count: \" & lifetime_co";
_clv._addtextitem((Object)("Lifetime count: "+BA.NumberToString(_lifetime_count)),(Object)("lifetime_count"));
 //BA.debugLineNum = 755;BA.debugLine="Dim strTimestamp As String";
_strtimestamp = "";
 //BA.debugLineNum = 756;BA.debugLine="strTimestamp = ConvertDateTime(updated_at)";
_strtimestamp = _convertdatetime(_updated_at);
 //BA.debugLineNum = 757;BA.debugLine="lblStatus.Text = \"Last updated: \" & strTimestamp";
_lblstatus.setText("Last updated: "+_strtimestamp);
 //BA.debugLineNum = 758;BA.debugLine="If clv = clvDriveway Then";
if ((_clv).equals(_clvdriveway)) { 
 //BA.debugLineNum = 759;BA.debugLine="lblDriveway.Text = \"Driveway \" & strTimestamp &";
_lbldriveway.setText("Driveway "+_strtimestamp+" "+_drivewayarmedstatus);
 //BA.debugLineNum = 760;BA.debugLine="prevDrivewayUpdateTime = updated_at";
_prevdrivewayupdatetime = _updated_at;
 }else if((_clv).equals(_clvfrontdoor)) { 
 //BA.debugLineNum = 762;BA.debugLine="lblFrontDoor.Text = \"Front Door \" & strTimestam";
_lblfrontdoor.setText("Front Door "+_strtimestamp+" "+_frontdoorarmedstatus);
 //BA.debugLineNum = 763;BA.debugLine="lblDriveway.Text = \"Driveway \" & ConvertDateTim";
_lbldriveway.setText("Driveway "+_convertdatetime(_prevdrivewayupdatetime)+" "+_drivewayarmedstatus);
 //BA.debugLineNum = 764;BA.debugLine="prevFrontDoorUpdateTime = updated_at";
_prevfrontdoorupdatetime = _updated_at;
 }else if((_clv).equals(_clvsideyard)) { 
 //BA.debugLineNum = 766;BA.debugLine="lblSideYard.Text = \"Side Yard \" & strTimestamp";
_lblsideyard.setText("Side Yard "+_strtimestamp+" "+_sideyardarmedstatus);
 //BA.debugLineNum = 767;BA.debugLine="lblDriveway.Text = \"Driveway \" & ConvertDateTim";
_lbldriveway.setText("Driveway "+_convertdatetime(_prevdrivewayupdatetime)+" "+_drivewayarmedstatus);
 //BA.debugLineNum = 768;BA.debugLine="lblFrontDoor.Text = \"Front Door \" & ConvertDate";
_lblfrontdoor.setText("Front Door "+_convertdatetime(_prevfrontdoorupdatetime)+" "+_frontdoorarmedstatus);
 };
 //BA.debugLineNum = 771;BA.debugLine="For i = 0 To clv.Size-1";
{
final int step113 = 1;
final int limit113 = (int) (_clv._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit113 ;_i = _i + step113 ) {
 //BA.debugLineNum = 772;BA.debugLine="Dim item As String";
_item = "";
 //BA.debugLineNum = 773;BA.debugLine="item = clv.GetValue(i)";
_item = BA.ObjectToString(_clv._getvalue(_i));
 //BA.debugLineNum = 774;BA.debugLine="If item.Contains(\"thumbnail\") Then";
if (_item.contains("thumbnail")) { 
 //BA.debugLineNum = 775;BA.debugLine="clv.ResizeItem(i,80dip)";
_clv._resizeitem(_i,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)));
 }else if(_item.contains("_strength")) { 
 //BA.debugLineNum = 777;BA.debugLine="clv.ResizeItem(i,45dip)";
_clv._resizeitem(_i,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (45)));
 }else {
 //BA.debugLineNum = 779;BA.debugLine="clv.ResizeItem(i,35dip)";
_clv._resizeitem(_i,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (35)));
 };
 }
};
 } 
       catch (Exception e125) {
			ba.setLastException(e125); //BA.debugLineNum = 783;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 785;BA.debugLine="End Sub";
return "";
}
public static String  _getcommandid(String _json) throws Exception{
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
 //BA.debugLineNum = 570;BA.debugLine="Sub GetCommandID(json As String)";
 //BA.debugLineNum = 571;BA.debugLine="Try";
try { //BA.debugLineNum = 572;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 573;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 574;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 589;BA.debugLine="commandID = root.Get(\"id\")";
_commandid = BA.ObjectToString(_root.Get((Object)("id")));
 //BA.debugLineNum = 590;BA.debugLine="Log(\"commandID: \" & commandID)";
anywheresoftware.b4a.keywords.Common.Log("commandID: "+_commandid);
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 612;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 614;BA.debugLine="End Sub";
return "";
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
int _i = 0;
int step4;
int limit4;

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
 //BA.debugLineNum = 425;BA.debugLine="GetCommandStatus(response)";
_getcommandstatus(parent._response);
 //BA.debugLineNum = 426;BA.debugLine="If commandComplete Then";
if (true) break;

case 1:
//if
this.state = 24;
if (parent._commandcomplete) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 427;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia-";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera);
 //BA.debugLineNum = 428;BA.debugLine="For i = 1 To 20";
if (true) break;

case 4:
//for
this.state = 13;
step4 = 1;
limit4 = (int) (20);
_i = (int) (1) ;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 13;
if ((step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4)) this.state = 6;
if (true) break;

case 26:
//C
this.state = 25;
_i = ((int)(0 + _i + step4)) ;
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 429;BA.debugLine="If response = \"\" Then";
if (true) break;

case 7:
//if
this.state = 12;
if ((parent._response).equals("")) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 //BA.debugLineNum = 430;BA.debugLine="Sleep(50)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (50));
this.state = 27;
return;
case 27:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 432;BA.debugLine="Exit";
this.state = 13;
if (true) break;
 if (true) break;

case 12:
//C
this.state = 26;
;
 if (true) break;
if (true) break;

case 13:
//C
this.state = 24;
;
 //BA.debugLineNum = 436;BA.debugLine="GetCameraInfo(response,clv)";
_getcamerainfo(parent._response,_clv);
 //BA.debugLineNum = 437;BA.debugLine="DownloadImage(\"https://rest-\" & userRegion &\".im";
_downloadimage("https://rest-"+parent._userregion+".immedia-semi.com/"+parent._camerathumbnail+".jpg",_iv,_camera);
 //BA.debugLineNum = 439;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 441;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 16:
//if
this.state = 23;
if ((_camera).equals("347574")) { 
this.state = 18;
}else if((_camera).equals("236967")) { 
this.state = 20;
}else if((_camera).equals("226821")) { 
this.state = 22;
}if (true) break;

case 18:
//C
this.state = 23;
 //BA.debugLineNum = 442;BA.debugLine="lblStatus.Text = \"Awaiting for the Driveway thu";
parent._lblstatus.setText("Awaiting for the Driveway thumbnail... "+_attempts+"/"+_attemptsallowed);
 if (true) break;

case 20:
//C
this.state = 23;
 //BA.debugLineNum = 444;BA.debugLine="lblStatus.Text = \"Awaiting for the Front Door t";
parent._lblstatus.setText("Awaiting for the Front Door thumbnail...  "+_attempts+"/"+_attemptsallowed);
 if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 446;BA.debugLine="lblStatus.Text = \"Awaiting for the Side Yard th";
parent._lblstatus.setText("Awaiting for the Side Yard thumbnail... "+_attempts+"/"+_attemptsallowed);
 if (true) break;

case 23:
//C
this.state = 24;
;
 //BA.debugLineNum = 448;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 24:
//C
this.state = -1;
;
 //BA.debugLineNum = 450;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _getcommandstatus(String _json) throws Exception{
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
 //BA.debugLineNum = 616;BA.debugLine="Sub GetCommandStatus(json As String)";
 //BA.debugLineNum = 617;BA.debugLine="Try";
try { //BA.debugLineNum = 618;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 619;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 620;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 621;BA.debugLine="commandComplete = root.Get(\"complete\")";
_commandcomplete = BA.ObjectToBoolean(_root.Get((Object)("complete")));
 //BA.debugLineNum = 622;BA.debugLine="Log(\"commandComplete: \" & commandComplete)";
anywheresoftware.b4a.keywords.Common.Log("commandComplete: "+BA.ObjectToString(_commandcomplete));
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 624;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 626;BA.debugLine="End Sub";
return "";
}
public static String  _gethomescreen(String _json) throws Exception{
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _devices = null;
anywheresoftware.b4a.objects.collections.Map _coldevices = null;
int _device_id = 0;
String _active = "";
anywheresoftware.b4a.objects.collections.Map _network = null;
String _armednetwork = "";
 //BA.debugLineNum = 843;BA.debugLine="Sub GetHomescreen(json As String)";
 //BA.debugLineNum = 844;BA.debugLine="Try";
try { //BA.debugLineNum = 845;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 846;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 847;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 848;BA.debugLine="Dim devices As List = root.Get(\"devices\")";
_devices = new anywheresoftware.b4a.objects.collections.List();
_devices.setObject((java.util.List)(_root.Get((Object)("devices"))));
 //BA.debugLineNum = 849;BA.debugLine="For Each coldevices As Map In devices";
_coldevices = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group6 = _devices;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_coldevices.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group6.Get(index6)));
 //BA.debugLineNum = 854;BA.debugLine="Dim device_id As Int = coldevices.Get(\"device_i";
_device_id = (int)(BA.ObjectToNumber(_coldevices.Get((Object)("device_id"))));
 //BA.debugLineNum = 857;BA.debugLine="Dim active As String = coldevices.Get(\"active\")";
_active = BA.ObjectToString(_coldevices.Get((Object)("active")));
 //BA.debugLineNum = 877;BA.debugLine="If device_id = \"347574\" Then";
if (_device_id==(double)(Double.parseDouble("347574"))) { 
 //BA.debugLineNum = 878;BA.debugLine="If active = \"armed\" Then";
if ((_active).equals("armed")) { 
 //BA.debugLineNum = 879;BA.debugLine="drivewayArmedStatus = \"\"";
_drivewayarmedstatus = "";
 //BA.debugLineNum = 880;BA.debugLine="lblDriveway.Style = \"\"";
_lbldriveway.setStyle("");
 }else {
 //BA.debugLineNum = 882;BA.debugLine="drivewayArmedStatus = \"NOT ARMED!\"";
_drivewayarmedstatus = "NOT ARMED!";
 //BA.debugLineNum = 883;BA.debugLine="lblDriveway.Style = \"-fx-effect: dropshadow(";
_lbldriveway.setStyle("-fx-effect: dropshadow( gaussian , rgba(250,0,0,15) , 0,0,0,1 );");
 };
 }else if(_device_id==(double)(Double.parseDouble("236967"))) { 
 //BA.debugLineNum = 886;BA.debugLine="If active = \"armed\" Then";
if ((_active).equals("armed")) { 
 //BA.debugLineNum = 887;BA.debugLine="frontdoorArmedStatus = \"\"";
_frontdoorarmedstatus = "";
 //BA.debugLineNum = 888;BA.debugLine="lblFrontDoor.Style = \"\"";
_lblfrontdoor.setStyle("");
 }else {
 //BA.debugLineNum = 890;BA.debugLine="frontdoorArmedStatus = \"NOT ARMED!\"";
_frontdoorarmedstatus = "NOT ARMED!";
 //BA.debugLineNum = 891;BA.debugLine="lblFrontDoor.Style = \"-fx-effect: dropshadow(";
_lblfrontdoor.setStyle("-fx-effect: dropshadow( gaussian , rgba(250,0,0,15) , 0,0,0,1 );");
 };
 }else if(_device_id==(double)(Double.parseDouble("226821"))) { 
 //BA.debugLineNum = 894;BA.debugLine="If active = \"armed\" Then";
if ((_active).equals("armed")) { 
 //BA.debugLineNum = 895;BA.debugLine="sideyardArmedStatus = \"\"";
_sideyardarmedstatus = "";
 //BA.debugLineNum = 896;BA.debugLine="lblSideYard.Style = \"\"";
_lblsideyard.setStyle("");
 }else {
 //BA.debugLineNum = 898;BA.debugLine="sideyardArmedStatus = \"NOT ARMED!\"";
_sideyardarmedstatus = "NOT ARMED!";
 //BA.debugLineNum = 899;BA.debugLine="lblSideYard.Style = \"-fx-effect: dropshadow(";
_lblsideyard.setStyle("-fx-effect: dropshadow( gaussian , rgba(250,0,0,15) , 0,0,0,1 );");
 };
 };
 }
};
 //BA.debugLineNum = 906;BA.debugLine="Dim network As Map = root.Get(\"network\")";
_network = new anywheresoftware.b4a.objects.collections.Map();
_network.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("network"))));
 //BA.debugLineNum = 910;BA.debugLine="Dim armedNetwork As String = network.Get(\"armed\"";
_armednetwork = BA.ObjectToString(_network.Get((Object)("armed")));
 //BA.debugLineNum = 916;BA.debugLine="If armedNetwork <> \"true\" Then";
if ((_armednetwork).equals("true") == false) { 
 //BA.debugLineNum = 917;BA.debugLine="drivewayArmedStatus = \"NETWORK NOT ARMED!\"";
_drivewayarmedstatus = "NETWORK NOT ARMED!";
 //BA.debugLineNum = 918;BA.debugLine="lblDriveway.Style = \"-fx-effect: dropshadow( ga";
_lbldriveway.setStyle("-fx-effect: dropshadow( gaussian , rgba(250,0,0,15) , 0,0,0,1 );");
 //BA.debugLineNum = 920;BA.debugLine="frontdoorArmedStatus = \"NETWORK NOT ARMED!\"";
_frontdoorarmedstatus = "NETWORK NOT ARMED!";
 //BA.debugLineNum = 921;BA.debugLine="lblFrontDoor.Style = \"-fx-effect: dropshadow( g";
_lblfrontdoor.setStyle("-fx-effect: dropshadow( gaussian , rgba(250,0,0,15) , 0,0,0,1 );");
 //BA.debugLineNum = 923;BA.debugLine="sideyardArmedStatus = \"NETWORK NOT ARMED!\"";
_sideyardarmedstatus = "NETWORK NOT ARMED!";
 //BA.debugLineNum = 924;BA.debugLine="lblSideYard.Style = \"-fx-effect: dropshadow( ga";
_lblsideyard.setStyle("-fx-effect: dropshadow( gaussian , rgba(250,0,0,15) , 0,0,0,1 );");
 };
 } 
       catch (Exception e46) {
			ba.setLastException(e46); //BA.debugLineNum = 927;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 929;BA.debugLine="End Sub";
return "";
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
 //BA.debugLineNum = 1264;BA.debugLine="Sub GetLiveView(json As String) As String 'ignore";
 //BA.debugLineNum = 1265;BA.debugLine="Try";
try { //BA.debugLineNum = 1266;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 1267;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 1268;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 1269;BA.debugLine="Dim duration As Int = root.Get(\"duration\") 'igno";
_duration = (int)(BA.ObjectToNumber(_root.Get((Object)("duration"))));
 //BA.debugLineNum = 1270;BA.debugLine="Dim server As String = root.Get(\"server\")";
_server = BA.ObjectToString(_root.Get((Object)("server")));
 //BA.debugLineNum = 1271;BA.debugLine="Dim device_name As String = root.Get(\"device_nam";
_device_name = BA.ObjectToString(_root.Get((Object)("device_name")));
 //BA.debugLineNum = 1272;BA.debugLine="Dim network_id As Int = root.Get(\"network_id\") '";
_network_id = (int)(BA.ObjectToNumber(_root.Get((Object)("network_id"))));
 //BA.debugLineNum = 1273;BA.debugLine="Dim continue_interval As Int = root.Get(\"continu";
_continue_interval = (int)(BA.ObjectToNumber(_root.Get((Object)("continue_interval"))));
 //BA.debugLineNum = 1274;BA.debugLine="Dim continue_warning As Int = root.Get(\"continue";
_continue_warning = (int)(BA.ObjectToNumber(_root.Get((Object)("continue_warning"))));
 //BA.debugLineNum = 1275;BA.debugLine="Dim id As Int = root.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_root.Get((Object)("id"))));
 //BA.debugLineNum = 1276;BA.debugLine="Dim submit_logs As String = root.Get(\"submit_log";
_submit_logs = BA.ObjectToString(_root.Get((Object)("submit_logs")));
 //BA.debugLineNum = 1277;BA.debugLine="Dim camera_name As String = root.Get(\"camera_nam";
_camera_name = BA.ObjectToString(_root.Get((Object)("camera_name")));
 //BA.debugLineNum = 1278;BA.debugLine="Dim lv_save As String = root.Get(\"lv_save\") 'ign";
_lv_save = BA.ObjectToString(_root.Get((Object)("lv_save")));
 //BA.debugLineNum = 1279;BA.debugLine="Log(\"Liveview: \" & server)";
anywheresoftware.b4a.keywords.Common.Log("Liveview: "+_server);
 } 
       catch (Exception e17) {
			ba.setLastException(e17); //BA.debugLineNum = 1284;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1286;BA.debugLine="Return id";
if (true) return BA.NumberToString(_id);
 //BA.debugLineNum = 1287;BA.debugLine="End Sub";
return "";
}
public static String  _getresterror(String _json) throws Exception{
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
int _code = 0;
String _message = "";
 //BA.debugLineNum = 628;BA.debugLine="Sub GetRESTError(json As String) As String";
 //BA.debugLineNum = 629;BA.debugLine="Try";
try { //BA.debugLineNum = 633;BA.debugLine="If json.Contains(\"<h1>Not Found</h1>\") Then";
if (_json.contains("<h1>Not Found</h1>")) { 
 //BA.debugLineNum = 634;BA.debugLine="Return \"REST endpoint URL not found. Try again.";
if (true) return "REST endpoint URL not found. Try again.";
 }else {
 //BA.debugLineNum = 636;BA.debugLine="If json.IndexOf(\"{\") <> -1 Then";
if (_json.indexOf("{")!=-1) { 
 //BA.debugLineNum = 637;BA.debugLine="json = json.SubString(json.IndexOf(\"{\"))";
_json = _json.substring(_json.indexOf("{"));
 //BA.debugLineNum = 638;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 639;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 640;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 641;BA.debugLine="Dim code As Int = root.Get(\"code\")";
_code = (int)(BA.ObjectToNumber(_root.Get((Object)("code"))));
 //BA.debugLineNum = 642;BA.debugLine="Dim message As String = root.Get(\"message\")";
_message = BA.ObjectToString(_root.Get((Object)("message")));
 //BA.debugLineNum = 643;BA.debugLine="Log(\"Code: \" & code & \" Message: \" & message)";
anywheresoftware.b4a.keywords.Common.Log("Code: "+BA.NumberToString(_code)+" Message: "+_message);
 //BA.debugLineNum = 644;BA.debugLine="Return \"Code: \" & code & \" Message: \" & messag";
if (true) return "Code: "+BA.NumberToString(_code)+" Message: "+_message;
 }else {
 //BA.debugLineNum = 646;BA.debugLine="Return json";
if (true) return _json;
 };
 };
 } 
       catch (Exception e19) {
			ba.setLastException(e19); //BA.debugLineNum = 650;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 651;BA.debugLine="Return json";
if (true) return _json;
 };
 //BA.debugLineNum = 653;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 787;BA.debugLine="Sub GetSyncModuleInfo(json As String)";
 //BA.debugLineNum = 788;BA.debugLine="Try";
try { //BA.debugLineNum = 789;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 790;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 791;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 792;BA.debugLine="Dim syncmodule As Map = root.Get(\"syncmodule\")";
_syncmodule = new anywheresoftware.b4a.objects.collections.Map();
_syncmodule.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("syncmodule"))));
 //BA.debugLineNum = 796;BA.debugLine="Dim wifi_strength As Int = syncmodule.Get(\"wifi_";
_wifi_strength = (int)(BA.ObjectToNumber(_syncmodule.Get((Object)("wifi_strength"))));
 //BA.debugLineNum = 797;BA.debugLine="Dim os_version As String = syncmodule.Get(\"os_ve";
_os_version = BA.ObjectToString(_syncmodule.Get((Object)("os_version")));
 //BA.debugLineNum = 814;BA.debugLine="Dim fw_version As String = syncmodule.Get(\"fw_ve";
_fw_version = BA.ObjectToString(_syncmodule.Get((Object)("fw_version")));
 //BA.debugLineNum = 816;BA.debugLine="Dim status As String = syncmodule.Get(\"status\")";
_status = BA.ObjectToString(_syncmodule.Get((Object)("status")));
 //BA.debugLineNum = 817;BA.debugLine="lblSyncModule.Text = \"Sync Module is \" & status";
_lblsyncmodule.setText("Sync Module is "+_status+anywheresoftware.b4a.keywords.Common.CRLF+"Wifi Strength: "+BA.NumberToString(_wifi_strength)+" bars"+anywheresoftware.b4a.keywords.Common.CRLF+"Firmware version: "+_fw_version+anywheresoftware.b4a.keywords.Common.CRLF+"OS version: "+_os_version);
 //BA.debugLineNum = 819;BA.debugLine="If status = \"online\" Then";
if ((_status).equals("online")) { 
 //BA.debugLineNum = 820;BA.debugLine="ivSyncModule.SetImage(fx.LoadImage(File.DirAsse";
_ivsyncmodule.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"systemstatusonline.png").getObject()));
 }else {
 //BA.debugLineNum = 822;BA.debugLine="ivSyncModule.SetImage(fx.LoadImage(File.DirAsse";
_ivsyncmodule.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"systemstatusoffline.png").getObject()));
 };
 //BA.debugLineNum = 825;BA.debugLine="If wifi_strength = \"5\" Then";
if (_wifi_strength==(double)(Double.parseDouble("5"))) { 
 //BA.debugLineNum = 826;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
_ivsyncmodulewifi.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bars5blue.png").getObject()));
 }else if(_wifi_strength==(double)(Double.parseDouble("4"))) { 
 //BA.debugLineNum = 828;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
_ivsyncmodulewifi.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bars4blue.png").getObject()));
 }else if(_wifi_strength==(double)(Double.parseDouble("3"))) { 
 //BA.debugLineNum = 830;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
_ivsyncmodulewifi.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bars3blue.png").getObject()));
 }else if(_wifi_strength==(double)(Double.parseDouble("2"))) { 
 //BA.debugLineNum = 832;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
_ivsyncmodulewifi.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bars2blue.png").getObject()));
 }else if(_wifi_strength==(double)(Double.parseDouble("1"))) { 
 //BA.debugLineNum = 834;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
_ivsyncmodulewifi.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bars1blue.png").getObject()));
 }else {
 //BA.debugLineNum = 836;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
_ivsyncmodulewifi.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"bars_0bars.png").getObject()));
 };
 } 
       catch (Exception e30) {
			ba.setLastException(e30); //BA.debugLineNum = 839;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 841;BA.debugLine="End Sub";
return "";
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
int _i = 0;
int _j = 0;
int step3;
int limit3;

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
 //BA.debugLineNum = 1724;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 16;
this.catchState = 15;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 15;
 //BA.debugLineNum = 1727;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia-";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/api/v1/accounts/88438/media/changed?since=-999999999-01-01T00:00:00+18:00&page=1");
 //BA.debugLineNum = 1729;BA.debugLine="For i = 1 To 20";
if (true) break;

case 4:
//for
this.state = 13;
step3 = 1;
limit3 = (int) (20);
_i = (int) (1) ;
this.state = 17;
if (true) break;

case 17:
//C
this.state = 13;
if ((step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3)) this.state = 6;
if (true) break;

case 18:
//C
this.state = 17;
_i = ((int)(0 + _i + step3)) ;
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 1730;BA.debugLine="If response = \"\" Then";
if (true) break;

case 7:
//if
this.state = 12;
if ((parent._response).equals("")) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 //BA.debugLineNum = 1731;BA.debugLine="Sleep(50)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (50));
this.state = 19;
return;
case 19:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 1733;BA.debugLine="Exit";
this.state = 13;
if (true) break;
 if (true) break;

case 12:
//C
this.state = 18;
;
 if (true) break;
if (true) break;

case 13:
//C
this.state = 16;
;
 //BA.debugLineNum = 1737;BA.debugLine="Dim j As Int = StringCount(response,\"\"\"watched\"\"";
_j = _stringcount(parent._response,"\"watched\":false",anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1738;BA.debugLine="badger1.SetBadge(btnActivity, j)";
parent._badger1._setbadge /*String*/ ((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._btnactivity.getObject())),_j);
 if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
 //BA.debugLineNum = 1740;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 16:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 1742;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
 //BA.debugLineNum = 1743;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 //BA.debugLineNum = 1744;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 989;BA.debugLine="Private Sub ivClose_MouseClicked (EventData As Mou";
 //BA.debugLineNum = 990;BA.debugLine="File.Delete(File.DirApp, \"Driveway.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Driveway.jpg");
 //BA.debugLineNum = 991;BA.debugLine="File.Delete(File.DirApp, \"FrontDoor.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"FrontDoor.jpg");
 //BA.debugLineNum = 992;BA.debugLine="File.Delete(File.DirApp, \"SideYard.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"SideYard.jpg");
 //BA.debugLineNum = 993;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"screenshot.jpg");
 //BA.debugLineNum = 994;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"media.mp4");
 //BA.debugLineNum = 995;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 996;BA.debugLine="End Sub";
return "";
}
public static String  _ivdriveway_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
cloyd.blink.frmmedia _mf = null;
 //BA.debugLineNum = 1136;BA.debugLine="Sub ivDriveway_MouseClicked (EventData As MouseEve";
 //BA.debugLineNum = 1137;BA.debugLine="Dim mf As frmMedia";
_mf = new cloyd.blink.frmmedia();
 //BA.debugLineNum = 1138;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (ba,_mainform);
 //BA.debugLineNum = 1139;BA.debugLine="mf.timestamp = lblDriveway.Text";
_mf._timestamp /*String*/  = _lbldriveway.getText();
 //BA.debugLineNum = 1140;BA.debugLine="mf.url=$\" 	   <h1>${lblDriveway.Text}</h1> 	   <i";
_mf._url /*String*/  = ("\n"+"	   <h1>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbldriveway.getText()))+"</h1>\n"+"	   <img src=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Driveway.jpg")))+"\"/>\n"+"	\n"+"	");
 //BA.debugLineNum = 1145;BA.debugLine="mf.Show";
_mf._show /*String*/ ();
 //BA.debugLineNum = 1146;BA.debugLine="Return";
if (true) return "";
 //BA.debugLineNum = 1262;BA.debugLine="End Sub";
return "";
}
public static String  _ivfrontdoor_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
cloyd.blink.frmmedia _mf = null;
 //BA.debugLineNum = 1289;BA.debugLine="Sub ivFrontDoor_MouseClicked (EventData As MouseEv";
 //BA.debugLineNum = 1290;BA.debugLine="Dim mf As frmMedia";
_mf = new cloyd.blink.frmmedia();
 //BA.debugLineNum = 1291;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (ba,_mainform);
 //BA.debugLineNum = 1292;BA.debugLine="mf.timestamp = lblFrontDoor.Text";
_mf._timestamp /*String*/  = _lblfrontdoor.getText();
 //BA.debugLineNum = 1293;BA.debugLine="mf.url=$\"    <h1>${lblFrontDoor.Text}</h1>    <im";
_mf._url /*String*/  = ("\n"+"   <h1>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lblfrontdoor.getText()))+"</h1>\n"+"   <img src=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"FrontDoor.jpg")))+"\"/>\n"+"   \n"+"");
 //BA.debugLineNum = 1298;BA.debugLine="mf.Show";
_mf._show /*String*/ ();
 //BA.debugLineNum = 1299;BA.debugLine="End Sub";
return "";
}
public static String  _ivmax_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 1022;BA.debugLine="Private Sub ivMax_MouseClicked (EventData As Mouse";
 //BA.debugLineNum = 1024;BA.debugLine="End Sub";
return "";
}
public static String  _ivmin_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
anywheresoftware.b4j.object.JavaObject _jmf = null;
anywheresoftware.b4j.object.JavaObject _stage = null;
 //BA.debugLineNum = 1042;BA.debugLine="Private Sub ivMin_MouseClicked (EventData As Mouse";
 //BA.debugLineNum = 1043;BA.debugLine="Try";
try { //BA.debugLineNum = 1044;BA.debugLine="Dim jmf As JavaObject = MainForm";
_jmf = new anywheresoftware.b4j.object.JavaObject();
_jmf.setObject((java.lang.Object)(_mainform));
 //BA.debugLineNum = 1045;BA.debugLine="Dim stage As JavaObject = jmf.GetField(\"stage\")";
_stage = new anywheresoftware.b4j.object.JavaObject();
_stage.setObject((java.lang.Object)(_jmf.GetField("stage")));
 //BA.debugLineNum = 1046;BA.debugLine="stage.RunMethod(\"setIconified\", Array As Object(";
_stage.RunMethod("setIconified",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.True)});
 } 
       catch (Exception e6) {
			ba.setLastException(e6); //BA.debugLineNum = 1048;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1050;BA.debugLine="End Sub";
return "";
}
public static String  _ivsideyard_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
cloyd.blink.frmmedia _mf = null;
 //BA.debugLineNum = 1301;BA.debugLine="Sub ivSideYard_MouseClicked (EventData As MouseEve";
 //BA.debugLineNum = 1302;BA.debugLine="Dim mf As frmMedia";
_mf = new cloyd.blink.frmmedia();
 //BA.debugLineNum = 1303;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (ba,_mainform);
 //BA.debugLineNum = 1304;BA.debugLine="mf.timestamp = lblSideYard.Text";
_mf._timestamp /*String*/  = _lblsideyard.getText();
 //BA.debugLineNum = 1305;BA.debugLine="mf.url=$\"    <h1>${lblSideYard.Text}</h1>    <img";
_mf._url /*String*/  = ("\n"+"   <h1>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lblsideyard.getText()))+"</h1>\n"+"   <img src=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"SideYard.jpg")))+"\"/>\n"+"   \n"+"");
 //BA.debugLineNum = 1310;BA.debugLine="mf.Show";
_mf._show /*String*/ ();
 //BA.debugLineNum = 1311;BA.debugLine="End Sub";
return "";
}
public static String  _lbtitle_mousedragged(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 969;BA.debugLine="Private Sub lbTitle_MouseDragged (EventData As Mou";
 //BA.debugLineNum = 970;BA.debugLine="Try";
try { //BA.debugLineNum = 971;BA.debugLine="If isMaximized Then Return";
if (_ismaximized) { 
if (true) return "";};
 //BA.debugLineNum = 972;BA.debugLine="Dim jo As JavaObject = EventData";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_eventdata.getObject()));
 //BA.debugLineNum = 973;BA.debugLine="MainForm.WindowLeft = jo.RunMethod(\"getScreenX\",";
_mainform.setWindowLeft((double)(BA.ObjectToNumber(_jo.RunMethod("getScreenX",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))-_xmouse);
 //BA.debugLineNum = 974;BA.debugLine="MainForm.WindowTop = jo.RunMethod(\"getScreenY\",";
_mainform.setWindowTop((double)(BA.ObjectToNumber(_jo.RunMethod("getScreenY",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))-_ymouse);
 } 
       catch (Exception e7) {
			ba.setLastException(e7); //BA.debugLineNum = 976;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 978;BA.debugLine="End Sub";
return "";
}
public static String  _lbtitle_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 980;BA.debugLine="Private Sub lbTitle_MousePressed (EventData As Mou";
 //BA.debugLineNum = 981;BA.debugLine="Try";
try { //BA.debugLineNum = 982;BA.debugLine="xMouse = EventData.X + lbTitle.Left + 15";
_xmouse = _eventdata.getX()+_lbtitle.getLeft()+15;
 //BA.debugLineNum = 983;BA.debugLine="yMouse = EventData.Y + lbTitle.Top + 15";
_ymouse = _eventdata.getY()+_lbtitle.getTop()+15;
 } 
       catch (Exception e5) {
			ba.setLastException(e5); //BA.debugLineNum = 985;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 987;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_closerequest(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 998;BA.debugLine="Sub MainForm_CloseRequest (EventData As Event)";
 //BA.debugLineNum = 999;BA.debugLine="File.Delete(File.DirApp, \"Driveway.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Driveway.jpg");
 //BA.debugLineNum = 1000;BA.debugLine="File.Delete(File.DirApp, \"FrontDoor.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"FrontDoor.jpg");
 //BA.debugLineNum = 1001;BA.debugLine="File.Delete(File.DirApp, \"SideYard.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"SideYard.jpg");
 //BA.debugLineNum = 1002;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"screenshot.jpg");
 //BA.debugLineNum = 1003;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"media.mp4");
 //BA.debugLineNum = 1004;BA.debugLine="End Sub";
return "";
}
public static String  _max_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 1026;BA.debugLine="Private Sub Max_Entered_Event(e As Event)";
 //BA.debugLineNum = 1027;BA.debugLine="Try";
try { //BA.debugLineNum = 1028;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmax.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMaxEnt.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 1030;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1032;BA.debugLine="End Sub";
return "";
}
public static String  _max_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 1034;BA.debugLine="Private Sub Max_Exited_Event(e As Event)";
 //BA.debugLineNum = 1035;BA.debugLine="Try";
try { //BA.debugLineNum = 1036;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmax.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMax.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 1038;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1040;BA.debugLine="End Sub";
return "";
}
public static String  _min_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 1052;BA.debugLine="Private Sub Min_Entered_Event(e As Event)";
 //BA.debugLineNum = 1053;BA.debugLine="Try";
try { //BA.debugLineNum = 1054;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmin.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMinEnt.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 1056;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1058;BA.debugLine="End Sub";
return "";
}
public static String  _min_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 1060;BA.debugLine="Private Sub Min_Exited_Event(e As Event)";
 //BA.debugLineNum = 1061;BA.debugLine="Try";
try { //BA.debugLineNum = 1062;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmin.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMin.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 1064;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1066;BA.debugLine="End Sub";
return "";
}
public static long  _parseutcstring(String _utc) throws Exception{
String _df = "";
long _res = 0L;
 //BA.debugLineNum = 1488;BA.debugLine="Sub ParseUTCstring(utc As String) As Long";
 //BA.debugLineNum = 1489;BA.debugLine="Dim df As String = DateTime.DateFormat";
_df = anywheresoftware.b4a.keywords.Common.DateTime.getDateFormat();
 //BA.debugLineNum = 1490;BA.debugLine="Dim res As Long";
_res = 0L;
 //BA.debugLineNum = 1491;BA.debugLine="If utc.CharAt(10) = \"T\" Then";
if (_utc.charAt((int) (10))==BA.ObjectToChar("T")) { 
 //BA.debugLineNum = 1493;BA.debugLine="If utc.CharAt(19) = \".\" Then utc = utc.SubString";
if (_utc.charAt((int) (19))==BA.ObjectToChar(".")) { 
_utc = _utc.substring((int) (0),(int) (19))+"+0000";};
 //BA.debugLineNum = 1494;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd'T'HH:mm:ssZ\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
 }else {
 //BA.debugLineNum = 1497;BA.debugLine="DateTime.DateFormat = \"EEE MMM dd HH:mm:ss Z yyy";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("EEE MMM dd HH:mm:ss Z yyyy");
 };
 //BA.debugLineNum = 1499;BA.debugLine="Try";
try { //BA.debugLineNum = 1500;BA.debugLine="res = DateTime.DateParse(utc)";
_res = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_utc);
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 1502;BA.debugLine="res = 0";
_res = (long) (0);
 };
 //BA.debugLineNum = 1504;BA.debugLine="DateTime.DateFormat = df";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(_df);
 //BA.debugLineNum = 1505;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 1506;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public static void  _refreshcameras(boolean _firstrun) throws Exception{
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
int _i = 0;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
Object _result = null;
String _link = "";
int step9;
int limit9;
int step27;
int limit27;
anywheresoftware.b4a.BA.IterableList group51;
int index51;
int groupLen51;
int step87;
int limit87;
int step98;
int limit98;
int step116;
int limit116;
int step132;
int limit132;

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
 //BA.debugLineNum = 233;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 130;
this.catchState = 129;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 129;
 //BA.debugLineNum = 234;BA.debugLine="Dim camera As String";
_camera = "";
 //BA.debugLineNum = 235;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 236;BA.debugLine="Dim clv As CustomListView";
_clv = new b4j.example.customlistview();
 //BA.debugLineNum = 237;BA.debugLine="Dim links As List";
_links = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 238;BA.debugLine="Dim attempts As Int";
_attempts = 0;
 //BA.debugLineNum = 239;BA.debugLine="links = Array(\"347574\", \"236967\", \"226821\")";
_links = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("347574"),(Object)("236967"),(Object)("226821")});
 //BA.debugLineNum = 241;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia-";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/syncmodules");
 //BA.debugLineNum = 242;BA.debugLine="For i = 1 To 20";
if (true) break;

case 4:
//for
this.state = 13;
step9 = 1;
limit9 = (int) (20);
_i = (int) (1) ;
this.state = 131;
if (true) break;

case 131:
//C
this.state = 13;
if ((step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9)) this.state = 6;
if (true) break;

case 132:
//C
this.state = 131;
_i = ((int)(0 + _i + step9)) ;
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 243;BA.debugLine="If response = \"\" Then";
if (true) break;

case 7:
//if
this.state = 12;
if ((parent._response).equals("")) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 //BA.debugLineNum = 244;BA.debugLine="Sleep(50)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (50));
this.state = 133;
return;
case 133:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 246;BA.debugLine="Exit";
this.state = 13;
if (true) break;
 if (true) break;

case 12:
//C
this.state = 132;
;
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 249;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.Co";

case 13:
//if
this.state = 16;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 250;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 251;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 252;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 253;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 254;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 255;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 256;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 16:
//C
this.state = 17;
;
 //BA.debugLineNum = 260;BA.debugLine="GetSyncModuleInfo(response)";
_getsyncmoduleinfo(parent._response);
 //BA.debugLineNum = 262;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia-";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/homescreen");
 //BA.debugLineNum = 263;BA.debugLine="For i = 1 To 20";
if (true) break;

case 17:
//for
this.state = 26;
step27 = 1;
limit27 = (int) (20);
_i = (int) (1) ;
this.state = 134;
if (true) break;

case 134:
//C
this.state = 26;
if ((step27 > 0 && _i <= limit27) || (step27 < 0 && _i >= limit27)) this.state = 19;
if (true) break;

case 135:
//C
this.state = 134;
_i = ((int)(0 + _i + step27)) ;
if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 264;BA.debugLine="If response = \"\" Then";
if (true) break;

case 20:
//if
this.state = 25;
if ((parent._response).equals("")) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
 //BA.debugLineNum = 265;BA.debugLine="Sleep(50)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (50));
this.state = 136;
return;
case 136:
//C
this.state = 25;
;
 if (true) break;

case 24:
//C
this.state = 25;
 //BA.debugLineNum = 267;BA.debugLine="Exit";
this.state = 26;
if (true) break;
 if (true) break;

case 25:
//C
this.state = 135;
;
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 270;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.Co";

case 26:
//if
this.state = 29;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 //BA.debugLineNum = 271;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 272;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 273;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 274;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 275;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 276;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 277;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 29:
//C
this.state = 30;
;
 //BA.debugLineNum = 279;BA.debugLine="GetHomescreen(response)";
_gethomescreen(parent._response);
 //BA.debugLineNum = 281;BA.debugLine="If FirstRun= False Then";
if (true) break;

case 30:
//if
this.state = 33;
if (_firstrun==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 32;
}if (true) break;

case 32:
//C
this.state = 33;
 //BA.debugLineNum = 282;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
_bluriv("Driveway.jpg",parent._ivdriveway);
 //BA.debugLineNum = 283;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
_bluriv("FrontDoor.jpg",parent._ivfrontdoor);
 //BA.debugLineNum = 284;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
_bluriv("SideYard.jpg",parent._ivsideyard);
 if (true) break;

case 33:
//C
this.state = 34;
;
 //BA.debugLineNum = 288;BA.debugLine="Dim rs As ResumableSub = GetUnwatchedVideos";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getunwatchedvideos();
 //BA.debugLineNum = 289;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 137;
return;
case 137:
//C
this.state = 34;
_result = (Object) result[0];
;
 //BA.debugLineNum = 291;BA.debugLine="For Each link As String In links";
if (true) break;

case 34:
//for
this.state = 127;
group51 = _links;
index51 = 0;
groupLen51 = group51.getSize();
this.state = 138;
if (true) break;

case 138:
//C
this.state = 127;
if (index51 < groupLen51) {
this.state = 36;
_link = BA.ObjectToString(group51.Get(index51));}
if (true) break;

case 139:
//C
this.state = 138;
index51++;
if (true) break;

case 36:
//C
this.state = 37;
 //BA.debugLineNum = 292;BA.debugLine="camera = link";
_camera = _link;
 //BA.debugLineNum = 294;BA.debugLine="If FirstRun Then";
if (true) break;

case 37:
//if
this.state = 58;
if (_firstrun) { 
this.state = 39;
}else {
this.state = 49;
}if (true) break;

case 39:
//C
this.state = 40;
 //BA.debugLineNum = 295;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 40:
//if
this.state = 47;
if ((_camera).equals("347574")) { 
this.state = 42;
}else if((_camera).equals("236967")) { 
this.state = 44;
}else if((_camera).equals("226821")) { 
this.state = 46;
}if (true) break;

case 42:
//C
this.state = 47;
 //BA.debugLineNum = 296;BA.debugLine="lblStatus.Text = \"Retrieving Driveway thumbna";
parent._lblstatus.setText("Retrieving Driveway thumbnail...");
 //BA.debugLineNum = 297;BA.debugLine="iv = ivDriveway";
_iv = parent._ivdriveway;
 //BA.debugLineNum = 298;BA.debugLine="clv = clvDriveway";
_clv = parent._clvdriveway;
 if (true) break;

case 44:
//C
this.state = 47;
 //BA.debugLineNum = 300;BA.debugLine="lblStatus.Text = \"Retrieving Front Door thumb";
parent._lblstatus.setText("Retrieving Front Door thumbnail...");
 //BA.debugLineNum = 301;BA.debugLine="iv = ivFrontDoor";
_iv = parent._ivfrontdoor;
 //BA.debugLineNum = 302;BA.debugLine="clv = clvFrontDoor";
_clv = parent._clvfrontdoor;
 if (true) break;

case 46:
//C
this.state = 47;
 //BA.debugLineNum = 304;BA.debugLine="lblStatus.Text = \"Retrieving Side Yard thumbn";
parent._lblstatus.setText("Retrieving Side Yard thumbnail...");
 //BA.debugLineNum = 305;BA.debugLine="iv = ivSideYard";
_iv = parent._ivsideyard;
 //BA.debugLineNum = 306;BA.debugLine="clv = clvSideYard";
_clv = parent._clvsideyard;
 if (true) break;

case 47:
//C
this.state = 58;
;
 if (true) break;

case 49:
//C
this.state = 50;
 //BA.debugLineNum = 309;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 50:
//if
this.state = 57;
if ((_camera).equals("347574")) { 
this.state = 52;
}else if((_camera).equals("236967")) { 
this.state = 54;
}else if((_camera).equals("226821")) { 
this.state = 56;
}if (true) break;

case 52:
//C
this.state = 57;
 //BA.debugLineNum = 310;BA.debugLine="lblStatus.Text = \"Capturing a new Driveway th";
parent._lblstatus.setText("Capturing a new Driveway thumbnail...");
 //BA.debugLineNum = 311;BA.debugLine="iv = ivDriveway";
_iv = parent._ivdriveway;
 //BA.debugLineNum = 312;BA.debugLine="clv = clvDriveway";
_clv = parent._clvdriveway;
 //BA.debugLineNum = 313;BA.debugLine="attempts = 10";
_attempts = (int) (10);
 if (true) break;

case 54:
//C
this.state = 57;
 //BA.debugLineNum = 315;BA.debugLine="lblStatus.Text = \"Capturing a new Front Door";
parent._lblstatus.setText("Capturing a new Front Door thumbnail...");
 //BA.debugLineNum = 316;BA.debugLine="iv = ivFrontDoor";
_iv = parent._ivfrontdoor;
 //BA.debugLineNum = 317;BA.debugLine="clv = clvFrontDoor";
_clv = parent._clvfrontdoor;
 //BA.debugLineNum = 318;BA.debugLine="attempts = 15";
_attempts = (int) (15);
 if (true) break;

case 56:
//C
this.state = 57;
 //BA.debugLineNum = 320;BA.debugLine="lblStatus.Text = \"Capturing a new Side Yard t";
parent._lblstatus.setText("Capturing a new Side Yard thumbnail...");
 //BA.debugLineNum = 321;BA.debugLine="iv = ivSideYard";
_iv = parent._ivsideyard;
 //BA.debugLineNum = 322;BA.debugLine="clv = clvSideYard";
_clv = parent._clvsideyard;
 //BA.debugLineNum = 323;BA.debugLine="attempts = 15";
_attempts = (int) (15);
 if (true) break;

case 57:
//C
this.state = 58;
;
 if (true) break;
;
 //BA.debugLineNum = 327;BA.debugLine="If FirstRun Then";

case 58:
//if
this.state = 126;
if (_firstrun) { 
this.state = 60;
}else {
this.state = 72;
}if (true) break;

case 60:
//C
this.state = 61;
 //BA.debugLineNum = 328;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedi";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera);
 //BA.debugLineNum = 329;BA.debugLine="For i = 1 To 20";
if (true) break;

case 61:
//for
this.state = 70;
step87 = 1;
limit87 = (int) (20);
_i = (int) (1) ;
this.state = 140;
if (true) break;

case 140:
//C
this.state = 70;
if ((step87 > 0 && _i <= limit87) || (step87 < 0 && _i >= limit87)) this.state = 63;
if (true) break;

case 141:
//C
this.state = 140;
_i = ((int)(0 + _i + step87)) ;
if (true) break;

case 63:
//C
this.state = 64;
 //BA.debugLineNum = 330;BA.debugLine="If response = \"\" Then";
if (true) break;

case 64:
//if
this.state = 69;
if ((parent._response).equals("")) { 
this.state = 66;
}else {
this.state = 68;
}if (true) break;

case 66:
//C
this.state = 69;
 //BA.debugLineNum = 331;BA.debugLine="Sleep(50)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (50));
this.state = 142;
return;
case 142:
//C
this.state = 69;
;
 if (true) break;

case 68:
//C
this.state = 69;
 //BA.debugLineNum = 333;BA.debugLine="Exit";
this.state = 70;
if (true) break;
 if (true) break;

case 69:
//C
this.state = 141;
;
 if (true) break;
if (true) break;

case 70:
//C
this.state = 126;
;
 //BA.debugLineNum = 337;BA.debugLine="GetCameraInfo(response,clv)";
_getcamerainfo(parent._response,_clv);
 //BA.debugLineNum = 338;BA.debugLine="DownloadImage(\"https://rest-\" & userRegion &\".";
_downloadimage("https://rest-"+parent._userregion+".immedia-semi.com/"+parent._camerathumbnail+".jpg",_iv,_camera);
 if (true) break;

case 72:
//C
this.state = 73;
 //BA.debugLineNum = 340;BA.debugLine="RESTPost(\"https://rest-\" & userRegion &\".immed";
_restpost("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera+"/thumbnail");
 //BA.debugLineNum = 341;BA.debugLine="For i = 1 To 20";
if (true) break;

case 73:
//for
this.state = 82;
step98 = 1;
limit98 = (int) (20);
_i = (int) (1) ;
this.state = 143;
if (true) break;

case 143:
//C
this.state = 82;
if ((step98 > 0 && _i <= limit98) || (step98 < 0 && _i >= limit98)) this.state = 75;
if (true) break;

case 144:
//C
this.state = 143;
_i = ((int)(0 + _i + step98)) ;
if (true) break;

case 75:
//C
this.state = 76;
 //BA.debugLineNum = 342;BA.debugLine="If response = \"\" Then";
if (true) break;

case 76:
//if
this.state = 81;
if ((parent._response).equals("")) { 
this.state = 78;
}else {
this.state = 80;
}if (true) break;

case 78:
//C
this.state = 81;
 //BA.debugLineNum = 343;BA.debugLine="Sleep(50)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (50));
this.state = 145;
return;
case 145:
//C
this.state = 81;
;
 if (true) break;

case 80:
//C
this.state = 81;
 //BA.debugLineNum = 345;BA.debugLine="Exit";
this.state = 82;
if (true) break;
 if (true) break;

case 81:
//C
this.state = 144;
;
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 349;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.";

case 82:
//if
this.state = 125;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 84;
}else {
this.state = 86;
}if (true) break;

case 84:
//C
this.state = 125;
 //BA.debugLineNum = 350;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 351;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 352;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 353;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 354;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 355;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 356;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 86:
//C
this.state = 87;
 //BA.debugLineNum = 358;BA.debugLine="GetCommandID(response)";
_getcommandid(parent._response);
 //BA.debugLineNum = 359;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immed";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
 //BA.debugLineNum = 360;BA.debugLine="For i = 1 To 20";
if (true) break;

case 87:
//for
this.state = 96;
step116 = 1;
limit116 = (int) (20);
_i = (int) (1) ;
this.state = 146;
if (true) break;

case 146:
//C
this.state = 96;
if ((step116 > 0 && _i <= limit116) || (step116 < 0 && _i >= limit116)) this.state = 89;
if (true) break;

case 147:
//C
this.state = 146;
_i = ((int)(0 + _i + step116)) ;
if (true) break;

case 89:
//C
this.state = 90;
 //BA.debugLineNum = 361;BA.debugLine="If response = \"\" Then";
if (true) break;

case 90:
//if
this.state = 95;
if ((parent._response).equals("")) { 
this.state = 92;
}else {
this.state = 94;
}if (true) break;

case 92:
//C
this.state = 95;
 //BA.debugLineNum = 362;BA.debugLine="Sleep(50)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (50));
this.state = 148;
return;
case 148:
//C
this.state = 95;
;
 if (true) break;

case 94:
//C
this.state = 95;
 //BA.debugLineNum = 364;BA.debugLine="Exit";
this.state = 96;
if (true) break;
 if (true) break;

case 95:
//C
this.state = 147;
;
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 368;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response";

case 96:
//if
this.state = 124;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 98;
}else {
this.state = 100;
}if (true) break;

case 98:
//C
this.state = 124;
 //BA.debugLineNum = 369;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 370;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 371;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 372;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 373;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 374;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 375;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 100:
//C
this.state = 101;
 //BA.debugLineNum = 377;BA.debugLine="For i = 1 To attempts";
if (true) break;

case 101:
//for
this.state = 110;
step132 = 1;
limit132 = _attempts;
_i = (int) (1) ;
this.state = 149;
if (true) break;

case 149:
//C
this.state = 110;
if ((step132 > 0 && _i <= limit132) || (step132 < 0 && _i >= limit132)) this.state = 103;
if (true) break;

case 150:
//C
this.state = 149;
_i = ((int)(0 + _i + step132)) ;
if (true) break;

case 103:
//C
this.state = 104;
 //BA.debugLineNum = 380;BA.debugLine="Dim rs As ResumableSub = GetCommandResponse";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _getcommandresponse(_iv,_clv,_camera,BA.NumberToString(_i),BA.NumberToString(_attempts));
 //BA.debugLineNum = 381;BA.debugLine="wait for (rs) complete (Result As Object)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _rs);
this.state = 151;
return;
case 151:
//C
this.state = 104;
_result = (Object) result[0];
;
 //BA.debugLineNum = 382;BA.debugLine="If Result Then Exit";
if (true) break;

case 104:
//if
this.state = 109;
if (BA.ObjectToBoolean(_result)) { 
this.state = 106;
;}if (true) break;

case 106:
//C
this.state = 109;
this.state = 110;
if (true) break;
if (true) break;

case 109:
//C
this.state = 150;
;
 //BA.debugLineNum = 383;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".imm";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
 //BA.debugLineNum = 384;BA.debugLine="Sleep(1000) ' 1 second";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 152;
return;
case 152:
//C
this.state = 150;
;
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 387;BA.debugLine="If response.StartsWith(\"ERROR: \") Or respons";

case 110:
//if
this.state = 123;
if (parent._response.startsWith("ERROR: ") || parent._response.contains("System is busy, please wait")) { 
this.state = 112;
}else if(parent._commandcomplete==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 114;
}if (true) break;

case 112:
//C
this.state = 123;
 //BA.debugLineNum = 388;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 389;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 390;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 391;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 392;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 393;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 394;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 114:
//C
this.state = 115;
 //BA.debugLineNum = 396;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 115:
//if
this.state = 122;
if ((_camera).equals("347574")) { 
this.state = 117;
}else if((_camera).equals("236967")) { 
this.state = 119;
}else if((_camera).equals("226821")) { 
this.state = 121;
}if (true) break;

case 117:
//C
this.state = 122;
 //BA.debugLineNum = 397;BA.debugLine="lblStatus.Text = \"Failed to retrieve Drive";
parent._lblstatus.setText("Failed to retrieve Driveway thumbnail...");
 if (true) break;

case 119:
//C
this.state = 122;
 //BA.debugLineNum = 399;BA.debugLine="lblStatus.Text = \"Failed to retrieve Front";
parent._lblstatus.setText("Failed to retrieve Front Door thumbnail...");
 if (true) break;

case 121:
//C
this.state = 122;
 //BA.debugLineNum = 401;BA.debugLine="lblStatus.Text = \"Failed to retrieve Side";
parent._lblstatus.setText("Failed to retrieve Side Yard thumbnail...");
 if (true) break;

case 122:
//C
this.state = 123;
;
 if (true) break;

case 123:
//C
this.state = 124;
;
 if (true) break;

case 124:
//C
this.state = 125;
;
 if (true) break;

case 125:
//C
this.state = 126;
;
 if (true) break;

case 126:
//C
this.state = 139;
;
 if (true) break;
if (true) break;

case 127:
//C
this.state = 130;
;
 //BA.debugLineNum = 411;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
 if (true) break;

case 129:
//C
this.state = 130;
this.catchState = 0;
 //BA.debugLineNum = 413;BA.debugLine="response = \"ERROR: \" & LastException";
parent._response = "ERROR: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba));
 //BA.debugLineNum = 414;BA.debugLine="Log(\"RefreshCamera LastException: \" & LastExcept";
anywheresoftware.b4a.keywords.Common.Log("RefreshCamera LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 130:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 416;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 417;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 418;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 419;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 420;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 421;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 422;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 188;BA.debugLine="Try";
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
 //BA.debugLineNum = 189;BA.debugLine="lblStatus.Text = \"Authenticating...\"";
parent._lblstatus.setText("Authenticating...");
 //BA.debugLineNum = 190;BA.debugLine="Dim jobLogin As HttpJob";
_joblogin = new cloyd.blink.httpjob();
 //BA.debugLineNum = 191;BA.debugLine="jobLogin.Initialize(\"\", Me)";
_joblogin._initialize /*String*/ (ba,"",main.getObject());
 //BA.debugLineNum = 192;BA.debugLine="jobLogin.PostString(\"https://rest.prod.immedia-s";
_joblogin._poststring /*String*/ ("https://rest.prod.immedia-semi.com/login","email="+parent._emailaddress+"&password="+parent._password);
 //BA.debugLineNum = 193;BA.debugLine="jobLogin.GetRequest.SetContentType(\"application/";
_joblogin._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/x-www-form-urlencoded");
 //BA.debugLineNum = 194;BA.debugLine="Wait For (jobLogin) JobDone(jobLogin As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, this, (Object)(_joblogin));
this.state = 19;
return;
case 19:
//C
this.state = 4;
_joblogin = (cloyd.blink.httpjob) result[0];
;
 //BA.debugLineNum = 195;BA.debugLine="If jobLogin.Success Then";
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
 //BA.debugLineNum = 196;BA.debugLine="lblStatus.Text = \"Successfully logged in to the";
parent._lblstatus.setText("Successfully logged in to the Blink server...");
 //BA.debugLineNum = 198;BA.debugLine="GetAuthInfo(jobLogin.GetString)";
_getauthinfo(_joblogin._getstring /*String*/ ());
 //BA.debugLineNum = 200;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.C";
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
 //BA.debugLineNum = 201;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 202;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 203;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 204;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 205;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 206;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 207;BA.debugLine="jobLogin.Release";
_joblogin._release /*String*/ ();
 //BA.debugLineNum = 208;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 210;BA.debugLine="lblStatus.Text = \"AuthToken acquired...\"";
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
 //BA.debugLineNum = 213;BA.debugLine="lblStatus.Text = GetRESTError(jobLogin.ErrorMes";
parent._lblstatus.setText(_getresterror(_joblogin._errormessage /*String*/ ));
 //BA.debugLineNum = 214;BA.debugLine="Log(\"RequestAuthToken error: \" & jobLogin.Error";
anywheresoftware.b4a.keywords.Common.Log("RequestAuthToken error: "+_joblogin._errormessage /*String*/ );
 //BA.debugLineNum = 215;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 216;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 217;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 218;BA.debugLine="btnDrivewayNewClip.Enabled = True";
parent._btndrivewaynewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 219;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
parent._btnfrontdoornewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 220;BA.debugLine="btnSideYardNewClip.Enabled = True";
parent._btnsideyardnewclip.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 221;BA.debugLine="jobLogin.Release";
_joblogin._release /*String*/ ();
 //BA.debugLineNum = 222;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 15:
//C
this.state = 18;
;
 //BA.debugLineNum = 224;BA.debugLine="jobLogin.Release";
_joblogin._release /*String*/ ();
 //BA.debugLineNum = 225;BA.debugLine="RefreshCameras(True)";
_refreshcameras(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
 //BA.debugLineNum = 227;BA.debugLine="Log(\"RequestAuthToken LastException: \" & LastExc";
anywheresoftware.b4a.keywords.Common.Log("RequestAuthToken LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 18:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 229;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 453;BA.debugLine="Try";
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
 //BA.debugLineNum = 454;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
 //BA.debugLineNum = 455;BA.debugLine="response = \"\"";
parent._response = "";
 //BA.debugLineNum = 456;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no";
_j._initialize /*String*/ (ba,"",main.getObject());
 //BA.debugLineNum = 457;BA.debugLine="j.Download(url)";
_j._download /*String*/ (_url);
 //BA.debugLineNum = 458;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("TOKEN_AUTH",parent._authtoken);
 //BA.debugLineNum = 459;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[0];
;
 //BA.debugLineNum = 460;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 461;BA.debugLine="response = j.GetString";
parent._response = _j._getstring /*String*/ ();
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 463;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
parent._response = "ERROR: "+_j._errormessage /*String*/ ;
 //BA.debugLineNum = 464;BA.debugLine="lblStatus.Text = GetRESTError(j.ErrorMessage)";
parent._lblstatus.setText(_getresterror(_j._errormessage /*String*/ ));
 if (true) break;
;
 //BA.debugLineNum = 466;BA.debugLine="If response.Contains(\"System is busy, please wai";

case 9:
//if
this.state = 12;
if (parent._response.contains("System is busy, please wait")) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 467;BA.debugLine="lblStatus.Text = \"System is busy, please wait\"";
parent._lblstatus.setText("System is busy, please wait");
 if (true) break;

case 12:
//C
this.state = 15;
;
 //BA.debugLineNum = 469;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 //BA.debugLineNum = 471;BA.debugLine="response = \"ERROR: \" & LastException";
parent._response = "ERROR: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba));
 //BA.debugLineNum = 472;BA.debugLine="Log(\"RESTGet LastException: \" & LastException)";
anywheresoftware.b4a.keywords.Common.Log("RESTGet LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 15:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 474;BA.debugLine="Log(\"URL: \" & url)";
anywheresoftware.b4a.keywords.Common.Log("URL: "+_url);
 //BA.debugLineNum = 475;BA.debugLine="Log(\"Response: \" & response)";
anywheresoftware.b4a.keywords.Common.Log("Response: "+parent._response);
 //BA.debugLineNum = 476;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 //BA.debugLineNum = 477;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 480;BA.debugLine="Try";
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
 //BA.debugLineNum = 481;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
 //BA.debugLineNum = 482;BA.debugLine="response = \"\"";
parent._response = "";
 //BA.debugLineNum = 483;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no";
_j._initialize /*String*/ (ba,"",main.getObject());
 //BA.debugLineNum = 484;BA.debugLine="j.PostString(url,\"\")";
_j._poststring /*String*/ (_url,"");
 //BA.debugLineNum = 485;BA.debugLine="j.GetRequest.SetContentType(\"application/x-www-f";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/x-www-form-urlencoded");
 //BA.debugLineNum = 486;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("TOKEN_AUTH",parent._authtoken);
 //BA.debugLineNum = 487;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[0];
;
 //BA.debugLineNum = 488;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 489;BA.debugLine="response = j.GetString";
parent._response = _j._getstring /*String*/ ();
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 491;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
parent._response = "ERROR: "+_j._errormessage /*String*/ ;
 //BA.debugLineNum = 492;BA.debugLine="lblStatus.Text = GetRESTError(j.ErrorMessage)";
parent._lblstatus.setText(_getresterror(_j._errormessage /*String*/ ));
 if (true) break;
;
 //BA.debugLineNum = 494;BA.debugLine="If response.Contains(\"System is busy, please wai";

case 9:
//if
this.state = 12;
if (parent._response.contains("System is busy, please wait")) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 495;BA.debugLine="lblStatus.Text = \"System is busy, please wait\"";
parent._lblstatus.setText("System is busy, please wait");
 if (true) break;

case 12:
//C
this.state = 15;
;
 //BA.debugLineNum = 497;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 //BA.debugLineNum = 499;BA.debugLine="response = \"ERROR: \" & LastException";
parent._response = "ERROR: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba));
 //BA.debugLineNum = 500;BA.debugLine="Log(\"RESTPost LastException: \" & LastException)";
anywheresoftware.b4a.keywords.Common.Log("RESTPost LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 15:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 502;BA.debugLine="Log(\"URL: \" & url)";
anywheresoftware.b4a.keywords.Common.Log("URL: "+_url);
 //BA.debugLineNum = 503;BA.debugLine="Log(\"Response: \" & response)";
anywheresoftware.b4a.keywords.Common.Log("Response: "+parent._response);
 //BA.debugLineNum = 504;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 //BA.debugLineNum = 505;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 1364;BA.debugLine="Private Sub SetAvg(bc As BitmapCreator, x As Int,";
 //BA.debugLineNum = 1365;BA.debugLine="Try";
try { //BA.debugLineNum = 1366;BA.debugLine="temp.Initialize";
_temp.Initialize();
 //BA.debugLineNum = 1367;BA.debugLine="For Each c As ARGBColor In clrs";
{
final b4j.example.bitmapcreator._argbcolor[] group3 = _clrs;
final int groupLen3 = group3.length
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_c = group3[index3];
 //BA.debugLineNum = 1368;BA.debugLine="temp.r = temp.r + c.r";
_temp.r = (int) (_temp.r+_c.r);
 //BA.debugLineNum = 1369;BA.debugLine="temp.g = temp.g + c.g";
_temp.g = (int) (_temp.g+_c.g);
 //BA.debugLineNum = 1370;BA.debugLine="temp.b = temp.b + c.b";
_temp.b = (int) (_temp.b+_c.b);
 }
};
 //BA.debugLineNum = 1372;BA.debugLine="temp.a = 255";
_temp.a = (int) (255);
 //BA.debugLineNum = 1373;BA.debugLine="temp.r = temp.r / clrs.Length";
_temp.r = (int) (_temp.r/(double)_clrs.length);
 //BA.debugLineNum = 1374;BA.debugLine="temp.g = temp.g / clrs.Length";
_temp.g = (int) (_temp.g/(double)_clrs.length);
 //BA.debugLineNum = 1375;BA.debugLine="temp.b = temp.b / clrs.Length";
_temp.b = (int) (_temp.b/(double)_clrs.length);
 //BA.debugLineNum = 1376;BA.debugLine="bc.SetARGB(x, y, temp)";
_bc._setargb(_x,_y,_temp);
 } 
       catch (Exception e14) {
			ba.setLastException(e14); //BA.debugLineNum = 1378;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 1380;BA.debugLine="End Sub";
return "";
}
public static int  _stringcount(String _stringtosearch,String _targetstr,boolean _ignorecase) throws Exception{
 //BA.debugLineNum = 1746;BA.debugLine="Sub StringCount(StringToSearch As String,TargetStr";
 //BA.debugLineNum = 1747;BA.debugLine="If IgnoreCase Then";
if (_ignorecase) { 
 //BA.debugLineNum = 1748;BA.debugLine="StringToSearch = StringToSearch.ToLowerCase";
_stringtosearch = _stringtosearch.toLowerCase();
 //BA.debugLineNum = 1749;BA.debugLine="TargetStr = TargetStr.ToLowerCase";
_targetstr = _targetstr.toLowerCase();
 };
 //BA.debugLineNum = 1751;BA.debugLine="Return (StringToSearch.Length - StringToSearch.Re";
if (true) return (int) ((_stringtosearch.length()-_stringtosearch.replace(_targetstr,"").length())/(double)_targetstr.length());
 //BA.debugLineNum = 1753;BA.debugLine="End Sub";
return 0;
}
}
