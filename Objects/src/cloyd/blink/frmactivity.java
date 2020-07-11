package cloyd.blink;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class frmactivity extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("cloyd.blink", "cloyd.blink.frmactivity", this);
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
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
public String  _initialize(cloyd.blink.frmactivity __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
anywheresoftware.b4j.agraham.reflection.Reflection _obj = null;
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Public Sub Initialize(Parent As Form)";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="frm.Initialize(\"frm\", 600dip, 600dip)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",__c.DipToCurrent((int) (600)),__c.DipToCurrent((int) (600)));
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .SetFormStyle("UTILITY");
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="frm.RootPane.LoadLayout(\"activity\")";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"activity");
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="frm.Icon = fx.LoadImage(File.DirAssets, \"home.png";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(__c.File.getDirAssets(),"home.png").getObject()));
RDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="frm.Title = \"Catanaoan Blink XT2 Cameras Activity";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle("Catanaoan Blink XT2 Cameras Activity Viewer");
RDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="frm.SetOwner(Parent)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .SetOwner(_parent);
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="frm.WindowWidth = CheckMonitor.MaxX - CheckMonito";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowWidth(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMaxX()-__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinX());
RDebugUtils.currentLine=3735560;
 //BA.debugLineNum = 3735560;BA.debugLine="frm.WindowLeft = CheckMonitor.MinX";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowLeft(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinX());
RDebugUtils.currentLine=3735561;
 //BA.debugLineNum = 3735561;BA.debugLine="frm.WindowHeight = CheckMonitor.MaxY - CheckMonit";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowHeight(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMaxY()-__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinY());
RDebugUtils.currentLine=3735562;
 //BA.debugLineNum = 3735562;BA.debugLine="frm.WindowTop = CheckMonitor.MinY";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowTop(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinY());
RDebugUtils.currentLine=3735563;
 //BA.debugLineNum = 3735563;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=3735564;
 //BA.debugLineNum = 3735564;BA.debugLine="Obj.Target = frm.RootPane";
_obj.Target = (Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject());
RDebugUtils.currentLine=3735565;
 //BA.debugLineNum = 3735565;BA.debugLine="Obj.AddEventHandler(\"RootPaneKeyEvent\", \"javafx.s";
_obj.AddEventHandler(ba,"RootPaneKeyEvent","javafx.scene.input.KeyEvent.ANY");
RDebugUtils.currentLine=3735566;
 //BA.debugLineNum = 3735566;BA.debugLine="End Sub";
