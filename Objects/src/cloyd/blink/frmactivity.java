package cloyd.blink;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class frmactivity extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("cloyd.blink", "cloyd.blink.frmactivity", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", cloyd.blink.frmactivity.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public String _jsonmain = "";
public String _userregionmain = "";
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _ivscreenshot = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblfileinfo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbldeviceinfo = null;
public b4j.example.customlistview _clvactivity = null;
public String _authtoken = "";
public anywheresoftware.b4j.objects.WebViewWrapper _wvmedia = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbldate = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltimestamp = null;
public int _previousselectedindex = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _ivwatched = null;
public cloyd.blink.keyvaluestore _kvs = null;
public anywheresoftware.b4j.objects.ControlsUtils _cutils = null;
public cloyd.blink.b4xloadingindicator _b4xloadingindicator1 = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public cloyd.blink.main _main = null;
public cloyd.blink.httputils2service _httputils2service = null;
public cloyd.blink.xuiviewsutils _xuiviewsutils = null;
public static class _videoinfo{
public boolean IsInitialized;
public String ThumbnailPath;
public String DateCreated;
public String Watched;
public String DeviceName;
public String VideoID;
public byte[] ThumbnailBLOB;
public void Initialize() {
IsInitialized = true;
ThumbnailPath = "";
DateCreated = "";
Watched = "";
DeviceName = "";
VideoID = "";
ThumbnailBLOB = new byte[0];
;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4j.objects.JFX.ScreenWrapper  _checkmonitor() throws Exception{
anywheresoftware.b4a.objects.collections.List _slist = null;
anywheresoftware.b4j.objects.JFX.ScreenWrapper _s = null;
 //BA.debugLineNum = 453;BA.debugLine="Sub CheckMonitor() As Screen";
 //BA.debugLineNum = 454;BA.debugLine="Try";
try { //BA.debugLineNum = 455;BA.debugLine="If fx.Screens.Size= 1 Then";
if (_fx.getScreens().getSize()==1) { 
 //BA.debugLineNum = 456;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 457;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s = (anywheresoftware.b4j.objects.JFX.ScreenWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.ScreenWrapper(), (javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 459;BA.debugLine="Return S";
if (true) return _s;
 }else if(_fx.getScreens().getSize()>1) { 
 //BA.debugLineNum = 461;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 462;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s = (anywheresoftware.b4j.objects.JFX.ScreenWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.ScreenWrapper(), (javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 464;BA.debugLine="Return S";
if (true) return _s;
 }else {
 //BA.debugLineNum = 466;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 467;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s = (anywheresoftware.b4j.objects.JFX.ScreenWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.ScreenWrapper(), (javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 469;BA.debugLine="Return S";
if (true) return _s;
 };
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 472;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 473;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s = (anywheresoftware.b4j.objects.JFX.ScreenWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.ScreenWrapper(), (javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 475;BA.debugLine="Return S";
if (true) return _s;
 };
 //BA.debugLineNum = 477;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 3;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 4;BA.debugLine="Private jsonMain As String";
_jsonmain = "";
 //BA.debugLineNum = 5;BA.debugLine="Private userRegionMain As String";
_userregionmain = "";
 //BA.debugLineNum = 6;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 7;BA.debugLine="Private ivScreenshot As B4XView";
_ivscreenshot = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private lblFileInfo As B4XView";
_lblfileinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private lblDeviceInfo As B4XView";
_lbldeviceinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private clvActivity As CustomListView";
_clvactivity = new b4j.example.customlistview();
 //BA.debugLineNum = 11;BA.debugLine="Public authToken As String";
_authtoken = "";
 //BA.debugLineNum = 12;BA.debugLine="Private wvMedia As WebView";
_wvmedia = new anywheresoftware.b4j.objects.WebViewWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private lblDate As B4XView";
_lbldate = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private lblTimestamp As Label";
_lbltimestamp = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private previousSelectedIndex As Int";
_previousselectedindex = 0;
 //BA.debugLineNum = 16;BA.debugLine="Private ivWatched As B4XView";
_ivwatched = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private kvs As KeyValueStore";
_kvs = new cloyd.blink.keyvaluestore();
 //BA.debugLineNum = 18;BA.debugLine="Type VideoInfo (ThumbnailPath As String, DateCrea";
;
 //BA.debugLineNum = 19;BA.debugLine="Private cutils As ControlsUtils";
_cutils = new anywheresoftware.b4j.objects.ControlsUtils();
 //BA.debugLineNum = 20;BA.debugLine="Private B4XLoadingIndicator1 As B4XLoadingIndicat";
_b4xloadingindicator1 = new cloyd.blink.b4xloadingindicator();
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public String  _clvactivity_itemclick(int _index,Object _value) throws Exception{
String _video = "";
String _videourl = "";
String _videotimestamp = "";
anywheresoftware.b4a.objects.collections.List _list1 = null;
int _i = 0;
Object _mytypes = null;
cloyd.blink.frmactivity._videoinfo _videos = null;
 //BA.debugLineNum = 343;BA.debugLine="Sub clvActivity_ItemClick (Index As Int, Value As";
 //BA.debugLineNum = 344;BA.debugLine="Try";
try { //BA.debugLineNum = 345;BA.debugLine="B4XLoadingIndicator1.Show";
_b4xloadingindicator1._show /*String*/ ();
 //BA.debugLineNum = 346;BA.debugLine="UpdateItemColor(Index)";
_updateitemcolor(_index);
 //BA.debugLineNum = 347;BA.debugLine="wvMedia.LoadUrl(\"\")";
_wvmedia.LoadUrl("");
 //BA.debugLineNum = 348;BA.debugLine="Dim video As String";
_video = "";
 //BA.debugLineNum = 349;BA.debugLine="video = clvActivity.GetValue(Index)";
_video = BA.ObjectToString(_clvactivity._getvalue(_index));
 //BA.debugLineNum = 350;BA.debugLine="Dim videoURL As String = Regex.Split(\"\\|\",video)";
_videourl = __c.Regex.Split("\\|",_video)[(int) (0)];
 //BA.debugLineNum = 351;BA.debugLine="Dim videoTimestamp As String = Regex.Split(\"\\|\",";
_videotimestamp = __c.Regex.Split("\\|",_video)[(int) (1)];
 //BA.debugLineNum = 352;BA.debugLine="ShowVideo(videoURL,videoTimestamp)";
_showvideo(_videourl,_videotimestamp);
 //BA.debugLineNum = 353;BA.debugLine="Dim list1 As List = kvs.ListKeys";
_list1 = new anywheresoftware.b4a.objects.collections.List();
_list1 = _kvs._listkeys /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 354;BA.debugLine="For i =  0 To list1.Size-1";
{
final int step11 = 1;
final int limit11 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
 //BA.debugLineNum = 355;BA.debugLine="Dim mytypes As Object = kvs.Get(list1.Get(i))";
_mytypes = _kvs._get /*Object*/ (BA.ObjectToString(_list1.Get(_i)));
 //BA.debugLineNum = 356;BA.debugLine="Dim videos = mytypes As VideoInfo";
_videos = (cloyd.blink.frmactivity._videoinfo)(_mytypes);
 //BA.debugLineNum = 357;BA.debugLine="If videoURL.Contains(videos.VideoID) Then";
if (_videourl.contains(_videos.VideoID /*String*/ )) { 
 //BA.debugLineNum = 358;BA.debugLine="kvs.Put(videos.VideoID,CreateCustomType(videos";
_kvs._put /*String*/ (_videos.VideoID /*String*/ ,(Object)(_createcustomtype(_videos.ThumbnailPath /*String*/ ,_videos.DateCreated /*String*/ ,"true",_videos.DeviceName /*String*/ ,_videos.VideoID /*String*/ ,_videos.ThumbnailBLOB /*byte[]*/ )));
 };
 }
};
 } 
       catch (Exception e19) {
			ba.setLastException(e19); //BA.debugLineNum = 362;BA.debugLine="B4XLoadingIndicator1.Hide";
_b4xloadingindicator1._hide /*String*/ ();
 //BA.debugLineNum = 363;BA.debugLine="cutils.ShowNotification(\"Catanaoan Blink XT2 Cam";
_cutils.ShowNotification("Catanaoan Blink XT2 Cameras v1.0","clvActivity_ItemClick: "+BA.ObjectToString(__c.LastException(ba)),_cutils.ICON_ERROR);
 //BA.debugLineNum = 364;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 };
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return "";
}
public String  _convertdatetimeperiod(String _inputtime,String _dayname) throws Exception{
long _ticks = 0L;
long _lngticks = 0L;
b4j.example.dateutils._period _p = null;
 //BA.debugLineNum = 208;BA.debugLine="Sub ConvertDateTimePeriod(inputTime As String, day";
 //BA.debugLineNum = 210;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = _parseutcstring(_inputtime.replace("+00:00","+0000"));
 //BA.debugLineNum = 211;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
__c.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a");
 //BA.debugLineNum = 212;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
 //BA.debugLineNum = 213;BA.debugLine="Dim p As Period = DateUtils.PeriodBetween(lngTick";
_p = _dateutils._periodbetween(_lngticks,__c.DateTime.getNow());
 //BA.debugLineNum = 215;BA.debugLine="If dayname.Contains(\"Today\") Then";
if (_dayname.contains("Today")) { 
 //BA.debugLineNum = 216;BA.debugLine="If p.Days = 0 Then";
if (_p.Days==0) { 
 //BA.debugLineNum = 217;BA.debugLine="If p.Hours = 0 Then";
if (_p.Hours==0) { 
 //BA.debugLineNum = 218;BA.debugLine="If p.Minutes = 0 Then";
if (_p.Minutes==0) { 
 //BA.debugLineNum = 219;BA.debugLine="Return p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Seconds)+"s ago";
 }else {
 //BA.debugLineNum = 221;BA.debugLine="Return p.Minutes & \"m \" & p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 };
 }else {
 //BA.debugLineNum = 224;BA.debugLine="Return p.Hours & \"h \" & p.Minutes & \"m \" & p.S";
if (true) return BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 };
 }else if(_p.Hours==0) { 
 //BA.debugLineNum = 227;BA.debugLine="If p.Minutes = 0 Then";
if (_p.Minutes==0) { 
 //BA.debugLineNum = 228;BA.debugLine="Return p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Seconds)+"s ago";
 }else {
 //BA.debugLineNum = 230;BA.debugLine="Return p.Minutes & \"m \" & p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 };
 }else if(_p.Minutes==0) { 
 //BA.debugLineNum = 233;BA.debugLine="Return p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Seconds)+"s ago";
 }else {
 //BA.debugLineNum = 235;BA.debugLine="Return p.Days & \"d \" & p.Hours & \"h \" & p.Minut";
if (true) return BA.NumberToString(_p.Days)+"d "+BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 };
 }else if(_dayname.contains("Yesterday")) { 
 //BA.debugLineNum = 238;BA.debugLine="If p.Days = 0 Then";
if (_p.Days==0) { 
 //BA.debugLineNum = 239;BA.debugLine="If p.Hours = 0 Then";
if (_p.Hours==0) { 
 //BA.debugLineNum = 240;BA.debugLine="If p.Minutes = 0 Then";
if (_p.Minutes==0) { 
 //BA.debugLineNum = 241;BA.debugLine="Return p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Seconds)+"s ago";
 }else {
 //BA.debugLineNum = 243;BA.debugLine="Return p.Minutes & \"m \" & p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 };
 }else {
 //BA.debugLineNum = 246;BA.debugLine="Return p.Hours & \"h \" & p.Minutes & \"m \" & p.S";
if (true) return BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 };
 }else {
 //BA.debugLineNum = 249;BA.debugLine="Return p.Days & \"d \" & p.Hours & \"h \" & p.Minut";
if (true) return BA.NumberToString(_p.Days)+"d "+BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 };
 }else {
 //BA.debugLineNum = 252;BA.debugLine="Return p.Days & \"d \" & p.Hours & \"h \" & p.Minute";
if (true) return BA.NumberToString(_p.Days)+"d "+BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 };
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return "";
}
public String  _convertdayname(String _inputtime) throws Exception{
long _ticks = 0L;
long _lngticks = 0L;
long _yesterday = 0L;
long _timestamp = 0L;
 //BA.debugLineNum = 256;BA.debugLine="Sub ConvertDayName(inputTime As String) As String";
 //BA.debugLineNum = 258;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = _parseutcstring(_inputtime.replace("+00:00","+0000"));
 //BA.debugLineNum = 259;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
__c.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a");
 //BA.debugLineNum = 260;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
 //BA.debugLineNum = 262;BA.debugLine="Dim Yesterday As Long";
_yesterday = 0L;
 //BA.debugLineNum = 263;BA.debugLine="Dim timestamp As Long";
_timestamp = 0L;
 //BA.debugLineNum = 264;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
__c.DateTime.setDateFormat("yyyyMMdd");
 //BA.debugLineNum = 265;BA.debugLine="Yesterday = DateTime.Date(DateTime.add(DateTime.N";
_yesterday = (long)(Double.parseDouble(__c.DateTime.Date(__c.DateTime.Add(__c.DateTime.getNow(),(int) (0),(int) (0),(int) (-1)))));
 //BA.debugLineNum = 266;BA.debugLine="timestamp = DateTime.Date(lngTicks)";
_timestamp = (long)(Double.parseDouble(__c.DateTime.Date(_lngticks)));
 //BA.debugLineNum = 268;BA.debugLine="DateTime.DateFormat = \"h:mm:ss a\"";
__c.DateTime.setDateFormat("h:mm:ss a");
 //BA.debugLineNum = 269;BA.debugLine="If DateUtils.IsSameDay(lngTicks,DateTime.now) The";
if (_dateutils._issameday(_lngticks,__c.DateTime.getNow())) { 
 //BA.debugLineNum = 270;BA.debugLine="Return \"Today\" '& DateTime.Date(lngTicks)";
if (true) return "Today";
 }else if(_yesterday==_timestamp) { 
 //BA.debugLineNum = 272;BA.debugLine="Return \"Yesterday\" '& DateTime.Date(lngTicks)";
if (true) return "Yesterday";
 }else {
 //BA.debugLineNum = 274;BA.debugLine="Return DateUtils.GetDayOfWeekName(lngTicks) '& \"";
if (true) return _dateutils._getdayofweekname(_lngticks);
 };
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return "";
}
public String  _convertfulldatetime(String _inputtime) throws Exception{
long _ticks = 0L;
long _lngticks = 0L;
long _yesterday = 0L;
long _timestamp = 0L;
 //BA.debugLineNum = 279;BA.debugLine="Sub ConvertFullDateTime(inputTime As String) As St";
 //BA.debugLineNum = 281;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = _parseutcstring(_inputtime.replace("+00:00","+0000"));
 //BA.debugLineNum = 282;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
__c.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a");
 //BA.debugLineNum = 283;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
 //BA.debugLineNum = 285;BA.debugLine="Dim Yesterday As Long";
_yesterday = 0L;
 //BA.debugLineNum = 286;BA.debugLine="Dim timestamp As Long";
_timestamp = 0L;
 //BA.debugLineNum = 287;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
__c.DateTime.setDateFormat("yyyyMMdd");
 //BA.debugLineNum = 288;BA.debugLine="Yesterday = DateTime.Date(DateTime.add(DateTime.N";
_yesterday = (long)(Double.parseDouble(__c.DateTime.Date(__c.DateTime.Add(__c.DateTime.getNow(),(int) (0),(int) (0),(int) (-1)))));
 //BA.debugLineNum = 289;BA.debugLine="timestamp = DateTime.Date(lngTicks)";
_timestamp = (long)(Double.parseDouble(__c.DateTime.Date(_lngticks)));
 //BA.debugLineNum = 291;BA.debugLine="DateTime.DateFormat = \"h:mm:ss a\"";
__c.DateTime.setDateFormat("h:mm:ss a");
 //BA.debugLineNum = 292;BA.debugLine="If DateUtils.IsSameDay(lngTicks,DateTime.now) The";
if (_dateutils._issameday(_lngticks,__c.DateTime.getNow())) { 
 //BA.debugLineNum = 293;BA.debugLine="Return DateTime.Date(lngTicks)";
if (true) return __c.DateTime.Date(_lngticks);
 }else if(_yesterday==_timestamp) { 
 //BA.debugLineNum = 295;BA.debugLine="Return DateTime.Date(lngTicks)";
if (true) return __c.DateTime.Date(_lngticks);
 }else {
 //BA.debugLineNum = 297;BA.debugLine="Return DateTime.Date(lngTicks)";
if (true) return __c.DateTime.Date(_lngticks);
 };
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return "";
}
public cloyd.blink.frmactivity._videoinfo  _createcustomtype(String _thumbnailpath,String _datecreated,String _watched,String _devicename,String _videoid,byte[] _thumbnailblob) throws Exception{
cloyd.blink.frmactivity._videoinfo _ct = null;
 //BA.debugLineNum = 166;BA.debugLine="Private Sub CreateCustomType(ThumbnailPath As Stri";
 //BA.debugLineNum = 167;BA.debugLine="Dim ct As VideoInfo";
_ct = new cloyd.blink.frmactivity._videoinfo();
 //BA.debugLineNum = 168;BA.debugLine="ct.Initialize";
_ct.Initialize();
 //BA.debugLineNum = 169;BA.debugLine="ct.ThumbnailPath = ThumbnailPath";
_ct.ThumbnailPath /*String*/  = _thumbnailpath;
 //BA.debugLineNum = 170;BA.debugLine="ct.DateCreated = DateCreated";
_ct.DateCreated /*String*/  = _datecreated;
 //BA.debugLineNum = 171;BA.debugLine="ct.Watched = Watched";
_ct.Watched /*String*/  = _watched;
 //BA.debugLineNum = 172;BA.debugLine="ct.DeviceName = DeviceName";
_ct.DeviceName /*String*/  = _devicename;
 //BA.debugLineNum = 173;BA.debugLine="ct.ThumbnailBLOB = ThumbnailBLOB";
_ct.ThumbnailBLOB /*byte[]*/  = _thumbnailblob;
 //BA.debugLineNum = 174;BA.debugLine="ct.VideoID = VideoID";
_ct.VideoID /*String*/  = _videoid;
 //BA.debugLineNum = 175;BA.debugLine="Return ct";
if (true) return _ct;
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlistitem(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _screenshot,String _fileinfo,String _devicename,String _watched) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
String _dayname = "";
 //BA.debugLineNum = 178;BA.debugLine="Sub CreateListItem(screenshot As B4XBitmap, filein";
 //BA.debugLineNum = 179;BA.debugLine="Try";
try { //BA.debugLineNum = 183;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 184;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 400dip, 80dip)";
_p.SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (80)));
 //BA.debugLineNum = 185;BA.debugLine="p.LoadLayout(\"cellitem\")";
_p.LoadLayout("cellitem",ba);
 //BA.debugLineNum = 186;BA.debugLine="ivScreenshot.SetBitmap(screenshot)";
_ivscreenshot.SetBitmap((javafx.scene.image.Image)(_screenshot.getObject()));
 //BA.debugLineNum = 187;BA.debugLine="Dim dayname As String";
_dayname = "";
 //BA.debugLineNum = 188;BA.debugLine="dayname = ConvertDayName(fileinfo)";
_dayname = _convertdayname(_fileinfo);
 //BA.debugLineNum = 189;BA.debugLine="If watched<>\"true\" Then";
if ((_watched).equals("true") == false) { 
 //BA.debugLineNum = 190;BA.debugLine="ivWatched.Visible = True";
_ivwatched.setVisible(__c.True);
 //BA.debugLineNum = 191;BA.debugLine="lblDate.Text = \"   \" & dayname & \" \" & ConvertD";
_lbldate.setText("   "+_dayname+" "+_convertdatetimeperiod(_fileinfo,_dayname));
 }else {
 //BA.debugLineNum = 193;BA.debugLine="ivWatched.Visible = False";
_ivwatched.setVisible(__c.False);
 //BA.debugLineNum = 194;BA.debugLine="lblDate.Text = \"   \" & dayname";
_lbldate.setText("   "+_dayname);
 };
 //BA.debugLineNum = 196;BA.debugLine="lblFileInfo.Text = \"   \" & ConvertFullDateTime(f";
_lblfileinfo.setText("   "+_convertfulldatetime(_fileinfo));
 //BA.debugLineNum = 197;BA.debugLine="lblDeviceInfo.Text = \"   \" & devicename";
_lbldeviceinfo.setText("   "+_devicename);
 //BA.debugLineNum = 198;BA.debugLine="ivWatched.SetBitmap(fx.LoadImage(File.DirAssets,";
_ivwatched.SetBitmap((javafx.scene.image.Image)(_fx.LoadImage(__c.File.getDirAssets(),"blink_clip_roll_blue_dot_icon.png").getObject()));
 //BA.debugLineNum = 199;BA.debugLine="Return p";
if (true) return _p;
 } 
       catch (Exception e20) {
			ba.setLastException(e20); //BA.debugLineNum = 201;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 //BA.debugLineNum = 202;BA.debugLine="cutils.ShowNotification(\"Catanaoan Blink XT2 Cam";
_cutils.ShowNotification("Catanaoan Blink XT2 Cameras v1.0","CreateListItem: "+BA.ObjectToString(__c.LastException(ba)),_cutils.ICON_ERROR);
 //BA.debugLineNum = 203;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Null));
 };
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public String  _frm_closerequest(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 429;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
 //BA.debugLineNum = 430;BA.debugLine="wvMedia.LoadUrl(\"\")";
_wvmedia.LoadUrl("");
 //BA.debugLineNum = 431;BA.debugLine="wvMedia.RemoveNodeFromParent";
_wvmedia.RemoveNodeFromParent();
 //BA.debugLineNum = 432;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
__c.File.Delete(__c.File.getDirApp(),"screenshot.jpg");
 //BA.debugLineNum = 433;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
__c.File.Delete(__c.File.getDirApp(),"media.mp4");
 //BA.debugLineNum = 434;BA.debugLine="End Sub";
return "";
}
public void  _getvideos(String _json,String _userregion) throws Exception{
ResumableSub_GetVideos rsub = new ResumableSub_GetVideos(this,_json,_userregion);
rsub.resume(ba, null);
}
public static class ResumableSub_GetVideos extends BA.ResumableSub {
public ResumableSub_GetVideos(cloyd.blink.frmactivity parent,String _json,String _userregion) {
this.parent = parent;
this._json = _json;
this._userregion = _userregion;
}
cloyd.blink.frmactivity parent;
String _json;
String _userregion;
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _media = null;
anywheresoftware.b4a.objects.collections.Map _colmedia = null;
String _thumbnail = "";
String _created_at = "";
String _device_name = "";
String _watched = "";
String _videoid = "";
String _medianame = "";
cloyd.blink.httpjob _j = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _image = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
Object _mytypes = null;
cloyd.blink.frmactivity._videoinfo _videos = null;
anywheresoftware.b4a.objects.collections.List _list1 = null;
int _i = 0;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _bmp = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.BA.IterableList group8;
int index8;
int groupLen8;
int step52;
int limit52;

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
 //BA.debugLineNum = 52;BA.debugLine="Try";
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
 //BA.debugLineNum = 53;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 54;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 55;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 59;BA.debugLine="Dim media As List = root.Get(\"media\")";
_media = new anywheresoftware.b4a.objects.collections.List();
_media = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("media"))));
 //BA.debugLineNum = 61;BA.debugLine="kvs.Initialize(File.DirApp, \"datastore\")";
parent._kvs._initialize /*String*/ (ba,parent.__c.File.getDirApp(),"datastore");
 //BA.debugLineNum = 63;BA.debugLine="B4XLoadingIndicator1.Show";
parent._b4xloadingindicator1._show /*String*/ ();
 //BA.debugLineNum = 64;BA.debugLine="For Each colmedia As Map In media";
if (true) break;

case 4:
//for
this.state = 25;
_colmedia = new anywheresoftware.b4a.objects.collections.Map();
group8 = _media;
index8 = 0;
groupLen8 = group8.getSize();
this.state = 49;
if (true) break;

case 49:
//C
this.state = 25;
if (index8 < groupLen8) {
this.state = 6;
_colmedia = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group8.Get(index8)));}
if (true) break;

case 50:
//C
this.state = 49;
index8++;
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 65;BA.debugLine="Dim thumbnail As String = colmedia.Get(\"thumbna";
_thumbnail = BA.ObjectToString(_colmedia.Get((Object)("thumbnail")));
 //BA.debugLineNum = 68;BA.debugLine="Dim created_at As String = colmedia.Get(\"create";
_created_at = BA.ObjectToString(_colmedia.Get((Object)("created_at")));
 //BA.debugLineNum = 73;BA.debugLine="Dim device_name As String = colmedia.Get(\"devic";
_device_name = BA.ObjectToString(_colmedia.Get((Object)("device_name")));
 //BA.debugLineNum = 75;BA.debugLine="Dim watched As String = colmedia.Get(\"watched\")";
_watched = BA.ObjectToString(_colmedia.Get((Object)("watched")));
 //BA.debugLineNum = 78;BA.debugLine="Dim VideoID As String = colmedia.Get(\"id\")";
_videoid = BA.ObjectToString(_colmedia.Get((Object)("id")));
 //BA.debugLineNum = 83;BA.debugLine="Dim medianame As String = colmedia.Get(\"media\")";
_medianame = BA.ObjectToString(_colmedia.Get((Object)("media")));
 //BA.debugLineNum = 89;BA.debugLine="If kvs.ContainsKey(VideoID) = False Then";
if (true) break;

case 7:
//if
this.state = 24;
if (parent._kvs._containskey /*boolean*/ (_videoid)==parent.__c.False) { 
this.state = 9;
}else {
this.state = 15;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 90;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
 //BA.debugLineNum = 91;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 92;BA.debugLine="j.Download(\"https://rest-\" & userRegion &\".imm";
_j._download /*String*/ ("https://rest-"+_userregion+".immedia-semi.com"+_thumbnail+".jpg");
 //BA.debugLineNum = 93;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("TOKEN_AUTH",parent._authtoken);
 //BA.debugLineNum = 94;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 51;
return;
case 51:
//C
this.state = 10;
_j = (cloyd.blink.httpjob) result[0];
;
 //BA.debugLineNum = 95;BA.debugLine="If j.Success Then";
if (true) break;

case 10:
//if
this.state = 13;
if (_j._success /*boolean*/ ) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 96;BA.debugLine="Dim image As B4XBitmap = j.GetBitmap";
_image = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_image = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (javafx.scene.image.Image)(_j._getbitmap /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ ().getObject()));
 //BA.debugLineNum = 98;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
 //BA.debugLineNum = 99;BA.debugLine="out.InitializeToBytesArray(0)";
_out.InitializeToBytesArray((int) (0));
 //BA.debugLineNum = 100;BA.debugLine="image.WriteToStream(out, 100, \"JPEG\")";
_image.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),"JPEG");
 //BA.debugLineNum = 101;BA.debugLine="kvs.Put(VideoID, CreateCustomType(medianame,c";
parent._kvs._put /*String*/ (_videoid,(Object)(parent._createcustomtype(_medianame,_created_at,_watched,_device_name,_videoid,_out.ToBytesArray())));
 //BA.debugLineNum = 102;BA.debugLine="out.Close";
_out.Close();
 if (true) break;

case 13:
//C
this.state = 24;
;
 //BA.debugLineNum = 104;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 106;BA.debugLine="Dim mytypes As Object = kvs.Get(VideoID)";
_mytypes = parent._kvs._get /*Object*/ (_videoid);
 //BA.debugLineNum = 107;BA.debugLine="Dim videos = mytypes As VideoInfo";
_videos = (cloyd.blink.frmactivity._videoinfo)(_mytypes);
 //BA.debugLineNum = 108;BA.debugLine="If (videos = Null) Or (watched <> videos.Watch";
if (true) break;

case 16:
//if
this.state = 23;
if ((_videos== null) || ((_watched).equals(_videos.Watched /*String*/ ) == false)) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 109;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
 //BA.debugLineNum = 110;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 111;BA.debugLine="j.Download(\"https://rest-\" & userRegion &\".im";
_j._download /*String*/ ("https://rest-"+_userregion+".immedia-semi.com"+_thumbnail+".jpg");
 //BA.debugLineNum = 112;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToke";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("TOKEN_AUTH",parent._authtoken);
 //BA.debugLineNum = 113;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 52;
return;
case 52:
//C
this.state = 19;
_j = (cloyd.blink.httpjob) result[0];
;
 //BA.debugLineNum = 114;BA.debugLine="If j.Success Then";
if (true) break;

case 19:
//if
this.state = 22;
if (_j._success /*boolean*/ ) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 115;BA.debugLine="Dim image As B4XBitmap = j.GetBitmap";
_image = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_image = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (javafx.scene.image.Image)(_j._getbitmap /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ ().getObject()));
 //BA.debugLineNum = 117;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
 //BA.debugLineNum = 118;BA.debugLine="out.InitializeToBytesArray(0)";
_out.InitializeToBytesArray((int) (0));
 //BA.debugLineNum = 119;BA.debugLine="image.WriteToStream(out, 100, \"JPEG\")";
_image.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),"JPEG");
 //BA.debugLineNum = 120;BA.debugLine="kvs.Put(VideoID, CreateCustomType(medianame,";
