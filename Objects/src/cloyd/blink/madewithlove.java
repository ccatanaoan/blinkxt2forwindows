package cloyd.blink;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class madewithlove extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("cloyd.blink", "cloyd.blink.madewithlove", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", cloyd.blink.madewithlove.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public cloyd.blink.main _main = null;
public cloyd.blink.httputils2service _httputils2service = null;
public String  _base_resize(cloyd.blink.madewithlove __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="madewithlove";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=25100288;
 //BA.debugLineNum = 25100288;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=25100289;
 //BA.debugLineNum = 25100289;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Wid";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=25100290;
 //BA.debugLineNum = 25100290;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(cloyd.blink.madewithlove __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="madewithlove";
RDebugUtils.currentLine=24903680;
 //BA.debugLineNum = 24903680;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=24903681;
 //BA.debugLineNum = 24903681;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=24903682;
 //BA.debugLineNum = 24903682;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=24903683;
 //BA.debugLineNum = 24903683;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=24903684;
 //BA.debugLineNum = 24903684;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=24903685;
 //BA.debugLineNum = 24903685;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=24903686;
 //BA.debugLineNum = 24903686;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(cloyd.blink.madewithlove __ref,Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="madewithlove";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
cloyd.blink.b4jtextflow _tf = null;
RDebugUtils.currentLine=25034752;
 //BA.debugLineNum = 25034752;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=25034753;
 //BA.debugLineNum = 25034753;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=25034754;
 //BA.debugLineNum = 25034754;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=25034754;
 //BA.debugLineNum = 25034754;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=25034755;
 //BA.debugLineNum = 25034755;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=25034757;
 //BA.debugLineNum = 25034757;BA.debugLine="Dim tf As B4JTextFlow";
_tf = new cloyd.blink.b4jtextflow();
RDebugUtils.currentLine=25034758;
 //BA.debugLineNum = 25034758;BA.debugLine="tf.Initialize";
_tf._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=25034759;
 //BA.debugLineNum = 25034759;BA.debugLine="tf.Append(\"Made with \")";
_tf._append /*cloyd.blink.b4jtextflow*/ (null,"Made with ");
RDebugUtils.currentLine=25034760;
 //BA.debugLineNum = 25034760;BA.debugLine="tf.SetFont(xlbl.Font)";
_tf._setfont /*cloyd.blink.b4jtextflow*/ (null,(anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(_xlbl.getFont().getObject())));
RDebugUtils.currentLine=25034761;
 //BA.debugLineNum = 25034761;BA.debugLine="tf.SetColor(xlbl.TextColor)";
_tf._setcolor /*cloyd.blink.b4jtextflow*/ (null,_xlbl.getTextColor());
RDebugUtils.currentLine=25034762;
 //BA.debugLineNum = 25034762;BA.debugLine="tf.Append(Chr(0xF004))";
_tf._append /*cloyd.blink.b4jtextflow*/ (null,BA.ObjectToString(__c.Chr((int) (0xf004))));
RDebugUtils.currentLine=25034763;
 //BA.debugLineNum = 25034763;BA.debugLine="tf.SetFont(xui.CreateFontAwesome(xlbl.TextSize))";
_tf._setfont /*cloyd.blink.b4jtextflow*/ (null,(anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFontAwesome((float) (_xlbl.getTextSize())).getObject())));
RDebugUtils.currentLine=25034764;
 //BA.debugLineNum = 25034764;BA.debugLine="tf.SetColor(xui.Color_Red)";
_tf._setcolor /*cloyd.blink.b4jtextflow*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=25034765;
 //BA.debugLineNum = 25034765;BA.debugLine="tf.Append(\" in B4X\")";
_tf._append /*cloyd.blink.b4jtextflow*/ (null," in B4X");
RDebugUtils.currentLine=25034766;
 //BA.debugLineNum = 25034766;BA.debugLine="tf.SetFont(xlbl.Font)";
_tf._setfont /*cloyd.blink.b4jtextflow*/ (null,(anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(_xlbl.getFont().getObject())));
RDebugUtils.currentLine=25034767;
 //BA.debugLineNum = 25034767;BA.debugLine="tf.SetColor(xlbl.TextColor)";
_tf._setcolor /*cloyd.blink.b4jtextflow*/ (null,_xlbl.getTextColor());
RDebugUtils.currentLine=25034768;
 //BA.debugLineNum = 25034768;BA.debugLine="mBase.AddView(tf.CreateTextFlow, 0, 0, mBase.Widt";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_tf._createtextflow /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ (null).getObject()),0,0,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=25034782;
 //BA.debugLineNum = 25034782;BA.debugLine="End Sub";
return "";
}
public String  _initialize(cloyd.blink.madewithlove __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="madewithlove";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=24969216;
 //BA.debugLineNum = 24969216;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=24969217;
 //BA.debugLineNum = 24969217;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=24969218;
 //BA.debugLineNum = 24969218;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=24969219;
 //BA.debugLineNum = 24969219;BA.debugLine="End Sub";
return "";
}
}