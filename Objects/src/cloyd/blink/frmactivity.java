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
public int _previousselectedindex = 0;
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
RDebugUtils.currentLine=24117248;
 //BA.debugLineNum = 24117248;BA.debugLine="Public Sub Initialize(Parent As Form)";
RDebugUtils.currentLine=24117249;
 //BA.debugLineNum = 24117249;BA.debugLine="frm.Initialize(\"frm\", 600dip, 600dip)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",__c.DipToCurrent((int) (600)),__c.DipToCurrent((int) (600)));
RDebugUtils.currentLine=24117250;
 //BA.debugLineNum = 24117250;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .SetFormStyle("UTILITY");
RDebugUtils.currentLine=24117251;
 //BA.debugLineNum = 24117251;BA.debugLine="frm.RootPane.LoadLayout(\"activity\")";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"activity");
RDebugUtils.currentLine=24117252;
 //BA.debugLineNum = 24117252;BA.debugLine="frm.Icon = fx.LoadImage(File.DirAssets, \"home.png";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(__c.File.getDirAssets(),"home.png").getObject()));
RDebugUtils.currentLine=24117253;
 //BA.debugLineNum = 24117253;BA.debugLine="frm.Title = \"Catanaoan Blink XT2 Cameras Activity";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle("Catanaoan Blink XT2 Cameras Activity Viewer");
RDebugUtils.currentLine=24117254;
 //BA.debugLineNum = 24117254;BA.debugLine="frm.SetOwner(Parent)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .SetOwner(_parent);
RDebugUtils.currentLine=24117255;
 //BA.debugLineNum = 24117255;BA.debugLine="frm.WindowWidth = CheckMonitor.MaxX - CheckMonito";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowWidth(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMaxX()-__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinX());
RDebugUtils.currentLine=24117256;
 //BA.debugLineNum = 24117256;BA.debugLine="frm.WindowLeft = CheckMonitor.MinX";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowLeft(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinX());
RDebugUtils.currentLine=24117257;
 //BA.debugLineNum = 24117257;BA.debugLine="frm.WindowHeight = CheckMonitor.MaxY - CheckMonit";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowHeight(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMaxY()-__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinY());
RDebugUtils.currentLine=24117258;
 //BA.debugLineNum = 24117258;BA.debugLine="frm.WindowTop = CheckMonitor.MinY";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowTop(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinY());
RDebugUtils.currentLine=24117259;
 //BA.debugLineNum = 24117259;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=24117260;
 //BA.debugLineNum = 24117260;BA.debugLine="Obj.Target = frm.RootPane";
_obj.Target = (Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject());
RDebugUtils.currentLine=24117261;
 //BA.debugLineNum = 24117261;BA.debugLine="Obj.AddEventHandler(\"RootPaneKeyEvent\", \"javafx.s";
_obj.AddEventHandler(ba,"RootPaneKeyEvent","javafx.scene.input.KeyEvent.ANY");
RDebugUtils.currentLine=24117262;
 //BA.debugLineNum = 24117262;BA.debugLine="End Sub";
return "";
}
public String  _show(cloyd.blink.frmactivity __ref,String _json,String _userregion) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_json,_userregion}));}
RDebugUtils.currentLine=24182784;
 //BA.debugLineNum = 24182784;BA.debugLine="Public Sub Show(json As String, userRegion As Stri";
RDebugUtils.currentLine=24182786;
 //BA.debugLineNum = 24182786;BA.debugLine="GetVideos(json, userRegion)";
__ref._getvideos /*void*/ (null,_json,_userregion);
RDebugUtils.currentLine=24182787;
 //BA.debugLineNum = 24182787;BA.debugLine="frm.ShowAndWait";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .ShowAndWait();
RDebugUtils.currentLine=24182789;
 //BA.debugLineNum = 24182789;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.JFX.ScreenWrapper  _checkmonitor(cloyd.blink.frmactivity __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "checkmonitor", false))
	 {return ((anywheresoftware.b4j.objects.JFX.ScreenWrapper) Debug.delegate(ba, "checkmonitor", null));}
anywheresoftware.b4a.objects.collections.List _slist = null;
anywheresoftware.b4j.objects.JFX.ScreenWrapper _s = null;
RDebugUtils.currentLine=24838144;
 //BA.debugLineNum = 24838144;BA.debugLine="Sub CheckMonitor() As Screen";
RDebugUtils.currentLine=24838145;
 //BA.debugLineNum = 24838145;BA.debugLine="Try";
try {RDebugUtils.currentLine=24838146;
 //BA.debugLineNum = 24838146;BA.debugLine="If fx.Screens.Size= 1 Then";
if (__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens().getSize()==1) { 
RDebugUtils.currentLine=24838147;
 //BA.debugLineNum = 24838147;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=24838148;
 //BA.debugLineNum = 24838148;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=24838150;
 //BA.debugLineNum = 24838150;BA.debugLine="Return S";
if (true) return _s;
 }else 
{RDebugUtils.currentLine=24838151;
 //BA.debugLineNum = 24838151;BA.debugLine="Else If fx.Screens.Size> 1 Then";
if (__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens().getSize()>1) { 
RDebugUtils.currentLine=24838152;
 //BA.debugLineNum = 24838152;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=24838153;
 //BA.debugLineNum = 24838153;BA.debugLine="Dim S As Screen = SList.Get(2)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (2))));
RDebugUtils.currentLine=24838155;
 //BA.debugLineNum = 24838155;BA.debugLine="Return S";
if (true) return _s;
 }else {
RDebugUtils.currentLine=24838157;
 //BA.debugLineNum = 24838157;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=24838158;
 //BA.debugLineNum = 24838158;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=24838160;
 //BA.debugLineNum = 24838160;BA.debugLine="Return S";
if (true) return _s;
 }}
;
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=24838163;
 //BA.debugLineNum = 24838163;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=24838164;
 //BA.debugLineNum = 24838164;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=24838166;
 //BA.debugLineNum = 24838166;BA.debugLine="Return S";
if (true) return _s;
 };
