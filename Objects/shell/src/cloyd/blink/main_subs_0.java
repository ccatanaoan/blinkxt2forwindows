package cloyd.blink;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (main) ","main",0,main.ba,main.mostCurrent,111);
if (RapidSub.canDelegate("application_error")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 111;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="Return True";
Debug.ShouldStop(32768);
Debug.CheckDeviceExceptions();if (true) return main.__c.getField(true,"True");
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,47);
if (RapidSub.canDelegate("appstart")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
RemoteObject _skintemp = RemoteObject.createImmutable("");
RemoteObject _skindefault = RemoteObject.createImmutable("");
RemoteObject _obj = RemoteObject.declareNull("anywheresoftware.b4j.agraham.reflection.Reflection");
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 47;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 49;BA.debugLine="Dim skinTemp As String";
Debug.ShouldStop(65536);
_skintemp = RemoteObject.createImmutable("");Debug.locals.put("skinTemp", _skintemp);
 BA.debugLineNum = 50;BA.debugLine="Dim skinDefault As String";
Debug.ShouldStop(131072);
_skindefault = RemoteObject.createImmutable("");Debug.locals.put("skinDefault", _skindefault);
 BA.debugLineNum = 52;BA.debugLine="If File.Exists(File.DirApp, \"skin.ini\") Then";
Debug.ShouldStop(524288);
if (main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("skin.ini"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 53;BA.debugLine="skinTemp = File.ReadString(File.DirApp, \"skin.i";
Debug.ShouldStop(1048576);
_skintemp = main.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("skin.ini")));Debug.locals.put("skinTemp", _skintemp);
 }else {
 BA.debugLineNum = 55;BA.debugLine="File.WriteString(File.DirApp, \"skin.ini\", \"vdSk";
Debug.ShouldStop(4194304);
main.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("skin.ini")),(Object)(RemoteObject.createImmutable("vdSk03")));
 BA.debugLineNum = 56;BA.debugLine="skinTemp = \"vdSk03\"";
Debug.ShouldStop(8388608);
_skintemp = BA.ObjectToString("vdSk03");Debug.locals.put("skinTemp", _skintemp);
 };
 BA.debugLineNum = 59;BA.debugLine="If skinTemp = \"\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString(""))) { 
 BA.debugLineNum = 60;BA.debugLine="skinDefault = \"vdSk03\"";
Debug.ShouldStop(134217728);
_skindefault = BA.ObjectToString("vdSk03");Debug.locals.put("skinDefault", _skindefault);
 }else {
 BA.debugLineNum = 62;BA.debugLine="If skinTemp = \"vdSk01\" Or skinTemp = \"vdSk02\" O";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString("vdSk01")) || RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString("vdSk02")) || RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString("vdSk03")) || RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString("vdSk04")) || RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString("vdSk05")) || RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString("vdSk06"))) { 
 BA.debugLineNum = 63;BA.debugLine="skinDefault = skinTemp";
Debug.ShouldStop(1073741824);
_skindefault = _skintemp;Debug.locals.put("skinDefault", _skindefault);
 }else {
 BA.debugLineNum = 65;BA.debugLine="skinDefault = \"vdSk03\"";
Debug.ShouldStop(1);
_skindefault = BA.ObjectToString("vdSk03");Debug.locals.put("skinDefault", _skindefault);
 };
 };
 BA.debugLineNum = 69;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(16);
main._mainform = _form1;
 BA.debugLineNum = 70;BA.debugLine="MainForm.SetFormStyle(\"TRANSPARENT\")";
Debug.ShouldStop(32);
main._mainform.runVoidMethod ("SetFormStyle",(Object)(RemoteObject.createImmutable("TRANSPARENT")));
 BA.debugLineNum = 71;BA.debugLine="MainForm.RootPane.LoadLayout(skinDefault) 'Load";
Debug.ShouldStop(64);
main._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(_skindefault));
 BA.debugLineNum = 72;BA.debugLine="AtualSkin = skinDefault";
Debug.ShouldStop(128);
main._atualskin = _skindefault;
 BA.debugLineNum = 73;BA.debugLine="MainForm.BackColor = fx.Colors.Transparent";
Debug.ShouldStop(256);
main._mainform.runMethod(false,"setBackColor",main._fx.getField(false,"Colors").getField(false,"Transparent"));
 BA.debugLineNum = 74;BA.debugLine="MainForm.RootPane.Style = \"-fx-background-color:";
Debug.ShouldStop(512);
main._mainform.runMethod(false,"getRootPane").runMethod(true,"setStyle",BA.ObjectToString("-fx-background-color:transparent;-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 1.0) , 15,0, 0.0, 0.0);"));
 BA.debugLineNum = 75;BA.debugLine="MainForm.Resizable = True";
Debug.ShouldStop(1024);
main._mainform.runMethod(true,"setResizable",main.__c.getField(true,"True"));
 BA.debugLineNum = 76;BA.debugLine="MainForm.Icon = fx.LoadImage(File.DirAssets, \"ho";
Debug.ShouldStop(2048);
main._mainform.runMethod(false,"setIcon",(main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("home.png"))).getObject()));
 BA.debugLineNum = 77;BA.debugLine="MainForm.Title = \"Catanaoan Blink XT2 Cameras v1";
Debug.ShouldStop(4096);
main._mainform.runMethod(true,"setTitle",BA.ObjectToString("Catanaoan Blink XT2 Cameras v1.0"));
 BA.debugLineNum = 78;BA.debugLine="lbTitle.MouseCursor = fx.Cursors.MOVE";
Debug.ShouldStop(8192);
main._lbtitle.runMethod(false,"setMouseCursor",main._fx.getField(false,"Cursors").getField(false,"MOVE"));
 BA.debugLineNum = 79;BA.debugLine="lbTitle.Text = \"Catanaoan Blink XT2 Cameras v1.0";
Debug.ShouldStop(16384);
main._lbtitle.runMethod(true,"setText",BA.ObjectToString("Catanaoan Blink XT2 Cameras v1.0"));
 BA.debugLineNum = 80;BA.debugLine="Dim Obj As Reflector";
Debug.ShouldStop(32768);
_obj = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 81;BA.debugLine="Obj.Target = ivClose";
Debug.ShouldStop(65536);
_obj.setField ("Target",(main._ivclose.getObject()));
 BA.debugLineNum = 82;BA.debugLine="Obj.AddEventHandler2(\"Close_Entered\", \"onMouseEn";
Debug.ShouldStop(131072);
_obj.runVoidMethod ("AddEventHandler2",main.ba,(Object)(BA.ObjectToString("Close_Entered")),(Object)(RemoteObject.createImmutable("onMouseEnteredProperty")));
 BA.debugLineNum = 83;BA.debugLine="Obj.AddEventHandler2(\"Close_Exited\", \"onMouseExi";
Debug.ShouldStop(262144);
_obj.runVoidMethod ("AddEventHandler2",main.ba,(Object)(BA.ObjectToString("Close_Exited")),(Object)(RemoteObject.createImmutable("onMouseExitedProperty")));
 BA.debugLineNum = 84;BA.debugLine="Dim Obj As Reflector";
Debug.ShouldStop(524288);
_obj = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 85;BA.debugLine="Obj.Target = ivMax";
Debug.ShouldStop(1048576);
_obj.setField ("Target",(main._ivmax.getObject()));
 BA.debugLineNum = 86;BA.debugLine="Obj.AddEventHandler2(\"Max_Entered\", \"onMouseEnte";
Debug.ShouldStop(2097152);
_obj.runVoidMethod ("AddEventHandler2",main.ba,(Object)(BA.ObjectToString("Max_Entered")),(Object)(RemoteObject.createImmutable("onMouseEnteredProperty")));
 BA.debugLineNum = 87;BA.debugLine="Obj.AddEventHandler2(\"Max_Exited\", \"onMouseExite";
Debug.ShouldStop(4194304);
_obj.runVoidMethod ("AddEventHandler2",main.ba,(Object)(BA.ObjectToString("Max_Exited")),(Object)(RemoteObject.createImmutable("onMouseExitedProperty")));
 BA.debugLineNum = 88;BA.debugLine="Dim Obj As Reflector";
Debug.ShouldStop(8388608);
_obj = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 89;BA.debugLine="Obj.Target = ivMin";
Debug.ShouldStop(16777216);
_obj.setField ("Target",(main._ivmin.getObject()));
 BA.debugLineNum = 90;BA.debugLine="Obj.AddEventHandler2(\"Min_Entered\", \"onMouseEnte";
Debug.ShouldStop(33554432);
_obj.runVoidMethod ("AddEventHandler2",main.ba,(Object)(BA.ObjectToString("Min_Entered")),(Object)(RemoteObject.createImmutable("onMouseEnteredProperty")));
 BA.debugLineNum = 91;BA.debugLine="Obj.AddEventHandler2(\"Min_Exited\", \"onMouseExite";
Debug.ShouldStop(67108864);
_obj.runVoidMethod ("AddEventHandler2",main.ba,(Object)(BA.ObjectToString("Min_Exited")),(Object)(RemoteObject.createImmutable("onMouseExitedProperty")));
 BA.debugLineNum = 92;BA.debugLine="imgInit = AtualSkin.SubString(2).ToLowerCase";
Debug.ShouldStop(134217728);
main._imginit = main._atualskin.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"toLowerCase");
 BA.debugLineNum = 93;BA.debugLine="Get_css";
Debug.ShouldStop(268435456);
_get_css();
 BA.debugLineNum = 98;BA.debugLine="MainForm.WindowLeft = CheckMonitor.MaxX	- MainFo";
Debug.ShouldStop(2);
main._mainform.runMethod(true,"setWindowLeft",RemoteObject.solve(new RemoteObject[] {_checkmonitor().runMethod(true,"getMaxX"),main._mainform.runMethod(true,"getWidth"),main.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "--",2, 0));
 BA.debugLineNum = 99;BA.debugLine="MainForm.WindowTop = CheckMonitor.MaxY - MainFor";
Debug.ShouldStop(4);
main._mainform.runMethod(true,"setWindowTop",RemoteObject.solve(new RemoteObject[] {_checkmonitor().runMethod(true,"getMaxY"),main._mainform.runMethod(true,"getHeight"),main.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "--",2, 0));
 BA.debugLineNum = 101;BA.debugLine="lblStatus.TextColor = fx.Colors.White";
Debug.ShouldStop(16);
main._lblstatus.runMethod(false,"setTextColor",main._fx.getField(false,"Colors").getField(false,"White"));
 BA.debugLineNum = 102;BA.debugLine="MainForm.Show";
Debug.ShouldStop(32);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 103;BA.debugLine="RequestAuthToken";
Debug.ShouldStop(64);
_requestauthtoken();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e50) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e50.toString()); BA.debugLineNum = 105;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Blur (main) ","main",0,main.ba,main.mostCurrent,971);
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
 BA.debugLineNum = 971;BA.debugLine="Private Sub Blur (bmp As B4XBitmap) As B4XBitmap";
Debug.ShouldStop(1024);
 BA.debugLineNum = 972;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 973;BA.debugLine="Dim bc As BitmapCreator";
Debug.ShouldStop(4096);
_bc = RemoteObject.createNew ("b4j.example.bitmapcreator");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 974;BA.debugLine="Dim ReduceScale As Int = 2";
Debug.ShouldStop(8192);
_reducescale = BA.numberCast(int.class, 2);Debug.locals.put("ReduceScale", _reducescale);Debug.locals.put("ReduceScale", _reducescale);
 BA.debugLineNum = 975;BA.debugLine="bc.Initialize(bmp.Width / ReduceScale / bmp.Scal";
Debug.ShouldStop(16384);
_bc.runVoidMethod ("_initialize",main.ba,(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),_reducescale,_bmp.runMethod(true,"getScale")}, "//",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getHeight"),_reducescale,_bmp.runMethod(true,"getScale")}, "//",0, 0))));
 BA.debugLineNum = 976;BA.debugLine="bc.CopyPixelsFromBitmap(bmp)";
Debug.ShouldStop(32768);
_bc.runVoidMethod ("_copypixelsfrombitmap",(Object)(_bmp));
 BA.debugLineNum = 977;BA.debugLine="Dim count As Int = 3";
Debug.ShouldStop(65536);
_count = BA.numberCast(int.class, 3);Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 978;BA.debugLine="Dim clrs(3) As ARGBColor";
Debug.ShouldStop(131072);
_clrs = RemoteObject.createNewArray ("b4j.example.bitmapcreator._argbcolor", new int[] {3}, new Object[]{});Debug.locals.put("clrs", _clrs);
 BA.debugLineNum = 979;BA.debugLine="Dim temp As ARGBColor";
Debug.ShouldStop(262144);
_temp = RemoteObject.createNew ("b4j.example.bitmapcreator._argbcolor");Debug.locals.put("temp", _temp);
 BA.debugLineNum = 980;BA.debugLine="Dim m As Int";
Debug.ShouldStop(524288);
_m = RemoteObject.createImmutable(0);Debug.locals.put("m", _m);
 BA.debugLineNum = 981;BA.debugLine="For steps = 1 To count";
Debug.ShouldStop(1048576);
{
final int step10 = 1;
final int limit10 = _count.<Integer>get().intValue();
_steps = 1 ;
for (;(step10 > 0 && _steps <= limit10) || (step10 < 0 && _steps >= limit10) ;_steps = ((int)(0 + _steps + step10))  ) {
Debug.locals.put("steps", _steps);
 BA.debugLineNum = 982;BA.debugLine="For y = 0 To bc.mHeight - 1";
Debug.ShouldStop(2097152);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mheight"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_y = 0 ;
for (;(step11 > 0 && _y <= limit11) || (step11 < 0 && _y >= limit11) ;_y = ((int)(0 + _y + step11))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 983;BA.debugLine="For x = 0 To 2";
Debug.ShouldStop(4194304);
{
final int step12 = 1;
final int limit12 = 2;
_x = 0 ;
for (;(step12 > 0 && _x <= limit12) || (step12 < 0 && _x >= limit12) ;_x = ((int)(0 + _x + step12))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 984;BA.debugLine="bc.GetARGB(x, y, clrs(x))";
Debug.ShouldStop(8388608);
_bc.runVoidMethod ("_getargb",(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(_clrs.getArrayElement(false,BA.numberCast(int.class, _x))));
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 986;BA.debugLine="SetAvg(bc, 1, y, clrs, temp)";
Debug.ShouldStop(33554432);
_setavg(_bc,BA.numberCast(int.class, 1),BA.numberCast(int.class, _y),_clrs,_temp);
 BA.debugLineNum = 987;BA.debugLine="m = 0";
Debug.ShouldStop(67108864);
_m = BA.numberCast(int.class, 0);Debug.locals.put("m", _m);
 BA.debugLineNum = 988;BA.debugLine="For x = 2 To bc.mWidth - 2";
Debug.ShouldStop(134217728);
{
final int step17 = 1;
final int limit17 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mwidth"),RemoteObject.createImmutable(2)}, "-",1, 1).<Integer>get().intValue();
_x = 2 ;
for (;(step17 > 0 && _x <= limit17) || (step17 < 0 && _x >= limit17) ;_x = ((int)(0 + _x + step17))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 989;BA.debugLine="bc.GetARGB(x + 1, y, clrs(m))";
Debug.ShouldStop(268435456);
_bc.runVoidMethod ("_getargb",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_x),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(BA.numberCast(int.class, _y)),(Object)(_clrs.getArrayElement(false,_m)));
 BA.debugLineNum = 990;BA.debugLine="m = (m + 1) Mod clrs.Length";
Debug.ShouldStop(536870912);
_m = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_m,RemoteObject.createImmutable(1)}, "+",1, 1)),_clrs.getField(true,"length")}, "%",0, 1);Debug.locals.put("m", _m);
 BA.debugLineNum = 991;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
Debug.ShouldStop(1073741824);
_setavg(_bc,BA.numberCast(int.class, _x),BA.numberCast(int.class, _y),_clrs,_temp);
 }
}Debug.locals.put("x", _x);
;
 }
}Debug.locals.put("y", _y);
;
 BA.debugLineNum = 994;BA.debugLine="For x = 0 To bc.mWidth - 1";
