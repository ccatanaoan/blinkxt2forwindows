package cloyd.blink;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4jtextflow extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("cloyd.blink", "cloyd.blink.b4jtextflow", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", cloyd.blink.b4jtextflow.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List _texts = null;
public anywheresoftware.b4j.object.JavaObject _lastitem = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public cloyd.blink.main _main = null;
public cloyd.blink.httputils2service _httputils2service = null;
public String  _initialize(cloyd.blink.b4jtextflow __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=20054017;
 //BA.debugLineNum = 20054017;BA.debugLine="Reset";
__ref._reset /*cloyd.blink.b4jtextflow*/ (null);
RDebugUtils.currentLine=20054018;
 //BA.debugLineNum = 20054018;BA.debugLine="End Sub";
return "";
}
public cloyd.blink.b4jtextflow  _reset(cloyd.blink.b4jtextflow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "reset", true))
	 {return ((cloyd.blink.b4jtextflow) Debug.delegate(ba, "reset", null));}
RDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Public Sub Reset As B4JTextFlow";
RDebugUtils.currentLine=20119553;
 //BA.debugLineNum = 20119553;BA.debugLine="texts.Initialize";
__ref._texts /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="Return Me";
if (true) return (cloyd.blink.b4jtextflow)(this);
RDebugUtils.currentLine=20119555;
 //BA.debugLineNum = 20119555;BA.debugLine="End Sub";
return null;
}
public cloyd.blink.b4jtextflow  _append(cloyd.blink.b4jtextflow __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "append", true))
	 {return ((cloyd.blink.b4jtextflow) Debug.delegate(ba, "append", new Object[] {_text}));}
RDebugUtils.currentLine=20185088;
 //BA.debugLineNum = 20185088;BA.debugLine="Public Sub Append(text As String) As B4JTextFlow";
RDebugUtils.currentLine=20185089;
 //BA.debugLineNum = 20185089;BA.debugLine="Dim lastItem As JavaObject";
_lastitem = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="lastItem.InitializeNewInstance(\"javafx.scene.text";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .InitializeNewInstance("javafx.scene.text.Text",new Object[]{(Object)(_text)});
RDebugUtils.currentLine=20185091;
 //BA.debugLineNum = 20185091;BA.debugLine="texts.Add(lastItem)";
__ref._texts /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .getObject()));
RDebugUtils.currentLine=20185092;
 //BA.debugLineNum = 20185092;BA.debugLine="Return Me";
if (true) return (cloyd.blink.b4jtextflow)(this);
RDebugUtils.currentLine=20185093;
 //BA.debugLineNum = 20185093;BA.debugLine="End Sub";
return null;
}
public cloyd.blink.b4jtextflow  _setcolor(cloyd.blink.b4jtextflow __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "setcolor", true))
	 {return ((cloyd.blink.b4jtextflow) Debug.delegate(ba, "setcolor", new Object[] {_color}));}
RDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Public Sub SetColor(Color As Int) As B4JTextFlow";
RDebugUtils.currentLine=20316161;
 //BA.debugLineNum = 20316161;BA.debugLine="lastItem.RunMethod(\"setFill\", Array(fx.Colors.Fro";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setFill",new Object[]{(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(_color))});
RDebugUtils.currentLine=20316162;
 //BA.debugLineNum = 20316162;BA.debugLine="Return Me";
if (true) return (cloyd.blink.b4jtextflow)(this);
RDebugUtils.currentLine=20316163;
 //BA.debugLineNum = 20316163;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _createtextflow(cloyd.blink.b4jtextflow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "createtextflow", true))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "createtextflow", null));}
anywheresoftware.b4j.object.JavaObject _tf = null;
RDebugUtils.currentLine=20512768;
 //BA.debugLineNum = 20512768;BA.debugLine="Public Sub CreateTextFlow As Pane";
RDebugUtils.currentLine=20512769;
 //BA.debugLineNum = 20512769;BA.debugLine="Dim tf As JavaObject";
_tf = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=20512770;
 //BA.debugLineNum = 20512770;BA.debugLine="tf.InitializeNewInstance(\"javafx.scene.text.TextF";
_tf.InitializeNewInstance("javafx.scene.text.TextFlow",(Object[])(__c.Null));
RDebugUtils.currentLine=20512771;
 //BA.debugLineNum = 20512771;BA.debugLine="tf.RunMethod(\"setTextAlignment\", Array(\"CENTER\"))";