RDebugUtils.currentLine=24838168;
 //BA.debugLineNum = 24838168;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(cloyd.blink.frmactivity __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
RDebugUtils.currentLine=24051712;
 //BA.debugLineNum = 24051712;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=24051713;
 //BA.debugLineNum = 24051713;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=24051714;
 //BA.debugLineNum = 24051714;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=24051715;
 //BA.debugLineNum = 24051715;BA.debugLine="Public jsonMain As String";
_jsonmain = "";
RDebugUtils.currentLine=24051716;
 //BA.debugLineNum = 24051716;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=24051717;
 //BA.debugLineNum = 24051717;BA.debugLine="Private ivScreenshot As B4XView";
_ivscreenshot = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=24051718;
 //BA.debugLineNum = 24051718;BA.debugLine="Private lblFileInfo As B4XView";
_lblfileinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=24051719;
 //BA.debugLineNum = 24051719;BA.debugLine="Private lblDeviceInfo As B4XView";
_lbldeviceinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=24051720;
 //BA.debugLineNum = 24051720;BA.debugLine="Private clvActivity As CustomListView";
_clvactivity = new b4j.example.customlistview();
RDebugUtils.currentLine=24051721;
 //BA.debugLineNum = 24051721;BA.debugLine="Public authToken As String";
_authtoken = "";
RDebugUtils.currentLine=24051722;
 //BA.debugLineNum = 24051722;BA.debugLine="Private wvMedia As WebView";
_wvmedia = new anywheresoftware.b4j.objects.WebViewWrapper();
RDebugUtils.currentLine=24051723;
 //BA.debugLineNum = 24051723;BA.debugLine="Private lblDate As B4XView";
_lbldate = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=24051724;
 //BA.debugLineNum = 24051724;BA.debugLine="Private lblTimestamp As Label";
_lbltimestamp = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=24051725;
 //BA.debugLineNum = 24051725;BA.debugLine="Private previousSelectedIndex As Int";
_previousselectedindex = 0;
RDebugUtils.currentLine=24051726;
 //BA.debugLineNum = 24051726;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24576000;
 //BA.debugLineNum = 24576000;BA.debugLine="Sub clvActivity_ItemClick (Index As Int, Value As";
RDebugUtils.currentLine=24576001;
 //BA.debugLineNum = 24576001;BA.debugLine="Try";