Debug.ShouldStop(2);
{
final int step23 = 1;
final int limit23 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mwidth"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = 0 ;
for (;(step23 > 0 && _x <= limit23) || (step23 < 0 && _x >= limit23) ;_x = ((int)(0 + _x + step23))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 995;BA.debugLine="For y = 0 To 2";
Debug.ShouldStop(4);
{
final int step24 = 1;
final int limit24 = 2;
_y = 0 ;
for (;(step24 > 0 && _y <= limit24) || (step24 < 0 && _y >= limit24) ;_y = ((int)(0 + _y + step24))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 996;BA.debugLine="bc.GetARGB(x, y, clrs(y))";
Debug.ShouldStop(8);
_bc.runVoidMethod ("_getargb",(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(_clrs.getArrayElement(false,BA.numberCast(int.class, _y))));
 }
}Debug.locals.put("y", _y);
;
 BA.debugLineNum = 998;BA.debugLine="SetAvg(bc, x, 1, clrs, temp)";
Debug.ShouldStop(32);
_setavg(_bc,BA.numberCast(int.class, _x),BA.numberCast(int.class, 1),_clrs,_temp);
 BA.debugLineNum = 999;BA.debugLine="m = 0";
Debug.ShouldStop(64);
_m = BA.numberCast(int.class, 0);Debug.locals.put("m", _m);
 BA.debugLineNum = 1000;BA.debugLine="For y = 2 To bc.mHeight - 2";
Debug.ShouldStop(128);
{
final int step29 = 1;
final int limit29 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mheight"),RemoteObject.createImmutable(2)}, "-",1, 1).<Integer>get().intValue();
_y = 2 ;
for (;(step29 > 0 && _y <= limit29) || (step29 < 0 && _y >= limit29) ;_y = ((int)(0 + _y + step29))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 1001;BA.debugLine="bc.GetARGB(x, y + 1, clrs(m))";
Debug.ShouldStop(256);
_bc.runVoidMethod ("_getargb",(Object)(BA.numberCast(int.class, _x)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_y),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_clrs.getArrayElement(false,_m)));
 BA.debugLineNum = 1002;BA.debugLine="m = (m + 1) Mod clrs.Length";
Debug.ShouldStop(512);
_m = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_m,RemoteObject.createImmutable(1)}, "+",1, 1)),_clrs.getField(true,"length")}, "%",0, 1);Debug.locals.put("m", _m);
 BA.debugLineNum = 1003;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
Debug.ShouldStop(1024);
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
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e37.toString()); BA.debugLineNum = 1008;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 1009;BA.debugLine="lblStatus.Text = \"Blur LastException: \" & LastEx";
Debug.ShouldStop(65536);
main._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Blur LastException: "),main.__c.runMethod(false,"LastException",main.ba)));
 };
 BA.debugLineNum = 1011;BA.debugLine="Return bc.Bitmap";
Debug.ShouldStop(262144);
Debug.CheckDeviceExceptions();if (true) return _bc.runMethod(false,"_getbitmap");
 BA.debugLineNum = 1012;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("BlurIV (main) ","main",0,main.ba,main.mostCurrent,961);
if (RapidSub.canDelegate("bluriv")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","bluriv", _image, _iv);}
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
Debug.locals.put("image", _image);
Debug.locals.put("iv", _iv);
 BA.debugLineNum = 961;BA.debugLine="Sub BlurIV (image As String,iv As ImageView)";
Debug.ShouldStop(1);
 BA.debugLineNum = 962;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 963;BA.debugLine="Dim bmp As B4XBitmap = xui.LoadBitmapResize(File";
Debug.ShouldStop(4);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmp = main._xui.runMethod(false,"LoadBitmapResize",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(_image),(Object)(BA.numberCast(int.class, _iv.runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, _iv.runMethod(true,"getHeight"))),(Object)(main.__c.getField(true,"True")));Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 964;BA.debugLine="iv.SetImage(Blur(bmp))";
Debug.ShouldStop(8);
_iv.runVoidMethod ("SetImage",(Object)((_blur(_bmp).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e5.toString()); BA.debugLineNum = 966;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 967;BA.debugLine="lblStatus.Text = \"BlurIV LastException: \" & Last";
Debug.ShouldStop(64);
main._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("BlurIV LastException: "),main.__c.runMethod(false,"LastException",main.ba)));
 };
 BA.debugLineNum = 969;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("btnActivity_Click (main) ","main",0,main.ba,main.mostCurrent,1034);
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
		Debug.PushSubsStack("btnActivity_Click (main) ","main",0,main.ba,main.mostCurrent,1034);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 1035;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia-s";
Debug.ShouldStop(1024);
_restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/api/v1/accounts/88438/media/changed?since=2019-04-19T23:11:20+0000&page=1")));
 BA.debugLineNum = 1036;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnactivity_click"),BA.numberCast(int.class, 1000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 1038;BA.debugLine="Dim mf As frmActivity";
Debug.ShouldStop(8192);
_mf = RemoteObject.createNew ("cloyd.blink.frmactivity");Debug.locals.put("mf", _mf);
 BA.debugLineNum = 1039;BA.debugLine="mf.Initialize(MainForm)";
Debug.ShouldStop(16384);
_mf.runClassMethod (cloyd.blink.frmactivity.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(parent._mainform));
 BA.debugLineNum = 1040;BA.debugLine="mf.Show(response,userRegion,authToken)";
Debug.ShouldStop(32768);
_mf.runClassMethod (cloyd.blink.frmactivity.class, "_show" /*RemoteObject*/ ,(Object)(parent._response),(Object)(parent._userregion),(Object)(parent._authtoken));
 BA.debugLineNum = 1041;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("btnDriveway_Click (main) ","main",0,main.ba,main.mostCurrent,115);
if (RapidSub.canDelegate("btndriveway_click")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","btndriveway_click");}
 BA.debugLineNum = 115;BA.debugLine="Sub btnDriveway_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 116;BA.debugLine="RefreshCameras(False)";
Debug.ShouldStop(524288);
_refreshcameras(main.__c.getField(true,"False"));
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
public static RemoteObject  _checkbattlife(RemoteObject _battlevel) throws Exception{
try {
		Debug.PushSubsStack("CheckBattLife (main) ","main",0,main.ba,main.mostCurrent,670);
if (RapidSub.canDelegate("checkbattlife")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","checkbattlife", _battlevel);}
Debug.locals.put("battlevel", _battlevel);
 BA.debugLineNum = 670;BA.debugLine="Sub CheckBattLife(battlevel As Int) As String";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 671;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 673;BA.debugLine="If battlevel <= 136 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("k",_battlevel,BA.numberCast(double.class, 136))) { 
 BA.debugLineNum = 674;BA.debugLine="Return \"Replace battery now!\"";
Debug.ShouldStop(2);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("Replace battery now!");
 }else 
{ BA.debugLineNum = 675;BA.debugLine="else If battlevel >= 160 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("g",_battlevel,BA.numberCast(double.class, 160))) { 
 BA.debugLineNum = 676;BA.debugLine="Return \"Very high\"";
Debug.ShouldStop(8);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("Very high");
 }else 
{ BA.debugLineNum = 677;BA.debugLine="else If battlevel > 136 And battlevel < 138 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",_battlevel,BA.numberCast(double.class, 136)) && RemoteObject.solveBoolean("<",_battlevel,BA.numberCast(double.class, 138))) { 
 BA.debugLineNum = 678;BA.debugLine="Return \"Very low\"";
Debug.ShouldStop(32);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("Very low");
 }else {
 BA.debugLineNum = 680;BA.debugLine="Return \"High\"";
Debug.ShouldStop(128);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("High");
 }}}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e12.toString()); BA.debugLineNum = 683;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 684;BA.debugLine="lblStatus.Text = \"CheckBattLife LastException: \"";
Debug.ShouldStop(2048);
main._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("CheckBattLife LastException: "),main.__c.runMethod(false,"LastException",main.ba)));
 BA.debugLineNum = 685;BA.debugLine="Return \"\"";
Debug.ShouldStop(4096);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 687;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("CheckLFRLevel (main) ","main",0,main.ba,main.mostCurrent,689);
if (RapidSub.canDelegate("checklfrlevel")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","checklfrlevel", _lfrlevel);}
Debug.locals.put("lfrlevel", _lfrlevel);
 BA.debugLineNum = 689;BA.debugLine="Sub CheckLFRLevel(lfrlevel As Int) As String";
Debug.ShouldStop(65536);
 BA.debugLineNum = 690;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 692;BA.debugLine="If lfrlevel > -67 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_lfrlevel,BA.numberCast(double.class, -(double) (0 + 67)))) { 
 BA.debugLineNum = 693;BA.debugLine="Return \"Amazing\"";
Debug.ShouldStop(1048576);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("Amazing");
 }else 
{ BA.debugLineNum = 694;BA.debugLine="else If lfrlevel > -70 And lfrlevel <= -67 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_lfrlevel,BA.numberCast(double.class, -(double) (0 + 70))) && RemoteObject.solveBoolean("k",_lfrlevel,BA.numberCast(double.class, -(double) (0 + 67)))) { 
 BA.debugLineNum = 695;BA.debugLine="Return \"Very good\"";
Debug.ShouldStop(4194304);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("Very good");
 }else 
{ BA.debugLineNum = 696;BA.debugLine="else If lfrlevel > -80 And lfrlevel <= -70 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",_lfrlevel,BA.numberCast(double.class, -(double) (0 + 80))) && RemoteObject.solveBoolean("k",_lfrlevel,BA.numberCast(double.class, -(double) (0 + 70)))) { 
 BA.debugLineNum = 697;BA.debugLine="Return \"OK\"";
Debug.ShouldStop(16777216);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("OK");
 }else 
{ BA.debugLineNum = 698;BA.debugLine="else If lfrlevel > -90 And lfrlevel <= -80 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_lfrlevel,BA.numberCast(double.class, -(double) (0 + 90))) && RemoteObject.solveBoolean("k",_lfrlevel,BA.numberCast(double.class, -(double) (0 + 80)))) { 
 BA.debugLineNum = 699;BA.debugLine="Return \"Not Good\"";
Debug.ShouldStop(67108864);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("Not Good");
 }else {
 BA.debugLineNum = 701;BA.debugLine="Return \"Unusable\"";
Debug.ShouldStop(268435456);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("Unusable");
 }}}}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e14.toString()); BA.debugLineNum = 704;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 705;BA.debugLine="lblStatus.Text = \"CheckLFRLevel LastException: \"";
Debug.ShouldStop(1);
main._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("CheckLFRLevel LastException: "),main.__c.runMethod(false,"LastException",main.ba)));
 BA.debugLineNum = 706;BA.debugLine="Return \"\"";
Debug.ShouldStop(2);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 708;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("CheckMonitor (main) ","main",0,main.ba,main.mostCurrent,811);
if (RapidSub.canDelegate("checkmonitor")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","checkmonitor");}
RemoteObject _slist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _s = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
 BA.debugLineNum = 811;BA.debugLine="Sub CheckMonitor() As Screen";
Debug.ShouldStop(1024);
 BA.debugLineNum = 812;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 813;BA.debugLine="If fx.Screens.Size= 1 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",main._fx.runMethod(false,"getScreens").runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 814;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(8192);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = main._fx.runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 815;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(16384);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 817;BA.debugLine="Return S";
Debug.ShouldStop(65536);
Debug.CheckDeviceExceptions();if (true) return _s;
 }else 
{ BA.debugLineNum = 818;BA.debugLine="Else If fx.Screens.Size> 1 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",main._fx.runMethod(false,"getScreens").runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 819;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(262144);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = main._fx.runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 820;BA.debugLine="Dim S As Screen = SList.Get(2)";
Debug.ShouldStop(524288);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("S", _s);
 BA.debugLineNum = 822;BA.debugLine="Return S";
Debug.ShouldStop(2097152);
Debug.CheckDeviceExceptions();if (true) return _s;
 }else {
 BA.debugLineNum = 824;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(8388608);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = main._fx.runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 825;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(16777216);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 827;BA.debugLine="Return S";
Debug.ShouldStop(67108864);
Debug.CheckDeviceExceptions();if (true) return _s;
 }}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e16.toString()); BA.debugLineNum = 830;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(536870912);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = main._fx.runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 831;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(1073741824);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 833;BA.debugLine="Return S";
Debug.ShouldStop(1);
Debug.CheckDeviceExceptions();if (true) return _s;
 };
 BA.debugLineNum = 835;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Close_Entered_Event (main) ","main",0,main.ba,main.mostCurrent,737);
