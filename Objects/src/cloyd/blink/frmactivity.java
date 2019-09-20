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
public String  _initialize(cloyd.blink.frmactivity __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
anywheresoftware.b4j.agraham.reflection.Reflection _obj = null;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Public Sub Initialize(Parent As Form)";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="frm.Initialize(\"frm\", 600dip, 600dip)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",__c.DipToCurrent((int) (600)),__c.DipToCurrent((int) (600)));
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .SetFormStyle("UTILITY");
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="frm.RootPane.LoadLayout(\"activity\")";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"activity");
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="frm.Icon = fx.LoadImage(File.DirAssets, \"home.png";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(__c.File.getDirAssets(),"home.png").getObject()));
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="frm.Title = \"Catanaoan Blink XT2 Cameras Activity";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle("Catanaoan Blink XT2 Cameras Activity Viewer");
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="frm.SetOwner(Parent)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .SetOwner(_parent);
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="frm.WindowWidth = CheckMonitor.MaxX - CheckMonito";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowWidth(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMaxX()-__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinX());
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="frm.WindowLeft = CheckMonitor.MinX";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowLeft(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinX());
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="frm.WindowHeight = CheckMonitor.MaxY - CheckMonit";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowHeight(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMaxY()-__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinY());
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="frm.WindowTop = CheckMonitor.MinY";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowTop(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinY());
RDebugUtils.currentLine=3145739;
 //BA.debugLineNum = 3145739;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=3145740;
 //BA.debugLineNum = 3145740;BA.debugLine="Obj.Target = frm.RootPane";
_obj.Target = (Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject());
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="Obj.AddEventHandler(\"RootPaneKeyEvent\", \"javafx.s";
_obj.AddEventHandler(ba,"RootPaneKeyEvent","javafx.scene.input.KeyEvent.ANY");
RDebugUtils.currentLine=3145742;
 //BA.debugLineNum = 3145742;BA.debugLine="End Sub";
return "";
}
public String  _show(cloyd.blink.frmactivity __ref,String _json,String _userregion) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_json,_userregion}));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Public Sub Show(json As String, userRegion As Stri";
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="GetVideos(json, userRegion)";
__ref._getvideos /*void*/ (null,_json,_userregion);
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="frm.ShowAndWait";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .ShowAndWait();
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.JFX.ScreenWrapper  _checkmonitor(cloyd.blink.frmactivity __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "checkmonitor", false))
	 {return ((anywheresoftware.b4j.objects.JFX.ScreenWrapper) Debug.delegate(ba, "checkmonitor", null));}
anywheresoftware.b4a.objects.collections.List _slist = null;
anywheresoftware.b4j.objects.JFX.ScreenWrapper _s = null;
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub CheckMonitor() As Screen";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Try";
try {RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="If fx.Screens.Size= 1 Then";
if (__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens().getSize()==1) { 
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=3670022;
 //BA.debugLineNum = 3670022;BA.debugLine="Return S";
if (true) return _s;
 }else 
{RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="Else If fx.Screens.Size> 1 Then";
if (__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens().getSize()>1) { 
RDebugUtils.currentLine=3670024;
 //BA.debugLineNum = 3670024;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=3670025;
 //BA.debugLineNum = 3670025;BA.debugLine="Dim S As Screen = SList.Get(2)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (2))));
RDebugUtils.currentLine=3670027;
 //BA.debugLineNum = 3670027;BA.debugLine="Return S";
if (true) return _s;
 }else {
RDebugUtils.currentLine=3670029;
 //BA.debugLineNum = 3670029;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=3670030;
 //BA.debugLineNum = 3670030;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=3670032;
 //BA.debugLineNum = 3670032;BA.debugLine="Return S";
if (true) return _s;
 }}
;
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=3670035;
 //BA.debugLineNum = 3670035;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=3670036;
 //BA.debugLineNum = 3670036;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=3670038;
 //BA.debugLineNum = 3670038;BA.debugLine="Return S";
if (true) return _s;
 };
RDebugUtils.currentLine=3670040;
 //BA.debugLineNum = 3670040;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(cloyd.blink.frmactivity __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="Public jsonMain As String";
