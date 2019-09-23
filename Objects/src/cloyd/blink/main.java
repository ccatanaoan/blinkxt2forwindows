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
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static cloyd.blink.httputils2service _httputils2service = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
anywheresoftware.b4j.objects.Shell _shl = null;
 //BA.debugLineNum = 116;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 117;BA.debugLine="btnDriveway.Enabled = True";
_btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 118;BA.debugLine="btnRefresh.Enabled = True";
_btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 119;BA.debugLine="btnActivity.Enabled = True";
_btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 120;BA.debugLine="fx.Msgbox2(MainForm,Error.Message,MainForm.Title,";
_fx.Msgbox2(_mainform,_error.getMessage(),_mainform.getTitle(),"OK","","",_fx.MSGBOX_ERROR);
 //BA.debugLineNum = 121;BA.debugLine="Dim shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
 //BA.debugLineNum = 122;BA.debugLine="Try";
try { //BA.debugLineNum = 123;BA.debugLine="shl.Initialize(\"shl\", \"java.exe\" , Array As Stri";
_shl.Initialize("shl","java.exe",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"-jar","Blink4Java.jar"}));
 //BA.debugLineNum = 124;BA.debugLine="shl.WorkingDirectory = File.DirApp";
_shl.setWorkingDirectory(anywheresoftware.b4a.keywords.Common.File.getDirApp());
 //BA.debugLineNum = 125;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 127;BA.debugLine="Log(LastException.Message)";
anywheresoftware.b4a.keywords.Common.Log(anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
 };
 //BA.debugLineNum = 130;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return false;
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
String _skintemp = "";
String _skindefault = "";
anywheresoftware.b4j.agraham.reflection.Reflection _obj = null;
 //BA.debugLineNum = 49;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 50;BA.debugLine="Try";
try { //BA.debugLineNum = 51;BA.debugLine="Dim skinTemp As String";
_skintemp = "";
 //BA.debugLineNum = 52;BA.debugLine="Dim skinDefault As String";
_skindefault = "";
 //BA.debugLineNum = 54;BA.debugLine="If File.Exists(File.DirApp, \"skin.ini\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"skin.ini")) { 
 //BA.debugLineNum = 55;BA.debugLine="skinTemp = File.ReadString(File.DirApp, \"skin.i";
_skintemp = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"skin.ini");
 }else {
 //BA.debugLineNum = 57;BA.debugLine="File.WriteString(File.DirApp, \"skin.ini\", \"vdSk";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"skin.ini","vdSk03");
 //BA.debugLineNum = 58;BA.debugLine="skinTemp = \"vdSk03\"";
_skintemp = "vdSk03";
 };
 //BA.debugLineNum = 61;BA.debugLine="If skinTemp = \"\" Then";
if ((_skintemp).equals("")) { 
 //BA.debugLineNum = 62;BA.debugLine="skinDefault = \"vdSk03\"";
_skindefault = "vdSk03";
 }else {
 //BA.debugLineNum = 64;BA.debugLine="If skinTemp = \"vdSk01\" Or skinTemp = \"vdSk02\" O";
if ((_skintemp).equals("vdSk01") || (_skintemp).equals("vdSk02") || (_skintemp).equals("vdSk03") || (_skintemp).equals("vdSk04") || (_skintemp).equals("vdSk05") || (_skintemp).equals("vdSk06")) { 
 //BA.debugLineNum = 65;BA.debugLine="skinDefault = skinTemp";
_skindefault = _skintemp;
 }else {
 //BA.debugLineNum = 67;BA.debugLine="skinDefault = \"vdSk03\"";
_skindefault = "vdSk03";
 };
 };
 //BA.debugLineNum = 71;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 72;BA.debugLine="MainForm.SetFormStyle(\"TRANSPARENT\")";
_mainform.SetFormStyle("TRANSPARENT");
 //BA.debugLineNum = 73;BA.debugLine="MainForm.RootPane.LoadLayout(skinDefault) 'Load";
_mainform.getRootPane().LoadLayout(ba,_skindefault);
 //BA.debugLineNum = 74;BA.debugLine="AtualSkin = skinDefault";
_atualskin = _skindefault;
 //BA.debugLineNum = 75;BA.debugLine="MainForm.BackColor = fx.Colors.Transparent";
_mainform.setBackColor(_fx.Colors.Transparent);
 //BA.debugLineNum = 76;BA.debugLine="MainForm.RootPane.Style = \"-fx-background-color:";
_mainform.getRootPane().setStyle("-fx-background-color:transparent;-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 1.0) , 15,0, 0.0, 0.0);");
 //BA.debugLineNum = 77;BA.debugLine="MainForm.Resizable = True";
_mainform.setResizable(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 78;BA.debugLine="MainForm.Icon = fx.LoadImage(File.DirAssets, \"ho";
_mainform.setIcon((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"home.png").getObject()));
 //BA.debugLineNum = 79;BA.debugLine="MainForm.Title = \"Catanaoan Blink XT2 Cameras v1";
_mainform.setTitle("Catanaoan Blink XT2 Cameras v1.0");
 //BA.debugLineNum = 80;BA.debugLine="lbTitle.MouseCursor = fx.Cursors.MOVE";
_lbtitle.setMouseCursor(_fx.Cursors.MOVE);
 //BA.debugLineNum = 81;BA.debugLine="lbTitle.Text = \"Catanaoan Blink XT2 Cameras v1.0";
_lbtitle.setText("Catanaoan Blink XT2 Cameras v1.0");
 //BA.debugLineNum = 82;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 83;BA.debugLine="Obj.Target = ivClose";
_obj.Target = (Object)(_ivclose.getObject());
 //BA.debugLineNum = 84;BA.debugLine="Obj.AddEventHandler2(\"Close_Entered\", \"onMouseEn";
_obj.AddEventHandler2(ba,"Close_Entered","onMouseEnteredProperty");
 //BA.debugLineNum = 85;BA.debugLine="Obj.AddEventHandler2(\"Close_Exited\", \"onMouseExi";
_obj.AddEventHandler2(ba,"Close_Exited","onMouseExitedProperty");
 //BA.debugLineNum = 86;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 87;BA.debugLine="Obj.Target = ivMax";
_obj.Target = (Object)(_ivmax.getObject());
 //BA.debugLineNum = 88;BA.debugLine="Obj.AddEventHandler2(\"Max_Entered\", \"onMouseEnte";
_obj.AddEventHandler2(ba,"Max_Entered","onMouseEnteredProperty");
 //BA.debugLineNum = 89;BA.debugLine="Obj.AddEventHandler2(\"Max_Exited\", \"onMouseExite";
_obj.AddEventHandler2(ba,"Max_Exited","onMouseExitedProperty");
 //BA.debugLineNum = 90;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 91;BA.debugLine="Obj.Target = ivMin";
_obj.Target = (Object)(_ivmin.getObject());
 //BA.debugLineNum = 92;BA.debugLine="Obj.AddEventHandler2(\"Min_Entered\", \"onMouseEnte";
_obj.AddEventHandler2(ba,"Min_Entered","onMouseEnteredProperty");
 //BA.debugLineNum = 93;BA.debugLine="Obj.AddEventHandler2(\"Min_Exited\", \"onMouseExite";
_obj.AddEventHandler2(ba,"Min_Exited","onMouseExitedProperty");
 //BA.debugLineNum = 94;BA.debugLine="imgInit = AtualSkin.SubString(2).ToLowerCase";
_imginit = _atualskin.substring((int) (2)).toLowerCase();
 //BA.debugLineNum = 95;BA.debugLine="Get_css";
_get_css();
 //BA.debugLineNum = 100;BA.debugLine="MainForm.WindowLeft = CheckMonitor.MaxX	- MainFo";