if (RapidSub.canDelegate("close_entered_event")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","close_entered_event", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 737;BA.debugLine="Private Sub Close_Entered_Event(e As Event)";
Debug.ShouldStop(1);
 BA.debugLineNum = 738;BA.debugLine="Try";
Debug.ShouldStop(2);
try { BA.debugLineNum = 739;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
Debug.ShouldStop(4);
main._ivclose.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable("_btCloseEnt.png")))).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e4.toString()); BA.debugLineNum = 741;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 743;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Close_Exited_Event (main) ","main",0,main.ba,main.mostCurrent,745);
if (RapidSub.canDelegate("close_exited_event")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","close_exited_event", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 745;BA.debugLine="Private Sub Close_Exited_Event(e As Event)";
Debug.ShouldStop(256);
 BA.debugLineNum = 746;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 747;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
Debug.ShouldStop(1024);
main._ivclose.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable("_btClose.png")))).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e4.toString()); BA.debugLineNum = 749;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 751;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("clvDriveway_ItemClick (main) ","main",0,main.ba,main.mostCurrent,849);
if (RapidSub.canDelegate("clvdriveway_itemclick")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","clvdriveway_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 849;BA.debugLine="Sub clvDriveway_ItemClick (Index As Int, Value As";
Debug.ShouldStop(65536);
 BA.debugLineNum = 850;BA.debugLine="clvDriveway.JumpToItem(Index)";
Debug.ShouldStop(131072);
main._clvdriveway.runVoidMethod ("_jumptoitem",(Object)(_index));
 BA.debugLineNum = 851;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
Debug.ShouldStop(262144);
main._clvfrontdoor.runVoidMethod ("_jumptoitem",(Object)(_index));
 BA.debugLineNum = 852;BA.debugLine="clvSideYard.JumpToItem(Index)";
Debug.ShouldStop(524288);
main._clvsideyard.runVoidMethod ("_jumptoitem",(Object)(_index));
 BA.debugLineNum = 853;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("clvFrontDoor_ItemClick (main) ","main",0,main.ba,main.mostCurrent,843);
if (RapidSub.canDelegate("clvfrontdoor_itemclick")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","clvfrontdoor_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 843;BA.debugLine="Sub clvFrontDoor_ItemClick (Index As Int, Value As";
Debug.ShouldStop(1024);
 BA.debugLineNum = 844;BA.debugLine="clvDriveway.JumpToItem(Index)";
Debug.ShouldStop(2048);
main._clvdriveway.runVoidMethod ("_jumptoitem",(Object)(_index));
 BA.debugLineNum = 845;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
Debug.ShouldStop(4096);
main._clvfrontdoor.runVoidMethod ("_jumptoitem",(Object)(_index));
 BA.debugLineNum = 846;BA.debugLine="clvSideYard.JumpToItem(Index)";
Debug.ShouldStop(8192);
main._clvsideyard.runVoidMethod ("_jumptoitem",(Object)(_index));
 BA.debugLineNum = 847;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("clvSideYard_ItemClick (main) ","main",0,main.ba,main.mostCurrent,837);
if (RapidSub.canDelegate("clvsideyard_itemclick")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","clvsideyard_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 837;BA.debugLine="Sub clvSideYard_ItemClick (Index As Int, Value As";
Debug.ShouldStop(16);
 BA.debugLineNum = 838;BA.debugLine="clvDriveway.JumpToItem(Index)";
Debug.ShouldStop(32);
main._clvdriveway.runVoidMethod ("_jumptoitem",(Object)(_index));
 BA.debugLineNum = 839;BA.debugLine="clvFrontDoor.JumpToItem(Index)";
Debug.ShouldStop(64);
main._clvfrontdoor.runVoidMethod ("_jumptoitem",(Object)(_index));
 BA.debugLineNum = 840;BA.debugLine="clvSideYard.JumpToItem(Index)";
Debug.ShouldStop(128);
main._clvsideyard.runVoidMethod ("_jumptoitem",(Object)(_index));
 BA.debugLineNum = 841;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("DownloadImage (main) ","main",0,main.ba,main.mostCurrent,337);
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
		Debug.PushSubsStack("DownloadImage (main) ","main",0,main.ba,main.mostCurrent,337);
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
 BA.debugLineNum = 338;BA.debugLine="Try";
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
 BA.debugLineNum = 339;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(262144);
_j = RemoteObject.createNew ("cloyd.blink.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 340;BA.debugLine="response = \"\"";
Debug.ShouldStop(524288);
parent._response = BA.ObjectToString("");
 BA.debugLineNum = 341;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(1048576);
_j.runClassMethod (cloyd.blink.httpjob.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 342;BA.debugLine="j.Download(Link)";
Debug.ShouldStop(2097152);
_j.runClassMethod (cloyd.blink.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_link));
 BA.debugLineNum = 343;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
Debug.ShouldStop(4194304);
_j.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("TOKEN_AUTH")),(Object)(parent._authtoken));
 BA.debugLineNum = 344;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","jobdone", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "downloadimage"), (_j));
this.state = 21;
return;
case 21:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 345;BA.debugLine="If j.Success Then";
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
 BA.debugLineNum = 347;BA.debugLine="If camera = \"347574\" Then";
Debug.ShouldStop(67108864);
if (true) break;

case 7:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("347574"))) { 
this.state = 9;
}else 
{ BA.debugLineNum = 349;BA.debugLine="Else If camera = \"236967\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("236967"))) { 
this.state = 11;
}else 
{ BA.debugLineNum = 351;BA.debugLine="Else If camera = \"226821\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("226821"))) { 
this.state = 13;
}}}
if (true) break;

case 9:
//C
this.state = 14;
 BA.debugLineNum = 348;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
Debug.ShouldStop(134217728);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("Driveway.jpg")),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 350;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
Debug.ShouldStop(536870912);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("FrontDoor.jpg")),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 352;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
Debug.ShouldStop(-2147483648);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("SideYard.jpg")),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 if (true) break;

case 14:
//C
this.state = 17;
;
 BA.debugLineNum = 354;BA.debugLine="File.Copy2(j.GetInputStream, out)";
Debug.ShouldStop(2);
parent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_j.runClassMethod (cloyd.blink.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())),(Object)((_out.getObject())));
 BA.debugLineNum = 355;BA.debugLine="out.Close '<------ very important";
Debug.ShouldStop(4);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 358;BA.debugLine="iv.SetImage(j.GetBitmap)";
Debug.ShouldStop(32);
_iv.runVoidMethod ("SetImage",(Object)((_j.runClassMethod (cloyd.blink.httpjob.class, "_getbitmap" /*RemoteObject*/ ).getObject())));
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 360;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
Debug.ShouldStop(128);
parent._response = RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));
 BA.debugLineNum = 361;BA.debugLine="lblStatus.Text = \"ERROR: \" & j.ErrorMessage";
Debug.ShouldStop(256);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )));
 if (true) break;

case 17:
//C
this.state = 20;
;
 BA.debugLineNum = 363;BA.debugLine="j.Release";
Debug.ShouldStop(1024);
_j.runClassMethod (cloyd.blink.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
 BA.debugLineNum = 365;BA.debugLine="lblStatus.Text = \"DownloadImage LastException: \"";
Debug.ShouldStop(4096);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("DownloadImage LastException: "),parent.__c.runMethod(false,"LastException",main.ba)));
 BA.debugLineNum = 366;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",main.ba))));
 if (true) break;
if (true) break;

case 20:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 368;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Get_css (main) ","main",0,main.ba,main.mostCurrent,799);
if (RapidSub.canDelegate("get_css")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","get_css");}
RemoteObject _jform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _scene = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _stylesheets = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 799;BA.debugLine="Public Sub Get_css";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 800;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 801;BA.debugLine="Dim jForm As JavaObject = MainForm";
Debug.ShouldStop(1);
_jform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jform.setObject(main._mainform);Debug.locals.put("jForm", _jform);
 BA.debugLineNum = 802;BA.debugLine="Dim scene As JavaObject = jForm.GetField(\"scene\"";
Debug.ShouldStop(2);
_scene = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_scene.setObject(_jform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("scene"))));Debug.locals.put("scene", _scene);
 BA.debugLineNum = 803;BA.debugLine="Dim stylesheets As List = scene.RunMethod(\"getSt";
Debug.ShouldStop(4);
_stylesheets = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_stylesheets.setObject(_scene.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getStylesheets")),(Object)((main.__c.getField(false,"Null")))));Debug.locals.put("stylesheets", _stylesheets);
 BA.debugLineNum = 804;BA.debugLine="stylesheets.Clear";
Debug.ShouldStop(8);
_stylesheets.runVoidMethod ("Clear");
 BA.debugLineNum = 805;BA.debugLine="stylesheets.Add(File.GetUri(File.DirAssets, imgI";
Debug.ShouldStop(16);
_stylesheets.runVoidMethod ("Add",(Object)((main.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable(".css")))))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e8.toString()); BA.debugLineNum = 807;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 809;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetAllCameras (main) ","main",0,main.ba,main.mostCurrent,429);
if (RapidSub.canDelegate("getallcameras")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","getallcameras", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _networks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colnetworks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("json", _json);
 BA.debugLineNum = 429;BA.debugLine="Sub GetAllCameras(json As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 430;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 431;BA.debugLine="lblStatus.Text = \"Getting all cameras informatio";
Debug.ShouldStop(16384);
main._lblstatus.runMethod(true,"setText",BA.ObjectToString("Getting all cameras information..."));
 BA.debugLineNum = 432;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(32768);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 433;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(65536);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 434;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(131072);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 438;BA.debugLine="Dim networks As List = root.Get(\"networks\")";
Debug.ShouldStop(2097152);
_networks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_networks.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("networks")))));Debug.locals.put("networks", _networks);
 BA.debugLineNum = 439;BA.debugLine="For Each colnetworks As Map In networks";
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
 BA.debugLineNum = 448;BA.debugLine="networkID = colnetworks.Get(\"network_id\")";
Debug.ShouldStop(-2147483648);
main._networkid = BA.ObjectToString(_colnetworks.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("network_id")))));
 BA.debugLineNum = 449;BA.debugLine="Log(\"networkID: \" &  networkID)";
Debug.ShouldStop(1);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("networkID: "),main._networkid)));
 }
}Debug.locals.put("colnetworks", _colnetworks);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e12.toString()); BA.debugLineNum = 453;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 454;BA.debugLine="lblStatus.Text = \"GetAllCameras LastException: \"";
Debug.ShouldStop(32);
main._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("GetAllCameras LastException: "),main.__c.runMethod(false,"LastException",main.ba)));
 };
 BA.debugLineNum = 456;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetAuthInfo (main) ","main",0,main.ba,main.mostCurrent,371);
if (RapidSub.canDelegate("getauthinfo")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","getauthinfo", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _authtokenmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _region = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("json", _json);
 BA.debugLineNum = 371;BA.debugLine="Sub GetAuthInfo(json As String)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 372;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 373;BA.debugLine="lblStatus.Text = \"Getting authtoken...\"";
Debug.ShouldStop(1048576);
main._lblstatus.runMethod(true,"setText",BA.ObjectToString("Getting authtoken..."));
 BA.debugLineNum = 374;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2097152);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 375;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(4194304);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 376;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(8388608);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 377;BA.debugLine="Dim authtokenmap As Map = root.Get(\"authtoken\")";
Debug.ShouldStop(16777216);
_authtokenmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_authtokenmap.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("authtoken")))));Debug.locals.put("authtokenmap", _authtokenmap);
 BA.debugLineNum = 378;BA.debugLine="authToken = authtokenmap.Get(\"authtoken\")";
Debug.ShouldStop(33554432);
main._authtoken = BA.ObjectToString(_authtokenmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("authtoken")))));
 BA.debugLineNum = 379;BA.debugLine="Log(\"authToken: \" &  authToken)";
Debug.ShouldStop(67108864);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("authToken: "),main._authtoken)));
 BA.debugLineNum = 387;BA.debugLine="Dim region As Map = root.Get(\"region\")";
Debug.ShouldStop(4);
_region = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_region.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region")))));Debug.locals.put("region", _region);
 BA.debugLineNum = 388;BA.debugLine="userRegion = region.GetKeyAt(0)";
Debug.ShouldStop(8);
main._userregion = BA.ObjectToString(_region.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 389;BA.debugLine="Log(\"userRegion: \" &  userRegion)";
Debug.ShouldStop(16);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("userRegion: "),main._userregion)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e13.toString()); BA.debugLineNum = 394;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 395;BA.debugLine="lblStatus.Text = \"GetAuthInfo LastException: \" &";
Debug.ShouldStop(1024);
main._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("GetAuthInfo LastException: "),main.__c.runMethod(false,"LastException",main.ba)));
 };
 BA.debugLineNum = 398;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetCameraInfo (main) ","main",0,main.ba,main.mostCurrent,518);
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
int _i = 0;
RemoteObject _item = RemoteObject.createImmutable("");
Debug.locals.put("json", _json);
Debug.locals.put("clv", _clv);
 BA.debugLineNum = 518;BA.debugLine="Sub GetCameraInfo(json As String, clv As CustomLis";
Debug.ShouldStop(32);
 BA.debugLineNum = 519;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 520;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(128);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 521;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(256);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 522;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(512);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 523;BA.debugLine="Dim camera_status As Map = root.Get(\"camera_stat";
Debug.ShouldStop(1024);
_camera_status = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_camera_status.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("camera_status")))));Debug.locals.put("camera_status", _camera_status);
 BA.debugLineNum = 524;BA.debugLine="Dim total_108_wakeups As Int = camera_status.Get";
Debug.ShouldStop(2048);
_total_108_wakeups = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_108_wakeups")))));Debug.locals.put("total_108_wakeups", _total_108_wakeups);Debug.locals.put("total_108_wakeups", _total_108_wakeups);
 BA.debugLineNum = 525;BA.debugLine="Dim battery_voltage As Int = camera_status.Get(\"";
Debug.ShouldStop(4096);
_battery_voltage = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("battery_voltage")))));Debug.locals.put("battery_voltage", _battery_voltage);Debug.locals.put("battery_voltage", _battery_voltage);
 BA.debugLineNum = 526;BA.debugLine="Dim light_sensor_data_valid As String = camera_s";
Debug.ShouldStop(8192);
_light_sensor_data_valid = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("light_sensor_data_valid")))));Debug.locals.put("light_sensor_data_valid", _light_sensor_data_valid);Debug.locals.put("light_sensor_data_valid", _light_sensor_data_valid);
 BA.debugLineNum = 527;BA.debugLine="Dim lfr_tb_wakeups As Int = camera_status.Get(\"l";
Debug.ShouldStop(16384);
_lfr_tb_wakeups = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lfr_tb_wakeups")))));Debug.locals.put("lfr_tb_wakeups", _lfr_tb_wakeups);Debug.locals.put("lfr_tb_wakeups", _lfr_tb_wakeups);
 BA.debugLineNum = 528;BA.debugLine="Dim fw_git_hash As String = camera_status.Get(\"f";
Debug.ShouldStop(32768);
_fw_git_hash = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fw_git_hash")))));Debug.locals.put("fw_git_hash", _fw_git_hash);Debug.locals.put("fw_git_hash", _fw_git_hash);
 BA.debugLineNum = 529;BA.debugLine="Dim wifi_strength As Int = camera_status.Get(\"wi";
Debug.ShouldStop(65536);
_wifi_strength = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("wifi_strength")))));Debug.locals.put("wifi_strength", _wifi_strength);Debug.locals.put("wifi_strength", _wifi_strength);
 BA.debugLineNum = 530;BA.debugLine="Dim lfr_strength As Int = camera_status.Get(\"lfr";
Debug.ShouldStop(131072);
_lfr_strength = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lfr_strength")))));Debug.locals.put("lfr_strength", _lfr_strength);Debug.locals.put("lfr_strength", _lfr_strength);
 BA.debugLineNum = 531;BA.debugLine="Dim total_tb_wakeups As Int = camera_status.Get(";
Debug.ShouldStop(262144);
_total_tb_wakeups = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_tb_wakeups")))));Debug.locals.put("total_tb_wakeups", _total_tb_wakeups);Debug.locals.put("total_tb_wakeups", _total_tb_wakeups);
 BA.debugLineNum = 532;BA.debugLine="Dim created_at As String = camera_status.Get(\"cr";
Debug.ShouldStop(524288);
_created_at = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 533;BA.debugLine="Dim light_sensor_ch0 As Int = camera_status.Get(";
Debug.ShouldStop(1048576);
_light_sensor_ch0 = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("light_sensor_ch0")))));Debug.locals.put("light_sensor_ch0", _light_sensor_ch0);Debug.locals.put("light_sensor_ch0", _light_sensor_ch0);
 BA.debugLineNum = 534;BA.debugLine="Dim mac As String = camera_status.Get(\"mac\")";
Debug.ShouldStop(2097152);
_mac = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mac")))));Debug.locals.put("mac", _mac);Debug.locals.put("mac", _mac);
 BA.debugLineNum = 535;BA.debugLine="Dim unit_number As Int = camera_status.Get(\"unit";
Debug.ShouldStop(4194304);
_unit_number = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("unit_number")))));Debug.locals.put("unit_number", _unit_number);Debug.locals.put("unit_number", _unit_number);
 BA.debugLineNum = 536;BA.debugLine="Dim updated_at As String = camera_status.Get(\"up";