try {RDebugUtils.currentLine=24576002;
 //BA.debugLineNum = 24576002;BA.debugLine="UpdateItemColor(Index, xui.Color_Blue)";
__ref._updateitemcolor /*String*/ (null,_index,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
RDebugUtils.currentLine=24576003;
 //BA.debugLineNum = 24576003;BA.debugLine="wvMedia.LoadUrl(\"\")";
__ref._wvmedia /*anywheresoftware.b4j.objects.WebViewWrapper*/ .LoadUrl("");
RDebugUtils.currentLine=24576004;
 //BA.debugLineNum = 24576004;BA.debugLine="Dim video As String";
_video = "";
RDebugUtils.currentLine=24576005;
 //BA.debugLineNum = 24576005;BA.debugLine="video = clvActivity.GetValue(Index)";
_video = BA.ObjectToString(__ref._clvactivity /*b4j.example.customlistview*/ ._getvalue(_index));
RDebugUtils.currentLine=24576006;
 //BA.debugLineNum = 24576006;BA.debugLine="Dim videoURL As String = Regex.Split(\"\\|\",video)";
_videourl = __c.Regex.Split("\\|",_video)[(int) (0)];
RDebugUtils.currentLine=24576007;
 //BA.debugLineNum = 24576007;BA.debugLine="Dim videoTimestamp As String = Regex.Split(\"\\|\",";
_videotimestamp = __c.Regex.Split("\\|",_video)[(int) (1)];
RDebugUtils.currentLine=24576008;
 //BA.debugLineNum = 24576008;BA.debugLine="ShowVideo(videoURL,videoTimestamp)";
__ref._showvideo /*void*/ (null,_videourl,_videotimestamp);
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=24576010;
 //BA.debugLineNum = 24576010;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
RDebugUtils.currentLine=24576011;
 //BA.debugLineNum = 24576011;BA.debugLine="fx.Msgbox2(frm,LastException,\"clvActivity ItemCl";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Msgbox2(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,BA.ObjectToString(__c.LastException(ba)),"clvActivity ItemClick Exception","OK","","",__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .MSGBOX_ERROR);
 };
RDebugUtils.currentLine=24576014;
 //BA.debugLineNum = 24576014;BA.debugLine="End Sub";
return "";
}
public String  _updateitemcolor(cloyd.blink.frmactivity __ref,int _index,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "updateitemcolor", false))
	 {return ((String) Debug.delegate(ba, "updateitemcolor", new Object[] {_index,_color}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _contentlabel = null;
RDebugUtils.currentLine=24969216;
 //BA.debugLineNum = 24969216;BA.debugLine="Sub UpdateItemColor (Index As Int, Color As Int)";
RDebugUtils.currentLine=24969217;
 //BA.debugLineNum = 24969217;BA.debugLine="Try";
try {RDebugUtils.currentLine=24969219;
 //BA.debugLineNum = 24969219;BA.debugLine="If previousSelectedIndex <> Index Then";
if (__ref._previousselectedindex /*int*/ !=_index) { 
RDebugUtils.currentLine=24969220;
 //BA.debugLineNum = 24969220;BA.debugLine="Dim p As B4XView = clvActivity.GetPanel(previou";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._clvactivity /*b4j.example.customlistview*/ ._getpanel(__ref._previousselectedindex /*int*/ );
RDebugUtils.currentLine=24969221;
 //BA.debugLineNum = 24969221;BA.debugLine="If p.NumberOfViews > 0 Then";
if (_p.getNumberOfViews()>0) { 
RDebugUtils.currentLine=24969223;
 //BA.debugLineNum = 24969223;BA.debugLine="Dim ContentLabel As B4XView = p.GetView(0).Get";
_contentlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_contentlabel = _p.GetView((int) (0)).GetView((int) (0));
RDebugUtils.currentLine=24969224;
 //BA.debugLineNum = 24969224;BA.debugLine="ContentLabel.TextColor = xui.Color_Black";
_contentlabel.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
RDebugUtils.currentLine=24969226;
 //BA.debugLineNum = 24969226;BA.debugLine="Dim ContentLabel As B4XView = p.GetView(0).Get";
_contentlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_contentlabel = _p.GetView((int) (0)).GetView((int) (1));
RDebugUtils.currentLine=24969227;
 //BA.debugLineNum = 24969227;BA.debugLine="ContentLabel.TextColor = xui.Color_Black";
_contentlabel.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
RDebugUtils.currentLine=24969229;
 //BA.debugLineNum = 24969229;BA.debugLine="Dim ContentLabel As B4XView = p.GetView(0).Get";
_contentlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_contentlabel = _p.GetView((int) (0)).GetView((int) (2));
RDebugUtils.currentLine=24969230;
 //BA.debugLineNum = 24969230;BA.debugLine="ContentLabel.TextColor = xui.Color_Black";
_contentlabel.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
RDebugUtils.currentLine=24969232;
 //BA.debugLineNum = 24969232;BA.debugLine="Dim ContentLabel As B4XView = p.GetView(1) ' l";
_contentlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_contentlabel = _p.GetView((int) (1));
RDebugUtils.currentLine=24969233;
 //BA.debugLineNum = 24969233;BA.debugLine="ContentLabel.TextColor = xui.Color_Black";
_contentlabel.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
 };
 };
RDebugUtils.currentLine=24969237;
 //BA.debugLineNum = 24969237;BA.debugLine="Dim p As B4XView = clvActivity.GetPanel(Index)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._clvactivity /*b4j.example.customlistview*/ ._getpanel(_index);
RDebugUtils.currentLine=24969238;
 //BA.debugLineNum = 24969238;BA.debugLine="If p.NumberOfViews > 0 Then";
if (_p.getNumberOfViews()>0) { 
RDebugUtils.currentLine=24969240;
 //BA.debugLineNum = 24969240;BA.debugLine="Dim ContentLabel As B4XView = p.GetView(0).GetV";
_contentlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_contentlabel = _p.GetView((int) (0)).GetView((int) (0));
RDebugUtils.currentLine=24969241;
 //BA.debugLineNum = 24969241;BA.debugLine="ContentLabel.TextColor = Color";
_contentlabel.setTextColor(_color);
RDebugUtils.currentLine=24969243;
 //BA.debugLineNum = 24969243;BA.debugLine="Dim ContentLabel As B4XView = p.GetView(0).GetV";
_contentlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_contentlabel = _p.GetView((int) (0)).GetView((int) (1));
RDebugUtils.currentLine=24969244;
 //BA.debugLineNum = 24969244;BA.debugLine="ContentLabel.TextColor = Color";
_contentlabel.setTextColor(_color);
RDebugUtils.currentLine=24969246;
 //BA.debugLineNum = 24969246;BA.debugLine="Dim ContentLabel As B4XView = p.GetView(0).GetV";
_contentlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_contentlabel = _p.GetView((int) (0)).GetView((int) (2));
RDebugUtils.currentLine=24969247;
 //BA.debugLineNum = 24969247;BA.debugLine="ContentLabel.TextColor = Color";
_contentlabel.setTextColor(_color);
RDebugUtils.currentLine=24969249;
 //BA.debugLineNum = 24969249;BA.debugLine="Dim ContentLabel As B4XView = p.GetView(1) ' lb";
_contentlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_contentlabel = _p.GetView((int) (1));
RDebugUtils.currentLine=24969250;
 //BA.debugLineNum = 24969250;BA.debugLine="ContentLabel.TextColor = Color";
_contentlabel.setTextColor(_color);
 };
RDebugUtils.currentLine=24969254;
 //BA.debugLineNum = 24969254;BA.debugLine="previousSelectedIndex = Index";
__ref._previousselectedindex /*int*/  = _index;
 } 
       catch (Exception e28) {
			ba.setLastException(e28);RDebugUtils.currentLine=24969256;
 //BA.debugLineNum = 24969256;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 };
RDebugUtils.currentLine=24969258;
 //BA.debugLineNum = 24969258;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24641537;
 //BA.debugLineNum = 24641537;BA.debugLine="Try";
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
RDebugUtils.currentLine=24641538;
 //BA.debugLineNum = 24641538;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
RDebugUtils.currentLine=24641539;
 //BA.debugLineNum = 24641539;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=24641540;
 //BA.debugLineNum = 24641540;BA.debugLine="j.Download(Link)";
_j._download /*String*/ (null,_link);
RDebugUtils.currentLine=24641541;
 //BA.debugLineNum = 24641541;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("TOKEN_AUTH",__ref._authtoken /*String*/ );
RDebugUtils.currentLine=24641542;
 //BA.debugLineNum = 24641542;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frmactivity", "showvideo"), (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[1];
;
RDebugUtils.currentLine=24641543;
 //BA.debugLineNum = 24641543;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=24641545;
 //BA.debugLineNum = 24641545;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File.";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = parent.__c.File.OpenOutput(parent.__c.File.getDirApp(),"media.mp4",parent.__c.False);
RDebugUtils.currentLine=24641546;
 //BA.debugLineNum = 24641546;BA.debugLine="File.Copy2(j.GetInputStream, out)";
parent.__c.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=24641547;
 //BA.debugLineNum = 24641547;BA.debugLine="out.Close '<------ very important";
_out.Close();
RDebugUtils.currentLine=24641549;
 //BA.debugLineNum = 24641549;BA.debugLine="lblTimestamp.Text= timestamp";
__ref._lbltimestamp /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_timestamp);
RDebugUtils.currentLine=24641550;
 //BA.debugLineNum = 24641550;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=24641551;
 //BA.debugLineNum = 24641551;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=24641552;
 //BA.debugLineNum = 24641552;BA.debugLine="sb.Append(\"<video width='100%' height='100%' co";
_sb.Append("<video width='100%' height='100%' controls autoplay>");
RDebugUtils.currentLine=24641553;
 //BA.debugLineNum = 24641553;BA.debugLine="sb.Append(\"<source src='\" & File.GetUri(File.Di";
_sb.Append("<source src='"+parent.__c.File.GetUri(parent.__c.File.getDirApp(),"media.mp4")+"' Type='video/mp4'/>");
RDebugUtils.currentLine=24641554;
 //BA.debugLineNum = 24641554;BA.debugLine="sb.Append(\"</video>\")";
_sb.Append("</video>");
RDebugUtils.currentLine=24641555;
 //BA.debugLineNum = 24641555;BA.debugLine="wvMedia.LoadHtml(sb.ToString)";
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
RDebugUtils.currentLine=24641559;
 //BA.debugLineNum = 24641559;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=24641561;
 //BA.debugLineNum = 24641561;BA.debugLine="Log(LastException)";
parent.__c.Log(BA.ObjectToString(parent.__c.LastException(ba)));
RDebugUtils.currentLine=24641562;
 //BA.debugLineNum = 24641562;BA.debugLine="fx.Msgbox2(frm,LastException,\"ShowVideo Exceptio";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Msgbox2(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,BA.ObjectToString(parent.__c.LastException(ba)),"ShowVideo Exception","OK","","",__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .MSGBOX_ERROR);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=24641564;
 //BA.debugLineNum = 24641564;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24379392;
 //BA.debugLineNum = 24379392;BA.debugLine="Sub ConvertDateTime(inputTime As String) As String";
RDebugUtils.currentLine=24379394;
 //BA.debugLineNum = 24379394;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = __ref._parseutcstring /*long*/ (null,_inputtime.replace("+00:00","+0000"));
RDebugUtils.currentLine=24379395;
 //BA.debugLineNum = 24379395;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
__c.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a");
RDebugUtils.currentLine=24379396;
 //BA.debugLineNum = 24379396;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
RDebugUtils.currentLine=24379397;
 //BA.debugLineNum = 24379397;BA.debugLine="Dim p As Period = DateUtils.PeriodBetween(lngTick";
_p = _dateutils._periodbetween(_lngticks,__c.DateTime.getNow());
RDebugUtils.currentLine=24379399;
 //BA.debugLineNum = 24379399;BA.debugLine="If lblDate.Text.Contains(\"Today\") Then";
if (__ref._lbldate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().contains("Today")) { 
RDebugUtils.currentLine=24379400;
 //BA.debugLineNum = 24379400;BA.debugLine="If p.Days = 0 Then";
if (_p.Days==0) { 
RDebugUtils.currentLine=24379401;
 //BA.debugLineNum = 24379401;BA.debugLine="If p.Hours = 0 Then";
if (_p.Hours==0) { 
RDebugUtils.currentLine=24379402;
 //BA.debugLineNum = 24379402;BA.debugLine="If p.Minutes = 0 Then";
if (_p.Minutes==0) { 
RDebugUtils.currentLine=24379403;
 //BA.debugLineNum = 24379403;BA.debugLine="Return p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Seconds)+"s ago";
 }else {
RDebugUtils.currentLine=24379405;
 //BA.debugLineNum = 24379405;BA.debugLine="Return p.Minutes & \"m \" & p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 };
 }else {
RDebugUtils.currentLine=24379408;
 //BA.debugLineNum = 24379408;BA.debugLine="Return p.Hours & \"h \" & p.Minutes & \"m \" & p.S";
if (true) return BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 };
 }else 
{RDebugUtils.currentLine=24379410;
 //BA.debugLineNum = 24379410;BA.debugLine="else If p.Hours = 0 Then";
if (_p.Hours==0) { 
RDebugUtils.currentLine=24379411;
 //BA.debugLineNum = 24379411;BA.debugLine="If p.Minutes = 0 Then";
if (_p.Minutes==0) { 
RDebugUtils.currentLine=24379412;
 //BA.debugLineNum = 24379412;BA.debugLine="Return p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Seconds)+"s ago";
 }else {
RDebugUtils.currentLine=24379414;
 //BA.debugLineNum = 24379414;BA.debugLine="Return p.Minutes & \"m \" & p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 };
 }else 
{RDebugUtils.currentLine=24379416;
 //BA.debugLineNum = 24379416;BA.debugLine="else If p.Minutes = 0 Then";
if (_p.Minutes==0) { 
RDebugUtils.currentLine=24379417;
 //BA.debugLineNum = 24379417;BA.debugLine="Return p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Seconds)+"s ago";
 }else {
RDebugUtils.currentLine=24379419;
 //BA.debugLineNum = 24379419;BA.debugLine="Return p.Days & \"d \" & p.Hours & \"h \" & p.Minut";
if (true) return BA.NumberToString(_p.Days)+"d "+BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 }}}
;
 }else 
{RDebugUtils.currentLine=24379421;
 //BA.debugLineNum = 24379421;BA.debugLine="else if lblDate.Text.Contains(\"Yesterday\") Then";
if (__ref._lbldate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().contains("Yesterday")) { 
RDebugUtils.currentLine=24379422;
 //BA.debugLineNum = 24379422;BA.debugLine="If p.Days = 0 Then";
if (_p.Days==0) { 
RDebugUtils.currentLine=24379423;
 //BA.debugLineNum = 24379423;BA.debugLine="If p.Hours = 0 Then";
if (_p.Hours==0) { 
RDebugUtils.currentLine=24379424;
 //BA.debugLineNum = 24379424;BA.debugLine="If p.Minutes = 0 Then";
if (_p.Minutes==0) { 
RDebugUtils.currentLine=24379425;
 //BA.debugLineNum = 24379425;BA.debugLine="Return p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Seconds)+"s ago";
 }else {
RDebugUtils.currentLine=24379427;
 //BA.debugLineNum = 24379427;BA.debugLine="Return p.Minutes & \"m \" & p.Seconds & \"s ago\"";
if (true) return BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 };
 }else {
RDebugUtils.currentLine=24379430;
 //BA.debugLineNum = 24379430;BA.debugLine="Return p.Hours & \"h \" & p.Minutes & \"m \" & p.S";
if (true) return BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 };
 }else {
RDebugUtils.currentLine=24379433;
 //BA.debugLineNum = 24379433;BA.debugLine="Return p.Days & \"d \" & p.Hours & \"h \" & p.Minut";
if (true) return BA.NumberToString(_p.Days)+"d "+BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 };
 }else {
RDebugUtils.currentLine=24379436;
 //BA.debugLineNum = 24379436;BA.debugLine="Return p.Days & \"d \" & p.Hours & \"h \" & p.Minute";
if (true) return BA.NumberToString(_p.Days)+"d "+BA.NumberToString(_p.Hours)+"h "+BA.NumberToString(_p.Minutes)+"m "+BA.NumberToString(_p.Seconds)+"s ago";
 }}
;
RDebugUtils.currentLine=24379438;
 //BA.debugLineNum = 24379438;BA.debugLine="End Sub";
return "";
}
public long  _parseutcstring(cloyd.blink.frmactivity __ref,String _utc) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "parseutcstring", false))
	 {return ((Long) Debug.delegate(ba, "parseutcstring", new Object[] {_utc}));}
String _df = "";
long _res = 0L;
RDebugUtils.currentLine=24510464;
 //BA.debugLineNum = 24510464;BA.debugLine="Sub ParseUTCstring(utc As String) As Long";
RDebugUtils.currentLine=24510465;
 //BA.debugLineNum = 24510465;BA.debugLine="Dim df As String = DateTime.DateFormat";
_df = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=24510466;
 //BA.debugLineNum = 24510466;BA.debugLine="Dim res As Long";
_res = 0L;
RDebugUtils.currentLine=24510467;
 //BA.debugLineNum = 24510467;BA.debugLine="If utc.CharAt(10) = \"T\" Then";
if (_utc.charAt((int) (10))==BA.ObjectToChar("T")) { 
RDebugUtils.currentLine=24510469;
 //BA.debugLineNum = 24510469;BA.debugLine="If utc.CharAt(19) = \".\" Then utc = utc.SubString";
if (_utc.charAt((int) (19))==BA.ObjectToChar(".")) { 
_utc = _utc.substring((int) (0),(int) (19))+"+0000";};
RDebugUtils.currentLine=24510470;
 //BA.debugLineNum = 24510470;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd'T'HH:mm:ssZ\"";
__c.DateTime.setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
 }else {
RDebugUtils.currentLine=24510473;
 //BA.debugLineNum = 24510473;BA.debugLine="DateTime.DateFormat = \"EEE MMM dd HH:mm:ss Z yyy";
__c.DateTime.setDateFormat("EEE MMM dd HH:mm:ss Z yyyy");
 };
RDebugUtils.currentLine=24510475;
 //BA.debugLineNum = 24510475;BA.debugLine="Try";
try {RDebugUtils.currentLine=24510476;
 //BA.debugLineNum = 24510476;BA.debugLine="res = DateTime.DateParse(utc)";
_res = __c.DateTime.DateParse(_utc);
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=24510478;
 //BA.debugLineNum = 24510478;BA.debugLine="res = 0";
_res = (long) (0);
 };
RDebugUtils.currentLine=24510480;
 //BA.debugLineNum = 24510480;BA.debugLine="DateTime.DateFormat = df";
__c.DateTime.setDateFormat(_df);
RDebugUtils.currentLine=24510481;
 //BA.debugLineNum = 24510481;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=24510482;
 //BA.debugLineNum = 24510482;BA.debugLine="End Sub";
return 0L;
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
RDebugUtils.currentLine=24444928;
 //BA.debugLineNum = 24444928;BA.debugLine="Sub ConvertFullDateTime(inputTime As String) As St";
RDebugUtils.currentLine=24444930;
 //BA.debugLineNum = 24444930;BA.debugLine="Dim ticks As Long = ParseUTCstring(inputTime.Repl";
_ticks = __ref._parseutcstring /*long*/ (null,_inputtime.replace("+00:00","+0000"));
RDebugUtils.currentLine=24444931;
 //BA.debugLineNum = 24444931;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a\"";
__c.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a");
RDebugUtils.currentLine=24444932;
 //BA.debugLineNum = 24444932;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
RDebugUtils.currentLine=24444934;
 //BA.debugLineNum = 24444934;BA.debugLine="Dim Yesterday As Long";
_yesterday = 0L;
RDebugUtils.currentLine=24444935;
 //BA.debugLineNum = 24444935;BA.debugLine="Dim timestamp As Long";
_timestamp = 0L;
RDebugUtils.currentLine=24444936;
 //BA.debugLineNum = 24444936;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
__c.DateTime.setDateFormat("yyyyMMdd");
RDebugUtils.currentLine=24444937;
 //BA.debugLineNum = 24444937;BA.debugLine="Yesterday = DateTime.Date(DateTime.add(DateTime.N";
_yesterday = (long)(Double.parseDouble(__c.DateTime.Date(__c.DateTime.Add(__c.DateTime.getNow(),(int) (0),(int) (0),(int) (-1)))));
RDebugUtils.currentLine=24444938;
 //BA.debugLineNum = 24444938;BA.debugLine="timestamp = DateTime.Date(lngTicks)";
_timestamp = (long)(Double.parseDouble(__c.DateTime.Date(_lngticks)));
RDebugUtils.currentLine=24444940;
 //BA.debugLineNum = 24444940;BA.debugLine="DateTime.DateFormat = \"h:mm:ss a\"";
__c.DateTime.setDateFormat("h:mm:ss a");
RDebugUtils.currentLine=24444941;
 //BA.debugLineNum = 24444941;BA.debugLine="If DateUtils.IsSameDay(lngTicks,DateTime.now) The";
if (_dateutils._issameday(_lngticks,__c.DateTime.getNow())) { 
RDebugUtils.currentLine=24444942;
 //BA.debugLineNum = 24444942;BA.debugLine="Return \"Today \" & DateTime.Date(lngTicks)";
if (true) return "Today "+__c.DateTime.Date(_lngticks);
 }else 
{RDebugUtils.currentLine=24444943;
 //BA.debugLineNum = 24444943;BA.debugLine="Else If Yesterday = timestamp Then";
if (_yesterday==_timestamp) { 
RDebugUtils.currentLine=24444944;
 //BA.debugLineNum = 24444944;BA.debugLine="Return \"Yesterday \" & DateTime.Date(lngTicks)";
if (true) return "Yesterday "+__c.DateTime.Date(_lngticks);
 }else {
RDebugUtils.currentLine=24444946;
 //BA.debugLineNum = 24444946;BA.debugLine="Return DateUtils.GetDayOfWeekName(lngTicks) & \"";
if (true) return _dateutils._getdayofweekname(_lngticks)+" "+__c.DateTime.Date(_lngticks);
 }}
;
RDebugUtils.currentLine=24444948;
 //BA.debugLineNum = 24444948;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlistitem(cloyd.blink.frmactivity __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _screenshot,String _fileinfo,String _devicename) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "createlistitem", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlistitem", new Object[] {_screenshot,_fileinfo,_devicename}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=24313856;
 //BA.debugLineNum = 24313856;BA.debugLine="Sub CreateListItem(screenshot As B4XBitmap, filein";
RDebugUtils.currentLine=24313857;
 //BA.debugLineNum = 24313857;BA.debugLine="Try";
try {RDebugUtils.currentLine=24313861;
 //BA.debugLineNum = 24313861;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=24313862;
 //BA.debugLineNum = 24313862;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 400dip, 80dip)";
_p.SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (80)));
RDebugUtils.currentLine=24313863;
 //BA.debugLineNum = 24313863;BA.debugLine="p.LoadLayout(\"cellitem\")";
_p.LoadLayout("cellitem",ba);
RDebugUtils.currentLine=24313864;
 //BA.debugLineNum = 24313864;BA.debugLine="ivScreenshot.SetBitmap(screenshot)";
__ref._ivscreenshot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((javafx.scene.image.Image)(_screenshot.getObject()));
RDebugUtils.currentLine=24313865;
 //BA.debugLineNum = 24313865;BA.debugLine="lblDate.Text = \"   \" & ConvertFullDateTime(filei";
__ref._lbldate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("   "+__ref._convertfulldatetime /*String*/ (null,_fileinfo));
RDebugUtils.currentLine=24313866;
 //BA.debugLineNum = 24313866;BA.debugLine="lblFileInfo.Text = \"   \" & ConvertDateTime(filei";
__ref._lblfileinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("   "+__ref._convertdatetime /*String*/ (null,_fileinfo));
RDebugUtils.currentLine=24313867;
 //BA.debugLineNum = 24313867;BA.debugLine="lblDeviceInfo.Text = \"   \" & devicename";
__ref._lbldeviceinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("   "+_devicename);
RDebugUtils.currentLine=24313868;
 //BA.debugLineNum = 24313868;BA.debugLine="Return p";
if (true) return _p;
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=24313870;
 //BA.debugLineNum = 24313870;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
RDebugUtils.currentLine=24313871;
 //BA.debugLineNum = 24313871;BA.debugLine="fx.Msgbox2(frm,LastException,\"CreateListItem Exc";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Msgbox2(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,BA.ObjectToString(__c.LastException(ba)),"CreateListItem Exception","OK","","",__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .MSGBOX_ERROR);
RDebugUtils.currentLine=24313872;
 //BA.debugLineNum = 24313872;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Null));
 };
