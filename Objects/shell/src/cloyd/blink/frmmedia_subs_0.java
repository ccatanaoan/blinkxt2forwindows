package cloyd.blink;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class frmmedia_subs_0 {


public static RemoteObject  _checkmonitor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckMonitor (frmmedia) ","frmmedia",1,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("checkmonitor")) { return __ref.runUserSub(false, "frmmedia","checkmonitor", __ref);}
RemoteObject _slist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _s = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
 BA.debugLineNum = 66;BA.debugLine="Sub CheckMonitor() As Screen";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 68;BA.debugLine="If fx.Screens.Size= 1 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens").runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 69;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(16);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = __ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 70;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(32);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 72;BA.debugLine="Return S";
Debug.ShouldStop(128);
Debug.CheckDeviceExceptions();if (true) return _s;
 }else 
{ BA.debugLineNum = 73;BA.debugLine="Else If fx.Screens.Size> 1 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens").runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 74;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(512);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = __ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 75;BA.debugLine="Dim S As Screen = SList.Get(2)";
Debug.ShouldStop(1024);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("S", _s);
 BA.debugLineNum = 77;BA.debugLine="Return S";
Debug.ShouldStop(4096);
Debug.CheckDeviceExceptions();if (true) return _s;
 }else {
 BA.debugLineNum = 79;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(16384);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = __ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 80;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(32768);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 82;BA.debugLine="Return S";
Debug.ShouldStop(131072);
Debug.CheckDeviceExceptions();if (true) return _s;
 }}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e16.toString()); BA.debugLineNum = 85;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(1048576);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = __ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 86;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(2097152);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 88;BA.debugLine="Return S";
Debug.ShouldStop(8388608);
Debug.CheckDeviceExceptions();if (true) return _s;
 };
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
frmmedia._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",frmmedia._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private frm As Form";
frmmedia._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",frmmedia._frm);
 //BA.debugLineNum = 4;BA.debugLine="Private wvMedia As WebView";
frmmedia._wvmedia = RemoteObject.createNew ("anywheresoftware.b4j.objects.WebViewWrapper");__ref.setField("_wvmedia",frmmedia._wvmedia);
 //BA.debugLineNum = 5;BA.debugLine="Public url As String";
frmmedia._url = RemoteObject.createImmutable("");__ref.setField("_url",frmmedia._url);
 //BA.debugLineNum = 6;BA.debugLine="Public isVideo As Boolean = False";
frmmedia._isvideo = frmmedia.__c.getField(true,"False");__ref.setField("_isvideo",frmmedia._isvideo);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (frmmedia) ","frmmedia",1,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "frmmedia","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 48;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("Initialize (frmmedia) ","frmmedia",1,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "frmmedia","initialize", __ref, _ba, _parent);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _obj = RemoteObject.declareNull("anywheresoftware.b4j.agraham.reflection.Reflection");
Debug.locals.put("ba", _ba);
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize (Parent As Form)";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="frm.Initialize(\"frm\", 600dip, 600dip)";
Debug.ShouldStop(1024);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, frmmedia.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, frmmedia.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))));
 BA.debugLineNum = 12;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("SetFormStyle",(Object)(RemoteObject.createImmutable("UTILITY")));
 BA.debugLineNum = 13;BA.debugLine="frm.RootPane.LoadLayout(\"main\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("main")));
 BA.debugLineNum = 14;BA.debugLine="frm.Icon = fx.LoadImage(File.DirAssets, \"home.png";
Debug.ShouldStop(8192);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"LoadImage",(Object)(frmmedia.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("home.png"))).getObject()));
 BA.debugLineNum = 15;BA.debugLine="frm.Title = \"Catanaoan Blink XT2 Cameras Media Vi";
Debug.ShouldStop(16384);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",BA.ObjectToString("Catanaoan Blink XT2 Cameras Media Viewer"));
 BA.debugLineNum = 16;BA.debugLine="frm.SetOwner(Parent)";
Debug.ShouldStop(32768);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("SetOwner",(Object)(_parent));
 BA.debugLineNum = 17;BA.debugLine="frm.WindowWidth = CheckMonitor.MaxX - CheckMonito";
