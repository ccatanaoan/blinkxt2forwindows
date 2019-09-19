package cloyd.blink;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class frmactivity_subs_0 {


public static RemoteObject  _checkmonitor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckMonitor (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,217);
if (RapidSub.canDelegate("checkmonitor")) { return __ref.runUserSub(false, "frmactivity","checkmonitor", __ref);}
RemoteObject _slist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _s = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
 BA.debugLineNum = 217;BA.debugLine="Sub CheckMonitor() As Screen";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 218;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 219;BA.debugLine="If fx.Screens.Size= 1 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens").runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 220;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(134217728);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = __ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 221;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(268435456);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 223;BA.debugLine="Return S";
Debug.ShouldStop(1073741824);
Debug.CheckDeviceExceptions();if (true) return _s;
 }else 
{ BA.debugLineNum = 224;BA.debugLine="Else If fx.Screens.Size> 1 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens").runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 225;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(1);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = __ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 226;BA.debugLine="Dim S As Screen = SList.Get(2)";
Debug.ShouldStop(2);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("S", _s);
 BA.debugLineNum = 228;BA.debugLine="Return S";
Debug.ShouldStop(8);
Debug.CheckDeviceExceptions();if (true) return _s;
 }else {
 BA.debugLineNum = 230;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(32);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = __ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 231;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(64);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 233;BA.debugLine="Return S";
Debug.ShouldStop(256);
Debug.CheckDeviceExceptions();if (true) return _s;
 }}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e16.toString()); BA.debugLineNum = 236;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(2048);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = __ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 237;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(4096);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 239;BA.debugLine="Return S";
Debug.ShouldStop(16384);
Debug.CheckDeviceExceptions();if (true) return _s;
 };
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
frmactivity._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",frmactivity._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private frm As Form";
frmactivity._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",frmactivity._frm);
 //BA.debugLineNum = 4;BA.debugLine="Public clvActivity As CustomListView";
frmactivity._clvactivity = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_clvactivity",frmactivity._clvactivity);
 //BA.debugLineNum = 5;BA.debugLine="Public jsonMain As String";
frmactivity._jsonmain = RemoteObject.createImmutable("");__ref.setField("_jsonmain",frmactivity._jsonmain);
 //BA.debugLineNum = 6;BA.debugLine="Type CardData (Title As String, Content As String";
;
 //BA.debugLineNum = 7;BA.debugLine="Private xui As XUI";
frmactivity._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",frmactivity._xui);
 //BA.debugLineNum = 8;BA.debugLine="Private ivScreenshot As B4XView";
frmactivity._ivscreenshot = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_ivscreenshot",frmactivity._ivscreenshot);
 //BA.debugLineNum = 9;BA.debugLine="Private lblFileInfo As B4XView";
frmactivity._lblfileinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblfileinfo",frmactivity._lblfileinfo);
 //BA.debugLineNum = 10;BA.debugLine="Private lblDeviceInfo As B4XView";
frmactivity._lbldeviceinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbldeviceinfo",frmactivity._lbldeviceinfo);
 //BA.debugLineNum = 11;BA.debugLine="Private screenshotBitmap As B4XBitmap";
frmactivity._screenshotbitmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");__ref.setField("_screenshotbitmap",frmactivity._screenshotbitmap);
 //BA.debugLineNum = 12;BA.debugLine="Private lv As ListView";
frmactivity._lv = RemoteObject.createNew ("anywheresoftware.b4j.objects.ListViewWrapper");__ref.setField("_lv",frmactivity._lv);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createlistitem(RemoteObject __ref,RemoteObject _screenshot,RemoteObject _fileinfo,RemoteObject _devicename) throws Exception{
try {
		Debug.PushSubsStack("CreateListItem (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("createlistitem")) { return __ref.runUserSub(false, "frmactivity","createlistitem", __ref, _screenshot, _fileinfo, _devicename);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("screenshot", _screenshot);
Debug.locals.put("fileinfo", _fileinfo);
Debug.locals.put("devicename", _devicename);
 BA.debugLineNum = 120;BA.debugLine="Sub CreateListItem(screenshot As Image, fileinfo A";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 125;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(268435456);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 129;BA.debugLine="p.LoadLayout(\"cellitem\")";
Debug.ShouldStop(1);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("cellitem")),__ref.getField(false, "ba"));
 BA.debugLineNum = 130;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 400dip, 300dip)";
