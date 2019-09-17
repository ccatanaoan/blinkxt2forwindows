package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (main) ","main",0,main.ba,main.mostCurrent,103);
if (RapidSub.canDelegate("application_error")) { return b4j.example.main.remoteMe.runUserSub(false, "main","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 103;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="Return True";
Debug.ShouldStop(128);
Debug.CheckDeviceExceptions();if (true) return main.__c.getField(true,"True");
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,41);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
RemoteObject _skintemp = RemoteObject.createImmutable("");
RemoteObject _skindefault = RemoteObject.createImmutable("");
RemoteObject _obj = RemoteObject.declareNull("anywheresoftware.b4j.agraham.reflection.Reflection");
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 41;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 43;BA.debugLine="Dim skinTemp As String";
Debug.ShouldStop(1024);
_skintemp = RemoteObject.createImmutable("");Debug.locals.put("skinTemp", _skintemp);
 BA.debugLineNum = 44;BA.debugLine="Dim skinDefault As String";
Debug.ShouldStop(2048);
_skindefault = RemoteObject.createImmutable("");Debug.locals.put("skinDefault", _skindefault);
 BA.debugLineNum = 46;BA.debugLine="If File.Exists(File.DirApp, \"skin.ini\") Then";
Debug.ShouldStop(8192);
if (main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("skin.ini"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 47;BA.debugLine="skinTemp = File.ReadString(File.DirApp, \"skin.i";
Debug.ShouldStop(16384);
_skintemp = main.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("skin.ini")));Debug.locals.put("skinTemp", _skintemp);
 }else {
 BA.debugLineNum = 49;BA.debugLine="File.WriteString(File.DirApp, \"skin.ini\", \"vdSk";
Debug.ShouldStop(65536);
main.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("skin.ini")),(Object)(RemoteObject.createImmutable("vdSk03")));
 BA.debugLineNum = 50;BA.debugLine="skinTemp = \"vdSk03\"";
Debug.ShouldStop(131072);
_skintemp = BA.ObjectToString("vdSk03");Debug.locals.put("skinTemp", _skintemp);
 };
 BA.debugLineNum = 53;BA.debugLine="If skinTemp = \"\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString(""))) { 
 BA.debugLineNum = 54;BA.debugLine="skinDefault = \"vdSk03\"";
Debug.ShouldStop(2097152);
_skindefault = BA.ObjectToString("vdSk03");Debug.locals.put("skinDefault", _skindefault);
 }else {
 BA.debugLineNum = 56;BA.debugLine="If skinTemp = \"vdSk01\" Or skinTemp = \"vdSk02\" O";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString("vdSk01")) || RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString("vdSk02")) || RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString("vdSk03")) || RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString("vdSk04")) || RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString("vdSk05")) || RemoteObject.solveBoolean("=",_skintemp,BA.ObjectToString("vdSk06"))) { 
 BA.debugLineNum = 57;BA.debugLine="skinDefault = skinTemp";
Debug.ShouldStop(16777216);
_skindefault = _skintemp;Debug.locals.put("skinDefault", _skindefault);
 }else {
 BA.debugLineNum = 59;BA.debugLine="skinDefault = \"vdSk03\"";
Debug.ShouldStop(67108864);
_skindefault = BA.ObjectToString("vdSk03");Debug.locals.put("skinDefault", _skindefault);
 };
 };
 BA.debugLineNum = 63;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(1073741824);
main._mainform = _form1;
 BA.debugLineNum = 64;BA.debugLine="MainForm.SetFormStyle(\"TRANSPARENT\")";
Debug.ShouldStop(-2147483648);
main._mainform.runVoidMethod ("SetFormStyle",(Object)(RemoteObject.createImmutable("TRANSPARENT")));
 BA.debugLineNum = 65;BA.debugLine="MainForm.RootPane.LoadLayout(skinDefault) 'Load";
Debug.ShouldStop(1);
main._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(_skindefault));
 BA.debugLineNum = 66;BA.debugLine="AtualSkin = skinDefault";
Debug.ShouldStop(2);
main._atualskin = _skindefault;
 BA.debugLineNum = 67;BA.debugLine="MainForm.BackColor = fx.Colors.Transparent";
Debug.ShouldStop(4);
main._mainform.runMethod(false,"setBackColor",main._fx.getField(false,"Colors").getField(false,"Transparent"));
 BA.debugLineNum = 68;BA.debugLine="MainForm.RootPane.Style = \"-fx-background-color:";
Debug.ShouldStop(8);
main._mainform.runMethod(false,"getRootPane").runMethod(true,"setStyle",BA.ObjectToString("-fx-background-color:transparent;-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 1.0) , 15,0, 0.0, 0.0);"));
 BA.debugLineNum = 69;BA.debugLine="MainForm.Resizable = True";
Debug.ShouldStop(16);
main._mainform.runMethod(true,"setResizable",main.__c.getField(true,"True"));
 BA.debugLineNum = 71;BA.debugLine="MainForm.Title = \"Catanaoan Blink XT2 Cameras v1";
Debug.ShouldStop(64);
main._mainform.runMethod(true,"setTitle",BA.ObjectToString("Catanaoan Blink XT2 Cameras v1.0"));
 BA.debugLineNum = 72;BA.debugLine="lbTitle.MouseCursor = fx.Cursors.MOVE";
Debug.ShouldStop(128);
main._lbtitle.runMethod(false,"setMouseCursor",main._fx.getField(false,"Cursors").getField(false,"MOVE"));
 BA.debugLineNum = 73;BA.debugLine="lbTitle.Text = \"Catanaoan Blink XT2 Cameras v1.0";
Debug.ShouldStop(256);
main._lbtitle.runMethod(true,"setText",BA.ObjectToString("Catanaoan Blink XT2 Cameras v1.0"));
 BA.debugLineNum = 74;BA.debugLine="Dim Obj As Reflector";
Debug.ShouldStop(512);
_obj = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 75;BA.debugLine="Obj.Target = ivClose";
Debug.ShouldStop(1024);
_obj.setField ("Target",(main._ivclose.getObject()));
 BA.debugLineNum = 76;BA.debugLine="Obj.AddEventHandler2(\"Close_Entered\", \"onMouseEn";
Debug.ShouldStop(2048);
_obj.runVoidMethod ("AddEventHandler2",main.ba,(Object)(BA.ObjectToString("Close_Entered")),(Object)(RemoteObject.createImmutable("onMouseEnteredProperty")));
 BA.debugLineNum = 77;BA.debugLine="Obj.AddEventHandler2(\"Close_Exited\", \"onMouseExi";
Debug.ShouldStop(4096);
_obj.runVoidMethod ("AddEventHandler2",main.ba,(Object)(BA.ObjectToString("Close_Exited")),(Object)(RemoteObject.createImmutable("onMouseExitedProperty")));
 BA.debugLineNum = 78;BA.debugLine="Dim Obj As Reflector";
Debug.ShouldStop(8192);
_obj = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 79;BA.debugLine="Obj.Target = ivMax";
Debug.ShouldStop(16384);
_obj.setField ("Target",(main._ivmax.getObject()));
 BA.debugLineNum = 80;BA.debugLine="Obj.AddEventHandler2(\"Max_Entered\", \"onMouseEnte";
Debug.ShouldStop(32768);
_obj.runVoidMethod ("AddEventHandler2",main.ba,(Object)(BA.ObjectToString("Max_Entered")),(Object)(RemoteObject.createImmutable("onMouseEnteredProperty")));
 BA.debugLineNum = 81;BA.debugLine="Obj.AddEventHandler2(\"Max_Exited\", \"onMouseExite";
Debug.ShouldStop(65536);
_obj.runVoidMethod ("AddEventHandler2",main.ba,(Object)(BA.ObjectToString("Max_Exited")),(Object)(RemoteObject.createImmutable("onMouseExitedProperty")));
 BA.debugLineNum = 82;BA.debugLine="Dim Obj As Reflector";
Debug.ShouldStop(131072);
_obj = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 83;BA.debugLine="Obj.Target = ivMin";
Debug.ShouldStop(262144);
_obj.setField ("Target",(main._ivmin.getObject()));
 BA.debugLineNum = 84;BA.debugLine="Obj.AddEventHandler2(\"Min_Entered\", \"onMouseEnte";
Debug.ShouldStop(524288);
_obj.runVoidMethod ("AddEventHandler2",main.ba,(Object)(BA.ObjectToString("Min_Entered")),(Object)(RemoteObject.createImmutable("onMouseEnteredProperty")));
 BA.debugLineNum = 85;BA.debugLine="Obj.AddEventHandler2(\"Min_Exited\", \"onMouseExite";
Debug.ShouldStop(1048576);
_obj.runVoidMethod ("AddEventHandler2",main.ba,(Object)(BA.ObjectToString("Min_Exited")),(Object)(RemoteObject.createImmutable("onMouseExitedProperty")));
 BA.debugLineNum = 86;BA.debugLine="imgInit = AtualSkin.SubString(2).ToLowerCase";
Debug.ShouldStop(2097152);
main._imginit = main._atualskin.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2))).runMethod(true,"toLowerCase");
 BA.debugLineNum = 87;BA.debugLine="Get_css";
Debug.ShouldStop(4194304);
_get_css();
 BA.debugLineNum = 89;BA.debugLine="MainForm.WindowLeft = CheckMonitor.MinX 'fx.Prim";
Debug.ShouldStop(16777216);
main._mainform.runMethod(true,"setWindowLeft",_checkmonitor().runMethod(true,"getMinX"));
 BA.debugLineNum = 91;BA.debugLine="MainForm.WindowTop = CheckMonitor.MinY 'fx.Prima";
