package cloyd.blink;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_7 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (main) ","main",0,main.ba,main.mostCurrent,120);
if (RapidSub.canDelegate("application_error")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","application_error", _error, _stacktrace);}
RemoteObject _shl = RemoteObject.declareNull("anywheresoftware.b4j.objects.Shell");
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 120;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(16777216);
main._btndriveway.runMethod(true,"setEnabled",main.__c.getField(true,"True"));
 BA.debugLineNum = 122;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(33554432);
main._btnrefresh.runMethod(true,"setEnabled",main.__c.getField(true,"True"));
 BA.debugLineNum = 123;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(67108864);
main._btnactivity.runMethod(true,"setEnabled",main.__c.getField(true,"True"));
 BA.debugLineNum = 124;BA.debugLine="fx.msgbox2(MainForm,Error.Message,MainForm.Title,";
Debug.ShouldStop(134217728);
main._fx.runMethodAndSync(true,"Msgbox2",(Object)(main._mainform),(Object)(_error.runMethod(true,"getMessage")),(Object)(main._mainform.runMethod(true,"getTitle")),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(main._fx.getField(false,"MSGBOX_ERROR")));
 BA.debugLineNum = 125;BA.debugLine="Dim shl As Shell";
Debug.ShouldStop(268435456);
_shl = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");Debug.locals.put("shl", _shl);
 BA.debugLineNum = 126;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 127;BA.debugLine="shl.Initialize(\"shl\", \"java.exe\" , Array As Stri";
Debug.ShouldStop(1073741824);
_shl.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("shl")),(Object)(BA.ObjectToString("java.exe")),(Object)(main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("-jar"),RemoteObject.createImmutable("Blink4Java.jar")})))));
 BA.debugLineNum = 128;BA.debugLine="shl.WorkingDirectory = File.DirApp";
Debug.ShouldStop(-2147483648);
_shl.runMethod(true,"setWorkingDirectory",main.__c.getField(false,"File").runMethod(true,"getDirApp"));
 BA.debugLineNum = 129;BA.debugLine="shl.Run(-1)";
Debug.ShouldStop(1);
_shl.runVoidMethod ("Run",main.ba,(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e11.toString()); BA.debugLineNum = 131;BA.debugLine="Log(\"Application_Error: \" & LastException.Messag";
Debug.ShouldStop(4);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Application_Error: "),main.__c.runMethod(false,"LastException",main.ba).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 134;BA.debugLine="Return False ' handled";
Debug.ShouldStop(32);
if (true) return main.__c.getField(true,"False");
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,53);
if (RapidSub.canDelegate("appstart")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
RemoteObject _skintemp = RemoteObject.createImmutable("");
RemoteObject _skindefault = RemoteObject.createImmutable("");
RemoteObject _obj = RemoteObject.declareNull("anywheresoftware.b4j.agraham.reflection.Reflection");
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 53;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 55;BA.debugLine="Dim skinTemp As String";
Debug.ShouldStop(4194304);
_skintemp = RemoteObject.createImmutable("");Debug.locals.put("skinTemp", _skintemp);
 BA.debugLineNum = 56;BA.debugLine="Dim skinDefault As String";
Debug.ShouldStop(8388608);
_skindefault = RemoteObject.createImmutable("");Debug.locals.put("skinDefault", _skindefault);
 BA.debugLineNum = 58;BA.debugLine="If File.Exists(File.DirApp, \"skin.ini\") Then";
Debug.ShouldStop(33554432);
if (main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("skin.ini"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 59;BA.debugLine="skinTemp = File.ReadString(File.DirApp, \"skin.i";
Debug.ShouldStop(67108864);
_skintemp = main.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("skin.ini")));Debug.locals.put("skinTemp", _skintemp);
 }else {
 BA.debugLineNum = 62;BA.debugLine="skinTemp = \"vdSk03\"";
Debug.ShouldStop(536870912);
_skintemp = BA.ObjectToString("vdSk03");Debug.locals.put("skinTemp", _skintemp);
 };
 BA.debugLineNum = 65;BA.debugLine="If skinTemp = \"\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString(""))) { 
 BA.debugLineNum = 66;BA.debugLine="skinDefault = \"vdSk03\"";
Debug.ShouldStop(2);
_skindefault = BA.ObjectToString("vdSk03");Debug.locals.put("skinDefault", _skindefault);
 }else {
 BA.debugLineNum = 68;BA.debugLine="If skinTemp = \"vdSk01\" Or skinTemp = \"vdSk02\" O";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString("vdSk01")) || RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString("vdSk02")) || RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString("vdSk03")) || RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString("vdSk04")) || RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString("vdSk05")) || RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString("vdSk06"))) { 
 BA.debugLineNum = 69;BA.debugLine="skinDefault = skinTemp";
Debug.ShouldStop(16);
_skindefault = _skintemp;Debug.locals.put("skinDefault", _skindefault);
 }else {
 BA.debugLineNum = 71;BA.debugLine="skinDefault = \"vdSk03\"";
Debug.ShouldStop(64);
_skindefault = BA.ObjectToString("vdSk03");Debug.locals.put("skinDefault", _skindefault);
 };
 };
 BA.debugLineNum = 75;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(1024);
main._mainform = _form1;
 BA.debugLineNum = 76;BA.debugLine="MainForm.SetFormStyle(\"TRANSPARENT\")";
Debug.ShouldStop(2048);
main._mainform.runVoidMethod ("SetFormStyle",(Object)(RemoteObject.createImmutable("TRANSPARENT")));
 BA.debugLineNum = 77;BA.debugLine="MainForm.RootPane.LoadLayout(skinDefault) 'Load";
Debug.ShouldStop(4096);
main._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(_skindefault));
 BA.debugLineNum = 78;BA.debugLine="AtualSkin = skinDefault";
Debug.ShouldStop(8192);
main._atualskin = _skindefault;
 BA.debugLineNum = 79;BA.debugLine="MainForm.BackColor = fx.Colors.Transparent";
Debug.ShouldStop(16384);
main._mainform.runMethod(false,"setBackColor",main._fx.getField(false,"Colors").getField(false,"Transparent"));
 BA.debugLineNum = 80;BA.debugLine="MainForm.RootPane.Style = \"-fx-background-color:";
Debug.ShouldStop(32768);
main._mainform.runMethod(false,"getRootPane").runMethod(true,"setStyle",BA.ObjectToString("-fx-background-color:transparent;-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 1.0) , 15,0, 0.0, 0.0);"));
 BA.debugLineNum = 81;BA.debugLine="MainForm.Resizable = True";
Debug.ShouldStop(65536);
main._mainform.runMethod(true,"setResizable",main.__c.getField(true,"True"));
 BA.debugLineNum = 82;BA.debugLine="MainForm.Icon = fx.LoadImage(File.DirAssets, \"ho";
Debug.ShouldStop(131072);
main._mainform.runMethod(false,"setIcon",(main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("home.png"))).getObject()));
 BA.debugLineNum = 83;BA.debugLine="MainForm.Title = \"Catanaoan Blink XT2 Cameras v1";
Debug.ShouldStop(262144);
main._mainform.runMethod(true,"setTitle",BA.ObjectToString("Catanaoan Blink XT2 Cameras v1.0"));
 BA.debugLineNum = 84;BA.debugLine="lbTitle.MouseCursor = fx.Cursors.MOVE";
Debug.ShouldStop(524288);
main._lbtitle.runMethod(false,"setMouseCursor",main._fx.getField(false,"Cursors").getField(false,"MOVE"));
 BA.debugLineNum = 85;BA.debugLine="lbTitle.Text = \"Catanaoan Blink XT2 Cameras v1.0";
Debug.ShouldStop(1048576);
main._lbtitle.runMethod(true,"setText",BA.ObjectToString("Catanaoan Blink XT2 Cameras v1.0"));
 BA.debugLineNum = 86;BA.debugLine="Dim Obj As Reflector";
Debug.ShouldStop(2097152);
_obj = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 87;BA.debugLine="Obj.Target = ivClose";
Debug.ShouldStop(4194304);
_obj.setField ("Target",(main._ivclose.getObject()));
 BA.debugLineNum = 88;BA.debugLine="Obj.AddEventHandler2(\"Close_Entered\", \"onMouseEn";
Debug.ShouldStop(8388608);
_obj.runVoidMethod ("AddEventHandler2",main.ba,(Object)(BA.ObjectToString("Close_Entered")),(Object)(RemoteObject.createImmutable("onMouseEnteredProperty")));
 BA.debugLineNum = 89;BA.debugLine="Obj.AddEventHandler2(\"Close_Exited\", \"onMouseExi";
Debug.ShouldStop(16777216);
_obj.runVoidMethod ("AddEventHandler2",main.ba,(Object)(BA.ObjectToString("Close_Exited")),(Object)(RemoteObject.createImmutable("onMouseExitedProperty")));
 BA.debugLineNum = 90;BA.debugLine="Dim Obj As Reflector";
Debug.ShouldStop(33554432);
_obj = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 91;BA.debugLine="Obj.Target = ivMax";
Debug.ShouldStop(67108864);
_obj.setField ("Target",(main._ivmax.getObject()));
 BA.debugLineNum = 92;BA.debugLine="Obj.AddEventHandler2(\"Max_Entered\", \"onMouseEnte";
Debug.ShouldStop(134217728);
_obj.runVoidMethod ("AddEventHandler2",main.ba,(Object)(BA.ObjectToString("Max_Entered")),(Object)(RemoteObject.createImmutable("onMouseEnteredProperty")));
 BA.debugLineNum = 93;BA.debugLine="Obj.AddEventHandler2(\"Max_Exited\", \"onMouseExite";
Debug.ShouldStop(268435456);
_obj.runVoidMethod ("AddEventHandler2",main.ba,(Object)(BA.ObjectToString("Max_Exited")),(Object)(RemoteObject.createImmutable("onMouseExitedProperty")));
 BA.debugLineNum = 94;BA.debugLine="Dim Obj As Reflector";
Debug.ShouldStop(536870912);
_obj = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 95;BA.debugLine="Obj.Target = ivMin";
Debug.ShouldStop(1073741824);
_obj.setField ("Target",(main._ivmin.getObject()));
 BA.debugLineNum = 96;BA.debugLine="Obj.AddEventHandler2(\"Min_Entered\", \"onMouseEnte";
Debug.ShouldStop(-2147483648);
_obj.runVoidMethod ("AddEventHandler2",main.ba,(Object)(BA.ObjectToString("Min_Entered")),(Object)(RemoteObject.createImmutable("onMouseEnteredProperty")));
 BA.debugLineNum = 97;BA.debugLine="Obj.AddEventHandler2(\"Min_Exited\", \"onMouseExite";
Debug.ShouldStop(1);
_obj.runVoidMethod ("AddEventHandler2",main.ba,(Object)(BA.ObjectToString("Min_Exited")),(Object)(RemoteObject.createImmutable("onMouseExitedProperty")));
 BA.debugLineNum = 98;BA.debugLine="imgInit = AtualSkin.SubString(2).ToLowerCase";
Debug.ShouldStop(2);
main._imginit = main._atualskin.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"toLowerCase");
 BA.debugLineNum = 99;BA.debugLine="Get_css";
Debug.ShouldStop(4);
_get_css();
 BA.debugLineNum = 104;BA.debugLine="MainForm.WindowLeft = CheckMonitor.MaxX	- MainFo";
Debug.ShouldStop(128);
main._mainform.runMethod(true,"setWindowLeft",RemoteObject.solve(new RemoteObject[] {_checkmonitor().runMethod(true,"getMaxX"),main._mainform.runMethod(true,"getWidth"),main.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "--",2, 0));
 BA.debugLineNum = 105;BA.debugLine="MainForm.WindowTop = CheckMonitor.MaxY - MainFor";
Debug.ShouldStop(256);
main._mainform.runMethod(true,"setWindowTop",RemoteObject.solve(new RemoteObject[] {_checkmonitor().runMethod(true,"getMaxY"),main._mainform.runMethod(true,"getHeight"),main.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "--",2, 0));
 BA.debugLineNum = 107;BA.debugLine="lblStatus.TextColor = fx.Colors.White";
Debug.ShouldStop(1024);
main._lblstatus.runMethod(false,"setTextColor",main._fx.getField(false,"Colors").getField(false,"White"));
 BA.debugLineNum = 108;BA.debugLine="MainForm.Show";
Debug.ShouldStop(2048);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 109;BA.debugLine="btnDriveway.Enabled = False";
Debug.ShouldStop(4096);
main._btndriveway.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 110;BA.debugLine="btnRefresh.Enabled = False";
Debug.ShouldStop(8192);
main._btnrefresh.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 111;BA.debugLine="btnActivity.Enabled = False";
Debug.ShouldStop(16384);
main._btnactivity.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 112;BA.debugLine="RequestAuthToken";
Debug.ShouldStop(32768);
_requestauthtoken();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e52) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e52.toString()); BA.debugLineNum = 114;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Blur (main) ","main",0,main.ba,main.mostCurrent,1137);
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
 BA.debugLineNum = 1137;BA.debugLine="Private Sub Blur (bmp As B4XBitmap) As B4XBitmap";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1138;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 1139;BA.debugLine="Dim bc As BitmapCreator";
Debug.ShouldStop(262144);
_bc = RemoteObject.createNew ("b4j.example.bitmapcreator");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 1140;BA.debugLine="Dim ReduceScale As Int = 2";
Debug.ShouldStop(524288);
_reducescale = BA.numberCast(int.class, 2);Debug.locals.put("ReduceScale", _reducescale);Debug.locals.put("ReduceScale", _reducescale);
 BA.debugLineNum = 1141;BA.debugLine="bc.Initialize(bmp.Width / ReduceScale / bmp.Scal";
Debug.ShouldStop(1048576);
_bc.runVoidMethod ("_initialize",main.ba,(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),_reducescale,_bmp.runMethod(true,"getScale")}, "//",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getHeight"),_reducescale,_bmp.runMethod(true,"getScale")}, "//",0, 0))));
 BA.debugLineNum = 1142;BA.debugLine="bc.CopyPixelsFromBitmap(bmp)";
Debug.ShouldStop(2097152);
_bc.runVoidMethod ("_copypixelsfrombitmap",(Object)(_bmp));
 BA.debugLineNum = 1143;BA.debugLine="Dim count As Int = 3";
Debug.ShouldStop(4194304);
_count = BA.numberCast(int.class, 3);Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 1144;BA.debugLine="Dim clrs(3) As ARGBColor";
Debug.ShouldStop(8388608);
_clrs = RemoteObject.createNewArray ("b4j.example.bitmapcreator._argbcolor", new int[] {3}, new Object[]{});Debug.locals.put("clrs", _clrs);
 BA.debugLineNum = 1145;BA.debugLine="Dim temp As ARGBColor";
Debug.ShouldStop(16777216);
_temp = RemoteObject.createNew ("b4j.example.bitmapcreator._argbcolor");Debug.locals.put("temp", _temp);
 BA.debugLineNum = 1146;BA.debugLine="Dim m As Int";
Debug.ShouldStop(33554432);
_m = RemoteObject.createImmutable(0);Debug.locals.put("m", _m);
 BA.debugLineNum = 1147;BA.debugLine="For steps = 1 To count";
Debug.ShouldStop(67108864);
{
final int step10 = 1;
final int limit10 = _count.<Integer>get().intValue();
_steps = 1 ;
for (;(step10 > 0 && _steps <= limit10) || (step10 < 0 && _steps >= limit10) ;_steps = ((int)(0 + _steps + step10))  ) {
Debug.locals.put("steps", _steps);
 BA.debugLineNum = 1148;BA.debugLine="For y = 0 To bc.mHeight - 1";
Debug.ShouldStop(134217728);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mheight"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_y = 0 ;
for (;(step11 > 0 && _y <= limit11) || (step11 < 0 && _y >= limit11) ;_y = ((int)(0 + _y + step11))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 1149;BA.debugLine="For x = 0 To 2";
Debug.ShouldStop(268435456);
{
final int step12 = 1;
final int limit12 = 2;
_x = 0 ;
for (;(step12 > 0 && _x <= limit12) || (step12 < 0 && _x >= limit12) ;_x = ((int)(0 + _x + step12))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 1150;BA.debugLine="bc.GetARGB(x, y, clrs(x))";
Debug.ShouldStop(536870912);
_bc.runVoidMethod ("_getargb",(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(_clrs.getArrayElement(false,BA.numberCast(int.class, _x))));
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 1152;BA.debugLine="SetAvg(bc, 1, y, clrs, temp)";
Debug.ShouldStop(-2147483648);
_setavg(_bc,BA.numberCast(int.class, 1),BA.numberCast(int.class, _y),_clrs,_temp);
 BA.debugLineNum = 1153;BA.debugLine="m = 0";
Debug.ShouldStop(1);
_m = BA.numberCast(int.class, 0);Debug.locals.put("m", _m);
 BA.debugLineNum = 1154;BA.debugLine="For x = 2 To bc.mWidth - 2";
Debug.ShouldStop(2);
{
final int step17 = 1;
final int limit17 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mwidth"),RemoteObject.createImmutable(2)}, "-",1, 1).<Integer>get().intValue();
_x = 2 ;
for (;(step17 > 0 && _x <= limit17) || (step17 < 0 && _x >= limit17) ;_x = ((int)(0 + _x + step17))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 1155;BA.debugLine="bc.GetARGB(x + 1, y, clrs(m))";
Debug.ShouldStop(4);
_bc.runVoidMethod ("_getargb",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_x),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(BA.numberCast(int.class, _y)),(Object)(_clrs.getArrayElement(false,_m)));
 BA.debugLineNum = 1156;BA.debugLine="m = (m + 1) Mod clrs.Length";
Debug.ShouldStop(8);
_m = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_m,RemoteObject.createImmutable(1)}, "+",1, 1)),_clrs.getField(true,"length")}, "%",0, 1);Debug.locals.put("m", _m);
 BA.debugLineNum = 1157;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
Debug.ShouldStop(16);
_setavg(_bc,BA.numberCast(int.class, _x),BA.numberCast(int.class, _y),_clrs,_temp);
 }
}Debug.locals.put("x", _x);
;
 }
}Debug.locals.put("y", _y);
;
 BA.debugLineNum = 1160;BA.debugLine="For x = 0 To bc.mWidth - 1";
Debug.ShouldStop(128);
{
final int step23 = 1;
final int limit23 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mwidth"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = 0 ;
for (;(step23 > 0 && _x <= limit23) || (step23 < 0 && _x >= limit23) ;_x = ((int)(0 + _x + step23))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 1161;BA.debugLine="For y = 0 To 2";
Debug.ShouldStop(256);
{
final int step24 = 1;
final int limit24 = 2;
_y = 0 ;
for (;(step24 > 0 && _y <= limit24) || (step24 < 0 && _y >= limit24) ;_y = ((int)(0 + _y + step24))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 1162;BA.debugLine="bc.GetARGB(x, y, clrs(y))";
Debug.ShouldStop(512);
_bc.runVoidMethod ("_getargb",(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(_clrs.getArrayElement(false,BA.numberCast(int.class, _y))));
 }
}Debug.locals.put("y", _y);
;
 BA.debugLineNum = 1164;BA.debugLine="SetAvg(bc, x, 1, clrs, temp)";
Debug.ShouldStop(2048);
_setavg(_bc,BA.numberCast(int.class, _x),BA.numberCast(int.class, 1),_clrs,_temp);
 BA.debugLineNum = 1165;BA.debugLine="m = 0";
Debug.ShouldStop(4096);
_m = BA.numberCast(int.class, 0);Debug.locals.put("m", _m);
 BA.debugLineNum = 1166;BA.debugLine="For y = 2 To bc.mHeight - 2";
Debug.ShouldStop(8192);
{
final int step29 = 1;
final int limit29 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mheight"),RemoteObject.createImmutable(2)}, "-",1, 1).<Integer>get().intValue();
_y = 2 ;
for (;(step29 > 0 && _y <= limit29) || (step29 < 0 && _y >= limit29) ;_y = ((int)(0 + _y + step29))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 1167;BA.debugLine="bc.GetARGB(x, y + 1, clrs(m))";
Debug.ShouldStop(16384);
_bc.runVoidMethod ("_getargb",(Object)(BA.numberCast(int.class, _x)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_y),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_clrs.getArrayElement(false,_m)));
 BA.debugLineNum = 1168;BA.debugLine="m = (m + 1) Mod clrs.Length";
Debug.ShouldStop(32768);
_m = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_m,RemoteObject.createImmutable(1)}, "+",1, 1)),_clrs.getField(true,"length")}, "%",0, 1);Debug.locals.put("m", _m);
 BA.debugLineNum = 1169;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