Debug.ShouldStop(2);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, frmactivity.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 400))))),(Object)(BA.numberCast(double.class, frmactivity.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))));
 BA.debugLineNum = 132;BA.debugLine="ivScreenshot.SetBitmap(screenshot)";
Debug.ShouldStop(8);
__ref.getField(false,"_ivscreenshot" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((_screenshot.getObject())));
 BA.debugLineNum = 134;BA.debugLine="lblFileInfo.Text = fileinfo";
Debug.ShouldStop(32);
__ref.getField(false,"_lblfileinfo" /*RemoteObject*/ ).runMethod(true,"setText",_fileinfo);
 BA.debugLineNum = 136;BA.debugLine="lblDeviceInfo.Text = devicename";
Debug.ShouldStop(128);
__ref.getField(false,"_lbldeviceinfo" /*RemoteObject*/ ).runMethod(true,"setText",_devicename);
 BA.debugLineNum = 137;BA.debugLine="Return p";
Debug.ShouldStop(256);
Debug.CheckDeviceExceptions();if (true) return _p;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e10.toString()); BA.debugLineNum = 139;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
frmactivity.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(frmactivity.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 BA.debugLineNum = 140;BA.debugLine="Return Null";
Debug.ShouldStop(2048);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), frmactivity.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _downloadimage(RemoteObject __ref,RemoteObject _link,RemoteObject _authtoken) throws Exception{
try {
		Debug.PushSubsStack("DownloadImage (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("downloadimage")) { __ref.runUserSub(false, "frmactivity","downloadimage", __ref, _link, _authtoken); return;}
ResumableSub_DownloadImage rsub = new ResumableSub_DownloadImage(null,__ref,_link,_authtoken);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DownloadImage extends BA.ResumableSub {
public ResumableSub_DownloadImage(cloyd.blink.frmactivity parent,RemoteObject __ref,RemoteObject _link,RemoteObject _authtoken) {
this.parent = parent;
this.__ref = __ref;
this._link = _link;
this._authtoken = _authtoken;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
cloyd.blink.frmactivity parent;
RemoteObject _link;
RemoteObject _authtoken;
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _j = RemoteObject.declareNull("cloyd.blink.httpjob");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadImage (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,145);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Link", _link);
Debug.locals.put("authToken", _authtoken);
 BA.debugLineNum = 146;BA.debugLine="Dim a As B4XBitmap";
Debug.ShouldStop(131072);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 147;BA.debugLine="Try";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 148;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(524288);
_j = RemoteObject.createNew ("cloyd.blink.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 149;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(1048576);
_j.runClassMethod (cloyd.blink.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 150;BA.debugLine="j.Download(Link)";
Debug.ShouldStop(2097152);
_j.runClassMethod (cloyd.blink.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_link));
 BA.debugLineNum = 151;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
Debug.ShouldStop(4194304);
_j.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("TOKEN_AUTH")),(Object)(_authtoken));
 BA.debugLineNum = 152;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frmactivity", "downloadimage"), (_j));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 153;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 156;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File.";
Debug.ShouldStop(134217728);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("screenshot.jpg")),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 157;BA.debugLine="File.Copy2(j.GetInputStream, out)";
Debug.ShouldStop(268435456);
parent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_j.runClassMethod (cloyd.blink.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())),(Object)((_out.getObject())));
 BA.debugLineNum = 158;BA.debugLine="out.Close '<------ very important";
Debug.ShouldStop(536870912);
_out.runVoidMethod ("Close");
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 163;BA.debugLine="a = Null";
Debug.ShouldStop(4);
_a.setObject(parent.__c.getField(false,"Null"));
 if (true) break;

case 9:
//C
this.state = 12;
;
 BA.debugLineNum = 165;BA.debugLine="j.Release";
Debug.ShouldStop(16);
_j.runClassMethod (cloyd.blink.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 167;BA.debugLine="a = Null";
Debug.ShouldStop(64);
_a.setObject(parent.__c.getField(false,"Null"));
 BA.debugLineNum = 168;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 170;BA.debugLine="screenshotBitmap = a";
Debug.ShouldStop(512);
__ref.setField ("_screenshotbitmap" /*RemoteObject*/ ,_a);
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,200);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "frmactivity","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 200;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(128);
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _getvideos(RemoteObject __ref,RemoteObject _json,RemoteObject _userregion,RemoteObject _authtoken) throws Exception{
try {
		Debug.PushSubsStack("GetVideos (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("getvideos")) { __ref.runUserSub(false, "frmactivity","getvideos", __ref, _json, _userregion, _authtoken); return;}
ResumableSub_GetVideos rsub = new ResumableSub_GetVideos(null,__ref,_json,_userregion,_authtoken);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetVideos extends BA.ResumableSub {
public ResumableSub_GetVideos(cloyd.blink.frmactivity parent,RemoteObject __ref,RemoteObject _json,RemoteObject _userregion,RemoteObject _authtoken) {
this.parent = parent;
this.__ref = __ref;
this._json = _json;
this._userregion = _userregion;
this._authtoken = _authtoken;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
cloyd.blink.frmactivity parent;
RemoteObject _json;
RemoteObject _userregion;
RemoteObject _authtoken;
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _media = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colmedia = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _thumbnail = RemoteObject.createImmutable("");
RemoteObject _created_at = RemoteObject.createImmutable("");
RemoteObject _device_name = RemoteObject.createImmutable("");
RemoteObject _medianame = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("cloyd.blink.httpjob");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject group8;
int index8;
int groupLen8;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetVideos (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,40);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("json", _json);
Debug.locals.put("userRegion", _userregion);
Debug.locals.put("authToken", _authtoken);
 BA.debugLineNum = 41;BA.debugLine="Try";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 42;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(512);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 43;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(1024);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 44;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(2048);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 49;BA.debugLine="lv.Initialize( \"lv\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_lv" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lv")));
 BA.debugLineNum = 50;BA.debugLine="frm.RootPane.AddNode(lv, frm.WindowWidth-frm.Win";
Debug.ShouldStop(131072);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runVoidMethod ("AddNode",(Object)((__ref.getField(false,"_lv" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"getWindowWidth"),__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"getWindowWidth"),RemoteObject.createImmutable(4)}, "-/",1, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"getWindowWidth"),RemoteObject.createImmutable(4)}, "/",0, 0)),(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"getWindowHeight")));
 BA.debugLineNum = 52;BA.debugLine="Dim media As List = root.Get(\"media\")";
Debug.ShouldStop(524288);
_media = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_media.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("media")))));Debug.locals.put("media", _media);
 BA.debugLineNum = 53;BA.debugLine="For Each colmedia As Map In media";
