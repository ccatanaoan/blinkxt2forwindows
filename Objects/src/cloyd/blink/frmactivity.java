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
public static class _carddata{
public boolean IsInitialized;
public String Title;
public String Content;
public String BitmapFile;
public void Initialize() {
IsInitialized = true;
Title = "";
Content = "";
BitmapFile = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public b4j.example.customlistview _clvactivity = null;
public String _jsonmain = "";
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _ivscreenshot = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblfileinfo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbldeviceinfo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _screenshotbitmap = null;
public anywheresoftware.b4j.objects.ListViewWrapper _lv = null;
public b4j.example.dateutils _dateutils = null;
public cloyd.blink.main _main = null;
public cloyd.blink.httputils2service _httputils2service = null;
public String  _initialize(cloyd.blink.frmactivity __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
anywheresoftware.b4j.agraham.reflection.Reflection _obj = null;
RDebugUtils.currentLine=25362432;
 //BA.debugLineNum = 25362432;BA.debugLine="Public Sub Initialize(Parent As Form)";
RDebugUtils.currentLine=25362433;
 //BA.debugLineNum = 25362433;BA.debugLine="frm.Initialize(\"frm\", 600dip, 600dip)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",__c.DipToCurrent((int) (600)),__c.DipToCurrent((int) (600)));
RDebugUtils.currentLine=25362434;
 //BA.debugLineNum = 25362434;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .SetFormStyle("UTILITY");
RDebugUtils.currentLine=25362435;
 //BA.debugLineNum = 25362435;BA.debugLine="frm.RootPane.LoadLayout(\"main\")";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"main");
RDebugUtils.currentLine=25362436;
 //BA.debugLineNum = 25362436;BA.debugLine="frm.Icon = fx.LoadImage(File.DirAssets, \"home.png";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(__c.File.getDirAssets(),"home.png").getObject()));
RDebugUtils.currentLine=25362437;
 //BA.debugLineNum = 25362437;BA.debugLine="frm.Title = \"Catanaoan Blink XT2 Cameras Activity";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle("Catanaoan Blink XT2 Cameras Activity Viewer");
RDebugUtils.currentLine=25362438;
 //BA.debugLineNum = 25362438;BA.debugLine="frm.SetOwner(Parent)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .SetOwner(_parent);
RDebugUtils.currentLine=25362439;
 //BA.debugLineNum = 25362439;BA.debugLine="frm.WindowWidth = CheckMonitor.MaxX - CheckMonito";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowWidth(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMaxX()-__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinX());
RDebugUtils.currentLine=25362440;
 //BA.debugLineNum = 25362440;BA.debugLine="frm.WindowLeft = CheckMonitor.MinX";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowLeft(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinX());
RDebugUtils.currentLine=25362441;
 //BA.debugLineNum = 25362441;BA.debugLine="frm.WindowHeight = CheckMonitor.MaxY - CheckMonit";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowHeight(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMaxY()-__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinY());
RDebugUtils.currentLine=25362442;
 //BA.debugLineNum = 25362442;BA.debugLine="frm.WindowTop = CheckMonitor.MinY";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setWindowTop(__ref._checkmonitor /*anywheresoftware.b4j.objects.JFX.ScreenWrapper*/ (null).getMinY());
RDebugUtils.currentLine=25362443;
 //BA.debugLineNum = 25362443;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=25362444;
 //BA.debugLineNum = 25362444;BA.debugLine="Obj.Target = frm.RootPane";
_obj.Target = (Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject());
RDebugUtils.currentLine=25362445;
 //BA.debugLineNum = 25362445;BA.debugLine="Obj.AddEventHandler(\"RootPaneKeyEvent\", \"javafx.s";
_obj.AddEventHandler(ba,"RootPaneKeyEvent","javafx.scene.input.KeyEvent.ANY");
RDebugUtils.currentLine=25362446;
 //BA.debugLineNum = 25362446;BA.debugLine="End Sub";
return "";
}
public String  _show(cloyd.blink.frmactivity __ref,String _json,String _userregion,String _authtoken) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_json,_userregion,_authtoken}));}
RDebugUtils.currentLine=25755648;
 //BA.debugLineNum = 25755648;BA.debugLine="Public Sub Show(json As String, userRegion As Stri";
RDebugUtils.currentLine=25755650;
 //BA.debugLineNum = 25755650;BA.debugLine="GetVideos(json, userRegion, authToken)";