return "";
}
public String  _show(cloyd.blink.frmactivity __ref,String _json,String _userregion) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_json,_userregion}));}
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Public Sub Show(json As String, userRegion As Stri";
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="jsonMain = json";
__ref._jsonmain /*String*/  = _json;
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="userRegionMain = userRegion";
__ref._userregionmain /*String*/  = _userregion;
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="B4XLoadingIndicator1.Show";
__ref._b4xloadingindicator1 /*cloyd.blink.b4xloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="GetVideos(json, userRegion)";
__ref._getvideos /*void*/ (null,_json,_userregion);
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="B4XLoadingIndicator1.Hide";
__ref._b4xloadingindicator1 /*cloyd.blink.b4xloadingindicator*/ ._hide /*String*/ (null);
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="frm.ShowAndWait";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .ShowAndWait();
RDebugUtils.currentLine=3801097;
 //BA.debugLineNum = 3801097;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.JFX.ScreenWrapper  _checkmonitor(cloyd.blink.frmactivity __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "checkmonitor", false))
	 {return ((anywheresoftware.b4j.objects.JFX.ScreenWrapper) Debug.delegate(ba, "checkmonitor", null));}
anywheresoftware.b4a.objects.collections.List _slist = null;
anywheresoftware.b4j.objects.JFX.ScreenWrapper _s = null;
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Sub CheckMonitor() As Screen";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Try";
try {RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="If fx.Screens.Size= 1 Then";
if (__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens().getSize()==1) { 
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s = (anywheresoftware.b4j.objects.JFX.ScreenWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.ScreenWrapper(), (javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="Return S";
if (true) return _s;
 }else 
{RDebugUtils.currentLine=4587527;
 //BA.debugLineNum = 4587527;BA.debugLine="Else If fx.Screens.Size> 1 Then";
if (__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens().getSize()>1) { 
RDebugUtils.currentLine=4587528;
 //BA.debugLineNum = 4587528;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=4587529;
 //BA.debugLineNum = 4587529;BA.debugLine="Dim S As Screen = SList.Get(2)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s = (anywheresoftware.b4j.objects.JFX.ScreenWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.ScreenWrapper(), (javafx.stage.Screen)(_slist.Get((int) (2))));
RDebugUtils.currentLine=4587531;
 //BA.debugLineNum = 4587531;BA.debugLine="Return S";
if (true) return _s;
 }else {
RDebugUtils.currentLine=4587533;
 //BA.debugLineNum = 4587533;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=4587534;
 //BA.debugLineNum = 4587534;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s = (anywheresoftware.b4j.objects.JFX.ScreenWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.ScreenWrapper(), (javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=4587536;
 //BA.debugLineNum = 4587536;BA.debugLine="Return S";
if (true) return _s;
 }}
;
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=4587539;
 //BA.debugLineNum = 4587539;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=4587540;
 //BA.debugLineNum = 4587540;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s = (anywheresoftware.b4j.objects.JFX.ScreenWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.ScreenWrapper(), (javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=4587542;
 //BA.debugLineNum = 4587542;BA.debugLine="Return S";
if (true) return _s;
 };
RDebugUtils.currentLine=4587544;
 //BA.debugLineNum = 4587544;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(cloyd.blink.frmactivity __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="Private jsonMain As String";
_jsonmain = "";
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="Private userRegionMain As String";
_userregionmain = "";
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=3670022;
 //BA.debugLineNum = 3670022;BA.debugLine="Private ivScreenshot As B4XView";
_ivscreenshot = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="Private lblFileInfo As B4XView";
_lblfileinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3670024;
 //BA.debugLineNum = 3670024;BA.debugLine="Private lblDeviceInfo As B4XView";
_lbldeviceinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3670025;
 //BA.debugLineNum = 3670025;BA.debugLine="Private clvActivity As CustomListView";
_clvactivity = new b4j.example.customlistview();
RDebugUtils.currentLine=3670026;
 //BA.debugLineNum = 3670026;BA.debugLine="Public authToken As String";
_authtoken = "";
RDebugUtils.currentLine=3670027;
 //BA.debugLineNum = 3670027;BA.debugLine="Private wvMedia As WebView";
_wvmedia = new anywheresoftware.b4j.objects.WebViewWrapper();
RDebugUtils.currentLine=3670028;
 //BA.debugLineNum = 3670028;BA.debugLine="Private lblDate As B4XView";
_lbldate = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3670029;
 //BA.debugLineNum = 3670029;BA.debugLine="Private lblTimestamp As Label";
_lbltimestamp = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=3670030;
 //BA.debugLineNum = 3670030;BA.debugLine="Private previousSelectedIndex As Int";
_previousselectedindex = 0;
RDebugUtils.currentLine=3670031;
 //BA.debugLineNum = 3670031;BA.debugLine="Private ivWatched As B4XView";
_ivwatched = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3670032;
 //BA.debugLineNum = 3670032;BA.debugLine="Private kvs As KeyValueStore";
_kvs = new cloyd.blink.keyvaluestore();
RDebugUtils.currentLine=3670033;
 //BA.debugLineNum = 3670033;BA.debugLine="Type VideoInfo (ThumbnailPath As String, DateCrea";
;
RDebugUtils.currentLine=3670034;
 //BA.debugLineNum = 3670034;BA.debugLine="Private cutils As ControlsUtils";
_cutils = new anywheresoftware.b4j.objects.ControlsUtils();
RDebugUtils.currentLine=3670035;
 //BA.debugLineNum = 3670035;BA.debugLine="Private B4XLoadingIndicator1 As B4XLoadingIndicat";
_b4xloadingindicator1 = new cloyd.blink.b4xloadingindicator();
RDebugUtils.currentLine=3670036;
 //BA.debugLineNum = 3670036;BA.debugLine="End Sub";
return "";
}
public String  _clvactivity_itemclick(cloyd.blink.frmactivity __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "clvactivity_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvactivity_itemclick", new Object[] {_index,_value}));}
String _video = "";
String _videourl = "";
String _videotimestamp = "";
anywheresoftware.b4a.objects.collections.List _list1 = null;
int _i = 0;
Object _mytypes = null;
cloyd.blink.frmactivity._videoinfo _videos = null;
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Sub clvActivity_ItemClick (Index As Int, Value As";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Try";
try {RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="B4XLoadingIndicator1.Show";
__ref._b4xloadingindicator1 /*cloyd.blink.b4xloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="UpdateItemColor(Index)";
__ref._updateitemcolor /*String*/ (null,_index);
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="wvMedia.LoadUrl(\"\")";
__ref._wvmedia /*anywheresoftware.b4j.objects.WebViewWrapper*/ .LoadUrl("");
RDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="Dim video As String";
_video = "";
RDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="video = clvActivity.GetValue(Index)";
_video = BA.ObjectToString(__ref._clvactivity /*b4j.example.customlistview*/ ._getvalue(_index));
RDebugUtils.currentLine=4325383;
 //BA.debugLineNum = 4325383;BA.debugLine="Dim videoURL As String = Regex.Split(\"\\|\",video)";
_videourl = __c.Regex.Split("\\|",_video)[(int) (0)];
RDebugUtils.currentLine=4325384;
 //BA.debugLineNum = 4325384;BA.debugLine="Dim videoTimestamp As String = Regex.Split(\"\\|\",";
_videotimestamp = __c.Regex.Split("\\|",_video)[(int) (1)];
RDebugUtils.currentLine=4325385;
 //BA.debugLineNum = 4325385;BA.debugLine="ShowVideo(videoURL,videoTimestamp)";
__ref._showvideo /*void*/ (null,_videourl,_videotimestamp);
RDebugUtils.currentLine=4325386;
 //BA.debugLineNum = 4325386;BA.debugLine="Dim list1 As List = kvs.ListKeys";
_list1 = new anywheresoftware.b4a.objects.collections.List();
_list1 = __ref._kvs /*cloyd.blink.keyvaluestore*/ ._listkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=4325387;
 //BA.debugLineNum = 4325387;BA.debugLine="For i =  0 To list1.Size-1";
{
final int step11 = 1;
final int limit11 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=4325388;
 //BA.debugLineNum = 4325388;BA.debugLine="Dim mytypes As Object = kvs.Get(list1.Get(i))";
_mytypes = __ref._kvs /*cloyd.blink.keyvaluestore*/ ._get /*Object*/ (null,BA.ObjectToString(_list1.Get(_i)));
RDebugUtils.currentLine=4325389;
 //BA.debugLineNum = 4325389;BA.debugLine="Dim videos = mytypes As VideoInfo";
_videos = (cloyd.blink.frmactivity._videoinfo)(_mytypes);
RDebugUtils.currentLine=4325390;
 //BA.debugLineNum = 4325390;BA.debugLine="If videoURL.Contains(videos.VideoID) Then";
if (_videourl.contains(_videos.VideoID /*String*/ )) { 
RDebugUtils.currentLine=4325391;
 //BA.debugLineNum = 4325391;BA.debugLine="kvs.Put(videos.VideoID,CreateCustomType(videos";
__ref._kvs /*cloyd.blink.keyvaluestore*/ ._put /*String*/ (null,_videos.VideoID /*String*/ ,(Object)(__ref._createcustomtype /*cloyd.blink.frmactivity._videoinfo*/ (null,_videos.ThumbnailPath /*String*/ ,_videos.DateCreated /*String*/ ,"true",_videos.DeviceName /*String*/ ,_videos.VideoID /*String*/ ,_videos.ThumbnailBLOB /*byte[]*/ )));
 };
 }
};
 } 
       catch (Exception e19) {
			ba.setLastException(e19);RDebugUtils.currentLine=4325395;
 //BA.debugLineNum = 4325395;BA.debugLine="B4XLoadingIndicator1.Hide";
__ref._b4xloadingindicator1 /*cloyd.blink.b4xloadingindicator*/ ._hide /*String*/ (null);
RDebugUtils.currentLine=4325396;
 //BA.debugLineNum = 4325396;BA.debugLine="cutils.ShowNotification(\"Catanaoan Blink XT2 Cam";
__ref._cutils /*anywheresoftware.b4j.objects.ControlsUtils*/ .ShowNotification("Catanaoan Blink XT2 Cameras v1.0","clvActivity_ItemClick: "+BA.ObjectToString(__c.LastException(ba)),__ref._cutils /*anywheresoftware.b4j.objects.ControlsUtils*/ .ICON_ERROR);
RDebugUtils.currentLine=4325397;
 //BA.debugLineNum = 4325397;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 };
RDebugUtils.currentLine=4325400;
 //BA.debugLineNum = 4325400;BA.debugLine="End Sub";
return "";
}
public String  _updateitemcolor(cloyd.blink.frmactivity __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "updateitemcolor", false))
	 {return ((String) Debug.delegate(ba, "updateitemcolor", new Object[] {_index}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _backpanel = null;
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Sub UpdateItemColor (Index As Int)";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Try";
try {RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="If previousSelectedIndex <> Index Then";
if (__ref._previousselectedindex /*int*/ !=_index) { 
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="Dim p As B4XView = clvActivity.GetPanel(previou";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._clvactivity /*b4j.example.customlistview*/ ._getpanel(__ref._previousselectedindex /*int*/ );
RDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="If p.NumberOfViews > 0 Then";
if (_p.getNumberOfViews()>0) { 
RDebugUtils.currentLine=4718598;
 //BA.debugLineNum = 4718598;BA.debugLine="Dim backPanel As Pane = p.getview(0)";
_backpanel = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_backpanel = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=4718599;
 //BA.debugLineNum = 4718599;BA.debugLine="CSSUtils.SetBackgroundColor(backPanel,fx.Color";
_cssutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_backpanel.getObject())),(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.ARGB((int) (255),(int) (217),(int) (215),(int) (222)))));
RDebugUtils.currentLine=4718600;
 //BA.debugLineNum = 4718600;BA.debugLine="CSSUtils.SetBorder(backPanel,1,fx.Colors.Black";
_cssutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_backpanel.getObject())),1,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.Black)),1);
 };
 };
RDebugUtils.currentLine=4718604;
 //BA.debugLineNum = 4718604;BA.debugLine="Dim p As B4XView = clvActivity.GetPanel(Index)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._clvactivity /*b4j.example.customlistview*/ ._getpanel(_index);
RDebugUtils.currentLine=4718605;
 //BA.debugLineNum = 4718605;BA.debugLine="If p.NumberOfViews > 0 Then";
if (_p.getNumberOfViews()>0) { 
RDebugUtils.currentLine=4718607;
 //BA.debugLineNum = 4718607;BA.debugLine="Dim backPanel As Pane = p.getview(0)";
_backpanel = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_backpanel = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=4718608;
 //BA.debugLineNum = 4718608;BA.debugLine="CSSUtils.SetBackgroundColor(backPanel, fx.Color";
_cssutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_backpanel.getObject())),(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.White)));
RDebugUtils.currentLine=4718609;
 //BA.debugLineNum = 4718609;BA.debugLine="CSSUtils.SetBorder(backPanel,2,fx.Colors.Red,1)";
_cssutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_backpanel.getObject())),2,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.Red)),1);
 };
RDebugUtils.currentLine=4718612;
 //BA.debugLineNum = 4718612;BA.debugLine="previousSelectedIndex = Index";
__ref._previousselectedindex /*int*/  = _index;
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=4718614;
 //BA.debugLineNum = 4718614;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
RDebugUtils.currentLine=4718615;
 //BA.debugLineNum = 4718615;BA.debugLine="cutils.ShowNotification(\"Catanaoan Blink XT2 Cam";
