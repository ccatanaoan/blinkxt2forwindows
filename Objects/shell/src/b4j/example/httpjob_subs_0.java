package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class httpjob_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public JobName As String";
httpjob._jobname = RemoteObject.createImmutable("");__ref.setField("_jobname",httpjob._jobname);
 //BA.debugLineNum = 4;BA.debugLine="Public Success As Boolean";
httpjob._success = RemoteObject.createImmutable(false);__ref.setField("_success",httpjob._success);
 //BA.debugLineNum = 5;BA.debugLine="Public Username, Password As String";
httpjob._username = RemoteObject.createImmutable("");__ref.setField("_username",httpjob._username);
httpjob._password = RemoteObject.createImmutable("");__ref.setField("_password",httpjob._password);
 //BA.debugLineNum = 6;BA.debugLine="Public ErrorMessage As String";
httpjob._errormessage = RemoteObject.createImmutable("");__ref.setField("_errormessage",httpjob._errormessage);
 //BA.debugLineNum = 7;BA.debugLine="Private target As Object";
httpjob._target = RemoteObject.createNew ("Object");__ref.setField("_target",httpjob._target);
 //BA.debugLineNum = 9;BA.debugLine="Private taskId As String";
httpjob._taskid = RemoteObject.createImmutable("");__ref.setField("_taskid",httpjob._taskid);
 //BA.debugLineNum = 10;BA.debugLine="Private req As OkHttpRequest";
httpjob._req = RemoteObject.createNew ("anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest");__ref.setField("_req",httpjob._req);
 //BA.debugLineNum = 11;BA.debugLine="Public Response As OkHttpResponse";
httpjob._response = RemoteObject.createNew ("anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse");__ref.setField("_response",httpjob._response);
 //BA.debugLineNum = 16;BA.debugLine="Public Tag As Object";
httpjob._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",httpjob._tag);
 //BA.debugLineNum = 17;BA.debugLine="Type MultipartFileData (Dir As String, FileName A";
;
 //BA.debugLineNum = 19;BA.debugLine="Private fx As JFX";
httpjob._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",httpjob._fx);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _complete(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Complete (httpjob) ","httpjob",2,__ref.getField(false, "ba"),__ref,239);
if (RapidSub.canDelegate("complete")) { return __ref.runUserSub(false, "httpjob","complete", __ref, _id);}
Debug.locals.put("id", _id);
 BA.debugLineNum = 239;BA.debugLine="Public Sub Complete (id As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 240;BA.debugLine="taskId = id";
Debug.JustUpdateDeviceLine();
__ref.setField ("_taskid" /*RemoteObject*/ ,BA.NumberToString(_id));
 BA.debugLineNum = 241;BA.debugLine="CallSubDelayed2(target, \"JobDone\", Me)";
Debug.JustUpdateDeviceLine();
httpjob.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )),(Object)(BA.ObjectToString("JobDone")),(Object)(__ref));
 BA.debugLineNum = 242;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _delete(RemoteObject __ref,RemoteObject _link) throws Exception{
try {
		Debug.PushSubsStack("Delete (httpjob) ","httpjob",2,__ref.getField(false, "ba"),__ref,197);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "httpjob","delete", __ref, _link);}
Debug.locals.put("Link", _link);
 BA.debugLineNum = 197;BA.debugLine="Public Sub Delete(Link As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 198;BA.debugLine="req.InitializeDelete(Link)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_req" /*RemoteObject*/ ).runVoidMethod ("InitializeDelete",(Object)(_link));
 BA.debugLineNum = 199;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
