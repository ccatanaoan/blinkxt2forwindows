
package cloyd.blink;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xbreadcrumb {
    public static RemoteObject myClass;
	public b4xbreadcrumb() {
	}
    public static PCBA staticBA = new PCBA(null, b4xbreadcrumb.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _mitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _rightpositions = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _textcolor = RemoteObject.createImmutable(0);
public static RemoteObject _fnt = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
public static RemoteObject _offset = RemoteObject.createImmutable(0);
public static RemoteObject _bc = RemoteObject.declareNull("b4j.example.bitmapcreator");
public static RemoteObject _crumbcolor = RemoteObject.createImmutable(0);
public static RemoteObject _touchpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _presseditem = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static cloyd.blink.main _main = null;
public static cloyd.blink.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"bc",_ref.getField(false, "_bc"),"CrumbColor",_ref.getField(false, "_crumbcolor"),"cvs",_ref.getField(false, "_cvs"),"DateUtils",_ref.getField(false, "_dateutils"),"fnt",_ref.getField(false, "_fnt"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"mItems",_ref.getField(false, "_mitems"),"offset",_ref.getField(false, "_offset"),"PressedItem",_ref.getField(false, "_presseditem"),"RightPositions",_ref.getField(false, "_rightpositions"),"TextColor",_ref.getField(false, "_textcolor"),"TouchPanel",_ref.getField(false, "_touchpanel"),"xui",_ref.getField(false, "_xui")};
}
}