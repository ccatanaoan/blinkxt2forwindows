package cloyd.blink;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xplusminus_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (b4xplusminus) ","b4xplusminus",17,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "b4xplusminus","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 80;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 81;BA.debugLine="If Formation = \"Horizontal\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_formation" /*RemoteObject*/ ),BA.ObjectToString("Horizontal"))) { 
 BA.debugLineNum = 82;BA.debugLine="pnlMinus.SetLayoutAnimated(0, 0, 0, ArrowsSize,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnlminus" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, __ref.getField(true,"_arrowssize" /*RemoteObject*/ ))),(Object)(_height));
 BA.debugLineNum = 83;BA.debugLine="pnlPlus.SetLayoutAnimated(0, Width - ArrowsSize,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnlplus" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_width,__ref.getField(true,"_arrowssize" /*RemoteObject*/ )}, "-",1, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, __ref.getField(true,"_arrowssize" /*RemoteObject*/ ))),(Object)(_height));
 BA.debugLineNum = 84;BA.debugLine="MainLabel.SetLayoutAnimated(0, 0, 0, Width, Heig";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mainlabel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_width),(Object)(_height));
 }else 
{ BA.debugLineNum = 85;BA.debugLine="Else if Formation = \"Vertical\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_formation" /*RemoteObject*/ ),BA.ObjectToString("Vertical"))) { 
 BA.debugLineNum = 86;BA.debugLine="pnlPlus.SetLayoutAnimated(0, 0, 0, Width, Arrows";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnlplus" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_width),(Object)(BA.numberCast(double.class, __ref.getField(true,"_arrowssize" /*RemoteObject*/ ))));
 BA.debugLineNum = 87;BA.debugLine="pnlMinus.SetLayoutAnimated(0, 0, Height - Arrows";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnlminus" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_height,__ref.getField(true,"_arrowssize" /*RemoteObject*/ )}, "-",1, 0)),(Object)(_width),(Object)(BA.numberCast(double.class, __ref.getField(true,"_arrowssize" /*RemoteObject*/ ))));
 BA.debugLineNum = 88;BA.debugLine="MainLabel.SetLayoutAnimated(0, 0, 0, Width, Heig";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mainlabel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_width),(Object)(_height));
 }else {
 BA.debugLineNum = 90;BA.debugLine="pnlMinus.SetLayoutAnimated(0, 0, Height - Arrows";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnlminus" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_height,__ref.getField(true,"_arrowssize" /*RemoteObject*/ )}, "-",1, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(2)}, "/",0, 0)),(Object)(BA.numberCast(double.class, __ref.getField(true,"_arrowssize" /*RemoteObject*/ ))));
 BA.debugLineNum = 91;BA.debugLine="pnlPlus.SetLayoutAnimated(0, Width / 2, pnlMinus";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnlplus" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(2)}, "/",0, 0)),(Object)(__ref.getField(false,"_pnlminus" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(__ref.getField(false,"_pnlminus" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_pnlminus" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 92;BA.debugLine="MainLabel.SetLayoutAnimated(0, 0, 0, Width, Heig";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mainlabel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_width),(Object)(RemoteObject.solve(new RemoteObject[] {_height,__ref.getField(true,"_arrowssize" /*RemoteObject*/ ),b4xplusminus.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-+",2, 0)));
 }}
;
 BA.debugLineNum = 94;BA.debugLine="lblMinus.SetLayoutAnimated(0, 0, 0, pnlMinus.Widt";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblminus" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_pnlminus" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_pnlminus" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 95;BA.debugLine="lblPlus.SetLayoutAnimated(0, 0, 0, pnlPlus.Width,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblplus" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(false,"_pnlplus" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_pnlplus" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 96;BA.debugLine="End Sub";
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
b4xplusminus._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4xplusminus._meventname);
 //BA.debugLineNum = 7;BA.debugLine="Private mCallBack As Object 'ignore";
b4xplusminus._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",b4xplusminus._mcallback);
 //BA.debugLineNum = 8;BA.debugLine="Public mBase As B4XView 'ignore";
b4xplusminus._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",b4xplusminus._mbase);
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI 'ignore";
b4xplusminus._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xplusminus._xui);
 //BA.debugLineNum = 10;BA.debugLine="Public Tag As Object";
b4xplusminus._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",b4xplusminus._tag);
 //BA.debugLineNum = 11;BA.debugLine="Public pnlPlus, pnlMinus As B4XView";
b4xplusminus._pnlplus = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlplus",b4xplusminus._pnlplus);
b4xplusminus._pnlminus = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlminus",b4xplusminus._pnlminus);
 //BA.debugLineNum = 12;BA.debugLine="Public lblPlus, lblMinus As B4XView";