Debug.JustUpdateDeviceLine();
httpjob.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((httpjob._httputils2service.getObject())),(Object)(BA.ObjectToString("SubmitJob")),(Object)(__ref));
 BA.debugLineNum = 200;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _delete2(RemoteObject __ref,RemoteObject _link,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("Delete2 (httpjob) ","httpjob",2,__ref.getField(false, "ba"),__ref,202);
if (RapidSub.canDelegate("delete2")) { return __ref.runUserSub(false, "httpjob","delete2", __ref, _link, _parameters);}
Debug.locals.put("Link", _link);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 202;BA.debugLine="Public Sub Delete2(Link As String, Parameters() As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 203;BA.debugLine="req.InitializeDelete(escapeLink(Link, Parameters)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_req" /*RemoteObject*/ ).runVoidMethod ("InitializeDelete",(Object)(__ref.runClassMethod (b4j.example.httpjob.class, "_escapelink" /*RemoteObject*/ ,(Object)(_link),(Object)(_parameters))));
 BA.debugLineNum = 204;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
Debug.JustUpdateDeviceLine();
httpjob.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((httpjob._httputils2service.getObject())),(Object)(BA.ObjectToString("SubmitJob")),(Object)(__ref));
 BA.debugLineNum = 205;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _download(RemoteObject __ref,RemoteObject _link) throws Exception{
try {
		Debug.PushSubsStack("Download (httpjob) ","httpjob",2,__ref.getField(false, "ba"),__ref,167);
if (RapidSub.canDelegate("download")) { return __ref.runUserSub(false, "httpjob","download", __ref, _link);}
Debug.locals.put("Link", _link);
 BA.debugLineNum = 167;BA.debugLine="Public Sub Download(Link As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 168;BA.debugLine="req.InitializeGet(Link)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_req" /*RemoteObject*/ ).runVoidMethod ("InitializeGet",(Object)(_link));
 BA.debugLineNum = 169;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
Debug.JustUpdateDeviceLine();
httpjob.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((httpjob._httputils2service.getObject())),(Object)(BA.ObjectToString("SubmitJob")),(Object)(__ref));
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _download2(RemoteObject __ref,RemoteObject _link,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("Download2 (httpjob) ","httpjob",2,__ref.getField(false, "ba"),__ref,177);
if (RapidSub.canDelegate("download2")) { return __ref.runUserSub(false, "httpjob","download2", __ref, _link, _parameters);}
Debug.locals.put("Link", _link);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 177;BA.debugLine="Public Sub Download2(Link As String, Parameters()";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 178;BA.debugLine="req.InitializeGet(escapeLink(Link, Parameters))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_req" /*RemoteObject*/ ).runVoidMethod ("InitializeGet",(Object)(__ref.runClassMethod (b4j.example.httpjob.class, "_escapelink" /*RemoteObject*/ ,(Object)(_link),(Object)(_parameters))));
 BA.debugLineNum = 179;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
Debug.JustUpdateDeviceLine();
httpjob.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((httpjob._httputils2service.getObject())),(Object)(BA.ObjectToString("SubmitJob")),(Object)(__ref));
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _escapelink(RemoteObject __ref,RemoteObject _link,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("escapeLink (httpjob) ","httpjob",2,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("escapelink")) { return __ref.runUserSub(false, "httpjob","escapelink", __ref, _link, _parameters);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
int _i = 0;
Debug.locals.put("Link", _link);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 182;BA.debugLine="Private Sub escapeLink(Link As String, Parameters(";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 183;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 184;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 185;BA.debugLine="sb.Append(Link)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_link));
 BA.debugLineNum = 186;BA.debugLine="If Parameters.Length > 0 Then sb.Append(\"?\")";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_parameters.getField(true,"length"),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("?")));};
 BA.debugLineNum = 187;BA.debugLine="Dim su As StringUtils";