RDebugUtils.currentLine=24313875;
 //BA.debugLineNum = 24313875;BA.debugLine="End Sub";
return null;
}
public String  _frm_closerequest(cloyd.blink.frmactivity __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=24707072;
 //BA.debugLineNum = 24707072;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=24707073;
 //BA.debugLineNum = 24707073;BA.debugLine="wvMedia.LoadUrl(\"\")";
__ref._wvmedia /*anywheresoftware.b4j.objects.WebViewWrapper*/ .LoadUrl("");
RDebugUtils.currentLine=24707074;
 //BA.debugLineNum = 24707074;BA.debugLine="wvMedia.RemoveNodeFromParent";
__ref._wvmedia /*anywheresoftware.b4j.objects.WebViewWrapper*/ .RemoveNodeFromParent();
RDebugUtils.currentLine=24707075;
 //BA.debugLineNum = 24707075;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
__c.File.Delete(__c.File.getDirApp(),"screenshot.jpg");
RDebugUtils.currentLine=24707076;
 //BA.debugLineNum = 24707076;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
__c.File.Delete(__c.File.getDirApp(),"media.mp4");
RDebugUtils.currentLine=24707077;
 //BA.debugLineNum = 24707077;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24248321;
 //BA.debugLineNum = 24248321;BA.debugLine="Try";
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
RDebugUtils.currentLine=24248322;
 //BA.debugLineNum = 24248322;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=24248323;
 //BA.debugLineNum = 24248323;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=24248324;
 //BA.debugLineNum = 24248324;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=24248328;
 //BA.debugLineNum = 24248328;BA.debugLine="Dim media As List = root.Get(\"media\")";
_media = new anywheresoftware.b4a.objects.collections.List();
_media.setObject((java.util.List)(_root.Get((Object)("media"))));
RDebugUtils.currentLine=24248329;
 //BA.debugLineNum = 24248329;BA.debugLine="For Each colmedia As Map In media";
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
RDebugUtils.currentLine=24248330;
 //BA.debugLineNum = 24248330;BA.debugLine="Dim thumbnail As String = colmedia.Get(\"thumbna";
_thumbnail = BA.ObjectToString(_colmedia.Get((Object)("thumbnail")));
RDebugUtils.currentLine=24248333;
 //BA.debugLineNum = 24248333;BA.debugLine="Dim created_at As String = colmedia.Get(\"create";
_created_at = BA.ObjectToString(_colmedia.Get((Object)("created_at")));
RDebugUtils.currentLine=24248338;
 //BA.debugLineNum = 24248338;BA.debugLine="Dim device_name As String = colmedia.Get(\"devic";
_device_name = BA.ObjectToString(_colmedia.Get((Object)("device_name")));
RDebugUtils.currentLine=24248348;
 //BA.debugLineNum = 24248348;BA.debugLine="Dim medianame As String = colmedia.Get(\"media\")";
_medianame = BA.ObjectToString(_colmedia.Get((Object)("media")));
RDebugUtils.currentLine=24248349;
 //BA.debugLineNum = 24248349;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
RDebugUtils.currentLine=24248350;
 //BA.debugLineNum = 24248350;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=24248351;
 //BA.debugLineNum = 24248351;BA.debugLine="j.Download(\"https://rest-\" & userRegion &\".imme";
_j._download /*String*/ (null,"https://rest-"+_userregion+".immedia-semi.com"+_thumbnail+".jpg");
RDebugUtils.currentLine=24248352;
 //BA.debugLineNum = 24248352;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("TOKEN_AUTH",__ref._authtoken /*String*/ );
RDebugUtils.currentLine=24248353;
 //BA.debugLineNum = 24248353;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frmactivity", "getvideos"), (Object)(_j));
this.state = 23;
return;
case 23:
//C
this.state = 7;
_j = (cloyd.blink.httpjob) result[1];
;
RDebugUtils.currentLine=24248354;
 //BA.debugLineNum = 24248354;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=24248357;
 //BA.debugLineNum = 24248357;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = parent.__c.File.OpenOutput(parent.__c.File.getDirApp(),"screenshot.jpg",parent.__c.False);
RDebugUtils.currentLine=24248358;
 //BA.debugLineNum = 24248358;BA.debugLine="File.Copy2(j.GetInputStream, out)";
parent.__c.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=24248359;
 //BA.debugLineNum = 24248359;BA.debugLine="out.Close '<------ very important";
_out.Close();
RDebugUtils.currentLine=24248363;
 //BA.debugLineNum = 24248363;BA.debugLine="Dim p As B4XView = CreateListItem(j.GetBitmap,";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._createlistitem /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (javafx.scene.image.Image)(_j._getbitmap /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ (null).getObject())),_created_at,_device_name);
RDebugUtils.currentLine=24248364;
 //BA.debugLineNum = 24248364;BA.debugLine="clvActivity.Add(p,\"https://rest-\" & userRegion";
__ref._clvactivity /*b4j.example.customlistview*/ ._add(_p,(Object)("https://rest-"+_userregion+".immedia-semi.com"+_medianame+"|"+_device_name+" "+__ref._convertfulldatetime /*String*/ (null,_created_at)));
RDebugUtils.currentLine=24248365;
 //BA.debugLineNum = 24248365;BA.debugLine="If clvActivity.Size = 1 Then";
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
RDebugUtils.currentLine=24248366;
 //BA.debugLineNum = 24248366;BA.debugLine="ShowVideo(\"https://rest-\" & userRegion &\".imm";
__ref._showvideo /*void*/ (null,"https://rest-"+_userregion+".immedia-semi.com"+_medianame,_device_name+" "+__ref._convertfulldatetime /*String*/ (null,_created_at));
RDebugUtils.currentLine=24248367;
 //BA.debugLineNum = 24248367;BA.debugLine="UpdateItemColor(clvActivity.FirstVisibleIndex";
__ref._updateitemcolor /*String*/ (null,__ref._clvactivity /*b4j.example.customlistview*/ ._getfirstvisibleindex(),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
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
RDebugUtils.currentLine=24248372;
 //BA.debugLineNum = 24248372;BA.debugLine="j.Release";
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
RDebugUtils.currentLine=24248376;
 //BA.debugLineNum = 24248376;BA.debugLine="Log(LastException)";
parent.__c.Log(BA.ObjectToString(parent.__c.LastException(ba)));
RDebugUtils.currentLine=24248377;
 //BA.debugLineNum = 24248377;BA.debugLine="fx.Msgbox2(frm,LastException,\"GetVideos Exceptio";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Msgbox2(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,BA.ObjectToString(parent.__c.LastException(ba)),"GetVideos Exception","OK","","",__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .MSGBOX_ERROR);
 if (true) break;
if (true) break;

case 20:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=24248379;
 //BA.debugLineNum = 24248379;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24772608;
 //BA.debugLineNum = 24772608;BA.debugLine="Private Sub RootPaneKeyEvent_Event(e As Event)";
RDebugUtils.currentLine=24772609;
 //BA.debugLineNum = 24772609;BA.debugLine="Dim KE As Reflector";
_ke = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=24772610;
 //BA.debugLineNum = 24772610;BA.debugLine="Dim sCode As String";
_scode = "";
RDebugUtils.currentLine=24772611;
 //BA.debugLineNum = 24772611;BA.debugLine="Dim sType As String 'ignore";
_stype = "";
RDebugUtils.currentLine=24772612;
 //BA.debugLineNum = 24772612;BA.debugLine="Dim result As Int 'ignore";
_result = 0;
RDebugUtils.currentLine=24772613;
 //BA.debugLineNum = 24772613;BA.debugLine="KE.Target = e	 ' e is a KeyEvent instance";
_ke.Target = (Object)(_e.getObject());
RDebugUtils.currentLine=24772614;
 //BA.debugLineNum = 24772614;BA.debugLine="sCode = KE.RunMethod(\"getCode\")";
_scode = BA.ObjectToString(_ke.RunMethod("getCode"));
RDebugUtils.currentLine=24772615;
 //BA.debugLineNum = 24772615;BA.debugLine="sType = KE.RunMethod(\"getEventType\")";
_stype = BA.ObjectToString(_ke.RunMethod("getEventType"));
RDebugUtils.currentLine=24772616;
 //BA.debugLineNum = 24772616;BA.debugLine="If sCode=\"ESCAPE\" Then";
if ((_scode).equals("ESCAPE")) { 
RDebugUtils.currentLine=24772617;
 //BA.debugLineNum = 24772617;BA.debugLine="wvMedia.LoadUrl(\"\")";
__ref._wvmedia /*anywheresoftware.b4j.objects.WebViewWrapper*/ .LoadUrl("");
RDebugUtils.currentLine=24772618;
 //BA.debugLineNum = 24772618;BA.debugLine="wvMedia.RemoveNodeFromParent";
__ref._wvmedia /*anywheresoftware.b4j.objects.WebViewWrapper*/ .RemoveNodeFromParent();
RDebugUtils.currentLine=24772619;
 //BA.debugLineNum = 24772619;BA.debugLine="File.Delete(File.DirApp,\"screenshot.jpg\")";
__c.File.Delete(__c.File.getDirApp(),"screenshot.jpg");
RDebugUtils.currentLine=24772620;
 //BA.debugLineNum = 24772620;BA.debugLine="File.Delete(File.DirApp,\"media.mp4\")";
__c.File.Delete(__c.File.getDirApp(),"media.mp4");
RDebugUtils.currentLine=24772621;
 //BA.debugLineNum = 24772621;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
 };
RDebugUtils.currentLine=24772623;
 //BA.debugLineNum = 24772623;BA.debugLine="End Sub";
return "";
}
public String  _wvmedia_pagefinished(cloyd.blink.frmactivity __ref,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "wvmedia_pagefinished", false))
	 {return ((String) Debug.delegate(ba, "wvmedia_pagefinished", new Object[] {_url}));}
RDebugUtils.currentLine=24903680;
 //BA.debugLineNum = 24903680;BA.debugLine="Sub wvMedia_PageFinished (Url As String)";
RDebugUtils.currentLine=24903682;
 //BA.debugLineNum = 24903682;BA.debugLine="End Sub";
return "";
}
}