Debug.ShouldStop(65536);
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
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e37.toString()); BA.debugLineNum = 1174;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 1175;BA.debugLine="fx.msgbox(MainForm,\"Blur LastException: \" & Last";
Debug.ShouldStop(4194304);
main._fx.runVoidMethodAndSync ("Msgbox",(Object)(main._mainform),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Blur LastException: "),main.__c.runMethod(false,"LastException",main.ba))),(Object)(main._mainform.runMethod(true,"getTitle")));
 };
 BA.debugLineNum = 1177;BA.debugLine="Return bc.Bitmap";
Debug.ShouldStop(16777216);
if (true) return _bc.runMethod(false,"_getbitmap");
 BA.debugLineNum = 1178;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("BlurIV (main) ","main",0,main.ba,main.mostCurrent,1127);
if (RapidSub.canDelegate("bluriv")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","bluriv", _image, _iv);}
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
Debug.locals.put("image", _image);
Debug.locals.put("iv", _iv);
 BA.debugLineNum = 1127;BA.debugLine="Sub BlurIV (image As String,iv As ImageView)";
Debug.ShouldStop(64);
 BA.debugLineNum = 1128;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 1129;BA.debugLine="Dim bmp As B4XBitmap = xui.LoadBitmapResize(File";
Debug.ShouldStop(256);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmp = main._xui.runMethod(false,"LoadBitmapResize",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(_image),(Object)(BA.numberCast(int.class, _iv.runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, _iv.runMethod(true,"getHeight"))),(Object)(main.__c.getField(true,"True")));Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 1130;BA.debugLine="iv.SetImage(Blur(bmp))";
Debug.ShouldStop(512);
_iv.runVoidMethod ("SetImage",(Object)((_blur(_bmp).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e5.toString()); BA.debugLineNum = 1132;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 1133;BA.debugLine="fx.msgbox(MainForm,\"BlurIV LastException: \" & La";
Debug.ShouldStop(4096);
main._fx.runVoidMethodAndSync ("Msgbox",(Object)(main._mainform),(Object)(RemoteObject.concat(RemoteObject.createImmutable("BlurIV LastException: "),main.__c.runMethod(false,"LastException",main.ba))),(Object)(main._mainform.runMethod(true,"getTitle")));
 };
 BA.debugLineNum = 1135;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("btnActivity_Click (main) ","main",0,main.ba,main.mostCurrent,1200);
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
RemoteObject _mf = RemoteObject.declareNull("cloyd.blink.frmactivity");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnActivity_Click (main) ","main",0,main.ba,main.mostCurrent,1200);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 1201;BA.debugLine="btnDriveway.Enabled = False";
Debug.ShouldStop(65536);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1202;BA.debugLine="btnRefresh.Enabled = False";
Debug.ShouldStop(131072);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1203;BA.debugLine="btnActivity.Enabled = False";
Debug.ShouldStop(262144);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 1205;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia-s";
Debug.ShouldStop(1048576);
_restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/api/v1/accounts/88438/media/changed?since=-999999999-01-01T00:00:00+18:00&page=1")));
 BA.debugLineNum = 1207;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnactivity_click"),BA.numberCast(int.class, 1000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 1209;BA.debugLine="Dim mf As frmActivity";
Debug.ShouldStop(16777216);
_mf = RemoteObject.createNew ("cloyd.blink.frmactivity");Debug.locals.put("mf", _mf);
 BA.debugLineNum = 1210;BA.debugLine="mf.Initialize(MainForm)";
Debug.ShouldStop(33554432);
_mf.runClassMethod (cloyd.blink.frmactivity.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(parent._mainform));
 BA.debugLineNum = 1211;BA.debugLine="mf.authToken = authToken";
Debug.ShouldStop(67108864);
_mf.setField ("_authtoken" /*RemoteObject*/ ,parent._authtoken);
 BA.debugLineNum = 1212;BA.debugLine="mf.Show(response,userRegion)";
Debug.ShouldStop(134217728);
_mf.runClassMethod (cloyd.blink.frmactivity.class, "_show" /*RemoteObject*/ ,(Object)(parent._response),(Object)(parent._userregion));
 BA.debugLineNum = 1213;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(268435456);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1214;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(536870912);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1215;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(1073741824);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1216;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
public static RemoteObject  _btndriveway_click() throws Exception{
try {
		Debug.PushSubsStack("btnDriveway_Click (main) ","main",0,main.ba,main.mostCurrent,137);
if (RapidSub.canDelegate("btndriveway_click")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","btndriveway_click");}
 BA.debugLineNum = 137;BA.debugLine="Sub btnDriveway_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 138;BA.debugLine="clvDriveway.Clear";
Debug.ShouldStop(512);
main._clvdriveway.runVoidMethod ("_clear");
 BA.debugLineNum = 139;BA.debugLine="clvFrontDoor.Clear";
Debug.ShouldStop(1024);
main._clvfrontdoor.runVoidMethod ("_clear");
 BA.debugLineNum = 140;BA.debugLine="clvSideYard.Clear";
Debug.ShouldStop(2048);
main._clvsideyard.runVoidMethod ("_clear");
 BA.debugLineNum = 141;BA.debugLine="btnDriveway.Enabled = False";
Debug.ShouldStop(4096);
main._btndriveway.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 142;BA.debugLine="btnRefresh.Enabled = False";
Debug.ShouldStop(8192);
main._btnrefresh.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 143;BA.debugLine="btnActivity.Enabled = False";
Debug.ShouldStop(16384);
main._btnactivity.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 144;BA.debugLine="RefreshCameras(False)";
Debug.ShouldStop(32768);
_refreshcameras(main.__c.getField(true,"False"));
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnrefresh_click() throws Exception{
try {
		Debug.PushSubsStack("btnRefresh_Click (main) ","main",0,main.ba,main.mostCurrent,1308);
if (RapidSub.canDelegate("btnrefresh_click")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","btnrefresh_click");}
 BA.debugLineNum = 1308;BA.debugLine="Sub btnRefresh_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1309;BA.debugLine="btnDriveway.Enabled = False";
Debug.ShouldStop(268435456);
main._btndriveway.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 1310;BA.debugLine="btnRefresh.Enabled = False";
Debug.ShouldStop(536870912);
main._btnrefresh.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 1311;BA.debugLine="btnActivity.Enabled = False";
Debug.ShouldStop(1073741824);
main._btnactivity.runMethod(true,"setEnabled",main.__c.getField(true,"False"));
 BA.debugLineNum = 1312;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
Debug.ShouldStop(-2147483648);
_bluriv(BA.ObjectToString("Driveway.jpg"),main._ivdriveway);
 BA.debugLineNum = 1313;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
Debug.ShouldStop(1);
_bluriv(BA.ObjectToString("FrontDoor.jpg"),main._ivfrontdoor);
 BA.debugLineNum = 1314;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
Debug.ShouldStop(2);
_bluriv(BA.ObjectToString("SideYard.jpg"),main._ivsideyard);
 BA.debugLineNum = 1315;BA.debugLine="RefreshCameras(True)";
Debug.ShouldStop(4);
_refreshcameras(main.__c.getField(true,"True"));
 BA.debugLineNum = 1316;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkbattlife(RemoteObject _battlevel) throws Exception{
try {
		Debug.PushSubsStack("CheckBattLife (main) ","main",0,main.ba,main.mostCurrent,796);
if (RapidSub.canDelegate("checkbattlife")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","checkbattlife", _battlevel);}
Debug.locals.put("battlevel", _battlevel);
 BA.debugLineNum = 796;BA.debugLine="Sub CheckBattLife(battlevel As Int) As String";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 797;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 799;BA.debugLine="If battlevel <= 136 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("k",_battlevel,BA.numberCast(double.class, 136))) { 
 BA.debugLineNum = 800;BA.debugLine="Return \"Replace battery now!\"";
Debug.ShouldStop(-2147483648);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("Replace battery now!");
 }else 
{ BA.debugLineNum = 801;BA.debugLine="else If battlevel >= 160 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("g",_battlevel,BA.numberCast(double.class, 160))) { 
 BA.debugLineNum = 802;BA.debugLine="Return \"Very high\"";
Debug.ShouldStop(2);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("Very high");
 }else 
{ BA.debugLineNum = 803;BA.debugLine="else If battlevel > 136 And battlevel < 138 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",_battlevel,BA.numberCast(double.class, 136)) && RemoteObject.solveBoolean("<",_battlevel,BA.numberCast(double.class, 138))) { 
 BA.debugLineNum = 804;BA.debugLine="Return \"Very low\"";
Debug.ShouldStop(8);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("Very low");
 }else {
 BA.debugLineNum = 806;BA.debugLine="Return \"High\"";
Debug.ShouldStop(32);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("High");
 }}}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e12.toString()); BA.debugLineNum = 809;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 810;BA.debugLine="fx.msgbox(MainForm,\"CheckBattLife LastException:";
Debug.ShouldStop(512);
main._fx.runVoidMethodAndSync ("Msgbox",(Object)(main._mainform),(Object)(RemoteObject.concat(RemoteObject.createImmutable("CheckBattLife LastException: "),main.__c.runMethod(false,"LastException",main.ba))),(Object)(main._mainform.runMethod(true,"getTitle")));
 BA.debugLineNum = 811;BA.debugLine="Return \"\"";
Debug.ShouldStop(1024);
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 813;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checklfrlevel(RemoteObject _lfrlevel) throws Exception{
try {
		Debug.PushSubsStack("CheckLFRLevel (main) ","main",0,main.ba,main.mostCurrent,815);
if (RapidSub.canDelegate("checklfrlevel")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","checklfrlevel", _lfrlevel);}
Debug.locals.put("lfrlevel", _lfrlevel);
 BA.debugLineNum = 815;BA.debugLine="Sub CheckLFRLevel(lfrlevel As Int) As String";
Debug.ShouldStop(16384);
 BA.debugLineNum = 816;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 818;BA.debugLine="If lfrlevel > -67 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_lfrlevel,BA.numberCast(double.class, -(double) (0 + 67)))) { 
 BA.debugLineNum = 819;BA.debugLine="Return \"Amazing\"";
Debug.ShouldStop(262144);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("Amazing");
 }else 
{ BA.debugLineNum = 820;BA.debugLine="else If lfrlevel > -70 And lfrlevel <= -67 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_lfrlevel,BA.numberCast(double.class, -(double) (0 + 70))) && RemoteObject.solveBoolean("k",_lfrlevel,BA.numberCast(double.class, -(double) (0 + 67)))) { 
 BA.debugLineNum = 821;BA.debugLine="Return \"Very good\"";
Debug.ShouldStop(1048576);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("Very good");
 }else 
{ BA.debugLineNum = 822;BA.debugLine="else If lfrlevel > -80 And lfrlevel <= -70 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_lfrlevel,BA.numberCast(double.class, -(double) (0 + 80))) && RemoteObject.solveBoolean("k",_lfrlevel,BA.numberCast(double.class, -(double) (0 + 70)))) { 
 BA.debugLineNum = 823;BA.debugLine="Return \"OK\"";
Debug.ShouldStop(4194304);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("OK");
 }else 
{ BA.debugLineNum = 824;BA.debugLine="else If lfrlevel > -90 And lfrlevel <= -80 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",_lfrlevel,BA.numberCast(double.class, -(double) (0 + 90))) && RemoteObject.solveBoolean("k",_lfrlevel,BA.numberCast(double.class, -(double) (0 + 80)))) { 
 BA.debugLineNum = 825;BA.debugLine="Return \"Not Good\"";
Debug.ShouldStop(16777216);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("Not Good");
 }else {
 BA.debugLineNum = 827;BA.debugLine="Return \"Unusable\"";
Debug.ShouldStop(67108864);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("Unusable");
 }}}}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e14.toString()); BA.debugLineNum = 830;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 831;BA.debugLine="fx.msgbox(MainForm,\"CheckLFRLevel LastException:";
Debug.ShouldStop(1073741824);
main._fx.runVoidMethodAndSync ("Msgbox",(Object)(main._mainform),(Object)(RemoteObject.concat(RemoteObject.createImmutable("CheckLFRLevel LastException: "),main.__c.runMethod(false,"LastException",main.ba))),(Object)(main._mainform.runMethod(true,"getTitle")));
 BA.debugLineNum = 832;BA.debugLine="Return \"\"";
Debug.ShouldStop(-2147483648);
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 834;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("CheckMonitor (main) ","main",0,main.ba,main.mostCurrent,939);
if (RapidSub.canDelegate("checkmonitor")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","checkmonitor");}
RemoteObject _slist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _s = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
 BA.debugLineNum = 939;BA.debugLine="Sub CheckMonitor() As Screen";
Debug.ShouldStop(1024);
 BA.debugLineNum = 940;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 941;BA.debugLine="If fx.Screens.Size= 1 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",main._fx.runMethod(false,"getScreens").runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 942;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(8192);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = main._fx.runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 943;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(16384);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 945;BA.debugLine="Return S";
Debug.ShouldStop(65536);
Debug.CheckDeviceExceptions();if (true) return _s;
 }else 
{ BA.debugLineNum = 946;BA.debugLine="Else If fx.Screens.Size> 1 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",main._fx.runMethod(false,"getScreens").runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 947;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(262144);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = main._fx.runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 948;BA.debugLine="Dim S As Screen = SList.Get(2)";
Debug.ShouldStop(524288);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("S", _s);
 BA.debugLineNum = 950;BA.debugLine="Return S";
Debug.ShouldStop(2097152);
Debug.CheckDeviceExceptions();if (true) return _s;
 }else {
 BA.debugLineNum = 952;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(8388608);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = main._fx.runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 953;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(16777216);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 955;BA.debugLine="Return S";
Debug.ShouldStop(67108864);
Debug.CheckDeviceExceptions();if (true) return _s;
 }}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e16.toString()); BA.debugLineNum = 958;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(536870912);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = main._fx.runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 959;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(1073741824);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 961;BA.debugLine="Return S";
Debug.ShouldStop(1);
if (true) return _s;
 };
 BA.debugLineNum = 963;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Close_Entered_Event (main) ","main",0,main.ba,main.mostCurrent,865);
if (RapidSub.canDelegate("close_entered_event")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","close_entered_event", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 865;BA.debugLine="Private Sub Close_Entered_Event(e As Event)";
Debug.ShouldStop(1);
 BA.debugLineNum = 866;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 867;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
Debug.ShouldStop(4);
main._ivclose.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable("_btCloseEnt.png")))).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e4.toString()); BA.debugLineNum = 869;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 871;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Close_Exited_Event (main) ","main",0,main.ba,main.mostCurrent,873);
if (RapidSub.canDelegate("close_exited_event")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","close_exited_event", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 873;BA.debugLine="Private Sub Close_Exited_Event(e As Event)";
Debug.ShouldStop(256);
 BA.debugLineNum = 874;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 875;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
Debug.ShouldStop(1024);
main._ivclose.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable("_btClose.png")))).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e4.toString()); BA.debugLineNum = 877;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 879;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("clvDriveway_ItemClick (main) ","main",0,main.ba,main.mostCurrent,985);
if (RapidSub.canDelegate("clvdriveway_itemclick")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","clvdriveway_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 985;BA.debugLine="Sub clvDriveway_ItemClick (Index As Int, Value As";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 986;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 987;BA.debugLine="clvDriveway.JumpToItem(Index)";
Debug.ShouldStop(67108864);
main._clvdriveway.runVoidMethod ("_jumptoitem",(Object)(_index));
 BA.debugLineNum = 988;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
Debug.ShouldStop(134217728);
main._clvfrontdoor.runVoidMethod ("_jumptoitem",(Object)(_index));
 BA.debugLineNum = 989;BA.debugLine="clvSideYard.JumpToItem(Index)";
Debug.ShouldStop(268435456);
main._clvsideyard.runVoidMethod ("_jumptoitem",(Object)(_index));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e6.toString()); BA.debugLineNum = 991;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 993;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("clvFrontDoor_ItemClick (main) ","main",0,main.ba,main.mostCurrent,975);
if (RapidSub.canDelegate("clvfrontdoor_itemclick")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","clvfrontdoor_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 975;BA.debugLine="Sub clvFrontDoor_ItemClick (Index As Int, Value As";
Debug.ShouldStop(16384);
 BA.debugLineNum = 976;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 977;BA.debugLine="clvDriveway.JumpToItem(Index)";
Debug.ShouldStop(65536);
main._clvdriveway.runVoidMethod ("_jumptoitem",(Object)(_index));
 BA.debugLineNum = 978;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
Debug.ShouldStop(131072);
main._clvfrontdoor.runVoidMethod ("_jumptoitem",(Object)(_index));
 BA.debugLineNum = 979;BA.debugLine="clvSideYard.JumpToItem(Index)";
Debug.ShouldStop(262144);
main._clvsideyard.runVoidMethod ("_jumptoitem",(Object)(_index));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e6.toString()); BA.debugLineNum = 981;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 983;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("clvSideYard_ItemClick (main) ","main",0,main.ba,main.mostCurrent,965);
if (RapidSub.canDelegate("clvsideyard_itemclick")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","clvsideyard_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 965;BA.debugLine="Sub clvSideYard_ItemClick (Index As Int, Value As";
Debug.ShouldStop(16);
 BA.debugLineNum = 966;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 967;BA.debugLine="clvDriveway.JumpToItem(Index)";
Debug.ShouldStop(64);
main._clvdriveway.runVoidMethod ("_jumptoitem",(Object)(_index));
 BA.debugLineNum = 968;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
Debug.ShouldStop(128);
main._clvfrontdoor.runVoidMethod ("_jumptoitem",(Object)(_index));
 BA.debugLineNum = 969;BA.debugLine="clvSideYard.JumpToItem(Index)";
Debug.ShouldStop(256);
main._clvsideyard.runVoidMethod ("_jumptoitem",(Object)(_index));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e6.toString()); BA.debugLineNum = 971;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 973;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("ConvertDateTime (main) ","main",0,main.ba,main.mostCurrent,1228);
if (RapidSub.canDelegate("convertdatetime")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","convertdatetime", _inputtime);}
RemoteObject _timestampprocessed = RemoteObject.createImmutable("");
RemoteObject _ticks = RemoteObject.createImmutable(0L);
RemoteObject _lngticks = RemoteObject.createImmutable(0L);
RemoteObject _p = RemoteObject.declareNull("b4j.example.dateutils._period");
Debug.locals.put("inputTime", _inputtime);
 BA.debugLineNum = 1228;BA.debugLine="Sub ConvertDateTime(inputTime As String) As String";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1230;BA.debugLine="Dim timestampProcessed As String";
Debug.ShouldStop(8192);
_timestampprocessed = RemoteObject.createImmutable("");Debug.locals.put("timestampProcessed", _timestampprocessed);
 BA.debugLineNum = 1231;BA.debugLine="timestampProcessed =  ConvertFullDateTime(inputTi";
Debug.ShouldStop(16384);
_timestampprocessed = _convertfulldatetime(_inputtime);Debug.locals.put("timestampProcessed", _timestampprocessed);
 BA.debugLineNum = 1233;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
Debug.ShouldStop(65536);
_ticks = _parseutcstring(_inputtime.runMethod(true,"replace",(Object)(BA.ObjectToString("+00:00")),(Object)(RemoteObject.createImmutable("+0000"))));Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 1234;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
Debug.ShouldStop(131072);
main.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("MMM d, yyyy h:mm:ss a"));
 BA.debugLineNum = 1235;BA.debugLine="Dim lngTicks As Long = ticks";
Debug.ShouldStop(262144);
_lngticks = _ticks;Debug.locals.put("lngTicks", _lngticks);Debug.locals.put("lngTicks", _lngticks);
 BA.debugLineNum = 1236;BA.debugLine="Dim p As Period = DateUtils.PeriodBetween(lngTick";