b4xplusminus._lblplus = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblplus",b4xplusminus._lblplus);
b4xplusminus._lblminus = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblminus",b4xplusminus._lblminus);
 //BA.debugLineNum = 13;BA.debugLine="Public Formation As String";
b4xplusminus._formation = RemoteObject.createImmutable("");__ref.setField("_formation",b4xplusminus._formation);
 //BA.debugLineNum = 14;BA.debugLine="Public mCyclic As Boolean";
b4xplusminus._mcyclic = RemoteObject.createImmutable(false);__ref.setField("_mcyclic",b4xplusminus._mcyclic);
 //BA.debugLineNum = 15;BA.debugLine="Public mRapid As Boolean";
b4xplusminus._mrapid = RemoteObject.createImmutable(false);__ref.setField("_mrapid",b4xplusminus._mrapid);
 //BA.debugLineNum = 16;BA.debugLine="Public MainLabel As B4XView";
b4xplusminus._mainlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mainlabel",b4xplusminus._mainlabel);
 //BA.debugLineNum = 17;BA.debugLine="Public ArrowsSize As Int = 30dip";
b4xplusminus._arrowssize = b4xplusminus.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)));__ref.setField("_arrowssize",b4xplusminus._arrowssize);
 //BA.debugLineNum = 18;BA.debugLine="Private mStringItems As List";
b4xplusminus._mstringitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_mstringitems",b4xplusminus._mstringitems);
 //BA.debugLineNum = 19;BA.debugLine="Private mStartRange, mInterval, mEndRange As Doub";
b4xplusminus._mstartrange = RemoteObject.createImmutable(0);__ref.setField("_mstartrange",b4xplusminus._mstartrange);
b4xplusminus._minterval = RemoteObject.createImmutable(0);__ref.setField("_minterval",b4xplusminus._minterval);
b4xplusminus._mendrange = RemoteObject.createImmutable(0);__ref.setField("_mendrange",b4xplusminus._mendrange);
 //BA.debugLineNum = 20;BA.debugLine="Private mSelectedIndex As Int = -1";
b4xplusminus._mselectedindex = BA.numberCast(int.class, -(double) (0 + 1));__ref.setField("_mselectedindex",b4xplusminus._mselectedindex);
 //BA.debugLineNum = 21;BA.debugLine="Private LoopIndex As Int";
b4xplusminus._loopindex = RemoteObject.createImmutable(0);__ref.setField("_loopindex",b4xplusminus._loopindex);
 //BA.debugLineNum = 22;BA.debugLine="Public RapidPeriod1 As Int = 1000";
b4xplusminus._rapidperiod1 = BA.numberCast(int.class, 1000);__ref.setField("_rapidperiod1",b4xplusminus._rapidperiod1);
 //BA.debugLineNum = 23;BA.debugLine="Public RapidPeriod2 As Int = 30";
b4xplusminus._rapidperiod2 = BA.numberCast(int.class, 30);__ref.setField("_rapidperiod2",b4xplusminus._rapidperiod2);
 //BA.debugLineNum = 24;BA.debugLine="Public Formatter As B4XFormatter";
b4xplusminus._formatter = RemoteObject.createNew ("cloyd.blink.b4xformatter");__ref.setField("_formatter",b4xplusminus._formatter);
 //BA.debugLineNum = 25;BA.debugLine="Private StringMode As Boolean";
b4xplusminus._stringmode = RemoteObject.createImmutable(false);__ref.setField("_stringmode",b4xplusminus._stringmode);
 //BA.debugLineNum = 26;BA.debugLine="Private Size As Int";