_mainform.setWindowLeft(_checkmonitor().getMaxX()-_mainform.getWidth()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
 //BA.debugLineNum = 101;BA.debugLine="MainForm.WindowTop = CheckMonitor.MaxY - MainFor";
_mainform.setWindowTop(_checkmonitor().getMaxY()-_mainform.getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
 //BA.debugLineNum = 103;BA.debugLine="lblStatus.TextColor = fx.Colors.White";
_lblstatus.setTextColor(_fx.Colors.White);
 //BA.debugLineNum = 104;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 105;BA.debugLine="btnDriveway.Enabled = False";
_btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 106;BA.debugLine="btnRefresh.Enabled = False";
_btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 107;BA.debugLine="btnActivity.Enabled = False";
_btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 108;BA.debugLine="RequestAuthToken";
_requestauthtoken();
 } 
       catch (Exception e53) {
			ba.setLastException(e53); //BA.debugLineNum = 110;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 1047;BA.debugLine="Private Sub Blur (bmp As B4XBitmap) As B4XBitmap";
 //BA.debugLineNum = 1048;BA.debugLine="Try";
try { //BA.debugLineNum = 1049;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4j.example.bitmapcreator();
 //BA.debugLineNum = 1050;BA.debugLine="Dim ReduceScale As Int = 2";
_reducescale = (int) (2);
 //BA.debugLineNum = 1051;BA.debugLine="bc.Initialize(bmp.Width / ReduceScale / bmp.Scal";
_bc._initialize(ba,(int) (_bmp.getWidth()/(double)_reducescale/(double)_bmp.getScale()),(int) (_bmp.getHeight()/(double)_reducescale/(double)_bmp.getScale()));
 //BA.debugLineNum = 1052;BA.debugLine="bc.CopyPixelsFromBitmap(bmp)";
_bc._copypixelsfrombitmap(_bmp);
 //BA.debugLineNum = 1053;BA.debugLine="Dim count As Int = 3";
_count = (int) (3);
 //BA.debugLineNum = 1054;BA.debugLine="Dim clrs(3) As ARGBColor";
_clrs = new b4j.example.bitmapcreator._argbcolor[(int) (3)];
{
int d0 = _clrs.length;
for (int i0 = 0;i0 < d0;i0++) {
_clrs[i0] = new b4j.example.bitmapcreator._argbcolor();
}
}
;
 //BA.debugLineNum = 1055;BA.debugLine="Dim temp As ARGBColor";
_temp = new b4j.example.bitmapcreator._argbcolor();
 //BA.debugLineNum = 1056;BA.debugLine="Dim m As Int";
_m = 0;
 //BA.debugLineNum = 1057;BA.debugLine="For steps = 1 To count";
{
final int step10 = 1;
final int limit10 = _count;
_steps = (int) (1) ;
for (;_steps <= limit10 ;_steps = _steps + step10 ) {
 //BA.debugLineNum = 1058;BA.debugLine="For y = 0 To bc.mHeight - 1";
{
final int step11 = 1;
final int limit11 = (int) (_bc._mheight-1);
_y = (int) (0) ;
for (;_y <= limit11 ;_y = _y + step11 ) {
 //BA.debugLineNum = 1059;BA.debugLine="For x = 0 To 2";
{
final int step12 = 1;
final int limit12 = (int) (2);
_x = (int) (0) ;
for (;_x <= limit12 ;_x = _x + step12 ) {
 //BA.debugLineNum = 1060;BA.debugLine="bc.GetARGB(x, y, clrs(x))";
_bc._getargb(_x,_y,_clrs[_x]);
 }
};
 //BA.debugLineNum = 1062;BA.debugLine="SetAvg(bc, 1, y, clrs, temp)";
_setavg(_bc,(int) (1),_y,_clrs,_temp);
 //BA.debugLineNum = 1063;BA.debugLine="m = 0";
_m = (int) (0);
 //BA.debugLineNum = 1064;BA.debugLine="For x = 2 To bc.mWidth - 2";
{
final int step17 = 1;
final int limit17 = (int) (_bc._mwidth-2);
_x = (int) (2) ;
for (;_x <= limit17 ;_x = _x + step17 ) {
 //BA.debugLineNum = 1065;BA.debugLine="bc.GetARGB(x + 1, y, clrs(m))";
_bc._getargb((int) (_x+1),_y,_clrs[_m]);
 //BA.debugLineNum = 1066;BA.debugLine="m = (m + 1) Mod clrs.Length";
_m = (int) ((_m+1)%_clrs.length);
 //BA.debugLineNum = 1067;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
_setavg(_bc,_x,_y,_clrs,_temp);
 }
};
 }
};
 //BA.debugLineNum = 1070;BA.debugLine="For x = 0 To bc.mWidth - 1";
{
final int step23 = 1;
final int limit23 = (int) (_bc._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit23 ;_x = _x + step23 ) {
 //BA.debugLineNum = 1071;BA.debugLine="For y = 0 To 2";
{
final int step24 = 1;
final int limit24 = (int) (2);
_y = (int) (0) ;
for (;_y <= limit24 ;_y = _y + step24 ) {
 //BA.debugLineNum = 1072;BA.debugLine="bc.GetARGB(x, y, clrs(y))";
_bc._getargb(_x,_y,_clrs[_y]);
 }
};
 //BA.debugLineNum = 1074;BA.debugLine="SetAvg(bc, x, 1, clrs, temp)";
_setavg(_bc,_x,(int) (1),_clrs,_temp);
 //BA.debugLineNum = 1075;BA.debugLine="m = 0";
_m = (int) (0);
 //BA.debugLineNum = 1076;BA.debugLine="For y = 2 To bc.mHeight - 2";
{
final int step29 = 1;
final int limit29 = (int) (_bc._mheight-2);
_y = (int) (2) ;
for (;_y <= limit29 ;_y = _y + step29 ) {
 //BA.debugLineNum = 1077;BA.debugLine="bc.GetARGB(x, y + 1, clrs(m))";
_bc._getargb(_x,(int) (_y+1),_clrs[_m]);
 //BA.debugLineNum = 1078;BA.debugLine="m = (m + 1) Mod clrs.Length";
_m = (int) ((_m+1)%_clrs.length);
 //BA.debugLineNum = 1079;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
_setavg(_bc,_x,_y,_clrs,_temp);
 }
};
 }
};
 }
};
 } 
       catch (Exception e37) {
			ba.setLastException(e37); //BA.debugLineNum = 1084;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 1085;BA.debugLine="fx.Msgbox(MainForm,\"Blur LastException: \" & Last";
_fx.Msgbox(_mainform,"Blur LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 };
 //BA.debugLineNum = 1087;BA.debugLine="Return bc.Bitmap";
if (true) return _bc._getbitmap();
 //BA.debugLineNum = 1088;BA.debugLine="End Sub";
return null;
}
public static String  _bluriv(String _image,anywheresoftware.b4j.objects.ImageViewWrapper _iv) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
 //BA.debugLineNum = 1037;BA.debugLine="Sub BlurIV (image As String,iv As ImageView)";
 //BA.debugLineNum = 1038;BA.debugLine="Try";
try { //BA.debugLineNum = 1039;BA.debugLine="Dim bmp As B4XBitmap = xui.LoadBitmapResize(File";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _xui.LoadBitmapResize(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_image,(int) (_iv.getWidth()),(int) (_iv.getHeight()),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1040;BA.debugLine="iv.SetImage(Blur(bmp))";
_iv.SetImage((javafx.scene.image.Image)(_blur(_bmp).getObject()));
 } 
       catch (Exception e5) {
			ba.setLastException(e5); //BA.debugLineNum = 1042;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 1043;BA.debugLine="fx.Msgbox(MainForm,\"BlurIV LastException: \" & La";
_fx.Msgbox(_mainform,"BlurIV LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 };
 //BA.debugLineNum = 1045;BA.debugLine="End Sub";
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
cloyd.blink.frmactivity _mf = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 1111;BA.debugLine="btnDriveway.Enabled = False";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1112;BA.debugLine="btnRefresh.Enabled = False";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1113;BA.debugLine="btnActivity.Enabled = False";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1115;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia-s";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/api/v1/accounts/88438/media/changed?since=-999999999-01-01T00:00:00+18:00&page=1");
 //BA.debugLineNum = 1117;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 1119;BA.debugLine="Dim mf As frmActivity";
_mf = new cloyd.blink.frmactivity();
 //BA.debugLineNum = 1120;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (ba,parent._mainform);
 //BA.debugLineNum = 1121;BA.debugLine="mf.authToken = authToken";
_mf._authtoken /*String*/  = parent._authtoken;
 //BA.debugLineNum = 1122;BA.debugLine="mf.Show(response,userRegion)";
_mf._show /*String*/ (parent._response,parent._userregion);
 //BA.debugLineNum = 1123;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1124;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1125;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1127;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btndriveway_click() throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub btnDriveway_Click";
 //BA.debugLineNum = 134;BA.debugLine="clvDriveway.Clear";
_clvdriveway._clear();
 //BA.debugLineNum = 135;BA.debugLine="clvFrontDoor.Clear";
_clvfrontdoor._clear();
 //BA.debugLineNum = 136;BA.debugLine="clvSideYard.Clear";
_clvsideyard._clear();
 //BA.debugLineNum = 137;BA.debugLine="btnDriveway.Enabled = False";
_btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 138;BA.debugLine="btnRefresh.Enabled = False";
_btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 139;BA.debugLine="btnActivity.Enabled = False";
_btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 140;BA.debugLine="RefreshCameras(False)";
_refreshcameras(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public static String  _btnrefresh_click() throws Exception{
 //BA.debugLineNum = 1159;BA.debugLine="Sub btnRefresh_Click";
 //BA.debugLineNum = 1160;BA.debugLine="btnDriveway.Enabled = False";
_btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1161;BA.debugLine="btnRefresh.Enabled = False";
_btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1162;BA.debugLine="btnActivity.Enabled = False";
_btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1163;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
_bluriv("Driveway.jpg",_ivdriveway);
 //BA.debugLineNum = 1164;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
_bluriv("FrontDoor.jpg",_ivfrontdoor);
 //BA.debugLineNum = 1165;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
_bluriv("SideYard.jpg",_ivsideyard);
 //BA.debugLineNum = 1166;BA.debugLine="RefreshCameras(True)";
_refreshcameras(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 1167;BA.debugLine="End Sub";
return "";
}
public static String  _checkbattlife(int _battlevel) throws Exception{
 //BA.debugLineNum = 736;BA.debugLine="Sub CheckBattLife(battlevel As Int) As String";
 //BA.debugLineNum = 737;BA.debugLine="Try";
try { //BA.debugLineNum = 739;BA.debugLine="If battlevel <= 136 Then";
if (_battlevel<=136) { 
 //BA.debugLineNum = 740;BA.debugLine="Return \"Replace battery now!\"";
if (true) return "Replace battery now!";
 }else if(_battlevel>=160) { 
 //BA.debugLineNum = 742;BA.debugLine="Return \"Very high\"";
if (true) return "Very high";
 }else if(_battlevel>136 && _battlevel<138) { 
 //BA.debugLineNum = 744;BA.debugLine="Return \"Very low\"";
if (true) return "Very low";
 }else {
 //BA.debugLineNum = 746;BA.debugLine="Return \"High\"";
if (true) return "High";
 };
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 749;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 750;BA.debugLine="fx.Msgbox(MainForm,\"CheckBattLife LastException:";
_fx.Msgbox(_mainform,"CheckBattLife LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 //BA.debugLineNum = 751;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 753;BA.debugLine="End Sub";
return "";
}
public static String  _checklfrlevel(int _lfrlevel) throws Exception{
 //BA.debugLineNum = 755;BA.debugLine="Sub CheckLFRLevel(lfrlevel As Int) As String";
 //BA.debugLineNum = 756;BA.debugLine="Try";
try { //BA.debugLineNum = 758;BA.debugLine="If lfrlevel > -67 Then";
if (_lfrlevel>-67) { 
 //BA.debugLineNum = 759;BA.debugLine="Return \"Amazing\"";
if (true) return "Amazing";
 }else if(_lfrlevel>-70 && _lfrlevel<=-67) { 
 //BA.debugLineNum = 761;BA.debugLine="Return \"Very good\"";
if (true) return "Very good";
 }else if(_lfrlevel>-80 && _lfrlevel<=-70) { 
 //BA.debugLineNum = 763;BA.debugLine="Return \"OK\"";
if (true) return "OK";
 }else if(_lfrlevel>-90 && _lfrlevel<=-80) { 
 //BA.debugLineNum = 765;BA.debugLine="Return \"Not Good\"";
if (true) return "Not Good";
 }else {
 //BA.debugLineNum = 767;BA.debugLine="Return \"Unusable\"";
if (true) return "Unusable";
 };
 } 
       catch (Exception e14) {
			ba.setLastException(e14); //BA.debugLineNum = 770;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 771;BA.debugLine="fx.Msgbox(MainForm,\"CheckLFRLevel LastException:";
_fx.Msgbox(_mainform,"CheckLFRLevel LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 //BA.debugLineNum = 772;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 774;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.JFX.ScreenWrapper  _checkmonitor() throws Exception{
anywheresoftware.b4a.objects.collections.List _slist = null;
anywheresoftware.b4j.objects.JFX.ScreenWrapper _s = null;
 //BA.debugLineNum = 879;BA.debugLine="Sub CheckMonitor() As Screen";
 //BA.debugLineNum = 880;BA.debugLine="Try";
try { //BA.debugLineNum = 881;BA.debugLine="If fx.Screens.Size= 1 Then";
if (_fx.getScreens().getSize()==1) { 
 //BA.debugLineNum = 882;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 883;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 885;BA.debugLine="Return S";
if (true) return _s;
 }else if(_fx.getScreens().getSize()>1) { 
 //BA.debugLineNum = 887;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 888;BA.debugLine="Dim S As Screen = SList.Get(2)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (2))));
 //BA.debugLineNum = 890;BA.debugLine="Return S";
if (true) return _s;
 }else {
 //BA.debugLineNum = 892;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 893;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 895;BA.debugLine="Return S";
if (true) return _s;
 };
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 898;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 899;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 901;BA.debugLine="Return S";
if (true) return _s;
 };
 //BA.debugLineNum = 903;BA.debugLine="End Sub";
return null;
}
public static String  _close_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 805;BA.debugLine="Private Sub Close_Entered_Event(e As Event)";
 //BA.debugLineNum = 806;BA.debugLine="Try";
try { //BA.debugLineNum = 807;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
_ivclose.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btCloseEnt.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 809;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 811;BA.debugLine="End Sub";
return "";
}
public static String  _close_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 813;BA.debugLine="Private Sub Close_Exited_Event(e As Event)";
 //BA.debugLineNum = 814;BA.debugLine="Try";
try { //BA.debugLineNum = 815;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
_ivclose.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btClose.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 817;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 819;BA.debugLine="End Sub";
return "";
}
public static String  _clvdriveway_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 925;BA.debugLine="Sub clvDriveway_ItemClick (Index As Int, Value As";
 //BA.debugLineNum = 926;BA.debugLine="Try";
try { //BA.debugLineNum = 927;BA.debugLine="clvDriveway.JumpToItem(Index)";
_clvdriveway._jumptoitem(_index);
 //BA.debugLineNum = 928;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
_clvfrontdoor._jumptoitem(_index);
 //BA.debugLineNum = 929;BA.debugLine="clvSideYard.JumpToItem(Index)";
_clvsideyard._jumptoitem(_index);
 } 
       catch (Exception e6) {
			ba.setLastException(e6); //BA.debugLineNum = 931;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 933;BA.debugLine="End Sub";
return "";
}
public static String  _clvfrontdoor_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 915;BA.debugLine="Sub clvFrontDoor_ItemClick (Index As Int, Value As";
 //BA.debugLineNum = 916;BA.debugLine="Try";
try { //BA.debugLineNum = 917;BA.debugLine="clvDriveway.JumpToItem(Index)";
_clvdriveway._jumptoitem(_index);
 //BA.debugLineNum = 918;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
_clvfrontdoor._jumptoitem(_index);
 //BA.debugLineNum = 919;BA.debugLine="clvSideYard.JumpToItem(Index)";
_clvsideyard._jumptoitem(_index);
 } 
       catch (Exception e6) {
			ba.setLastException(e6); //BA.debugLineNum = 921;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 923;BA.debugLine="End Sub";
return "";
}
public static String  _clvsideyard_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 905;BA.debugLine="Sub clvSideYard_ItemClick (Index As Int, Value As";
 //BA.debugLineNum = 906;BA.debugLine="Try";
try { //BA.debugLineNum = 907;BA.debugLine="clvDriveway.JumpToItem(Index)";
_clvdriveway._jumptoitem(_index);
 //BA.debugLineNum = 908;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
_clvfrontdoor._jumptoitem(_index);
 //BA.debugLineNum = 909;BA.debugLine="clvSideYard.JumpToItem(Index)";
_clvsideyard._jumptoitem(_index);
 } 
       catch (Exception e6) {
			ba.setLastException(e6); //BA.debugLineNum = 911;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 913;BA.debugLine="End Sub";
return "";
}
public static String  _convertdatetime(String _inputtime) throws Exception{
long _ticks = 0L;
long _lngticks = 0L;
 //BA.debugLineNum = 1129;BA.debugLine="Sub ConvertDateTime(inputTime As String) As String";
 //BA.debugLineNum = 1131;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = _parseutcstring(_inputtime.replace("+00:00","+0000"));
 //BA.debugLineNum = 1132;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a");
 //BA.debugLineNum = 1133;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
 //BA.debugLineNum = 1136;BA.debugLine="Return DateTime.Date(lngTicks)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(_lngticks);
 //BA.debugLineNum = 1137;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 363;BA.debugLine="Try";
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
 //BA.debugLineNum = 364;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
 //BA.debugLineNum = 365;BA.debugLine="response = \"\"";
parent._response = "";
 //BA.debugLineNum = 366;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",main.getObject());
 //BA.debugLineNum = 367;BA.debugLine="j.Download(Link)";
_j._download /*String*/ (_link);
 //BA.debugLineNum = 368;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("TOKEN_AUTH",parent._authtoken);
 //BA.debugLineNum = 369;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 21;
return;
case 21:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[0];
;
 //BA.debugLineNum = 370;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 372;BA.debugLine="If camera = \"347574\" Then";
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
 //BA.debugLineNum = 373;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Driveway.jpg",anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 11:
//C
this.state = 14;
 //BA.debugLineNum = 375;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"FrontDoor.jpg",anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 377;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"SideYard.jpg",anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 14:
//C
this.state = 17;
;
 //BA.debugLineNum = 379;BA.debugLine="File.Copy2(j.GetInputStream, out)";
anywheresoftware.b4a.keywords.Common.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ ().getObject()),(java.io.OutputStream)(_out.getObject()));
 //BA.debugLineNum = 380;BA.debugLine="out.Close '<------ very important";
_out.Close();
 //BA.debugLineNum = 383;BA.debugLine="iv.SetImage(j.GetBitmap)";
_iv.SetImage((javafx.scene.image.Image)(_j._getbitmap /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ ().getObject()));
 if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 385;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
parent._response = "ERROR: "+_j._errormessage /*String*/ ;
 //BA.debugLineNum = 386;BA.debugLine="lblStatus.Text = GetRESTError(j.ErrorMessage)";
parent._lblstatus.setText(_getresterror(_j._errormessage /*String*/ ));
 if (true) break;

case 17:
//C
this.state = 20;
;
 //BA.debugLineNum = 388;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
 //BA.debugLineNum = 390;BA.debugLine="fx.msgbox(MainForm,\"DownloadImage LastException:";
parent._fx.Msgbox(parent._mainform,"DownloadImage LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),parent._mainform.getTitle());
 //BA.debugLineNum = 391;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 20:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 393;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 867;BA.debugLine="Public Sub Get_css";
 //BA.debugLineNum = 868;BA.debugLine="Try";
try { //BA.debugLineNum = 869;BA.debugLine="Dim jForm As JavaObject = MainForm";
_jform = new anywheresoftware.b4j.object.JavaObject();
_jform.setObject((java.lang.Object)(_mainform));
 //BA.debugLineNum = 870;BA.debugLine="Dim scene As JavaObject = jForm.GetField(\"scene\"";
_scene = new anywheresoftware.b4j.object.JavaObject();
_scene.setObject((java.lang.Object)(_jform.GetField("scene")));
 //BA.debugLineNum = 871;BA.debugLine="Dim stylesheets As List = scene.RunMethod(\"getSt";
_stylesheets = new anywheresoftware.b4a.objects.collections.List();
_stylesheets.setObject((java.util.List)(_scene.RunMethod("getStylesheets",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
 //BA.debugLineNum = 872;BA.debugLine="stylesheets.Clear";
_stylesheets.Clear();
 //BA.debugLineNum = 873;BA.debugLine="stylesheets.Add(File.GetUri(File.DirAssets, imgI";
_stylesheets.Add((Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+".css")));
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 875;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 877;BA.debugLine="End Sub";
return "";
}
public static String  _getallcameras(String _json) throws Exception{
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _networks = null;
anywheresoftware.b4a.objects.collections.Map _colnetworks = null;
 //BA.debugLineNum = 454;BA.debugLine="Sub GetAllCameras(json As String)";
 //BA.debugLineNum = 455;BA.debugLine="Try";
try { //BA.debugLineNum = 456;BA.debugLine="lblStatus.Text = \"Getting all cameras informatio";
_lblstatus.setText("Getting all cameras information...");
 //BA.debugLineNum = 457;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 458;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 459;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 463;BA.debugLine="Dim networks As List = root.Get(\"networks\")";
_networks = new anywheresoftware.b4a.objects.collections.List();
_networks.setObject((java.util.List)(_root.Get((Object)("networks"))));
 //BA.debugLineNum = 464;BA.debugLine="For Each colnetworks As Map In networks";
_colnetworks = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group7 = _networks;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_colnetworks.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group7.Get(index7)));
 //BA.debugLineNum = 473;BA.debugLine="networkID = colnetworks.Get(\"network_id\")";
_networkid = BA.ObjectToString(_colnetworks.Get((Object)("network_id")));
 //BA.debugLineNum = 474;BA.debugLine="Log(\"networkID: \" &  networkID)";
anywheresoftware.b4a.keywords.Common.Log("networkID: "+_networkid);
 }
};
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 478;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 479;BA.debugLine="fx.Msgbox(MainForm,\"GetAllCameras LastException:";
_fx.Msgbox(_mainform,"GetAllCameras LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 };
 //BA.debugLineNum = 481;BA.debugLine="End Sub";
return "";
}
public static String  _getauthinfo(String _json) throws Exception{
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.Map _authtokenmap = null;
anywheresoftware.b4a.objects.collections.Map _region = null;
 //BA.debugLineNum = 396;BA.debugLine="Sub GetAuthInfo(json As String)";
 //BA.debugLineNum = 397;BA.debugLine="Try";
try { //BA.debugLineNum = 398;BA.debugLine="lblStatus.Text = \"Getting authtoken...\"";
_lblstatus.setText("Getting authtoken...");
 //BA.debugLineNum = 399;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 400;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 401;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 402;BA.debugLine="Dim authtokenmap As Map = root.Get(\"authtoken\")";
_authtokenmap = new anywheresoftware.b4a.objects.collections.Map();
_authtokenmap.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("authtoken"))));
 //BA.debugLineNum = 403;BA.debugLine="authToken = authtokenmap.Get(\"authtoken\")";
_authtoken = BA.ObjectToString(_authtokenmap.Get((Object)("authtoken")));
 //BA.debugLineNum = 404;BA.debugLine="Log(\"authToken: \" &  authToken)";
anywheresoftware.b4a.keywords.Common.Log("authToken: "+_authtoken);
 //BA.debugLineNum = 412;BA.debugLine="Dim region As Map = root.Get(\"region\")";
_region = new anywheresoftware.b4a.objects.collections.Map();
_region.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("region"))));
 //BA.debugLineNum = 413;BA.debugLine="userRegion = region.GetKeyAt(0)";
_userregion = BA.ObjectToString(_region.GetKeyAt((int) (0)));
 //BA.debugLineNum = 414;BA.debugLine="Log(\"userRegion: \" &  userRegion)";
anywheresoftware.b4a.keywords.Common.Log("userRegion: "+_userregion);
 } 
       catch (Exception e13) {
			ba.setLastException(e13); //BA.debugLineNum = 419;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 420;BA.debugLine="fx.Msgbox(MainForm,\"GetAuthInfo LastException: \"";
_fx.Msgbox(_mainform,"GetAuthInfo LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 };
 //BA.debugLineNum = 423;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 571;BA.debugLine="Sub GetCameraInfo(json As String, clv As CustomLis";
 //BA.debugLineNum = 572;BA.debugLine="Try";
try { //BA.debugLineNum = 573;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 574;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 575;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 576;BA.debugLine="Dim camera_status As Map = root.Get(\"camera_stat";
_camera_status = new anywheresoftware.b4a.objects.collections.Map();
_camera_status.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("camera_status"))));
 //BA.debugLineNum = 577;BA.debugLine="Dim total_108_wakeups As Int = camera_status.Get";
_total_108_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("total_108_wakeups"))));
 //BA.debugLineNum = 578;BA.debugLine="Dim battery_voltage As Int = camera_status.Get(\"";
_battery_voltage = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("battery_voltage"))));
 //BA.debugLineNum = 579;BA.debugLine="Dim light_sensor_data_valid As String = camera_s";
