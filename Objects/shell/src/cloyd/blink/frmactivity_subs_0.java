package cloyd.blink;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class frmactivity_subs_0 {


public static RemoteObject  _checkmonitor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckMonitor (frmactivity) ","frmactivity",1,__ref.getField(false, "ba"),__ref,453);
if (RapidSub.canDelegate("checkmonitor")) { return __ref.runUserSub(false, "frmactivity","checkmonitor", __ref);}
RemoteObject _slist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _s = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
 BA.debugLineNum = 453;BA.debugLine="Sub CheckMonitor() As Screen";
Debug.ShouldStop(16);
 BA.debugLineNum = 454;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 455;BA.debugLine="If fx.Screens.Size= 1 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens").runMethod(true,"getSize"),BA.numberCast(int.class, 1))) { 
 BA.debugLineNum = 456;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(128);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = __ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 457;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(256);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.ScreenWrapper"), _slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 459;BA.debugLine="Return S";
Debug.ShouldStop(1024);
Debug.CheckDeviceExceptions();if (true) return _s;
 }else 
{ BA.debugLineNum = 460;BA.debugLine="Else If fx.Screens.Size> 1 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens").runMethod(true,"getSize"),BA.numberCast(int.class, 1))) { 
 BA.debugLineNum = 461;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(4096);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = __ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 462;BA.debugLine="Dim S As Screen = SList.Get(2)";
Debug.ShouldStop(8192);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.ScreenWrapper"), _slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("S", _s);
 BA.debugLineNum = 464;BA.debugLine="Return S";
Debug.ShouldStop(32768);
Debug.CheckDeviceExceptions();if (true) return _s;
 }else {
 BA.debugLineNum = 466;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(131072);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = __ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 467;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(262144);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.ScreenWrapper"), _slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 469;BA.debugLine="Return S";
Debug.ShouldStop(1048576);
Debug.CheckDeviceExceptions();if (true) return _s;
 }}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e16.toString()); BA.debugLineNum = 472;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(8388608);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = __ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 473;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(16777216);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.ScreenWrapper"), _slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 475;BA.debugLine="Return S";
Debug.ShouldStop(67108864);
if (true) return _s;
 };
 BA.debugLineNum = 477;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
 //BA.debugLineNum = 4;BA.debugLine="Private jsonMain As String";
frmactivity._jsonmain = RemoteObject.createImmutable("");__ref.setField("_jsonmain",frmactivity._jsonmain);
 //BA.debugLineNum = 5;BA.debugLine="Private userRegionMain As String";
frmactivity._userregionmain = RemoteObject.createImmutable("");__ref.setField("_userregionmain",frmactivity._userregionmain);
 //BA.debugLineNum = 6;BA.debugLine="Private xui As XUI";
frmactivity._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",frmactivity._xui);
 //BA.debugLineNum = 7;BA.debugLine="Private ivScreenshot As B4XView";
frmactivity._ivscreenshot = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_ivscreenshot",frmactivity._ivscreenshot);
 //BA.debugLineNum = 8;BA.debugLine="Private lblFileInfo As B4XView";
frmactivity._lblfileinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblfileinfo",frmactivity._lblfileinfo);
 //BA.debugLineNum = 9;BA.debugLine="Private lblDeviceInfo As B4XView";
frmactivity._lbldeviceinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbldeviceinfo",frmactivity._lbldeviceinfo);
 //BA.debugLineNum = 10;BA.debugLine="Private clvActivity As CustomListView";
frmactivity._clvactivity = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_clvactivity",frmactivity._clvactivity);
 //BA.debugLineNum = 11;BA.debugLine="Public authToken As String";
frmactivity._authtoken = RemoteObject.createImmutable("");__ref.setField("_authtoken",frmactivity._authtoken);
 //BA.debugLineNum = 12;BA.debugLine="Private wvMedia As WebView";
frmactivity._wvmedia = RemoteObject.createNew ("anywheresoftware.b4j.objects.WebViewWrapper");__ref.setField("_wvmedia",frmactivity._wvmedia);
 //BA.debugLineNum = 13;BA.debugLine="Private lblDate As B4XView";
frmactivity._lbldate = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbldate",frmactivity._lbldate);
 //BA.debugLineNum = 14;BA.debugLine="Private lblTimestamp As Label";
frmactivity._lbltimestamp = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltimestamp",frmactivity._lbltimestamp);
 //BA.debugLineNum = 15;BA.debugLine="Private previousSelectedIndex As Int";
frmactivity._previousselectedindex = RemoteObject.createImmutable(0);__ref.setField("_previousselectedindex",frmactivity._previousselectedindex);
 //BA.debugLineNum = 16;BA.debugLine="Private ivWatched As B4XView";
frmactivity._ivwatched = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_ivwatched",frmactivity._ivwatched);
 //BA.debugLineNum = 17;BA.debugLine="Private kvs As KeyValueStore";
frmactivity._kvs = RemoteObject.createNew ("cloyd.blink.keyvaluestore");__ref.setField("_kvs",frmactivity._kvs);
 //BA.debugLineNum = 18;BA.debugLine="Type VideoInfo (ThumbnailPath As String, DateCrea";
;
 //BA.debugLineNum = 19;BA.debugLine="Private cutils As ControlsUtils";
frmactivity._cutils = RemoteObject.createNew ("anywheresoftware.b4j.objects.ControlsUtils");__ref.setField("_cutils",frmactivity._cutils);
 //BA.debugLineNum = 20;BA.debugLine="Private B4XLoadingIndicator1 As B4XLoadingIndicat";
frmactivity._b4xloadingindicator1 = RemoteObject.createNew ("cloyd.blink.b4xloadingindicator");__ref.setField("_b4xloadingindicator1",frmactivity._b4xloadingindicator1);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clvactivity_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("clvActivity_ItemClick (frmactivity) ","frmactivity",1,__ref.getField(false, "ba"),__ref,343);
if (RapidSub.canDelegate("clvactivity_itemclick")) { return __ref.runUserSub(false, "frmactivity","clvactivity_itemclick", __ref, _index, _value);}
RemoteObject _video = RemoteObject.createImmutable("");
RemoteObject _videourl = RemoteObject.createImmutable("");
RemoteObject _videotimestamp = RemoteObject.createImmutable("");
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _mytypes = RemoteObject.declareNull("Object");
RemoteObject _videos = RemoteObject.declareNull("cloyd.blink.frmactivity._videoinfo");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 343;BA.debugLine="Sub clvActivity_ItemClick (Index As Int, Value As";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 344;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 345;BA.debugLine="B4XLoadingIndicator1.Show";
Debug.ShouldStop(16777216);
__ref.getField(false,"_b4xloadingindicator1" /*RemoteObject*/ ).runClassMethod (cloyd.blink.b4xloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 346;BA.debugLine="UpdateItemColor(Index)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (cloyd.blink.frmactivity.class, "_updateitemcolor" /*RemoteObject*/ ,(Object)(_index));
 BA.debugLineNum = 347;BA.debugLine="wvMedia.LoadUrl(\"\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_wvmedia" /*RemoteObject*/ ).runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 348;BA.debugLine="Dim video As String";
Debug.ShouldStop(134217728);
_video = RemoteObject.createImmutable("");Debug.locals.put("video", _video);
 BA.debugLineNum = 349;BA.debugLine="video = clvActivity.GetValue(Index)";
Debug.ShouldStop(268435456);
_video = BA.ObjectToString(__ref.getField(false,"_clvactivity" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("video", _video);
 BA.debugLineNum = 350;BA.debugLine="Dim videoURL As String = Regex.Split(\"\\|\",video)";
Debug.ShouldStop(536870912);
_videourl = frmactivity.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(_video)).getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("videoURL", _videourl);Debug.locals.put("videoURL", _videourl);
 BA.debugLineNum = 351;BA.debugLine="Dim videoTimestamp As String = Regex.Split(\"\\|\",";
Debug.ShouldStop(1073741824);
_videotimestamp = frmactivity.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(_video)).getArrayElement(true,BA.numberCast(int.class, 1));Debug.locals.put("videoTimestamp", _videotimestamp);Debug.locals.put("videoTimestamp", _videotimestamp);
 BA.debugLineNum = 352;BA.debugLine="ShowVideo(videoURL,videoTimestamp)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (cloyd.blink.frmactivity.class, "_showvideo" /*void*/ ,(Object)(_videourl),(Object)(_videotimestamp));
 BA.debugLineNum = 353;BA.debugLine="Dim list1 As List = kvs.ListKeys";
Debug.ShouldStop(1);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_list1 = __ref.getField(false,"_kvs" /*RemoteObject*/ ).runClassMethod (cloyd.blink.keyvaluestore.class, "_listkeys" /*RemoteObject*/ );Debug.locals.put("list1", _list1);Debug.locals.put("list1", _list1);
 BA.debugLineNum = 354;BA.debugLine="For i =  0 To list1.Size-1";
Debug.ShouldStop(2);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_list1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 355;BA.debugLine="Dim mytypes As Object = kvs.Get(list1.Get(i))";
Debug.ShouldStop(4);
_mytypes = __ref.getField(false,"_kvs" /*RemoteObject*/ ).runClassMethod (cloyd.blink.keyvaluestore.class, "_get" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));Debug.locals.put("mytypes", _mytypes);Debug.locals.put("mytypes", _mytypes);
 BA.debugLineNum = 356;BA.debugLine="Dim videos = mytypes As VideoInfo";
Debug.ShouldStop(8);
_videos = (_mytypes);Debug.locals.put("videos", _videos);Debug.locals.put("videos", _videos);
 BA.debugLineNum = 357;BA.debugLine="If videoURL.Contains(videos.VideoID) Then";