Debug.ShouldStop(1048576);
if (true) break;

case 4:
//for
this.state = 13;
_colmedia = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group8 = _media;
index8 = 0;
groupLen8 = group8.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colmedia", _colmedia);
this.state = 17;
if (true) break;

case 17:
//C
this.state = 13;
if (index8 < groupLen8) {
this.state = 6;
_colmedia.setObject(group8.runMethod(false,"Get",index8));}
if (true) break;

case 18:
//C
this.state = 17;
index8++;
Debug.locals.put("colmedia", _colmedia);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 54;BA.debugLine="Dim thumbnail As String = colmedia.Get(\"thumbna";
Debug.ShouldStop(2097152);
_thumbnail = BA.ObjectToString(_colmedia.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("thumbnail")))));Debug.locals.put("thumbnail", _thumbnail);Debug.locals.put("thumbnail", _thumbnail);
 BA.debugLineNum = 57;BA.debugLine="Dim created_at As String = colmedia.Get(\"create";
Debug.ShouldStop(16777216);
_created_at = BA.ObjectToString(_colmedia.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 62;BA.debugLine="Dim device_name As String = colmedia.Get(\"devic";
Debug.ShouldStop(536870912);
_device_name = BA.ObjectToString(_colmedia.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("device_name")))));Debug.locals.put("device_name", _device_name);Debug.locals.put("device_name", _device_name);
 BA.debugLineNum = 72;BA.debugLine="Dim medianame As String = colmedia.Get(\"media\")";
