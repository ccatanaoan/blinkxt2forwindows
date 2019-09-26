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
public String _url = "";
public anywheresoftware.b4j.objects.ImageViewWrapper _imgscreenshot = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltimestamp = null;
public String _timestamp = "";
public anywheresoftware.b4j.objects.ButtonWrapper _btnhiddenexitescapekey = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public cloyd.blink.main _main = null;
public cloyd.blink.httputils2service _httputils2service = null;
public String  _initialize(cloyd.blink.frmmedia __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="frmmedia";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
anywheresoftware.b4j.agraham.reflection.Reflection _obj = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=23592960;
 //BA.debugLineNum = 23592960;BA.debugLine="Public Sub Initialize (Parent As Form)";
RDebugUtils.currentLine=23592961;
 //BA.debugLineNum = 23592961;BA.debugLine="frm.Initialize(\"frm\", 600dip, 600dip)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",__c.DipToCurrent((int) (600)),__c.DipToCurrent((int) (600)));
RDebugUtils.currentLine=23592962;
 //BA.debugLineNum = 23592962;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .SetFormStyle("UTILITY");
RDebugUtils.currentLine=23592963;
 //BA.debugLineNum = 23592963;BA.debugLine="frm.RootPane.LoadLayout(\"main\")";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"main");
RDebugUtils.currentLine=23592964;
 //BA.debugLineNum = 23592964;BA.debugLine="frm.Icon = fx.LoadImage(File.DirAssets, \"home.png";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(__c.File.getDirAssets(),"home.png").getObject()));
RDebugUtils.currentLine=23592965;
 //BA.debugLineNum = 23592965;BA.debugLine="frm.Title = \"Catanaoan Blink XT2 Cameras Media Vi";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle("Catanaoan Blink XT2 Cameras Media Viewer");
RDebugUtils.currentLine=23592966;
 //BA.debugLineNum = 23592966;BA.debugLine="frm.SetOwner(Parent)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .SetOwner(_parent);
RDebugUtils.currentLine=23592967;
 //BA.debugLineNum = 23592967;BA.debugLine="frm.WindowWidth = CheckMonitor.MaxX - CheckMonito";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowWidth(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMaxX()-__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinX());
RDebugUtils.currentLine=23592968;
 //BA.debugLineNum = 23592968;BA.debugLine="frm.WindowLeft = CheckMonitor.MinX";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowLeft(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinX());
RDebugUtils.currentLine=23592969;
 //BA.debugLineNum = 23592969;BA.debugLine="frm.WindowHeight = CheckMonitor.MaxY - CheckMo";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowHeight(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMaxY()-__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinY());
RDebugUtils.currentLine=23592970;
 //BA.debugLineNum = 23592970;BA.debugLine="frm.WindowTop = CheckMonitor.MinY";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowTop(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinY());
RDebugUtils.currentLine=23592971;
 //BA.debugLineNum = 23592971;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=23592972;
 //BA.debugLineNum = 23592972;BA.debugLine="Obj.Target = frm.RootPane";
_obj.Target = (Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject());
RDebugUtils.currentLine=23592974;
 //BA.debugLineNum = 23592974;BA.debugLine="Obj.AddEventHandler(\"keypressed\", \"javafx.scene.i";
_obj.AddEventHandler(ba,"keypressed","javafx.scene.input.KeyEvent.KEY_PRESSED");
RDebugUtils.currentLine=23592975;
 //BA.debugLineNum = 23592975;BA.debugLine="Dim JO As JavaObject = btnHiddenExitEscapeKey";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(__ref._btnhiddenexitescapekey /*anywheresoftware.b4j.objects.ButtonWrapper*/ .getObject()));
RDebugUtils.currentLine=23592976;
 //BA.debugLineNum = 23592976;BA.debugLine="JO.RunMethod(\"setCancelButton\",Array(True))  'If";
_jo.RunMethod("setCancelButton",new Object[]{(Object)(__c.True)});
RDebugUtils.currentLine=23592977;
 //BA.debugLineNum = 23592977;BA.debugLine="End Sub";
return "";
}
public String  _show(cloyd.blink.frmmedia __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmmedia";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=23658496;
 //BA.debugLineNum = 23658496;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=23658497;
 //BA.debugLineNum = 23658497;BA.debugLine="If url.Contains(\"Driveway\") Then";
if (__ref._url /*String*/ .contains("Driveway")) { 
RDebugUtils.currentLine=23658498;
 //BA.debugLineNum = 23658498;BA.debugLine="imgScreenshot.SetImage(fx.LoadImage(File.DirApp,";
__ref._imgscreenshot /*anywheresoftware.b4j.objects.ImageViewWrapper*/ .SetImage((javafx.scene.image.Image)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(__c.File.getDirApp(),"Driveway.jpg").getObject()));
 }else 
{RDebugUtils.currentLine=23658499;
 //BA.debugLineNum = 23658499;BA.debugLine="Else if url.Contains(\"FrontDoor\") Then";
if (__ref._url /*String*/ .contains("FrontDoor")) { 
RDebugUtils.currentLine=23658500;
 //BA.debugLineNum = 23658500;BA.debugLine="imgScreenshot.SetImage(fx.LoadImage(File.DirApp,";
__ref._imgscreenshot /*anywheresoftware.b4j.objects.ImageViewWrapper*/ .SetImage((javafx.scene.image.Image)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(__c.File.getDirApp(),"FrontDoor.jpg").getObject()));
 }else 
{RDebugUtils.currentLine=23658501;
 //BA.debugLineNum = 23658501;BA.debugLine="Else if url.Contains(\"SideYard\") Then";
if (__ref._url /*String*/ .contains("SideYard")) { 
RDebugUtils.currentLine=23658502;
 //BA.debugLineNum = 23658502;BA.debugLine="imgScreenshot.SetImage(fx.LoadImage(File.DirApp,";
__ref._imgscreenshot /*anywheresoftware.b4j.objects.ImageViewWrapper*/ .SetImage((javafx.scene.image.Image)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(__c.File.getDirApp(),"SideYard.jpg").getObject()));
 }}}
