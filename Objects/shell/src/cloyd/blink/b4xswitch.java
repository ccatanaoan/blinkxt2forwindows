
package cloyd.blink;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xswitch {
    public static RemoteObject myClass;
	public b4xswitch() {
	}
    public static PCBA staticBA = new PCBA(null, b4xswitch.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _oncolor = RemoteObject.declareNull("b4j.example.bcpath._bcbrush");
public static RemoteObject _offcolor = RemoteObject.declareNull("b4j.example.bcpath._bcbrush");
public static RemoteObject _bc = RemoteObject.declareNull("b4j.example.bitmapcreator");
public static RemoteObject _width = RemoteObject.createImmutable(0);
public static RemoteObject _height = RemoteObject.createImmutable(0);
public static RemoteObject _thumbcolor = RemoteObject.declareNull("b4j.example.bcpath._bcbrush");
public static RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
public static RemoteObject _mvalue = RemoteObject.createImmutable(false);
public static RemoteObject _transparent = RemoteObject.declareNull("b4j.example.bcpath._bcbrush");
public static RemoteObject _loopindex = RemoteObject.createImmutable(0);
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _scale = RemoteObject.createImmutable(0f);
public static RemoteObject _menabled = RemoteObject.createImmutable(false);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static cloyd.blink.main _main = null;
public static cloyd.blink.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"bc",_ref.getField(false, "_bc"),"DateUtils",_ref.getField(false, "_dateutils"),"Height",_ref.getField(false, "_height"),"iv",_ref.getField(false, "_iv"),"LoopIndex",_ref.getField(false, "_loopindex"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEnabled",_ref.getField(false, "_menabled"),"mEventName",_ref.getField(false, "_meventname"),"mValue",_ref.getField(false, "_mvalue"),"OffColor",_ref.getField(false, "_offcolor"),"OnColor",_ref.getField(false, "_oncolor"),"Scale",_ref.getField(false, "_scale"),"Tag",_ref.getField(false, "_tag"),"ThumbColor",_ref.getField(false, "_thumbcolor"),"transparent",_ref.getField(false, "_transparent"),"Width",_ref.getField(false, "_width"),"xui",_ref.getField(false, "_xui")};
}
}