Debug.ShouldStop(524288);
_p = main._dateutils.runMethod(false,"_periodbetween",(Object)(_lngticks),(Object)(main.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1238;BA.debugLine="If timestampProcessed.Contains(\"Yesterday\") Or ti";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(".",_timestampprocessed.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Yesterday")))) || RemoteObject.solveBoolean(".",_timestampprocessed.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Today"))))) { 
 BA.debugLineNum = 1239;BA.debugLine="If p.Days = 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Days"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1240;BA.debugLine="If p.Hours = 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Hours"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1241;BA.debugLine="If p.Minutes = 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Minutes"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1242;BA.debugLine="Return timestampProcessed & \" (\" & p.Seconds";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.concat(_timestampprocessed,RemoteObject.createImmutable(" ("),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago)"));
 }else {
 BA.debugLineNum = 1244;BA.debugLine="Return timestampProcessed & \" (\" & p.Minutes";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.concat(_timestampprocessed,RemoteObject.createImmutable(" ("),_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago)"));
 };
 }else {
 BA.debugLineNum = 1247;BA.debugLine="Return timestampProcessed & \" (\" & p.Hours & \"";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.concat(_timestampprocessed,RemoteObject.createImmutable(" ("),_p.getField(true,"Hours"),RemoteObject.createImmutable("h "),_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago)"));
 };
 }else 
{ BA.debugLineNum = 1249;BA.debugLine="else If p.Hours = 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Hours"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1250;BA.debugLine="If p.Minutes = 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Minutes"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1251;BA.debugLine="Return timestampProcessed & \" (\" & p.Seconds &";
Debug.ShouldStop(4);
if (true) return RemoteObject.concat(_timestampprocessed,RemoteObject.createImmutable(" ("),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago)"));
 }else {
 BA.debugLineNum = 1253;BA.debugLine="Return timestampProcessed & \" (\" & p.Minutes &";
Debug.ShouldStop(16);
if (true) return RemoteObject.concat(_timestampprocessed,RemoteObject.createImmutable(" ("),_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago)"));
 };
 }else 
{ BA.debugLineNum = 1255;BA.debugLine="else If p.Minutes = 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Minutes"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1256;BA.debugLine="Return timestampProcessed & \" (\" & p.Seconds &";
Debug.ShouldStop(128);
if (true) return RemoteObject.concat(_timestampprocessed,RemoteObject.createImmutable(" ("),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago)"));
 }else {
 BA.debugLineNum = 1258;BA.debugLine="Return timestampProcessed & \" (\" & p.Days & \"d";
Debug.ShouldStop(512);
if (true) return RemoteObject.concat(_timestampprocessed,RemoteObject.createImmutable(" ("),_p.getField(true,"Days"),RemoteObject.createImmutable("d "),_p.getField(true,"Hours"),RemoteObject.createImmutable("h "),_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago)"));
 }}}
;
 }else {
 BA.debugLineNum = 1261;BA.debugLine="Return timestampProcessed & \" (\" & p.Days & \"d \"";
Debug.ShouldStop(4096);
if (true) return RemoteObject.concat(_timestampprocessed,RemoteObject.createImmutable(" ("),_p.getField(true,"Days"),RemoteObject.createImmutable("d "),_p.getField(true,"Hours"),RemoteObject.createImmutable("h "),_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago)"));
 };
 BA.debugLineNum = 1264;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("ConvertDateTimePlain (main) ","main",0,main.ba,main.mostCurrent,1218);
if (RapidSub.canDelegate("convertdatetimeplain")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","convertdatetimeplain", _inputtime);}
RemoteObject _ticks = RemoteObject.createImmutable(0L);
RemoteObject _lngticks = RemoteObject.createImmutable(0L);
Debug.locals.put("inputTime", _inputtime);
 BA.debugLineNum = 1218;BA.debugLine="Sub ConvertDateTimePlain(inputTime As String) As S";
Debug.ShouldStop(2);
 BA.debugLineNum = 1220;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
Debug.ShouldStop(8);
_ticks = _parseutcstring(_inputtime.runMethod(true,"replace",(Object)(BA.ObjectToString("+00:00")),(Object)(RemoteObject.createImmutable("+0000"))));Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 1221;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
Debug.ShouldStop(16);
main.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("MMM d, yyyy h:mm:ss a"));
 BA.debugLineNum = 1222;BA.debugLine="Dim lngTicks As Long = ticks";
Debug.ShouldStop(32);
_lngticks = _ticks;Debug.locals.put("lngTicks", _lngticks);Debug.locals.put("lngTicks", _lngticks);
 BA.debugLineNum = 1225;BA.debugLine="Return DateTime.Date(lngTicks)";
Debug.ShouldStop(256);
if (true) return main.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lngticks));
 BA.debugLineNum = 1226;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("ConvertFullDateTime (main) ","main",0,main.ba,main.mostCurrent,1266);
if (RapidSub.canDelegate("convertfulldatetime")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","convertfulldatetime", _inputtime);}
RemoteObject _ticks = RemoteObject.createImmutable(0L);
RemoteObject _lngticks = RemoteObject.createImmutable(0L);
RemoteObject _yesterday = RemoteObject.createImmutable(0L);
RemoteObject _timestamp = RemoteObject.createImmutable(0L);
Debug.locals.put("inputTime", _inputtime);
 BA.debugLineNum = 1266;BA.debugLine="Sub ConvertFullDateTime(inputTime As String) As St";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1268;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
Debug.ShouldStop(524288);
_ticks = _parseutcstring(_inputtime.runMethod(true,"replace",(Object)(BA.ObjectToString("+00:00")),(Object)(RemoteObject.createImmutable("+0000"))));Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 1269;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
Debug.ShouldStop(1048576);
main.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("MMM d, yyyy h:mm:ss a"));
 BA.debugLineNum = 1270;BA.debugLine="Dim lngTicks As Long = ticks";
Debug.ShouldStop(2097152);
_lngticks = _ticks;Debug.locals.put("lngTicks", _lngticks);Debug.locals.put("lngTicks", _lngticks);
 BA.debugLineNum = 1272;BA.debugLine="Dim Yesterday As Long";
Debug.ShouldStop(8388608);
_yesterday = RemoteObject.createImmutable(0L);Debug.locals.put("Yesterday", _yesterday);
 BA.debugLineNum = 1273;BA.debugLine="Dim timestamp As Long";
Debug.ShouldStop(16777216);
_timestamp = RemoteObject.createImmutable(0L);Debug.locals.put("timestamp", _timestamp);
 BA.debugLineNum = 1274;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
Debug.ShouldStop(33554432);
main.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyyMMdd"));
 BA.debugLineNum = 1275;BA.debugLine="Yesterday = DateTime.Date(DateTime.add(DateTime.N";
Debug.ShouldStop(67108864);
_yesterday = BA.numberCast(long.class, main.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(main.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(main.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, -(double) (0 + 1)))))));Debug.locals.put("Yesterday", _yesterday);
 BA.debugLineNum = 1276;BA.debugLine="timestamp = DateTime.Date(lngTicks)";
Debug.ShouldStop(134217728);
_timestamp = BA.numberCast(long.class, main.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lngticks)));Debug.locals.put("timestamp", _timestamp);
 BA.debugLineNum = 1278;BA.debugLine="DateTime.DateFormat = \"h:mm:ss a\"";
Debug.ShouldStop(536870912);
main.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("h:mm:ss a"));
 BA.debugLineNum = 1279;BA.debugLine="If DateUtils.IsSameDay(lngTicks,DateTime.now) The";
Debug.ShouldStop(1073741824);
if (main._dateutils.runMethod(true,"_issameday",(Object)(_lngticks),(Object)(main.__c.getField(false,"DateTime").runMethod(true,"getNow"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1280;BA.debugLine="Return \"Today \" & DateTime.Date(lngTicks)";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Today "),main.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lngticks)));
 }else 
{ BA.debugLineNum = 1281;BA.debugLine="Else If Yesterday = timestamp Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_yesterday,BA.numberCast(double.class, _timestamp))) { 
 BA.debugLineNum = 1282;BA.debugLine="Return \"Yesterday \" & DateTime.Date(lngTicks)";
Debug.ShouldStop(2);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Yesterday "),main.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lngticks)));
 }else {
 BA.debugLineNum = 1284;BA.debugLine="Return DateUtils.GetDayOfWeekName(lngTicks) & \"";
Debug.ShouldStop(8);
if (true) return RemoteObject.concat(main._dateutils.runMethod(true,"_getdayofweekname",(Object)(_lngticks)),RemoteObject.createImmutable(" "),main.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lngticks)));
 }}
;
 BA.debugLineNum = 1286;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _downloadimage(RemoteObject _link,RemoteObject _iv,RemoteObject _camera) throws Exception{
try {
		Debug.PushSubsStack("DownloadImage (main) ","main",0,main.ba,main.mostCurrent,401);
if (RapidSub.canDelegate("downloadimage")) { cloyd.blink.main.remoteMe.runUserSub(false, "main","downloadimage", _link, _iv, _camera); return;}
ResumableSub_DownloadImage rsub = new ResumableSub_DownloadImage(null,_link,_iv,_camera);
rsub.resume(null, null);
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
		Debug.PushSubsStack("DownloadImage (main) ","main",0,main.ba,main.mostCurrent,401);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Link", _link);
Debug.locals.put("iv", _iv);
Debug.locals.put("camera", _camera);
 BA.debugLineNum = 402;BA.debugLine="Try";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 403;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(262144);
_j = RemoteObject.createNew ("cloyd.blink.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 404;BA.debugLine="response = \"\"";
Debug.ShouldStop(524288);
parent._response = BA.ObjectToString("");
 BA.debugLineNum = 405;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(1048576);
_j.runClassMethod (cloyd.blink.httpjob.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 406;BA.debugLine="j.Download(Link)";
Debug.ShouldStop(2097152);
_j.runClassMethod (cloyd.blink.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_link));
 BA.debugLineNum = 407;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
Debug.ShouldStop(4194304);
_j.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("TOKEN_AUTH")),(Object)(parent._authtoken));
 BA.debugLineNum = 408;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","jobdone", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "downloadimage"), (_j));
this.state = 21;
return;
case 21:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 409;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 411;BA.debugLine="If camera = \"347574\" Then";
Debug.ShouldStop(67108864);
if (true) break;

case 7:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("347574"))) { 
this.state = 9;
}else 
{ BA.debugLineNum = 413;BA.debugLine="Else If camera = \"236967\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("236967"))) { 
this.state = 11;
}else 
{ BA.debugLineNum = 415;BA.debugLine="Else If camera = \"226821\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("226821"))) { 
this.state = 13;
}}}
if (true) break;

case 9:
//C
this.state = 14;
 BA.debugLineNum = 412;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
Debug.ShouldStop(134217728);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("Driveway.jpg")),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 414;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
Debug.ShouldStop(536870912);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("FrontDoor.jpg")),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 416;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
Debug.ShouldStop(-2147483648);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("SideYard.jpg")),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 if (true) break;

case 14:
//C
this.state = 17;
;
 BA.debugLineNum = 418;BA.debugLine="File.Copy2(j.GetInputStream, out)";
Debug.ShouldStop(2);
parent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_j.runClassMethod (cloyd.blink.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())),(Object)((_out.getObject())));
 BA.debugLineNum = 419;BA.debugLine="out.Close '<------ very important";
Debug.ShouldStop(4);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 422;BA.debugLine="iv.SetImage(j.GetBitmap)";
Debug.ShouldStop(32);
_iv.runVoidMethod ("SetImage",(Object)((_j.runClassMethod (cloyd.blink.httpjob.class, "_getbitmap" /*RemoteObject*/ ).getObject())));
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 424;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
Debug.ShouldStop(128);
parent._response = RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));
 BA.debugLineNum = 425;BA.debugLine="lblStatus.Text = GetRESTError(j.ErrorMessage)";
Debug.ShouldStop(256);
parent._lblstatus.runMethod(true,"setText",_getresterror(_j.getField(true,"_errormessage" /*RemoteObject*/ )));
 if (true) break;

case 17:
//C
this.state = 20;
;
 BA.debugLineNum = 427;BA.debugLine="j.Release";
Debug.ShouldStop(1024);
_j.runClassMethod (cloyd.blink.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
 BA.debugLineNum = 429;BA.debugLine="fx.msgbox(MainForm,\"DownloadImage LastException:";
Debug.ShouldStop(4096);
parent._fx.runVoidMethodAndSync ("Msgbox",(Object)(parent._mainform),(Object)(RemoteObject.concat(RemoteObject.createImmutable("DownloadImage LastException: "),parent.__c.runMethod(false,"LastException",main.ba))),(Object)(parent._mainform.runMethod(true,"getTitle")));
 BA.debugLineNum = 430;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",main.ba))));
 if (true) break;
if (true) break;

case 20:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 432;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Get_css (main) ","main",0,main.ba,main.mostCurrent,927);
if (RapidSub.canDelegate("get_css")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","get_css");}
RemoteObject _jform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _scene = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _stylesheets = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 927;BA.debugLine="Public Sub Get_css";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 928;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 929;BA.debugLine="Dim jForm As JavaObject = MainForm";
Debug.ShouldStop(1);
_jform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jform.setObject(main._mainform);Debug.locals.put("jForm", _jform);
 BA.debugLineNum = 930;BA.debugLine="Dim scene As JavaObject = jForm.GetField(\"scene\"";
Debug.ShouldStop(2);
_scene = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_scene.setObject(_jform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("scene"))));Debug.locals.put("scene", _scene);
 BA.debugLineNum = 931;BA.debugLine="Dim stylesheets As List = scene.RunMethod(\"getSt";
Debug.ShouldStop(4);
_stylesheets = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_stylesheets.setObject(_scene.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getStylesheets")),(Object)((main.__c.getField(false,"Null")))));Debug.locals.put("stylesheets", _stylesheets);
 BA.debugLineNum = 932;BA.debugLine="stylesheets.Clear";
Debug.ShouldStop(8);
_stylesheets.runVoidMethod ("Clear");
 BA.debugLineNum = 933;BA.debugLine="stylesheets.Add(File.GetUri(File.DirAssets, imgI";
Debug.ShouldStop(16);
_stylesheets.runVoidMethod ("Add",(Object)((main.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable(".css")))))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e8.toString()); BA.debugLineNum = 935;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 937;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getallcameras(RemoteObject _json) throws Exception{
try {
		Debug.PushSubsStack("GetAllCameras (main) ","main",0,main.ba,main.mostCurrent,493);
if (RapidSub.canDelegate("getallcameras")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","getallcameras", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _networks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colnetworks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("json", _json);
 BA.debugLineNum = 493;BA.debugLine="Sub GetAllCameras(json As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 494;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 495;BA.debugLine="lblStatus.Text = \"Getting all cameras informatio";
Debug.ShouldStop(16384);
main._lblstatus.runMethod(true,"setText",BA.ObjectToString("Getting all cameras information..."));
 BA.debugLineNum = 496;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(32768);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 497;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(65536);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 498;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(131072);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 502;BA.debugLine="Dim networks As List = root.Get(\"networks\")";
Debug.ShouldStop(2097152);
_networks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_networks.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("networks")))));Debug.locals.put("networks", _networks);
 BA.debugLineNum = 503;BA.debugLine="For Each colnetworks As Map In networks";
Debug.ShouldStop(4194304);
_colnetworks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group7 = _networks;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_colnetworks.setObject(group7.runMethod(false,"Get",index7));
Debug.locals.put("colnetworks", _colnetworks);
 BA.debugLineNum = 512;BA.debugLine="networkID = colnetworks.Get(\"network_id\")";
Debug.ShouldStop(-2147483648);
main._networkid = BA.ObjectToString(_colnetworks.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("network_id")))));
 BA.debugLineNum = 513;BA.debugLine="Log(\"networkID: \" &  networkID)";
Debug.ShouldStop(1);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("networkID: "),main._networkid)));
 }
}Debug.locals.put("colnetworks", _colnetworks);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e12.toString()); BA.debugLineNum = 517;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 518;BA.debugLine="fx.msgbox(MainForm,\"GetAllCameras LastException:";
Debug.ShouldStop(32);
main._fx.runVoidMethodAndSync ("Msgbox",(Object)(main._mainform),(Object)(RemoteObject.concat(RemoteObject.createImmutable("GetAllCameras LastException: "),main.__c.runMethod(false,"LastException",main.ba))),(Object)(main._mainform.runMethod(true,"getTitle")));
 };
 BA.debugLineNum = 520;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("GetAuthInfo (main) ","main",0,main.ba,main.mostCurrent,435);
if (RapidSub.canDelegate("getauthinfo")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","getauthinfo", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _authtokenmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _region = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("json", _json);
 BA.debugLineNum = 435;BA.debugLine="Sub GetAuthInfo(json As String)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 436;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 437;BA.debugLine="lblStatus.Text = \"Getting authtoken...\"";
Debug.ShouldStop(1048576);
main._lblstatus.runMethod(true,"setText",BA.ObjectToString("Getting authtoken..."));
 BA.debugLineNum = 438;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2097152);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 439;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(4194304);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 440;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(8388608);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 441;BA.debugLine="Dim authtokenmap As Map = root.Get(\"authtoken\")";
Debug.ShouldStop(16777216);
_authtokenmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_authtokenmap.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("authtoken")))));Debug.locals.put("authtokenmap", _authtokenmap);
 BA.debugLineNum = 442;BA.debugLine="authToken = authtokenmap.Get(\"authtoken\")";
Debug.ShouldStop(33554432);
main._authtoken = BA.ObjectToString(_authtokenmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("authtoken")))));
 BA.debugLineNum = 443;BA.debugLine="Log(\"authToken: \" &  authToken)";
Debug.ShouldStop(67108864);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("authToken: "),main._authtoken)));
 BA.debugLineNum = 451;BA.debugLine="Dim region As Map = root.Get(\"region\")";
Debug.ShouldStop(4);
_region = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_region.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region")))));Debug.locals.put("region", _region);
 BA.debugLineNum = 452;BA.debugLine="userRegion = region.GetKeyAt(0)";
Debug.ShouldStop(8);
main._userregion = BA.ObjectToString(_region.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 453;BA.debugLine="Log(\"userRegion: \" &  userRegion)";
Debug.ShouldStop(16);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("userRegion: "),main._userregion)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e13.toString()); BA.debugLineNum = 458;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 459;BA.debugLine="fx.msgbox(MainForm,\"GetAuthInfo LastException: \"";
Debug.ShouldStop(1024);
main._fx.runVoidMethodAndSync ("Msgbox",(Object)(main._mainform),(Object)(RemoteObject.concat(RemoteObject.createImmutable("GetAuthInfo LastException: "),main.__c.runMethod(false,"LastException",main.ba))),(Object)(main._mainform.runMethod(true,"getTitle")));
 };
 BA.debugLineNum = 462;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("GetCameraInfo (main) ","main",0,main.ba,main.mostCurrent,610);
if (RapidSub.canDelegate("getcamerainfo")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","getcamerainfo", _json, _clv);}
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
Debug.locals.put("json", _json);
Debug.locals.put("clv", _clv);
 BA.debugLineNum = 610;BA.debugLine="Sub GetCameraInfo(json As String, clv As CustomLis";
Debug.ShouldStop(2);
 BA.debugLineNum = 611;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 612;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(8);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 613;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(16);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 614;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(32);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 615;BA.debugLine="Dim camera_status As Map = root.Get(\"camera_stat";
Debug.ShouldStop(64);
_camera_status = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_camera_status.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("camera_status")))));Debug.locals.put("camera_status", _camera_status);
 BA.debugLineNum = 616;BA.debugLine="Dim total_108_wakeups As Int = camera_status.Get";
Debug.ShouldStop(128);
_total_108_wakeups = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_108_wakeups")))));Debug.locals.put("total_108_wakeups", _total_108_wakeups);Debug.locals.put("total_108_wakeups", _total_108_wakeups);
 BA.debugLineNum = 617;BA.debugLine="Dim battery_voltage As Int = camera_status.Get(\"";
Debug.ShouldStop(256);
_battery_voltage = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("battery_voltage")))));Debug.locals.put("battery_voltage", _battery_voltage);Debug.locals.put("battery_voltage", _battery_voltage);
 BA.debugLineNum = 618;BA.debugLine="Dim light_sensor_data_valid As String = camera_s";
Debug.ShouldStop(512);
_light_sensor_data_valid = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("light_sensor_data_valid")))));Debug.locals.put("light_sensor_data_valid", _light_sensor_data_valid);Debug.locals.put("light_sensor_data_valid", _light_sensor_data_valid);
 BA.debugLineNum = 619;BA.debugLine="Dim lfr_tb_wakeups As Int = camera_status.Get(\"l";
Debug.ShouldStop(1024);
_lfr_tb_wakeups = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lfr_tb_wakeups")))));Debug.locals.put("lfr_tb_wakeups", _lfr_tb_wakeups);Debug.locals.put("lfr_tb_wakeups", _lfr_tb_wakeups);
 BA.debugLineNum = 620;BA.debugLine="Dim fw_git_hash As String = camera_status.Get(\"f";