__ref._cutils /*anywheresoftware.b4j.objects.ControlsUtils*/ .ShowNotification("Catanaoan Blink XT2 Cameras v1.0","UpdateItemColor: "+BA.ObjectToString(__c.LastException(ba)),__ref._cutils /*anywheresoftware.b4j.objects.ControlsUtils*/ .ICON_ERROR);
 };
RDebugUtils.currentLine=4718617;
 //BA.debugLineNum = 4718617;BA.debugLine="End Sub";
return "";
}
public void  _showvideo(cloyd.blink.frmactivity __ref,String _link,String _timestamp) throws Exception{
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "showvideo", false))
	 {Debug.delegate(ba, "showvideo", new Object[] {_link,_timestamp}); return;}
ResumableSub_ShowVideo rsub = new ResumableSub_ShowVideo(this,__ref,_link,_timestamp);
rsub.resume(ba, null);
}
public static class ResumableSub_ShowVideo extends BA.ResumableSub {
public ResumableSub_ShowVideo(cloyd.blink.frmactivity parent,cloyd.blink.frmactivity __ref,String _link,String _timestamp) {
this.parent = parent;
this.__ref = __ref;
this._link = _link;
this._timestamp = _timestamp;
this.__ref = parent;
}
cloyd.blink.frmactivity __ref;
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
RDebugUtils.currentModule="frmactivity";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Try";
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
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Log (\"Video URL: \" & Link)";
parent.__c.Log("Video URL: "+_link);
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="j.Download(Link)";
_j._download /*String*/ (null,_link);
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("TOKEN_AUTH",__ref._authtoken /*String*/ );
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frmactivity", "showvideo"), (Object)(_j));
this.state = 33;
return;
case 33:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[1];
;
RDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="B4XLoadingIndicator1.Hide";
__ref._b4xloadingindicator1 /*cloyd.blink.b4xloadingindicator*/ ._hide /*String*/ (null);
RDebugUtils.currentLine=4390921;
 //BA.debugLineNum = 4390921;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=4390923;
 //BA.debugLineNum = 4390923;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File.";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = parent.__c.File.OpenOutput(parent.__c.File.getDirApp(),"media.mp4",parent.__c.False);
RDebugUtils.currentLine=4390924;
 //BA.debugLineNum = 4390924;BA.debugLine="File.Copy2(j.GetInputStream, out)";
parent.__c.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=4390925;
 //BA.debugLineNum = 4390925;BA.debugLine="out.Close '<------ very important";
_out.Close();
RDebugUtils.currentLine=4390927;
 //BA.debugLineNum = 4390927;BA.debugLine="lblTimestamp.Text= timestamp";
__ref._lbltimestamp /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_timestamp);
RDebugUtils.currentLine=4390928;
 //BA.debugLineNum = 4390928;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=4390929;
 //BA.debugLineNum = 4390929;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=4390930;
 //BA.debugLineNum = 4390930;BA.debugLine="sb.Append(\"<video width='100%' height='100%' co";
_sb.Append("<video width='100%' height='100%' controls autoplay>");
RDebugUtils.currentLine=4390931;
 //BA.debugLineNum = 4390931;BA.debugLine="sb.Append(\"<source src='\" & File.GetUri(File.Di";
_sb.Append("<source src='"+parent.__c.File.GetUri(parent.__c.File.getDirApp(),"media.mp4")+"' Type='video/mp4'/>");
RDebugUtils.currentLine=4390932;
 //BA.debugLineNum = 4390932;BA.debugLine="sb.Append(\"</video>\")";
_sb.Append("</video>");
RDebugUtils.currentLine=4390933;
 //BA.debugLineNum = 4390933;BA.debugLine="wvMedia.LoadHtml(sb.ToString)";
__ref._wvmedia /*anywheresoftware.b4j.objects.WebViewWrapper*/ .LoadHtml(_sb.ToString());
 if (true) break;

case 8:
//C
this.state = 9;
 if (true) break;
;
RDebugUtils.currentLine=4390937;
 //BA.debugLineNum = 4390937;BA.debugLine="If j.ErrorMessage.Contains(\"Media not found\") Th";

case 9:
//if
this.state = 20;
if (_j._errormessage /*String*/ .contains("Media not found")) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=4390938;
 //BA.debugLineNum = 4390938;BA.debugLine="clvActivity.RemoveAt(previousSelectedIndex)";
__ref._clvactivity /*b4j.example.customlistview*/ ._removeat(__ref._previousselectedindex /*int*/ );
RDebugUtils.currentLine=4390939;
 //BA.debugLineNum = 4390939;BA.debugLine="Dim list1 As List = kvs.ListKeys";
_list1 = new anywheresoftware.b4a.objects.collections.List();
_list1 = __ref._kvs /*cloyd.blink.keyvaluestore*/ ._listkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=4390940;
 //BA.debugLineNum = 4390940;BA.debugLine="For i =  0 To list1.Size-1";
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
RDebugUtils.currentLine=4390941;
 //BA.debugLineNum = 4390941;BA.debugLine="Dim mytypes As Object = kvs.Get(list1.Get(i))";
_mytypes = __ref._kvs /*cloyd.blink.keyvaluestore*/ ._get /*Object*/ (null,BA.ObjectToString(_list1.Get(_i)));
RDebugUtils.currentLine=4390942;
 //BA.debugLineNum = 4390942;BA.debugLine="Dim videos = mytypes As VideoInfo";
_videos = (cloyd.blink.frmactivity._videoinfo)(_mytypes);
RDebugUtils.currentLine=4390943;
 //BA.debugLineNum = 4390943;BA.debugLine="If Link.Contains(videos.VideoID) Then";
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
RDebugUtils.currentLine=4390944;
 //BA.debugLineNum = 4390944;BA.debugLine="kvs.Remove(list1.Get(i))";
__ref._kvs /*cloyd.blink.keyvaluestore*/ ._remove /*String*/ (null,BA.ObjectToString(_list1.Get(_i)));
RDebugUtils.currentLine=4390945;
 //BA.debugLineNum = 4390945;BA.debugLine="clvActivity.Clear";
__ref._clvactivity /*b4j.example.customlistview*/ ._clear();
RDebugUtils.currentLine=4390946;
 //BA.debugLineNum = 4390946;BA.debugLine="cutils.ShowNotification(\"Catanaoan Blink XT2";
__ref._cutils /*anywheresoftware.b4j.objects.ControlsUtils*/ .ShowNotification("Catanaoan Blink XT2 Cameras v1.0","Media not found. Removed from the list.",__ref._cutils /*anywheresoftware.b4j.objects.ControlsUtils*/ .ICON_INFORMATION);
RDebugUtils.currentLine=4390947;
 //BA.debugLineNum = 4390947;BA.debugLine="GetVideos(jsonMain,userRegionMain)";
__ref._getvideos /*void*/ (null,__ref._jsonmain /*String*/ ,__ref._userregionmain /*String*/ );
RDebugUtils.currentLine=4390948;
 //BA.debugLineNum = 4390948;BA.debugLine="Exit";
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
RDebugUtils.currentLine=4390952;
 //BA.debugLineNum = 4390952;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 0;
RDebugUtils.currentLine=4390954;
 //BA.debugLineNum = 4390954;BA.debugLine="Log(LastException)";
parent.__c.Log(BA.ObjectToString(parent.__c.LastException(ba)));
RDebugUtils.currentLine=4390955;
 //BA.debugLineNum = 4390955;BA.debugLine="cutils.ShowNotification(\"Catanaoan Blink XT2 Cam";
__ref._cutils /*anywheresoftware.b4j.objects.ControlsUtils*/ .ShowNotification("Catanaoan Blink XT2 Cameras v1.0","ShowVideo: "+BA.ObjectToString(parent.__c.LastException(ba)),__ref._cutils /*anywheresoftware.b4j.objects.ControlsUtils*/ .ICON_ERROR);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=4390958;
 //BA.debugLineNum = 4390958;BA.debugLine="Try";

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
RDebugUtils.currentLine=4390959;
 //BA.debugLineNum = 4390959;BA.debugLine="Sleep(2000)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frmactivity", "showvideo"),(int) (2000));
this.state = 36;
return;
case 36:
//C
this.state = 26;
;
RDebugUtils.currentLine=4390960;
 //BA.debugLineNum = 4390960;BA.debugLine="Dim p As B4XView = clvActivity.GetPanel(previous";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._clvactivity /*b4j.example.customlistview*/ ._getpanel(__ref._previousselectedindex /*int*/ );
RDebugUtils.currentLine=4390961;
 //BA.debugLineNum = 4390961;BA.debugLine="If p.NumberOfViews > 0 Then";
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
RDebugUtils.currentLine=4390963;
 //BA.debugLineNum = 4390963;BA.debugLine="Dim ContentLabel As ImageView = p.GetView(0).Ge";
_contentlabel = new anywheresoftware.b4j.objects.ImageViewWrapper();
_contentlabel = (anywheresoftware.b4j.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper(), (javafx.scene.image.ImageView)(_p.GetView((int) (0)).GetView((int) (1)).getObject()));
RDebugUtils.currentLine=4390964;
 //BA.debugLineNum = 4390964;BA.debugLine="ContentLabel.Visible = False";
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
RDebugUtils.currentLine=4390967;
 //BA.debugLineNum = 4390967;BA.debugLine="Log(LastException)";
parent.__c.Log(BA.ObjectToString(parent.__c.LastException(ba)));
RDebugUtils.currentLine=4390968;
 //BA.debugLineNum = 4390968;BA.debugLine="cutils.ShowNotification(\"Catanaoan Blink XT2 Cam";
__ref._cutils /*anywheresoftware.b4j.objects.ControlsUtils*/ .ShowNotification("Catanaoan Blink XT2 Cameras v1.0","ShowVideo 2nd Try-Catch: "+BA.ObjectToString(parent.__c.LastException(ba)),__ref._cutils /*anywheresoftware.b4j.objects.ControlsUtils*/ .ICON_ERROR);
 if (true) break;
if (true) break;

case 32:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=4390970;
 //BA.debugLineNum = 4390970;BA.debugLine="End Sub";
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
public cloyd.blink.frmactivity._videoinfo  _createcustomtype(cloyd.blink.frmactivity __ref,String _thumbnailpath,String _datecreated,String _watched,String _devicename,String _videoid,byte[] _thumbnailblob) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "createcustomtype", false))
	 {return ((cloyd.blink.frmactivity._videoinfo) Debug.delegate(ba, "createcustomtype", new Object[] {_thumbnailpath,_datecreated,_watched,_devicename,_videoid,_thumbnailblob}));}