parent._kvs._put /*String*/ (_videoid,(Object)(parent._createcustomtype(_medianame,_created_at,_watched,_device_name,_videoid,_out.ToBytesArray())));
 //BA.debugLineNum = 121;BA.debugLine="out.Close";
_out.Close();
 if (true) break;

case 22:
//C
this.state = 23;
;
 //BA.debugLineNum = 123;BA.debugLine="j.Release";
_j._release /*String*/ ();
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
;
 //BA.debugLineNum = 128;BA.debugLine="Dim list1 As List = kvs.ListKeys";
_list1 = new anywheresoftware.b4a.objects.collections.List();
_list1 = parent._kvs._listkeys /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 129;BA.debugLine="For i =  0 To list1.Size-1";
if (true) break;

case 26:
//for
this.state = 41;
step52 = 1;
limit52 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
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
if (true) break;

case 28:
//C
this.state = 29;
 //BA.debugLineNum = 130;BA.debugLine="If i > 99 Then";
if (true) break;

case 29:
//if
this.state = 40;
if (_i>99) { 
this.state = 31;
}else {
this.state = 33;
}if (true) break;

case 31:
//C
this.state = 40;
 //BA.debugLineNum = 131;BA.debugLine="kvs.Remove(list1.Get(i))";
parent._kvs._remove /*String*/ (BA.ObjectToString(_list1.Get(_i)));
 if (true) break;

