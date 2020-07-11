package cloyd.blink;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (main) ","main",0,main.ba,main.mostCurrent,163);
if (RapidSub.canDelegate("application_error")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","application_error", _error, _stacktrace);}
RemoteObject _shl = RemoteObject.declareNull("anywheresoftware.b4j.objects.Shell");
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 163;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(4);
 BA.debugLineNum = 164;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(8);
main._btndriveway.runMethod(true,"setEnabled",main.__c.getField(true,"True"));
 BA.debugLineNum = 165;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(16);
main._btnrefresh.runMethod(true,"setEnabled",main.__c.getField(true,"True"));
 BA.debugLineNum = 166;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(32);
main._btnactivity.runMethod(true,"setEnabled",main.__c.getField(true,"True"));
 BA.debugLineNum = 167;BA.debugLine="btnDrivewayNewClip.Enabled = True";
Debug.ShouldStop(64);
main._btndrivewaynewclip.runMethod(true,"setEnabled",main.__c.getField(true,"True"));
 BA.debugLineNum = 168;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
Debug.ShouldStop(128);
main._btnfrontdoornewclip.runMethod(true,"setEnabled",main.__c.getField(true,"True"));
 BA.debugLineNum = 169;BA.debugLine="btnSideYardNewClip.Enabled = True";
Debug.ShouldStop(256);
main._btnsideyardnewclip.runMethod(true,"setEnabled",main.__c.getField(true,"True"));
 BA.debugLineNum = 170;BA.debugLine="fx.msgbox2(MainForm,Error.Message,MainForm.Title,";
Debug.ShouldStop(512);
main._fx.runMethodAndSync(true,"Msgbox2",(Object)(main._mainform),(Object)(_error.runMethod(true,"getMessage")),(Object)(main._mainform.runMethod(true,"getTitle")),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(main._fx.getField(false,"MSGBOX_ERROR")));
 BA.debugLineNum = 171;BA.debugLine="Dim shl As Shell";
Debug.ShouldStop(1024);
_shl = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");Debug.locals.put("shl", _shl);
 BA.debugLineNum = 172;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 173;BA.debugLine="shl.Initialize(\"shl\", \"java.exe\" , Array As Stri";
Debug.ShouldStop(4096);
_shl.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("shl")),(Object)(BA.ObjectToString("java.exe")),(Object)(main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("-jar"),RemoteObject.createImmutable("Blink4Java.jar")})))));
 BA.debugLineNum = 174;BA.debugLine="shl.WorkingDirectory = File.DirApp";
Debug.ShouldStop(8192);
_shl.runMethod(true,"setWorkingDirectory",main.__c.getField(false,"File").runMethod(true,"getDirApp"));
 BA.debugLineNum = 175;BA.debugLine="shl.Run(-1)";
Debug.ShouldStop(16384);
_shl.runVoidMethod ("Run",main.ba,(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e14.toString()); BA.debugLineNum = 177;BA.debugLine="Log(\"Application_Error: \" & LastException.Messag";
Debug.ShouldStop(65536);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Application_Error: "),main.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 180;BA.debugLine="Return False ' handled";
Debug.ShouldStop(524288);
if (true) return main.__c.getField(true,"False");
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,73);
if (RapidSub.canDelegate("appstart")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
RemoteObject _skintemp = RemoteObject.createImmutable("");
RemoteObject _skindefault = RemoteObject.createImmutable("");
RemoteObject _obj = RemoteObject.declareNull("anywheresoftware.b4j.agraham.reflection.Reflection");
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 73;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 75;BA.debugLine="Dim skinTemp As String";
Debug.ShouldStop(1024);
_skintemp = RemoteObject.createImmutable("");Debug.locals.put("skinTemp", _skintemp);
 BA.debugLineNum = 76;BA.debugLine="Dim skinDefault As String";
Debug.ShouldStop(2048);
_skindefault = RemoteObject.createImmutable("");Debug.locals.put("skinDefault", _skindefault);
 BA.debugLineNum = 78;BA.debugLine="If File.Exists(File.DirApp, \"skin.ini\") Then";
Debug.ShouldStop(8192);
if (main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("skin.ini"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 79;BA.debugLine="skinTemp = File.ReadString(File.DirApp, \"skin.i";
Debug.ShouldStop(16384);
_skintemp = main.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("skin.ini")));Debug.locals.put("skinTemp", _skintemp);
 }else {
 BA.debugLineNum = 82;BA.debugLine="skinTemp = \"vdSk03\"";
Debug.ShouldStop(131072);
_skintemp = BA.ObjectToString("vdSk03");Debug.locals.put("skinTemp", _skintemp);
 };
 BA.debugLineNum = 85;BA.debugLine="If skinTemp = \"\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString(""))) { 
 BA.debugLineNum = 86;BA.debugLine="skinDefault = \"vdSk03\"";
Debug.ShouldStop(2097152);
_skindefault = BA.ObjectToString("vdSk03");Debug.locals.put("skinDefault", _skindefault);
 }else {
 BA.debugLineNum = 88;BA.debugLine="If skinTemp = \"vdSk01\" Or skinTemp = \"vdSk02\" O";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString("vdSk01")) || RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString("vdSk02")) || RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString("vdSk03")) || RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString("vdSk04")) || RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString("vdSk05")) || RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString("vdSk06"))) { 
 BA.debugLineNum = 89;BA.debugLine="skinDefault = skinTemp";
Debug.ShouldStop(16777216);
_skindefault = _skintemp;Debug.locals.put("skinDefault", _skindefault);
 }else {
 BA.debugLineNum = 91;BA.debugLine="skinDefault = \"vdSk03\"";
Debug.ShouldStop(67108864);
_skindefault = BA.ObjectToString("vdSk03");Debug.locals.put("skinDefault", _skindefault);
 };
 };
 BA.debugLineNum = 95;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(1073741824);
main._mainform = _form1;
 BA.debugLineNum = 96;BA.debugLine="MainForm.SetFormStyle(\"TRANSPARENT\")";
Debug.ShouldStop(-2147483648);
main._mainform.runVoidMethod ("SetFormStyle",(Object)(RemoteObject.createImmutable("TRANSPARENT")));
 BA.debugLineNum = 97;BA.debugLine="MainForm.RootPane.LoadLayout(skinDefault) 'Load";
Debug.ShouldStop(1);
main._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(_skindefault));
 BA.debugLineNum = 98;BA.debugLine="AtualSkin = skinDefault";
Debug.ShouldStop(2);
main._atualskin = _skindefault;
 BA.debugLineNum = 99;BA.debugLine="MainForm.BackColor = fx.Colors.Transparent";
Debug.ShouldStop(4);
main._mainform.runMethod(false,"setBackColor",main._fx.getField(false,"Colors").getField(false,"Transparent"));
 BA.debugLineNum = 100;BA.debugLine="MainForm.RootPane.Style = \"-fx-background-color:";
Debug.ShouldStop(8);
main._mainform.runMethod(false,"getRootPane").runMethod(true,"setStyle",BA.ObjectToString("-fx-background-color:transparent;-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 1.0) , 15,0, 0.0, 0.0);"));
 BA.debugLineNum = 101;BA.debugLine="MainForm.Resizable = True";
Debug.ShouldStop(16);
main._mainform.runMethod(true,"setResizable",main.__c.getField(true,"True"));
 BA.debugLineNum = 102;BA.debugLine="MainForm.Icon = fx.LoadImage(File.DirAssets, \"ho";
Debug.ShouldStop(32);
main._mainform.runMethod(false,"setIcon",(main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("home.png"))).getObject()));
 BA.debugLineNum = 103;BA.debugLine="MainForm.Title = \"Catanaoan Blink XT2 Cameras v1";
Debug.ShouldStop(64);
main._mainform.runMethod(true,"setTitle",BA.ObjectToString("Catanaoan Blink XT2 Cameras v1.0"));
 BA.debugLineNum = 104;BA.debugLine="lbTitle.MouseCursor = fx.Cursors.MOVE";
Debug.ShouldStop(128);
main._lbtitle.runMethod(false,"setMouseCursor",main._fx.getField(false,"Cursors").getField(false,"MOVE"));
 BA.debugLineNum = 105;BA.debugLine="lbTitle.Text = \"Catanaoan Blink XT2 Cameras v1.0";
Debug.ShouldStop(256);
main._lbtitle.runMethod(true,"setText",BA.ObjectToString("Catanaoan Blink XT2 Cameras v1.0"));
 BA.debugLineNum = 106;BA.debugLine="Dim Obj As Reflector";
Debug.ShouldStop(512);
_obj = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 107;BA.debugLine="Obj.Target = ivClose";
Debug.ShouldStop(1024);
_obj.setField ("Target",(main._ivclose.getObject()));
 BA.debugLineNum = 108;BA.debugLine="Obj.AddEventHandler2(\"Close_Entered\", \"onMouseEn";
Debug.ShouldStop(2048);
_obj.runVoidMethod ("AddEventHandler2",main.ba,(Object)(BA.ObjectToString("Close_Entered")),(Object)(RemoteObject.createImmutable("onMouseEnteredProperty")));
 BA.debugLineNum = 109;BA.debugLine="Obj.AddEventHandler2(\"Close_Exited\", \"onMouseExi";
Debug.ShouldStop(4096);
_obj.runVoidMethod ("AddEventHandler2",main.ba,(Object)(BA.ObjectToString("Close_Exited")),(Object)(RemoteObject.createImmutable("onMouseExitedProperty")));
 BA.debugLineNum = 110;BA.debugLine="Dim Obj As Reflector";
Debug.ShouldStop(8192);
_obj = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 111;BA.debugLine="Obj.Target = ivMax";
Debug.ShouldStop(16384);
_obj.setField ("Target",(main._ivmax.getObject()));
 BA.debugLineNum = 112;BA.debugLine="Obj.AddEventHandler2(\"Max_Entered\", \"onMouseEnte";
Debug.ShouldStop(32768);
_obj.runVoidMethod ("AddEventHandler2",main.ba,(Object)(BA.ObjectToString("Max_Entered")),(Object)(RemoteObject.createImmutable("onMouseEnteredProperty")));
 BA.debugLineNum = 113;BA.debugLine="Obj.AddEventHandler2(\"Max_Exited\", \"onMouseExite";
Debug.ShouldStop(65536);
_obj.runVoidMethod ("AddEventHandler2",main.ba,(Object)(BA.ObjectToString("Max_Exited")),(Object)(RemoteObject.createImmutable("onMouseExitedProperty")));
 BA.debugLineNum = 114;BA.debugLine="Dim Obj As Reflector";
Debug.ShouldStop(131072);
_obj = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 115;BA.debugLine="Obj.Target = ivMin";
Debug.ShouldStop(262144);
_obj.setField ("Target",(main._ivmin.getObject()));
 BA.debugLineNum = 116;BA.debugLine="Obj.AddEventHandler2(\"Min_Entered\", \"onMouseEnte";
Debug.ShouldStop(524288);
_obj.runVoidMethod ("AddEventHandler2",main.ba,(Object)(BA.ObjectToString("Min_Entered")),(Object)(RemoteObject.createImmutable("onMouseEnteredProperty")));
 BA.debugLineNum = 117;BA.debugLine="Obj.AddEventHandler2(\"Min_Exited\", \"onMouseExite";
Debug.ShouldStop(1048576);
_obj.runVoidMethod ("AddEventHandler2",main.ba,(Object)(BA.ObjectToString("Min_Exited")),(Object)(RemoteObject.createImmutable("onMouseExitedProperty")));
 BA.debugLineNum = 118;BA.debugLine="imgInit = AtualSkin.SubString(2).ToLowerCase";
Debug.ShouldStop(2097152);
main._imginit = main._atualskin.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"toLowerCase");
 BA.debugLineNum = 119;BA.debugLine="Get_css";
Debug.ShouldStop(4194304);
_get_css();
 BA.debugLineNum = 124;BA.debugLine="MainForm.WindowLeft = CheckMonitor.MaxX	- MainFo";
Debug.ShouldStop(134217728);
main._mainform.runMethod(true,"setWindowLeft",RemoteObject.solve(new RemoteObject[] {_checkmonitor().runMethod(true,"getMaxX"),main._mainform.runMethod(true,"getWidth"),main.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "--",2, 0));
 BA.debugLineNum = 125;BA.debugLine="MainForm.WindowTop = CheckMonitor.MaxY - MainFor";
Debug.ShouldStop(268435456);
main._mainform.runMethod(true,"setWindowTop",RemoteObject.solve(new RemoteObject[] {_checkmonitor().runMethod(true,"getMaxY"),main._mainform.runMethod(true,"getHeight"),main.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "--",2, 0));
 BA.debugLineNum = 127;BA.debugLine="lblStatus.TextColor = fx.Colors.White";
Debug.ShouldStop(1073741824);
main._lblstatus.runMethod(false,"setTextColor",main._fx.getField(false,"Colors").getField(false,"White"));
 BA.debugLineNum = 128;BA.debugLine="MainForm.Show";
Debug.ShouldStop(-2147483648);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 130;BA.debugLine="dialog.Initialize(MainForm.RootPane)";
Debug.ShouldStop(2);
main._dialog.runClassMethod (cloyd.blink.b4xdialog.class, "_initialize" /*RemoteObject*/ ,main.ba,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), main._mainform.runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 131;BA.debugLine="dialog.Title = \"Smart Home Monitor\"";
Debug.ShouldStop(4);
main._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Smart Home Monitor")));
 BA.debugLineNum = 133;BA.debugLine="If File.Exists(File.DirApp, \"account.txt\") Then";
Debug.ShouldStop(16);
if (main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("account.txt"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 134;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(32);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List1", _list1);
 BA.debugLineNum = 135;BA.debugLine="List1 = File.ReadList(File.DirApp, \"account.txt";
Debug.ShouldStop(64);
_list1 = main.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("account.txt")));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 136;BA.debugLine="For i = 0 To List1.Size - 1";
Debug.ShouldStop(128);
{
final int step52 = 1;
final int limit52 = RemoteObject.solve(new RemoteObject[] {_list1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step52 > 0 && _i <= limit52) || (step52 < 0 && _i >= limit52) ;_i = ((int)(0 + _i + step52))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 137;BA.debugLine="If i = 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(int.class, 0))) { 
 BA.debugLineNum = 138;BA.debugLine="emailAddress = List1.Get(i)";
Debug.ShouldStop(512);
main._emailaddress = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 }else 
{ BA.debugLineNum = 139;BA.debugLine="Else if i = 1 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(int.class, 1))) { 
 BA.debugLineNum = 140;BA.debugLine="password = List1.Get(i)";
Debug.ShouldStop(2048);
main._password = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 }}
;
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 144;BA.debugLine="fx.Msgbox2(MainForm,\"Account.txt not found!\", \"";
Debug.ShouldStop(32768);
main._fx.runMethodAndSync(true,"Msgbox2",(Object)(main._mainform),(Object)(BA.ObjectToString("Account.txt not found!")),(Object)(BA.ObjectToString("Catanaoan Blink XT2 Cameras v1.0")),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(main._fx.getField(false,"MSGBOX_ERROR")));
 BA.debugLineNum = 145;BA.debugLine="ExitApplication";
Debug.ShouldStop(65536);
main.__c.runVoidMethod ("ExitApplication");
 };
 BA.debugLineNum = 148;BA.debugLine="btnDriveway.Enabled = False";
Debug.ShouldStop(524288);
main._btndriveway.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 149;BA.debugLine="btnRefresh.Enabled = False";
Debug.ShouldStop(1048576);
main._btnrefresh.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 150;BA.debugLine="btnActivity.Enabled = False";
Debug.ShouldStop(2097152);
main._btnactivity.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 151;BA.debugLine="btnDrivewayNewClip.Enabled = False";
Debug.ShouldStop(4194304);
main._btndrivewaynewclip.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 152;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
Debug.ShouldStop(8388608);
main._btnfrontdoornewclip.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 153;BA.debugLine="btnSideYardNewClip.Enabled = False";
Debug.ShouldStop(16777216);
main._btnsideyardnewclip.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 154;BA.debugLine="badger1.Initialize";
Debug.ShouldStop(33554432);
main._badger1.runClassMethod (cloyd.blink.badger.class, "_initialize" /*RemoteObject*/ ,main.ba);
 BA.debugLineNum = 155;BA.debugLine="RequestAuthToken";
Debug.ShouldStop(67108864);
_requestauthtoken();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e72) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e72.toString()); BA.debugLineNum = 157;BA.debugLine="Log(LastException)";
Debug.ShouldStop(268435456);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _blur(RemoteObject _bmp) throws Exception{
try {
		Debug.PushSubsStack("Blur (main) ","main",0,main.ba,main.mostCurrent,1503);
if (RapidSub.canDelegate("blur")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","blur", _bmp);}
RemoteObject _bc = RemoteObject.declareNull("b4j.example.bitmapcreator");
RemoteObject _reducescale = RemoteObject.createImmutable(0);
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _clrs = null;
RemoteObject _temp = RemoteObject.declareNull("b4j.example.bitmapcreator._argbcolor");
RemoteObject _m = RemoteObject.createImmutable(0);
int _steps = 0;
int _y = 0;
int _x = 0;
Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 1503;BA.debugLine="Private Sub Blur (bmp As B4XBitmap) As B4XBitmap";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1504;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 1505;BA.debugLine="Dim bc As BitmapCreator";
Debug.ShouldStop(1);
_bc = RemoteObject.createNew ("b4j.example.bitmapcreator");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 1506;BA.debugLine="Dim ReduceScale As Int = 2";
Debug.ShouldStop(2);
_reducescale = BA.numberCast(int.class, 2);Debug.locals.put("ReduceScale", _reducescale);Debug.locals.put("ReduceScale", _reducescale);
 BA.debugLineNum = 1507;BA.debugLine="bc.Initialize(bmp.Width / ReduceScale / bmp.Scal";
Debug.ShouldStop(4);
_bc.runVoidMethod ("_initialize",main.ba,(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),_reducescale,_bmp.runMethod(true,"getScale")}, "//",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getHeight"),_reducescale,_bmp.runMethod(true,"getScale")}, "//",0, 0))));
 BA.debugLineNum = 1508;BA.debugLine="bc.CopyPixelsFromBitmap(bmp)";
Debug.ShouldStop(8);
_bc.runVoidMethod ("_copypixelsfrombitmap",(Object)(_bmp));
 BA.debugLineNum = 1509;BA.debugLine="Dim count As Int = 3";
Debug.ShouldStop(16);
_count = BA.numberCast(int.class, 3);Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 1510;BA.debugLine="Dim clrs(3) As ARGBColor";
Debug.ShouldStop(32);
_clrs = RemoteObject.createNewArray ("b4j.example.bitmapcreator._argbcolor", new int[] {3}, new Object[]{});Debug.locals.put("clrs", _clrs);
 BA.debugLineNum = 1511;BA.debugLine="Dim temp As ARGBColor";
Debug.ShouldStop(64);
_temp = RemoteObject.createNew ("b4j.example.bitmapcreator._argbcolor");Debug.locals.put("temp", _temp);
 BA.debugLineNum = 1512;BA.debugLine="Dim m As Int";
Debug.ShouldStop(128);
_m = RemoteObject.createImmutable(0);Debug.locals.put("m", _m);
 BA.debugLineNum = 1513;BA.debugLine="For steps = 1 To count";
Debug.ShouldStop(256);
{
final int step10 = 1;
final int limit10 = _count.<Integer>get().intValue();
_steps = 1 ;
for (;(step10 > 0 && _steps <= limit10) || (step10 < 0 && _steps >= limit10) ;_steps = ((int)(0 + _steps + step10))  ) {
Debug.locals.put("steps", _steps);
 BA.debugLineNum = 1514;BA.debugLine="For y = 0 To bc.mHeight - 1";
Debug.ShouldStop(512);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mheight"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_y = 0 ;
for (;(step11 > 0 && _y <= limit11) || (step11 < 0 && _y >= limit11) ;_y = ((int)(0 + _y + step11))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 1515;BA.debugLine="For x = 0 To 2";
Debug.ShouldStop(1024);
{
final int step12 = 1;
final int limit12 = 2;
_x = 0 ;
for (;(step12 > 0 && _x <= limit12) || (step12 < 0 && _x >= limit12) ;_x = ((int)(0 + _x + step12))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 1516;BA.debugLine="bc.GetARGB(x, y, clrs(x))";
Debug.ShouldStop(2048);
_bc.runVoidMethod ("_getargb",(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(_clrs.getArrayElement(false,BA.numberCast(int.class, _x))));
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 1518;BA.debugLine="SetAvg(bc, 1, y, clrs, temp)";
Debug.ShouldStop(8192);
_setavg(_bc,BA.numberCast(int.class, 1),BA.numberCast(int.class, _y),_clrs,_temp);
 BA.debugLineNum = 1519;BA.debugLine="m = 0";
Debug.ShouldStop(16384);
_m = BA.numberCast(int.class, 0);Debug.locals.put("m", _m);
 BA.debugLineNum = 1520;BA.debugLine="For x = 2 To bc.mWidth - 2";
Debug.ShouldStop(32768);
{
final int step17 = 1;
final int limit17 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mwidth"),RemoteObject.createImmutable(2)}, "-",1, 1).<Integer>get().intValue();
_x = 2 ;
for (;(step17 > 0 && _x <= limit17) || (step17 < 0 && _x >= limit17) ;_x = ((int)(0 + _x + step17))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 1521;BA.debugLine="bc.GetARGB(x + 1, y, clrs(m))";
Debug.ShouldStop(65536);
_bc.runVoidMethod ("_getargb",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_x),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(BA.numberCast(int.class, _y)),(Object)(_clrs.getArrayElement(false,_m)));
 BA.debugLineNum = 1522;BA.debugLine="m = (m + 1) Mod clrs.Length";
Debug.ShouldStop(131072);
_m = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_m,RemoteObject.createImmutable(1)}, "+",1, 1)),_clrs.getField(true,"length")}, "%",0, 1);Debug.locals.put("m", _m);
 BA.debugLineNum = 1523;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
Debug.ShouldStop(262144);
_setavg(_bc,BA.numberCast(int.class, _x),BA.numberCast(int.class, _y),_clrs,_temp);
 }
}Debug.locals.put("x", _x);
;
 }
}Debug.locals.put("y", _y);
;
 BA.debugLineNum = 1526;BA.debugLine="For x = 0 To bc.mWidth - 1";
Debug.ShouldStop(2097152);
{
final int step23 = 1;
final int limit23 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mwidth"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = 0 ;
for (;(step23 > 0 && _x <= limit23) || (step23 < 0 && _x >= limit23) ;_x = ((int)(0 + _x + step23))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 1527;BA.debugLine="For y = 0 To 2";
Debug.ShouldStop(4194304);
{
final int step24 = 1;
final int limit24 = 2;
_y = 0 ;
for (;(step24 > 0 && _y <= limit24) || (step24 < 0 && _y >= limit24) ;_y = ((int)(0 + _y + step24))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 1528;BA.debugLine="bc.GetARGB(x, y, clrs(y))";
Debug.ShouldStop(8388608);
_bc.runVoidMethod ("_getargb",(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(_clrs.getArrayElement(false,BA.numberCast(int.class, _y))));
 }
}Debug.locals.put("y", _y);
;
 BA.debugLineNum = 1530;BA.debugLine="SetAvg(bc, x, 1, clrs, temp)";
Debug.ShouldStop(33554432);
_setavg(_bc,BA.numberCast(int.class, _x),BA.numberCast(int.class, 1),_clrs,_temp);
 BA.debugLineNum = 1531;BA.debugLine="m = 0";
Debug.ShouldStop(67108864);
_m = BA.numberCast(int.class, 0);Debug.locals.put("m", _m);
 BA.debugLineNum = 1532;BA.debugLine="For y = 2 To bc.mHeight - 2";
Debug.ShouldStop(134217728);
{
final int step29 = 1;
final int limit29 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mheight"),RemoteObject.createImmutable(2)}, "-",1, 1).<Integer>get().intValue();
_y = 2 ;
for (;(step29 > 0 && _y <= limit29) || (step29 < 0 && _y >= limit29) ;_y = ((int)(0 + _y + step29))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 1533;BA.debugLine="bc.GetARGB(x, y + 1, clrs(m))";
Debug.ShouldStop(268435456);
_bc.runVoidMethod ("_getargb",(Object)(BA.numberCast(int.class, _x)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_y),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_clrs.getArrayElement(false,_m)));
 BA.debugLineNum = 1534;BA.debugLine="m = (m + 1) Mod clrs.Length";
Debug.ShouldStop(536870912);
_m = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_m,RemoteObject.createImmutable(1)}, "+",1, 1)),_clrs.getField(true,"length")}, "%",0, 1);Debug.locals.put("m", _m);
 BA.debugLineNum = 1535;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
