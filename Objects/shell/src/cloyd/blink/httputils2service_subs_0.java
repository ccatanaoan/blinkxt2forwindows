package cloyd.blink;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class httputils2service_subs_0 {


public static RemoteObject  _completejob(RemoteObject _taskid,RemoteObject _success,RemoteObject _errormessage) throws Exception{
try {
		Debug.PushSubsStack("CompleteJob (httputils2service) ","httputils2service",3,httputils2service.ba,httputils2service.mostCurrent,93);
if (RapidSub.canDelegate("completejob")) { return cloyd.blink.httputils2service.remoteMe.runUserSub(false, "httputils2service","completejob", _taskid, _success, _errormessage);}
RemoteObject _job = RemoteObject.declareNull("cloyd.blink.httpjob");
Debug.locals.put("TaskId", _taskid);
Debug.locals.put("success", _success);
Debug.locals.put("errorMessage", _errormessage);
 BA.debugLineNum = 93;BA.debugLine="Sub CompleteJob(TaskId As Int, success As Boolean,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 97;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
Debug.JustUpdateDeviceLine();
_job = (httputils2service._taskidtojob.runMethod(false,"Get",(Object)((_taskid))));Debug.locals.put("job", _job);Debug.locals.put("job", _job);
 BA.debugLineNum = 98;BA.debugLine="TaskIdToJob.Remove(TaskId)";
Debug.JustUpdateDeviceLine();
httputils2service._taskidtojob.runVoidMethod ("Remove",(Object)((_taskid)));
 BA.debugLineNum = 99;BA.debugLine="job.success = success";
Debug.JustUpdateDeviceLine();
_job.setField ("_success" /*RemoteObject*/ ,_success);
 BA.debugLineNum = 100;BA.debugLine="job.errorMessage = errorMessage";
Debug.JustUpdateDeviceLine();
_job.setField ("_errormessage" /*RemoteObject*/ ,_errormessage);
 BA.debugLineNum = 102;BA.debugLine="job.Complete(TaskId)";
Debug.JustUpdateDeviceLine();
_job.runClassMethod (cloyd.blink.httpjob.class, "_complete" /*RemoteObject*/ ,(Object)(_taskid));
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hc_responseerror(RemoteObject _response,RemoteObject _reason,RemoteObject _statuscode,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("hc_ResponseError (httputils2service) ","httputils2service",3,httputils2service.ba,httputils2service.mostCurrent,70);
if (RapidSub.canDelegate("hc_responseerror")) { return cloyd.blink.httputils2service.remoteMe.runUserSub(false, "httputils2service","hc_responseerror", _response, _reason, _statuscode, _taskid);}
RemoteObject _job = RemoteObject.declareNull("cloyd.blink.httpjob");
Debug.locals.put("Response", _response);
Debug.locals.put("Reason", _reason);
Debug.locals.put("StatusCode", _statuscode);
Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 70;BA.debugLine="Sub hc_ResponseError (Response As OkHttpResponse,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 71;BA.debugLine="Log($\"ResponseError. Reason: ${Reason}, Response:";
Debug.JustUpdateDeviceLine();
httputils2service.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("ResponseError. Reason: "),httputils2service.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reason))),RemoteObject.createImmutable(", Response: "),httputils2service.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_response.runMethod(true,"getErrorResponse")))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 72;BA.debugLine="Response.Release";
Debug.JustUpdateDeviceLine();
_response.runVoidMethod ("Release");
 BA.debugLineNum = 73;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
Debug.JustUpdateDeviceLine();
_job = (httputils2service._taskidtojob.runMethod(false,"Get",(Object)((_taskid))));Debug.locals.put("job", _job);Debug.locals.put("job", _job);
 BA.debugLineNum = 74;BA.debugLine="job.Response = Response";
Debug.JustUpdateDeviceLine();
_job.setField ("_response" /*RemoteObject*/ ,_response);
 BA.debugLineNum = 75;BA.debugLine="If Response.ErrorResponse <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_response.runMethod(true,"getErrorResponse"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 76;BA.debugLine="CompleteJob(TaskId, False, Response.ErrorRespons";
Debug.JustUpdateDeviceLine();
_completejob(_taskid,httputils2service.__c.getField(true,"False"),_response.runMethod(true,"getErrorResponse"));
 }else {
 BA.debugLineNum = 78;BA.debugLine="CompleteJob(TaskId, False, Reason)";
Debug.JustUpdateDeviceLine();
_completejob(_taskid,httputils2service.__c.getField(true,"False"),_reason);
 };
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hc_responsesuccess(RemoteObject _response,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("hc_ResponseSuccess (httputils2service) ","httputils2service",3,httputils2service.ba,httputils2service.mostCurrent,55);
if (RapidSub.canDelegate("hc_responsesuccess")) { return cloyd.blink.httputils2service.remoteMe.runUserSub(false, "httputils2service","hc_responsesuccess", _response, _taskid);}
RemoteObject _job = RemoteObject.declareNull("cloyd.blink.httpjob");
Debug.locals.put("Response", _response);
Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 55;BA.debugLine="Sub hc_ResponseSuccess (Response As OkHttpResponse";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 56;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
Debug.JustUpdateDeviceLine();
_job = (httputils2service._taskidtojob.runMethod(false,"Get",(Object)((_taskid))));Debug.locals.put("job", _job);Debug.locals.put("job", _job);
 BA.debugLineNum = 57;BA.debugLine="job.Response = Response";
Debug.JustUpdateDeviceLine();
_job.setField ("_response" /*RemoteObject*/ ,_response);
 BA.debugLineNum = 58;BA.debugLine="Response.GetAsynchronously(\"response\", File.OpenO";
Debug.JustUpdateDeviceLine();
_response.runVoidMethod ("GetAsynchronously",httputils2service.ba,(Object)(BA.ObjectToString("response")),(Object)((httputils2service.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(httputils2service._tempfolder),(Object)(BA.NumberToString(_taskid)),(Object)(httputils2service.__c.getField(true,"False"))).getObject())),(Object)(httputils2service.__c.getField(true,"True")),(Object)(_taskid));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private hc As OkHttpClient";
httputils2service._hc = RemoteObject.createNew ("anywheresoftware.b4h.okhttp.OkHttpClientWrapper");
 //BA.debugLineNum = 8;BA.debugLine="Private TaskIdToJob As Map";