Debug.ShouldStop(67108864);
main._mainform.runMethod(true,"setWindowTop",_checkmonitor().runMethod(true,"getMinY"));
 BA.debugLineNum = 93;BA.debugLine="lblStatus.TextColor = fx.Colors.White";
Debug.ShouldStop(268435456);
main._lblstatus.runMethod(false,"setTextColor",main._fx.getField(false,"Colors").getField(false,"White"));
 BA.debugLineNum = 94;BA.debugLine="MainForm.Show";
Debug.ShouldStop(536870912);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 95;BA.debugLine="RequestAuthToken";
Debug.ShouldStop(1073741824);
_requestauthtoken();
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e49) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e49.toString()); BA.debugLineNum = 97;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndriveway_click() throws Exception{
try {
		Debug.PushSubsStack("btnDriveway_Click (main) ","main",0,main.ba,main.mostCurrent,107);
if (RapidSub.canDelegate("btndriveway_click")) { return b4j.example.main.remoteMe.runUserSub(false, "main","btndriveway_click");}
 BA.debugLineNum = 107;BA.debugLine="Sub btnDriveway_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="RefreshCameras";
Debug.ShouldStop(2048);
_refreshcameras();
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_action() throws Exception{
try {
		Debug.PushSubsStack("Button1_Action (main) ","main",0,main.ba,main.mostCurrent,618);
if (RapidSub.canDelegate("button1_action")) { return b4j.example.main.remoteMe.runUserSub(false, "main","button1_action");}
 BA.debugLineNum = 618;BA.debugLine="Private Sub Button1_Action";
Debug.ShouldStop(512);
 BA.debugLineNum = 619;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 620;BA.debugLine="ivMax.Visible = Not(ivMax.Visible)";
Debug.ShouldStop(2048);
main._ivmax.runMethod(true,"setVisible",main.__c.runMethod(true,"Not",(Object)(main._ivmax.runMethod(true,"getVisible"))));
 BA.debugLineNum = 621;BA.debugLine="ivMin.Visible = Not(ivMin.Visible)";
Debug.ShouldStop(4096);
main._ivmin.runMethod(true,"setVisible",main.__c.runMethod(true,"Not",(Object)(main._ivmin.runMethod(true,"getVisible"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e5.toString()); BA.debugLineNum = 623;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 625;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("CheckMonitor (main) ","main",0,main.ba,main.mostCurrent,627);
if (RapidSub.canDelegate("checkmonitor")) { return b4j.example.main.remoteMe.runUserSub(false, "main","checkmonitor");}
RemoteObject _slist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _s = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
 BA.debugLineNum = 627;BA.debugLine="Sub CheckMonitor() As Screen";
Debug.ShouldStop(262144);
 BA.debugLineNum = 628;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 629;BA.debugLine="If fx.Screens.Size= 1 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",main._fx.runMethod(false,"getScreens").runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 630;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(2097152);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = main._fx.runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 631;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(4194304);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 633;BA.debugLine="Return S";
Debug.ShouldStop(16777216);
Debug.CheckDeviceExceptions();if (true) return _s;
 }else 
{ BA.debugLineNum = 634;BA.debugLine="Else If fx.Screens.Size> 1 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",main._fx.runMethod(false,"getScreens").runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 635;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(67108864);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = main._fx.runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 636;BA.debugLine="Dim S As Screen = SList.Get(2)";
Debug.ShouldStop(134217728);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("S", _s);
 BA.debugLineNum = 638;BA.debugLine="Return S";
Debug.ShouldStop(536870912);
Debug.CheckDeviceExceptions();if (true) return _s;
 }else {
 BA.debugLineNum = 640;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(-2147483648);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = main._fx.runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 641;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(1);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 643;BA.debugLine="Return S";
Debug.ShouldStop(4);
Debug.CheckDeviceExceptions();if (true) return _s;
 }}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e16.toString()); BA.debugLineNum = 646;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(32);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = main._fx.runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 647;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(64);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 649;BA.debugLine="Return S";
Debug.ShouldStop(256);
Debug.CheckDeviceExceptions();if (true) return _s;
 };
 BA.debugLineNum = 651;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Close_Entered_Event (main) ","main",0,main.ba,main.mostCurrent,524);
if (RapidSub.canDelegate("close_entered_event")) { return b4j.example.main.remoteMe.runUserSub(false, "main","close_entered_event", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 524;BA.debugLine="Private Sub Close_Entered_Event(e As Event)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 525;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 526;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
Debug.ShouldStop(8192);
main._ivclose.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable("_btCloseEnt.png")))).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e4.toString()); BA.debugLineNum = 528;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 530;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Close_Exited_Event (main) ","main",0,main.ba,main.mostCurrent,532);
if (RapidSub.canDelegate("close_exited_event")) { return b4j.example.main.remoteMe.runUserSub(false, "main","close_exited_event", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 532;BA.debugLine="Private Sub Close_Exited_Event(e As Event)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 533;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 534;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
Debug.ShouldStop(2097152);
main._ivclose.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable("_btClose.png")))).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e4.toString()); BA.debugLineNum = 536;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 538;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _downloadimage(RemoteObject _link,RemoteObject _iv) throws Exception{
try {
		Debug.PushSubsStack("DownloadImage (main) ","main",0,main.ba,main.mostCurrent,302);
if (RapidSub.canDelegate("downloadimage")) { b4j.example.main.remoteMe.runUserSub(false, "main","downloadimage", _link, _iv); return;}
ResumableSub_DownloadImage rsub = new ResumableSub_DownloadImage(null,_link,_iv);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DownloadImage extends BA.ResumableSub {
public ResumableSub_DownloadImage(b4j.example.main parent,RemoteObject _link,RemoteObject _iv) {
this.parent = parent;
this._link = _link;
this._iv = _iv;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.example.main parent;
RemoteObject _link;
RemoteObject _iv;
RemoteObject _j = RemoteObject.declareNull("b4j.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadImage (main) ","main",0,main.ba,main.mostCurrent,302);
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
 BA.debugLineNum = 303;BA.debugLine="Try";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 304;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(32768);
_j = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 305;BA.debugLine="response = \"\"";
Debug.ShouldStop(65536);
parent._response = BA.ObjectToString("");
 BA.debugLineNum = 306;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(131072);
_j.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 307;BA.debugLine="j.Download(Link)";
Debug.ShouldStop(262144);
_j.runClassMethod (b4j.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_link));
 BA.debugLineNum = 308;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
Debug.ShouldStop(524288);
_j.runClassMethod (b4j.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("TOKEN_AUTH")),(Object)(parent._authtoken));
 BA.debugLineNum = 309;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","jobdone", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "downloadimage"), (_j));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 310;BA.debugLine="If j.Success Then";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 315;BA.debugLine="iv.SetImage(j.GetBitmap)";
Debug.ShouldStop(67108864);
_iv.runVoidMethod ("SetImage",(Object)((_j.runClassMethod (b4j.example.httpjob.class, "_getbitmap" /*RemoteObject*/ ).getObject())));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 317;BA.debugLine="response = \"ERROR: \" & j.GetString";
Debug.ShouldStop(268435456);
parent._response = RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.runClassMethod (b4j.example.httpjob.class, "_getstring" /*RemoteObject*/ ));
 if (true) break;

case 9:
//C
this.state = 12;
;
 BA.debugLineNum = 319;BA.debugLine="j.Release";
Debug.ShouldStop(1073741824);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 321;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",main.ba))));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 323;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Get_css (main) ","main",0,main.ba,main.mostCurrent,606);
if (RapidSub.canDelegate("get_css")) { return b4j.example.main.remoteMe.runUserSub(false, "main","get_css");}
RemoteObject _jform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _scene = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _stylesheets = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 606;BA.debugLine="Public Sub Get_css";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 607;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 608;BA.debugLine="Dim jForm As JavaObject = MainForm";
Debug.ShouldStop(-2147483648);
_jform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jform.setObject(main._mainform);Debug.locals.put("jForm", _jform);
 BA.debugLineNum = 609;BA.debugLine="Dim scene As JavaObject = jForm.GetField(\"scene\"";
Debug.ShouldStop(1);
_scene = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_scene.setObject(_jform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("scene"))));Debug.locals.put("scene", _scene);
 BA.debugLineNum = 610;BA.debugLine="Dim stylesheets As List = scene.RunMethod(\"getSt";
Debug.ShouldStop(2);
_stylesheets = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_stylesheets.setObject(_scene.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getStylesheets")),(Object)((main.__c.getField(false,"Null")))));Debug.locals.put("stylesheets", _stylesheets);
 BA.debugLineNum = 611;BA.debugLine="stylesheets.Clear";
Debug.ShouldStop(4);
_stylesheets.runVoidMethod ("Clear");
 BA.debugLineNum = 612;BA.debugLine="stylesheets.Add(File.GetUri(File.DirAssets, imgI";
Debug.ShouldStop(8);
_stylesheets.runVoidMethod ("Add",(Object)((main.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable(".css")))))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e8.toString()); BA.debugLineNum = 614;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 616;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("GetAllCameras (main) ","main",0,main.ba,main.mostCurrent,373);
if (RapidSub.canDelegate("getallcameras")) { return b4j.example.main.remoteMe.runUserSub(false, "main","getallcameras", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _networks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colnetworks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("json", _json);
 BA.debugLineNum = 373;BA.debugLine="Sub GetAllCameras(json As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 374;BA.debugLine="lblStatus.Text = \"Getting all cameras information";
Debug.ShouldStop(2097152);
main._lblstatus.runMethod(true,"setText",BA.ObjectToString("Getting all cameras information..."));
 BA.debugLineNum = 375;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(4194304);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 376;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(8388608);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 377;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(16777216);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 381;BA.debugLine="Dim networks As List = root.Get(\"networks\")";
Debug.ShouldStop(268435456);
_networks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_networks.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("networks")))));Debug.locals.put("networks", _networks);
 BA.debugLineNum = 382;BA.debugLine="For Each colnetworks As Map In networks";