Debug.ShouldStop(1073741824);
_setavg(_bc,BA.numberCast(int.class, _x),BA.numberCast(int.class, _y),_clrs,_temp);
 }
}Debug.locals.put("y", _y);
;
 }
}Debug.locals.put("x", _x);
;
 }
}Debug.locals.put("steps", _steps);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e37) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e37.toString()); BA.debugLineNum = 1540;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 1542;BA.debugLine="Return bc.Bitmap";
Debug.ShouldStop(32);
if (true) return _bc.runMethod(false,"_getbitmap");
 BA.debugLineNum = 1543;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bluriv(RemoteObject _image,RemoteObject _iv) throws Exception{
try {
		Debug.PushSubsStack("BlurIV (main) ","main",0,main.ba,main.mostCurrent,1494);
if (RapidSub.canDelegate("bluriv")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","bluriv", _image, _iv);}
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
Debug.locals.put("image", _image);
Debug.locals.put("iv", _iv);
 BA.debugLineNum = 1494;BA.debugLine="Sub BlurIV (image As String,iv As ImageView)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1495;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 1496;BA.debugLine="Dim bmp As B4XBitmap = xui.LoadBitmapResize(File";
Debug.ShouldStop(8388608);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmp = main._xui.runMethod(false,"LoadBitmapResize",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(_image),(Object)(BA.numberCast(int.class, _iv.runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, _iv.runMethod(true,"getHeight"))),(Object)(main.__c.getField(true,"True")));Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 1497;BA.debugLine="iv.SetImage(Blur(bmp))";
Debug.ShouldStop(16777216);
_iv.runVoidMethod ("SetImage",(Object)((_blur(_bmp).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e5.toString()); BA.debugLineNum = 1499;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 1501;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnactivity_click() throws Exception{
try {
		Debug.PushSubsStack("btnActivity_Click (main) ","main",0,main.ba,main.mostCurrent,1564);
if (RapidSub.canDelegate("btnactivity_click")) { cloyd.blink.main.remoteMe.runUserSub(false, "main","btnactivity_click"); return;}
ResumableSub_btnActivity_Click rsub = new ResumableSub_btnActivity_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnActivity_Click extends BA.ResumableSub {
public ResumableSub_btnActivity_Click(cloyd.blink.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
cloyd.blink.main parent;
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.declareNull("Object");
RemoteObject _mf = RemoteObject.declareNull("cloyd.blink.frmactivity");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnActivity_Click (main) ","main",0,main.ba,main.mostCurrent,1564);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1565;BA.debugLine="btnDriveway.Enabled = False";
Debug.ShouldStop(268435456);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1566;BA.debugLine="btnRefresh.Enabled = False";
Debug.ShouldStop(536870912);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1567;BA.debugLine="btnActivity.Enabled = False";
Debug.ShouldStop(1073741824);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1568;BA.debugLine="btnDrivewayNewClip.Enabled = False";
Debug.ShouldStop(-2147483648);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1569;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
Debug.ShouldStop(1);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1570;BA.debugLine="btnSideYardNewClip.Enabled = False";
Debug.ShouldStop(2);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1574;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-\"";
Debug.ShouldStop(32);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/api/v1/accounts/88438/media/changed?since=-999999999-01-01T00:00:00+18:00&page=1")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1575;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnactivity_click"), _rs);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1576;BA.debugLine="File.WriteString(File.DirApp,\"btnActivity_Click.t";
Debug.ShouldStop(128);
parent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("btnActivity_Click.txt")),(Object)(parent._response));
 BA.debugLineNum = 1577;BA.debugLine="If response.StartsWith(\"{\"\"limit\"\":25\") = False T";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent._response.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("{\"limit\":25"))),parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1579;BA.debugLine="Dim rs As ResumableSub = GetUnwatchedVideos";
Debug.ShouldStop(1024);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _getunwatchedvideos();Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1580;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnactivity_click"), _rs);
this.state = 6;
return;
case 6:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1582;BA.debugLine="Dim mf As frmActivity";
Debug.ShouldStop(8192);
_mf = RemoteObject.createNew ("cloyd.blink.frmactivity");Debug.locals.put("mf", _mf);
 BA.debugLineNum = 1583;BA.debugLine="mf.Initialize(MainForm)";
Debug.ShouldStop(16384);
_mf.runClassMethod (cloyd.blink.frmactivity.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(parent._mainform));
 BA.debugLineNum = 1584;BA.debugLine="mf.authToken = authToken";
Debug.ShouldStop(32768);
_mf.setField ("_authtoken" /*RemoteObject*/ ,parent._authtoken);
 BA.debugLineNum = 1585;BA.debugLine="mf.Show(response,userRegion)";
Debug.ShouldStop(65536);
_mf.runClassMethod (cloyd.blink.frmactivity.class, "_show" /*RemoteObject*/ ,(Object)(parent._response),(Object)(parent._userregion));
 BA.debugLineNum = 1588;BA.debugLine="Dim rs As ResumableSub = GetUnwatchedVideos";
Debug.ShouldStop(524288);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _getunwatchedvideos();Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1589;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnactivity_click"), _rs);
this.state = 7;
return;
case 7:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1591;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(4194304);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1592;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(8388608);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1593;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(16777216);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1594;BA.debugLine="btnDrivewayNewClip.Enabled = True";
Debug.ShouldStop(33554432);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1595;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
Debug.ShouldStop(67108864);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1596;BA.debugLine="btnSideYardNewClip.Enabled = True";
Debug.ShouldStop(134217728);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1597;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject _result) throws Exception{
}
public static void  _btndriveway_click() throws Exception{
try {
		Debug.PushSubsStack("btnDriveway_Click (main) ","main",0,main.ba,main.mostCurrent,183);
if (RapidSub.canDelegate("btndriveway_click")) { cloyd.blink.main.remoteMe.runUserSub(false, "main","btndriveway_click"); return;}
ResumableSub_btnDriveway_Click rsub = new ResumableSub_btnDriveway_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnDriveway_Click extends BA.ResumableSub {
public ResumableSub_btnDriveway_Click(cloyd.blink.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
cloyd.blink.main parent;
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnDriveway_Click (main) ","main",0,main.ba,main.mostCurrent,183);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 184;BA.debugLine="clvDriveway.Clear";
Debug.ShouldStop(8388608);
parent._clvdriveway.runVoidMethod ("_clear");
 BA.debugLineNum = 185;BA.debugLine="clvFrontDoor.Clear";
Debug.ShouldStop(16777216);
parent._clvfrontdoor.runVoidMethod ("_clear");
 BA.debugLineNum = 186;BA.debugLine="clvSideYard.Clear";
Debug.ShouldStop(33554432);
parent._clvsideyard.runVoidMethod ("_clear");
 BA.debugLineNum = 187;BA.debugLine="btnDriveway.Enabled = False";
Debug.ShouldStop(67108864);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 188;BA.debugLine="btnRefresh.Enabled = False";
Debug.ShouldStop(134217728);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 189;BA.debugLine="btnActivity.Enabled = False";
Debug.ShouldStop(268435456);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 190;BA.debugLine="btnDrivewayNewClip.Enabled = False";
Debug.ShouldStop(536870912);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 191;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
Debug.ShouldStop(1073741824);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 192;BA.debugLine="btnSideYardNewClip.Enabled = False";
Debug.ShouldStop(-2147483648);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 197;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
Debug.ShouldStop(16);
_bluriv(BA.ObjectToString("Driveway.jpg"),parent._ivdriveway);
 BA.debugLineNum = 198;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
Debug.ShouldStop(32);
_bluriv(BA.ObjectToString("FrontDoor.jpg"),parent._ivfrontdoor);
 BA.debugLineNum = 199;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
Debug.ShouldStop(64);
_bluriv(BA.ObjectToString("SideYard.jpg"),parent._ivsideyard);
 BA.debugLineNum = 201;BA.debugLine="Dim rs As ResumableSub = RefreshCameras(False, \"3";
Debug.ShouldStop(256);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _refreshcameras(parent.__c.getField(true,"False"),RemoteObject.createImmutable("347574"));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 202;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btndriveway_click"), _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 204;BA.debugLine="Dim rs As ResumableSub = RefreshCameras(False, \"2";
Debug.ShouldStop(2048);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _refreshcameras(parent.__c.getField(true,"False"),RemoteObject.createImmutable("236967"));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 205;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btndriveway_click"), _rs);
this.state = 2;
return;
case 2:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 207;BA.debugLine="Dim rs As ResumableSub = RefreshCameras(False, \"4";
Debug.ShouldStop(16384);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _refreshcameras(parent.__c.getField(true,"False"),RemoteObject.createImmutable("458236"));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 208;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btndriveway_click"), _rs);
this.state = 3;
return;
case 3:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _btndrivewaynewclip_click() throws Exception{
try {
		Debug.PushSubsStack("btnDrivewayNewClip_Click (main) ","main",0,main.ba,main.mostCurrent,1704);
if (RapidSub.canDelegate("btndrivewaynewclip_click")) { cloyd.blink.main.remoteMe.runUserSub(false, "main","btndrivewaynewclip_click"); return;}
ResumableSub_btnDrivewayNewClip_Click rsub = new ResumableSub_btnDrivewayNewClip_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnDrivewayNewClip_Click extends BA.ResumableSub {
public ResumableSub_btnDrivewayNewClip_Click(cloyd.blink.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
cloyd.blink.main parent;
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.declareNull("Object");
int _i = 0;
int step29;
int limit29;
int step33;
int limit33;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnDrivewayNewClip_Click (main) ","main",0,main.ba,main.mostCurrent,1704);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1705;BA.debugLine="If fx.Msgbox2(MainForm, \"Capture a new video for";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",parent._fx.runMethodAndSync(true,"Msgbox2",(Object)(parent._mainform),(Object)(BA.ObjectToString("Capture a new video for the Driveway camera?")),(Object)(parent._mainform.runMethod(true,"getTitle")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)(parent._fx.getField(false,"MSGBOX_CONFIRMATION"))),parent._fx.getField(false,"DialogResponse").getField(true,"POSITIVE"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1706;BA.debugLine="Try";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 1707;BA.debugLine="btnDriveway.Enabled = False";
Debug.ShouldStop(1024);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1708;BA.debugLine="btnRefresh.Enabled = False";
Debug.ShouldStop(2048);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1709;BA.debugLine="btnActivity.Enabled = False";
Debug.ShouldStop(4096);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1710;BA.debugLine="btnDrivewayNewClip.Enabled = False";
Debug.ShouldStop(8192);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1711;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
Debug.ShouldStop(16384);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1712;BA.debugLine="btnSideYardNewClip.Enabled = False";
Debug.ShouldStop(32768);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1713;BA.debugLine="lblStatus.Text = \"Capturing a new Driveway vide";
Debug.ShouldStop(65536);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Capturing a new Driveway video clip..."));
 BA.debugLineNum = 1715;BA.debugLine="Dim rs As ResumableSub = RESTPost(\"https://rest";
Debug.ShouldStop(262144);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restpost(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/camera/347574/clip")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1716;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btndrivewaynewclip_click"), _rs);
this.state = 29;
return;
case 29:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1718;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.C";
Debug.ShouldStop(2097152);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean(".",parent._response.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR: ")))) || RemoteObject.solveBoolean(".",parent._response.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("System is busy, please wait"))))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1719;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(4194304);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1720;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(8388608);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1721;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(16777216);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1722;BA.debugLine="btnDrivewayNewClip.Enabled = True";
Debug.ShouldStop(33554432);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1723;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
Debug.ShouldStop(67108864);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1724;BA.debugLine="btnSideYardNewClip.Enabled = True";
Debug.ShouldStop(134217728);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1725;BA.debugLine="btnDrivewayNewClip.Enabled = True";
Debug.ShouldStop(268435456);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1726;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
Debug.ShouldStop(536870912);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1727;BA.debugLine="btnSideYardNewClip.Enabled = True";
Debug.ShouldStop(1073741824);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1728;BA.debugLine="lblStatus.Text = response";
Debug.ShouldStop(-2147483648);
parent._lblstatus.runMethod(true,"setText",parent._response);
 BA.debugLineNum = 1729;BA.debugLine="Return";
Debug.ShouldStop(1);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 1731;BA.debugLine="Dim rs As ResumableSub = GetCommandID(response)";
Debug.ShouldStop(4);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _getcommandid(parent._response);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1732;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btndrivewaynewclip_click"), _rs);
this.state = 30;
return;
case 30:
//C
this.state = 11;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1734;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-";
Debug.ShouldStop(32);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/command/"),parent._commandid));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1735;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btndrivewaynewclip_click"), _rs);
this.state = 31;
return;
case 31:
//C
this.state = 11;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1737;BA.debugLine="For i = 1 To 70";
Debug.ShouldStop(256);
if (true) break;

case 11:
//for
this.state = 24;
step29 = 1;
limit29 = 70;
_i = 1 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1738;BA.debugLine="Dim rs As ResumableSub = GetCommandStatus(resp";
Debug.ShouldStop(512);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _getcommandstatus(parent._response);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1739;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btndrivewaynewclip_click"), _rs);
this.state = 34;
return;
case 34:
//C
this.state = 14;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1740;BA.debugLine="If commandComplete Then";
Debug.ShouldStop(2048);
if (true) break;

case 14:
//if
this.state = 23;
if (parent._commandcomplete.<Boolean>get().booleanValue()) { 
this.state = 16;
}else {
this.state = 22;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1741;BA.debugLine="For i = 3 To 1 Step -1";
Debug.ShouldStop(4096);
if (true) break;

case 17:
//for
this.state = 20;
step33 = -1;
limit33 = 1;
_i = 3 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 19:
//C
this.state = 36;
 BA.debugLineNum = 1742;BA.debugLine="lblStatus.Text = \"New Driveway video clip wi";
Debug.ShouldStop(8192);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("New Driveway video clip will be shown in "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(" seconds...")));
 BA.debugLineNum = 1743;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btndrivewaynewclip_click"),BA.numberCast(int.class, 1000));
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
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1745;BA.debugLine="btnActivity_Click";
Debug.ShouldStop(65536);
_btnactivity_click();
 BA.debugLineNum = 1746;BA.debugLine="Exit";
Debug.ShouldStop(131072);
this.state = 24;
if (true) break;
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 1748;BA.debugLine="lblStatus.Text = \"Awaiting for the Driveway v";
Debug.ShouldStop(524288);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Awaiting for the Driveway video clip... "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable("/70")));
 if (true) break;

case 23:
//C
this.state = 33;
;
 BA.debugLineNum = 1750;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest";
Debug.ShouldStop(2097152);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/command/"),parent._commandid));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1751;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btndrivewaynewclip_click"), _rs);
this.state = 38;
return;
case 38:
//C
this.state = 33;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1752;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btndrivewaynewclip_click"),BA.numberCast(int.class, 1000));
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
Debug.locals.put("i", _i);
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 26:
//C
this.state = 27;
this.catchState = 0;
 BA.debugLineNum = 1755;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",main.ba))));
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 0;
;
 BA.debugLineNum = 1757;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(268435456);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1758;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(536870912);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1759;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(1073741824);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1760;BA.debugLine="btnDrivewayNewClip.Enabled = True";
Debug.ShouldStop(-2147483648);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1761;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
Debug.ShouldStop(1);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1762;BA.debugLine="btnSideYardNewClip.Enabled = True";
Debug.ShouldStop(2);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1763;BA.debugLine="lblStatus.Text = \"Ready\"";
Debug.ShouldStop(4);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Ready"));
 if (true) break;

case 28:
//C
this.state = -1;
;
 BA.debugLineNum = 1765;BA.debugLine="End Sub";
Debug.ShouldStop(16);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _btndrivewayrefresh_click() throws Exception{
try {
		Debug.PushSubsStack("btnDrivewayRefresh_Click (main) ","main",0,main.ba,main.mostCurrent,1974);
if (RapidSub.canDelegate("btndrivewayrefresh_click")) { cloyd.blink.main.remoteMe.runUserSub(false, "main","btndrivewayrefresh_click"); return;}
ResumableSub_btnDrivewayRefresh_Click rsub = new ResumableSub_btnDrivewayRefresh_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnDrivewayRefresh_Click extends BA.ResumableSub {
public ResumableSub_btnDrivewayRefresh_Click(cloyd.blink.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
cloyd.blink.main parent;
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnDrivewayRefresh_Click (main) ","main",0,main.ba,main.mostCurrent,1974);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 1975;BA.debugLine="Dim rs As ResumableSub = RefreshCameras(False, \"3";
Debug.ShouldStop(4194304);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _refreshcameras(parent.__c.getField(true,"False"),RemoteObject.createImmutable("347574"));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1976;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btndrivewayrefresh_click"), _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1977;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _btnfrontdoornewclip_click() throws Exception{
try {
		Debug.PushSubsStack("btnFrontDoorNewClip_Click (main) ","main",0,main.ba,main.mostCurrent,1767);
if (RapidSub.canDelegate("btnfrontdoornewclip_click")) { cloyd.blink.main.remoteMe.runUserSub(false, "main","btnfrontdoornewclip_click"); return;}
ResumableSub_btnFrontDoorNewClip_Click rsub = new ResumableSub_btnFrontDoorNewClip_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnFrontDoorNewClip_Click extends BA.ResumableSub {
public ResumableSub_btnFrontDoorNewClip_Click(cloyd.blink.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
cloyd.blink.main parent;
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.declareNull("Object");
int _i = 0;
int step26;
int limit26;
int step30;
int limit30;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnFrontDoorNewClip_Click (main) ","main",0,main.ba,main.mostCurrent,1767);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1768;BA.debugLine="If fx.Msgbox2(MainForm, \"Capture a new video for";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",parent._fx.runMethodAndSync(true,"Msgbox2",(Object)(parent._mainform),(Object)(BA.ObjectToString("Capture a new video for the Front Door camera?")),(Object)(parent._mainform.runMethod(true,"getTitle")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)(parent._fx.getField(false,"MSGBOX_CONFIRMATION"))),parent._fx.getField(false,"DialogResponse").getField(true,"POSITIVE"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1769;BA.debugLine="Try";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 1770;BA.debugLine="btnDriveway.Enabled = False";
Debug.ShouldStop(512);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1771;BA.debugLine="btnRefresh.Enabled = False";
Debug.ShouldStop(1024);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1772;BA.debugLine="btnActivity.Enabled = False";
Debug.ShouldStop(2048);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1773;BA.debugLine="btnDrivewayNewClip.Enabled = False";
Debug.ShouldStop(4096);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1774;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
Debug.ShouldStop(8192);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1775;BA.debugLine="btnSideYardNewClip.Enabled = False";
Debug.ShouldStop(16384);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1776;BA.debugLine="lblStatus.Text = \"Capturing a new Front Door vi";
Debug.ShouldStop(32768);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Capturing a new Front Door video clip..."));
 BA.debugLineNum = 1778;BA.debugLine="Dim rs As ResumableSub = RESTPost(\"https://rest";
Debug.ShouldStop(131072);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restpost(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/camera/236967/clip")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1779;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnfrontdoornewclip_click"), _rs);
this.state = 29;
return;
case 29:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1780;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.C";
Debug.ShouldStop(524288);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean(".",parent._response.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR: ")))) || RemoteObject.solveBoolean(".",parent._response.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("System is busy, please wait"))))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1781;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(1048576);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1782;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(2097152);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1783;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(4194304);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1784;BA.debugLine="btnDrivewayNewClip.Enabled = True";
Debug.ShouldStop(8388608);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1785;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
Debug.ShouldStop(16777216);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1786;BA.debugLine="btnSideYardNewClip.Enabled = True";
Debug.ShouldStop(33554432);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1787;BA.debugLine="lblStatus.Text = response";
Debug.ShouldStop(67108864);
parent._lblstatus.runMethod(true,"setText",parent._response);
 BA.debugLineNum = 1788;BA.debugLine="Return";
Debug.ShouldStop(134217728);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 1791;BA.debugLine="Dim rs As ResumableSub = GetCommandID(response)";
Debug.ShouldStop(1073741824);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _getcommandid(parent._response);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1792;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnfrontdoornewclip_click"), _rs);
this.state = 30;
return;
case 30:
//C
this.state = 11;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1794;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-";
Debug.ShouldStop(2);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/command/"),parent._commandid));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1795;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnfrontdoornewclip_click"), _rs);
this.state = 31;
return;
case 31:
//C
this.state = 11;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1797;BA.debugLine="For i = 1 To 70";
Debug.ShouldStop(16);
if (true) break;

case 11:
//for
this.state = 24;
step26 = 1;
limit26 = 70;
_i = 1 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1798;BA.debugLine="Dim rs As ResumableSub = GetCommandStatus(resp";
Debug.ShouldStop(32);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _getcommandstatus(parent._response);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1799;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnfrontdoornewclip_click"), _rs);
this.state = 34;
return;
case 34:
//C
this.state = 14;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1800;BA.debugLine="If commandComplete Then";
Debug.ShouldStop(128);
if (true) break;

case 14:
//if
this.state = 23;
if (parent._commandcomplete.<Boolean>get().booleanValue()) { 
this.state = 16;
}else {
this.state = 22;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1801;BA.debugLine="For i = 3 To 1  Step -1";
Debug.ShouldStop(256);
if (true) break;

case 17:
//for
this.state = 20;
step30 = -1;
limit30 = 1;
_i = 3 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 19:
//C
this.state = 36;
 BA.debugLineNum = 1802;BA.debugLine="lblStatus.Text = \"New Front Door video clip";
Debug.ShouldStop(512);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("New Front Door video clip will be shown in "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(" seconds...")));
 BA.debugLineNum = 1803;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnfrontdoornewclip_click"),BA.numberCast(int.class, 1000));
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
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1805;BA.debugLine="btnActivity_Click";
Debug.ShouldStop(4096);
_btnactivity_click();
 BA.debugLineNum = 1806;BA.debugLine="Exit";
Debug.ShouldStop(8192);
this.state = 24;
if (true) break;
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 1808;BA.debugLine="lblStatus.Text = \"Awaiting for the Front Door";
Debug.ShouldStop(32768);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Awaiting for the Front Door video clip... "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable("/70")));
 if (true) break;

case 23:
//C
this.state = 33;
;
 BA.debugLineNum = 1810;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest";
Debug.ShouldStop(131072);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/command/"),parent._commandid));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1811;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnfrontdoornewclip_click"), _rs);
this.state = 38;
return;
case 38:
//C
this.state = 33;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1812;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnfrontdoornewclip_click"),BA.numberCast(int.class, 1000));
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
Debug.locals.put("i", _i);
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 26:
//C
this.state = 27;
this.catchState = 0;
 BA.debugLineNum = 1815;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",main.ba))));
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 0;
;
 BA.debugLineNum = 1817;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(16777216);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1818;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(33554432);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1819;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(67108864);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1820;BA.debugLine="btnDrivewayNewClip.Enabled = True";
Debug.ShouldStop(134217728);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1821;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
Debug.ShouldStop(268435456);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1822;BA.debugLine="btnSideYardNewClip.Enabled = True";
Debug.ShouldStop(536870912);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1823;BA.debugLine="lblStatus.Text = \"Ready\"";
Debug.ShouldStop(1073741824);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Ready"));
 if (true) break;

case 28:
//C
this.state = -1;
;
 BA.debugLineNum = 1825;BA.debugLine="End Sub";
Debug.ShouldStop(1);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _btnfrontdoorrefresh_click() throws Exception{
try {
		Debug.PushSubsStack("btnFrontDoorRefresh_Click (main) ","main",0,main.ba,main.mostCurrent,1969);
if (RapidSub.canDelegate("btnfrontdoorrefresh_click")) { cloyd.blink.main.remoteMe.runUserSub(false, "main","btnfrontdoorrefresh_click"); return;}
ResumableSub_btnFrontDoorRefresh_Click rsub = new ResumableSub_btnFrontDoorRefresh_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnFrontDoorRefresh_Click extends BA.ResumableSub {
public ResumableSub_btnFrontDoorRefresh_Click(cloyd.blink.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
cloyd.blink.main parent;
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnFrontDoorRefresh_Click (main) ","main",0,main.ba,main.mostCurrent,1969);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 1970;BA.debugLine="Dim rs As ResumableSub = RefreshCameras(False, \"2";
Debug.ShouldStop(131072);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _refreshcameras(parent.__c.getField(true,"False"),RemoteObject.createImmutable("236967"));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1971;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnfrontdoorrefresh_click"), _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1972;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _btnrefresh_click() throws Exception{
try {
		Debug.PushSubsStack("btnRefresh_Click (main) ","main",0,main.ba,main.mostCurrent,1689);
if (RapidSub.canDelegate("btnrefresh_click")) { cloyd.blink.main.remoteMe.runUserSub(false, "main","btnrefresh_click"); return;}
ResumableSub_btnRefresh_Click rsub = new ResumableSub_btnRefresh_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnRefresh_Click extends BA.ResumableSub {
public ResumableSub_btnRefresh_Click(cloyd.blink.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
cloyd.blink.main parent;
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnRefresh_Click (main) ","main",0,main.ba,main.mostCurrent,1689);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 1690;BA.debugLine="btnDriveway.Enabled = False";
Debug.ShouldStop(33554432);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1691;BA.debugLine="btnRefresh.Enabled = False";
Debug.ShouldStop(67108864);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1692;BA.debugLine="btnActivity.Enabled = False";
Debug.ShouldStop(134217728);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1693;BA.debugLine="btnDrivewayNewClip.Enabled = False";
Debug.ShouldStop(268435456);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1694;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
Debug.ShouldStop(536870912);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1695;BA.debugLine="btnSideYardNewClip.Enabled = False";
Debug.ShouldStop(1073741824);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1696;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
Debug.ShouldStop(-2147483648);
_bluriv(BA.ObjectToString("Driveway.jpg"),parent._ivdriveway);
 BA.debugLineNum = 1697;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
Debug.ShouldStop(1);
_bluriv(BA.ObjectToString("FrontDoor.jpg"),parent._ivfrontdoor);
 BA.debugLineNum = 1698;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
Debug.ShouldStop(2);
_bluriv(BA.ObjectToString("SideYard.jpg"),parent._ivsideyard);
 BA.debugLineNum = 1700;BA.debugLine="Dim rs As ResumableSub = RefreshCameras(True, \"Al";
Debug.ShouldStop(8);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _refreshcameras(parent.__c.getField(true,"True"),RemoteObject.createImmutable("All"));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1701;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnrefresh_click"), _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1702;BA.debugLine="End Sub";
Debug.ShouldStop(32);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _btnsideyardnewclip_click() throws Exception{
try {
		Debug.PushSubsStack("btnSideYardNewClip_Click (main) ","main",0,main.ba,main.mostCurrent,1827);
if (RapidSub.canDelegate("btnsideyardnewclip_click")) { cloyd.blink.main.remoteMe.runUserSub(false, "main","btnsideyardnewclip_click"); return;}
ResumableSub_btnSideYardNewClip_Click rsub = new ResumableSub_btnSideYardNewClip_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSideYardNewClip_Click extends BA.ResumableSub {
public ResumableSub_btnSideYardNewClip_Click(cloyd.blink.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
cloyd.blink.main parent;
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.declareNull("Object");
int _i = 0;
int step26;
int limit26;
int step30;
int limit30;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSideYardNewClip_Click (main) ","main",0,main.ba,main.mostCurrent,1827);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1828;BA.debugLine="If fx.Msgbox2(MainForm, \"Capture a new video for";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",parent._fx.runMethodAndSync(true,"Msgbox2",(Object)(parent._mainform),(Object)(BA.ObjectToString("Capture a new video for the Side Yard camera?")),(Object)(parent._mainform.runMethod(true,"getTitle")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)(parent._fx.getField(false,"MSGBOX_CONFIRMATION"))),parent._fx.getField(false,"DialogResponse").getField(true,"POSITIVE"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1829;BA.debugLine="Try";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 1830;BA.debugLine="btnDriveway.Enabled = False";
Debug.ShouldStop(32);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1831;BA.debugLine="btnRefresh.Enabled = False";
Debug.ShouldStop(64);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1832;BA.debugLine="btnActivity.Enabled = False";
Debug.ShouldStop(128);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1833;BA.debugLine="btnDrivewayNewClip.Enabled = False";
Debug.ShouldStop(256);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1834;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
Debug.ShouldStop(512);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1835;BA.debugLine="btnSideYardNewClip.Enabled = False";
Debug.ShouldStop(1024);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1836;BA.debugLine="lblStatus.Text = \"Capturing a new Side Yard vid";
Debug.ShouldStop(2048);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Capturing a new Side Yard video clip..."));
 BA.debugLineNum = 1837;BA.debugLine="Dim rs As ResumableSub = RESTPost(\"https://rest";
Debug.ShouldStop(4096);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restpost(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/camera/458236/clip")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1838;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnsideyardnewclip_click"), _rs);
this.state = 29;
return;
case 29:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1839;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.C";
Debug.ShouldStop(16384);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean(".",parent._response.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR: ")))) || RemoteObject.solveBoolean(".",parent._response.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("System is busy, please wait"))))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1840;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(32768);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1841;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(65536);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1842;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(131072);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1843;BA.debugLine="btnDrivewayNewClip.Enabled = True";
Debug.ShouldStop(262144);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1844;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
Debug.ShouldStop(524288);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1845;BA.debugLine="btnSideYardNewClip.Enabled = True";
Debug.ShouldStop(1048576);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1846;BA.debugLine="lblStatus.Text = response";
Debug.ShouldStop(2097152);
parent._lblstatus.runMethod(true,"setText",parent._response);
 BA.debugLineNum = 1847;BA.debugLine="Return";
Debug.ShouldStop(4194304);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 1850;BA.debugLine="Dim rs As ResumableSub = GetCommandID(response)";
Debug.ShouldStop(33554432);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _getcommandid(parent._response);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1851;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnsideyardnewclip_click"), _rs);
this.state = 30;
return;
case 30:
//C
this.state = 11;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1853;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-";
Debug.ShouldStop(268435456);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/command/"),parent._commandid));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1854;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnsideyardnewclip_click"), _rs);
this.state = 31;
return;
case 31:
//C
this.state = 11;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1856;BA.debugLine="For i = 1 To 70";
Debug.ShouldStop(-2147483648);
if (true) break;

case 11:
//for
this.state = 24;
step26 = 1;
limit26 = 70;
_i = 1 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1857;BA.debugLine="Dim rs As ResumableSub = GetCommandStatus(resp";
Debug.ShouldStop(1);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _getcommandstatus(parent._response);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1858;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnsideyardnewclip_click"), _rs);
this.state = 34;
return;
case 34:
//C
this.state = 14;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1859;BA.debugLine="If commandComplete Then";
Debug.ShouldStop(4);
if (true) break;

case 14:
//if
this.state = 23;
if (parent._commandcomplete.<Boolean>get().booleanValue()) { 
this.state = 16;
}else {
this.state = 22;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1860;BA.debugLine="For i = 3 To 1 Step -1";
Debug.ShouldStop(8);
if (true) break;

case 17:
//for
this.state = 20;
step30 = -1;
limit30 = 1;
_i = 3 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 19:
//C
this.state = 36;
 BA.debugLineNum = 1861;BA.debugLine="lblStatus.Text = \"New Side Yard video clip w";
Debug.ShouldStop(16);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("New Side Yard video clip will be shown in "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(" seconds...")));
 BA.debugLineNum = 1862;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnsideyardnewclip_click"),BA.numberCast(int.class, 1000));
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
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1864;BA.debugLine="btnActivity_Click";
Debug.ShouldStop(128);
_btnactivity_click();
 BA.debugLineNum = 1865;BA.debugLine="Exit";
Debug.ShouldStop(256);
this.state = 24;
if (true) break;
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 1867;BA.debugLine="lblStatus.Text = \"Awaiting for the Side Yard";
Debug.ShouldStop(1024);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Awaiting for the Side Yard video clip... "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable("/70")));
 if (true) break;

case 23:
//C
this.state = 33;
;
 BA.debugLineNum = 1869;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest";
Debug.ShouldStop(4096);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/command/"),parent._commandid));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1870;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnsideyardnewclip_click"), _rs);
this.state = 38;
return;
case 38:
//C
this.state = 33;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1871;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnsideyardnewclip_click"),BA.numberCast(int.class, 1000));
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
Debug.locals.put("i", _i);
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 26:
//C
this.state = 27;
this.catchState = 0;
 BA.debugLineNum = 1874;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",main.ba))));
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 0;
;
 BA.debugLineNum = 1876;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(524288);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1877;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(1048576);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1878;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(2097152);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1879;BA.debugLine="btnDrivewayNewClip.Enabled = True";
Debug.ShouldStop(4194304);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1880;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
Debug.ShouldStop(8388608);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1881;BA.debugLine="btnSideYardNewClip.Enabled = True";
Debug.ShouldStop(16777216);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1882;BA.debugLine="lblStatus.Text = \"Ready\"";
Debug.ShouldStop(33554432);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Ready"));
 if (true) break;

case 28:
//C
this.state = -1;
;
 BA.debugLineNum = 1884;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _btnsideyardrefresh_click() throws Exception{
try {
		Debug.PushSubsStack("btnSideYardRefresh_Click (main) ","main",0,main.ba,main.mostCurrent,1964);
if (RapidSub.canDelegate("btnsideyardrefresh_click")) { cloyd.blink.main.remoteMe.runUserSub(false, "main","btnsideyardrefresh_click"); return;}
ResumableSub_btnSideYardRefresh_Click rsub = new ResumableSub_btnSideYardRefresh_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSideYardRefresh_Click extends BA.ResumableSub {
public ResumableSub_btnSideYardRefresh_Click(cloyd.blink.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
cloyd.blink.main parent;
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSideYardRefresh_Click (main) ","main",0,main.ba,main.mostCurrent,1964);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 1965;BA.debugLine="Dim rs As ResumableSub = RefreshCameras(False, \"4";
Debug.ShouldStop(4096);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _refreshcameras(parent.__c.getField(true,"False"),RemoteObject.createImmutable("458236"));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1966;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnsideyardrefresh_click"), _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1967;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _checklfrlevel(RemoteObject _lfrlevel) throws Exception{
try {
		Debug.PushSubsStack("CheckLFRLevel (main) ","main",0,main.ba,main.mostCurrent,1130);
if (RapidSub.canDelegate("checklfrlevel")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","checklfrlevel", _lfrlevel);}
Debug.locals.put("lfrlevel", _lfrlevel);
 BA.debugLineNum = 1130;BA.debugLine="Sub CheckLFRLevel(lfrlevel As Int) As String";
Debug.ShouldStop(512);
 BA.debugLineNum = 1131;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 1133;BA.debugLine="If lfrlevel > -67 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",_lfrlevel,BA.numberCast(int.class, -(double) (0 + 67)))) { 
 BA.debugLineNum = 1134;BA.debugLine="Return \"Amazing\"";
Debug.ShouldStop(8192);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("Amazing");
 }else 
{ BA.debugLineNum = 1135;BA.debugLine="else If lfrlevel > -70 And lfrlevel <= -67 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_lfrlevel,BA.numberCast(int.class, -(double) (0 + 70))) && RemoteObject.solveBoolean("k",_lfrlevel,BA.numberCast(int.class, -(double) (0 + 67)))) { 
 BA.debugLineNum = 1136;BA.debugLine="Return \"Very good\"";
Debug.ShouldStop(32768);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("Very good");
 }else 
{ BA.debugLineNum = 1137;BA.debugLine="else If lfrlevel > -80 And lfrlevel <= -70 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_lfrlevel,BA.numberCast(int.class, -(double) (0 + 80))) && RemoteObject.solveBoolean("k",_lfrlevel,BA.numberCast(int.class, -(double) (0 + 70)))) { 
 BA.debugLineNum = 1138;BA.debugLine="Return \"OK\"";
Debug.ShouldStop(131072);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("OK");
 }else 
{ BA.debugLineNum = 1139;BA.debugLine="else If lfrlevel > -90 And lfrlevel <= -80 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_lfrlevel,BA.numberCast(int.class, -(double) (0 + 90))) && RemoteObject.solveBoolean("k",_lfrlevel,BA.numberCast(int.class, -(double) (0 + 80)))) { 
 BA.debugLineNum = 1140;BA.debugLine="Return \"Not Good\"";
Debug.ShouldStop(524288);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("Not Good");
 }else {
 BA.debugLineNum = 1142;BA.debugLine="Return \"Unusable\"";
Debug.ShouldStop(2097152);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("Unusable");
 }}}}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e14.toString()); BA.debugLineNum = 1145;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 1146;BA.debugLine="Return \"\"";
Debug.ShouldStop(33554432);
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 1148;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkmonitor() throws Exception{
try {
		Debug.PushSubsStack("CheckMonitor (main) ","main",0,main.ba,main.mostCurrent,1261);
if (RapidSub.canDelegate("checkmonitor")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","checkmonitor");}
RemoteObject _slist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _s = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
 BA.debugLineNum = 1261;BA.debugLine="Sub CheckMonitor() As Screen";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1262;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 1263;BA.debugLine="If fx.Screens.Size= 1 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",main._fx.runMethod(false,"getScreens").runMethod(true,"getSize"),BA.numberCast(int.class, 1))) { 
 BA.debugLineNum = 1264;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(32768);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = main._fx.runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 1265;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(65536);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.ScreenWrapper"), _slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 1267;BA.debugLine="Return S";
Debug.ShouldStop(262144);
Debug.CheckDeviceExceptions();if (true) return _s;
 }else 
{ BA.debugLineNum = 1268;BA.debugLine="Else If fx.Screens.Size> 1 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",main._fx.runMethod(false,"getScreens").runMethod(true,"getSize"),BA.numberCast(int.class, 1))) { 
 BA.debugLineNum = 1269;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(1048576);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = main._fx.runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 1270;BA.debugLine="Dim S As Screen = SList.Get(2)";
Debug.ShouldStop(2097152);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.ScreenWrapper"), _slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("S", _s);
 BA.debugLineNum = 1272;BA.debugLine="Return S";
Debug.ShouldStop(8388608);
Debug.CheckDeviceExceptions();if (true) return _s;
 }else {
 BA.debugLineNum = 1274;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(33554432);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = main._fx.runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 1275;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(67108864);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.ScreenWrapper"), _slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 1277;BA.debugLine="Return S";
Debug.ShouldStop(268435456);
Debug.CheckDeviceExceptions();if (true) return _s;
 }}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e16.toString()); BA.debugLineNum = 1280;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(-2147483648);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = main._fx.runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 1281;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(1);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.ScreenWrapper"), _slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 1283;BA.debugLine="Return S";
Debug.ShouldStop(4);
if (true) return _s;
 };
 BA.debugLineNum = 1285;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _close_entered_event(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("Close_Entered_Event (main) ","main",0,main.ba,main.mostCurrent,1187);
if (RapidSub.canDelegate("close_entered_event")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","close_entered_event", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 1187;BA.debugLine="Private Sub Close_Entered_Event(e As Event)";
Debug.ShouldStop(4);
 BA.debugLineNum = 1188;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 1189;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
Debug.ShouldStop(16);
main._ivclose.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable("_btCloseEnt.png")))).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e4.toString()); BA.debugLineNum = 1191;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 1193;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _close_exited_event(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("Close_Exited_Event (main) ","main",0,main.ba,main.mostCurrent,1195);
if (RapidSub.canDelegate("close_exited_event")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","close_exited_event", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 1195;BA.debugLine="Private Sub Close_Exited_Event(e As Event)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1196;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 1197;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
Debug.ShouldStop(4096);
main._ivclose.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable("_btClose.png")))).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e4.toString()); BA.debugLineNum = 1199;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 1201;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clvdriveway_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("clvDriveway_ItemClick (main) ","main",0,main.ba,main.mostCurrent,1307);
if (RapidSub.canDelegate("clvdriveway_itemclick")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","clvdriveway_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1307;BA.debugLine="Sub clvDriveway_ItemClick (Index As Int, Value As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1308;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 1309;BA.debugLine="clvDriveway.JumpToItem(Index)";
Debug.ShouldStop(268435456);
main._clvdriveway.runVoidMethod ("_jumptoitem",(Object)(_index));
 BA.debugLineNum = 1310;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
Debug.ShouldStop(536870912);
main._clvfrontdoor.runVoidMethod ("_jumptoitem",(Object)(_index));
 BA.debugLineNum = 1311;BA.debugLine="clvSideYard.JumpToItem(Index)";
Debug.ShouldStop(1073741824);
main._clvsideyard.runVoidMethod ("_jumptoitem",(Object)(_index));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e6.toString()); BA.debugLineNum = 1313;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 1315;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clvfrontdoor_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("clvFrontDoor_ItemClick (main) ","main",0,main.ba,main.mostCurrent,1297);
if (RapidSub.canDelegate("clvfrontdoor_itemclick")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","clvfrontdoor_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1297;BA.debugLine="Sub clvFrontDoor_ItemClick (Index As Int, Value As";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1298;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 1299;BA.debugLine="clvDriveway.JumpToItem(Index)";
Debug.ShouldStop(262144);
main._clvdriveway.runVoidMethod ("_jumptoitem",(Object)(_index));
 BA.debugLineNum = 1300;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
Debug.ShouldStop(524288);
main._clvfrontdoor.runVoidMethod ("_jumptoitem",(Object)(_index));
 BA.debugLineNum = 1301;BA.debugLine="clvSideYard.JumpToItem(Index)";
Debug.ShouldStop(1048576);
main._clvsideyard.runVoidMethod ("_jumptoitem",(Object)(_index));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e6.toString()); BA.debugLineNum = 1303;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 1305;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clvsideyard_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("clvSideYard_ItemClick (main) ","main",0,main.ba,main.mostCurrent,1287);
if (RapidSub.canDelegate("clvsideyard_itemclick")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","clvsideyard_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1287;BA.debugLine="Sub clvSideYard_ItemClick (Index As Int, Value As";
Debug.ShouldStop(64);
 BA.debugLineNum = 1288;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 1289;BA.debugLine="clvDriveway.JumpToItem(Index)";
Debug.ShouldStop(256);
main._clvdriveway.runVoidMethod ("_jumptoitem",(Object)(_index));
 BA.debugLineNum = 1290;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
Debug.ShouldStop(512);
main._clvfrontdoor.runVoidMethod ("_jumptoitem",(Object)(_index));
 BA.debugLineNum = 1291;BA.debugLine="clvSideYard.JumpToItem(Index)";
Debug.ShouldStop(1024);
main._clvsideyard.runVoidMethod ("_jumptoitem",(Object)(_index));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e6.toString()); BA.debugLineNum = 1293;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 1295;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertdatetime(RemoteObject _inputtime) throws Exception{
try {
		Debug.PushSubsStack("ConvertDateTime (main) ","main",0,main.ba,main.mostCurrent,1609);
if (RapidSub.canDelegate("convertdatetime")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","convertdatetime", _inputtime);}
RemoteObject _timestampprocessed = RemoteObject.createImmutable("");
RemoteObject _ticks = RemoteObject.createImmutable(0L);
RemoteObject _lngticks = RemoteObject.createImmutable(0L);
RemoteObject _p = RemoteObject.declareNull("b4j.example.dateutils._period");
Debug.locals.put("inputTime", _inputtime);
 BA.debugLineNum = 1609;BA.debugLine="Sub ConvertDateTime(inputTime As String) As String";
Debug.ShouldStop(256);
 BA.debugLineNum = 1611;BA.debugLine="Dim timestampProcessed As String";
Debug.ShouldStop(1024);
_timestampprocessed = RemoteObject.createImmutable("");Debug.locals.put("timestampProcessed", _timestampprocessed);
 BA.debugLineNum = 1612;BA.debugLine="timestampProcessed =  ConvertFullDateTime(inputTi";
Debug.ShouldStop(2048);
_timestampprocessed = _convertfulldatetime(_inputtime);Debug.locals.put("timestampProcessed", _timestampprocessed);
 BA.debugLineNum = 1614;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
Debug.ShouldStop(8192);
_ticks = _parseutcstring(_inputtime.runMethod(true,"replace",(Object)(BA.ObjectToString("+00:00")),(Object)(RemoteObject.createImmutable("+0000"))));Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 1615;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
Debug.ShouldStop(16384);
main.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("MMM d, yyyy h:mm:ss a"));
 BA.debugLineNum = 1616;BA.debugLine="Dim lngTicks As Long = ticks";
Debug.ShouldStop(32768);
_lngticks = _ticks;Debug.locals.put("lngTicks", _lngticks);Debug.locals.put("lngTicks", _lngticks);
 BA.debugLineNum = 1617;BA.debugLine="Dim p As Period = DateUtils.PeriodBetween(lngTick";
Debug.ShouldStop(65536);
_p = main._dateutils.runMethod(false,"_periodbetween",(Object)(_lngticks),(Object)(main.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1619;BA.debugLine="If timestampProcessed.Contains(\"Yesterday\") Or ti";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(".",_timestampprocessed.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Yesterday")))) || RemoteObject.solveBoolean(".",_timestampprocessed.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Today"))))) { 
 BA.debugLineNum = 1620;BA.debugLine="If p.Days = 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Days"),BA.numberCast(int.class, 0))) { 
 BA.debugLineNum = 1621;BA.debugLine="If p.Hours = 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Hours"),BA.numberCast(int.class, 0))) { 
 BA.debugLineNum = 1622;BA.debugLine="If p.Minutes = 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Minutes"),BA.numberCast(int.class, 0))) { 
 BA.debugLineNum = 1623;BA.debugLine="Return timestampProcessed & \" (\" & p.Seconds";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.concat(_timestampprocessed,RemoteObject.createImmutable(" ("),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago)"));
 }else {
 BA.debugLineNum = 1625;BA.debugLine="Return timestampProcessed & \" (\" & p.Minutes";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.concat(_timestampprocessed,RemoteObject.createImmutable(" ("),_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago)"));
 };
 }else {
 BA.debugLineNum = 1628;BA.debugLine="Return timestampProcessed & \" (\" & p.Hours & \"";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.concat(_timestampprocessed,RemoteObject.createImmutable(" ("),_p.getField(true,"Hours"),RemoteObject.createImmutable("h "),_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago)"));
 };
 }else 
{ BA.debugLineNum = 1630;BA.debugLine="else If p.Hours = 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Hours"),BA.numberCast(int.class, 0))) { 
 BA.debugLineNum = 1631;BA.debugLine="If p.Minutes = 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Minutes"),BA.numberCast(int.class, 0))) { 
 BA.debugLineNum = 1632;BA.debugLine="Return timestampProcessed & \" (\" & p.Seconds &";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.concat(_timestampprocessed,RemoteObject.createImmutable(" ("),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago)"));
 }else {
 BA.debugLineNum = 1634;BA.debugLine="Return timestampProcessed & \" (\" & p.Minutes &";
Debug.ShouldStop(2);
if (true) return RemoteObject.concat(_timestampprocessed,RemoteObject.createImmutable(" ("),_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago)"));
 };
 }else 
{ BA.debugLineNum = 1636;BA.debugLine="else If p.Minutes = 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Minutes"),BA.numberCast(int.class, 0))) { 
 BA.debugLineNum = 1637;BA.debugLine="Return timestampProcessed & \" (\" & p.Seconds &";
Debug.ShouldStop(16);
if (true) return RemoteObject.concat(_timestampprocessed,RemoteObject.createImmutable(" ("),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago)"));
 }else {
 BA.debugLineNum = 1639;BA.debugLine="Return timestampProcessed & \" (\" & p.Days & \"d";
Debug.ShouldStop(64);
if (true) return RemoteObject.concat(_timestampprocessed,RemoteObject.createImmutable(" ("),_p.getField(true,"Days"),RemoteObject.createImmutable("d "),_p.getField(true,"Hours"),RemoteObject.createImmutable("h "),_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago)"));
 }}}