Debug.ShouldStop(16);
if (_videourl.runMethod(true,"contains",(Object)(_videos.getField(true,"VideoID" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 358;BA.debugLine="kvs.Put(videos.VideoID,CreateCustomType(videos";
Debug.ShouldStop(32);
__ref.getField(false,"_kvs" /*RemoteObject*/ ).runClassMethod (cloyd.blink.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(_videos.getField(true,"VideoID" /*RemoteObject*/ )),(Object)((__ref.runClassMethod (cloyd.blink.frmactivity.class, "_createcustomtype" /*RemoteObject*/ ,(Object)(_videos.getField(true,"ThumbnailPath" /*RemoteObject*/ )),(Object)(_videos.getField(true,"DateCreated" /*RemoteObject*/ )),(Object)(BA.ObjectToString("true")),(Object)(_videos.getField(true,"DeviceName" /*RemoteObject*/ )),(Object)(_videos.getField(true,"VideoID" /*RemoteObject*/ )),(Object)(_videos.getField(false,"ThumbnailBLOB" /*RemoteObject*/ ))))));
 };
 }
}Debug.locals.put("i", _i);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e19) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e19.toString()); BA.debugLineNum = 362;BA.debugLine="B4XLoadingIndicator1.Hide";
Debug.ShouldStop(512);
__ref.getField(false,"_b4xloadingindicator1" /*RemoteObject*/ ).runClassMethod (cloyd.blink.b4xloadingindicator.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 363;BA.debugLine="cutils.ShowNotification(\"Catanaoan Blink XT2 Cam";
Debug.ShouldStop(1024);
__ref.getField(false,"_cutils" /*RemoteObject*/ ).runVoidMethod ("ShowNotification",(Object)(BA.ObjectToString("Catanaoan Blink XT2 Cameras v1.0")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("clvActivity_ItemClick: "),frmactivity.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))),(Object)(__ref.getField(false,"_cutils" /*RemoteObject*/ ).getField(true,"ICON_ERROR")));
 BA.debugLineNum = 364;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
frmactivity.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(frmactivity.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 };
 BA.debugLineNum = 367;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertdatetimeperiod(RemoteObject __ref,RemoteObject _inputtime,RemoteObject _dayname) throws Exception{
try {
		Debug.PushSubsStack("ConvertDateTimePeriod (frmactivity) ","frmactivity",1,__ref.getField(false, "ba"),__ref,208);
if (RapidSub.canDelegate("convertdatetimeperiod")) { return __ref.runUserSub(false, "frmactivity","convertdatetimeperiod", __ref, _inputtime, _dayname);}
RemoteObject _ticks = RemoteObject.createImmutable(0L);
RemoteObject _lngticks = RemoteObject.createImmutable(0L);
RemoteObject _p = RemoteObject.declareNull("b4j.example.dateutils._period");
Debug.locals.put("inputTime", _inputtime);
Debug.locals.put("dayname", _dayname);
 BA.debugLineNum = 208;BA.debugLine="Sub ConvertDateTimePeriod(inputTime As String, day";
Debug.ShouldStop(32768);
 BA.debugLineNum = 210;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
Debug.ShouldStop(131072);
_ticks = __ref.runClassMethod (cloyd.blink.frmactivity.class, "_parseutcstring" /*RemoteObject*/ ,(Object)(_inputtime.runMethod(true,"replace",(Object)(BA.ObjectToString("+00:00")),(Object)(RemoteObject.createImmutable("+0000")))));Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 211;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
Debug.ShouldStop(262144);
frmactivity.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("MMM d, yyyy h:mm:ss a"));
 BA.debugLineNum = 212;BA.debugLine="Dim lngTicks As Long = ticks";
Debug.ShouldStop(524288);
_lngticks = _ticks;Debug.locals.put("lngTicks", _lngticks);Debug.locals.put("lngTicks", _lngticks);
 BA.debugLineNum = 213;BA.debugLine="Dim p As Period = DateUtils.PeriodBetween(lngTick";
Debug.ShouldStop(1048576);
_p = frmactivity._dateutils.runMethod(false,"_periodbetween",(Object)(_lngticks),(Object)(frmactivity.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 215;BA.debugLine="If dayname.Contains(\"Today\") Then";
Debug.ShouldStop(4194304);
if (_dayname.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Today"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 216;BA.debugLine="If p.Days = 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Days"),BA.numberCast(int.class, 0))) { 
 BA.debugLineNum = 217;BA.debugLine="If p.Hours = 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Hours"),BA.numberCast(int.class, 0))) { 
 BA.debugLineNum = 218;BA.debugLine="If p.Minutes = 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Minutes"),BA.numberCast(int.class, 0))) { 
 BA.debugLineNum = 219;BA.debugLine="Return p.Seconds & \"s ago\"";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.concat(_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago"));
 }else {
 BA.debugLineNum = 221;BA.debugLine="Return p.Minutes & \"m \" & p.Seconds & \"s ago\"";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.concat(_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago"));
 };
 }else {
 BA.debugLineNum = 224;BA.debugLine="Return p.Hours & \"h \" & p.Minutes & \"m \" & p.S";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.concat(_p.getField(true,"Hours"),RemoteObject.createImmutable("h "),_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago"));
 };
 }else 
{ BA.debugLineNum = 226;BA.debugLine="else If p.Hours = 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Hours"),BA.numberCast(int.class, 0))) { 
 BA.debugLineNum = 227;BA.debugLine="If p.Minutes = 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Minutes"),BA.numberCast(int.class, 0))) { 
 BA.debugLineNum = 228;BA.debugLine="Return p.Seconds & \"s ago\"";
Debug.ShouldStop(8);
if (true) return RemoteObject.concat(_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago"));
 }else {
 BA.debugLineNum = 230;BA.debugLine="Return p.Minutes & \"m \" & p.Seconds & \"s ago\"";
Debug.ShouldStop(32);
if (true) return RemoteObject.concat(_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago"));
 };
 }else 
{ BA.debugLineNum = 232;BA.debugLine="else If p.Minutes = 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Minutes"),BA.numberCast(int.class, 0))) { 
 BA.debugLineNum = 233;BA.debugLine="Return p.Seconds & \"s ago\"";
Debug.ShouldStop(256);
if (true) return RemoteObject.concat(_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago"));
 }else {
 BA.debugLineNum = 235;BA.debugLine="Return p.Days & \"d \" & p.Hours & \"h \" & p.Minut";
Debug.ShouldStop(1024);
if (true) return RemoteObject.concat(_p.getField(true,"Days"),RemoteObject.createImmutable("d "),_p.getField(true,"Hours"),RemoteObject.createImmutable("h "),_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago"));
 }}}
;
 }else 
{ BA.debugLineNum = 237;BA.debugLine="else if dayname.Contains(\"Yesterday\") Then";
Debug.ShouldStop(4096);
if (_dayname.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Yesterday"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 238;BA.debugLine="If p.Days = 0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Days"),BA.numberCast(int.class, 0))) { 
 BA.debugLineNum = 239;BA.debugLine="If p.Hours = 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Hours"),BA.numberCast(int.class, 0))) { 
 BA.debugLineNum = 240;BA.debugLine="If p.Minutes = 0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Minutes"),BA.numberCast(int.class, 0))) { 
 BA.debugLineNum = 241;BA.debugLine="Return p.Seconds & \"s ago\"";
Debug.ShouldStop(65536);
if (true) return RemoteObject.concat(_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago"));
 }else {
 BA.debugLineNum = 243;BA.debugLine="Return p.Minutes & \"m \" & p.Seconds & \"s ago\"";
Debug.ShouldStop(262144);
if (true) return RemoteObject.concat(_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago"));
 };
 }else {
 BA.debugLineNum = 246;BA.debugLine="Return p.Hours & \"h \" & p.Minutes & \"m \" & p.S";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.concat(_p.getField(true,"Hours"),RemoteObject.createImmutable("h "),_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago"));
 };
 }else {
 BA.debugLineNum = 249;BA.debugLine="Return p.Days & \"d \" & p.Hours & \"h \" & p.Minut";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.concat(_p.getField(true,"Days"),RemoteObject.createImmutable("d "),_p.getField(true,"Hours"),RemoteObject.createImmutable("h "),_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago"));
 };
 }else {
 BA.debugLineNum = 252;BA.debugLine="Return p.Days & \"d \" & p.Hours & \"h \" & p.Minute";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.concat(_p.getField(true,"Days"),RemoteObject.createImmutable("d "),_p.getField(true,"Hours"),RemoteObject.createImmutable("h "),_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago"));
 }}
;
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertdayname(RemoteObject __ref,RemoteObject _inputtime) throws Exception{
try {
		Debug.PushSubsStack("ConvertDayName (frmactivity) ","frmactivity",1,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("convertdayname")) { return __ref.runUserSub(false, "frmactivity","convertdayname", __ref, _inputtime);}
RemoteObject _ticks = RemoteObject.createImmutable(0L);
RemoteObject _lngticks = RemoteObject.createImmutable(0L);
RemoteObject _yesterday = RemoteObject.createImmutable(0L);
RemoteObject _timestamp = RemoteObject.createImmutable(0L);
Debug.locals.put("inputTime", _inputtime);
 BA.debugLineNum = 256;BA.debugLine="Sub ConvertDayName(inputTime As String) As String";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 258;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
Debug.ShouldStop(2);
_ticks = __ref.runClassMethod (cloyd.blink.frmactivity.class, "_parseutcstring" /*RemoteObject*/ ,(Object)(_inputtime.runMethod(true,"replace",(Object)(BA.ObjectToString("+00:00")),(Object)(RemoteObject.createImmutable("+0000")))));Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 259;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
Debug.ShouldStop(4);
frmactivity.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("MMM d, yyyy h:mm:ss a"));
 BA.debugLineNum = 260;BA.debugLine="Dim lngTicks As Long = ticks";
Debug.ShouldStop(8);
_lngticks = _ticks;Debug.locals.put("lngTicks", _lngticks);Debug.locals.put("lngTicks", _lngticks);
 BA.debugLineNum = 262;BA.debugLine="Dim Yesterday As Long";
Debug.ShouldStop(32);
_yesterday = RemoteObject.createImmutable(0L);Debug.locals.put("Yesterday", _yesterday);
 BA.debugLineNum = 263;BA.debugLine="Dim timestamp As Long";
Debug.ShouldStop(64);
_timestamp = RemoteObject.createImmutable(0L);Debug.locals.put("timestamp", _timestamp);
 BA.debugLineNum = 264;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
Debug.ShouldStop(128);
frmactivity.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyyMMdd"));
 BA.debugLineNum = 265;BA.debugLine="Yesterday = DateTime.Date(DateTime.add(DateTime.N";
Debug.ShouldStop(256);
_yesterday = BA.numberCast(long.class, frmactivity.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(frmactivity.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(frmactivity.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, -(double) (0 + 1)))))));Debug.locals.put("Yesterday", _yesterday);
 BA.debugLineNum = 266;BA.debugLine="timestamp = DateTime.Date(lngTicks)";