cloyd.blink.frmactivity._videoinfo _ct = null;
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Private Sub CreateCustomType(ThumbnailPath As Stri";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Dim ct As VideoInfo";
_ct = new cloyd.blink.frmactivity._videoinfo();
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="ct.Initialize";
_ct.Initialize();
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="ct.ThumbnailPath = ThumbnailPath";
_ct.ThumbnailPath /*String*/  = _thumbnailpath;
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="ct.DateCreated = DateCreated";
_ct.DateCreated /*String*/  = _datecreated;
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="ct.Watched = Watched";
_ct.Watched /*String*/  = _watched;
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="ct.DeviceName = DeviceName";
_ct.DeviceName /*String*/  = _devicename;
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="ct.ThumbnailBLOB = ThumbnailBLOB";
_ct.ThumbnailBLOB /*byte[]*/  = _thumbnailblob;
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="ct.VideoID = VideoID";
_ct.VideoID /*String*/  = _videoid;
RDebugUtils.currentLine=3932169;
 //BA.debugLineNum = 3932169;BA.debugLine="Return ct";
if (true) return _ct;
RDebugUtils.currentLine=3932170;
 //BA.debugLineNum = 3932170;BA.debugLine="End Sub";
return null;
}
public String  _convertdatetimeperiod(cloyd.blink.frmactivity __ref,String _inputtime,String _dayname) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "convertdatetimeperiod", false))
	 {return ((String) Debug.delegate(ba, "convertdatetimeperiod", new Object[] {_inputtime,_dayname}));}
long _ticks = 0L;
long _lngticks = 0L;
b4j.example.dateutils._period _p = null;
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub ConvertDateTimePeriod(inputTime As String, day";
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = __ref._parseutcstring /*long*/ (null,_inputtime.replace("+00:00","+0000"));
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
__c.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a");
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="Dim p As Period = DateUtils.PeriodBetween(lngTick";
_p = _dateutils._periodbetween(_lngticks,__c.DateTime.getNow());
RDebugUtils.currentLine=4063239;
 //BA.debugLineNum = 4063239;BA.debugLine="If dayname.Contains(\"Today\") Then";
if (_dayname.contains("Today")) { 
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="If p.Days = 0 Then";
if (_p.Days==0) { 
RDebugUtils.currentLine=4063241;
 //BA.debugLineNum = 4063241;BA.debugLine="If p.Hours = 0 Then";
if (_p.Hours==0) { 
RDebugUtils.currentLine=4063242;
 //BA.debugLineNum = 4063242;BA.debugLine="If p.Minutes = 0 Then";
if (_p.Minutes==0) { 
RDebugUtils.currentLine=4063243;
 //BA.debugLineNum = 4063243;BA.debugLine="Return p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Seconds)+"s ago";
 }else {
RDebugUtils.currentLine=4063245;
 //BA.debugLineNum = 4063245;BA.debugLine="Return p.Minutes & \"m \" & p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 };
 }else {
RDebugUtils.currentLine=4063248;
 //BA.debugLineNum = 4063248;BA.debugLine="Return p.Hours & \"h \" & p.Minutes & \"m \" & p.S";
if (true) return BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 };
 }else 
{RDebugUtils.currentLine=4063250;
 //BA.debugLineNum = 4063250;BA.debugLine="else If p.Hours = 0 Then";
if (_p.Hours==0) { 
RDebugUtils.currentLine=4063251;
 //BA.debugLineNum = 4063251;BA.debugLine="If p.Minutes = 0 Then";
if (_p.Minutes==0) { 
RDebugUtils.currentLine=4063252;
 //BA.debugLineNum = 4063252;BA.debugLine="Return p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Seconds)+"s ago";
 }else {
RDebugUtils.currentLine=4063254;
 //BA.debugLineNum = 4063254;BA.debugLine="Return p.Minutes & \"m \" & p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 };
 }else 
{RDebugUtils.currentLine=4063256;
 //BA.debugLineNum = 4063256;BA.debugLine="else If p.Minutes = 0 Then";
if (_p.Minutes==0) { 
RDebugUtils.currentLine=4063257;
 //BA.debugLineNum = 4063257;BA.debugLine="Return p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Seconds)+"s ago";
 }else {
RDebugUtils.currentLine=4063259;
 //BA.debugLineNum = 4063259;BA.debugLine="Return p.Days & \"d \" & p.Hours & \"h \" & p.Minut";
if (true) return BA.NumberToString(_p.Days)+"d "+BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 }}}
;
 }else 
{RDebugUtils.currentLine=4063261;
 //BA.debugLineNum = 4063261;BA.debugLine="else if dayname.Contains(\"Yesterday\") Then";
if (_dayname.contains("Yesterday")) { 
RDebugUtils.currentLine=4063262;
 //BA.debugLineNum = 4063262;BA.debugLine="If p.Days = 0 Then";
if (_p.Days==0) { 
RDebugUtils.currentLine=4063263;
 //BA.debugLineNum = 4063263;BA.debugLine="If p.Hours = 0 Then";
if (_p.Hours==0) { 
RDebugUtils.currentLine=4063264;
 //BA.debugLineNum = 4063264;BA.debugLine="If p.Minutes = 0 Then";
if (_p.Minutes==0) { 
RDebugUtils.currentLine=4063265;
 //BA.debugLineNum = 4063265;BA.debugLine="Return p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Seconds)+"s ago";
 }else {
RDebugUtils.currentLine=4063267;
 //BA.debugLineNum = 4063267;BA.debugLine="Return p.Minutes & \"m \" & p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 };
 }else {
RDebugUtils.currentLine=4063270;
 //BA.debugLineNum = 4063270;BA.debugLine="Return p.Hours & \"h \" & p.Minutes & \"m \" & p.S";
if (true) return BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 };
 }else {
RDebugUtils.currentLine=4063273;
 //BA.debugLineNum = 4063273;BA.debugLine="Return p.Days & \"d \" & p.Hours & \"h \" & p.Minut";
if (true) return BA.NumberToString(_p.Days)+"d "+BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 };
 }else {
RDebugUtils.currentLine=4063276;
 //BA.debugLineNum = 4063276;BA.debugLine="Return p.Days & \"d \" & p.Hours & \"h \" & p.Minute";
if (true) return BA.NumberToString(_p.Days)+"d "+BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 }}
;
RDebugUtils.currentLine=4063278;
 //BA.debugLineNum = 4063278;BA.debugLine="End Sub";
return "";
}
public long  _parseutcstring(cloyd.blink.frmactivity __ref,String _utc) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "parseutcstring", false))
	 {return ((Long) Debug.delegate(ba, "parseutcstring", new Object[] {_utc}));}
String _df = "";
long _res = 0L;
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Sub ParseUTCstring(utc As String) As Long";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Dim df As String = DateTime.DateFormat";
_df = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="Dim res As Long";
_res = 0L;
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="If utc.CharAt(10) = \"T\" Then";
if (_utc.charAt((int) (10))==BA.ObjectToChar("T")) { 
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="If utc.CharAt(19) = \".\" Then utc = utc.SubString";
if (_utc.charAt((int) (19))==BA.ObjectToChar(".")) { 
_utc = _utc.substring((int) (0),(int) (19))+"+0000";};
RDebugUtils.currentLine=4259846;
 //BA.debugLineNum = 4259846;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd'T'HH:mm:ssZ\"";
__c.DateTime.setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
 }else {
RDebugUtils.currentLine=4259849;
 //BA.debugLineNum = 4259849;BA.debugLine="DateTime.DateFormat = \"EEE MMM dd HH:mm:ss Z yyy";
__c.DateTime.setDateFormat("EEE MMM dd HH:mm:ss Z yyyy");
 };
RDebugUtils.currentLine=4259851;
 //BA.debugLineNum = 4259851;BA.debugLine="Try";
try {RDebugUtils.currentLine=4259852;
 //BA.debugLineNum = 4259852;BA.debugLine="res = DateTime.DateParse(utc)";
_res = __c.DateTime.DateParse(_utc);
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=4259854;
 //BA.debugLineNum = 4259854;BA.debugLine="res = 0";
_res = (long) (0);
 };
RDebugUtils.currentLine=4259856;
 //BA.debugLineNum = 4259856;BA.debugLine="DateTime.DateFormat = df";
__c.DateTime.setDateFormat(_df);
RDebugUtils.currentLine=4259857;
 //BA.debugLineNum = 4259857;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=4259858;
 //BA.debugLineNum = 4259858;BA.debugLine="End Sub";
return 0L;
}
public String  _convertdayname(cloyd.blink.frmactivity __ref,String _inputtime) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "convertdayname", false))
	 {return ((String) Debug.delegate(ba, "convertdayname", new Object[] {_inputtime}));}