Debug.ShouldStop(2048);
_fw_git_hash = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fw_git_hash")))));Debug.locals.put("fw_git_hash", _fw_git_hash);Debug.locals.put("fw_git_hash", _fw_git_hash);
 BA.debugLineNum = 621;BA.debugLine="Dim wifi_strength As Int = camera_status.Get(\"wi";
Debug.ShouldStop(4096);
_wifi_strength = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("wifi_strength")))));Debug.locals.put("wifi_strength", _wifi_strength);Debug.locals.put("wifi_strength", _wifi_strength);
 BA.debugLineNum = 622;BA.debugLine="Dim lfr_strength As Int = camera_status.Get(\"lfr";
Debug.ShouldStop(8192);
_lfr_strength = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lfr_strength")))));Debug.locals.put("lfr_strength", _lfr_strength);Debug.locals.put("lfr_strength", _lfr_strength);
 BA.debugLineNum = 623;BA.debugLine="Dim total_tb_wakeups As Int = camera_status.Get(";
Debug.ShouldStop(16384);
_total_tb_wakeups = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_tb_wakeups")))));Debug.locals.put("total_tb_wakeups", _total_tb_wakeups);Debug.locals.put("total_tb_wakeups", _total_tb_wakeups);
 BA.debugLineNum = 624;BA.debugLine="Dim created_at As String = camera_status.Get(\"cr";
Debug.ShouldStop(32768);
_created_at = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 625;BA.debugLine="Dim light_sensor_ch0 As Int = camera_status.Get(";
Debug.ShouldStop(65536);
_light_sensor_ch0 = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("light_sensor_ch0")))));Debug.locals.put("light_sensor_ch0", _light_sensor_ch0);Debug.locals.put("light_sensor_ch0", _light_sensor_ch0);
 BA.debugLineNum = 626;BA.debugLine="Dim mac As String = camera_status.Get(\"mac\")";
Debug.ShouldStop(131072);
_mac = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mac")))));Debug.locals.put("mac", _mac);Debug.locals.put("mac", _mac);
 BA.debugLineNum = 627;BA.debugLine="Dim unit_number As Int = camera_status.Get(\"unit";
Debug.ShouldStop(262144);
_unit_number = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("unit_number")))));Debug.locals.put("unit_number", _unit_number);Debug.locals.put("unit_number", _unit_number);
 BA.debugLineNum = 628;BA.debugLine="Dim updated_at As String = camera_status.Get(\"up";
Debug.ShouldStop(524288);
_updated_at = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("updated_at")))));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 629;BA.debugLine="Dim light_sensor_ch1 As Int = camera_status.Get(";
Debug.ShouldStop(1048576);
_light_sensor_ch1 = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("light_sensor_ch1")))));Debug.locals.put("light_sensor_ch1", _light_sensor_ch1);Debug.locals.put("light_sensor_ch1", _light_sensor_ch1);
 BA.debugLineNum = 630;BA.debugLine="Dim time_dhcp_lease As Int = camera_status.Get(\"";
Debug.ShouldStop(2097152);
_time_dhcp_lease = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("time_dhcp_lease")))));Debug.locals.put("time_dhcp_lease", _time_dhcp_lease);Debug.locals.put("time_dhcp_lease", _time_dhcp_lease);
 BA.debugLineNum = 631;BA.debugLine="Dim temperature As Int = camera_status.Get(\"temp";
Debug.ShouldStop(4194304);
_temperature = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("temperature")))));Debug.locals.put("temperature", _temperature);Debug.locals.put("temperature", _temperature);
 BA.debugLineNum = 632;BA.debugLine="Dim time_first_video As Int = camera_status.Get(";
Debug.ShouldStop(8388608);
_time_first_video = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("time_first_video")))));Debug.locals.put("time_first_video", _time_first_video);Debug.locals.put("time_first_video", _time_first_video);
 BA.debugLineNum = 633;BA.debugLine="Dim time_dns_resolve As Int = camera_status.Get(";
Debug.ShouldStop(16777216);
_time_dns_resolve = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("time_dns_resolve")))));Debug.locals.put("time_dns_resolve", _time_dns_resolve);Debug.locals.put("time_dns_resolve", _time_dns_resolve);
 BA.debugLineNum = 634;BA.debugLine="Dim id As Int = camera_status.Get(\"id\")";
Debug.ShouldStop(33554432);
_id = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 635;BA.debugLine="Dim temp_alert_status As String = camera_status.";
Debug.ShouldStop(67108864);
_temp_alert_status = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("temp_alert_status")))));Debug.locals.put("temp_alert_status", _temp_alert_status);Debug.locals.put("temp_alert_status", _temp_alert_status);
 BA.debugLineNum = 636;BA.debugLine="Dim time_108_boot As Int = camera_status.Get(\"ti";
Debug.ShouldStop(134217728);
_time_108_boot = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("time_108_boot")))));Debug.locals.put("time_108_boot", _time_108_boot);Debug.locals.put("time_108_boot", _time_108_boot);
 BA.debugLineNum = 637;BA.debugLine="Dim lfr_108_wakeups As Int = camera_status.Get(\"";
Debug.ShouldStop(268435456);
_lfr_108_wakeups = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lfr_108_wakeups")))));Debug.locals.put("lfr_108_wakeups", _lfr_108_wakeups);Debug.locals.put("lfr_108_wakeups", _lfr_108_wakeups);
 BA.debugLineNum = 638;BA.debugLine="cameraThumbnail = camera_status.Get(\"thumbnail\")";
Debug.ShouldStop(536870912);
main._camerathumbnail = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("thumbnail")))));
 BA.debugLineNum = 639;BA.debugLine="Log(\"cameraThumbnail: \" & cameraThumbnail)";
Debug.ShouldStop(1073741824);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("cameraThumbnail: "),main._camerathumbnail)));
 BA.debugLineNum = 640;BA.debugLine="Dim lifetime_duration As Int = camera_status.Get";
Debug.ShouldStop(-2147483648);
_lifetime_duration = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lifetime_duration")))));Debug.locals.put("lifetime_duration", _lifetime_duration);Debug.locals.put("lifetime_duration", _lifetime_duration);
 BA.debugLineNum = 641;BA.debugLine="Dim wifi_connect_failure_count As Int = camera_s";
Debug.ShouldStop(1);
_wifi_connect_failure_count = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("wifi_connect_failure_count")))));Debug.locals.put("wifi_connect_failure_count", _wifi_connect_failure_count);Debug.locals.put("wifi_connect_failure_count", _wifi_connect_failure_count);
 BA.debugLineNum = 642;BA.debugLine="Dim camera_id As Int = camera_status.Get(\"camera";
Debug.ShouldStop(2);
_camera_id = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("camera_id")))));Debug.locals.put("camera_id", _camera_id);Debug.locals.put("camera_id", _camera_id);
 BA.debugLineNum = 643;BA.debugLine="Dim battery_alert_status As String = camera_stat";
Debug.ShouldStop(4);
_battery_alert_status = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("battery_alert_status")))));Debug.locals.put("battery_alert_status", _battery_alert_status);Debug.locals.put("battery_alert_status", _battery_alert_status);
 BA.debugLineNum = 644;BA.debugLine="Dim dhcp_failure_count As Int = camera_status.Ge";
Debug.ShouldStop(8);
_dhcp_failure_count = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("dhcp_failure_count")))));Debug.locals.put("dhcp_failure_count", _dhcp_failure_count);Debug.locals.put("dhcp_failure_count", _dhcp_failure_count);
 BA.debugLineNum = 645;BA.debugLine="Dim ip_address As String = camera_status.Get(\"ip";
Debug.ShouldStop(16);
_ip_address = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ip_address")))));Debug.locals.put("ip_address", _ip_address);Debug.locals.put("ip_address", _ip_address);
 BA.debugLineNum = 646;BA.debugLine="Dim ipv As String = camera_status.Get(\"ipv\")";
Debug.ShouldStop(32);
_ipv = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ipv")))));Debug.locals.put("ipv", _ipv);Debug.locals.put("ipv", _ipv);
 BA.debugLineNum = 647;BA.debugLine="Dim light_sensor_data_new As String = camera_sta";
Debug.ShouldStop(64);
_light_sensor_data_new = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("light_sensor_data_new")))));Debug.locals.put("light_sensor_data_new", _light_sensor_data_new);Debug.locals.put("light_sensor_data_new", _light_sensor_data_new);
 BA.debugLineNum = 648;BA.debugLine="Dim network_id As Int = camera_status.Get(\"netwo";
Debug.ShouldStop(128);
_network_id = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("network_id")))));Debug.locals.put("network_id", _network_id);Debug.locals.put("network_id", _network_id);
 BA.debugLineNum = 649;BA.debugLine="Dim account_id As Int = camera_status.Get(\"accou";
Debug.ShouldStop(256);
_account_id = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("account_id")))));Debug.locals.put("account_id", _account_id);Debug.locals.put("account_id", _account_id);
 BA.debugLineNum = 650;BA.debugLine="Dim serial As String = camera_status.Get(\"serial";
Debug.ShouldStop(512);
_serial = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("serial")))));Debug.locals.put("serial", _serial);Debug.locals.put("serial", _serial);
 BA.debugLineNum = 651;BA.debugLine="Dim dev_1 As Int = camera_status.Get(\"dev_1\")";
Debug.ShouldStop(1024);
_dev_1 = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("dev_1")))));Debug.locals.put("dev_1", _dev_1);Debug.locals.put("dev_1", _dev_1);
 BA.debugLineNum = 652;BA.debugLine="Dim time_wlan_connect As Int = camera_status.Get";
Debug.ShouldStop(2048);
_time_wlan_connect = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("time_wlan_connect")))));Debug.locals.put("time_wlan_connect", _time_wlan_connect);Debug.locals.put("time_wlan_connect", _time_wlan_connect);
 BA.debugLineNum = 653;BA.debugLine="Dim dev_2 As Int = camera_status.Get(\"dev_2\")";
Debug.ShouldStop(4096);
_dev_2 = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("dev_2")))));Debug.locals.put("dev_2", _dev_2);Debug.locals.put("dev_2", _dev_2);
 BA.debugLineNum = 654;BA.debugLine="Dim socket_failure_count As Int = camera_status.";
Debug.ShouldStop(8192);
_socket_failure_count = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("socket_failure_count")))));Debug.locals.put("socket_failure_count", _socket_failure_count);Debug.locals.put("socket_failure_count", _socket_failure_count);
 BA.debugLineNum = 655;BA.debugLine="Dim dev_3 As Int = camera_status.Get(\"dev_3\")";
Debug.ShouldStop(16384);
_dev_3 = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("dev_3")))));Debug.locals.put("dev_3", _dev_3);Debug.locals.put("dev_3", _dev_3);
 BA.debugLineNum = 656;BA.debugLine="Dim pir_rejections As Int = camera_status.Get(\"p";
Debug.ShouldStop(32768);
_pir_rejections = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pir_rejections")))));Debug.locals.put("pir_rejections", _pir_rejections);Debug.locals.put("pir_rejections", _pir_rejections);
 BA.debugLineNum = 657;BA.debugLine="Dim sync_module_id As Int = camera_status.Get(\"s";
Debug.ShouldStop(65536);
_sync_module_id = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("sync_module_id")))));Debug.locals.put("sync_module_id", _sync_module_id);Debug.locals.put("sync_module_id", _sync_module_id);
 BA.debugLineNum = 658;BA.debugLine="Dim lifetime_count As Int = camera_status.Get(\"l";
Debug.ShouldStop(131072);
_lifetime_count = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lifetime_count")))));Debug.locals.put("lifetime_count", _lifetime_count);Debug.locals.put("lifetime_count", _lifetime_count);
 BA.debugLineNum = 659;BA.debugLine="Dim error_codes As Int = camera_status.Get(\"erro";
Debug.ShouldStop(262144);
_error_codes = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("error_codes")))));Debug.locals.put("error_codes", _error_codes);Debug.locals.put("error_codes", _error_codes);
 BA.debugLineNum = 660;BA.debugLine="Dim fw_version As String = camera_status.Get(\"fw";
Debug.ShouldStop(524288);
_fw_version = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fw_version")))));Debug.locals.put("fw_version", _fw_version);Debug.locals.put("fw_version", _fw_version);
 BA.debugLineNum = 661;BA.debugLine="Dim ac_power As String = camera_status.Get(\"ac_p";
Debug.ShouldStop(1048576);
_ac_power = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ac_power")))));Debug.locals.put("ac_power", _ac_power);Debug.locals.put("ac_power", _ac_power);
 BA.debugLineNum = 663;BA.debugLine="clv.Clear";
Debug.ShouldStop(4194304);
_clv.runVoidMethod ("_clear");
 BA.debugLineNum = 664;BA.debugLine="clv.AddTextItem(\"Battery voltage: \" & NumberForm";
Debug.ShouldStop(8388608);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Battery voltage: "),main.__c.runMethod(true,"NumberFormat",(Object)((RemoteObject.solve(new RemoteObject[] {_battery_voltage,RemoteObject.createImmutable(100)}, "/",0, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))),RemoteObject.createImmutable("V - "),_checkbattlife(_battery_voltage)))),(Object)((RemoteObject.createImmutable("battery_voltage"))));
 BA.debugLineNum = 665;BA.debugLine="clv.AddTextItem(\"Camera to WiFi strength: \" & wi";
Debug.ShouldStop(16777216);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Camera to WiFi strength: "),_wifi_strength,RemoteObject.createImmutable(" dBm - "),_checklfrlevel(_wifi_strength)))),(Object)((RemoteObject.createImmutable("wifi_strength"))));
 BA.debugLineNum = 666;BA.debugLine="clv.AddTextItem(\"Camera to Sync Module strength";
Debug.ShouldStop(33554432);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Camera to Sync Module strength (LFR): "),_lfr_strength,RemoteObject.createImmutable(" dBm - "),_checklfrlevel(_lfr_strength)))),(Object)((RemoteObject.createImmutable("lfr_strength"))));
 BA.debugLineNum = 667;BA.debugLine="clv.AddTextItem(\"Temperature: \" & temperature &";
Debug.ShouldStop(67108864);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Temperature: "),_temperature,RemoteObject.createImmutable("ºF")))),(Object)((RemoteObject.createImmutable("temperature"))));
 BA.debugLineNum = 668;BA.debugLine="clv.AddTextItem(\"Firmware version: \" & fw_versio";
Debug.ShouldStop(134217728);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Firmware version: "),_fw_version))),(Object)((RemoteObject.createImmutable("fw_version"))));
 BA.debugLineNum = 669;BA.debugLine="clv.AddTextItem(\"Firmware Git Hash: \" & fw_git_h";
Debug.ShouldStop(268435456);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Firmware Git Hash: "),_fw_git_hash))),(Object)((RemoteObject.createImmutable("fw_git_hash"))));
 BA.debugLineNum = 670;BA.debugLine="clv.AddTextItem(\"Battery alert status: \" & batte";
Debug.ShouldStop(536870912);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Battery alert status: "),_battery_alert_status))),(Object)((RemoteObject.createImmutable("battery_alert_status"))));
 BA.debugLineNum = 671;BA.debugLine="clv.AddTextItem(\"Temperature alert status: \" & t";
Debug.ShouldStop(1073741824);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Temperature alert status: "),_temp_alert_status))),(Object)((RemoteObject.createImmutable("temp_alert_status"))));
 BA.debugLineNum = 672;BA.debugLine="clv.AddTextItem(\"Updated at: \" & ConvertDateTime";
Debug.ShouldStop(-2147483648);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Updated at: "),_convertdatetimeplain(_updated_at)))),(Object)((RemoteObject.createImmutable("updated_at"))));
 BA.debugLineNum = 673;BA.debugLine="clv.AddTextItem(\"Created at: \" & ConvertDateTime";
Debug.ShouldStop(1);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Created at: "),_convertdatetimeplain(_created_at)))),(Object)((RemoteObject.createImmutable("created_at"))));
 BA.debugLineNum = 674;BA.debugLine="clv.AddTextItem(\"IP address: \" & ip_address, \"ip";
Debug.ShouldStop(2);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("IP address: "),_ip_address))),(Object)((RemoteObject.createImmutable("ip_address"))));
 BA.debugLineNum = 675;BA.debugLine="clv.AddTextItem(\"MAC address: \" & mac, \"mac\")";
Debug.ShouldStop(4);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("MAC address: "),_mac))),(Object)((RemoteObject.createImmutable("mac"))));
 BA.debugLineNum = 676;BA.debugLine="clv.AddTextItem(\"Camera ID: \" & camera_id, \"came";
Debug.ShouldStop(8);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Camera ID: "),_camera_id))),(Object)((RemoteObject.createImmutable("camera_id"))));
 BA.debugLineNum = 677;BA.debugLine="clv.AddTextItem(\"Serial: \" & serial, \"serial\")";
Debug.ShouldStop(16);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Serial: "),_serial))),(Object)((RemoteObject.createImmutable("serial"))));
 BA.debugLineNum = 678;BA.debugLine="clv.AddTextItem(\"Network ID: \" & network_id, \"ne";
Debug.ShouldStop(32);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Network ID: "),_network_id))),(Object)((RemoteObject.createImmutable("network_id"))));
 BA.debugLineNum = 679;BA.debugLine="clv.AddTextItem(\"Account ID: \" & account_id, \"ac";
Debug.ShouldStop(64);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Account ID: "),_account_id))),(Object)((RemoteObject.createImmutable("account_id"))));
 BA.debugLineNum = 680;BA.debugLine="clv.AddTextItem(\"ID: \" & id, \"id\")";
Debug.ShouldStop(128);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("ID: "),_id))),(Object)((RemoteObject.createImmutable("id"))));
 BA.debugLineNum = 681;BA.debugLine="clv.AddTextItem(\"Sync Module ID: \" & sync_module";
Debug.ShouldStop(256);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Sync Module ID: "),_sync_module_id))),(Object)((RemoteObject.createImmutable("sync_module_id"))));
 BA.debugLineNum = 682;BA.debugLine="clv.AddTextItem(\"Light sensor data valid: \" & li";
Debug.ShouldStop(512);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Light sensor data valid: "),_light_sensor_data_valid))),(Object)((RemoteObject.createImmutable("light_sensor_data_valid"))));
 BA.debugLineNum = 683;BA.debugLine="clv.AddTextItem(\"DHCP failure count: \" & dhcp_fa";
Debug.ShouldStop(1024);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("DHCP failure count: "),_dhcp_failure_count))),(Object)((RemoteObject.createImmutable("dhcp_failure_count"))));
 BA.debugLineNum = 684;BA.debugLine="clv.AddTextItem(\"LFR tb wakeups: \" & lfr_tb_wake";
Debug.ShouldStop(2048);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("LFR tb wakeups: "),_lfr_tb_wakeups))),(Object)((RemoteObject.createImmutable("lfr_tb_wakeups"))));
 BA.debugLineNum = 685;BA.debugLine="clv.AddTextItem(\"Socket failure count: \" & socke";
Debug.ShouldStop(4096);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Socket failure count: "),_socket_failure_count))),(Object)((RemoteObject.createImmutable("socket_failure_count"))));
 BA.debugLineNum = 686;BA.debugLine="clv.AddTextItem(\"Camera thumbnail: \" & cameraThu";
Debug.ShouldStop(8192);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Camera thumbnail: "),main._camerathumbnail))),(Object)((RemoteObject.createImmutable("thumbnail"))));
 BA.debugLineNum = 687;BA.debugLine="clv.AddTextItem(\"WiFi connect failure count: \" &";
Debug.ShouldStop(16384);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("WiFi connect failure count: "),_wifi_connect_failure_count))),(Object)((RemoteObject.createImmutable("wifi_connect_failure_count"))));
 BA.debugLineNum = 688;BA.debugLine="clv.AddTextItem(\"Error codes: \" & error_codes, \"";
Debug.ShouldStop(32768);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Error codes: "),_error_codes))),(Object)((RemoteObject.createImmutable("error_codes"))));
 BA.debugLineNum = 689;BA.debugLine="clv.AddTextItem(\"AC power: \" & ac_power, \"ac_pow";
Debug.ShouldStop(65536);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("AC power: "),_ac_power))),(Object)((RemoteObject.createImmutable("ac_power"))));
 BA.debugLineNum = 690;BA.debugLine="clv.AddTextItem(\"Total 108 wakeups: \" & total_10";
