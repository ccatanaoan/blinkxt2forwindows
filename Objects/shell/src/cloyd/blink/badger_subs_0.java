package cloyd.blink;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class badger_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private views As Map";
badger._views = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_views",badger._views);
 //BA.debugLineNum = 4;BA.debugLine="Private stub As B4XView 'ignore";
badger._stub = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_stub",badger._stub);
 //BA.debugLineNum = 5;BA.debugLine="Private radius As Int = 15dip";
badger._radius = badger.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15)));__ref.setField("_radius",badger._radius);
 //BA.debugLineNum = 6;BA.debugLine="Private animationDuration As Int = 500";
badger._animationduration = BA.numberCast(int.class, 500);__ref.setField("_animationduration",badger._animationduration);
 //BA.debugLineNum = 7;BA.debugLine="Private cx, cy As Float";
badger._cx = RemoteObject.createImmutable(0f);__ref.setField("_cx",badger._cx);
badger._cy = RemoteObject.createImmutable(0f);__ref.setField("_cy",badger._cy);
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI";
badger._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",badger._xui);
 //BA.debugLineNum = 9;BA.debugLine="Private color As Int = xui.Color_Red";
badger._color = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red");__ref.setField("_color",badger._color);
 //BA.debugLineNum = 10;BA.debugLine="Private textColor As Int = xui.Color_White";
badger._textcolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White");__ref.setField("_textcolor",badger._textcolor);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createlabel(RemoteObject __ref,RemoteObject _p,RemoteObject _count) throws Exception{
try {
		Debug.PushSubsStack("CreateLabel (badger) ","badger",3,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("createlabel")) { return __ref.runUserSub(false, "badger","createlabel", __ref, _p, _count);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _duration = RemoteObject.createImmutable(0);
Debug.locals.put("p", _p);
Debug.locals.put("count", _count);
 BA.debugLineNum = 87;BA.debugLine="Private Sub CreateLabel(p As B4XView, count As Int";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(8388608);
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 89;BA.debugLine="lbl.Initialize(\"\")";
Debug.ShouldStop(16777216);
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 90;BA.debugLine="Dim xlbl As B4XView = lbl";
Debug.ShouldStop(33554432);
_xlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 91;BA.debugLine="xlbl.Font = xui.CreateDefaultBoldFont(16)";
Debug.ShouldStop(67108864);
_xlbl.runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(BA.numberCast(float.class, 16))));
 BA.debugLineNum = 92;BA.debugLine="xlbl.TextColor = textColor";
