
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
public static RemoteObject _clvactivity = RemoteObject.declareNull("b4j.example.customlistview");
public static RemoteObject _jsonmain = RemoteObject.createImmutable("");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _ivscreenshot = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblfileinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lbldeviceinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _screenshotbitmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
public static RemoteObject _lv = RemoteObject.declareNull("anywheresoftware.b4j.objects.ListViewWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static cloyd.blink.main _main = null;
public static cloyd.blink.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"clvActivity",_ref.getField(false, "_clvactivity"),"DateUtils",_ref.getField(false, "_dateutils"),"frm",_ref.getField(false, "_frm"),"fx",_ref.getField(false, "_fx"),"ivScreenshot",_ref.getField(false, "_ivscreenshot"),"jsonMain",_ref.getField(false, "_jsonmain"),"lblDeviceInfo",_ref.getField(false, "_lbldeviceinfo"),"lblFileInfo",_ref.getField(false, "_lblfileinfo"),"lv",_ref.getField(false, "_lv"),"screenshotBitmap",_ref.getField(false, "_screenshotbitmap"),"xui",_ref.getField(false, "_xui")};
}
}