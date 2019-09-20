
package cloyd.blink;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4jtextflow {
    public static RemoteObject myClass;
	public b4jtextflow() {
	}
    public static PCBA staticBA = new PCBA(null, b4jtextflow.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _texts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lastitem = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static cloyd.blink.main _main = null;
public static cloyd.blink.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"fx",_ref.getField(false, "_fx"),"lastItem",_ref.getField(false, "_lastitem"),"texts",_ref.getField(false, "_texts")};
}
}