Debug.ShouldStop(65536);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setWindowWidth",RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (cloyd.blink.frmmedia.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMaxX"),__ref.runClassMethod (cloyd.blink.frmmedia.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMinX")}, "-",1, 0));
 BA.debugLineNum = 18;BA.debugLine="frm.WindowLeft = CheckMonitor.MinX";
Debug.ShouldStop(131072);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setWindowLeft",__ref.runClassMethod (cloyd.blink.frmmedia.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMinX"));
 BA.debugLineNum = 19;BA.debugLine="frm.WindowHeight = CheckMonitor.MaxY - CheckMo";
Debug.ShouldStop(262144);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setWindowHeight",RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (cloyd.blink.frmmedia.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMaxY"),__ref.runClassMethod (cloyd.blink.frmmedia.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMinY")}, "-",1, 0));
 BA.debugLineNum = 20;BA.debugLine="frm.WindowTop = CheckMonitor.MinY";
Debug.ShouldStop(524288);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setWindowTop",__ref.runClassMethod (cloyd.blink.frmmedia.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMinY"));
 BA.debugLineNum = 21;BA.debugLine="Dim Obj As Reflector";
Debug.ShouldStop(1048576);
_obj = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 22;BA.debugLine="Obj.Target = frm.RootPane";
Debug.ShouldStop(2097152);
_obj.setField ("Target",(__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 23;BA.debugLine="Obj.AddEventHandler(\"RootPaneKeyEvent\", \"javafx.s";
Debug.ShouldStop(4194304);
_obj.runVoidMethod ("AddEventHandler",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("RootPaneKeyEvent")),(Object)(RemoteObject.createImmutable("javafx.scene.input.KeyEvent.ANY")));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rootpanekeyevent_event(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("RootPaneKeyEvent_Event (frmmedia) ","frmmedia",1,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("rootpanekeyevent_event")) { return __ref.runUserSub(false, "frmmedia","rootpanekeyevent_event", __ref, _e);}
RemoteObject _ke = RemoteObject.declareNull("anywheresoftware.b4j.agraham.reflection.Reflection");
RemoteObject _scode = RemoteObject.createImmutable("");
RemoteObject _stype = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
Debug.locals.put("e", _e);
 BA.debugLineNum = 52;BA.debugLine="Private Sub RootPaneKeyEvent_Event(e As Event)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="Dim KE As Reflector";
Debug.ShouldStop(1048576);
_ke = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("KE", _ke);
 BA.debugLineNum = 54;BA.debugLine="Dim sCode As String";
Debug.ShouldStop(2097152);
_scode = RemoteObject.createImmutable("");Debug.locals.put("sCode", _scode);
 BA.debugLineNum = 55;BA.debugLine="Dim sType As String 'ignore";
Debug.ShouldStop(4194304);
_stype = RemoteObject.createImmutable("");Debug.locals.put("sType", _stype);
 BA.debugLineNum = 56;BA.debugLine="Dim result As Int 'ignore";
Debug.ShouldStop(8388608);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 57;BA.debugLine="KE.Target = e	 ' e is a KeyEvent instance";
Debug.ShouldStop(16777216);
_ke.setField ("Target",(_e.getObject()));
 BA.debugLineNum = 58;BA.debugLine="sCode = KE.RunMethod(\"getCode\")";
Debug.ShouldStop(33554432);
_scode = BA.ObjectToString(_ke.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getCode"))));Debug.locals.put("sCode", _scode);
 BA.debugLineNum = 59;BA.debugLine="sType = KE.RunMethod(\"getEventType\")";
Debug.ShouldStop(67108864);
_stype = BA.ObjectToString(_ke.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getEventType"))));Debug.locals.put("sType", _stype);
 BA.debugLineNum = 60;BA.debugLine="If sCode=\"ESCAPE\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_scode,BA.ObjectToString("ESCAPE"))) { 
 BA.debugLineNum = 62;BA.debugLine="frm.Close";
Debug.ShouldStop(536870912);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 };
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (frmmedia) ","frmmedia",1,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "frmmedia","show", __ref);}
 BA.debugLineNum = 26;BA.debugLine="Public Sub Show";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="If isVideo Then";
Debug.ShouldStop(67108864);
if (__ref.getField(true,"_isvideo" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 }else {
 BA.debugLineNum = 43;BA.debugLine="wvMedia.Loadhtml(url)";
Debug.ShouldStop(1024);
__ref.getField(false,"_wvmedia" /*RemoteObject*/ ).runVoidMethod ("LoadHtml",(Object)(__ref.getField(true,"_url" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 45;BA.debugLine="frm.ShowAndWait";
Debug.ShouldStop(4096);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("ShowAndWait");
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}