long _ticks = 0L;
long _lngticks = 0L;
long _yesterday = 0L;
long _timestamp = 0L;
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Sub ConvertDayName(inputTime As String) As String";
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = __ref._parseutcstring /*long*/ (null,_inputtime.replace("+00:00","+0000"));
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
__c.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a");
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
RDebugUtils.currentLine=4128774;
 //BA.debugLineNum = 4128774;BA.debugLine="Dim Yesterday As Long";
_yesterday = 0L;
RDebugUtils.currentLine=4128775;
 //BA.debugLineNum = 4128775;BA.debugLine="Dim timestamp As Long";
_timestamp = 0L;
RDebugUtils.currentLine=4128776;
 //BA.debugLineNum = 4128776;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
__c.DateTime.setDateFormat("yyyyMMdd");
RDebugUtils.currentLine=4128777;
 //BA.debugLineNum = 4128777;BA.debugLine="Yesterday = DateTime.Date(DateTime.add(DateTime.N";
_yesterday = (long)(Double.parseDouble(__c.DateTime.Date(__c.DateTime.Add(__c.DateTime.getNow(),(int) (0),(int) (0),(int) (-1)))));
RDebugUtils.currentLine=4128778;
 //BA.debugLineNum = 4128778;BA.debugLine="timestamp = DateTime.Date(lngTicks)";
_timestamp = (long)(Double.parseDouble(__c.DateTime.Date(_lngticks)));
RDebugUtils.currentLine=4128780;
 //BA.debugLineNum = 4128780;BA.debugLine="DateTime.DateFormat = \"h:mm:ss a\"";
__c.DateTime.setDateFormat("h:mm:ss a");
RDebugUtils.currentLine=4128781;
 //BA.debugLineNum = 4128781;BA.debugLine="If DateUtils.IsSameDay(lngTicks,DateTime.now) The";
if (_dateutils._issameday(_lngticks,__c.DateTime.getNow())) { 
RDebugUtils.currentLine=4128782;
 //BA.debugLineNum = 4128782;BA.debugLine="Return \"Today\" '& DateTime.Date(lngTicks)";
if (true) return "Today";
 }else 
{RDebugUtils.currentLine=4128783;
 //BA.debugLineNum = 4128783;BA.debugLine="Else If Yesterday = timestamp Then";
if (_yesterday==_timestamp) { 
RDebugUtils.currentLine=4128784;
 //BA.debugLineNum = 4128784;BA.debugLine="Return \"Yesterday\" '& DateTime.Date(lngTicks)";
if (true) return "Yesterday";
 }else {
RDebugUtils.currentLine=4128786;
 //BA.debugLineNum = 4128786;BA.debugLine="Return DateUtils.GetDayOfWeekName(lngTicks) '& \"";
if (true) return _dateutils._getdayofweekname(_lngticks);
 }}
;
RDebugUtils.currentLine=4128788;
 //BA.debugLineNum = 4128788;BA.debugLine="End Sub";
return "";
}
public String  _convertfulldatetime(cloyd.blink.frmactivity __ref,String _inputtime) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "convertfulldatetime", false))
	 {return ((String) Debug.delegate(ba, "convertfulldatetime", new Object[] {_inputtime}));}
long _ticks = 0L;
long _lngticks = 0L;
long _yesterday = 0L;
long _timestamp = 0L;
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Sub ConvertFullDateTime(inputTime As String) As St";
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = __ref._parseutcstring /*long*/ (null,_inputtime.replace("+00:00","+0000"));
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
__c.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a");
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="Dim Yesterday As Long";
_yesterday = 0L;
RDebugUtils.currentLine=4194311;
 //BA.debugLineNum = 4194311;BA.debugLine="Dim timestamp As Long";
_timestamp = 0L;
RDebugUtils.currentLine=4194312;
 //BA.debugLineNum = 4194312;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
__c.DateTime.setDateFormat("yyyyMMdd");
RDebugUtils.currentLine=4194313;
 //BA.debugLineNum = 4194313;BA.debugLine="Yesterday = DateTime.Date(DateTime.add(DateTime.N";
_yesterday = (long)(Double.parseDouble(__c.DateTime.Date(__c.DateTime.Add(__c.DateTime.getNow(),(int) (0),(int) (0),(int) (-1)))));
RDebugUtils.currentLine=4194314;
 //BA.debugLineNum = 4194314;BA.debugLine="timestamp = DateTime.Date(lngTicks)";
_timestamp = (long)(Double.parseDouble(__c.DateTime.Date(_lngticks)));
RDebugUtils.currentLine=4194316;
 //BA.debugLineNum = 4194316;BA.debugLine="DateTime.DateFormat = \"h:mm:ss a\"";
