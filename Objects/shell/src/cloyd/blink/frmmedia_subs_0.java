package cloyd.blink;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class frmmedia_subs_0 {


public static RemoteObject  _checkmonitor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckMonitor (frmmedia) ","frmmedia",1,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("checkmonitor")) { return __ref.runUserSub(false, "frmmedia","checkmonitor", __ref);}
RemoteObject _slist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _s = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
 BA.debugLineNum = 61;BA.debugLine="Sub CheckMonitor() As Screen";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 63;BA.debugLine="If fx.Screens.Size= 1 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens").runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 64;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(-2147483648);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = __ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 65;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(1);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 67;BA.debugLine="Return S";
Debug.ShouldStop(4);
Debug.CheckDeviceExceptions();if (true) return _s;
 }else 
{ BA.debugLineNum = 68;BA.debugLine="Else If fx.Screens.Size> 1 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens").runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 69;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(16);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = __ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 70;BA.debugLine="Dim S As Screen = SList.Get(2)";
Debug.ShouldStop(32);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("S", _s);
 BA.debugLineNum = 72;BA.debugLine="Return S";
Debug.ShouldStop(128);
Debug.CheckDeviceExceptions();if (true) return _s;
 }else {
 BA.debugLineNum = 74;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(512);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = __ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 75;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(1024);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 77;BA.debugLine="Return S";
Debug.ShouldStop(4096);
Debug.CheckDeviceExceptions();if (true) return _s;
 }}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e16.toString()); BA.debugLineNum = 80;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(32768);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = __ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 81;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(65536);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 83;BA.debugLine="Return S";
Debug.ShouldStop(262144);
Debug.CheckDeviceExceptions();if (true) return _s;
 };
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
 //BA.debugLineNum = 4;BA.debugLine="Public url As String";
frmmedia._url = RemoteObject.createImmutable("");__ref.setField("_url",frmmedia._url);
 //BA.debugLineNum = 5;BA.debugLine="Private imgScreenshot As ImageView";
frmmedia._imgscreenshot = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");__ref.setField("_imgscreenshot",frmmedia._imgscreenshot);
 //BA.debugLineNum = 6;BA.debugLine="Private lblTimestamp As Label";
frmmedia._lbltimestamp = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltimestamp",frmmedia._lbltimestamp);
 //BA.debugLineNum = 7;BA.debugLine="Public timestamp As String";
frmmedia._timestamp = RemoteObject.createImmutable("");__ref.setField("_timestamp",frmmedia._timestamp);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (frmmedia) ","frmmedia",1,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "frmmedia","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 44;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(2048);
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("Initialize (frmmedia) ","frmmedia",1,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "frmmedia","initialize", __ref, _ba, _parent);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _obj = RemoteObject.declareNull("anywheresoftware.b4j.agraham.reflection.Reflection");
Debug.locals.put("ba", _ba);
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize (Parent As Form)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="frm.Initialize(\"frm\", 600dip, 600dip)";
Debug.ShouldStop(2048);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, frmmedia.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, frmmedia.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))));
 BA.debugLineNum = 13;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("SetFormStyle",(Object)(RemoteObject.createImmutable("UTILITY")));
 BA.debugLineNum = 14;BA.debugLine="frm.RootPane.LoadLayout(\"main\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("main")));
 BA.debugLineNum = 15;BA.debugLine="frm.Icon = fx.LoadImage(File.DirAssets, \"home.png";
Debug.ShouldStop(16384);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"LoadImage",(Object)(frmmedia.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("home.png"))).getObject()));
 BA.debugLineNum = 16;BA.debugLine="frm.Title = \"Catanaoan Blink XT2 Cameras Media Vi";
Debug.ShouldStop(32768);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",BA.ObjectToString("Catanaoan Blink XT2 Cameras Media Viewer"));
 BA.debugLineNum = 17;BA.debugLine="frm.SetOwner(Parent)";
Debug.ShouldStop(65536);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("SetOwner",(Object)(_parent));
 BA.debugLineNum = 18;BA.debugLine="frm.WindowWidth = CheckMonitor.MaxX - CheckMonito";
Debug.ShouldStop(131072);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setWindowWidth",RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (cloyd.blink.frmmedia.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMaxX"),__ref.runClassMethod (cloyd.blink.frmmedia.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMinX")}, "-",1, 0));
 BA.debugLineNum = 19;BA.debugLine="frm.WindowLeft = CheckMonitor.MinX";
Debug.ShouldStop(262144);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setWindowLeft",__ref.runClassMethod (cloyd.blink.frmmedia.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMinX"));
 BA.debugLineNum = 20;BA.debugLine="frm.WindowHeight = CheckMonitor.MaxY - CheckMo";
Debug.ShouldStop(524288);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setWindowHeight",RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (cloyd.blink.frmmedia.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMaxY"),__ref.runClassMethod (cloyd.blink.frmmedia.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMinY")}, "-",1, 0));
 BA.debugLineNum = 21;BA.debugLine="frm.WindowTop = CheckMonitor.MinY";
Debug.ShouldStop(1048576);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setWindowTop",__ref.runClassMethod (cloyd.blink.frmmedia.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMinY"));
 BA.debugLineNum = 22;BA.debugLine="Dim Obj As Reflector";