b4xplusminus._size = RemoteObject.createImmutable(0);__ref.setField("_size",b4xplusminus._size);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createlabel(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("CreateLabel (b4xplusminus) ","b4xplusminus",17,__ref.getField(false, "ba"),__ref,241);
if (RapidSub.canDelegate("createlabel")) { return __ref.runUserSub(false, "b4xplusminus","createlabel", __ref, _text);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("text", _text);
 BA.debugLineNum = 241;BA.debugLine="Private Sub CreateLabel (text As String) As B4XVie";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 242;BA.debugLine="Dim lbl As Label";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 243;BA.debugLine="lbl.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 244;BA.debugLine="Dim xlbl As B4XView = lbl";
Debug.JustUpdateDeviceLine();
_xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl.setObject(_lbl.getObject());Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 245;BA.debugLine="xlbl.Font = xui.CreateMaterialIcons(30)";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateMaterialIcons",(Object)(BA.numberCast(float.class, 30))));
 BA.debugLineNum = 246;BA.debugLine="xlbl.Text = text";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setText",_text);
 BA.debugLineNum = 247;BA.debugLine="xlbl.TextColor = MainLabel.TextColor";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setTextColor",__ref.getField(false,"_mainlabel" /*RemoteObject*/ ).runMethod(true,"getTextColor"));
 BA.debugLineNum = 248;BA.debugLine="Return xlbl";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _xlbl;
 BA.debugLineNum = 249;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _decrement(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Decrement (b4xplusminus) ","b4xplusminus",17,__ref.getField(false, "ba"),__ref,178);
if (RapidSub.canDelegate("decrement")) { return __ref.runUserSub(false, "b4xplusminus","decrement", __ref);}
 BA.debugLineNum = 178;BA.debugLine="Public Sub Decrement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 179;BA.debugLine="If mSelectedIndex <= 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",__ref.getField(true,"_mselectedindex" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 180;BA.debugLine="If mCyclic Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_mcyclic" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 181;BA.debugLine="mSelectedIndex = Size";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mselectedindex" /*RemoteObject*/ ,__ref.getField(true,"_size" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 183;BA.debugLine="mSelectedIndex = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mselectedindex" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 184;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 };
 BA.debugLineNum = 187;BA.debugLine="SetIndex(mSelectedIndex - 1, True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (cloyd.blink.b4xplusminus.class, "_setindex" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mselectedindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(b4xplusminus.__c.getField(true,"True")));
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (b4xplusminus) ","b4xplusminus",17,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "b4xplusminus","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 36;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 37;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 38;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 38;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 39;BA.debugLine="MainLabel = lbl";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mainlabel" /*RemoteObject*/ ).setObject (_lbl.getObject());
 BA.debugLineNum = 40;BA.debugLine="MainLabel.SetTextAlignment(\"CENTER\", \"CENTER\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mainlabel" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 51;BA.debugLine="pnlPlus = xui.CreatePanel(\"pnlArrow\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pnlplus" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnlArrow"))));
 BA.debugLineNum = 52;BA.debugLine="pnlMinus = xui.CreatePanel(\"pnlArrow\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pnlminus" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnlArrow"))));
 BA.debugLineNum = 54;BA.debugLine="pnlPlus.Tag = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnlplus" /*RemoteObject*/ ).runMethod(false,"setTag",(b4xplusminus.__c.getField(true,"True")));
 BA.debugLineNum = 55;BA.debugLine="pnlMinus.Tag = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnlminus" /*RemoteObject*/ ).runMethod(false,"setTag",(b4xplusminus.__c.getField(true,"False")));
 BA.debugLineNum = 56;BA.debugLine="Formation = Props.Get(\"Orientation\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_formation" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Orientation"))))));
 BA.debugLineNum = 57;BA.debugLine="mCyclic = Props.Get(\"Cyclic\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcyclic" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Cyclic"))))));
 BA.debugLineNum = 58;BA.debugLine="mRapid = Props.Get(\"Rapid\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mrapid" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Rapid"))))));
 BA.debugLineNum = 59;BA.debugLine="Formatter.GetDefaultFormat.FormatFont = MainLabel";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_formatter" /*RemoteObject*/ ).runClassMethod (cloyd.blink.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("FormatFont" /*RemoteObject*/ ,__ref.getField(false,"_mainlabel" /*RemoteObject*/ ).runMethod(false,"getFont"));
 BA.debugLineNum = 60;BA.debugLine="Formatter.GetDefaultFormat.TextColor = MainLabel.";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_formatter" /*RemoteObject*/ ).runClassMethod (cloyd.blink.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("TextColor" /*RemoteObject*/ ,__ref.getField(false,"_mainlabel" /*RemoteObject*/ ).runMethod(true,"getTextColor"));
 BA.debugLineNum = 61;BA.debugLine="If Formation = \"Horizontal\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_formation" /*RemoteObject*/ ),BA.ObjectToString("Horizontal"))) { 
 BA.debugLineNum = 62;BA.debugLine="lblPlus = CreateLabel(Chr(0xE315))";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lblplus" /*RemoteObject*/ ,__ref.runClassMethod (cloyd.blink.b4xplusminus.class, "_createlabel" /*RemoteObject*/ ,(Object)(BA.ObjectToString(b4xplusminus.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe315)))))));
 BA.debugLineNum = 63;BA.debugLine="lblMinus = CreateLabel(Chr(0xE314))";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lblminus" /*RemoteObject*/ ,__ref.runClassMethod (cloyd.blink.b4xplusminus.class, "_createlabel" /*RemoteObject*/ ,(Object)(BA.ObjectToString(b4xplusminus.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe314)))))));
 }else {
 BA.debugLineNum = 65;BA.debugLine="lblPlus = CreateLabel(Chr(0xE316))";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lblplus" /*RemoteObject*/ ,__ref.runClassMethod (cloyd.blink.b4xplusminus.class, "_createlabel" /*RemoteObject*/ ,(Object)(BA.ObjectToString(b4xplusminus.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe316)))))));
 BA.debugLineNum = 66;BA.debugLine="lblMinus = CreateLabel(Chr(0xE313))";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lblminus" /*RemoteObject*/ ,__ref.runClassMethod (cloyd.blink.b4xplusminus.class, "_createlabel" /*RemoteObject*/ ,(Object)(BA.ObjectToString(b4xplusminus.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xe313)))))));
 };
 BA.debugLineNum = 68;BA.debugLine="lblMinus.SetTextAlignment(\"CENTER\", \"CENTER\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblminus" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 69;BA.debugLine="lblPlus.SetTextAlignment(\"CENTER\", \"CENTER\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblplus" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 70;BA.debugLine="MainLabel.SetTextAlignment(\"CENTER\", \"CENTER\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mainlabel" /*RemoteObject*/ ).runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 71;BA.debugLine="mBase.AddView(MainLabel, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mainlabel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 72;BA.debugLine="mBase.AddView(pnlPlus, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlplus" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 73;BA.debugLine="mBase.AddView(pnlMinus, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlminus" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 74;BA.debugLine="pnlPlus.AddView(lblPlus, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnlplus" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblplus" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 75;BA.debugLine="pnlMinus.AddView(lblMinus, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnlminus" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblminus" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 76;BA.debugLine="SetIndex(-1, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (cloyd.blink.b4xplusminus.class, "_setindex" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(b4xplusminus.__c.getField(true,"False")));
 BA.debugLineNum = 77;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (cloyd.blink.b4xplusminus.class, "_base_resize" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectedvalue(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedValue (b4xplusminus) ","b4xplusminus",17,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("getselectedvalue")) { return __ref.runUserSub(false, "b4xplusminus","getselectedvalue", __ref);}
 BA.debugLineNum = 114;BA.debugLine="Public Sub getSelectedValue As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 115;BA.debugLine="Return GetValueImpl (mSelectedIndex)";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return __ref.runClassMethod (cloyd.blink.b4xplusminus.class, "_getvalueimpl" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mselectedindex" /*RemoteObject*/ )));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalueimpl(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetValueImpl (b4xplusminus) ","b4xplusminus",17,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("getvalueimpl")) { return __ref.runUserSub(false, "b4xplusminus","getvalueimpl", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 127;BA.debugLine="Private Sub GetValueImpl (Index As Int) As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 128;BA.debugLine="If StringMode Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_stringmode" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 129;BA.debugLine="Return mStringItems.Get(Index)";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return __ref.getField(false,"_mstringitems" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index));
 }else {
 BA.debugLineNum = 131;BA.debugLine="If Index = Size - 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_size" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 132;BA.debugLine="Return mEndRange";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return (__ref.getField(true,"_mendrange" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 134;BA.debugLine="Return mStartRange + Index * mInterval";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return (RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mstartrange" /*RemoteObject*/ ),_index,__ref.getField(true,"_minterval" /*RemoteObject*/ )}, "+*",1, 0));
 };
 };
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _increment(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Increment (b4xplusminus) ","b4xplusminus",17,__ref.getField(false, "ba"),__ref,159);
if (RapidSub.canDelegate("increment")) { return __ref.runUserSub(false, "b4xplusminus","increment", __ref);}
RemoteObject _v1 = RemoteObject.createImmutable(0);
RemoteObject _v2 = RemoteObject.createImmutable(0);
 BA.debugLineNum = 159;BA.debugLine="Public Sub Increment";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 160;BA.debugLine="If mSelectedIndex = Size - 3 And StringMode = Fal";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mselectedindex" /*RemoteObject*/ ),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_size" /*RemoteObject*/ ),RemoteObject.createImmutable(3)}, "-",1, 1))) && RemoteObject.solveBoolean("=",__ref.getField(true,"_stringmode" /*RemoteObject*/ ),b4xplusminus.__c.getField(true,"False"))) { 
 BA.debugLineNum = 161;BA.debugLine="Dim v1 As Double = GetValueImpl(mSelectedIndex +";
Debug.JustUpdateDeviceLine();
_v1 = BA.numberCast(double.class, __ref.runClassMethod (cloyd.blink.b4xplusminus.class, "_getvalueimpl" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mselectedindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1))));Debug.locals.put("v1", _v1);Debug.locals.put("v1", _v1);
 BA.debugLineNum = 162;BA.debugLine="Dim v2 As Double = GetValueImpl(mSelectedIndex +";