Debug.ShouldStop(512);
_timestamp = BA.numberCast(long.class, frmactivity.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lngticks)));Debug.locals.put("timestamp", _timestamp);
 BA.debugLineNum = 268;BA.debugLine="DateTime.DateFormat = \"h:mm:ss a\"";
Debug.ShouldStop(2048);
frmactivity.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("h:mm:ss a"));
 BA.debugLineNum = 269;BA.debugLine="If DateUtils.IsSameDay(lngTicks,DateTime.now) The";
Debug.ShouldStop(4096);
if (frmactivity._dateutils.runMethod(true,"_issameday",(Object)(_lngticks),(Object)(frmactivity.__c.getField(false,"DateTime").runMethod(true,"getNow"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 270;BA.debugLine="Return \"Today\" '& DateTime.Date(lngTicks)";
Debug.ShouldStop(8192);
if (true) return BA.ObjectToString("Today");
 }else 
{ BA.debugLineNum = 271;BA.debugLine="Else If Yesterday = timestamp Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_yesterday,_timestamp)) { 
 BA.debugLineNum = 272;BA.debugLine="Return \"Yesterday\" '& DateTime.Date(lngTicks)";
Debug.ShouldStop(32768);
if (true) return BA.ObjectToString("Yesterday");
 }else {
 BA.debugLineNum = 274;BA.debugLine="Return DateUtils.GetDayOfWeekName(lngTicks) '& \"";
Debug.ShouldStop(131072);
if (true) return frmactivity._dateutils.runMethod(true,"_getdayofweekname",(Object)(_lngticks));
 }}
;
 BA.debugLineNum = 276;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertfulldatetime(RemoteObject __ref,RemoteObject _inputtime) throws Exception{
try {
		Debug.PushSubsStack("ConvertFullDateTime (frmactivity) ","frmactivity",1,__ref.getField(false, "ba"),__ref,279);
if (RapidSub.canDelegate("convertfulldatetime")) { return __ref.runUserSub(false, "frmactivity","convertfulldatetime", __ref, _inputtime);}
RemoteObject _ticks = RemoteObject.createImmutable(0L);
RemoteObject _lngticks = RemoteObject.createImmutable(0L);
RemoteObject _yesterday = RemoteObject.createImmutable(0L);
RemoteObject _timestamp = RemoteObject.createImmutable(0L);
Debug.locals.put("inputTime", _inputtime);
 BA.debugLineNum = 279;BA.debugLine="Sub ConvertFullDateTime(inputTime As String) As St";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 281;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
Debug.ShouldStop(16777216);
_ticks = __ref.runClassMethod (cloyd.blink.frmactivity.class, "_parseutcstring" /*RemoteObject*/ ,(Object)(_inputtime.runMethod(true,"replace",(Object)(BA.ObjectToString("+00:00")),(Object)(RemoteObject.createImmutable("+0000")))));Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 282;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
Debug.ShouldStop(33554432);
frmactivity.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("MMM d, yyyy h:mm:ss a"));
 BA.debugLineNum = 283;BA.debugLine="Dim lngTicks As Long = ticks";
Debug.ShouldStop(67108864);
_lngticks = _ticks;Debug.locals.put("lngTicks", _lngticks);Debug.locals.put("lngTicks", _lngticks);
 BA.debugLineNum = 285;BA.debugLine="Dim Yesterday As Long";
Debug.ShouldStop(268435456);
_yesterday = RemoteObject.createImmutable(0L);Debug.locals.put("Yesterday", _yesterday);
 BA.debugLineNum = 286;BA.debugLine="Dim timestamp As Long";
Debug.ShouldStop(536870912);
_timestamp = RemoteObject.createImmutable(0L);Debug.locals.put("timestamp", _timestamp);
 BA.debugLineNum = 287;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
Debug.ShouldStop(1073741824);
frmactivity.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyyMMdd"));
 BA.debugLineNum = 288;BA.debugLine="Yesterday = DateTime.Date(DateTime.add(DateTime.N";
Debug.ShouldStop(-2147483648);
_yesterday = BA.numberCast(long.class, frmactivity.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(frmactivity.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(frmactivity.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, -(double) (0 + 1)))))));Debug.locals.put("Yesterday", _yesterday);
 BA.debugLineNum = 289;BA.debugLine="timestamp = DateTime.Date(lngTicks)";
Debug.ShouldStop(1);
_timestamp = BA.numberCast(long.class, frmactivity.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lngticks)));Debug.locals.put("timestamp", _timestamp);
 BA.debugLineNum = 291;BA.debugLine="DateTime.DateFormat = \"h:mm:ss a\"";
Debug.ShouldStop(4);
frmactivity.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("h:mm:ss a"));
 BA.debugLineNum = 292;BA.debugLine="If DateUtils.IsSameDay(lngTicks,DateTime.now) The";
Debug.ShouldStop(8);
if (frmactivity._dateutils.runMethod(true,"_issameday",(Object)(_lngticks),(Object)(frmactivity.__c.getField(false,"DateTime").runMethod(true,"getNow"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 293;BA.debugLine="Return DateTime.Date(lngTicks)";
Debug.ShouldStop(16);
if (true) return frmactivity.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lngticks));
 }else 
{ BA.debugLineNum = 294;BA.debugLine="Else If Yesterday = timestamp Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_yesterday,_timestamp)) { 
 BA.debugLineNum = 295;BA.debugLine="Return DateTime.Date(lngTicks)";
Debug.ShouldStop(64);
if (true) return frmactivity.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lngticks));
 }else {
 BA.debugLineNum = 297;BA.debugLine="Return DateTime.Date(lngTicks)";
Debug.ShouldStop(256);
if (true) return frmactivity.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lngticks));
 }}
;
 BA.debugLineNum = 299;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcustomtype(RemoteObject __ref,RemoteObject _thumbnailpath,RemoteObject _datecreated,RemoteObject _watched,RemoteObject _devicename,RemoteObject _videoid,RemoteObject _thumbnailblob) throws Exception{
try {
		Debug.PushSubsStack("CreateCustomType (frmactivity) ","frmactivity",1,__ref.getField(false, "ba"),__ref,166);
if (RapidSub.canDelegate("createcustomtype")) { return __ref.runUserSub(false, "frmactivity","createcustomtype", __ref, _thumbnailpath, _datecreated, _watched, _devicename, _videoid, _thumbnailblob);}
RemoteObject _ct = RemoteObject.declareNull("cloyd.blink.frmactivity._videoinfo");
Debug.locals.put("ThumbnailPath", _thumbnailpath);
Debug.locals.put("DateCreated", _datecreated);
Debug.locals.put("Watched", _watched);
Debug.locals.put("DeviceName", _devicename);
Debug.locals.put("VideoID", _videoid);
Debug.locals.put("ThumbnailBLOB", _thumbnailblob);
 BA.debugLineNum = 166;BA.debugLine="Private Sub CreateCustomType(ThumbnailPath As Stri";
Debug.ShouldStop(32);
 BA.debugLineNum = 167;BA.debugLine="Dim ct As VideoInfo";
Debug.ShouldStop(64);
_ct = RemoteObject.createNew ("cloyd.blink.frmactivity._videoinfo");Debug.locals.put("ct", _ct);
 BA.debugLineNum = 168;BA.debugLine="ct.Initialize";
Debug.ShouldStop(128);
_ct.runVoidMethod ("Initialize");
 BA.debugLineNum = 169;BA.debugLine="ct.ThumbnailPath = ThumbnailPath";
Debug.ShouldStop(256);
_ct.setField ("ThumbnailPath" /*RemoteObject*/ ,_thumbnailpath);
 BA.debugLineNum = 170;BA.debugLine="ct.DateCreated = DateCreated";
Debug.ShouldStop(512);
_ct.setField ("DateCreated" /*RemoteObject*/ ,_datecreated);
 BA.debugLineNum = 171;BA.debugLine="ct.Watched = Watched";
Debug.ShouldStop(1024);
_ct.setField ("Watched" /*RemoteObject*/ ,_watched);
 BA.debugLineNum = 172;BA.debugLine="ct.DeviceName = DeviceName";
Debug.ShouldStop(2048);
_ct.setField ("DeviceName" /*RemoteObject*/ ,_devicename);
 BA.debugLineNum = 173;BA.debugLine="ct.ThumbnailBLOB = ThumbnailBLOB";
Debug.ShouldStop(4096);
_ct.setField ("ThumbnailBLOB" /*RemoteObject*/ ,_thumbnailblob);
 BA.debugLineNum = 174;BA.debugLine="ct.VideoID = VideoID";
Debug.ShouldStop(8192);
_ct.setField ("VideoID" /*RemoteObject*/ ,_videoid);
 BA.debugLineNum = 175;BA.debugLine="Return ct";
Debug.ShouldStop(16384);
if (true) return _ct;
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlistitem(RemoteObject __ref,RemoteObject _screenshot,RemoteObject _fileinfo,RemoteObject _devicename,RemoteObject _watched) throws Exception{
try {
		Debug.PushSubsStack("CreateListItem (frmactivity) ","frmactivity",1,__ref.getField(false, "ba"),__ref,178);
if (RapidSub.canDelegate("createlistitem")) { return __ref.runUserSub(false, "frmactivity","createlistitem", __ref, _screenshot, _fileinfo, _devicename, _watched);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _dayname = RemoteObject.createImmutable("");
Debug.locals.put("screenshot", _screenshot);
Debug.locals.put("fileinfo", _fileinfo);
Debug.locals.put("devicename", _devicename);
Debug.locals.put("watched", _watched);
 BA.debugLineNum = 178;BA.debugLine="Sub CreateListItem(screenshot As B4XBitmap, filein";
Debug.ShouldStop(131072);
 BA.debugLineNum = 179;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 183;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(4194304);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 184;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 400dip, 80dip)";
Debug.ShouldStop(8388608);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, frmactivity.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 400))))),(Object)(BA.numberCast(double.class, frmactivity.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))))));
 BA.debugLineNum = 185;BA.debugLine="p.LoadLayout(\"cellitem\")";