_light_sensor_data_valid = BA.ObjectToString(_camera_status.Get((Object)("light_sensor_data_valid")));
 //BA.debugLineNum = 580;BA.debugLine="Dim lfr_tb_wakeups As Int = camera_status.Get(\"l";
_lfr_tb_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lfr_tb_wakeups"))));
 //BA.debugLineNum = 581;BA.debugLine="Dim fw_git_hash As String = camera_status.Get(\"f";
_fw_git_hash = BA.ObjectToString(_camera_status.Get((Object)("fw_git_hash")));
 //BA.debugLineNum = 582;BA.debugLine="Dim wifi_strength As Int = camera_status.Get(\"wi";
_wifi_strength = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("wifi_strength"))));
 //BA.debugLineNum = 583;BA.debugLine="Dim lfr_strength As Int = camera_status.Get(\"lfr";
_lfr_strength = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lfr_strength"))));
 //BA.debugLineNum = 584;BA.debugLine="Dim total_tb_wakeups As Int = camera_status.Get(";
_total_tb_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("total_tb_wakeups"))));
 //BA.debugLineNum = 585;BA.debugLine="Dim created_at As String = camera_status.Get(\"cr";
_created_at = BA.ObjectToString(_camera_status.Get((Object)("created_at")));
 //BA.debugLineNum = 586;BA.debugLine="Dim light_sensor_ch0 As Int = camera_status.Get(";
_light_sensor_ch0 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("light_sensor_ch0"))));
 //BA.debugLineNum = 587;BA.debugLine="Dim mac As String = camera_status.Get(\"mac\")";
_mac = BA.ObjectToString(_camera_status.Get((Object)("mac")));
 //BA.debugLineNum = 588;BA.debugLine="Dim unit_number As Int = camera_status.Get(\"unit";
_unit_number = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("unit_number"))));
 //BA.debugLineNum = 589;BA.debugLine="Dim updated_at As String = camera_status.Get(\"up";
_updated_at = BA.ObjectToString(_camera_status.Get((Object)("updated_at")));
 //BA.debugLineNum = 590;BA.debugLine="Dim light_sensor_ch1 As Int = camera_status.Get(";
_light_sensor_ch1 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("light_sensor_ch1"))));
 //BA.debugLineNum = 591;BA.debugLine="Dim time_dhcp_lease As Int = camera_status.Get(\"";
_time_dhcp_lease = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_dhcp_lease"))));
 //BA.debugLineNum = 592;BA.debugLine="Dim temperature As Int = camera_status.Get(\"temp";
_temperature = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("temperature"))));
 //BA.debugLineNum = 593;BA.debugLine="Dim time_first_video As Int = camera_status.Get(";
_time_first_video = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_first_video"))));
 //BA.debugLineNum = 594;BA.debugLine="Dim time_dns_resolve As Int = camera_status.Get(";
_time_dns_resolve = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_dns_resolve"))));
 //BA.debugLineNum = 595;BA.debugLine="Dim id As Int = camera_status.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("id"))));
 //BA.debugLineNum = 596;BA.debugLine="Dim temp_alert_status As String = camera_status.";
_temp_alert_status = BA.ObjectToString(_camera_status.Get((Object)("temp_alert_status")));
 //BA.debugLineNum = 597;BA.debugLine="Dim time_108_boot As Int = camera_status.Get(\"ti";
_time_108_boot = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_108_boot"))));
 //BA.debugLineNum = 598;BA.debugLine="Dim lfr_108_wakeups As Int = camera_status.Get(\"";
_lfr_108_wakeups = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lfr_108_wakeups"))));
 //BA.debugLineNum = 599;BA.debugLine="cameraThumbnail = camera_status.Get(\"thumbnail\")";
_camerathumbnail = BA.ObjectToString(_camera_status.Get((Object)("thumbnail")));
 //BA.debugLineNum = 600;BA.debugLine="Log(\"cameraThumbnail: \" & cameraThumbnail)";
anywheresoftware.b4a.keywords.Common.Log("cameraThumbnail: "+_camerathumbnail);
 //BA.debugLineNum = 601;BA.debugLine="Dim lifetime_duration As Int = camera_status.Get";
_lifetime_duration = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lifetime_duration"))));
 //BA.debugLineNum = 602;BA.debugLine="Dim wifi_connect_failure_count As Int = camera_s";
_wifi_connect_failure_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("wifi_connect_failure_count"))));
 //BA.debugLineNum = 603;BA.debugLine="Dim camera_id As Int = camera_status.Get(\"camera";
_camera_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("camera_id"))));
 //BA.debugLineNum = 604;BA.debugLine="Dim battery_alert_status As String = camera_stat";
_battery_alert_status = BA.ObjectToString(_camera_status.Get((Object)("battery_alert_status")));
 //BA.debugLineNum = 605;BA.debugLine="Dim dhcp_failure_count As Int = camera_status.Ge";
_dhcp_failure_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dhcp_failure_count"))));
 //BA.debugLineNum = 606;BA.debugLine="Dim ip_address As String = camera_status.Get(\"ip";
_ip_address = BA.ObjectToString(_camera_status.Get((Object)("ip_address")));
 //BA.debugLineNum = 607;BA.debugLine="Dim ipv As String = camera_status.Get(\"ipv\")";
_ipv = BA.ObjectToString(_camera_status.Get((Object)("ipv")));
 //BA.debugLineNum = 608;BA.debugLine="Dim light_sensor_data_new As String = camera_sta";
_light_sensor_data_new = BA.ObjectToString(_camera_status.Get((Object)("light_sensor_data_new")));
 //BA.debugLineNum = 609;BA.debugLine="Dim network_id As Int = camera_status.Get(\"netwo";
_network_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("network_id"))));
 //BA.debugLineNum = 610;BA.debugLine="Dim account_id As Int = camera_status.Get(\"accou";
