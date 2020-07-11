package cloyd.blink;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class badger extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("cloyd.blink", "cloyd.blink.badger", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", cloyd.blink.badger.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.Map _views = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _stub = null;
public int _radius = 0;
public int _animationduration = 0;
public float _cx = 0f;
public float _cy = 0f;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _color = 0;
public int _textcolor = 0;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public cloyd.blink.main _main = null;
public cloyd.blink.httputils2service _httputils2service = null;
public String  _initialize(cloyd.blink.badger __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="badger";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="views.Initialize";
__ref._views /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="End Sub";
return "";
}
public String  _setbadge(cloyd.blink.badger __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,int _badge) throws Exception{
__ref = this;
RDebugUtils.currentModule="badger";
if (Debug.shouldDelegate(ba, "setbadge", false))
	 {return ((String) Debug.delegate(ba, "setbadge", new Object[] {_view,_badge}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Public Sub SetBadge(view As B4XView, Badge As Int)";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="If views.ContainsKey(view) Then";
if (__ref._views /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_view.getObject()))) { 
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="If Badge = 0 Then";
if (_badge==0) { 
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="RemoveBadge(view)";
__ref._removebadge /*void*/ (null,_view);
 }else {
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="ReplaceLabel(view, Badge)";
__ref._replacelabel /*void*/ (null,_view,_badge);
 };
 }else {
RDebugUtils.currentLine=5439496;
 //BA.debugLineNum = 5439496;BA.debugLine="If Badge > 0 Then";
if (_badge>0) { 
RDebugUtils.currentLine=5439497;
 //BA.debugLineNum = 5439497;BA.debugLine="Dim p As B4XView = CreateNewPanel(view, Badge)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._createnewpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_view,_badge);
RDebugUtils.currentLine=5439498;
 //BA.debugLineNum = 5439498;BA.debugLine="CreateLabel(p, Badge)";
__ref._createlabel /*String*/ (null,_p,_badge);
RDebugUtils.currentLine=5439499;
 //BA.debugLineNum = 5439499;BA.debugLine="p.SetLayoutAnimated(animationDuration, cx - rad";
_p.SetLayoutAnimated(__ref._animationduration /*int*/ ,__ref._cx /*float*/ -__ref._radius /*int*/ ,__ref._cy /*float*/ -__ref._radius /*int*/ ,__ref._radius /*int*/ *2,__ref._radius /*int*/ *2);
RDebugUtils.currentLine=5439500;
 //BA.debugLineNum = 5439500;BA.debugLine="views.Put(view, p)";
__ref._views /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_view.getObject()),(Object)(_p.getObject()));
 };
 };
RDebugUtils.currentLine=5439503;
 //BA.debugLineNum = 5439503;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(cloyd.blink.badger __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="badger";
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Private views As Map";
_views = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="Private stub As B4XView 'ignore";
_stub = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="Private radius As Int = 15dip";
_radius = __c.DipToCurrent((int) (15));
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="Private animationDuration As Int = 500";
_animationduration = (int) (500);
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="Private cx, cy As Float";
_cx = 0f;
_cy = 0f;
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=5308423;
 //BA.debugLineNum = 5308423;BA.debugLine="Private color As Int = xui.Color_Red";
_color = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red;
RDebugUtils.currentLine=5308424;
 //BA.debugLineNum = 5308424;BA.debugLine="Private textColor As Int = xui.Color_White";
_textcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=5308425;
 //BA.debugLineNum = 5308425;BA.debugLine="End Sub";
return "";
}
public String  _createlabel(cloyd.blink.badger __ref,anywheresoftware.b4a.objects.B4XViewWrapper _p,int _count) throws Exception{
__ref = this;
RDebugUtils.currentModule="badger";
if (Debug.shouldDelegate(ba, "createlabel", false))
	 {return ((String) Debug.delegate(ba, "createlabel", new Object[] {_p,_count}));}
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
int _duration = 0;
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Private Sub CreateLabel(p As B4XView, count As Int";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="xlbl.Font = xui.CreateDefaultBoldFont(16)";
_xlbl.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (16)));
RDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="xlbl.TextColor = textColor";
_xlbl.setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="xlbl.Text = count";
_xlbl.setText(BA.NumberToString(_count));
RDebugUtils.currentLine=5898247;
 //BA.debugLineNum = 5898247;BA.debugLine="p.AddView(xlbl, radius, radius, 0, 0)";
