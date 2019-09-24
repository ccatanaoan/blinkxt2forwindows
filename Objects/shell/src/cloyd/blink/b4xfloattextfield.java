
package cloyd.blink;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xfloattextfield {
    public static RemoteObject myClass;
	public b4xfloattextfield() {
	}
    public static PCBA staticBA = new PCBA(null, b4xfloattextfield.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mtextfield = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _duration = RemoteObject.createImmutable(0);
public static RemoteObject _largelabeltextsize = RemoteObject.createImmutable(0f);
public static RemoteObject _smalllabeltextsize = RemoteObject.createImmutable(0f);
public static RemoteObject _largelabel = RemoteObject.createImmutable(false);
public static RemoteObject _measuringcanvas = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _hintcolor = RemoteObject.createImmutable(0);
public static RemoteObject _nonfocusedhintcolor = RemoteObject.createImmutable(0);
public static RemoteObject _horizontalpadding = RemoteObject.createImmutable(0);
public static RemoteObject _hintimageview = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _hinttext = RemoteObject.createImmutable("");
public static RemoteObject _hintfont = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
public static RemoteObject _largefocused = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
public static RemoteObject _largenotfocused = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
public static RemoteObject _smallfocused = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
public static RemoteObject _smallnotfocused = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
public static RemoteObject _focused = RemoteObject.createImmutable(false);
public static RemoteObject _lblclear = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mprops = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _keyboardtype = RemoteObject.createImmutable("");
public static RemoteObject _multiline = RemoteObject.createImmutable(false);
public static RemoteObject _mnexttextfield = RemoteObject.declareNull("cloyd.blink.b4xfloattextfield");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static cloyd.blink.main _main = null;
public static cloyd.blink.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"Duration",_ref.getField(false, "_duration"),"Focused",_ref.getField(false, "_focused"),"HintColor",_ref.getField(false, "_hintcolor"),"HintFont",_ref.getField(false, "_hintfont"),"HintImageView",_ref.getField(false, "_hintimageview"),"HintText",_ref.getField(false, "_hinttext"),"HorizontalPadding",_ref.getField(false, "_horizontalpadding"),"KeyboardType",_ref.getField(false, "_keyboardtype"),"LargeFocused",_ref.getField(false, "_largefocused"),"LargeLabel",_ref.getField(false, "_largelabel"),"LargeLabelTextSize",_ref.getField(false, "_largelabeltextsize"),"LargeNotFocused",_ref.getField(false, "_largenotfocused"),"lblClear",_ref.getField(false, "_lblclear"),"lblV",_ref.getField(false, "_lblv"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"MeasuringCanvas",_ref.getField(false, "_measuringcanvas"),"mEventName",_ref.getField(false, "_meventname"),"mNextTextField",_ref.getField(false, "_mnexttextfield"),"mProps",_ref.getField(false, "_mprops"),"mTextField",_ref.getField(false, "_mtextfield"),"Multiline",_ref.getField(false, "_multiline"),"NonFocusedHintColor",_ref.getField(false, "_nonfocusedhintcolor"),"SmallFocused",_ref.getField(false, "_smallfocused"),"SmallLabelTextSize",_ref.getField(false, "_smalllabeltextsize"),"SmallNotFocused",_ref.getField(false, "_smallnotfocused"),"Tag",_ref.getField(false, "_tag"),"xui",_ref.getField(false, "_xui")};
}
}