_account_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("account_id"))));
 //BA.debugLineNum = 611;BA.debugLine="Dim serial As String = camera_status.Get(\"serial";
_serial = BA.ObjectToString(_camera_status.Get((Object)("serial")));
 //BA.debugLineNum = 612;BA.debugLine="Dim dev_1 As Int = camera_status.Get(\"dev_1\")";
_dev_1 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dev_1"))));
 //BA.debugLineNum = 613;BA.debugLine="Dim time_wlan_connect As Int = camera_status.Get";
_time_wlan_connect = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("time_wlan_connect"))));
 //BA.debugLineNum = 614;BA.debugLine="Dim dev_2 As Int = camera_status.Get(\"dev_2\")";
_dev_2 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dev_2"))));
 //BA.debugLineNum = 615;BA.debugLine="Dim socket_failure_count As Int = camera_status.";
_socket_failure_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("socket_failure_count"))));
 //BA.debugLineNum = 616;BA.debugLine="Dim dev_3 As Int = camera_status.Get(\"dev_3\")";
_dev_3 = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("dev_3"))));
 //BA.debugLineNum = 617;BA.debugLine="Dim pir_rejections As Int = camera_status.Get(\"p";
_pir_rejections = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("pir_rejections"))));
 //BA.debugLineNum = 618;BA.debugLine="Dim sync_module_id As Int = camera_status.Get(\"s";
_sync_module_id = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("sync_module_id"))));
 //BA.debugLineNum = 619;BA.debugLine="Dim lifetime_count As Int = camera_status.Get(\"l";
_lifetime_count = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("lifetime_count"))));
 //BA.debugLineNum = 620;BA.debugLine="Dim error_codes As Int = camera_status.Get(\"erro";
_error_codes = (int)(BA.ObjectToNumber(_camera_status.Get((Object)("error_codes"))));
 //BA.debugLineNum = 621;BA.debugLine="Dim fw_version As String = camera_status.Get(\"fw";
_fw_version = BA.ObjectToString(_camera_status.Get((Object)("fw_version")));
 //BA.debugLineNum = 622;BA.debugLine="Dim ac_power As String = camera_status.Get(\"ac_p";
_ac_power = BA.ObjectToString(_camera_status.Get((Object)("ac_power")));
 //BA.debugLineNum = 624;BA.debugLine="clv.Clear";
_clv._clear();
 //BA.debugLineNum = 625;BA.debugLine="clv.AddTextItem(\"Battery voltage: \" & NumberForm";
_clv._addtextitem((Object)("Battery voltage: "+anywheresoftware.b4a.keywords.Common.NumberFormat((_battery_voltage/(double)100),(int) (0),(int) (2))+"V - "+_checkbattlife(_battery_voltage)),(Object)("battery_voltage"));
 //BA.debugLineNum = 626;BA.debugLine="clv.AddTextItem(\"Camera to WiFi strength: \" & wi";
_clv._addtextitem((Object)("Camera to WiFi strength: "+BA.NumberToString(_wifi_strength)+" dBm - "+_checklfrlevel(_wifi_strength)),(Object)("wifi_strength"));
 //BA.debugLineNum = 627;BA.debugLine="clv.AddTextItem(\"Camera to Sync Module strength";
_clv._addtextitem((Object)("Camera to Sync Module strength (LFR): "+BA.NumberToString(_lfr_strength)+" dBm - "+_checklfrlevel(_lfr_strength)),(Object)("lfr_strength"));
 //BA.debugLineNum = 628;BA.debugLine="clv.AddTextItem(\"Temperature: \" & temperature &";
_clv._addtextitem((Object)("Temperature: "+BA.NumberToString(_temperature)+"ºF"),(Object)("temperature"));
 //BA.debugLineNum = 629;BA.debugLine="clv.AddTextItem(\"Firmware version: \" & fw_versio";
_clv._addtextitem((Object)("Firmware version: "+_fw_version),(Object)("fw_version"));
 //BA.debugLineNum = 630;BA.debugLine="clv.AddTextItem(\"Firmware Git Hash: \" & fw_git_h";
_clv._addtextitem((Object)("Firmware Git Hash: "+_fw_git_hash),(Object)("fw_git_hash"));
 //BA.debugLineNum = 631;BA.debugLine="clv.AddTextItem(\"Battery alert status: \" & batte";
_clv._addtextitem((Object)("Battery alert status: "+_battery_alert_status),(Object)("battery_alert_status"));
 //BA.debugLineNum = 632;BA.debugLine="clv.AddTextItem(\"Temperature alert status: \" & t";
_clv._addtextitem((Object)("Temperature alert status: "+_temp_alert_status),(Object)("temp_alert_status"));
 //BA.debugLineNum = 633;BA.debugLine="clv.AddTextItem(\"Updated at: \" & ConvertDateTime";
_clv._addtextitem((Object)("Updated at: "+_convertdatetime(_updated_at)),(Object)("updated_at"));
 //BA.debugLineNum = 634;BA.debugLine="clv.AddTextItem(\"Created at: \" & ConvertDateTime";
_clv._addtextitem((Object)("Created at: "+_convertdatetime(_created_at)),(Object)("created_at"));
 //BA.debugLineNum = 635;BA.debugLine="clv.AddTextItem(\"IP address: \" & ip_address, \"ip";
_clv._addtextitem((Object)("IP address: "+_ip_address),(Object)("ip_address"));
 //BA.debugLineNum = 636;BA.debugLine="clv.AddTextItem(\"MAC address: \" & mac, \"mac\")";
_clv._addtextitem((Object)("MAC address: "+_mac),(Object)("mac"));
 //BA.debugLineNum = 637;BA.debugLine="clv.AddTextItem(\"Camera ID: \" & camera_id, \"came";
_clv._addtextitem((Object)("Camera ID: "+BA.NumberToString(_camera_id)),(Object)("camera_id"));
 //BA.debugLineNum = 638;BA.debugLine="clv.AddTextItem(\"Serial: \" & serial, \"serial\")";
_clv._addtextitem((Object)("Serial: "+_serial),(Object)("serial"));
 //BA.debugLineNum = 639;BA.debugLine="clv.AddTextItem(\"Network ID: \" & network_id, \"ne";
_clv._addtextitem((Object)("Network ID: "+BA.NumberToString(_network_id)),(Object)("network_id"));
 //BA.debugLineNum = 640;BA.debugLine="clv.AddTextItem(\"Account ID: \" & account_id, \"ac";
_clv._addtextitem((Object)("Account ID: "+BA.NumberToString(_account_id)),(Object)("account_id"));
 //BA.debugLineNum = 641;BA.debugLine="clv.AddTextItem(\"ID: \" & id, \"id\")";
_clv._addtextitem((Object)("ID: "+BA.NumberToString(_id)),(Object)("id"));
 //BA.debugLineNum = 642;BA.debugLine="clv.AddTextItem(\"Sync Module ID: \" & sync_module";
_clv._addtextitem((Object)("Sync Module ID: "+BA.NumberToString(_sync_module_id)),(Object)("sync_module_id"));
 //BA.debugLineNum = 643;BA.debugLine="clv.AddTextItem(\"Light sensor data valid: \" & li";
_clv._addtextitem((Object)("Light sensor data valid: "+_light_sensor_data_valid),(Object)("light_sensor_data_valid"));
 //BA.debugLineNum = 644;BA.debugLine="clv.AddTextItem(\"DHCP failure count: \" & dhcp_fa";
_clv._addtextitem((Object)("DHCP failure count: "+BA.NumberToString(_dhcp_failure_count)),(Object)("dhcp_failure_count"));
 //BA.debugLineNum = 645;BA.debugLine="clv.AddTextItem(\"LFR tb wakeups: \" & lfr_tb_wake";
_clv._addtextitem((Object)("LFR tb wakeups: "+BA.NumberToString(_lfr_tb_wakeups)),(Object)("lfr_tb_wakeups"));
 //BA.debugLineNum = 646;BA.debugLine="clv.AddTextItem(\"Socket failure count: \" & socke";
_clv._addtextitem((Object)("Socket failure count: "+BA.NumberToString(_socket_failure_count)),(Object)("socket_failure_count"));
 //BA.debugLineNum = 647;BA.debugLine="clv.AddTextItem(\"Camera thumbnail: \" & cameraThu";
_clv._addtextitem((Object)("Camera thumbnail: "+_camerathumbnail),(Object)("thumbnail"));
 //BA.debugLineNum = 648;BA.debugLine="clv.AddTextItem(\"WiFi connect failure count: \" &";
_clv._addtextitem((Object)("WiFi connect failure count: "+BA.NumberToString(_wifi_connect_failure_count)),(Object)("wifi_connect_failure_count"));
 //BA.debugLineNum = 649;BA.debugLine="clv.AddTextItem(\"Error codes: \" & error_codes, \"";
_clv._addtextitem((Object)("Error codes: "+BA.NumberToString(_error_codes)),(Object)("error_codes"));
 //BA.debugLineNum = 650;BA.debugLine="clv.AddTextItem(\"AC power: \" & ac_power, \"ac_pow";
_clv._addtextitem((Object)("AC power: "+_ac_power),(Object)("ac_power"));
 //BA.debugLineNum = 651;BA.debugLine="clv.AddTextItem(\"Total 108 wakeups: \" & total_10";
_clv._addtextitem((Object)("Total 108 wakeups: "+BA.NumberToString(_total_108_wakeups)),(Object)("total_108_wakeups"));
 //BA.debugLineNum = 652;BA.debugLine="clv.AddTextItem(\"Total Tb wakeups: \" & total_tb_";
_clv._addtextitem((Object)("Total Tb wakeups: "+BA.NumberToString(_total_tb_wakeups)),(Object)("total_tb_wakeups"));
 //BA.debugLineNum = 653;BA.debugLine="clv.AddTextItem(\"Light sensor ch0: \" & light_sen";
_clv._addtextitem((Object)("Light sensor ch0: "+BA.NumberToString(_light_sensor_ch0)),(Object)("light_sensor_ch0"));
 //BA.debugLineNum = 654;BA.debugLine="clv.AddTextItem(\"Unit number: \" & unit_number, \"";
_clv._addtextitem((Object)("Unit number: "+BA.NumberToString(_unit_number)),(Object)("unit_number"));
 //BA.debugLineNum = 655;BA.debugLine="clv.AddTextItem(\"Light sensor ch1: \" & light_sen";
_clv._addtextitem((Object)("Light sensor ch1: "+BA.NumberToString(_light_sensor_ch1)),(Object)("light_sensor_ch1"));
 //BA.debugLineNum = 656;BA.debugLine="clv.AddTextItem(\"Time dhcp lease: \" & time_dhcp_";
_clv._addtextitem((Object)("Time dhcp lease: "+BA.NumberToString(_time_dhcp_lease)),(Object)("time_dhcp_lease"));
 //BA.debugLineNum = 657;BA.debugLine="clv.AddTextItem(\"Time first video: \" & time_firs";
_clv._addtextitem((Object)("Time first video: "+BA.NumberToString(_time_first_video)),(Object)("time_first_video"));
 //BA.debugLineNum = 658;BA.debugLine="clv.AddTextItem(\"Time dns resolve: \" & time_dns_";
_clv._addtextitem((Object)("Time dns resolve: "+BA.NumberToString(_time_dns_resolve)),(Object)("time_dns_resolve"));
 //BA.debugLineNum = 659;BA.debugLine="clv.AddTextItem(\"Time 108 boot: \" & time_108_boo";
_clv._addtextitem((Object)("Time 108 boot: "+BA.NumberToString(_time_108_boot)),(Object)("time_108_boot"));
 //BA.debugLineNum = 660;BA.debugLine="clv.AddTextItem(\"LFR 108 wakeups: \" & lfr_108_wa";
_clv._addtextitem((Object)("LFR 108 wakeups: "+BA.NumberToString(_lfr_108_wakeups)),(Object)("lfr_108_wakeups"));
 //BA.debugLineNum = 661;BA.debugLine="clv.AddTextItem(\"lifetime duration: \" & lifetime";
_clv._addtextitem((Object)("lifetime duration: "+BA.NumberToString(_lifetime_duration)),(Object)("lifetime_duration"));
 //BA.debugLineNum = 662;BA.debugLine="clv.AddTextItem(\"lpv: \" & ipv, \"ipv\")";
_clv._addtextitem((Object)("lpv: "+_ipv),(Object)("ipv"));
 //BA.debugLineNum = 663;BA.debugLine="clv.AddTextItem(\"light sensor data new: \" & ligh";
_clv._addtextitem((Object)("light sensor data new: "+_light_sensor_data_new),(Object)("light_sensor_data_new"));
 //BA.debugLineNum = 664;BA.debugLine="clv.AddTextItem(\"Dev_1: \" & dev_1, \"dev_1\")";
_clv._addtextitem((Object)("Dev_1: "+BA.NumberToString(_dev_1)),(Object)("dev_1"));
 //BA.debugLineNum = 665;BA.debugLine="clv.AddTextItem(\"Dev_2: \" & dev_2, \"dev_2\")";