Debug.JustUpdateDeviceLine();
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 188;BA.debugLine="For i = 0 To Parameters.Length - 1 Step 2";
Debug.JustUpdateDeviceLine();
{
final int step6 = 2;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_parameters.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 189;BA.debugLine="If i > 0 Then sb.Append(\"&\")";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("&")));};
 BA.debugLineNum = 190;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i), \"UTF8\")).A";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(_su.runMethod(true,"EncodeUrl",(Object)(_parameters.getArrayElement(true,BA.numberCast(int.class, _i))),(Object)(RemoteObject.createImmutable("UTF8"))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("=")));
 BA.debugLineNum = 191;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i + 1), \"UTF8\"";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_su.runMethod(true,"EncodeUrl",(Object)(_parameters.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))),(Object)(RemoteObject.createImmutable("UTF8")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 193;BA.debugLine="Return sb.ToString";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbitmap(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBitmap (httpjob) ","httpjob",2,__ref.getField(false, "ba"),__ref,246);
if (RapidSub.canDelegate("getbitmap")) { return __ref.runUserSub(false, "httpjob","getbitmap", __ref);}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
 BA.debugLineNum = 246;BA.debugLine="Public Sub GetBitmap As Image";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 247;BA.debugLine="Dim b As Image";
Debug.JustUpdateDeviceLine();
_b = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 248;BA.debugLine="b = fx.LoadImage(HttpUtils2Service.TempFolder, ta";
Debug.JustUpdateDeviceLine();
_b = __ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"LoadImage",(Object)(httpjob._httputils2service._tempfolder /*RemoteObject*/ ),(Object)(__ref.getField(true,"_taskid" /*RemoteObject*/ )));Debug.locals.put("b", _b);
 BA.debugLineNum = 249;BA.debugLine="Return b";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _b;
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getinputstream(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetInputStream (httpjob) ","httpjob",2,__ref.getField(false, "ba"),__ref,271);
if (RapidSub.canDelegate("getinputstream")) { return __ref.runUserSub(false, "httpjob","getinputstream", __ref);}
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
 BA.debugLineNum = 271;BA.debugLine="Public Sub GetInputStream As InputStream";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 272;BA.debugLine="Dim In As InputStream";
Debug.JustUpdateDeviceLine();
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("In", _in);
 BA.debugLineNum = 273;BA.debugLine="In = File.OpenInput(HttpUtils2Service.TempFolder,";
Debug.JustUpdateDeviceLine();
_in = httpjob.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(httpjob._httputils2service._tempfolder /*RemoteObject*/ ),(Object)(__ref.getField(true,"_taskid" /*RemoteObject*/ )));Debug.locals.put("In", _in);
 BA.debugLineNum = 274;BA.debugLine="Return In";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _in;
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrequest(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetRequest (httpjob) ","httpjob",2,__ref.getField(false, "ba"),__ref,234);
if (RapidSub.canDelegate("getrequest")) { return __ref.runUserSub(false, "httpjob","getrequest", __ref);}
 BA.debugLineNum = 234;BA.debugLine="Public Sub GetRequest As OkHttpRequest";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 235;BA.debugLine="Return req";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return __ref.getField(false,"_req" /*RemoteObject*/ );
 BA.debugLineNum = 236;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetString (httpjob) ","httpjob",2,__ref.getField(false, "ba"),__ref,215);
if (RapidSub.canDelegate("getstring")) { return __ref.runUserSub(false, "httpjob","getstring", __ref);}
 BA.debugLineNum = 215;BA.debugLine="Public Sub GetString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 216;BA.debugLine="Return GetString2(\"UTF8\")";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return __ref.runClassMethod (b4j.example.httpjob.class, "_getstring2" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("UTF8")));
 BA.debugLineNum = 217;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstring2(RemoteObject __ref,RemoteObject _encoding) throws Exception{
try {
		Debug.PushSubsStack("GetString2 (httpjob) ","httpjob",2,__ref.getField(false, "ba"),__ref,220);
if (RapidSub.canDelegate("getstring2")) { return __ref.runUserSub(false, "httpjob","getstring2", __ref, _encoding);}
RemoteObject _tr = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.TextReaderWrapper");
RemoteObject _res = RemoteObject.createImmutable("");
Debug.locals.put("Encoding", _encoding);
 BA.debugLineNum = 220;BA.debugLine="Public Sub GetString2(Encoding As String) As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 224;BA.debugLine="Dim tr As TextReader";
Debug.JustUpdateDeviceLine();
_tr = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.TextReaderWrapper");Debug.locals.put("tr", _tr);
 BA.debugLineNum = 225;BA.debugLine="tr.Initialize2(File.OpenInput(HttpUtils2Service.T";
Debug.JustUpdateDeviceLine();
_tr.runVoidMethod ("Initialize2",(Object)((httpjob.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(httpjob._httputils2service._tempfolder /*RemoteObject*/ ),(Object)(__ref.getField(true,"_taskid" /*RemoteObject*/ ))).getObject())),(Object)(_encoding));
 BA.debugLineNum = 226;BA.debugLine="Dim res As String = tr.ReadAll";
Debug.JustUpdateDeviceLine();
_res = _tr.runMethod(true,"ReadAll");Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 227;BA.debugLine="tr.Close";
Debug.JustUpdateDeviceLine();
_tr.runVoidMethod ("Close");
 BA.debugLineNum = 228;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _res;
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _head(RemoteObject __ref,RemoteObject _link) throws Exception{
try {
		Debug.PushSubsStack("Head (httpjob) ","httpjob",2,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("head")) { return __ref.runUserSub(false, "httpjob","head", __ref, _link);}
Debug.locals.put("Link", _link);
 BA.debugLineNum = 74;BA.debugLine="Public Sub Head(Link As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 75;BA.debugLine="req.InitializeHead(Link)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_req" /*RemoteObject*/ ).runVoidMethod ("InitializeHead",(Object)(_link));
 BA.debugLineNum = 76;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
Debug.JustUpdateDeviceLine();
httpjob.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((httpjob._httputils2service.getObject())),(Object)(BA.ObjectToString("SubmitJob")),(Object)(__ref));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _name,RemoteObject _targetmodule) throws Exception{
try {
		Debug.PushSubsStack("Initialize (httpjob) ","httpjob",2,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "httpjob","initialize", __ref, _ba, _name, _targetmodule);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Name", _name);
Debug.locals.put("TargetModule", _targetmodule);
 BA.debugLineNum = 26;BA.debugLine="Public Sub Initialize (Name As String, TargetModul";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 27;BA.debugLine="JobName = Name";
Debug.JustUpdateDeviceLine();
__ref.setField ("_jobname" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 28;BA.debugLine="target = TargetModule";
Debug.JustUpdateDeviceLine();
__ref.setField ("_target" /*RemoteObject*/ ,_targetmodule);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _multipartstartsection(RemoteObject __ref,RemoteObject _stream,RemoteObject _empty) throws Exception{
try {
		Debug.PushSubsStack("MultipartStartSection (httpjob) ","httpjob",2,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("multipartstartsection")) { return __ref.runUserSub(false, "httpjob","multipartstartsection", __ref, _stream, _empty);}
Debug.locals.put("stream", _stream);
Debug.locals.put("empty", _empty);
 BA.debugLineNum = 128;BA.debugLine="Private Sub MultipartStartSection (stream As Outpu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 129;BA.debugLine="If empty = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_empty,httpjob.__c.getField(true,"False"))) { 
 BA.debugLineNum = 130;BA.debugLine="stream.WriteBytes(Array As Byte(13, 10), 0, 2)";
Debug.JustUpdateDeviceLine();
_stream.runVoidMethod ("WriteBytes",(Object)(RemoteObject.createNewArray("byte",new int[] {2},new Object[] {BA.numberCast(byte.class, 13),BA.numberCast(byte.class, 10)})),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)));
 }else {
 BA.debugLineNum = 132;BA.debugLine="empty = False";
Debug.JustUpdateDeviceLine();
_empty = httpjob.__c.getField(true,"False");Debug.locals.put("empty", _empty);
 };
 BA.debugLineNum = 134;BA.debugLine="Return empty";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _empty;
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _patchbytes(RemoteObject __ref,RemoteObject _link,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("PatchBytes (httpjob) ","httpjob",2,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("patchbytes")) { return __ref.runUserSub(false, "httpjob","patchbytes", __ref, _link, _data);}
Debug.locals.put("Link", _link);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 58;BA.debugLine="Public Sub PatchBytes(Link As String, Data() As By";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 66;BA.debugLine="req.InitializePatch2(Link, Data)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_req" /*RemoteObject*/ ).runVoidMethod ("InitializePatch2",(Object)(_link),(Object)(_data));
 BA.debugLineNum = 69;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
Debug.JustUpdateDeviceLine();
httpjob.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((httpjob._httputils2service.getObject())),(Object)(BA.ObjectToString("SubmitJob")),(Object)(__ref));
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _patchstring(RemoteObject __ref,RemoteObject _link,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("PatchString (httpjob) ","httpjob",2,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("patchstring")) { return __ref.runUserSub(false, "httpjob","patchstring", __ref, _link, _text);}
Debug.locals.put("Link", _link);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 53;BA.debugLine="Public Sub PatchString(Link As String, Text As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 54;BA.debugLine="PatchBytes(Link, Text.GetBytes(\"UTF8\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.httpjob.class, "_patchbytes" /*RemoteObject*/ ,(Object)(_link),(Object)(_text.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _postbytes(RemoteObject __ref,RemoteObject _link,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("PostBytes (httpjob) ","httpjob",2,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("postbytes")) { return __ref.runUserSub(false, "httpjob","postbytes", __ref, _link, _data);}
Debug.locals.put("Link", _link);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 36;BA.debugLine="Public Sub PostBytes(Link As String, Data() As Byt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 37;BA.debugLine="req.InitializePost2(Link, Data)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_req" /*RemoteObject*/ ).runVoidMethod ("InitializePost2",(Object)(_link),(Object)(_data));
 BA.debugLineNum = 38;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
Debug.JustUpdateDeviceLine();
httpjob.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((httpjob._httputils2service.getObject())),(Object)(BA.ObjectToString("SubmitJob")),(Object)(__ref));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _postfile(RemoteObject __ref,RemoteObject _link,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("PostFile (httpjob) ","httpjob",2,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("postfile")) { return __ref.runUserSub(false, "httpjob","postfile", __ref, _link, _dir, _filename);}
RemoteObject _length = RemoteObject.createImmutable(0);
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("Link", _link);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 139;BA.debugLine="Public Sub PostFile(Link As String, Dir As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 144;BA.debugLine="Dim length As Int";
Debug.JustUpdateDeviceLine();
_length = RemoteObject.createImmutable(0);Debug.locals.put("length", _length);
 BA.debugLineNum = 145;BA.debugLine="If Dir = File.DirAssets Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_dir,httpjob.__c.getField(false,"File").runMethod(true,"getDirAssets"))) { 
 BA.debugLineNum = 146;BA.debugLine="Log(\"Cannot send files from the assets folder.\")";
Debug.JustUpdateDeviceLine();
httpjob.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Cannot send files from the assets folder.")));
 BA.debugLineNum = 147;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 149;BA.debugLine="length = File.Size(Dir, FileName)";
Debug.JustUpdateDeviceLine();
_length = BA.numberCast(int.class, httpjob.__c.getField(false,"File").runMethod(true,"Size",(Object)(_dir),(Object)(_filename)));Debug.locals.put("length", _length);
 BA.debugLineNum = 150;BA.debugLine="Dim In As InputStream";
Debug.JustUpdateDeviceLine();
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("In", _in);
 BA.debugLineNum = 151;BA.debugLine="In = File.OpenInput(Dir, FileName)";
Debug.JustUpdateDeviceLine();
_in = httpjob.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(_dir),(Object)(_filename));Debug.locals.put("In", _in);
 BA.debugLineNum = 152;BA.debugLine="If length < 1000000 Then '1mb";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_length,BA.numberCast(double.class, 1000000))) { 
 BA.debugLineNum = 155;BA.debugLine="Dim out As OutputStream";
Debug.JustUpdateDeviceLine();
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 156;BA.debugLine="out.InitializeToBytesArray(length)";
Debug.JustUpdateDeviceLine();
_out.runVoidMethod ("InitializeToBytesArray",(Object)(_length));
 BA.debugLineNum = 157;BA.debugLine="File.Copy2(In, out)";
Debug.JustUpdateDeviceLine();
httpjob.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_in.getObject())),(Object)((_out.getObject())));
 BA.debugLineNum = 158;BA.debugLine="PostBytes(Link, out.ToBytesArray)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.httpjob.class, "_postbytes" /*RemoteObject*/ ,(Object)(_link),(Object)(_out.runMethod(false,"ToBytesArray")));
 }else {
 BA.debugLineNum = 160;BA.debugLine="req.InitializePost(Link, In, length)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_req" /*RemoteObject*/ ).runVoidMethod ("InitializePost",(Object)(_link),(Object)((_in.getObject())),(Object)(_length));
 BA.debugLineNum = 161;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\",";