__c.DateTime.setDateFormat("h:mm:ss a");
RDebugUtils.currentLine=4194317;
 //BA.debugLineNum = 4194317;BA.debugLine="If DateUtils.IsSameDay(lngTicks,DateTime.now) The";
if (_dateutils._issameday(_lngticks,__c.DateTime.getNow())) { 
RDebugUtils.currentLine=4194318;
 //BA.debugLineNum = 4194318;BA.debugLine="Return DateTime.Date(lngTicks)";
if (true) return __c.DateTime.Date(_lngticks);
 }else 
{RDebugUtils.currentLine=4194319;
 //BA.debugLineNum = 4194319;BA.debugLine="Else If Yesterday = timestamp Then";
if (_yesterday==_timestamp) { 
RDebugUtils.currentLine=4194320;
 //BA.debugLineNum = 4194320;BA.debugLine="Return DateTime.Date(lngTicks)";
if (true) return __c.DateTime.Date(_lngticks);
 }else {
RDebugUtils.currentLine=4194322;
 //BA.debugLineNum = 4194322;BA.debugLine="Return DateTime.Date(lngTicks)";
if (true) return __c.DateTime.Date(_lngticks);
 }}
;
RDebugUtils.currentLine=4194324;
 //BA.debugLineNum = 4194324;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlistitem(cloyd.blink.frmactivity __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _screenshot,String _fileinfo,String _devicename,String _watched) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "createlistitem", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlistitem", new Object[] {_screenshot,_fileinfo,_devicename,_watched}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
String _dayname = "";
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub CreateListItem(screenshot As B4XBitmap, filein";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Try";
try {RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 400dip, 80dip)";
_p.SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (80)));
RDebugUtils.currentLine=3997703;
 //BA.debugLineNum = 3997703;BA.debugLine="p.LoadLayout(\"cellitem\")";
_p.LoadLayout("cellitem",ba);
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="ivScreenshot.SetBitmap(screenshot)";
__ref._ivscreenshot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((javafx.scene.image.Image)(_screenshot.getObject()));
RDebugUtils.currentLine=3997705;
 //BA.debugLineNum = 3997705;BA.debugLine="Dim dayname As String";
_dayname = "";
RDebugUtils.currentLine=3997706;
 //BA.debugLineNum = 3997706;BA.debugLine="dayname = ConvertDayName(fileinfo)";
_dayname = __ref._convertdayname /*String*/ (null,_fileinfo);
RDebugUtils.currentLine=3997707;
 //BA.debugLineNum = 3997707;BA.debugLine="If watched<>\"true\" Then";
if ((_watched).equals("true") == false) { 
RDebugUtils.currentLine=3997708;
 //BA.debugLineNum = 3997708;BA.debugLine="ivWatched.Visible = True";
__ref._ivwatched /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=3997709;
 //BA.debugLineNum = 3997709;BA.debugLine="lblDate.Text = \"   \" & dayname & \" \" & ConvertD";
__ref._lbldate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("   "+_dayname+" "+__ref._convertdatetimeperiod /*String*/ (null,_fileinfo,_dayname));
 }else {
RDebugUtils.currentLine=3997711;
 //BA.debugLineNum = 3997711;BA.debugLine="ivWatched.Visible = False";
__ref._ivwatched /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=3997712;
 //BA.debugLineNum = 3997712;BA.debugLine="lblDate.Text = \"   \" & dayname";
__ref._lbldate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("   "+_dayname);
 };
RDebugUtils.currentLine=3997714;
 //BA.debugLineNum = 3997714;BA.debugLine="lblFileInfo.Text = \"   \" & ConvertFullDateTime(f";
__ref._lblfileinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("   "+__ref._convertfulldatetime /*String*/ (null,_fileinfo));
RDebugUtils.currentLine=3997715;
 //BA.debugLineNum = 3997715;BA.debugLine="lblDeviceInfo.Text = \"   \" & devicename";
__ref._lbldeviceinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("   "+_devicename);
RDebugUtils.currentLine=3997716;
 //BA.debugLineNum = 3997716;BA.debugLine="ivWatched.SetBitmap(fx.LoadImage(File.DirAssets,";
__ref._ivwatched /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((javafx.scene.image.Image)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(__c.File.getDirAssets(),"blink_clip_roll_blue_dot_icon.png").getObject()));
RDebugUtils.currentLine=3997717;
 //BA.debugLineNum = 3997717;BA.debugLine="Return p";
if (true) return _p;
 } 
       catch (Exception e20) {
			ba.setLastException(e20);RDebugUtils.currentLine=3997719;
 //BA.debugLineNum = 3997719;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
RDebugUtils.currentLine=3997720;
 //BA.debugLineNum = 3997720;BA.debugLine="cutils.ShowNotification(\"Catanaoan Blink XT2 Cam";
__ref._cutils /*anywheresoftware.b4j.objects.ControlsUtils*/ .ShowNotification("Catanaoan Blink XT2 Cameras v1.0","CreateListItem: "+BA.ObjectToString(__c.LastException(ba)),__ref._cutils /*anywheresoftware.b4j.objects.ControlsUtils*/ .ICON_ERROR);
RDebugUtils.currentLine=3997721;
 //BA.debugLineNum = 3997721;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Null));
 };
RDebugUtils.currentLine=3997724;
 //BA.debugLineNum = 3997724;BA.debugLine="End Sub";
return null;
}
public String  _frm_closerequest(cloyd.blink.frmactivity __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="wvMedia.LoadUrl(\"\")";
__ref._wvmedia /*anywheresoftware.b4j.objects.WebViewWrapper*/ .LoadUrl("");
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="wvMedia.RemoveNodeFromParent";
__ref._wvmedia /*anywheresoftware.b4j.objects.WebViewWrapper*/ .RemoveNodeFromParent();
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
__c.File.Delete(__c.File.getDirApp(),"screenshot.jpg");
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
__c.File.Delete(__c.File.getDirApp(),"media.mp4");
RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="End Sub";
return "";
}
public void  _getvideos(cloyd.blink.frmactivity __ref,String _json,String _userregion) throws Exception{
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "getvideos", false))
	 {Debug.delegate(ba, "getvideos", new Object[] {_json,_userregion}); return;}
ResumableSub_GetVideos rsub = new ResumableSub_GetVideos(this,__ref,_json,_userregion);
rsub.resume(ba, null);
}
public static class ResumableSub_GetVideos extends BA.ResumableSub {
public ResumableSub_GetVideos(cloyd.blink.frmactivity parent,cloyd.blink.frmactivity __ref,String _json,String _userregion) {
this.parent = parent;
this.__ref = __ref;
this._json = _json;
this._userregion = _userregion;
this.__ref = parent;
}
cloyd.blink.frmactivity __ref;
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
RDebugUtils.currentModule="frmactivity";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="Try";
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
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="Dim media As List = root.Get(\"media\")";
_media = new anywheresoftware.b4a.objects.collections.List();
_media = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("media"))));
RDebugUtils.currentLine=3866634;
 //BA.debugLineNum = 3866634;BA.debugLine="kvs.Initialize(File.DirApp, \"datastore\")";
__ref._kvs /*cloyd.blink.keyvaluestore*/ ._initialize /*String*/ (null,ba,parent.__c.File.getDirApp(),"datastore");
RDebugUtils.currentLine=3866636;
 //BA.debugLineNum = 3866636;BA.debugLine="B4XLoadingIndicator1.Show";
