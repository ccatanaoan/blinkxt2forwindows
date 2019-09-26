package cloyd.blink;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class frmactivity_subs_0 {


public static RemoteObject  _checkmonitor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckMonitor (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,301);
if (RapidSub.canDelegate("checkmonitor")) { return __ref.runUserSub(false, "frmactivity","checkmonitor", __ref);}
RemoteObject _slist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _s = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
 BA.debugLineNum = 301;BA.debugLine="Sub CheckMonitor() As Screen";
Debug.ShouldStop(4096);
 BA.debugLineNum = 302;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 303;BA.debugLine="If fx.Screens.Size= 1 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens").runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 304;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(32768);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = __ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 305;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(65536);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 307;BA.debugLine="Return S";
Debug.ShouldStop(262144);
Debug.CheckDeviceExceptions();if (true) return _s;
 }else 
{ BA.debugLineNum = 308;BA.debugLine="Else If fx.Screens.Size> 1 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens").runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 309;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(1048576);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = __ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 310;BA.debugLine="Dim S As Screen = SList.Get(2)";
Debug.ShouldStop(2097152);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("S", _s);
 BA.debugLineNum = 312;BA.debugLine="Return S";
Debug.ShouldStop(8388608);
Debug.CheckDeviceExceptions();if (true) return _s;
 }else {
 BA.debugLineNum = 314;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(33554432);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = __ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 315;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(67108864);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 317;BA.debugLine="Return S";
Debug.ShouldStop(268435456);
Debug.CheckDeviceExceptions();if (true) return _s;
 }}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e16.toString()); BA.debugLineNum = 320;BA.debugLine="Dim SList As List = fx.Screens";
Debug.ShouldStop(-2147483648);
_slist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_slist = __ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"getScreens");Debug.locals.put("SList", _slist);Debug.locals.put("SList", _slist);
 BA.debugLineNum = 321;BA.debugLine="Dim S As Screen = SList.Get(0)";
Debug.ShouldStop(1);
_s = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.ScreenWrapper");
_s.setObject(_slist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("S", _s);
 BA.debugLineNum = 323;BA.debugLine="Return S";
Debug.ShouldStop(4);
if (true) return _s;
 };
 BA.debugLineNum = 325;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
 //BA.debugLineNum = 4;BA.debugLine="Public jsonMain As String";
frmactivity._jsonmain = RemoteObject.createImmutable("");__ref.setField("_jsonmain",frmactivity._jsonmain);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
frmactivity._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",frmactivity._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private ivScreenshot As B4XView";
frmactivity._ivscreenshot = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_ivscreenshot",frmactivity._ivscreenshot);
 //BA.debugLineNum = 7;BA.debugLine="Private lblFileInfo As B4XView";
frmactivity._lblfileinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblfileinfo",frmactivity._lblfileinfo);
 //BA.debugLineNum = 8;BA.debugLine="Private lblDeviceInfo As B4XView";
frmactivity._lbldeviceinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbldeviceinfo",frmactivity._lbldeviceinfo);
 //BA.debugLineNum = 9;BA.debugLine="Private clvActivity As CustomListView";
frmactivity._clvactivity = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_clvactivity",frmactivity._clvactivity);
 //BA.debugLineNum = 10;BA.debugLine="Public authToken As String";
frmactivity._authtoken = RemoteObject.createImmutable("");__ref.setField("_authtoken",frmactivity._authtoken);
 //BA.debugLineNum = 11;BA.debugLine="Private wvMedia As WebView";
frmactivity._wvmedia = RemoteObject.createNew ("anywheresoftware.b4j.objects.WebViewWrapper");__ref.setField("_wvmedia",frmactivity._wvmedia);
 //BA.debugLineNum = 12;BA.debugLine="Private lblDate As B4XView";
frmactivity._lbldate = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbldate",frmactivity._lbldate);
 //BA.debugLineNum = 13;BA.debugLine="Private lblTimestamp As Label";
frmactivity._lbltimestamp = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltimestamp",frmactivity._lbltimestamp);
 //BA.debugLineNum = 14;BA.debugLine="Private previousSelectedIndex As Int";
frmactivity._previousselectedindex = RemoteObject.createImmutable(0);__ref.setField("_previousselectedindex",frmactivity._previousselectedindex);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clvactivity_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("clvActivity_ItemClick (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,231);
if (RapidSub.canDelegate("clvactivity_itemclick")) { return __ref.runUserSub(false, "frmactivity","clvactivity_itemclick", __ref, _index, _value);}
RemoteObject _video = RemoteObject.createImmutable("");
RemoteObject _videourl = RemoteObject.createImmutable("");
RemoteObject _videotimestamp = RemoteObject.createImmutable("");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 231;BA.debugLine="Sub clvActivity_ItemClick (Index As Int, Value As";
Debug.ShouldStop(64);
 BA.debugLineNum = 232;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 233;BA.debugLine="UpdateItemColor(Index, xui.Color_Blue)";
Debug.ShouldStop(256);
__ref.runClassMethod (cloyd.blink.frmactivity.class, "_updateitemcolor" /*RemoteObject*/ ,(Object)(_index),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue")));
 BA.debugLineNum = 234;BA.debugLine="wvMedia.LoadUrl(\"\")";
Debug.ShouldStop(512);
__ref.getField(false,"_wvmedia" /*RemoteObject*/ ).runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 235;BA.debugLine="Dim video As String";
Debug.ShouldStop(1024);
_video = RemoteObject.createImmutable("");Debug.locals.put("video", _video);
 BA.debugLineNum = 236;BA.debugLine="video = clvActivity.GetValue(Index)";
Debug.ShouldStop(2048);
_video = BA.ObjectToString(__ref.getField(false,"_clvactivity" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(_index)));Debug.locals.put("video", _video);
 BA.debugLineNum = 237;BA.debugLine="Dim videoURL As String = Regex.Split(\"\\|\",video)";
Debug.ShouldStop(4096);
_videourl = frmactivity.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(_video)).getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("videoURL", _videourl);Debug.locals.put("videoURL", _videourl);
 BA.debugLineNum = 238;BA.debugLine="Dim videoTimestamp As String = Regex.Split(\"\\|\",";
Debug.ShouldStop(8192);
_videotimestamp = frmactivity.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(_video)).getArrayElement(true,BA.numberCast(int.class, 1));Debug.locals.put("videoTimestamp", _videotimestamp);Debug.locals.put("videoTimestamp", _videotimestamp);
 BA.debugLineNum = 239;BA.debugLine="ShowVideo(videoURL,videoTimestamp)";