Debug.ShouldStop(16777216);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("cellitem")),__ref.getField(false, "ba"));
 BA.debugLineNum = 186;BA.debugLine="ivScreenshot.SetBitmap(screenshot)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_ivscreenshot" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((_screenshot.getObject())));
 BA.debugLineNum = 187;BA.debugLine="Dim dayname As String";
Debug.ShouldStop(67108864);
_dayname = RemoteObject.createImmutable("");Debug.locals.put("dayname", _dayname);
 BA.debugLineNum = 188;BA.debugLine="dayname = ConvertDayName(fileinfo)";
Debug.ShouldStop(134217728);
_dayname = __ref.runClassMethod (cloyd.blink.frmactivity.class, "_convertdayname" /*RemoteObject*/ ,(Object)(_fileinfo));Debug.locals.put("dayname", _dayname);
 BA.debugLineNum = 189;BA.debugLine="If watched<>\"true\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("!",_watched,BA.ObjectToString("true"))) { 
 BA.debugLineNum = 190;BA.debugLine="ivWatched.Visible = True";
Debug.ShouldStop(536870912);
__ref.getField(false,"_ivwatched" /*RemoteObject*/ ).runMethod(true,"setVisible",frmactivity.__c.getField(true,"True"));
 BA.debugLineNum = 191;BA.debugLine="lblDate.Text = \"   \" & dayname & \" \" & ConvertD";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lbldate" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("   "),_dayname,RemoteObject.createImmutable(" "),__ref.runClassMethod (cloyd.blink.frmactivity.class, "_convertdatetimeperiod" /*RemoteObject*/ ,(Object)(_fileinfo),(Object)(_dayname))));
 }else {
 BA.debugLineNum = 193;BA.debugLine="ivWatched.Visible = False";
Debug.ShouldStop(1);
__ref.getField(false,"_ivwatched" /*RemoteObject*/ ).runMethod(true,"setVisible",frmactivity.__c.getField(true,"False"));
 BA.debugLineNum = 194;BA.debugLine="lblDate.Text = \"   \" & dayname";
Debug.ShouldStop(2);
__ref.getField(false,"_lbldate" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("   "),_dayname));
 };
 BA.debugLineNum = 196;BA.debugLine="lblFileInfo.Text = \"   \" & ConvertFullDateTime(f";
Debug.ShouldStop(8);
__ref.getField(false,"_lblfileinfo" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("   "),__ref.runClassMethod (cloyd.blink.frmactivity.class, "_convertfulldatetime" /*RemoteObject*/ ,(Object)(_fileinfo))));
 BA.debugLineNum = 197;BA.debugLine="lblDeviceInfo.Text = \"   \" & devicename";
Debug.ShouldStop(16);
__ref.getField(false,"_lbldeviceinfo" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("   "),_devicename));
 BA.debugLineNum = 198;BA.debugLine="ivWatched.SetBitmap(fx.LoadImage(File.DirAssets,";
Debug.ShouldStop(32);
__ref.getField(false,"_ivwatched" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"LoadImage",(Object)(frmactivity.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("blink_clip_roll_blue_dot_icon.png"))).getObject())));
 BA.debugLineNum = 199;BA.debugLine="Return p";
Debug.ShouldStop(64);
Debug.CheckDeviceExceptions();if (true) return _p;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e20) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e20.toString()); BA.debugLineNum = 201;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
frmactivity.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(frmactivity.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 BA.debugLineNum = 202;BA.debugLine="cutils.ShowNotification(\"Catanaoan Blink XT2 Cam";
Debug.ShouldStop(512);
__ref.getField(false,"_cutils" /*RemoteObject*/ ).runVoidMethod ("ShowNotification",(Object)(BA.ObjectToString("Catanaoan Blink XT2 Cameras v1.0")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("CreateListItem: "),frmactivity.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))),(Object)(__ref.getField(false,"_cutils" /*RemoteObject*/ ).getField(true,"ICON_ERROR")));
 BA.debugLineNum = 203;BA.debugLine="Return Null";
Debug.ShouldStop(1024);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), frmactivity.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 206;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (frmactivity) ","frmactivity",1,__ref.getField(false, "ba"),__ref,429);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "frmactivity","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 429;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 430;BA.debugLine="wvMedia.LoadUrl(\"\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_wvmedia" /*RemoteObject*/ ).runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 431;BA.debugLine="wvMedia.RemoveNodeFromParent";
Debug.ShouldStop(16384);
__ref.getField(false,"_wvmedia" /*RemoteObject*/ ).runVoidMethod ("RemoveNodeFromParent");
 BA.debugLineNum = 432;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
Debug.ShouldStop(32768);
frmactivity.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(frmactivity.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("screenshot.jpg")));
 BA.debugLineNum = 433;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
Debug.ShouldStop(65536);
frmactivity.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(frmactivity.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("media.mp4")));
 BA.debugLineNum = 434;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _getvideos(RemoteObject __ref,RemoteObject _json,RemoteObject _userregion) throws Exception{
try {
		Debug.PushSubsStack("GetVideos (frmactivity) ","frmactivity",1,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("getvideos")) { __ref.runUserSub(false, "frmactivity","getvideos", __ref, _json, _userregion); return;}
ResumableSub_GetVideos rsub = new ResumableSub_GetVideos(null,__ref,_json,_userregion);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetVideos extends BA.ResumableSub {
public ResumableSub_GetVideos(cloyd.blink.frmactivity parent,RemoteObject __ref,RemoteObject _json,RemoteObject _userregion) {
this.parent = parent;
this.__ref = __ref;
this._json = _json;
this._userregion = _userregion;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
cloyd.blink.frmactivity parent;
RemoteObject _json;
RemoteObject _userregion;
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _media = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colmedia = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _thumbnail = RemoteObject.createImmutable("");
RemoteObject _created_at = RemoteObject.createImmutable("");
RemoteObject _device_name = RemoteObject.createImmutable("");
RemoteObject _watched = RemoteObject.createImmutable("");
RemoteObject _videoid = RemoteObject.createImmutable("");
RemoteObject _medianame = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("cloyd.blink.httpjob");
RemoteObject _image = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _mytypes = RemoteObject.declareNull("Object");
RemoteObject _videos = RemoteObject.declareNull("cloyd.blink.frmactivity._videoinfo");
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject group8;
int index8;
int groupLen8;
int step52;
int limit52;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetVideos (frmactivity) ","frmactivity",1,__ref.getField(false, "ba"),__ref,51);
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
 BA.debugLineNum = 52;BA.debugLine="Try";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//try
this.state = 48;
this.catchState = 47;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 47;
 BA.debugLineNum = 53;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1048576);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 54;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(2097152);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 55;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(4194304);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 59;BA.debugLine="Dim media As List = root.Get(\"media\")";
Debug.ShouldStop(67108864);
_media = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_media = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("media")))));Debug.locals.put("media", _media);
 BA.debugLineNum = 61;BA.debugLine="kvs.Initialize(File.DirApp, \"datastore\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_kvs" /*RemoteObject*/ ).runClassMethod (cloyd.blink.keyvaluestore.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("datastore")));
 BA.debugLineNum = 63;BA.debugLine="B4XLoadingIndicator1.Show";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_b4xloadingindicator1" /*RemoteObject*/ ).runClassMethod (cloyd.blink.b4xloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 64;BA.debugLine="For Each colmedia As Map In media";
Debug.ShouldStop(-2147483648);
if (true) break;

case 4:
//for
this.state = 25;
_colmedia = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group8 = _media;
index8 = 0;
groupLen8 = group8.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colmedia", _colmedia);
this.state = 49;
if (true) break;

case 49:
//C
this.state = 25;
if (index8 < groupLen8) {
this.state = 6;
_colmedia = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group8.runMethod(false,"Get",index8));}
if (true) break;

case 50:
//C
this.state = 49;
index8++;
Debug.locals.put("colmedia", _colmedia);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 65;BA.debugLine="Dim thumbnail As String = colmedia.Get(\"thumbna";
Debug.ShouldStop(1);
_thumbnail = BA.ObjectToString(_colmedia.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("thumbnail")))));Debug.locals.put("thumbnail", _thumbnail);Debug.locals.put("thumbnail", _thumbnail);
 BA.debugLineNum = 68;BA.debugLine="Dim created_at As String = colmedia.Get(\"create";
Debug.ShouldStop(8);
_created_at = BA.ObjectToString(_colmedia.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 73;BA.debugLine="Dim device_name As String = colmedia.Get(\"devic";
Debug.ShouldStop(256);
_device_name = BA.ObjectToString(_colmedia.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("device_name")))));Debug.locals.put("device_name", _device_name);Debug.locals.put("device_name", _device_name);
 BA.debugLineNum = 75;BA.debugLine="Dim watched As String = colmedia.Get(\"watched\")";
Debug.ShouldStop(1024);
_watched = BA.ObjectToString(_colmedia.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("watched")))));Debug.locals.put("watched", _watched);Debug.locals.put("watched", _watched);
 BA.debugLineNum = 78;BA.debugLine="Dim VideoID As String = colmedia.Get(\"id\")";
Debug.ShouldStop(8192);
_videoid = BA.ObjectToString(_colmedia.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("VideoID", _videoid);Debug.locals.put("VideoID", _videoid);
 BA.debugLineNum = 83;BA.debugLine="Dim medianame As String = colmedia.Get(\"media\")";
Debug.ShouldStop(262144);
_medianame = BA.ObjectToString(_colmedia.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("media")))));Debug.locals.put("medianame", _medianame);Debug.locals.put("medianame", _medianame);
 BA.debugLineNum = 89;BA.debugLine="If kvs.ContainsKey(VideoID) = False Then";
Debug.ShouldStop(16777216);
if (true) break;