Debug.JustUpdateDeviceLine();
_v2 = BA.numberCast(double.class, __ref.runClassMethod (cloyd.blink.b4xplusminus.class, "_getvalueimpl" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mselectedindex" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "+",1, 1))));Debug.locals.put("v2", _v2);Debug.locals.put("v2", _v2);
 BA.debugLineNum = 163;BA.debugLine="If Formatter.Format(v1) = Formatter.Format(v2) T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_formatter" /*RemoteObject*/ ).runClassMethod (cloyd.blink.b4xformatter.class, "_format" /*RemoteObject*/ ,(Object)(_v1)),__ref.getField(false,"_formatter" /*RemoteObject*/ ).runClassMethod (cloyd.blink.b4xformatter.class, "_format" /*RemoteObject*/ ,(Object)(_v2)))) { 
 BA.debugLineNum = 164;BA.debugLine="mSelectedIndex = mSelectedIndex + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mselectedindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mselectedindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 };
 };
 BA.debugLineNum = 167;BA.debugLine="If mSelectedIndex >= Size - 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",__ref.getField(true,"_mselectedindex" /*RemoteObject*/ ),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_size" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 168;BA.debugLine="If mCyclic Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_mcyclic" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 169;BA.debugLine="mSelectedIndex = -1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mselectedindex" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 }else {
 BA.debugLineNum = 171;BA.debugLine="mSelectedIndex = Size - 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mselectedindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_size" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 172;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 };
 BA.debugLineNum = 175;BA.debugLine="SetIndex(mSelectedIndex + 1, True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (cloyd.blink.b4xplusminus.class, "_setindex" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mselectedindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(b4xplusminus.__c.getField(true,"True")));
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xplusminus) ","b4xplusminus",17,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xplusminus","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 29;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 30;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 31;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 32;BA.debugLine="Formatter.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_formatter" /*RemoteObject*/ ).runClassMethod (cloyd.blink.b4xformatter.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _internalsettextorcsbuildertolabel(RemoteObject __ref,RemoteObject _xlbl,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("InternalSetTextOrCSBuilderToLabel (b4xplusminus) ","b4xplusminus",17,__ref.getField(false, "ba"),__ref,251);
if (RapidSub.canDelegate("internalsettextorcsbuildertolabel")) { return __ref.runUserSub(false, "b4xplusminus","internalsettextorcsbuildertolabel", __ref, _xlbl, _text);}
Debug.locals.put("xlbl", _xlbl);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 251;BA.debugLine="Private Sub InternalSetTextOrCSBuilderToLabel(xlbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 253;BA.debugLine="xlbl.Text = Text";
Debug.JustUpdateDeviceLine();
_xlbl.runMethod(true,"setText",BA.ObjectToString(_text));
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlarrow_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("pnlArrow_MouseClicked (b4xplusminus) ","b4xplusminus",17,__ref.getField(false, "ba"),__ref,270);
if (RapidSub.canDelegate("pnlarrow_mouseclicked")) { return __ref.runUserSub(false, "b4xplusminus","pnlarrow_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 270;BA.debugLine="Private Sub pnlArrow_MouseClicked(EventData As Mou";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 271;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 272;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlarrow_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("pnlArrow_MousePressed (b4xplusminus) ","b4xplusminus",17,__ref.getField(false, "ba"),__ref,266);
if (RapidSub.canDelegate("pnlarrow_mousepressed")) { return __ref.runUserSub(false, "b4xplusminus","pnlarrow_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 266;BA.debugLine="Private Sub pnlArrow_MousePressed (EventData As Mo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 267;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 268;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlarrow_mousereleased(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("pnlArrow_MouseReleased (b4xplusminus) ","b4xplusminus",17,__ref.getField(false, "ba"),__ref,274);
if (RapidSub.canDelegate("pnlarrow_mousereleased")) { return __ref.runUserSub(false, "b4xplusminus","pnlarrow_mousereleased", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 274;BA.debugLine="Private Sub pnlArrow_MouseReleased(EventData As Mo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 275;BA.debugLine="EventData.Consume";
Debug.JustUpdateDeviceLine();
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 276;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlarrow_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("pnlArrow_Touch (b4xplusminus) ","b4xplusminus",17,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("pnlarrow_touch")) { return __ref.runUserSub(false, "b4xplusminus","pnlarrow_touch", __ref, _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 190;BA.debugLine="Private Sub pnlArrow_Touch (Action As Int, X As Fl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 191;BA.debugLine="Touch(Action = lblPlus.TOUCH_ACTION_DOWN, Action";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (cloyd.blink.b4xplusminus.class, "_touch" /*RemoteObject*/ ,(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_lblplus" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_DOWN"))))),(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("!",_action,BA.numberCast(double.class, __ref.getField(false,"_lblplus" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE"))))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), b4xplusminus.__c.runMethod(false,"Sender",__ref.getField(false, "ba"))));
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setindex(RemoteObject __ref,RemoteObject _i,RemoteObject _raiseevent) throws Exception{
try {
		Debug.PushSubsStack("SetIndex (b4xplusminus) ","b4xplusminus",17,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("setindex")) { return __ref.runUserSub(false, "b4xplusminus","setindex", __ref, _i, _raiseevent);}
RemoteObject _value = RemoteObject.declareNull("Object");
Debug.locals.put("i", _i);
Debug.locals.put("RaiseEvent", _raiseevent);
 BA.debugLineNum = 139;BA.debugLine="Private Sub SetIndex(i As Int, RaiseEvent As Boole";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 140;BA.debugLine="If i >= Size Then i = -1";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",_i,BA.numberCast(double.class, __ref.getField(true,"_size" /*RemoteObject*/ )))) { 
_i = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("i", _i);};
 BA.debugLineNum = 141;BA.debugLine="mSelectedIndex = i";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mselectedindex" /*RemoteObject*/ ,_i);
 BA.debugLineNum = 142;BA.debugLine="If mSelectedIndex = -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mselectedindex" /*RemoteObject*/ ),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 143;BA.debugLine="MainLabel.Text = \"\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mainlabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 }else {
 BA.debugLineNum = 145;BA.debugLine="Dim value As Object = GetValueImpl (mSelectedInd";
Debug.JustUpdateDeviceLine();
_value = __ref.runClassMethod (cloyd.blink.b4xplusminus.class, "_getvalueimpl" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mselectedindex" /*RemoteObject*/ )));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 146;BA.debugLine="If StringMode Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_stringmode" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 147;BA.debugLine="InternalSetTextOrCSBuilderToLabel(MainLabel, va";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (cloyd.blink.b4xplusminus.class, "_internalsettextorcsbuildertolabel" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mainlabel" /*RemoteObject*/ )),(Object)(_value));
 }else {
 BA.debugLineNum = 149;BA.debugLine="MainLabel.Text = Formatter.Format(value)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mainlabel" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_formatter" /*RemoteObject*/ ).runClassMethod (cloyd.blink.b4xformatter.class, "_format" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, _value))));
 };
 BA.debugLineNum = 151;BA.debugLine="If RaiseEvent And xui.SubExists(mCallBack, mEven";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_raiseevent) && RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_valuechanged"))),(Object)(BA.numberCast(int.class, 1))))) { 
 BA.debugLineNum = 152;BA.debugLine="CallSub2(mCallBack, mEventName & \"_valuechanged";
Debug.JustUpdateDeviceLine();
b4xplusminus.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_valuechanged"))),(Object)(_value));
 };
 };
 BA.debugLineNum = 155;BA.debugLine="lblPlus.Enabled = Size > 0 And (mCyclic Or mSelec";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblplus" /*RemoteObject*/ ).runMethod(true,"setEnabled",BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(true,"_size" /*RemoteObject*/ ),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",__ref.getField(true,"_mcyclic" /*RemoteObject*/ )) || RemoteObject.solveBoolean("<",__ref.getField(true,"_mselectedindex" /*RemoteObject*/ ),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_size" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1))))))));
 BA.debugLineNum = 156;BA.debugLine="lblMinus.Enabled = Size > 0 And (mCyclic Or mSele";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lblminus" /*RemoteObject*/ ).runMethod(true,"setEnabled",BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(true,"_size" /*RemoteObject*/ ),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",__ref.getField(true,"_mcyclic" /*RemoteObject*/ )) || RemoteObject.solveBoolean(">",__ref.getField(true,"_mselectedindex" /*RemoteObject*/ ),BA.numberCast(double.class, 0)))))));
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setnumericrange(RemoteObject __ref,RemoteObject _startrange,RemoteObject _endrange,RemoteObject _interval) throws Exception{
try {
		Debug.PushSubsStack("SetNumericRange (b4xplusminus) ","b4xplusminus",17,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("setnumericrange")) { return __ref.runUserSub(false, "b4xplusminus","setnumericrange", __ref, _startrange, _endrange, _interval);}
Debug.locals.put("StartRange", _startrange);
Debug.locals.put("EndRange", _endrange);
Debug.locals.put("Interval", _interval);
 BA.debugLineNum = 105;BA.debugLine="Public Sub SetNumericRange (StartRange As Double,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 106;BA.debugLine="Size = Ceil((EndRange - StartRange) / Interval) +";
Debug.JustUpdateDeviceLine();
__ref.setField ("_size" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4xplusminus.__c.runMethod(true,"Ceil",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_endrange,_startrange}, "-",1, 0)),_interval}, "/",0, 0))),RemoteObject.createImmutable(1)}, "+",1, 0)));
 BA.debugLineNum = 107;BA.debugLine="mStartRange = StartRange";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mstartrange" /*RemoteObject*/ ,_startrange);
 BA.debugLineNum = 108;BA.debugLine="mEndRange = EndRange";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mendrange" /*RemoteObject*/ ,_endrange);
 BA.debugLineNum = 109;BA.debugLine="mInterval = Interval";