Debug.ShouldStop(134217728);
_xlbl.runMethod(true,"setTextColor",__ref.getField(true,"_textcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 93;BA.debugLine="xlbl.Text = count";
Debug.ShouldStop(268435456);
_xlbl.runMethod(true,"setText",BA.NumberToString(_count));
 BA.debugLineNum = 94;BA.debugLine="p.AddView(xlbl, radius, radius, 0, 0)";
Debug.ShouldStop(536870912);
_p.runVoidMethod ("AddView",(Object)((_xlbl.getObject())),(Object)(BA.numberCast(double.class, __ref.getField(true,"_radius" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_radius" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 95;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
Debug.ShouldStop(1073741824);
_xlbl.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 96;BA.debugLine="Dim duration As Int = animationDuration";
Debug.ShouldStop(-2147483648);
_duration = __ref.getField(true,"_animationduration" /*RemoteObject*/ );Debug.locals.put("duration", _duration);Debug.locals.put("duration", _duration);
 BA.debugLineNum = 97;BA.debugLine="xlbl.SetLayoutAnimated(duration, 0, 0, radius * 2";
Debug.ShouldStop(1);
_xlbl.runVoidMethod ("SetLayoutAnimated",(Object)(_duration),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radius" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "*",0, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radius" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "*",0, 1))));
 BA.debugLineNum = 98;BA.debugLine="xlbl.Visible = False";
Debug.ShouldStop(2);
_xlbl.runMethod(true,"setVisible",badger.__c.getField(true,"False"));
 BA.debugLineNum = 99;BA.debugLine="xlbl.SetVisibleAnimated(animationDuration, True)";
Debug.ShouldStop(4);
_xlbl.runVoidMethod ("SetVisibleAnimated",__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_animationduration" /*RemoteObject*/ )),(Object)(badger.__c.getField(true,"True")));
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createnewpanel(RemoteObject __ref,RemoteObject _view,RemoteObject _count) throws Exception{
try {
		Debug.PushSubsStack("CreateNewPanel (badger) ","badger",3,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("createnewpanel")) { return __ref.runUserSub(false, "badger","createnewpanel", __ref, _view, _count);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
RemoteObject _xp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _parent = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("view", _view);
Debug.locals.put("count", _count);
 BA.debugLineNum = 68;BA.debugLine="Private Sub CreateNewPanel(view As B4XView, count";
Debug.ShouldStop(8);
 BA.debugLineNum = 70;BA.debugLine="Dim p As Pane";
Debug.ShouldStop(32);
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 74;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(512);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 78;BA.debugLine="Dim xp As B4XView = p";
Debug.ShouldStop(8192);
_xp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject());Debug.locals.put("xp", _xp);
 BA.debugLineNum = 79;BA.debugLine="xp.SetColorAndBorder(color, 0, color, radius)";
Debug.ShouldStop(16384);
_xp.runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_color" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, 0)),(Object)(__ref.getField(true,"_color" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, __ref.getField(true,"_radius" /*RemoteObject*/ ))));
 BA.debugLineNum = 80;BA.debugLine="cx = view.Left + view.Width";
Debug.ShouldStop(32768);
__ref.setField ("_cx" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_view.runMethod(true,"getLeft"),_view.runMethod(true,"getWidth")}, "+",1, 0)));
 BA.debugLineNum = 81;BA.debugLine="cy = view.Top";
Debug.ShouldStop(65536);
__ref.setField ("_cy" /*RemoteObject*/ ,BA.numberCast(float.class, _view.runMethod(true,"getTop")));
 BA.debugLineNum = 82;BA.debugLine="Dim parent As B4XView = view.Parent";
Debug.ShouldStop(131072);
_parent = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_parent = _view.runMethod(false,"getParent");Debug.locals.put("parent", _parent);Debug.locals.put("parent", _parent);
 BA.debugLineNum = 83;BA.debugLine="parent.AddView(xp, cx, cy, 0, 0)";
Debug.ShouldStop(262144);
_parent.runVoidMethod ("AddView",(Object)((_xp.getObject())),(Object)(BA.numberCast(double.class, __ref.getField(true,"_cx" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_cy" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 84;BA.debugLine="Return p";
Debug.ShouldStop(524288);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject());
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbadge(RemoteObject __ref,RemoteObject _view) throws Exception{
try {
		Debug.PushSubsStack("GetBadge (badger) ","badger",3,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("getbadge")) { return __ref.runUserSub(false, "badger","getbadge", __ref, _view);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("view", _view);
 BA.debugLineNum = 51;BA.debugLine="Public Sub GetBadge(view As B4XView) As Int";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="If views.ContainsKey(view) Then";
Debug.ShouldStop(524288);
if (__ref.getField(false,"_views" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_view.getObject()))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 53;BA.debugLine="Dim lbl As B4XView = GetLabel(GetPanel(view))";
Debug.ShouldStop(1048576);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = __ref.runClassMethod (cloyd.blink.badger.class, "_getlabel" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (cloyd.blink.badger.class, "_getpanel" /*RemoteObject*/ ,(Object)((_view.getObject())))));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 54;BA.debugLine="Return lbl.Text";
Debug.ShouldStop(2097152);
if (true) return BA.numberCast(int.class, _lbl.runMethod(true,"getText"));
 }else {
 BA.debugLineNum = 56;BA.debugLine="Return 0";
Debug.ShouldStop(8388608);
if (true) return BA.numberCast(int.class, 0);
 };
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlabel(RemoteObject __ref,RemoteObject _panel) throws Exception{
try {
		Debug.PushSubsStack("GetLabel (badger) ","badger",3,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("getlabel")) { return __ref.runUserSub(false, "badger","getlabel", __ref, _panel);}
Debug.locals.put("panel", _panel);
 BA.debugLineNum = 64;BA.debugLine="Private Sub GetLabel(panel As B4XView) As B4XView";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="Return panel.GetView(panel.NumberOfViews - 1)";
Debug.ShouldStop(1);
if (true) return _panel.runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_panel.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref,RemoteObject _view) throws Exception{
try {
		Debug.PushSubsStack("GetPanel (badger) ","badger",3,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "badger","getpanel", __ref, _view);}
Debug.locals.put("view", _view);
 BA.debugLineNum = 60;BA.debugLine="Private Sub GetPanel (view As Object) As B4XView";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="Return views.Get(view)";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_views" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_view)));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (badger) ","badger",3,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "badger","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="views.Initialize";
Debug.ShouldStop(8192);
__ref.getField(false,"_views" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _removebadge(RemoteObject __ref,RemoteObject _view) throws Exception{
try {
		Debug.PushSubsStack("RemoveBadge (badger) ","badger",3,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("removebadge")) { __ref.runUserSub(false, "badger","removebadge", __ref, _view); return;}
ResumableSub_RemoveBadge rsub = new ResumableSub_RemoveBadge(null,__ref,_view);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_RemoveBadge extends BA.ResumableSub {
public ResumableSub_RemoveBadge(cloyd.blink.badger parent,RemoteObject __ref,RemoteObject _view) {
this.parent = parent;
this.__ref = __ref;
this._view = _view;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
cloyd.blink.badger parent;
RemoteObject _view;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RemoveBadge (badger) ","badger",3,__ref.getField(false, "ba"),__ref,34);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("view", _view);
 BA.debugLineNum = 35;BA.debugLine="Dim p As B4XView = GetPanel(view)";
Debug.ShouldStop(4);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.runClassMethod (cloyd.blink.badger.class, "_getpanel" /*RemoteObject*/ ,(Object)((_view.getObject())));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 36;BA.debugLine="GetLabel(p).RemoveViewFromParent";
Debug.ShouldStop(8);
__ref.runClassMethod (cloyd.blink.badger.class, "_getlabel" /*RemoteObject*/ ,(Object)(_p)).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 37;BA.debugLine="views.Remove(view)";
Debug.ShouldStop(16);
__ref.getField(false,"_views" /*RemoteObject*/ ).runVoidMethod ("Remove",(Object)((_view.getObject())));
 BA.debugLineNum = 38;BA.debugLine="p.SetLayoutAnimated(animationDuration, cx, cy, 0,";
Debug.ShouldStop(32);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(__ref.getField(true,"_animationduration" /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, __ref.getField(true,"_cx" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_cy" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 39;BA.debugLine="Sleep(animationDuration)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "badger", "removebadge"),__ref.getField(true,"_animationduration" /*RemoteObject*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 40;BA.debugLine="p.RemoveViewFromParent";
Debug.ShouldStop(128);
_p.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
public static void  _replacelabel(RemoteObject __ref,RemoteObject _view,RemoteObject _badge) throws Exception{
try {
		Debug.PushSubsStack("ReplaceLabel (badger) ","badger",3,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("replacelabel")) { __ref.runUserSub(false, "badger","replacelabel", __ref, _view, _badge); return;}
ResumableSub_ReplaceLabel rsub = new ResumableSub_ReplaceLabel(null,__ref,_view,_badge);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ReplaceLabel extends BA.ResumableSub {
public ResumableSub_ReplaceLabel(cloyd.blink.badger parent,RemoteObject __ref,RemoteObject _view,RemoteObject _badge) {
this.parent = parent;
this.__ref = __ref;
this._view = _view;
this._badge = _badge;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
cloyd.blink.badger parent;
RemoteObject _view;
RemoteObject _badge;
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ReplaceLabel (badger) ","badger",3,__ref.getField(false, "ba"),__ref,43);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("view", _view);
Debug.locals.put("Badge", _badge);
 BA.debugLineNum = 44;BA.debugLine="Dim lbl As B4XView = GetLabel(GetPanel(view))";
Debug.ShouldStop(2048);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_lbl = __ref.runClassMethod (cloyd.blink.badger.class, "_getlabel" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (cloyd.blink.badger.class, "_getpanel" /*RemoteObject*/ ,(Object)((_view.getObject())))));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 45;BA.debugLine="lbl.SetLayoutAnimated(animationDuration / 2, radi";
Debug.ShouldStop(4096);
_lbl.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_animationduration" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radius" /*RemoteObject*/ ),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))}, "+",1, 1))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radius" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "*",0, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radius" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "*",0, 1))));
 BA.debugLineNum = 46;BA.debugLine="CreateLabel(GetPanel(view), Badge)";
Debug.ShouldStop(8192);
__ref.runClassMethod (cloyd.blink.badger.class, "_createlabel" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (cloyd.blink.badger.class, "_getpanel" /*RemoteObject*/ ,(Object)((_view.getObject())))),(Object)(_badge));
 BA.debugLineNum = 47;BA.debugLine="Sleep(animationDuration / 2)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "badger", "replacelabel"),BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_animationduration" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0)));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 48;BA.debugLine="lbl.RemoveViewFromParent";
