package cloyd.blink;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4ximageview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("cloyd.blink", "cloyd.blink.b4ximageview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", cloyd.blink.b4ximageview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
public String _mresizemode = "";
public boolean _mround = false;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _mbitmap = null;
public int _mbackgroundcolor = 0;
public int _mcornersradius = 0;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public cloyd.blink.main _main = null;
public cloyd.blink.httputils2service _httputils2service = null;
public cloyd.blink.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 42;BA.debugLine="Update";
_update();
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 8;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Public Tag As Object";
_tag = new Object();
 //BA.debugLineNum = 12;BA.debugLine="Private iv As B4XView";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private mResizeMode As String";
_mresizemode = "";
 //BA.debugLineNum = 14;BA.debugLine="Private mRound As Boolean";
_mround = false;
 //BA.debugLineNum = 15;BA.debugLine="Private mBitmap As B4XBitmap";
_mbitmap = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Public mBackgroundColor As Int";
_mbackgroundcolor = 0;
 //BA.debugLineNum = 17;BA.debugLine="Private mCornersRadius As Int";
_mcornersradius = 0;
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _clear() throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Public Sub Clear";
 //BA.debugLineNum = 121;BA.debugLine="mBitmap = Null";
_mbitmap = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (javafx.scene.image.Image)(__c.Null));
 //BA.debugLineNum = 122;BA.debugLine="iv.SetBitmap(Null)";
_iv.SetBitmap((javafx.scene.image.Image)(__c.Null));
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4j.objects.ImageViewWrapper _iiv = null;
 //BA.debugLineNum = 26;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 27;BA.debugLine="mBase = Base";
_mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 28;BA.debugLine="Tag = mBase.Tag";
_tag = _mbase.getTag();
 //BA.debugLineNum = 29;BA.debugLine="mBase.Tag = Me";
_mbase.setTag(this);
 //BA.debugLineNum = 30;BA.debugLine="Dim iiv As ImageView";
_iiv = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 31;BA.debugLine="iiv.Initialize(\"\")";
_iiv.Initialize(ba,"");
 //BA.debugLineNum = 32;BA.debugLine="iv = iiv";
_iv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iiv.getObject()));
 //BA.debugLineNum = 33;BA.debugLine="mRound =Props.Get(\"Round\")";
_mround = BA.ObjectToBoolean(_props.Get((Object)("Round")));
 //BA.debugLineNum = 34;BA.debugLine="mResizeMode = Props.Get(\"ResizeMode\")";
_mresizemode = BA.ObjectToString(_props.Get((Object)("ResizeMode")));
 //BA.debugLineNum = 35;BA.debugLine="mBackgroundColor = xui.PaintOrColorToColor(Props.";
_mbackgroundcolor = _xui.PaintOrColorToColor(_props.Get((Object)("BackgroundColor")));
 //BA.debugLineNum = 36;BA.debugLine="mCornersRadius = DipToCurrent(Props.GetDefault(\"C";
_mcornersradius = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("CornersRadius"),(Object)(0)))));
 //BA.debugLineNum = 37;BA.debugLine="mBase.AddView(iv, 0, 0, mBase.Width, mBase.Height";
_mbase.AddView((javafx.scene.Node)(_iv.getObject()),0,0,_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 38;BA.debugLine="Update";
_update();
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _getbitmap() throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Public Sub getBitmap As B4XBitmap";
 //BA.debugLineNum = 132;BA.debugLine="Return mBitmap";
if (true) return _mbitmap;
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public int  _getcornersradius() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Public Sub getCornersRadius As Int";
 //BA.debugLineNum = 58;BA.debugLine="Return mCornersRadius";
if (true) return _mcornersradius;
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return 0;
}
public String  _getresizemode() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Public Sub getResizeMode As String";
 //BA.debugLineNum = 69;BA.debugLine="Return mResizeMode";
if (true) return _mresizemode;
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public boolean  _getroundedimage() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Public Sub getRoundedImage As Boolean";
 //BA.debugLineNum = 47;BA.debugLine="Return mRound";
