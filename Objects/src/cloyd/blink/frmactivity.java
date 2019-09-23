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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _ivscreenshot = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblfileinfo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbldeviceinfo = null;
public b4j.example.customlistview _clvactivity = null;
public String _authtoken = "";
public anywheresoftware.b4j.objects.WebViewWrapper _wvmedia = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbldate = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltimestamp = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public cloyd.blink.main _main = null;
public cloyd.blink.httputils2service _httputils2service = null;
public anywheresoftware.b4j.objects.JFX.ScreenWrapper  _checkmonitor() throws Exception{
anywheresoftware.b4a.objects.collections.List _slist = null;
anywheresoftware.b4j.objects.JFX.ScreenWrapper _s = null;
 //BA.debugLineNum = 268;BA.debugLine="Sub CheckMonitor() As Screen";
 //BA.debugLineNum = 269;BA.debugLine="Try";
try { //BA.debugLineNum = 270;BA.debugLine="If fx.Screens.Size= 1 Then";
if (_fx.getScreens().getSize()==1) { 
 //BA.debugLineNum = 271;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 272;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 274;BA.debugLine="Return S";
if (true) return _s;
 }else if(_fx.getScreens().getSize()>1) { 
 //BA.debugLineNum = 276;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 277;BA.debugLine="Dim S As Screen = SList.Get(2)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (2))));
 //BA.debugLineNum = 279;BA.debugLine="Return S";
if (true) return _s;
 }else {
 //BA.debugLineNum = 281;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 282;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 284;BA.debugLine="Return S";
if (true) return _s;
 };
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 287;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 288;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 290;BA.debugLine="Return S";
if (true) return _s;
 };
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 3;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 4;BA.debugLine="Public jsonMain As String";
_jsonmain = "";
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 6;BA.debugLine="Private ivScreenshot As B4XView";
_ivscreenshot = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private lblFileInfo As B4XView";
_lblfileinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private lblDeviceInfo As B4XView";
_lbldeviceinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private clvActivity As CustomListView";
_clvactivity = new b4j.example.customlistview();
 //BA.debugLineNum = 10;BA.debugLine="Public authToken As String";
_authtoken = "";
 //BA.debugLineNum = 11;BA.debugLine="Private wvMedia As WebView";
_wvmedia = new anywheresoftware.b4j.objects.WebViewWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private lblDate As B4XView";
_lbldate = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private lblTimestamp As Label";
_lbltimestamp = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public String  _clvactivity_itemclick(int _index,Object _value) throws Exception{
String _video = "";
String _videourl = "";
String _videotimestamp = "";
 //BA.debugLineNum = 199;BA.debugLine="Sub clvActivity_ItemClick (Index As Int, Value As";
 //BA.debugLineNum = 200;BA.debugLine="Try";
try { //BA.debugLineNum = 201;BA.debugLine="wvMedia.LoadUrl(\"\")";
_wvmedia.LoadUrl("");
 //BA.debugLineNum = 202;BA.debugLine="Dim video As String";
_video = "";
 //BA.debugLineNum = 203;BA.debugLine="video = clvActivity.GetValue(Index)";
_video = BA.ObjectToString(_clvactivity._getvalue(_index));
 //BA.debugLineNum = 204;BA.debugLine="Dim videoURL As String = Regex.Split(\"\\|\",video)";
_videourl = __c.Regex.Split("\\|",_video)[(int) (0)];
 //BA.debugLineNum = 205;BA.debugLine="Dim videoTimestamp As String = Regex.Split(\"\\|\",";
_videotimestamp = __c.Regex.Split("\\|",_video)[(int) (1)];
 //BA.debugLineNum = 206;BA.debugLine="ShowVideo(videoURL,videoTimestamp)";
_showvideo(_videourl,_videotimestamp);
 } 
       catch (Exception e9) {
			ba.setLastException(e9); //BA.debugLineNum = 208;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 //BA.debugLineNum = 209;BA.debugLine="fx.Msgbox2(frm,LastException,\"clvActivity ItemCl";
_fx.Msgbox2(_frm,BA.ObjectToString(__c.LastException(ba)),"clvActivity ItemClick Exception","OK","","",_fx.MSGBOX_ERROR);
 };
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return "";
}
public String  _convertdatetime(String _inputtime) throws Exception{
long _ticks = 0L;
long _lngticks = 0L;
b4j.example.dateutils._period _p = null;
 //BA.debugLineNum = 121;BA.debugLine="Sub ConvertDateTime(inputTime As String) As String";
 //BA.debugLineNum = 123;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = _parseutcstring(_inputtime.replace("+00:00","+0000"));
 //BA.debugLineNum = 124;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
__c.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a");
 //BA.debugLineNum = 125;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
 //BA.debugLineNum = 126;BA.debugLine="Dim p As Period = DateUtils.PeriodBetween(lngTick";
_p = _dateutils._periodbetween(_lngticks,__c.DateTime.getNow());
 //BA.debugLineNum = 128;BA.debugLine="If p.Days = 0 Then";
if (_p.Days==0) { 
 //BA.debugLineNum = 129;BA.debugLine="If p.Hours = 0 Then";
if (_p.Hours==0) { 
 //BA.debugLineNum = 130;BA.debugLine="If p.Minutes = 0 Then";
if (_p.Minutes==0) { 
 //BA.debugLineNum = 131;BA.debugLine="Return p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Seconds)+"s ago";
 }else {
 //BA.debugLineNum = 133;BA.debugLine="Return p.Minutes & \"m \" & p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 };
 }else {
 //BA.debugLineNum = 136;BA.debugLine="Return p.Hours & \"h \" & p.Minutes & \"m \" & p.Se";
if (true) return BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 };
 }else if(_p.Hours==0) { 
 //BA.debugLineNum = 139;BA.debugLine="If p.Minutes = 0 Then";
if (_p.Minutes==0) { 
 //BA.debugLineNum = 140;BA.debugLine="Return p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Seconds)+"s ago";
 }else {
 //BA.debugLineNum = 142;BA.debugLine="Return p.Minutes & \"m \" & p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 };
 }else if(_p.Minutes==0) { 
 //BA.debugLineNum = 145;BA.debugLine="Return p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Seconds)+"s ago";
 }else {
 //BA.debugLineNum = 147;BA.debugLine="Return p.Days & \"d \" & p.Hours & \"h \" & p.Minute";
if (true) return BA.NumberToString(_p.Days)+"d "+BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 };
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return "";
}
public String  _convertfulldatetime(String _inputtime) throws Exception{
long _ticks = 0L;
long _lngticks = 0L;
 //BA.debugLineNum = 151;BA.debugLine="Sub ConvertFullDateTime(inputTime As String) As St";
 //BA.debugLineNum = 153;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = _parseutcstring(_inputtime.replace("+00:00","+0000"));
 //BA.debugLineNum = 154;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
__c.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a");
 //BA.debugLineNum = 155;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
 //BA.debugLineNum = 158;BA.debugLine="Return DateTime.Date(lngTicks)";
if (true) return __c.DateTime.Date(_lngticks);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlistitem(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _screenshot,String _fileinfo,String _devicename) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
 //BA.debugLineNum = 100;BA.debugLine="Sub CreateListItem(screenshot As B4XBitmap, filein";
 //BA.debugLineNum = 101;BA.debugLine="Try";
try { //BA.debugLineNum = 105;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 106;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 400dip, 80dip)";
_p.SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (80)));
 //BA.debugLineNum = 107;BA.debugLine="p.LoadLayout(\"cellitem\")";
_p.LoadLayout("cellitem",ba);
 //BA.debugLineNum = 108;BA.debugLine="ivScreenshot.SetBitmap(screenshot)";
_ivscreenshot.SetBitmap((javafx.scene.image.Image)(_screenshot.getObject()));
 //BA.debugLineNum = 109;BA.debugLine="lblFileInfo.Text = \"   \" & ConvertDateTime(filei";
_lblfileinfo.setText("   "+_convertdatetime(_fileinfo));
 //BA.debugLineNum = 110;BA.debugLine="lblDeviceInfo.Text = \"   \" & devicename";
_lbldeviceinfo.setText("   "+_devicename);
 //BA.debugLineNum = 111;BA.debugLine="lblDate.Text = \"   \" & ConvertFullDateTime(filei";
_lbldate.setText("   "+_convertfulldatetime(_fileinfo));
 //BA.debugLineNum = 112;BA.debugLine="Return p";
if (true) return _p;
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 114;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 //BA.debugLineNum = 115;BA.debugLine="fx.Msgbox2(frm,LastException,\"CreateListItem Exc";
_fx.Msgbox2(_frm,BA.ObjectToString(__c.LastException(ba)),"CreateListItem Exception","OK","","",_fx.MSGBOX_ERROR);
 //BA.debugLineNum = 116;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Null));
 };
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public String  _frm_closerequest(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
 //BA.debugLineNum = 245;BA.debugLine="wvMedia.LoadUrl(\"\")";
_wvmedia.LoadUrl("");
 //BA.debugLineNum = 246;BA.debugLine="wvMedia.RemoveNodeFromParent";
_wvmedia.RemoveNodeFromParent();
 //BA.debugLineNum = 247;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
__c.File.Delete(__c.File.getDirApp(),"screenshot.jpg");
 //BA.debugLineNum = 248;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
__c.File.Delete(__c.File.getDirApp(),"media.mp4");
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
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
String _medianame = "";
cloyd.blink.httpjob _j = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.BA.IterableList group6;
int index6;
int groupLen6;

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
 //BA.debugLineNum = 41;BA.debugLine="Try";
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
 //BA.debugLineNum = 42;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 43;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
 //BA.debugLineNum = 44;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 48;BA.debugLine="Dim media As List = root.Get(\"media\")";
_media = new anywheresoftware.b4a.objects.collections.List();
_media.setObject((java.util.List)(_root.Get((Object)("media"))));
 //BA.debugLineNum = 49;BA.debugLine="For Each colmedia As Map In media";
if (true) break;

case 4:
//for
this.state = 17;
_colmedia = new anywheresoftware.b4a.objects.collections.Map();
group6 = _media;
index6 = 0;
groupLen6 = group6.getSize();
this.state = 21;
if (true) break;

case 21:
//C
this.state = 17;
if (index6 < groupLen6) {
this.state = 6;
_colmedia.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group6.Get(index6)));}
if (true) break;

case 22:
//C
this.state = 21;
index6++;
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 50;BA.debugLine="Dim thumbnail As String = colmedia.Get(\"thumbna";
_thumbnail = BA.ObjectToString(_colmedia.Get((Object)("thumbnail")));
 //BA.debugLineNum = 53;BA.debugLine="Dim created_at As String = colmedia.Get(\"create";
_created_at = BA.ObjectToString(_colmedia.Get((Object)("created_at")));
 //BA.debugLineNum = 58;BA.debugLine="Dim device_name As String = colmedia.Get(\"devic";
_device_name = BA.ObjectToString(_colmedia.Get((Object)("device_name")));
 //BA.debugLineNum = 68;BA.debugLine="Dim medianame As String = colmedia.Get(\"media\")";
_medianame = BA.ObjectToString(_colmedia.Get((Object)("media")));
 //BA.debugLineNum = 69;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
 //BA.debugLineNum = 70;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 71;BA.debugLine="j.Download(\"https://rest-\" & userRegion &\".imme";
_j._download /*String*/ ("https://rest-"+_userregion+".immedia-semi.com"+_thumbnail+".jpg");
 //BA.debugLineNum = 72;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("TOKEN_AUTH",parent._authtoken);
 //BA.debugLineNum = 73;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 23;
return;
case 23:
//C
this.state = 7;
_j = (cloyd.blink.httpjob) result[0];
;
 //BA.debugLineNum = 74;BA.debugLine="If j.Success Then";
if (true) break;

case 7:
//if
this.state = 16;
if (_j._success /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 15;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 77;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = parent.__c.File.OpenOutput(parent.__c.File.getDirApp(),"screenshot.jpg",parent.__c.False);
 //BA.debugLineNum = 78;BA.debugLine="File.Copy2(j.GetInputStream, out)";
parent.__c.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ ().getObject()),(java.io.OutputStream)(_out.getObject()));
 //BA.debugLineNum = 79;BA.debugLine="out.Close '<------ very important";