__ref._b4xloadingindicator1 /*cloyd.blink.b4xloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=3866637;
 //BA.debugLineNum = 3866637;BA.debugLine="For Each colmedia As Map In media";
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
RDebugUtils.currentLine=3866638;
 //BA.debugLineNum = 3866638;BA.debugLine="Dim thumbnail As String = colmedia.Get(\"thumbna";
_thumbnail = BA.ObjectToString(_colmedia.Get((Object)("thumbnail")));
RDebugUtils.currentLine=3866641;
 //BA.debugLineNum = 3866641;BA.debugLine="Dim created_at As String = colmedia.Get(\"create";
_created_at = BA.ObjectToString(_colmedia.Get((Object)("created_at")));
RDebugUtils.currentLine=3866646;
 //BA.debugLineNum = 3866646;BA.debugLine="Dim device_name As String = colmedia.Get(\"devic";
_device_name = BA.ObjectToString(_colmedia.Get((Object)("device_name")));
RDebugUtils.currentLine=3866648;
 //BA.debugLineNum = 3866648;BA.debugLine="Dim watched As String = colmedia.Get(\"watched\")";
_watched = BA.ObjectToString(_colmedia.Get((Object)("watched")));
RDebugUtils.currentLine=3866651;
 //BA.debugLineNum = 3866651;BA.debugLine="Dim VideoID As String = colmedia.Get(\"id\")";
_videoid = BA.ObjectToString(_colmedia.Get((Object)("id")));
RDebugUtils.currentLine=3866656;
 //BA.debugLineNum = 3866656;BA.debugLine="Dim medianame As String = colmedia.Get(\"media\")";
_medianame = BA.ObjectToString(_colmedia.Get((Object)("media")));
RDebugUtils.currentLine=3866662;
 //BA.debugLineNum = 3866662;BA.debugLine="If kvs.ContainsKey(VideoID) = False Then";
if (true) break;

case 7:
//if
this.state = 24;
if (__ref._kvs /*cloyd.blink.keyvaluestore*/ ._containskey /*boolean*/ (null,_videoid)==parent.__c.False) { 
this.state = 9;
}else {
this.state = 15;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=3866663;
 //BA.debugLineNum = 3866663;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
RDebugUtils.currentLine=3866664;
 //BA.debugLineNum = 3866664;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=3866665;
 //BA.debugLineNum = 3866665;BA.debugLine="j.Download(\"https://rest-\" & userRegion &\".imm";
_j._download /*String*/ (null,"https://rest-"+_userregion+".immedia-semi.com"+_thumbnail+".jpg");
RDebugUtils.currentLine=3866666;
 //BA.debugLineNum = 3866666;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("TOKEN_AUTH",__ref._authtoken /*String*/ );
RDebugUtils.currentLine=3866667;
 //BA.debugLineNum = 3866667;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frmactivity", "getvideos"), (Object)(_j));
this.state = 51;
return;
case 51:
//C
this.state = 10;
_j = (cloyd.blink.httpjob) result[1];
;
RDebugUtils.currentLine=3866668;
 //BA.debugLineNum = 3866668;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=3866669;
 //BA.debugLineNum = 3866669;BA.debugLine="Dim image As B4XBitmap = j.GetBitmap";
_image = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_image = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (javafx.scene.image.Image)(_j._getbitmap /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ (null).getObject()));
RDebugUtils.currentLine=3866671;
 //BA.debugLineNum = 3866671;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=3866672;
 //BA.debugLineNum = 3866672;BA.debugLine="out.InitializeToBytesArray(0)";
_out.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=3866673;
 //BA.debugLineNum = 3866673;BA.debugLine="image.WriteToStream(out, 100, \"JPEG\")";
_image.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),"JPEG");
RDebugUtils.currentLine=3866674;
 //BA.debugLineNum = 3866674;BA.debugLine="kvs.Put(VideoID, CreateCustomType(medianame,c";
__ref._kvs /*cloyd.blink.keyvaluestore*/ ._put /*String*/ (null,_videoid,(Object)(__ref._createcustomtype /*cloyd.blink.frmactivity._videoinfo*/ (null,_medianame,_created_at,_watched,_device_name,_videoid,_out.ToBytesArray())));
RDebugUtils.currentLine=3866675;
 //BA.debugLineNum = 3866675;BA.debugLine="out.Close";
_out.Close();
 if (true) break;

case 13:
//C
this.state = 24;
;
RDebugUtils.currentLine=3866677;
 //BA.debugLineNum = 3866677;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=3866679;
 //BA.debugLineNum = 3866679;BA.debugLine="Dim mytypes As Object = kvs.Get(VideoID)";
_mytypes = __ref._kvs /*cloyd.blink.keyvaluestore*/ ._get /*Object*/ (null,_videoid);
RDebugUtils.currentLine=3866680;
 //BA.debugLineNum = 3866680;BA.debugLine="Dim videos = mytypes As VideoInfo";
_videos = (cloyd.blink.frmactivity._videoinfo)(_mytypes);
RDebugUtils.currentLine=3866681;
 //BA.debugLineNum = 3866681;BA.debugLine="If (videos = Null) Or (watched <> videos.Watch";
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
RDebugUtils.currentLine=3866682;
 //BA.debugLineNum = 3866682;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
RDebugUtils.currentLine=3866683;
 //BA.debugLineNum = 3866683;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=3866684;
 //BA.debugLineNum = 3866684;BA.debugLine="j.Download(\"https://rest-\" & userRegion &\".im";
_j._download /*String*/ (null,"https://rest-"+_userregion+".immedia-semi.com"+_thumbnail+".jpg");
RDebugUtils.currentLine=3866685;
 //BA.debugLineNum = 3866685;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToke";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("TOKEN_AUTH",__ref._authtoken /*String*/ );
RDebugUtils.currentLine=3866686;
 //BA.debugLineNum = 3866686;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frmactivity", "getvideos"), (Object)(_j));
this.state = 52;
return;
case 52:
//C
this.state = 19;
_j = (cloyd.blink.httpjob) result[1];
;
RDebugUtils.currentLine=3866687;
 //BA.debugLineNum = 3866687;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=3866688;
 //BA.debugLineNum = 3866688;BA.debugLine="Dim image As B4XBitmap = j.GetBitmap";
_image = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_image = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (javafx.scene.image.Image)(_j._getbitmap /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ (null).getObject()));
RDebugUtils.currentLine=3866690;
 //BA.debugLineNum = 3866690;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=3866691;
 //BA.debugLineNum = 3866691;BA.debugLine="out.InitializeToBytesArray(0)";
_out.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=3866692;
 //BA.debugLineNum = 3866692;BA.debugLine="image.WriteToStream(out, 100, \"JPEG\")";
_image.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),"JPEG");
RDebugUtils.currentLine=3866693;
 //BA.debugLineNum = 3866693;BA.debugLine="kvs.Put(VideoID, CreateCustomType(medianame,";
__ref._kvs /*cloyd.blink.keyvaluestore*/ ._put /*String*/ (null,_videoid,(Object)(__ref._createcustomtype /*cloyd.blink.frmactivity._videoinfo*/ (null,_medianame,_created_at,_watched,_device_name,_videoid,_out.ToBytesArray())));
RDebugUtils.currentLine=3866694;
 //BA.debugLineNum = 3866694;BA.debugLine="out.Close";
_out.Close();
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=3866696;
 //BA.debugLineNum = 3866696;BA.debugLine="j.Release";
_j._release /*String*/ (null);
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
RDebugUtils.currentLine=3866701;
 //BA.debugLineNum = 3866701;BA.debugLine="Dim list1 As List = kvs.ListKeys";
_list1 = new anywheresoftware.b4a.objects.collections.List();
_list1 = __ref._kvs /*cloyd.blink.keyvaluestore*/ ._listkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=3866702;
 //BA.debugLineNum = 3866702;BA.debugLine="For i =  0 To list1.Size-1";
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
RDebugUtils.currentLine=3866703;
 //BA.debugLineNum = 3866703;BA.debugLine="If i > 99 Then";
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
RDebugUtils.currentLine=3866704;
 //BA.debugLineNum = 3866704;BA.debugLine="kvs.Remove(list1.Get(i))";
__ref._kvs /*cloyd.blink.keyvaluestore*/ ._remove /*String*/ (null,BA.ObjectToString(_list1.Get(_i)));
 if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=3866706;
 //BA.debugLineNum = 3866706;BA.debugLine="Dim mytypes As Object = kvs.Get(list1.Get(i))";