_jsonmain = "";
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="Private ivScreenshot As B4XView";
_ivscreenshot = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="Private lblFileInfo As B4XView";
_lblfileinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="Private lblDeviceInfo As B4XView";
_lbldeviceinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="Private clvActivity As CustomListView";
_clvactivity = new b4j.example.customlistview();
RDebugUtils.currentLine=3080201;
 //BA.debugLineNum = 3080201;BA.debugLine="Public authToken As String";
_authtoken = "";
RDebugUtils.currentLine=3080202;
 //BA.debugLineNum = 3080202;BA.debugLine="Private wvMedia As WebView";
_wvmedia = new anywheresoftware.b4j.objects.WebViewWrapper();
RDebugUtils.currentLine=3080203;
 //BA.debugLineNum = 3080203;BA.debugLine="Private lblDate As B4XView";
_lbldate = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3080204;
 //BA.debugLineNum = 3080204;BA.debugLine="Private lblTimestamp As Label";
_lbltimestamp = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=3080205;
 //BA.debugLineNum = 3080205;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub clvActivity_ItemClick (Index As Int, Value As";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Try";
try {RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="wvMedia.LoadUrl(\"\")";
__ref._wvmedia /*anywheresoftware.b4j.objects.WebViewWrapper*/ .LoadUrl("");
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="Dim video As String";
_video = "";
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="video = clvActivity.GetValue(Index)";
_video = BA.ObjectToString(__ref._clvactivity /*b4j.example.customlistview*/ ._getvalue(_index));
RDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="Dim videoURL As String = Regex.Split(\"\\|\",video)";
_videourl = __c.Regex.Split("\\|",_video)[(int) (0)];
RDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="Dim videoTimestamp As String = Regex.Split(\"\\|\",";
_videotimestamp = __c.Regex.Split("\\|",_video)[(int) (1)];
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="ShowVideo(videoURL,videoTimestamp)";
__ref._showvideo /*void*/ (null,_videourl,_videotimestamp);
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=3735561;
 //BA.debugLineNum = 3735561;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
RDebugUtils.currentLine=3735562;
 //BA.debugLineNum = 3735562;BA.debugLine="fx.Msgbox2(frm,LastException,\"clvActivity ItemCl";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Msgbox2(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,BA.ObjectToString(__c.LastException(ba)),"clvActivity ItemClick Exception","OK","","",__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .MSGBOX_ERROR);
 };
RDebugUtils.currentLine=3735565;
 //BA.debugLineNum = 3735565;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Try";
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
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="j.Download(Link)";
_j._download /*String*/ (null,_link);
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("TOKEN_AUTH",__ref._authtoken /*String*/ );
RDebugUtils.currentLine=3473414;
 //BA.debugLineNum = 3473414;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frmactivity", "showvideo"), (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[1];
;
RDebugUtils.currentLine=3473415;
 //BA.debugLineNum = 3473415;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=3473417;
 //BA.debugLineNum = 3473417;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File.";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = parent.__c.File.OpenOutput(parent.__c.File.getDirApp(),"media.mp4",parent.__c.False);
RDebugUtils.currentLine=3473418;
 //BA.debugLineNum = 3473418;BA.debugLine="File.Copy2(j.GetInputStream, out)";
parent.__c.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=3473419;
 //BA.debugLineNum = 3473419;BA.debugLine="out.Close '<------ very important";
_out.Close();
RDebugUtils.currentLine=3473421;
 //BA.debugLineNum = 3473421;BA.debugLine="lblTimestamp.Text= timestamp";
__ref._lbltimestamp /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_timestamp);
RDebugUtils.currentLine=3473422;
 //BA.debugLineNum = 3473422;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=3473423;
 //BA.debugLineNum = 3473423;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=3473424;
 //BA.debugLineNum = 3473424;BA.debugLine="sb.Append(\"<video width='100%' height='100%' co";
_sb.Append("<video width='100%' height='100%' controls autoplay>");
RDebugUtils.currentLine=3473425;
 //BA.debugLineNum = 3473425;BA.debugLine="sb.Append(\"<source src='\" & File.GetUri(File.Di";
_sb.Append("<source src='"+parent.__c.File.GetUri(parent.__c.File.getDirApp(),"media.mp4")+"' Type='video/mp4'/>");
RDebugUtils.currentLine=3473426;
 //BA.debugLineNum = 3473426;BA.debugLine="sb.Append(\"</video>\")";