if (true) return _mround;
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 21;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 22;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _load(String _dir,String _filename) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Public Sub Load (Dir As String, FileName As String";
 //BA.debugLineNum = 115;BA.debugLine="setBitmap(xui.LoadBitmap(Dir, FileName))";
_setbitmap(_xui.LoadBitmap(_dir,_filename));
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public String  _setbitmap(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Public Sub setBitmap(Bmp As B4XBitmap)";
 //BA.debugLineNum = 126;BA.debugLine="mBitmap = Bmp";
_mbitmap = _bmp;
 //BA.debugLineNum = 127;BA.debugLine="XUIViewsUtils.SetBitmapAndFill(iv, Bmp)";
_xuiviewsutils._setbitmapandfill /*String*/ (_iv,_bmp);
 //BA.debugLineNum = 128;BA.debugLine="Update";
_update();
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return "";
}
public String  _setcornersradius(int _i) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Public Sub setCornersRadius (i As Int)";
 //BA.debugLineNum = 62;BA.debugLine="mCornersRadius = i";
_mcornersradius = _i;
 //BA.debugLineNum = 63;BA.debugLine="UpdateClip";
_updateclip();
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public String  _setresizemode(String _s) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Public Sub setResizeMode(s As String)";
 //BA.debugLineNum = 73;BA.debugLine="If s = mResizeMode Then Return";
if ((_s).equals(_mresizemode)) { 
if (true) return "";};
 //BA.debugLineNum = 74;BA.debugLine="mResizeMode = s";
_mresizemode = _s;
 //BA.debugLineNum = 75;BA.debugLine="Update";
_update();
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public String  _setroundedimage(boolean _b) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Public Sub setRoundedImage (b As Boolean)";
 //BA.debugLineNum = 51;BA.debugLine="If b = mRound Then Return";
if (_b==_mround) { 
if (true) return "";};
 //BA.debugLineNum = 52;BA.debugLine="mRound = b";
_mround = _b;
 //BA.debugLineNum = 53;BA.debugLine="UpdateClip";
_updateclip();
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public String  _update() throws Exception{
float _imageviewwidth = 0f;
float _imageviewheight = 0f;
float _bmpratio = 0f;
float _r = 0f;
 //BA.debugLineNum = 78;BA.debugLine="Public Sub Update";
 //BA.debugLineNum = 79;BA.debugLine="If mBitmap.IsInitialized = False Then Return";
if (_mbitmap.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 80;BA.debugLine="UpdateClip";
_updateclip();
 //BA.debugLineNum = 81;BA.debugLine="Dim ImageViewWidth, ImageViewHeight As Float";
_imageviewwidth = 0f;
_imageviewheight = 0f;
 //BA.debugLineNum = 82;BA.debugLine="Dim bmpRatio As Float = mBitmap.Width / mBitmap.H";
_bmpratio = (float) (_mbitmap.getWidth()/(double)_mbitmap.getHeight());
 //BA.debugLineNum = 83;BA.debugLine="Select mResizeMode";
switch (BA.switchObjectToInt(_mresizemode,"FILL","FIT","FILL_WIDTH","FILL_HEIGHT","FILL_NO_DISTORTIONS","NONE")) {
case 0: {
 //BA.debugLineNum = 85;BA.debugLine="ImageViewWidth = mBase.Width";
_imageviewwidth = (float) (_mbase.getWidth());
 //BA.debugLineNum = 86;BA.debugLine="ImageViewHeight = mBase.Height";
_imageviewheight = (float) (_mbase.getHeight());
 break; }
case 1: {
 //BA.debugLineNum = 88;BA.debugLine="Dim r As Float = Min(mBase.Width / mBitmap.Widt";
_r = (float) (__c.Min(_mbase.getWidth()/(double)_mbitmap.getWidth(),_mbase.getHeight()/(double)_mbitmap.getHeight()));
 //BA.debugLineNum = 89;BA.debugLine="ImageViewWidth = mBitmap.Width * r";
_imageviewwidth = (float) (_mbitmap.getWidth()*_r);
 //BA.debugLineNum = 90;BA.debugLine="ImageViewHeight = mBitmap.Height * r";
_imageviewheight = (float) (_mbitmap.getHeight()*_r);
 break; }
case 2: {
 //BA.debugLineNum = 92;BA.debugLine="ImageViewWidth = mBase.Width";
_imageviewwidth = (float) (_mbase.getWidth());
 //BA.debugLineNum = 93;BA.debugLine="ImageViewHeight = ImageViewWidth / bmpRatio";
_imageviewheight = (float) (_imageviewwidth/(double)_bmpratio);
 break; }
case 3: {
 //BA.debugLineNum = 95;BA.debugLine="ImageViewHeight = mBase.Height";
_imageviewheight = (float) (_mbase.getHeight());
 //BA.debugLineNum = 96;BA.debugLine="ImageViewWidth = ImageViewHeight * bmpRatio";
_imageviewwidth = (float) (_imageviewheight*_bmpratio);
 break; }
case 4: {
 //BA.debugLineNum = 98;BA.debugLine="Dim r As Float = Max(mBase.Width / mBitmap.Widt";
_r = (float) (__c.Max(_mbase.getWidth()/(double)_mbitmap.getWidth(),_mbase.getHeight()/(double)_mbitmap.getHeight()));
 //BA.debugLineNum = 99;BA.debugLine="ImageViewWidth = mBitmap.Width * r";
_imageviewwidth = (float) (_mbitmap.getWidth()*_r);
 //BA.debugLineNum = 100;BA.debugLine="ImageViewHeight = mBitmap.Height * r";
_imageviewheight = (float) (_mbitmap.getHeight()*_r);
 break; }
case 5: {
 //BA.debugLineNum = 102;BA.debugLine="ImageViewWidth = mBitmap.Width";
_imageviewwidth = (float) (_mbitmap.getWidth());
 //BA.debugLineNum = 103;BA.debugLine="ImageViewHeight = mBitmap.Height";
_imageviewheight = (float) (_mbitmap.getHeight());
 break; }
default: {
 //BA.debugLineNum = 105;BA.debugLine="Log(\"Invalid resize mode: \"  & mResizeMode)";
__c.Log("Invalid resize mode: "+_mresizemode);
 break; }
}
;
 //BA.debugLineNum = 107;BA.debugLine="iv.SetLayoutAnimated(0, Round(mBase.Width / 2 - I";
_iv.SetLayoutAnimated((int) (0),__c.Round(_mbase.getWidth()/(double)2-_imageviewwidth/(double)2),__c.Round(_mbase.getHeight()/(double)2-_imageviewheight/(double)2),__c.Round(_imageviewwidth),__c.Round(_imageviewheight));
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _updateclip() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _shape = null;
double _radius = 0;
double _cx = 0;
double _cy = 0;
double _d = 0;
 //BA.debugLineNum = 136;BA.debugLine="Private Sub UpdateClip";
 //BA.debugLineNum = 137;BA.debugLine="If mRound Then";
if (_mround) { 
 //BA.debugLineNum = 138;BA.debugLine="mBase.SetColorAndBorder(mBackgroundColor, 0, 0,";
_mbase.SetColorAndBorder(_mbackgroundcolor,0,(int) (0),__c.Min(_mbase.getWidth()/(double)2,_mbase.getHeight()/(double)2));
 }else {
 //BA.debugLineNum = 140;BA.debugLine="mBase.SetColorAndBorder(mBackgroundColor, 0, 0,";
_mbase.SetColorAndBorder(_mbackgroundcolor,0,(int) (0),_mcornersradius);
 };
 //BA.debugLineNum = 143;BA.debugLine="Dim jo As JavaObject = mBase";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_mbase.getObject()));
 //BA.debugLineNum = 144;BA.debugLine="Dim shape As JavaObject";
_shape = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 145;BA.debugLine="If mRound Then";
if (_mround) { 
 //BA.debugLineNum = 146;BA.debugLine="Dim radius As Double = Min(mBase.Width / 2, mBas";
_radius = __c.Min(_mbase.getWidth()/(double)2,_mbase.getHeight()/(double)2);
 //BA.debugLineNum = 147;BA.debugLine="Dim cx As Double = mBase.Width / 2";
_cx = _mbase.getWidth()/(double)2;
 //BA.debugLineNum = 148;BA.debugLine="Dim cy As Double = mBase.Height / 2";
_cy = _mbase.getHeight()/(double)2;
 //BA.debugLineNum = 149;BA.debugLine="shape.InitializeNewInstance(\"javafx.scene.shape.";
_shape.InitializeNewInstance("javafx.scene.shape.Circle",new Object[]{(Object)(_cx),(Object)(_cy),(Object)(_radius)});
 }else {
 //BA.debugLineNum = 151;BA.debugLine="Dim cx As Double = mBase.Width";
_cx = _mbase.getWidth();
 //BA.debugLineNum = 152;BA.debugLine="Dim cy As Double = mBase.Height";
_cy = _mbase.getHeight();
 //BA.debugLineNum = 153;BA.debugLine="shape.InitializeNewInstance(\"javafx.scene.shape.";
_shape.InitializeNewInstance("javafx.scene.shape.Rectangle",new Object[]{(Object)(_cx),(Object)(_cy)});
 //BA.debugLineNum = 154;BA.debugLine="If mCornersRadius > 0 Then";
if (_mcornersradius>0) { 
 //BA.debugLineNum = 155;BA.debugLine="Dim d As Double = mCornersRadius";
_d = _mcornersradius;
 //BA.debugLineNum = 156;BA.debugLine="shape.RunMethod(\"setArcHeight\", Array(d))";
_shape.RunMethod("setArcHeight",new Object[]{(Object)(_d)});
 //BA.debugLineNum = 157;BA.debugLine="shape.RunMethod(\"setArcWidth\", Array(d))";
_shape.RunMethod("setArcWidth",new Object[]{(Object)(_d)});
 };
 };
 //BA.debugLineNum = 160;BA.debugLine="jo.RunMethod(\"setClip\", Array(shape))";
_jo.RunMethod("setClip",new Object[]{(Object)(_shape.getObject())});
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