Debug.ShouldStop(16384);
__ref.runClassMethod (cloyd.blink.frmactivity.class, "_showvideo" /*void*/ ,(Object)(_videourl),(Object)(_videotimestamp));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e10.toString()); BA.debugLineNum = 241;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
frmactivity.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(frmactivity.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 BA.debugLineNum = 242;BA.debugLine="fx.Msgbox2(frm,LastException,\"clvActivity ItemCl";
Debug.ShouldStop(131072);
__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethodAndSync(true,"Msgbox2",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )),(Object)(BA.ObjectToString(frmactivity.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))),(Object)(BA.ObjectToString("clvActivity ItemClick Exception")),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"MSGBOX_ERROR")));
 };
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertdatetime(RemoteObject __ref,RemoteObject _inputtime) throws Exception{
try {
		Debug.PushSubsStack("ConvertDateTime (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("convertdatetime")) { return __ref.runUserSub(false, "frmactivity","convertdatetime", __ref, _inputtime);}
RemoteObject _ticks = RemoteObject.createImmutable(0L);
RemoteObject _lngticks = RemoteObject.createImmutable(0L);
RemoteObject _p = RemoteObject.declareNull("b4j.example.dateutils._period");
Debug.locals.put("inputTime", _inputtime);
 BA.debugLineNum = 123;BA.debugLine="Sub ConvertDateTime(inputTime As String) As String";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 125;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
Debug.ShouldStop(268435456);
_ticks = __ref.runClassMethod (cloyd.blink.frmactivity.class, "_parseutcstring" /*RemoteObject*/ ,(Object)(_inputtime.runMethod(true,"replace",(Object)(BA.ObjectToString("+00:00")),(Object)(RemoteObject.createImmutable("+0000")))));Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 126;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
Debug.ShouldStop(536870912);
frmactivity.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("MMM d, yyyy h:mm:ss a"));
 BA.debugLineNum = 127;BA.debugLine="Dim lngTicks As Long = ticks";
Debug.ShouldStop(1073741824);
_lngticks = _ticks;Debug.locals.put("lngTicks", _lngticks);Debug.locals.put("lngTicks", _lngticks);
 BA.debugLineNum = 128;BA.debugLine="Dim p As Period = DateUtils.PeriodBetween(lngTick";
Debug.ShouldStop(-2147483648);
_p = frmactivity._dateutils.runMethod(false,"_periodbetween",(Object)(_lngticks),(Object)(frmactivity.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 130;BA.debugLine="If lblDate.Text.Contains(\"Today\") Then";
Debug.ShouldStop(2);
if (__ref.getField(false,"_lbldate" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Today"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 131;BA.debugLine="If p.Days = 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Days"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 132;BA.debugLine="If p.Hours = 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Hours"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 133;BA.debugLine="If p.Minutes = 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Minutes"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 134;BA.debugLine="Return p.Seconds & \"s ago\"";
Debug.ShouldStop(32);
if (true) return RemoteObject.concat(_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago"));
 }else {
 BA.debugLineNum = 136;BA.debugLine="Return p.Minutes & \"m \" & p.Seconds & \"s ago\"";
Debug.ShouldStop(128);
if (true) return RemoteObject.concat(_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago"));
 };
 }else {
 BA.debugLineNum = 139;BA.debugLine="Return p.Hours & \"h \" & p.Minutes & \"m \" & p.S";
Debug.ShouldStop(1024);
if (true) return RemoteObject.concat(_p.getField(true,"Hours"),RemoteObject.createImmutable("h "),_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago"));
 };
 }else 
{ BA.debugLineNum = 141;BA.debugLine="else If p.Hours = 0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Hours"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 142;BA.debugLine="If p.Minutes = 0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Minutes"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 143;BA.debugLine="Return p.Seconds & \"s ago\"";
Debug.ShouldStop(16384);
if (true) return RemoteObject.concat(_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago"));
 }else {
 BA.debugLineNum = 145;BA.debugLine="Return p.Minutes & \"m \" & p.Seconds & \"s ago\"";
Debug.ShouldStop(65536);
if (true) return RemoteObject.concat(_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago"));
 };
 }else 
{ BA.debugLineNum = 147;BA.debugLine="else If p.Minutes = 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Minutes"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 148;BA.debugLine="Return p.Seconds & \"s ago\"";
Debug.ShouldStop(524288);
if (true) return RemoteObject.concat(_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago"));
 }else {
 BA.debugLineNum = 150;BA.debugLine="Return p.Days & \"d \" & p.Hours & \"h \" & p.Minut";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.concat(_p.getField(true,"Days"),RemoteObject.createImmutable("d "),_p.getField(true,"Hours"),RemoteObject.createImmutable("h "),_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago"));
 }}}
;
 }else 
{ BA.debugLineNum = 152;BA.debugLine="else if lblDate.Text.Contains(\"Yesterday\") Then";
Debug.ShouldStop(8388608);
if (__ref.getField(false,"_lbldate" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Yesterday"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 153;BA.debugLine="If p.Days = 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Days"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 154;BA.debugLine="If p.Hours = 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Hours"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 155;BA.debugLine="If p.Minutes = 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_p.getField(true,"Minutes"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 156;BA.debugLine="Return p.Seconds & \"s ago\"";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.concat(_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago"));
 }else {
 BA.debugLineNum = 158;BA.debugLine="Return p.Minutes & \"m \" & p.Seconds & \"s ago\"";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.concat(_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago"));
 };
 }else {
 BA.debugLineNum = 161;BA.debugLine="Return p.Hours & \"h \" & p.Minutes & \"m \" & p.S";
Debug.ShouldStop(1);
if (true) return RemoteObject.concat(_p.getField(true,"Hours"),RemoteObject.createImmutable("h "),_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago"));
 };
 }else {
 BA.debugLineNum = 164;BA.debugLine="Return p.Days & \"d \" & p.Hours & \"h \" & p.Minut";
Debug.ShouldStop(8);
if (true) return RemoteObject.concat(_p.getField(true,"Days"),RemoteObject.createImmutable("d "),_p.getField(true,"Hours"),RemoteObject.createImmutable("h "),_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago"));
 };
 }else {
 BA.debugLineNum = 167;BA.debugLine="Return p.Days & \"d \" & p.Hours & \"h \" & p.Minute";
Debug.ShouldStop(64);
if (true) return RemoteObject.concat(_p.getField(true,"Days"),RemoteObject.createImmutable("d "),_p.getField(true,"Hours"),RemoteObject.createImmutable("h "),_p.getField(true,"Minutes"),RemoteObject.createImmutable("m "),_p.getField(true,"Seconds"),RemoteObject.createImmutable("s ago"));
 }}
;
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("ConvertFullDateTime (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,171);
if (RapidSub.canDelegate("convertfulldatetime")) { return __ref.runUserSub(false, "frmactivity","convertfulldatetime", __ref, _inputtime);}
RemoteObject _ticks = RemoteObject.createImmutable(0L);
RemoteObject _lngticks = RemoteObject.createImmutable(0L);
RemoteObject _yesterday = RemoteObject.createImmutable(0L);
RemoteObject _timestamp = RemoteObject.createImmutable(0L);
Debug.locals.put("inputTime", _inputtime);
 BA.debugLineNum = 171;BA.debugLine="Sub ConvertFullDateTime(inputTime As String) As St";
Debug.ShouldStop(1024);
 BA.debugLineNum = 173;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
Debug.ShouldStop(4096);
_ticks = __ref.runClassMethod (cloyd.blink.frmactivity.class, "_parseutcstring" /*RemoteObject*/ ,(Object)(_inputtime.runMethod(true,"replace",(Object)(BA.ObjectToString("+00:00")),(Object)(RemoteObject.createImmutable("+0000")))));Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 174;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
Debug.ShouldStop(8192);
frmactivity.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("MMM d, yyyy h:mm:ss a"));
 BA.debugLineNum = 175;BA.debugLine="Dim lngTicks As Long = ticks";
Debug.ShouldStop(16384);
_lngticks = _ticks;Debug.locals.put("lngTicks", _lngticks);Debug.locals.put("lngTicks", _lngticks);
 BA.debugLineNum = 177;BA.debugLine="Dim Yesterday As Long";
Debug.ShouldStop(65536);
_yesterday = RemoteObject.createImmutable(0L);Debug.locals.put("Yesterday", _yesterday);
 BA.debugLineNum = 178;BA.debugLine="Dim timestamp As Long";
Debug.ShouldStop(131072);
_timestamp = RemoteObject.createImmutable(0L);Debug.locals.put("timestamp", _timestamp);
 BA.debugLineNum = 179;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
Debug.ShouldStop(262144);
frmactivity.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyyMMdd"));
 BA.debugLineNum = 180;BA.debugLine="Yesterday = DateTime.Date(DateTime.add(DateTime.N";
Debug.ShouldStop(524288);
_yesterday = BA.numberCast(long.class, frmactivity.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(frmactivity.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(frmactivity.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, -(double) (0 + 1)))))));Debug.locals.put("Yesterday", _yesterday);
 BA.debugLineNum = 181;BA.debugLine="timestamp = DateTime.Date(lngTicks)";
Debug.ShouldStop(1048576);
_timestamp = BA.numberCast(long.class, frmactivity.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lngticks)));Debug.locals.put("timestamp", _timestamp);
 BA.debugLineNum = 183;BA.debugLine="DateTime.DateFormat = \"h:mm:ss a\"";
Debug.ShouldStop(4194304);
frmactivity.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("h:mm:ss a"));
 BA.debugLineNum = 184;BA.debugLine="If DateUtils.IsSameDay(lngTicks,DateTime.now) The";
Debug.ShouldStop(8388608);
if (frmactivity._dateutils.runMethod(true,"_issameday",(Object)(_lngticks),(Object)(frmactivity.__c.getField(false,"DateTime").runMethod(true,"getNow"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 185;BA.debugLine="Return \"Today \" & DateTime.Date(lngTicks)";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Today "),frmactivity.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lngticks)));
 }else 
{ BA.debugLineNum = 186;BA.debugLine="Else If Yesterday = timestamp Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_yesterday,BA.numberCast(double.class, _timestamp))) { 
 BA.debugLineNum = 187;BA.debugLine="Return \"Yesterday \" & DateTime.Date(lngTicks)";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Yesterday "),frmactivity.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lngticks)));
 }else {
 BA.debugLineNum = 189;BA.debugLine="Return DateUtils.GetDayOfWeekName(lngTicks) & \"";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.concat(frmactivity._dateutils.runMethod(true,"_getdayofweekname",(Object)(_lngticks)),RemoteObject.createImmutable(" "),frmactivity.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lngticks)));
 }}
;
 BA.debugLineNum = 191;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlistitem(RemoteObject __ref,RemoteObject _screenshot,RemoteObject _fileinfo,RemoteObject _devicename) throws Exception{
try {
		Debug.PushSubsStack("CreateListItem (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("createlistitem")) { return __ref.runUserSub(false, "frmactivity","createlistitem", __ref, _screenshot, _fileinfo, _devicename);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("screenshot", _screenshot);
Debug.locals.put("fileinfo", _fileinfo);
Debug.locals.put("devicename", _devicename);
 BA.debugLineNum = 102;BA.debugLine="Sub CreateListItem(screenshot As B4XBitmap, filein";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 107;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(1024);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 108;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 400dip, 80dip)";
Debug.ShouldStop(2048);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, frmactivity.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 400))))),(Object)(BA.numberCast(double.class, frmactivity.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))))));
 BA.debugLineNum = 109;BA.debugLine="p.LoadLayout(\"cellitem\")";