_sb.Append("</video>");
RDebugUtils.currentLine=3473428;
 //BA.debugLineNum = 3473428;BA.debugLine="wvMedia.LoadHtml(sb.ToString)";
__ref._wvmedia /*anywheresoftware.b4j.objects.WebViewWrapper*/ .LoadHtml(_sb.ToString());
 if (true) break;

case 8:
//C
this.state = 9;
 if (true) break;

case 9:
//C
this.state = 12;
;
RDebugUtils.currentLine=3473432;
 //BA.debugLineNum = 3473432;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=3473434;
 //BA.debugLineNum = 3473434;BA.debugLine="Log(LastException)";
parent.__c.Log(BA.ObjectToString(parent.__c.LastException(ba)));
RDebugUtils.currentLine=3473435;
 //BA.debugLineNum = 3473435;BA.debugLine="fx.Msgbox2(frm,LastException,\"ShowVideo Exceptio";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Msgbox2(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,BA.ObjectToString(parent.__c.LastException(ba)),"ShowVideo Exception","OK","","",__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .MSGBOX_ERROR);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=3473437;
 //BA.debugLineNum = 3473437;BA.debugLine="End Sub";
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
public String  _convertdatetime(cloyd.blink.frmactivity __ref,String _inputtime) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "convertdatetime", false))
	 {return ((String) Debug.delegate(ba, "convertdatetime", new Object[] {_inputtime}));}
long _ticks = 0L;
long _lngticks = 0L;
b4j.example.dateutils._period _p = null;
RDebugUtils.currentLine=25624576;
 //BA.debugLineNum = 25624576;BA.debugLine="Sub ConvertDateTime(inputTime As String) As String";
RDebugUtils.currentLine=25624578;
 //BA.debugLineNum = 25624578;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = __ref._parseutcstring /*long*/ (null,_inputtime.replace("+00:00","+0000"));
RDebugUtils.currentLine=25624579;
 //BA.debugLineNum = 25624579;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a z\"";
__c.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a z");
RDebugUtils.currentLine=25624580;
 //BA.debugLineNum = 25624580;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
RDebugUtils.currentLine=25624581;
 //BA.debugLineNum = 25624581;BA.debugLine="Dim p As Period = DateUtils.PeriodBetween(lngTick";
_p = _dateutils._periodbetween(_lngticks,__c.DateTime.getNow());
RDebugUtils.currentLine=25624583;
 //BA.debugLineNum = 25624583;BA.debugLine="Return p.Days & \"d \" & p.Hours & \"h \" & p.Minutes";
if (true) return BA.NumberToString(_p.Days)+"d "+BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
RDebugUtils.currentLine=25624584;
 //BA.debugLineNum = 25624584;BA.debugLine="End Sub";
return "";
}
public long  _parseutcstring(cloyd.blink.frmactivity __ref,String _utc) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "parseutcstring", false))
	 {return ((Long) Debug.delegate(ba, "parseutcstring", new Object[] {_utc}));}
String _df = "";
long _res = 0L;
RDebugUtils.currentLine=25690112;
 //BA.debugLineNum = 25690112;BA.debugLine="Sub ParseUTCstring(utc As String) As Long";
RDebugUtils.currentLine=25690113;
 //BA.debugLineNum = 25690113;BA.debugLine="Dim df As String = DateTime.DateFormat";
_df = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=25690114;
 //BA.debugLineNum = 25690114;BA.debugLine="Dim res As Long";
_res = 0L;
RDebugUtils.currentLine=25690115;
 //BA.debugLineNum = 25690115;BA.debugLine="If utc.CharAt(10) = \"T\" Then";
if (_utc.charAt((int) (10))==BA.ObjectToChar("T")) { 
RDebugUtils.currentLine=25690117;
 //BA.debugLineNum = 25690117;BA.debugLine="If utc.CharAt(19) = \".\" Then utc = utc.SubString";
if (_utc.charAt((int) (19))==BA.ObjectToChar(".")) { 
_utc = _utc.substring((int) (0),(int) (19))+"+0000";};
RDebugUtils.currentLine=25690118;
 //BA.debugLineNum = 25690118;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd'T'HH:mm:ssZ\"";
__c.DateTime.setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
 }else {
RDebugUtils.currentLine=25690121;
 //BA.debugLineNum = 25690121;BA.debugLine="DateTime.DateFormat = \"EEE MMM dd HH:mm:ss Z yyy";
__c.DateTime.setDateFormat("EEE MMM dd HH:mm:ss Z yyyy");
 };