_out.Close();
 //BA.debugLineNum = 83;BA.debugLine="Dim p As B4XView = CreateListItem(j.GetBitmap,";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._createlistitem((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (javafx.scene.image.Image)(_j._getbitmap /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ ().getObject())),_created_at,_device_name);
 //BA.debugLineNum = 84;BA.debugLine="clvActivity.Add(p,\"https://rest-\" & userRegion";
parent._clvactivity._add(_p,(Object)("https://rest-"+_userregion+".immedia-semi.com"+_medianame+"|"+_device_name+" "+parent._convertfulldatetime(_created_at)));
 //BA.debugLineNum = 85;BA.debugLine="If clvActivity.Size = 1 Then";
if (true) break;

case 10:
//if
this.state = 13;
if (parent._clvactivity._getsize()==1) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 86;BA.debugLine="ShowVideo(\"https://rest-\" & userRegion &\".imm";
parent._showvideo("https://rest-"+_userregion+".immedia-semi.com"+_medianame,_device_name+" "+parent._convertfulldatetime(_created_at));
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
 //BA.debugLineNum = 91;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;
if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
 //BA.debugLineNum = 95;BA.debugLine="Log(LastException)";
parent.__c.Log(BA.ObjectToString(parent.__c.LastException(ba)));
 //BA.debugLineNum = 96;BA.debugLine="fx.Msgbox2(frm,LastException,\"GetVideos Exceptio";