Debug.ShouldStop(128);
_medianame = BA.ObjectToString(_colmedia.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("media")))));Debug.locals.put("medianame", _medianame);Debug.locals.put("medianame", _medianame);
 BA.debugLineNum = 84;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(524288);
_j = RemoteObject.createNew ("cloyd.blink.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 85;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(1048576);
_j.runClassMethod (cloyd.blink.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 86;BA.debugLine="j.Download(\"https://rest-\" & userRegion &\".imme";
Debug.ShouldStop(2097152);
_j.runClassMethod (cloyd.blink.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),_userregion,RemoteObject.createImmutable(".immedia-semi.com"),_thumbnail,RemoteObject.createImmutable(".jpg"))));
 BA.debugLineNum = 87;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
Debug.ShouldStop(4194304);
_j.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("TOKEN_AUTH")),(Object)(_authtoken));
 BA.debugLineNum = 88;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frmactivity", "getvideos"), (_j));
this.state = 19;
return;
case 19:
//C
this.state = 7;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 89;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16777216);
if (true) break;

case 7:
//if
this.state = 12;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 92;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
Debug.ShouldStop(134217728);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("screenshot.jpg")),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 93;BA.debugLine="File.Copy2(j.GetInputStream, out)";
Debug.ShouldStop(268435456);
parent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_j.runClassMethod (cloyd.blink.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())),(Object)((_out.getObject())));
 BA.debugLineNum = 94;BA.debugLine="out.Close '<------ very important";
Debug.ShouldStop(536870912);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 98;BA.debugLine="Dim p As B4XView = CreateListItem(j.GetBitmap,";
Debug.ShouldStop(2);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.runClassMethod (cloyd.blink.frmactivity.class, "_createlistitem" /*RemoteObject*/ ,(Object)(_j.runClassMethod (cloyd.blink.httpjob.class, "_getbitmap" /*RemoteObject*/ )),(Object)(_created_at),(Object)(_device_name));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 99;BA.debugLine="clvActivity.Add(p,\"\")";
Debug.ShouldStop(4);
__ref.getField(false,"_clvactivity" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(_p),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;

case 11:
//C
this.state = 12;
 if (true) break;

case 12:
//C
this.state = 18;
;
 BA.debugLineNum = 104;BA.debugLine="j.Release";
Debug.ShouldStop(128);
_j.runClassMethod (cloyd.blink.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;
if (true) break;

case 13:
//C
this.state = 16;
Debug.locals.put("colmedia", _colmedia);
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
 BA.debugLineNum = 109;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 if (true) break;
if (true) break;

case 16:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("Initialize (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "frmactivity","initialize", __ref, _ba, _parent);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _obj = RemoteObject.declareNull("anywheresoftware.b4j.agraham.reflection.Reflection");
Debug.locals.put("ba", _ba);
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize(Parent As Form)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="frm.Initialize(\"frm\", 600dip, 600dip)";
Debug.ShouldStop(65536);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, frmactivity.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, frmactivity.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))));
 BA.debugLineNum = 18;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("SetFormStyle",(Object)(RemoteObject.createImmutable("UTILITY")));
 BA.debugLineNum = 19;BA.debugLine="frm.RootPane.LoadLayout(\"main\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("main")));
 BA.debugLineNum = 20;BA.debugLine="frm.Icon = fx.LoadImage(File.DirAssets, \"home.png";
Debug.ShouldStop(524288);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"LoadImage",(Object)(frmactivity.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("home.png"))).getObject()));
 BA.debugLineNum = 21;BA.debugLine="frm.Title = \"Catanaoan Blink XT2 Cameras Activity";