Debug.ShouldStop(536870912);
_colnetworks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group6 = _networks;
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_colnetworks.setObject(group6.runMethod(false,"Get",index6));
Debug.locals.put("colnetworks", _colnetworks);
 BA.debugLineNum = 391;BA.debugLine="networkID = colnetworks.Get(\"network_id\")";
Debug.ShouldStop(64);
main._networkid = BA.ObjectToString(_colnetworks.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("network_id")))));
 BA.debugLineNum = 392;BA.debugLine="Log(\"networkID: \" &  networkID)";
Debug.ShouldStop(128);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("networkID: "),main._networkid)));
 }
}Debug.locals.put("colnetworks", _colnetworks);
;
 BA.debugLineNum = 395;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetAuthInfo (main) ","main",0,main.ba,main.mostCurrent,326);
if (RapidSub.canDelegate("getauthinfo")) { return b4j.example.main.remoteMe.runUserSub(false, "main","getauthinfo", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _authtokenmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _region = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("json", _json);
 BA.debugLineNum = 326;BA.debugLine="Sub GetAuthInfo(json As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 327;BA.debugLine="lblStatus.Text = \"Getting authtoken...\"";
Debug.ShouldStop(64);
main._lblstatus.runMethod(true,"setText",BA.ObjectToString("Getting authtoken..."));
 BA.debugLineNum = 328;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(128);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 329;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(256);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 330;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(512);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 331;BA.debugLine="Dim authtokenmap As Map = root.Get(\"authtoken\")";
Debug.ShouldStop(1024);
_authtokenmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_authtokenmap.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("authtoken")))));Debug.locals.put("authtokenmap", _authtokenmap);
 BA.debugLineNum = 332;BA.debugLine="authToken = authtokenmap.Get(\"authtoken\")";
Debug.ShouldStop(2048);
main._authtoken = BA.ObjectToString(_authtokenmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("authtoken")))));
 BA.debugLineNum = 333;BA.debugLine="Log(\"authToken: \" &  authToken)";
Debug.ShouldStop(4096);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("authToken: "),main._authtoken)));
 BA.debugLineNum = 341;BA.debugLine="Dim region As Map = root.Get(\"region\")";
Debug.ShouldStop(1048576);
_region = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_region.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region")))));Debug.locals.put("region", _region);
 BA.debugLineNum = 342;BA.debugLine="userRegion = region.GetKeyAt(0)";
Debug.ShouldStop(2097152);
main._userregion = BA.ObjectToString(_region.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 343;BA.debugLine="Log(\"userRegion: \" &  userRegion)";
Debug.ShouldStop(4194304);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("userRegion: "),main._userregion)));
 BA.debugLineNum = 347;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcamerainfo(RemoteObject _json) throws Exception{
try {
		Debug.PushSubsStack("GetCameraInfo (main) ","main",0,main.ba,main.mostCurrent,447);
if (RapidSub.canDelegate("getcamerainfo")) { return b4j.example.main.remoteMe.runUserSub(false, "main","getcamerainfo", _json);}
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
Debug.locals.put("json", _json);
 BA.debugLineNum = 447;BA.debugLine="Sub GetCameraInfo(json As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 448;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(-2147483648);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 449;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(1);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 450;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(2);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 451;BA.debugLine="Dim camera_status As Map = root.Get(\"camera_statu";
Debug.ShouldStop(4);
_camera_status = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_camera_status.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("camera_status")))));Debug.locals.put("camera_status", _camera_status);
 BA.debugLineNum = 452;BA.debugLine="Dim total_108_wakeups As Int = camera_status.Get(";
Debug.ShouldStop(8);
_total_108_wakeups = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_108_wakeups")))));Debug.locals.put("total_108_wakeups", _total_108_wakeups);Debug.locals.put("total_108_wakeups", _total_108_wakeups);
 BA.debugLineNum = 453;BA.debugLine="Dim battery_voltage As Int = camera_status.Get(\"b";
Debug.ShouldStop(16);
_battery_voltage = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("battery_voltage")))));Debug.locals.put("battery_voltage", _battery_voltage);Debug.locals.put("battery_voltage", _battery_voltage);
 BA.debugLineNum = 454;BA.debugLine="Dim light_sensor_data_valid As String = camera_st";
Debug.ShouldStop(32);
_light_sensor_data_valid = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("light_sensor_data_valid")))));Debug.locals.put("light_sensor_data_valid", _light_sensor_data_valid);Debug.locals.put("light_sensor_data_valid", _light_sensor_data_valid);
 BA.debugLineNum = 455;BA.debugLine="Dim lfr_tb_wakeups As Int = camera_status.Get(\"lf";
Debug.ShouldStop(64);
_lfr_tb_wakeups = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lfr_tb_wakeups")))));Debug.locals.put("lfr_tb_wakeups", _lfr_tb_wakeups);Debug.locals.put("lfr_tb_wakeups", _lfr_tb_wakeups);
 BA.debugLineNum = 456;BA.debugLine="Dim fw_git_hash As String = camera_status.Get(\"fw";
Debug.ShouldStop(128);
_fw_git_hash = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fw_git_hash")))));Debug.locals.put("fw_git_hash", _fw_git_hash);Debug.locals.put("fw_git_hash", _fw_git_hash);
 BA.debugLineNum = 457;BA.debugLine="Dim wifi_strength As Int = camera_status.Get(\"wif";
Debug.ShouldStop(256);
_wifi_strength = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("wifi_strength")))));Debug.locals.put("wifi_strength", _wifi_strength);Debug.locals.put("wifi_strength", _wifi_strength);
 BA.debugLineNum = 458;BA.debugLine="Dim lfr_strength As Int = camera_status.Get(\"lfr_";
Debug.ShouldStop(512);
_lfr_strength = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lfr_strength")))));Debug.locals.put("lfr_strength", _lfr_strength);Debug.locals.put("lfr_strength", _lfr_strength);
 BA.debugLineNum = 459;BA.debugLine="Dim total_tb_wakeups As Int = camera_status.Get(\"";
Debug.ShouldStop(1024);
_total_tb_wakeups = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_tb_wakeups")))));Debug.locals.put("total_tb_wakeups", _total_tb_wakeups);Debug.locals.put("total_tb_wakeups", _total_tb_wakeups);
 BA.debugLineNum = 460;BA.debugLine="Dim created_at As String = camera_status.Get(\"cre";
Debug.ShouldStop(2048);
_created_at = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 461;BA.debugLine="Dim light_sensor_ch0 As Int = camera_status.Get(\"";
Debug.ShouldStop(4096);
_light_sensor_ch0 = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("light_sensor_ch0")))));Debug.locals.put("light_sensor_ch0", _light_sensor_ch0);Debug.locals.put("light_sensor_ch0", _light_sensor_ch0);
 BA.debugLineNum = 462;BA.debugLine="Dim mac As String = camera_status.Get(\"mac\")";
Debug.ShouldStop(8192);
_mac = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mac")))));Debug.locals.put("mac", _mac);Debug.locals.put("mac", _mac);
 BA.debugLineNum = 463;BA.debugLine="Dim unit_number As Int = camera_status.Get(\"unit_";
Debug.ShouldStop(16384);
_unit_number = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("unit_number")))));Debug.locals.put("unit_number", _unit_number);Debug.locals.put("unit_number", _unit_number);
 BA.debugLineNum = 464;BA.debugLine="Dim updated_at As String = camera_status.Get(\"upd";
Debug.ShouldStop(32768);
_updated_at = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("updated_at")))));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 465;BA.debugLine="Dim light_sensor_ch1 As Int = camera_status.Get(\"";
Debug.ShouldStop(65536);
_light_sensor_ch1 = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("light_sensor_ch1")))));Debug.locals.put("light_sensor_ch1", _light_sensor_ch1);Debug.locals.put("light_sensor_ch1", _light_sensor_ch1);
 BA.debugLineNum = 466;BA.debugLine="Dim time_dhcp_lease As Int = camera_status.Get(\"t";
Debug.ShouldStop(131072);
_time_dhcp_lease = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("time_dhcp_lease")))));Debug.locals.put("time_dhcp_lease", _time_dhcp_lease);Debug.locals.put("time_dhcp_lease", _time_dhcp_lease);
 BA.debugLineNum = 467;BA.debugLine="Dim temperature As Int = camera_status.Get(\"tempe";
Debug.ShouldStop(262144);
_temperature = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("temperature")))));Debug.locals.put("temperature", _temperature);Debug.locals.put("temperature", _temperature);
 BA.debugLineNum = 468;BA.debugLine="Dim time_first_video As Int = camera_status.Get(\"";
Debug.ShouldStop(524288);
_time_first_video = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("time_first_video")))));Debug.locals.put("time_first_video", _time_first_video);Debug.locals.put("time_first_video", _time_first_video);
 BA.debugLineNum = 469;BA.debugLine="Dim time_dns_resolve As Int = camera_status.Get(\"";
Debug.ShouldStop(1048576);
_time_dns_resolve = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("time_dns_resolve")))));Debug.locals.put("time_dns_resolve", _time_dns_resolve);Debug.locals.put("time_dns_resolve", _time_dns_resolve);
 BA.debugLineNum = 470;BA.debugLine="Dim id As Int = camera_status.Get(\"id\")";