parent._fx.Msgbox2(parent._frm,BA.ObjectToString(parent.__c.LastException(ba)),"GetVideos Exception","OK","","",parent._fx.MSGBOX_ERROR);
 if (true) break;
if (true) break;

case 20:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize(Parent As Form)";
 //BA.debugLineNum = 18;BA.debugLine="frm.Initialize(\"frm\", 600dip, 600dip)";
_frm.Initialize(ba,"frm",__c.DipToCurrent((int) (600)),__c.DipToCurrent((int) (600)));
 //BA.debugLineNum = 19;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 //BA.debugLineNum = 20;BA.debugLine="frm.RootPane.LoadLayout(\"activity\")";
_frm.getRootPane().LoadLayout(ba,"activity");
 //BA.debugLineNum = 21;BA.debugLine="frm.Icon = fx.LoadImage(File.DirAssets, \"home.png";
_frm.setIcon((javafx.scene.image.Image)(_fx.LoadImage(__c.File.getDirAssets(),"home.png").getObject()));
 //BA.debugLineNum = 22;BA.debugLine="frm.Title = \"Catanaoan Blink XT2 Cameras Activity";
_frm.setTitle("Catanaoan Blink XT2 Cameras Activity Viewer");
 //BA.debugLineNum = 23;BA.debugLine="frm.SetOwner(Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 24;BA.debugLine="frm.WindowWidth = CheckMonitor.MaxX - CheckMonito";