RDebugUtils.currentLine=25690123;
 //BA.debugLineNum = 25690123;BA.debugLine="Try";
try {RDebugUtils.currentLine=25690124;
 //BA.debugLineNum = 25690124;BA.debugLine="res = DateTime.DateParse(utc)";
_res = __c.DateTime.DateParse(_utc);
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=25690126;
 //BA.debugLineNum = 25690126;BA.debugLine="res = 0";
_res = (long) (0);
 };
RDebugUtils.currentLine=25690128;
 //BA.debugLineNum = 25690128;BA.debugLine="DateTime.DateFormat = df";
__c.DateTime.setDateFormat(_df);
RDebugUtils.currentLine=25690129;
 //BA.debugLineNum = 25690129;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=25690130;
 //BA.debugLineNum = 25690130;BA.debugLine="End Sub";
return 0L;
}
public String  _convertfulldatetime(cloyd.blink.frmactivity __ref,String _inputtime) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "convertfulldatetime", false))
	 {return ((String) Debug.delegate(ba, "convertfulldatetime", new Object[] {_inputtime}));}
long _ticks = 0L;
long _lngticks = 0L;
RDebugUtils.currentLine=26083328;
 //BA.debugLineNum = 26083328;BA.debugLine="Sub ConvertFullDateTime(inputTime As String) As St";
RDebugUtils.currentLine=26083330;
 //BA.debugLineNum = 26083330;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = __ref._parseutcstring /*long*/ (null,_inputtime.replace("+00:00","+0000"));
RDebugUtils.currentLine=26083331;
 //BA.debugLineNum = 26083331;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a z\"";
__c.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a z");
RDebugUtils.currentLine=26083332;
 //BA.debugLineNum = 26083332;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
RDebugUtils.currentLine=26083335;
 //BA.debugLineNum = 26083335;BA.debugLine="Return DateTime.Date(lngTicks)";
if (true) return __c.DateTime.Date(_lngticks);
RDebugUtils.currentLine=26083336;
 //BA.debugLineNum = 26083336;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlistitem(cloyd.blink.frmactivity __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _screenshot,String _fileinfo,String _devicename) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "createlistitem", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlistitem", new Object[] {_screenshot,_fileinfo,_devicename}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub CreateListItem(screenshot As B4XBitmap, filein";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Try";
try {RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 400dip, 80dip)";
_p.SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (80)));
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="p.LoadLayout(\"cellitem\")";
_p.LoadLayout("cellitem",ba);
RDebugUtils.currentLine=3342344;
 //BA.debugLineNum = 3342344;BA.debugLine="ivScreenshot.SetBitmap(screenshot)";
__ref._ivscreenshot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((javafx.scene.image.Image)(_screenshot.getObject()));
RDebugUtils.currentLine=3342345;
 //BA.debugLineNum = 3342345;BA.debugLine="lblFileInfo.Text = \"   \" & ConvertDateTime(filei";
__ref._lblfileinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("   "+__ref._convertdatetime /*String*/ (null,_fileinfo));
RDebugUtils.currentLine=3342346;
 //BA.debugLineNum = 3342346;BA.debugLine="lblDeviceInfo.Text = \"   \" & devicename";
__ref._lbldeviceinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("   "+_devicename);
RDebugUtils.currentLine=3342347;
 //BA.debugLineNum = 3342347;BA.debugLine="lblDate.Text = \"   \" & ConvertFullDateTime(filei";
__ref._lbldate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("   "+__ref._convertfulldatetime /*String*/ (null,_fileinfo));
RDebugUtils.currentLine=3342348;
 //BA.debugLineNum = 3342348;BA.debugLine="Return p";
if (true) return _p;
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=3342350;
 //BA.debugLineNum = 3342350;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
RDebugUtils.currentLine=3342351;
 //BA.debugLineNum = 3342351;BA.debugLine="fx.Msgbox2(frm,LastException,\"CreateListItem Exc";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Msgbox2(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,BA.ObjectToString(__c.LastException(ba)),"CreateListItem Exception","OK","","",__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .MSGBOX_ERROR);