case 33:
//C
this.state = 34;
 //BA.debugLineNum = 133;BA.debugLine="Dim mytypes As Object = kvs.Get(list1.Get(i))";
_mytypes = parent._kvs._get /*Object*/ (BA.ObjectToString(_list1.Get(_i)));
 //BA.debugLineNum = 134;BA.debugLine="Dim videos = mytypes As VideoInfo";
_videos = (cloyd.blink.frmactivity._videoinfo)(_mytypes);
 //BA.debugLineNum = 136;BA.debugLine="Log(\"kvs.ListKeys \" & i & \" | \" & videos.Video";
parent.__c.Log("kvs.ListKeys "+BA.NumberToString(_i)+" | "+_videos.VideoID /*String*/ +" | "+_videos.Watched /*String*/ +" | "+_videos.DateCreated /*String*/ );
 //BA.debugLineNum = 138;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
 //BA.debugLineNum = 139;BA.debugLine="In.InitializeFromBytesArray(videos.ThumbnailBL";
_in.InitializeFromBytesArray(_videos.ThumbnailBLOB /*byte[]*/ ,(int) (0),_videos.ThumbnailBLOB /*byte[]*/ .length);
 //BA.debugLineNum = 140;BA.debugLine="Dim bmp As Image";
_bmp = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
 //BA.debugLineNum = 141;BA.debugLine="bmp.Initialize2(In)";