_frm.setWindowWidth(_checkmonitor().getMaxX()-_checkmonitor().getMinX());
 //BA.debugLineNum = 25;BA.debugLine="frm.WindowLeft = CheckMonitor.MinX";
_frm.setWindowLeft(_checkmonitor().getMinX());
 //BA.debugLineNum = 26;BA.debugLine="frm.WindowHeight = CheckMonitor.MaxY - CheckMonit";
_frm.setWindowHeight(_checkmonitor().getMaxY()-_checkmonitor().getMinY());
 //BA.debugLineNum = 27;BA.debugLine="frm.WindowTop = CheckMonitor.MinY";
_frm.setWindowTop(_checkmonitor().getMinY());
 //BA.debugLineNum = 28;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 29;BA.debugLine="Obj.Target = frm.RootPane";
_obj.Target = (Object)(_frm.getRootPane().getObject());
 //BA.debugLineNum = 30;BA.debugLine="Obj.AddEventHandler(\"RootPaneKeyEvent\", \"javafx.s";
_obj.AddEventHandler(ba,"RootPaneKeyEvent","javafx.scene.input.KeyEvent.ANY");
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public long  _parseutcstring(String _utc) throws Exception{
String _df = "";
long _res = 0L;
 //BA.debugLineNum = 162;BA.debugLine="Sub ParseUTCstring(utc As String) As Long";
 //BA.debugLineNum = 163;BA.debugLine="Dim df As String = DateTime.DateFormat";
_df = __c.DateTime.getDateFormat();
 //BA.debugLineNum = 164;BA.debugLine="Dim res As Long";
_res = 0L;
 //BA.debugLineNum = 165;BA.debugLine="If utc.CharAt(10) = \"T\" Then";
if (_utc.charAt((int) (10))==BA.ObjectToChar("T")) { 
 //BA.debugLineNum = 167;BA.debugLine="If utc.CharAt(19) = \".\" Then utc = utc.SubString";
if (_utc.charAt((int) (19))==BA.ObjectToChar(".")) { 
_utc = _utc.substring((int) (0),(int) (19))+"+0000";};
 //BA.debugLineNum = 168;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd'T'HH:mm:ssZ\"";
__c.DateTime.setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
 }else {
 //BA.debugLineNum = 171;BA.debugLine="DateTime.DateFormat = \"EEE MMM dd HH:mm:ss Z yyy";
__c.DateTime.setDateFormat("EEE MMM dd HH:mm:ss Z yyyy");
 };
 //BA.debugLineNum = 173;BA.debugLine="Try";
try { //BA.debugLineNum = 174;BA.debugLine="res = DateTime.DateParse(utc)";
_res = __c.DateTime.DateParse(_utc);
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 176;BA.debugLine="res = 0";
_res = (long) (0);
 };
 //BA.debugLineNum = 178;BA.debugLine="DateTime.DateFormat = df";
__c.DateTime.setDateFormat(_df);
 //BA.debugLineNum = 179;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return 0L;
}
public String  _rootpanekeyevent_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
anywheresoftware.b4j.agraham.reflection.Reflection _ke = null;
String _scode = "";
String _stype = "";
int _result = 0;
 //BA.debugLineNum = 251;BA.debugLine="Private Sub RootPaneKeyEvent_Event(e As Event)";
 //BA.debugLineNum = 252;BA.debugLine="Dim KE As Reflector";