Debug.JustUpdateDeviceLine();
__ref.setField ("_minterval" /*RemoteObject*/ ,_interval);
 BA.debugLineNum = 110;BA.debugLine="StringMode = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_stringmode" /*RemoteObject*/ ,b4xplusminus.__c.getField(true,"False"));
 BA.debugLineNum = 111;BA.debugLine="SetIndex(0, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (cloyd.blink.b4xplusminus.class, "_setindex" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(b4xplusminus.__c.getField(true,"False")));
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselectedvalue(RemoteObject __ref,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("setSelectedValue (b4xplusminus) ","b4xplusminus",17,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("setselectedvalue")) { return __ref.runUserSub(false, "b4xplusminus","setselectedvalue", __ref, _v);}
RemoteObject _n = RemoteObject.createImmutable(0);
Debug.locals.put("v", _v);
 BA.debugLineNum = 118;BA.debugLine="Public Sub setSelectedValue (v As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 119;BA.debugLine="If StringMode Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_stringmode" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 120;BA.debugLine="SetIndex(mStringItems.IndexOf(v), False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (cloyd.blink.b4xplusminus.class, "_setindex" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mstringitems" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)(_v))),(Object)(b4xplusminus.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 122;BA.debugLine="Dim n As Double = v";
Debug.JustUpdateDeviceLine();
_n = BA.numberCast(double.class, _v);Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 123;BA.debugLine="SetIndex(Min(Size - 1, Max(0, Round((n - mStartR";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (cloyd.blink.b4xplusminus.class, "_setindex" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, b4xplusminus.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_size" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(b4xplusminus.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, b4xplusminus.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_n,__ref.getField(true,"_mstartrange" /*RemoteObject*/ )}, "-",1, 0)),__ref.getField(true,"_minterval" /*RemoteObject*/ )}, "/",0, 0)))))))))),(Object)(b4xplusminus.__c.getField(true,"False")));
 };
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstringitems(RemoteObject __ref,RemoteObject _list) throws Exception{
try {
		Debug.PushSubsStack("SetStringItems (b4xplusminus) ","b4xplusminus",17,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("setstringitems")) { return __ref.runUserSub(false, "b4xplusminus","setstringitems", __ref, _list);}
Debug.locals.put("list", _list);
 BA.debugLineNum = 98;BA.debugLine="Public Sub SetStringItems (list As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 99;BA.debugLine="mStringItems = list";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mstringitems" /*RemoteObject*/ ,_list);
 BA.debugLineNum = 100;BA.debugLine="StringMode = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_stringmode" /*RemoteObject*/ ,b4xplusminus.__c.getField(true,"True"));
 BA.debugLineNum = 101;BA.debugLine="Size = mStringItems.Size";
Debug.JustUpdateDeviceLine();
__ref.setField ("_size" /*RemoteObject*/ ,__ref.getField(false,"_mstringitems" /*RemoteObject*/ ).runMethod(true,"getSize"));
 BA.debugLineNum = 102;BA.debugLine="SetIndex(-1, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (cloyd.blink.b4xplusminus.class, "_setindex" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(b4xplusminus.__c.getField(true,"False")));
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _startdownloop(RemoteObject __ref,RemoteObject _up) throws Exception{
try {
		Debug.PushSubsStack("StartDownLoop (b4xplusminus) ","b4xplusminus",17,__ref.getField(false, "ba"),__ref,228);
if (RapidSub.canDelegate("startdownloop")) { __ref.runUserSub(false, "b4xplusminus","startdownloop", __ref, _up); return;}
ResumableSub_StartDownLoop rsub = new ResumableSub_StartDownLoop(null,__ref,_up);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_StartDownLoop extends BA.ResumableSub {
public ResumableSub_StartDownLoop(cloyd.blink.b4xplusminus parent,RemoteObject __ref,RemoteObject _up) {
this.parent = parent;
this.__ref = __ref;
this._up = _up;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
cloyd.blink.b4xplusminus parent;
RemoteObject _up;
RemoteObject _myindex = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("StartDownLoop (b4xplusminus) ","b4xplusminus",17,__ref.getField(false, "ba"),__ref,228);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Up", _up);
 BA.debugLineNum = 229;BA.debugLine="LoopIndex = LoopIndex + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_loopindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_loopindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 230;BA.debugLine="If mRapid = False Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mrapid" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
Debug.CheckDeviceExceptions();if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 231;BA.debugLine="Dim MyIndex As Int = LoopIndex";
Debug.JustUpdateDeviceLine();
_myindex = __ref.getField(true,"_loopindex" /*RemoteObject*/ );Debug.locals.put("MyIndex", _myindex);Debug.locals.put("MyIndex", _myindex);
 BA.debugLineNum = 232;BA.debugLine="Sleep(RapidPeriod1)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xplusminus", "startdownloop"),__ref.getField(true,"_rapidperiod1" /*RemoteObject*/ ));
this.state = 19;
return;
case 19:
//C
this.state = 7;
;
 BA.debugLineNum = 233;BA.debugLine="Do While MyIndex = LoopIndex";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//do while
this.state = 18;
while (RemoteObject.solveBoolean("=",_myindex,BA.numberCast(double.class, __ref.getField(true,"_loopindex" /*RemoteObject*/ )))) {
this.state = 9;
if (true) break;
}
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 234;BA.debugLine="If Up Then Increment Else Decrement";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//if
this.state = 17;
if (_up.<Boolean>get().booleanValue()) { 
this.state = 12;
;}
else {
this.state = 14;
;}if (true) break;

case 12:
//C
this.state = 17;
__ref.runClassMethod (cloyd.blink.b4xplusminus.class, "_increment" /*RemoteObject*/ );
if (true) break;

case 14:
//C
this.state = 17;
__ref.runClassMethod (cloyd.blink.b4xplusminus.class, "_decrement" /*RemoteObject*/ );
if (true) break;

case 17:
//C
this.state = 7;
;
 BA.debugLineNum = 235;BA.debugLine="Sleep(RapidPeriod2)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xplusminus", "startdownloop"),__ref.getField(true,"_rapidperiod2" /*RemoteObject*/ ));
this.state = 20;
return;
case 20:
//C
this.state = 7;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 237;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _touch(RemoteObject __ref,RemoteObject _start,RemoteObject _stop,RemoteObject _pnl) throws Exception{
try {
		Debug.PushSubsStack("Touch (b4xplusminus) ","b4xplusminus",17,__ref.getField(false, "ba"),__ref,194);
if (RapidSub.canDelegate("touch")) { return __ref.runUserSub(false, "b4xplusminus","touch", __ref, _start, _stop, _pnl);}
Debug.locals.put("Start", _start);
Debug.locals.put("Stop", _stop);
Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 194;BA.debugLine="Private Sub Touch (Start As Boolean, Stop As Boole";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 195;BA.debugLine="If pnl.GetView(0).Enabled = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"getEnabled"),b4xplusminus.__c.getField(true,"False"))) { 
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 196;BA.debugLine="If Start Then";
Debug.JustUpdateDeviceLine();
if (_start.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 197;BA.debugLine="If pnl.Tag = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_pnl.runMethod(false,"getTag"),(b4xplusminus.__c.getField(true,"True")))) { 
 BA.debugLineNum = 198;BA.debugLine="Increment";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (cloyd.blink.b4xplusminus.class, "_increment" /*RemoteObject*/ );
 BA.debugLineNum = 199;BA.debugLine="StartDownLoop(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (cloyd.blink.b4xplusminus.class, "_startdownloop" /*void*/ ,(Object)(b4xplusminus.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 201;BA.debugLine="Decrement";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (cloyd.blink.b4xplusminus.class, "_decrement" /*RemoteObject*/ );
 BA.debugLineNum = 202;BA.debugLine="StartDownLoop(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (cloyd.blink.b4xplusminus.class, "_startdownloop" /*void*/ ,(Object)(b4xplusminus.__c.getField(true,"False")));
 };
 }else 
{ BA.debugLineNum = 204;BA.debugLine="Else If Stop Then";
Debug.JustUpdateDeviceLine();
if (_stop.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 205;BA.debugLine="LoopIndex = LoopIndex + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_loopindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_loopindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 }}
;
 BA.debugLineNum = 207;BA.debugLine="End Sub";
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