Debug.ShouldStop(4096);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("cellitem")),__ref.getField(false, "ba"));
 BA.debugLineNum = 110;BA.debugLine="ivScreenshot.SetBitmap(screenshot)";
Debug.ShouldStop(8192);
__ref.getField(false,"_ivscreenshot" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((_screenshot.getObject())));
 BA.debugLineNum = 111;BA.debugLine="lblDate.Text = \"   \" & ConvertFullDateTime(filei";
Debug.ShouldStop(16384);
__ref.getField(false,"_lbldate" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("   "),__ref.runClassMethod (cloyd.blink.frmactivity.class, "_convertfulldatetime" /*RemoteObject*/ ,(Object)(_fileinfo))));
 BA.debugLineNum = 112;BA.debugLine="lblFileInfo.Text = \"   \" & ConvertDateTime(filei";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblfileinfo" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("   "),__ref.runClassMethod (cloyd.blink.frmactivity.class, "_convertdatetime" /*RemoteObject*/ ,(Object)(_fileinfo))));
 BA.debugLineNum = 113;BA.debugLine="lblDeviceInfo.Text = \"   \" & devicename";
Debug.ShouldStop(65536);
__ref.getField(false,"_lbldeviceinfo" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("   "),_devicename));
 BA.debugLineNum = 114;BA.debugLine="Return p";