Debug.ShouldStop(1048576);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",BA.ObjectToString("Catanaoan Blink XT2 Cameras Activity Viewer"));
 BA.debugLineNum = 22;BA.debugLine="frm.SetOwner(Parent)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("SetOwner",(Object)(_parent));
 BA.debugLineNum = 23;BA.debugLine="frm.WindowWidth = CheckMonitor.MaxX - CheckMonito";
Debug.ShouldStop(4194304);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setWindowWidth",RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (cloyd.blink.frmactivity.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMaxX"),__ref.runClassMethod (cloyd.blink.frmactivity.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMinX")}, "-",1, 0));
 BA.debugLineNum = 24;BA.debugLine="frm.WindowLeft = CheckMonitor.MinX";
Debug.ShouldStop(8388608);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setWindowLeft",__ref.runClassMethod (cloyd.blink.frmactivity.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMinX"));
 BA.debugLineNum = 25;BA.debugLine="frm.WindowHeight = CheckMonitor.MaxY - CheckMonit";
Debug.ShouldStop(16777216);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setWindowHeight",RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (cloyd.blink.frmactivity.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMaxY"),__ref.runClassMethod (cloyd.blink.frmactivity.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMinY")}, "-",1, 0));
 BA.debugLineNum = 26;BA.debugLine="frm.WindowTop = CheckMonitor.MinY";
Debug.ShouldStop(33554432);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setWindowTop",__ref.runClassMethod (cloyd.blink.frmactivity.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMinY"));
 BA.debugLineNum = 27;BA.debugLine="Dim Obj As Reflector";