;
 }else {
 BA.debugLineNum = 1642;BA.debugLine="Return timestampProcessed & \" (\" & p.Days & \"d \"";
Debug.ShouldStop(512);
if (true) return RemoteObject.concat(_timestampprocessed,RemoteObject.createImmutable(" ("),_p.getField(true,"Days"),RemoteObject.createImmutable("d "),_p.getField(true,"Hours"),RemoteObject.createImmutable("h "),_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago)"));
 };
 BA.debugLineNum = 1645;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertdatetimeplain(RemoteObject _inputtime) throws Exception{
try {
		Debug.PushSubsStack("ConvertDateTimePlain (main) ","main",0,main.ba,main.mostCurrent,1599);
if (RapidSub.canDelegate("convertdatetimeplain")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","convertdatetimeplain", _inputtime);}
RemoteObject _ticks = RemoteObject.createImmutable(0L);
RemoteObject _lngticks = RemoteObject.createImmutable(0L);
Debug.locals.put("inputTime", _inputtime);
 BA.debugLineNum = 1599;BA.debugLine="Sub ConvertDateTimePlain(inputTime As String) As S";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1601;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
Debug.ShouldStop(1);
_ticks = _parseutcstring(_inputtime.runMethod(true,"replace",(Object)(BA.ObjectToString("+00:00")),(Object)(RemoteObject.createImmutable("+0000"))));Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 1602;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
Debug.ShouldStop(2);
main.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("MMM d, yyyy h:mm:ss a"));
 BA.debugLineNum = 1603;BA.debugLine="Dim lngTicks As Long = ticks";
Debug.ShouldStop(4);
_lngticks = _ticks;Debug.locals.put("lngTicks", _lngticks);Debug.locals.put("lngTicks", _lngticks);
 BA.debugLineNum = 1606;BA.debugLine="Return DateTime.Date(lngTicks)";
Debug.ShouldStop(32);
if (true) return main.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lngticks));
 BA.debugLineNum = 1607;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertfulldatetime(RemoteObject _inputtime) throws Exception{
try {
		Debug.PushSubsStack("ConvertFullDateTime (main) ","main",0,main.ba,main.mostCurrent,1647);
if (RapidSub.canDelegate("convertfulldatetime")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","convertfulldatetime", _inputtime);}
RemoteObject _ticks = RemoteObject.createImmutable(0L);
RemoteObject _lngticks = RemoteObject.createImmutable(0L);
RemoteObject _yesterday = RemoteObject.createImmutable(0L);
RemoteObject _timestamp = RemoteObject.createImmutable(0L);
Debug.locals.put("inputTime", _inputtime);
 BA.debugLineNum = 1647;BA.debugLine="Sub ConvertFullDateTime(inputTime As String) As St";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1649;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
Debug.ShouldStop(65536);
_ticks = _parseutcstring(_inputtime.runMethod(true,"replace",(Object)(BA.ObjectToString("+00:00")),(Object)(RemoteObject.createImmutable("+0000"))));Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 1650;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
Debug.ShouldStop(131072);
main.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("MMM d, yyyy h:mm:ss a"));
 BA.debugLineNum = 1651;BA.debugLine="Dim lngTicks As Long = ticks";
Debug.ShouldStop(262144);
_lngticks = _ticks;Debug.locals.put("lngTicks", _lngticks);Debug.locals.put("lngTicks", _lngticks);
 BA.debugLineNum = 1653;BA.debugLine="Dim Yesterday As Long";
Debug.ShouldStop(1048576);
_yesterday = RemoteObject.createImmutable(0L);Debug.locals.put("Yesterday", _yesterday);
 BA.debugLineNum = 1654;BA.debugLine="Dim timestamp As Long";
Debug.ShouldStop(2097152);
_timestamp = RemoteObject.createImmutable(0L);Debug.locals.put("timestamp", _timestamp);
 BA.debugLineNum = 1655;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
Debug.ShouldStop(4194304);
main.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyyMMdd"));
 BA.debugLineNum = 1656;BA.debugLine="Yesterday = DateTime.Date(DateTime.add(DateTime.N";
Debug.ShouldStop(8388608);
_yesterday = BA.numberCast(long.class, main.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(main.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(main.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, -(double) (0 + 1)))))));Debug.locals.put("Yesterday", _yesterday);
 BA.debugLineNum = 1657;BA.debugLine="timestamp = DateTime.Date(lngTicks)";
Debug.ShouldStop(16777216);
_timestamp = BA.numberCast(long.class, main.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lngticks)));Debug.locals.put("timestamp", _timestamp);
 BA.debugLineNum = 1659;BA.debugLine="DateTime.DateFormat = \"h:mm:ss a\"";
Debug.ShouldStop(67108864);
main.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("h:mm:ss a"));
 BA.debugLineNum = 1660;BA.debugLine="If DateUtils.IsSameDay(lngTicks,DateTime.now) The";
Debug.ShouldStop(134217728);
if (main._dateutils.runMethod(true,"_issameday",(Object)(_lngticks),(Object)(main.__c.getField(false,"DateTime").runMethod(true,"getNow"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1661;BA.debugLine="Return \"Today \" & DateTime.Date(lngTicks)";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Today "),main.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lngticks)));
 }else 
{ BA.debugLineNum = 1662;BA.debugLine="Else If Yesterday = timestamp Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_yesterday,_timestamp)) { 
 BA.debugLineNum = 1663;BA.debugLine="Return \"Yesterday \" & DateTime.Date(lngTicks)";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Yesterday "),main.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lngticks)));
 }else {
 BA.debugLineNum = 1665;BA.debugLine="Return DateUtils.GetDayOfWeekName(lngTicks) & \"";
Debug.ShouldStop(1);
if (true) return RemoteObject.concat(main._dateutils.runMethod(true,"_getdayofweekname",(Object)(_lngticks)),RemoteObject.createImmutable(" "),main.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lngticks)));
 }}
;
 BA.debugLineNum = 1667;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _downloadimage(RemoteObject _link,RemoteObject _iv,RemoteObject _camera) throws Exception{
try {
		Debug.PushSubsStack("DownloadImage (main) ","main",0,main.ba,main.mostCurrent,628);
if (RapidSub.canDelegate("downloadimage")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","downloadimage", _link, _iv, _camera);}
ResumableSub_DownloadImage rsub = new ResumableSub_DownloadImage(null,_link,_iv,_camera);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DownloadImage extends BA.ResumableSub {
public ResumableSub_DownloadImage(cloyd.blink.main parent,RemoteObject _link,RemoteObject _iv,RemoteObject _camera) {
this.parent = parent;
this._link = _link;
this._iv = _iv;
this._camera = _camera;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
cloyd.blink.main parent;
RemoteObject _link;
RemoteObject _iv;
RemoteObject _camera;
RemoteObject _j = RemoteObject.declareNull("cloyd.blink.httpjob");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadImage (main) ","main",0,main.ba,main.mostCurrent,628);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("Link", _link);
Debug.locals.put("iv", _iv);
Debug.locals.put("camera", _camera);
 BA.debugLineNum = 629;BA.debugLine="Try";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 630;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(2097152);
_j = RemoteObject.createNew ("cloyd.blink.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 631;BA.debugLine="response = \"\"";
Debug.ShouldStop(4194304);
parent._response = BA.ObjectToString("");
 BA.debugLineNum = 632;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(8388608);
_j.runClassMethod (cloyd.blink.httpjob.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 633;BA.debugLine="j.Download(Link)";
Debug.ShouldStop(16777216);
_j.runClassMethod (cloyd.blink.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_link));
 BA.debugLineNum = 634;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
Debug.ShouldStop(33554432);
_j.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("TOKEN_AUTH")),(Object)(parent._authtoken));
 BA.debugLineNum = 635;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","jobdone", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "downloadimage"), (_j));
this.state = 21;
return;
case 21:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 636;BA.debugLine="If j.Success Then";
Debug.ShouldStop(134217728);
if (true) break;

case 4:
//if
this.state = 17;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 16;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 638;BA.debugLine="If camera = \"347574\" Then";
Debug.ShouldStop(536870912);
if (true) break;

case 7:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("347574"))) { 
this.state = 9;
}else 
{ BA.debugLineNum = 640;BA.debugLine="Else If camera = \"236967\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("236967"))) { 
this.state = 11;
}else 
{ BA.debugLineNum = 642;BA.debugLine="Else If camera = \"458236\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("458236"))) { 
this.state = 13;
}}}
if (true) break;

case 9:
//C
this.state = 14;
 BA.debugLineNum = 639;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
Debug.ShouldStop(1073741824);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("Driveway.jpg")),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 641;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
Debug.ShouldStop(1);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("FrontDoor.jpg")),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 643;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
Debug.ShouldStop(4);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("SideYard.jpg")),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 if (true) break;

case 14:
//C
this.state = 17;
;
 BA.debugLineNum = 645;BA.debugLine="File.Copy2(j.GetInputStream, out)";
Debug.ShouldStop(16);
parent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_j.runClassMethod (cloyd.blink.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())),(Object)((_out.getObject())));
 BA.debugLineNum = 646;BA.debugLine="out.Close '<------ very important";
Debug.ShouldStop(32);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 649;BA.debugLine="iv.SetImage(j.GetBitmap)";
Debug.ShouldStop(256);
_iv.runVoidMethod ("SetImage",(Object)((_j.runClassMethod (cloyd.blink.httpjob.class, "_getbitmap" /*RemoteObject*/ ).getObject())));
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 651;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
Debug.ShouldStop(1024);
parent._response = RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));
 BA.debugLineNum = 652;BA.debugLine="lblStatus.Text = GetRESTError(j.ErrorMessage)";
Debug.ShouldStop(2048);
parent._lblstatus.runMethod(true,"setText",_getresterror(_j.getField(true,"_errormessage" /*RemoteObject*/ )));
 if (true) break;

case 17:
//C
this.state = 20;
;
 BA.debugLineNum = 654;BA.debugLine="j.Release";
Debug.ShouldStop(8192);
_j.runClassMethod (cloyd.blink.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
 BA.debugLineNum = 656;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",main.ba))));
 if (true) break;
if (true) break;

case 20:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 658;BA.debugLine="Return Null";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 659;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject _j) throws Exception{
}
public static RemoteObject  _get_css() throws Exception{
try {
		Debug.PushSubsStack("Get_css (main) ","main",0,main.ba,main.mostCurrent,1249);
if (RapidSub.canDelegate("get_css")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","get_css");}
RemoteObject _jform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _scene = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _stylesheets = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 1249;BA.debugLine="Public Sub Get_css";
Debug.ShouldStop(1);
 BA.debugLineNum = 1250;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 1251;BA.debugLine="Dim jForm As JavaObject = MainForm";
Debug.ShouldStop(4);
_jform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), main._mainform);Debug.locals.put("jForm", _jform);
 BA.debugLineNum = 1252;BA.debugLine="Dim scene As JavaObject = jForm.GetField(\"scene\"";
Debug.ShouldStop(8);
_scene = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_scene = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("scene"))));Debug.locals.put("scene", _scene);
 BA.debugLineNum = 1253;BA.debugLine="Dim stylesheets As List = scene.RunMethod(\"getSt";
Debug.ShouldStop(16);
_stylesheets = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_stylesheets = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _scene.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getStylesheets")),(Object)((main.__c.getField(false,"Null")))));Debug.locals.put("stylesheets", _stylesheets);
 BA.debugLineNum = 1254;BA.debugLine="stylesheets.Clear";
Debug.ShouldStop(32);
_stylesheets.runVoidMethod ("Clear");
 BA.debugLineNum = 1255;BA.debugLine="stylesheets.Add(File.GetUri(File.DirAssets, imgI";
Debug.ShouldStop(64);
_stylesheets.runVoidMethod ("Add",(Object)((main.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable(".css")))))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e8.toString()); BA.debugLineNum = 1257;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 1259;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getauthinfo(RemoteObject _json) throws Exception{
try {
		Debug.PushSubsStack("GetAuthInfo (main) ","main",0,main.ba,main.mostCurrent,662);
if (RapidSub.canDelegate("getauthinfo")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","getauthinfo", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _force_password_reset = RemoteObject.createImmutable("");
RemoteObject _lockout_time_remaining = RemoteObject.createImmutable(0);
RemoteObject _authtokenmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _message = RemoteObject.createImmutable("");
RemoteObject _client = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _allow_pin_resend_seconds = RemoteObject.createImmutable(0);
RemoteObject _region = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _code = RemoteObject.createImmutable("");
RemoteObject _description = RemoteObject.createImmutable("");
RemoteObject _account = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _verification_required = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable(0);
Debug.locals.put("json", _json);
 BA.debugLineNum = 662;BA.debugLine="Sub GetAuthInfo(json As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 663;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 664;BA.debugLine="lblStatus.Text = \"Getting authtoken...\"";
Debug.ShouldStop(8388608);
main._lblstatus.runMethod(true,"setText",BA.ObjectToString("Getting authtoken..."));
 BA.debugLineNum = 680;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(128);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 681;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(256);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 682;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(512);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 683;BA.debugLine="Dim force_password_reset As String = root.Get(\"f";
Debug.ShouldStop(1024);
_force_password_reset = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("force_password_reset")))));Debug.locals.put("force_password_reset", _force_password_reset);Debug.locals.put("force_password_reset", _force_password_reset);
 BA.debugLineNum = 684;BA.debugLine="Dim lockout_time_remaining As Int = root.Get(\"lo";
Debug.ShouldStop(2048);
_lockout_time_remaining = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lockout_time_remaining")))));Debug.locals.put("lockout_time_remaining", _lockout_time_remaining);Debug.locals.put("lockout_time_remaining", _lockout_time_remaining);
 BA.debugLineNum = 685;BA.debugLine="Dim authtokenmap As Map = root.Get(\"authtoken\")";
Debug.ShouldStop(4096);
_authtokenmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_authtokenmap = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("authtoken")))));Debug.locals.put("authtokenmap", _authtokenmap);
 BA.debugLineNum = 686;BA.debugLine="authToken = authtokenmap.Get(\"authtoken\")";
Debug.ShouldStop(8192);
main._authtoken = BA.ObjectToString(_authtokenmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("authtoken")))));
 BA.debugLineNum = 687;BA.debugLine="Dim message As String = authtokenmap.Get(\"messag";
Debug.ShouldStop(16384);
_message = BA.ObjectToString(_authtokenmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("message")))));Debug.locals.put("message", _message);Debug.locals.put("message", _message);
 BA.debugLineNum = 688;BA.debugLine="Dim client As Map = root.Get(\"client\")";
Debug.ShouldStop(32768);
_client = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_client = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("client")))));Debug.locals.put("client", _client);
 BA.debugLineNum = 689;BA.debugLine="TwoClientFAVerificationRequired = client.Get(\"ve";
Debug.ShouldStop(65536);
main._twoclientfaverificationrequired = BA.ObjectToString(_client.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("verification_required")))));
 BA.debugLineNum = 690;BA.debugLine="TwoFAClientID = client.Get(\"id\")";
Debug.ShouldStop(131072);
main._twofaclientid = BA.ObjectToString(_client.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));
 BA.debugLineNum = 691;BA.debugLine="Dim allow_pin_resend_seconds As Int = root.Get(\"";
Debug.ShouldStop(262144);
_allow_pin_resend_seconds = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("allow_pin_resend_seconds")))));Debug.locals.put("allow_pin_resend_seconds", _allow_pin_resend_seconds);Debug.locals.put("allow_pin_resend_seconds", _allow_pin_resend_seconds);
 BA.debugLineNum = 692;BA.debugLine="Dim region As Map = root.Get(\"region\")";
Debug.ShouldStop(524288);
_region = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_region = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region")))));Debug.locals.put("region", _region);
 BA.debugLineNum = 693;BA.debugLine="Dim code As String = region.Get(\"code\") 'ignore";
Debug.ShouldStop(1048576);
_code = BA.ObjectToString(_region.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("code")))));Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 694;BA.debugLine="userRegion = region.Get(\"tier\")";
Debug.ShouldStop(2097152);
main._userregion = BA.ObjectToString(_region.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tier")))));
 BA.debugLineNum = 695;BA.debugLine="Dim description As String = region.Get(\"descript";
Debug.ShouldStop(4194304);
_description = BA.ObjectToString(_region.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("description")))));Debug.locals.put("description", _description);Debug.locals.put("description", _description);
 BA.debugLineNum = 696;BA.debugLine="Dim account As Map = root.Get(\"account\")";
Debug.ShouldStop(8388608);
_account = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_account = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("account")))));Debug.locals.put("account", _account);
 BA.debugLineNum = 697;BA.debugLine="Dim verification_required As String = account.Ge";
Debug.ShouldStop(16777216);
_verification_required = BA.ObjectToString(_account.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("verification_required")))));Debug.locals.put("verification_required", _verification_required);Debug.locals.put("verification_required", _verification_required);
 BA.debugLineNum = 698;BA.debugLine="Dim id As Int = account.Get(\"id\") 'ignore";
Debug.ShouldStop(33554432);
_id = BA.numberCast(int.class, _account.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e23) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e23.toString()); BA.debugLineNum = 700;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 703;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcamerainfo(RemoteObject _json,RemoteObject _clv) throws Exception{
try {
		Debug.PushSubsStack("GetCameraInfo (main) ","main",0,main.ba,main.mostCurrent,792);
if (RapidSub.canDelegate("getcamerainfo")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","getcamerainfo", _json, _clv);}
ResumableSub_GetCameraInfo rsub = new ResumableSub_GetCameraInfo(null,_json,_clv);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetCameraInfo extends BA.ResumableSub {
public ResumableSub_GetCameraInfo(cloyd.blink.main parent,RemoteObject _json,RemoteObject _clv) {
this.parent = parent;
this._json = _json;
this._clv = _clv;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
cloyd.blink.main parent;
RemoteObject _json;
RemoteObject _clv;
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _camera_status = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _total_108_wakeups = RemoteObject.createImmutable(0);
RemoteObject _battery_voltage = RemoteObject.createImmutable(0);
RemoteObject _light_sensor_data_valid = RemoteObject.createImmutable("");
RemoteObject _lfr_tb_wakeups = RemoteObject.createImmutable(0);
RemoteObject _fw_git_hash = RemoteObject.createImmutable("");
RemoteObject _wifi_strength = RemoteObject.createImmutable(0);
RemoteObject _lfr_strength = RemoteObject.createImmutable(0);
RemoteObject _total_tb_wakeups = RemoteObject.createImmutable(0);
RemoteObject _created_at = RemoteObject.createImmutable("");
RemoteObject _light_sensor_ch0 = RemoteObject.createImmutable(0);
RemoteObject _mac = RemoteObject.createImmutable("");
RemoteObject _unit_number = RemoteObject.createImmutable(0);
RemoteObject _updated_at = RemoteObject.createImmutable("");
RemoteObject _light_sensor_ch1 = RemoteObject.createImmutable(0);
RemoteObject _time_dhcp_lease = RemoteObject.createImmutable(0);
RemoteObject _temperature = RemoteObject.createImmutable(0);
RemoteObject _time_first_video = RemoteObject.createImmutable(0);
RemoteObject _time_dns_resolve = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _temp_alert_status = RemoteObject.createImmutable("");
RemoteObject _time_108_boot = RemoteObject.createImmutable(0);
RemoteObject _lfr_108_wakeups = RemoteObject.createImmutable(0);
RemoteObject _lifetime_duration = RemoteObject.createImmutable(0);
RemoteObject _wifi_connect_failure_count = RemoteObject.createImmutable(0);
RemoteObject _camera_id = RemoteObject.createImmutable(0);
RemoteObject _battery_alert_status = RemoteObject.createImmutable("");
RemoteObject _dhcp_failure_count = RemoteObject.createImmutable(0);
RemoteObject _ip_address = RemoteObject.createImmutable("");
RemoteObject _ipv = RemoteObject.createImmutable("");
RemoteObject _light_sensor_data_new = RemoteObject.createImmutable("");
RemoteObject _network_id = RemoteObject.createImmutable(0);
RemoteObject _account_id = RemoteObject.createImmutable(0);
RemoteObject _serial = RemoteObject.createImmutable("");
RemoteObject _dev_1 = RemoteObject.createImmutable(0);
RemoteObject _time_wlan_connect = RemoteObject.createImmutable(0);
RemoteObject _dev_2 = RemoteObject.createImmutable(0);
RemoteObject _socket_failure_count = RemoteObject.createImmutable(0);
RemoteObject _dev_3 = RemoteObject.createImmutable(0);
RemoteObject _pir_rejections = RemoteObject.createImmutable(0);
RemoteObject _sync_module_id = RemoteObject.createImmutable(0);
RemoteObject _lifetime_count = RemoteObject.createImmutable(0);
RemoteObject _error_codes = RemoteObject.createImmutable(0);
RemoteObject _fw_version = RemoteObject.createImmutable("");
RemoteObject _ac_power = RemoteObject.createImmutable("");
RemoteObject _strtimestamp = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _item = RemoteObject.createImmutable("");
int step115;
int limit115;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetCameraInfo (main) ","main",0,main.ba,main.mostCurrent,792);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("json", _json);
Debug.locals.put("clv", _clv);
 BA.debugLineNum = 793;BA.debugLine="Try";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 794;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(33554432);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 795;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(67108864);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 796;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(134217728);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 797;BA.debugLine="Dim camera_status As Map = root.Get(\"camera_stat";
Debug.ShouldStop(268435456);
_camera_status = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_camera_status = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("camera_status")))));Debug.locals.put("camera_status", _camera_status);
 BA.debugLineNum = 798;BA.debugLine="Dim total_108_wakeups As Int = camera_status.Get";
Debug.ShouldStop(536870912);
_total_108_wakeups = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_108_wakeups")))));Debug.locals.put("total_108_wakeups", _total_108_wakeups);Debug.locals.put("total_108_wakeups", _total_108_wakeups);
 BA.debugLineNum = 799;BA.debugLine="Dim battery_voltage As Int = camera_status.Get(\"";
Debug.ShouldStop(1073741824);
_battery_voltage = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("battery_voltage")))));Debug.locals.put("battery_voltage", _battery_voltage);Debug.locals.put("battery_voltage", _battery_voltage);
 BA.debugLineNum = 800;BA.debugLine="Dim light_sensor_data_valid As String = camera_s";
Debug.ShouldStop(-2147483648);
_light_sensor_data_valid = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("light_sensor_data_valid")))));Debug.locals.put("light_sensor_data_valid", _light_sensor_data_valid);Debug.locals.put("light_sensor_data_valid", _light_sensor_data_valid);
 BA.debugLineNum = 801;BA.debugLine="Dim lfr_tb_wakeups As Int = camera_status.Get(\"l";
Debug.ShouldStop(1);
_lfr_tb_wakeups = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lfr_tb_wakeups")))));Debug.locals.put("lfr_tb_wakeups", _lfr_tb_wakeups);Debug.locals.put("lfr_tb_wakeups", _lfr_tb_wakeups);
 BA.debugLineNum = 802;BA.debugLine="Dim fw_git_hash As String = camera_status.Get(\"f";
Debug.ShouldStop(2);
_fw_git_hash = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fw_git_hash")))));Debug.locals.put("fw_git_hash", _fw_git_hash);Debug.locals.put("fw_git_hash", _fw_git_hash);
 BA.debugLineNum = 803;BA.debugLine="Dim wifi_strength As Int = camera_status.Get(\"wi";
Debug.ShouldStop(4);
_wifi_strength = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("wifi_strength")))));Debug.locals.put("wifi_strength", _wifi_strength);Debug.locals.put("wifi_strength", _wifi_strength);
 BA.debugLineNum = 804;BA.debugLine="Dim lfr_strength As Int = camera_status.Get(\"lfr";
Debug.ShouldStop(8);
_lfr_strength = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lfr_strength")))));Debug.locals.put("lfr_strength", _lfr_strength);Debug.locals.put("lfr_strength", _lfr_strength);
 BA.debugLineNum = 805;BA.debugLine="Dim total_tb_wakeups As Int = camera_status.Get(";
Debug.ShouldStop(16);
_total_tb_wakeups = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_tb_wakeups")))));Debug.locals.put("total_tb_wakeups", _total_tb_wakeups);Debug.locals.put("total_tb_wakeups", _total_tb_wakeups);
 BA.debugLineNum = 806;BA.debugLine="Dim created_at As String = camera_status.Get(\"cr";