_clv._addtextitem((Object)("Dev_2: "+BA.NumberToString(_dev_2)),(Object)("dev_2"));
 //BA.debugLineNum = 666;BA.debugLine="clv.AddTextItem(\"Dev_3: \" & dev_3, \"dev_3\")";
_clv._addtextitem((Object)("Dev_3: "+BA.NumberToString(_dev_3)),(Object)("dev_3"));
 //BA.debugLineNum = 667;BA.debugLine="clv.AddTextItem(\"Time wlan connect: \" & time_wla";
_clv._addtextitem((Object)("Time wlan connect: "+BA.NumberToString(_time_wlan_connect)),(Object)("time_wlan_connect"));
 //BA.debugLineNum = 668;BA.debugLine="clv.AddTextItem(\"PIR rejections: \" & pir_rejecti";
_clv._addtextitem((Object)("PIR rejections: "+BA.NumberToString(_pir_rejections)),(Object)("pir_rejections"));
 //BA.debugLineNum = 669;BA.debugLine="clv.AddTextItem(\"Lifetime count: \" & lifetime_co";
_clv._addtextitem((Object)("Lifetime count: "+BA.NumberToString(_lifetime_count)),(Object)("lifetime_count"));
 //BA.debugLineNum = 671;BA.debugLine="Dim strTimestamp As String";
_strtimestamp = "";
 //BA.debugLineNum = 672;BA.debugLine="strTimestamp = ConvertDateTime(updated_at)";
_strtimestamp = _convertdatetime(_updated_at);
 //BA.debugLineNum = 673;BA.debugLine="lblStatus.Text = \"Last updated: \" & strTimestamp";
_lblstatus.setText("Last updated: "+_strtimestamp);
 //BA.debugLineNum = 674;BA.debugLine="If clv = clvDriveway Then";
if ((_clv).equals(_clvdriveway)) { 
 //BA.debugLineNum = 675;BA.debugLine="lblDriveway.Text = \"Driveway \" & strTimestamp";
_lbldriveway.setText("Driveway "+_strtimestamp);
 }else if((_clv).equals(_clvfrontdoor)) { 
 //BA.debugLineNum = 677;BA.debugLine="lblFrontDoor.Text = \"Front Door \" & strTimestam";
_lblfrontdoor.setText("Front Door "+_strtimestamp);
 }else if((_clv).equals(_clvsideyard)) { 
 //BA.debugLineNum = 679;BA.debugLine="lblSideYard.Text = \"Side Yard \" & strTimestamp";
_lblsideyard.setText("Side Yard "+_strtimestamp);
 };
 //BA.debugLineNum = 682;BA.debugLine="For i = 0 To clv.Size-1";
{
final int step108 = 1;
final int limit108 = (int) (_clv._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit108 ;_i = _i + step108 ) {
 //BA.debugLineNum = 683;BA.debugLine="Dim item As String";
_item = "";
 //BA.debugLineNum = 684;BA.debugLine="item = clv.GetValue(i)";
_item = BA.ObjectToString(_clv._getvalue(_i));
 //BA.debugLineNum = 685;BA.debugLine="If item.Contains(\"thumbnail\") Then";
if (_item.contains("thumbnail")) { 
 //BA.debugLineNum = 686;BA.debugLine="clv.ResizeItem(i,80dip)";
_clv._resizeitem(_i,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)));
 }else if(_item.contains("_strength")) { 
 //BA.debugLineNum = 688;BA.debugLine="clv.ResizeItem(i,45dip)";
_clv._resizeitem(_i,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (45)));
 }else {
 //BA.debugLineNum = 690;BA.debugLine="clv.ResizeItem(i,35dip)";
_clv._resizeitem(_i,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (35)));
 };
 }
};
 } 
       catch (Exception e120) {
			ba.setLastException(e120); //BA.debugLineNum = 694;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 695;BA.debugLine="fx.Msgbox(MainForm,\"GetCameraInfo LastException:";
_fx.Msgbox(_mainform,"GetCameraInfo LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 };
 //BA.debugLineNum = 697;BA.debugLine="End Sub";
return "";
}
public static String  _getcommandid(String _json) throws Exception{
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
 //BA.debugLineNum = 483;BA.debugLine="Sub GetCommandID(json As String)";
 //BA.debugLineNum = 484;BA.debugLine="Try";
try { //BA.debugLineNum = 485;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 486;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 487;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 502;BA.debugLine="commandID = root.Get(\"id\")";
_commandid = BA.ObjectToString(_root.Get((Object)("id")));
 //BA.debugLineNum = 503;BA.debugLine="Log(\"commandID: \" & commandID)";
anywheresoftware.b4a.keywords.Common.Log("commandID: "+_commandid);
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 525;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 526;BA.debugLine="fx.Msgbox(MainForm,\"GetCommandID LastException:";
_fx.Msgbox(_mainform,"GetCommandID LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 };
 //BA.debugLineNum = 528;BA.debugLine="End Sub";
return "";
}
public static String  _getcommandstatus(String _json) throws Exception{
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
 //BA.debugLineNum = 530;BA.debugLine="Sub GetCommandStatus(json As String)";
 //BA.debugLineNum = 531;BA.debugLine="Try";
try { //BA.debugLineNum = 532;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 533;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 534;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 535;BA.debugLine="commandComplete = root.Get(\"complete\")";
_commandcomplete = BA.ObjectToBoolean(_root.Get((Object)("complete")));
 //BA.debugLineNum = 536;BA.debugLine="Log(\"commandComplete: \" & commandComplete)";
anywheresoftware.b4a.keywords.Common.Log("commandComplete: "+BA.ObjectToString(_commandcomplete));
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 538;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 539;BA.debugLine="fx.Msgbox(MainForm,\"GetCommandStatus LastExcepti";
_fx.Msgbox(_mainform,"GetCommandStatus LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 };
 //BA.debugLineNum = 541;BA.debugLine="End Sub";
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
anywheresoftware.b4j.objects.MediaPlayerWrapper _mp = null;
 //BA.debugLineNum = 988;BA.debugLine="Sub GetLiveView(json As String)";
 //BA.debugLineNum = 989;BA.debugLine="Try";
try { //BA.debugLineNum = 990;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 991;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 992;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 993;BA.debugLine="Dim duration As Int = root.Get(\"duration\")";
_duration = (int)(BA.ObjectToNumber(_root.Get((Object)("duration"))));
 //BA.debugLineNum = 994;BA.debugLine="Dim server As String = root.Get(\"server\")";
_server = BA.ObjectToString(_root.Get((Object)("server")));
 //BA.debugLineNum = 995;BA.debugLine="Dim device_name As String = root.Get(\"device_nam";
_device_name = BA.ObjectToString(_root.Get((Object)("device_name")));
 //BA.debugLineNum = 996;BA.debugLine="Dim network_id As Int = root.Get(\"network_id\")";
_network_id = (int)(BA.ObjectToNumber(_root.Get((Object)("network_id"))));
 //BA.debugLineNum = 997;BA.debugLine="Dim continue_interval As Int = root.Get(\"continu";
_continue_interval = (int)(BA.ObjectToNumber(_root.Get((Object)("continue_interval"))));
 //BA.debugLineNum = 998;BA.debugLine="Dim continue_warning As Int = root.Get(\"continue";
_continue_warning = (int)(BA.ObjectToNumber(_root.Get((Object)("continue_warning"))));
 //BA.debugLineNum = 999;BA.debugLine="Dim id As Int = root.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_root.Get((Object)("id"))));
 //BA.debugLineNum = 1000;BA.debugLine="Dim submit_logs As String = root.Get(\"submit_log";
_submit_logs = BA.ObjectToString(_root.Get((Object)("submit_logs")));
 //BA.debugLineNum = 1001;BA.debugLine="Dim camera_name As String = root.Get(\"camera_nam";
_camera_name = BA.ObjectToString(_root.Get((Object)("camera_name")));
 //BA.debugLineNum = 1002;BA.debugLine="Dim lv_save As String = root.Get(\"lv_save\")";
_lv_save = BA.ObjectToString(_root.Get((Object)("lv_save")));
 //BA.debugLineNum = 1003;BA.debugLine="Log(\"Liveview: \" & server)";
anywheresoftware.b4a.keywords.Common.Log("Liveview: "+_server);
 //BA.debugLineNum = 1004;BA.debugLine="Dim mp As MediaPlayer";
_mp = new anywheresoftware.b4j.objects.MediaPlayerWrapper();
 //BA.debugLineNum = 1005;BA.debugLine="mp.Initialize(\"mp\", server)";
_mp.Initialize(ba,"mp",_server);
 //BA.debugLineNum = 1006;BA.debugLine="mp.Play";
_mp.Play();
 } 
       catch (Exception e20) {
			ba.setLastException(e20); //BA.debugLineNum = 1008;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 1009;BA.debugLine="fx.Msgbox(MainForm,\"GetCommandStatus LastExcepti";
_fx.Msgbox(_mainform,"GetCommandStatus LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 };
 //BA.debugLineNum = 1011;BA.debugLine="End Sub";
return "";
}
public static String  _getresterror(String _json) throws Exception{
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
int _code = 0;
String _message = "";
 //BA.debugLineNum = 543;BA.debugLine="Sub GetRESTError(json As String) As String";
 //BA.debugLineNum = 544;BA.debugLine="Try";
try { //BA.debugLineNum = 548;BA.debugLine="If json.Contains(\"<h1>Not Found</h1>\") Then";
if (_json.contains("<h1>Not Found</h1>")) { 
 //BA.debugLineNum = 549;BA.debugLine="Return \"REST endpoint URL not found. Try again.";
if (true) return "REST endpoint URL not found. Try again.";
 }else {
 //BA.debugLineNum = 551;BA.debugLine="If json.IndexOf(\"{\") <> -1 Then";
if (_json.indexOf("{")!=-1) { 
 //BA.debugLineNum = 552;BA.debugLine="json = json.SubString(json.IndexOf(\"{\"))";
_json = _json.substring(_json.indexOf("{"));
 //BA.debugLineNum = 553;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 554;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 555;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 556;BA.debugLine="Dim code As Int = root.Get(\"code\")";
_code = (int)(BA.ObjectToNumber(_root.Get((Object)("code"))));
 //BA.debugLineNum = 557;BA.debugLine="Dim message As String = root.Get(\"message\")";
_message = BA.ObjectToString(_root.Get((Object)("message")));
 //BA.debugLineNum = 558;BA.debugLine="Log(\"Code: \" & code & \" Message: \" & message)";
anywheresoftware.b4a.keywords.Common.Log("Code: "+BA.NumberToString(_code)+" Message: "+_message);
 //BA.debugLineNum = 559;BA.debugLine="Return \"Code: \" & code & \" Message: \" & messag";
if (true) return "Code: "+BA.NumberToString(_code)+" Message: "+_message;
 }else {
 //BA.debugLineNum = 561;BA.debugLine="Return json";
if (true) return _json;
 };
 };
 } 
       catch (Exception e19) {
			ba.setLastException(e19); //BA.debugLineNum = 565;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 566;BA.debugLine="fx.Msgbox(MainForm,\"GetRESTError: \" & LastExcept";
_fx.Msgbox(_mainform,"GetRESTError: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 //BA.debugLineNum = 567;BA.debugLine="Return json";
if (true) return _json;
 };
 //BA.debugLineNum = 569;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 699;BA.debugLine="Sub GetSyncModuleInfo(json As String)";
 //BA.debugLineNum = 700;BA.debugLine="Try";
try { //BA.debugLineNum = 701;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 702;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 703;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 704;BA.debugLine="Dim syncmodule As Map = root.Get(\"syncmodule\")";
_syncmodule = new anywheresoftware.b4a.objects.collections.Map();
_syncmodule.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("syncmodule"))));
 //BA.debugLineNum = 708;BA.debugLine="Dim wifi_strength As Int = syncmodule.Get(\"wifi_";
_wifi_strength = (int)(BA.ObjectToNumber(_syncmodule.Get((Object)("wifi_strength"))));
 //BA.debugLineNum = 709;BA.debugLine="Dim os_version As String = syncmodule.Get(\"os_ve";
_os_version = BA.ObjectToString(_syncmodule.Get((Object)("os_version")));
 //BA.debugLineNum = 726;BA.debugLine="Dim fw_version As String = syncmodule.Get(\"fw_ve";
_fw_version = BA.ObjectToString(_syncmodule.Get((Object)("fw_version")));
 //BA.debugLineNum = 728;BA.debugLine="Dim status As String = syncmodule.Get(\"status\")";
_status = BA.ObjectToString(_syncmodule.Get((Object)("status")));
 //BA.debugLineNum = 729;BA.debugLine="lblSyncModule.Text = \"Sync Module is \" & status";
_lblsyncmodule.setText("Sync Module is "+_status+anywheresoftware.b4a.keywords.Common.CRLF+"Wifi Strength: "+BA.NumberToString(_wifi_strength)+" bars"+anywheresoftware.b4a.keywords.Common.CRLF+"Firmware version: "+_fw_version+anywheresoftware.b4a.keywords.Common.CRLF+"OS version: "+_os_version);
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 731;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 732;BA.debugLine="fx.Msgbox(MainForm,\"GetSyncModuleInfo LastExcept";
_fx.Msgbox(_mainform,"GetSyncModuleInfo LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 };
 //BA.debugLineNum = 734;BA.debugLine="End Sub";
return "";
}
public static String  _getuserinfo(String _json) throws Exception{
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
 //BA.debugLineNum = 425;BA.debugLine="Sub GetUserInfo(json As String)";
 //BA.debugLineNum = 426;BA.debugLine="Try";
try { //BA.debugLineNum = 427;BA.debugLine="lblStatus.Text = \"Getting user information...\"";
_lblstatus.setText("Getting user information...");
 //BA.debugLineNum = 428;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 429;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 430;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 445;BA.debugLine="accountID = root.Get(\"account_id\") '88438";
_accountid = BA.ObjectToString(_root.Get((Object)("account_id")));
 //BA.debugLineNum = 446;BA.debugLine="Log(\"accountID: \" &  accountID)";
anywheresoftware.b4a.keywords.Common.Log("accountID: "+_accountid);
 } 
       catch (Exception e9) {
			ba.setLastException(e9); //BA.debugLineNum = 449;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 450;BA.debugLine="fx.Msgbox(MainForm,\"GetUserInfo LastException: \"";
_fx.Msgbox(_mainform,"GetUserInfo LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 };
 //BA.debugLineNum = 452;BA.debugLine="End Sub";
return "";
}
public static String  _ivclose_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 796;BA.debugLine="Private Sub ivClose_MouseClicked (EventData As Mou";
 //BA.debugLineNum = 797;BA.debugLine="File.Delete(File.DirApp, \"Driveway.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Driveway.jpg");
 //BA.debugLineNum = 798;BA.debugLine="File.Delete(File.DirApp, \"FrontDoor.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"FrontDoor.jpg");
 //BA.debugLineNum = 799;BA.debugLine="File.Delete(File.DirApp, \"SideYard.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"SideYard.jpg");
 //BA.debugLineNum = 800;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"screenshot.jpg");
 //BA.debugLineNum = 801;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"media.mp4");
 //BA.debugLineNum = 802;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 803;BA.debugLine="End Sub";
return "";
}
public static String  _ivdriveway_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
cloyd.blink.frmmedia _mf = null;
 //BA.debugLineNum = 935;BA.debugLine="Sub ivDriveway_MouseClicked (EventData As MouseEve";
 //BA.debugLineNum = 936;BA.debugLine="Dim mf As frmMedia";
_mf = new cloyd.blink.frmmedia();
 //BA.debugLineNum = 937;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (ba,_mainform);
 //BA.debugLineNum = 938;BA.debugLine="mf.timestamp = lblDriveway.Text";
_mf._timestamp /*String*/  = _lbldriveway.getText();
 //BA.debugLineNum = 939;BA.debugLine="mf.url=$\" 	   <h1>${lblDriveway.Text}</h1> 	   <i";
_mf._url /*String*/  = ("\n"+"	   <h1>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbldriveway.getText()))+"</h1>\n"+"	   <img src=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Driveway.jpg")))+"\"/>\n"+"	\n"+"	");
 //BA.debugLineNum = 944;BA.debugLine="mf.Show";
_mf._show /*String*/ ();
 //BA.debugLineNum = 945;BA.debugLine="Return";
if (true) return "";
 //BA.debugLineNum = 986;BA.debugLine="End Sub";
return "";
}
public static String  _ivfrontdoor_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
cloyd.blink.frmmedia _mf = null;
 //BA.debugLineNum = 1013;BA.debugLine="Sub ivFrontDoor_MouseClicked (EventData As MouseEv";
 //BA.debugLineNum = 1014;BA.debugLine="Dim mf As frmMedia";
_mf = new cloyd.blink.frmmedia();
 //BA.debugLineNum = 1015;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (ba,_mainform);
 //BA.debugLineNum = 1016;BA.debugLine="mf.timestamp = lblFrontDoor.Text";
_mf._timestamp /*String*/  = _lblfrontdoor.getText();
 //BA.debugLineNum = 1017;BA.debugLine="mf.url=$\"    <h1>${lblFrontDoor.Text}</h1>    <im";
_mf._url /*String*/  = ("\n"+"   <h1>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lblfrontdoor.getText()))+"</h1>\n"+"   <img src=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"FrontDoor.jpg")))+"\"/>\n"+"   \n"+"");
 //BA.debugLineNum = 1022;BA.debugLine="mf.Show";
_mf._show /*String*/ ();
 //BA.debugLineNum = 1023;BA.debugLine="End Sub";
return "";
}
public static String  _ivmax_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 821;BA.debugLine="Private Sub ivMax_MouseClicked (EventData As Mouse";
 //BA.debugLineNum = 823;BA.debugLine="End Sub";
return "";
}
public static String  _ivmin_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
anywheresoftware.b4j.object.JavaObject _jmf = null;
anywheresoftware.b4j.object.JavaObject _stage = null;
 //BA.debugLineNum = 841;BA.debugLine="Private Sub ivMin_MouseClicked (EventData As Mouse";
 //BA.debugLineNum = 842;BA.debugLine="Try";
try { //BA.debugLineNum = 843;BA.debugLine="Dim jmf As JavaObject = MainForm";
_jmf = new anywheresoftware.b4j.object.JavaObject();
_jmf.setObject((java.lang.Object)(_mainform));
 //BA.debugLineNum = 844;BA.debugLine="Dim stage As JavaObject = jmf.GetField(\"stage\")";
_stage = new anywheresoftware.b4j.object.JavaObject();
_stage.setObject((java.lang.Object)(_jmf.GetField("stage")));
 //BA.debugLineNum = 845;BA.debugLine="stage.RunMethod(\"setIconified\", Array As Object(";
_stage.RunMethod("setIconified",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.True)});
 } 
       catch (Exception e6) {
			ba.setLastException(e6); //BA.debugLineNum = 847;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 849;BA.debugLine="End Sub";
return "";
}
public static String  _ivsideyard_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
cloyd.blink.frmmedia _mf = null;
 //BA.debugLineNum = 1025;BA.debugLine="Sub ivSideYard_MouseClicked (EventData As MouseEve";
 //BA.debugLineNum = 1026;BA.debugLine="Dim mf As frmMedia";