Debug.ShouldStop(67108864);
_obj = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 28;BA.debugLine="Obj.Target = frm.RootPane";
Debug.ShouldStop(134217728);
_obj.setField ("Target",(__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 29;BA.debugLine="Obj.AddEventHandler(\"RootPaneKeyEvent\", \"javafx.s";
Debug.ShouldStop(268435456);
_obj.runVoidMethod ("AddEventHandler",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("RootPaneKeyEvent")),(Object)(RemoteObject.createImmutable("javafx.scene.input.KeyEvent.ANY")));
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lv_selectedindexchanged(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("lv_SelectedIndexChanged (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("lv_selectedindexchanged")) { return __ref.runUserSub(false, "frmactivity","lv_selectedindexchanged", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 113;BA.debugLine="Sub lv_SelectedIndexChanged(Index As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="If Index > -1 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_index,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 };
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("RootPaneKeyEvent_Event (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,204);
if (RapidSub.canDelegate("rootpanekeyevent_event")) { return __ref.runUserSub(false, "frmactivity","rootpanekeyevent_event", __ref, _e);}
RemoteObject _ke = RemoteObject.declareNull("anywheresoftware.b4j.agraham.reflection.Reflection");
RemoteObject _scode = RemoteObject.createImmutable("");
RemoteObject _stype = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
Debug.locals.put("e", _e);
 BA.debugLineNum = 204;BA.debugLine="Private Sub RootPaneKeyEvent_Event(e As Event)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 205;BA.debugLine="Dim KE As Reflector";
Debug.ShouldStop(4096);
_ke = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("KE", _ke);
 BA.debugLineNum = 206;BA.debugLine="Dim sCode As String";
Debug.ShouldStop(8192);
_scode = RemoteObject.createImmutable("");Debug.locals.put("sCode", _scode);
 BA.debugLineNum = 207;BA.debugLine="Dim sType As String 'ignore";
Debug.ShouldStop(16384);
_stype = RemoteObject.createImmutable("");Debug.locals.put("sType", _stype);
 BA.debugLineNum = 208;BA.debugLine="Dim result As Int 'ignore";
Debug.ShouldStop(32768);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 209;BA.debugLine="KE.Target = e	 ' e is a KeyEvent instance";
Debug.ShouldStop(65536);
_ke.setField ("Target",(_e.getObject()));
 BA.debugLineNum = 210;BA.debugLine="sCode = KE.RunMethod(\"getCode\")";
Debug.ShouldStop(131072);
_scode = BA.ObjectToString(_ke.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getCode"))));Debug.locals.put("sCode", _scode);
 BA.debugLineNum = 211;BA.debugLine="sType = KE.RunMethod(\"getEventType\")";
Debug.ShouldStop(262144);
_stype = BA.ObjectToString(_ke.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getEventType"))));Debug.locals.put("sType", _stype);
 BA.debugLineNum = 212;BA.debugLine="If sCode=\"ESCAPE\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_scode,BA.ObjectToString("ESCAPE"))) { 
 BA.debugLineNum = 213;BA.debugLine="frm.Close";
Debug.ShouldStop(1048576);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 };
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _json,RemoteObject _userregion,RemoteObject _authtoken) throws Exception{
try {
		Debug.PushSubsStack("Show (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "frmactivity","show", __ref, _json, _userregion, _authtoken);}
Debug.locals.put("json", _json);
Debug.locals.put("userRegion", _userregion);
Debug.locals.put("authToken", _authtoken);
 BA.debugLineNum = 32;BA.debugLine="Public Sub Show(json As String, userRegion As Stri";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="GetVideos(json, userRegion, authToken)";
Debug.ShouldStop(2);
__ref.runClassMethod (cloyd.blink.frmactivity.class, "_getvideos" /*void*/ ,(Object)(_json),(Object)(_userregion),(Object)(_authtoken));
 BA.debugLineNum = 35;BA.debugLine="frm.ShowAndWait";
Debug.ShouldStop(4);
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
public static void  _showvideo(RemoteObject __ref,RemoteObject _link,RemoteObject _authtoken) throws Exception{
try {
		Debug.PushSubsStack("ShowVideo (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,173);
if (RapidSub.canDelegate("showvideo")) { __ref.runUserSub(false, "frmactivity","showvideo", __ref, _link, _authtoken); return;}
ResumableSub_ShowVideo rsub = new ResumableSub_ShowVideo(null,__ref,_link,_authtoken);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ShowVideo extends BA.ResumableSub {
public ResumableSub_ShowVideo(cloyd.blink.frmactivity parent,RemoteObject __ref,RemoteObject _link,RemoteObject _authtoken) {
this.parent = parent;
this.__ref = __ref;
this._link = _link;
this._authtoken = _authtoken;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
cloyd.blink.frmactivity parent;
RemoteObject _link;
RemoteObject _authtoken;
RemoteObject _j = RemoteObject.declareNull("cloyd.blink.httpjob");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ShowVideo (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,173);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Link", _link);
Debug.locals.put("authToken", _authtoken);
 BA.debugLineNum = 174;BA.debugLine="Try";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 175;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(16384);
_j = RemoteObject.createNew ("cloyd.blink.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 176;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(32768);
_j.runClassMethod (cloyd.blink.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 177;BA.debugLine="j.Download(Link)";
Debug.ShouldStop(65536);
_j.runClassMethod (cloyd.blink.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_link));
 BA.debugLineNum = 178;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
Debug.ShouldStop(131072);
_j.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("TOKEN_AUTH")),(Object)(_authtoken));
 BA.debugLineNum = 179;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frmactivity", "showvideo"), (_j));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 180;BA.debugLine="If j.Success Then";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 182;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File.";
Debug.ShouldStop(2097152);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("media.mp4")),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 183;BA.debugLine="File.Copy2(j.GetInputStream, out)";
Debug.ShouldStop(4194304);
parent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_j.runClassMethod (cloyd.blink.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())),(Object)((_out.getObject())));
 BA.debugLineNum = 184;BA.debugLine="out.Close '<------ very important";
Debug.ShouldStop(8388608);
_out.runVoidMethod ("Close");
 if (true) break;

case 8:
//C
this.state = 9;
 if (true) break;

case 9:
//C
this.state = 12;
;
 BA.debugLineNum = 194;BA.debugLine="j.Release";
Debug.ShouldStop(2);
_j.runClassMethod (cloyd.blink.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 196;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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