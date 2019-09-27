package cloyd.blink;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class frmmedia extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("cloyd.blink", "cloyd.blink.frmmedia", this);
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
public String  _btnhiddenexitescapekey_click() throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub btnHiddenExitEscapeKey_Click";
 //BA.debugLineNum = 90;BA.debugLine="frm.Close";
_frm.Close();
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.JFX.ScreenWrapper  _checkmonitor() throws Exception{
anywheresoftware.b4a.objects.collections.List _slist = null;
anywheresoftware.b4j.objects.JFX.ScreenWrapper _s = null;
 //BA.debugLineNum = 63;BA.debugLine="Sub CheckMonitor() As Screen";
 //BA.debugLineNum = 64;BA.debugLine="Try";
try { //BA.debugLineNum = 65;BA.debugLine="If fx.Screens.Size= 1 Then";
if (_fx.getScreens().getSize()==1) { 
 //BA.debugLineNum = 66;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 67;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 69;BA.debugLine="Return S";
if (true) return _s;
 }else if(_fx.getScreens().getSize()>1) { 
 //BA.debugLineNum = 71;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 72;BA.debugLine="Dim S As Screen = SList.Get(2)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (2))));
 //BA.debugLineNum = 74;BA.debugLine="Return S";
if (true) return _s;
 }else {
 //BA.debugLineNum = 76;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 77;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 79;BA.debugLine="Return S";
if (true) return _s;
 };
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 82;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 83;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 85;BA.debugLine="Return S";
if (true) return _s;
 };
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 3;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 4;BA.debugLine="Public url As String";
_url = "";
 //BA.debugLineNum = 5;BA.debugLine="Private imgScreenshot As ImageView";
_imgscreenshot = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private lblTimestamp As Label";
_lbltimestamp = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Public timestamp As String";
_timestamp = "";
 //BA.debugLineNum = 8;BA.debugLine="Private btnHiddenExitEscapeKey As Button";
_btnhiddenexitescapekey = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4j.agraham.reflection.Reflection _obj = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize (Parent As Form)";
 //BA.debugLineNum = 13;BA.debugLine="frm.Initialize(\"frm\", 600dip, 600dip)";
_frm.Initialize(ba,"frm",__c.DipToCurrent((int) (600)),__c.DipToCurrent((int) (600)));
 //BA.debugLineNum = 14;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 //BA.debugLineNum = 15;BA.debugLine="frm.RootPane.LoadLayout(\"main\")";
_frm.getRootPane().LoadLayout(ba,"main");
 //BA.debugLineNum = 16;BA.debugLine="frm.Icon = fx.LoadImage(File.DirAssets, \"home.png";
_frm.setIcon((javafx.scene.image.Image)(_fx.LoadImage(__c.File.getDirAssets(),"home.png").getObject()));
 //BA.debugLineNum = 17;BA.debugLine="frm.Title = \"Catanaoan Blink XT2 Cameras Media Vi";
_frm.setTitle("Catanaoan Blink XT2 Cameras Media Viewer");
 //BA.debugLineNum = 18;BA.debugLine="frm.SetOwner(Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 19;BA.debugLine="frm.WindowWidth = CheckMonitor.MaxX - CheckMonito";
_frm.setWindowWidth(_checkmonitor().getMaxX()-_checkmonitor().getMinX());
 //BA.debugLineNum = 20;BA.debugLine="frm.WindowLeft = CheckMonitor.MinX";
_frm.setWindowLeft(_checkmonitor().getMinX());
 //BA.debugLineNum = 21;BA.debugLine="frm.WindowHeight = CheckMonitor.MaxY - CheckMo";
_frm.setWindowHeight(_checkmonitor().getMaxY()-_checkmonitor().getMinY());
 //BA.debugLineNum = 22;BA.debugLine="frm.WindowTop = CheckMonitor.MinY";
_frm.setWindowTop(_checkmonitor().getMinY());
 //BA.debugLineNum = 23;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 24;BA.debugLine="Obj.Target = frm.RootPane";
_obj.Target = (Object)(_frm.getRootPane().getObject());
 //BA.debugLineNum = 26;BA.debugLine="Obj.AddEventHandler(\"keypressed\", \"javafx.scene.i";
_obj.AddEventHandler(ba,"keypressed","javafx.scene.input.KeyEvent.KEY_PRESSED");
 //BA.debugLineNum = 27;BA.debugLine="Dim JO As JavaObject = btnHiddenExitEscapeKey";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_btnhiddenexitescapekey.getObject()));
 //BA.debugLineNum = 28;BA.debugLine="JO.RunMethod(\"setCancelButton\",Array(True))  'If";
_jo.RunMethod("setCancelButton",new Object[]{(Object)(__c.True)});
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _keypressed_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub KeyPressed_Event (e As Event)";
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public String  _rootpanekeyevent_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
anywheresoftware.b4j.agraham.reflection.Reflection _ke = null;
String _scode = "";
String _stype = "";
int _result = 0;
 //BA.debugLineNum = 50;BA.debugLine="Private Sub RootPaneKeyEvent_Event(e As Event)";
 //BA.debugLineNum = 51;BA.debugLine="Dim KE As Reflector";
_ke = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 52;BA.debugLine="Dim sCode As String";
_scode = "";
 //BA.debugLineNum = 53;BA.debugLine="Dim sType As String 'ignore";
_stype = "";
 //BA.debugLineNum = 54;BA.debugLine="Dim result As Int 'ignore";
_result = 0;
 //BA.debugLineNum = 55;BA.debugLine="KE.Target = e	 ' e is a KeyEvent instance";
_ke.Target = (Object)(_e.getObject());
 //BA.debugLineNum = 56;BA.debugLine="sCode = KE.RunMethod(\"getCode\")";
_scode = BA.ObjectToString(_ke.RunMethod("getCode"));
 //BA.debugLineNum = 57;BA.debugLine="sType = KE.RunMethod(\"getEventType\")";
_stype = BA.ObjectToString(_ke.RunMethod("getEventType"));
 //BA.debugLineNum = 58;BA.debugLine="If sCode=\"ESCAPE\" Then";
if ((_scode).equals("ESCAPE")) { 
 //BA.debugLineNum = 59;BA.debugLine="frm.Close";
_frm.Close();
 };
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public String  _show() throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Public Sub Show";
 //BA.debugLineNum = 32;BA.debugLine="If url.Contains(\"Driveway\") Then";
if (_url.contains("Driveway")) { 
 //BA.debugLineNum = 33;BA.debugLine="imgScreenshot.SetImage(fx.LoadImage(File.DirApp,";
_imgscreenshot.SetImage((javafx.scene.image.Image)(_fx.LoadImage(__c.File.getDirApp(),"Driveway.jpg").getObject()));
 }else if(_url.contains("FrontDoor")) { 
 //BA.debugLineNum = 35;BA.debugLine="imgScreenshot.SetImage(fx.LoadImage(File.DirApp,";
_imgscreenshot.SetImage((javafx.scene.image.Image)(_fx.LoadImage(__c.File.getDirApp(),"FrontDoor.jpg").getObject()));
 }else if(_url.contains("SideYard")) { 
 //BA.debugLineNum = 37;BA.debugLine="imgScreenshot.SetImage(fx.LoadImage(File.DirApp,";
_imgscreenshot.SetImage((javafx.scene.image.Image)(_fx.LoadImage(__c.File.getDirApp(),"SideYard.jpg").getObject()));
 };
 //BA.debugLineNum = 39;BA.debugLine="lblTimestamp.Text = timestamp";
_lbltimestamp.setText(_timestamp);
 //BA.debugLineNum = 40;BA.debugLine="frm.ShowAndWait";
_frm.ShowAndWait();
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "SHOW"))
	return _show();
return BA.SubDelegator.SubNotFound;
}
}