Debug.ShouldStop(131072);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Total 108 wakeups: "),_total_108_wakeups))),(Object)((RemoteObject.createImmutable("total_108_wakeups"))));
 BA.debugLineNum = 691;BA.debugLine="clv.AddTextItem(\"Total Tb wakeups: \" & total_tb_";
Debug.ShouldStop(262144);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Total Tb wakeups: "),_total_tb_wakeups))),(Object)((RemoteObject.createImmutable("total_tb_wakeups"))));
 BA.debugLineNum = 692;BA.debugLine="clv.AddTextItem(\"Light sensor ch0: \" & light_sen";
Debug.ShouldStop(524288);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Light sensor ch0: "),_light_sensor_ch0))),(Object)((RemoteObject.createImmutable("light_sensor_ch0"))));
 BA.debugLineNum = 693;BA.debugLine="clv.AddTextItem(\"Unit number: \" & unit_number, \"";
Debug.ShouldStop(1048576);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Unit number: "),_unit_number))),(Object)((RemoteObject.createImmutable("unit_number"))));
 BA.debugLineNum = 694;BA.debugLine="clv.AddTextItem(\"Light sensor ch1: \" & light_sen";
Debug.ShouldStop(2097152);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Light sensor ch1: "),_light_sensor_ch1))),(Object)((RemoteObject.createImmutable("light_sensor_ch1"))));
 BA.debugLineNum = 695;BA.debugLine="clv.AddTextItem(\"Time dhcp lease: \" & time_dhcp_";
Debug.ShouldStop(4194304);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Time dhcp lease: "),_time_dhcp_lease))),(Object)((RemoteObject.createImmutable("time_dhcp_lease"))));
 BA.debugLineNum = 696;BA.debugLine="clv.AddTextItem(\"Time first video: \" & time_firs";
Debug.ShouldStop(8388608);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Time first video: "),_time_first_video))),(Object)((RemoteObject.createImmutable("time_first_video"))));
 BA.debugLineNum = 697;BA.debugLine="clv.AddTextItem(\"Time dns resolve: \" & time_dns_";
Debug.ShouldStop(16777216);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Time dns resolve: "),_time_dns_resolve))),(Object)((RemoteObject.createImmutable("time_dns_resolve"))));
 BA.debugLineNum = 698;BA.debugLine="clv.AddTextItem(\"Time 108 boot: \" & time_108_boo";
Debug.ShouldStop(33554432);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Time 108 boot: "),_time_108_boot))),(Object)((RemoteObject.createImmutable("time_108_boot"))));
 BA.debugLineNum = 699;BA.debugLine="clv.AddTextItem(\"LFR 108 wakeups: \" & lfr_108_wa";
Debug.ShouldStop(67108864);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("LFR 108 wakeups: "),_lfr_108_wakeups))),(Object)((RemoteObject.createImmutable("lfr_108_wakeups"))));
 BA.debugLineNum = 700;BA.debugLine="clv.AddTextItem(\"lifetime duration: \" & lifetime";
Debug.ShouldStop(134217728);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("lifetime duration: "),_lifetime_duration))),(Object)((RemoteObject.createImmutable("lifetime_duration"))));
 BA.debugLineNum = 701;BA.debugLine="clv.AddTextItem(\"lpv: \" & ipv, \"ipv\")";
Debug.ShouldStop(268435456);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("lpv: "),_ipv))),(Object)((RemoteObject.createImmutable("ipv"))));
 BA.debugLineNum = 702;BA.debugLine="clv.AddTextItem(\"light sensor data new: \" & ligh";
Debug.ShouldStop(536870912);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("light sensor data new: "),_light_sensor_data_new))),(Object)((RemoteObject.createImmutable("light_sensor_data_new"))));
 BA.debugLineNum = 703;BA.debugLine="clv.AddTextItem(\"Dev_1: \" & dev_1, \"dev_1\")";
Debug.ShouldStop(1073741824);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Dev_1: "),_dev_1))),(Object)((RemoteObject.createImmutable("dev_1"))));
 BA.debugLineNum = 704;BA.debugLine="clv.AddTextItem(\"Dev_2: \" & dev_2, \"dev_2\")";
Debug.ShouldStop(-2147483648);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Dev_2: "),_dev_2))),(Object)((RemoteObject.createImmutable("dev_2"))));
 BA.debugLineNum = 705;BA.debugLine="clv.AddTextItem(\"Dev_3: \" & dev_3, \"dev_3\")";
Debug.ShouldStop(1);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Dev_3: "),_dev_3))),(Object)((RemoteObject.createImmutable("dev_3"))));
 BA.debugLineNum = 706;BA.debugLine="clv.AddTextItem(\"Time wlan connect: \" & time_wla";
Debug.ShouldStop(2);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Time wlan connect: "),_time_wlan_connect))),(Object)((RemoteObject.createImmutable("time_wlan_connect"))));
 BA.debugLineNum = 707;BA.debugLine="clv.AddTextItem(\"PIR rejections: \" & pir_rejecti";
Debug.ShouldStop(4);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("PIR rejections: "),_pir_rejections))),(Object)((RemoteObject.createImmutable("pir_rejections"))));
 BA.debugLineNum = 708;BA.debugLine="clv.AddTextItem(\"Lifetime count: \" & lifetime_co";
Debug.ShouldStop(8);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Lifetime count: "),_lifetime_count))),(Object)((RemoteObject.createImmutable("lifetime_count"))));
 BA.debugLineNum = 710;BA.debugLine="Dim strTimestamp As String";
Debug.ShouldStop(32);
_strtimestamp = RemoteObject.createImmutable("");Debug.locals.put("strTimestamp", _strtimestamp);
 BA.debugLineNum = 711;BA.debugLine="strTimestamp = ConvertDateTime(updated_at)";
Debug.ShouldStop(64);
_strtimestamp = _convertdatetime(_updated_at);Debug.locals.put("strTimestamp", _strtimestamp);
 BA.debugLineNum = 712;BA.debugLine="lblStatus.Text = \"Last updated: \" & strTimestamp";
Debug.ShouldStop(128);
main._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Last updated: "),_strtimestamp));
 BA.debugLineNum = 713;BA.debugLine="If clv = clvDriveway Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_clv,main._clvdriveway)) { 
 BA.debugLineNum = 714;BA.debugLine="lblDriveway.Text = \"Driveway \" & strTimestamp";
Debug.ShouldStop(512);
main._lbldriveway.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Driveway "),_strtimestamp));
 BA.debugLineNum = 715;BA.debugLine="prevDrivewayUpdateTime = updated_at";
Debug.ShouldStop(1024);
main._prevdrivewayupdatetime = _updated_at;
 }else 
{ BA.debugLineNum = 716;BA.debugLine="Else If clv = clvFrontDoor Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_clv,main._clvfrontdoor)) { 
 BA.debugLineNum = 717;BA.debugLine="lblFrontDoor.Text = \"Front Door \" & strTimestam";
Debug.ShouldStop(4096);
main._lblfrontdoor.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Front Door "),_strtimestamp));
 BA.debugLineNum = 718;BA.debugLine="lblDriveway.Text = \"Driveway \" & ConvertDateTim";
Debug.ShouldStop(8192);
main._lbldriveway.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Driveway "),_convertdatetime(main._prevdrivewayupdatetime)));
 BA.debugLineNum = 719;BA.debugLine="prevFrontDoorUpdateTime = updated_at";
Debug.ShouldStop(16384);
main._prevfrontdoorupdatetime = _updated_at;
 }else 
{ BA.debugLineNum = 720;BA.debugLine="Else If clv = clvSideYard Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_clv,main._clvsideyard)) { 
 BA.debugLineNum = 721;BA.debugLine="lblSideYard.Text = \"Side Yard \" & strTimestamp";
Debug.ShouldStop(65536);
main._lblsideyard.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Side Yard "),_strtimestamp));
 BA.debugLineNum = 722;BA.debugLine="lblDriveway.Text = \"Driveway \" & ConvertDateTim";
Debug.ShouldStop(131072);
main._lbldriveway.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Driveway "),_convertdatetime(main._prevdrivewayupdatetime)));
 BA.debugLineNum = 723;BA.debugLine="lblFrontDoor.Text = \"Front Door \" & ConvertDate";
Debug.ShouldStop(262144);
main._lblfrontdoor.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Front Door "),_convertdatetime(main._prevfrontdoorupdatetime)));
 }}}
;
 BA.debugLineNum = 726;BA.debugLine="For i = 0 To clv.Size-1";
Debug.ShouldStop(2097152);
{
final int step113 = 1;
final int limit113 = RemoteObject.solve(new RemoteObject[] {_clv.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step113 > 0 && _i <= limit113) || (step113 < 0 && _i >= limit113) ;_i = ((int)(0 + _i + step113))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 727;BA.debugLine="Dim item As String";
Debug.ShouldStop(4194304);
_item = RemoteObject.createImmutable("");Debug.locals.put("item", _item);
 BA.debugLineNum = 728;BA.debugLine="item = clv.GetValue(i)";
Debug.ShouldStop(8388608);
_item = BA.ObjectToString(_clv.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("item", _item);
 BA.debugLineNum = 729;BA.debugLine="If item.Contains(\"thumbnail\") Then";
Debug.ShouldStop(16777216);
if (_item.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("thumbnail"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 730;BA.debugLine="clv.ResizeItem(i,80dip)";
Debug.ShouldStop(33554432);
_clv.runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(main.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))));
 }else 
{ BA.debugLineNum = 731;BA.debugLine="Else If item.Contains(\"_strength\") Then";
Debug.ShouldStop(67108864);
if (_item.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("_strength"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 732;BA.debugLine="clv.ResizeItem(i,45dip)";
Debug.ShouldStop(134217728);
_clv.runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(main.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)))));
 }else {
 BA.debugLineNum = 734;BA.debugLine="clv.ResizeItem(i,35dip)";
Debug.ShouldStop(536870912);
_clv.runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(main.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))));
 }}
;
 }
}Debug.locals.put("i", _i);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e125) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e125.toString()); BA.debugLineNum = 738;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 739;BA.debugLine="fx.msgbox(MainForm,\"GetCameraInfo LastException:";
Debug.ShouldStop(4);
main._fx.runVoidMethodAndSync ("Msgbox",(Object)(main._mainform),(Object)(RemoteObject.concat(RemoteObject.createImmutable("GetCameraInfo LastException: "),main.__c.runMethod(false,"LastException",main.ba))),(Object)(main._mainform.runMethod(true,"getTitle")));
 };
 BA.debugLineNum = 741;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcommandid(RemoteObject _json) throws Exception{
try {
		Debug.PushSubsStack("GetCommandID (main) ","main",0,main.ba,main.mostCurrent,522);
if (RapidSub.canDelegate("getcommandid")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","getcommandid", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("json", _json);
 BA.debugLineNum = 522;BA.debugLine="Sub GetCommandID(json As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 523;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 524;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2048);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 525;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(4096);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 526;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(8192);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 541;BA.debugLine="commandID = root.Get(\"id\")";
Debug.ShouldStop(268435456);
main._commandid = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));
 BA.debugLineNum = 542;BA.debugLine="Log(\"commandID: \" & commandID)";
Debug.ShouldStop(536870912);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("commandID: "),main._commandid)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e8.toString()); BA.debugLineNum = 564;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 565;BA.debugLine="fx.msgbox(MainForm,\"GetCommandID LastException:";
Debug.ShouldStop(1048576);
main._fx.runVoidMethodAndSync ("Msgbox",(Object)(main._mainform),(Object)(RemoteObject.concat(RemoteObject.createImmutable("GetCommandID LastException: "),main.__c.runMethod(false,"LastException",main.ba))),(Object)(main._mainform.runMethod(true,"getTitle")));
 };
 BA.debugLineNum = 567;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcommandstatus(RemoteObject _json) throws Exception{
try {
		Debug.PushSubsStack("GetCommandStatus (main) ","main",0,main.ba,main.mostCurrent,569);
if (RapidSub.canDelegate("getcommandstatus")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","getcommandstatus", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("json", _json);
 BA.debugLineNum = 569;BA.debugLine="Sub GetCommandStatus(json As String)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 570;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 571;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(67108864);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 572;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(134217728);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 573;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(268435456);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 574;BA.debugLine="commandComplete = root.Get(\"complete\")";
Debug.ShouldStop(536870912);
main._commandcomplete = BA.ObjectToBoolean(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("complete")))));
 BA.debugLineNum = 575;BA.debugLine="Log(\"commandComplete: \" & commandComplete)";
Debug.ShouldStop(1073741824);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("commandComplete: "),main._commandcomplete)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e8.toString()); BA.debugLineNum = 577;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 578;BA.debugLine="fx.msgbox(MainForm,\"GetCommandStatus LastExcepti";
Debug.ShouldStop(2);
main._fx.runVoidMethodAndSync ("Msgbox",(Object)(main._mainform),(Object)(RemoteObject.concat(RemoteObject.createImmutable("GetCommandStatus LastException: "),main.__c.runMethod(false,"LastException",main.ba))),(Object)(main._mainform.runMethod(true,"getTitle")));
 };
 BA.debugLineNum = 580;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getliveview(RemoteObject _json) throws Exception{
try {
		Debug.PushSubsStack("GetLiveView (main) ","main",0,main.ba,main.mostCurrent,1078);
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
RemoteObject _mp = RemoteObject.declareNull("anywheresoftware.b4j.objects.MediaPlayerWrapper");
Debug.locals.put("json", _json);
 BA.debugLineNum = 1078;BA.debugLine="Sub GetLiveView(json As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1079;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 1080;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(8388608);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1081;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(16777216);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 1082;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(33554432);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 1083;BA.debugLine="Dim duration As Int = root.Get(\"duration\")";
Debug.ShouldStop(67108864);
_duration = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("duration")))));Debug.locals.put("duration", _duration);Debug.locals.put("duration", _duration);
 BA.debugLineNum = 1084;BA.debugLine="Dim server As String = root.Get(\"server\")";
Debug.ShouldStop(134217728);
_server = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("server")))));Debug.locals.put("server", _server);Debug.locals.put("server", _server);
 BA.debugLineNum = 1085;BA.debugLine="Dim device_name As String = root.Get(\"device_nam";
Debug.ShouldStop(268435456);
_device_name = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("device_name")))));Debug.locals.put("device_name", _device_name);Debug.locals.put("device_name", _device_name);
 BA.debugLineNum = 1086;BA.debugLine="Dim network_id As Int = root.Get(\"network_id\")";
Debug.ShouldStop(536870912);
_network_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("network_id")))));Debug.locals.put("network_id", _network_id);Debug.locals.put("network_id", _network_id);
 BA.debugLineNum = 1087;BA.debugLine="Dim continue_interval As Int = root.Get(\"continu";
Debug.ShouldStop(1073741824);
_continue_interval = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("continue_interval")))));Debug.locals.put("continue_interval", _continue_interval);Debug.locals.put("continue_interval", _continue_interval);
 BA.debugLineNum = 1088;BA.debugLine="Dim continue_warning As Int = root.Get(\"continue";
Debug.ShouldStop(-2147483648);
_continue_warning = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("continue_warning")))));Debug.locals.put("continue_warning", _continue_warning);Debug.locals.put("continue_warning", _continue_warning);
 BA.debugLineNum = 1089;BA.debugLine="Dim id As Int = root.Get(\"id\")";
Debug.ShouldStop(1);
_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 1090;BA.debugLine="Dim submit_logs As String = root.Get(\"submit_log";
Debug.ShouldStop(2);
_submit_logs = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("submit_logs")))));Debug.locals.put("submit_logs", _submit_logs);Debug.locals.put("submit_logs", _submit_logs);
 BA.debugLineNum = 1091;BA.debugLine="Dim camera_name As String = root.Get(\"camera_nam";
Debug.ShouldStop(4);
_camera_name = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("camera_name")))));Debug.locals.put("camera_name", _camera_name);Debug.locals.put("camera_name", _camera_name);
 BA.debugLineNum = 1092;BA.debugLine="Dim lv_save As String = root.Get(\"lv_save\")";
Debug.ShouldStop(8);
_lv_save = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lv_save")))));Debug.locals.put("lv_save", _lv_save);Debug.locals.put("lv_save", _lv_save);
 BA.debugLineNum = 1093;BA.debugLine="Log(\"Liveview: \" & server)";
Debug.ShouldStop(16);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Liveview: "),_server)));
 BA.debugLineNum = 1094;BA.debugLine="Dim mp As MediaPlayer";
Debug.ShouldStop(32);
_mp = RemoteObject.createNew ("anywheresoftware.b4j.objects.MediaPlayerWrapper");Debug.locals.put("mp", _mp);
 BA.debugLineNum = 1095;BA.debugLine="mp.Initialize(\"mp\", server)";
Debug.ShouldStop(64);
_mp.runVoidMethod ("Initialize",main.ba,(Object)(BA.ObjectToString("mp")),(Object)(_server));
 BA.debugLineNum = 1096;BA.debugLine="mp.Play";
Debug.ShouldStop(128);
_mp.runVoidMethod ("Play");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e20) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e20.toString()); BA.debugLineNum = 1098;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 1099;BA.debugLine="fx.msgbox(MainForm,\"GetCommandStatus LastExcepti";
Debug.ShouldStop(1024);
main._fx.runVoidMethodAndSync ("Msgbox",(Object)(main._mainform),(Object)(RemoteObject.concat(RemoteObject.createImmutable("GetCommandStatus LastException: "),main.__c.runMethod(false,"LastException",main.ba))),(Object)(main._mainform.runMethod(true,"getTitle")));
 };
 BA.debugLineNum = 1101;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("GetRESTError (main) ","main",0,main.ba,main.mostCurrent,582);
if (RapidSub.canDelegate("getresterror")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","getresterror", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _code = RemoteObject.createImmutable(0);
RemoteObject _message = RemoteObject.createImmutable("");
Debug.locals.put("json", _json);
 BA.debugLineNum = 582;BA.debugLine="Sub GetRESTError(json As String) As String";
Debug.ShouldStop(32);
 BA.debugLineNum = 583;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 587;BA.debugLine="If json.Contains(\"<h1>Not Found</h1>\") Then";
Debug.ShouldStop(1024);
if (_json.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("<h1>Not Found</h1>"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 588;BA.debugLine="Return \"REST endpoint URL not found. Try again.";
Debug.ShouldStop(2048);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("REST endpoint URL not found. Try again.");
 }else {
 BA.debugLineNum = 590;BA.debugLine="If json.IndexOf(\"{\") <> -1 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("!",_json.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("{"))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 591;BA.debugLine="json = json.SubString(json.IndexOf(\"{\"))";
Debug.ShouldStop(16384);
_json = _json.runMethod(true,"substring",(Object)(_json.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("{")))));Debug.locals.put("json", _json);
 BA.debugLineNum = 592;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(32768);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 593;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(65536);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 594;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(131072);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 595;BA.debugLine="Dim code As Int = root.Get(\"code\")";
Debug.ShouldStop(262144);
_code = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("code")))));Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 596;BA.debugLine="Dim message As String = root.Get(\"message\")";
Debug.ShouldStop(524288);
_message = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("message")))));Debug.locals.put("message", _message);Debug.locals.put("message", _message);
 BA.debugLineNum = 597;BA.debugLine="Log(\"Code: \" & code & \" Message: \" & message)";
Debug.ShouldStop(1048576);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Code: "),_code,RemoteObject.createImmutable(" Message: "),_message)));
 BA.debugLineNum = 598;BA.debugLine="Return \"Code: \" & code & \" Message: \" & messag";
Debug.ShouldStop(2097152);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.concat(RemoteObject.createImmutable("Code: "),_code,RemoteObject.createImmutable(" Message: "),_message);
 }else {
 BA.debugLineNum = 600;BA.debugLine="Return json";
Debug.ShouldStop(8388608);
Debug.CheckDeviceExceptions();if (true) return _json;
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e19) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e19.toString()); BA.debugLineNum = 604;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 605;BA.debugLine="fx.msgbox(MainForm,\"GetRESTError: \" & LastExcept";
Debug.ShouldStop(268435456);
main._fx.runVoidMethodAndSync ("Msgbox",(Object)(main._mainform),(Object)(RemoteObject.concat(RemoteObject.createImmutable("GetRESTError: "),main.__c.runMethod(false,"LastException",main.ba))),(Object)(main._mainform.runMethod(true,"getTitle")));
 BA.debugLineNum = 606;BA.debugLine="Return json";
Debug.ShouldStop(536870912);
if (true) return _json;
 };
 BA.debugLineNum = 608;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("GetSyncModuleInfo (main) ","main",0,main.ba,main.mostCurrent,743);