Debug.ShouldStop(131072);
Debug.CheckDeviceExceptions();if (true) return _p;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e11) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e11.toString()); BA.debugLineNum = 116;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
frmactivity.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(frmactivity.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 BA.debugLineNum = 117;BA.debugLine="fx.Msgbox2(frm,LastException,\"CreateListItem Exc";
Debug.ShouldStop(1048576);
__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethodAndSync(true,"Msgbox2",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )),(Object)(BA.ObjectToString(frmactivity.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))),(Object)(BA.ObjectToString("CreateListItem Exception")),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"MSGBOX_ERROR")));
 BA.debugLineNum = 118;BA.debugLine="Return Null";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), frmactivity.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("frm_CloseRequest (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,277);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "frmactivity","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 277;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 278;BA.debugLine="wvMedia.LoadUrl(\"\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_wvmedia" /*RemoteObject*/ ).runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 279;BA.debugLine="wvMedia.RemoveNodeFromParent";
Debug.ShouldStop(4194304);
__ref.getField(false,"_wvmedia" /*RemoteObject*/ ).runVoidMethod ("RemoveNodeFromParent");
 BA.debugLineNum = 280;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
Debug.ShouldStop(8388608);
frmactivity.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(frmactivity.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("screenshot.jpg")));
 BA.debugLineNum = 281;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
Debug.ShouldStop(16777216);
frmactivity.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(frmactivity.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("media.mp4")));
 BA.debugLineNum = 282;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("GetVideos (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,41);
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
RemoteObject _medianame = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("cloyd.blink.httpjob");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject group6;
int index6;
int groupLen6;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetVideos (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,41);
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
 BA.debugLineNum = 42;BA.debugLine="Try";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 43;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1024);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 44;BA.debugLine="parser.Initialize(json)";
Debug.ShouldStop(2048);
_parser.runVoidMethod ("Initialize",(Object)(_json));
 BA.debugLineNum = 45;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(4096);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 49;BA.debugLine="Dim media As List = root.Get(\"media\")";
Debug.ShouldStop(65536);
_media = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_media.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("media")))));Debug.locals.put("media", _media);
 BA.debugLineNum = 50;BA.debugLine="For Each colmedia As Map In media";
Debug.ShouldStop(131072);
if (true) break;

case 4:
//for
this.state = 17;
_colmedia = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group6 = _media;
index6 = 0;
groupLen6 = group6.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colmedia", _colmedia);
this.state = 21;
if (true) break;

case 21:
//C
this.state = 17;
if (index6 < groupLen6) {
this.state = 6;
_colmedia.setObject(group6.runMethod(false,"Get",index6));}
if (true) break;

case 22:
//C
this.state = 21;
index6++;
Debug.locals.put("colmedia", _colmedia);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 51;BA.debugLine="Dim thumbnail As String = colmedia.Get(\"thumbna";
Debug.ShouldStop(262144);
_thumbnail = BA.ObjectToString(_colmedia.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("thumbnail")))));Debug.locals.put("thumbnail", _thumbnail);Debug.locals.put("thumbnail", _thumbnail);
 BA.debugLineNum = 54;BA.debugLine="Dim created_at As String = colmedia.Get(\"create";
Debug.ShouldStop(2097152);
_created_at = BA.ObjectToString(_colmedia.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 59;BA.debugLine="Dim device_name As String = colmedia.Get(\"devic";
Debug.ShouldStop(67108864);
_device_name = BA.ObjectToString(_colmedia.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("device_name")))));Debug.locals.put("device_name", _device_name);Debug.locals.put("device_name", _device_name);
 BA.debugLineNum = 69;BA.debugLine="Dim medianame As String = colmedia.Get(\"media\")";
