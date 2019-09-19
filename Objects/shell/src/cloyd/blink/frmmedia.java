
package cloyd.blink;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class frmmedia {
    public static RemoteObject myClass;
	public frmmedia() {
	}
    public static PCBA staticBA = new PCBA(null, frmmedia.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _frm = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _wvmedia = RemoteObject.declareNull("anywheresoftware.b4j.objects.WebViewWrapper");
public static RemoteObject _url = RemoteObject.createImmutable("");
public static RemoteObject _isvideo = RemoteObject.createImmutable(false);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static cloyd.blink.main _main = null;
public static cloyd.blink.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"frm",_ref.getField(false, "_frm"),"fx",_ref.getField(false, "_fx"),"isVideo",_ref.getField(false, "_isvideo"),"url",_ref.getField(false, "_url"),"wvMedia",_ref.getField(false, "_wvmedia")};
}
}