Debug.ShouldStop(32);
_created_at = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 807;BA.debugLine="Dim light_sensor_ch0 As Int = camera_status.Get(";
Debug.ShouldStop(64);
_light_sensor_ch0 = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("light_sensor_ch0")))));Debug.locals.put("light_sensor_ch0", _light_sensor_ch0);Debug.locals.put("light_sensor_ch0", _light_sensor_ch0);
 BA.debugLineNum = 808;BA.debugLine="Dim mac As String = camera_status.Get(\"mac\")";
Debug.ShouldStop(128);
_mac = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mac")))));Debug.locals.put("mac", _mac);Debug.locals.put("mac", _mac);
 BA.debugLineNum = 809;BA.debugLine="Dim unit_number As Int = camera_status.Get(\"unit";
Debug.ShouldStop(256);
_unit_number = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("unit_number")))));Debug.locals.put("unit_number", _unit_number);Debug.locals.put("unit_number", _unit_number);
 BA.debugLineNum = 810;BA.debugLine="Dim updated_at As String = camera_status.Get(\"up";
Debug.ShouldStop(512);
_updated_at = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("updated_at")))));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 811;BA.debugLine="Dim light_sensor_ch1 As Int = camera_status.Get(";
Debug.ShouldStop(1024);
_light_sensor_ch1 = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("light_sensor_ch1")))));Debug.locals.put("light_sensor_ch1", _light_sensor_ch1);Debug.locals.put("light_sensor_ch1", _light_sensor_ch1);
 BA.debugLineNum = 812;BA.debugLine="Dim time_dhcp_lease As Int = camera_status.Get(\"";
Debug.ShouldStop(2048);
_time_dhcp_lease = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("time_dhcp_lease")))));Debug.locals.put("time_dhcp_lease", _time_dhcp_lease);Debug.locals.put("time_dhcp_lease", _time_dhcp_lease);
 BA.debugLineNum = 813;BA.debugLine="Dim temperature As Int = camera_status.Get(\"temp";
Debug.ShouldStop(4096);
_temperature = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("temperature")))));Debug.locals.put("temperature", _temperature);Debug.locals.put("temperature", _temperature);
 BA.debugLineNum = 814;BA.debugLine="Dim time_first_video As Int = camera_status.Get(";
Debug.ShouldStop(8192);
_time_first_video = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("time_first_video")))));Debug.locals.put("time_first_video", _time_first_video);Debug.locals.put("time_first_video", _time_first_video);
 BA.debugLineNum = 815;BA.debugLine="Dim time_dns_resolve As Int = camera_status.Get(";
Debug.ShouldStop(16384);
_time_dns_resolve = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("time_dns_resolve")))));Debug.locals.put("time_dns_resolve", _time_dns_resolve);Debug.locals.put("time_dns_resolve", _time_dns_resolve);
 BA.debugLineNum = 816;BA.debugLine="Dim id As Int = camera_status.Get(\"id\")";
Debug.ShouldStop(32768);
_id = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 817;BA.debugLine="Dim temp_alert_status As String = camera_status.";
Debug.ShouldStop(65536);
_temp_alert_status = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("temp_alert_status")))));Debug.locals.put("temp_alert_status", _temp_alert_status);Debug.locals.put("temp_alert_status", _temp_alert_status);
 BA.debugLineNum = 818;BA.debugLine="Dim time_108_boot As Int = camera_status.Get(\"ti";
Debug.ShouldStop(131072);
_time_108_boot = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("time_108_boot")))));Debug.locals.put("time_108_boot", _time_108_boot);Debug.locals.put("time_108_boot", _time_108_boot);
 BA.debugLineNum = 819;BA.debugLine="Dim lfr_108_wakeups As Int = camera_status.Get(\"";
Debug.ShouldStop(262144);
_lfr_108_wakeups = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lfr_108_wakeups")))));Debug.locals.put("lfr_108_wakeups", _lfr_108_wakeups);Debug.locals.put("lfr_108_wakeups", _lfr_108_wakeups);
 BA.debugLineNum = 820;BA.debugLine="cameraThumbnail = camera_status.Get(\"thumbnail\")";
Debug.ShouldStop(524288);
parent._camerathumbnail = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("thumbnail")))));
 BA.debugLineNum = 821;BA.debugLine="Dim lifetime_duration As Int = camera_status.Get";
Debug.ShouldStop(1048576);
_lifetime_duration = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lifetime_duration")))));Debug.locals.put("lifetime_duration", _lifetime_duration);Debug.locals.put("lifetime_duration", _lifetime_duration);
 BA.debugLineNum = 822;BA.debugLine="Dim wifi_connect_failure_count As Int = camera_s";
Debug.ShouldStop(2097152);
_wifi_connect_failure_count = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("wifi_connect_failure_count")))));Debug.locals.put("wifi_connect_failure_count", _wifi_connect_failure_count);Debug.locals.put("wifi_connect_failure_count", _wifi_connect_failure_count);
 BA.debugLineNum = 823;BA.debugLine="Dim camera_id As Int = camera_status.Get(\"camera";
Debug.ShouldStop(4194304);
_camera_id = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("camera_id")))));Debug.locals.put("camera_id", _camera_id);Debug.locals.put("camera_id", _camera_id);
 BA.debugLineNum = 824;BA.debugLine="Dim battery_alert_status As String = camera_stat";
Debug.ShouldStop(8388608);
_battery_alert_status = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("battery_alert_status")))));Debug.locals.put("battery_alert_status", _battery_alert_status);Debug.locals.put("battery_alert_status", _battery_alert_status);
 BA.debugLineNum = 825;BA.debugLine="Dim dhcp_failure_count As Int = camera_status.Ge";
Debug.ShouldStop(16777216);
_dhcp_failure_count = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("dhcp_failure_count")))));Debug.locals.put("dhcp_failure_count", _dhcp_failure_count);Debug.locals.put("dhcp_failure_count", _dhcp_failure_count);
 BA.debugLineNum = 826;BA.debugLine="Dim ip_address As String = camera_status.Get(\"ip";
Debug.ShouldStop(33554432);
_ip_address = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ip_address")))));Debug.locals.put("ip_address", _ip_address);Debug.locals.put("ip_address", _ip_address);
 BA.debugLineNum = 827;BA.debugLine="Dim ipv As String = camera_status.Get(\"ipv\")";
Debug.ShouldStop(67108864);
_ipv = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ipv")))));Debug.locals.put("ipv", _ipv);Debug.locals.put("ipv", _ipv);
 BA.debugLineNum = 828;BA.debugLine="Dim light_sensor_data_new As String = camera_sta";
Debug.ShouldStop(134217728);
_light_sensor_data_new = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("light_sensor_data_new")))));Debug.locals.put("light_sensor_data_new", _light_sensor_data_new);Debug.locals.put("light_sensor_data_new", _light_sensor_data_new);
 BA.debugLineNum = 829;BA.debugLine="Dim network_id As Int = camera_status.Get(\"netwo";
Debug.ShouldStop(268435456);
_network_id = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("network_id")))));Debug.locals.put("network_id", _network_id);Debug.locals.put("network_id", _network_id);
 BA.debugLineNum = 830;BA.debugLine="Dim account_id As Int = camera_status.Get(\"accou";
Debug.ShouldStop(536870912);
_account_id = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("account_id")))));Debug.locals.put("account_id", _account_id);Debug.locals.put("account_id", _account_id);
 BA.debugLineNum = 831;BA.debugLine="Dim serial As String = camera_status.Get(\"serial";
Debug.ShouldStop(1073741824);
_serial = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("serial")))));Debug.locals.put("serial", _serial);Debug.locals.put("serial", _serial);
 BA.debugLineNum = 832;BA.debugLine="Dim dev_1 As Int = camera_status.Get(\"dev_1\")";
Debug.ShouldStop(-2147483648);
_dev_1 = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("dev_1")))));Debug.locals.put("dev_1", _dev_1);Debug.locals.put("dev_1", _dev_1);
 BA.debugLineNum = 833;BA.debugLine="Dim time_wlan_connect As Int = camera_status.Get";
Debug.ShouldStop(1);
_time_wlan_connect = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("time_wlan_connect")))));Debug.locals.put("time_wlan_connect", _time_wlan_connect);Debug.locals.put("time_wlan_connect", _time_wlan_connect);
 BA.debugLineNum = 834;BA.debugLine="Dim dev_2 As Int = camera_status.Get(\"dev_2\")";
Debug.ShouldStop(2);
_dev_2 = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("dev_2")))));Debug.locals.put("dev_2", _dev_2);Debug.locals.put("dev_2", _dev_2);
 BA.debugLineNum = 835;BA.debugLine="Dim socket_failure_count As Int = camera_status.";
Debug.ShouldStop(4);
_socket_failure_count = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("socket_failure_count")))));Debug.locals.put("socket_failure_count", _socket_failure_count);Debug.locals.put("socket_failure_count", _socket_failure_count);
 BA.debugLineNum = 836;BA.debugLine="Dim dev_3 As Int = camera_status.Get(\"dev_3\")";
Debug.ShouldStop(8);
_dev_3 = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("dev_3")))));Debug.locals.put("dev_3", _dev_3);Debug.locals.put("dev_3", _dev_3);
 BA.debugLineNum = 837;BA.debugLine="Dim pir_rejections As Int = camera_status.Get(\"p";
Debug.ShouldStop(16);
_pir_rejections = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pir_rejections")))));Debug.locals.put("pir_rejections", _pir_rejections);Debug.locals.put("pir_rejections", _pir_rejections);
 BA.debugLineNum = 838;BA.debugLine="Dim sync_module_id As Int = camera_status.Get(\"s";
Debug.ShouldStop(32);
_sync_module_id = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("sync_module_id")))));Debug.locals.put("sync_module_id", _sync_module_id);Debug.locals.put("sync_module_id", _sync_module_id);
 BA.debugLineNum = 839;BA.debugLine="Dim lifetime_count As Int = camera_status.Get(\"l";
Debug.ShouldStop(64);
_lifetime_count = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lifetime_count")))));Debug.locals.put("lifetime_count", _lifetime_count);Debug.locals.put("lifetime_count", _lifetime_count);
 BA.debugLineNum = 840;BA.debugLine="Dim error_codes As Int = camera_status.Get(\"erro";
Debug.ShouldStop(128);
_error_codes = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("error_codes")))));Debug.locals.put("error_codes", _error_codes);Debug.locals.put("error_codes", _error_codes);
 BA.debugLineNum = 841;BA.debugLine="Dim fw_version As String = camera_status.Get(\"fw";
Debug.ShouldStop(256);
_fw_version = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fw_version")))));Debug.locals.put("fw_version", _fw_version);Debug.locals.put("fw_version", _fw_version);
 BA.debugLineNum = 842;BA.debugLine="Dim ac_power As String = camera_status.Get(\"ac_p";
Debug.ShouldStop(512);
_ac_power = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ac_power")))));Debug.locals.put("ac_power", _ac_power);Debug.locals.put("ac_power", _ac_power);
 BA.debugLineNum = 844;BA.debugLine="If clv = Null Then";
Debug.ShouldStop(2048);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("n",_clv)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 845;BA.debugLine="Return Null";
Debug.ShouldStop(4096);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 847;BA.debugLine="clv.Clear";
Debug.ShouldStop(16384);
_clv.runVoidMethod ("_clear");
 BA.debugLineNum = 848;BA.debugLine="clv.AddTextItem(\"Battery voltage: \" & NumberForm";
Debug.ShouldStop(32768);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Battery voltage: "),parent.__c.runMethod(true,"NumberFormat",(Object)((RemoteObject.solve(new RemoteObject[] {_battery_voltage,RemoteObject.createImmutable(100)}, "/",0, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))),RemoteObject.createImmutable("V")))),(Object)((RemoteObject.createImmutable("battery_voltage"))));
 BA.debugLineNum = 849;BA.debugLine="clv.AddTextItem(\"Camera to WiFi strength: \" & wi";
Debug.ShouldStop(65536);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Camera to WiFi strength: "),_wifi_strength,RemoteObject.createImmutable(" dBm - "),_checklfrlevel(_wifi_strength)))),(Object)((RemoteObject.createImmutable("wifi_strength"))));
 BA.debugLineNum = 850;BA.debugLine="clv.AddTextItem(\"Camera to Sync Module strength";
Debug.ShouldStop(131072);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Camera to Sync Module strength (LFR): "),_lfr_strength,RemoteObject.createImmutable(" dBm - "),_checklfrlevel(_lfr_strength)))),(Object)((RemoteObject.createImmutable("lfr_strength"))));
 BA.debugLineNum = 851;BA.debugLine="clv.AddTextItem(\"Temperature: \" & temperature &";
Debug.ShouldStop(262144);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Temperature: "),_temperature,RemoteObject.createImmutable("ºF")))),(Object)((RemoteObject.createImmutable("temperature"))));
 BA.debugLineNum = 852;BA.debugLine="clv.AddTextItem(\"Firmware version: \" & fw_versio";
Debug.ShouldStop(524288);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Firmware version: "),_fw_version))),(Object)((RemoteObject.createImmutable("fw_version"))));
 BA.debugLineNum = 853;BA.debugLine="clv.AddTextItem(\"Firmware Git Hash: \" & fw_git_h";
Debug.ShouldStop(1048576);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Firmware Git Hash: "),_fw_git_hash))),(Object)((RemoteObject.createImmutable("fw_git_hash"))));
 BA.debugLineNum = 854;BA.debugLine="clv.AddTextItem(\"Battery alert status: \" & batte";
Debug.ShouldStop(2097152);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Battery alert status: "),_battery_alert_status))),(Object)((RemoteObject.createImmutable("battery_alert_status"))));
 BA.debugLineNum = 855;BA.debugLine="clv.AddTextItem(\"Temperature alert status: \" & t";
Debug.ShouldStop(4194304);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Temperature alert status: "),_temp_alert_status))),(Object)((RemoteObject.createImmutable("temp_alert_status"))));
 BA.debugLineNum = 856;BA.debugLine="clv.AddTextItem(\"Updated at: \" & ConvertDateTime";
Debug.ShouldStop(8388608);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Updated at: "),_convertdatetimeplain(_updated_at)))),(Object)((RemoteObject.createImmutable("updated_at"))));
 BA.debugLineNum = 857;BA.debugLine="clv.AddTextItem(\"Created at: \" & ConvertDateTime";
Debug.ShouldStop(16777216);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Created at: "),_convertdatetimeplain(_created_at)))),(Object)((RemoteObject.createImmutable("created_at"))));
 BA.debugLineNum = 858;BA.debugLine="clv.AddTextItem(\"IP address: \" & ip_address, \"ip";
Debug.ShouldStop(33554432);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("IP address: "),_ip_address))),(Object)((RemoteObject.createImmutable("ip_address"))));
 BA.debugLineNum = 859;BA.debugLine="clv.AddTextItem(\"MAC address: \" & mac, \"mac\")";
Debug.ShouldStop(67108864);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("MAC address: "),_mac))),(Object)((RemoteObject.createImmutable("mac"))));
 BA.debugLineNum = 860;BA.debugLine="clv.AddTextItem(\"Camera ID: \" & camera_id, \"came";
Debug.ShouldStop(134217728);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Camera ID: "),_camera_id))),(Object)((RemoteObject.createImmutable("camera_id"))));
 BA.debugLineNum = 861;BA.debugLine="clv.AddTextItem(\"Serial: \" & serial, \"serial\")";
Debug.ShouldStop(268435456);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Serial: "),_serial))),(Object)((RemoteObject.createImmutable("serial"))));
 BA.debugLineNum = 862;BA.debugLine="clv.AddTextItem(\"Network ID: \" & network_id, \"ne";
Debug.ShouldStop(536870912);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Network ID: "),_network_id))),(Object)((RemoteObject.createImmutable("network_id"))));
 BA.debugLineNum = 863;BA.debugLine="clv.AddTextItem(\"Account ID: \" & account_id, \"ac";
Debug.ShouldStop(1073741824);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Account ID: "),_account_id))),(Object)((RemoteObject.createImmutable("account_id"))));
 BA.debugLineNum = 864;BA.debugLine="clv.AddTextItem(\"ID: \" & id, \"id\")";
Debug.ShouldStop(-2147483648);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("ID: "),_id))),(Object)((RemoteObject.createImmutable("id"))));
 BA.debugLineNum = 865;BA.debugLine="clv.AddTextItem(\"Sync Module ID: \" & sync_module";
Debug.ShouldStop(1);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Sync Module ID: "),_sync_module_id))),(Object)((RemoteObject.createImmutable("sync_module_id"))));
 BA.debugLineNum = 866;BA.debugLine="clv.AddTextItem(\"Light sensor data valid: \" & li";
Debug.ShouldStop(2);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Light sensor data valid: "),_light_sensor_data_valid))),(Object)((RemoteObject.createImmutable("light_sensor_data_valid"))));
 BA.debugLineNum = 867;BA.debugLine="clv.AddTextItem(\"DHCP failure count: \" & dhcp_fa";
Debug.ShouldStop(4);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("DHCP failure count: "),_dhcp_failure_count))),(Object)((RemoteObject.createImmutable("dhcp_failure_count"))));
 BA.debugLineNum = 868;BA.debugLine="clv.AddTextItem(\"LFR tb wakeups: \" & lfr_tb_wake";
Debug.ShouldStop(8);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("LFR tb wakeups: "),_lfr_tb_wakeups))),(Object)((RemoteObject.createImmutable("lfr_tb_wakeups"))));
 BA.debugLineNum = 869;BA.debugLine="clv.AddTextItem(\"Socket failure count: \" & socke";
Debug.ShouldStop(16);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Socket failure count: "),_socket_failure_count))),(Object)((RemoteObject.createImmutable("socket_failure_count"))));
 BA.debugLineNum = 870;BA.debugLine="clv.AddTextItem(\"Camera thumbnail: \" & cameraThu";
Debug.ShouldStop(32);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Camera thumbnail: "),parent._camerathumbnail))),(Object)((RemoteObject.createImmutable("thumbnail"))));
 BA.debugLineNum = 871;BA.debugLine="clv.AddTextItem(\"WiFi connect failure count: \" &";
Debug.ShouldStop(64);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("WiFi connect failure count: "),_wifi_connect_failure_count))),(Object)((RemoteObject.createImmutable("wifi_connect_failure_count"))));
 BA.debugLineNum = 872;BA.debugLine="clv.AddTextItem(\"Error codes: \" & error_codes, \"";
Debug.ShouldStop(128);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Error codes: "),_error_codes))),(Object)((RemoteObject.createImmutable("error_codes"))));
 BA.debugLineNum = 873;BA.debugLine="clv.AddTextItem(\"AC power: \" & ac_power, \"ac_pow";
Debug.ShouldStop(256);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("AC power: "),_ac_power))),(Object)((RemoteObject.createImmutable("ac_power"))));
 BA.debugLineNum = 874;BA.debugLine="clv.AddTextItem(\"Total 108 wakeups: \" & total_10";
Debug.ShouldStop(512);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Total 108 wakeups: "),_total_108_wakeups))),(Object)((RemoteObject.createImmutable("total_108_wakeups"))));
 BA.debugLineNum = 875;BA.debugLine="clv.AddTextItem(\"Total Tb wakeups: \" & total_tb_";
Debug.ShouldStop(1024);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Total Tb wakeups: "),_total_tb_wakeups))),(Object)((RemoteObject.createImmutable("total_tb_wakeups"))));
 BA.debugLineNum = 876;BA.debugLine="clv.AddTextItem(\"Light sensor ch0: \" & light_sen";
Debug.ShouldStop(2048);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Light sensor ch0: "),_light_sensor_ch0))),(Object)((RemoteObject.createImmutable("light_sensor_ch0"))));
 BA.debugLineNum = 877;BA.debugLine="clv.AddTextItem(\"Unit number: \" & unit_number, \"";
Debug.ShouldStop(4096);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Unit number: "),_unit_number))),(Object)((RemoteObject.createImmutable("unit_number"))));
 BA.debugLineNum = 878;BA.debugLine="clv.AddTextItem(\"Light sensor ch1: \" & light_sen";
Debug.ShouldStop(8192);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Light sensor ch1: "),_light_sensor_ch1))),(Object)((RemoteObject.createImmutable("light_sensor_ch1"))));
 BA.debugLineNum = 879;BA.debugLine="clv.AddTextItem(\"Time dhcp lease: \" & time_dhcp_";
Debug.ShouldStop(16384);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Time dhcp lease: "),_time_dhcp_lease))),(Object)((RemoteObject.createImmutable("time_dhcp_lease"))));
 BA.debugLineNum = 880;BA.debugLine="clv.AddTextItem(\"Time first video: \" & time_firs";
Debug.ShouldStop(32768);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Time first video: "),_time_first_video))),(Object)((RemoteObject.createImmutable("time_first_video"))));
 BA.debugLineNum = 881;BA.debugLine="clv.AddTextItem(\"Time dns resolve: \" & time_dns_";
Debug.ShouldStop(65536);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Time dns resolve: "),_time_dns_resolve))),(Object)((RemoteObject.createImmutable("time_dns_resolve"))));
 BA.debugLineNum = 882;BA.debugLine="clv.AddTextItem(\"Time 108 boot: \" & time_108_boo";
Debug.ShouldStop(131072);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Time 108 boot: "),_time_108_boot))),(Object)((RemoteObject.createImmutable("time_108_boot"))));
 BA.debugLineNum = 883;BA.debugLine="clv.AddTextItem(\"LFR 108 wakeups: \" & lfr_108_wa";
Debug.ShouldStop(262144);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("LFR 108 wakeups: "),_lfr_108_wakeups))),(Object)((RemoteObject.createImmutable("lfr_108_wakeups"))));
 BA.debugLineNum = 884;BA.debugLine="clv.AddTextItem(\"lifetime duration: \" & lifetime";
Debug.ShouldStop(524288);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("lifetime duration: "),_lifetime_duration))),(Object)((RemoteObject.createImmutable("lifetime_duration"))));
 BA.debugLineNum = 885;BA.debugLine="clv.AddTextItem(\"lpv: \" & ipv, \"ipv\")";
Debug.ShouldStop(1048576);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("lpv: "),_ipv))),(Object)((RemoteObject.createImmutable("ipv"))));
 BA.debugLineNum = 886;BA.debugLine="clv.AddTextItem(\"light sensor data new: \" & ligh";
Debug.ShouldStop(2097152);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("light sensor data new: "),_light_sensor_data_new))),(Object)((RemoteObject.createImmutable("light_sensor_data_new"))));
 BA.debugLineNum = 887;BA.debugLine="clv.AddTextItem(\"Dev_1: \" & dev_1, \"dev_1\")";
Debug.ShouldStop(4194304);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Dev_1: "),_dev_1))),(Object)((RemoteObject.createImmutable("dev_1"))));
 BA.debugLineNum = 888;BA.debugLine="clv.AddTextItem(\"Dev_2: \" & dev_2, \"dev_2\")";
Debug.ShouldStop(8388608);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Dev_2: "),_dev_2))),(Object)((RemoteObject.createImmutable("dev_2"))));
 BA.debugLineNum = 889;BA.debugLine="clv.AddTextItem(\"Dev_3: \" & dev_3, \"dev_3\")";
Debug.ShouldStop(16777216);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Dev_3: "),_dev_3))),(Object)((RemoteObject.createImmutable("dev_3"))));
 BA.debugLineNum = 890;BA.debugLine="clv.AddTextItem(\"Time wlan connect: \" & time_wla";
Debug.ShouldStop(33554432);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Time wlan connect: "),_time_wlan_connect))),(Object)((RemoteObject.createImmutable("time_wlan_connect"))));
 BA.debugLineNum = 891;BA.debugLine="clv.AddTextItem(\"PIR rejections: \" & pir_rejecti";
Debug.ShouldStop(67108864);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("PIR rejections: "),_pir_rejections))),(Object)((RemoteObject.createImmutable("pir_rejections"))));
 BA.debugLineNum = 892;BA.debugLine="clv.AddTextItem(\"Lifetime count: \" & lifetime_co";
Debug.ShouldStop(134217728);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Lifetime count: "),_lifetime_count))),(Object)((RemoteObject.createImmutable("lifetime_count"))));
 BA.debugLineNum = 894;BA.debugLine="Dim strTimestamp As String";
Debug.ShouldStop(536870912);
_strtimestamp = RemoteObject.createImmutable("");Debug.locals.put("strTimestamp", _strtimestamp);
 BA.debugLineNum = 895;BA.debugLine="strTimestamp = ConvertDateTime(updated_at)";
Debug.ShouldStop(1073741824);
_strtimestamp = _convertdatetime(_updated_at);Debug.locals.put("strTimestamp", _strtimestamp);
 BA.debugLineNum = 896;BA.debugLine="lblStatus.Text = \"Last updated: \" & strTimestamp";
Debug.ShouldStop(-2147483648);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Last updated: "),_strtimestamp));
 BA.debugLineNum = 897;BA.debugLine="If clv = clvDriveway Then";
Debug.ShouldStop(1);
if (true) break;

case 8:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",_clv,parent._clvdriveway)) { 
this.state = 10;
}else 
{ BA.debugLineNum = 900;BA.debugLine="Else If clv = clvFrontDoor Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_clv,parent._clvfrontdoor)) { 
this.state = 12;
}else 
{ BA.debugLineNum = 904;BA.debugLine="Else If clv = clvSideYard Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_clv,parent._clvsideyard)) { 
this.state = 14;
}}}
if (true) break;

case 10:
//C
this.state = 15;
 BA.debugLineNum = 898;BA.debugLine="lblDriveway.Text = strTimestamp & \" \" & drivewa";
Debug.ShouldStop(2);
parent._lbldriveway.runMethod(true,"setText",RemoteObject.concat(_strtimestamp,RemoteObject.createImmutable(" "),parent._drivewayarmedstatus));
 BA.debugLineNum = 899;BA.debugLine="prevDrivewayUpdateTime = updated_at";
Debug.ShouldStop(4);
parent._prevdrivewayupdatetime = _updated_at;
 if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 901;BA.debugLine="lblFrontDoor.Text = strTimestamp & \" \" & frontd";
Debug.ShouldStop(16);
parent._lblfrontdoor.runMethod(true,"setText",RemoteObject.concat(_strtimestamp,RemoteObject.createImmutable(" "),parent._frontdoorarmedstatus));
 BA.debugLineNum = 902;BA.debugLine="lblDriveway.Text = ConvertDateTime(prevDriveway";
Debug.ShouldStop(32);
parent._lbldriveway.runMethod(true,"setText",RemoteObject.concat(_convertdatetime(parent._prevdrivewayupdatetime),RemoteObject.createImmutable(" "),parent._drivewayarmedstatus));
 BA.debugLineNum = 903;BA.debugLine="prevFrontDoorUpdateTime = updated_at";
Debug.ShouldStop(64);
parent._prevfrontdoorupdatetime = _updated_at;
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 905;BA.debugLine="lblSideYard.Text = strTimestamp & \" \" & sideyar";
Debug.ShouldStop(256);
parent._lblsideyard.runMethod(true,"setText",RemoteObject.concat(_strtimestamp,RemoteObject.createImmutable(" "),parent._sideyardarmedstatus));
 BA.debugLineNum = 906;BA.debugLine="lblDriveway.Text = ConvertDateTime(prevDriveway";
Debug.ShouldStop(512);
parent._lbldriveway.runMethod(true,"setText",RemoteObject.concat(_convertdatetime(parent._prevdrivewayupdatetime),RemoteObject.createImmutable(" "),parent._drivewayarmedstatus));
 BA.debugLineNum = 907;BA.debugLine="lblFrontDoor.Text = ConvertDateTime(prevFrontDo";
Debug.ShouldStop(1024);
parent._lblfrontdoor.runMethod(true,"setText",RemoteObject.concat(_convertdatetime(parent._prevfrontdoorupdatetime),RemoteObject.createImmutable(" "),parent._frontdoorarmedstatus));
 if (true) break;
;
 BA.debugLineNum = 910;BA.debugLine="For i = 0 To clv.Size-1";
Debug.ShouldStop(8192);

case 15:
//for
this.state = 26;
step115 = 1;
limit115 = RemoteObject.solve(new RemoteObject[] {_clv.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 911;BA.debugLine="Dim item As String";
Debug.ShouldStop(16384);
_item = RemoteObject.createImmutable("");Debug.locals.put("item", _item);
 BA.debugLineNum = 912;BA.debugLine="item = clv.GetValue(i)";
Debug.ShouldStop(32768);
_item = BA.ObjectToString(_clv.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("item", _item);
 BA.debugLineNum = 913;BA.debugLine="If item.Contains(\"thumbnail\") Then";
Debug.ShouldStop(65536);
if (true) break;

case 18:
//if
this.state = 25;
if (_item.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("thumbnail"))).<Boolean>get().booleanValue()) { 
this.state = 20;
}else 
{ BA.debugLineNum = 915;BA.debugLine="Else If item.Contains(\"_strength\") Then";
Debug.ShouldStop(262144);
if (_item.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("_strength"))).<Boolean>get().booleanValue()) { 
this.state = 22;
}else {
this.state = 24;
}}
if (true) break;

case 20:
//C
this.state = 25;
 BA.debugLineNum = 914;BA.debugLine="clv.ResizeItem(i,80dip)";
Debug.ShouldStop(131072);
_clv.runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))));
 if (true) break;

case 22:
//C
this.state = 25;
 BA.debugLineNum = 916;BA.debugLine="clv.ResizeItem(i,45dip)";
Debug.ShouldStop(524288);
_clv.runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)))));
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 918;BA.debugLine="clv.ResizeItem(i,35dip)";
Debug.ShouldStop(2097152);
_clv.runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))));
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
Debug.locals.put("i", _i);
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 0;
 BA.debugLineNum = 922;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",main.ba))));
 if (true) break;
if (true) break;