_mytypes = __ref._kvs /*cloyd.blink.keyvaluestore*/ ._get /*Object*/ (null,BA.ObjectToString(_list1.Get(_i)));
RDebugUtils.currentLine=3866707;
 //BA.debugLineNum = 3866707;BA.debugLine="Dim videos = mytypes As VideoInfo";
_videos = (cloyd.blink.frmactivity._videoinfo)(_mytypes);
RDebugUtils.currentLine=3866709;
 //BA.debugLineNum = 3866709;BA.debugLine="Log(\"kvs.ListKeys \" & i & \" | \" & videos.Video";
parent.__c.Log("kvs.ListKeys "+BA.NumberToString(_i)+" | "+_videos.VideoID /*String*/ +" | "+_videos.Watched /*String*/ +" | "+_videos.DateCreated /*String*/ );
RDebugUtils.currentLine=3866711;
 //BA.debugLineNum = 3866711;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=3866712;
 //BA.debugLineNum = 3866712;BA.debugLine="In.InitializeFromBytesArray(videos.ThumbnailBL";
_in.InitializeFromBytesArray(_videos.ThumbnailBLOB /*byte[]*/ ,(int) (0),_videos.ThumbnailBLOB /*byte[]*/ .length);
RDebugUtils.currentLine=3866713;
 //BA.debugLineNum = 3866713;BA.debugLine="Dim bmp As Image";
_bmp = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=3866714;
 //BA.debugLineNum = 3866714;BA.debugLine="bmp.Initialize2(In)";
_bmp.Initialize2((java.io.InputStream)(_in.getObject()));
RDebugUtils.currentLine=3866716;
 //BA.debugLineNum = 3866716;BA.debugLine="Dim p As B4XView = CreateListItem(bmp,videos.D";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._createlistitem /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (javafx.scene.image.Image)(_bmp.getObject())),_videos.DateCreated /*String*/ ,_videos.DeviceName /*String*/ ,_watched);
RDebugUtils.currentLine=3866717;
 //BA.debugLineNum = 3866717;BA.debugLine="clvActivity.Add(p,\"https://rest-\" & userRegion";
__ref._clvactivity /*b4j.example.customlistview*/ ._add(_p,(Object)("https://rest-"+_userregion+".immedia-semi.com"+_videos.ThumbnailPath /*String*/ +"|"+_videos.DeviceName /*String*/ +" "+__ref._convertfulldatetime /*String*/ (null,_videos.DateCreated /*String*/ )));
RDebugUtils.currentLine=3866718;
 //BA.debugLineNum = 3866718;BA.debugLine="If videos.Watched <> \"true\" Then";
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
RDebugUtils.currentLine=3866719;
 //BA.debugLineNum = 3866719;BA.debugLine="ivWatched.Visible = True";
__ref._ivwatched /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.True);
 if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=3866721;
 //BA.debugLineNum = 3866721;BA.debugLine="ivWatched.Visible = False";
__ref._ivwatched /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.False);
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
RDebugUtils.currentLine=3866725;
 //BA.debugLineNum = 3866725;BA.debugLine="B4XLoadingIndicator1.Hide";
__ref._b4xloadingindicator1 /*cloyd.blink.b4xloadingindicator*/ ._hide /*String*/ (null);
RDebugUtils.currentLine=3866726;
 //BA.debugLineNum = 3866726;BA.debugLine="If list1.Size > 0 Then";
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
RDebugUtils.currentLine=3866727;
 //BA.debugLineNum = 3866727;BA.debugLine="clvActivity.JumpToItem(0)";
__ref._clvactivity /*b4j.example.customlistview*/ ._jumptoitem((int) (0));
RDebugUtils.currentLine=3866728;
 //BA.debugLineNum = 3866728;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frmactivity", "getvideos"),(int) (100));
this.state = 55;
return;
case 55:
//C
this.state = 45;
;
RDebugUtils.currentLine=3866729;
 //BA.debugLineNum = 3866729;BA.debugLine="clvActivity_ItemClick(0,\"\") '\"https://rest-\" &";
__ref._clvactivity_itemclick /*String*/ (null,(int) (0),(Object)(""));
RDebugUtils.currentLine=3866730;
 //BA.debugLineNum = 3866730;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frmactivity", "getvideos"),(int) (100));
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
RDebugUtils.currentLine=3866733;
 //BA.debugLineNum = 3866733;BA.debugLine="B4XLoadingIndicator1.Hide";
__ref._b4xloadingindicator1 /*cloyd.blink.b4xloadingindicator*/ ._hide /*String*/ (null);
RDebugUtils.currentLine=3866734;
 //BA.debugLineNum = 3866734;BA.debugLine="Log(LastException)";
parent.__c.Log(BA.ObjectToString(parent.__c.LastException(ba)));
RDebugUtils.currentLine=3866735;
 //BA.debugLineNum = 3866735;BA.debugLine="cutils.ShowNotification(\"Catanaoan Blink XT2 Cam";
__ref._cutils /*anywheresoftware.b4j.objects.ControlsUtils*/ .ShowNotification("Catanaoan Blink XT2 Cameras v1.0","GetVideos: "+BA.ObjectToString(parent.__c.LastException(ba)),__ref._cutils /*anywheresoftware.b4j.objects.ControlsUtils*/ .ICON_ERROR);
 if (true) break;
if (true) break;

case 48:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=3866737;
 //BA.debugLineNum = 3866737;BA.debugLine="End Sub";
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
public String  _rootpanekeyevent_event(cloyd.blink.frmactivity __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "rootpanekeyevent_event", false))
	 {return ((String) Debug.delegate(ba, "rootpanekeyevent_event", new Object[] {_e}));}
anywheresoftware.b4j.agraham.reflection.Reflection _ke = null;
String _scode = "";
String _stype = "";
int _result = 0;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Private Sub RootPaneKeyEvent_Event(e As Event)";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Dim KE As Reflector";
_ke = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="Dim sCode As String";
_scode = "";
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="Dim sType As String 'ignore";
_stype = "";
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="Dim result As Int 'ignore";
_result = 0;
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="KE.Target = e	 ' e is a KeyEvent instance";
_ke.Target = (Object)(_e.getObject());
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="sCode = KE.RunMethod(\"getCode\")";
_scode = BA.ObjectToString(_ke.RunMethod("getCode"));
RDebugUtils.currentLine=4521991;
 //BA.debugLineNum = 4521991;BA.debugLine="sType = KE.RunMethod(\"getEventType\")";
_stype = BA.ObjectToString(_ke.RunMethod("getEventType"));
RDebugUtils.currentLine=4521992;
 //BA.debugLineNum = 4521992;BA.debugLine="If sCode=\"ESCAPE\" Then";
if ((_scode).equals("ESCAPE")) { 
RDebugUtils.currentLine=4521993;
 //BA.debugLineNum = 4521993;BA.debugLine="wvMedia.LoadUrl(\"\")";
__ref._wvmedia /*anywheresoftware.b4j.objects.WebViewWrapper*/ .LoadUrl("");
RDebugUtils.currentLine=4521994;
 //BA.debugLineNum = 4521994;BA.debugLine="wvMedia.RemoveNodeFromParent";
__ref._wvmedia /*anywheresoftware.b4j.objects.WebViewWrapper*/ .RemoveNodeFromParent();
RDebugUtils.currentLine=4521995;
 //BA.debugLineNum = 4521995;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
__c.File.Delete(__c.File.getDirApp(),"screenshot.jpg");
RDebugUtils.currentLine=4521996;
 //BA.debugLineNum = 4521996;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
__c.File.Delete(__c.File.getDirApp(),"media.mp4");
RDebugUtils.currentLine=4521997;
 //BA.debugLineNum = 4521997;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
 };
RDebugUtils.currentLine=4521999;
 //BA.debugLineNum = 4521999;BA.debugLine="End Sub";
return "";
}
public String  _wvmedia_pagefinished(cloyd.blink.frmactivity __ref,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "wvmedia_pagefinished", false))
	 {return ((String) Debug.delegate(ba, "wvmedia_pagefinished", new Object[] {_url}));}
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Sub wvMedia_PageFinished (Url As String)";
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="End Sub";
return "";
}
}