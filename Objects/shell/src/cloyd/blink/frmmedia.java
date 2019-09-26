
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
public static RemoteObject _url = RemoteObject.createImmutable("");
public static RemoteObject _imgscreenshot = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
public static RemoteObject _lbltimestamp = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _timestamp = RemoteObject.createImmutable("");
public static RemoteObject _btnhiddenexitescapekey = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static cloyd.blink.main _main = null;
public static cloyd.blink.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"btnHiddenExitEscapeKey",_ref.getField(false, "_btnhiddenexitescapekey"),"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"frm",_ref.getField(false, "_frm"),"fx",_ref.getField(false, "_fx"),"imgScreenshot",_ref.getField(false, "_imgscreenshot"),"lblTimestamp",_ref.getField(false, "_lbltimestamp"),"timestamp",_ref.getField(false, "_timestamp"),"url",_ref.getField(false, "_url")};
}
}