_tf.RunMethod("setTextAlignment",new Object[]{(Object)("CENTER")});
RDebugUtils.currentLine=20512772;
 //BA.debugLineNum = 20512772;BA.debugLine="tf.RunMethodJO(\"getChildren\", Null).RunMethod(\"ad";
_tf.RunMethodJO("getChildren",(Object[])(__c.Null)).RunMethod("addAll",new Object[]{(Object)(__ref._texts /*anywheresoftware.b4a.objects.collections.List*/ .getObject())});
RDebugUtils.currentLine=20512773;
 //BA.debugLineNum = 20512773;BA.debugLine="Return tf";
if (true) return (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_tf.getObject()));
RDebugUtils.currentLine=20512774;
 //BA.debugLineNum = 20512774;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(cloyd.blink.b4jtextflow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=19988481;
 //BA.debugLineNum = 19988481;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=19988482;
 //BA.debugLineNum = 19988482;BA.debugLine="Private texts As List";
_texts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=19988483;
 //BA.debugLineNum = 19988483;BA.debugLine="Private lastItem As JavaObject";
_lastitem = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=19988484;
 //BA.debugLineNum = 19988484;BA.debugLine="End Sub";
return "";
}
public cloyd.blink.b4jtextflow  _setfont(cloyd.blink.b4jtextflow __ref,anywheresoftware.b4j.objects.JFX.FontWrapper _font) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "setfont", true))
	 {return ((cloyd.blink.b4jtextflow) Debug.delegate(ba, "setfont", new Object[] {_font}));}
RDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Public Sub SetFont(Font As Font) As B4JTextFlow";
RDebugUtils.currentLine=20250625;
 //BA.debugLineNum = 20250625;BA.debugLine="lastItem.RunMethod(\"setFont\", Array(Font))";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setFont",new Object[]{(Object)(_font.getObject())});
RDebugUtils.currentLine=20250626;
 //BA.debugLineNum = 20250626;BA.debugLine="Return Me";
if (true) return (cloyd.blink.b4jtextflow)(this);
RDebugUtils.currentLine=20250627;
 //BA.debugLineNum = 20250627;BA.debugLine="End Sub";
return null;
}
public cloyd.blink.b4jtextflow  _setstrikethrough(cloyd.blink.b4jtextflow __ref,boolean _strikethrough) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "setstrikethrough", true))
	 {return ((cloyd.blink.b4jtextflow) Debug.delegate(ba, "setstrikethrough", new Object[] {_strikethrough}));}
RDebugUtils.currentLine=20447232;
 //BA.debugLineNum = 20447232;BA.debugLine="Public Sub SetStrikethrough(Strikethrough As Boole";
RDebugUtils.currentLine=20447233;
 //BA.debugLineNum = 20447233;BA.debugLine="lastItem.RunMethod(\"setStrikethrough\", Array(Stri";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setStrikethrough",new Object[]{(Object)(_strikethrough)});
RDebugUtils.currentLine=20447234;
 //BA.debugLineNum = 20447234;BA.debugLine="Return Me";
if (true) return (cloyd.blink.b4jtextflow)(this);
RDebugUtils.currentLine=20447235;
 //BA.debugLineNum = 20447235;BA.debugLine="End Sub";
return null;
}
public cloyd.blink.b4jtextflow  _setunderline(cloyd.blink.b4jtextflow __ref,boolean _underline) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "setunderline", true))
	 {return ((cloyd.blink.b4jtextflow) Debug.delegate(ba, "setunderline", new Object[] {_underline}));}
RDebugUtils.currentLine=20381696;
 //BA.debugLineNum = 20381696;BA.debugLine="Public Sub SetUnderline(Underline As Boolean) As B";
RDebugUtils.currentLine=20381697;
 //BA.debugLineNum = 20381697;BA.debugLine="lastItem.RunMethod(\"setUnderline\", Array(Underlin";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setUnderline",new Object[]{(Object)(_underline)});
RDebugUtils.currentLine=20381698;
 //BA.debugLineNum = 20381698;BA.debugLine="Return Me";
if (true) return (cloyd.blink.b4jtextflow)(this);
RDebugUtils.currentLine=20381699;
 //BA.debugLineNum = 20381699;BA.debugLine="End Sub";
return null;
}
}