__ref._getvideos /*void*/ (null,_json,_userregion,_authtoken);
RDebugUtils.currentLine=25755651;
 //BA.debugLineNum = 25755651;BA.debugLine="frm.ShowAndWait";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .ShowAndWait();
RDebugUtils.currentLine=25755654;
 //BA.debugLineNum = 25755654;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.JFX.ScreenWrapper  _checkmonitor(cloyd.blink.frmactivity __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "checkmonitor", false))
	 {return ((anywheresoftware.b4j.objects.JFX.ScreenWrapper) Debug.delegate(ba, "checkmonitor", null));}
anywheresoftware.b4a.objects.collections.List _slist = null;
anywheresoftware.b4j.objects.JFX.ScreenWrapper _s = null;
RDebugUtils.currentLine=25427968;
 //BA.debugLineNum = 25427968;BA.debugLine="Sub CheckMonitor() As Screen";
RDebugUtils.currentLine=25427969;
 //BA.debugLineNum = 25427969;BA.debugLine="Try";
try {RDebugUtils.currentLine=25427970;
 //BA.debugLineNum = 25427970;BA.debugLine="If fx.Screens.Size= 1 Then";
if (__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens().getSize()==1) { 
RDebugUtils.currentLine=25427971;
 //BA.debugLineNum = 25427971;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=25427972;
 //BA.debugLineNum = 25427972;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=25427974;
 //BA.debugLineNum = 25427974;BA.debugLine="Return S";
if (true) return _s;
 }else 
{RDebugUtils.currentLine=25427975;
 //BA.debugLineNum = 25427975;BA.debugLine="Else If fx.Screens.Size> 1 Then";
if (__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens().getSize()>1) { 
RDebugUtils.currentLine=25427976;
 //BA.debugLineNum = 25427976;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=25427977;
 //BA.debugLineNum = 25427977;BA.debugLine="Dim S As Screen = SList.Get(2)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (2))));
RDebugUtils.currentLine=25427979;
 //BA.debugLineNum = 25427979;BA.debugLine="Return S";
if (true) return _s;
 }else {
RDebugUtils.currentLine=25427981;
 //BA.debugLineNum = 25427981;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=25427982;
 //BA.debugLineNum = 25427982;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=25427984;
 //BA.debugLineNum = 25427984;BA.debugLine="Return S";
if (true) return _s;
 }}
;
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=25427987;
 //BA.debugLineNum = 25427987;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getScreens();
RDebugUtils.currentLine=25427988;
 //BA.debugLineNum = 25427988;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
RDebugUtils.currentLine=25427990;
 //BA.debugLineNum = 25427990;BA.debugLine="Return S";
if (true) return _s;
 };
RDebugUtils.currentLine=25427992;
 //BA.debugLineNum = 25427992;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(cloyd.blink.frmactivity __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
RDebugUtils.currentLine=25296896;
 //BA.debugLineNum = 25296896;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=25296897;
 //BA.debugLineNum = 25296897;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=25296898;
 //BA.debugLineNum = 25296898;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=25296899;
 //BA.debugLineNum = 25296899;BA.debugLine="Public clvActivity As CustomListView";
_clvactivity = new b4j.example.customlistview();
RDebugUtils.currentLine=25296900;
 //BA.debugLineNum = 25296900;BA.debugLine="Public jsonMain As String";
_jsonmain = "";
RDebugUtils.currentLine=25296901;
 //BA.debugLineNum = 25296901;BA.debugLine="Type CardData (Title As String, Content As String";
;
RDebugUtils.currentLine=25296902;
 //BA.debugLineNum = 25296902;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=25296903;
 //BA.debugLineNum = 25296903;BA.debugLine="Private ivScreenshot As B4XView";
_ivscreenshot = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=25296904;
 //BA.debugLineNum = 25296904;BA.debugLine="Private lblFileInfo As B4XView";
_lblfileinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=25296905;
 //BA.debugLineNum = 25296905;BA.debugLine="Private lblDeviceInfo As B4XView";
_lbldeviceinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=25296906;
 //BA.debugLineNum = 25296906;BA.debugLine="Private screenshotBitmap As B4XBitmap";
_screenshotbitmap = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=25296907;
 //BA.debugLineNum = 25296907;BA.debugLine="Private lv As ListView";