Debug.JustUpdateDeviceLine();
httpjob.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((httpjob._httputils2service.getObject())),(Object)(BA.ObjectToString("SubmitJob")),(Object)(__ref));
 };
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _postmultipart(RemoteObject __ref,RemoteObject _link,RemoteObject _namevalues,RemoteObject _files) throws Exception{
try {
		Debug.PushSubsStack("PostMultipart (httpjob) ","httpjob",2,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("postmultipart")) { return __ref.runUserSub(false, "httpjob","postmultipart", __ref, _link, _namevalues, _files);}
RemoteObject _boundary = RemoteObject.createImmutable("");
RemoteObject _stream = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _b = null;
RemoteObject _eol = RemoteObject.createImmutable("");
RemoteObject _empty = RemoteObject.createImmutable(false);
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject _s = RemoteObject.createImmutable("");
RemoteObject _fd = RemoteObject.declareNull("b4j.example.httpjob._multipartfiledata");
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
Debug.locals.put("Link", _link);
Debug.locals.put("NameValues", _namevalues);
Debug.locals.put("Files", _files);
 BA.debugLineNum = 82;BA.debugLine="Public Sub PostMultipart(Link As String, NameValue";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 83;BA.debugLine="Dim boundary As String = \"-----------------------";
Debug.JustUpdateDeviceLine();
_boundary = BA.ObjectToString("---------------------------1461124740692");Debug.locals.put("boundary", _boundary);Debug.locals.put("boundary", _boundary);
 BA.debugLineNum = 84;BA.debugLine="Dim stream As OutputStream";
Debug.JustUpdateDeviceLine();
_stream = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("stream", _stream);
 BA.debugLineNum = 85;BA.debugLine="stream.InitializeToBytesArray(0)";
Debug.JustUpdateDeviceLine();
_stream.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 86;BA.debugLine="Dim b() As Byte";
Debug.JustUpdateDeviceLine();
_b = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("b", _b);
 BA.debugLineNum = 87;BA.debugLine="Dim eol As String = Chr(13) & Chr(10)";
Debug.JustUpdateDeviceLine();
_eol = RemoteObject.concat(httpjob.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 13))),httpjob.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 10))));Debug.locals.put("eol", _eol);Debug.locals.put("eol", _eol);
 BA.debugLineNum = 88;BA.debugLine="Dim empty As Boolean = True";