Debug.ShouldStop(8388608);
_updated_at = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("updated_at")))));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 537;BA.debugLine="Dim light_sensor_ch1 As Int = camera_status.Get(";
Debug.ShouldStop(16777216);
_light_sensor_ch1 = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("light_sensor_ch1")))));Debug.locals.put("light_sensor_ch1", _light_sensor_ch1);Debug.locals.put("light_sensor_ch1", _light_sensor_ch1);
 BA.debugLineNum = 538;BA.debugLine="Dim time_dhcp_lease As Int = camera_status.Get(\"";
Debug.ShouldStop(33554432);
_time_dhcp_lease = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("time_dhcp_lease")))));Debug.locals.put("time_dhcp_lease", _time_dhcp_lease);Debug.locals.put("time_dhcp_lease", _time_dhcp_lease);
 BA.debugLineNum = 539;BA.debugLine="Dim temperature As Int = camera_status.Get(\"temp";
Debug.ShouldStop(67108864);
_temperature = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("temperature")))));Debug.locals.put("temperature", _temperature);Debug.locals.put("temperature", _temperature);
 BA.debugLineNum = 540;BA.debugLine="Dim time_first_video As Int = camera_status.Get(";
Debug.ShouldStop(134217728);
_time_first_video = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("time_first_video")))));Debug.locals.put("time_first_video", _time_first_video);Debug.locals.put("time_first_video", _time_first_video);
 BA.debugLineNum = 541;BA.debugLine="Dim time_dns_resolve As Int = camera_status.Get(";
Debug.ShouldStop(268435456);
_time_dns_resolve = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("time_dns_resolve")))));Debug.locals.put("time_dns_resolve", _time_dns_resolve);Debug.locals.put("time_dns_resolve", _time_dns_resolve);
 BA.debugLineNum = 542;BA.debugLine="Dim id As Int = camera_status.Get(\"id\")";
Debug.ShouldStop(536870912);
_id = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 543;BA.debugLine="Dim temp_alert_status As String = camera_status.";
Debug.ShouldStop(1073741824);
_temp_alert_status = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("temp_alert_status")))));Debug.locals.put("temp_alert_status", _temp_alert_status);Debug.locals.put("temp_alert_status", _temp_alert_status);
 BA.debugLineNum = 544;BA.debugLine="Dim time_108_boot As Int = camera_status.Get(\"ti";
Debug.ShouldStop(-2147483648);
_time_108_boot = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("time_108_boot")))));Debug.locals.put("time_108_boot", _time_108_boot);Debug.locals.put("time_108_boot", _time_108_boot);
 BA.debugLineNum = 545;BA.debugLine="Dim lfr_108_wakeups As Int = camera_status.Get(\"";
Debug.ShouldStop(1);
_lfr_108_wakeups = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lfr_108_wakeups")))));Debug.locals.put("lfr_108_wakeups", _lfr_108_wakeups);Debug.locals.put("lfr_108_wakeups", _lfr_108_wakeups);
 BA.debugLineNum = 546;BA.debugLine="cameraThumbnail = camera_status.Get(\"thumbnail\")";
Debug.ShouldStop(2);
main._camerathumbnail = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("thumbnail")))));
 BA.debugLineNum = 547;BA.debugLine="Log(\"cameraThumbnail: \" & cameraThumbnail)";
Debug.ShouldStop(4);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("cameraThumbnail: "),main._camerathumbnail)));
 BA.debugLineNum = 548;BA.debugLine="Dim lifetime_duration As Int = camera_status.Get";
Debug.ShouldStop(8);
_lifetime_duration = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lifetime_duration")))));Debug.locals.put("lifetime_duration", _lifetime_duration);Debug.locals.put("lifetime_duration", _lifetime_duration);
 BA.debugLineNum = 549;BA.debugLine="Dim wifi_connect_failure_count As Int = camera_s";
Debug.ShouldStop(16);
_wifi_connect_failure_count = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("wifi_connect_failure_count")))));Debug.locals.put("wifi_connect_failure_count", _wifi_connect_failure_count);Debug.locals.put("wifi_connect_failure_count", _wifi_connect_failure_count);
 BA.debugLineNum = 550;BA.debugLine="Dim camera_id As Int = camera_status.Get(\"camera";
Debug.ShouldStop(32);
_camera_id = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("camera_id")))));Debug.locals.put("camera_id", _camera_id);Debug.locals.put("camera_id", _camera_id);
 BA.debugLineNum = 551;BA.debugLine="Dim battery_alert_status As String = camera_stat";
Debug.ShouldStop(64);
_battery_alert_status = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("battery_alert_status")))));Debug.locals.put("battery_alert_status", _battery_alert_status);Debug.locals.put("battery_alert_status", _battery_alert_status);
 BA.debugLineNum = 552;BA.debugLine="Dim dhcp_failure_count As Int = camera_status.Ge";
Debug.ShouldStop(128);
_dhcp_failure_count = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("dhcp_failure_count")))));Debug.locals.put("dhcp_failure_count", _dhcp_failure_count);Debug.locals.put("dhcp_failure_count", _dhcp_failure_count);
 BA.debugLineNum = 553;BA.debugLine="Dim ip_address As String = camera_status.Get(\"ip";
Debug.ShouldStop(256);
_ip_address = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ip_address")))));Debug.locals.put("ip_address", _ip_address);Debug.locals.put("ip_address", _ip_address);
 BA.debugLineNum = 554;BA.debugLine="Dim ipv As String = camera_status.Get(\"ipv\")";
Debug.ShouldStop(512);
_ipv = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ipv")))));Debug.locals.put("ipv", _ipv);Debug.locals.put("ipv", _ipv);
 BA.debugLineNum = 555;BA.debugLine="Dim light_sensor_data_new As String = camera_sta";
Debug.ShouldStop(1024);
_light_sensor_data_new = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("light_sensor_data_new")))));Debug.locals.put("light_sensor_data_new", _light_sensor_data_new);Debug.locals.put("light_sensor_data_new", _light_sensor_data_new);
 BA.debugLineNum = 556;BA.debugLine="Dim network_id As Int = camera_status.Get(\"netwo";
Debug.ShouldStop(2048);
_network_id = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("network_id")))));Debug.locals.put("network_id", _network_id);Debug.locals.put("network_id", _network_id);
 BA.debugLineNum = 557;BA.debugLine="Dim account_id As Int = camera_status.Get(\"accou";
Debug.ShouldStop(4096);
_account_id = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("account_id")))));Debug.locals.put("account_id", _account_id);Debug.locals.put("account_id", _account_id);
 BA.debugLineNum = 558;BA.debugLine="Dim serial As String = camera_status.Get(\"serial";
Debug.ShouldStop(8192);
_serial = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("serial")))));Debug.locals.put("serial", _serial);Debug.locals.put("serial", _serial);
 BA.debugLineNum = 559;BA.debugLine="Dim dev_1 As Int = camera_status.Get(\"dev_1\")";
Debug.ShouldStop(16384);
_dev_1 = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("dev_1")))));Debug.locals.put("dev_1", _dev_1);Debug.locals.put("dev_1", _dev_1);
 BA.debugLineNum = 560;BA.debugLine="Dim time_wlan_connect As Int = camera_status.Get";
Debug.ShouldStop(32768);
_time_wlan_connect = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("time_wlan_connect")))));Debug.locals.put("time_wlan_connect", _time_wlan_connect);Debug.locals.put("time_wlan_connect", _time_wlan_connect);
 BA.debugLineNum = 561;BA.debugLine="Dim dev_2 As Int = camera_status.Get(\"dev_2\")";
Debug.ShouldStop(65536);
_dev_2 = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("dev_2")))));Debug.locals.put("dev_2", _dev_2);Debug.locals.put("dev_2", _dev_2);
 BA.debugLineNum = 562;BA.debugLine="Dim socket_failure_count As Int = camera_status.";
Debug.ShouldStop(131072);
_socket_failure_count = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("socket_failure_count")))));Debug.locals.put("socket_failure_count", _socket_failure_count);Debug.locals.put("socket_failure_count", _socket_failure_count);
 BA.debugLineNum = 563;BA.debugLine="Dim dev_3 As Int = camera_status.Get(\"dev_3\")";
Debug.ShouldStop(262144);
_dev_3 = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("dev_3")))));Debug.locals.put("dev_3", _dev_3);Debug.locals.put("dev_3", _dev_3);
 BA.debugLineNum = 564;BA.debugLine="Dim pir_rejections As Int = camera_status.Get(\"p";
Debug.ShouldStop(524288);
_pir_rejections = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pir_rejections")))));Debug.locals.put("pir_rejections", _pir_rejections);Debug.locals.put("pir_rejections", _pir_rejections);
 BA.debugLineNum = 565;BA.debugLine="Dim sync_module_id As Int = camera_status.Get(\"s";
Debug.ShouldStop(1048576);
_sync_module_id = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("sync_module_id")))));Debug.locals.put("sync_module_id", _sync_module_id);Debug.locals.put("sync_module_id", _sync_module_id);
 BA.debugLineNum = 566;BA.debugLine="Dim lifetime_count As Int = camera_status.Get(\"l";
Debug.ShouldStop(2097152);
_lifetime_count = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lifetime_count")))));Debug.locals.put("lifetime_count", _lifetime_count);Debug.locals.put("lifetime_count", _lifetime_count);
 BA.debugLineNum = 567;BA.debugLine="Dim error_codes As Int = camera_status.Get(\"erro";
Debug.ShouldStop(4194304);
_error_codes = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("error_codes")))));Debug.locals.put("error_codes", _error_codes);Debug.locals.put("error_codes", _error_codes);
 BA.debugLineNum = 568;BA.debugLine="Dim fw_version As String = camera_status.Get(\"fw";
Debug.ShouldStop(8388608);
_fw_version = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fw_version")))));Debug.locals.put("fw_version", _fw_version);Debug.locals.put("fw_version", _fw_version);
 BA.debugLineNum = 569;BA.debugLine="Dim ac_power As String = camera_status.Get(\"ac_p";
Debug.ShouldStop(16777216);
_ac_power = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ac_power")))));Debug.locals.put("ac_power", _ac_power);Debug.locals.put("ac_power", _ac_power);
 BA.debugLineNum = 571;BA.debugLine="clv.Clear";
Debug.ShouldStop(67108864);
_clv.runVoidMethod ("_clear");
 BA.debugLineNum = 572;BA.debugLine="clv.AddTextItem(\"Battery voltage: \" & NumberForm";
Debug.ShouldStop(134217728);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Battery voltage: "),main.__c.runMethod(true,"NumberFormat",(Object)((RemoteObject.solve(new RemoteObject[] {_battery_voltage,RemoteObject.createImmutable(100)}, "/",0, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))),RemoteObject.createImmutable("V - "),_checkbattlife(_battery_voltage)))),(Object)((RemoteObject.createImmutable("battery_voltage"))));
 BA.debugLineNum = 573;BA.debugLine="clv.AddTextItem(\"Camera to WiFi strength: \" & wi";
Debug.ShouldStop(268435456);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Camera to WiFi strength: "),_wifi_strength,RemoteObject.createImmutable(" - "),_checklfrlevel(_wifi_strength)))),(Object)((RemoteObject.createImmutable("wifi_strength"))));
 BA.debugLineNum = 574;BA.debugLine="clv.AddTextItem(\"Camera to Sync Module strength";
Debug.ShouldStop(536870912);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Camera to Sync Module strength (LFR): "),_lfr_strength,RemoteObject.createImmutable(" - "),_checklfrlevel(_lfr_strength)))),(Object)((RemoteObject.createImmutable("lfr_strength"))));
 BA.debugLineNum = 575;BA.debugLine="clv.AddTextItem(\"Temperature: \" & temperature &";
Debug.ShouldStop(1073741824);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Temperature: "),_temperature,RemoteObject.createImmutable("ºF")))),(Object)((RemoteObject.createImmutable("temperature"))));
 BA.debugLineNum = 576;BA.debugLine="clv.AddTextItem(\"Firmware version: \" & fw_versio";
Debug.ShouldStop(-2147483648);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Firmware version: "),_fw_version))),(Object)((RemoteObject.createImmutable("fw_version"))));
 BA.debugLineNum = 577;BA.debugLine="clv.AddTextItem(\"Firmware Git Hash: \" & fw_git_h";
Debug.ShouldStop(1);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Firmware Git Hash: "),_fw_git_hash))),(Object)((RemoteObject.createImmutable("fw_git_hash"))));
 BA.debugLineNum = 578;BA.debugLine="clv.AddTextItem(\"Battery alert status: \" & batte";
Debug.ShouldStop(2);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Battery alert status: "),_battery_alert_status))),(Object)((RemoteObject.createImmutable("battery_alert_status"))));
 BA.debugLineNum = 579;BA.debugLine="clv.AddTextItem(\"Temperature alert status: \" & t";
Debug.ShouldStop(4);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Temperature alert status: "),_temp_alert_status))),(Object)((RemoteObject.createImmutable("temp_alert_status"))));
 BA.debugLineNum = 580;BA.debugLine="clv.AddTextItem(\"Updated at: \" & updated_at, \"up";
Debug.ShouldStop(8);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Updated at: "),_updated_at))),(Object)((RemoteObject.createImmutable("updated_at"))));
 BA.debugLineNum = 581;BA.debugLine="clv.AddTextItem(\"Created at: \" & created_at, \"cr";
Debug.ShouldStop(16);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Created at: "),_created_at))),(Object)((RemoteObject.createImmutable("created_at"))));
 BA.debugLineNum = 582;BA.debugLine="clv.AddTextItem(\"IP address: \" & ip_address, \"ip";
Debug.ShouldStop(32);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("IP address: "),_ip_address))),(Object)((RemoteObject.createImmutable("ip_address"))));
 BA.debugLineNum = 583;BA.debugLine="clv.AddTextItem(\"MAC address: \" & mac, \"mac\")";
Debug.ShouldStop(64);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("MAC address: "),_mac))),(Object)((RemoteObject.createImmutable("mac"))));
 BA.debugLineNum = 584;BA.debugLine="clv.AddTextItem(\"Camera ID: \" & camera_id, \"came";
Debug.ShouldStop(128);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Camera ID: "),_camera_id))),(Object)((RemoteObject.createImmutable("camera_id"))));
 BA.debugLineNum = 585;BA.debugLine="clv.AddTextItem(\"Serial: \" & serial, \"serial\")";
Debug.ShouldStop(256);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Serial: "),_serial))),(Object)((RemoteObject.createImmutable("serial"))));
 BA.debugLineNum = 586;BA.debugLine="clv.AddTextItem(\"Network ID: \" & network_id, \"ne";
Debug.ShouldStop(512);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Network ID: "),_network_id))),(Object)((RemoteObject.createImmutable("network_id"))));
 BA.debugLineNum = 587;BA.debugLine="clv.AddTextItem(\"Account ID: \" & account_id, \"ac";
Debug.ShouldStop(1024);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Account ID: "),_account_id))),(Object)((RemoteObject.createImmutable("account_id"))));
 BA.debugLineNum = 588;BA.debugLine="clv.AddTextItem(\"ID: \" & id, \"id\")";
Debug.ShouldStop(2048);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("ID: "),_id))),(Object)((RemoteObject.createImmutable("id"))));
 BA.debugLineNum = 589;BA.debugLine="clv.AddTextItem(\"Sync Module ID: \" & sync_module";
Debug.ShouldStop(4096);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Sync Module ID: "),_sync_module_id))),(Object)((RemoteObject.createImmutable("sync_module_id"))));
 BA.debugLineNum = 590;BA.debugLine="clv.AddTextItem(\"Light sensor data valid: \" & li";