Debug.ShouldStop(2097152);
_id = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 471;BA.debugLine="Dim temp_alert_status As String = camera_status.G";
Debug.ShouldStop(4194304);
_temp_alert_status = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("temp_alert_status")))));Debug.locals.put("temp_alert_status", _temp_alert_status);Debug.locals.put("temp_alert_status", _temp_alert_status);
 BA.debugLineNum = 472;BA.debugLine="Dim time_108_boot As Int = camera_status.Get(\"tim";
Debug.ShouldStop(8388608);
_time_108_boot = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("time_108_boot")))));Debug.locals.put("time_108_boot", _time_108_boot);Debug.locals.put("time_108_boot", _time_108_boot);
 BA.debugLineNum = 473;BA.debugLine="Dim lfr_108_wakeups As Int = camera_status.Get(\"l";
Debug.ShouldStop(16777216);
_lfr_108_wakeups = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lfr_108_wakeups")))));Debug.locals.put("lfr_108_wakeups", _lfr_108_wakeups);Debug.locals.put("lfr_108_wakeups", _lfr_108_wakeups);
 BA.debugLineNum = 474;BA.debugLine="cameraThumbnail = camera_status.Get(\"thumbnail\")";
Debug.ShouldStop(33554432);
main._camerathumbnail = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("thumbnail")))));
 BA.debugLineNum = 475;BA.debugLine="Log(\"cameraThumbnail: \" & cameraThumbnail)";
Debug.ShouldStop(67108864);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("cameraThumbnail: "),main._camerathumbnail)));
 BA.debugLineNum = 476;BA.debugLine="Dim lifetime_duration As Int = camera_status.Get(";
Debug.ShouldStop(134217728);
_lifetime_duration = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lifetime_duration")))));Debug.locals.put("lifetime_duration", _lifetime_duration);Debug.locals.put("lifetime_duration", _lifetime_duration);
 BA.debugLineNum = 477;BA.debugLine="Dim wifi_connect_failure_count As Int = camera_st";
Debug.ShouldStop(268435456);
_wifi_connect_failure_count = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("wifi_connect_failure_count")))));Debug.locals.put("wifi_connect_failure_count", _wifi_connect_failure_count);Debug.locals.put("wifi_connect_failure_count", _wifi_connect_failure_count);
 BA.debugLineNum = 478;BA.debugLine="Dim camera_id As Int = camera_status.Get(\"camera_";
Debug.ShouldStop(536870912);
_camera_id = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("camera_id")))));Debug.locals.put("camera_id", _camera_id);Debug.locals.put("camera_id", _camera_id);
 BA.debugLineNum = 479;BA.debugLine="Dim battery_alert_status As String = camera_statu";
Debug.ShouldStop(1073741824);
_battery_alert_status = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("battery_alert_status")))));Debug.locals.put("battery_alert_status", _battery_alert_status);Debug.locals.put("battery_alert_status", _battery_alert_status);
 BA.debugLineNum = 480;BA.debugLine="Dim dhcp_failure_count As Int = camera_status.Get";
Debug.ShouldStop(-2147483648);
_dhcp_failure_count = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("dhcp_failure_count")))));Debug.locals.put("dhcp_failure_count", _dhcp_failure_count);Debug.locals.put("dhcp_failure_count", _dhcp_failure_count);
 BA.debugLineNum = 481;BA.debugLine="Dim ip_address As String = camera_status.Get(\"ip_";
Debug.ShouldStop(1);
_ip_address = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ip_address")))));Debug.locals.put("ip_address", _ip_address);Debug.locals.put("ip_address", _ip_address);
 BA.debugLineNum = 482;BA.debugLine="Dim ipv As String = camera_status.Get(\"ipv\")";
Debug.ShouldStop(2);
_ipv = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ipv")))));Debug.locals.put("ipv", _ipv);Debug.locals.put("ipv", _ipv);
 BA.debugLineNum = 483;BA.debugLine="Dim light_sensor_data_new As String = camera_stat";
Debug.ShouldStop(4);
_light_sensor_data_new = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("light_sensor_data_new")))));Debug.locals.put("light_sensor_data_new", _light_sensor_data_new);Debug.locals.put("light_sensor_data_new", _light_sensor_data_new);
 BA.debugLineNum = 484;BA.debugLine="Dim network_id As Int = camera_status.Get(\"networ";
Debug.ShouldStop(8);
_network_id = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("network_id")))));Debug.locals.put("network_id", _network_id);Debug.locals.put("network_id", _network_id);
 BA.debugLineNum = 485;BA.debugLine="Dim account_id As Int = camera_status.Get(\"accoun";
Debug.ShouldStop(16);
_account_id = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("account_id")))));Debug.locals.put("account_id", _account_id);Debug.locals.put("account_id", _account_id);
 BA.debugLineNum = 486;BA.debugLine="Dim serial As String = camera_status.Get(\"serial\"";
Debug.ShouldStop(32);
_serial = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("serial")))));Debug.locals.put("serial", _serial);Debug.locals.put("serial", _serial);
 BA.debugLineNum = 487;BA.debugLine="Dim dev_1 As Int = camera_status.Get(\"dev_1\")";
Debug.ShouldStop(64);
_dev_1 = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("dev_1")))));Debug.locals.put("dev_1", _dev_1);Debug.locals.put("dev_1", _dev_1);
 BA.debugLineNum = 488;BA.debugLine="Dim time_wlan_connect As Int = camera_status.Get(";
Debug.ShouldStop(128);
_time_wlan_connect = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("time_wlan_connect")))));Debug.locals.put("time_wlan_connect", _time_wlan_connect);Debug.locals.put("time_wlan_connect", _time_wlan_connect);
 BA.debugLineNum = 489;BA.debugLine="Dim dev_2 As Int = camera_status.Get(\"dev_2\")";
Debug.ShouldStop(256);
_dev_2 = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("dev_2")))));Debug.locals.put("dev_2", _dev_2);Debug.locals.put("dev_2", _dev_2);
 BA.debugLineNum = 490;BA.debugLine="Dim socket_failure_count As Int = camera_status.G";
Debug.ShouldStop(512);
_socket_failure_count = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("socket_failure_count")))));Debug.locals.put("socket_failure_count", _socket_failure_count);Debug.locals.put("socket_failure_count", _socket_failure_count);
 BA.debugLineNum = 491;BA.debugLine="Dim dev_3 As Int = camera_status.Get(\"dev_3\")";
Debug.ShouldStop(1024);
_dev_3 = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("dev_3")))));Debug.locals.put("dev_3", _dev_3);Debug.locals.put("dev_3", _dev_3);
 BA.debugLineNum = 492;BA.debugLine="Dim pir_rejections As Int = camera_status.Get(\"pi";
Debug.ShouldStop(2048);
_pir_rejections = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pir_rejections")))));Debug.locals.put("pir_rejections", _pir_rejections);Debug.locals.put("pir_rejections", _pir_rejections);
 BA.debugLineNum = 493;BA.debugLine="Dim sync_module_id As Int = camera_status.Get(\"sy";
Debug.ShouldStop(4096);
_sync_module_id = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("sync_module_id")))));Debug.locals.put("sync_module_id", _sync_module_id);Debug.locals.put("sync_module_id", _sync_module_id);
 BA.debugLineNum = 494;BA.debugLine="Dim lifetime_count As Int = camera_status.Get(\"li";
Debug.ShouldStop(8192);
_lifetime_count = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lifetime_count")))));Debug.locals.put("lifetime_count", _lifetime_count);Debug.locals.put("lifetime_count", _lifetime_count);
 BA.debugLineNum = 495;BA.debugLine="Dim error_codes As Int = camera_status.Get(\"error";
Debug.ShouldStop(16384);
_error_codes = BA.numberCast(int.class, _camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("error_codes")))));Debug.locals.put("error_codes", _error_codes);Debug.locals.put("error_codes", _error_codes);
 BA.debugLineNum = 496;BA.debugLine="Dim fw_version As String = camera_status.Get(\"fw_";
Debug.ShouldStop(32768);
_fw_version = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fw_version")))));Debug.locals.put("fw_version", _fw_version);Debug.locals.put("fw_version", _fw_version);
 BA.debugLineNum = 497;BA.debugLine="Dim ac_power As String = camera_status.Get(\"ac_po";
Debug.ShouldStop(65536);
_ac_power = BA.ObjectToString(_camera_status.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ac_power")))));Debug.locals.put("ac_power", _ac_power);Debug.locals.put("ac_power", _ac_power);
 BA.debugLineNum = 498;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("GetCommandID (main) ","main",0,main.ba,main.mostCurrent,397);
if (RapidSub.canDelegate("getcommandid")) { return b4j.example.main.remoteMe.runUserSub(false, "main","getcommandid", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("json", _json);
 BA.debugLineNum = 397;BA.debugLine="Sub GetCommandID(json As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 398;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(8192);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 399;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(16384);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 400;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(32768);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 415;BA.debugLine="commandID = root.Get(\"id\")";
Debug.ShouldStop(1073741824);
main._commandid = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));
 BA.debugLineNum = 416;BA.debugLine="Log(\"commandID: \" & commandID)";
Debug.ShouldStop(-2147483648);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("commandID: "),main._commandid)));
 BA.debugLineNum = 437;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("GetCommandStatus (main) ","main",0,main.ba,main.mostCurrent,439);