_bmp.Initialize2((java.io.InputStream)(_in.getObject()));
 //BA.debugLineNum = 143;BA.debugLine="Dim p As B4XView = CreateListItem(bmp,videos.D";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._createlistitem((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (javafx.scene.image.Image)(_bmp.getObject())),_videos.DateCreated /*String*/ ,_videos.DeviceName /*String*/ ,_watched);
 //BA.debugLineNum = 144;BA.debugLine="clvActivity.Add(p,\"https://rest-\" & userRegion";
parent._clvactivity._add(_p,(Object)("https://rest-"+_userregion+".immedia-semi.com"+_videos.ThumbnailPath /*String*/ +"|"+_videos.DeviceName /*String*/ +" "+parent._convertfulldatetime(_videos.DateCreated /*String*/ )));
 //BA.debugLineNum = 145;BA.debugLine="If videos.Watched <> \"true\" Then";
if (true) break;

case 34:
//if
this.state = 39;
if ((_videos.Watched /*String*/ ).equals("true") == false) { 
this.state = 36;
}else {
this.state = 38;
}if (true) break;

case 36:
//C
this.state = 39;
 //BA.debugLineNum = 146;BA.debugLine="ivWatched.Visible = True";
parent._ivwatched.setVisible(parent.__c.True);
 if (true) break;