Debug.ShouldStop(8192);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Light sensor data valid: "),_light_sensor_data_valid))),(Object)((RemoteObject.createImmutable("light_sensor_data_valid"))));
 BA.debugLineNum = 591;BA.debugLine="clv.AddTextItem(\"DHCP failure count: \" & dhcp_fa";
Debug.ShouldStop(16384);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("DHCP failure count: "),_dhcp_failure_count))),(Object)((RemoteObject.createImmutable("dhcp_failure_count"))));
 BA.debugLineNum = 592;BA.debugLine="clv.AddTextItem(\"LFR tb wakeups: \" & lfr_tb_wake";
Debug.ShouldStop(32768);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("LFR tb wakeups: "),_lfr_tb_wakeups))),(Object)((RemoteObject.createImmutable("lfr_tb_wakeups"))));
 BA.debugLineNum = 593;BA.debugLine="clv.AddTextItem(\"Socket failure count: \" & socke";
Debug.ShouldStop(65536);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Socket failure count: "),_socket_failure_count))),(Object)((RemoteObject.createImmutable("socket_failure_count"))));
 BA.debugLineNum = 594;BA.debugLine="clv.AddTextItem(\"Camera thumbnail: \" & cameraThu";
Debug.ShouldStop(131072);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Camera thumbnail: "),main._camerathumbnail))),(Object)((RemoteObject.createImmutable("thumbnail"))));
 BA.debugLineNum = 595;BA.debugLine="clv.AddTextItem(\"WiFi connect failure count: \" &";
Debug.ShouldStop(262144);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("WiFi connect failure count: "),_wifi_connect_failure_count))),(Object)((RemoteObject.createImmutable("wifi_connect_failure_count"))));
 BA.debugLineNum = 596;BA.debugLine="clv.AddTextItem(\"Error codes: \" & error_codes, \"";
Debug.ShouldStop(524288);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Error codes: "),_error_codes))),(Object)((RemoteObject.createImmutable("error_codes"))));
 BA.debugLineNum = 597;BA.debugLine="clv.AddTextItem(\"AC power: \" & ac_power, \"ac_pow";
Debug.ShouldStop(1048576);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("AC power: "),_ac_power))),(Object)((RemoteObject.createImmutable("ac_power"))));
 BA.debugLineNum = 598;BA.debugLine="clv.AddTextItem(\"Total 108 wakeups: \" & total_10";
Debug.ShouldStop(2097152);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Total 108 wakeups: "),_total_108_wakeups))),(Object)((RemoteObject.createImmutable("total_108_wakeups"))));
 BA.debugLineNum = 599;BA.debugLine="clv.AddTextItem(\"Total Tb wakeups: \" & total_tb_";
Debug.ShouldStop(4194304);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Total Tb wakeups: "),_total_tb_wakeups))),(Object)((RemoteObject.createImmutable("total_tb_wakeups"))));
 BA.debugLineNum = 600;BA.debugLine="clv.AddTextItem(\"Light sensor ch0: \" & light_sen";
Debug.ShouldStop(8388608);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Light sensor ch0: "),_light_sensor_ch0))),(Object)((RemoteObject.createImmutable("light_sensor_ch0"))));
 BA.debugLineNum = 601;BA.debugLine="clv.AddTextItem(\"Unit number: \" & unit_number, \"";
Debug.ShouldStop(16777216);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Unit number: "),_unit_number))),(Object)((RemoteObject.createImmutable("unit_number"))));
 BA.debugLineNum = 602;BA.debugLine="clv.AddTextItem(\"Light sensor ch1: \" & light_sen";
Debug.ShouldStop(33554432);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Light sensor ch1: "),_light_sensor_ch1))),(Object)((RemoteObject.createImmutable("light_sensor_ch1"))));
 BA.debugLineNum = 603;BA.debugLine="clv.AddTextItem(\"Time dhcp lease: \" & time_dhcp_";
Debug.ShouldStop(67108864);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Time dhcp lease: "),_time_dhcp_lease))),(Object)((RemoteObject.createImmutable("time_dhcp_lease"))));
 BA.debugLineNum = 604;BA.debugLine="clv.AddTextItem(\"Time first video: \" & time_firs";
Debug.ShouldStop(134217728);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Time first video: "),_time_first_video))),(Object)((RemoteObject.createImmutable("time_first_video"))));
 BA.debugLineNum = 605;BA.debugLine="clv.AddTextItem(\"Time dns resolve: \" & time_dns_";
Debug.ShouldStop(268435456);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Time dns resolve: "),_time_dns_resolve))),(Object)((RemoteObject.createImmutable("time_dns_resolve"))));
 BA.debugLineNum = 606;BA.debugLine="clv.AddTextItem(\"Time 108 boot: \" & time_108_boo";
Debug.ShouldStop(536870912);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Time 108 boot: "),_time_108_boot))),(Object)((RemoteObject.createImmutable("time_108_boot"))));
 BA.debugLineNum = 607;BA.debugLine="clv.AddTextItem(\"LFR 108 wakeups: \" & lfr_108_wa";
Debug.ShouldStop(1073741824);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("LFR 108 wakeups: "),_lfr_108_wakeups))),(Object)((RemoteObject.createImmutable("lfr_108_wakeups"))));
 BA.debugLineNum = 608;BA.debugLine="clv.AddTextItem(\"lifetime duration: \" & lifetime";
Debug.ShouldStop(-2147483648);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("lifetime duration: "),_lifetime_duration))),(Object)((RemoteObject.createImmutable("lifetime_duration"))));
 BA.debugLineNum = 609;BA.debugLine="clv.AddTextItem(\"lpv: \" & ipv, \"ipv\")";
Debug.ShouldStop(1);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("lpv: "),_ipv))),(Object)((RemoteObject.createImmutable("ipv"))));
 BA.debugLineNum = 610;BA.debugLine="clv.AddTextItem(\"light sensor data new: \" & ligh";
Debug.ShouldStop(2);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("light sensor data new: "),_light_sensor_data_new))),(Object)((RemoteObject.createImmutable("light_sensor_data_new"))));
 BA.debugLineNum = 611;BA.debugLine="clv.AddTextItem(\"Dev_1: \" & dev_1, \"dev_1\")";
Debug.ShouldStop(4);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Dev_1: "),_dev_1))),(Object)((RemoteObject.createImmutable("dev_1"))));
 BA.debugLineNum = 612;BA.debugLine="clv.AddTextItem(\"Dev_2: \" & dev_2, \"dev_2\")";
Debug.ShouldStop(8);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Dev_2: "),_dev_2))),(Object)((RemoteObject.createImmutable("dev_2"))));
 BA.debugLineNum = 613;BA.debugLine="clv.AddTextItem(\"Dev_3: \" & dev_3, \"dev_3\")";
Debug.ShouldStop(16);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Dev_3: "),_dev_3))),(Object)((RemoteObject.createImmutable("dev_3"))));
 BA.debugLineNum = 614;BA.debugLine="clv.AddTextItem(\"Time wlan connect: \" & time_wla";
Debug.ShouldStop(32);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Time wlan connect: "),_time_wlan_connect))),(Object)((RemoteObject.createImmutable("time_wlan_connect"))));
 BA.debugLineNum = 615;BA.debugLine="clv.AddTextItem(\"PIR rejections: \" & pir_rejecti";
Debug.ShouldStop(64);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("PIR rejections: "),_pir_rejections))),(Object)((RemoteObject.createImmutable("pir_rejections"))));
 BA.debugLineNum = 616;BA.debugLine="clv.AddTextItem(\"Lifetime count: \" & lifetime_co";
Debug.ShouldStop(128);
_clv.runVoidMethod ("_addtextitem",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Lifetime count: "),_lifetime_count))),(Object)((RemoteObject.createImmutable("lifetime_count"))));
 BA.debugLineNum = 618;BA.debugLine="For i = 0 To clv.Size-1";
Debug.ShouldStop(512);
{
final int step98 = 1;
final int limit98 = RemoteObject.solve(new RemoteObject[] {_clv.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step98 > 0 && _i <= limit98) || (step98 < 0 && _i >= limit98) ;_i = ((int)(0 + _i + step98))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 619;BA.debugLine="Dim item As String";
Debug.ShouldStop(1024);
_item = RemoteObject.createImmutable("");Debug.locals.put("item", _item);
 BA.debugLineNum = 620;BA.debugLine="item = clv.GetValue(i)";
Debug.ShouldStop(2048);
_item = BA.ObjectToString(_clv.runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("item", _item);
 BA.debugLineNum = 621;BA.debugLine="If item.Contains(\"thumbnail\") Then";
Debug.ShouldStop(4096);
if (_item.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("thumbnail"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 622;BA.debugLine="clv.ResizeItem(i,80dip)";
Debug.ShouldStop(8192);
_clv.runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(main.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))));
 }else {
 BA.debugLineNum = 624;BA.debugLine="clv.ResizeItem(i,35dip)";
Debug.ShouldStop(32768);
_clv.runVoidMethod ("_resizeitem",(Object)(BA.numberCast(int.class, _i)),(Object)(main.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))));
 };
 }
}Debug.locals.put("i", _i);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e108) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e108.toString()); BA.debugLineNum = 628;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 629;BA.debugLine="lblStatus.Text = \"GetCameraInfo LastException: \"";
Debug.ShouldStop(1048576);
main._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("GetCameraInfo LastException: "),main.__c.runMethod(false,"LastException",main.ba)));
 };
 BA.debugLineNum = 631;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("GetCommandID (main) ","main",0,main.ba,main.mostCurrent,458);
if (RapidSub.canDelegate("getcommandid")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","getcommandid", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("json", _json);
 BA.debugLineNum = 458;BA.debugLine="Sub GetCommandID(json As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 459;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 460;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2048);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 461;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(4096);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 462;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(8192);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 477;BA.debugLine="commandID = root.Get(\"id\")";
Debug.ShouldStop(268435456);
main._commandid = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));
 BA.debugLineNum = 478;BA.debugLine="Log(\"commandID: \" & commandID)";
Debug.ShouldStop(536870912);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("commandID: "),main._commandid)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e8.toString()); BA.debugLineNum = 500;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 501;BA.debugLine="lblStatus.Text = \"GetCommandID LastException: \"";
Debug.ShouldStop(1048576);
main._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("GetCommandID LastException: "),main.__c.runMethod(false,"LastException",main.ba)));
 };
 BA.debugLineNum = 503;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetCommandStatus (main) ","main",0,main.ba,main.mostCurrent,505);
if (RapidSub.canDelegate("getcommandstatus")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","getcommandstatus", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("json", _json);
 BA.debugLineNum = 505;BA.debugLine="Sub GetCommandStatus(json As String)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 506;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 507;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(67108864);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 508;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(134217728);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 509;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(268435456);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 510;BA.debugLine="commandComplete = root.Get(\"complete\")";
Debug.ShouldStop(536870912);
main._commandcomplete = BA.ObjectToBoolean(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("complete")))));
 BA.debugLineNum = 511;BA.debugLine="Log(\"commandComplete: \" & commandComplete)";
Debug.ShouldStop(1073741824);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("commandComplete: "),main._commandcomplete)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e8.toString()); BA.debugLineNum = 513;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 514;BA.debugLine="lblStatus.Text = \"GetCommandStatus LastException";
Debug.ShouldStop(2);
main._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("GetCommandStatus LastException: "),main.__c.runMethod(false,"LastException",main.ba)));
 };
 BA.debugLineNum = 516;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("GetSyncModuleInfo (main) ","main",0,main.ba,main.mostCurrent,633);
if (RapidSub.canDelegate("getsyncmoduleinfo")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","getsyncmoduleinfo", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _syncmodule = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _wifi_strength = RemoteObject.createImmutable(0);
RemoteObject _os_version = RemoteObject.createImmutable("");
RemoteObject _fw_version = RemoteObject.createImmutable("");
RemoteObject _status = RemoteObject.createImmutable("");
Debug.locals.put("json", _json);
 BA.debugLineNum = 633;BA.debugLine="Sub GetSyncModuleInfo(json As String)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 634;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 635;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(67108864);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 636;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(134217728);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 637;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(268435456);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 638;BA.debugLine="Dim syncmodule As Map = root.Get(\"syncmodule\")";
Debug.ShouldStop(536870912);
_syncmodule = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_syncmodule.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("syncmodule")))));Debug.locals.put("syncmodule", _syncmodule);
 BA.debugLineNum = 642;BA.debugLine="Dim wifi_strength As Int = syncmodule.Get(\"wifi_";
Debug.ShouldStop(2);
_wifi_strength = BA.numberCast(int.class, _syncmodule.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("wifi_strength")))));Debug.locals.put("wifi_strength", _wifi_strength);Debug.locals.put("wifi_strength", _wifi_strength);
 BA.debugLineNum = 643;BA.debugLine="Dim os_version As String = syncmodule.Get(\"os_ve";
Debug.ShouldStop(4);
_os_version = BA.ObjectToString(_syncmodule.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("os_version")))));Debug.locals.put("os_version", _os_version);Debug.locals.put("os_version", _os_version);
 BA.debugLineNum = 660;BA.debugLine="Dim fw_version As String = syncmodule.Get(\"fw_ve";
Debug.ShouldStop(524288);
_fw_version = BA.ObjectToString(_syncmodule.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fw_version")))));Debug.locals.put("fw_version", _fw_version);Debug.locals.put("fw_version", _fw_version);
 BA.debugLineNum = 662;BA.debugLine="Dim status As String = syncmodule.Get(\"status\")";
Debug.ShouldStop(2097152);
_status = BA.ObjectToString(_syncmodule.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 663;BA.debugLine="lblSyncModule.Text = \"Sync Module is \" & status";
Debug.ShouldStop(4194304);
main._lblsyncmodule.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Sync Module is "),_status,RemoteObject.createImmutable(" | Wifi Strength: "),_wifi_strength,RemoteObject.createImmutable(" bars | Firmware version: "),_fw_version,RemoteObject.createImmutable(" | OS version: "),_os_version));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e12.toString()); BA.debugLineNum = 665;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 666;BA.debugLine="lblStatus.Text = \"GetSyncModuleInfo LastExceptio";
Debug.ShouldStop(33554432);
main._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("GetSyncModuleInfo LastException: "),main.__c.runMethod(false,"LastException",main.ba)));
 };
 BA.debugLineNum = 668;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("GetUserInfo (main) ","main",0,main.ba,main.mostCurrent,400);
if (RapidSub.canDelegate("getuserinfo")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","getuserinfo", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("json", _json);
 BA.debugLineNum = 400;BA.debugLine="Sub GetUserInfo(json As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 401;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 402;BA.debugLine="lblStatus.Text = \"Getting user information...\"";
Debug.ShouldStop(131072);
main._lblstatus.runMethod(true,"setText",BA.ObjectToString("Getting user information..."));
 BA.debugLineNum = 403;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(262144);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 404;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(524288);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 405;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(1048576);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 420;BA.debugLine="accountID = root.Get(\"account_id\") '88438";
Debug.ShouldStop(8);
main._accountid = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("account_id")))));
 BA.debugLineNum = 421;BA.debugLine="Log(\"accountID: \" &  accountID)";
Debug.ShouldStop(16);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("accountID: "),main._accountid)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e9.toString()); BA.debugLineNum = 424;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 425;BA.debugLine="lblStatus.Text = \"GetUserInfo LastException: \" &";
Debug.ShouldStop(256);
main._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("GetUserInfo LastException: "),main.__c.runMethod(false,"LastException",main.ba)));
 };
 BA.debugLineNum = 427;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ivClose_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,730);
