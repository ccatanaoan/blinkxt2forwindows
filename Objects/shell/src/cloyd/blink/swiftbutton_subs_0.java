package cloyd.blink;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class swiftbutton_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (swiftbutton) ","swiftbutton",25,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "swiftbutton","base_resize", __ref, _width, _height);}
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 39;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 40;BA.debugLine="cvs.Resize(Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Resize",(Object)(_width),(Object)(_height));
 BA.debugLineNum = 41;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
Debug.JustUpdateDeviceLine();
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group2 = __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"GetAllViewsRecursive");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_v.setObject(group2.runMethod(false,"Get",index2));
Debug.locals.put("v", _v);
 BA.debugLineNum = 42;BA.debugLine="v.SetLayoutAnimated(0, 0, 0, Width, Height)";
Debug.JustUpdateDeviceLine();
_v.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_width),(Object)(_height));
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 44;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (cloyd.blink.swiftbutton.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private mEventName As String 'ignore";
swiftbutton._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",swiftbutton._meventname);
 //BA.debugLineNum = 7;BA.debugLine="Private mCallBack As Object 'ignore";
swiftbutton._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",swiftbutton._mcallback);
 //BA.debugLineNum = 8;BA.debugLine="Public mBase As B4XView 'ignore";
swiftbutton._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",swiftbutton._mbase);
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI 'ignore";
swiftbutton._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",swiftbutton._xui);
 //BA.debugLineNum = 10;BA.debugLine="Private cvs As B4XCanvas";
swiftbutton._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_cvs",swiftbutton._cvs);
 //BA.debugLineNum = 11;BA.debugLine="Public xLBL As B4XView";
swiftbutton._xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xlbl",swiftbutton._xlbl);
 //BA.debugLineNum = 12;BA.debugLine="Private clr1, clr2, disabledColor As Int";
swiftbutton._clr1 = RemoteObject.createImmutable(0);__ref.setField("_clr1",swiftbutton._clr1);
swiftbutton._clr2 = RemoteObject.createImmutable(0);__ref.setField("_clr2",swiftbutton._clr2);
swiftbutton._disabledcolor = RemoteObject.createImmutable(0);__ref.setField("_disabledcolor",swiftbutton._disabledcolor);
 //BA.debugLineNum = 13;BA.debugLine="Private pressed As Boolean";
swiftbutton._pressed = RemoteObject.createImmutable(false);__ref.setField("_pressed",swiftbutton._pressed);
 //BA.debugLineNum = 14;BA.debugLine="Public Tag As Object";
swiftbutton._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",swiftbutton._tag);
 //BA.debugLineNum = 15;BA.debugLine="Private mDisabled As Boolean";
swiftbutton._mdisabled = RemoteObject.createImmutable(false);__ref.setField("_mdisabled",swiftbutton._mdisabled);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (swiftbutton) ","swiftbutton",25,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "swiftbutton","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 23;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 24;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 25;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 25;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 26;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"p\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("p")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 27;BA.debugLine="p.Color = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
_p.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 28;BA.debugLine="clr1 = xui.PaintOrColorToColor(Props.Get(\"Primary";
Debug.JustUpdateDeviceLine();
__ref.setField ("_clr1" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PrimaryColor")))))));
 BA.debugLineNum = 29;BA.debugLine="clr2 = xui.PaintOrColorToColor(Props.Get(\"Seconda";
Debug.JustUpdateDeviceLine();
__ref.setField ("_clr2" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SecondaryColor")))))));
 BA.debugLineNum = 30;BA.debugLine="disabledColor = xui.PaintOrColorToColor(Props.Get";
Debug.JustUpdateDeviceLine();
__ref.setField ("_disabledcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("DisabledColor"))),(Object)(RemoteObject.createImmutable((0xff999999)))))));
 BA.debugLineNum = 31;BA.debugLine="xLBL = Lbl";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xlbl" /*RemoteObject*/ ).setObject (_lbl.getObject());
 BA.debugLineNum = 32;BA.debugLine="mBase.AddView(xLBL, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xlbl" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 33;BA.debugLine="mBase.AddView(p, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 34;BA.debugLine="xLBL.SetTextAlignment(\"CENTER\", \"CENTER\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xlbl" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 35;BA.debugLine="cvs.Initialize(mBase)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ )));
 BA.debugLineNum = 36;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (cloyd.blink.swiftbutton.class, "_base_resize" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _draw(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Draw (swiftbutton) ","swiftbutton",25,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("draw")) { return __ref.runUserSub(false, "swiftbutton","draw", __ref);}
RemoteObject _gap = RemoteObject.createImmutable(0);
RemoteObject _corners = RemoteObject.createImmutable(0);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");
RemoteObject _c = RemoteObject.createImmutable(0);
 BA.debugLineNum = 90;BA.debugLine="Private Sub Draw";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 91;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 92;BA.debugLine="Dim gap As Int = 5dip";
Debug.JustUpdateDeviceLine();
_gap = swiftbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("gap", _gap);Debug.locals.put("gap", _gap);
 BA.debugLineNum = 93;BA.debugLine="Dim corners As Int = 15dip";
Debug.JustUpdateDeviceLine();
_corners = swiftbutton.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15)));Debug.locals.put("corners", _corners);Debug.locals.put("corners", _corners);
 BA.debugLineNum = 94;BA.debugLine="Dim r As B4XRect";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("r", _r);
 BA.debugLineNum = 95;BA.debugLine="Dim p As B4XPath";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XPath");Debug.locals.put("p", _p);
 BA.debugLineNum = 96;BA.debugLine="r.Initialize(0, gap, mBase.Width, mBase.Height)";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _gap)),(Object)(BA.numberCast(float.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(float.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 97;BA.debugLine="If pressed = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_pressed" /*RemoteObject*/ ),swiftbutton.__c.getField(true,"False"))) { 
 BA.debugLineNum = 98;BA.debugLine="xLBL.Top = 0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(double.class, 0));
 BA.debugLineNum = 99;BA.debugLine="p.InitializeRoundedRect(r, corners)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("InitializeRoundedRect",(Object)(_r),(Object)(BA.numberCast(float.class, _corners)));
 BA.debugLineNum = 100;BA.debugLine="cvs.DrawPath(p, clr2, True, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_p),(Object)(__ref.getField(true,"_clr2" /*RemoteObject*/ )),(Object)(swiftbutton.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 101;BA.debugLine="r.Initialize(0, 0, mBase.Width, mBase.Height - g";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),_gap}, "-",1, 0))));
 BA.debugLineNum = 102;BA.debugLine="p.InitializeRoundedRect(r, corners)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("InitializeRoundedRect",(Object)(_r),(Object)(BA.numberCast(float.class, _corners)));
 BA.debugLineNum = 103;BA.debugLine="cvs.DrawPath(p, clr1, True, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_p),(Object)(__ref.getField(true,"_clr1" /*RemoteObject*/ )),(Object)(swiftbutton.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 }else {
 BA.debugLineNum = 105;BA.debugLine="xLBL.Top = gap";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(double.class, _gap));
 BA.debugLineNum = 106;BA.debugLine="p.InitializeRoundedRect(r, corners)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("InitializeRoundedRect",(Object)(_r),(Object)(BA.numberCast(float.class, _corners)));
 BA.debugLineNum = 107;BA.debugLine="Dim c As Int";
Debug.JustUpdateDeviceLine();
_c = RemoteObject.createImmutable(0);Debug.locals.put("c", _c);
 BA.debugLineNum = 108;BA.debugLine="If mDisabled Then c = disabledColor Else c = clr";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_mdisabled" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
_c = __ref.getField(true,"_disabledcolor" /*RemoteObject*/ );Debug.locals.put("c", _c);}
else {
_c = __ref.getField(true,"_clr1" /*RemoteObject*/ );Debug.locals.put("c", _c);};
 BA.debugLineNum = 109;BA.debugLine="cvs.DrawPath(p, c, True, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawPath",(Object)(_p),(Object)(_c),(Object)(swiftbutton.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 };
 BA.debugLineNum = 112;BA.debugLine="cvs.Invalidate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getenabled(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getEnabled (swiftbutton) ","swiftbutton",25,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("getenabled")) { return __ref.runUserSub(false, "swiftbutton","getenabled", __ref);}
 BA.debugLineNum = 47;BA.debugLine="Public Sub getEnabled As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 48;BA.debugLine="Return Not(mDisabled)";
Debug.JustUpdateDeviceLine();
if (true) return swiftbutton.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_mdisabled" /*RemoteObject*/ )));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (swiftbutton) ","swiftbutton",25,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "swiftbutton","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 19;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 20;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _p_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("p_MouseClicked (swiftbutton) ","swiftbutton",25,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("p_mouseclicked")) { return __ref.runUserSub(false, "swiftbutton","p_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 79;BA.debugLine="Private Sub p_MouseClicked (EventData As MouseEven";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 80;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _p_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("p_Touch (swiftbutton) ","swiftbutton",25,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("p_touch")) { return __ref.runUserSub(false, "swiftbutton","p_touch", __ref, _action, _x, _y);}
RemoteObject _inside = RemoteObject.createImmutable(false);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 57;BA.debugLine="Private Sub p_Touch (Action As Int, X As Float, Y";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="If mDisabled Then Return";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_mdisabled" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 59;BA.debugLine="Dim Inside As Boolean = x > 0 And x < mBase.Width";
Debug.JustUpdateDeviceLine();
_inside = BA.ObjectToBoolean(RemoteObject.solveBoolean(">",_x,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("<",_x,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")) && RemoteObject.solveBoolean(">",_y,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("<",_y,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));Debug.locals.put("Inside", _inside);Debug.locals.put("Inside", _inside);
 BA.debugLineNum = 60;BA.debugLine="Select Action";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_action,__ref.getField(false,"_mbase" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_DOWN"),__ref.getField(false,"_mbase" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE"),__ref.getField(false,"_mbase" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_UP"))) {
case 0: {
 BA.debugLineNum = 62;BA.debugLine="pressed = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pressed" /*RemoteObject*/ ,swiftbutton.__c.getField(true,"True"));
 BA.debugLineNum = 63;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (cloyd.blink.swiftbutton.class, "_draw" /*RemoteObject*/ );
 break; }
case 1: {
 BA.debugLineNum = 65;BA.debugLine="If pressed <> Inside Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_pressed" /*RemoteObject*/ ),_inside)) { 
 BA.debugLineNum = 66;BA.debugLine="pressed = Inside";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pressed" /*RemoteObject*/ ,_inside);
 BA.debugLineNum = 67;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (cloyd.blink.swiftbutton.class, "_draw" /*RemoteObject*/ );
 };
 break; }
case 2: {
 BA.debugLineNum = 70;BA.debugLine="pressed = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pressed" /*RemoteObject*/ ,swiftbutton.__c.getField(true,"False"));
 BA.debugLineNum = 71;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (cloyd.blink.swiftbutton.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 72;BA.debugLine="If Inside Then";
Debug.JustUpdateDeviceLine();
if (_inside.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 73;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Click";
Debug.JustUpdateDeviceLine();
swiftbutton.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Click"))));
 };
 break; }
}
;
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolors(RemoteObject __ref,RemoteObject _primary,RemoteObject _secondary) throws Exception{
try {
		Debug.PushSubsStack("SetColors (swiftbutton) ","swiftbutton",25,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("setcolors")) { return __ref.runUserSub(false, "swiftbutton","setcolors", __ref, _primary, _secondary);}
Debug.locals.put("Primary", _primary);
Debug.locals.put("Secondary", _secondary);
 BA.debugLineNum = 84;BA.debugLine="Public Sub SetColors(Primary As Int, Secondary As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 85;BA.debugLine="clr1 = Primary";
Debug.JustUpdateDeviceLine();
__ref.setField ("_clr1" /*RemoteObject*/ ,_primary);
 BA.debugLineNum = 86;BA.debugLine="clr2 = Secondary";
Debug.JustUpdateDeviceLine();
__ref.setField ("_clr2" /*RemoteObject*/ ,_secondary);
 BA.debugLineNum = 87;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (cloyd.blink.swiftbutton.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setenabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("setEnabled (swiftbutton) ","swiftbutton",25,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("setenabled")) { return __ref.runUserSub(false, "swiftbutton","setenabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 51;BA.debugLine="Public Sub setEnabled(b As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="mDisabled = Not(b)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mdisabled" /*RemoteObject*/ ,swiftbutton.__c.runMethod(true,"Not",(Object)(_b)));
 BA.debugLineNum = 53;BA.debugLine="pressed = mDisabled";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pressed" /*RemoteObject*/ ,__ref.getField(true,"_mdisabled" /*RemoteObject*/ ));
 BA.debugLineNum = 54;BA.debugLine="Draw";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (cloyd.blink.swiftbutton.class, "_draw" /*RemoteObject*/ );
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}