;
RDebugUtils.currentLine=23658504;
 //BA.debugLineNum = 23658504;BA.debugLine="lblTimestamp.Text = timestamp";
__ref._lbltimestamp /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(__ref._timestamp /*String*/ );
RDebugUtils.currentLine=23658505;
 //BA.debugLineNum = 23658505;BA.debugLine="frm.ShowAndWait";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .ShowAndWait();
RDebugUtils.currentLine=23658506;
 //BA.debugLineNum = 23658506;BA.debugLine="End Sub";
return "";
}
public String  _btnhiddenexitescapekey_click(cloyd.blink.frmmedia __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmmedia";
if (Debug.shouldDelegate(ba, "btnhiddenexitescapekey_click", false))
	 {return ((String) Debug.delegate(ba, "btnhiddenexitescapekey_click", null));}
RDebugUtils.currentLine=23986176;
 //BA.debugLineNum = 23986176;BA.debugLine="Sub btnHiddenExitEscapeKey_Click";
RDebugUtils.currentLine=23986177;
 //BA.debugLineNum = 23986177;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=23986178;
 //BA.debugLineNum = 23986178;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.JFX.ScreenWrapper  _checkmonitor(cloyd.blink.frmmedia __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmmedia";
if (Debug.shouldDelegate(ba, "checkmonitor", false))
	 {return ((anywheresoftware.b4j.objects.JFX.ScreenWrapper) Debug.delegate(ba, "checkmonitor", null));}
anywheresoftware.b4a.objects.collections.List _slist = null;
anywheresoftware.b4j.objects.JFX.ScreenWrapper _s = null;
RDebugUtils.currentLine=23920640;
 //BA.debugLineNum = 23920640;BA.debugLine="Sub CheckMonitor() As Screen";
RDebugUtils.currentLine=23920641;
 //BA.debugLineNum = 23920641;BA.debugLine="Try";
try {RDebugUtils.currentLine=23920642;
 //BA.debugLineNum = 23920642;BA.debugLine="If fx.Screens.Size= 1 Then";
if (__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens().getSize()==1) { 
RDebugUtils.currentLine=23920643;
 //BA.debugLineNum = 23920643;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=23920644;
 //BA.debugLineNum = 23920644;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=23920646;
 //BA.debugLineNum = 23920646;BA.debugLine="Return S";
if (true) return _s;
 }else 
{RDebugUtils.currentLine=23920647;
 //BA.debugLineNum = 23920647;BA.debugLine="Else If fx.Screens.Size> 1 Then";
if (__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens().getSize()>1) { 
RDebugUtils.currentLine=23920648;
 //BA.debugLineNum = 23920648;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=23920649;
 //BA.debugLineNum = 23920649;BA.debugLine="Dim S As Screen = SList.Get(2)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (2))));
RDebugUtils.currentLine=23920651;
 //BA.debugLineNum = 23920651;BA.debugLine="Return S";
if (true) return _s;
 }else {
RDebugUtils.currentLine=23920653;
 //BA.debugLineNum = 23920653;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=23920654;
 //BA.debugLineNum = 23920654;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=23920656;
 //BA.debugLineNum = 23920656;BA.debugLine="Return S";
if (true) return _s;
 }}
;
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=23920659;
 //BA.debugLineNum = 23920659;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=23920660;
 //BA.debugLineNum = 23920660;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=23920662;
 //BA.debugLineNum = 23920662;BA.debugLine="Return S";
if (true) return _s;
 };
RDebugUtils.currentLine=23920664;
 //BA.debugLineNum = 23920664;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(cloyd.blink.frmmedia __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmmedia";
RDebugUtils.currentLine=23527424;
 //BA.debugLineNum = 23527424;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=23527425;
 //BA.debugLineNum = 23527425;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=23527426;
 //BA.debugLineNum = 23527426;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=23527427;
 //BA.debugLineNum = 23527427;BA.debugLine="Public url As String";
_url = "";
RDebugUtils.currentLine=23527428;
 //BA.debugLineNum = 23527428;BA.debugLine="Private imgScreenshot As ImageView";
_imgscreenshot = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=23527429;
 //BA.debugLineNum = 23527429;BA.debugLine="Private lblTimestamp As Label";
_lbltimestamp = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=23527430;
 //BA.debugLineNum = 23527430;BA.debugLine="Public timestamp As String";
_timestamp = "";
RDebugUtils.currentLine=23527431;
 //BA.debugLineNum = 23527431;BA.debugLine="Private btnHiddenExitEscapeKey As Button";
_btnhiddenexitescapekey = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=23527432;
 //BA.debugLineNum = 23527432;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(cloyd.blink.frmmedia __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmmedia";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=23789568;
 //BA.debugLineNum = 23789568;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=23789570;
 //BA.debugLineNum = 23789570;BA.debugLine="End Sub";
return "";
}
public String  _keypressed_event(cloyd.blink.frmmedia __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmmedia";
if (Debug.shouldDelegate(ba, "keypressed_event", false))
	 {return ((String) Debug.delegate(ba, "keypressed_event", new Object[] {_e}));}
RDebugUtils.currentLine=23724032;
 //BA.debugLineNum = 23724032;BA.debugLine="Sub KeyPressed_Event (e As Event)";
RDebugUtils.currentLine=23724033;
 //BA.debugLineNum = 23724033;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23855104;
 //BA.debugLineNum = 23855104;BA.debugLine="Private Sub RootPaneKeyEvent_Event(e As Event)";
RDebugUtils.currentLine=23855105;
 //BA.debugLineNum = 23855105;BA.debugLine="Dim KE As Reflector";
_ke = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=23855106;
 //BA.debugLineNum = 23855106;BA.debugLine="Dim sCode As String";
_scode = "";
RDebugUtils.currentLine=23855107;
 //BA.debugLineNum = 23855107;BA.debugLine="Dim sType As String 'ignore";
_stype = "";
RDebugUtils.currentLine=23855108;
 //BA.debugLineNum = 23855108;BA.debugLine="Dim result As Int 'ignore";
_result = 0;
RDebugUtils.currentLine=23855109;
 //BA.debugLineNum = 23855109;BA.debugLine="KE.Target = e	 ' e is a KeyEvent instance";
_ke.Target = (Object)(_e.getObject());
RDebugUtils.currentLine=23855110;
 //BA.debugLineNum = 23855110;BA.debugLine="sCode = KE.RunMethod(\"getCode\")";
_scode = BA.ObjectToString(_ke.RunMethod("getCode"));
RDebugUtils.currentLine=23855111;
 //BA.debugLineNum = 23855111;BA.debugLine="sType = KE.RunMethod(\"getEventType\")";
_stype = BA.ObjectToString(_ke.RunMethod("getEventType"));
RDebugUtils.currentLine=23855112;
 //BA.debugLineNum = 23855112;BA.debugLine="If sCode=\"ESCAPE\" Then";
if ((_scode).equals("ESCAPE")) { 
RDebugUtils.currentLine=23855113;
 //BA.debugLineNum = 23855113;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
 };
RDebugUtils.currentLine=23855115;
 //BA.debugLineNum = 23855115;BA.debugLine="End Sub";
return "";
}
}