case 7:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_kvs" /*RemoteObject*/ ).runClassMethod (cloyd.blink.keyvaluestore.class, "_containskey" /*RemoteObject*/ ,(Object)(_videoid)),parent.__c.getField(true,"False"))) { 
this.state = 9;
}else {
this.state = 15;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 90;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(33554432);
_j = RemoteObject.createNew ("cloyd.blink.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 91;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(67108864);
_j.runClassMethod (cloyd.blink.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 92;BA.debugLine="j.Download(\"https://rest-\" & userRegion &\".imm";
Debug.ShouldStop(134217728);
_j.runClassMethod (cloyd.blink.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),_userregion,RemoteObject.createImmutable(".immedia-semi.com"),_thumbnail,RemoteObject.createImmutable(".jpg"))));
 BA.debugLineNum = 93;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken";
Debug.ShouldStop(268435456);
_j.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("TOKEN_AUTH")),(Object)(__ref.getField(true,"_authtoken" /*RemoteObject*/ )));
 BA.debugLineNum = 94;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frmactivity", "getvideos"), (_j));
this.state = 51;
return;
case 51:
//C
this.state = 10;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 95;BA.debugLine="If j.Success Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 10:
//if
this.state = 13;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 96;BA.debugLine="Dim image As B4XBitmap = j.GetBitmap";
Debug.ShouldStop(-2147483648);
_image = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_image = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), _j.runClassMethod (cloyd.blink.httpjob.class, "_getbitmap" /*RemoteObject*/ ).getObject());Debug.locals.put("image", _image);
 BA.debugLineNum = 98;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(2);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 99;BA.debugLine="out.InitializeToBytesArray(0)";
Debug.ShouldStop(4);
_out.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 100;BA.debugLine="image.WriteToStream(out, 100, \"JPEG\")";
Debug.ShouldStop(8);
_image.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(BA.numberCast(int.class, 100)),(Object)(RemoteObject.createImmutable("JPEG")));
 BA.debugLineNum = 101;BA.debugLine="kvs.Put(VideoID, CreateCustomType(medianame,c";
Debug.ShouldStop(16);
__ref.getField(false,"_kvs" /*RemoteObject*/ ).runClassMethod (cloyd.blink.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(_videoid),(Object)((__ref.runClassMethod (cloyd.blink.frmactivity.class, "_createcustomtype" /*RemoteObject*/ ,(Object)(_medianame),(Object)(_created_at),(Object)(_watched),(Object)(_device_name),(Object)(_videoid),(Object)(_out.runMethod(false,"ToBytesArray"))))));
 BA.debugLineNum = 102;BA.debugLine="out.Close";
Debug.ShouldStop(32);
_out.runVoidMethod ("Close");
 if (true) break;

case 13:
//C
this.state = 24;
;
 BA.debugLineNum = 104;BA.debugLine="j.Release";
Debug.ShouldStop(128);
_j.runClassMethod (cloyd.blink.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 106;BA.debugLine="Dim mytypes As Object = kvs.Get(VideoID)";
Debug.ShouldStop(512);
_mytypes = __ref.getField(false,"_kvs" /*RemoteObject*/ ).runClassMethod (cloyd.blink.keyvaluestore.class, "_get" /*RemoteObject*/ ,(Object)(_videoid));Debug.locals.put("mytypes", _mytypes);Debug.locals.put("mytypes", _mytypes);
 BA.debugLineNum = 107;BA.debugLine="Dim videos = mytypes As VideoInfo";
Debug.ShouldStop(1024);
_videos = (_mytypes);Debug.locals.put("videos", _videos);Debug.locals.put("videos", _videos);
 BA.debugLineNum = 108;BA.debugLine="If (videos = Null) Or (watched <> videos.Watch";
Debug.ShouldStop(2048);
if (true) break;

case 16:
//if
this.state = 23;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("n",_videos)))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",_watched,_videos.getField(true,"Watched" /*RemoteObject*/ )))))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 109;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(4096);
_j = RemoteObject.createNew ("cloyd.blink.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 110;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(8192);
_j.runClassMethod (cloyd.blink.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 111;BA.debugLine="j.Download(\"https://rest-\" & userRegion &\".im";
Debug.ShouldStop(16384);
_j.runClassMethod (cloyd.blink.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),_userregion,RemoteObject.createImmutable(".immedia-semi.com"),_thumbnail,RemoteObject.createImmutable(".jpg"))));
 BA.debugLineNum = 112;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToke";
Debug.ShouldStop(32768);
_j.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("TOKEN_AUTH")),(Object)(__ref.getField(true,"_authtoken" /*RemoteObject*/ )));
 BA.debugLineNum = 113;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frmactivity", "getvideos"), (_j));
this.state = 52;
return;
case 52:
//C
this.state = 19;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 114;BA.debugLine="If j.Success Then";
Debug.ShouldStop(131072);
if (true) break;

case 19:
//if
this.state = 22;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 115;BA.debugLine="Dim image As B4XBitmap = j.GetBitmap";
Debug.ShouldStop(262144);
_image = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_image = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), _j.runClassMethod (cloyd.blink.httpjob.class, "_getbitmap" /*RemoteObject*/ ).getObject());Debug.locals.put("image", _image);
 BA.debugLineNum = 117;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(1048576);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 118;BA.debugLine="out.InitializeToBytesArray(0)";
Debug.ShouldStop(2097152);
_out.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 119;BA.debugLine="image.WriteToStream(out, 100, \"JPEG\")";
Debug.ShouldStop(4194304);
_image.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(BA.numberCast(int.class, 100)),(Object)(RemoteObject.createImmutable("JPEG")));
 BA.debugLineNum = 120;BA.debugLine="kvs.Put(VideoID, CreateCustomType(medianame,";
Debug.ShouldStop(8388608);
__ref.getField(false,"_kvs" /*RemoteObject*/ ).runClassMethod (cloyd.blink.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(_videoid),(Object)((__ref.runClassMethod (cloyd.blink.frmactivity.class, "_createcustomtype" /*RemoteObject*/ ,(Object)(_medianame),(Object)(_created_at),(Object)(_watched),(Object)(_device_name),(Object)(_videoid),(Object)(_out.runMethod(false,"ToBytesArray"))))));
 BA.debugLineNum = 121;BA.debugLine="out.Close";
Debug.ShouldStop(16777216);
_out.runVoidMethod ("Close");
 if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 123;BA.debugLine="j.Release";
Debug.ShouldStop(67108864);
_j.runClassMethod (cloyd.blink.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = 50;
;
 if (true) break;
if (true) break;

case 25:
//C
this.state = 26;
Debug.locals.put("colmedia", _colmedia);
;
 BA.debugLineNum = 128;BA.debugLine="Dim list1 As List = kvs.ListKeys";
Debug.ShouldStop(-2147483648);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_list1 = __ref.getField(false,"_kvs" /*RemoteObject*/ ).runClassMethod (cloyd.blink.keyvaluestore.class, "_listkeys" /*RemoteObject*/ );Debug.locals.put("list1", _list1);Debug.locals.put("list1", _list1);
 BA.debugLineNum = 129;BA.debugLine="For i =  0 To list1.Size-1";
Debug.ShouldStop(1);
if (true) break;

case 26:
//for
this.state = 41;
step52 = 1;
limit52 = RemoteObject.solve(new RemoteObject[] {_list1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 53;
if (true) break;

case 53:
//C
this.state = 41;
if ((step52 > 0 && _i <= limit52) || (step52 < 0 && _i >= limit52)) this.state = 28;
if (true) break;

case 54:
//C
this.state = 53;
_i = ((int)(0 + _i + step52)) ;
Debug.locals.put("i", _i);
if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 130;BA.debugLine="If i > 99 Then";
Debug.ShouldStop(2);
if (true) break;

case 29:
//if
this.state = 40;
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(int.class, 99))) { 
this.state = 31;
}else {
this.state = 33;
}if (true) break;

case 31:
//C
this.state = 40;
 BA.debugLineNum = 131;BA.debugLine="kvs.Remove(list1.Get(i))";
Debug.ShouldStop(4);
__ref.getField(false,"_kvs" /*RemoteObject*/ ).runClassMethod (cloyd.blink.keyvaluestore.class, "_remove" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 133;BA.debugLine="Dim mytypes As Object = kvs.Get(list1.Get(i))";
Debug.ShouldStop(16);
_mytypes = __ref.getField(false,"_kvs" /*RemoteObject*/ ).runClassMethod (cloyd.blink.keyvaluestore.class, "_get" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));Debug.locals.put("mytypes", _mytypes);Debug.locals.put("mytypes", _mytypes);
 BA.debugLineNum = 134;BA.debugLine="Dim videos = mytypes As VideoInfo";
Debug.ShouldStop(32);
_videos = (_mytypes);Debug.locals.put("videos", _videos);Debug.locals.put("videos", _videos);
 BA.debugLineNum = 136;BA.debugLine="Log(\"kvs.ListKeys \" & i & \" | \" & videos.Video";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("kvs.ListKeys "),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(" | "),_videos.getField(true,"VideoID" /*RemoteObject*/ ),RemoteObject.createImmutable(" | "),_videos.getField(true,"Watched" /*RemoteObject*/ ),RemoteObject.createImmutable(" | "),_videos.getField(true,"DateCreated" /*RemoteObject*/ ))));
 BA.debugLineNum = 138;BA.debugLine="Dim In As InputStream";
Debug.ShouldStop(512);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("In", _in);
 BA.debugLineNum = 139;BA.debugLine="In.InitializeFromBytesArray(videos.ThumbnailBL";