httputils2service._taskidtojob = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 9;BA.debugLine="Public TempFolder As String";
httputils2service._tempfolder = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="Private taskCounter As Int";
httputils2service._taskcounter = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _response_streamfinish(RemoteObject _success,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("Response_StreamFinish (httputils2service) ","httputils2service",3,httputils2service.ba,httputils2service.mostCurrent,62);
if (RapidSub.canDelegate("response_streamfinish")) { return cloyd.blink.httputils2service.remoteMe.runUserSub(false, "httputils2service","response_streamfinish", _success, _taskid);}
Debug.locals.put("Success", _success);
Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 62;BA.debugLine="Private Sub Response_StreamFinish (Success As Bool";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="If Success Then";
Debug.JustUpdateDeviceLine();
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 64;BA.debugLine="CompleteJob(TaskId, Success, \"\")";
Debug.JustUpdateDeviceLine();
_completejob(_taskid,_success,RemoteObject.createImmutable(""));
 }else {
 BA.debugLineNum = 66;BA.debugLine="CompleteJob(TaskId, Success, LastException.Messa";
Debug.JustUpdateDeviceLine();
_completejob(_taskid,_success,httputils2service.__c.runMethod(false,"LastException",httputils2service.ba).runMethod(true,"getMessage"));
 };
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (httputils2service) ","httputils2service",3,httputils2service.ba,httputils2service.mostCurrent,13);
if (RapidSub.canDelegate("service_create")) { return cloyd.blink.httputils2service.remoteMe.runUserSub(false, "httputils2service","service_create");}
 BA.debugLineNum = 13;BA.debugLine="Sub Service_Create";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 26;BA.debugLine="TempFolder = File.DirTemp";
Debug.JustUpdateDeviceLine();
httputils2service._tempfolder = httputils2service.__c.getField(false,"File").runMethod(true,"getDirTemp");
 BA.debugLineNum = 28;BA.debugLine="hc.Initialize(\"hc\")";
Debug.JustUpdateDeviceLine();
httputils2service._hc.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("hc")));
 BA.debugLineNum = 29;BA.debugLine="TaskIdToJob.Initialize";
Debug.JustUpdateDeviceLine();
httputils2service._taskidtojob.runVoidMethod ("Initialize");
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _submitjob(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("SubmitJob (httputils2service) ","httputils2service",3,httputils2service.ba,httputils2service.mostCurrent,42);
if (RapidSub.canDelegate("submitjob")) { return cloyd.blink.httputils2service.remoteMe.runUserSub(false, "httputils2service","submitjob", _job);}
Debug.locals.put("job", _job);
 BA.debugLineNum = 42;BA.debugLine="Public Sub SubmitJob(job As HttpJob)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 43;BA.debugLine="If hc.IsInitialized = False Then Service_Create";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",httputils2service._hc.runMethod(true,"IsInitialized"),httputils2service.__c.getField(true,"False"))) { 
_service_create();};
 BA.debugLineNum = 44;BA.debugLine="taskCounter = taskCounter + 1";
Debug.JustUpdateDeviceLine();
httputils2service._taskcounter = RemoteObject.solve(new RemoteObject[] {httputils2service._taskcounter,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 45;BA.debugLine="TaskIdToJob.Put(taskCounter, job)";
Debug.JustUpdateDeviceLine();
httputils2service._taskidtojob.runVoidMethod ("Put",(Object)((httputils2service._taskcounter)),(Object)((_job)));
 BA.debugLineNum = 46;BA.debugLine="If job.Username <> \"\" And job.Password <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_job.getField(true,"_username" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_job.getField(true,"_password" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 47;BA.debugLine="hc.ExecuteCredentials(job.GetRequest, taskCounte";
Debug.JustUpdateDeviceLine();
httputils2service._hc.runVoidMethod ("ExecuteCredentials",httputils2service.ba,(Object)(_job.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ )),(Object)(httputils2service._taskcounter),(Object)(_job.getField(true,"_username" /*RemoteObject*/ )),(Object)(_job.getField(true,"_password" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 49;BA.debugLine="hc.Execute(job.GetRequest, taskCounter)";
Debug.JustUpdateDeviceLine();
httputils2service._hc.runVoidMethod ("Execute",httputils2service.ba,(Object)(_job.runClassMethod (cloyd.blink.httpjob.class, "_getrequest" /*RemoteObject*/ )),(Object)(httputils2service._taskcounter));
 };
 BA.debugLineNum = 51;BA.debugLine="End Sub";
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