case 38:
//C
this.state = 39;
 //BA.debugLineNum = 148;BA.debugLine="ivWatched.Visible = False";
parent._ivwatched.setVisible(parent.__c.False);
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
;
 //BA.debugLineNum = 152;BA.debugLine="B4XLoadingIndicator1.Hide";
parent._b4xloadingindicator1._hide /*String*/ ();
 //BA.debugLineNum = 153;BA.debugLine="If list1.Size > 0 Then";
if (true) break;

case 42:
//if
this.state = 45;
if (_list1.getSize()>0) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 //BA.debugLineNum = 154;BA.debugLine="clvActivity.JumpToItem(0)";
parent._clvactivity._jumptoitem((int) (0));
 //BA.debugLineNum = 155;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,this,(int) (100));
this.state = 55;
return;
case 55:
//C
this.state = 45;
;
 //BA.debugLineNum = 156;BA.debugLine="clvActivity_ItemClick(0,\"\") '\"https://rest-\" &";
parent._clvactivity_itemclick((int) (0),(Object)(""));
 //BA.debugLineNum = 157;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,this,(int) (100));
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
 if (true) break;

case 47:
//C
this.state = 48;
this.catchState = 0;
 //BA.debugLineNum = 160;BA.debugLine="B4XLoadingIndicator1.Hide";
