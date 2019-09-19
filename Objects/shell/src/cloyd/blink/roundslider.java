
package cloyd.blink;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class roundslider {
    public static RemoteObject myClass;
	public roundslider() {
	}
    public static PCBA staticBA = new PCBA(null, roundslider.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _mvalue = RemoteObject.createImmutable(0);
public static RemoteObject _mmin = RemoteObject.createImmutable(0);
public static RemoteObject _mmax = RemoteObject.createImmutable(0);
public static RemoteObject _thumb = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
public static RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _circlerect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
public static RemoteObject _valuecolor = RemoteObject.createImmutable(0);
public static RemoteObject _stroke = RemoteObject.createImmutable(0);
public static RemoteObject _thumbsize = RemoteObject.createImmutable(0);
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static cloyd.blink.main _main = null;
public static cloyd.blink.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CircleRect",_ref.getField(false, "_circlerect"),"cvs",_ref.getField(false, "_cvs"),"DateUtils",_ref.getField(false, "_dateutils"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"mMax",_ref.getField(false, "_mmax"),"mMin",_ref.getField(false, "_mmin"),"mValue",_ref.getField(false, "_mvalue"),"pnl",_ref.getField(false, "_pnl"),"stroke",_ref.getField(false, "_stroke"),"Tag",_ref.getField(false, "_tag"),"thumb",_ref.getField(false, "_thumb"),"ThumbSize",_ref.getField(false, "_thumbsize"),"ValueColor",_ref.getField(false, "_valuecolor"),"xlbl",_ref.getField(false, "_xlbl"),"xui",_ref.getField(false, "_xui")};
}
}