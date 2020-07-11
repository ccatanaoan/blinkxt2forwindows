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
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub Initialize (Parent As Form)";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="frm.Initialize(\"frm\", 600dip, 600dip)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",__c.DipToCurrent((int) (600)),__c.DipToCurrent((int) (600)));
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .SetFormStyle("UTILITY");
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="frm.RootPane.LoadLayout(\"main\")";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"main");
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="frm.Icon = fx.LoadImage(File.DirAssets, \"home.png";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(__c.File.getDirAssets(),"home.png").getObject()));
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="frm.Title = \"Catanaoan Blink XT2 Cameras Media Vi";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle("Catanaoan Blink XT2 Cameras Media Viewer");
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="frm.SetOwner(Parent)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .SetOwner(_parent);
RDebugUtils.currentLine=4849671;
 //BA.debugLineNum = 4849671;BA.debugLine="frm.WindowWidth = CheckMonitor.MaxX - CheckMonito";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowWidth(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMaxX()-__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinX());
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="frm.WindowLeft = CheckMonitor.MinX";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowLeft(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinX());
RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="frm.WindowHeight = CheckMonitor.MaxY - CheckMo";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowHeight(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMaxY()-__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinY());
RDebugUtils.currentLine=4849674;
 //BA.debugLineNum = 4849674;BA.debugLine="frm.WindowTop = CheckMonitor.MinY";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowTop(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinY());
RDebugUtils.currentLine=4849675;
 //BA.debugLineNum = 4849675;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=4849676;
 //BA.debugLineNum = 4849676;BA.debugLine="Obj.Target = frm.RootPane";
_obj.Target = (Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject());
RDebugUtils.currentLine=4849678;
 //BA.debugLineNum = 4849678;BA.debugLine="Obj.AddEventHandler(\"keypressed\", \"javafx.scene.i";
_obj.AddEventHandler(ba,"keypressed","javafx.scene.input.KeyEvent.KEY_PRESSED");
RDebugUtils.currentLine=4849679;
 //BA.debugLineNum = 4849679;BA.debugLine="Dim JO As JavaObject = btnHiddenExitEscapeKey";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._btnhiddenexitescapekey /*anywheresoftware.b4j.objects.ButtonWrapper*/ .getObject()));
RDebugUtils.currentLine=4849680;
 //BA.debugLineNum = 4849680;BA.debugLine="JO.RunMethod(\"setCancelButton\",Array(True))  'If";
_jo.RunMethod("setCancelButton",new Object[]{(Object)(__c.True)});
RDebugUtils.currentLine=4849681;
 //BA.debugLineNum = 4849681;BA.debugLine="End Sub";
return "";
}
public String  _show(cloyd.blink.frmmedia __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmmedia";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="If url.Contains(\"Driveway\") Then";
if (__ref._url /*String*/ .contains("Driveway")) { 
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="imgScreenshot.SetImage(fx.LoadImage(File.DirApp,";
__ref._imgscreenshot /*anywheresoftware.b4j.objects.ImageViewWrapper*/ .SetImage((javafx.scene.image.Image)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(__c.File.getDirApp(),"Driveway.jpg").getObject()));
 }else 
{RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="Else if url.Contains(\"FrontDoor\") Then";
if (__ref._url /*String*/ .contains("FrontDoor")) { 
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="imgScreenshot.SetImage(fx.LoadImage(File.DirApp,";
__ref._imgscreenshot /*anywheresoftware.b4j.objects.ImageViewWrapper*/ .SetImage((javafx.scene.image.Image)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(__c.File.getDirApp(),"FrontDoor.jpg").getObject()));
 }else 
{RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="Else if url.Contains(\"SideYard\") Then";
if (__ref._url /*String*/ .contains("SideYard")) { 
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="imgScreenshot.SetImage(fx.LoadImage(File.DirApp,";
__ref._imgscreenshot /*anywheresoftware.b4j.objects.ImageViewWrapper*/ .SetImage((javafx.scene.image.Image)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(__c.File.getDirApp(),"SideYard.jpg").getObject()));
 }}}
;
RDebugUtils.currentLine=4915208;
 //BA.debugLineNum = 4915208;BA.debugLine="lblTimestamp.Text = timestamp";
__ref._lbltimestamp /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(__ref._timestamp /*String*/ );
RDebugUtils.currentLine=4915209;
 //BA.debugLineNum = 4915209;BA.debugLine="frm.ShowAndWait";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .ShowAndWait();
RDebugUtils.currentLine=4915210;
 //BA.debugLineNum = 4915210;BA.debugLine="End Sub";