parent._b4xloadingindicator1._hide /*String*/ ();
 //BA.debugLineNum = 161;BA.debugLine="Log(LastException)";
parent.__c.Log(BA.ObjectToString(parent.__c.LastException(ba)));
 //BA.debugLineNum = 162;BA.debugLine="cutils.ShowNotification(\"Catanaoan Blink XT2 Cam";
parent._cutils.ShowNotification("Catanaoan Blink XT2 Cameras v1.0","GetVideos: "+BA.ObjectToString(parent.__c.LastException(ba)),parent._cutils.ICON_ERROR);
 if (true) break;
if (true) break;

case 48:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
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
public void  _jobdone(cloyd.blink.httpjob _j) throws Exception{
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4j.agraham.reflection.Reflection _obj = null;
 //BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize(Parent As Form)";
 //BA.debugLineNum = 25;BA.debugLine="frm.Initialize(\"frm\", 600dip, 600dip)";
_frm.Initialize(ba,"frm",__c.DipToCurrent((int) (600)),__c.DipToCurrent((int) (600)));
 //BA.debugLineNum = 26;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 //BA.debugLineNum = 27;BA.debugLine="frm.RootPane.LoadLayout(\"activity\")";
_frm.getRootPane().LoadLayout(ba,"activity");
 //BA.debugLineNum = 28;BA.debugLine="frm.Icon = fx.LoadImage(File.DirAssets, \"home.png";
_frm.setIcon((javafx.scene.image.Image)(_fx.LoadImage(__c.File.getDirAssets(),"home.png").getObject()));
 //BA.debugLineNum = 29;BA.debugLine="frm.Title = \"Catanaoan Blink XT2 Cameras Activity";
_frm.setTitle("Catanaoan Blink XT2 Cameras Activity Viewer");
 //BA.debugLineNum = 30;BA.debugLine="frm.SetOwner(Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 31;BA.debugLine="frm.WindowWidth = CheckMonitor.MaxX - CheckMonito";
_frm.setWindowWidth(_checkmonitor().getMaxX()-_checkmonitor().getMinX());
 //BA.debugLineNum = 32;BA.debugLine="frm.WindowLeft = CheckMonitor.MinX";
_frm.setWindowLeft(_checkmonitor().getMinX());
 //BA.debugLineNum = 33;BA.debugLine="frm.WindowHeight = CheckMonitor.MaxY - CheckMonit";
_frm.setWindowHeight(_checkmonitor().getMaxY()-_checkmonitor().getMinY());
 //BA.debugLineNum = 34;BA.debugLine="frm.WindowTop = CheckMonitor.MinY";
_frm.setWindowTop(_checkmonitor().getMinY());
 //BA.debugLineNum = 35;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 36;BA.debugLine="Obj.Target = frm.RootPane";
_obj.Target = (Object)(_frm.getRootPane().getObject());
 //BA.debugLineNum = 37;BA.debugLine="Obj.AddEventHandler(\"RootPaneKeyEvent\", \"javafx.s";
_obj.AddEventHandler(ba,"RootPaneKeyEvent","javafx.scene.input.KeyEvent.ANY");
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public long  _parseutcstring(String _utc) throws Exception{
String _df = "";
long _res = 0L;
 //BA.debugLineNum = 306;BA.debugLine="Sub ParseUTCstring(utc As String) As Long";
 //BA.debugLineNum = 307;BA.debugLine="Dim df As String = DateTime.DateFormat";
_df = __c.DateTime.getDateFormat();
 //BA.debugLineNum = 308;BA.debugLine="Dim res As Long";
_res = 0L;
 //BA.debugLineNum = 309;BA.debugLine="If utc.CharAt(10) = \"T\" Then";
if (_utc.charAt((int) (10))==BA.ObjectToChar("T")) { 
 //BA.debugLineNum = 311;BA.debugLine="If utc.CharAt(19) = \".\" Then utc = utc.SubString";
if (_utc.charAt((int) (19))==BA.ObjectToChar(".")) { 
_utc = _utc.substring((int) (0),(int) (19))+"+0000";};
 //BA.debugLineNum = 312;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd'T'HH:mm:ssZ\"";
__c.DateTime.setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
 }else {
 //BA.debugLineNum = 315;BA.debugLine="DateTime.DateFormat = \"EEE MMM dd HH:mm:ss Z yyy";
__c.DateTime.setDateFormat("EEE MMM dd HH:mm:ss Z yyyy");
 };
 //BA.debugLineNum = 317;BA.debugLine="Try";
try { //BA.debugLineNum = 318;BA.debugLine="res = DateTime.DateParse(utc)";
_res = __c.DateTime.DateParse(_utc);
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 320;BA.debugLine="res = 0";
_res = (long) (0);
 };
 //BA.debugLineNum = 322;BA.debugLine="DateTime.DateFormat = df";
__c.DateTime.setDateFormat(_df);
 //BA.debugLineNum = 323;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return 0L;
}
public String  _rootpanekeyevent_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
anywheresoftware.b4j.agraham.reflection.Reflection _ke = null;
String _scode = "";
String _stype = "";
int _result = 0;
 //BA.debugLineNum = 436;BA.debugLine="Private Sub RootPaneKeyEvent_Event(e As Event)";
 //BA.debugLineNum = 437;BA.debugLine="Dim KE As Reflector";
_ke = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 438;BA.debugLine="Dim sCode As String";
_scode = "";
 //BA.debugLineNum = 439;BA.debugLine="Dim sType As String 'ignore";
_stype = "";
 //BA.debugLineNum = 440;BA.debugLine="Dim result As Int 'ignore";
_result = 0;
 //BA.debugLineNum = 441;BA.debugLine="KE.Target = e	 ' e is a KeyEvent instance";
_ke.Target = (Object)(_e.getObject());
 //BA.debugLineNum = 442;BA.debugLine="sCode = KE.RunMethod(\"getCode\")";
_scode = BA.ObjectToString(_ke.RunMethod("getCode"));
 //BA.debugLineNum = 443;BA.debugLine="sType = KE.RunMethod(\"getEventType\")";
_stype = BA.ObjectToString(_ke.RunMethod("getEventType"));
 //BA.debugLineNum = 444;BA.debugLine="If sCode=\"ESCAPE\" Then";
if ((_scode).equals("ESCAPE")) { 
 //BA.debugLineNum = 445;BA.debugLine="wvMedia.LoadUrl(\"\")";
_wvmedia.LoadUrl("");
 //BA.debugLineNum = 446;BA.debugLine="wvMedia.RemoveNodeFromParent";
_wvmedia.RemoveNodeFromParent();
 //BA.debugLineNum = 447;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
__c.File.Delete(__c.File.getDirApp(),"screenshot.jpg");
 //BA.debugLineNum = 448;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
__c.File.Delete(__c.File.getDirApp(),"media.mp4");
 //BA.debugLineNum = 449;BA.debugLine="frm.Close";
_frm.Close();
 };
 //BA.debugLineNum = 451;BA.debugLine="End Sub";
return "";
}
public String  _show(String _json,String _userregion) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Public Sub Show(json As String, userRegion As Stri";
 //BA.debugLineNum = 42;BA.debugLine="jsonMain = json";
_jsonmain = _json;
 //BA.debugLineNum = 43;BA.debugLine="userRegionMain = userRegion";
_userregionmain = _userregion;
 //BA.debugLineNum = 44;BA.debugLine="B4XLoadingIndicator1.Show";
_b4xloadingindicator1._show /*String*/ ();
 //BA.debugLineNum = 45;BA.debugLine="GetVideos(json, userRegion)";
_getvideos(_json,_userregion);
 //BA.debugLineNum = 46;BA.debugLine="B4XLoadingIndicator1.Hide";
_b4xloadingindicator1._hide /*String*/ ();
 //BA.debugLineNum = 47;BA.debugLine="frm.ShowAndWait";
_frm.ShowAndWait();
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public void  _showvideo(String _link,String _timestamp) throws Exception{
ResumableSub_ShowVideo rsub = new ResumableSub_ShowVideo(this,_link,_timestamp);
rsub.resume(ba, null);
}
public static class ResumableSub_ShowVideo extends BA.ResumableSub {
public ResumableSub_ShowVideo(cloyd.blink.frmactivity parent,String _link,String _timestamp) {
this.parent = parent;
this._link = _link;
this._timestamp = _timestamp;
}
cloyd.blink.frmactivity parent;
String _link;
String _timestamp;
cloyd.blink.httpjob _j = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _list1 = null;
int _i = 0;
Object _mytypes = null;
cloyd.blink.frmactivity._videoinfo _videos = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4j.objects.ImageViewWrapper _contentlabel = null;
int step25;
int limit25;

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
 //BA.debugLineNum = 370;BA.debugLine="Try";
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
 //BA.debugLineNum = 371;BA.debugLine="Log (\"Video URL: \" & Link)";
parent.__c.Log("Video URL: "+_link);
 //BA.debugLineNum = 372;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
 //BA.debugLineNum = 373;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 374;BA.debugLine="j.Download(Link)";
_j._download /*String*/ (_link);
 //BA.debugLineNum = 375;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("TOKEN_AUTH",parent._authtoken);
 //BA.debugLineNum = 376;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 33;
return;
case 33:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[0];
;
 //BA.debugLineNum = 377;BA.debugLine="B4XLoadingIndicator1.Hide";
parent._b4xloadingindicator1._hide /*String*/ ();
 //BA.debugLineNum = 378;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 380;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File.";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = parent.__c.File.OpenOutput(parent.__c.File.getDirApp(),"media.mp4",parent.__c.False);
 //BA.debugLineNum = 381;BA.debugLine="File.Copy2(j.GetInputStream, out)";
parent.__c.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ ().getObject()),(java.io.OutputStream)(_out.getObject()));
 //BA.debugLineNum = 382;BA.debugLine="out.Close '<------ very important";