if (RapidSub.canDelegate("getsyncmoduleinfo")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","getsyncmoduleinfo", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _syncmodule = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _wifi_strength = RemoteObject.createImmutable(0);
RemoteObject _os_version = RemoteObject.createImmutable("");
RemoteObject _fw_version = RemoteObject.createImmutable("");
RemoteObject _status = RemoteObject.createImmutable("");
Debug.locals.put("json", _json);
 BA.debugLineNum = 743;BA.debugLine="Sub GetSyncModuleInfo(json As String)";
Debug.ShouldStop(64);
 BA.debugLineNum = 744;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 745;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(256);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 746;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(512);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 747;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(1024);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 748;BA.debugLine="Dim syncmodule As Map = root.Get(\"syncmodule\")";
Debug.ShouldStop(2048);
_syncmodule = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_syncmodule.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("syncmodule")))));Debug.locals.put("syncmodule", _syncmodule);
 BA.debugLineNum = 752;BA.debugLine="Dim wifi_strength As Int = syncmodule.Get(\"wifi_";
Debug.ShouldStop(32768);
_wifi_strength = BA.numberCast(int.class, _syncmodule.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("wifi_strength")))));Debug.locals.put("wifi_strength", _wifi_strength);Debug.locals.put("wifi_strength", _wifi_strength);
 BA.debugLineNum = 753;BA.debugLine="Dim os_version As String = syncmodule.Get(\"os_ve";
Debug.ShouldStop(65536);
_os_version = BA.ObjectToString(_syncmodule.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("os_version")))));Debug.locals.put("os_version", _os_version);Debug.locals.put("os_version", _os_version);
 BA.debugLineNum = 770;BA.debugLine="Dim fw_version As String = syncmodule.Get(\"fw_ve";
Debug.ShouldStop(2);
_fw_version = BA.ObjectToString(_syncmodule.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fw_version")))));Debug.locals.put("fw_version", _fw_version);Debug.locals.put("fw_version", _fw_version);
 BA.debugLineNum = 772;BA.debugLine="Dim status As String = syncmodule.Get(\"status\")";
Debug.ShouldStop(8);
_status = BA.ObjectToString(_syncmodule.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 773;BA.debugLine="lblSyncModule.Text = \"Sync Module is \" & status";
Debug.ShouldStop(16);
main._lblsyncmodule.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Sync Module is "),_status,main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Wifi Strength: "),_wifi_strength,RemoteObject.createImmutable(" bars"),main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Firmware version: "),_fw_version,main.__c.getField(true,"CRLF"),RemoteObject.createImmutable("OS version: "),_os_version));
 BA.debugLineNum = 775;BA.debugLine="If status = \"online\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_status,BA.ObjectToString("online"))) { 
 BA.debugLineNum = 776;BA.debugLine="ivSyncModule.SetImage(fx.LoadImage(File.DirAsse";
Debug.ShouldStop(128);
main._ivsyncmodule.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("systemstatusonline.png"))).getObject())));
 }else {
 BA.debugLineNum = 778;BA.debugLine="ivSyncModule.SetImage(fx.LoadImage(File.DirAsse";
Debug.ShouldStop(512);
main._ivsyncmodule.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("systemstatusoffline.png"))).getObject())));
 };
 BA.debugLineNum = 781;BA.debugLine="If wifi_strength = \"5\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_wifi_strength,BA.numberCast(double.class, "5"))) { 
 BA.debugLineNum = 782;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
Debug.ShouldStop(8192);
main._ivsyncmodulewifi.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("bars5blue.png"))).getObject())));
 }else 
{ BA.debugLineNum = 783;BA.debugLine="Else If wifi_strength = \"4\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_wifi_strength,BA.numberCast(double.class, "4"))) { 
 BA.debugLineNum = 784;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
Debug.ShouldStop(32768);
main._ivsyncmodulewifi.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("bars4blue.png"))).getObject())));
 }else 
{ BA.debugLineNum = 785;BA.debugLine="Else If wifi_strength = \"3\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_wifi_strength,BA.numberCast(double.class, "3"))) { 
 BA.debugLineNum = 786;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
Debug.ShouldStop(131072);
main._ivsyncmodulewifi.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("bars3blue.png"))).getObject())));
 }else 
{ BA.debugLineNum = 787;BA.debugLine="Else If wifi_strength = \"2\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_wifi_strength,BA.numberCast(double.class, "2"))) { 
 BA.debugLineNum = 788;BA.debugLine="ivSyncModuleWiFi.SetImage(fx.LoadImage(File.Dir";
Debug.ShouldStop(524288);
main._ivsyncmodulewifi.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("bars2blue.png"))).getObject())));
 }}}}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e26) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e26.toString()); BA.debugLineNum = 791;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 792;BA.debugLine="fx.msgbox(MainForm,\"GetSyncModuleInfo LastExcept";
Debug.ShouldStop(8388608);
main._fx.runVoidMethodAndSync ("Msgbox",(Object)(main._mainform),(Object)(RemoteObject.concat(RemoteObject.createImmutable("GetSyncModuleInfo LastException: "),main.__c.runMethod(false,"LastException",main.ba))),(Object)(main._mainform.runMethod(true,"getTitle")));
 };
 BA.debugLineNum = 794;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getuserinfo(RemoteObject _json) throws Exception{
try {
		Debug.PushSubsStack("GetUserInfo (main) ","main",0,main.ba,main.mostCurrent,464);
if (RapidSub.canDelegate("getuserinfo")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","getuserinfo", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("json", _json);
 BA.debugLineNum = 464;BA.debugLine="Sub GetUserInfo(json As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 465;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 466;BA.debugLine="lblStatus.Text = \"Getting user information...\"";
Debug.ShouldStop(131072);
main._lblstatus.runMethod(true,"setText",BA.ObjectToString("Getting user information..."));
 BA.debugLineNum = 467;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(262144);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 468;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(524288);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 469;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(1048576);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 484;BA.debugLine="accountID = root.Get(\"account_id\") '88438";
Debug.ShouldStop(8);
main._accountid = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("account_id")))));
 BA.debugLineNum = 485;BA.debugLine="Log(\"accountID: \" &  accountID)";
Debug.ShouldStop(16);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("accountID: "),main._accountid)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e9.toString()); BA.debugLineNum = 488;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 489;BA.debugLine="fx.msgbox(MainForm,\"GetUserInfo LastException: \"";
Debug.ShouldStop(256);
main._fx.runVoidMethodAndSync ("Msgbox",(Object)(main._mainform),(Object)(RemoteObject.concat(RemoteObject.createImmutable("GetUserInfo LastException: "),main.__c.runMethod(false,"LastException",main.ba))),(Object)(main._mainform.runMethod(true,"getTitle")));
 };
 BA.debugLineNum = 491;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ivclose_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("ivClose_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,856);
if (RapidSub.canDelegate("ivclose_mouseclicked")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","ivclose_mouseclicked", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 856;BA.debugLine="Private Sub ivClose_MouseClicked (EventData As Mou";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 857;BA.debugLine="File.Delete(File.DirApp, \"Driveway.jpg\")";
Debug.ShouldStop(16777216);
main.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("Driveway.jpg")));
 BA.debugLineNum = 858;BA.debugLine="File.Delete(File.DirApp, \"FrontDoor.jpg\")";
Debug.ShouldStop(33554432);
main.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("FrontDoor.jpg")));
 BA.debugLineNum = 859;BA.debugLine="File.Delete(File.DirApp, \"SideYard.jpg\")";
Debug.ShouldStop(67108864);
main.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("SideYard.jpg")));
 BA.debugLineNum = 860;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
Debug.ShouldStop(134217728);
main.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("screenshot.jpg")));
 BA.debugLineNum = 861;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
Debug.ShouldStop(268435456);
main.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("media.mp4")));
 BA.debugLineNum = 862;BA.debugLine="ExitApplication";
Debug.ShouldStop(536870912);
main.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 863;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _ivdriveway_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("ivDriveway_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,995);
if (RapidSub.canDelegate("ivdriveway_mouseclicked")) { cloyd.blink.main.remoteMe.runUserSub(false, "main","ivdriveway_mouseclicked", _eventdata); return;}
ResumableSub_ivDriveway_MouseClicked rsub = new ResumableSub_ivDriveway_MouseClicked(null,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ivDriveway_MouseClicked extends BA.ResumableSub {
public ResumableSub_ivDriveway_MouseClicked(cloyd.blink.main parent,RemoteObject _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
cloyd.blink.main parent;
RemoteObject _eventdata;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ivDriveway_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,995);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1047;BA.debugLine="Try";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 1050;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia-";
Debug.ShouldStop(33554432);
_restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/homescreen")));
 BA.debugLineNum = 1052;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "ivdriveway_mouseclicked"),BA.numberCast(int.class, 1000));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 BA.debugLineNum = 1053;BA.debugLine="File.WriteString(File.DirApp,\"response_arm.txt\",";
Debug.ShouldStop(268435456);
parent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("response_arm.txt")),(Object)(parent._response));
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 1071;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",main.ba))));
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 1076;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
public static RemoteObject  _ivfrontdoor_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("ivFrontDoor_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,1103);
if (RapidSub.canDelegate("ivfrontdoor_mouseclicked")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","ivfrontdoor_mouseclicked", _eventdata);}
RemoteObject _mf = RemoteObject.declareNull("cloyd.blink.frmmedia");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1103;BA.debugLine="Sub ivFrontDoor_MouseClicked (EventData As MouseEv";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1104;BA.debugLine="Dim mf As frmMedia";
Debug.ShouldStop(32768);
_mf = RemoteObject.createNew ("cloyd.blink.frmmedia");Debug.locals.put("mf", _mf);
 BA.debugLineNum = 1105;BA.debugLine="mf.Initialize(MainForm)";
Debug.ShouldStop(65536);
_mf.runClassMethod (cloyd.blink.frmmedia.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(main._mainform));
 BA.debugLineNum = 1106;BA.debugLine="mf.timestamp = lblFrontDoor.Text";
Debug.ShouldStop(131072);
_mf.setField ("_timestamp" /*RemoteObject*/ ,main._lblfrontdoor.runMethod(true,"getText"));
 BA.debugLineNum = 1107;BA.debugLine="mf.url=$\"    <h1>${lblFrontDoor.Text}</h1>    <im";
Debug.ShouldStop(262144);
_mf.setField ("_url" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("   <h1>"),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main._lblfrontdoor.runMethod(true,"getText")))),RemoteObject.createImmutable("</h1>\n"),RemoteObject.createImmutable("   <img src=\""),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("FrontDoor.jpg")))))),RemoteObject.createImmutable("\"/>\n"),RemoteObject.createImmutable("   \n"),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1112;BA.debugLine="mf.Show";
Debug.ShouldStop(8388608);
_mf.runClassMethod (cloyd.blink.frmmedia.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1113;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("ivMax_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,881);
if (RapidSub.canDelegate("ivmax_mouseclicked")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","ivmax_mouseclicked", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 881;BA.debugLine="Private Sub ivMax_MouseClicked (EventData As Mouse";
Debug.ShouldStop(65536);
 BA.debugLineNum = 883;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("ivMin_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,901);
if (RapidSub.canDelegate("ivmin_mouseclicked")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","ivmin_mouseclicked", _eventdata);}
RemoteObject _jmf = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _stage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 901;BA.debugLine="Private Sub ivMin_MouseClicked (EventData As Mouse";
Debug.ShouldStop(16);
 BA.debugLineNum = 902;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 903;BA.debugLine="Dim jmf As JavaObject = MainForm";
Debug.ShouldStop(64);
_jmf = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jmf.setObject(main._mainform);Debug.locals.put("jmf", _jmf);
 BA.debugLineNum = 904;BA.debugLine="Dim stage As JavaObject = jmf.GetField(\"stage\")";
Debug.ShouldStop(128);
_stage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_stage.setObject(_jmf.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("stage", _stage);
 BA.debugLineNum = 905;BA.debugLine="stage.RunMethod(\"setIconified\", Array As Object(";
Debug.ShouldStop(256);
_stage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setIconified")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(main.__c.getField(true,"True"))})));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e6.toString()); BA.debugLineNum = 907;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 909;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("ivSideYard_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,1115);
if (RapidSub.canDelegate("ivsideyard_mouseclicked")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","ivsideyard_mouseclicked", _eventdata);}
RemoteObject _mf = RemoteObject.declareNull("cloyd.blink.frmmedia");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 1115;BA.debugLine="Sub ivSideYard_MouseClicked (EventData As MouseEve";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1116;BA.debugLine="Dim mf As frmMedia";
Debug.ShouldStop(134217728);
_mf = RemoteObject.createNew ("cloyd.blink.frmmedia");Debug.locals.put("mf", _mf);
 BA.debugLineNum = 1117;BA.debugLine="mf.Initialize(MainForm)";
Debug.ShouldStop(268435456);
_mf.runClassMethod (cloyd.blink.frmmedia.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(main._mainform));
 BA.debugLineNum = 1118;BA.debugLine="mf.timestamp = lblSideYard.Text";
Debug.ShouldStop(536870912);
_mf.setField ("_timestamp" /*RemoteObject*/ ,main._lblsideyard.runMethod(true,"getText"));
 BA.debugLineNum = 1119;BA.debugLine="mf.url=$\"    <h1>${lblSideYard.Text}</h1>    <img";
Debug.ShouldStop(1073741824);
_mf.setField ("_url" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("   <h1>"),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main._lblsideyard.runMethod(true,"getText")))),RemoteObject.createImmutable("</h1>\n"),RemoteObject.createImmutable("   <img src=\""),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("SideYard.jpg")))))),RemoteObject.createImmutable("\"/>\n"),RemoteObject.createImmutable("   \n"),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1124;BA.debugLine="mf.Show";
Debug.ShouldStop(8);
_mf.runClassMethod (cloyd.blink.frmmedia.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1125;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("lbTitle_MouseDragged (main) ","main",0,main.ba,main.mostCurrent,836);
if (RapidSub.canDelegate("lbtitle_mousedragged")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","lbtitle_mousedragged", _eventdata);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 836;BA.debugLine="Private Sub lbTitle_MouseDragged (EventData As Mou";
Debug.ShouldStop(8);
 BA.debugLineNum = 837;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 838;BA.debugLine="If isMaximized Then Return";
Debug.ShouldStop(32);
if (main._ismaximized.<Boolean>get().booleanValue()) { 
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 839;BA.debugLine="Dim jo As JavaObject = EventData";
Debug.ShouldStop(64);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(_eventdata.getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 840;BA.debugLine="MainForm.WindowLeft = jo.RunMethod(\"getScreenX\",";
Debug.ShouldStop(128);
main._mainform.runMethod(true,"setWindowLeft",RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getScreenX")),(Object)((main.__c.getField(false,"Null"))))),main._xmouse}, "-",1, 0));
 BA.debugLineNum = 841;BA.debugLine="MainForm.WindowTop = jo.RunMethod(\"getScreenY\",";
Debug.ShouldStop(256);
main._mainform.runMethod(true,"setWindowTop",RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getScreenY")),(Object)((main.__c.getField(false,"Null"))))),main._ymouse}, "-",1, 0));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e7.toString()); BA.debugLineNum = 843;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 845;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("lbTitle_MousePressed (main) ","main",0,main.ba,main.mostCurrent,847);
if (RapidSub.canDelegate("lbtitle_mousepressed")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","lbtitle_mousepressed", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 847;BA.debugLine="Private Sub lbTitle_MousePressed (EventData As Mou";
Debug.ShouldStop(16384);
 BA.debugLineNum = 848;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 849;BA.debugLine="xMouse = EventData.X + lbTitle.Left + 15";
Debug.ShouldStop(65536);
main._xmouse = RemoteObject.solve(new RemoteObject[] {_eventdata.runMethod(true,"getX"),main._lbtitle.runMethod(true,"getLeft"),RemoteObject.createImmutable(15)}, "++",2, 0);
 BA.debugLineNum = 850;BA.debugLine="yMouse = EventData.Y + lbTitle.Top + 15";
Debug.ShouldStop(131072);
main._ymouse = RemoteObject.solve(new RemoteObject[] {_eventdata.runMethod(true,"getY"),main._lbtitle.runMethod(true,"getTop"),RemoteObject.createImmutable(15)}, "++",2, 0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e5.toString()); BA.debugLineNum = 852;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 854;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Max_Entered_Event (main) ","main",0,main.ba,main.mostCurrent,885);
if (RapidSub.canDelegate("max_entered_event")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","max_entered_event", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 885;BA.debugLine="Private Sub Max_Entered_Event(e As Event)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 886;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 887;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
Debug.ShouldStop(4194304);
main._ivmax.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable("_btMaxEnt.png")))).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e4.toString()); BA.debugLineNum = 889;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 891;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Max_Exited_Event (main) ","main",0,main.ba,main.mostCurrent,893);
if (RapidSub.canDelegate("max_exited_event")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","max_exited_event", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 893;BA.debugLine="Private Sub Max_Exited_Event(e As Event)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 894;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 895;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
Debug.ShouldStop(1073741824);
main._ivmax.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable("_btMax.png")))).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e4.toString()); BA.debugLineNum = 897;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 899;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Min_Entered_Event (main) ","main",0,main.ba,main.mostCurrent,911);
if (RapidSub.canDelegate("min_entered_event")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","min_entered_event", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 911;BA.debugLine="Private Sub Min_Entered_Event(e As Event)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 912;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 913;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
Debug.ShouldStop(65536);
main._ivmin.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable("_btMinEnt.png")))).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e4.toString()); BA.debugLineNum = 915;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 917;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Min_Exited_Event (main) ","main",0,main.ba,main.mostCurrent,919);
if (RapidSub.canDelegate("min_exited_event")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","min_exited_event", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 919;BA.debugLine="Private Sub Min_Exited_Event(e As Event)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 920;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 921;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
Debug.ShouldStop(16777216);
main._ivmin.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable("_btMin.png")))).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e4.toString()); BA.debugLineNum = 923;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 925;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("ParseUTCstring (main) ","main",0,main.ba,main.mostCurrent,1288);
if (RapidSub.canDelegate("parseutcstring")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","parseutcstring", _utc);}
RemoteObject _df = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.createImmutable(0L);
Debug.locals.put("utc", _utc);
 BA.debugLineNum = 1288;BA.debugLine="Sub ParseUTCstring(utc As String) As Long";
Debug.ShouldStop(128);
 BA.debugLineNum = 1289;BA.debugLine="Dim df As String = DateTime.DateFormat";
Debug.ShouldStop(256);
_df = main.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("df", _df);Debug.locals.put("df", _df);
 BA.debugLineNum = 1290;BA.debugLine="Dim res As Long";
Debug.ShouldStop(512);
_res = RemoteObject.createImmutable(0L);Debug.locals.put("res", _res);
 BA.debugLineNum = 1291;BA.debugLine="If utc.CharAt(10) = \"T\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_utc.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, 10))),BA.ObjectToChar("T"))) { 
 BA.debugLineNum = 1293;BA.debugLine="If utc.CharAt(19) = \".\" Then utc = utc.SubString";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_utc.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, 19))),BA.ObjectToChar("."))) { 
_utc = RemoteObject.concat(_utc.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 19))),RemoteObject.createImmutable("+0000"));Debug.locals.put("utc", _utc);};
 BA.debugLineNum = 1294;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd'T'HH:mm:ssZ\"";
Debug.ShouldStop(8192);
main.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd'T'HH:mm:ssZ"));
 }else {
 BA.debugLineNum = 1297;BA.debugLine="DateTime.DateFormat = \"EEE MMM dd HH:mm:ss Z yyy";
Debug.ShouldStop(65536);
main.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("EEE MMM dd HH:mm:ss Z yyyy"));
 };
 BA.debugLineNum = 1299;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 1300;BA.debugLine="res = DateTime.DateParse(utc)";
Debug.ShouldStop(524288);
_res = main.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_utc));Debug.locals.put("res", _res);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e12.toString()); BA.debugLineNum = 1302;BA.debugLine="res = 0";
Debug.ShouldStop(2097152);
_res = BA.numberCast(long.class, 0);Debug.locals.put("res", _res);
 };
 BA.debugLineNum = 1304;BA.debugLine="DateTime.DateFormat = df";
Debug.ShouldStop(8388608);
main.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_df);
 BA.debugLineNum = 1305;BA.debugLine="Return res";
Debug.ShouldStop(16777216);
if (true) return _res;
 BA.debugLineNum = 1306;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