Debug.ShouldStop(1024);
_in.runVoidMethod ("InitializeFromBytesArray",(Object)(_videos.getField(false,"ThumbnailBLOB" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(_videos.getField(false,"ThumbnailBLOB" /*RemoteObject*/ ).getField(true,"length")));
 BA.debugLineNum = 140;BA.debugLine="Dim bmp As Image";
Debug.ShouldStop(2048);
_bmp = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 141;BA.debugLine="bmp.Initialize2(In)";
Debug.ShouldStop(4096);
_bmp.runVoidMethod ("Initialize2",(Object)((_in.getObject())));
 BA.debugLineNum = 143;BA.debugLine="Dim p As B4XView = CreateListItem(bmp,videos.D";
Debug.ShouldStop(16384);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.runClassMethod (cloyd.blink.frmactivity.class, "_createlistitem" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), _bmp.getObject()),(Object)(_videos.getField(true,"DateCreated" /*RemoteObject*/ )),(Object)(_videos.getField(true,"DeviceName" /*RemoteObject*/ )),(Object)(_watched));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 144;BA.debugLine="clvActivity.Add(p,\"https://rest-\" & userRegion";
Debug.ShouldStop(32768);
__ref.getField(false,"_clvactivity" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(_p),(Object)((RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),_userregion,RemoteObject.createImmutable(".immedia-semi.com"),_videos.getField(true,"ThumbnailPath" /*RemoteObject*/ ),RemoteObject.createImmutable("|"),_videos.getField(true,"DeviceName" /*RemoteObject*/ ),RemoteObject.createImmutable(" "),__ref.runClassMethod (cloyd.blink.frmactivity.class, "_convertfulldatetime" /*RemoteObject*/ ,(Object)(_videos.getField(true,"DateCreated" /*RemoteObject*/ )))))));
 BA.debugLineNum = 145;BA.debugLine="If videos.Watched <> \"true\" Then";
Debug.ShouldStop(65536);
if (true) break;

case 34:
//if
this.state = 39;
if (RemoteObject.solveBoolean("!",_videos.getField(true,"Watched" /*RemoteObject*/ ),BA.ObjectToString("true"))) { 
this.state = 36;
}else {
this.state = 38;
}if (true) break;

case 36:
//C
this.state = 39;
 BA.debugLineNum = 146;BA.debugLine="ivWatched.Visible = True";
Debug.ShouldStop(131072);
__ref.getField(false,"_ivwatched" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 148;BA.debugLine="ivWatched.Visible = False";
Debug.ShouldStop(524288);
__ref.getField(false,"_ivwatched" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 if (true) break;

case 39:
//C
this.state = 40;
;
 if (true) break;

case 40:
//C
this.state = 54;
;
 if (true) break;
if (true) break;

case 41:
//C
this.state = 42;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 152;BA.debugLine="B4XLoadingIndicator1.Hide";
Debug.ShouldStop(8388608);
__ref.getField(false,"_b4xloadingindicator1" /*RemoteObject*/ ).runClassMethod (cloyd.blink.b4xloadingindicator.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 153;BA.debugLine="If list1.Size > 0 Then";
Debug.ShouldStop(16777216);
if (true) break;

case 42:
//if
this.state = 45;
if (RemoteObject.solveBoolean(">",_list1.runMethod(true,"getSize"),BA.numberCast(int.class, 0))) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 154;BA.debugLine="clvActivity.JumpToItem(0)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_clvactivity" /*RemoteObject*/ ).runVoidMethod ("_jumptoitem",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 155;BA.debugLine="Sleep(100)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frmactivity", "getvideos"),BA.numberCast(int.class, 100));
this.state = 55;
return;
case 55:
//C
this.state = 45;
;
 BA.debugLineNum = 156;BA.debugLine="clvActivity_ItemClick(0,\"\") '\"https://rest-\" &";
Debug.ShouldStop(134217728);
__ref.runClassMethod (cloyd.blink.frmactivity.class, "_clvactivity_itemclick" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 157;BA.debugLine="Sleep(100)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frmactivity", "getvideos"),BA.numberCast(int.class, 100));
this.state = 56;
return;
case 56:
//C
this.state = 45;
;
 if (true) break;

case 45:
//C
this.state = 48;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 47:
//C
this.state = 48;
this.catchState = 0;
 BA.debugLineNum = 160;BA.debugLine="B4XLoadingIndicator1.Hide";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_b4xloadingindicator1" /*RemoteObject*/ ).runClassMethod (cloyd.blink.b4xloadingindicator.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 161;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 BA.debugLineNum = 162;BA.debugLine="cutils.ShowNotification(\"Catanaoan Blink XT2 Cam";
Debug.ShouldStop(2);
__ref.getField(false,"_cutils" /*RemoteObject*/ ).runVoidMethod ("ShowNotification",(Object)(BA.ObjectToString("Catanaoan Blink XT2 Cameras v1.0")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("GetVideos: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))),(Object)(__ref.getField(false,"_cutils" /*RemoteObject*/ ).getField(true,"ICON_ERROR")));
 if (true) break;
if (true) break;

case 48:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("Initialize (frmactivity) ","frmactivity",1,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "frmactivity","initialize", __ref, _ba, _parent);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _obj = RemoteObject.declareNull("anywheresoftware.b4j.agraham.reflection.Reflection");
Debug.locals.put("ba", _ba);
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize(Parent As Form)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="frm.Initialize(\"frm\", 600dip, 600dip)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, frmactivity.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, frmactivity.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))));
 BA.debugLineNum = 26;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("SetFormStyle",(Object)(RemoteObject.createImmutable("UTILITY")));
 BA.debugLineNum = 27;BA.debugLine="frm.RootPane.LoadLayout(\"activity\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("activity")));
 BA.debugLineNum = 28;BA.debugLine="frm.Icon = fx.LoadImage(File.DirAssets, \"home.png";
Debug.ShouldStop(134217728);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"LoadImage",(Object)(frmactivity.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("home.png"))).getObject()));
 BA.debugLineNum = 29;BA.debugLine="frm.Title = \"Catanaoan Blink XT2 Cameras Activity";
Debug.ShouldStop(268435456);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",BA.ObjectToString("Catanaoan Blink XT2 Cameras Activity Viewer"));
 BA.debugLineNum = 30;BA.debugLine="frm.SetOwner(Parent)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("SetOwner",(Object)(_parent));
 BA.debugLineNum = 31;BA.debugLine="frm.WindowWidth = CheckMonitor.MaxX - CheckMonito";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setWindowWidth",RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (cloyd.blink.frmactivity.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMaxX"),__ref.runClassMethod (cloyd.blink.frmactivity.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMinX")}, "-",1, 0));
 BA.debugLineNum = 32;BA.debugLine="frm.WindowLeft = CheckMonitor.MinX";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setWindowLeft",__ref.runClassMethod (cloyd.blink.frmactivity.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMinX"));
 BA.debugLineNum = 33;BA.debugLine="frm.WindowHeight = CheckMonitor.MaxY - CheckMonit";
Debug.ShouldStop(1);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setWindowHeight",RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (cloyd.blink.frmactivity.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMaxY"),__ref.runClassMethod (cloyd.blink.frmactivity.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMinY")}, "-",1, 0));
 BA.debugLineNum = 34;BA.debugLine="frm.WindowTop = CheckMonitor.MinY";
Debug.ShouldStop(2);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setWindowTop",__ref.runClassMethod (cloyd.blink.frmactivity.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMinY"));
 BA.debugLineNum = 35;BA.debugLine="Dim Obj As Reflector";
Debug.ShouldStop(4);
_obj = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 36;BA.debugLine="Obj.Target = frm.RootPane";
Debug.ShouldStop(8);
_obj.setField ("Target",(__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 37;BA.debugLine="Obj.AddEventHandler(\"RootPaneKeyEvent\", \"javafx.s";
Debug.ShouldStop(16);
_obj.runVoidMethod ("AddEventHandler",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("RootPaneKeyEvent")),(Object)(RemoteObject.createImmutable("javafx.scene.input.KeyEvent.ANY")));
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
public static RemoteObject  _parseutcstring(RemoteObject __ref,RemoteObject _utc) throws Exception{
try {
		Debug.PushSubsStack("ParseUTCstring (frmactivity) ","frmactivity",1,__ref.getField(false, "ba"),__ref,306);
if (RapidSub.canDelegate("parseutcstring")) { return __ref.runUserSub(false, "frmactivity","parseutcstring", __ref, _utc);}
RemoteObject _df = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.createImmutable(0L);
Debug.locals.put("utc", _utc);
 BA.debugLineNum = 306;BA.debugLine="Sub ParseUTCstring(utc As String) As Long";
Debug.ShouldStop(131072);
 BA.debugLineNum = 307;BA.debugLine="Dim df As String = DateTime.DateFormat";
Debug.ShouldStop(262144);
_df = frmactivity.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("df", _df);Debug.locals.put("df", _df);
 BA.debugLineNum = 308;BA.debugLine="Dim res As Long";
Debug.ShouldStop(524288);
_res = RemoteObject.createImmutable(0L);Debug.locals.put("res", _res);
 BA.debugLineNum = 309;BA.debugLine="If utc.CharAt(10) = \"T\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_utc.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, 10))),BA.ObjectToChar("T"))) { 
 BA.debugLineNum = 311;BA.debugLine="If utc.CharAt(19) = \".\" Then utc = utc.SubString";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_utc.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, 19))),BA.ObjectToChar("."))) { 
_utc = RemoteObject.concat(_utc.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 19))),RemoteObject.createImmutable("+0000"));Debug.locals.put("utc", _utc);};
 BA.debugLineNum = 312;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd'T'HH:mm:ssZ\"";
Debug.ShouldStop(8388608);
frmactivity.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd'T'HH:mm:ssZ"));
 }else {
 BA.debugLineNum = 315;BA.debugLine="DateTime.DateFormat = \"EEE MMM dd HH:mm:ss Z yyy";
Debug.ShouldStop(67108864);
frmactivity.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("EEE MMM dd HH:mm:ss Z yyyy"));
 };
 BA.debugLineNum = 317;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 318;BA.debugLine="res = DateTime.DateParse(utc)";
Debug.ShouldStop(536870912);
_res = frmactivity.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_utc));Debug.locals.put("res", _res);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 320;BA.debugLine="res = 0";
Debug.ShouldStop(-2147483648);
_res = BA.numberCast(long.class, 0);Debug.locals.put("res", _res);
 };
 BA.debugLineNum = 322;BA.debugLine="DateTime.DateFormat = df";
Debug.ShouldStop(2);
frmactivity.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_df);
 BA.debugLineNum = 323;BA.debugLine="Return res";
