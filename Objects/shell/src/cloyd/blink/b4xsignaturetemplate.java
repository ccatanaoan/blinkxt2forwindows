
package cloyd.blink;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xsignaturetemplate {
    public static RemoteObject myClass;
	public b4xsignaturetemplate() {
	}
    public static PCBA staticBA = new PCBA(null, b4xsignaturetemplate.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _lastx = RemoteObject.createImmutable(0f);
public static RemoteObject _lasty = RemoteObject.createImmutable(0f);
public static RemoteObject _strokewidth = RemoteObject.createImmutable(0f);
public static RemoteObject _strokecolor = RemoteObject.createImmutable(0);
public static RemoteObject _textcolor = RemoteObject.createImmutable(0);
public static RemoteObject _backgroundcolor = RemoteObject.createImmutable(0);
public static RemoteObject _adddateandtime = RemoteObject.createImmutable(false);
public static RemoteObject _textfont = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static cloyd.blink.main _main = null;
public static cloyd.blink.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"AddDateAndTime",_ref.getField(false, "_adddateandtime"),"BackgroundColor",_ref.getField(false, "_backgroundcolor"),"cvs",_ref.getField(false, "_cvs"),"DateUtils",_ref.getField(false, "_dateutils"),"LastX",_ref.getField(false, "_lastx"),"LastY",_ref.getField(false, "_lasty"),"mBase",_ref.getField(false, "_mbase"),"StrokeColor",_ref.getField(false, "_strokecolor"),"StrokeWidth",_ref.getField(false, "_strokewidth"),"TextColor",_ref.getField(false, "_textcolor"),"TextFont",_ref.getField(false, "_textfont"),"xui",_ref.getField(false, "_xui")};
}
}