Debug.JustUpdateDeviceLine();
_empty = httpjob.__c.getField(true,"True");Debug.locals.put("empty", _empty);Debug.locals.put("empty", _empty);
 BA.debugLineNum = 89;BA.debugLine="If NameValues <> Null And NameValues.IsInitialize";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_namevalues) && RemoteObject.solveBoolean(".",_namevalues.runMethod(true,"IsInitialized"))) { 
 BA.debugLineNum = 90;BA.debugLine="For Each key As String In NameValues.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group8 = _namevalues.runMethod(false,"Keys");
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_key = BA.ObjectToString(group8.runMethod(false,"Get",index8));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 91;BA.debugLine="Dim value As String = NameValues.Get(key)";
Debug.JustUpdateDeviceLine();
_value = BA.ObjectToString(_namevalues.runMethod(false,"Get",(Object)((_key))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 92;BA.debugLine="empty = MultipartStartSection (stream, empty)";
Debug.JustUpdateDeviceLine();
_empty = __ref.runClassMethod (b4j.example.httpjob.class, "_multipartstartsection" /*RemoteObject*/ ,(Object)(_stream),(Object)(_empty));Debug.locals.put("empty", _empty);
 BA.debugLineNum = 93;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
Debug.JustUpdateDeviceLine();
_s = (RemoteObject.concat(RemoteObject.createImmutable("--"),httpjob.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_boundary))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("Content-Disposition: form-data; name=\""),httpjob.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_key))),RemoteObject.createImmutable("\"\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable(""),httpjob.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_value))),RemoteObject.createImmutable("")));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 98;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
Debug.JustUpdateDeviceLine();
_b = _s.runMethod(true,"replace",(Object)(httpjob.__c.getField(true,"CRLF")),(Object)(_eol)).runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")));Debug.locals.put("b", _b);
 BA.debugLineNum = 99;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
Debug.JustUpdateDeviceLine();
_stream.runVoidMethod ("WriteBytes",(Object)(_b),(Object)(BA.numberCast(int.class, 0)),(Object)(_b.getField(true,"length")));
 }
}Debug.locals.put("key", _key);
;
 };
 BA.debugLineNum = 102;BA.debugLine="If Files <> Null And Files.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_files) && RemoteObject.solveBoolean(".",_files.runMethod(true,"IsInitialized"))) { 
 BA.debugLineNum = 103;BA.debugLine="For Each fd As MultipartFileData In Files";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group17 = _files;