Debug.ShouldStop(16);
_medianame = BA.ObjectToString(_colmedia.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("media")))));Debug.locals.put("medianame", _medianame);Debug.locals.put("medianame", _medianame);
 BA.debugLineNum = 70;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(32);
_j = RemoteObject.createNew ("cloyd.blink.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 71;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(64);
_j.runClassMethod (cloyd.blink.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 72;BA.debugLine="j.Download(\"https://rest-\" & userRegion &\".imme";
Debug.ShouldStop(128);
_j.runClassMethod (cloyd.blink.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),_userregion,RemoteObject.createImmutable(".immedia-semi.com"),_thumbnail,RemoteObject.createImmutable(".jpg"))));
 BA.debugLineNum = 73;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
Debug.ShouldStop(256);
_j.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("TOKEN_AUTH")),(Object)(__ref.getField(true,"_authtoken" /*RemoteObject*/ )));
 BA.debugLineNum = 74;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frmactivity", "getvideos"), (_j));
this.state = 23;
return;
case 23:
//C
this.state = 7;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 75;BA.debugLine="If j.Success Then";
Debug.ShouldStop(1024);
if (true) break;

case 7:
//if
this.state = 16;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 15;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 78;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
Debug.ShouldStop(8192);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("screenshot.jpg")),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 79;BA.debugLine="File.Copy2(j.GetInputStream, out)";
Debug.ShouldStop(16384);
parent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_j.runClassMethod (cloyd.blink.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())),(Object)((_out.getObject())));
 BA.debugLineNum = 80;BA.debugLine="out.Close '<------ very important";
Debug.ShouldStop(32768);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 84;BA.debugLine="Dim p As B4XView = CreateListItem(j.GetBitmap,";
Debug.ShouldStop(524288);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.runClassMethod (cloyd.blink.frmactivity.class, "_createlistitem" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), _j.runClassMethod (cloyd.blink.httpjob.class, "_getbitmap" /*RemoteObject*/ ).getObject()),(Object)(_created_at),(Object)(_device_name));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 85;BA.debugLine="clvActivity.Add(p,\"https://rest-\" & userRegion";
Debug.ShouldStop(1048576);
__ref.getField(false,"_clvactivity" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(_p),(Object)((RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),_userregion,RemoteObject.createImmutable(".immedia-semi.com"),_medianame,RemoteObject.createImmutable("|"),_device_name,RemoteObject.createImmutable(" "),__ref.runClassMethod (cloyd.blink.frmactivity.class, "_convertfulldatetime" /*RemoteObject*/ ,(Object)(_created_at))))));
 BA.debugLineNum = 86;BA.debugLine="If clvActivity.Size = 1 Then";
Debug.ShouldStop(2097152);
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_clvactivity" /*RemoteObject*/ ).runMethod(true,"_getsize"),BA.numberCast(double.class, 1))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 87;BA.debugLine="ShowVideo(\"https://rest-\" & userRegion &\".imm";
Debug.ShouldStop(4194304);
__ref.runClassMethod (cloyd.blink.frmactivity.class, "_showvideo" /*void*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://rest-"),_userregion,RemoteObject.createImmutable(".immedia-semi.com"),_medianame)),(Object)(RemoteObject.concat(_device_name,RemoteObject.createImmutable(" "),__ref.runClassMethod (cloyd.blink.frmactivity.class, "_convertfulldatetime" /*RemoteObject*/ ,(Object)(_created_at)))));
 BA.debugLineNum = 88;BA.debugLine="UpdateItemColor(clvActivity.FirstVisibleIndex";
Debug.ShouldStop(8388608);
__ref.runClassMethod (cloyd.blink.frmactivity.class, "_updateitemcolor" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_clvactivity" /*RemoteObject*/ ).runMethod(true,"_getfirstvisibleindex")),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue")));
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 if (true) break;

case 16:
//C
this.state = 22;
;
 BA.debugLineNum = 93;BA.debugLine="j.Release";
Debug.ShouldStop(268435456);
_j.runClassMethod (cloyd.blink.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;
if (true) break;

case 17:
//C
this.state = 20;
Debug.locals.put("colmedia", _colmedia);
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
 BA.debugLineNum = 97;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 BA.debugLineNum = 98;BA.debugLine="fx.Msgbox2(frm,LastException,\"GetVideos Exceptio";
Debug.ShouldStop(2);
__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethodAndSync(true,"Msgbox2",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )),(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))),(Object)(BA.ObjectToString("GetVideos Exception")),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"MSGBOX_ERROR")));
 if (true) break;
if (true) break;

case 20:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 100;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "frmactivity","initialize", __ref, _ba, _parent);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _obj = RemoteObject.declareNull("anywheresoftware.b4j.agraham.reflection.Reflection");
Debug.locals.put("ba", _ba);
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize(Parent As Form)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="frm.Initialize(\"frm\", 600dip, 600dip)";
Debug.ShouldStop(262144);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, frmactivity.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))),(Object)(BA.numberCast(double.class, frmactivity.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))))));
 BA.debugLineNum = 20;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("SetFormStyle",(Object)(RemoteObject.createImmutable("UTILITY")));
 BA.debugLineNum = 21;BA.debugLine="frm.RootPane.LoadLayout(\"activity\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("activity")));
 BA.debugLineNum = 22;BA.debugLine="frm.Icon = fx.LoadImage(File.DirAssets, \"home.png";
Debug.ShouldStop(2097152);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"LoadImage",(Object)(frmactivity.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("home.png"))).getObject()));
 BA.debugLineNum = 23;BA.debugLine="frm.Title = \"Catanaoan Blink XT2 Cameras Activity";