Debug.ShouldStop(2097152);
_obj = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 23;BA.debugLine="Obj.Target = frm.RootPane";
Debug.ShouldStop(4194304);
_obj.setField ("Target",(__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 25;BA.debugLine="Obj.AddEventHandler(\"keypressed\", \"javafx.scene.i";
Debug.ShouldStop(16777216);
_obj.runVoidMethod ("AddEventHandler",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("keypressed")),(Object)(RemoteObject.createImmutable("javafx.scene.input.KeyEvent.KEY_PRESSED")));
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _keypressed_event(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("KeyPressed_Event (frmmedia) ","frmmedia",1,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("keypressed_event")) { return __ref.runUserSub(false, "frmmedia","keypressed_event", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 40;BA.debugLine="Sub KeyPressed_Event (e As Event)";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="Log(\"here\")";
Debug.ShouldStop(256);
frmmedia.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("here")));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("RootPaneKeyEvent_Event (frmmedia) ","frmmedia",1,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("rootpanekeyevent_event")) { return __ref.runUserSub(false, "frmmedia","rootpanekeyevent_event", __ref, _e);}
RemoteObject _ke = RemoteObject.declareNull("anywheresoftware.b4j.agraham.reflection.Reflection");
RemoteObject _scode = RemoteObject.createImmutable("");
RemoteObject _stype = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
Debug.locals.put("e", _e);
 BA.debugLineNum = 48;BA.debugLine="Private Sub RootPaneKeyEvent_Event(e As Event)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Dim KE As Reflector";
Debug.ShouldStop(65536);
_ke = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("KE", _ke);
 BA.debugLineNum = 50;BA.debugLine="Dim sCode As String";
Debug.ShouldStop(131072);
_scode = RemoteObject.createImmutable("");Debug.locals.put("sCode", _scode);
 BA.debugLineNum = 51;BA.debugLine="Dim sType As String 'ignore";
Debug.ShouldStop(262144);
_stype = RemoteObject.createImmutable("");Debug.locals.put("sType", _stype);
 BA.debugLineNum = 52;BA.debugLine="Dim result As Int 'ignore";
Debug.ShouldStop(524288);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 53;BA.debugLine="KE.Target = e	 ' e is a KeyEvent instance";
Debug.ShouldStop(1048576);
_ke.setField ("Target",(_e.getObject()));
 BA.debugLineNum = 54;BA.debugLine="sCode = KE.RunMethod(\"getCode\")";
Debug.ShouldStop(2097152);
_scode = BA.ObjectToString(_ke.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getCode"))));Debug.locals.put("sCode", _scode);
 BA.debugLineNum = 55;BA.debugLine="sType = KE.RunMethod(\"getEventType\")";
Debug.ShouldStop(4194304);
_stype = BA.ObjectToString(_ke.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getEventType"))));Debug.locals.put("sType", _stype);
 BA.debugLineNum = 56;BA.debugLine="If sCode=\"ESCAPE\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_scode,BA.ObjectToString("ESCAPE"))) { 
 BA.debugLineNum = 57;BA.debugLine="frm.Close";
Debug.ShouldStop(16777216);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 };
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Show (frmmedia) ","frmmedia",1,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "frmmedia","show", __ref);}
 BA.debugLineNum = 28;BA.debugLine="Public Sub Show";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="If url.Contains(\"Driveway\") Then";
Debug.ShouldStop(268435456);
if (__ref.getField(true,"_url" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Driveway"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 30;BA.debugLine="imgScreenshot.SetImage(fx.LoadImage(File.DirApp,";
Debug.ShouldStop(536870912);
__ref.getField(false,"_imgscreenshot" /*RemoteObject*/ ).runVoidMethod ("SetImage",(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"LoadImage",(Object)(frmmedia.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("Driveway.jpg"))).getObject())));
 }else 
{ BA.debugLineNum = 31;BA.debugLine="Else if url.Contains(\"FrontDoor\") Then";
Debug.ShouldStop(1073741824);
if (__ref.getField(true,"_url" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("FrontDoor"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 32;BA.debugLine="imgScreenshot.SetImage(fx.LoadImage(File.DirApp,";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_imgscreenshot" /*RemoteObject*/ ).runVoidMethod ("SetImage",(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"LoadImage",(Object)(frmmedia.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("FrontDoor.jpg"))).getObject())));
 }else 
{ BA.debugLineNum = 33;BA.debugLine="Else if url.Contains(\"SideYard\") Then";
Debug.ShouldStop(1);
if (__ref.getField(true,"_url" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("SideYard"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 34;BA.debugLine="imgScreenshot.SetImage(fx.LoadImage(File.DirApp,";
Debug.ShouldStop(2);
__ref.getField(false,"_imgscreenshot" /*RemoteObject*/ ).runVoidMethod ("SetImage",(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"LoadImage",(Object)(frmmedia.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("SideYard.jpg"))).getObject())));
 }}}
;
 BA.debugLineNum = 36;BA.debugLine="lblTimestamp.Text = timestamp";
Debug.ShouldStop(8);
__ref.getField(false,"_lbltimestamp" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(true,"_timestamp" /*RemoteObject*/ ));
 BA.debugLineNum = 37;BA.debugLine="frm.ShowAndWait";
Debug.ShouldStop(16);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("ShowAndWait");
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}