_out.Close();
 //BA.debugLineNum = 384;BA.debugLine="lblTimestamp.Text= timestamp";
parent._lbltimestamp.setText(_timestamp);
 //BA.debugLineNum = 385;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 386;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 387;BA.debugLine="sb.Append(\"<video width='100%' height='100%' co";
_sb.Append("<video width='100%' height='100%' controls autoplay>");
 //BA.debugLineNum = 388;BA.debugLine="sb.Append(\"<source src='\" & File.GetUri(File.Di";
_sb.Append("<source src='"+parent.__c.File.GetUri(parent.__c.File.getDirApp(),"media.mp4")+"' Type='video/mp4'/>");
 //BA.debugLineNum = 389;BA.debugLine="sb.Append(\"</video>\")";
_sb.Append("</video>");
 //BA.debugLineNum = 390;BA.debugLine="wvMedia.LoadHtml(sb.ToString)";
parent._wvmedia.LoadHtml(_sb.ToString());
 if (true) break;

case 8:
//C
this.state = 9;
 if (true) break;
;
 //BA.debugLineNum = 394;BA.debugLine="If j.ErrorMessage.Contains(\"Media not found\") Th";

case 9:
//if
this.state = 20;
if (_j._errormessage /*String*/ .contains("Media not found")) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 395;BA.debugLine="clvActivity.RemoveAt(previousSelectedIndex)";
parent._clvactivity._removeat(parent._previousselectedindex);
 //BA.debugLineNum = 396;BA.debugLine="Dim list1 As List = kvs.ListKeys";
_list1 = new anywheresoftware.b4a.objects.collections.List();
_list1 = parent._kvs._listkeys /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 397;BA.debugLine="For i =  0 To list1.Size-1";
if (true) break;

case 12:
//for
this.state = 19;
step25 = 1;
limit25 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
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
if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 398;BA.debugLine="Dim mytypes As Object = kvs.Get(list1.Get(i))";
_mytypes = parent._kvs._get /*Object*/ (BA.ObjectToString(_list1.Get(_i)));
 //BA.debugLineNum = 399;BA.debugLine="Dim videos = mytypes As VideoInfo";