_lv = new anywheresoftware.b4j.objects.ListViewWrapper();
RDebugUtils.currentLine=25296908;
 //BA.debugLineNum = 25296908;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlistitem(cloyd.blink.frmactivity __ref,anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _screenshot,String _fileinfo,String _devicename) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "createlistitem", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlistitem", new Object[] {_screenshot,_fileinfo,_devicename}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=26017792;
 //BA.debugLineNum = 26017792;BA.debugLine="Sub CreateListItem(screenshot As Image, fileinfo A";
RDebugUtils.currentLine=26017793;
 //BA.debugLineNum = 26017793;BA.debugLine="Try";
try {RDebugUtils.currentLine=26017797;
 //BA.debugLineNum = 26017797;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=26017801;
 //BA.debugLineNum = 26017801;BA.debugLine="p.LoadLayout(\"cellitem\")";
_p.LoadLayout("cellitem",ba);
RDebugUtils.currentLine=26017802;
 //BA.debugLineNum = 26017802;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 400dip, 300dip)";
_p.SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=26017804;
 //BA.debugLineNum = 26017804;BA.debugLine="ivScreenshot.SetBitmap(screenshot)";
__ref._ivscreenshot /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((javafx.scene.image.Image)(_screenshot.getObject()));
RDebugUtils.currentLine=26017806;
 //BA.debugLineNum = 26017806;BA.debugLine="lblFileInfo.Text = fileinfo";
__ref._lblfileinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_fileinfo);
RDebugUtils.currentLine=26017808;
 //BA.debugLineNum = 26017808;BA.debugLine="lblDeviceInfo.Text = devicename";
__ref._lbldeviceinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_devicename);
RDebugUtils.currentLine=26017809;
 //BA.debugLineNum = 26017809;BA.debugLine="Return p";
if (true) return _p;
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=26017811;
 //BA.debugLineNum = 26017811;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
RDebugUtils.currentLine=26017812;
 //BA.debugLineNum = 26017812;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Null));
 };
RDebugUtils.currentLine=26017815;
 //BA.debugLineNum = 26017815;BA.debugLine="End Sub";
return null;
}
public void  _downloadimage(cloyd.blink.frmactivity __ref,String _link,String _authtoken) throws Exception{
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "downloadimage", false))
	 {Debug.delegate(ba, "downloadimage", new Object[] {_link,_authtoken}); return;}