Debug.ShouldStop(4194304);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",BA.ObjectToString("Catanaoan Blink XT2 Cameras Activity Viewer"));
 BA.debugLineNum = 24;BA.debugLine="frm.SetOwner(Parent)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("SetOwner",(Object)(_parent));
 BA.debugLineNum = 25;BA.debugLine="frm.WindowWidth = CheckMonitor.MaxX - CheckMonito";
Debug.ShouldStop(16777216);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setWindowWidth",RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (cloyd.blink.frmactivity.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMaxX"),__ref.runClassMethod (cloyd.blink.frmactivity.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMinX")}, "-",1, 0));
 BA.debugLineNum = 26;BA.debugLine="frm.WindowLeft = CheckMonitor.MinX";
Debug.ShouldStop(33554432);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setWindowLeft",__ref.runClassMethod (cloyd.blink.frmactivity.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMinX"));
 BA.debugLineNum = 27;BA.debugLine="frm.WindowHeight = CheckMonitor.MaxY - CheckMonit";
Debug.ShouldStop(67108864);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setWindowHeight",RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (cloyd.blink.frmactivity.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMaxY"),__ref.runClassMethod (cloyd.blink.frmactivity.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMinY")}, "-",1, 0));
 BA.debugLineNum = 28;BA.debugLine="frm.WindowTop = CheckMonitor.MinY";
Debug.ShouldStop(134217728);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setWindowTop",__ref.runClassMethod (cloyd.blink.frmactivity.class, "_checkmonitor" /*RemoteObject*/ ).runMethod(true,"getMinY"));
 BA.debugLineNum = 29;BA.debugLine="Dim Obj As Reflector";
Debug.ShouldStop(268435456);
_obj = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 30;BA.debugLine="Obj.Target = frm.RootPane";
Debug.ShouldStop(536870912);
_obj.setField ("Target",(__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 31;BA.debugLine="Obj.AddEventHandler(\"RootPaneKeyEvent\", \"javafx.s";
Debug.ShouldStop(1073741824);
_obj.runVoidMethod ("AddEventHandler",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("RootPaneKeyEvent")),(Object)(RemoteObject.createImmutable("javafx.scene.input.KeyEvent.ANY")));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("ParseUTCstring (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,194);
if (RapidSub.canDelegate("parseutcstring")) { return __ref.runUserSub(false, "frmactivity","parseutcstring", __ref, _utc);}
RemoteObject _df = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.createImmutable(0L);
Debug.locals.put("utc", _utc);
 BA.debugLineNum = 194;BA.debugLine="Sub ParseUTCstring(utc As String) As Long";
Debug.ShouldStop(2);
 BA.debugLineNum = 195;BA.debugLine="Dim df As String = DateTime.DateFormat";
Debug.ShouldStop(4);
_df = frmactivity.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("df", _df);Debug.locals.put("df", _df);
 BA.debugLineNum = 196;BA.debugLine="Dim res As Long";
Debug.ShouldStop(8);
_res = RemoteObject.createImmutable(0L);Debug.locals.put("res", _res);
 BA.debugLineNum = 197;BA.debugLine="If utc.CharAt(10) = \"T\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_utc.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, 10))),BA.ObjectToChar("T"))) { 
 BA.debugLineNum = 199;BA.debugLine="If utc.CharAt(19) = \".\" Then utc = utc.SubString";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_utc.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, 19))),BA.ObjectToChar("."))) { 
_utc = RemoteObject.concat(_utc.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 19))),RemoteObject.createImmutable("+0000"));Debug.locals.put("utc", _utc);};
 BA.debugLineNum = 200;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd'T'HH:mm:ssZ\"";
Debug.ShouldStop(128);
frmactivity.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd'T'HH:mm:ssZ"));
 }else {
 BA.debugLineNum = 203;BA.debugLine="DateTime.DateFormat = \"EEE MMM dd HH:mm:ss Z yyy";
Debug.ShouldStop(1024);
frmactivity.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("EEE MMM dd HH:mm:ss Z yyyy"));
 };
 BA.debugLineNum = 205;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 206;BA.debugLine="res = DateTime.DateParse(utc)";
Debug.ShouldStop(8192);
_res = frmactivity.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_utc));Debug.locals.put("res", _res);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 208;BA.debugLine="res = 0";
Debug.ShouldStop(32768);
_res = BA.numberCast(long.class, 0);Debug.locals.put("res", _res);
 };
 BA.debugLineNum = 210;BA.debugLine="DateTime.DateFormat = df";
Debug.ShouldStop(131072);
frmactivity.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_df);
 BA.debugLineNum = 211;BA.debugLine="Return res";