_mf = new cloyd.blink.frmmedia();
 //BA.debugLineNum = 1027;BA.debugLine="mf.Initialize(MainForm)";
_mf._initialize /*String*/ (ba,_mainform);
 //BA.debugLineNum = 1028;BA.debugLine="mf.timestamp = lblSideYard.Text";
_mf._timestamp /*String*/  = _lblsideyard.getText();
 //BA.debugLineNum = 1029;BA.debugLine="mf.url=$\"    <h1>${lblSideYard.Text}</h1>    <img";
_mf._url /*String*/  = ("\n"+"   <h1>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lblsideyard.getText()))+"</h1>\n"+"   <img src=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"SideYard.jpg")))+"\"/>\n"+"   \n"+"");
 //BA.debugLineNum = 1034;BA.debugLine="mf.Show";
_mf._show /*String*/ ();
 //BA.debugLineNum = 1035;BA.debugLine="End Sub";
return "";
}
public static String  _lbtitle_mousedragged(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 776;BA.debugLine="Private Sub lbTitle_MouseDragged (EventData As Mou";
 //BA.debugLineNum = 777;BA.debugLine="Try";
try { //BA.debugLineNum = 778;BA.debugLine="If isMaximized Then Return";
if (_ismaximized) { 
if (true) return "";};
 //BA.debugLineNum = 779;BA.debugLine="Dim jo As JavaObject = EventData";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_eventdata.getObject()));
 //BA.debugLineNum = 780;BA.debugLine="MainForm.WindowLeft = jo.RunMethod(\"getScreenX\",";
_mainform.setWindowLeft((double)(BA.ObjectToNumber(_jo.RunMethod("getScreenX",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))-_xmouse);
 //BA.debugLineNum = 781;BA.debugLine="MainForm.WindowTop = jo.RunMethod(\"getScreenY\",";
_mainform.setWindowTop((double)(BA.ObjectToNumber(_jo.RunMethod("getScreenY",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))-_ymouse);
 } 
       catch (Exception e7) {
			ba.setLastException(e7); //BA.debugLineNum = 783;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 785;BA.debugLine="End Sub";
return "";
}
public static String  _lbtitle_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 787;BA.debugLine="Private Sub lbTitle_MousePressed (EventData As Mou";
 //BA.debugLineNum = 788;BA.debugLine="Try";
try { //BA.debugLineNum = 789;BA.debugLine="xMouse = EventData.X + lbTitle.Left + 15";
_xmouse = _eventdata.getX()+_lbtitle.getLeft()+15;
 //BA.debugLineNum = 790;BA.debugLine="yMouse = EventData.Y + lbTitle.Top + 15";
_ymouse = _eventdata.getY()+_lbtitle.getTop()+15;
 } 
       catch (Exception e5) {
			ba.setLastException(e5); //BA.debugLineNum = 792;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 794;BA.debugLine="End Sub";
return "";
}
public static String  _max_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 825;BA.debugLine="Private Sub Max_Entered_Event(e As Event)";
 //BA.debugLineNum = 826;BA.debugLine="Try";
try { //BA.debugLineNum = 827;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmax.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMaxEnt.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 829;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 831;BA.debugLine="End Sub";
return "";
}
public static String  _max_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 833;BA.debugLine="Private Sub Max_Exited_Event(e As Event)";
 //BA.debugLineNum = 834;BA.debugLine="Try";
try { //BA.debugLineNum = 835;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmax.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMax.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 837;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 839;BA.debugLine="End Sub";
return "";
}
public static String  _min_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 851;BA.debugLine="Private Sub Min_Entered_Event(e As Event)";
 //BA.debugLineNum = 852;BA.debugLine="Try";
try { //BA.debugLineNum = 853;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmin.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMinEnt.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 855;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 857;BA.debugLine="End Sub";
return "";
}
public static String  _min_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 859;BA.debugLine="Private Sub Min_Exited_Event(e As Event)";
 //BA.debugLineNum = 860;BA.debugLine="Try";
try { //BA.debugLineNum = 861;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmin.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMin.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 863;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 };
 //BA.debugLineNum = 865;BA.debugLine="End Sub";
return "";
}
public static long  _parseutcstring(String _utc) throws Exception{
String _df = "";
long _res = 0L;
 //BA.debugLineNum = 1139;BA.debugLine="Sub ParseUTCstring(utc As String) As Long";
 //BA.debugLineNum = 1140;BA.debugLine="Dim df As String = DateTime.DateFormat";
_df = anywheresoftware.b4a.keywords.Common.DateTime.getDateFormat();
 //BA.debugLineNum = 1141;BA.debugLine="Dim res As Long";
_res = 0L;
 //BA.debugLineNum = 1142;BA.debugLine="If utc.CharAt(10) = \"T\" Then";
if (_utc.charAt((int) (10))==BA.ObjectToChar("T")) { 
 //BA.debugLineNum = 1144;BA.debugLine="If utc.CharAt(19) = \".\" Then utc = utc.SubString";
if (_utc.charAt((int) (19))==BA.ObjectToChar(".")) { 
_utc = _utc.substring((int) (0),(int) (19))+"+0000";};
 //BA.debugLineNum = 1145;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd'T'HH:mm:ssZ\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
 }else {
 //BA.debugLineNum = 1148;BA.debugLine="DateTime.DateFormat = \"EEE MMM dd HH:mm:ss Z yyy";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("EEE MMM dd HH:mm:ss Z yyyy");
 };
 //BA.debugLineNum = 1150;BA.debugLine="Try";
try { //BA.debugLineNum = 1151;BA.debugLine="res = DateTime.DateParse(utc)";
_res = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_utc);
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 1153;BA.debugLine="res = 0";
_res = (long) (0);
 };
 //BA.debugLineNum = 1155;BA.debugLine="DateTime.DateFormat = df";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(_df);
 //BA.debugLineNum = 1156;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 1157;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 9;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 10;BA.debugLine="Private emailAddress As String = \"antimone2001@ho";
_emailaddress = "[redacted] # replace with 'examplePass' instead";
 //BA.debugLineNum = 11;BA.debugLine="Private password As String = \"[redacted] # replace with the empty string\"";
_password = "[redacted] # replace with the empty string";
 //BA.debugLineNum = 12;BA.debugLine="Private authToken As String";
_authtoken = "";
 //BA.debugLineNum = 13;BA.debugLine="Private userRegion As String";
_userregion = "";
 //BA.debugLineNum = 14;BA.debugLine="Private accountID As String";
_accountid = "";
 //BA.debugLineNum = 15;BA.debugLine="Private networkID As String";
_networkid = "";
 //BA.debugLineNum = 16;BA.debugLine="Private commandID As String";
_commandid = "";
 //BA.debugLineNum = 17;BA.debugLine="Private commandComplete As Boolean";
_commandcomplete = false;
 //BA.debugLineNum = 18;BA.debugLine="Private cameraThumbnail As String";
_camerathumbnail = "";
 //BA.debugLineNum = 19;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 20;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 21;BA.debugLine="Private lbTitle As Label 'ignore";
_lbtitle = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private xMouse, yMouse As Double";
_xmouse = 0;
_ymouse = 0;
 //BA.debugLineNum = 23;BA.debugLine="Private isMaximized As Boolean = False";
_ismaximized = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 24;BA.debugLine="Private ivClose As ImageView";
_ivclose = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private ivMax As ImageView";
_ivmax = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private ivMin As ImageView";
_ivmin = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private AtualSkin As String";
_atualskin = "";
 //BA.debugLineNum = 28;BA.debugLine="Private imgInit As String";
_imginit = "";
 //BA.debugLineNum = 29;BA.debugLine="Private isMaximized As Boolean = False";
_ismaximized = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 30;BA.debugLine="Private f_X, f_Y, f_W, f_H As Double 'ignore";
_f_x = 0;
_f_y = 0;
_f_w = 0;
_f_h = 0;
 //BA.debugLineNum = 31;BA.debugLine="Private btnDriveway As Button 'ignore";
_btndriveway = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private response As String";
_response = "";
 //BA.debugLineNum = 33;BA.debugLine="Private ivDriveway As ImageView";
_ivdriveway = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private lblStatus As Label 'ignore";
_lblstatus = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private ivFrontDoor As ImageView";
_ivfrontdoor = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private ivSideYard As ImageView";
_ivsideyard = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private lblDriveway As Label 'ignore";
_lbldriveway = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private lblFrontDoor As Label 'ignore";
_lblfrontdoor = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private lblSideYard As Label 'ignore";
_lblsideyard = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private clvDriveway As CustomListView";
_clvdriveway = new b4j.example.customlistview();
 //BA.debugLineNum = 41;BA.debugLine="Private clvFrontDoor As CustomListView";
_clvfrontdoor = new b4j.example.customlistview();
 //BA.debugLineNum = 42;BA.debugLine="Private clvSideYard As CustomListView";
_clvsideyard = new b4j.example.customlistview();
 //BA.debugLineNum = 43;BA.debugLine="Private lblSyncModule As Label 'ignore";
_lblsyncmodule = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 45;BA.debugLine="Private btnActivity As Button 'ignore";
_btnactivity = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private btnRefresh As Button 'ignore";
_btnrefresh = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
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
String _link = "";
int _i = 0;
anywheresoftware.b4a.BA.IterableList group15;
int index15;
int groupLen15;
int step69;
int limit69;

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
 //BA.debugLineNum = 191;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 83;
this.catchState = 82;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 82;
 //BA.debugLineNum = 192;BA.debugLine="Dim camera As String";
_camera = "";
 //BA.debugLineNum = 193;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 194;BA.debugLine="Dim clv As CustomListView";
_clv = new b4j.example.customlistview();
 //BA.debugLineNum = 195;BA.debugLine="Dim links As List";
_links = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 196;BA.debugLine="links = Array(\"347574\", \"236967\", \"226821\")";
_links = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("347574"),(Object)("236967"),(Object)("226821")});
 //BA.debugLineNum = 198;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia-";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/syncmodules");
 //BA.debugLineNum = 199;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 84;
return;
case 84:
//C
this.state = 4;
;
 //BA.debugLineNum = 200;BA.debugLine="GetSyncModuleInfo(response)";
_getsyncmoduleinfo(parent._response);
 //BA.debugLineNum = 202;BA.debugLine="If FirstRun= False Then";
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
 //BA.debugLineNum = 203;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
_bluriv("Driveway.jpg",parent._ivdriveway);
 //BA.debugLineNum = 204;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
_bluriv("FrontDoor.jpg",parent._ivfrontdoor);
 //BA.debugLineNum = 205;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
_bluriv("SideYard.jpg",parent._ivsideyard);
 if (true) break;
;
 //BA.debugLineNum = 208;BA.debugLine="For Each link As String In links";

case 7:
//for
this.state = 80;
group15 = _links;
index15 = 0;
groupLen15 = group15.getSize();
this.state = 85;
if (true) break;

case 85:
//C
this.state = 80;
if (index15 < groupLen15) {
this.state = 9;
_link = BA.ObjectToString(group15.Get(index15));}
if (true) break;

case 86:
//C
this.state = 85;
index15++;
if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 209;BA.debugLine="camera = link";
_camera = _link;
 //BA.debugLineNum = 211;BA.debugLine="If FirstRun Then";
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
 //BA.debugLineNum = 212;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 13:
//if
this.state = 20;
if ((_camera).equals("347574")) { 
this.state = 15;
}else if((_camera).equals("236967")) { 
this.state = 17;
}else if((_camera).equals("226821")) { 
this.state = 19;
}if (true) break;

case 15:
//C
this.state = 20;
 //BA.debugLineNum = 213;BA.debugLine="lblStatus.Text = \"Retrieving Driveway thumbna";
parent._lblstatus.setText("Retrieving Driveway thumbnail...");
 //BA.debugLineNum = 214;BA.debugLine="iv = ivDriveway";
_iv = parent._ivdriveway;
 //BA.debugLineNum = 215;BA.debugLine="clv = clvDriveway";
_clv = parent._clvdriveway;
 if (true) break;

case 17:
//C
this.state = 20;
 //BA.debugLineNum = 217;BA.debugLine="lblStatus.Text = \"Retrieving Front Door thumb";
parent._lblstatus.setText("Retrieving Front Door thumbnail...");
 //BA.debugLineNum = 218;BA.debugLine="iv = ivFrontDoor";
_iv = parent._ivfrontdoor;
 //BA.debugLineNum = 219;BA.debugLine="clv = clvFrontDoor";
_clv = parent._clvfrontdoor;
 if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 221;BA.debugLine="lblStatus.Text = \"Retrieving Side Yard thumbn";
parent._lblstatus.setText("Retrieving Side Yard thumbnail...");
 //BA.debugLineNum = 222;BA.debugLine="iv = ivSideYard";
_iv = parent._ivsideyard;
 //BA.debugLineNum = 223;BA.debugLine="clv = clvSideYard";
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
 //BA.debugLineNum = 226;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 23:
//if
this.state = 30;
if ((_camera).equals("347574")) { 
this.state = 25;
}else if((_camera).equals("236967")) { 
this.state = 27;
}else if((_camera).equals("226821")) { 
this.state = 29;
}if (true) break;

case 25:
//C
this.state = 30;
 //BA.debugLineNum = 227;BA.debugLine="lblStatus.Text = \"Capturing a new Driveway th";
parent._lblstatus.setText("Capturing a new Driveway thumbnail...");
 //BA.debugLineNum = 228;BA.debugLine="iv = ivDriveway";
_iv = parent._ivdriveway;
 //BA.debugLineNum = 229;BA.debugLine="clv = clvDriveway";
_clv = parent._clvdriveway;
 if (true) break;

case 27:
//C
this.state = 30;
 //BA.debugLineNum = 231;BA.debugLine="lblStatus.Text = \"Capturing a new Front Door";
parent._lblstatus.setText("Capturing a new Front Door thumbnail...");
 //BA.debugLineNum = 232;BA.debugLine="iv = ivFrontDoor";
_iv = parent._ivfrontdoor;
 //BA.debugLineNum = 233;BA.debugLine="clv = clvFrontDoor";
_clv = parent._clvfrontdoor;
 if (true) break;

case 29:
//C
this.state = 30;
 //BA.debugLineNum = 235;BA.debugLine="lblStatus.Text = \"Capturing a new Side Yard t";
parent._lblstatus.setText("Capturing a new Side Yard thumbnail...");
 //BA.debugLineNum = 236;BA.debugLine="iv = ivSideYard";
_iv = parent._ivsideyard;
 //BA.debugLineNum = 237;BA.debugLine="clv = clvSideYard";
_clv = parent._clvsideyard;
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;
;
 //BA.debugLineNum = 241;BA.debugLine="If FirstRun Then";

case 31:
//if
this.state = 79;
if (_firstrun) { 
this.state = 33;
}else {
this.state = 35;
}if (true) break;

case 33:
//C
this.state = 79;
 //BA.debugLineNum = 242;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedi";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera);
 //BA.debugLineNum = 243;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 87;
return;
case 87:
//C
this.state = 79;
;
 //BA.debugLineNum = 244;BA.debugLine="GetCameraInfo(response,clv)";
_getcamerainfo(parent._response,_clv);
 //BA.debugLineNum = 245;BA.debugLine="DownloadImage(\"https://rest-\" & userRegion &\".";
_downloadimage("https://rest-"+parent._userregion+".immedia-semi.com/"+parent._camerathumbnail+".jpg",_iv,_camera);
 if (true) break;

case 35:
//C
this.state = 36;
 //BA.debugLineNum = 247;BA.debugLine="RESTPost(\"https://rest-\" & userRegion &\".immed";
_restpost("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera+"/thumbnail");
 //BA.debugLineNum = 248;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 88;
return;
case 88:
//C
this.state = 36;
;
 //BA.debugLineNum = 249;BA.debugLine="If response.StartsWith(\"ERROR: \") Then";
if (true) break;

case 36:
//if
this.state = 78;
if (parent._response.startsWith("ERROR: ")) { 
this.state = 38;
}else {
this.state = 40;
}if (true) break;

case 38:
//C
this.state = 78;
 //BA.debugLineNum = 250;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 251;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 252;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 253;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 40:
//C
this.state = 41;
 //BA.debugLineNum = 255;BA.debugLine="GetCommandID(response)";
_getcommandid(parent._response);
 //BA.debugLineNum = 256;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immed";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
 //BA.debugLineNum = 257;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 89;
return;
case 89:
//C
this.state = 41;
;
 //BA.debugLineNum = 258;BA.debugLine="If response.StartsWith(\"ERROR: \") Then";
if (true) break;

case 41:
//if
this.state = 77;
if (parent._response.startsWith("ERROR: ")) { 
this.state = 43;
}else {
this.state = 45;
}if (true) break;

case 43:
//C
this.state = 77;
 //BA.debugLineNum = 259;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 260;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 261;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 262;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 45:
//C
this.state = 46;
 //BA.debugLineNum = 264;BA.debugLine="For i = 1 To 30";
if (true) break;

case 46:
//for
this.state = 63;
step69 = 1;
limit69 = (int) (30);
_i = (int) (1) ;
this.state = 90;
if (true) break;

case 90:
//C
this.state = 63;
if ((step69 > 0 && _i <= limit69) || (step69 < 0 && _i >= limit69)) this.state = 48;
if (true) break;

case 91:
//C
this.state = 90;
_i = ((int)(0 + _i + step69)) ;
if (true) break;

case 48:
//C
this.state = 49;
 //BA.debugLineNum = 265;BA.debugLine="GetCommandStatus(response)";
_getcommandstatus(parent._response);
 //BA.debugLineNum = 266;BA.debugLine="If commandComplete Then";
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
 //BA.debugLineNum = 267;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".im";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/camera/"+_camera);
 //BA.debugLineNum = 268;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 92;
return;
case 92:
//C
this.state = 62;
;
 //BA.debugLineNum = 269;BA.debugLine="GetCameraInfo(response,clv)";
_getcamerainfo(parent._response,_clv);
 //BA.debugLineNum = 270;BA.debugLine="DownloadImage(\"https://rest-\" & userRegion";
_downloadimage("https://rest-"+parent._userregion+".immedia-semi.com/"+parent._camerathumbnail+".jpg",_iv,_camera);
 //BA.debugLineNum = 271;BA.debugLine="Exit";
this.state = 63;
if (true) break;
 if (true) break;

case 53:
//C
this.state = 54;
 //BA.debugLineNum = 273;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 54:
//if
this.state = 61;
if ((_camera).equals("347574")) { 
this.state = 56;
}else if((_camera).equals("236967")) { 
this.state = 58;
}else if((_camera).equals("226821")) { 
this.state = 60;
}if (true) break;

case 56:
//C
this.state = 61;
 //BA.debugLineNum = 274;BA.debugLine="lblStatus.Text = \"Awaiting for the Drivew";
parent._lblstatus.setText("Awaiting for the Driveway thumbnail... "+BA.NumberToString(_i)+"/30");
 if (true) break;

case 58:
//C
this.state = 61;
 //BA.debugLineNum = 276;BA.debugLine="lblStatus.Text = \"Awaiting for the Front";
parent._lblstatus.setText("Awaiting for the Front Door thumbnail...  "+BA.NumberToString(_i)+"/30");
 if (true) break;

case 60:
//C
this.state = 61;
 //BA.debugLineNum = 278;BA.debugLine="lblStatus.Text = \"Awaiting for the Side Y";
parent._lblstatus.setText("Awaiting for the Side Yard thumbnail... "+BA.NumberToString(_i)+"/30");
 if (true) break;

case 61:
//C
this.state = 62;
;
 if (true) break;

case 62:
//C
this.state = 91;
;
 //BA.debugLineNum = 281;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".imm";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/network/"+parent._networkid+"/command/"+parent._commandid);
 //BA.debugLineNum = 282;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 93;
return;
case 93:
//C
this.state = 91;
;
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 284;BA.debugLine="If commandComplete = False Then";

case 63:
//if
this.state = 76;
if (parent._commandcomplete==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 65;
}else {
this.state = 75;
}if (true) break;

case 65:
//C
this.state = 66;
 //BA.debugLineNum = 285;BA.debugLine="If camera = \"347574\" Then";
if (true) break;

case 66:
//if
this.state = 73;
if ((_camera).equals("347574")) { 
this.state = 68;
}else if((_camera).equals("236967")) { 
this.state = 70;
}else if((_camera).equals("226821")) { 
this.state = 72;
}if (true) break;

case 68:
//C
this.state = 73;
 //BA.debugLineNum = 286;BA.debugLine="lblStatus.Text = \"Failed to retrieve Drive";
parent._lblstatus.setText("Failed to retrieve Driveway thumbnail...");
 if (true) break;

case 70:
//C
this.state = 73;
 //BA.debugLineNum = 289;BA.debugLine="lblStatus.Text = \"Failed to retrieve Front";
parent._lblstatus.setText("Failed to retrieve Front Door thumbnail...");
 if (true) break;

case 72:
//C
this.state = 73;
 //BA.debugLineNum = 292;BA.debugLine="lblStatus.Text = \"Failed to retrieve Side";
parent._lblstatus.setText("Failed to retrieve Side Yard thumbnail...");
 if (true) break;

case 73:
//C
this.state = 76;
;
 if (true) break;

case 75:
//C
this.state = 76;
 if (true) break;

case 76:
//C
this.state = 77;
;
 if (true) break;

case 77:
//C
this.state = 78;
;
 if (true) break;

case 78:
//C
this.state = 79;
;
 if (true) break;

case 79:
//C
this.state = 86;
;
 if (true) break;
if (true) break;

case 80:
//C
this.state = 83;
;
 //BA.debugLineNum = 301;BA.debugLine="lblStatus.Text = \"Ready\"";
parent._lblstatus.setText("Ready");
 if (true) break;

case 82:
//C
this.state = 83;
this.catchState = 0;
 //BA.debugLineNum = 303;BA.debugLine="Log(\"RefreshCamera LastException: \" & LastExcept";
anywheresoftware.b4a.keywords.Common.Log("RefreshCamera LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 304;BA.debugLine="fx.Msgbox(MainForm,\"RefreshCamera LastException:";
parent._fx.Msgbox(parent._mainform,"RefreshCamera LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),parent._mainform.getTitle());
 if (true) break;
if (true) break;

case 83:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 306;BA.debugLine="btnDriveway.Enabled = True";
parent._btndriveway.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 307;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 308;BA.debugLine="btnActivity.Enabled = True";
parent._btnactivity.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
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
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 149;BA.debugLine="Try";
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
 //BA.debugLineNum = 150;BA.debugLine="lblStatus.Text = \"Authenticating...\"";
parent._lblstatus.setText("Authenticating...");
 //BA.debugLineNum = 151;BA.debugLine="Dim jobLogin As HttpJob";
_joblogin = new cloyd.blink.httpjob();
 //BA.debugLineNum = 152;BA.debugLine="jobLogin.Initialize(\"\", Me)";
_joblogin._initialize /*String*/ (ba,"",main.getObject());
 //BA.debugLineNum = 153;BA.debugLine="jobLogin.PostString(\"https://rest.prod.immedia-s";
_joblogin._poststring /*String*/ ("https://rest.prod.immedia-semi.com/login","email="+parent._emailaddress+"&password="+parent._password);
 //BA.debugLineNum = 154;BA.debugLine="jobLogin.GetRequest.SetContentType(\"application/";
_joblogin._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/x-www-form-urlencoded");
 //BA.debugLineNum = 155;BA.debugLine="Wait For (jobLogin) JobDone(jobLogin As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, this, (Object)(_joblogin));
this.state = 25;
return;
case 25:
//C
this.state = 4;
_joblogin = (cloyd.blink.httpjob) result[0];
;
 //BA.debugLineNum = 156;BA.debugLine="If jobLogin.Success Then";
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
 //BA.debugLineNum = 157;BA.debugLine="lblStatus.Text = \"Successfully logged in to the";
parent._lblstatus.setText("Successfully logged in to the Blink server...");
 //BA.debugLineNum = 159;BA.debugLine="GetAuthInfo(jobLogin.GetString)";
_getauthinfo(_joblogin._getstring /*String*/ ());
 //BA.debugLineNum = 161;BA.debugLine="RESTGet(\"https://rest-\" & userRegion & \".immedi";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/user");
 //BA.debugLineNum = 162;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 26;
return;
case 26:
//C
this.state = 7;
;
 //BA.debugLineNum = 163;BA.debugLine="If response.StartsWith(\"ERROR: \") Then";
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
 //BA.debugLineNum = 164;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 166;BA.debugLine="lblStatus.Text = \"AuthToken acquired...\"";
parent._lblstatus.setText("AuthToken acquired...");
 //BA.debugLineNum = 167;BA.debugLine="GetUserInfo(response)";
_getuserinfo(parent._response);
 if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 170;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia";
_restget("https://rest-"+parent._userregion+".immedia-semi.com/api/v1/camera/usage");
 //BA.debugLineNum = 171;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 27;
return;
case 27:
//C
this.state = 13;
;
 //BA.debugLineNum = 172;BA.debugLine="If response.StartsWith(\"ERROR: \") Then";
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
 //BA.debugLineNum = 173;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 175;BA.debugLine="GetAllCameras(response)";
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
 //BA.debugLineNum = 178;BA.debugLine="lblStatus.Text = GetRESTError(jobLogin.ErrorMes";
parent._lblstatus.setText(_getresterror(_joblogin._errormessage /*String*/ ));
 //BA.debugLineNum = 179;BA.debugLine="Log(\"RequestAuthToken error: \" & jobLogin.Error";
anywheresoftware.b4a.keywords.Common.Log("RequestAuthToken error: "+_joblogin._errormessage /*String*/ );
 //BA.debugLineNum = 180;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 21:
//C
this.state = 24;
;
 //BA.debugLineNum = 182;BA.debugLine="jobLogin.Release";
_joblogin._release /*String*/ ();
 //BA.debugLineNum = 183;BA.debugLine="RefreshCameras(True)";
_refreshcameras(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
 //BA.debugLineNum = 185;BA.debugLine="fx.Msgbox(MainForm,\"RequestAuthToken LastExcepti";
parent._fx.Msgbox(parent._mainform,"RequestAuthToken LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),parent._mainform.getTitle());
 //BA.debugLineNum = 186;BA.debugLine="Log(\"RequestAuthToken LastException: \" & LastExc";
anywheresoftware.b4a.keywords.Common.Log("RequestAuthToken LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 312;BA.debugLine="Try";
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
 //BA.debugLineNum = 313;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
 //BA.debugLineNum = 314;BA.debugLine="response = \"\"";
parent._response = "";
 //BA.debugLineNum = 315;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no";
_j._initialize /*String*/ (ba,"",main.getObject());
 //BA.debugLineNum = 316;BA.debugLine="j.Download(url)";
_j._download /*String*/ (_url);
 //BA.debugLineNum = 317;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("TOKEN_AUTH",parent._authtoken);
 //BA.debugLineNum = 318;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[0];
;
 //BA.debugLineNum = 319;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 320;BA.debugLine="response = j.GetString";
parent._response = _j._getstring /*String*/ ();
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 322;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
parent._response = "ERROR: "+_j._errormessage /*String*/ ;
 //BA.debugLineNum = 323;BA.debugLine="lblStatus.Text = GetRESTError(j.ErrorMessage)";
parent._lblstatus.setText(_getresterror(_j._errormessage /*String*/ ));
 if (true) break;

case 9:
//C
this.state = 12;
;
 //BA.debugLineNum = 325;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 //BA.debugLineNum = 327;BA.debugLine="response = \"ERROR: \" & LastException";
parent._response = "ERROR: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba));
 //BA.debugLineNum = 328;BA.debugLine="Log(\"RESTGet LastException: \" & LastException)";
anywheresoftware.b4a.keywords.Common.Log("RESTGet LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 329;BA.debugLine="fx.Msgbox(MainForm,\"RESTGet LastException: \" & L";
parent._fx.Msgbox(parent._mainform,"RESTGet LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),parent._mainform.getTitle());
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 331;BA.debugLine="Log(\"URL: \" & url)";
anywheresoftware.b4a.keywords.Common.Log("URL: "+_url);
 //BA.debugLineNum = 332;BA.debugLine="Log(\"Response: \" & response)";
anywheresoftware.b4a.keywords.Common.Log("Response: "+parent._response);
 //BA.debugLineNum = 333;BA.debugLine="Return(response)";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)((parent._response)));return;};
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 337;BA.debugLine="Try";
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
 //BA.debugLineNum = 338;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
 //BA.debugLineNum = 339;BA.debugLine="response = \"\"";
parent._response = "";
 //BA.debugLineNum = 340;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no";
_j._initialize /*String*/ (ba,"",main.getObject());
 //BA.debugLineNum = 341;BA.debugLine="j.PostString(url,\"\")";
_j._poststring /*String*/ (_url,"");
 //BA.debugLineNum = 342;BA.debugLine="j.GetRequest.SetContentType(\"application/x-www-f";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/x-www-form-urlencoded");
 //BA.debugLineNum = 343;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("TOKEN_AUTH",parent._authtoken);
 //BA.debugLineNum = 344;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[0];
;
 //BA.debugLineNum = 345;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 346;BA.debugLine="response = j.GetString";
parent._response = _j._getstring /*String*/ ();
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 348;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
parent._response = "ERROR: "+_j._errormessage /*String*/ ;
 //BA.debugLineNum = 349;BA.debugLine="lblStatus.Text = GetRESTError(j.ErrorMessage)";
parent._lblstatus.setText(_getresterror(_j._errormessage /*String*/ ));
 if (true) break;

case 9:
//C
this.state = 12;
;
 //BA.debugLineNum = 351;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 //BA.debugLineNum = 353;BA.debugLine="response = \"ERROR: \" & LastException";
parent._response = "ERROR: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba));
 //BA.debugLineNum = 354;BA.debugLine="Log(\"RESTPost LastException: \" & LastException)";
anywheresoftware.b4a.keywords.Common.Log("RESTPost LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 355;BA.debugLine="fx.Msgbox(MainForm,\"RESTPost LastException: \" &";
parent._fx.Msgbox(parent._mainform,"RESTPost LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),parent._mainform.getTitle());
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 357;BA.debugLine="Log(\"URL: \" & url)";
anywheresoftware.b4a.keywords.Common.Log("URL: "+_url);
 //BA.debugLineNum = 358;BA.debugLine="Log(\"Response: \" & response)";
anywheresoftware.b4a.keywords.Common.Log("Response: "+parent._response);
 //BA.debugLineNum = 359;BA.debugLine="Return(response)";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)((parent._response)));return;};
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 1090;BA.debugLine="Private Sub SetAvg(bc As BitmapCreator, x As Int,";
 //BA.debugLineNum = 1091;BA.debugLine="Try";
try { //BA.debugLineNum = 1092;BA.debugLine="temp.Initialize";
_temp.Initialize();
 //BA.debugLineNum = 1093;BA.debugLine="For Each c As ARGBColor In clrs";
{
final b4j.example.bitmapcreator._argbcolor[] group3 = _clrs;
final int groupLen3 = group3.length
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_c = group3[index3];
 //BA.debugLineNum = 1094;BA.debugLine="temp.r = temp.r + c.r";
_temp.r = (int) (_temp.r+_c.r);
 //BA.debugLineNum = 1095;BA.debugLine="temp.g = temp.g + c.g";
_temp.g = (int) (_temp.g+_c.g);
 //BA.debugLineNum = 1096;BA.debugLine="temp.b = temp.b + c.b";
_temp.b = (int) (_temp.b+_c.b);
 }
};
 //BA.debugLineNum = 1098;BA.debugLine="temp.a = 255";
_temp.a = (int) (255);
 //BA.debugLineNum = 1099;BA.debugLine="temp.r = temp.r / clrs.Length";
_temp.r = (int) (_temp.r/(double)_clrs.length);
 //BA.debugLineNum = 1100;BA.debugLine="temp.g = temp.g / clrs.Length";
_temp.g = (int) (_temp.g/(double)_clrs.length);
 //BA.debugLineNum = 1101;BA.debugLine="temp.b = temp.b / clrs.Length";
_temp.b = (int) (_temp.b/(double)_clrs.length);
 //BA.debugLineNum = 1102;BA.debugLine="bc.SetARGB(x, y, temp)";
_bc._setargb(_x,_y,_temp);
 } 
       catch (Exception e14) {
			ba.setLastException(e14); //BA.debugLineNum = 1104;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 1105;BA.debugLine="fx.Msgbox(MainForm,\"SetAvg LastException: \" & La";
_fx.Msgbox(_mainform,"SetAvg LastException: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_mainform.getTitle());
 };
 //BA.debugLineNum = 1107;BA.debugLine="End Sub";
return "";
}
}