ResumableSub_DownloadImage rsub = new ResumableSub_DownloadImage(this,__ref,_link,_authtoken);
rsub.resume(ba, null);
}
public static class ResumableSub_DownloadImage extends BA.ResumableSub {
public ResumableSub_DownloadImage(cloyd.blink.frmactivity parent,cloyd.blink.frmactivity __ref,String _link,String _authtoken) {
this.parent = parent;
this.__ref = __ref;
this._link = _link;
this._authtoken = _authtoken;
this.__ref = parent;
}
cloyd.blink.frmactivity __ref;
cloyd.blink.frmactivity parent;
String _link;
String _authtoken;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _a = null;
cloyd.blink.httpjob _j = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;

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
RDebugUtils.currentLine=25821185;
 //BA.debugLineNum = 25821185;BA.debugLine="Dim a As B4XBitmap";
_a = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=25821186;
 //BA.debugLineNum = 25821186;BA.debugLine="Try";
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
RDebugUtils.currentLine=25821187;
 //BA.debugLineNum = 25821187;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
RDebugUtils.currentLine=25821188;
 //BA.debugLineNum = 25821188;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=25821189;
 //BA.debugLineNum = 25821189;BA.debugLine="j.Download(Link)";
_j._download /*String*/ (null,_link);
RDebugUtils.currentLine=25821190;
 //BA.debugLineNum = 25821190;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("TOKEN_AUTH",_authtoken);
RDebugUtils.currentLine=25821191;
 //BA.debugLineNum = 25821191;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frmactivity", "downloadimage"), (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[1];
;
RDebugUtils.currentLine=25821192;
 //BA.debugLineNum = 25821192;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=25821195;
 //BA.debugLineNum = 25821195;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File.";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = parent.__c.File.OpenOutput(parent.__c.File.getDirApp(),"screenshot.jpg",parent.__c.False);
RDebugUtils.currentLine=25821196;
 //BA.debugLineNum = 25821196;BA.debugLine="File.Copy2(j.GetInputStream, out)";
parent.__c.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=25821197;
 //BA.debugLineNum = 25821197;BA.debugLine="out.Close '<------ very important";
_out.Close();
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=25821202;
 //BA.debugLineNum = 25821202;BA.debugLine="a = Null";
_a.setObject((javafx.scene.image.Image)(parent.__c.Null));
 if (true) break;

case 9:
//C
this.state = 12;
;
RDebugUtils.currentLine=25821204;
 //BA.debugLineNum = 25821204;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=25821206;
 //BA.debugLineNum = 25821206;BA.debugLine="a = Null";
_a.setObject((javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=25821207;
 //BA.debugLineNum = 25821207;BA.debugLine="Log(LastException)";
parent.__c.Log(BA.ObjectToString(parent.__c.LastException(ba)));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=25821209;
 //BA.debugLineNum = 25821209;BA.debugLine="screenshotBitmap = a";
__ref._screenshotbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _a;
RDebugUtils.currentLine=25821210;
 //BA.debugLineNum = 25821210;BA.debugLine="End Sub";
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
public String  _frm_closerequest(cloyd.blink.frmactivity __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=25493504;
 //BA.debugLineNum = 25493504;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=25493506;
 //BA.debugLineNum = 25493506;BA.debugLine="End Sub";
return "";
}
public void  _getvideos(cloyd.blink.frmactivity __ref,String _json,String _userregion,String _authtoken) throws Exception{
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "getvideos", false))
	 {Debug.delegate(ba, "getvideos", new Object[] {_json,_userregion,_authtoken}); return;}
ResumableSub_GetVideos rsub = new ResumableSub_GetVideos(this,__ref,_json,_userregion,_authtoken);
rsub.resume(ba, null);
}
public static class ResumableSub_GetVideos extends BA.ResumableSub {
public ResumableSub_GetVideos(cloyd.blink.frmactivity parent,cloyd.blink.frmactivity __ref,String _json,String _userregion,String _authtoken) {
this.parent = parent;
this.__ref = __ref;
this._json = _json;
this._userregion = _userregion;
this._authtoken = _authtoken;
this.__ref = parent;
}
cloyd.blink.frmactivity __ref;
cloyd.blink.frmactivity parent;
String _json;
String _userregion;
String _authtoken;
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
anywheresoftware.b4a.BA.IterableList group8;
int index8;
int groupLen8;

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
RDebugUtils.currentLine=25624577;
 //BA.debugLineNum = 25624577;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 16;
this.catchState = 15;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 15;
RDebugUtils.currentLine=25624578;
 //BA.debugLineNum = 25624578;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=25624579;
 //BA.debugLineNum = 25624579;BA.debugLine="parser.Initialize(json)";
_parser.Initialize(_json);
RDebugUtils.currentLine=25624580;
 //BA.debugLineNum = 25624580;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=25624585;
 //BA.debugLineNum = 25624585;BA.debugLine="lv.Initialize( \"lv\")";
__ref._lv /*anywheresoftware.b4j.objects.ListViewWrapper*/ .Initialize(ba,"lv");
RDebugUtils.currentLine=25624586;
 //BA.debugLineNum = 25624586;BA.debugLine="frm.RootPane.AddNode(lv, frm.WindowWidth-frm.Win";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().AddNode((javafx.scene.Node)(__ref._lv /*anywheresoftware.b4j.objects.ListViewWrapper*/ .getObject()),__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getWindowWidth()-__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getWindowWidth()/(double)4,0,__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getWindowWidth()/(double)4,__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getWindowHeight());
RDebugUtils.currentLine=25624588;
 //BA.debugLineNum = 25624588;BA.debugLine="Dim media As List = root.Get(\"media\")";
_media = new anywheresoftware.b4a.objects.collections.List();
_media.setObject((java.util.List)(_root.Get((Object)("media"))));
RDebugUtils.currentLine=25624589;
 //BA.debugLineNum = 25624589;BA.debugLine="For Each colmedia As Map In media";
if (true) break;

case 4:
//for
this.state = 13;
_colmedia = new anywheresoftware.b4a.objects.collections.Map();
group8 = _media;
index8 = 0;
groupLen8 = group8.getSize();
this.state = 17;
if (true) break;

case 17:
//C
this.state = 13;
if (index8 < groupLen8) {
this.state = 6;
_colmedia.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group8.Get(index8)));}
if (true) break;

case 18:
//C
this.state = 17;
index8++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=25624590;
 //BA.debugLineNum = 25624590;BA.debugLine="Dim thumbnail As String = colmedia.Get(\"thumbna";
_thumbnail = BA.ObjectToString(_colmedia.Get((Object)("thumbnail")));
RDebugUtils.currentLine=25624593;
 //BA.debugLineNum = 25624593;BA.debugLine="Dim created_at As String = colmedia.Get(\"create";