_p.AddView((javafx.scene.Node)(_xlbl.getObject()),__ref._radius /*int*/ ,__ref._radius /*int*/ ,0,0);
RDebugUtils.currentLine=5898248;
 //BA.debugLineNum = 5898248;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=5898249;
 //BA.debugLineNum = 5898249;BA.debugLine="Dim duration As Int = animationDuration";
_duration = __ref._animationduration /*int*/ ;
RDebugUtils.currentLine=5898250;
 //BA.debugLineNum = 5898250;BA.debugLine="xlbl.SetLayoutAnimated(duration, 0, 0, radius * 2";
_xlbl.SetLayoutAnimated(_duration,0,0,__ref._radius /*int*/ *2,__ref._radius /*int*/ *2);
RDebugUtils.currentLine=5898251;
 //BA.debugLineNum = 5898251;BA.debugLine="xlbl.Visible = False";
_xlbl.setVisible(__c.False);
RDebugUtils.currentLine=5898252;
 //BA.debugLineNum = 5898252;BA.debugLine="xlbl.SetVisibleAnimated(animationDuration, True)";
_xlbl.SetVisibleAnimated(ba,__ref._animationduration /*int*/ ,__c.True);
RDebugUtils.currentLine=5898253;
 //BA.debugLineNum = 5898253;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createnewpanel(cloyd.blink.badger __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,int _count) throws Exception{
__ref = this;
RDebugUtils.currentModule="badger";
if (Debug.shouldDelegate(ba, "createnewpanel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createnewpanel", new Object[] {_view,_count}));}
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xp = null;
anywheresoftware.b4a.objects.B4XViewWrapper _parent = null;
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Private Sub CreateNewPanel(view As B4XView, count";
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="Dim p As Pane";
_p = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=5832710;
 //BA.debugLineNum = 5832710;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=5832714;
 //BA.debugLineNum = 5832714;BA.debugLine="Dim xp As B4XView = p";
_xp = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xp = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject()));
RDebugUtils.currentLine=5832715;
 //BA.debugLineNum = 5832715;BA.debugLine="xp.SetColorAndBorder(color, 0, color, radius)";
_xp.SetColorAndBorder(__ref._color /*int*/ ,0,__ref._color /*int*/ ,__ref._radius /*int*/ );
RDebugUtils.currentLine=5832716;
 //BA.debugLineNum = 5832716;BA.debugLine="cx = view.Left + view.Width";
__ref._cx /*float*/  = (float) (_view.getLeft()+_view.getWidth());
RDebugUtils.currentLine=5832717;
 //BA.debugLineNum = 5832717;BA.debugLine="cy = view.Top";
__ref._cy /*float*/  = (float) (_view.getTop());
RDebugUtils.currentLine=5832718;
 //BA.debugLineNum = 5832718;BA.debugLine="Dim parent As B4XView = view.Parent";
_parent = new anywheresoftware.b4a.objects.B4XViewWrapper();
_parent = _view.getParent();
RDebugUtils.currentLine=5832719;
 //BA.debugLineNum = 5832719;BA.debugLine="parent.AddView(xp, cx, cy, 0, 0)";
_parent.AddView((javafx.scene.Node)(_xp.getObject()),__ref._cx /*float*/ ,__ref._cy /*float*/ ,0,0);
RDebugUtils.currentLine=5832720;
 //BA.debugLineNum = 5832720;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject()));
RDebugUtils.currentLine=5832721;
 //BA.debugLineNum = 5832721;BA.debugLine="End Sub";
return null;
}
public int  _getbadge(cloyd.blink.badger __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
__ref = this;
RDebugUtils.currentModule="badger";
if (Debug.shouldDelegate(ba, "getbadge", false))
	 {return ((Integer) Debug.delegate(ba, "getbadge", new Object[] {_view}));}
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Public Sub GetBadge(view As B4XView) As Int";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="If views.ContainsKey(view) Then";
if (__ref._views /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_view.getObject()))) { 
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="Dim lbl As B4XView = GetLabel(GetPanel(view))";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._getlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,(Object)(_view.getObject())));
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="Return lbl.Text";
if (true) return (int)(Double.parseDouble(_lbl.getText()));
 }else {
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="Return 0";
if (true) return (int) (0);
 };