return "";
}
public String  _btnhiddenexitescapekey_click(cloyd.blink.frmmedia __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmmedia";
if (Debug.shouldDelegate(ba, "btnhiddenexitescapekey_click", false))
	 {return ((String) Debug.delegate(ba, "btnhiddenexitescapekey_click", null));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub btnHiddenExitEscapeKey_Click";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.JFX.ScreenWrapper  _checkmonitor(cloyd.blink.frmmedia __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmmedia";
if (Debug.shouldDelegate(ba, "checkmonitor", false))
	 {return ((anywheresoftware.b4j.objects.JFX.ScreenWrapper) Debug.delegate(ba, "checkmonitor", null));}
anywheresoftware.b4a.objects.collections.List _slist = null;
anywheresoftware.b4j.objects.JFX.ScreenWrapper _s = null;
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Sub CheckMonitor() As Screen";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="Try";
try {RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="If fx.Screens.Size= 1 Then";
if (__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens().getSize()==1) { 
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s = (anywheresoftware.b4j.objects.JFX.ScreenWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.ScreenWrapper(), (javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=5177350;
 //BA.debugLineNum = 5177350;BA.debugLine="Return S";
if (true) return _s;
 }else 
{RDebugUtils.currentLine=5177351;
 //BA.debugLineNum = 5177351;BA.debugLine="Else If fx.Screens.Size> 1 Then";
if (__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens().getSize()>1) { 
RDebugUtils.currentLine=5177352;
 //BA.debugLineNum = 5177352;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=5177353;
 //BA.debugLineNum = 5177353;BA.debugLine="Dim S As Screen = SList.Get(2)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s = (anywheresoftware.b4j.objects.JFX.ScreenWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.ScreenWrapper(), (javafx.stage.Screen)(_slist.Get((int) (2))));
RDebugUtils.currentLine=5177355;
 //BA.debugLineNum = 5177355;BA.debugLine="Return S";
if (true) return _s;
 }else {
RDebugUtils.currentLine=5177357;
 //BA.debugLineNum = 5177357;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=5177358;
 //BA.debugLineNum = 5177358;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s = (anywheresoftware.b4j.objects.JFX.ScreenWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.ScreenWrapper(), (javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=5177360;
 //BA.debugLineNum = 5177360;BA.debugLine="Return S";
if (true) return _s;
 }}
;
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=5177363;
 //BA.debugLineNum = 5177363;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=5177364;
 //BA.debugLineNum = 5177364;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s = (anywheresoftware.b4j.objects.JFX.ScreenWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.ScreenWrapper(), (javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=5177366;
 //BA.debugLineNum = 5177366;BA.debugLine="Return S";
if (true) return _s;
 };
RDebugUtils.currentLine=5177368;
 //BA.debugLineNum = 5177368;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(cloyd.blink.frmmedia __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmmedia";
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="Public url As String";
_url = "";
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="Private imgScreenshot As ImageView";
_imgscreenshot = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="Private lblTimestamp As Label";
_lbltimestamp = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=4784134;
 //BA.debugLineNum = 4784134;BA.debugLine="Public timestamp As String";
_timestamp = "";
RDebugUtils.currentLine=4784135;
 //BA.debugLineNum = 4784135;BA.debugLine="Private btnHiddenExitEscapeKey As Button";
_btnhiddenexitescapekey = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=4784136;
 //BA.debugLineNum = 4784136;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(cloyd.blink.frmmedia __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmmedia";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="End Sub";
return "";
}
public String  _keypressed_event(cloyd.blink.frmmedia __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmmedia";
if (Debug.shouldDelegate(ba, "keypressed_event", false))
	 {return ((String) Debug.delegate(ba, "keypressed_event", new Object[] {_e}));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Sub KeyPressed_Event (e As Event)";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Private Sub RootPaneKeyEvent_Event(e As Event)";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Dim KE As Reflector";
_ke = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="Dim sCode As String";
_scode = "";
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="Dim sType As String 'ignore";
_stype = "";
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="Dim result As Int 'ignore";
_result = 0;
RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="KE.Target = e	 ' e is a KeyEvent instance";
_ke.Target = (Object)(_e.getObject());
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="sCode = KE.RunMethod(\"getCode\")";
_scode = BA.ObjectToString(_ke.RunMethod("getCode"));
RDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="sType = KE.RunMethod(\"getEventType\")";
_stype = BA.ObjectToString(_ke.RunMethod("getEventType"));
RDebugUtils.currentLine=5111816;
 //BA.debugLineNum = 5111816;BA.debugLine="If sCode=\"ESCAPE\" Then";
if ((_scode).equals("ESCAPE")) { 
RDebugUtils.currentLine=5111817;
 //BA.debugLineNum = 5111817;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
 };
RDebugUtils.currentLine=5111819;
 //BA.debugLineNum = 5111819;BA.debugLine="End Sub";
return "";
}
}