if (RapidSub.canDelegate("ivclose_mouseclicked")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","ivclose_mouseclicked", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 730;BA.debugLine="Private Sub ivClose_MouseClicked (EventData As Mou";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 731;BA.debugLine="File.Delete(File.DirApp, \"Driveway.jpg\")";
Debug.ShouldStop(67108864);
main.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("Driveway.jpg")));
 BA.debugLineNum = 732;BA.debugLine="File.Delete(File.DirApp, \"FrontDoor.jpg\")";
Debug.ShouldStop(134217728);
main.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("FrontDoor.jpg")));
 BA.debugLineNum = 733;BA.debugLine="File.Delete(File.DirApp, \"SideYard.jpg\")";
Debug.ShouldStop(268435456);
main.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("SideYard.jpg")));
 BA.debugLineNum = 734;BA.debugLine="ExitApplication";
Debug.ShouldStop(536870912);
main.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 735;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ivDriveway_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,855);
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
RemoteObject _mf = RemoteObject.declareNull("cloyd.blink.frmmedia");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ivDriveway_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,855);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 856;BA.debugLine="Dim mf As frmMedia";
Debug.ShouldStop(8388608);
_mf = RemoteObject.createNew ("cloyd.blink.frmmedia");Debug.locals.put("mf", _mf);
 BA.debugLineNum = 857;BA.debugLine="mf.Initialize(MainForm)";
Debug.ShouldStop(16777216);
_mf.runClassMethod (cloyd.blink.frmmedia.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(parent._mainform));
 BA.debugLineNum = 858;BA.debugLine="mf.url=$\"    <h1>Driveway</h1>    <img src=\"${Fil";
Debug.ShouldStop(33554432);
_mf.setField ("_url" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("   <h1>Driveway</h1>\n"),RemoteObject.createImmutable("   <img src=\""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("Driveway.jpg")))))),RemoteObject.createImmutable("\"/>\n"),RemoteObject.createImmutable("   \n"),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 863;BA.debugLine="mf.Show";
Debug.ShouldStop(1073741824);
_mf.runClassMethod (cloyd.blink.frmmedia.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 864;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
Debug.CheckDeviceExceptions();if (true) return ;
 BA.debugLineNum = 902;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia-s";
Debug.ShouldStop(32);
_restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/api/v1/accounts/88438/media/changed?since=2019-04-19T23:11:20+0000&page=1")));
 BA.debugLineNum = 904;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "ivdriveway_mouseclicked"),BA.numberCast(int.class, 1000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 905;BA.debugLine="Log(response)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("Log",(Object)(parent._response));
 BA.debugLineNum = 906;BA.debugLine="File.WriteString(File.DirApp,\"response.txt\",respo";
Debug.ShouldStop(512);
parent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("response.txt")),(Object)(parent._response));
 BA.debugLineNum = 937;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
public static RemoteObject  _ivfrontdoor_mouseclicked(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("ivFrontDoor_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,939);
if (RapidSub.canDelegate("ivfrontdoor_mouseclicked")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","ivfrontdoor_mouseclicked", _eventdata);}
RemoteObject _mf = RemoteObject.declareNull("cloyd.blink.frmmedia");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 939;BA.debugLine="Sub ivFrontDoor_MouseClicked (EventData As MouseEv";
Debug.ShouldStop(1024);
 BA.debugLineNum = 940;BA.debugLine="Dim mf As frmMedia";
Debug.ShouldStop(2048);
_mf = RemoteObject.createNew ("cloyd.blink.frmmedia");Debug.locals.put("mf", _mf);
 BA.debugLineNum = 941;BA.debugLine="mf.Initialize(MainForm)";
Debug.ShouldStop(4096);
_mf.runClassMethod (cloyd.blink.frmmedia.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(main._mainform));
 BA.debugLineNum = 942;BA.debugLine="mf.url=$\"    <h1>Front Door</h1>    <img src=\"${F";
Debug.ShouldStop(8192);
_mf.setField ("_url" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("   <h1>Front Door</h1>\n"),RemoteObject.createImmutable("   <img src=\""),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("FrontDoor.jpg")))))),RemoteObject.createImmutable("\"/>\n"),RemoteObject.createImmutable("   \n"),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 947;BA.debugLine="mf.Show";
Debug.ShouldStop(262144);
_mf.runClassMethod (cloyd.blink.frmmedia.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 948;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("ivMax_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,753);
if (RapidSub.canDelegate("ivmax_mouseclicked")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","ivmax_mouseclicked", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 753;BA.debugLine="Private Sub ivMax_MouseClicked (EventData As Mouse";
Debug.ShouldStop(65536);
 BA.debugLineNum = 755;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ivMin_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,773);
if (RapidSub.canDelegate("ivmin_mouseclicked")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","ivmin_mouseclicked", _eventdata);}
RemoteObject _jmf = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _stage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 773;BA.debugLine="Private Sub ivMin_MouseClicked (EventData As Mouse";
Debug.ShouldStop(16);
 BA.debugLineNum = 774;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 775;BA.debugLine="Dim jmf As JavaObject = MainForm";
Debug.ShouldStop(64);
_jmf = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jmf.setObject(main._mainform);Debug.locals.put("jmf", _jmf);
 BA.debugLineNum = 776;BA.debugLine="Dim stage As JavaObject = jmf.GetField(\"stage\")";
Debug.ShouldStop(128);
_stage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_stage.setObject(_jmf.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("stage", _stage);
 BA.debugLineNum = 777;BA.debugLine="stage.RunMethod(\"setIconified\", Array As Object(";
Debug.ShouldStop(256);
_stage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setIconified")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(main.__c.getField(true,"True"))})));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e6.toString()); BA.debugLineNum = 779;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 781;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ivSideYard_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,950);
if (RapidSub.canDelegate("ivsideyard_mouseclicked")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","ivsideyard_mouseclicked", _eventdata);}
RemoteObject _mf = RemoteObject.declareNull("cloyd.blink.frmmedia");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 950;BA.debugLine="Sub ivSideYard_MouseClicked (EventData As MouseEve";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 951;BA.debugLine="Dim mf As frmMedia";
Debug.ShouldStop(4194304);
_mf = RemoteObject.createNew ("cloyd.blink.frmmedia");Debug.locals.put("mf", _mf);
 BA.debugLineNum = 952;BA.debugLine="mf.Initialize(MainForm)";
Debug.ShouldStop(8388608);
_mf.runClassMethod (cloyd.blink.frmmedia.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(main._mainform));
 BA.debugLineNum = 953;BA.debugLine="mf.url=$\"    <h1>Side Yard</h1>    <img src=\"${Fi";
Debug.ShouldStop(16777216);
_mf.setField ("_url" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("   <h1>Side Yard</h1>\n"),RemoteObject.createImmutable("   <img src=\""),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("SideYard.jpg")))))),RemoteObject.createImmutable("\"/>\n"),RemoteObject.createImmutable("   \n"),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 958;BA.debugLine="mf.Show";
Debug.ShouldStop(536870912);
_mf.runClassMethod (cloyd.blink.frmmedia.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 959;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("lbTitle_MouseDragged (main) ","main",0,main.ba,main.mostCurrent,710);
if (RapidSub.canDelegate("lbtitle_mousedragged")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","lbtitle_mousedragged", _eventdata);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 710;BA.debugLine="Private Sub lbTitle_MouseDragged (EventData As Mou";
Debug.ShouldStop(32);
 BA.debugLineNum = 711;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 712;BA.debugLine="If isMaximized Then Return";
Debug.ShouldStop(128);
if (main._ismaximized.<Boolean>get().booleanValue()) { 
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 713;BA.debugLine="Dim jo As JavaObject = EventData";
Debug.ShouldStop(256);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(_eventdata.getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 714;BA.debugLine="MainForm.WindowLeft = jo.RunMethod(\"getScreenX\",";
Debug.ShouldStop(512);
main._mainform.runMethod(true,"setWindowLeft",RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getScreenX")),(Object)((main.__c.getField(false,"Null"))))),main._xmouse}, "-",1, 0));
 BA.debugLineNum = 715;BA.debugLine="MainForm.WindowTop = jo.RunMethod(\"getScreenY\",";
Debug.ShouldStop(1024);
main._mainform.runMethod(true,"setWindowTop",RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getScreenY")),(Object)((main.__c.getField(false,"Null"))))),main._ymouse}, "-",1, 0));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e7.toString()); BA.debugLineNum = 717;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 719;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("lbTitle_MousePressed (main) ","main",0,main.ba,main.mostCurrent,721);
if (RapidSub.canDelegate("lbtitle_mousepressed")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","lbtitle_mousepressed", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 721;BA.debugLine="Private Sub lbTitle_MousePressed (EventData As Mou";
Debug.ShouldStop(65536);
 BA.debugLineNum = 722;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 723;BA.debugLine="xMouse = EventData.X + lbTitle.Left + 15";
Debug.ShouldStop(262144);
main._xmouse = RemoteObject.solve(new RemoteObject[] {_eventdata.runMethod(true,"getX"),main._lbtitle.runMethod(true,"getLeft"),RemoteObject.createImmutable(15)}, "++",2, 0);
 BA.debugLineNum = 724;BA.debugLine="yMouse = EventData.Y + lbTitle.Top + 15";
Debug.ShouldStop(524288);
main._ymouse = RemoteObject.solve(new RemoteObject[] {_eventdata.runMethod(true,"getY"),main._lbtitle.runMethod(true,"getTop"),RemoteObject.createImmutable(15)}, "++",2, 0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e5.toString()); BA.debugLineNum = 726;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 728;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Max_Entered_Event (main) ","main",0,main.ba,main.mostCurrent,757);
if (RapidSub.canDelegate("max_entered_event")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","max_entered_event", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 757;BA.debugLine="Private Sub Max_Entered_Event(e As Event)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 758;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 759;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
Debug.ShouldStop(4194304);
main._ivmax.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable("_btMaxEnt.png")))).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e4.toString()); BA.debugLineNum = 761;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 763;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Max_Exited_Event (main) ","main",0,main.ba,main.mostCurrent,765);
if (RapidSub.canDelegate("max_exited_event")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","max_exited_event", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 765;BA.debugLine="Private Sub Max_Exited_Event(e As Event)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 766;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 767;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
Debug.ShouldStop(1073741824);
main._ivmax.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable("_btMax.png")))).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e4.toString()); BA.debugLineNum = 769;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 771;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Min_Entered_Event (main) ","main",0,main.ba,main.mostCurrent,783);
if (RapidSub.canDelegate("min_entered_event")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","min_entered_event", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 783;BA.debugLine="Private Sub Min_Entered_Event(e As Event)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 784;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 785;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
Debug.ShouldStop(65536);
main._ivmin.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable("_btMinEnt.png")))).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e4.toString()); BA.debugLineNum = 787;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 789;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Min_Exited_Event (main) ","main",0,main.ba,main.mostCurrent,791);
if (RapidSub.canDelegate("min_exited_event")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","min_exited_event", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 791;BA.debugLine="Private Sub Min_Exited_Event(e As Event)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 792;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 793;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
Debug.ShouldStop(16777216);
main._ivmin.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable("_btMin.png")))).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e4.toString()); BA.debugLineNum = 795;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 797;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
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
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 9;BA.debugLine="Private emailAddress As String = \"antimone2001@ho";
main._emailaddress = BA.ObjectToString("[redacted] # replace with 'examplePass' instead");
 //BA.debugLineNum = 10;BA.debugLine="Private password As String = \"[redacted] # replace with the empty string\"";
main._password = BA.ObjectToString("[redacted] # replace with the empty string");
 //BA.debugLineNum = 11;BA.debugLine="Private authToken As String";
main._authtoken = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Private userRegion As String";
main._userregion = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Private accountID As String";
main._accountid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Private networkID As String";
main._networkid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="Private commandID As String";
main._commandid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="Private commandComplete As Boolean";
main._commandcomplete = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 17;BA.debugLine="Private cameraThumbnail As String";
main._camerathumbnail = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 19;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 20;BA.debugLine="Private lbTitle As Label 'ignore";
main._lbtitle = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private xMouse, yMouse As Double";
main._xmouse = RemoteObject.createImmutable(0);
main._ymouse = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 22;BA.debugLine="Private isMaximized As Boolean = False";
main._ismaximized = main.__c.getField(true,"False");
 //BA.debugLineNum = 23;BA.debugLine="Private ivClose As ImageView";
main._ivclose = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ivMax As ImageView";
main._ivmax = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ivMin As ImageView";
main._ivmin = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private AtualSkin As String";
main._atualskin = RemoteObject.createImmutable("");
 //BA.debugLineNum = 27;BA.debugLine="Private imgInit As String";
main._imginit = RemoteObject.createImmutable("");
 //BA.debugLineNum = 28;BA.debugLine="Private isMaximized As Boolean = False";
main._ismaximized = main.__c.getField(true,"False");
 //BA.debugLineNum = 29;BA.debugLine="Private f_X, f_Y, f_W, f_H As Double 'ignore";
main._f_x = RemoteObject.createImmutable(0);
main._f_y = RemoteObject.createImmutable(0);
main._f_w = RemoteObject.createImmutable(0);
main._f_h = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 30;BA.debugLine="Private btnDriveway As Button 'ignore";
main._btndriveway = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private response As String";
main._response = RemoteObject.createImmutable("");
 //BA.debugLineNum = 32;BA.debugLine="Private ivDriveway As ImageView";
main._ivdriveway = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private lblStatus As Label 'ignore";
main._lblstatus = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private ivFrontDoor As ImageView";
main._ivfrontdoor = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private ivSideYard As ImageView";
main._ivsideyard = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private lblDriveway As Label 'ignore";
main._lbldriveway = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private lblFrontDoor As Label 'ignore";
main._lblfrontdoor = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private lblSideYard As Label 'ignore";
main._lblsideyard = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private clvDriveway As CustomListView";
main._clvdriveway = RemoteObject.createNew ("b4j.example.customlistview");
 //BA.debugLineNum = 40;BA.debugLine="Private clvFrontDoor As CustomListView";
main._clvfrontdoor = RemoteObject.createNew ("b4j.example.customlistview");
 //BA.debugLineNum = 41;BA.debugLine="Private clvSideYard As CustomListView";
main._clvsideyard = RemoteObject.createNew ("b4j.example.customlistview");
 //BA.debugLineNum = 42;BA.debugLine="Private lblSyncModule As Label 'ignore";
main._lblsyncmodule = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 44;BA.debugLine="Private btnActivity As Button";
main._btnactivity = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _refreshcameras(RemoteObject _firstrun) throws Exception{
try {
		Debug.PushSubsStack("RefreshCameras (main) ","main",0,main.ba,main.mostCurrent,172);
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
RemoteObject _link = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _strtimestamp = RemoteObject.createImmutable("");
RemoteObject group13;
int index13;
int groupLen13;
int step50;
int limit50;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RefreshCameras (main) ","main",0,main.ba,main.mostCurrent,172);
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
 BA.debugLineNum = 178;BA.debugLine="Try";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 179;BA.debugLine="Dim camera As String";
Debug.ShouldStop(262144);
_camera = RemoteObject.createImmutable("");Debug.locals.put("camera", _camera);
 BA.debugLineNum = 180;BA.debugLine="Dim iv As ImageView";
Debug.ShouldStop(524288);
_iv = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 181;BA.debugLine="Dim clv As CustomListView";
Debug.ShouldStop(1048576);
_clv = RemoteObject.createNew ("b4j.example.customlistview");Debug.locals.put("clv", _clv);
 BA.debugLineNum = 182;BA.debugLine="Dim links As List";
Debug.ShouldStop(2097152);
_links = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("links", _links);
 BA.debugLineNum = 183;BA.debugLine="links = Array(\"347574\", \"236967\", \"226821\")";
Debug.ShouldStop(4194304);
_links = parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable(("347574")),RemoteObject.createImmutable(("236967")),(RemoteObject.createImmutable("226821"))})));Debug.locals.put("links", _links);
 BA.debugLineNum = 185;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia-";