_created_at = BA.ObjectToString(_colmedia.Get((Object)("created_at")));
RDebugUtils.currentLine=25624598;
 //BA.debugLineNum = 25624598;BA.debugLine="Dim device_name As String = colmedia.Get(\"devic";
_device_name = BA.ObjectToString(_colmedia.Get((Object)("device_name")));
RDebugUtils.currentLine=25624608;
 //BA.debugLineNum = 25624608;BA.debugLine="Dim medianame As String = colmedia.Get(\"media\")";
_medianame = BA.ObjectToString(_colmedia.Get((Object)("media")));
RDebugUtils.currentLine=25624620;
 //BA.debugLineNum = 25624620;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
RDebugUtils.currentLine=25624621;
 //BA.debugLineNum = 25624621;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=25624622;
 //BA.debugLineNum = 25624622;BA.debugLine="j.Download(\"https://rest-\" & userRegion &\".imme";
_j._download /*String*/ (null,"https://rest-"+_userregion+".immedia-semi.com"+_thumbnail+".jpg");
RDebugUtils.currentLine=25624623;
 //BA.debugLineNum = 25624623;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("TOKEN_AUTH",_authtoken);
RDebugUtils.currentLine=25624624;
 //BA.debugLineNum = 25624624;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frmactivity", "getvideos"), (Object)(_j));
this.state = 19;
return;
case 19:
//C
this.state = 7;
_j = (cloyd.blink.httpjob) result[1];
;
RDebugUtils.currentLine=25624625;
 //BA.debugLineNum = 25624625;BA.debugLine="If j.Success Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_j._success /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=25624628;
 //BA.debugLineNum = 25624628;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = parent.__c.File.OpenOutput(parent.__c.File.getDirApp(),"screenshot.jpg",parent.__c.False);
RDebugUtils.currentLine=25624629;
 //BA.debugLineNum = 25624629;BA.debugLine="File.Copy2(j.GetInputStream, out)";
parent.__c.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=25624630;
 //BA.debugLineNum = 25624630;BA.debugLine="out.Close '<------ very important";
_out.Close();
RDebugUtils.currentLine=25624634;
 //BA.debugLineNum = 25624634;BA.debugLine="Dim p As B4XView = CreateListItem(j.GetBitmap,";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._createlistitem /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_j._getbitmap /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ (null),_created_at,_device_name);
RDebugUtils.currentLine=25624635;
 //BA.debugLineNum = 25624635;BA.debugLine="clvActivity.Add(p,\"\")";
__ref._clvactivity /*b4j.example.customlistview*/ ._add(_p,(Object)(""));
 if (true) break;

case 11:
//C
this.state = 12;
 if (true) break;

case 12:
//C
this.state = 18;
;
RDebugUtils.currentLine=25624640;
 //BA.debugLineNum = 25624640;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;
if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
RDebugUtils.currentLine=25624645;
 //BA.debugLineNum = 25624645;BA.debugLine="Log(LastException)";
parent.__c.Log(BA.ObjectToString(parent.__c.LastException(ba)));
 if (true) break;
if (true) break;

case 16:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=25624647;
 //BA.debugLineNum = 25624647;BA.debugLine="End Sub";
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
public String  _lv_selectedindexchanged(cloyd.blink.frmactivity __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "lv_selectedindexchanged", false))
	 {return ((String) Debug.delegate(ba, "lv_selectedindexchanged", new Object[] {_index}));}
RDebugUtils.currentLine=28770304;
 //BA.debugLineNum = 28770304;BA.debugLine="Sub lv_SelectedIndexChanged(Index As Int)";
RDebugUtils.currentLine=28770305;
 //BA.debugLineNum = 28770305;BA.debugLine="If Index > -1 Then";
if (_index>-1) { 
 };
RDebugUtils.currentLine=28770309;
 //BA.debugLineNum = 28770309;BA.debugLine="End Sub";
return "";
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
RDebugUtils.currentLine=25559040;
 //BA.debugLineNum = 25559040;BA.debugLine="Private Sub RootPaneKeyEvent_Event(e As Event)";
RDebugUtils.currentLine=25559041;
 //BA.debugLineNum = 25559041;BA.debugLine="Dim KE As Reflector";
_ke = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=25559042;
 //BA.debugLineNum = 25559042;BA.debugLine="Dim sCode As String";
_scode = "";
RDebugUtils.currentLine=25559043;
 //BA.debugLineNum = 25559043;BA.debugLine="Dim sType As String 'ignore";