case 29:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 924;BA.debugLine="Return Null";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 925;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _getcommandid(RemoteObject _json) throws Exception{
try {
		Debug.PushSubsStack("GetCommandID (main) ","main",0,main.ba,main.mostCurrent,705);
if (RapidSub.canDelegate("getcommandid")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","getcommandid", _json);}
ResumableSub_GetCommandID rsub = new ResumableSub_GetCommandID(null,_json);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetCommandID extends BA.ResumableSub {
public ResumableSub_GetCommandID(cloyd.blink.main parent,RemoteObject _json) {
this.parent = parent;
this._json = _json;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
cloyd.blink.main parent;
RemoteObject _json;
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetCommandID (main) ","main",0,main.ba,main.mostCurrent,705);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("json", _json);
 BA.debugLineNum = 706;BA.debugLine="Try";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 707;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(4);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 708;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(8);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 709;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(16);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 724;BA.debugLine="commandID = root.Get(\"id\")";
Debug.ShouldStop(524288);
parent._commandid = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));
 BA.debugLineNum = 725;BA.debugLine="Log(\"commandID: \" & commandID)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("commandID: "),parent._commandid)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 747;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",main.ba))));
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 749;BA.debugLine="Return Null";
Debug.ShouldStop(4096);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 750;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _getcommandresponse(RemoteObject _iv,RemoteObject _clv,RemoteObject _camera,RemoteObject _attempts,RemoteObject _attemptsallowed) throws Exception{
try {
		Debug.PushSubsStack("GetCommandResponse (main) ","main",0,main.ba,main.mostCurrent,525);
if (RapidSub.canDelegate("getcommandresponse")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","getcommandresponse", _iv, _clv, _camera, _attempts, _attemptsallowed);}
ResumableSub_GetCommandResponse rsub = new ResumableSub_GetCommandResponse(null,_iv,_clv,_camera,_attempts,_attemptsallowed);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetCommandResponse extends BA.ResumableSub {
public ResumableSub_GetCommandResponse(cloyd.blink.main parent,RemoteObject _iv,RemoteObject _clv,RemoteObject _camera,RemoteObject _attempts,RemoteObject _attemptsallowed) {
this.parent = parent;
this._iv = _iv;
this._clv = _clv;
this._camera = _camera;
this._attempts = _attempts;
this._attemptsallowed = _attemptsallowed;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
cloyd.blink.main parent;
RemoteObject _iv;
RemoteObject _clv;
RemoteObject _camera;
RemoteObject _attempts;
RemoteObject _attemptsallowed;
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetCommandResponse (main) ","main",0,main.ba,main.mostCurrent,525);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("iv", _iv);
Debug.locals.put("clv", _clv);
Debug.locals.put("camera", _camera);
Debug.locals.put("attempts", _attempts);
Debug.locals.put("attemptsAllowed", _attemptsallowed);
 BA.debugLineNum = 526;BA.debugLine="Dim rs As ResumableSub = GetCommandStatus(respons";
Debug.ShouldStop(8192);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _getcommandstatus(parent._response);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 527;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "getcommandresponse"), _rs);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 528;BA.debugLine="If commandComplete Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 4;
if (parent._commandcomplete.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 530;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-\"";
Debug.ShouldStop(131072);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/camera/"),_camera));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 531;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "getcommandresponse"), _rs);
this.state = 20;
return;
case 20:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 533;BA.debugLine="Dim rs As ResumableSub = GetCameraInfo(response,";
Debug.ShouldStop(1048576);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _getcamerainfo(parent._response,_clv);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 534;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "getcommandresponse"), _rs);
this.state = 21;
return;
case 21:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 536;BA.debugLine="Dim rs As ResumableSub = DownloadImage(\"https://";
Debug.ShouldStop(8388608);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _downloadimage(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/"),parent._camerathumbnail,RemoteObject.createImmutable(".jpg")),_iv,_camera);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 537;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "getcommandresponse"), _rs);
this.state = 22;
return;
case 22:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 539;BA.debugLine="Return True";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 542;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-\"";
Debug.ShouldStop(536870912);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/camera/"),_camera));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 543;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "getcommandresponse"), _rs);
this.state = 23;
return;
case 23:
//C
this.state = 5;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 546;BA.debugLine="Dim rs As ResumableSub = GetCameraInfo(response,N";
Debug.ShouldStop(2);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _getcamerainfo(parent._response,(parent.__c.getField(false,"Null")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 547;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "getcommandresponse"), _rs);
this.state = 24;
return;
case 24:
//C
this.state = 5;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 549;BA.debugLine="If prevCameraThumbnail <> \"\" And prevCameraThumbn";
Debug.ShouldStop(16);
if (true) break;

case 5:
//if
this.state = 18;
if (RemoteObject.solveBoolean("!",parent._prevcamerathumbnail,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",parent._prevcamerathumbnail,parent._camerathumbnail)) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 18;
 BA.debugLineNum = 550;BA.debugLine="Log(\"**** ALRIGHT \" & attempts & \"/\" & attemptsA";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("**** ALRIGHT "),_attempts,RemoteObject.createImmutable("/"),_attemptsallowed,RemoteObject.createImmutable(" *****"))));
 BA.debugLineNum = 551;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-\"";
Debug.ShouldStop(64);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/camera/"),_camera));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 552;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "getcommandresponse"), _rs);
this.state = 25;
return;
case 25:
//C
this.state = 18;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 554;BA.debugLine="Dim rs As ResumableSub = GetCameraInfo(response,";
Debug.ShouldStop(512);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _getcamerainfo(parent._response,_clv);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 555;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "getcommandresponse"), _rs);
this.state = 26;
return;
case 26:
//C
this.state = 18;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 557;BA.debugLine="Dim rs As ResumableSub = DownloadImage(\"https://";
Debug.ShouldStop(4096);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _downloadimage(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/"),parent._camerathumbnail,RemoteObject.createImmutable(".jpg")),_iv,_camera);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 558;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "getcommandresponse"), _rs);
this.state = 27;
return;
case 27:
//C
this.state = 18;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 560;BA.debugLine="Return True";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 562;BA.debugLine="If camera = \"347574\" Then";
Debug.ShouldStop(131072);
if (true) break;

case 10:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("347574"))) { 
this.state = 12;
}else 
{ BA.debugLineNum = 564;BA.debugLine="Else If camera = \"236967\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("236967"))) { 
this.state = 14;
}else 
{ BA.debugLineNum = 566;BA.debugLine="Else If camera = \"458236\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("458236"))) { 
this.state = 16;
}}}
if (true) break;

case 12:
//C
this.state = 17;
 BA.debugLineNum = 563;BA.debugLine="lblStatus.Text = \"Awaiting for the Driveway thu";
Debug.ShouldStop(262144);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Awaiting for the Driveway thumbnail... "),_attempts,RemoteObject.createImmutable("/"),_attemptsallowed));
 if (true) break;

case 14:
//C
this.state = 17;
 BA.debugLineNum = 565;BA.debugLine="lblStatus.Text = \"Awaiting for the Front Door t";
Debug.ShouldStop(1048576);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Awaiting for the Front Door thumbnail...  "),_attempts,RemoteObject.createImmutable("/"),_attemptsallowed));
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 567;BA.debugLine="lblStatus.Text = \"Awaiting for the Side Yard th";
Debug.ShouldStop(4194304);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Awaiting for the Side Yard thumbnail... "),_attempts,RemoteObject.createImmutable("/"),_attemptsallowed));
 if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 569;BA.debugLine="Return False";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 571;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _getcommandstatus(RemoteObject _json) throws Exception{
try {
		Debug.PushSubsStack("GetCommandStatus (main) ","main",0,main.ba,main.mostCurrent,752);
if (RapidSub.canDelegate("getcommandstatus")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","getcommandstatus", _json);}
ResumableSub_GetCommandStatus rsub = new ResumableSub_GetCommandStatus(null,_json);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetCommandStatus extends BA.ResumableSub {
public ResumableSub_GetCommandStatus(cloyd.blink.main parent,RemoteObject _json) {
this.parent = parent;
this._json = _json;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
cloyd.blink.main parent;
RemoteObject _json;
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetCommandStatus (main) ","main",0,main.ba,main.mostCurrent,752);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("json", _json);
 BA.debugLineNum = 753;BA.debugLine="Try";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 754;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(131072);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 755;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(262144);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 756;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(524288);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 757;BA.debugLine="commandComplete = root.Get(\"complete\")";
Debug.ShouldStop(1048576);
parent._commandcomplete = BA.ObjectToBoolean(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("complete")))));
 BA.debugLineNum = 758;BA.debugLine="Log(\"commandComplete: \" & commandComplete)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("commandComplete: "),parent._commandcomplete)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 760;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",main.ba))));
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 762;BA.debugLine="Return Null";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 763;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _gethomescreen(RemoteObject _json) throws Exception{
try {
		Debug.PushSubsStack("GetHomescreen (main) ","main",0,main.ba,main.mostCurrent,984);
if (RapidSub.canDelegate("gethomescreen")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","gethomescreen", _json);}
ResumableSub_GetHomescreen rsub = new ResumableSub_GetHomescreen(null,_json);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetHomescreen extends BA.ResumableSub {
public ResumableSub_GetHomescreen(cloyd.blink.main parent,RemoteObject _json) {
this.parent = parent;
this._json = _json;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
cloyd.blink.main parent;
RemoteObject _json;
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _devices = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _coldevices = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _battery_state = RemoteObject.createImmutable("");
RemoteObject _device_id = RemoteObject.createImmutable(0);
RemoteObject _active = RemoteObject.createImmutable("");
RemoteObject _device_type = RemoteObject.createImmutable("");
RemoteObject _battery = RemoteObject.createImmutable(0);
RemoteObject _enabled = RemoteObject.createImmutable("");
RemoteObject _status = RemoteObject.createImmutable("");
RemoteObject _network = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _armednetwork = RemoteObject.createImmutable("");
RemoteObject group6;
int index6;
int groupLen6;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetHomescreen (main) ","main",0,main.ba,main.mostCurrent,984);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("json", _json);
 BA.debugLineNum = 985;BA.debugLine="Try";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 986;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(33554432);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 987;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(67108864);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 988;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(134217728);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 989;BA.debugLine="Dim devices As List = root.Get(\"devices\")";
Debug.ShouldStop(268435456);
_devices = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_devices = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("devices")))));Debug.locals.put("devices", _devices);
 BA.debugLineNum = 990;BA.debugLine="For Each coldevices As Map In devices";
Debug.ShouldStop(536870912);
if (true) break;

case 4:
//for
this.state = 94;
_coldevices = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group6 = _devices;
index6 = 0;
groupLen6 = group6.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("coldevices", _coldevices);
this.state = 102;
if (true) break;

case 102:
//C
this.state = 94;
if (index6 < groupLen6) {
this.state = 6;
_coldevices = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group6.runMethod(false,"Get",index6));}
if (true) break;

case 103:
//C
this.state = 102;
index6++;
Debug.locals.put("coldevices", _coldevices);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 991;BA.debugLine="Dim battery_state As String = coldevices.Get(\"b";
Debug.ShouldStop(1073741824);
_battery_state = BA.ObjectToString(_coldevices.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("battery_state")))));Debug.locals.put("battery_state", _battery_state);Debug.locals.put("battery_state", _battery_state);
 BA.debugLineNum = 995;BA.debugLine="Dim device_id As Int = coldevices.Get(\"device_i";
Debug.ShouldStop(4);
_device_id = BA.numberCast(int.class, _coldevices.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("device_id")))));Debug.locals.put("device_id", _device_id);Debug.locals.put("device_id", _device_id);
 BA.debugLineNum = 998;BA.debugLine="Dim active As String = coldevices.Get(\"active\")";
Debug.ShouldStop(32);
_active = BA.ObjectToString(_coldevices.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("active")))));Debug.locals.put("active", _active);Debug.locals.put("active", _active);
 BA.debugLineNum = 1000;BA.debugLine="Dim device_type As String = coldevices.Get(\"dev";
Debug.ShouldStop(128);
_device_type = BA.ObjectToString(_coldevices.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("device_type")))));Debug.locals.put("device_type", _device_type);Debug.locals.put("device_type", _device_type);
 BA.debugLineNum = 1001;BA.debugLine="If device_type <> \"camera\" Then";
Debug.ShouldStop(256);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("!",_device_type,BA.ObjectToString("camera"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1002;BA.debugLine="Continue";
Debug.ShouldStop(512);
this.state = 103;
if (true) break;;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 1006;BA.debugLine="Dim battery As Int = coldevices.Get(\"battery\")";
Debug.ShouldStop(8192);
_battery = BA.numberCast(int.class, _coldevices.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("battery")))));Debug.locals.put("battery", _battery);Debug.locals.put("battery", _battery);
 BA.debugLineNum = 1007;BA.debugLine="Dim enabled As String = coldevices.Get(\"enabled";
Debug.ShouldStop(16384);
_enabled = BA.ObjectToString(_coldevices.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("enabled")))));Debug.locals.put("enabled", _enabled);Debug.locals.put("enabled", _enabled);
 BA.debugLineNum = 1017;BA.debugLine="Dim status As String = coldevices.Get(\"status\")";
Debug.ShouldStop(16777216);
_status = BA.ObjectToString(_coldevices.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 1019;BA.debugLine="If device_id = \"347574\" Then";
Debug.ShouldStop(67108864);
if (true) break;

case 11:
//if
this.state = 93;
if (RemoteObject.solveBoolean("=",_device_id,BA.numberCast(int.class, "347574"))) { 
this.state = 13;
}else 
{ BA.debugLineNum = 1045;BA.debugLine="Else If device_id = \"236967\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_device_id,BA.numberCast(int.class, "236967"))) { 
this.state = 40;
}else 
{ BA.debugLineNum = 1071;BA.debugLine="Else If device_id = \"458236\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_device_id,BA.numberCast(int.class, "458236"))) { 
this.state = 67;
}}}
if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1020;BA.debugLine="If battery > 1 And battery_state = \"ok\" Then";
Debug.ShouldStop(134217728);
if (true) break;

case 14:
//if
this.state = 35;
if (RemoteObject.solveBoolean(">",_battery,BA.numberCast(int.class, 1)) && RemoteObject.solveBoolean("=",_battery_state,BA.ObjectToString("ok"))) { 
this.state = 16;
}else {
this.state = 30;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1021;BA.debugLine="If active = \"armed\" Then";
Debug.ShouldStop(268435456);
if (true) break;

case 17:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",_active,BA.ObjectToString("armed"))) { 
this.state = 19;
}else {
this.state = 27;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 1022;BA.debugLine="If enabled = \"true\" Then";
Debug.ShouldStop(536870912);
if (true) break;

case 20:
//if
this.state = 25;
if (RemoteObject.solveBoolean("=",_enabled,BA.ObjectToString("true"))) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
 BA.debugLineNum = 1023;BA.debugLine="drivewayArmedStatus = \"[Level \" & battery &";
Debug.ShouldStop(1073741824);
parent._drivewayarmedstatus = RemoteObject.concat(RemoteObject.createImmutable("[Level "),_battery,RemoteObject.createImmutable(" - "),_battery_state.runMethod(true,"toUpperCase"),RemoteObject.createImmutable("]"));
 BA.debugLineNum = 1024;BA.debugLine="lblDriveway.Style = \"\"";
Debug.ShouldStop(-2147483648);
parent._lbldriveway.runMethod(true,"setStyle",BA.ObjectToString(""));
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 1026;BA.debugLine="drivewayArmedStatus = \"MOTION DETECTION IS";
Debug.ShouldStop(2);
parent._drivewayarmedstatus = BA.ObjectToString("MOTION DETECTION IS DISABLED!");
 BA.debugLineNum = 1027;BA.debugLine="lblDriveway.Style = \"-fx-effect: dropshadow";
Debug.ShouldStop(4);
parent._lbldriveway.runMethod(true,"setStyle",BA.ObjectToString("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );"));
 if (true) break;

case 25:
//C
this.state = 28;
;
 if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 1030;BA.debugLine="drivewayArmedStatus = \"CAMERA NOT ARMED!\"";
Debug.ShouldStop(32);
parent._drivewayarmedstatus = BA.ObjectToString("CAMERA NOT ARMED!");
 BA.debugLineNum = 1031;BA.debugLine="lblDriveway.Style = \"-fx-effect: dropshadow(";
Debug.ShouldStop(64);
parent._lbldriveway.runMethod(true,"setStyle",BA.ObjectToString("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );"));
 if (true) break;

case 28:
//C
this.state = 35;
;
 if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 1034;BA.debugLine="drivewayArmedStatus = \"[Level \" & battery & \"";
Debug.ShouldStop(512);
parent._drivewayarmedstatus = RemoteObject.concat(RemoteObject.createImmutable("[Level "),_battery,RemoteObject.createImmutable(" - "),_battery_state.runMethod(true,"toUpperCase"),RemoteObject.createImmutable("]"));
 BA.debugLineNum = 1035;BA.debugLine="If drivewayArmedStatus = \"[Level 1 - LOW]\" Th";
Debug.ShouldStop(1024);
if (true) break;

case 31:
//if
this.state = 34;
if (RemoteObject.solveBoolean("=",parent._drivewayarmedstatus,BA.ObjectToString("[Level 1 - LOW]"))) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 1036;BA.debugLine="drivewayArmedStatus = \"[REPLACE]\"";
Debug.ShouldStop(2048);
parent._drivewayarmedstatus = BA.ObjectToString("[REPLACE]");
 if (true) break;

case 34:
//C
this.state = 35;
;
 BA.debugLineNum = 1038;BA.debugLine="lblDriveway.Style = \"-fx-effect: dropshadow(";
Debug.ShouldStop(8192);
parent._lbldriveway.runMethod(true,"setStyle",BA.ObjectToString("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );"));
 if (true) break;
;
 BA.debugLineNum = 1040;BA.debugLine="If status = \"offline\" Then";
Debug.ShouldStop(32768);

case 35:
//if
this.state = 38;
if (RemoteObject.solveBoolean("=",_status,BA.ObjectToString("offline"))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 1041;BA.debugLine="drivewayArmedStatus = \"[Level \" & battery & \"";
Debug.ShouldStop(65536);
parent._drivewayarmedstatus = RemoteObject.concat(RemoteObject.createImmutable("[Level "),_battery,RemoteObject.createImmutable(" - "),_battery_state.runMethod(true,"toUpperCase"),RemoteObject.createImmutable(" OFFLINE]"));
 BA.debugLineNum = 1042;BA.debugLine="lblDriveway.Style = \"-fx-effect: dropshadow(";
Debug.ShouldStop(131072);
parent._lbldriveway.runMethod(true,"setStyle",BA.ObjectToString("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );"));
 BA.debugLineNum = 1043;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
Debug.ShouldStop(262144);
_bluriv(BA.ObjectToString("Driveway.jpg"),parent._ivdriveway);
 if (true) break;

case 38:
//C
this.state = 93;
;
 if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 1046;BA.debugLine="If battery > 1 And battery_state = \"ok\" Then";
Debug.ShouldStop(2097152);
if (true) break;

case 41:
//if
this.state = 62;
if (RemoteObject.solveBoolean(">",_battery,BA.numberCast(int.class, 1)) && RemoteObject.solveBoolean("=",_battery_state,BA.ObjectToString("ok"))) { 
this.state = 43;
}else {
this.state = 57;
}if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 1047;BA.debugLine="If active = \"armed\" Then";
Debug.ShouldStop(4194304);
if (true) break;

case 44:
//if
this.state = 55;
if (RemoteObject.solveBoolean("=",_active,BA.ObjectToString("armed"))) { 
this.state = 46;
}else {
this.state = 54;
}if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 1048;BA.debugLine="If enabled = \"true\" Then";
Debug.ShouldStop(8388608);
if (true) break;

case 47:
//if
this.state = 52;
if (RemoteObject.solveBoolean("=",_enabled,BA.ObjectToString("true"))) { 
this.state = 49;
}else {
this.state = 51;
}if (true) break;

case 49:
//C
this.state = 52;
 BA.debugLineNum = 1049;BA.debugLine="frontdoorArmedStatus = \"[Level \" & battery";
Debug.ShouldStop(16777216);
parent._frontdoorarmedstatus = RemoteObject.concat(RemoteObject.createImmutable("[Level "),_battery,RemoteObject.createImmutable(" - "),_battery_state.runMethod(true,"toUpperCase"),RemoteObject.createImmutable("]"));
 BA.debugLineNum = 1050;BA.debugLine="lblFrontDoor.Style = \"\"";
Debug.ShouldStop(33554432);
parent._lblfrontdoor.runMethod(true,"setStyle",BA.ObjectToString(""));
 if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 1052;BA.debugLine="frontdoorArmedStatus = \"MOTION DETECTION IS";
Debug.ShouldStop(134217728);
parent._frontdoorarmedstatus = BA.ObjectToString("MOTION DETECTION IS DISABLED!");
 BA.debugLineNum = 1053;BA.debugLine="lblFrontDoor.Style = \"-fx-effect: dropshado";
Debug.ShouldStop(268435456);
parent._lblfrontdoor.runMethod(true,"setStyle",BA.ObjectToString("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );"));
 if (true) break;

case 52:
//C
this.state = 55;
;
 if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 1056;BA.debugLine="frontdoorArmedStatus = \"CAMERA NOT ARMED!\"";
Debug.ShouldStop(-2147483648);
parent._frontdoorarmedstatus = BA.ObjectToString("CAMERA NOT ARMED!");
 BA.debugLineNum = 1057;BA.debugLine="lblFrontDoor.Style = \"-fx-effect: dropshadow";
Debug.ShouldStop(1);
parent._lblfrontdoor.runMethod(true,"setStyle",BA.ObjectToString("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );"));
 if (true) break;

case 55:
//C
this.state = 62;
;
 if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 1060;BA.debugLine="frontdoorArmedStatus = \"[Level \" & battery &";
Debug.ShouldStop(8);
parent._frontdoorarmedstatus = RemoteObject.concat(RemoteObject.createImmutable("[Level "),_battery,RemoteObject.createImmutable(" - "),_battery_state.runMethod(true,"toUpperCase"),RemoteObject.createImmutable("]"));
 BA.debugLineNum = 1061;BA.debugLine="If frontdoorArmedStatus = \"[Level 1 - LOW]\" T";
Debug.ShouldStop(16);
if (true) break;

case 58:
//if
this.state = 61;
if (RemoteObject.solveBoolean("=",parent._frontdoorarmedstatus,BA.ObjectToString("[Level 1 - LOW]"))) { 
this.state = 60;
}if (true) break;

case 60:
//C
this.state = 61;
 BA.debugLineNum = 1062;BA.debugLine="frontdoorArmedStatus = \"[REPLACE]\"";
Debug.ShouldStop(32);
parent._frontdoorarmedstatus = BA.ObjectToString("[REPLACE]");
 if (true) break;

case 61:
//C
this.state = 62;
;
 BA.debugLineNum = 1064;BA.debugLine="lblFrontDoor.Style = \"-fx-effect: dropshadow(";
Debug.ShouldStop(128);
parent._lblfrontdoor.runMethod(true,"setStyle",BA.ObjectToString("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );"));
 if (true) break;
;
 BA.debugLineNum = 1066;BA.debugLine="If status = \"offline\" Then";
Debug.ShouldStop(512);

case 62:
//if
this.state = 65;
if (RemoteObject.solveBoolean("=",_status,BA.ObjectToString("offline"))) { 
this.state = 64;
}if (true) break;

case 64:
//C
this.state = 65;
 BA.debugLineNum = 1067;BA.debugLine="frontdoorArmedStatus = \"[Level \" & battery &";
Debug.ShouldStop(1024);
parent._frontdoorarmedstatus = RemoteObject.concat(RemoteObject.createImmutable("[Level "),_battery,RemoteObject.createImmutable(" - "),_battery_state.runMethod(true,"toUpperCase"),RemoteObject.createImmutable(" OFFLINE]"));
 BA.debugLineNum = 1068;BA.debugLine="lblFrontDoor.Style = \"-fx-effect: dropshadow(";
Debug.ShouldStop(2048);
parent._lblfrontdoor.runMethod(true,"setStyle",BA.ObjectToString("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );"));
 BA.debugLineNum = 1069;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
Debug.ShouldStop(4096);
_bluriv(BA.ObjectToString("FrontDoor.jpg"),parent._ivfrontdoor);
 if (true) break;

case 65:
//C
this.state = 93;
;
 if (true) break;

case 67:
//C
this.state = 68;
 BA.debugLineNum = 1072;BA.debugLine="If battery > 1 And battery_state = \"ok\" Then";
Debug.ShouldStop(32768);
if (true) break;

case 68:
//if
this.state = 89;
if (RemoteObject.solveBoolean(">",_battery,BA.numberCast(int.class, 1)) && RemoteObject.solveBoolean("=",_battery_state,BA.ObjectToString("ok"))) { 
this.state = 70;
}else {
this.state = 84;
}if (true) break;

case 70:
//C
this.state = 71;
 BA.debugLineNum = 1073;BA.debugLine="If active = \"armed\" Then";
Debug.ShouldStop(65536);
if (true) break;

case 71:
//if
this.state = 82;
if (RemoteObject.solveBoolean("=",_active,BA.ObjectToString("armed"))) { 
this.state = 73;
}else {
this.state = 81;
}if (true) break;

case 73:
//C
this.state = 74;
 BA.debugLineNum = 1074;BA.debugLine="If enabled = \"true\" Then";
Debug.ShouldStop(131072);
if (true) break;

case 74:
//if
this.state = 79;
if (RemoteObject.solveBoolean("=",_enabled,BA.ObjectToString("true"))) { 
this.state = 76;
}else {
this.state = 78;
}if (true) break;

case 76:
//C
this.state = 79;
 BA.debugLineNum = 1075;BA.debugLine="sideyardArmedStatus = \"[Level \" & battery &";
Debug.ShouldStop(262144);
parent._sideyardarmedstatus = RemoteObject.concat(RemoteObject.createImmutable("[Level "),_battery,RemoteObject.createImmutable(" - "),_battery_state.runMethod(true,"toUpperCase"),RemoteObject.createImmutable("]"));
 BA.debugLineNum = 1076;BA.debugLine="lblSideYard.Style = \"\"";
Debug.ShouldStop(524288);
parent._lblsideyard.runMethod(true,"setStyle",BA.ObjectToString(""));
 if (true) break;

case 78:
//C
this.state = 79;
 BA.debugLineNum = 1078;BA.debugLine="sideyardArmedStatus = \"MOTION DETECTION IS";
Debug.ShouldStop(2097152);
parent._sideyardarmedstatus = BA.ObjectToString("MOTION DETECTION IS DISABLED!");
 BA.debugLineNum = 1079;BA.debugLine="lblSideYard.Style = \"-fx-effect: dropshadow";
Debug.ShouldStop(4194304);
parent._lblsideyard.runMethod(true,"setStyle",BA.ObjectToString("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );"));
 if (true) break;

case 79:
//C
this.state = 82;
;
 if (true) break;

case 81:
//C
this.state = 82;
 BA.debugLineNum = 1082;BA.debugLine="sideyardArmedStatus = \"CAMERA NOT ARMED!\"";
Debug.ShouldStop(33554432);
parent._sideyardarmedstatus = BA.ObjectToString("CAMERA NOT ARMED!");
 BA.debugLineNum = 1083;BA.debugLine="lblSideYard.Style = \"-fx-effect: dropshadow(";
Debug.ShouldStop(67108864);
parent._lblsideyard.runMethod(true,"setStyle",BA.ObjectToString("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );"));
 if (true) break;

case 82:
//C
this.state = 89;
;
 if (true) break;

case 84:
//C
this.state = 85;
 BA.debugLineNum = 1086;BA.debugLine="sideyardArmedStatus = \"[Level \" & battery & \"";
Debug.ShouldStop(536870912);
parent._sideyardarmedstatus = RemoteObject.concat(RemoteObject.createImmutable("[Level "),_battery,RemoteObject.createImmutable(" - "),_battery_state.runMethod(true,"toUpperCase"),RemoteObject.createImmutable("]"));
 BA.debugLineNum = 1087;BA.debugLine="If sideyardArmedStatus = \"[Level 1 - LOW]\" Th";
Debug.ShouldStop(1073741824);
if (true) break;

case 85:
//if
this.state = 88;
if (RemoteObject.solveBoolean("=",parent._sideyardarmedstatus,BA.ObjectToString("[Level 1 - LOW]"))) { 
this.state = 87;
}if (true) break;

case 87:
//C
this.state = 88;
 BA.debugLineNum = 1088;BA.debugLine="sideyardArmedStatus = \"[REPLACE]\"";
Debug.ShouldStop(-2147483648);
parent._sideyardarmedstatus = BA.ObjectToString("[REPLACE]");
 if (true) break;

case 88:
//C
this.state = 89;
;
 BA.debugLineNum = 1090;BA.debugLine="lblSideYard.Style = \"-fx-effect: dropshadow(";
Debug.ShouldStop(2);
parent._lblsideyard.runMethod(true,"setStyle",BA.ObjectToString("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );"));
 if (true) break;
;
 BA.debugLineNum = 1092;BA.debugLine="If status = \"offline\" Then";
Debug.ShouldStop(8);

case 89:
//if
this.state = 92;
if (RemoteObject.solveBoolean("=",_status,BA.ObjectToString("offline"))) { 
this.state = 91;
}if (true) break;

case 91:
//C
this.state = 92;
 BA.debugLineNum = 1093;BA.debugLine="sideyardArmedStatus = \"[Level \" & battery & \"";
Debug.ShouldStop(16);
parent._sideyardarmedstatus = RemoteObject.concat(RemoteObject.createImmutable("[Level "),_battery,RemoteObject.createImmutable(" - "),_battery_state.runMethod(true,"toUpperCase"),RemoteObject.createImmutable(" OFFLINE]"));
 BA.debugLineNum = 1094;BA.debugLine="lblSideYard.Style = \"-fx-effect: dropshadow(";
Debug.ShouldStop(32);
parent._lblsideyard.runMethod(true,"setStyle",BA.ObjectToString("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );"));
 BA.debugLineNum = 1095;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
Debug.ShouldStop(64);
_bluriv(BA.ObjectToString("SideYard.jpg"),parent._ivsideyard);
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
Debug.locals.put("coldevices", _coldevices);
;
 BA.debugLineNum = 1102;BA.debugLine="Dim network As Map = root.Get(\"network\")";
Debug.ShouldStop(8192);
_network = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_network = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("network")))));Debug.locals.put("network", _network);
 BA.debugLineNum = 1106;BA.debugLine="Dim armedNetwork As String = network.Get(\"armed\"";
Debug.ShouldStop(131072);
_armednetwork = BA.ObjectToString(_network.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("armed")))));Debug.locals.put("armedNetwork", _armednetwork);Debug.locals.put("armedNetwork", _armednetwork);
 BA.debugLineNum = 1112;BA.debugLine="swArmed.Value = armedNetwork";
Debug.ShouldStop(8388608);
parent._swarmed.runClassMethod (cloyd.blink.b4xswitch.class, "_setvalue" /*RemoteObject*/ ,BA.ObjectToBoolean(_armednetwork));
 BA.debugLineNum = 1114;BA.debugLine="If armedNetwork <> \"true\" Then";
Debug.ShouldStop(33554432);
if (true) break;

case 95:
//if
this.state = 98;
if (RemoteObject.solveBoolean("!",_armednetwork,BA.ObjectToString("true"))) { 
this.state = 97;
}if (true) break;

case 97:
//C
this.state = 98;
 BA.debugLineNum = 1115;BA.debugLine="drivewayArmedStatus = \"SYSTEM NOT ARMED!\"";
Debug.ShouldStop(67108864);
parent._drivewayarmedstatus = BA.ObjectToString("SYSTEM NOT ARMED!");
 BA.debugLineNum = 1116;BA.debugLine="lblDriveway.Style = \"-fx-effect: dropshadow( ga";
Debug.ShouldStop(134217728);
parent._lbldriveway.runMethod(true,"setStyle",BA.ObjectToString("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );"));
 BA.debugLineNum = 1118;BA.debugLine="frontdoorArmedStatus = \"SYSTEM NOT ARMED!\"";
Debug.ShouldStop(536870912);
parent._frontdoorarmedstatus = BA.ObjectToString("SYSTEM NOT ARMED!");
 BA.debugLineNum = 1119;BA.debugLine="lblFrontDoor.Style = \"-fx-effect: dropshadow( g";
Debug.ShouldStop(1073741824);
parent._lblfrontdoor.runMethod(true,"setStyle",BA.ObjectToString("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );"));
 BA.debugLineNum = 1121;BA.debugLine="sideyardArmedStatus = \"SYSTEM NOT ARMED!\"";
Debug.ShouldStop(1);
parent._sideyardarmedstatus = BA.ObjectToString("SYSTEM NOT ARMED!");
 BA.debugLineNum = 1122;BA.debugLine="lblSideYard.Style = \"-fx-effect: dropshadow( ga";
Debug.ShouldStop(2);
parent._lblsideyard.runMethod(true,"setStyle",BA.ObjectToString("-fx-effect: dropshadow( gaussian , rgba(255,0,0,255) , 0,0,0,1 );"));
 if (true) break;

case 98:
//C
this.state = 101;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 100:
//C
this.state = 101;
this.catchState = 0;
 BA.debugLineNum = 1125;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",main.ba))));
 if (true) break;
if (true) break;

case 101:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 1127;BA.debugLine="Return Null";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 1128;BA.debugLine="End Sub";
Debug.ShouldStop(128);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _getliveview(RemoteObject _json) throws Exception{
try {
		Debug.PushSubsStack("GetLiveView (main) ","main",0,main.ba,main.mostCurrent,1445);
if (RapidSub.canDelegate("getliveview")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","getliveview", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _duration = RemoteObject.createImmutable(0);
RemoteObject _server = RemoteObject.createImmutable("");
RemoteObject _device_name = RemoteObject.createImmutable("");
RemoteObject _network_id = RemoteObject.createImmutable(0);
RemoteObject _continue_interval = RemoteObject.createImmutable(0);
RemoteObject _continue_warning = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _submit_logs = RemoteObject.createImmutable("");
RemoteObject _camera_name = RemoteObject.createImmutable("");
RemoteObject _lv_save = RemoteObject.createImmutable("");
Debug.locals.put("json", _json);
 BA.debugLineNum = 1445;BA.debugLine="Sub GetLiveView(json As String) As String 'ignore";
Debug.ShouldStop(16);
 BA.debugLineNum = 1446;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 1447;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(64);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1448;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(128);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 1449;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(256);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 1450;BA.debugLine="Dim duration As Int = root.Get(\"duration\") 'igno";
Debug.ShouldStop(512);
_duration = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("duration")))));Debug.locals.put("duration", _duration);Debug.locals.put("duration", _duration);
 BA.debugLineNum = 1451;BA.debugLine="Dim server As String = root.Get(\"server\")";
Debug.ShouldStop(1024);
_server = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("server")))));Debug.locals.put("server", _server);Debug.locals.put("server", _server);
 BA.debugLineNum = 1452;BA.debugLine="Dim device_name As String = root.Get(\"device_nam";