Debug.ShouldStop(262144);
if (true) return _res;
 BA.debugLineNum = 212;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("RootPaneKeyEvent_Event (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,284);
if (RapidSub.canDelegate("rootpanekeyevent_event")) { return __ref.runUserSub(false, "frmactivity","rootpanekeyevent_event", __ref, _e);}
RemoteObject _ke = RemoteObject.declareNull("anywheresoftware.b4j.agraham.reflection.Reflection");
RemoteObject _scode = RemoteObject.createImmutable("");
RemoteObject _stype = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
Debug.locals.put("e", _e);
 BA.debugLineNum = 284;BA.debugLine="Private Sub RootPaneKeyEvent_Event(e As Event)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 285;BA.debugLine="Dim KE As Reflector";
Debug.ShouldStop(268435456);
_ke = RemoteObject.createNew ("anywheresoftware.b4j.agraham.reflection.Reflection");Debug.locals.put("KE", _ke);
 BA.debugLineNum = 286;BA.debugLine="Dim sCode As String";
Debug.ShouldStop(536870912);
_scode = RemoteObject.createImmutable("");Debug.locals.put("sCode", _scode);
 BA.debugLineNum = 287;BA.debugLine="Dim sType As String 'ignore";
Debug.ShouldStop(1073741824);
_stype = RemoteObject.createImmutable("");Debug.locals.put("sType", _stype);
 BA.debugLineNum = 288;BA.debugLine="Dim result As Int 'ignore";
Debug.ShouldStop(-2147483648);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 289;BA.debugLine="KE.Target = e	 ' e is a KeyEvent instance";
Debug.ShouldStop(1);
_ke.setField ("Target",(_e.getObject()));
 BA.debugLineNum = 290;BA.debugLine="sCode = KE.RunMethod(\"getCode\")";
Debug.ShouldStop(2);
_scode = BA.ObjectToString(_ke.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getCode"))));Debug.locals.put("sCode", _scode);
 BA.debugLineNum = 291;BA.debugLine="sType = KE.RunMethod(\"getEventType\")";
Debug.ShouldStop(4);
_stype = BA.ObjectToString(_ke.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getEventType"))));Debug.locals.put("sType", _stype);
 BA.debugLineNum = 292;BA.debugLine="If sCode=\"ESCAPE\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_scode,BA.ObjectToString("ESCAPE"))) { 
 BA.debugLineNum = 293;BA.debugLine="wvMedia.LoadUrl(\"\")";
Debug.ShouldStop(16);
__ref.getField(false,"_wvmedia" /*RemoteObject*/ ).runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 294;BA.debugLine="wvMedia.RemoveNodeFromParent";
Debug.ShouldStop(32);
__ref.getField(false,"_wvmedia" /*RemoteObject*/ ).runVoidMethod ("RemoveNodeFromParent");
 BA.debugLineNum = 295;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
Debug.ShouldStop(64);
frmactivity.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(frmactivity.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("screenshot.jpg")));
 BA.debugLineNum = 296;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
Debug.ShouldStop(128);
frmactivity.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(frmactivity.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("media.mp4")));
 BA.debugLineNum = 297;BA.debugLine="frm.Close";
Debug.ShouldStop(256);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 };
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
public static RemoteObject  _show(RemoteObject __ref,RemoteObject _json,RemoteObject _userregion) throws Exception{
try {
		Debug.PushSubsStack("Show (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "frmactivity","show", __ref, _json, _userregion);}
Debug.locals.put("json", _json);
Debug.locals.put("userRegion", _userregion);
 BA.debugLineNum = 34;BA.debugLine="Public Sub Show(json As String, userRegion As Stri";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="GetVideos(json, userRegion)";
Debug.ShouldStop(8);
__ref.runClassMethod (cloyd.blink.frmactivity.class, "_getvideos" /*void*/ ,(Object)(_json),(Object)(_userregion));
 BA.debugLineNum = 37;BA.debugLine="frm.ShowAndWait";
Debug.ShouldStop(16);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("ShowAndWait");
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("ShowVideo (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,247);
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

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ShowVideo (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,247);
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
 BA.debugLineNum = 248;BA.debugLine="Try";
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
 BA.debugLineNum = 249;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(16777216);
_j = RemoteObject.createNew ("cloyd.blink.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 250;BA.debugLine="j.Initialize(\"\", Me)";
Debug.ShouldStop(33554432);
_j.runClassMethod (cloyd.blink.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 251;BA.debugLine="j.Download(Link)";
Debug.ShouldStop(67108864);
_j.runClassMethod (cloyd.blink.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_link));
 BA.debugLineNum = 252;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
Debug.ShouldStop(134217728);
_j.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("TOKEN_AUTH")),(Object)(__ref.getField(true,"_authtoken" /*RemoteObject*/ )));
 BA.debugLineNum = 253;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "frmactivity", "showvideo"), (_j));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 254;BA.debugLine="If j.Success Then";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 256;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File.";
Debug.ShouldStop(-2147483648);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("media.mp4")),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 257;BA.debugLine="File.Copy2(j.GetInputStream, out)";
Debug.ShouldStop(1);
parent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_j.runClassMethod (cloyd.blink.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())),(Object)((_out.getObject())));
 BA.debugLineNum = 258;BA.debugLine="out.Close '<------ very important";
Debug.ShouldStop(2);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 260;BA.debugLine="lblTimestamp.Text= timestamp";
Debug.ShouldStop(8);
__ref.getField(false,"_lbltimestamp" /*RemoteObject*/ ).runMethod(true,"setText",_timestamp);
 BA.debugLineNum = 261;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(16);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 262;BA.debugLine="sb.Initialize";
Debug.ShouldStop(32);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 263;BA.debugLine="sb.Append(\"<video width='100%' height='100%' co";
Debug.ShouldStop(64);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("<video width='100%' height='100%' controls autoplay>")));
 BA.debugLineNum = 264;BA.debugLine="sb.Append(\"<source src='\" & File.GetUri(File.Di";
Debug.ShouldStop(128);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("<source src='"),parent.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("media.mp4"))),RemoteObject.createImmutable("' Type='video/mp4'/>"))));
 BA.debugLineNum = 265;BA.debugLine="sb.Append(\"</video>\")";
Debug.ShouldStop(256);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</video>")));
 BA.debugLineNum = 266;BA.debugLine="wvMedia.LoadHtml(sb.ToString)";
Debug.ShouldStop(512);
__ref.getField(false,"_wvmedia" /*RemoteObject*/ ).runVoidMethod ("LoadHtml",(Object)(_sb.runMethod(true,"ToString")));
 if (true) break;

case 8:
//C
this.state = 9;
 if (true) break;

case 9:
//C
this.state = 12;
;
 BA.debugLineNum = 270;BA.debugLine="j.Release";