if (RapidSub.canDelegate("getcommandstatus")) { return b4j.example.main.remoteMe.runUserSub(false, "main","getcommandstatus", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("json", _json);
 BA.debugLineNum = 439;BA.debugLine="Sub GetCommandStatus(json As String)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 440;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(8388608);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 441;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(16777216);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 442;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(33554432);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 443;BA.debugLine="commandComplete = root.Get(\"complete\")";
Debug.ShouldStop(67108864);
main._commandcomplete = BA.ObjectToBoolean(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("complete")))));
 BA.debugLineNum = 444;BA.debugLine="Log(\"commandComplete: \" & commandComplete)";
Debug.ShouldStop(134217728);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("commandComplete: "),main._commandcomplete)));
 BA.debugLineNum = 445;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("GetUserInfo (main) ","main",0,main.ba,main.mostCurrent,349);
if (RapidSub.canDelegate("getuserinfo")) { return b4j.example.main.remoteMe.runUserSub(false, "main","getuserinfo", _json);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("json", _json);
 BA.debugLineNum = 349;BA.debugLine="Sub GetUserInfo(json As String)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 350;BA.debugLine="lblStatus.Text = \"Getting user information...\"";
Debug.ShouldStop(536870912);
main._lblstatus.runMethod(true,"setText",BA.ObjectToString("Getting user information..."));
 BA.debugLineNum = 351;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1073741824);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 352;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(-2147483648);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 353;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(1);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 368;BA.debugLine="accountID = root.Get(\"id\")";
Debug.ShouldStop(32768);
main._accountid = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));
 BA.debugLineNum = 369;BA.debugLine="Log(\"accountID: \" &  accountID)";
Debug.ShouldStop(65536);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("accountID: "),main._accountid)));
 BA.debugLineNum = 371;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("ivClose_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,520);
if (RapidSub.canDelegate("ivclose_mouseclicked")) { return b4j.example.main.remoteMe.runUserSub(false, "main","ivclose_mouseclicked", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 520;BA.debugLine="Private Sub ivClose_MouseClicked (EventData As Mou";
Debug.ShouldStop(128);
 BA.debugLineNum = 521;BA.debugLine="ExitApplication";
Debug.ShouldStop(256);
main.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 522;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("ivMax_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,540);
if (RapidSub.canDelegate("ivmax_mouseclicked")) { return b4j.example.main.remoteMe.runUserSub(false, "main","ivmax_mouseclicked", _eventdata);}
RemoteObject _scr = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 540;BA.debugLine="Private Sub ivMax_MouseClicked (EventData As Mouse";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 541;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 542;BA.debugLine="Dim scr As Screen = fx.PrimaryScreen";
Debug.ShouldStop(536870912);
_scr = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_scr = main._fx.runMethod(false,"getPrimaryScreen");Debug.locals.put("scr", _scr);Debug.locals.put("scr", _scr);
 BA.debugLineNum = 543;BA.debugLine="If isMaximized Then";
Debug.ShouldStop(1073741824);
if (main._ismaximized.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 544;BA.debugLine="MainForm.WindowLeft = f_X";
Debug.ShouldStop(-2147483648);
main._mainform.runMethod(true,"setWindowLeft",main._f_x);
 BA.debugLineNum = 545;BA.debugLine="MainForm.WindowTop = f_Y";
Debug.ShouldStop(1);
main._mainform.runMethod(true,"setWindowTop",main._f_y);
 BA.debugLineNum = 546;BA.debugLine="MainForm.WindowWidth = f_W";
Debug.ShouldStop(2);
main._mainform.runMethod(true,"setWindowWidth",main._f_w);
 BA.debugLineNum = 547;BA.debugLine="MainForm.WindowHeight = f_H";
Debug.ShouldStop(4);
main._mainform.runMethod(true,"setWindowHeight",main._f_h);
 }else {
 BA.debugLineNum = 549;BA.debugLine="f_X = MainForm.WindowLeft";
Debug.ShouldStop(16);
main._f_x = main._mainform.runMethod(true,"getWindowLeft");
 BA.debugLineNum = 550;BA.debugLine="f_Y = MainForm.WindowTop";
Debug.ShouldStop(32);
main._f_y = main._mainform.runMethod(true,"getWindowTop");
 BA.debugLineNum = 551;BA.debugLine="f_W = MainForm.WindowWidth";
Debug.ShouldStop(64);
main._f_w = main._mainform.runMethod(true,"getWindowWidth");
 BA.debugLineNum = 552;BA.debugLine="f_H = MainForm.WindowHeight";
Debug.ShouldStop(128);
main._f_h = main._mainform.runMethod(true,"getWindowHeight");
 BA.debugLineNum = 553;BA.debugLine="MainForm.WindowLeft = 0";
Debug.ShouldStop(256);
main._mainform.runMethod(true,"setWindowLeft",BA.numberCast(double.class, 0));
 BA.debugLineNum = 554;BA.debugLine="MainForm.WindowTop = 0";
Debug.ShouldStop(512);
main._mainform.runMethod(true,"setWindowTop",BA.numberCast(double.class, 0));
 BA.debugLineNum = 555;BA.debugLine="MainForm.WindowWidth = scr.MaxX";
Debug.ShouldStop(1024);
main._mainform.runMethod(true,"setWindowWidth",_scr.runMethod(true,"getMaxX"));
 BA.debugLineNum = 556;BA.debugLine="MainForm.WindowHeight = scr.MaxY + 40";
Debug.ShouldStop(2048);
main._mainform.runMethod(true,"setWindowHeight",RemoteObject.solve(new RemoteObject[] {_scr.runMethod(true,"getMaxY"),RemoteObject.createImmutable(40)}, "+",1, 0));
 };
 BA.debugLineNum = 558;BA.debugLine="isMaximized = Not(isMaximized)";
Debug.ShouldStop(8192);
main._ismaximized = main.__c.runMethod(true,"Not",(Object)(main._ismaximized));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e20) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e20.toString()); BA.debugLineNum = 560;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 562;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("ivMin_MouseClicked (main) ","main",0,main.ba,main.mostCurrent,580);
if (RapidSub.canDelegate("ivmin_mouseclicked")) { return b4j.example.main.remoteMe.runUserSub(false, "main","ivmin_mouseclicked", _eventdata);}
RemoteObject _jmf = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _stage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 580;BA.debugLine="Private Sub ivMin_MouseClicked (EventData As Mouse";
Debug.ShouldStop(8);
 BA.debugLineNum = 581;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 582;BA.debugLine="Dim jmf As JavaObject = MainForm";
Debug.ShouldStop(32);
_jmf = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jmf.setObject(main._mainform);Debug.locals.put("jmf", _jmf);
 BA.debugLineNum = 583;BA.debugLine="Dim stage As JavaObject = jmf.GetField(\"stage\")";
Debug.ShouldStop(64);
_stage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_stage.setObject(_jmf.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("stage", _stage);
 BA.debugLineNum = 584;BA.debugLine="stage.RunMethod(\"setIconified\", Array As Object(";
Debug.ShouldStop(128);
_stage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setIconified")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(main.__c.getField(true,"True"))})));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e6.toString()); BA.debugLineNum = 586;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 588;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("lbTitle_MouseDragged (main) ","main",0,main.ba,main.mostCurrent,500);
if (RapidSub.canDelegate("lbtitle_mousedragged")) { return b4j.example.main.remoteMe.runUserSub(false, "main","lbtitle_mousedragged", _eventdata);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 500;BA.debugLine="Private Sub lbTitle_MouseDragged (EventData As Mou";
Debug.ShouldStop(524288);
 BA.debugLineNum = 501;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 502;BA.debugLine="If isMaximized Then Return";
Debug.ShouldStop(2097152);
if (main._ismaximized.<Boolean>get().booleanValue()) { 
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 503;BA.debugLine="Dim jo As JavaObject = EventData";
Debug.ShouldStop(4194304);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(_eventdata.getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 504;BA.debugLine="MainForm.WindowLeft = jo.RunMethod(\"getScreenX\",";
Debug.ShouldStop(8388608);
main._mainform.runMethod(true,"setWindowLeft",RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getScreenX")),(Object)((main.__c.getField(false,"Null"))))),main._xmouse}, "-",1, 0));
 BA.debugLineNum = 505;BA.debugLine="MainForm.WindowTop = jo.RunMethod(\"getScreenY\",";
Debug.ShouldStop(16777216);
main._mainform.runMethod(true,"setWindowTop",RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getScreenY")),(Object)((main.__c.getField(false,"Null"))))),main._ymouse}, "-",1, 0));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e7.toString()); BA.debugLineNum = 507;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 509;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("lbTitle_MousePressed (main) ","main",0,main.ba,main.mostCurrent,511);
if (RapidSub.canDelegate("lbtitle_mousepressed")) { return b4j.example.main.remoteMe.runUserSub(false, "main","lbtitle_mousepressed", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 511;BA.debugLine="Private Sub lbTitle_MousePressed (EventData As Mou";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 512;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 513;BA.debugLine="xMouse = EventData.X + lbTitle.Left + 15";
Debug.ShouldStop(1);
main._xmouse = RemoteObject.solve(new RemoteObject[] {_eventdata.runMethod(true,"getX"),main._lbtitle.runMethod(true,"getLeft"),RemoteObject.createImmutable(15)}, "++",2, 0);
 BA.debugLineNum = 514;BA.debugLine="yMouse = EventData.Y + lbTitle.Top + 15";
Debug.ShouldStop(2);
main._ymouse = RemoteObject.solve(new RemoteObject[] {_eventdata.runMethod(true,"getY"),main._lbtitle.runMethod(true,"getTop"),RemoteObject.createImmutable(15)}, "++",2, 0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e5.toString()); BA.debugLineNum = 516;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 518;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Max_Entered_Event (main) ","main",0,main.ba,main.mostCurrent,564);
if (RapidSub.canDelegate("max_entered_event")) { return b4j.example.main.remoteMe.runUserSub(false, "main","max_entered_event", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 564;BA.debugLine="Private Sub Max_Entered_Event(e As Event)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 565;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 566;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
Debug.ShouldStop(2097152);
main._ivmax.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable("_btMaxEnt.png")))).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e4.toString()); BA.debugLineNum = 568;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 570;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Max_Exited_Event (main) ","main",0,main.ba,main.mostCurrent,572);
if (RapidSub.canDelegate("max_exited_event")) { return b4j.example.main.remoteMe.runUserSub(false, "main","max_exited_event", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 572;BA.debugLine="Private Sub Max_Exited_Event(e As Event)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 573;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 574;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
Debug.ShouldStop(536870912);
main._ivmax.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable("_btMax.png")))).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e4.toString()); BA.debugLineNum = 576;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 578;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Min_Entered_Event (main) ","main",0,main.ba,main.mostCurrent,590);
if (RapidSub.canDelegate("min_entered_event")) { return b4j.example.main.remoteMe.runUserSub(false, "main","min_entered_event", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 590;BA.debugLine="Private Sub Min_Entered_Event(e As Event)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 591;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 592;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
Debug.ShouldStop(32768);
main._ivmin.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable("_btMinEnt.png")))).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e4.toString()); BA.debugLineNum = 594;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 596;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Min_Exited_Event (main) ","main",0,main.ba,main.mostCurrent,598);
if (RapidSub.canDelegate("min_exited_event")) { return b4j.example.main.remoteMe.runUserSub(false, "main","min_exited_event", _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 598;BA.debugLine="Private Sub Min_Exited_Event(e As Event)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 599;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 600;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
Debug.ShouldStop(8388608);
main._ivmin.runVoidMethod ("SetImage",(Object)((main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(main._imginit,RemoteObject.createImmutable("_btMin.png")))).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e4.toString()); BA.debugLineNum = 602;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.__c.runMethod(false,"LastException",main.ba))));
 };
 BA.debugLineNum = 604;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
main.myClass = BA.getDeviceClass ("b4j.example.main");
httputils2service.myClass = BA.getDeviceClass ("b4j.example.httputils2service");
httpjob.myClass = BA.getDeviceClass ("b4j.example.httpjob");
		
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
 //BA.debugLineNum = 29;BA.debugLine="Private f_X, f_Y, f_W, f_H As Double";
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
 //BA.debugLineNum = 33;BA.debugLine="Private lblStatus As Label";
main._lblstatus = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private ivFrontDoor As ImageView";
main._ivfrontdoor = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private ivSideYard As ImageView";
main._ivsideyard = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private lblDriveway As Label";
main._lbldriveway = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private lblFrontDoor As Label";
main._lblfrontdoor = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private lblSideYard As Label";
main._lblsideyard = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _refreshcameras() throws Exception{
try {
		Debug.PushSubsStack("RefreshCameras (main) ","main",0,main.ba,main.mostCurrent,163);
if (RapidSub.canDelegate("refreshcameras")) { b4j.example.main.remoteMe.runUserSub(false, "main","refreshcameras"); return;}
ResumableSub_RefreshCameras rsub = new ResumableSub_RefreshCameras(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_RefreshCameras extends BA.ResumableSub {
public ResumableSub_RefreshCameras(b4j.example.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.example.main parent;
RemoteObject _camera = RemoteObject.createImmutable("");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
RemoteObject _links = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _link = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject group6;
int index6;
int groupLen6;
int step33;
int limit33;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RefreshCameras (main) ","main",0,main.ba,main.mostCurrent,163);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 169;BA.debugLine="Try";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 170;BA.debugLine="Dim camera As String";
Debug.ShouldStop(512);
_camera = RemoteObject.createImmutable("");Debug.locals.put("camera", _camera);
 BA.debugLineNum = 171;BA.debugLine="Dim iv As ImageView";
Debug.ShouldStop(1024);
_iv = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 172;BA.debugLine="Dim links As List";
Debug.ShouldStop(2048);
_links = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("links", _links);
 BA.debugLineNum = 173;BA.debugLine="links = Array(\"347574\", \"236967\", \"226821\")";
Debug.ShouldStop(4096);
_links = parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable(("347574")),RemoteObject.createImmutable(("236967")),(RemoteObject.createImmutable("226821"))})));Debug.locals.put("links", _links);
 BA.debugLineNum = 175;BA.debugLine="For Each link As String In links";
Debug.ShouldStop(16384);
if (true) break;

case 4:
//for
this.state = 66;
group6 = _links;
index6 = 0;
groupLen6 = group6.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("link", _link);
this.state = 70;
if (true) break;

case 70:
//C
this.state = 66;
if (index6 < groupLen6) {
this.state = 6;
_link = BA.ObjectToString(group6.runMethod(false,"Get",index6));Debug.locals.put("link", _link);}
if (true) break;

case 71:
//C
this.state = 70;
index6++;
Debug.locals.put("link", _link);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 176;BA.debugLine="camera = link";
Debug.ShouldStop(32768);
_camera = _link;Debug.locals.put("camera", _camera);
 BA.debugLineNum = 177;BA.debugLine="If camera = \"347574\" Then";
Debug.ShouldStop(65536);
if (true) break;

case 7:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("347574"))) { 
this.state = 9;
}else 
{ BA.debugLineNum = 180;BA.debugLine="Else If camera = \"236967\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("236967"))) { 
this.state = 11;
}else 
{ BA.debugLineNum = 183;BA.debugLine="Else If camera = \"226821\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("226821"))) { 
this.state = 13;
}}}
if (true) break;