Debug.ShouldStop(2048);
_device_name = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("device_name")))));Debug.locals.put("device_name", _device_name);Debug.locals.put("device_name", _device_name);
 BA.debugLineNum = 1453;BA.debugLine="Dim network_id As Int = root.Get(\"network_id\") '";
Debug.ShouldStop(4096);
_network_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("network_id")))));Debug.locals.put("network_id", _network_id);Debug.locals.put("network_id", _network_id);
 BA.debugLineNum = 1454;BA.debugLine="Dim continue_interval As Int = root.Get(\"continu";
Debug.ShouldStop(8192);
_continue_interval = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("continue_interval")))));Debug.locals.put("continue_interval", _continue_interval);Debug.locals.put("continue_interval", _continue_interval);
 BA.debugLineNum = 1455;BA.debugLine="Dim continue_warning As Int = root.Get(\"continue";
Debug.ShouldStop(16384);
_continue_warning = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("continue_warning")))));Debug.locals.put("continue_warning", _continue_warning);Debug.locals.put("continue_warning", _continue_warning);
 BA.debugLineNum = 1456;BA.debugLine="Dim id As Int = root.Get(\"id\")";
Debug.ShouldStop(32768);
_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 1457;BA.debugLine="Dim submit_logs As String = root.Get(\"submit_log";
Debug.ShouldStop(65536);
_submit_logs = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("submit_logs")))));Debug.locals.put("submit_logs", _submit_logs);Debug.locals.put("submit_logs", _submit_logs);
 BA.debugLineNum = 1458;BA.debugLine="Dim camera_name As String = root.Get(\"camera_nam";
Debug.ShouldStop(131072);
_camera_name = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("camera_name")))));Debug.locals.put("camera_name", _camera_name);Debug.locals.put("camera_name", _camera_name);
 BA.debugLineNum = 1459;BA.debugLine="Dim lv_save As String = root.Get(\"lv_save\") 'ign";
Debug.ShouldStop(262144);
_lv_save = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lv_save")))));Debug.locals.put("lv_save", _lv_save);Debug.locals.put("lv_save", _lv_save);
 BA.debugLineNum = 1460;BA.debugLine="Log(\"Liveview: \" & server)";
Debug.ShouldStop(524288);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Liveview: "),_server)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e17.toString()); BA.debugLineNum = 1465;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 1467;BA.debugLine="Return id";
Debug.ShouldStop(67108864);
if (true) return BA.NumberToString(_id);
 BA.debugLineNum = 1468;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getresterror(RemoteObject _json) throws Exception{
try {
		Debug.PushSubsStack("GetRESTError (main) ","main",0,main.ba,main.mostCurrent,765);
if (RapidSub.canDelegate("getresterror")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","getresterror", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _code = RemoteObject.createImmutable(0);
RemoteObject _message = RemoteObject.createImmutable("");
Debug.locals.put("json", _json);
 BA.debugLineNum = 765;BA.debugLine="Sub GetRESTError(json As String) As String";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 766;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 770;BA.debugLine="If json.Contains(\"<h1>Not Found</h1>\") Then";
Debug.ShouldStop(2);
if (_json.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("<h1>Not Found</h1>"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 771;BA.debugLine="Return \"REST endpoint URL not found. Try again.";
Debug.ShouldStop(4);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("REST endpoint URL not found. Try again.");
 }else {
 BA.debugLineNum = 773;BA.debugLine="If json.IndexOf(\"{\") <> -1 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("!",_json.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("{"))),BA.numberCast(int.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 774;BA.debugLine="json = json.SubString(json.IndexOf(\"{\"))";
Debug.ShouldStop(32);
_json = _json.runMethod(true,"substring",(Object)(_json.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("{")))));Debug.locals.put("json", _json);
 BA.debugLineNum = 775;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(64);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 776;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(128);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 777;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(256);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 778;BA.debugLine="Dim code As Int = root.Get(\"code\")";
Debug.ShouldStop(512);
_code = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("code")))));Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 779;BA.debugLine="Dim message As String = root.Get(\"message\")";
Debug.ShouldStop(1024);
_message = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("message")))));Debug.locals.put("message", _message);Debug.locals.put("message", _message);
 BA.debugLineNum = 780;BA.debugLine="Log(\"Code: \" & code & \" Message: \" & message)";
Debug.ShouldStop(2048);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Code: "),_code,RemoteObject.createImmutable(" Message: "),_message)));
 BA.debugLineNum = 781;BA.debugLine="Return \"Code: \" & code & \" Message: \" & messag";
Debug.ShouldStop(4096);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.concat(RemoteObject.createImmutable("Code: "),_code,RemoteObject.createImmutable(" Message: "),_message);
 }else {
 BA.debugLineNum = 783;BA.debugLine="Return json";
Debug.ShouldStop(16384);
Debug.CheckDeviceExceptions();if (true) return _json;
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e19) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e19.toString()); BA.debugLineNum = 787;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 788;BA.debugLine="Return json";
Debug.ShouldStop(524288);
if (true) return _json;
 };
 BA.debugLineNum = 790;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsyncmoduleinfo(RemoteObject _json) throws Exception{
try {
		Debug.PushSubsStack("GetSyncModuleInfo (main) ","main",0,main.ba,main.mostCurrent,927);
if (RapidSub.canDelegate("getsyncmoduleinfo")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","getsyncmoduleinfo", _json);}
ResumableSub_GetSyncModuleInfo rsub = new ResumableSub_GetSyncModuleInfo(null,_json);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetSyncModuleInfo extends BA.ResumableSub {
public ResumableSub_GetSyncModuleInfo(cloyd.blink.main parent,RemoteObject _json) {
this.parent = parent;
this._json = _json;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
cloyd.blink.main parent;
RemoteObject _json;
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _syncmodule = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _wifi_strength = RemoteObject.createImmutable(0);
RemoteObject _os_version = RemoteObject.createImmutable("");
RemoteObject _fw_version = RemoteObject.createImmutable("");
RemoteObject _status = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetSyncModuleInfo (main) ","main",0,main.ba,main.mostCurrent,927);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("json", _json);
 BA.debugLineNum = 928;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 929;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 930;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(2);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 931;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(4);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 932;BA.debugLine="Dim syncmodule As Map = root.Get(\"syncmodule\")";
Debug.ShouldStop(8);
_syncmodule = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_syncmodule = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("syncmodule")))));Debug.locals.put("syncmodule", _syncmodule);
 BA.debugLineNum = 936;BA.debugLine="Dim wifi_strength As Int = syncmodule.Get(\"wifi_";
Debug.ShouldStop(128);
_wifi_strength = BA.numberCast(int.class, _syncmodule.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("wifi_strength")))));Debug.locals.put("wifi_strength", _wifi_strength);Debug.locals.put("wifi_strength", _wifi_strength);
 BA.debugLineNum = 937;BA.debugLine="Dim os_version As String = syncmodule.Get(\"os_ve";
Debug.ShouldStop(256);
_os_version = BA.ObjectToString(_syncmodule.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("os_version")))));Debug.locals.put("os_version", _os_version);Debug.locals.put("os_version", _os_version);
 BA.debugLineNum = 954;BA.debugLine="Dim fw_version As String = syncmodule.Get(\"fw_ve";
Debug.ShouldStop(33554432);
_fw_version = BA.ObjectToString(_syncmodule.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fw_version")))));Debug.locals.put("fw_version", _fw_version);Debug.locals.put("fw_version", _fw_version);
 BA.debugLineNum = 956;BA.debugLine="Dim status As String = syncmodule.Get(\"status\")";
Debug.ShouldStop(134217728);
_status = BA.ObjectToString(_syncmodule.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 957;BA.debugLine="lblSyncModule.Text = \"Sync Module is \" & status";
Debug.ShouldStop(268435456);
parent._lblsyncmodule.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Sync Module is "),_status,parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Wifi Strength: "),_wifi_strength,RemoteObject.createImmutable(" bars"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Firmware version: "),_fw_version,parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("OS version: "),_os_version));
 BA.debugLineNum = 959;BA.debugLine="If status = \"online\" Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("=",_status,BA.ObjectToString("online"))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 960;BA.debugLine="ivSyncModule.SetImage(fx.LoadImage(File.DirAsse";
Debug.ShouldStop(-2147483648);
parent._ivsyncmodule.runVoidMethod ("SetImage",(Object)((parent._fx.runMethod(false,"LoadImage",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("systemstatusonline.png"))).getObject())));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 962;BA.debugLine="ivSyncModule.SetImage(fx.LoadImage(File.DirAsse";
Debug.ShouldStop(2);
parent._ivsyncmodule.runVoidMethod ("SetImage",(Object)((parent._fx.runMethod(false,"LoadImage",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("systemstatusoffline.png"))).getObject())));
 if (true) break;
;
 BA.debugLineNum = 965;BA.debugLine="If wifi_strength = \"5\" Then";
Debug.ShouldStop(16);

case 9:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_wifi_strength,BA.numberCast(int.class, "5"))) { 
this.state = 11;
}else 
{ BA.debugLineNum = 967;BA.debugLine="Else If wifi_strength = \"4\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_wifi_strength,BA.numberCast(int.class, "4"))) { 
this.state = 13;
}else 
{ BA.debugLineNum = 969;BA.debugLine="Else If wifi_strength = \"3\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_wifi_strength,BA.numberCast(int.class, "3"))) { 
this.state = 15;
}else 
{ BA.debugLineNum = 971;BA.debugLine="Else If wifi_strength = \"2\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_wifi_strength,BA.numberCast(int.class, "2"))) { 
this.state = 17;
}else 
{ BA.debugLineNum = 973;BA.debugLine="Else If wifi_strength = \"1\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_wifi_strength,BA.numberCast(int.class, "1"))) { 
this.state = 19;
}else {
this.state = 21;
}}}}}
if (true) break;

case 11:
//C
this.state = 22;
 BA.debugLineNum = 966;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
Debug.ShouldStop(32);
parent._ivsyncmodulewifi.runVoidMethod ("SetImage",(Object)((parent._fx.runMethod(false,"LoadImage",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("bars5blue.png"))).getObject())));
 if (true) break;

case 13:
//C
this.state = 22;
 BA.debugLineNum = 968;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
Debug.ShouldStop(128);
parent._ivsyncmodulewifi.runVoidMethod ("SetImage",(Object)((parent._fx.runMethod(false,"LoadImage",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("bars4blue.png"))).getObject())));
 if (true) break;

case 15:
//C
this.state = 22;
 BA.debugLineNum = 970;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
Debug.ShouldStop(512);
parent._ivsyncmodulewifi.runVoidMethod ("SetImage",(Object)((parent._fx.runMethod(false,"LoadImage",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("bars3blue.png"))).getObject())));
 if (true) break;

case 17:
//C
this.state = 22;
 BA.debugLineNum = 972;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
Debug.ShouldStop(2048);
parent._ivsyncmodulewifi.runVoidMethod ("SetImage",(Object)((parent._fx.runMethod(false,"LoadImage",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("bars2blue.png"))).getObject())));
 if (true) break;

case 19:
//C
this.state = 22;
 BA.debugLineNum = 974;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
Debug.ShouldStop(8192);
parent._ivsyncmodulewifi.runVoidMethod ("SetImage",(Object)((parent._fx.runMethod(false,"LoadImage",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("bars1blue.png"))).getObject())));
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 976;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
Debug.ShouldStop(32768);
parent._ivsyncmodulewifi.runVoidMethod ("SetImage",(Object)((parent._fx.runMethod(false,"LoadImage",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("bars_0bars.png"))).getObject())));
 if (true) break;

case 22:
//C
this.state = 25;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 0;
 BA.debugLineNum = 979;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",main.ba))));
 if (true) break;
if (true) break;

case 25:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 981;BA.debugLine="Return Null";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 982;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _getunwatchedvideos() throws Exception{
try {
		Debug.PushSubsStack("GetUnwatchedVideos (main) ","main",0,main.ba,main.mostCurrent,1886);
if (RapidSub.canDelegate("getunwatchedvideos")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","getunwatchedvideos");}
ResumableSub_GetUnwatchedVideos rsub = new ResumableSub_GetUnwatchedVideos(null);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetUnwatchedVideos extends BA.ResumableSub {
public ResumableSub_GetUnwatchedVideos(cloyd.blink.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
cloyd.blink.main parent;
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.declareNull("Object");
RemoteObject _unwatchedvideocount = RemoteObject.createImmutable(0);
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _media = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _n = RemoteObject.createImmutable(0L);
RemoteObject _colmedia = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _watched = RemoteObject.createImmutable("");
RemoteObject group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetUnwatchedVideos (main) ","main",0,main.ba,main.mostCurrent,1886);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 1887;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 1888;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-\"";
Debug.ShouldStop(-2147483648);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/api/v1/accounts/88438/media/changed?since=-999999999-01-01T00:00:00+18:00&page=1")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1889;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "getunwatchedvideos"), _rs);
this.state = 15;
return;
case 15:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1891;BA.debugLine="Dim unwatchedVideoCount As Int = 0";
Debug.ShouldStop(4);
_unwatchedvideocount = BA.numberCast(int.class, 0);Debug.locals.put("unwatchedVideoCount", _unwatchedvideocount);Debug.locals.put("unwatchedVideoCount", _unwatchedvideocount);
 BA.debugLineNum = 1892;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(8);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1893;BA.debugLine="parser.Initialize(response)";
Debug.ShouldStop(16);
_parser.runVoidMethod ("Initialize",(Object)(parent._response));
 BA.debugLineNum = 1894;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(32);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 1895;BA.debugLine="Dim media As List = root.Get(\"media\")";
Debug.ShouldStop(64);
_media = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_media = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("media")))));Debug.locals.put("media", _media);
 BA.debugLineNum = 1896;BA.debugLine="kvs.Initialize(File.DirApp, \"datastore\")";
Debug.ShouldStop(128);
parent._kvs.runClassMethod (cloyd.blink.keyvaluestore.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("datastore")));
 BA.debugLineNum = 1897;BA.debugLine="Dim n As Long = DateTime.Now";
Debug.ShouldStop(256);
_n = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 1898;BA.debugLine="For Each colmedia As Map In media";
Debug.ShouldStop(512);
if (true) break;

case 4:
//for
this.state = 11;
_colmedia = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group11 = _media;
index11 = 0;
groupLen11 = group11.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colmedia", _colmedia);
this.state = 16;
if (true) break;

case 16:
//C
this.state = 11;
if (index11 < groupLen11) {
this.state = 6;
_colmedia = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group11.runMethod(false,"Get",index11));}
if (true) break;

case 17:
//C
this.state = 16;
index11++;
Debug.locals.put("colmedia", _colmedia);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1899;BA.debugLine="Dim watched As String = colmedia.Get(\"watched\")";
Debug.ShouldStop(1024);
_watched = BA.ObjectToString(_colmedia.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("watched")))));Debug.locals.put("watched", _watched);Debug.locals.put("watched", _watched);
 BA.debugLineNum = 1903;BA.debugLine="If watched = False Then";
Debug.ShouldStop(16384);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_watched,BA.ObjectToString(parent.__c.getField(true,"False")))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1904;BA.debugLine="unwatchedVideoCount = unwatchedVideoCount + 1";
Debug.ShouldStop(32768);
_unwatchedvideocount = RemoteObject.solve(new RemoteObject[] {_unwatchedvideocount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("unwatchedVideoCount", _unwatchedvideocount);
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
Debug.locals.put("colmedia", _colmedia);
;
 BA.debugLineNum = 1907;BA.debugLine="Log(\"Loading unwatched videos took: \" & (DateTim";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Loading unwatched videos took: "),(RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"getNow"),_n}, "-",1, 2)),RemoteObject.createImmutable("ms"))));
 BA.debugLineNum = 1908;BA.debugLine="badger1.SetBadge(btnActivity, unwatchedVideoCoun";
Debug.ShouldStop(524288);
parent._badger1.runClassMethod (cloyd.blink.badger.class, "_setbadge" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent._btnactivity.getObject()),(Object)(_unwatchedvideocount));
 Debug.CheckDeviceExceptions();
if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
 BA.debugLineNum = 1910;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",main.ba))));
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 1912;BA.debugLine="lblStatus.Text = \"Ready\"";
Debug.ShouldStop(8388608);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Ready"));
 BA.debugLineNum = 1913;BA.debugLine="Return Null";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 1914;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _ivclose_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("ivClose_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,1170);
if (RapidSub.canDelegate("ivclose_mouseclicked")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","ivclose_mouseclicked", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1170;BA.debugLine="Private Sub ivClose_MouseClicked (EventData As Mou";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1171;BA.debugLine="File.Delete(File.DirApp, \"Driveway.jpg\")";
Debug.ShouldStop(262144);
main.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("Driveway.jpg")));
 BA.debugLineNum = 1172;BA.debugLine="File.Delete(File.DirApp, \"FrontDoor.jpg\")";
Debug.ShouldStop(524288);
main.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("FrontDoor.jpg")));
 BA.debugLineNum = 1173;BA.debugLine="File.Delete(File.DirApp, \"SideYard.jpg\")";
Debug.ShouldStop(1048576);
main.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("SideYard.jpg")));
 BA.debugLineNum = 1174;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
Debug.ShouldStop(2097152);
main.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("screenshot.jpg")));
 BA.debugLineNum = 1175;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
Debug.ShouldStop(4194304);
main.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("media.mp4")));
 BA.debugLineNum = 1176;BA.debugLine="ExitApplication";
Debug.ShouldStop(8388608);
main.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 1177;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ivdriveway_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("ivDriveway_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,1317);
if (RapidSub.canDelegate("ivdriveway_mouseclicked")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","ivdriveway_mouseclicked", _eventdata);}
RemoteObject _mf = RemoteObject.declareNull("cloyd.blink.frmmedia");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1317;BA.debugLine="Sub ivDriveway_MouseClicked (EventData As MouseEve";
Debug.ShouldStop(16);
 BA.debugLineNum = 1318;BA.debugLine="Dim mf As frmMedia";
Debug.ShouldStop(32);
_mf = RemoteObject.createNew ("cloyd.blink.frmmedia");Debug.locals.put("mf", _mf);
 BA.debugLineNum = 1319;BA.debugLine="mf.Initialize(MainForm)";
Debug.ShouldStop(64);
_mf.runClassMethod (cloyd.blink.frmmedia.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(main._mainform));
 BA.debugLineNum = 1320;BA.debugLine="mf.timestamp = lblDriveway.Text";
Debug.ShouldStop(128);
_mf.setField ("_timestamp" /*RemoteObject*/ ,main._lbldriveway.runMethod(true,"getText"));
 BA.debugLineNum = 1321;BA.debugLine="mf.url=$\" 	   <h1>${lblDriveway.Text}</h1> 	   <i";
Debug.ShouldStop(256);
_mf.setField ("_url" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	   <h1>"),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main._lbldriveway.runMethod(true,"getText")))),RemoteObject.createImmutable("</h1>\n"),RemoteObject.createImmutable("	   <img src=\""),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("Driveway.jpg")))))),RemoteObject.createImmutable("\"/>\n"),RemoteObject.createImmutable("	\n"),RemoteObject.createImmutable("	"))));
 BA.debugLineNum = 1326;BA.debugLine="mf.Show";
Debug.ShouldStop(8192);
_mf.runClassMethod (cloyd.blink.frmmedia.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1327;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return RemoteObject.createImmutable("");
 BA.debugLineNum = 1443;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ivfrontdoor_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("ivFrontDoor_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,1470);
if (RapidSub.canDelegate("ivfrontdoor_mouseclicked")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","ivfrontdoor_mouseclicked", _eventdata);}
RemoteObject _mf = RemoteObject.declareNull("cloyd.blink.frmmedia");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1470;BA.debugLine="Sub ivFrontDoor_MouseClicked (EventData As MouseEv";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1471;BA.debugLine="Dim mf As frmMedia";
Debug.ShouldStop(1073741824);
_mf = RemoteObject.createNew ("cloyd.blink.frmmedia");Debug.locals.put("mf", _mf);
 BA.debugLineNum = 1472;BA.debugLine="mf.Initialize(MainForm)";
Debug.ShouldStop(-2147483648);
_mf.runClassMethod (cloyd.blink.frmmedia.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(main._mainform));
 BA.debugLineNum = 1473;BA.debugLine="mf.timestamp = lblFrontDoor.Text";
Debug.ShouldStop(1);
_mf.setField ("_timestamp" /*RemoteObject*/ ,main._lblfrontdoor.runMethod(true,"getText"));
 BA.debugLineNum = 1474;BA.debugLine="mf.url=$\"    <h1>${lblFrontDoor.Text}</h1>    <im";
Debug.ShouldStop(2);
_mf.setField ("_url" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("   <h1>"),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main._lblfrontdoor.runMethod(true,"getText")))),RemoteObject.createImmutable("</h1>\n"),RemoteObject.createImmutable("   <img src=\""),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("FrontDoor.jpg")))))),RemoteObject.createImmutable("\"/>\n"),RemoteObject.createImmutable("   \n"),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1479;BA.debugLine="mf.Show";
Debug.ShouldStop(64);
_mf.runClassMethod (cloyd.blink.frmmedia.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1480;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ivmax_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("ivMax_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,1203);
if (RapidSub.canDelegate("ivmax_mouseclicked")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","ivmax_mouseclicked", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1203;BA.debugLine="Private Sub ivMax_MouseClicked (EventData As Mouse";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1205;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ivmin_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("ivMin_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,1223);
if (RapidSub.canDelegate("ivmin_mouseclicked")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","ivmin_mouseclicked", _eventdata);}
RemoteObject _jmf = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _stage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1223;BA.debugLine="Private Sub ivMin_MouseClicked (EventData As Mouse";
Debug.ShouldStop(64);
 BA.debugLineNum = 1224;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 1225;BA.debugLine="Dim jmf As JavaObject = MainForm";
Debug.ShouldStop(256);
_jmf = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jmf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), main._mainform);Debug.locals.put("jmf", _jmf);
 BA.debugLineNum = 1226;BA.debugLine="Dim stage As JavaObject = jmf.GetField(\"stage\")";
Debug.ShouldStop(512);
_stage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_stage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jmf.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("stage", _stage);
 BA.debugLineNum = 1227;BA.debugLine="stage.RunMethod(\"setIconified\", Array As Object(";
Debug.ShouldStop(1024);
_stage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setIconified")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(main.__c.getField(true,"True"))})));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e6.toString()); BA.debugLineNum = 1229;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 1231;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ivsideyard_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("ivSideYard_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,1482);
if (RapidSub.canDelegate("ivsideyard_mouseclicked")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","ivsideyard_mouseclicked", _eventdata);}
RemoteObject _mf = RemoteObject.declareNull("cloyd.blink.frmmedia");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1482;BA.debugLine="Sub ivSideYard_MouseClicked (EventData As MouseEve";
Debug.ShouldStop(512);
 BA.debugLineNum = 1483;BA.debugLine="Dim mf As frmMedia";
Debug.ShouldStop(1024);
_mf = RemoteObject.createNew ("cloyd.blink.frmmedia");Debug.locals.put("mf", _mf);
 BA.debugLineNum = 1484;BA.debugLine="mf.Initialize(MainForm)";
Debug.ShouldStop(2048);
_mf.runClassMethod (cloyd.blink.frmmedia.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(main._mainform));
 BA.debugLineNum = 1485;BA.debugLine="mf.timestamp = lblSideYard.Text";
Debug.ShouldStop(4096);
_mf.setField ("_timestamp" /*RemoteObject*/ ,main._lblsideyard.runMethod(true,"getText"));
 BA.debugLineNum = 1486;BA.debugLine="mf.url=$\"    <h1>${lblSideYard.Text}</h1>    <img";
Debug.ShouldStop(8192);
_mf.setField ("_url" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("   <h1>"),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main._lblsideyard.runMethod(true,"getText")))),RemoteObject.createImmutable("</h1>\n"),RemoteObject.createImmutable("   <img src=\""),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("SideYard.jpg")))))),RemoteObject.createImmutable("\"/>\n"),RemoteObject.createImmutable("   \n"),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1491;BA.debugLine="mf.Show";
Debug.ShouldStop(262144);
_mf.runClassMethod (cloyd.blink.frmmedia.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1492;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbtitle_mousedragged(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbTitle_MouseDragged (main) ","main",0,main.ba,main.mostCurrent,1150);
if (RapidSub.canDelegate("lbtitle_mousedragged")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","lbtitle_mousedragged", _eventdata);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1150;BA.debugLine="Private Sub lbTitle_MouseDragged (EventData As Mou";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1151;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 1152;BA.debugLine="If isMaximized Then Return";
Debug.ShouldStop(-2147483648);
if (main._ismaximized.<Boolean>get().booleanValue()) { 
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1153;BA.debugLine="Dim jo As JavaObject = EventData";
Debug.ShouldStop(1);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _eventdata.getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 1154;BA.debugLine="MainForm.WindowLeft = jo.RunMethod(\"getScreenX\",";
Debug.ShouldStop(2);
main._mainform.runMethod(true,"setWindowLeft",RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getScreenX")),(Object)((main.__c.getField(false,"Null"))))),main._xmouse}, "-",1, 0));
 BA.debugLineNum = 1155;BA.debugLine="MainForm.WindowTop = jo.RunMethod(\"getScreenY\",";
Debug.ShouldStop(4);
main._mainform.runMethod(true,"setWindowTop",RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getScreenY")),(Object)((main.__c.getField(false,"Null"))))),main._ymouse}, "-",1, 0));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e7.toString()); BA.debugLineNum = 1157;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 1159;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbtitle_mousepressed(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lbTitle_MousePressed (main) ","main",0,main.ba,main.mostCurrent,1161);
if (RapidSub.canDelegate("lbtitle_mousepressed")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","lbtitle_mousepressed", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1161;BA.debugLine="Private Sub lbTitle_MousePressed (EventData As Mou";
Debug.ShouldStop(256);
 BA.debugLineNum = 1162;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 1163;BA.debugLine="xMouse = EventData.X + lbTitle.Left + 15";
Debug.ShouldStop(1024);
main._xmouse = RemoteObject.solve(new RemoteObject[] {_eventdata.runMethod(true,"getX"),main._lbtitle.runMethod(true,"getLeft"),RemoteObject.createImmutable(15)}, "++",2, 0);
 BA.debugLineNum = 1164;BA.debugLine="yMouse = EventData.Y + lbTitle.Top + 15";
Debug.ShouldStop(2048);
main._ymouse = RemoteObject.solve(new RemoteObject[] {_eventdata.runMethod(true,"getY"),main._lbtitle.runMethod(true,"getTop"),RemoteObject.createImmutable(15)}, "++",2, 0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e5.toString()); BA.debugLineNum = 1166;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 1168;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainform_closerequest(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("MainForm_CloseRequest (main) ","main",0,main.ba,main.mostCurrent,1179);
if (RapidSub.canDelegate("mainform_closerequest")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","mainform_closerequest", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1179;BA.debugLine="Sub MainForm_CloseRequest (EventData As Event)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1180;BA.debugLine="File.Delete(File.DirApp, \"Driveway.jpg\")";
Debug.ShouldStop(134217728);
main.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("Driveway.jpg")));
 BA.debugLineNum = 1181;BA.debugLine="File.Delete(File.DirApp, \"FrontDoor.jpg\")";
Debug.ShouldStop(268435456);
main.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("FrontDoor.jpg")));
 BA.debugLineNum = 1182;BA.debugLine="File.Delete(File.DirApp, \"SideYard.jpg\")";
Debug.ShouldStop(536870912);
main.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("SideYard.jpg")));
 BA.debugLineNum = 1183;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
Debug.ShouldStop(1073741824);
main.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("screenshot.jpg")));
 BA.debugLineNum = 1184;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
Debug.ShouldStop(-2147483648);
main.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("media.mp4")));
 BA.debugLineNum = 1185;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _max_entered_event(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("Max_Entered_Event (main) ","main",0,main.ba,main.mostCurrent,1207);
if (RapidSub.canDelegate("max_entered_event")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","max_entered_event", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 1207;BA.debugLine="Private Sub Max_Entered_Event(e As Event)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1208;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 1209;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
Debug.ShouldStop(16777216);
main._ivmax.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable("_btMaxEnt.png")))).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e4.toString()); BA.debugLineNum = 1211;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 1213;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _max_exited_event(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("Max_Exited_Event (main) ","main",0,main.ba,main.mostCurrent,1215);
if (RapidSub.canDelegate("max_exited_event")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","max_exited_event", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 1215;BA.debugLine="Private Sub Max_Exited_Event(e As Event)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1216;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 1217;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
Debug.ShouldStop(1);
main._ivmax.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable("_btMax.png")))).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e4.toString()); BA.debugLineNum = 1219;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 1221;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _min_entered_event(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("Min_Entered_Event (main) ","main",0,main.ba,main.mostCurrent,1233);
if (RapidSub.canDelegate("min_entered_event")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","min_entered_event", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 1233;BA.debugLine="Private Sub Min_Entered_Event(e As Event)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1234;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 1235;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
Debug.ShouldStop(262144);
main._ivmin.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable("_btMinEnt.png")))).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e4.toString()); BA.debugLineNum = 1237;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 1239;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _min_exited_event(RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("Min_Exited_Event (main) ","main",0,main.ba,main.mostCurrent,1241);
if (RapidSub.canDelegate("min_exited_event")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","min_exited_event", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 1241;BA.debugLine="Private Sub Min_Exited_Event(e As Event)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1242;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 1243;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
Debug.ShouldStop(67108864);
main._ivmin.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable("_btMin.png")))).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e4.toString()); BA.debugLineNum = 1245;BA.debugLine="Log(LastException)";
Debug.ShouldStop(268435456);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 1247;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parseutcstring(RemoteObject _utc) throws Exception{
try {
		Debug.PushSubsStack("ParseUTCstring (main) ","main",0,main.ba,main.mostCurrent,1669);
if (RapidSub.canDelegate("parseutcstring")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","parseutcstring", _utc);}
RemoteObject _df = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.createImmutable(0L);
Debug.locals.put("utc", _utc);
 BA.debugLineNum = 1669;BA.debugLine="Sub ParseUTCstring(utc As String) As Long";
Debug.ShouldStop(16);
 BA.debugLineNum = 1670;BA.debugLine="Dim df As String = DateTime.DateFormat";
Debug.ShouldStop(32);
_df = main.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("df", _df);Debug.locals.put("df", _df);
 BA.debugLineNum = 1671;BA.debugLine="Dim res As Long";
Debug.ShouldStop(64);
_res = RemoteObject.createImmutable(0L);Debug.locals.put("res", _res);
 BA.debugLineNum = 1672;BA.debugLine="If utc.CharAt(10) = \"T\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_utc.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, 10))),BA.ObjectToChar("T"))) { 
 BA.debugLineNum = 1674;BA.debugLine="If utc.CharAt(19) = \".\" Then utc = utc.SubString";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_utc.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, 19))),BA.ObjectToChar("."))) { 
_utc = RemoteObject.concat(_utc.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 19))),RemoteObject.createImmutable("+0000"));Debug.locals.put("utc", _utc);};
 BA.debugLineNum = 1675;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd'T'HH:mm:ssZ\"";
Debug.ShouldStop(1024);
main.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd'T'HH:mm:ssZ"));
 }else {
 BA.debugLineNum = 1678;BA.debugLine="DateTime.DateFormat = \"EEE MMM dd HH:mm:ss Z yyy";
Debug.ShouldStop(8192);
main.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("EEE MMM dd HH:mm:ss Z yyyy"));
 };
 BA.debugLineNum = 1680;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 1681;BA.debugLine="res = DateTime.DateParse(utc)";
Debug.ShouldStop(65536);
_res = main.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_utc));Debug.locals.put("res", _res);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e12.toString()); BA.debugLineNum = 1683;BA.debugLine="res = 0";
Debug.ShouldStop(262144);
_res = BA.numberCast(long.class, 0);Debug.locals.put("res", _res);
 };
 BA.debugLineNum = 1685;BA.debugLine="DateTime.DateFormat = df";
Debug.ShouldStop(1048576);
main.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_df);
 BA.debugLineNum = 1686;BA.debugLine="Return res";
Debug.ShouldStop(2097152);
if (true) return _res;
 BA.debugLineNum = 1687;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