frmmedia.myClass = BA.getDeviceClass ("cloyd.blink.frmmedia");
frmactivity.myClass = BA.getDeviceClass ("cloyd.blink.frmactivity");
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
b4xsignaturetemplate.myClass = BA.getDeviceClass ("cloyd.blink.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("cloyd.blink.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("cloyd.blink.b4xtimedtemplate");
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
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 9;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 10;BA.debugLine="Private emailAddress As String = \"antimone2001@ho";
main._emailaddress = BA.ObjectToString("[redacted] # replace with 'examplePass' instead");
 //BA.debugLineNum = 11;BA.debugLine="Private password As String = \"[redacted] # replace with the empty string\"";
main._password = BA.ObjectToString("[redacted] # replace with the empty string");
 //BA.debugLineNum = 12;BA.debugLine="Private authToken As String";
main._authtoken = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Private userRegion As String";
main._userregion = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Private accountID As String";
main._accountid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="Private networkID As String";
main._networkid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="Private commandID As String";
main._commandid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 17;BA.debugLine="Private commandComplete As Boolean";
main._commandcomplete = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 18;BA.debugLine="Private cameraThumbnail As String";
main._camerathumbnail = RemoteObject.createImmutable("");
 //BA.debugLineNum = 19;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 20;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 21;BA.debugLine="Private lbTitle As Label 'ignore";
main._lbtitle = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private xMouse, yMouse As Double";
main._xmouse = RemoteObject.createImmutable(0);
main._ymouse = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 23;BA.debugLine="Private isMaximized As Boolean = False";
main._ismaximized = main.__c.getField(true,"False");
 //BA.debugLineNum = 24;BA.debugLine="Private ivClose As ImageView";
main._ivclose = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ivMax As ImageView";
main._ivmax = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private ivMin As ImageView";
main._ivmin = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private AtualSkin As String";
main._atualskin = RemoteObject.createImmutable("");
 //BA.debugLineNum = 28;BA.debugLine="Private imgInit As String";
main._imginit = RemoteObject.createImmutable("");
 //BA.debugLineNum = 29;BA.debugLine="Private isMaximized As Boolean = False";
main._ismaximized = main.__c.getField(true,"False");
 //BA.debugLineNum = 30;BA.debugLine="Private f_X, f_Y, f_W, f_H As Double 'ignore";
main._f_x = RemoteObject.createImmutable(0);
main._f_y = RemoteObject.createImmutable(0);
main._f_w = RemoteObject.createImmutable(0);
main._f_h = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 31;BA.debugLine="Private btnDriveway As Button 'ignore";
main._btndriveway = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private response As String";
main._response = RemoteObject.createImmutable("");
 //BA.debugLineNum = 33;BA.debugLine="Private ivDriveway As ImageView";
main._ivdriveway = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private lblStatus As Label 'ignore";
main._lblstatus = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private ivFrontDoor As ImageView";
main._ivfrontdoor = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private ivSideYard As ImageView";
main._ivsideyard = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private lblDriveway As Label 'ignore";
main._lbldriveway = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private lblFrontDoor As Label 'ignore";
main._lblfrontdoor = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private lblSideYard As Label 'ignore";
main._lblsideyard = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private clvDriveway As CustomListView";
main._clvdriveway = RemoteObject.createNew ("b4j.example.customlistview");
 //BA.debugLineNum = 41;BA.debugLine="Private clvFrontDoor As CustomListView";
main._clvfrontdoor = RemoteObject.createNew ("b4j.example.customlistview");
 //BA.debugLineNum = 42;BA.debugLine="Private clvSideYard As CustomListView";
main._clvsideyard = RemoteObject.createNew ("b4j.example.customlistview");
 //BA.debugLineNum = 43;BA.debugLine="Private lblSyncModule As Label 'ignore";
main._lblsyncmodule = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 45;BA.debugLine="Private btnActivity As Button 'ignore";
main._btnactivity = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private btnRefresh As Button 'ignore";
main._btnrefresh = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private prevDrivewayUpdateTime As String";
main._prevdrivewayupdatetime = RemoteObject.createImmutable("");
 //BA.debugLineNum = 48;BA.debugLine="Private prevFrontDoorUpdateTime As String";
main._prevfrontdoorupdatetime = RemoteObject.createImmutable("");
 //BA.debugLineNum = 49;BA.debugLine="Private ivSyncModule As ImageView";
main._ivsyncmodule = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private ivSyncModuleWiFi As ImageView";
main._ivsyncmodulewifi = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _refreshcameras(RemoteObject _firstrun) throws Exception{
try {
		Debug.PushSubsStack("RefreshCameras (main) ","main",0,main.ba,main.mostCurrent,205);
if (RapidSub.canDelegate("refreshcameras")) { cloyd.blink.main.remoteMe.runUserSub(false, "main","refreshcameras", _firstrun); return;}
ResumableSub_RefreshCameras rsub = new ResumableSub_RefreshCameras(null,_firstrun);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_RefreshCameras extends BA.ResumableSub {
public ResumableSub_RefreshCameras(cloyd.blink.main parent,RemoteObject _firstrun) {
this.parent = parent;
this._firstrun = _firstrun;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
cloyd.blink.main parent;
RemoteObject _firstrun;
RemoteObject _camera = RemoteObject.createImmutable("");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
RemoteObject _clv = RemoteObject.declareNull("b4j.example.customlistview");
RemoteObject _links = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _attempts = RemoteObject.createImmutable(0);
RemoteObject _link = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject group16;
int index16;
int groupLen16;
int step73;
int limit73;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RefreshCameras (main) ","main",0,main.ba,main.mostCurrent,205);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("FirstRun", _firstrun);
 BA.debugLineNum = 206;BA.debugLine="Try";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 207;BA.debugLine="Dim camera As String";
Debug.ShouldStop(16384);
_camera = RemoteObject.createImmutable("");Debug.locals.put("camera", _camera);
 BA.debugLineNum = 208;BA.debugLine="Dim iv As ImageView";
Debug.ShouldStop(32768);
_iv = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 209;BA.debugLine="Dim clv As CustomListView";
Debug.ShouldStop(65536);
_clv = RemoteObject.createNew ("b4j.example.customlistview");Debug.locals.put("clv", _clv);
 BA.debugLineNum = 210;BA.debugLine="Dim links As List";
Debug.ShouldStop(131072);
_links = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("links", _links);
 BA.debugLineNum = 211;BA.debugLine="Dim attempts As Int";
Debug.ShouldStop(262144);
_attempts = RemoteObject.createImmutable(0);Debug.locals.put("attempts", _attempts);
 BA.debugLineNum = 212;BA.debugLine="links = Array(\"347574\", \"236967\", \"226821\")";
Debug.ShouldStop(524288);
_links = parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable(("347574")),RemoteObject.createImmutable(("236967")),(RemoteObject.createImmutable("226821"))})));Debug.locals.put("links", _links);
 BA.debugLineNum = 214;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia-";
Debug.ShouldStop(2097152);
_restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/syncmodules")));
 BA.debugLineNum = 215;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"),BA.numberCast(int.class, 1000));
this.state = 88;
return;
case 88:
//C
this.state = 4;
;
 BA.debugLineNum = 217;BA.debugLine="GetSyncModuleInfo(response)";
Debug.ShouldStop(16777216);
_getsyncmoduleinfo(parent._response);
 BA.debugLineNum = 219;BA.debugLine="If FirstRun= False Then";
Debug.ShouldStop(67108864);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_firstrun,parent.__c.getField(true,"False"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 220;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
Debug.ShouldStop(134217728);
_bluriv(BA.ObjectToString("Driveway.jpg"),parent._ivdriveway);
 BA.debugLineNum = 221;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
Debug.ShouldStop(268435456);
_bluriv(BA.ObjectToString("FrontDoor.jpg"),parent._ivfrontdoor);
 BA.debugLineNum = 222;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
Debug.ShouldStop(536870912);
_bluriv(BA.ObjectToString("SideYard.jpg"),parent._ivsideyard);
 if (true) break;
;
 BA.debugLineNum = 225;BA.debugLine="For Each link As String In links";
Debug.ShouldStop(1);

case 7:
//for
this.state = 84;
group16 = _links;
index16 = 0;
groupLen16 = group16.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("link", _link);
this.state = 89;
if (true) break;

case 89:
//C
this.state = 84;
if (index16 < groupLen16) {
this.state = 9;
_link = BA.ObjectToString(group16.runMethod(false,"Get",index16));Debug.locals.put("link", _link);}
if (true) break;

case 90:
//C
this.state = 89;
index16++;
Debug.locals.put("link", _link);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 226;BA.debugLine="camera = link";
Debug.ShouldStop(2);
_camera = _link;Debug.locals.put("camera", _camera);
 BA.debugLineNum = 228;BA.debugLine="If FirstRun Then";
Debug.ShouldStop(8);
if (true) break;

case 10:
//if
this.state = 31;
if (_firstrun.<Boolean>get().booleanValue()) { 
this.state = 12;
}else {
this.state = 22;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 229;BA.debugLine="If camera = \"347574\" Then";
Debug.ShouldStop(16);
if (true) break;

case 13:
//if
this.state = 20;
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("347574"))) { 
this.state = 15;
}else 
{ BA.debugLineNum = 233;BA.debugLine="Else If camera = \"236967\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("236967"))) { 
this.state = 17;
}else 
{ BA.debugLineNum = 237;BA.debugLine="Else If camera = \"226821\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("226821"))) { 
this.state = 19;
}}}
if (true) break;

case 15:
//C
this.state = 20;
 BA.debugLineNum = 230;BA.debugLine="lblStatus.Text = \"Retrieving Driveway thumbna";
Debug.ShouldStop(32);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Retrieving Driveway thumbnail..."));
 BA.debugLineNum = 231;BA.debugLine="iv = ivDriveway";
Debug.ShouldStop(64);
_iv = parent._ivdriveway;Debug.locals.put("iv", _iv);
 BA.debugLineNum = 232;BA.debugLine="clv = clvDriveway";
Debug.ShouldStop(128);
_clv = parent._clvdriveway;Debug.locals.put("clv", _clv);
 if (true) break;

case 17:
//C
this.state = 20;
 BA.debugLineNum = 234;BA.debugLine="lblStatus.Text = \"Retrieving Front Door thumb";
Debug.ShouldStop(512);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Retrieving Front Door thumbnail..."));
 BA.debugLineNum = 235;BA.debugLine="iv = ivFrontDoor";
Debug.ShouldStop(1024);
_iv = parent._ivfrontdoor;Debug.locals.put("iv", _iv);
 BA.debugLineNum = 236;BA.debugLine="clv = clvFrontDoor";
Debug.ShouldStop(2048);
_clv = parent._clvfrontdoor;Debug.locals.put("clv", _clv);
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 238;BA.debugLine="lblStatus.Text = \"Retrieving Side Yard thumbn";
Debug.ShouldStop(8192);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Retrieving Side Yard thumbnail..."));
 BA.debugLineNum = 239;BA.debugLine="iv = ivSideYard";
Debug.ShouldStop(16384);
_iv = parent._ivsideyard;Debug.locals.put("iv", _iv);
 BA.debugLineNum = 240;BA.debugLine="clv = clvSideYard";
Debug.ShouldStop(32768);
_clv = parent._clvsideyard;Debug.locals.put("clv", _clv);
 if (true) break;

case 20:
//C
this.state = 31;
;
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 243;BA.debugLine="If camera = \"347574\" Then";
Debug.ShouldStop(262144);
if (true) break;

case 23:
//if
this.state = 30;
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("347574"))) { 
this.state = 25;
}else 
{ BA.debugLineNum = 248;BA.debugLine="Else If camera = \"236967\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("236967"))) { 
this.state = 27;
}else 
{ BA.debugLineNum = 253;BA.debugLine="Else If camera = \"226821\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("226821"))) { 
this.state = 29;
}}}
if (true) break;

case 25:
//C
this.state = 30;
 BA.debugLineNum = 244;BA.debugLine="lblStatus.Text = \"Capturing a new Driveway th";
Debug.ShouldStop(524288);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Capturing a new Driveway thumbnail..."));
 BA.debugLineNum = 245;BA.debugLine="iv = ivDriveway";
Debug.ShouldStop(1048576);
_iv = parent._ivdriveway;Debug.locals.put("iv", _iv);
 BA.debugLineNum = 246;BA.debugLine="clv = clvDriveway";
Debug.ShouldStop(2097152);
_clv = parent._clvdriveway;Debug.locals.put("clv", _clv);
 BA.debugLineNum = 247;BA.debugLine="attempts = 10";
Debug.ShouldStop(4194304);
_attempts = BA.numberCast(int.class, 10);Debug.locals.put("attempts", _attempts);
 if (true) break;

case 27:
//C
this.state = 30;
 BA.debugLineNum = 249;BA.debugLine="lblStatus.Text = \"Capturing a new Front Door";
Debug.ShouldStop(16777216);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Capturing a new Front Door thumbnail..."));
 BA.debugLineNum = 250;BA.debugLine="iv = ivFrontDoor";
Debug.ShouldStop(33554432);
_iv = parent._ivfrontdoor;Debug.locals.put("iv", _iv);
 BA.debugLineNum = 251;BA.debugLine="clv = clvFrontDoor";
Debug.ShouldStop(67108864);
_clv = parent._clvfrontdoor;Debug.locals.put("clv", _clv);
 BA.debugLineNum = 252;BA.debugLine="attempts = 15";
Debug.ShouldStop(134217728);
_attempts = BA.numberCast(int.class, 15);Debug.locals.put("attempts", _attempts);
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 254;BA.debugLine="lblStatus.Text = \"Capturing a new Side Yard t";
Debug.ShouldStop(536870912);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Capturing a new Side Yard thumbnail..."));
 BA.debugLineNum = 255;BA.debugLine="iv = ivSideYard";
Debug.ShouldStop(1073741824);
_iv = parent._ivsideyard;Debug.locals.put("iv", _iv);
 BA.debugLineNum = 256;BA.debugLine="clv = clvSideYard";
Debug.ShouldStop(-2147483648);
_clv = parent._clvsideyard;Debug.locals.put("clv", _clv);
 BA.debugLineNum = 257;BA.debugLine="attempts = 15";
Debug.ShouldStop(1);
_attempts = BA.numberCast(int.class, 15);Debug.locals.put("attempts", _attempts);
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;
;
 BA.debugLineNum = 261;BA.debugLine="If FirstRun Then";
Debug.ShouldStop(16);

case 31:
//if
this.state = 83;
if (_firstrun.<Boolean>get().booleanValue()) { 
this.state = 33;
}else {
this.state = 35;
}if (true) break;

case 33:
//C
this.state = 83;
 BA.debugLineNum = 262;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedi";
Debug.ShouldStop(32);
_restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/camera/"),_camera));
 BA.debugLineNum = 263;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"),BA.numberCast(int.class, 1000));
this.state = 91;
return;
case 91:
//C
this.state = 83;
;
 BA.debugLineNum = 265;BA.debugLine="GetCameraInfo(response,clv)";
Debug.ShouldStop(256);
_getcamerainfo(parent._response,_clv);
 BA.debugLineNum = 266;BA.debugLine="DownloadImage(\"https://rest-\" & userRegion &\".";
Debug.ShouldStop(512);
_downloadimage(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/"),parent._camerathumbnail,RemoteObject.createImmutable(".jpg")),_iv,_camera);
 if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 268;BA.debugLine="RESTPost(\"https://rest-\" & userRegion &\".immed";
Debug.ShouldStop(2048);
_restpost(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/camera/"),_camera,RemoteObject.createImmutable("/thumbnail")));
 BA.debugLineNum = 269;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"),BA.numberCast(int.class, 1000));
this.state = 92;
return;
case 92:
//C
this.state = 36;
;
 BA.debugLineNum = 271;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.";
Debug.ShouldStop(16384);
if (true) break;

case 36:
//if
this.state = 82;
if (RemoteObject.solveBoolean(".",parent._response.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR: ")))) || RemoteObject.solveBoolean(".",parent._response.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("System is busy, please wait"))))) { 
this.state = 38;
}else {
this.state = 40;
}if (true) break;

case 38:
//C
this.state = 82;
 BA.debugLineNum = 272;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(32768);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 273;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(65536);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 274;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(131072);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 275;BA.debugLine="Return";
Debug.ShouldStop(262144);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 277;BA.debugLine="GetCommandID(response)";
Debug.ShouldStop(1048576);
_getcommandid(parent._response);
 BA.debugLineNum = 278;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immed";
Debug.ShouldStop(2097152);
_restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/command/"),parent._commandid));
 BA.debugLineNum = 279;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"),BA.numberCast(int.class, 1000));
this.state = 93;
return;
case 93:
//C
this.state = 41;
;
 BA.debugLineNum = 281;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response";
Debug.ShouldStop(16777216);
if (true) break;

case 41:
//if
this.state = 81;
if (RemoteObject.solveBoolean(".",parent._response.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR: ")))) || RemoteObject.solveBoolean(".",parent._response.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("System is busy, please wait"))))) { 
this.state = 43;
}else {
this.state = 45;
}if (true) break;

case 43:
//C
this.state = 81;
 BA.debugLineNum = 282;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(33554432);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 283;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(67108864);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 284;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(134217728);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 285;BA.debugLine="Return";
Debug.ShouldStop(268435456);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 287;BA.debugLine="For i = 1 To attempts";
Debug.ShouldStop(1073741824);
if (true) break;

case 46:
//for
this.state = 67;
step73 = 1;
limit73 = _attempts.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 288;BA.debugLine="GetCommandStatus(response)";
Debug.ShouldStop(-2147483648);
_getcommandstatus(parent._response);
 BA.debugLineNum = 289;BA.debugLine="If commandComplete Then";
Debug.ShouldStop(1);
if (true) break;

case 49:
//if
this.state = 62;
if (parent._commandcomplete.<Boolean>get().booleanValue()) { 
this.state = 51;
}else {
this.state = 53;
}if (true) break;

case 51:
//C
this.state = 62;
 BA.debugLineNum = 290;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".im";
Debug.ShouldStop(2);
_restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/camera/"),_camera));
 BA.debugLineNum = 291;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"),BA.numberCast(int.class, 1000));
this.state = 96;
return;
case 96:
//C
this.state = 62;
;
 BA.debugLineNum = 293;BA.debugLine="GetCameraInfo(response,clv)";
Debug.ShouldStop(16);
_getcamerainfo(parent._response,_clv);
 BA.debugLineNum = 294;BA.debugLine="DownloadImage(\"https://rest-\" & userRegion";
Debug.ShouldStop(32);
_downloadimage(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/"),parent._camerathumbnail,RemoteObject.createImmutable(".jpg")),_iv,_camera);
 BA.debugLineNum = 296;BA.debugLine="Exit";
Debug.ShouldStop(128);
this.state = 67;
if (true) break;
 if (true) break;

case 53:
//C
this.state = 54;
 BA.debugLineNum = 298;BA.debugLine="If camera = \"347574\" Then";
Debug.ShouldStop(512);
if (true) break;

case 54:
//if
this.state = 61;
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("347574"))) { 
this.state = 56;
}else 
{ BA.debugLineNum = 300;BA.debugLine="Else If camera = \"236967\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("236967"))) { 
this.state = 58;
}else 
{ BA.debugLineNum = 302;BA.debugLine="Else If camera = \"226821\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("226821"))) { 
this.state = 60;
}}}
if (true) break;

case 56:
//C
this.state = 61;
 BA.debugLineNum = 299;BA.debugLine="lblStatus.Text = \"Awaiting for the Drivew";
Debug.ShouldStop(1024);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Awaiting for the Driveway thumbnail... "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable("/"),_attempts));
 if (true) break;

case 58:
//C
this.state = 61;
 BA.debugLineNum = 301;BA.debugLine="lblStatus.Text = \"Awaiting for the Front";
Debug.ShouldStop(4096);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Awaiting for the Front Door thumbnail...  "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable("/"),_attempts));
 if (true) break;

case 60:
//C
this.state = 61;
 BA.debugLineNum = 303;BA.debugLine="lblStatus.Text = \"Awaiting for the Side Y";
Debug.ShouldStop(16384);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Awaiting for the Side Yard thumbnail... "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable("/"),_attempts));
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
 BA.debugLineNum = 306;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".imm";
Debug.ShouldStop(131072);
_restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/command/"),parent._commandid));
 BA.debugLineNum = 307;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"),BA.numberCast(int.class, 1000));
this.state = 97;
return;
case 97:
//C
this.state = 63;
;
 BA.debugLineNum = 308;BA.debugLine="If response.StartsWith(\"ERROR: \") Or respon";
Debug.ShouldStop(524288);
if (true) break;

case 63:
//if
this.state = 66;
if (RemoteObject.solveBoolean(".",parent._response.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR: ")))) || RemoteObject.solveBoolean(".",parent._response.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("System is busy, please wait"))))) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 309;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(1048576);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 310;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(2097152);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 311;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(4194304);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 312;BA.debugLine="Return";
Debug.ShouldStop(8388608);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;

case 66:
//C
this.state = 95;
;
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 315;BA.debugLine="If commandComplete = False Then";
Debug.ShouldStop(67108864);

case 67:
//if
this.state = 80;
if (RemoteObject.solveBoolean("=",parent._commandcomplete,parent.__c.getField(true,"False"))) { 
this.state = 69;
}else {
this.state = 79;
}if (true) break;

case 69:
//C
this.state = 70;
 BA.debugLineNum = 316;BA.debugLine="If camera = \"347574\" Then";
Debug.ShouldStop(134217728);
if (true) break;

case 70:
//if
this.state = 77;
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("347574"))) { 
this.state = 72;
}else 
{ BA.debugLineNum = 318;BA.debugLine="Else If camera = \"236967\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("236967"))) { 
this.state = 74;
}else 
{ BA.debugLineNum = 320;BA.debugLine="Else If camera = \"226821\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("226821"))) { 
this.state = 76;
}}}
if (true) break;

