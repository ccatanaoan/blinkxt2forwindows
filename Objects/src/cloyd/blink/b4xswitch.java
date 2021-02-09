package cloyd.blink;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xswitch extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("cloyd.blink", "cloyd.blink.b4xswitch", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", cloyd.blink.b4xswitch.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4j.example.bcpath._bcbrush _oncolor = null;
public b4j.example.bcpath._bcbrush _offcolor = null;
public b4j.example.bitmapcreator _bc = null;
public int _width = 0;
public int _height = 0;
public b4j.example.bcpath._bcbrush _thumbcolor = null;
public anywheresoftware.b4j.objects.ImageViewWrapper _iv = null;
public boolean _mvalue = false;
public b4j.example.bcpath._bcbrush _transparent = null;
public int _loopindex = 0;
public Object _tag = null;
public float _scale = 0f;
public boolean _menabled = false;
public boolean _mhaptic = false;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public cloyd.blink.main _main = null;
public cloyd.blink.httputils2service _httputils2service = null;
public cloyd.blink.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(double _width1,double _height1) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Private Sub Base_Resize (Width1 As Double, Height1";
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 9;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 10;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 12;BA.debugLine="Private OnColor, OffColor As BCBrush";
_oncolor = new b4j.example.bcpath._bcbrush();
_offcolor = new b4j.example.bcpath._bcbrush();
 //BA.debugLineNum = 13;BA.debugLine="Private bc As BitmapCreator";
_bc = new b4j.example.bitmapcreator();
 //BA.debugLineNum = 14;BA.debugLine="Private Width As Int = 55dip";
_width = __c.DipToCurrent((int) (55));
 //BA.debugLineNum = 15;BA.debugLine="Private Height As Int = 31dip";
_height = __c.DipToCurrent((int) (31));
 //BA.debugLineNum = 16;BA.debugLine="Private ThumbColor As BCBrush";
_thumbcolor = new b4j.example.bcpath._bcbrush();
 //BA.debugLineNum = 17;BA.debugLine="Private iv As ImageView";
_iv = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private mValue As Boolean";
_mvalue = false;
 //BA.debugLineNum = 19;BA.debugLine="Private transparent As BCBrush";
_transparent = new b4j.example.bcpath._bcbrush();
 //BA.debugLineNum = 20;BA.debugLine="Private LoopIndex As Int";
_loopindex = 0;
 //BA.debugLineNum = 21;BA.debugLine="Public Tag As Object";
_tag = new Object();
 //BA.debugLineNum = 22;BA.debugLine="Private Scale As Float";
_scale = 0f;
 //BA.debugLineNum = 23;BA.debugLine="Private mEnabled As Boolean = True";
_menabled = __c.True;
 //BA.debugLineNum = 24;BA.debugLine="Public mHaptic As Boolean";
_mhaptic = false;
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
 //BA.debugLineNum = 33;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 34;BA.debugLine="mBase = Base";
_mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 35;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_tag = _mbase.getTag();
 //BA.debugLineNum = 35;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_mbase.setTag(this);
 //BA.debugLineNum = 36;BA.debugLine="mBase.SetLayoutAnimated(0, mBase.Left, mBase.Top,";
_mbase.SetLayoutAnimated((int) (0),_mbase.getLeft(),_mbase.getTop(),_width,_height);
 //BA.debugLineNum = 37;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
_mbase.SetColorAndBorder(_xui.Color_Transparent,0,(int) (0),0);
 //BA.debugLineNum = 38;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"pnl\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = _xui.CreatePanel(ba,"pnl");
 //BA.debugLineNum = 39;BA.debugLine="pnl.Color = xui.Color_Transparent";
_pnl.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 40;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
 //BA.debugLineNum = 41;BA.debugLine="mBase.AddView(iv, 0, 0, Width, Height)";
_mbase.AddView((javafx.scene.Node)(_iv.getObject()),0,0,_width,_height);
 //BA.debugLineNum = 42;BA.debugLine="mBase.AddView(pnl, 0, 0, Width, Height)";
_mbase.AddView((javafx.scene.Node)(_pnl.getObject()),0,0,_width,_height);
 //BA.debugLineNum = 44;BA.debugLine="bc.Initialize(Width, Height)";
_bc._initialize(ba,_width,_height);
 //BA.debugLineNum = 45;BA.debugLine="Scale = xui.Scale";
_scale = _xui.getScale();
 //BA.debugLineNum = 50;BA.debugLine="OnColor = bc.CreateBrushFromColor(xui.PaintOrColo";
_oncolor = _bc._createbrushfromcolor(_xui.PaintOrColorToColor(_props.Get((Object)("OnColor"))));
 //BA.debugLineNum = 51;BA.debugLine="OffColor = bc.CreateBrushFromColor(xui.PaintOrCol";
_offcolor = _bc._createbrushfromcolor(_xui.PaintOrColorToColor(_props.Get((Object)("OffColor"))));
 //BA.debugLineNum = 52;BA.debugLine="ThumbColor = bc.CreateBrushFromColor(xui.PaintOrC";
_thumbcolor = _bc._createbrushfromcolor(_xui.PaintOrColorToColor(_props.Get((Object)("ThumbColor"))));
 //BA.debugLineNum = 53;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
_mhaptic = BA.ObjectToBoolean(_props.GetDefault((Object)("HapticFeedback"),(Object)(__c.False)));
 //BA.debugLineNum = 54;BA.debugLine="transparent = bc.CreateBrushFromColor(xui.Color_T";
_transparent = _bc._createbrushfromcolor(_xui.Color_Transparent);
 //BA.debugLineNum = 55;BA.debugLine="mEnabled = mBase.Enabled";
_menabled = _mbase.getEnabled();
 //BA.debugLineNum = 56;BA.debugLine="mBase.Enabled = True";
_mbase.setEnabled(__c.True);
 //BA.debugLineNum = 57;BA.debugLine="SetValueImpl(Props.Get(\"Value\"), True)";
_setvalueimpl(BA.ObjectToBoolean(_props.Get((Object)("Value"))),__c.True);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _draw(float _state) throws Exception{
float _r = 0f;
float _cx = 0f;
int _cy = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _smallrect = null;
float _w = 0f;
float _h = 0f;
 //BA.debugLineNum = 119;BA.debugLine="Private Sub Draw (State As Float)";
 //BA.debugLineNum = 120;BA.debugLine="bc.DrawRect2(bc.TargetRect, transparent, True, 0)";
_bc._drawrect2(_bc._targetrect,_transparent,__c.True,(int) (0));
 //BA.debugLineNum = 121;BA.debugLine="Dim r As Float = Round(bc.mHeight / 2)";
_r = (float) (__c.Round(_bc._mheight/(double)2));
 //BA.debugLineNum = 122;BA.debugLine="Dim cx As Float = r - 1 * Scale + (bc.mWidth - 2";
_cx = (float) (_r-1*_scale+(_bc._mwidth-2*_r)*_state);
 //BA.debugLineNum = 123;BA.debugLine="If State = 0 Then";
if (_state==0) { 
 //BA.debugLineNum = 124;BA.debugLine="cx = r";
_cx = _r;
 }else if(_state==1) { 
 //BA.debugLineNum = 126;BA.debugLine="cx = Round(bc.mWidth - 1 * Scale - r)";
_cx = (float) (__c.Round(_bc._mwidth-1*_scale-_r));
 };
 //BA.debugLineNum = 128;BA.debugLine="Dim cy As Int = bc.mHeight / 2";
_cy = (int) (_bc._mheight/(double)2);
 //BA.debugLineNum = 129;BA.debugLine="Dim smallrect As B4XRect";
_smallrect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 130;BA.debugLine="Dim w As Float = State * bc.mWidth";
_w = (float) (_state*_bc._mwidth);
 //BA.debugLineNum = 131;BA.debugLine="Dim h As Float = State * bc.mHeight";
_h = (float) (_state*_bc._mheight);
 //BA.debugLineNum = 132;BA.debugLine="If State < 1 Then bc.DrawRectRounded2(bc.TargetRe";
if (_state<1) { 
_bc._drawrectrounded2(_bc._targetrect,_offcolor,__c.True,(int) (2*_scale),(int) (_r));};
 //BA.debugLineNum = 133;BA.debugLine="smallrect.Initialize(bc.mWidth / 2 - w / 2, cy -";
_smallrect.Initialize((float) (_bc._mwidth/(double)2-_w/(double)2),(float) (_cy-_h/(double)2),(float) (_bc._mwidth/(double)2+_w/(double)2),(float) (_cy+_h/(double)2));
 //BA.debugLineNum = 134;BA.debugLine="If State > 0 Then bc.DrawRectRounded2(smallrect,";
if (_state>0) { 
_bc._drawrectrounded2(_smallrect,_oncolor,__c.True,(int) (2*_scale),(int) (_smallrect.getHeight()/(double)2));};
 //BA.debugLineNum = 135;BA.debugLine="If mEnabled Then";
if (_menabled) { 
 //BA.debugLineNum = 136;BA.debugLine="bc.DrawCircle2(cx, cy, r - 2 * Scale, ThumbColor";
_bc._drawcircle2(_cx,(float) (_cy),(float) (_r-2*_scale),_thumbcolor,__c.True,(int) (0));
 };
 //BA.debugLineNum = 138;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, iv)";
_bc._setbitmaptoimageview(_bc._getbitmap(),(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject())));
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public boolean  _getenabled() throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Public Sub getEnabled As Boolean";
 //BA.debugLineNum = 116;BA.debugLine="Return mEnabled";
if (true) return _menabled;
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return false;
}
public boolean  _getvalue() throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Public Sub getValue As Boolean";
 //BA.debugLineNum = 107;BA.debugLine="Return mValue";
if (true) return _mvalue;
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 28;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 29;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _pnl_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Private Sub Pnl_MouseClicked (EventData As MouseEv";
 //BA.debugLineNum = 68;BA.debugLine="EventData.Consume";
_eventdata.Consume();
 //BA.debugLineNum = 72;BA.debugLine="If mEnabled Then";
if (_menabled) { 
 //BA.debugLineNum = 73;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFeedb";
if (_mhaptic) { 
_xuiviewsutils._performhapticfeedback /*String*/ (_mbase);};
 //BA.debugLineNum = 74;BA.debugLine="SetValueImpl(Not(mValue), False)";
_setvalueimpl(__c.Not(_mvalue),__c.False);
 //BA.debugLineNum = 75;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ValueC";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_ValueChanged",(Object)(_mvalue));
 };
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(boolean _b) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Public Sub setEnabled (b As Boolean)";
 //BA.debugLineNum = 111;BA.debugLine="mEnabled = b";
_menabled = _b;
 //BA.debugLineNum = 112;BA.debugLine="SetValueImpl(mValue, True)";
_setvalueimpl(_mvalue,__c.True);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(boolean _b) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Public Sub setValue(b As Boolean)";
 //BA.debugLineNum = 102;BA.debugLine="If b = mValue Then Return";
if (_b==_mvalue) { 
if (true) return "";};
 //BA.debugLineNum = 103;BA.debugLine="SetValueImpl(b, False)";
_setvalueimpl(_b,__c.False);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public void  _setvalueimpl(boolean _b,boolean _immediate) throws Exception{
ResumableSub_SetValueImpl rsub = new ResumableSub_SetValueImpl(this,_b,_immediate);
rsub.resume(ba, null);
}
public static class ResumableSub_SetValueImpl extends BA.ResumableSub {
public ResumableSub_SetValueImpl(cloyd.blink.b4xswitch parent,boolean _b,boolean _immediate) {
this.parent = parent;
this._b = _b;
this._immediate = _immediate;
}
cloyd.blink.b4xswitch parent;
boolean _b;
boolean _immediate;
int _myindex = 0;
long _start = 0L;
int _duration = 0;
float _state1 = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 80;BA.debugLine="mValue = b";
parent._mvalue = _b;
 //BA.debugLineNum = 81;BA.debugLine="LoopIndex = LoopIndex + 1";
parent._loopindex = (int) (parent._loopindex+1);
 //BA.debugLineNum = 82;BA.debugLine="If Immediate Then";
if (true) break;

case 1:
//if
this.state = 41;
if (_immediate) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 83;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
if (true) break;

case 4:
//if
this.state = 11;
if (parent._mvalue) { 
this.state = 6;
;}
else {
this.state = 8;
;}if (true) break;

case 6:
//C
this.state = 11;
parent._draw((float) (1));
if (true) break;

case 8:
//C
this.state = 11;
parent._draw((float) (0));
if (true) break;

case 11:
//C
this.state = 41;
;
 if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 85;BA.debugLine="Dim MyIndex As Int = LoopIndex";
_myindex = parent._loopindex;
 //BA.debugLineNum = 86;BA.debugLine="Dim start As Long = DateTime.Now";
_start = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 87;BA.debugLine="Dim duration As Int = 200";
_duration = (int) (200);
 //BA.debugLineNum = 88;BA.debugLine="Do While DateTime.Now < start + duration";
if (true) break;

case 14:
//do while
this.state = 29;
while (parent.__c.DateTime.getNow()<_start+_duration) {
this.state = 16;
if (true) break;
}
if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 89;BA.debugLine="Dim state1 As Float = (DateTime.Now - start) /";
_state1 = (float) ((parent.__c.DateTime.getNow()-_start)/(double)_duration);
 //BA.debugLineNum = 90;BA.debugLine="If mValue = False Then state1 = 1 - state1";
if (true) break;

case 17:
//if
this.state = 22;
if (parent._mvalue==parent.__c.False) { 
this.state = 19;
;}if (true) break;

case 19:
//C
this.state = 22;
_state1 = (float) (1-_state1);
if (true) break;

case 22:
//C
this.state = 23;
;
 //BA.debugLineNum = 91;BA.debugLine="Draw(state1)";
parent._draw(_state1);
 //BA.debugLineNum = 92;BA.debugLine="Sleep(16)";
parent.__c.Sleep(ba,this,(int) (16));
this.state = 42;
return;
case 42:
//C
this.state = 23;
;
 //BA.debugLineNum = 93;BA.debugLine="If MyIndex <> LoopIndex Then Exit";
if (true) break;

case 23:
//if
this.state = 28;
if (_myindex!=parent._loopindex) { 
this.state = 25;
;}if (true) break;

case 25:
//C
this.state = 28;
this.state = 29;
if (true) break;
if (true) break;

case 28:
//C
this.state = 14;
;
 if (true) break;
;
 //BA.debugLineNum = 95;BA.debugLine="If MyIndex = LoopIndex Then";

case 29:
//if
this.state = 40;
if (_myindex==parent._loopindex) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 //BA.debugLineNum = 96;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
if (true) break;

case 32:
//if
this.state = 39;
if (parent._mvalue) { 
this.state = 34;
;}
else {
this.state = 36;
;}if (true) break;

case 34:
//C
this.state = 39;
parent._draw((float) (1));
if (true) break;

case 36:
//C
this.state = 39;
parent._draw((float) (0));
if (true) break;

case 39:
//C
this.state = 40;
;
 if (true) break;

case 40:
//C
this.state = 41;
;
 if (true) break;

case 41:
//C
this.state = -1;
;
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