httputils2service_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("cloyd.blink.main");
frmactivity.myClass = BA.getDeviceClass ("cloyd.blink.frmactivity");
frmmedia.myClass = BA.getDeviceClass ("cloyd.blink.frmmedia");
badger.myClass = BA.getDeviceClass ("cloyd.blink.badger");
keyvaluestore.myClass = BA.getDeviceClass ("cloyd.blink.keyvaluestore");
httputils2service.myClass = BA.getDeviceClass ("cloyd.blink.httputils2service");
httpjob.myClass = BA.getDeviceClass ("cloyd.blink.httpjob");
animatedcounter.myClass = BA.getDeviceClass ("cloyd.blink.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("cloyd.blink.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("cloyd.blink.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("cloyd.blink.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("cloyd.blink.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("cloyd.blink.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("cloyd.blink.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("cloyd.blink.b4xfloattextfield");
b4xinputtemplate.myClass = BA.getDeviceClass ("cloyd.blink.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("cloyd.blink.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("cloyd.blink.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("cloyd.blink.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("cloyd.blink.b4xplusminus");
b4xsearchtemplate.myClass = BA.getDeviceClass ("cloyd.blink.b4xsearchtemplate");
b4xseekbar.myClass = BA.getDeviceClass ("cloyd.blink.b4xseekbar");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("cloyd.blink.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("cloyd.blink.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("cloyd.blink.b4xtimedtemplate");
madewithlove.myClass = BA.getDeviceClass ("cloyd.blink.madewithlove");
b4xformatter.myClass = BA.getDeviceClass ("cloyd.blink.b4xformatter");
roundslider.myClass = BA.getDeviceClass ("cloyd.blink.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("cloyd.blink.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("cloyd.blink.swiftbutton");
b4jtextflow.myClass = BA.getDeviceClass ("cloyd.blink.b4jtextflow");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 13;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 14;BA.debugLine="Private emailAddress As String";
main._emailaddress = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="Private password As String";
main._password = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="Private authToken As String";
main._authtoken = RemoteObject.createImmutable("");
 //BA.debugLineNum = 17;BA.debugLine="Private userRegion As String = \"u006\"";
main._userregion = BA.ObjectToString("u006");
 //BA.debugLineNum = 18;BA.debugLine="Private accountID As String = \"88438\" 'ignore";
main._accountid = BA.ObjectToString("88438");
 //BA.debugLineNum = 19;BA.debugLine="Private networkID As String = \"94896\"";
main._networkid = BA.ObjectToString("94896");
 //BA.debugLineNum = 20;BA.debugLine="Private TwoClientFAVerificationRequired As String";
main._twoclientfaverificationrequired = RemoteObject.createImmutable("");
 //BA.debugLineNum = 21;BA.debugLine="Private TwoFAClientID As String";
main._twofaclientid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 22;BA.debugLine="Private commandID As String";
main._commandid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="Private commandComplete As Boolean";
main._commandcomplete = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 24;BA.debugLine="Private cameraThumbnail As String";
main._camerathumbnail = RemoteObject.createImmutable("");
 //BA.debugLineNum = 25;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 26;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 27;BA.debugLine="Private lbTitle As Label 'ignore";
main._lbtitle = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private xMouse, yMouse As Double";
main._xmouse = RemoteObject.createImmutable(0);
main._ymouse = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 29;BA.debugLine="Private isMaximized As Boolean = False";
main._ismaximized = main.__c.getField(true,"False");
 //BA.debugLineNum = 30;BA.debugLine="Private ivClose As ImageView";
main._ivclose = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private ivMax As ImageView";
main._ivmax = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private ivMin As ImageView";
main._ivmin = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private AtualSkin As String";
main._atualskin = RemoteObject.createImmutable("");
 //BA.debugLineNum = 34;BA.debugLine="Private imgInit As String";
main._imginit = RemoteObject.createImmutable("");
 //BA.debugLineNum = 35;BA.debugLine="Private isMaximized As Boolean = False";
main._ismaximized = main.__c.getField(true,"False");
 //BA.debugLineNum = 36;BA.debugLine="Private f_X, f_Y, f_W, f_H As Double 'ignore";
main._f_x = RemoteObject.createImmutable(0);
main._f_y = RemoteObject.createImmutable(0);
main._f_w = RemoteObject.createImmutable(0);
main._f_h = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 37;BA.debugLine="Private btnDriveway As Button 'ignore";
main._btndriveway = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private response As String";
main._response = RemoteObject.createImmutable("");
 //BA.debugLineNum = 39;BA.debugLine="Private ivDriveway As ImageView";
main._ivdriveway = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private lblStatus As Label 'ignore";
main._lblstatus = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private ivFrontDoor As ImageView";
main._ivfrontdoor = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private ivSideYard As ImageView";
main._ivsideyard = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private lblDriveway As Label 'ignore";
main._lbldriveway = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private lblFrontDoor As Label 'ignore";
main._lblfrontdoor = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private lblSideYard As Label 'ignore";
main._lblsideyard = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private clvDriveway As CustomListView";
main._clvdriveway = RemoteObject.createNew ("b4j.example.customlistview");
 //BA.debugLineNum = 47;BA.debugLine="Private clvFrontDoor As CustomListView";
main._clvfrontdoor = RemoteObject.createNew ("b4j.example.customlistview");
 //BA.debugLineNum = 48;BA.debugLine="Private clvSideYard As CustomListView";
main._clvsideyard = RemoteObject.createNew ("b4j.example.customlistview");
 //BA.debugLineNum = 49;BA.debugLine="Private lblSyncModule As Label 'ignore";
main._lblsyncmodule = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 51;BA.debugLine="Private btnActivity As Button 'ignore";
main._btnactivity = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private btnRefresh As Button 'ignore";
main._btnrefresh = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private prevDrivewayUpdateTime As String";
main._prevdrivewayupdatetime = RemoteObject.createImmutable("");
 //BA.debugLineNum = 54;BA.debugLine="Private prevFrontDoorUpdateTime As String";
main._prevfrontdoorupdatetime = RemoteObject.createImmutable("");
 //BA.debugLineNum = 55;BA.debugLine="Private ivSyncModule As ImageView 'ignore";
main._ivsyncmodule = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private ivSyncModuleWiFi As ImageView 'ignore";
main._ivsyncmodulewifi = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private drivewayArmedStatus As String";
main._drivewayarmedstatus = RemoteObject.createImmutable("");
 //BA.debugLineNum = 58;BA.debugLine="Private frontdoorArmedStatus As String";
main._frontdoorarmedstatus = RemoteObject.createImmutable("");
 //BA.debugLineNum = 59;BA.debugLine="Private sideyardArmedStatus As String";
main._sideyardarmedstatus = RemoteObject.createImmutable("");
 //BA.debugLineNum = 60;BA.debugLine="Private btnDrivewayNewClip As Button 'ignore";
main._btndrivewaynewclip = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private btnFrontDoorNewClip As Button 'ignore";
main._btnfrontdoornewclip = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private btnSideYardNewClip As Button 'ignore";
main._btnsideyardnewclip = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private badger1 As Badger";
main._badger1 = RemoteObject.createNew ("cloyd.blink.badger");
 //BA.debugLineNum = 64;BA.debugLine="Private prevCameraThumbnail As String";
main._prevcamerathumbnail = RemoteObject.createImmutable("");
 //BA.debugLineNum = 65;BA.debugLine="Private kvs As KeyValueStore";
main._kvs = RemoteObject.createNew ("cloyd.blink.keyvaluestore");
 //BA.debugLineNum = 66;BA.debugLine="Private btnDrivewayRefresh As Button 'ignore";
main._btndrivewayrefresh = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Private btnFrontDoorRefresh As Button 'ignore";
main._btnfrontdoorrefresh = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private btnSideYardRefresh As Button 'ignore";
main._btnsideyardrefresh = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 69;BA.debugLine="Private swArmed As B4XSwitch 'ignore";
main._swarmed = RemoteObject.createNew ("cloyd.blink.b4xswitch");
 //BA.debugLineNum = 70;BA.debugLine="Private dialog As B4XDialog";
main._dialog = RemoteObject.createNew ("cloyd.blink.b4xdialog");
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _randomstring(RemoteObject _length) throws Exception{
try {
		Debug.PushSubsStack("RandomString (main) ","main",0,main.ba,main.mostCurrent,288);
if (RapidSub.canDelegate("randomstring")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","randomstring", _length);}
RemoteObject _abc = RemoteObject.createImmutable("");
RemoteObject _randomstr = RemoteObject.createImmutable("");
int _i = 0;
Debug.locals.put("length", _length);
 BA.debugLineNum = 288;BA.debugLine="Sub RandomString(length As Int) As String";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 289;BA.debugLine="Dim abc As String = \"0123456789ABCDEFGHIJKLMNOPQR";
Debug.ShouldStop(1);
_abc = BA.ObjectToString("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");Debug.locals.put("abc", _abc);Debug.locals.put("abc", _abc);
 BA.debugLineNum = 290;BA.debugLine="Dim randomstr As String = \"\"";
Debug.ShouldStop(2);
_randomstr = BA.ObjectToString("");Debug.locals.put("randomstr", _randomstr);Debug.locals.put("randomstr", _randomstr);
 BA.debugLineNum = 291;BA.debugLine="For i = 0 To length - 1";
Debug.ShouldStop(4);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_length,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 292;BA.debugLine="randomstr = randomstr & (abc.CharAt(Rnd(0,abc.Le";
Debug.ShouldStop(8);
_randomstr = RemoteObject.concat(_randomstr,(_abc.runMethod(true,"charAt",(Object)(main.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(_abc.runMethod(true,"length")))))));Debug.locals.put("randomstr", _randomstr);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 294;BA.debugLine="Return randomstr";
Debug.ShouldStop(32);
if (true) return _randomstr;
 BA.debugLineNum = 295;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refreshcameras(RemoteObject _firstrun,RemoteObject _whatcamera) throws Exception{
try {
		Debug.PushSubsStack("RefreshCameras (main) ","main",0,main.ba,main.mostCurrent,297);
if (RapidSub.canDelegate("refreshcameras")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","refreshcameras", _firstrun, _whatcamera);}
ResumableSub_RefreshCameras rsub = new ResumableSub_RefreshCameras(null,_firstrun,_whatcamera);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_RefreshCameras extends BA.ResumableSub {
public ResumableSub_RefreshCameras(cloyd.blink.main parent,RemoteObject _firstrun,RemoteObject _whatcamera) {
this.parent = parent;
this._firstrun = _firstrun;
this._whatcamera = _whatcamera;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
cloyd.blink.main parent;
RemoteObject _firstrun;
RemoteObject _whatcamera;
RemoteObject _camera = RemoteObject.createImmutable("");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
RemoteObject _clv = RemoteObject.declareNull("b4j.example.customlistview");
RemoteObject _links = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _attempts = RemoteObject.createImmutable(0);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.declareNull("Object");
RemoteObject _link = RemoteObject.createImmutable("");
RemoteObject _rechecked = RemoteObject.createImmutable(false);
int _i = 0;
RemoteObject group42;
int index42;
int groupLen42;
int step117;
int limit117;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RefreshCameras (main) ","main",0,main.ba,main.mostCurrent,297);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("FirstRun", _firstrun);
Debug.locals.put("whatCamera", _whatcamera);
 BA.debugLineNum = 298;BA.debugLine="Try";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 299;BA.debugLine="Dim camera As String";
Debug.ShouldStop(1024);
_camera = RemoteObject.createImmutable("");Debug.locals.put("camera", _camera);
 BA.debugLineNum = 300;BA.debugLine="Dim iv As ImageView";
Debug.ShouldStop(2048);
_iv = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 301;BA.debugLine="Dim clv As CustomListView";
Debug.ShouldStop(4096);
_clv = RemoteObject.createNew ("b4j.example.customlistview");Debug.locals.put("clv", _clv);
 BA.debugLineNum = 302;BA.debugLine="Dim links As List";
Debug.ShouldStop(8192);
_links = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("links", _links);
 BA.debugLineNum = 303;BA.debugLine="Dim attempts As Int";
Debug.ShouldStop(16384);
_attempts = RemoteObject.createImmutable(0);Debug.locals.put("attempts", _attempts);
 BA.debugLineNum = 304;BA.debugLine="links = Array(\"347574\", \"236967\", \"458236\")";
Debug.ShouldStop(32768);
_links = parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable(("347574")),RemoteObject.createImmutable(("236967")),(RemoteObject.createImmutable("458236"))})));Debug.locals.put("links", _links);
 BA.debugLineNum = 306;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-\"";
Debug.ShouldStop(131072);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/syncmodules")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 307;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"), _rs);
this.state = 106;
return;
case 106:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 309;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.Co";
Debug.ShouldStop(1048576);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean(".",parent._response.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR: ")))) || RemoteObject.solveBoolean(".",parent._response.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("System is busy, please wait"))))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 310;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(2097152);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 311;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(4194304);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 312;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(8388608);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 313;BA.debugLine="btnDrivewayNewClip.Enabled = True";
Debug.ShouldStop(16777216);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 314;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
Debug.ShouldStop(33554432);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 315;BA.debugLine="btnSideYardNewClip.Enabled = True";
Debug.ShouldStop(67108864);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 316;BA.debugLine="Return Null";
Debug.ShouldStop(134217728);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 320;BA.debugLine="Dim rs As ResumableSub = GetSyncModuleInfo(respo";
Debug.ShouldStop(-2147483648);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _getsyncmoduleinfo(parent._response);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 321;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"), _rs);
this.state = 107;
return;
case 107:
//C
this.state = 8;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 323;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-\"";
Debug.ShouldStop(4);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/homescreen")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 324;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"), _rs);
this.state = 108;
return;
case 108:
//C
this.state = 8;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 326;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.Co";
Debug.ShouldStop(32);
if (true) break;

case 8:
//if
this.state = 11;
if (RemoteObject.solveBoolean(".",parent._response.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR: ")))) || RemoteObject.solveBoolean(".",parent._response.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("System is busy, please wait"))))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 327;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(64);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 328;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(128);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 329;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(256);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 330;BA.debugLine="btnDrivewayNewClip.Enabled = True";
Debug.ShouldStop(512);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 331;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
Debug.ShouldStop(1024);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 332;BA.debugLine="btnSideYardNewClip.Enabled = True";
Debug.ShouldStop(2048);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 333;BA.debugLine="Return Null";
Debug.ShouldStop(4096);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 336;BA.debugLine="File.WriteString(File.DirApp,\"GetHomescreen.txt\"";
Debug.ShouldStop(32768);
parent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("GetHomescreen.txt")),(Object)(parent._response));
 BA.debugLineNum = 338;BA.debugLine="Dim rs As ResumableSub = GetHomescreen(response)";
Debug.ShouldStop(131072);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _gethomescreen(parent._response);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 339;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"), _rs);
this.state = 109;
return;
case 109:
//C
this.state = 12;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 341;BA.debugLine="If FirstRun= False And whatCamera = \"All\"  Then";
Debug.ShouldStop(1048576);
if (true) break;

case 12:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",_firstrun,parent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_whatcamera,BA.ObjectToString("All"))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 342;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
Debug.ShouldStop(2097152);
_bluriv(BA.ObjectToString("Driveway.jpg"),parent._ivdriveway);
 BA.debugLineNum = 343;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
Debug.ShouldStop(4194304);
_bluriv(BA.ObjectToString("FrontDoor.jpg"),parent._ivfrontdoor);
 BA.debugLineNum = 344;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
Debug.ShouldStop(8388608);
_bluriv(BA.ObjectToString("SideYard.jpg"),parent._ivsideyard);
 if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 348;BA.debugLine="Dim rs As ResumableSub = GetUnwatchedVideos";
Debug.ShouldStop(134217728);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _getunwatchedvideos();Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 349;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"), _rs);
this.state = 110;
return;
case 110:
//C
this.state = 16;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 351;BA.debugLine="For Each link As String In links";
Debug.ShouldStop(1073741824);
if (true) break;

case 16:
//for
this.state = 94;
group42 = _links;
index42 = 0;
groupLen42 = group42.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("link", _link);
this.state = 111;
if (true) break;

case 111:
//C
this.state = 94;
if (index42 < groupLen42) {
this.state = 18;
_link = BA.ObjectToString(group42.runMethod(false,"Get",index42));Debug.locals.put("link", _link);}
if (true) break;

case 112:
//C
this.state = 111;
index42++;
Debug.locals.put("link", _link);
if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 352;BA.debugLine="camera = link";
Debug.ShouldStop(-2147483648);
_camera = _link;Debug.locals.put("camera", _camera);
 BA.debugLineNum = 353;BA.debugLine="If camera <> whatCamera And whatCamera <> \"All\"";
Debug.ShouldStop(1);
if (true) break;

case 19:
//if
this.state = 22;
if (RemoteObject.solveBoolean("!",_camera,_whatcamera) && RemoteObject.solveBoolean("!",_whatcamera,BA.ObjectToString("All"))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 354;BA.debugLine="Continue";
Debug.ShouldStop(2);
this.state = 112;
if (true) break;;
 if (true) break;
;
 BA.debugLineNum = 357;BA.debugLine="If FirstRun Then";
Debug.ShouldStop(16);

case 22:
//if
this.state = 43;
if (_firstrun.<Boolean>get().booleanValue()) { 
this.state = 24;
}else {
this.state = 34;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 358;BA.debugLine="If camera = \"347574\" Then";
Debug.ShouldStop(32);
if (true) break;

case 25:
//if
this.state = 32;
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("347574"))) { 
this.state = 27;
}else 
{ BA.debugLineNum = 362;BA.debugLine="Else If camera = \"236967\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("236967"))) { 
this.state = 29;
}else 
{ BA.debugLineNum = 366;BA.debugLine="Else If camera = \"458236\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("458236"))) { 
this.state = 31;
}}}
if (true) break;

case 27:
//C
this.state = 32;
 BA.debugLineNum = 359;BA.debugLine="lblStatus.Text = \"Retrieving Driveway thumbna";
Debug.ShouldStop(64);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Retrieving Driveway thumbnail..."));
 BA.debugLineNum = 360;BA.debugLine="iv = ivDriveway";
Debug.ShouldStop(128);
_iv = parent._ivdriveway;Debug.locals.put("iv", _iv);
 BA.debugLineNum = 361;BA.debugLine="clv = clvDriveway";
Debug.ShouldStop(256);
_clv = parent._clvdriveway;Debug.locals.put("clv", _clv);
 if (true) break;

case 29:
//C
this.state = 32;
 BA.debugLineNum = 363;BA.debugLine="lblStatus.Text = \"Retrieving Front Door thumb";
Debug.ShouldStop(1024);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Retrieving Front Door thumbnail..."));
 BA.debugLineNum = 364;BA.debugLine="iv = ivFrontDoor";
Debug.ShouldStop(2048);
_iv = parent._ivfrontdoor;Debug.locals.put("iv", _iv);
 BA.debugLineNum = 365;BA.debugLine="clv = clvFrontDoor";
Debug.ShouldStop(4096);
_clv = parent._clvfrontdoor;Debug.locals.put("clv", _clv);
 if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 367;BA.debugLine="lblStatus.Text = \"Retrieving Side Yard thumbn";
Debug.ShouldStop(16384);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Retrieving Side Yard thumbnail..."));
 BA.debugLineNum = 368;BA.debugLine="iv = ivSideYard";
Debug.ShouldStop(32768);
_iv = parent._ivsideyard;Debug.locals.put("iv", _iv);
 BA.debugLineNum = 369;BA.debugLine="clv = clvSideYard";
Debug.ShouldStop(65536);
_clv = parent._clvsideyard;Debug.locals.put("clv", _clv);
 if (true) break;

case 32:
//C
this.state = 43;
;
 if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 372;BA.debugLine="If camera = \"347574\" Then";
Debug.ShouldStop(524288);
if (true) break;

case 35:
//if
this.state = 42;
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("347574"))) { 
this.state = 37;
}else 
{ BA.debugLineNum = 377;BA.debugLine="Else If camera = \"236967\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("236967"))) { 
this.state = 39;
}else 
{ BA.debugLineNum = 382;BA.debugLine="Else If camera = \"458236\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("458236"))) { 
this.state = 41;
}}}
if (true) break;

case 37:
//C
this.state = 42;
 BA.debugLineNum = 373;BA.debugLine="lblStatus.Text = \"Capturing a new Driveway th";
Debug.ShouldStop(1048576);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Capturing a new Driveway thumbnail..."));
 BA.debugLineNum = 374;BA.debugLine="iv = ivDriveway";
Debug.ShouldStop(2097152);
_iv = parent._ivdriveway;Debug.locals.put("iv", _iv);
 BA.debugLineNum = 375;BA.debugLine="clv = clvDriveway";
Debug.ShouldStop(4194304);
_clv = parent._clvdriveway;Debug.locals.put("clv", _clv);
 BA.debugLineNum = 376;BA.debugLine="attempts = 15";
Debug.ShouldStop(8388608);
_attempts = BA.numberCast(int.class, 15);Debug.locals.put("attempts", _attempts);
 if (true) break;

case 39:
//C
this.state = 42;
 BA.debugLineNum = 378;BA.debugLine="lblStatus.Text = \"Capturing a new Front Door";
Debug.ShouldStop(33554432);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Capturing a new Front Door thumbnail..."));
 BA.debugLineNum = 379;BA.debugLine="iv = ivFrontDoor";
Debug.ShouldStop(67108864);
_iv = parent._ivfrontdoor;Debug.locals.put("iv", _iv);
 BA.debugLineNum = 380;BA.debugLine="clv = clvFrontDoor";
Debug.ShouldStop(134217728);
_clv = parent._clvfrontdoor;Debug.locals.put("clv", _clv);
 BA.debugLineNum = 381;BA.debugLine="attempts = 15";
Debug.ShouldStop(268435456);
_attempts = BA.numberCast(int.class, 15);Debug.locals.put("attempts", _attempts);
 if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 383;BA.debugLine="lblStatus.Text = \"Capturing a new Side Yard t";
Debug.ShouldStop(1073741824);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Capturing a new Side Yard thumbnail..."));
 BA.debugLineNum = 384;BA.debugLine="iv = ivSideYard";
Debug.ShouldStop(-2147483648);
_iv = parent._ivsideyard;Debug.locals.put("iv", _iv);
 BA.debugLineNum = 385;BA.debugLine="clv = clvSideYard";
Debug.ShouldStop(1);
_clv = parent._clvsideyard;Debug.locals.put("clv", _clv);
 BA.debugLineNum = 386;BA.debugLine="attempts = 15";
Debug.ShouldStop(2);
_attempts = BA.numberCast(int.class, 15);Debug.locals.put("attempts", _attempts);
 if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;
;
 BA.debugLineNum = 390;BA.debugLine="If FirstRun Then";
Debug.ShouldStop(32);

case 43:
//if
this.state = 93;
if (_firstrun.<Boolean>get().booleanValue()) { 
this.state = 45;
}else {
this.state = 47;
}if (true) break;

case 45:
//C
this.state = 93;
 BA.debugLineNum = 391;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest";
Debug.ShouldStop(64);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/camera/"),_camera));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 392;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"), _rs);
this.state = 113;
return;
case 113:
//C
this.state = 93;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 395;BA.debugLine="Dim rs As ResumableSub = GetCameraInfo(respons";
Debug.ShouldStop(1024);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _getcamerainfo(parent._response,_clv);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 396;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"), _rs);
this.state = 114;
return;
case 114:
//C
this.state = 93;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 398;BA.debugLine="Dim rs As ResumableSub = DownloadImage(\"https:";
Debug.ShouldStop(8192);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _downloadimage(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/"),parent._camerathumbnail,RemoteObject.createImmutable(".jpg")),_iv,_camera);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 399;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"), _rs);
this.state = 115;
return;
case 115:
//C
this.state = 93;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 402;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest";
Debug.ShouldStop(131072);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/camera/"),_camera));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 403;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"), _rs);
this.state = 116;
return;
case 116:
//C
this.state = 48;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 406;BA.debugLine="Dim rs As ResumableSub = GetCameraInfo(respons";
Debug.ShouldStop(2097152);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _getcamerainfo(parent._response,(parent.__c.getField(false,"Null")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 407;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"), _rs);
this.state = 117;
return;
case 117:
//C
this.state = 48;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 409;BA.debugLine="prevCameraThumbnail = cameraThumbnail";
Debug.ShouldStop(16777216);
parent._prevcamerathumbnail = parent._camerathumbnail;
 BA.debugLineNum = 411;BA.debugLine="Dim rs As ResumableSub = RESTPost(\"https://res";
Debug.ShouldStop(67108864);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restpost(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/camera/"),_camera,RemoteObject.createImmutable("/thumbnail")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 412;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"), _rs);
this.state = 118;
return;
case 118:
//C
this.state = 48;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 415;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.";
Debug.ShouldStop(1073741824);
if (true) break;

case 48:
//if
this.state = 92;
if (RemoteObject.solveBoolean(".",parent._response.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR: ")))) || RemoteObject.solveBoolean(".",parent._response.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("System is busy, please wait"))))) { 
this.state = 50;
}else {
this.state = 52;
}if (true) break;

case 50:
//C
this.state = 92;
 BA.debugLineNum = 416;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(-2147483648);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 417;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(1);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 418;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(2);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 419;BA.debugLine="btnDrivewayNewClip.Enabled = True";
Debug.ShouldStop(4);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 420;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
Debug.ShouldStop(8);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 421;BA.debugLine="btnSideYardNewClip.Enabled = True";
Debug.ShouldStop(16);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 422;BA.debugLine="Return Null";
Debug.ShouldStop(32);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 424;BA.debugLine="Dim rs As ResumableSub = GetCommandID(respons";
Debug.ShouldStop(128);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _getcommandid(parent._response);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 425;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"), _rs);
this.state = 119;
return;
case 119:
//C
this.state = 53;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 427;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://res";
Debug.ShouldStop(1024);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/command/"),parent._commandid));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 428;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"), _rs);
this.state = 120;
return;
case 120:
//C
this.state = 53;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 431;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response";
Debug.ShouldStop(16384);
if (true) break;

case 53:
//if
this.state = 91;
if (RemoteObject.solveBoolean(".",parent._response.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR: ")))) || RemoteObject.solveBoolean(".",parent._response.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("System is busy, please wait"))))) { 
this.state = 55;
}else {
this.state = 57;
}if (true) break;

case 55:
//C
this.state = 91;
 BA.debugLineNum = 432;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(32768);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 433;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(65536);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 434;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(131072);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 435;BA.debugLine="btnDrivewayNewClip.Enabled = True";
Debug.ShouldStop(262144);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 436;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
Debug.ShouldStop(524288);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 437;BA.debugLine="btnSideYardNewClip.Enabled = True";
Debug.ShouldStop(1048576);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 438;BA.debugLine="Return Null";
Debug.ShouldStop(2097152);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 440;BA.debugLine="Dim reChecked As Boolean";
Debug.ShouldStop(8388608);
_rechecked = RemoteObject.createImmutable(false);Debug.locals.put("reChecked", _rechecked);
 BA.debugLineNum = 441;BA.debugLine="For i = 1 To attempts";
Debug.ShouldStop(16777216);
if (true) break;

case 58:
//for
this.state = 77;
step117 = 1;
limit117 = _attempts.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 60:
//C
this.state = 61;
 BA.debugLineNum = 444;BA.debugLine="Dim rs As ResumableSub = GetCommandResponse";
Debug.ShouldStop(134217728);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _getcommandresponse(_iv,_clv,_camera,BA.NumberToString(_i),BA.NumberToString(_attempts));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 445;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"), _rs);
this.state = 123;
return;
case 123:
//C
this.state = 61;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 446;BA.debugLine="If Result Then Exit";
Debug.ShouldStop(536870912);
if (true) break;

case 61:
//if
this.state = 66;
if (BA.ObjectToBoolean(_result).<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 447;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://r";
Debug.ShouldStop(1073741824);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/command/"),parent._commandid));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 448;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"), _rs);
this.state = 124;
return;
case 124:
//C
this.state = 67;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 449;BA.debugLine="Sleep(1000) ' 1 second";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"),BA.numberCast(int.class, 1000));
this.state = 125;
return;
case 125:
//C
this.state = 67;
;
 BA.debugLineNum = 451;BA.debugLine="If i = attempts And reChecked =  False Then";
Debug.ShouldStop(4);
if (true) break;

case 67:
//if
this.state = 76;
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),_attempts) && RemoteObject.solveBoolean("=",_rechecked,parent.__c.getField(true,"False"))) { 
this.state = 69;
}if (true) break;

case 69:
//C
this.state = 70;
 BA.debugLineNum = 452;BA.debugLine="reChecked = True";
Debug.ShouldStop(8);
_rechecked = parent.__c.getField(true,"True");Debug.locals.put("reChecked", _rechecked);
 BA.debugLineNum = 453;BA.debugLine="Log(\"*********** HERE *********** i = \" &";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("*********** HERE *********** i = "),RemoteObject.createImmutable(_i))));
 BA.debugLineNum = 454;BA.debugLine="Dim rs As ResumableSub = RESTPost(\"https:/";
Debug.ShouldStop(32);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restpost(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/camera/"),_camera,RemoteObject.createImmutable("/thumbnail")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 455;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"), _rs);
this.state = 126;
return;
case 126:
//C
this.state = 70;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 457;BA.debugLine="If response.StartsWith(\"ERROR: \") Or respo";
Debug.ShouldStop(256);
if (true) break;

case 70:
//if
this.state = 75;
if (RemoteObject.solveBoolean(".",parent._response.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR: ")))) || RemoteObject.solveBoolean(".",parent._response.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("System is busy, please wait"))))) { 
this.state = 72;
}else {
this.state = 74;
}if (true) break;

case 72:
//C
this.state = 75;
 BA.debugLineNum = 458;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(512);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 459;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(1024);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 460;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(2048);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 461;BA.debugLine="btnDrivewayNewClip.Enabled = True";
Debug.ShouldStop(4096);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 462;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
Debug.ShouldStop(8192);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 463;BA.debugLine="btnSideYardNewClip.Enabled = True";
Debug.ShouldStop(16384);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 464;BA.debugLine="Return Null";
Debug.ShouldStop(32768);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 74:
//C
this.state = 75;
 BA.debugLineNum = 466;BA.debugLine="i = 1";
Debug.ShouldStop(131072);
_i = 1;Debug.locals.put("i", _i);
 if (true) break;

case 75:
//C
this.state = 76;
;
 BA.debugLineNum = 468;BA.debugLine="Log(\"*********** HERE TWO ***********\")";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("*********** HERE TWO ***********")));
 BA.debugLineNum = 469;BA.debugLine="Dim rs As ResumableSub = GetCommandID(resp";
Debug.ShouldStop(1048576);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _getcommandid(parent._response);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 470;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"), _rs);
this.state = 127;
return;
case 127:
//C
this.state = 76;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 472;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://";
Debug.ShouldStop(8388608);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/command/"),parent._commandid));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 473;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"), _rs);
this.state = 128;
return;
case 128:
//C
this.state = 76;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 if (true) break;

case 76:
//C
this.state = 122;
;
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 477;BA.debugLine="If response.StartsWith(\"ERROR: \") Or respons";
Debug.ShouldStop(268435456);

case 77:
//if
this.state = 90;
if (RemoteObject.solveBoolean(".",parent._response.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR: ")))) || RemoteObject.solveBoolean(".",parent._response.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("System is busy, please wait"))))) { 
this.state = 79;
}else 
{ BA.debugLineNum = 485;BA.debugLine="else If commandComplete = False Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",parent._commandcomplete,parent.__c.getField(true,"False"))) { 
this.state = 81;
}}
if (true) break;

case 79:
//C
this.state = 90;
 BA.debugLineNum = 478;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(536870912);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 479;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(1073741824);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 480;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(-2147483648);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 481;BA.debugLine="btnDrivewayNewClip.Enabled = True";
Debug.ShouldStop(1);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 482;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
Debug.ShouldStop(2);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 483;BA.debugLine="btnSideYardNewClip.Enabled = True";
Debug.ShouldStop(4);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 484;BA.debugLine="Return Null";
Debug.ShouldStop(8);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 81:
//C
this.state = 82;
 BA.debugLineNum = 486;BA.debugLine="If camera = \"347574\" Then";
Debug.ShouldStop(32);
if (true) break;

case 82:
//if
this.state = 89;
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("347574"))) { 
this.state = 84;
}else 
{ BA.debugLineNum = 488;BA.debugLine="Else If camera = \"236967\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("236967"))) { 
this.state = 86;
}else 
{ BA.debugLineNum = 490;BA.debugLine="Else If camera = \"458236\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("458236"))) { 
this.state = 88;
}}}
if (true) break;