case 9:
//C
this.state = 14;
 BA.debugLineNum = 178;BA.debugLine="lblStatus.Text = \"Capturing a new thumbnail fo";
Debug.ShouldStop(131072);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Capturing a new thumbnail for the Driveway..."));
 BA.debugLineNum = 179;BA.debugLine="iv = ivDriveway";
Debug.ShouldStop(262144);
_iv = parent._ivdriveway;Debug.locals.put("iv", _iv);
 if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 181;BA.debugLine="lblStatus.Text = \"Capturing a new thumbnail fo";
Debug.ShouldStop(1048576);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Capturing a new thumbnail for the Front Door..."));
 BA.debugLineNum = 182;BA.debugLine="iv = ivFrontDoor";
Debug.ShouldStop(2097152);
_iv = parent._ivfrontdoor;Debug.locals.put("iv", _iv);
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 184;BA.debugLine="lblStatus.Text = \"Capturing a new thumbnail fo";
Debug.ShouldStop(8388608);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Capturing a new thumbnail for the Side Yard..."));
 BA.debugLineNum = 185;BA.debugLine="iv = ivSideYard";
Debug.ShouldStop(16777216);
_iv = parent._ivsideyard;Debug.locals.put("iv", _iv);
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 189;BA.debugLine="RESTPost(\"https://rest-\" & userRegion &\".immedi";
Debug.ShouldStop(268435456);
_restpost(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/camera/"),_camera,RemoteObject.createImmutable("/thumbnail")));
 BA.debugLineNum = 190;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"),BA.numberCast(int.class, 1000));
this.state = 72;
return;
case 72:
//C
this.state = 15;
;
 BA.debugLineNum = 191;BA.debugLine="If response.StartsWith(\"ERROR: \") Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 15:
//if
this.state = 65;
if (parent._response.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR: "))).<Boolean>get().booleanValue()) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 65;
 BA.debugLineNum = 192;BA.debugLine="Log(response)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("Log",(Object)(parent._response));
 BA.debugLineNum = 193;BA.debugLine="lblStatus.Text = response";
Debug.ShouldStop(1);
parent._lblstatus.runMethod(true,"setText",parent._response);
 BA.debugLineNum = 194;BA.debugLine="Return";
Debug.ShouldStop(2);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 196;BA.debugLine="GetCommandID(response)";
Debug.ShouldStop(8);
_getcommandid(parent._response);
 BA.debugLineNum = 197;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedi";
Debug.ShouldStop(16);
_restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/command/"),parent._commandid));
 BA.debugLineNum = 198;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"),BA.numberCast(int.class, 1000));
this.state = 73;
return;
case 73:
//C
this.state = 20;
;
 BA.debugLineNum = 199;BA.debugLine="If response.StartsWith(\"ERROR: \") Then";
Debug.ShouldStop(64);
if (true) break;

case 20:
//if
this.state = 64;
if (parent._response.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR: "))).<Boolean>get().booleanValue()) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 64;
 BA.debugLineNum = 200;BA.debugLine="Log(response)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("Log",(Object)(parent._response));
 BA.debugLineNum = 201;BA.debugLine="lblStatus.Text = response";
Debug.ShouldStop(256);
parent._lblstatus.runMethod(true,"setText",parent._response);
 BA.debugLineNum = 202;BA.debugLine="Return";
Debug.ShouldStop(512);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 204;BA.debugLine="For i = 1 To 30";
Debug.ShouldStop(2048);
if (true) break;

case 25:
//for
this.state = 42;
step33 = 1;
limit33 = 30;
_i = 1 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 205;BA.debugLine="GetCommandStatus(response)";
Debug.ShouldStop(4096);
_getcommandstatus(parent._response);
 BA.debugLineNum = 206;BA.debugLine="If commandComplete Then";
Debug.ShouldStop(8192);
if (true) break;

case 28:
//if
this.state = 41;
if (parent._commandcomplete.<Boolean>get().booleanValue()) { 
this.state = 30;
}else {
this.state = 32;
}if (true) break;

case 30:
//C
this.state = 41;
 BA.debugLineNum = 207;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".imm";
Debug.ShouldStop(16384);
_restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/camera/"),_camera));
 BA.debugLineNum = 208;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"),BA.numberCast(int.class, 1000));
this.state = 76;
return;
case 76:
//C
this.state = 41;
;
 BA.debugLineNum = 209;BA.debugLine="GetCameraInfo(response)";
Debug.ShouldStop(65536);
_getcamerainfo(parent._response);
 BA.debugLineNum = 210;BA.debugLine="DownloadImage(\"https://rest-\" & userRegion";
Debug.ShouldStop(131072);
_downloadimage(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/"),parent._camerathumbnail,RemoteObject.createImmutable(".jpg")),_iv);
 BA.debugLineNum = 211;BA.debugLine="Exit";
Debug.ShouldStop(262144);
this.state = 42;
if (true) break;
 if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 213;BA.debugLine="If camera = \"347574\" Then";
Debug.ShouldStop(1048576);
if (true) break;

case 33:
//if
this.state = 40;
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("347574"))) { 
this.state = 35;
}else 
{ BA.debugLineNum = 215;BA.debugLine="Else If camera = \"236967\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("236967"))) { 
this.state = 37;
}else 
{ BA.debugLineNum = 217;BA.debugLine="Else If camera = \"226821\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("226821"))) { 
this.state = 39;
}}}
if (true) break;

