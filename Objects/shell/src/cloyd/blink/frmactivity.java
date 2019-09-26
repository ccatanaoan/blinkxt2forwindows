
package cloyd.blink;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class frmactivity {
    public static RemoteObject myClass;
	public frmactivity() {
	}
    public static PCBA staticBA = new PCBA(null, frmactivity.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _frm = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _jsonmain = RemoteObject.createImmutable("");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _ivscreenshot = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblfileinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbldeviceinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _clvactivity = RemoteObject.declareNull("b4j.example.customlistview");
public static RemoteObject _authtoken = RemoteObject.createImmutable("");
public static RemoteObject _wvmedia = RemoteObject.declareNull("anywheresoftware.b4j.objects.WebViewWrapper");
public static RemoteObject _lbldate = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbltimestamp = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _previousselectedindex = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static cloyd.blink.main _main = null;
public static cloyd.blink.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"authToken",_ref.getField(false, "_authtoken"),"clvActivity",_ref.getField(false, "_clvactivity"),"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"frm",_ref.getField(false, "_frm"),"fx",_ref.getField(false, "_fx"),"ivScreenshot",_ref.getField(false, "_ivscreenshot"),"jsonMain",_ref.getField(false, "_jsonmain"),"lblDate",_ref.getField(false, "_lbldate"),"lblDeviceInfo",_ref.getField(false, "_lbldeviceinfo"),"lblFileInfo",_ref.getField(false, "_lblfileinfo"),"lblTimestamp",_ref.getField(false, "_lbltimestamp"),"previousSelectedIndex",_ref.getField(false, "_previousselectedindex"),"wvMedia",_ref.getField(false, "_wvmedia"),"xui",_ref.getField(false, "_xui")};
}
}