_ke = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 253;BA.debugLine="Dim sCode As String";
_scode = "";
 //BA.debugLineNum = 254;BA.debugLine="Dim sType As String 'ignore";
_stype = "";
 //BA.debugLineNum = 255;BA.debugLine="Dim result As Int 'ignore";
_result = 0;
 //BA.debugLineNum = 256;BA.debugLine="KE.Target = e	 ' e is a KeyEvent instance";
_ke.Target = (Object)(_e.getObject());
 //BA.debugLineNum = 257;BA.debugLine="sCode = KE.RunMethod(\"getCode\")";
_scode = BA.ObjectToString(_ke.RunMethod("getCode"));
 //BA.debugLineNum = 258;BA.debugLine="sType = KE.RunMethod(\"getEventType\")";
_stype = BA.ObjectToString(_ke.RunMethod("getEventType"));
 //BA.debugLineNum = 259;BA.debugLine="If sCode=\"ESCAPE\" Then";
if ((_scode).equals("ESCAPE")) { 
 //BA.debugLineNum = 260;BA.debugLine="wvMedia.LoadUrl(\"\")";
_wvmedia.LoadUrl("");
 //BA.debugLineNum = 261;BA.debugLine="wvMedia.RemoveNodeFromParent";
_wvmedia.RemoveNodeFromParent();
 //BA.debugLineNum = 262;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
__c.File.Delete(__c.File.getDirApp(),"screenshot.jpg");
 //BA.debugLineNum = 263;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
__c.File.Delete(__c.File.getDirApp(),"media.mp4");
 //BA.debugLineNum = 264;BA.debugLine="frm.Close";
_frm.Close();
 };
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return "";
}
public String  _show(String _json,String _userregion) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Public Sub Show(json As String, userRegion As Stri";
 //BA.debugLineNum = 35;BA.debugLine="GetVideos(json, userRegion)";
_getvideos(_json,_userregion);
 //BA.debugLineNum = 36;BA.debugLine="frm.ShowAndWait";
_frm.ShowAndWait();
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 215;BA.debugLine="Try";
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
 //BA.debugLineNum = 216;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
 //BA.debugLineNum = 217;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 218;BA.debugLine="j.Download(Link)";
_j._download /*String*/ (_link);
 //BA.debugLineNum = 219;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("TOKEN_AUTH",parent._authtoken);
 //BA.debugLineNum = 220;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[0];
;
 //BA.debugLineNum = 221;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 223;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File.";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = parent.__c.File.OpenOutput(parent.__c.File.getDirApp(),"media.mp4",parent.__c.False);
 //BA.debugLineNum = 224;BA.debugLine="File.Copy2(j.GetInputStream, out)";
parent.__c.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ ().getObject()),(java.io.OutputStream)(_out.getObject()));
 //BA.debugLineNum = 225;BA.debugLine="out.Close '<------ very important";