final int groupLen17 = group17.runMethod(true,"getSize").<Integer>get()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_fd = (group17.runMethod(false,"Get",index17));Debug.locals.put("fd", _fd);
Debug.locals.put("fd", _fd);
 BA.debugLineNum = 104;BA.debugLine="empty = MultipartStartSection (stream, empty)";
Debug.JustUpdateDeviceLine();
_empty = __ref.runClassMethod (b4j.example.httpjob.class, "_multipartstartsection" /*RemoteObject*/ ,(Object)(_stream),(Object)(_empty));Debug.locals.put("empty", _empty);
 BA.debugLineNum = 105;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
Debug.JustUpdateDeviceLine();
_s = (RemoteObject.concat(RemoteObject.createImmutable("--"),httpjob.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_boundary))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("Content-Disposition: form-data; name=\""),httpjob.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fd.getField(true,"KeyName" /*RemoteObject*/ )))),RemoteObject.createImmutable("\"; filename=\""),httpjob.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fd.getField(true,"FileName" /*RemoteObject*/ )))),RemoteObject.createImmutable("\"\n"),RemoteObject.createImmutable("Content-Type: "),httpjob.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fd.getField(true,"ContentType" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("")));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 111;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
Debug.JustUpdateDeviceLine();
_b = _s.runMethod(true,"replace",(Object)(httpjob.__c.getField(true,"CRLF")),(Object)(_eol)).runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")));Debug.locals.put("b", _b);
 BA.debugLineNum = 112;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
