package cloyd.blink;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xbreadcrumb extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("cloyd.blink", "cloyd.blink.b4xbreadcrumb", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", cloyd.blink.b4xbreadcrumb.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public anywheresoftware.b4a.objects.collections.List _mitems = null;
public anywheresoftware.b4a.objects.collections.List _rightpositions = null;
public int _textcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
public int _offset = 0;
public b4j.example.bitmapcreator _bc = null;
public int _crumbcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _touchpanel = null;
public int _presseditem = 0;
public Object _tag = null;
public boolean _mhaptic = false;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public cloyd.blink.main _main = null;
public cloyd.blink.httputils2service _httputils2service = null;
public cloyd.blink.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 52;BA.debugLine="cvs.Resize(Width, Height)";
_cvs.Resize(_width,_height);
 //BA.debugLineNum = 53;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
_touchpanel.SetLayoutAnimated((int) (0),0,0,_width,_height);
 //BA.debugLineNum = 54;BA.debugLine="Draw";
_draw();
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 7;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 8;BA.debugLine="Private mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 10;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 11;BA.debugLine="Private mItems As List";
_mitems = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 12;BA.debugLine="Private RightPositions As List";
_rightpositions = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 13;BA.debugLine="Public TextColor As Int";
_textcolor = 0;
 //BA.debugLineNum = 14;BA.debugLine="Public fnt As B4XFont";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 15;BA.debugLine="Private offset As Int = 10dip";
_offset = __c.DipToCurrent((int) (10));
 //BA.debugLineNum = 16;BA.debugLine="Private bc As BitmapCreator";
_bc = new b4j.example.bitmapcreator();
 //BA.debugLineNum = 17;BA.debugLine="Public CrumbColor As Int";
_crumbcolor = 0;
 //BA.debugLineNum = 18;BA.debugLine="Private TouchPanel As B4XView";
_touchpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private PressedItem As Int = -1";
_presseditem = (int) (-1);
 //BA.debugLineNum = 20;BA.debugLine="Public Tag As Object";
_tag = new Object();
 //BA.debugLineNum = 21;BA.debugLine="Public mHaptic As Boolean";
_mhaptic = false;
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
String _items = "";
String _s = "";
 //BA.debugLineNum = 33;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 34;BA.debugLine="mBase = Base";
_mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 35;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_tag = _mbase.getTag();
 //BA.debugLineNum = 35;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_mbase.setTag(this);
 //BA.debugLineNum = 36;BA.debugLine="cvs.Initialize(mBase)";
_cvs.Initialize(ba,_mbase);
 //BA.debugLineNum = 37;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 38;BA.debugLine="fnt = xlbl.Font";
_fnt = _xlbl.getFont();
 //BA.debugLineNum = 39;BA.debugLine="TextColor = xlbl.TextColor";
_textcolor = _xlbl.getTextColor();
 //BA.debugLineNum = 40;BA.debugLine="CrumbColor = xui.PaintOrColorToColor(Props.Get(\"C";
_crumbcolor = _xui.PaintOrColorToColor(_props.Get((Object)("CrumbColor")));
 //BA.debugLineNum = 41;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
_mhaptic = BA.ObjectToBoolean(_props.GetDefault((Object)("HapticFeedback"),(Object)(__c.False)));
 //BA.debugLineNum = 42;BA.debugLine="TouchPanel = xui.CreatePanel(\"Touch\")";
_touchpanel = _xui.CreatePanel(ba,"Touch");
 //BA.debugLineNum = 43;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, mBase.Width, mBas";
_mbase.AddView((javafx.scene.Node)(_touchpanel.getObject()),0,0,_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 44;BA.debugLine="Dim items As String = Props.Get(\"Items\")";
_items = BA.ObjectToString(_props.Get((Object)("Items")));
 //BA.debugLineNum = 45;BA.debugLine="For Each s As String In Regex.Split(\"\\|\", items)";
{
final String[] group13 = __c.Regex.Split("\\|",_items);
final int groupLen13 = group13.length
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_s = group13[index13];
 //BA.debugLineNum = 46;BA.debugLine="mItems.Add(s)";
_mitems.Add((Object)(_s));
 }
};
 //BA.debugLineNum = 48;BA.debugLine="Draw";
_draw();
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public String  _draw() throws Exception{
b4j.example.bitmapcreator._argbcolor _bcolor = null;
int _strokecolor = 0;
int[] _clrs = null;
int _left = 0;
int _i = 0;
int _sc = 0;
int _width = 0;
 //BA.debugLineNum = 57;BA.debugLine="Private Sub Draw";
 //BA.debugLineNum = 58;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
_cvs.ClearRect(_cvs.getTargetRect());
 //BA.debugLineNum = 59;BA.debugLine="Dim bcolor As ARGBColor";
_bcolor = new b4j.example.bitmapcreator._argbcolor();
 //BA.debugLineNum = 60;BA.debugLine="bc.ColorToARGB(CrumbColor, bcolor)";
_bc._colortoargb(_crumbcolor,_bcolor);
 //BA.debugLineNum = 61;BA.debugLine="bcolor.r = Min(255, bcolor.r * 2)";
_bcolor.r = (int) (__c.Min(255,_bcolor.r*2));
 //BA.debugLineNum = 62;BA.debugLine="bcolor.g = Min(255, bcolor.g * 2)";
_bcolor.g = (int) (__c.Min(255,_bcolor.g*2));
 //BA.debugLineNum = 63;BA.debugLine="bcolor.b = Min(255, bcolor.b * 2)";
_bcolor.b = (int) (__c.Min(255,_bcolor.b*2));
 //BA.debugLineNum = 64;BA.debugLine="Dim strokeColor As Int = bc.ARGBToColor(bcolor)";
_strokecolor = _bc._argbtocolor(_bcolor);
 //BA.debugLineNum = 66;BA.debugLine="bc.ColorToARGB(CrumbColor, bcolor)";
_bc._colortoargb(_crumbcolor,_bcolor);
 //BA.debugLineNum = 67;BA.debugLine="bcolor.r = bcolor.r * 0.8";
_bcolor.r = (int) (_bcolor.r*0.8);
 //BA.debugLineNum = 68;BA.debugLine="bcolor.g = bcolor.g * 0.8";
_bcolor.g = (int) (_bcolor.g*0.8);
 //BA.debugLineNum = 69;BA.debugLine="bcolor.b = bcolor.b * 0.8";
_bcolor.b = (int) (_bcolor.b*0.8);
 //BA.debugLineNum = 70;BA.debugLine="Dim Clrs() As Int = Array As Int(CrumbColor, bc.A";
_clrs = new int[]{_crumbcolor,_bc._argbtocolor(_bcolor)};
 //BA.debugLineNum = 72;BA.debugLine="RightPositions.Clear";
_rightpositions.Clear();
 //BA.debugLineNum = 73;BA.debugLine="If mItems.Size = 0 Then Return";
if (_mitems.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 74;BA.debugLine="Dim Left As Int = 0";
_left = (int) (0);
 //BA.debugLineNum = 75;BA.debugLine="For i = 0 To mItems.Size - 1";
{
final int step16 = 1;
final int limit16 = (int) (_mitems.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
 //BA.debugLineNum = 76;BA.debugLine="Dim sc As Int";
_sc = 0;
 //BA.debugLineNum = 77;BA.debugLine="If PressedItem = i Then sc = strokeColor Else sc";
if (_presseditem==_i) { 
_sc = _strokecolor;}
else {
_sc = (int) (0);};
 //BA.debugLineNum = 78;BA.debugLine="Dim width As Int = DrawItem(Left, mItems.Get(i),";
_width = _drawitem(_left,BA.ObjectToString(_mitems.Get(_i)),_i==0,_i==_mitems.getSize()-1,_clrs[(int) (_i%_clrs.length)],_sc);
 //BA.debugLineNum = 79;BA.debugLine="Left = Left + width + offset + 2dip";
_left = (int) (_left+_width+_offset+__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 80;BA.debugLine="RightPositions.Add(Left)";
_rightpositions.Add((Object)(_left));
 }
};
 //BA.debugLineNum = 82;BA.debugLine="cvs.Invalidate";
_cvs.Invalidate();
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public int  _drawitem(int _left,String _text,boolean _first,boolean _last,int _clr,int _strokecolor) throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _itemwidth = 0;
int _itemheight = 0;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
 //BA.debugLineNum = 85;BA.debugLine="Private Sub DrawItem(Left As Int, Text As String,";
 //BA.debugLineNum = 86;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(Text, fnt)";
_r = _cvs.MeasureText(_text,_fnt);
 //BA.debugLineNum = 87;BA.debugLine="Dim ItemWidth As Int = r.Width + 30dip";
_itemwidth = (int) (_r.getWidth()+__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 88;BA.debugLine="Dim ItemHeight As Int = cvs.TargetRect.Height";
_itemheight = (int) (_cvs.getTargetRect().getHeight());
 //BA.debugLineNum = 89;BA.debugLine="Dim BaseLine As Int = cvs.TargetRect.CenterY - r.";
_baseline = (int) (_cvs.getTargetRect().getCenterY()-_r.getHeight()/(double)2-_r.getTop());
 //BA.debugLineNum = 90;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 91;BA.debugLine="p.Initialize(Left, 0)";
_p.Initialize((float) (_left),(float) (0));
 //BA.debugLineNum = 92;BA.debugLine="p.LineTo(Left + ItemWidth, 0)";
_p.LineTo((float) (_left+_itemwidth),(float) (0));
 //BA.debugLineNum = 93;BA.debugLine="If Last = False Then";
if (_last==__c.False) { 
 //BA.debugLineNum = 94;BA.debugLine="p.LineTo(Left + ItemWidth + offset, ItemHeight /";
_p.LineTo((float) (_left+_itemwidth+_offset),(float) (_itemheight/(double)2));
 };
 //BA.debugLineNum = 96;BA.debugLine="p.LineTo(Left + ItemWidth, ItemHeight)";
_p.LineTo((float) (_left+_itemwidth),(float) (_itemheight));
 //BA.debugLineNum = 97;BA.debugLine="If First = False Then";
if (_first==__c.False) { 
 //BA.debugLineNum = 98;BA.debugLine="p.LineTo(Left - offset, ItemHeight)";
_p.LineTo((float) (_left-_offset),(float) (_itemheight));
 //BA.debugLineNum = 99;BA.debugLine="p.LineTo(Left, ItemHeight / 2)";
_p.LineTo((float) (_left),(float) (_itemheight/(double)2));
 //BA.debugLineNum = 100;BA.debugLine="p.LineTo(Left - offset, 0)";
_p.LineTo((float) (_left-_offset),(float) (0));
 }else {
 //BA.debugLineNum = 102;BA.debugLine="p.LineTo(Left, ItemHeight)";
_p.LineTo((float) (_left),(float) (_itemheight));
 };
 //BA.debugLineNum = 104;BA.debugLine="p.LineTo(Left, 0)";
_p.LineTo((float) (_left),(float) (0));
 //BA.debugLineNum = 105;BA.debugLine="cvs.DrawPath(p, clr, True, 0)";
_cvs.DrawPath(_p,_clr,__c.True,(float) (0));
 //BA.debugLineNum = 106;BA.debugLine="If strokeColor <> 0 Then";
if (_strokecolor!=0) { 
 //BA.debugLineNum = 107;BA.debugLine="cvs.DrawPath(p, strokeColor, False, 3dip)";
_cvs.DrawPath(_p,_strokecolor,__c.False,(float) (__c.DipToCurrent((int) (3))));
 };
 //BA.debugLineNum = 110;BA.debugLine="cvs.DrawText(Text, Left + ItemWidth / 2, BaseLine";
_cvs.DrawText(_text,_left+_itemwidth/(double)2,_baseline,_fnt,_textcolor,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
 //BA.debugLineNum = 111;BA.debugLine="Return ItemWidth";
if (true) return _itemwidth;
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return 0;
}
public int  _finditem(int _x,int _y) throws Exception{
int _r = 0;
int _i = 0;
 //BA.debugLineNum = 136;BA.debugLine="Private Sub FindItem (x As Int, y As Int) As Int";
 //BA.debugLineNum = 137;BA.debugLine="If RightPositions.Size = 0 Then Return -1";
if (_rightpositions.getSize()==0) { 
if (true) return (int) (-1);};
 //BA.debugLineNum = 138;BA.debugLine="If y < 0 Or y > cvs.TargetRect.Height Then Return";
if (_y<0 || _y>_cvs.getTargetRect().getHeight()) { 
if (true) return (int) (-1);};
 //BA.debugLineNum = 139;BA.debugLine="Dim r As Int = RightPositions.Get(RightPositions.";
_r = (int)(BA.ObjectToNumber(_rightpositions.Get((int) (_rightpositions.getSize()-1))));
 //BA.debugLineNum = 140;BA.debugLine="If x > r Then Return -1";
if (_x>_r) { 
if (true) return (int) (-1);};
 //BA.debugLineNum = 141;BA.debugLine="For i = RightPositions.Size - 2 To 0 Step -1";
{
final int step5 = -1;
final int limit5 = (int) (0);
_i = (int) (_rightpositions.getSize()-2) ;
for (;_i >= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 142;BA.debugLine="Dim r As Int = RightPositions.Get(i)";
_r = (int)(BA.ObjectToNumber(_rightpositions.Get(_i)));
 //BA.debugLineNum = 143;BA.debugLine="If x > r Then Return i + 1";
if (_x>_r) { 
if (true) return (int) (_i+1);};
 }
};
 //BA.debugLineNum = 145;BA.debugLine="Return 0";
if (true) return (int) (0);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _getitems() throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Public Sub getItems As List";
 //BA.debugLineNum = 154;BA.debugLine="Return mItems";
if (true) return _mitems;
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 25;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 26;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 27;BA.debugLine="mItems.Initialize";
_mitems.Initialize();
 //BA.debugLineNum = 28;BA.debugLine="RightPositions.Initialize";
_rightpositions.Initialize();
 //BA.debugLineNum = 29;BA.debugLine="bc.Initialize(1, 1)";
_bc._initialize(ba,(int) (1),(int) (1));
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _setitems(anywheresoftware.b4a.objects.collections.List _i) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Public Sub setItems (i As List)";
 //BA.debugLineNum = 149;BA.debugLine="mItems = i";
_mitems = _i;
 //BA.debugLineNum = 150;BA.debugLine="Draw";
_draw();
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public String  _touch_touch(int _action,float _x,float _y) throws Exception{
int _prev = 0;
int _index = 0;
anywheresoftware.b4a.objects.collections.List _items = null;
int _i = 0;
 //BA.debugLineNum = 114;BA.debugLine="Private Sub Touch_Touch (Action As Int, X As Float";
 //BA.debugLineNum = 115;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,_touchpanel.TOUCH_ACTION_DOWN,_touchpanel.TOUCH_ACTION_MOVE,_touchpanel.TOUCH_ACTION_UP)) {
case 0: 
case 1: {
 //BA.debugLineNum = 117;BA.debugLine="Dim prev As Int = PressedItem";
_prev = _presseditem;
 //BA.debugLineNum = 118;BA.debugLine="PressedItem = FindItem(X, Y)";
_presseditem = _finditem((int) (_x),(int) (_y));
 //BA.debugLineNum = 119;BA.debugLine="If prev <> PressedItem Then Draw";
if (_prev!=_presseditem) { 
_draw();};
 break; }
case 2: {
 //BA.debugLineNum = 121;BA.debugLine="Dim index As Int = FindItem(X, Y)";
_index = _finditem((int) (_x),(int) (_y));
 //BA.debugLineNum = 122;BA.debugLine="If index = PressedItem And index > -1 Then";
if (_index==_presseditem && _index>-1) { 
 //BA.debugLineNum = 123;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 124;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 125;BA.debugLine="For i = 0 To index";
{
final int step11 = 1;
final int limit11 = _index;
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
 //BA.debugLineNum = 126;BA.debugLine="Items.Add(mItems.Get(i))";
_items.Add(_mitems.Get(_i));
 }
};
 //BA.debugLineNum = 128;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFee";
if (_mhaptic) { 
_xuiviewsutils._performhapticfeedback /*String*/ (_mbase);};
 //BA.debugLineNum = 129;BA.debugLine="CallSub2(mCallBack, mEventName & \"_CrumbClick\"";
__c.CallSubNew2(ba,_mcallback,_meventname+"_CrumbClick",(Object)(_items));
 };
 //BA.debugLineNum = 131;BA.debugLine="PressedItem = -1";
_presseditem = (int) (-1);
 //BA.debugLineNum = 132;BA.debugLine="Draw";
_draw();
 break; }
}
;
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