Debug.ShouldStop(4);
if (true) return _res;
 BA.debugLineNum = 324;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rootpanekeyevent_event(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("RootPaneKeyEvent_Event (frmactivity) ","frmactivity",1,__ref.getField(false, "ba"),__ref,436);
if (RapidSub.canDelegate("rootpanekeyevent_event")) { return __ref.runUserSub(false, "frmactivity","rootpanekeyevent_event", __ref, _e);}
RemoteObject _ke = RemoteObject.declareNull("anywheresoftware.b4j.agraham.reflection.Reflection");
RemoteObject _scode = RemoteObject.createImmutable("");
RemoteObject _stype = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
Debug.locals.put("e", _e);
 BA.debugLineNum = 436;BA.debugLine="Private Sub RootPaneKeyEvent_Event(e As Event)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 437;BA.debugLine="Dim KE As Reflector";
Debug.ShouldStop(1048576);
_ke = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("KE", _ke);
 BA.debugLineNum = 438;BA.debugLine="Dim sCode As String";
Debug.ShouldStop(2097152);
_scode = RemoteObject.createImmutable("");Debug.locals.put("sCode", _scode);
 BA.debugLineNum = 439;BA.debugLine="Dim sType As String 'ignore";
Debug.ShouldStop(4194304);
_stype = RemoteObject.createImmutable("");Debug.locals.put("sType", _stype);
 BA.debugLineNum = 440;BA.debugLine="Dim result As Int 'ignore";
Debug.ShouldStop(8388608);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 441;BA.debugLine="KE.Target = e	 ' e is a KeyEvent instance";
Debug.ShouldStop(16777216);
_ke.setField ("Target",(_e.getObject()));
 BA.debugLineNum = 442;BA.debugLine="sCode = KE.RunMethod(\"getCode\")";
Debug.ShouldStop(33554432);
_scode = BA.ObjectToString(_ke.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getCode"))));Debug.locals.put("sCode", _scode);
 BA.debugLineNum = 443;BA.debugLine="sType = KE.RunMethod(\"getEventType\")";
Debug.ShouldStop(67108864);
_stype = BA.ObjectToString(_ke.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getEventType"))));Debug.locals.put("sType", _stype);
 BA.debugLineNum = 444;BA.debugLine="If sCode=\"ESCAPE\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_scode,BA.ObjectToString("ESCAPE"))) { 
 BA.debugLineNum = 445;BA.debugLine="wvMedia.LoadUrl(\"\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_wvmedia" /*RemoteObject*/ ).runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 446;BA.debugLine="wvMedia.RemoveNodeFromParent";
Debug.ShouldStop(536870912);
__ref.getField(false,"_wvmedia" /*RemoteObject*/ ).runVoidMethod ("RemoveNodeFromParent");
 BA.debugLineNum = 447;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
Debug.ShouldStop(1073741824);
frmactivity.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(frmactivity.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("screenshot.jpg")));
 BA.debugLineNum = 448;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
Debug.ShouldStop(-2147483648);
frmactivity.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(frmactivity.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("media.mp4")));
 BA.debugLineNum = 449;BA.debugLine="frm.Close";
Debug.ShouldStop(1);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 };
 BA.debugLineNum = 451;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _json,RemoteObject _userregion) throws Exception{
try {
		Debug.PushSubsStack("Show (frmactivity) ","frmactivity",1,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "frmactivity","show", __ref, _json, _userregion);}
Debug.locals.put("json", _json);
Debug.locals.put("userRegion", _userregion);
 BA.debugLineNum = 40;BA.debugLine="Public Sub Show(json As String, userRegion As Stri";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="jsonMain = json";
Debug.ShouldStop(512);
__ref.setField ("_jsonmain" /*RemoteObject*/ ,_json);
 BA.debugLineNum = 43;BA.debugLine="userRegionMain = userRegion";
Debug.ShouldStop(1024);
__ref.setField ("_userregionmain" /*RemoteObject*/ ,_userregion);
 BA.debugLineNum = 44;BA.debugLine="B4XLoadingIndicator1.Show";
Debug.ShouldStop(2048);
__ref.getField(false,"_b4xloadingindicator1" /*RemoteObject*/ ).runClassMethod (cloyd.blink.b4xloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 45;BA.debugLine="GetVideos(json, userRegion)";
Debug.ShouldStop(4096);
__ref.runClassMethod (cloyd.blink.frmactivity.class, "_getvideos" /*void*/ ,(Object)(_json),(Object)(_userregion));
 BA.debugLineNum = 46;BA.debugLine="B4XLoadingIndicator1.Hide";
Debug.ShouldStop(8192);
__ref.getField(false,"_b4xloadingindicator1" /*RemoteObject*/ ).runClassMethod (cloyd.blink.b4xloadingindicator.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 47;BA.debugLine="frm.ShowAndWait";
Debug.ShouldStop(16384);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("ShowAndWait");
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _showvideo(RemoteObject __ref,RemoteObject _link,RemoteObject _timestamp) throws Exception{
try {
		Debug.PushSubsStack("ShowVideo (frmactivity) ","frmactivity",1,__ref.getField(false, "ba"),__ref,369);
if (RapidSub.canDelegate("showvideo")) { __ref.runUserSub(false, "frmactivity","showvideo", __ref, _link, _timestamp); return;}
ResumableSub_ShowVideo rsub = new ResumableSub_ShowVideo(null,__ref,_link,_timestamp);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ShowVideo extends BA.ResumableSub {
public ResumableSub_ShowVideo(cloyd.blink.frmactivity parent,RemoteObject __ref,RemoteObject _link,RemoteObject _timestamp) {
this.parent = parent;
this.__ref = __ref;
this._link = _link;
this._timestamp = _timestamp;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
cloyd.blink.frmactivity parent;
RemoteObject _link;
RemoteObject _timestamp;
RemoteObject _j = RemoteObject.declareNull("cloyd.blink.httpjob");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _mytypes = RemoteObject.declareNull("Object");
RemoteObject _videos = RemoteObject.declareNull("cloyd.blink.frmactivity._videoinfo");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _contentlabel = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
int step25;
int limit25;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ShowVideo (frmactivity) ","frmactivity",1,__ref.getField(false, "ba"),__ref,369);
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
Debug.locals.put("timestamp", _timestamp);
 BA.debugLineNum = 370;BA.debugLine="Try";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//try
this.state = 23;
this.catchState = 22;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 22;
 BA.debugLineNum = 371;BA.debugLine="Log (\"Video URL: \" & Link)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Video URL: "),_link)));
 BA.debugLineNum = 372;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(524288);
_j = RemoteObject.createNew ("cloyd.blink.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 373;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(1048576);
_j.runClassMethod (cloyd.blink.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 374;BA.debugLine="j.Download(Link)";
Debug.ShouldStop(2097152);
_j.runClassMethod (cloyd.blink.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_link));
 BA.debugLineNum = 375;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
Debug.ShouldStop(4194304);
_j.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("TOKEN_AUTH")),(Object)(__ref.getField(true,"_authtoken" /*RemoteObject*/ )));
 BA.debugLineNum = 376;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frmactivity", "showvideo"), (_j));
this.state = 33;
return;
case 33:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 377;BA.debugLine="B4XLoadingIndicator1.Hide";
Debug.ShouldStop(16777216);
__ref.getField(false,"_b4xloadingindicator1" /*RemoteObject*/ ).runClassMethod (cloyd.blink.b4xloadingindicator.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 378;BA.debugLine="If j.Success Then";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 380;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File.";
Debug.ShouldStop(134217728);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("media.mp4")),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 381;BA.debugLine="File.Copy2(j.GetInputStream, out)";
Debug.ShouldStop(268435456);
parent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_j.runClassMethod (cloyd.blink.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())),(Object)((_out.getObject())));
 BA.debugLineNum = 382;BA.debugLine="out.Close '<------ very important";
Debug.ShouldStop(536870912);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 384;BA.debugLine="lblTimestamp.Text= timestamp";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lbltimestamp" /*RemoteObject*/ ).runMethod(true,"setText",_timestamp);
 BA.debugLineNum = 385;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(1);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 386;BA.debugLine="sb.Initialize";
Debug.ShouldStop(2);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 387;BA.debugLine="sb.Append(\"<video width='100%' height='100%' co";
Debug.ShouldStop(4);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("<video width='100%' height='100%' controls autoplay>")));
 BA.debugLineNum = 388;BA.debugLine="sb.Append(\"<source src='\" & File.GetUri(File.Di";
Debug.ShouldStop(8);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("<source src='"),parent.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("media.mp4"))),RemoteObject.createImmutable("' Type='video/mp4'/>"))));
 BA.debugLineNum = 389;BA.debugLine="sb.Append(\"</video>\")";
Debug.ShouldStop(16);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</video>")));
 BA.debugLineNum = 390;BA.debugLine="wvMedia.LoadHtml(sb.ToString)";
Debug.ShouldStop(32);
__ref.getField(false,"_wvmedia" /*RemoteObject*/ ).runVoidMethod ("LoadHtml",(Object)(_sb.runMethod(true,"ToString")));
 if (true) break;

case 8:
//C
this.state = 9;
 if (true) break;
;
 BA.debugLineNum = 394;BA.debugLine="If j.ErrorMessage.Contains(\"Media not found\") Th";
Debug.ShouldStop(512);