Debug.ShouldStop(16777216);
_restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/syncmodules")));
 BA.debugLineNum = 186;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"),BA.numberCast(int.class, 1000));
this.state = 75;
return;
case 75:
//C
this.state = 4;
;
 BA.debugLineNum = 187;BA.debugLine="GetSyncModuleInfo(response)";
Debug.ShouldStop(67108864);
_getsyncmoduleinfo(parent._response);
 BA.debugLineNum = 189;BA.debugLine="BlurIV(\"Driveway.jpg\",ivDriveway)";
Debug.ShouldStop(268435456);
_bluriv(BA.ObjectToString("Driveway.jpg"),parent._ivdriveway);
 BA.debugLineNum = 190;BA.debugLine="BlurIV(\"FrontDoor.jpg\",ivFrontDoor)";
Debug.ShouldStop(536870912);
_bluriv(BA.ObjectToString("FrontDoor.jpg"),parent._ivfrontdoor);
 BA.debugLineNum = 191;BA.debugLine="BlurIV(\"SideYard.jpg\",ivSideYard)";
Debug.ShouldStop(1073741824);
_bluriv(BA.ObjectToString("SideYard.jpg"),parent._ivsideyard);
 BA.debugLineNum = 193;BA.debugLine="For Each link As String In links";
Debug.ShouldStop(1);
if (true) break;

case 4:
//for
this.state = 71;
group13 = _links;
index13 = 0;
groupLen13 = group13.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("link", _link);
this.state = 76;
if (true) break;

case 76:
//C
this.state = 71;
if (index13 < groupLen13) {
this.state = 6;
_link = BA.ObjectToString(group13.runMethod(false,"Get",index13));Debug.locals.put("link", _link);}
if (true) break;

case 77:
//C
this.state = 76;
index13++;
Debug.locals.put("link", _link);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 194;BA.debugLine="camera = link";
Debug.ShouldStop(2);
_camera = _link;Debug.locals.put("camera", _camera);
 BA.debugLineNum = 195;BA.debugLine="If camera = \"347574\" Then";
Debug.ShouldStop(4);
if (true) break;

case 7:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("347574"))) { 
this.state = 9;
}else 
{ BA.debugLineNum = 199;BA.debugLine="Else If camera = \"236967\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("236967"))) { 
this.state = 11;
}else 
{ BA.debugLineNum = 203;BA.debugLine="Else If camera = \"226821\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("226821"))) { 
this.state = 13;
}}}
if (true) break;

case 9:
//C
this.state = 14;
 BA.debugLineNum = 196;BA.debugLine="lblStatus.Text = \"Capturing a new thumbnail fo";
Debug.ShouldStop(8);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Capturing a new thumbnail for the Driveway..."));
 BA.debugLineNum = 197;BA.debugLine="iv = ivDriveway";
Debug.ShouldStop(16);
_iv = parent._ivdriveway;Debug.locals.put("iv", _iv);
 BA.debugLineNum = 198;BA.debugLine="clv = clvDriveway";
Debug.ShouldStop(32);
_clv = parent._clvdriveway;Debug.locals.put("clv", _clv);
 if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 200;BA.debugLine="lblStatus.Text = \"Capturing a new thumbnail fo";
Debug.ShouldStop(128);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Capturing a new thumbnail for the Front Door..."));
 BA.debugLineNum = 201;BA.debugLine="iv = ivFrontDoor";
Debug.ShouldStop(256);
_iv = parent._ivfrontdoor;Debug.locals.put("iv", _iv);
 BA.debugLineNum = 202;BA.debugLine="clv = clvFrontDoor";
Debug.ShouldStop(512);
_clv = parent._clvfrontdoor;Debug.locals.put("clv", _clv);
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 204;BA.debugLine="lblStatus.Text = \"Capturing a new thumbnail fo";
Debug.ShouldStop(2048);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Capturing a new thumbnail for the Side Yard..."));
 BA.debugLineNum = 205;BA.debugLine="iv = ivSideYard";
Debug.ShouldStop(4096);
_iv = parent._ivsideyard;Debug.locals.put("iv", _iv);
 BA.debugLineNum = 206;BA.debugLine="clv = clvSideYard";
Debug.ShouldStop(8192);
_clv = parent._clvsideyard;Debug.locals.put("clv", _clv);
 if (true) break;
;
 BA.debugLineNum = 209;BA.debugLine="If FirstRun Then";
Debug.ShouldStop(65536);

case 14:
//if
this.state = 70;
if (_firstrun.<Boolean>get().booleanValue()) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 70;
 BA.debugLineNum = 211;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedi";
Debug.ShouldStop(262144);
_restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/camera/"),_camera));
 BA.debugLineNum = 212;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"),BA.numberCast(int.class, 1000));
this.state = 78;
return;
case 78:
//C
this.state = 70;
;
 BA.debugLineNum = 213;BA.debugLine="GetCameraInfo(response,clv)";
Debug.ShouldStop(1048576);
_getcamerainfo(parent._response,_clv);
 BA.debugLineNum = 214;BA.debugLine="DownloadImage(\"https://rest-\" & userRegion &\".";
Debug.ShouldStop(2097152);
_downloadimage(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/"),parent._camerathumbnail,RemoteObject.createImmutable(".jpg")),_iv,_camera);
 BA.debugLineNum = 215;BA.debugLine="lblStatus.Text = \"Ready\"";
Debug.ShouldStop(4194304);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Ready"));
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 217;BA.debugLine="RESTPost(\"https://rest-\" & userRegion &\".immed";
Debug.ShouldStop(16777216);
_restpost(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/camera/"),_camera,RemoteObject.createImmutable("/thumbnail")));
 BA.debugLineNum = 218;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"),BA.numberCast(int.class, 1000));
this.state = 79;
return;
case 79:
//C
this.state = 19;
;
 BA.debugLineNum = 219;BA.debugLine="If response.StartsWith(\"ERROR: \") Then";
Debug.ShouldStop(67108864);
if (true) break;

case 19:
//if
this.state = 69;
if (parent._response.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR: "))).<Boolean>get().booleanValue()) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 69;
 BA.debugLineNum = 220;BA.debugLine="Log(response)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("Log",(Object)(parent._response));
 BA.debugLineNum = 221;BA.debugLine="lblStatus.Text = response";
Debug.ShouldStop(268435456);
parent._lblstatus.runMethod(true,"setText",parent._response);
 BA.debugLineNum = 222;BA.debugLine="Return";
Debug.ShouldStop(536870912);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 224;BA.debugLine="GetCommandID(response)";
Debug.ShouldStop(-2147483648);
_getcommandid(parent._response);
 BA.debugLineNum = 225;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immed";
Debug.ShouldStop(1);
_restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/command/"),parent._commandid));
 BA.debugLineNum = 226;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"),BA.numberCast(int.class, 1000));
this.state = 80;
return;
case 80:
//C
this.state = 24;
;
 BA.debugLineNum = 227;BA.debugLine="If response.StartsWith(\"ERROR: \") Then";
Debug.ShouldStop(4);
if (true) break;

case 24:
//if
this.state = 68;
if (parent._response.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR: "))).<Boolean>get().booleanValue()) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 68;
 BA.debugLineNum = 228;BA.debugLine="Log(response)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("Log",(Object)(parent._response));
 BA.debugLineNum = 229;BA.debugLine="lblStatus.Text = response";
Debug.ShouldStop(16);
parent._lblstatus.runMethod(true,"setText",parent._response);
 BA.debugLineNum = 230;BA.debugLine="Return";
Debug.ShouldStop(32);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 232;BA.debugLine="For i = 1 To 30";
Debug.ShouldStop(128);
if (true) break;

case 29:
//for
this.state = 46;
step50 = 1;
limit50 = 30;
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 81;
if (true) break;

case 81:
//C
this.state = 46;
if ((step50 > 0 && _i <= limit50) || (step50 < 0 && _i >= limit50)) this.state = 31;
if (true) break;

case 82:
//C
this.state = 81;
_i = ((int)(0 + _i + step50)) ;
Debug.locals.put("i", _i);
if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 233;BA.debugLine="GetCommandStatus(response)";
Debug.ShouldStop(256);
_getcommandstatus(parent._response);
 BA.debugLineNum = 234;BA.debugLine="If commandComplete Then";
Debug.ShouldStop(512);
if (true) break;

case 32:
//if
this.state = 45;
if (parent._commandcomplete.<Boolean>get().booleanValue()) { 
this.state = 34;
}else {
this.state = 36;
}if (true) break;

case 34:
//C
this.state = 45;
 BA.debugLineNum = 235;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".im";
Debug.ShouldStop(1024);
_restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/camera/"),_camera));
 BA.debugLineNum = 236;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"),BA.numberCast(int.class, 1000));
this.state = 83;
return;
case 83:
//C
this.state = 45;
;
 BA.debugLineNum = 237;BA.debugLine="GetCameraInfo(response,clv)";
Debug.ShouldStop(4096);
_getcamerainfo(parent._response,_clv);
 BA.debugLineNum = 238;BA.debugLine="DownloadImage(\"https://rest-\" & userRegion";
Debug.ShouldStop(8192);
_downloadimage(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/"),parent._camerathumbnail,RemoteObject.createImmutable(".jpg")),_iv,_camera);
 BA.debugLineNum = 239;BA.debugLine="Exit";
Debug.ShouldStop(16384);
this.state = 46;
if (true) break;
 if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 241;BA.debugLine="If camera = \"347574\" Then";
Debug.ShouldStop(65536);
if (true) break;

case 37:
//if
this.state = 44;
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("347574"))) { 
this.state = 39;
}else 
{ BA.debugLineNum = 243;BA.debugLine="Else If camera = \"236967\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("236967"))) { 
this.state = 41;
}else 
{ BA.debugLineNum = 245;BA.debugLine="Else If camera = \"226821\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("226821"))) { 
this.state = 43;
}}}
if (true) break;

case 39:
//C
this.state = 44;
 BA.debugLineNum = 242;BA.debugLine="lblStatus.Text = \"Awaiting for the Drivew";
Debug.ShouldStop(131072);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Awaiting for the Driveway thumbnail... "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable("/30")));
 if (true) break;

case 41:
//C
this.state = 44;
 BA.debugLineNum = 244;BA.debugLine="lblStatus.Text = \"Awaiting for the Front";
Debug.ShouldStop(524288);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Awaiting for the Front Door thumbnail...  "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable("/30")));
 if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 246;BA.debugLine="lblStatus.Text = \"Awaiting for the Side Y";
Debug.ShouldStop(2097152);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Awaiting for the Side Yard thumbnail... "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable("/30")));
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
 BA.debugLineNum = 249;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".imm";
Debug.ShouldStop(16777216);
_restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/command/"),parent._commandid));
 BA.debugLineNum = 250;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"),BA.numberCast(int.class, 1000));
this.state = 84;
return;
case 84:
//C
this.state = 82;
;
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 252;BA.debugLine="If commandComplete = False Then";
Debug.ShouldStop(134217728);

case 46:
//if
this.state = 67;
if (RemoteObject.solveBoolean("=",parent._commandcomplete,parent.__c.getField(true,"False"))) { 
this.state = 48;
}else {
this.state = 58;
}if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 253;BA.debugLine="If camera = \"347574\" Then";
Debug.ShouldStop(268435456);
if (true) break;

case 49:
//if
this.state = 56;
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("347574"))) { 
this.state = 51;
}else 
{ BA.debugLineNum = 256;BA.debugLine="Else If camera = \"236967\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("236967"))) { 
this.state = 53;
}else 
{ BA.debugLineNum = 259;BA.debugLine="Else If camera = \"226821\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("226821"))) { 
this.state = 55;
}}}
if (true) break;

case 51:
//C
this.state = 56;
 BA.debugLineNum = 254;BA.debugLine="lblStatus.Text = \"Failed to retrieve Drive";
Debug.ShouldStop(536870912);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Failed to retrieve Driveway thumbnail..."));
 if (true) break;

case 53:
//C
this.state = 56;
 BA.debugLineNum = 257;BA.debugLine="lblStatus.Text = \"Failed to retrieve Front";
Debug.ShouldStop(1);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Failed to retrieve Front Door thumbnail..."));
 if (true) break;

case 55:
//C
this.state = 56;
 BA.debugLineNum = 260;BA.debugLine="lblStatus.Text = \"Failed to retrieve Side";
Debug.ShouldStop(8);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Failed to retrieve Side Yard thumbnail..."));
 if (true) break;

case 56:
//C
this.state = 67;
;
 if (true) break;

case 58:
//C
this.state = 59;
 BA.debugLineNum = 264;BA.debugLine="Dim strTimestamp As String";
Debug.ShouldStop(128);
_strtimestamp = RemoteObject.createImmutable("");Debug.locals.put("strTimestamp", _strtimestamp);
 BA.debugLineNum = 265;BA.debugLine="DateTime.DateFormat = \"h:mm:ss a\"";
Debug.ShouldStop(256);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("h:mm:ss a"));
 BA.debugLineNum = 266;BA.debugLine="strTimestamp = DateTime.Date(DateTime.Now)";
Debug.ShouldStop(512);
_strtimestamp = parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("strTimestamp", _strtimestamp);
 BA.debugLineNum = 267;BA.debugLine="lblStatus.Text = \"Last updated: \" & strTime";
Debug.ShouldStop(1024);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Last updated: "),_strtimestamp));
 BA.debugLineNum = 268;BA.debugLine="If camera = \"347574\" Then";
Debug.ShouldStop(2048);
if (true) break;

case 59:
//if
this.state = 66;
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("347574"))) { 
this.state = 61;
}else 
{ BA.debugLineNum = 270;BA.debugLine="Else If camera = \"236967\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("236967"))) { 
this.state = 63;
}else 
{ BA.debugLineNum = 272;BA.debugLine="Else If camera = \"226821\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("226821"))) { 
this.state = 65;
}}}
if (true) break;

case 61:
//C
this.state = 66;
 BA.debugLineNum = 269;BA.debugLine="lblDriveway.Text = \"Driveway \" & strTimest";
Debug.ShouldStop(4096);
parent._lbldriveway.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Driveway "),_strtimestamp));
 if (true) break;

case 63:
//C
this.state = 66;
 BA.debugLineNum = 271;BA.debugLine="lblFrontDoor.Text = \"Front Door \" & strTim";
Debug.ShouldStop(16384);
parent._lblfrontdoor.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Front Door "),_strtimestamp));
 if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 273;BA.debugLine="lblSideYard.Text = \"Side Yard \" & strTimes";