Debug.JustUpdateDeviceLine();
_stream.runVoidMethod ("WriteBytes",(Object)(_b),(Object)(BA.numberCast(int.class, 0)),(Object)(_b.getField(true,"length")));
 BA.debugLineNum = 113;BA.debugLine="Dim in As InputStream = File.OpenInput(fd.Dir,";
Debug.JustUpdateDeviceLine();
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
_in = httpjob.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(_fd.getField(true,"Dir" /*RemoteObject*/ )),(Object)(_fd.getField(true,"FileName" /*RemoteObject*/ )));Debug.locals.put("in", _in);Debug.locals.put("in", _in);
 BA.debugLineNum = 114;BA.debugLine="File.Copy2(in, stream)";
Debug.JustUpdateDeviceLine();
httpjob.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_in.getObject())),(Object)((_stream.getObject())));
 }
}Debug.locals.put("fd", _fd);
;
 };
 BA.debugLineNum = 117;BA.debugLine="empty = MultipartStartSection (stream, empty)";
Debug.JustUpdateDeviceLine();
_empty = __ref.runClassMethod (b4j.example.httpjob.class, "_multipartstartsection" /*RemoteObject*/ ,(Object)(_stream),(Object)(_empty));Debug.locals.put("empty", _empty);
 BA.debugLineNum = 118;BA.debugLine="s = _ $\"--${boundary}-- \"$";