_videos = (cloyd.blink.frmactivity._videoinfo)(_mytypes);
 //BA.debugLineNum = 400;BA.debugLine="If Link.Contains(videos.VideoID) Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_link.contains(_videos.VideoID /*String*/ )) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 401;BA.debugLine="kvs.Remove(list1.Get(i))";
parent._kvs._remove /*String*/ (BA.ObjectToString(_list1.Get(_i)));
 //BA.debugLineNum = 402;BA.debugLine="clvActivity.Clear";
parent._clvactivity._clear();
 //BA.debugLineNum = 403;BA.debugLine="cutils.ShowNotification(\"Catanaoan Blink XT2";
parent._cutils.ShowNotification("Catanaoan Blink XT2 Cameras v1.0","Media not found. Removed from the list.",parent._cutils.ICON_INFORMATION);
 //BA.debugLineNum = 404;BA.debugLine="GetVideos(jsonMain,userRegionMain)";
parent._getvideos(parent._jsonmain,parent._userregionmain);
 //BA.debugLineNum = 405;BA.debugLine="Exit";
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
;
 if (true) break;

case 20:
//C
this.state = 23;
;
 //BA.debugLineNum = 409;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 0;
 //BA.debugLineNum = 411;BA.debugLine="Log(LastException)";
parent.__c.Log(BA.ObjectToString(parent.__c.LastException(ba)));
 //BA.debugLineNum = 412;BA.debugLine="cutils.ShowNotification(\"Catanaoan Blink XT2 Cam";
parent._cutils.ShowNotification("Catanaoan Blink XT2 Cameras v1.0","ShowVideo: "+BA.ObjectToString(parent.__c.LastException(ba)),parent._cutils.ICON_ERROR);
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 415;BA.debugLine="Try";

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
 //BA.debugLineNum = 416;BA.debugLine="Sleep(2000)";
parent.__c.Sleep(ba,this,(int) (2000));
this.state = 36;
return;
case 36:
//C
this.state = 26;
;
 //BA.debugLineNum = 417;BA.debugLine="Dim p As B4XView = clvActivity.GetPanel(previous";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._clvactivity._getpanel(parent._previousselectedindex);
 //BA.debugLineNum = 418;BA.debugLine="If p.NumberOfViews > 0 Then";
if (true) break;

case 26:
//if
this.state = 29;
if (_p.getNumberOfViews()>0) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 //BA.debugLineNum = 420;BA.debugLine="Dim ContentLabel As ImageView = p.GetView(0).Ge";
_contentlabel = new anywheresoftware.b4j.objects.ImageViewWrapper();
_contentlabel = (anywheresoftware.b4j.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper(), (javafx.scene.image.ImageView)(_p.GetView((int) (0)).GetView((int) (1)).getObject()));
 //BA.debugLineNum = 421;BA.debugLine="ContentLabel.Visible = False";
_contentlabel.setVisible(parent.__c.False);
 if (true) break;

case 29:
//C
this.state = 32;
;
 if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 0;
 //BA.debugLineNum = 424;BA.debugLine="Log(LastException)";
parent.__c.Log(BA.ObjectToString(parent.__c.LastException(ba)));
 //BA.debugLineNum = 425;BA.debugLine="cutils.ShowNotification(\"Catanaoan Blink XT2 Cam";
parent._cutils.ShowNotification("Catanaoan Blink XT2 Cameras v1.0","ShowVideo 2nd Try-Catch: "+BA.ObjectToString(parent.__c.LastException(ba)),parent._cutils.ICON_ERROR);
 if (true) break;
if (true) break;

case 32:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
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
public String  _updateitemcolor(int _index) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _backpanel = null;
 //BA.debugLineNum = 484;BA.debugLine="Sub UpdateItemColor (Index As Int)";
 //BA.debugLineNum = 485;BA.debugLine="Try";
try { //BA.debugLineNum = 486;BA.debugLine="If previousSelectedIndex <> Index Then";
if (_previousselectedindex!=_index) { 
 //BA.debugLineNum = 487;BA.debugLine="Dim p As B4XView = clvActivity.GetPanel(previou";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _clvactivity._getpanel(_previousselectedindex);
 //BA.debugLineNum = 488;BA.debugLine="If p.NumberOfViews > 0 Then";
if (_p.getNumberOfViews()>0) { 
 //BA.debugLineNum = 490;BA.debugLine="Dim backPanel As Pane = p.getview(0)";
_backpanel = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_backpanel = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_p.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 491;BA.debugLine="CSSUtils.SetBackgroundColor(backPanel,fx.Color";
_cssutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_backpanel.getObject())),(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.ARGB((int) (255),(int) (217),(int) (215),(int) (222)))));
 //BA.debugLineNum = 492;BA.debugLine="CSSUtils.SetBorder(backPanel,1,fx.Colors.Black";
_cssutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_backpanel.getObject())),1,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.Black)),1);
 };
 };
 //BA.debugLineNum = 496;BA.debugLine="Dim p As B4XView = clvActivity.GetPanel(Index)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _clvactivity._getpanel(_index);
 //BA.debugLineNum = 497;BA.debugLine="If p.NumberOfViews > 0 Then";
if (_p.getNumberOfViews()>0) { 
 //BA.debugLineNum = 499;BA.debugLine="Dim backPanel As Pane = p.getview(0)";
_backpanel = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_backpanel = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_p.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 500;BA.debugLine="CSSUtils.SetBackgroundColor(backPanel, fx.Color";
_cssutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_backpanel.getObject())),(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.White)));
 //BA.debugLineNum = 501;BA.debugLine="CSSUtils.SetBorder(backPanel,2,fx.Colors.Red,1)";
_cssutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_backpanel.getObject())),2,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.Red)),1);
 };
 //BA.debugLineNum = 504;BA.debugLine="previousSelectedIndex = Index";
_previousselectedindex = _index;
 } 
       catch (Exception e18) {
			ba.setLastException(e18); //BA.debugLineNum = 506;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 //BA.debugLineNum = 507;BA.debugLine="cutils.ShowNotification(\"Catanaoan Blink XT2 Cam";
_cutils.ShowNotification("Catanaoan Blink XT2 Cameras v1.0","UpdateItemColor: "+BA.ObjectToString(__c.LastException(ba)),_cutils.ICON_ERROR);
 };
 //BA.debugLineNum = 509;BA.debugLine="End Sub";
return "";
}
public String  _wvmedia_pagefinished(String _url) throws Exception{
 //BA.debugLineNum = 480;BA.debugLine="Sub wvMedia_PageFinished (Url As String)";
 //BA.debugLineNum = 482;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "SHOW"))
	return _show((String) args[0], (String) args[1]);
return BA.SubDelegator.SubNotFound;
}
}