Debug.ShouldStop(65536);
parent._lblsideyard.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Side Yard "),_strtimestamp));
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
Debug.locals.put("link", _link);
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 73:
//C
this.state = 74;
this.catchState = 0;
 BA.debugLineNum = 281;BA.debugLine="Log(\"RefreshCamera LastException: \" & LastExcept";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("RefreshCamera LastException: "),parent.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 282;BA.debugLine="lblStatus.Text = \"RefreshCamera LastException: \"";
Debug.ShouldStop(33554432);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("RefreshCamera LastException: "),parent.__c.runMethod(false,"LastException",main.ba)));
 if (true) break;
if (true) break;

case 74:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 284;BA.debugLine="End Sub";
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
public static void  _requestauthtoken() throws Exception{
try {
		Debug.PushSubsStack("RequestAuthToken (main) ","main",0,main.ba,main.mostCurrent,119);
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
		Debug.PushSubsStack("RequestAuthToken (main) ","main",0,main.ba,main.mostCurrent,119);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 125;BA.debugLine="Try";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 126;BA.debugLine="lblStatus.Text = \"Authenticating...\"";
Debug.ShouldStop(536870912);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Authenticating..."));
 BA.debugLineNum = 127;BA.debugLine="Dim jobLogin As HttpJob";
Debug.ShouldStop(1073741824);
_joblogin = RemoteObject.createNew ("cloyd.blink.httpjob");Debug.locals.put("jobLogin", _joblogin);
 BA.debugLineNum = 128;BA.debugLine="jobLogin.Initialize(\"\", Me)";
Debug.ShouldStop(-2147483648);
_joblogin.runClassMethod (cloyd.blink.httpjob.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 129;BA.debugLine="jobLogin.PostString(\"https://rest.prod.immedia-s";
Debug.ShouldStop(1);
_joblogin.runClassMethod (cloyd.blink.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("https://rest.prod.immedia-semi.com/login")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("email="),parent._emailaddress,RemoteObject.createImmutable("&password="),parent._password)));
 BA.debugLineNum = 130;BA.debugLine="jobLogin.GetRequest.SetContentType(\"application/";
Debug.ShouldStop(2);
_joblogin.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/x-www-form-urlencoded")));
 BA.debugLineNum = 131;BA.debugLine="Wait For (jobLogin) JobDone(jobLogin As HttpJob)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","jobdone", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "requestauthtoken"), (_joblogin));
this.state = 25;
return;
case 25:
//C
this.state = 4;
_joblogin = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("jobLogin", _joblogin);
;
 BA.debugLineNum = 132;BA.debugLine="If jobLogin.Success Then";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 133;BA.debugLine="lblStatus.Text = \"Successfully logged in to the";
Debug.ShouldStop(16);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Successfully logged in to the Blink server..."));
 BA.debugLineNum = 135;BA.debugLine="GetAuthInfo(jobLogin.GetString)";
Debug.ShouldStop(64);
_getauthinfo(_joblogin.runClassMethod (cloyd.blink.httpjob.class, "_getstring" /*RemoteObject*/ ));
 BA.debugLineNum = 137;BA.debugLine="RESTGet(\"https://rest-\" & userRegion & \".immedi";
Debug.ShouldStop(256);
_restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/user")));
 BA.debugLineNum = 138;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "requestauthtoken"),BA.numberCast(int.class, 1000));
this.state = 26;
return;
case 26:
//C
this.state = 7;
;
 BA.debugLineNum = 139;BA.debugLine="If response.StartsWith(\"ERROR: \") Then";
Debug.ShouldStop(1024);
if (true) break;

case 7:
//if
this.state = 12;
if (parent._response.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR: "))).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 140;BA.debugLine="Log(response)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("Log",(Object)(parent._response));
 BA.debugLineNum = 141;BA.debugLine="lblStatus.Text = response";
Debug.ShouldStop(4096);
parent._lblstatus.runMethod(true,"setText",parent._response);
 BA.debugLineNum = 142;BA.debugLine="Return";
Debug.ShouldStop(8192);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 144;BA.debugLine="lblStatus.Text = \"AuthToken acquired...\"";
Debug.ShouldStop(32768);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("AuthToken acquired..."));
 BA.debugLineNum = 145;BA.debugLine="GetUserInfo(response)";
Debug.ShouldStop(65536);
_getuserinfo(parent._response);
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 148;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia";
Debug.ShouldStop(524288);
_restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/api/v1/camera/usage")));
 BA.debugLineNum = 149;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "requestauthtoken"),BA.numberCast(int.class, 1000));
this.state = 27;
return;
case 27:
//C
this.state = 13;
;
 BA.debugLineNum = 150;BA.debugLine="If response.StartsWith(\"ERROR: \") Then";
Debug.ShouldStop(2097152);
if (true) break;

case 13:
//if
this.state = 18;
if (parent._response.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR: "))).<Boolean>get().booleanValue()) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 BA.debugLineNum = 151;BA.debugLine="Log(response)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("Log",(Object)(parent._response));
 BA.debugLineNum = 152;BA.debugLine="lblStatus.Text = response";
Debug.ShouldStop(8388608);
parent._lblstatus.runMethod(true,"setText",parent._response);
 BA.debugLineNum = 153;BA.debugLine="Return";
Debug.ShouldStop(16777216);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 155;BA.debugLine="GetAllCameras(response)";
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
 BA.debugLineNum = 158;BA.debugLine="lblStatus.Text = \"RequestAuthToken error: \" & j";
Debug.ShouldStop(536870912);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("RequestAuthToken error: "),_joblogin.runClassMethod (cloyd.blink.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 159;BA.debugLine="Log(\"RequestAuthToken error: \" & jobLogin.GetSt";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("RequestAuthToken error: "),_joblogin.runClassMethod (cloyd.blink.httpjob.class, "_getstring" /*RemoteObject*/ ))));
 BA.debugLineNum = 160;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;

case 21:
//C
this.state = 24;
;
 BA.debugLineNum = 162;BA.debugLine="jobLogin.Release";
Debug.ShouldStop(2);
_joblogin.runClassMethod (cloyd.blink.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 163;BA.debugLine="lblStatus.Text = \"Ready\"";
Debug.ShouldStop(4);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Ready"));
 BA.debugLineNum = 165;BA.debugLine="RefreshCameras(True)";
Debug.ShouldStop(16);
_refreshcameras(parent.__c.getField(true,"True"));
 Debug.CheckDeviceExceptions();
if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
 BA.debugLineNum = 167;BA.debugLine="lblStatus.Text = \"RequestAuthToken LastException";
Debug.ShouldStop(64);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("RequestAuthToken LastException: "),parent.__c.runMethod(false,"LastException",main.ba)));
 BA.debugLineNum = 168;BA.debugLine="Log(\"RequestAuthToken LastException: \" & LastExc";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("RequestAuthToken LastException: "),parent.__c.runMethod(false,"LastException",main.ba))));
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("RESTGet (main) ","main",0,main.ba,main.mostCurrent,286);
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
		Debug.PushSubsStack("RESTGet (main) ","main",0,main.ba,main.mostCurrent,286);
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
 BA.debugLineNum = 287;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 288;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(-2147483648);
_j = RemoteObject.createNew ("cloyd.blink.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 289;BA.debugLine="response = \"\"";
Debug.ShouldStop(1);
parent._response = BA.ObjectToString("");
 BA.debugLineNum = 290;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no";
Debug.ShouldStop(2);
_j.runClassMethod (cloyd.blink.httpjob.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 291;BA.debugLine="j.Download(url)";
Debug.ShouldStop(4);
_j.runClassMethod (cloyd.blink.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 292;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
Debug.ShouldStop(8);
_j.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("TOKEN_AUTH")),(Object)(parent._authtoken));
 BA.debugLineNum = 293;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","jobdone", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "restget"), (_j));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 294;BA.debugLine="If j.Success Then";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 295;BA.debugLine="response = j.GetString";
Debug.ShouldStop(64);
parent._response = _j.runClassMethod (cloyd.blink.httpjob.class, "_getstring" /*RemoteObject*/ );
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 297;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
Debug.ShouldStop(256);
parent._response = RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));
 BA.debugLineNum = 298;BA.debugLine="lblStatus.Text = \"ERROR: \" & j.ErrorMessage";
Debug.ShouldStop(512);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )));
 if (true) break;

case 9:
//C
this.state = 12;
;
 BA.debugLineNum = 300;BA.debugLine="j.Release";
Debug.ShouldStop(2048);
_j.runClassMethod (cloyd.blink.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 302;BA.debugLine="response = \"ERROR: \" & LastException";
Debug.ShouldStop(8192);
parent._response = RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),parent.__c.runMethod(false,"LastException",main.ba));
 BA.debugLineNum = 303;BA.debugLine="Log(\"RESTDownload LastException: \" & LastExcepti";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("RESTDownload LastException: "),parent.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 304;BA.debugLine="lblStatus.Text = \"RESTGet LastException: \" & Las";
Debug.ShouldStop(32768);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("RESTGet LastException: "),parent.__c.runMethod(false,"LastException",main.ba)));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 306;BA.debugLine="Log(\"URL: \" & url)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("URL: "),_url)));
 BA.debugLineNum = 307;BA.debugLine="Log(\"Response: \" & response)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response: "),parent._response)));
 BA.debugLineNum = 308;BA.debugLine="Return(response)";
Debug.ShouldStop(524288);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,((parent._response)));return;};
 BA.debugLineNum = 309;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("RESTPost (main) ","main",0,main.ba,main.mostCurrent,311);
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
		Debug.PushSubsStack("RESTPost (main) ","main",0,main.ba,main.mostCurrent,311);
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
 BA.debugLineNum = 312;BA.debugLine="Try";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 313;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(16777216);
_j = RemoteObject.createNew ("cloyd.blink.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 314;BA.debugLine="response = \"\"";
Debug.ShouldStop(33554432);
parent._response = BA.ObjectToString("");
 BA.debugLineNum = 315;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no";
Debug.ShouldStop(67108864);
_j.runClassMethod (cloyd.blink.httpjob.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 316;BA.debugLine="j.PostString(url,\"\")";
Debug.ShouldStop(134217728);
_j.runClassMethod (cloyd.blink.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_url),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 317;BA.debugLine="j.GetRequest.SetContentType(\"application/x-www-f";
Debug.ShouldStop(268435456);
_j.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/x-www-form-urlencoded")));
 BA.debugLineNum = 318;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
Debug.ShouldStop(536870912);
_j.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("TOKEN_AUTH")),(Object)(parent._authtoken));
 BA.debugLineNum = 319;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","jobdone", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "restpost"), (_j));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 320;BA.debugLine="If j.Success Then";
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
 BA.debugLineNum = 321;BA.debugLine="response = j.GetString";
Debug.ShouldStop(1);
parent._response = _j.runClassMethod (cloyd.blink.httpjob.class, "_getstring" /*RemoteObject*/ );
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 323;BA.debugLine="response = \"ERROR: \" & j.ErrorMessage";
Debug.ShouldStop(4);
parent._response = RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));
 BA.debugLineNum = 324;BA.debugLine="lblStatus.Text = \"ERROR: \" & j.ErrorMessage";
Debug.ShouldStop(8);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )));
 if (true) break;

case 9:
//C
this.state = 12;
;
 BA.debugLineNum = 326;BA.debugLine="j.Release";
Debug.ShouldStop(32);
_j.runClassMethod (cloyd.blink.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 328;BA.debugLine="response = \"ERROR: \" & LastException";
Debug.ShouldStop(128);
parent._response = RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),parent.__c.runMethod(false,"LastException",main.ba));
 BA.debugLineNum = 329;BA.debugLine="Log(\"RESTPost LastException: \" & LastException)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("RESTPost LastException: "),parent.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 330;BA.debugLine="lblStatus.Text = \"RESTPost LastException: \" & La";
Debug.ShouldStop(512);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("RESTPost LastException: "),parent.__c.runMethod(false,"LastException",main.ba)));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 332;BA.debugLine="Log(\"URL: \" & url)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("URL: "),_url)));
 BA.debugLineNum = 333;BA.debugLine="Log(\"Response: \" & response)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response: "),parent._response)));
 BA.debugLineNum = 334;BA.debugLine="Return(response)";
Debug.ShouldStop(8192);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,((parent._response)));return;};
 BA.debugLineNum = 335;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAvg (main) ","main",0,main.ba,main.mostCurrent,1014);
if (RapidSub.canDelegate("setavg")) { return cloyd.blink.main.remoteMe.runUserSub(false, "main","setavg", _bc, _x, _y, _clrs, _temp);}
RemoteObject _c = RemoteObject.declareNull("b4j.example.bitmapcreator._argbcolor");
Debug.locals.put("bc", _bc);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
Debug.locals.put("clrs", _clrs);
Debug.locals.put("temp", _temp);
 BA.debugLineNum = 1014;BA.debugLine="Private Sub SetAvg(bc As BitmapCreator, x As Int,";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1015;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 1016;BA.debugLine="temp.Initialize";
Debug.ShouldStop(8388608);
_temp.runVoidMethod ("Initialize");
 BA.debugLineNum = 1017;BA.debugLine="For Each c As ARGBColor In clrs";
Debug.ShouldStop(16777216);
{
final RemoteObject group3 = _clrs;
final int groupLen3 = group3.getField(true,"length").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_c = group3.getArrayElement(false,RemoteObject.createImmutable(index3));Debug.locals.put("c", _c);
Debug.locals.put("c", _c);
 BA.debugLineNum = 1018;BA.debugLine="temp.r = temp.r + c.r";
Debug.ShouldStop(33554432);
_temp.setField ("r",RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"r"),_c.getField(true,"r")}, "+",1, 1));
 BA.debugLineNum = 1019;BA.debugLine="temp.g = temp.g + c.g";
Debug.ShouldStop(67108864);
_temp.setField ("g",RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"g"),_c.getField(true,"g")}, "+",1, 1));
 BA.debugLineNum = 1020;BA.debugLine="temp.b = temp.b + c.b";
Debug.ShouldStop(134217728);
_temp.setField ("b",RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"b"),_c.getField(true,"b")}, "+",1, 1));
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 1022;BA.debugLine="temp.a = 255";
Debug.ShouldStop(536870912);
_temp.setField ("a",BA.numberCast(int.class, 255));
 BA.debugLineNum = 1023;BA.debugLine="temp.r = temp.r / clrs.Length";
Debug.ShouldStop(1073741824);
_temp.setField ("r",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"r"),_clrs.getField(true,"length")}, "/",0, 0)));
 BA.debugLineNum = 1024;BA.debugLine="temp.g = temp.g / clrs.Length";
Debug.ShouldStop(-2147483648);
_temp.setField ("g",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"g"),_clrs.getField(true,"length")}, "/",0, 0)));
 BA.debugLineNum = 1025;BA.debugLine="temp.b = temp.b / clrs.Length";
Debug.ShouldStop(1);
_temp.setField ("b",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"b"),_clrs.getField(true,"length")}, "/",0, 0)));
 BA.debugLineNum = 1026;BA.debugLine="bc.SetARGB(x, y, temp)";
Debug.ShouldStop(2);
_bc.runVoidMethod ("_setargb",(Object)(_x),(Object)(_y),(Object)(_temp));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e14.toString()); BA.debugLineNum = 1028;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 1029;BA.debugLine="lblStatus.Text = \"SetAvg LastException: \" & Last";
Debug.ShouldStop(16);
main._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("SetAvg LastException: "),main.__c.runMethod(false,"LastException",main.ba)));
 };
 BA.debugLineNum = 1031;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}