case 9:
//if
this.state = 20;
if (_j.getField(true,"_errormessage" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Media not found"))).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 395;BA.debugLine="clvActivity.RemoveAt(previousSelectedIndex)";
Debug.ShouldStop(1024);
__ref.getField(false,"_clvactivity" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(__ref.getField(true,"_previousselectedindex" /*RemoteObject*/ )));
 BA.debugLineNum = 396;BA.debugLine="Dim list1 As List = kvs.ListKeys";
Debug.ShouldStop(2048);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_list1 = __ref.getField(false,"_kvs" /*RemoteObject*/ ).runClassMethod (cloyd.blink.keyvaluestore.class, "_listkeys" /*RemoteObject*/ );Debug.locals.put("list1", _list1);Debug.locals.put("list1", _list1);
 BA.debugLineNum = 397;BA.debugLine="For i =  0 To list1.Size-1";
Debug.ShouldStop(4096);
if (true) break;

case 12:
//for
this.state = 19;
step25 = 1;
limit25 = RemoteObject.solve(new RemoteObject[] {_list1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 34;
if (true) break;

case 34:
//C
this.state = 19;
if ((step25 > 0 && _i <= limit25) || (step25 < 0 && _i >= limit25)) this.state = 14;
if (true) break;

case 35:
//C
this.state = 34;
_i = ((int)(0 + _i + step25)) ;
Debug.locals.put("i", _i);
if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 398;BA.debugLine="Dim mytypes As Object = kvs.Get(list1.Get(i))";
Debug.ShouldStop(8192);
_mytypes = __ref.getField(false,"_kvs" /*RemoteObject*/ ).runClassMethod (cloyd.blink.keyvaluestore.class, "_get" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));Debug.locals.put("mytypes", _mytypes);Debug.locals.put("mytypes", _mytypes);
 BA.debugLineNum = 399;BA.debugLine="Dim videos = mytypes As VideoInfo";
Debug.ShouldStop(16384);
_videos = (_mytypes);Debug.locals.put("videos", _videos);Debug.locals.put("videos", _videos);
 BA.debugLineNum = 400;BA.debugLine="If Link.Contains(videos.VideoID) Then";
Debug.ShouldStop(32768);
if (true) break;

case 15:
//if
this.state = 18;
if (_link.runMethod(true,"contains",(Object)(_videos.getField(true,"VideoID" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 401;BA.debugLine="kvs.Remove(list1.Get(i))";
Debug.ShouldStop(65536);
__ref.getField(false,"_kvs" /*RemoteObject*/ ).runClassMethod (cloyd.blink.keyvaluestore.class, "_remove" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 BA.debugLineNum = 402;BA.debugLine="clvActivity.Clear";
Debug.ShouldStop(131072);
__ref.getField(false,"_clvactivity" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 403;BA.debugLine="cutils.ShowNotification(\"Catanaoan Blink XT2";
Debug.ShouldStop(262144);
__ref.getField(false,"_cutils" /*RemoteObject*/ ).runVoidMethod ("ShowNotification",(Object)(BA.ObjectToString("Catanaoan Blink XT2 Cameras v1.0")),(Object)(BA.ObjectToString("Media not found. Removed from the list.")),(Object)(__ref.getField(false,"_cutils" /*RemoteObject*/ ).getField(true,"ICON_INFORMATION")));
 BA.debugLineNum = 404;BA.debugLine="GetVideos(jsonMain,userRegionMain)";
Debug.ShouldStop(524288);
__ref.runClassMethod (cloyd.blink.frmactivity.class, "_getvideos" /*void*/ ,(Object)(__ref.getField(true,"_jsonmain" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_userregionmain" /*RemoteObject*/ )));
 BA.debugLineNum = 405;BA.debugLine="Exit";
Debug.ShouldStop(1048576);
this.state = 19;
if (true) break;
 if (true) break;

case 18:
//C
this.state = 35;
;
 if (true) break;
if (true) break;

case 19:
//C
this.state = 20;
Debug.locals.put("i", _i);
;
 if (true) break;

case 20:
//C
this.state = 23;
;
 BA.debugLineNum = 409;BA.debugLine="j.Release";
Debug.ShouldStop(16777216);
_j.runClassMethod (cloyd.blink.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 0;
 BA.debugLineNum = 411;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 BA.debugLineNum = 412;BA.debugLine="cutils.ShowNotification(\"Catanaoan Blink XT2 Cam";
Debug.ShouldStop(134217728);
__ref.getField(false,"_cutils" /*RemoteObject*/ ).runVoidMethod ("ShowNotification",(Object)(BA.ObjectToString("Catanaoan Blink XT2 Cameras v1.0")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("ShowVideo: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))),(Object)(__ref.getField(false,"_cutils" /*RemoteObject*/ ).getField(true,"ICON_ERROR")));
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 415;BA.debugLine="Try";
Debug.ShouldStop(1073741824);

case 23:
//try
this.state = 32;
this.catchState = 0;
this.catchState = 31;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 31;
 BA.debugLineNum = 416;BA.debugLine="Sleep(2000)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frmactivity", "showvideo"),BA.numberCast(int.class, 2000));
this.state = 36;
return;
case 36:
//C
this.state = 26;
;
 BA.debugLineNum = 417;BA.debugLine="Dim p As B4XView = clvActivity.GetPanel(previous";
Debug.ShouldStop(1);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_clvactivity" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(__ref.getField(true,"_previousselectedindex" /*RemoteObject*/ )));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 418;BA.debugLine="If p.NumberOfViews > 0 Then";
Debug.ShouldStop(2);
if (true) break;

case 26:
//if
this.state = 29;
if (RemoteObject.solveBoolean(">",_p.runMethod(true,"getNumberOfViews"),BA.numberCast(int.class, 0))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 420;BA.debugLine="Dim ContentLabel As ImageView = p.GetView(0).Ge";
Debug.ShouldStop(8);
_contentlabel = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");
_contentlabel = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("ContentLabel", _contentlabel);
 BA.debugLineNum = 421;BA.debugLine="ContentLabel.Visible = False";
Debug.ShouldStop(16);
_contentlabel.runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 if (true) break;

case 29:
//C
this.state = 32;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 0;
 BA.debugLineNum = 424;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 BA.debugLineNum = 425;BA.debugLine="cutils.ShowNotification(\"Catanaoan Blink XT2 Cam";
Debug.ShouldStop(256);
__ref.getField(false,"_cutils" /*RemoteObject*/ ).runVoidMethod ("ShowNotification",(Object)(BA.ObjectToString("Catanaoan Blink XT2 Cameras v1.0")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("ShowVideo 2nd Try-Catch: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))),(Object)(__ref.getField(false,"_cutils" /*RemoteObject*/ ).getField(true,"ICON_ERROR")));
 if (true) break;
if (true) break;

case 32:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 427;BA.debugLine="End Sub";
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
public static RemoteObject  _updateitemcolor(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("UpdateItemColor (frmactivity) ","frmactivity",1,__ref.getField(false, "ba"),__ref,484);
if (RapidSub.canDelegate("updateitemcolor")) { return __ref.runUserSub(false, "frmactivity","updateitemcolor", __ref, _index);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _backpanel = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
Debug.locals.put("Index", _index);
 BA.debugLineNum = 484;BA.debugLine="Sub UpdateItemColor (Index As Int)";
Debug.ShouldStop(8);
 BA.debugLineNum = 485;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 486;BA.debugLine="If previousSelectedIndex <> Index Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_previousselectedindex" /*RemoteObject*/ ),_index)) { 
 BA.debugLineNum = 487;BA.debugLine="Dim p As B4XView = clvActivity.GetPanel(previou";
Debug.ShouldStop(64);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_clvactivity" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(__ref.getField(true,"_previousselectedindex" /*RemoteObject*/ )));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 488;BA.debugLine="If p.NumberOfViews > 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_p.runMethod(true,"getNumberOfViews"),BA.numberCast(int.class, 0))) { 
 BA.debugLineNum = 490;BA.debugLine="Dim backPanel As Pane = p.getview(0)";
Debug.ShouldStop(512);
_backpanel = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_backpanel = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("backPanel", _backpanel);
 BA.debugLineNum = 491;BA.debugLine="CSSUtils.SetBackgroundColor(backPanel,fx.Color";
Debug.ShouldStop(1024);
frmactivity._cssutils.runVoidMethod ("_setbackgroundcolor",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _backpanel.getObject()),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), __ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").runMethod(false,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 217)),(Object)(BA.numberCast(int.class, 215)),(Object)(BA.numberCast(int.class, 222)))));
 BA.debugLineNum = 492;BA.debugLine="CSSUtils.SetBorder(backPanel,1,fx.Colors.Black";
Debug.ShouldStop(2048);
frmactivity._cssutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _backpanel.getObject()),(Object)(BA.numberCast(double.class, 1)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), __ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").getField(false,"Black")),(Object)(BA.numberCast(double.class, 1)));
 };
 };
 BA.debugLineNum = 496;BA.debugLine="Dim p As B4XView = clvActivity.GetPanel(Index)";
Debug.ShouldStop(32768);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_clvactivity" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_index));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 497;BA.debugLine="If p.NumberOfViews > 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_p.runMethod(true,"getNumberOfViews"),BA.numberCast(int.class, 0))) { 
 BA.debugLineNum = 499;BA.debugLine="Dim backPanel As Pane = p.getview(0)";
Debug.ShouldStop(262144);
_backpanel = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_backpanel = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("backPanel", _backpanel);
 BA.debugLineNum = 500;BA.debugLine="CSSUtils.SetBackgroundColor(backPanel, fx.Color";
Debug.ShouldStop(524288);
frmactivity._cssutils.runVoidMethod ("_setbackgroundcolor",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _backpanel.getObject()),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), __ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").getField(false,"White")));
 BA.debugLineNum = 501;BA.debugLine="CSSUtils.SetBorder(backPanel,2,fx.Colors.Red,1)";
Debug.ShouldStop(1048576);
frmactivity._cssutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _backpanel.getObject()),(Object)(BA.numberCast(double.class, 2)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), __ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").getField(false,"Red")),(Object)(BA.numberCast(double.class, 1)));
 };
 BA.debugLineNum = 504;BA.debugLine="previousSelectedIndex = Index";
Debug.ShouldStop(8388608);
__ref.setField ("_previousselectedindex" /*RemoteObject*/ ,_index);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e18.toString()); BA.debugLineNum = 506;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
frmactivity.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(frmactivity.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 BA.debugLineNum = 507;BA.debugLine="cutils.ShowNotification(\"Catanaoan Blink XT2 Cam";
Debug.ShouldStop(67108864);
__ref.getField(false,"_cutils" /*RemoteObject*/ ).runVoidMethod ("ShowNotification",(Object)(BA.ObjectToString("Catanaoan Blink XT2 Cameras v1.0")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("UpdateItemColor: "),frmactivity.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))),(Object)(__ref.getField(false,"_cutils" /*RemoteObject*/ ).getField(true,"ICON_ERROR")));
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
public static RemoteObject  _wvmedia_pagefinished(RemoteObject __ref,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("wvMedia_PageFinished (frmactivity) ","frmactivity",1,__ref.getField(false, "ba"),__ref,480);
if (RapidSub.canDelegate("wvmedia_pagefinished")) { return __ref.runUserSub(false, "frmactivity","wvmedia_pagefinished", __ref, _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 480;BA.debugLine="Sub wvMedia_PageFinished (Url As String)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 482;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}