Debug.ShouldStop(8192);
_j.runClassMethod (cloyd.blink.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 272;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 BA.debugLineNum = 273;BA.debugLine="fx.Msgbox2(frm,LastException,\"ShowVideo Exceptio";
Debug.ShouldStop(65536);
__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethodAndSync(true,"Msgbox2",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )),(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))),(Object)(BA.ObjectToString("ShowVideo Exception")),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"MSGBOX_ERROR")));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
public static RemoteObject  _updateitemcolor(RemoteObject __ref,RemoteObject _index,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("UpdateItemColor (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,332);
if (RapidSub.canDelegate("updateitemcolor")) { return __ref.runUserSub(false, "frmactivity","updateitemcolor", __ref, _index, _color);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _contentlabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 332;BA.debugLine="Sub UpdateItemColor (Index As Int, Color As Int)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 333;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 335;BA.debugLine="If previousSelectedIndex <> Index Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_previousselectedindex" /*RemoteObject*/ ),BA.numberCast(double.class, _index))) { 
 BA.debugLineNum = 336;BA.debugLine="Dim p As B4XView = clvActivity.GetPanel(previou";
Debug.ShouldStop(32768);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_clvactivity" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(__ref.getField(true,"_previousselectedindex" /*RemoteObject*/ )));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 337;BA.debugLine="If p.NumberOfViews > 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_p.runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 339;BA.debugLine="Dim ContentLabel As B4XView = p.GetView(0).Get";
Debug.ShouldStop(262144);
_contentlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_contentlabel = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("ContentLabel", _contentlabel);Debug.locals.put("ContentLabel", _contentlabel);
 BA.debugLineNum = 340;BA.debugLine="ContentLabel.TextColor = xui.Color_Black";
Debug.ShouldStop(524288);
_contentlabel.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 342;BA.debugLine="Dim ContentLabel As B4XView = p.GetView(0).Get";
Debug.ShouldStop(2097152);
_contentlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_contentlabel = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("ContentLabel", _contentlabel);Debug.locals.put("ContentLabel", _contentlabel);
 BA.debugLineNum = 343;BA.debugLine="ContentLabel.TextColor = xui.Color_Black";
Debug.ShouldStop(4194304);
_contentlabel.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 345;BA.debugLine="Dim ContentLabel As B4XView = p.GetView(0).Get";
Debug.ShouldStop(16777216);
_contentlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_contentlabel = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("ContentLabel", _contentlabel);Debug.locals.put("ContentLabel", _contentlabel);
 BA.debugLineNum = 346;BA.debugLine="ContentLabel.TextColor = xui.Color_Black";
Debug.ShouldStop(33554432);
_contentlabel.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 348;BA.debugLine="Dim ContentLabel As B4XView = p.GetView(1) ' l";
Debug.ShouldStop(134217728);
_contentlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_contentlabel = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("ContentLabel", _contentlabel);Debug.locals.put("ContentLabel", _contentlabel);
 BA.debugLineNum = 349;BA.debugLine="ContentLabel.TextColor = xui.Color_Black";
Debug.ShouldStop(268435456);
_contentlabel.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 };
 };
 BA.debugLineNum = 353;BA.debugLine="Dim p As B4XView = clvActivity.GetPanel(Index)";
Debug.ShouldStop(1);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_clvactivity" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_index));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 354;BA.debugLine="If p.NumberOfViews > 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_p.runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 356;BA.debugLine="Dim ContentLabel As B4XView = p.GetView(0).GetV";
Debug.ShouldStop(8);
_contentlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_contentlabel = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("ContentLabel", _contentlabel);Debug.locals.put("ContentLabel", _contentlabel);
 BA.debugLineNum = 357;BA.debugLine="ContentLabel.TextColor = Color";
Debug.ShouldStop(16);
_contentlabel.runMethod(true,"setTextColor",_color);
 BA.debugLineNum = 359;BA.debugLine="Dim ContentLabel As B4XView = p.GetView(0).GetV";
Debug.ShouldStop(64);
_contentlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_contentlabel = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("ContentLabel", _contentlabel);Debug.locals.put("ContentLabel", _contentlabel);
 BA.debugLineNum = 360;BA.debugLine="ContentLabel.TextColor = Color";
Debug.ShouldStop(128);
_contentlabel.runMethod(true,"setTextColor",_color);
 BA.debugLineNum = 362;BA.debugLine="Dim ContentLabel As B4XView = p.GetView(0).GetV";
Debug.ShouldStop(512);
_contentlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_contentlabel = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("ContentLabel", _contentlabel);Debug.locals.put("ContentLabel", _contentlabel);
 BA.debugLineNum = 363;BA.debugLine="ContentLabel.TextColor = Color";
Debug.ShouldStop(1024);
_contentlabel.runMethod(true,"setTextColor",_color);
 BA.debugLineNum = 365;BA.debugLine="Dim ContentLabel As B4XView = p.GetView(1) ' lb";
Debug.ShouldStop(4096);
_contentlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_contentlabel = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("ContentLabel", _contentlabel);Debug.locals.put("ContentLabel", _contentlabel);
 BA.debugLineNum = 366;BA.debugLine="ContentLabel.TextColor = Color";
Debug.ShouldStop(8192);
_contentlabel.runMethod(true,"setTextColor",_color);
 };
 BA.debugLineNum = 370;BA.debugLine="previousSelectedIndex = Index";
Debug.ShouldStop(131072);
__ref.setField ("_previousselectedindex" /*RemoteObject*/ ,_index);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e28) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e28.toString()); BA.debugLineNum = 372;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
frmactivity.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(frmactivity.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 };
 BA.debugLineNum = 374;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("wvMedia_PageFinished (frmactivity) ","frmactivity",2,__ref.getField(false, "ba"),__ref,328);
if (RapidSub.canDelegate("wvmedia_pagefinished")) { return __ref.runUserSub(false, "frmactivity","wvmedia_pagefinished", __ref, _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 328;BA.debugLine="Sub wvMedia_PageFinished (Url As String)";
Debug.ShouldStop(128);
 BA.debugLineNum = 330;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}