
package cloyd.blink;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new main();
		remoteMe = RemoteObject.declareNull("cloyd.blink.main");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "cloyd.blink.main");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, main.class);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
    public static RemoteObject getObject() {
		return myClass;
	 }
	public PCBA create(Object[] args) throws ClassNotFoundException{
		ba = (RemoteObject) args[1];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _mainform = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _emailaddress = RemoteObject.createImmutable("");
public static RemoteObject _password = RemoteObject.createImmutable("");
public static RemoteObject _authtoken = RemoteObject.createImmutable("");
public static RemoteObject _userregion = RemoteObject.createImmutable("");
public static RemoteObject _accountid = RemoteObject.createImmutable("");
public static RemoteObject _networkid = RemoteObject.createImmutable("");
public static RemoteObject _twoclientfaverificationrequired = RemoteObject.createImmutable("");
public static RemoteObject _twofaclientid = RemoteObject.createImmutable("");
public static RemoteObject _commandid = RemoteObject.createImmutable("");
public static RemoteObject _commandcomplete = RemoteObject.createImmutable(false);
public static RemoteObject _camerathumbnail = RemoteObject.createImmutable("");
public static RemoteObject _lbtitle = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _xmouse = RemoteObject.createImmutable(0);
public static RemoteObject _ymouse = RemoteObject.createImmutable(0);
public static RemoteObject _ismaximized = RemoteObject.createImmutable(false);
public static RemoteObject _ivclose = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
public static RemoteObject _ivmax = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
public static RemoteObject _ivmin = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
public static RemoteObject _atualskin = RemoteObject.createImmutable("");
public static RemoteObject _imginit = RemoteObject.createImmutable("");
public static RemoteObject _f_x = RemoteObject.createImmutable(0);
public static RemoteObject _f_y = RemoteObject.createImmutable(0);
public static RemoteObject _f_w = RemoteObject.createImmutable(0);
public static RemoteObject _f_h = RemoteObject.createImmutable(0);
public static RemoteObject _btndriveway = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _response = RemoteObject.createImmutable("");
public static RemoteObject _ivdriveway = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
public static RemoteObject _lblstatus = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _ivfrontdoor = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
public static RemoteObject _ivsideyard = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
public static RemoteObject _lbldriveway = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lblfrontdoor = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lblsideyard = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _clvdriveway = RemoteObject.declareNull("b4j.example.customlistview");
public static RemoteObject _clvfrontdoor = RemoteObject.declareNull("b4j.example.customlistview");
public static RemoteObject _clvsideyard = RemoteObject.declareNull("b4j.example.customlistview");
public static RemoteObject _lblsyncmodule = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _btnactivity = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btnrefresh = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _prevdrivewayupdatetime = RemoteObject.createImmutable("");
public static RemoteObject _prevfrontdoorupdatetime = RemoteObject.createImmutable("");
public static RemoteObject _ivsyncmodule = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
public static RemoteObject _ivsyncmodulewifi = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper");
public static RemoteObject _drivewayarmedstatus = RemoteObject.createImmutable("");
public static RemoteObject _frontdoorarmedstatus = RemoteObject.createImmutable("");
public static RemoteObject _sideyardarmedstatus = RemoteObject.createImmutable("");
public static RemoteObject _btndrivewaynewclip = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btnfrontdoornewclip = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btnsideyardnewclip = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _badger1 = RemoteObject.declareNull("cloyd.blink.badger");
public static RemoteObject _prevcamerathumbnail = RemoteObject.createImmutable("");
public static RemoteObject _kvs = RemoteObject.declareNull("cloyd.blink.keyvaluestore");
public static RemoteObject _btndrivewayrefresh = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btnfrontdoorrefresh = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btnsideyardrefresh = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _swarmed = RemoteObject.declareNull("cloyd.blink.b4xswitch");
public static RemoteObject _dialog = RemoteObject.declareNull("cloyd.blink.b4xdialog");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static cloyd.blink.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"accountID",main._accountid,"AtualSkin",main._atualskin,"authToken",main._authtoken,"badger1",main._badger1,"btnActivity",main._btnactivity,"btnDriveway",main._btndriveway,"btnDrivewayNewClip",main._btndrivewaynewclip,"btnDrivewayRefresh",main._btndrivewayrefresh,"btnFrontDoorNewClip",main._btnfrontdoornewclip,"btnFrontDoorRefresh",main._btnfrontdoorrefresh,"btnRefresh",main._btnrefresh,"btnSideYardNewClip",main._btnsideyardnewclip,"btnSideYardRefresh",main._btnsideyardrefresh,"cameraThumbnail",main._camerathumbnail,"clvDriveway",main._clvdriveway,"clvFrontDoor",main._clvfrontdoor,"clvSideYard",main._clvsideyard,"commandComplete",main._commandcomplete,"commandID",main._commandid,"CSSUtils",main._cssutils,"DateUtils",main._dateutils,"dialog",main._dialog,"drivewayArmedStatus",main._drivewayarmedstatus,"emailAddress",main._emailaddress,"f_H",main._f_h,"f_W",main._f_w,"f_X",main._f_x,"f_Y",main._f_y,"frontdoorArmedStatus",main._frontdoorarmedstatus,"fx",main._fx,"HttpUtils2Service",Debug.moduleToString(cloyd.blink.httputils2service.class),"imgInit",main._imginit,"isMaximized",main._ismaximized,"ivClose",main._ivclose,"ivDriveway",main._ivdriveway,"ivFrontDoor",main._ivfrontdoor,"ivMax",main._ivmax,"ivMin",main._ivmin,"ivSideYard",main._ivsideyard,"ivSyncModule",main._ivsyncmodule,"ivSyncModuleWiFi",main._ivsyncmodulewifi,"kvs",main._kvs,"lblDriveway",main._lbldriveway,"lblFrontDoor",main._lblfrontdoor,"lblSideYard",main._lblsideyard,"lblStatus",main._lblstatus,"lblSyncModule",main._lblsyncmodule,"lbTitle",main._lbtitle,"MainForm",main._mainform,"networkID",main._networkid,"password",main._password,"prevCameraThumbnail",main._prevcamerathumbnail,"prevDrivewayUpdateTime",main._prevdrivewayupdatetime,"prevFrontDoorUpdateTime",main._prevfrontdoorupdatetime,"response",main._response,"sideyardArmedStatus",main._sideyardarmedstatus,"swArmed",main._swarmed,"TwoClientFAVerificationRequired",main._twoclientfaverificationrequired,"TwoFAClientID",main._twofaclientid,"userRegion",main._userregion,"xMouse",main._xmouse,"xui",main._xui,"yMouse",main._ymouse};
}
}