Debug.ShouldStop(32768);
_lbl.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
public static RemoteObject  _setbadge(RemoteObject __ref,RemoteObject _view,RemoteObject _badge) throws Exception{
try {
		Debug.PushSubsStack("SetBadge (badger) ","badger",3,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("setbadge")) { return __ref.runUserSub(false, "badger","setbadge", __ref, _view, _badge);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("view", _view);
Debug.locals.put("Badge", _badge);
 BA.debugLineNum = 17;BA.debugLine="Public Sub SetBadge(view As B4XView, Badge As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="If views.ContainsKey(view) Then";
Debug.ShouldStop(131072);
if (__ref.getField(false,"_views" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_view.getObject()))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 19;BA.debugLine="If Badge = 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_badge,BA.numberCast(int.class, 0))) { 
 BA.debugLineNum = 20;BA.debugLine="RemoveBadge(view)";
Debug.ShouldStop(524288);
__ref.runClassMethod (cloyd.blink.badger.class, "_removebadge" /*void*/ ,(Object)(_view));
 }else {
 BA.debugLineNum = 22;BA.debugLine="ReplaceLabel(view, Badge)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (cloyd.blink.badger.class, "_replacelabel" /*void*/ ,(Object)(_view),(Object)(_badge));
 };
 }else {
 BA.debugLineNum = 25;BA.debugLine="If Badge > 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",_badge,BA.numberCast(int.class, 0))) { 
 BA.debugLineNum = 26;BA.debugLine="Dim p As B4XView = CreateNewPanel(view, Badge)";
Debug.ShouldStop(33554432);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.runClassMethod (cloyd.blink.badger.class, "_createnewpanel" /*RemoteObject*/ ,(Object)(_view),(Object)(_badge));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 27;BA.debugLine="CreateLabel(p, Badge)";
Debug.ShouldStop(67108864);
__ref.runClassMethod (cloyd.blink.badger.class, "_createlabel" /*RemoteObject*/ ,(Object)(_p),(Object)(_badge));
 BA.debugLineNum = 28;BA.debugLine="p.SetLayoutAnimated(animationDuration, cx - rad";
Debug.ShouldStop(134217728);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(__ref.getField(true,"_animationduration" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cx" /*RemoteObject*/ ),__ref.getField(true,"_radius" /*RemoteObject*/ )}, "-",1, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cy" /*RemoteObject*/ ),__ref.getField(true,"_radius" /*RemoteObject*/ )}, "-",1, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radius" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "*",0, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_radius" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "*",0, 1))));
 BA.debugLineNum = 29;BA.debugLine="views.Put(view, p)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_views" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_view.getObject())),(Object)((_p.getObject())));
 };
 };
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}