case 35:
//C
this.state = 40;
 BA.debugLineNum = 214;BA.debugLine="lblStatus.Text = \"Awaiting for the Drivewa";
Debug.ShouldStop(2097152);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Awaiting for the Driveway thumbnail... "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable("/30")));
 if (true) break;

case 37:
//C
this.state = 40;
 BA.debugLineNum = 216;BA.debugLine="lblStatus.Text = \"Awaiting for the Front D";
Debug.ShouldStop(8388608);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Awaiting for the Front Door thumbnail...  "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable("/30")));
 if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 218;BA.debugLine="lblStatus.Text = \"Awaiting for the Side Ya";
Debug.ShouldStop(33554432);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Awaiting for the Side Yard thumbnail... "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable("/30")));
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
 BA.debugLineNum = 221;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".imme";
Debug.ShouldStop(268435456);
_restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/network/"),parent._networkid,RemoteObject.createImmutable("/command/"),parent._commandid));
 BA.debugLineNum = 222;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "refreshcameras"),BA.numberCast(int.class, 1000));
this.state = 77;
return;
case 77:
//C
this.state = 75;
;
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 224;BA.debugLine="If commandComplete = False Then";
Debug.ShouldStop(-2147483648);

case 42:
//if
this.state = 63;
if (RemoteObject.solveBoolean("=",parent._commandcomplete,parent.__c.getField(true,"False"))) { 
this.state = 44;
}else {
this.state = 54;
}if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 225;BA.debugLine="If camera = \"347574\" Then";
Debug.ShouldStop(1);
if (true) break;

case 45:
//if
this.state = 52;
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("347574"))) { 
this.state = 47;
}else 
{ BA.debugLineNum = 228;BA.debugLine="Else If camera = \"236967\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("236967"))) { 
this.state = 49;
}else 
{ BA.debugLineNum = 231;BA.debugLine="Else If camera = \"226821\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("226821"))) { 
this.state = 51;
}}}
if (true) break;

case 47:
//C
this.state = 52;
 BA.debugLineNum = 226;BA.debugLine="lblStatus.Text = \"Failed to retrieve Drivew";
Debug.ShouldStop(2);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Failed to retrieve Driveway thumbnail..."));
 BA.debugLineNum = 227;BA.debugLine="ivDriveway.SetImage(Null)";
Debug.ShouldStop(4);
parent._ivdriveway.runVoidMethod ("SetImage",(Object)((parent.__c.getField(false,"Null"))));
 if (true) break;

case 49:
//C
this.state = 52;
 BA.debugLineNum = 229;BA.debugLine="lblStatus.Text = \"Failed to retrieve Front";
Debug.ShouldStop(16);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Failed to retrieve Front Door thumbnail..."));
 BA.debugLineNum = 230;BA.debugLine="ivFrontDoor.SetImage(Null)";
Debug.ShouldStop(32);
parent._ivfrontdoor.runVoidMethod ("SetImage",(Object)((parent.__c.getField(false,"Null"))));
 if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 232;BA.debugLine="lblStatus.Text = \"Failed to retrieve Side Y";
Debug.ShouldStop(128);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Failed to retrieve Side Yard thumbnail..."));
 BA.debugLineNum = 233;BA.debugLine="ivSideYard.SetImage(Null)";
Debug.ShouldStop(256);
parent._ivsideyard.runVoidMethod ("SetImage",(Object)((parent.__c.getField(false,"Null"))));
 if (true) break;

case 52:
//C
this.state = 63;
;
 if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 236;BA.debugLine="DateTime.DateFormat = \"h:mm:ss a\"";
Debug.ShouldStop(2048);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("h:mm:ss a"));
 BA.debugLineNum = 237;BA.debugLine="lblStatus.Text = \"Last updated: \" & DateTime";
Debug.ShouldStop(4096);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Last updated: "),parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));
 BA.debugLineNum = 238;BA.debugLine="If camera = \"347574\" Then";
Debug.ShouldStop(8192);
if (true) break;

case 55:
//if
this.state = 62;
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("347574"))) { 
this.state = 57;
}else 
{ BA.debugLineNum = 240;BA.debugLine="Else If camera = \"236967\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("236967"))) { 
this.state = 59;
}else 
{ BA.debugLineNum = 242;BA.debugLine="Else If camera = \"226821\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_camera,BA.ObjectToString("226821"))) { 
this.state = 61;
}}}
if (true) break;

case 57:
//C
this.state = 62;
 BA.debugLineNum = 239;BA.debugLine="lblDriveway.Text = lblStatus.Text";
Debug.ShouldStop(16384);
parent._lbldriveway.runMethod(true,"setText",parent._lblstatus.runMethod(true,"getText"));
 if (true) break;

case 59:
//C
this.state = 62;
 BA.debugLineNum = 241;BA.debugLine="lblFrontDoor.Text = lblStatus.Text";
Debug.ShouldStop(65536);
parent._lblfrontdoor.runMethod(true,"setText",parent._lblstatus.runMethod(true,"getText"));
 if (true) break;

case 61:
//C
this.state = 62;
 BA.debugLineNum = 243;BA.debugLine="lblSideYard.Text = lblStatus.Text";
Debug.ShouldStop(262144);
parent._lblsideyard.runMethod(true,"setText",parent._lblstatus.runMethod(true,"getText"));
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
Debug.locals.put("link", _link);
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 68:
//C
this.state = 69;
this.catchState = 0;
 BA.debugLineNum = 250;BA.debugLine="Log(\"RefreshCamera LastException: \" & LastExcept";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("RefreshCamera LastException: "),parent.__c.runMethod(false,"LastException",main.ba))));
 BA.debugLineNum = 251;BA.debugLine="lblStatus.Text = \"RefreshCamera LastException: \"";
Debug.ShouldStop(67108864);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("RefreshCamera LastException: "),parent.__c.runMethod(false,"LastException",main.ba)));
 if (true) break;
if (true) break;

case 69:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 253;BA.debugLine="End Sub";
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
public static void  _requestauthtoken() throws Exception{
try {
		Debug.PushSubsStack("RequestAuthToken (main) ","main",0,main.ba,main.mostCurrent,110);
if (RapidSub.canDelegate("requestauthtoken")) { b4j.example.main.remoteMe.runUserSub(false, "main","requestauthtoken"); return;}
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
public ResumableSub_RequestAuthToken(b4j.example.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.example.main parent;
RemoteObject _joblogin = RemoteObject.declareNull("b4j.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RequestAuthToken (main) ","main",0,main.ba,main.mostCurrent,110);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 116;BA.debugLine="Try";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 117;BA.debugLine="lblStatus.Text = \"Authenticating...\"";
Debug.ShouldStop(1048576);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Authenticating..."));
 BA.debugLineNum = 118;BA.debugLine="Dim jobLogin As HttpJob";
Debug.ShouldStop(2097152);
_joblogin = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("jobLogin", _joblogin);
 BA.debugLineNum = 119;BA.debugLine="jobLogin.Initialize(\"\", Me)";
Debug.ShouldStop(4194304);
_joblogin.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 120;BA.debugLine="jobLogin.PostString(\"https://rest.prod.immedia-s";
Debug.ShouldStop(8388608);
_joblogin.runClassMethod (b4j.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("https://rest.prod.immedia-semi.com/login")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("email="),parent._emailaddress,RemoteObject.createImmutable("&password="),parent._password)));
 BA.debugLineNum = 121;BA.debugLine="jobLogin.GetRequest.SetContentType(\"application/";
Debug.ShouldStop(16777216);
_joblogin.runClassMethod (b4j.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/x-www-form-urlencoded")));
 BA.debugLineNum = 122;BA.debugLine="Wait For (jobLogin) JobDone(jobLogin As HttpJob)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","jobdone", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "requestauthtoken"), (_joblogin));
this.state = 25;
return;
case 25:
//C
this.state = 4;
_joblogin = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("jobLogin", _joblogin);
;
 BA.debugLineNum = 123;BA.debugLine="If jobLogin.Success Then";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 124;BA.debugLine="lblStatus.Text = \"Successfully logged in to the";
Debug.ShouldStop(134217728);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Successfully logged in to the Blink server..."));
 BA.debugLineNum = 126;BA.debugLine="GetAuthInfo(jobLogin.GetString)";