case 84:
//C
this.state = 89;
 BA.debugLineNum = 487;BA.debugLine="lblStatus.Text = \"Failed to retrieve Drive";
Debug.ShouldStop(64);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Failed to retrieve Driveway thumbnail..."));
 if (true) break;

case 86:
//C
this.state = 89;
 BA.debugLineNum = 489;BA.debugLine="lblStatus.Text = \"Failed to retrieve Front";
Debug.ShouldStop(256);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Failed to retrieve Front Door thumbnail..."));
 if (true) break;

case 88:
//C
this.state = 89;
 BA.debugLineNum = 491;BA.debugLine="lblStatus.Text = \"Failed to retrieve Side";
Debug.ShouldStop(1024);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Failed to retrieve Side Yard thumbnail..."));
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
Debug.locals.put("link", _link);
;
 BA.debugLineNum = 501;BA.debugLine="lblStatus.Text = \"Ready\"";
Debug.ShouldStop(1048576);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Ready"));
 Debug.CheckDeviceExceptions();
if (true) break;

case 96:
//C
this.state = 97;
this.catchState = 0;
 BA.debugLineNum = 503;BA.debugLine="response = \"ERROR: \" & LastException";
Debug.ShouldStop(4194304);
parent._response = RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),parent.__c.runMethod(false,"LastException",main.ba));
 BA.debugLineNum = 504;BA.debugLine="Log(\"RefreshCamera LastException: \" & LastExcept";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("RefreshCamera LastException: "),parent.__c.runMethod(false,"LastException",main.ba))));
 if (true) break;
if (true) break;

case 97:
//C
this.state = 98;
this.catchState = 0;
;
 BA.debugLineNum = 506;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(33554432);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 507;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(67108864);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 508;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(134217728);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 509;BA.debugLine="btnDrivewayNewClip.Enabled = True";
Debug.ShouldStop(268435456);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 510;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
Debug.ShouldStop(536870912);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 511;BA.debugLine="btnSideYardNewClip.Enabled = True";
Debug.ShouldStop(1073741824);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 512;BA.debugLine="If lblSideYard.Text.Contains(\"OFFLINE\") Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 98:
//if
this.state = 105;
if (parent._lblsideyard.runMethod(true,"getText").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("OFFLINE"))).<Boolean>get().booleanValue()) { 
this.state = 100;
}else 
{ BA.debugLineNum = 515;BA.debugLine="Else if lblDriveway.Text.Contains(\"OFFLINE\") Then";
Debug.ShouldStop(4);
if (parent._lbldriveway.runMethod(true,"getText").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("OFFLINE"))).<Boolean>get().booleanValue()) { 
this.state = 102;
}else 
{ BA.debugLineNum = 518;BA.debugLine="Else if lblFrontDoor.Text.Contains(\"OFFLINE\") The";
Debug.ShouldStop(32);
if (parent._lblfrontdoor.runMethod(true,"getText").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("OFFLINE"))).<Boolean>get().booleanValue()) { 
this.state = 104;
}}}
if (true) break;

case 100:
//C
this.state = 105;
 BA.debugLineNum = 513;BA.debugLine="lblSideYard.Text = sideyardArmedStatus";
Debug.ShouldStop(1);
parent._lblsideyard.runMethod(true,"setText",parent._sideyardarmedstatus);
 BA.debugLineNum = 514;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
Debug.ShouldStop(2);
_bluriv(BA.ObjectToString("SideYard.jpg"),parent._ivsideyard);
 if (true) break;

case 102:
//C
this.state = 105;
 BA.debugLineNum = 516;BA.debugLine="lblDriveway.Text = drivewayArmedStatus";
Debug.ShouldStop(8);
parent._lbldriveway.runMethod(true,"setText",parent._drivewayarmedstatus);
 BA.debugLineNum = 517;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
Debug.ShouldStop(16);
_bluriv(BA.ObjectToString("Driveway.jpg"),parent._ivdriveway);
 if (true) break;

case 104:
//C
this.state = 105;
 BA.debugLineNum = 519;BA.debugLine="lblFrontDoor.Text = frontdoorArmedStatus";
Debug.ShouldStop(64);
parent._lblfrontdoor.runMethod(true,"setText",parent._frontdoorarmedstatus);
 BA.debugLineNum = 520;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
Debug.ShouldStop(128);
_bluriv(BA.ObjectToString("FrontDoor.jpg"),parent._ivfrontdoor);
 if (true) break;

case 105:
//C
this.state = -1;
;
 BA.debugLineNum = 522;BA.debugLine="Return Null";
Debug.ShouldStop(512);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 523;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _requestauthtoken() throws Exception{
try {
		Debug.PushSubsStack("RequestAuthToken (main) ","main",0,main.ba,main.mostCurrent,212);
if (RapidSub.canDelegate("requestauthtoken")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","requestauthtoken");}
ResumableSub_RequestAuthToken rsub = new ResumableSub_RequestAuthToken(null);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_RequestAuthToken extends BA.ResumableSub {
public ResumableSub_RequestAuthToken(cloyd.blink.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
cloyd.blink.main parent;
RemoteObject _joblogin = RemoteObject.declareNull("cloyd.blink.httpjob");
RemoteObject _input = RemoteObject.declareNull("cloyd.blink.b4xinputtemplate");
RemoteObject _diagresult = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RequestAuthToken (main) ","main",0,main.ba,main.mostCurrent,212);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 213;BA.debugLine="Try";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 214;BA.debugLine="lblStatus.Text = \"Authenticating...\"";
Debug.ShouldStop(2097152);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Authenticating..."));
 BA.debugLineNum = 215;BA.debugLine="Dim jobLogin As HttpJob";
Debug.ShouldStop(4194304);
_joblogin = RemoteObject.createNew ("cloyd.blink.httpjob");Debug.locals.put("jobLogin", _joblogin);
 BA.debugLineNum = 216;BA.debugLine="jobLogin.Initialize(\"\", Me)";
Debug.ShouldStop(8388608);
_joblogin.runClassMethod (cloyd.blink.httpjob.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 217;BA.debugLine="jobLogin.PostString(\"https://rest-prod.immedia-s";
Debug.ShouldStop(16777216);
_joblogin.runClassMethod (cloyd.blink.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("https://rest-prod.immedia-semi.com/api/v4/account/login")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("email="),parent._emailaddress,RemoteObject.createImmutable("&password="),parent._password)));
 BA.debugLineNum = 218;BA.debugLine="jobLogin.GetRequest.SetContentType(\"application/";
Debug.ShouldStop(33554432);
_joblogin.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/x-www-form-urlencoded")));
 BA.debugLineNum = 219;BA.debugLine="jobLogin.GetRequest.SetHeader(\"User-Agent\",Rando";
Debug.ShouldStop(67108864);
_joblogin.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("User-Agent")),(Object)(_randomstring(BA.numberCast(int.class, 12))));
 BA.debugLineNum = 221;BA.debugLine="Wait For (jobLogin) JobDone(jobLogin As HttpJob)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","jobdone", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "requestauthtoken"), (_joblogin));
this.state = 30;
return;
case 30:
//C
this.state = 4;
_joblogin = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("jobLogin", _joblogin);
;
 BA.debugLineNum = 222;BA.debugLine="If jobLogin.Success Then";
Debug.ShouldStop(536870912);
if (true) break;

case 4:
//if
this.state = 26;
if (_joblogin.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 25;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 223;BA.debugLine="lblStatus.Text = \"Successfully logged in to the";
Debug.ShouldStop(1073741824);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Successfully logged in to the Blink server..."));
 BA.debugLineNum = 224;BA.debugLine="File.WriteString(File.DirApp,\"response_login.tx";
Debug.ShouldStop(-2147483648);
parent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("response_login.txt")),(Object)(_joblogin.runClassMethod (cloyd.blink.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 225;BA.debugLine="GetAuthInfo(jobLogin.GetString)";
Debug.ShouldStop(1);
_getauthinfo(_joblogin.runClassMethod (cloyd.blink.httpjob.class, "_getstring" /*RemoteObject*/ ));
 BA.debugLineNum = 227;BA.debugLine="If TwoClientFAVerificationRequired Then";
Debug.ShouldStop(4);
if (true) break;

case 7:
//if
this.state = 18;
if (BA.ObjectToBoolean(parent._twoclientfaverificationrequired.<String>get()).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 228;BA.debugLine="Dim input As B4XInputTemplate";
Debug.ShouldStop(8);
_input = RemoteObject.createNew ("cloyd.blink.b4xinputtemplate");Debug.locals.put("input", _input);
 BA.debugLineNum = 229;BA.debugLine="Dim diagResult As Int";
Debug.ShouldStop(16);
_diagresult = RemoteObject.createImmutable(0);Debug.locals.put("diagResult", _diagresult);
 BA.debugLineNum = 230;BA.debugLine="input.Initialize";
Debug.ShouldStop(32);
_input.runClassMethod (cloyd.blink.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,main.ba);
 BA.debugLineNum = 231;BA.debugLine="input.lblTitle.Text = \"Enter verification code";
Debug.ShouldStop(64);
_input.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Enter verification code:"));
 BA.debugLineNum = 232;BA.debugLine="input.ConfigureForNumbers(False, False) 'Allow";
Debug.ShouldStop(128);
_input.runClassMethod (cloyd.blink.b4xinputtemplate.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"False")),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 233;BA.debugLine="Wait For (dialog.ShowTemplate(input, \"OK\", \"\",";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "requestauthtoken"), parent._dialog.runClassMethod (cloyd.blink.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_input)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 31;
return;
case 31:
//C
this.state = 10;
_diagresult = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("diagResult", _diagresult);
;
 BA.debugLineNum = 234;BA.debugLine="If diagResult = xui.DialogResponse_Positive Th";
Debug.ShouldStop(512);
if (true) break;

case 10:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_diagresult,parent._xui.getField(true,"DialogResponse_Positive"))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 235;BA.debugLine="Dim res As Int = input.Text 'no need to check";
Debug.ShouldStop(1024);
_res = BA.numberCast(int.class, _input.getField(true,"_text" /*RemoteObject*/ ));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 236;BA.debugLine="Log(res)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_res)));
 BA.debugLineNum = 237;BA.debugLine="jobLogin.PostString(\"https://rest-u006.immedi";
Debug.ShouldStop(4096);
_joblogin.runClassMethod (cloyd.blink.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://rest-u006.immedia-semi.com/api/v4/account/88438/client/"),parent._twofaclientid,RemoteObject.createImmutable("/pin/verify/"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("pin="),_res)));
 BA.debugLineNum = 238;BA.debugLine="jobLogin.GetRequest.SetContentType(\"applicati";
Debug.ShouldStop(8192);
_joblogin.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/x-www-form-urlencoded")));
 BA.debugLineNum = 239;BA.debugLine="Wait For (jobLogin) JobDone(jobLogin As HttpJ";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","jobdone", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "requestauthtoken"), (_joblogin));
this.state = 32;
return;
case 32:
//C
this.state = 13;
_joblogin = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("jobLogin", _joblogin);
;
 BA.debugLineNum = 240;BA.debugLine="If jobLogin.Success = False Then";
Debug.ShouldStop(32768);
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_joblogin.getField(true,"_success" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 241;BA.debugLine="lblStatus.Text = GetRESTError(jobLogin.Error";
Debug.ShouldStop(65536);
parent._lblstatus.runMethod(true,"setText",_getresterror(_joblogin.getField(true,"_errormessage" /*RemoteObject*/ )));
 BA.debugLineNum = 242;BA.debugLine="Log(\"2FA error: \" & jobLogin.ErrorMessage)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("2FA error: "),_joblogin.getField(true,"_errormessage" /*RemoteObject*/ ))));
 BA.debugLineNum = 243;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(262144);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 244;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(524288);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 245;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(1048576);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 246;BA.debugLine="btnDrivewayNewClip.Enabled = True";
Debug.ShouldStop(2097152);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 247;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
Debug.ShouldStop(4194304);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 248;BA.debugLine="btnSideYardNewClip.Enabled = True";
Debug.ShouldStop(8388608);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 249;BA.debugLine="jobLogin.Release";
Debug.ShouldStop(16777216);
_joblogin.runClassMethod (cloyd.blink.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 250;BA.debugLine="Return Null";
Debug.ShouldStop(33554432);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
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
 BA.debugLineNum = 255;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.C";
Debug.ShouldStop(1073741824);

case 18:
//if
this.state = 23;
if (RemoteObject.solveBoolean(".",parent._response.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR: ")))) || RemoteObject.solveBoolean(".",parent._response.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("System is busy, please wait"))))) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
 BA.debugLineNum = 256;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(-2147483648);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 257;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(1);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 258;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(2);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 259;BA.debugLine="btnDrivewayNewClip.Enabled = True";
Debug.ShouldStop(4);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 260;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
Debug.ShouldStop(8);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 261;BA.debugLine="btnSideYardNewClip.Enabled = True";
Debug.ShouldStop(16);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 262;BA.debugLine="jobLogin.Release";
Debug.ShouldStop(32);
_joblogin.runClassMethod (cloyd.blink.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 263;BA.debugLine="Return Null";
Debug.ShouldStop(64);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 265;BA.debugLine="lblStatus.Text = \"AuthToken acquired...\"";
Debug.ShouldStop(256);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("AuthToken acquired..."));
 if (true) break;

case 23:
//C
this.state = 26;
;
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 268;BA.debugLine="lblStatus.Text = GetRESTError(jobLogin.ErrorMes";
Debug.ShouldStop(2048);
parent._lblstatus.runMethod(true,"setText",_getresterror(_joblogin.getField(true,"_errormessage" /*RemoteObject*/ )));
 BA.debugLineNum = 269;BA.debugLine="Log(\"RequestAuthToken error: \" & jobLogin.Error";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("RequestAuthToken error: "),_joblogin.getField(true,"_errormessage" /*RemoteObject*/ ))));
 BA.debugLineNum = 270;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(8192);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 271;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(16384);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 272;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(32768);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 273;BA.debugLine="btnDrivewayNewClip.Enabled = True";
Debug.ShouldStop(65536);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 274;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
Debug.ShouldStop(131072);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 275;BA.debugLine="btnSideYardNewClip.Enabled = True";
Debug.ShouldStop(262144);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 276;BA.debugLine="jobLogin.Release";
Debug.ShouldStop(524288);
_joblogin.runClassMethod (cloyd.blink.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 277;BA.debugLine="Return Null";
Debug.ShouldStop(1048576);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 26:
//C
this.state = 29;
;
 BA.debugLineNum = 279;BA.debugLine="jobLogin.Release";
Debug.ShouldStop(4194304);
_joblogin.runClassMethod (cloyd.blink.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 280;BA.debugLine="Dim rs As ResumableSub = RefreshCameras(True, \"A";
Debug.ShouldStop(8388608);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _refreshcameras(parent.__c.getField(true,"True"),RemoteObject.createImmutable("All"));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 281;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "requestauthtoken"), _rs);
this.state = 33;
return;
case 33:
//C
this.state = 29;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 0;
 BA.debugLineNum = 283;BA.debugLine="Log(\"RequestAuthToken LastException: \" & LastExc";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("RequestAuthToken LastException: "),parent.__c.runMethod(false,"LastException",main.ba))));
 if (true) break;
if (true) break;

case 29:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 285;BA.debugLine="Return Null";
Debug.ShouldStop(268435456);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 286;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _restget(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("RESTGet (main) ","main",0,main.ba,main.mostCurrent,573);
if (RapidSub.canDelegate("restget")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","restget", _url);}
ResumableSub_RESTGet rsub = new ResumableSub_RESTGet(null,_url);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_RESTGet extends BA.ResumableSub {
public ResumableSub_RESTGet(cloyd.blink.main parent,RemoteObject _url) {
this.parent = parent;
this._url = _url;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
cloyd.blink.main parent;
RemoteObject _url;
RemoteObject _j = RemoteObject.declareNull("cloyd.blink.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RESTGet (main) ","main",0,main.ba,main.mostCurrent,573);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("url", _url);
 BA.debugLineNum = 574;BA.debugLine="Try";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 575;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(1073741824);
_j = RemoteObject.createNew ("cloyd.blink.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 576;BA.debugLine="response = \"\"";
Debug.ShouldStop(-2147483648);
parent._response = BA.ObjectToString("");
 BA.debugLineNum = 577;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no";
Debug.ShouldStop(1);
_j.runClassMethod (cloyd.blink.httpjob.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 578;BA.debugLine="j.Download(url)";
Debug.ShouldStop(2);
_j.runClassMethod (cloyd.blink.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 579;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
Debug.ShouldStop(4);
_j.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("TOKEN_AUTH")),(Object)(parent._authtoken));
 BA.debugLineNum = 580;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","jobdone", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "restget"), (_j));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 581;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16);
if (true) break;

case 4:
//if
this.state = 9;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 582;BA.debugLine="response = j.GetString";
Debug.ShouldStop(32);
parent._response = _j.runClassMethod (cloyd.blink.httpjob.class, "_getstring" /*RemoteObject*/ );
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 584;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
Debug.ShouldStop(128);
parent._response = RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));
 BA.debugLineNum = 585;BA.debugLine="lblStatus.Text = GetRESTError(j.ErrorMessage)";
Debug.ShouldStop(256);
parent._lblstatus.runMethod(true,"setText",_getresterror(_j.getField(true,"_errormessage" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 587;BA.debugLine="If response.Contains(\"System is busy, please wai";
Debug.ShouldStop(1024);

case 9:
//if
this.state = 12;
if (parent._response.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("System is busy, please wait"))).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 588;BA.debugLine="lblStatus.Text = \"System is busy, please wait\"";
Debug.ShouldStop(2048);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("System is busy, please wait"));
 if (true) break;

case 12:
//C
this.state = 15;
;
 BA.debugLineNum = 590;BA.debugLine="j.Release";
Debug.ShouldStop(8192);
_j.runClassMethod (cloyd.blink.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 BA.debugLineNum = 592;BA.debugLine="response = \"ERROR: \" & LastException";
Debug.ShouldStop(32768);
parent._response = RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),parent.__c.runMethod(false,"LastException",main.ba));
 BA.debugLineNum = 593;BA.debugLine="Log(\"RESTGet LastException: \" & LastException)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("RESTGet LastException: "),parent.__c.runMethod(false,"LastException",main.ba))));
 if (true) break;
if (true) break;

case 15:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 595;BA.debugLine="Log(\"URL: \" & url)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("URL: "),_url)));
 BA.debugLineNum = 596;BA.debugLine="Log(\"Response: \" & response)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response: "),parent._response)));
 BA.debugLineNum = 597;BA.debugLine="Return Null";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 598;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _restpost(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("RESTPost (main) ","main",0,main.ba,main.mostCurrent,600);
if (RapidSub.canDelegate("restpost")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","restpost", _url);}
ResumableSub_RESTPost rsub = new ResumableSub_RESTPost(null,_url);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_RESTPost extends BA.ResumableSub {
public ResumableSub_RESTPost(cloyd.blink.main parent,RemoteObject _url) {
this.parent = parent;
this._url = _url;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
cloyd.blink.main parent;
RemoteObject _url;
RemoteObject _j = RemoteObject.declareNull("cloyd.blink.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RESTPost (main) ","main",0,main.ba,main.mostCurrent,600);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("url", _url);
 BA.debugLineNum = 601;BA.debugLine="Try";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 602;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(33554432);
_j = RemoteObject.createNew ("cloyd.blink.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 603;BA.debugLine="response = \"\"";
Debug.ShouldStop(67108864);
parent._response = BA.ObjectToString("");
 BA.debugLineNum = 604;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no";
Debug.ShouldStop(134217728);
_j.runClassMethod (cloyd.blink.httpjob.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 605;BA.debugLine="j.PostString(url,\"\")";
Debug.ShouldStop(268435456);
_j.runClassMethod (cloyd.blink.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_url),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 606;BA.debugLine="j.GetRequest.SetContentType(\"application/x-www-f";
Debug.ShouldStop(536870912);
_j.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/x-www-form-urlencoded")));
 BA.debugLineNum = 607;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
Debug.ShouldStop(1073741824);
_j.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("TOKEN_AUTH")),(Object)(parent._authtoken));
 BA.debugLineNum = 608;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","jobdone", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "restpost"), (_j));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 609;BA.debugLine="If j.Success Then";
Debug.ShouldStop(1);
if (true) break;

case 4:
//if
this.state = 9;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 610;BA.debugLine="response = j.GetString";
Debug.ShouldStop(2);
parent._response = _j.runClassMethod (cloyd.blink.httpjob.class, "_getstring" /*RemoteObject*/ );
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 612;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
Debug.ShouldStop(8);
parent._response = RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));
 BA.debugLineNum = 613;BA.debugLine="lblStatus.Text = GetRESTError(j.ErrorMessage)";
Debug.ShouldStop(16);
parent._lblstatus.runMethod(true,"setText",_getresterror(_j.getField(true,"_errormessage" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 615;BA.debugLine="If response.Contains(\"System is busy, please wai";
Debug.ShouldStop(64);

case 9:
//if
this.state = 12;
if (parent._response.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("System is busy, please wait"))).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 616;BA.debugLine="lblStatus.Text = \"System is busy, please wait\"";
Debug.ShouldStop(128);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("System is busy, please wait"));
 if (true) break;

case 12:
//C
this.state = 15;
;
 BA.debugLineNum = 618;BA.debugLine="j.Release";
Debug.ShouldStop(512);
_j.runClassMethod (cloyd.blink.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 BA.debugLineNum = 620;BA.debugLine="response = \"ERROR: \" & LastException";
Debug.ShouldStop(2048);
parent._response = RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),parent.__c.runMethod(false,"LastException",main.ba));
 BA.debugLineNum = 621;BA.debugLine="Log(\"RESTPost LastException: \" & LastException)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("RESTPost LastException: "),parent.__c.runMethod(false,"LastException",main.ba))));
 if (true) break;
if (true) break;

case 15:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 623;BA.debugLine="Log(\"URL: \" & url)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("URL: "),_url)));
 BA.debugLineNum = 624;BA.debugLine="Log(\"Response: \" & response)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response: "),parent._response)));
 BA.debugLineNum = 625;BA.debugLine="Return Null";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 626;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _setavg(RemoteObject _bc,RemoteObject _x,RemoteObject _y,RemoteObject _clrs,RemoteObject _temp) throws Exception{
try {
		Debug.PushSubsStack("SetAvg (main) ","main",0,main.ba,main.mostCurrent,1545);
if (RapidSub.canDelegate("setavg")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","setavg", _bc, _x, _y, _clrs, _temp);}
RemoteObject _c = RemoteObject.declareNull("b4j.example.bitmapcreator._argbcolor");
Debug.locals.put("bc", _bc);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
Debug.locals.put("clrs", _clrs);
Debug.locals.put("temp", _temp);
 BA.debugLineNum = 1545;BA.debugLine="Private Sub SetAvg(bc As BitmapCreator, x As Int,";
Debug.ShouldStop(256);
 BA.debugLineNum = 1546;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 1547;BA.debugLine="temp.Initialize";
Debug.ShouldStop(1024);
_temp.runVoidMethod ("Initialize");
 BA.debugLineNum = 1548;BA.debugLine="For Each c As ARGBColor In clrs";
Debug.ShouldStop(2048);
{
final RemoteObject group3 = _clrs;
final int groupLen3 = group3.getField(true,"length").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_c = group3.getArrayElement(false,RemoteObject.createImmutable(index3));Debug.locals.put("c", _c);
Debug.locals.put("c", _c);
 BA.debugLineNum = 1549;BA.debugLine="temp.r = temp.r + c.r";
Debug.ShouldStop(4096);
_temp.setField ("r",RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"r"),_c.getField(true,"r")}, "+",1, 1));
 BA.debugLineNum = 1550;BA.debugLine="temp.g = temp.g + c.g";
Debug.ShouldStop(8192);
_temp.setField ("g",RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"g"),_c.getField(true,"g")}, "+",1, 1));
 BA.debugLineNum = 1551;BA.debugLine="temp.b = temp.b + c.b";
Debug.ShouldStop(16384);
_temp.setField ("b",RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"b"),_c.getField(true,"b")}, "+",1, 1));
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 1553;BA.debugLine="temp.a = 255";
Debug.ShouldStop(65536);
_temp.setField ("a",BA.numberCast(int.class, 255));
 BA.debugLineNum = 1554;BA.debugLine="temp.r = temp.r / clrs.Length";
Debug.ShouldStop(131072);
_temp.setField ("r",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"r"),_clrs.getField(true,"length")}, "/",0, 0)));
 BA.debugLineNum = 1555;BA.debugLine="temp.g = temp.g / clrs.Length";
Debug.ShouldStop(262144);
_temp.setField ("g",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"g"),_clrs.getField(true,"length")}, "/",0, 0)));
 BA.debugLineNum = 1556;BA.debugLine="temp.b = temp.b / clrs.Length";
Debug.ShouldStop(524288);
_temp.setField ("b",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"b"),_clrs.getField(true,"length")}, "/",0, 0)));
 BA.debugLineNum = 1557;BA.debugLine="bc.SetARGB(x, y, temp)";
Debug.ShouldStop(1048576);
_bc.runVoidMethod ("_setargb",(Object)(_x),(Object)(_y),(Object)(_temp));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e14.toString()); BA.debugLineNum = 1559;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 1561;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _swarmed_valuechanged(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("swArmed_ValueChanged (main) ","main",0,main.ba,main.mostCurrent,1979);
if (RapidSub.canDelegate("swarmed_valuechanged")) { cloyd.blink.main.remoteMe.runUserSub(false, "main","swarmed_valuechanged", _value); return;}
ResumableSub_swArmed_ValueChanged rsub = new ResumableSub_swArmed_ValueChanged(null,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_swArmed_ValueChanged extends BA.ResumableSub {
public ResumableSub_swArmed_ValueChanged(cloyd.blink.main parent,RemoteObject _value) {
this.parent = parent;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
cloyd.blink.main parent;
RemoteObject _value;
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.declareNull("Object");
int _i = 0;
int step33;
int limit33;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("swArmed_ValueChanged (main) ","main",0,main.ba,main.mostCurrent,1979);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1980;BA.debugLine="Try";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 1981;BA.debugLine="btnDriveway.Enabled = False";
Debug.ShouldStop(268435456);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1982;BA.debugLine="btnRefresh.Enabled = False";
Debug.ShouldStop(536870912);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1983;BA.debugLine="btnActivity.Enabled = False";
Debug.ShouldStop(1073741824);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1984;BA.debugLine="btnDrivewayNewClip.Enabled = False";
Debug.ShouldStop(-2147483648);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1985;BA.debugLine="btnFrontDoorNewClip.Enabled = False";
Debug.ShouldStop(1);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1986;BA.debugLine="btnSideYardNewClip.Enabled = False";
Debug.ShouldStop(2);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1987;BA.debugLine="If Value Then";
Debug.ShouldStop(4);
if (true) break;

case 4:
//if
this.state = 9;
if (_value.<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 1988;BA.debugLine="lblStatus.Text = \"Arming the system...\"";
Debug.ShouldStop(8);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Arming the system..."));
 BA.debugLineNum = 1989;BA.debugLine="Dim rs As ResumableSub = RESTPost(\"https://res";
Debug.ShouldStop(16);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restpost(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/arm")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1991;BA.debugLine="lblStatus.Text = \"Disarming the system...\"";
Debug.ShouldStop(64);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Disarming the system..."));
 BA.debugLineNum = 1992;BA.debugLine="Dim rs As ResumableSub = RESTPost(\"https://res";
Debug.ShouldStop(128);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restpost(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/disarm")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 1995;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "swarmed_valuechanged"), _rs);
this.state = 33;
return;
case 33:
//C
this.state = 10;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1997;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.C";
Debug.ShouldStop(4096);
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean(".",parent._response.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR: ")))) || RemoteObject.solveBoolean(".",parent._response.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("System is busy, please wait"))))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1998;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(8192);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1999;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(16384);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 2000;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(32768);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 2001;BA.debugLine="btnDrivewayNewClip.Enabled = True";
Debug.ShouldStop(65536);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 2002;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
Debug.ShouldStop(131072);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 2003;BA.debugLine="btnSideYardNewClip.Enabled = True";
Debug.ShouldStop(262144);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 2004;BA.debugLine="btnDrivewayNewClip.Enabled = True";
Debug.ShouldStop(524288);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 2005;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
Debug.ShouldStop(1048576);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 2006;BA.debugLine="btnSideYardNewClip.Enabled = True";
Debug.ShouldStop(2097152);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 2007;BA.debugLine="lblStatus.Text = response";
Debug.ShouldStop(4194304);
parent._lblstatus.runMethod(true,"setText",parent._response);
 BA.debugLineNum = 2008;BA.debugLine="Return";
Debug.ShouldStop(8388608);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 2010;BA.debugLine="Dim rs As ResumableSub = GetCommandID(response)";
Debug.ShouldStop(33554432);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _getcommandid(parent._response);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 2011;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "swarmed_valuechanged"), _rs);
this.state = 34;
return;
case 34:
//C
this.state = 14;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2013;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest-";
Debug.ShouldStop(268435456);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/command/"),parent._commandid));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 2014;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "swarmed_valuechanged"), _rs);
this.state = 35;
return;
case 35:
//C
this.state = 14;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2016;BA.debugLine="For i = 1 To 30";
Debug.ShouldStop(-2147483648);
if (true) break;

case 14:
//for
this.state = 29;
step33 = 1;
limit33 = 30;
_i = 1 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 2017;BA.debugLine="Dim rs As ResumableSub = GetCommandStatus(resp";
Debug.ShouldStop(1);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _getcommandstatus(parent._response);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 2018;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "swarmed_valuechanged"), _rs);
this.state = 38;
return;
case 38:
//C
this.state = 17;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2019;BA.debugLine="If commandComplete Then";
Debug.ShouldStop(4);
if (true) break;

case 17:
//if
this.state = 28;
if (parent._commandcomplete.<Boolean>get().booleanValue()) { 
this.state = 19;
}else {
this.state = 21;
}if (true) break;

case 19:
//C
this.state = 28;
 BA.debugLineNum = 2020;BA.debugLine="btnRefresh_Click";
Debug.ShouldStop(8);
_btnrefresh_click();
 BA.debugLineNum = 2021;BA.debugLine="Exit";
Debug.ShouldStop(16);
this.state = 29;
if (true) break;
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 2023;BA.debugLine="If Value Then";
Debug.ShouldStop(64);
if (true) break;

case 22:
//if
this.state = 27;
if (_value.<Boolean>get().booleanValue()) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 27;
 BA.debugLineNum = 2024;BA.debugLine="lblStatus.Text = \"Arming the system... \" & i";
Debug.ShouldStop(128);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Arming the system... "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable("/30")));
 if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 2026;BA.debugLine="lblStatus.Text = \"Disarming the system... \"";
Debug.ShouldStop(512);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Disarming the system... "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable("/30")));
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
 BA.debugLineNum = 2029;BA.debugLine="Dim rs As ResumableSub = RESTGet(\"https://rest";
Debug.ShouldStop(4096);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/command/"),parent._commandid));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 2030;BA.debugLine="wait for (rs) complete (Result As Object)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "swarmed_valuechanged"), _rs);
this.state = 39;
return;
case 39:
//C
this.state = 37;
_result = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2031;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "swarmed_valuechanged"),BA.numberCast(int.class, 1000));
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
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2034;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(131072);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 2035;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(262144);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 2036;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(524288);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 2037;BA.debugLine="btnDrivewayNewClip.Enabled = True";
Debug.ShouldStop(1048576);
parent._btndrivewaynewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 2038;BA.debugLine="btnFrontDoorNewClip.Enabled = True";
Debug.ShouldStop(2097152);
parent._btnfrontdoornewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 2039;BA.debugLine="btnSideYardNewClip.Enabled = True";
Debug.ShouldStop(4194304);
parent._btnsideyardnewclip.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 2040;BA.debugLine="lblStatus.Text = \"Ready\"";
Debug.ShouldStop(8388608);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Ready"));
 Debug.CheckDeviceExceptions();
if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 0;
 BA.debugLineNum = 2043;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",main.ba))));
 if (true) break;
if (true) break;

case 32:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 2046;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e0.toString());}
            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
}