RDebugUtils.currentLine=3342352;
 //BA.debugLineNum = 3342352;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Null));
 };
RDebugUtils.currentLine=3342355;
 //BA.debugLineNum = 3342355;BA.debugLine="End Sub";
return null;
}
public String  _frm_closerequest(cloyd.blink.frmactivity __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="wvMedia.LoadUrl(\"\")";
__ref._wvmedia /*anywheresoftware.b4j.objects.WebViewWrapper*/ .LoadUrl("");
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="wvMedia.RemoveNodeFromParent";
__ref._wvmedia /*anywheresoftware.b4j.objects.WebViewWrapper*/ .RemoveNodeFromParent();
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
__c.File.Delete(__c.File.getDirApp(),"screenshot.jpg");
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
__c.File.Delete(__c.File.getDirApp(),"media.mp4");
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="End Sub";
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
String _medianame = "";
cloyd.blink.httpjob _j = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.BA.IterableList group6;
int index6;
int groupLen6;

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
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Try";
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
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="Dim media As List = root.Get(\"media\")";
_media = new anywheresoftware.b4a.objects.collections.List();
_media.setObject((java.util.List)(_root.Get((Object)("media"))));
RDebugUtils.currentLine=3276809;
 //BA.debugLineNum = 3276809;BA.debugLine="For Each colmedia As Map In media";
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
RDebugUtils.currentLine=3276810;
 //BA.debugLineNum = 3276810;BA.debugLine="Dim thumbnail As String = colmedia.Get(\"thumbna";
_thumbnail = BA.ObjectToString(_colmedia.Get((Object)("thumbnail")));
RDebugUtils.currentLine=3276813;
 //BA.debugLineNum = 3276813;BA.debugLine="Dim created_at As String = colmedia.Get(\"create";
_created_at = BA.ObjectToString(_colmedia.Get((Object)("created_at")));
RDebugUtils.currentLine=3276818;
 //BA.debugLineNum = 3276818;BA.debugLine="Dim device_name As String = colmedia.Get(\"devic";
_device_name = BA.ObjectToString(_colmedia.Get((Object)("device_name")));
RDebugUtils.currentLine=3276828;
 //BA.debugLineNum = 3276828;BA.debugLine="Dim medianame As String = colmedia.Get(\"media\")";
_medianame = BA.ObjectToString(_colmedia.Get((Object)("media")));
RDebugUtils.currentLine=3276829;
 //BA.debugLineNum = 3276829;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
RDebugUtils.currentLine=3276830;
 //BA.debugLineNum = 3276830;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=3276831;
 //BA.debugLineNum = 3276831;BA.debugLine="j.Download(\"https://rest-\" & userRegion &\".imme";
_j._download /*String*/ (null,"https://rest-"+_userregion+".immedia-semi.com"+_thumbnail+".jpg");
RDebugUtils.currentLine=3276832;
 //BA.debugLineNum = 3276832;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("TOKEN_AUTH",__ref._authtoken /*String*/ );
RDebugUtils.currentLine=3276833;
 //BA.debugLineNum = 3276833;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frmactivity", "getvideos"), (Object)(_j));
this.state = 23;
return;
case 23:
//C
this.state = 7;
_j = (cloyd.blink.httpjob) result[1];
;
RDebugUtils.currentLine=3276834;
 //BA.debugLineNum = 3276834;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=3276837;
 //BA.debugLineNum = 3276837;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = parent.__c.File.OpenOutput(parent.__c.File.getDirApp(),"screenshot.jpg",parent.__c.False);
RDebugUtils.currentLine=3276838;
 //BA.debugLineNum = 3276838;BA.debugLine="File.Copy2(j.GetInputStream, out)";
parent.__c.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=3276839;
 //BA.debugLineNum = 3276839;BA.debugLine="out.Close '<------ very important";
_out.Close();
RDebugUtils.currentLine=3276843;
 //BA.debugLineNum = 3276843;BA.debugLine="Dim p As B4XView = CreateListItem(j.GetBitmap,";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._createlistitem /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (javafx.scene.image.Image)(_j._getbitmap /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ (null).getObject())),_created_at,_device_name);
RDebugUtils.currentLine=3276844;
 //BA.debugLineNum = 3276844;BA.debugLine="clvActivity.Add(p,\"https://rest-\" & userRegion";
__ref._clvactivity /*b4j.example.customlistview*/ ._add(_p,(Object)("https://rest-"+_userregion+".immedia-semi.com"+_medianame+"|"+_device_name+" "+__ref._convertfulldatetime /*String*/ (null,_created_at)));
RDebugUtils.currentLine=3276845;
 //BA.debugLineNum = 3276845;BA.debugLine="If clvActivity.Size = 1 Then";
if (true) break;

case 10:
//if
this.state = 13;
if (__ref._clvactivity /*b4j.example.customlistview*/ ._getsize()==1) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=3276846;
 //BA.debugLineNum = 3276846;BA.debugLine="ShowVideo(\"https://rest-\" & userRegion &\".imm";
__ref._showvideo /*void*/ (null,"https://rest-"+_userregion+".immedia-semi.com"+_medianame,_device_name+" "+__ref._convertfulldatetime /*String*/ (null,_created_at));
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
RDebugUtils.currentLine=3276851;
 //BA.debugLineNum = 3276851;BA.debugLine="j.Release";
_j._release /*String*/ (null);
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
RDebugUtils.currentLine=3276855;
 //BA.debugLineNum = 3276855;BA.debugLine="Log(LastException)";
parent.__c.Log(BA.ObjectToString(parent.__c.LastException(ba)));
RDebugUtils.currentLine=3276856;
 //BA.debugLineNum = 3276856;BA.debugLine="fx.Msgbox2(frm,LastException,\"GetVideos Exceptio";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Msgbox2(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,BA.ObjectToString(parent.__c.LastException(ba)),"GetVideos Exception","OK","","",__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .MSGBOX_ERROR);
 if (true) break;
if (true) break;

case 20:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=3276858;
 //BA.debugLineNum = 3276858;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Private Sub RootPaneKeyEvent_Event(e As Event)";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Dim KE As Reflector";
_ke = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="Dim sCode As String";
_scode = "";
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="Dim sType As String 'ignore";
_stype = "";
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="Dim result As Int 'ignore";
_result = 0;
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="KE.Target = e	 ' e is a KeyEvent instance";
_ke.Target = (Object)(_e.getObject());
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="sCode = KE.RunMethod(\"getCode\")";
_scode = BA.ObjectToString(_ke.RunMethod("getCode"));
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="sType = KE.RunMethod(\"getEventType\")";
_stype = BA.ObjectToString(_ke.RunMethod("getEventType"));
RDebugUtils.currentLine=3604488;
 //BA.debugLineNum = 3604488;BA.debugLine="If sCode=\"ESCAPE\" Then";
if ((_scode).equals("ESCAPE")) { 
RDebugUtils.currentLine=3604489;
 //BA.debugLineNum = 3604489;BA.debugLine="wvMedia.LoadUrl(\"\")";
__ref._wvmedia /*anywheresoftware.b4j.objects.WebViewWrapper*/ .LoadUrl("");
RDebugUtils.currentLine=3604490;
 //BA.debugLineNum = 3604490;BA.debugLine="wvMedia.RemoveNodeFromParent";
__ref._wvmedia /*anywheresoftware.b4j.objects.WebViewWrapper*/ .RemoveNodeFromParent();
RDebugUtils.currentLine=3604491;
 //BA.debugLineNum = 3604491;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
__c.File.Delete(__c.File.getDirApp(),"screenshot.jpg");
RDebugUtils.currentLine=3604492;
 //BA.debugLineNum = 3604492;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
__c.File.Delete(__c.File.getDirApp(),"media.mp4");
RDebugUtils.currentLine=3604493;
 //BA.debugLineNum = 3604493;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
 };
RDebugUtils.currentLine=3604495;
 //BA.debugLineNum = 3604495;BA.debugLine="End Sub";
return "";
}
public String  _wvmedia_pagefinished(cloyd.blink.frmactivity __ref,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "wvmedia_pagefinished", false))
	 {return ((String) Debug.delegate(ba, "wvmedia_pagefinished", new Object[] {_url}));}
RDebugUtils.currentLine=24576000;
 //BA.debugLineNum = 24576000;BA.debugLine="Sub wvMedia_PageFinished (Url As String)";
RDebugUtils.currentLine=24576002;
 //BA.debugLineNum = 24576002;BA.debugLine="End Sub";
return "";
}
}