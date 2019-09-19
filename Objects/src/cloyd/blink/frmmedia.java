package cloyd.blink;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class frmmedia extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("cloyd.blink", "cloyd.blink.frmmedia", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", cloyd.blink.frmmedia.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.WebViewWrapper _wvmedia = null;
public String _url = "";
public boolean _isvideo = false;
public b4j.example.dateutils _dateutils = null;
public cloyd.blink.main _main = null;
public cloyd.blink.httputils2service _httputils2service = null;
public String  _initialize(cloyd.blink.frmmedia __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="frmmedia";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
anywheresoftware.b4j.agraham.reflection.Reflection _obj = null;
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub Initialize (Parent As Form)";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="frm.Initialize(\"frm\", 600dip, 600dip)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",__c.DipToCurrent((int) (600)),__c.DipToCurrent((int) (600)));
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .SetFormStyle("UTILITY");
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="frm.RootPane.LoadLayout(\"main\")";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"main");
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="frm.Icon = fx.LoadImage(File.DirAssets, \"home.png";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(__c.File.getDirAssets(),"home.png").getObject()));
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="frm.Title = \"Catanaoan Blink XT2 Cameras Media Vi";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle("Catanaoan Blink XT2 Cameras Media Viewer");
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="frm.SetOwner(Parent)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .SetOwner(_parent);
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="frm.WindowWidth = CheckMonitor.MaxX - CheckMonito";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowWidth(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMaxX()-__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinX());
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="frm.WindowLeft = CheckMonitor.MinX";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowLeft(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinX());
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="frm.WindowHeight = CheckMonitor.MaxY - CheckMo";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowHeight(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMaxY()-__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinY());
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="frm.WindowTop = CheckMonitor.MinY";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowTop(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinY());
RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=2490380;
 //BA.debugLineNum = 2490380;BA.debugLine="Obj.Target = frm.RootPane";
_obj.Target = (Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject());
RDebugUtils.currentLine=2490381;
 //BA.debugLineNum = 2490381;BA.debugLine="Obj.AddEventHandler(\"RootPaneKeyEvent\", \"javafx.s";
_obj.AddEventHandler(ba,"RootPaneKeyEvent","javafx.scene.input.KeyEvent.ANY");
RDebugUtils.currentLine=2490382;
 //BA.debugLineNum = 2490382;BA.debugLine="End Sub";
return "";
}
public String  _show(cloyd.blink.frmmedia __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmmedia";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="If isVideo Then";
if (__ref._isvideo /*boolean*/ ) { 
 }else {
RDebugUtils.currentLine=2555921;
 //BA.debugLineNum = 2555921;BA.debugLine="wvMedia.Loadhtml(url)";
__ref._wvmedia /*anywheresoftware.b4j.objects.WebViewWrapper*/ .LoadHtml(__ref._url /*String*/ );
 };
RDebugUtils.currentLine=2555923;
 //BA.debugLineNum = 2555923;BA.debugLine="frm.ShowAndWait";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .ShowAndWait();
RDebugUtils.currentLine=2555924;
 //BA.debugLineNum = 2555924;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.JFX.ScreenWrapper  _checkmonitor(cloyd.blink.frmmedia __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmmedia";
if (Debug.shouldDelegate(ba, "checkmonitor", false))
	 {return ((anywheresoftware.b4j.objects.JFX.ScreenWrapper) Debug.delegate(ba, "checkmonitor", null));}
anywheresoftware.b4a.objects.collections.List _slist = null;
anywheresoftware.b4j.objects.JFX.ScreenWrapper _s = null;
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub CheckMonitor() As Screen";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Try";
try {RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="If fx.Screens.Size= 1 Then";
if (__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens().getSize()==1) { 
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="Return S";
if (true) return _s;
 }else 
{RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="Else If fx.Screens.Size> 1 Then";
if (__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens().getSize()>1) { 
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="Dim S As Screen = SList.Get(2)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (2))));
RDebugUtils.currentLine=2686987;
 //BA.debugLineNum = 2686987;BA.debugLine="Return S";
if (true) return _s;
 }else {
RDebugUtils.currentLine=2686989;
 //BA.debugLineNum = 2686989;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=2686990;
 //BA.debugLineNum = 2686990;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=2686992;
 //BA.debugLineNum = 2686992;BA.debugLine="Return S";
if (true) return _s;
 }}
;
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=2686995;
 //BA.debugLineNum = 2686995;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=2686996;
 //BA.debugLineNum = 2686996;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=2686998;
 //BA.debugLineNum = 2686998;BA.debugLine="Return S";
if (true) return _s;
 };
RDebugUtils.currentLine=2687000;
 //BA.debugLineNum = 2687000;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(cloyd.blink.frmmedia __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmmedia";
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="Private wvMedia As WebView";
_wvmedia = new anywheresoftware.b4j.objects.WebViewWrapper();
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="Public url As String";
_url = "";
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="Public isVideo As Boolean = False";
_isvideo = __c.False;
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(cloyd.blink.frmmedia __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmmedia";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=25165824;
 //BA.debugLineNum = 25165824;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=25165826;
 //BA.debugLineNum = 25165826;BA.debugLine="End Sub";
return "";
}
public String  _rootpanekeyevent_event(cloyd.blink.frmmedia __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmmedia";
if (Debug.shouldDelegate(ba, "rootpanekeyevent_event", false))
	 {return ((String) Debug.delegate(ba, "rootpanekeyevent_event", new Object[] {_e}));}
anywheresoftware.b4j.agraham.reflection.Reflection _ke = null;
String _scode = "";
String _stype = "";
int _result = 0;
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Private Sub RootPaneKeyEvent_Event(e As Event)";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Dim KE As Reflector";
_ke = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Dim sCode As String";
_scode = "";
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Dim sType As String 'ignore";
_stype = "";
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="Dim result As Int 'ignore";
_result = 0;
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="KE.Target = e	 ' e is a KeyEvent instance";
_ke.Target = (Object)(_e.getObject());
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="sCode = KE.RunMethod(\"getCode\")";
_scode = BA.ObjectToString(_ke.RunMethod("getCode"));
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="sType = KE.RunMethod(\"getEventType\")";
_stype = BA.ObjectToString(_ke.RunMethod("getEventType"));
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="If sCode=\"ESCAPE\" Then";
if ((_scode).equals("ESCAPE")) { 
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
 };
RDebugUtils.currentLine=2621452;
 //BA.debugLineNum = 2621452;BA.debugLine="End Sub";
return "";
}
}