Debug.JustUpdateDeviceLine();
_s = (RemoteObject.concat(RemoteObject.createImmutable("--"),httpjob.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_boundary))),RemoteObject.createImmutable("--\n"),RemoteObject.createImmutable("")));Debug.locals.put("s", _s);
 BA.debugLineNum = 121;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
Debug.JustUpdateDeviceLine();
_b = _s.runMethod(true,"replace",(Object)(httpjob.__c.getField(true,"CRLF")),(Object)(_eol)).runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")));Debug.locals.put("b", _b);
 BA.debugLineNum = 122;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
Debug.JustUpdateDeviceLine();
_stream.runVoidMethod ("WriteBytes",(Object)(_b),(Object)(BA.numberCast(int.class, 0)),(Object)(_b.getField(true,"length")));
 BA.debugLineNum = 123;BA.debugLine="PostBytes(Link, stream.ToBytesArray)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.httpjob.class, "_postbytes" /*RemoteObject*/ ,(Object)(_link),(Object)(_stream.runMethod(false,"ToBytesArray")));
 BA.debugLineNum = 124;BA.debugLine="req.SetContentType(\"multipart/form-data; boundary";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_req" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.concat(RemoteObject.createImmutable("multipart/form-data; boundary="),_boundary)));
 BA.debugLineNum = 125;BA.debugLine="req.SetContentEncoding(\"UTF8\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_req" /*RemoteObject*/ ).runVoidMethod ("SetContentEncoding",(Object)(RemoteObject.createImmutable("UTF8")));
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _poststring(RemoteObject __ref,RemoteObject _link,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("PostString (httpjob) ","httpjob",2,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("poststring")) { return __ref.runUserSub(false, "httpjob","poststring", __ref, _link, _text);}
Debug.locals.put("Link", _link);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 31;BA.debugLine="Public Sub PostString(Link As String, Text As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 32;BA.debugLine="PostBytes(Link, Text.GetBytes(\"UTF8\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.httpjob.class, "_postbytes" /*RemoteObject*/ ,(Object)(_link),(Object)(_text.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _putbytes(RemoteObject __ref,RemoteObject _link,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("PutBytes (httpjob) ","httpjob",2,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("putbytes")) { return __ref.runUserSub(false, "httpjob","putbytes", __ref, _link, _data);}
Debug.locals.put("Link", _link);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 47;BA.debugLine="Public Sub PutBytes(Link As String, Data() As Byte";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 48;BA.debugLine="req.InitializePut2(Link, Data)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_req" /*RemoteObject*/ ).runVoidMethod ("InitializePut2",(Object)(_link),(Object)(_data));
 BA.debugLineNum = 49;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
Debug.JustUpdateDeviceLine();
httpjob.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((httpjob._httputils2service.getObject())),(Object)(BA.ObjectToString("SubmitJob")),(Object)(__ref));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _putstring(RemoteObject __ref,RemoteObject _link,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("PutString (httpjob) ","httpjob",2,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("putstring")) { return __ref.runUserSub(false, "httpjob","putstring", __ref, _link, _text);}
Debug.locals.put("Link", _link);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 42;BA.debugLine="Public Sub PutString(Link As String, Text As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 43;BA.debugLine="PutBytes(Link, Text.GetBytes(\"UTF8\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.httpjob.class, "_putbytes" /*RemoteObject*/ ,(Object)(_link),(Object)(_text.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _release(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Release (httpjob) ","httpjob",2,__ref.getField(false, "ba"),__ref,208);
if (RapidSub.canDelegate("release")) { return __ref.runUserSub(false, "httpjob","release", __ref);}
 BA.debugLineNum = 208;BA.debugLine="Public Sub Release";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 210;BA.debugLine="File.Delete(HttpUtils2Service.TempFolder, taskId)";
Debug.JustUpdateDeviceLine();
httpjob.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(httpjob._httputils2service._tempfolder /*RemoteObject*/ ),(Object)(__ref.getField(true,"_taskid" /*RemoteObject*/ )));
 BA.debugLineNum = 212;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}