Debug.ShouldStop(536870912);
_getauthinfo(_joblogin.runClassMethod (b4j.example.httpjob.class, "_getstring" /*RemoteObject*/ ));
 BA.debugLineNum = 128;BA.debugLine="RESTGet(\"https://rest-\" & userRegion & \".immedi";
Debug.ShouldStop(-2147483648);
_restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/user")));
 BA.debugLineNum = 129;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "requestauthtoken"),BA.numberCast(int.class, 1000));
this.state = 26;
return;
case 26:
//C
this.state = 7;
;
 BA.debugLineNum = 130;BA.debugLine="If response.StartsWith(\"ERROR: \") Then";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 131;BA.debugLine="Log(response)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("Log",(Object)(parent._response));
 BA.debugLineNum = 132;BA.debugLine="lblStatus.Text = response";
Debug.ShouldStop(8);
parent._lblstatus.runMethod(true,"setText",parent._response);
 BA.debugLineNum = 133;BA.debugLine="Return";
Debug.ShouldStop(16);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 135;BA.debugLine="lblStatus.Text = \"AuthToken acquired...\"";
Debug.ShouldStop(64);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("AuthToken acquired..."));
 BA.debugLineNum = 136;BA.debugLine="GetUserInfo(response)";
Debug.ShouldStop(128);
_getuserinfo(parent._response);
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 139;BA.debugLine="RESTGet(\"https://rest-\" & userRegion &\".immedia";
Debug.ShouldStop(1024);
_restget(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),parent._userregion,RemoteObject.createImmutable(".immedia-semi.com/api/v1/camera/usage")));
 BA.debugLineNum = 140;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "requestauthtoken"),BA.numberCast(int.class, 1000));
this.state = 27;
return;
case 27:
//C
this.state = 13;
;
 BA.debugLineNum = 141;BA.debugLine="If response.StartsWith(\"ERROR: \") Then";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 142;BA.debugLine="Log(response)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("Log",(Object)(parent._response));
 BA.debugLineNum = 143;BA.debugLine="lblStatus.Text = response";
Debug.ShouldStop(16384);
parent._lblstatus.runMethod(true,"setText",parent._response);
 BA.debugLineNum = 144;BA.debugLine="Return";
Debug.ShouldStop(32768);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 146;BA.debugLine="GetAllCameras(response)";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 149;BA.debugLine="lblStatus.Text = \"RequestAuthToken error: \" & j";
Debug.ShouldStop(1048576);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("RequestAuthToken error: "),_joblogin.runClassMethod (b4j.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 150;BA.debugLine="Log(\"RequestAuthToken error: \" & jobLogin.GetSt";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("RequestAuthToken error: "),_joblogin.runClassMethod (b4j.example.httpjob.class, "_getstring" /*RemoteObject*/ ))));
 BA.debugLineNum = 151;BA.debugLine="Return";
Debug.ShouldStop(4194304);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;

case 21:
//C
this.state = 24;
;
 BA.debugLineNum = 153;BA.debugLine="jobLogin.Release";
Debug.ShouldStop(16777216);
_joblogin.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 154;BA.debugLine="lblStatus.Text = \"Ready\"";
Debug.ShouldStop(33554432);
parent._lblstatus.runMethod(true,"setText",BA.ObjectToString("Ready"));
 BA.debugLineNum = 156;BA.debugLine="RefreshCameras";
Debug.ShouldStop(134217728);
_refreshcameras();
 Debug.CheckDeviceExceptions();
if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
 BA.debugLineNum = 158;BA.debugLine="lblStatus.Text = \"RequestAuthToken LastException";
Debug.ShouldStop(536870912);
parent._lblstatus.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("RequestAuthToken LastException: "),parent.__c.runMethod(false,"LastException",main.ba)));
 BA.debugLineNum = 159;BA.debugLine="Log(\"RequestAuthToken LastException: \" & LastExc";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("RequestAuthToken LastException: "),parent.__c.runMethod(false,"LastException",main.ba))));
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 161;BA.debugLine="End Sub";
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
public static RemoteObject  _restget(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("RESTGet (main) ","main",0,main.ba,main.mostCurrent,255);
if (RapidSub.canDelegate("restget")) { return b4j.example.main.remoteMe.runUserSub(false, "main","restget", _url);}
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
public ResumableSub_RESTGet(b4j.example.main parent,RemoteObject _url) {
this.parent = parent;
this._url = _url;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.example.main parent;
RemoteObject _url;
RemoteObject _j = RemoteObject.declareNull("b4j.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RESTGet (main) ","main",0,main.ba,main.mostCurrent,255);
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
 BA.debugLineNum = 256;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 257;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(1);
_j = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 258;BA.debugLine="response = \"\"";
Debug.ShouldStop(2);
parent._response = BA.ObjectToString("");
 BA.debugLineNum = 259;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no";
Debug.ShouldStop(4);
_j.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 260;BA.debugLine="j.Download(url)";
Debug.ShouldStop(8);
_j.runClassMethod (b4j.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 261;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
Debug.ShouldStop(16);
_j.runClassMethod (b4j.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("TOKEN_AUTH")),(Object)(parent._authtoken));
 BA.debugLineNum = 262;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","jobdone", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "restget"), (_j));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 263;BA.debugLine="If j.Success Then";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 264;BA.debugLine="response = j.GetString";
Debug.ShouldStop(128);
parent._response = _j.runClassMethod (b4j.example.httpjob.class, "_getstring" /*RemoteObject*/ );
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 266;BA.debugLine="response = \"ERROR: \" & j.GetString";
Debug.ShouldStop(512);
parent._response = RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.runClassMethod (b4j.example.httpjob.class, "_getstring" /*RemoteObject*/ ));
 if (true) break;

case 9:
//C
this.state = 12;
;
 BA.debugLineNum = 268;BA.debugLine="j.Release";
Debug.ShouldStop(2048);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 270;BA.debugLine="response = \"ERROR: \" & LastException";
Debug.ShouldStop(8192);
parent._response = RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),parent.__c.runMethod(false,"LastException",main.ba));
 BA.debugLineNum = 271;BA.debugLine="Log(\"RESTDownload LastException: \" & LastExcepti";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("RESTDownload LastException: "),parent.__c.runMethod(false,"LastException",main.ba))));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 273;BA.debugLine="Log(\"URL: \" & url)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("URL: "),_url)));
 BA.debugLineNum = 274;BA.debugLine="Log(\"Response: \" & response)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response: "),parent._response)));
 BA.debugLineNum = 275;BA.debugLine="Return(response)";
Debug.ShouldStop(262144);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,((parent._response)));return;};
 BA.debugLineNum = 276;BA.debugLine="End Sub";
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
public static RemoteObject  _restpost(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("RESTPost (main) ","main",0,main.ba,main.mostCurrent,278);
if (RapidSub.canDelegate("restpost")) { return b4j.example.main.remoteMe.runUserSub(false, "main","restpost", _url);}
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
public ResumableSub_RESTPost(b4j.example.main parent,RemoteObject _url) {
this.parent = parent;
this._url = _url;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.example.main parent;
RemoteObject _url;
RemoteObject _j = RemoteObject.declareNull("b4j.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RESTPost (main) ","main",0,main.ba,main.mostCurrent,278);
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
 BA.debugLineNum = 279;BA.debugLine="Try";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 280;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(8388608);
_j = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 281;BA.debugLine="response = \"\"";
Debug.ShouldStop(16777216);
parent._response = BA.ObjectToString("");
 BA.debugLineNum = 282;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no";
Debug.ShouldStop(33554432);
_j.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 283;BA.debugLine="j.PostString(url,\"\")";
Debug.ShouldStop(67108864);
_j.runClassMethod (b4j.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_url),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 284;BA.debugLine="j.GetRequest.SetContentType(\"application/x-www-f";
Debug.ShouldStop(134217728);
_j.runClassMethod (b4j.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/x-www-form-urlencoded")));
 BA.debugLineNum = 285;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
Debug.ShouldStop(268435456);
_j.runClassMethod (b4j.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("TOKEN_AUTH")),(Object)(parent._authtoken));
 BA.debugLineNum = 286;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","jobdone", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "restpost"), (_j));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 287;BA.debugLine="If j.Success Then";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 288;BA.debugLine="response = j.GetString";
Debug.ShouldStop(-2147483648);
parent._response = _j.runClassMethod (b4j.example.httpjob.class, "_getstring" /*RemoteObject*/ );
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 290;BA.debugLine="response = \"ERROR: \" & j.GetString";
Debug.ShouldStop(2);
parent._response = RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.runClassMethod (b4j.example.httpjob.class, "_getstring" /*RemoteObject*/ ));
 if (true) break;

case 9:
//C
this.state = 12;
;
 BA.debugLineNum = 292;BA.debugLine="j.Release";
Debug.ShouldStop(8);
_j.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 294;BA.debugLine="response = \"ERROR: \" & LastException";
Debug.ShouldStop(32);
parent._response = RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),parent.__c.runMethod(false,"LastException",main.ba));
 BA.debugLineNum = 295;BA.debugLine="Log(\"RESTPost LastException: \" & LastException)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("RESTPost LastException: "),parent.__c.runMethod(false,"LastException",main.ba))));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 297;BA.debugLine="Log(\"URL: \" & url)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("URL: "),_url)));
 BA.debugLineNum = 298;BA.debugLine="Log(\"Response: \" & response)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response: "),parent._response)));
 BA.debugLineNum = 299;BA.debugLine="Return(response)";
Debug.ShouldStop(1024);
Debug.CheckDeviceExceptions();if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,((parent._response)));return;};
 BA.debugLineNum = 300;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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