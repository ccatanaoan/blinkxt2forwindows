package cloyd.blink;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4jtextflow extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("cloyd.blink", "cloyd.blink.b4jtextflow", this);
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4a.objects.collections.List _texts = null;
public anywheresoftware.b4j.object.JavaObject _lastitem = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public cloyd.blink.main _main = null;
public cloyd.blink.httputils2service _httputils2service = null;
public cloyd.blink.b4jtextflow  _append(String _text) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Append(text As String) As B4JTextFlow";
 //BA.debugLineNum = 17;BA.debugLine="Dim lastItem As JavaObject";
_lastitem = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 18;BA.debugLine="lastItem.InitializeNewInstance(\"javafx.scene.text";
_lastitem.InitializeNewInstance("javafx.scene.text.Text",new Object[]{(Object)(_text)});
 //BA.debugLineNum = 19;BA.debugLine="texts.Add(lastItem)";
_texts.Add((Object)(_lastitem.getObject()));
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (cloyd.blink.b4jtextflow)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 3;BA.debugLine="Private texts As List";
_texts = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 4;BA.debugLine="Private lastItem As JavaObject";
_lastitem = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _createtextflow() throws Exception{
anywheresoftware.b4j.object.JavaObject _tf = null;
 //BA.debugLineNum = 45;BA.debugLine="Public Sub CreateTextFlow As Pane";
 //BA.debugLineNum = 46;BA.debugLine="Dim tf As JavaObject";
_tf = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 47;BA.debugLine="tf.InitializeNewInstance(\"javafx.scene.text.TextF";
_tf.InitializeNewInstance("javafx.scene.text.TextFlow",(Object[])(__c.Null));
 //BA.debugLineNum = 48;BA.debugLine="tf.RunMethod(\"setTextAlignment\", Array(\"CENTER\"))";
_tf.RunMethod("setTextAlignment",new Object[]{(Object)("CENTER")});
 //BA.debugLineNum = 49;BA.debugLine="tf.RunMethodJO(\"getChildren\", Null).RunMethod(\"ad";
_tf.RunMethodJO("getChildren",(Object[])(__c.Null)).RunMethod("addAll",new Object[]{(Object)(_texts.getObject())});
 //BA.debugLineNum = 50;BA.debugLine="Return tf";
if (true) return (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_tf.getObject()));
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 8;BA.debugLine="Reset";
_reset();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public cloyd.blink.b4jtextflow  _reset() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Reset As B4JTextFlow";
 //BA.debugLineNum = 12;BA.debugLine="texts.Initialize";
_texts.Initialize();
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (cloyd.blink.b4jtextflow)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public cloyd.blink.b4jtextflow  _setcolor(int _color) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Public Sub SetColor(Color As Int) As B4JTextFlow";
 //BA.debugLineNum = 29;BA.debugLine="lastItem.RunMethod(\"setFill\", Array(fx.Colors.Fro";
_lastitem.RunMethod("setFill",new Object[]{(Object)(_fx.Colors.From32Bit(_color))});
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (cloyd.blink.b4jtextflow)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public cloyd.blink.b4jtextflow  _setfont(anywheresoftware.b4j.objects.JFX.FontWrapper _font) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Public Sub SetFont(Font As Font) As B4JTextFlow";
 //BA.debugLineNum = 24;BA.debugLine="lastItem.RunMethod(\"setFont\", Array(Font))";
_lastitem.RunMethod("setFont",new Object[]{(Object)(_font.getObject())});
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (cloyd.blink.b4jtextflow)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public cloyd.blink.b4jtextflow  _setstrikethrough(boolean _strikethrough) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Public Sub SetStrikethrough(Strikethrough As Boole";
 //BA.debugLineNum = 39;BA.debugLine="lastItem.RunMethod(\"setStrikethrough\", Array(Stri";
_lastitem.RunMethod("setStrikethrough",new Object[]{(Object)(_strikethrough)});
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (cloyd.blink.b4jtextflow)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public cloyd.blink.b4jtextflow  _setunderline(boolean _underline) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Public Sub SetUnderline(Underline As Boolean) As B";
 //BA.debugLineNum = 34;BA.debugLine="lastItem.RunMethod(\"setUnderline\", Array(Underlin";
_lastitem.RunMethod("setUnderline",new Object[]{(Object)(_underline)});
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (cloyd.blink.b4jtextflow)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