_out.Close();
 //BA.debugLineNum = 227;BA.debugLine="lblTimestamp.Text= timestamp";
parent._lbltimestamp.setText(_timestamp);
 //BA.debugLineNum = 228;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 229;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 230;BA.debugLine="sb.Append(\"<video width='100%' height='100%' co";
_sb.Append("<video width='100%' height='100%' controls autoplay>");
 //BA.debugLineNum = 231;BA.debugLine="sb.Append(\"<source src='\" & File.GetUri(File.Di";
_sb.Append("<source src='"+parent.__c.File.GetUri(parent.__c.File.getDirApp(),"media.mp4")+"' Type='video/mp4'/>");
 //BA.debugLineNum = 232;BA.debugLine="sb.Append(\"</video>\")";
_sb.Append("</video>");
 //BA.debugLineNum = 233;BA.debugLine="wvMedia.LoadHtml(sb.ToString)";
parent._wvmedia.LoadHtml(_sb.ToString());
 if (true) break;

case 8:
//C
this.state = 9;
 if (true) break;

case 9:
//C
this.state = 12;
;
 //BA.debugLineNum = 237;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 //BA.debugLineNum = 239;BA.debugLine="Log(LastException)";
parent.__c.Log(BA.ObjectToString(parent.__c.LastException(ba)));
 //BA.debugLineNum = 240;BA.debugLine="fx.Msgbox2(frm,LastException,\"ShowVideo Exceptio";
parent._fx.Msgbox2(parent._frm,BA.ObjectToString(parent.__c.LastException(ba)),"ShowVideo Exception","OK","","",parent._fx.MSGBOX_ERROR);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
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
public String  _wvmedia_pagefinished(String _url) throws Exception{
 //BA.debugLineNum = 295;BA.debugLine="Sub wvMedia_PageFinished (Url As String)";
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "SHOW"))
	return _show((String) args[0], (String) args[1]);
return BA.SubDelegator.SubNotFound;
}
}
