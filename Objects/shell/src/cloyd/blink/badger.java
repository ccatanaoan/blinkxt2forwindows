
package cloyd.blink;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class badger {
    public static RemoteObject myClass;
	public badger() {
	}
    public static PCBA staticBA = new PCBA(null, badger.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _views = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _stub = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _radius = RemoteObject.createImmutable(0);
public static RemoteObject _animationduration = RemoteObject.createImmutable(0);
public static RemoteObject _cx = RemoteObject.createImmutable(0f);
public static RemoteObject _cy = RemoteObject.createImmutable(0f);
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _color = RemoteObject.createImmutable(0);
public static RemoteObject _textcolor = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static cloyd.blink.main _main = null;
public static cloyd.blink.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"animationDuration",_ref.getField(false, "_animationduration"),"color",_ref.getField(false, "_color"),"CSSUtils",_ref.getField(false, "_cssutils"),"cx",_ref.getField(false, "_cx"),"cy",_ref.getField(false, "_cy"),"DateUtils",_ref.getField(false, "_dateutils"),"radius",_ref.getField(false, "_radius"),"stub",_ref.getField(false, "_stub"),"textColor",_ref.getField(false, "_textcolor"),"views",_ref.getField(false, "_views"),"xui",_ref.getField(false, "_xui")};
}
}