_stype = "";
RDebugUtils.currentLine=25559044;
 //BA.debugLineNum = 25559044;BA.debugLine="Dim result As Int 'ignore";
_result = 0;
RDebugUtils.currentLine=25559045;
 //BA.debugLineNum = 25559045;BA.debugLine="KE.Target = e	 ' e is a KeyEvent instance";
_ke.Target = (Object)(_e.getObject());
RDebugUtils.currentLine=25559046;
 //BA.debugLineNum = 25559046;BA.debugLine="sCode = KE.RunMethod(\"getCode\")";
_scode = BA.ObjectToString(_ke.RunMethod("getCode"));
RDebugUtils.currentLine=25559047;
 //BA.debugLineNum = 25559047;BA.debugLine="sType = KE.RunMethod(\"getEventType\")";
_stype = BA.ObjectToString(_ke.RunMethod("getEventType"));
RDebugUtils.currentLine=25559048;
 //BA.debugLineNum = 25559048;BA.debugLine="If sCode=\"ESCAPE\" Then";
if ((_scode).equals("ESCAPE")) { 
RDebugUtils.currentLine=25559049;
 //BA.debugLineNum = 25559049;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
 };
RDebugUtils.currentLine=25559051;
 //BA.debugLineNum = 25559051;BA.debugLine="End Sub";
return "";
}
public void  _showvideo(cloyd.blink.frmactivity __ref,String _link,String _authtoken) throws Exception{
RDebugUtils.currentModule="frmactivity";
if (Debug.shouldDelegate(ba, "showvideo", false))
	 {Debug.delegate(ba, "showvideo", new Object[] {_link,_authtoken}); return;}
ResumableSub_ShowVideo rsub = new ResumableSub_ShowVideo(this,__ref,_link,_authtoken);
rsub.resume(ba, null);
}
public static class ResumableSub_ShowVideo extends BA.ResumableSub {
public ResumableSub_ShowVideo(cloyd.blink.frmactivity parent,cloyd.blink.frmactivity __ref,String _link,String _authtoken) {
this.parent = parent;
this.__ref = __ref;
this._link = _link;
this._authtoken = _authtoken;
this.__ref = parent;
}
cloyd.blink.frmactivity __ref;
cloyd.blink.frmactivity parent;
String _link;
String _authtoken;
cloyd.blink.httpjob _j = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;

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
RDebugUtils.currentLine=25690113;
 //BA.debugLineNum = 25690113;BA.debugLine="Try";
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
RDebugUtils.currentLine=25690114;
 //BA.debugLineNum = 25690114;BA.debugLine="Dim j As HttpJob";
_j = new cloyd.blink.httpjob();
RDebugUtils.currentLine=25690115;
 //BA.debugLineNum = 25690115;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=25690116;
 //BA.debugLineNum = 25690116;BA.debugLine="j.Download(Link)";
_j._download /*String*/ (null,_link);
RDebugUtils.currentLine=25690117;
 //BA.debugLineNum = 25690117;BA.debugLine="j.GetRequest.SetHeader(\"TOKEN_AUTH\", authToken)";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("TOKEN_AUTH",_authtoken);
RDebugUtils.currentLine=25690118;
 //BA.debugLineNum = 25690118;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "frmactivity", "showvideo"), (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_j = (cloyd.blink.httpjob) result[1];
;
RDebugUtils.currentLine=25690119;
 //BA.debugLineNum = 25690119;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=25690121;
 //BA.debugLineNum = 25690121;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File.";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = parent.__c.File.OpenOutput(parent.__c.File.getDirApp(),"media.mp4",parent.__c.False);
RDebugUtils.currentLine=25690122;
 //BA.debugLineNum = 25690122;BA.debugLine="File.Copy2(j.GetInputStream, out)";
parent.__c.File.Copy2((java.io.InputStream)(_j._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=25690123;
 //BA.debugLineNum = 25690123;BA.debugLine="out.Close '<------ very important";
_out.Close();
 if (true) break;

case 8:
//C
this.state = 9;
 if (true) break;

case 9:
//C
this.state = 12;
;
RDebugUtils.currentLine=25690133;
 //BA.debugLineNum = 25690133;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=25690135;
 //BA.debugLineNum = 25690135;BA.debugLine="Log(LastException)";
parent.__c.Log(BA.ObjectToString(parent.__c.LastException(ba)));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=25690137;
 //BA.debugLineNum = 25690137;BA.debugLine="End Sub";
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
}