RDebugUtils.currentLine=5636103;
 //BA.debugLineNum = 5636103;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getlabel(cloyd.blink.badger __ref,anywheresoftware.b4a.objects.B4XViewWrapper _panel) throws Exception{
__ref = this;
RDebugUtils.currentModule="badger";
if (Debug.shouldDelegate(ba, "getlabel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getlabel", new Object[] {_panel}));}
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Private Sub GetLabel(panel As B4XView) As B4XView";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="Return panel.GetView(panel.NumberOfViews - 1)";
if (true) return _panel.GetView((int) (_panel.getNumberOfViews()-1));
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(cloyd.blink.badger __ref,Object _view) throws Exception{
__ref = this;
RDebugUtils.currentModule="badger";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_view}));}
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Private Sub GetPanel (view As Object) As B4XView";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Return views.Get(view)";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._views /*anywheresoftware.b4a.objects.collections.Map*/ .Get(_view)));
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="End Sub";
return null;
}
public void  _removebadge(cloyd.blink.badger __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
RDebugUtils.currentModule="badger";
if (Debug.shouldDelegate(ba, "removebadge", false))
	 {Debug.delegate(ba, "removebadge", new Object[] {_view}); return;}
ResumableSub_RemoveBadge rsub = new ResumableSub_RemoveBadge(this,__ref,_view);
rsub.resume(ba, null);
}
public static class ResumableSub_RemoveBadge extends BA.ResumableSub {
public ResumableSub_RemoveBadge(cloyd.blink.badger parent,cloyd.blink.badger __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view) {
this.parent = parent;
this.__ref = __ref;
this._view = _view;
this.__ref = parent;
}
cloyd.blink.badger __ref;
cloyd.blink.badger parent;
anywheresoftware.b4a.objects.B4XViewWrapper _view;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="badger";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Dim p As B4XView = GetPanel(view)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,(Object)(_view.getObject()));
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="GetLabel(p).RemoveViewFromParent";
__ref._getlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_p).RemoveViewFromParent();
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="views.Remove(view)";
__ref._views /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_view.getObject()));
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="p.SetLayoutAnimated(animationDuration, cx, cy, 0,";
_p.SetLayoutAnimated(__ref._animationduration /*int*/ ,__ref._cx /*float*/ ,__ref._cy /*float*/ ,0,0);
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="Sleep(animationDuration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "badger", "removebadge"),__ref._animationduration /*int*/ );
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="p.RemoveViewFromParent";
_p.RemoveViewFromParent();
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _replacelabel(cloyd.blink.badger __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,int _badge) throws Exception{
RDebugUtils.currentModule="badger";
if (Debug.shouldDelegate(ba, "replacelabel", false))
	 {Debug.delegate(ba, "replacelabel", new Object[] {_view,_badge}); return;}
ResumableSub_ReplaceLabel rsub = new ResumableSub_ReplaceLabel(this,__ref,_view,_badge);
rsub.resume(ba, null);
}
public static class ResumableSub_ReplaceLabel extends BA.ResumableSub {
public ResumableSub_ReplaceLabel(cloyd.blink.badger parent,cloyd.blink.badger __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,int _badge) {
this.parent = parent;
this.__ref = __ref;
this._view = _view;
this._badge = _badge;
this.__ref = parent;
}
cloyd.blink.badger __ref;
cloyd.blink.badger parent;
anywheresoftware.b4a.objects.B4XViewWrapper _view;
int _badge;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="badger";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Dim lbl As B4XView = GetLabel(GetPanel(view))";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._getlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,(Object)(_view.getObject())));
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="lbl.SetLayoutAnimated(animationDuration / 2, radi";
_lbl.SetLayoutAnimated((int) (__ref._animationduration /*int*/ /(double)2),__ref._radius /*int*/ +parent.__c.DipToCurrent((int) (8)),0,__ref._radius /*int*/ *2,__ref._radius /*int*/ *2);
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="CreateLabel(GetPanel(view), Badge)";
__ref._createlabel /*String*/ (null,__ref._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,(Object)(_view.getObject())),_badge);
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="Sleep(animationDuration / 2)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "badger", "replacelabel"),(int) (__ref._animationduration /*int*/ /(double)2));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="lbl.RemoveViewFromParent";
_lbl.RemoveViewFromParent();
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}