case 72:
//C
this.state = 77;
 BA.debugLineNum = 317;BA.debugLine="lblStatus.Text = \"Failed to retrieve Drive";
Debug.ShouldStop(268435456);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Failed to retrieve Driveway thumbnail..."));
 if (true) break;

case 74:
//C
this.state = 77;
 BA.debugLineNum = 319;BA.debugLine="lblStatus.Text = \"Failed to retrieve Front";
Debug.ShouldStop(1073741824);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Failed to retrieve Front Door thumbnail..."));
 if (true) break;

case 76:
//C
this.state = 77;
 BA.debugLineNum = 321;BA.debugLine="lblStatus.Text = \"Failed to retrieve Side";
Debug.ShouldStop(1);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Failed to retrieve Side Yard thumbnail..."));
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
Debug.locals.put("link", _link);
;
 BA.debugLineNum = 333;BA.debugLine="lblStatus.Text = \"Ready\"";
Debug.ShouldStop(4096);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Ready"));
 Debug.CheckDeviceExceptions();
if (true) break;

case 86:
//C
this.state = 87;
this.catchState = 0;
 BA.debugLineNum = 335;BA.debugLine="response = \"ERROR: \" & LastException";
Debug.ShouldStop(16384);
parent._response = RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),parent.__c.runMethod(false,"LastException",main.ba));
 BA.debugLineNum = 336;BA.debugLine="Log(\"RefreshCamera LastException: \" & LastExcept";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("RefreshCamera LastException: "),parent.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 337;BA.debugLine="fx.msgbox(MainForm,\"RefreshCamera LastException:";
Debug.ShouldStop(65536);
parent._fx.runVoidMethodAndSync ("Msgbox",(Object)(parent._mainform),(Object)(RemoteObject.concat(RemoteObject.createImmutable("RefreshCamera LastException: "),parent.__c.runMethod(false,"LastException",main.ba))),(Object)(parent._mainform.runMethod(true,"getTitle")));
 if (true) break;
if (true) break;

case 87:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 339;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(262144);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 340;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(524288);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 341;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(1048576);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 342;BA.debugLine="End Sub";
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
public static void  _requestauthtoken() throws Exception{
try {
		Debug.PushSubsStack("RequestAuthToken (main) ","main",0,main.ba,main.mostCurrent,147);
if (RapidSub.canDelegate("requestauthtoken")) { cloyd.blink.main.remoteMe.runUserSub(false, "main","requestauthtoken"); return;}
ResumableSub_RequestAuthToken rsub = new ResumableSub_RequestAuthToken(null);
rsub.resume(null, null);
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

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RequestAuthToken (main) ","main",0,main.ba,main.mostCurrent,147);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 153;BA.debugLine="Try";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 154;BA.debugLine="lblStatus.Text = \"Authenticating...\"";
Debug.ShouldStop(33554432);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Authenticating..."));
 BA.debugLineNum = 155;BA.debugLine="Dim jobLogin As HttpJob";
Debug.ShouldStop(67108864);
_joblogin = RemoteObject.createNew ("cloyd.blink.httpjob");Debug.locals.put("jobLogin", _joblogin);
 BA.debugLineNum = 156;BA.debugLine="jobLogin.Initialize(\"\", Me)";
Debug.ShouldStop(134217728);
_joblogin.runClassMethod (cloyd.blink.httpjob.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 157;BA.debugLine="jobLogin.PostString(\"https://rest.prod.immedia-s";
Debug.ShouldStop(268435456);
_joblogin.runClassMethod (cloyd.blink.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("https://rest.prod.immedia-semi.com/login")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("email="),parent._emailaddress,RemoteObject.createImmutable("&password="),parent._password)));
 BA.debugLineNum = 158;BA.debugLine="jobLogin.GetRequest.SetContentType(\"application/";
Debug.ShouldStop(536870912);
_joblogin.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/x-www-form-urlencoded")));
 BA.debugLineNum = 159;BA.debugLine="Wait For (jobLogin) JobDone(jobLogin As HttpJob)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","jobdone", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "requestauthtoken"), (_joblogin));
this.state = 25;
return;
case 25:
//C
this.state = 4;
_joblogin = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("jobLogin", _joblogin);
;
 BA.debugLineNum = 160;BA.debugLine="If jobLogin.Success Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 4:
//if
this.state = 21;
if (_joblogin.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 20;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 161;BA.debugLine="lblStatus.Text = \"Successfully logged in to the";
Debug.ShouldStop(1);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Successfully logged in to the Blink server..."));
 BA.debugLineNum = 163;BA.debugLine="GetAuthInfo(jobLogin.GetString)";
Debug.ShouldStop(4);
_getauthinfo(_joblogin.runClassMethod (cloyd.blink.httpjob.class, "_getstring" /*RemoteObject*/ ));
 BA.debugLineNum = 165;BA.debugLine="RESTGet(\"https://rest-\" & userRegion & \".immedi";
Debug.ShouldStop(16);
_restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/user")));
 BA.debugLineNum = 166;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "requestauthtoken"),BA.numberCast(int.class, 1000));
this.state = 26;
return;
case 26:
//C
this.state = 7;
;
 BA.debugLineNum = 168;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.C";
Debug.ShouldStop(128);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean(".",parent._response.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR: ")))) || RemoteObject.solveBoolean(".",parent._response.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("System is busy, please wait"))))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 169;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(256);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 170;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(512);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 171;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(1024);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 172;BA.debugLine="Return";
Debug.ShouldStop(2048);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 174;BA.debugLine="lblStatus.Text = \"AuthToken acquired...\"";
Debug.ShouldStop(8192);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("AuthToken acquired..."));
 BA.debugLineNum = 175;BA.debugLine="GetUserInfo(response)";
Debug.ShouldStop(16384);
_getuserinfo(parent._response);
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 178;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia";
Debug.ShouldStop(131072);
_restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/api/v1/camera/usage")));
 BA.debugLineNum = 179;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "requestauthtoken"),BA.numberCast(int.class, 1000));
this.state = 27;
return;
case 27:
//C
this.state = 13;
;
 BA.debugLineNum = 181;BA.debugLine="If response.StartsWith(\"ERROR: \") Or response.C";
Debug.ShouldStop(1048576);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean(".",parent._response.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR: ")))) || RemoteObject.solveBoolean(".",parent._response.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("System is busy, please wait"))))) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 BA.debugLineNum = 182;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(2097152);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 183;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(4194304);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 184;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(8388608);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 185;BA.debugLine="Return";
Debug.ShouldStop(16777216);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 187;BA.debugLine="GetAllCameras(response)";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 190;BA.debugLine="lblStatus.Text = GetRESTError(jobLogin.ErrorMes";
Debug.ShouldStop(536870912);
parent._lblstatus.runMethod(true,"setText",_getresterror(_joblogin.getField(true,"_errormessage" /*RemoteObject*/ )));
 BA.debugLineNum = 191;BA.debugLine="Log(\"RequestAuthToken error: \" & jobLogin.Error";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("RequestAuthToken error: "),_joblogin.getField(true,"_errormessage" /*RemoteObject*/ ))));
 BA.debugLineNum = 192;BA.debugLine="btnDriveway.Enabled = True";
Debug.ShouldStop(-2147483648);
parent._btndriveway.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 193;BA.debugLine="btnRefresh.Enabled = True";
Debug.ShouldStop(1);
parent._btnrefresh.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 194;BA.debugLine="btnActivity.Enabled = True";
Debug.ShouldStop(2);
parent._btnactivity.runMethod(true,"setEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 195;BA.debugLine="Return";
Debug.ShouldStop(4);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;

case 21:
//C
this.state = 24;
;
 BA.debugLineNum = 197;BA.debugLine="jobLogin.Release";
Debug.ShouldStop(16);
_joblogin.runClassMethod (cloyd.blink.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 198;BA.debugLine="RefreshCameras(True)";
Debug.ShouldStop(32);
_refreshcameras(parent.__c.getField(true,"True"));
 Debug.CheckDeviceExceptions();
if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
 BA.debugLineNum = 200;BA.debugLine="fx.msgbox(MainForm,\"RequestAuthToken LastExcepti";
Debug.ShouldStop(128);
parent._fx.runVoidMethodAndSync ("Msgbox",(Object)(parent._mainform),(Object)(RemoteObject.concat(RemoteObject.createImmutable("RequestAuthToken LastException: "),parent.__c.runMethod(false,"LastException",main.ba))),(Object)(parent._mainform.runMethod(true,"getTitle")));
 BA.debugLineNum = 201;BA.debugLine="Log(\"RequestAuthToken LastException: \" & LastExc";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("RequestAuthToken LastException: "),parent.__c.runMethod(false,"LastException",main.ba))));
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 203;BA.debugLine="End Sub";
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
public static RemoteObject  _restget(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("RESTGet (main) ","main",0,main.ba,main.mostCurrent,344);
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
		Debug.PushSubsStack("RESTGet (main) ","main",0,main.ba,main.mostCurrent,344);
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
 BA.debugLineNum = 345;BA.debugLine="Try";
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
 BA.debugLineNum = 346;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(33554432);
_j = RemoteObject.createNew ("cloyd.blink.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 347;BA.debugLine="response = \"\"";
Debug.ShouldStop(67108864);
parent._response = BA.ObjectToString("");
 BA.debugLineNum = 348;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no";
Debug.ShouldStop(134217728);
_j.runClassMethod (cloyd.blink.httpjob.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 349;BA.debugLine="j.Download(url)";
Debug.ShouldStop(268435456);
_j.runClassMethod (cloyd.blink.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 350;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
Debug.ShouldStop(536870912);
_j.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("TOKEN_AUTH")),(Object)(parent._authtoken));
 BA.debugLineNum = 351;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","jobdone", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "restget"), (_j));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 352;BA.debugLine="If j.Success Then";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 353;BA.debugLine="response = j.GetString";
Debug.ShouldStop(1);
parent._response = _j.runClassMethod (cloyd.blink.httpjob.class, "_getstring" /*RemoteObject*/ );
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 355;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
Debug.ShouldStop(4);
parent._response = RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));
 BA.debugLineNum = 356;BA.debugLine="lblStatus.Text = GetRESTError(j.ErrorMessage)";
Debug.ShouldStop(8);
parent._lblstatus.runMethod(true,"setText",_getresterror(_j.getField(true,"_errormessage" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 358;BA.debugLine="If response.Contains(\"System is busy, please wai";
Debug.ShouldStop(32);

case 9:
//if
this.state = 12;
if (parent._response.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("System is busy, please wait"))).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 359;BA.debugLine="lblStatus.Text = \"System is busy, please wait\"";
Debug.ShouldStop(64);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("System is busy, please wait"));
 if (true) break;

case 12:
//C
this.state = 15;
;
 BA.debugLineNum = 361;BA.debugLine="j.Release";
Debug.ShouldStop(256);
_j.runClassMethod (cloyd.blink.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 BA.debugLineNum = 363;BA.debugLine="response = \"ERROR: \" & LastException";
Debug.ShouldStop(1024);
parent._response = RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),parent.__c.runMethod(false,"LastException",main.ba));
 BA.debugLineNum = 364;BA.debugLine="Log(\"RESTGet LastException: \" & LastException)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("RESTGet LastException: "),parent.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 365;BA.debugLine="fx.msgbox(MainForm,\"RESTGet LastException: \" & L";
Debug.ShouldStop(4096);
parent._fx.runVoidMethodAndSync ("Msgbox",(Object)(parent._mainform),(Object)(RemoteObject.concat(RemoteObject.createImmutable("RESTGet LastException: "),parent.__c.runMethod(false,"LastException",main.ba))),(Object)(parent._mainform.runMethod(true,"getTitle")));
 if (true) break;
if (true) break;

case 15:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 367;BA.debugLine="Log(\"URL: \" & url)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("URL: "),_url)));
 BA.debugLineNum = 368;BA.debugLine="Log(\"Response: \" & response)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response: "),parent._response)));
 BA.debugLineNum = 369;BA.debugLine="Return(response)";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,((parent._response)));return;};
 BA.debugLineNum = 370;BA.debugLine="End Sub";
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
public static RemoteObject  _restpost(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("RESTPost (main) ","main",0,main.ba,main.mostCurrent,372);
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
		Debug.PushSubsStack("RESTPost (main) ","main",0,main.ba,main.mostCurrent,372);
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
 BA.debugLineNum = 373;BA.debugLine="Try";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 374;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(2097152);
_j = RemoteObject.createNew ("cloyd.blink.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 375;BA.debugLine="response = \"\"";
Debug.ShouldStop(4194304);
parent._response = BA.ObjectToString("");
 BA.debugLineNum = 376;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no";
Debug.ShouldStop(8388608);
_j.runClassMethod (cloyd.blink.httpjob.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 377;BA.debugLine="j.PostString(url,\"\")";
Debug.ShouldStop(16777216);
_j.runClassMethod (cloyd.blink.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_url),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 378;BA.debugLine="j.GetRequest.SetContentType(\"application/x-www-f";
Debug.ShouldStop(33554432);
_j.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/x-www-form-urlencoded")));
 BA.debugLineNum = 379;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
Debug.ShouldStop(67108864);
_j.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("TOKEN_AUTH")),(Object)(parent._authtoken));
 BA.debugLineNum = 380;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","jobdone", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "restpost"), (_j));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 381;BA.debugLine="If j.Success Then";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 382;BA.debugLine="response = j.GetString";
Debug.ShouldStop(536870912);
parent._response = _j.runClassMethod (cloyd.blink.httpjob.class, "_getstring" /*RemoteObject*/ );
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 384;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
Debug.ShouldStop(-2147483648);
parent._response = RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));
 BA.debugLineNum = 385;BA.debugLine="lblStatus.Text = GetRESTError(j.ErrorMessage)";
Debug.ShouldStop(1);
parent._lblstatus.runMethod(true,"setText",_getresterror(_j.getField(true,"_errormessage" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 387;BA.debugLine="If response.Contains(\"System is busy, please wai";
Debug.ShouldStop(4);

case 9:
//if
this.state = 12;
if (parent._response.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("System is busy, please wait"))).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 388;BA.debugLine="lblStatus.Text = \"System is busy, please wait\"";
Debug.ShouldStop(8);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("System is busy, please wait"));
 if (true) break;

case 12:
//C
this.state = 15;
;
 BA.debugLineNum = 390;BA.debugLine="j.Release";
Debug.ShouldStop(32);
_j.runClassMethod (cloyd.blink.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 BA.debugLineNum = 392;BA.debugLine="response = \"ERROR: \" & LastException";
Debug.ShouldStop(128);
parent._response = RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),parent.__c.runMethod(false,"LastException",main.ba));
 BA.debugLineNum = 393;BA.debugLine="Log(\"RESTPost LastException: \" & LastException)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("RESTPost LastException: "),parent.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 394;BA.debugLine="fx.msgbox(MainForm,\"RESTPost LastException: \" &";
Debug.ShouldStop(512);
parent._fx.runVoidMethodAndSync ("Msgbox",(Object)(parent._mainform),(Object)(RemoteObject.concat(RemoteObject.createImmutable("RESTPost LastException: "),parent.__c.runMethod(false,"LastException",main.ba))),(Object)(parent._mainform.runMethod(true,"getTitle")));
 if (true) break;
if (true) break;

case 15:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 396;BA.debugLine="Log(\"URL: \" & url)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("URL: "),_url)));
 BA.debugLineNum = 397;BA.debugLine="Log(\"Response: \" & response)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response: "),parent._response)));
 BA.debugLineNum = 398;BA.debugLine="Return(response)";
Debug.ShouldStop(8192);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,((parent._response)));return;};
 BA.debugLineNum = 399;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("SetAvg (main) ","main",0,main.ba,main.mostCurrent,1180);
if (RapidSub.canDelegate("setavg")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","setavg", _bc, _x, _y, _clrs, _temp);}
RemoteObject _c = RemoteObject.declareNull("b4j.example.bitmapcreator._argbcolor");
Debug.locals.put("bc", _bc);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
Debug.locals.put("clrs", _clrs);
Debug.locals.put("temp", _temp);
 BA.debugLineNum = 1180;BA.debugLine="Private Sub SetAvg(bc As BitmapCreator, x As Int,";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1181;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 1182;BA.debugLine="temp.Initialize";
Debug.ShouldStop(536870912);
_temp.runVoidMethod ("Initialize");
 BA.debugLineNum = 1183;BA.debugLine="For Each c As ARGBColor In clrs";
Debug.ShouldStop(1073741824);
{
final RemoteObject group3 = _clrs;
final int groupLen3 = group3.getField(true,"length").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_c = group3.getArrayElement(false,RemoteObject.createImmutable(index3));Debug.locals.put("c", _c);
Debug.locals.put("c", _c);
 BA.debugLineNum = 1184;BA.debugLine="temp.r = temp.r + c.r";
Debug.ShouldStop(-2147483648);
_temp.setField ("r",RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"r"),_c.getField(true,"r")}, "+",1, 1));
 BA.debugLineNum = 1185;BA.debugLine="temp.g = temp.g + c.g";
Debug.ShouldStop(1);
_temp.setField ("g",RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"g"),_c.getField(true,"g")}, "+",1, 1));
 BA.debugLineNum = 1186;BA.debugLine="temp.b = temp.b + c.b";
Debug.ShouldStop(2);
_temp.setField ("b",RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"b"),_c.getField(true,"b")}, "+",1, 1));
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 1188;BA.debugLine="temp.a = 255";
Debug.ShouldStop(8);
_temp.setField ("a",BA.numberCast(int.class, 255));
 BA.debugLineNum = 1189;BA.debugLine="temp.r = temp.r / clrs.Length";
Debug.ShouldStop(16);
_temp.setField ("r",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"r"),_clrs.getField(true,"length")}, "/",0, 0)));
 BA.debugLineNum = 1190;BA.debugLine="temp.g = temp.g / clrs.Length";
Debug.ShouldStop(32);
_temp.setField ("g",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"g"),_clrs.getField(true,"length")}, "/",0, 0)));
 BA.debugLineNum = 1191;BA.debugLine="temp.b = temp.b / clrs.Length";
Debug.ShouldStop(64);
_temp.setField ("b",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"b"),_clrs.getField(true,"length")}, "/",0, 0)));
 BA.debugLineNum = 1192;BA.debugLine="bc.SetARGB(x, y, temp)";
Debug.ShouldStop(128);
_bc.runVoidMethod ("_setargb",(Object)(_x),(Object)(_y),(Object)(_temp));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e14.toString()); BA.debugLineNum = 1194;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 1195;BA.debugLine="fx.msgbox(MainForm,\"SetAvg LastException: \" & La";
Debug.ShouldStop(1024);
main._fx.runVoidMethodAndSync ("Msgbox",(Object)(main._mainform),(Object)(RemoteObject.concat(RemoteObject.createImmutable("SetAvg LastException: "),main.__c.runMethod(false,"LastException",main.ba))),(Object)(main._mainform.runMethod(true,"getTitle")));
 };
 BA.debugLineNum = 1197;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}