package cloyd.blink;


import anywheresoftware.b4a.BA;

public class httputils2service extends Object{
public static httputils2service mostCurrent = new httputils2service();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("cloyd.blink", "cloyd.blink.httputils2service", null);
		ba.loadHtSubs(httputils2service.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "cloyd.blink.httputils2service", ba);
		}
	}
    public static Class<?> getObject() {
		return httputils2service.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4h.okhttp.OkHttpClientWrapper _hc = null;
public static anywheresoftware.b4a.objects.collections.Map _taskidtojob = null;
public static String _tempfolder = "";
public static int _taskcounter = 0;
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static cloyd.blink.main _main = null;
public static cloyd.blink.xuiviewsutils _xuiviewsutils = null;
public static String  _completejob(int _taskid,boolean _success,String _errormessage) throws Exception{
cloyd.blink.httpjob _job = null;
 //BA.debugLineNum = 134;BA.debugLine="Sub CompleteJob(TaskId As Int, success As Boolean,";
 //BA.debugLineNum = 138;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (cloyd.blink.httpjob)(_taskidtojob.Get((Object)(_taskid)));
 //BA.debugLineNum = 139;BA.debugLine="If job = Null Then";
if (_job== null) { 
 //BA.debugLineNum = 140;BA.debugLine="Log(\"HttpUtils2Service: job completed multiple t";
anywheresoftware.b4a.keywords.Common.Log("HttpUtils2Service: job completed multiple times - "+BA.NumberToString(_taskid));
 //BA.debugLineNum = 141;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 143;BA.debugLine="TaskIdToJob.Remove(TaskId)";
_taskidtojob.Remove((Object)(_taskid));
 //BA.debugLineNum = 144;BA.debugLine="job.success = success";
_job._success /*boolean*/  = _success;
 //BA.debugLineNum = 145;BA.debugLine="job.errorMessage = errorMessage";
_job._errormessage /*String*/  = _errormessage;
 //BA.debugLineNum = 147;BA.debugLine="job.Complete(TaskId)";
_job._complete /*String*/ (_taskid);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responseerror(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,String _reason,int _statuscode,int _taskid) throws Exception{
cloyd.blink.httpjob _job = null;
 //BA.debugLineNum = 105;BA.debugLine="Sub hc_ResponseError (Response As OkHttpResponse,";
 //BA.debugLineNum = 106;BA.debugLine="Log($\"ResponseError. Reason: ${Reason}, Response:";
anywheresoftware.b4a.keywords.Common.Log(("ResponseError. Reason: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reason))+", Response: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_response.getErrorResponse()))+""));
 //BA.debugLineNum = 107;BA.debugLine="Response.Release";
_response.Release();
 //BA.debugLineNum = 108;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (cloyd.blink.httpjob)(_taskidtojob.Get((Object)(_taskid)));
 //BA.debugLineNum = 109;BA.debugLine="job.Response = Response";
_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/  = _response;
 //BA.debugLineNum = 110;BA.debugLine="If Response.ErrorResponse <> \"\" Then";
if ((_response.getErrorResponse()).equals("") == false) { 
 //BA.debugLineNum = 111;BA.debugLine="CompleteJob(TaskId, False, Response.ErrorRespons";
_completejob(_taskid,anywheresoftware.b4a.keywords.Common.False,_response.getErrorResponse());
 }else {
 //BA.debugLineNum = 113;BA.debugLine="CompleteJob(TaskId, False, Reason)";
_completejob(_taskid,anywheresoftware.b4a.keywords.Common.False,_reason);
 };
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responsesuccess(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,int _taskid) throws Exception{
cloyd.blink.httpjob _job = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
 //BA.debugLineNum = 86;BA.debugLine="Sub hc_ResponseSuccess (Response As OkHttpResponse";
 //BA.debugLineNum = 87;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (cloyd.blink.httpjob)(_taskidtojob.Get((Object)(_taskid)));
 //BA.debugLineNum = 88;BA.debugLine="job.Response = Response";
_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/  = _response;
 //BA.debugLineNum = 89;BA.debugLine="Dim out As OutputStream = File.OpenOutput(TempFol";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(_tempfolder,BA.NumberToString(_taskid),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 93;BA.debugLine="Response.GetAsynchronously(\"response\", out , _";
_response.GetAsynchronously(ba,"response",(java.io.OutputStream)(_out.getObject()),anywheresoftware.b4a.keywords.Common.True,_taskid);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private hc As OkHttpClient";
_hc = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private TaskIdToJob As Map";
_taskidtojob = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 19;BA.debugLine="Public TempFolder As String";
_tempfolder = "";
 //BA.debugLineNum = 23;BA.debugLine="Private taskCounter As Int";
_taskcounter = 0;
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public static String  _response_streamfinish(boolean _success,int _taskid) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Private Sub Response_StreamFinish (Success As Bool";
 //BA.debugLineNum = 98;BA.debugLine="If Success Then";
if (_success) { 
 //BA.debugLineNum = 99;BA.debugLine="CompleteJob(TaskId, Success, \"\")";
_completejob(_taskid,_success,"");
 }else {
 //BA.debugLineNum = 101;BA.debugLine="CompleteJob(TaskId, Success, LastException.Messa";
_completejob(_taskid,_success,anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
 };
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub Service_Create";
 //BA.debugLineNum = 39;BA.debugLine="TempFolder = File.DirTemp";
_tempfolder = anywheresoftware.b4a.keywords.Common.File.getDirTemp();
 //BA.debugLineNum = 41;BA.debugLine="If hc.IsInitialized = False Then";
if (_hc.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 46;BA.debugLine="hc.Initialize(\"hc\")";
_hc.Initialize("hc");
 };
 //BA.debugLineNum = 54;BA.debugLine="TaskIdToJob.Initialize";
_taskidtojob.Initialize();
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public static String  _submitjob(cloyd.blink.httpjob _job) throws Exception{
int _taskid = 0;
 //BA.debugLineNum = 68;BA.debugLine="Public Sub SubmitJob(job As HttpJob)";
 //BA.debugLineNum = 69;BA.debugLine="If TaskIdToJob.IsInitialized = False Then Service";
if (_taskidtojob.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
_service_create();};
 //BA.debugLineNum = 73;BA.debugLine="taskCounter = taskCounter + 1";
_taskcounter = (int) (_taskcounter+1);
 //BA.debugLineNum = 74;BA.debugLine="Dim TaskId As Int = taskCounter";
_taskid = _taskcounter;
 //BA.debugLineNum = 76;BA.debugLine="TaskIdToJob.Put(TaskId, job)";
_taskidtojob.Put((Object)(_taskid),(Object)(_job));
 //BA.debugLineNum = 77;BA.debugLine="If job.Username <> \"\" And job.Password <> \"\" Then";
if ((_job._username /*String*/ ).equals("") == false && (_job._password /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 78;BA.debugLine="hc.ExecuteCredentials(job.GetRequest, TaskId, jo";
_hc.ExecuteCredentials(ba,_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (),_taskid,_job._username /*String*/ ,_job._password /*String*/ );
 }else {
 //BA.debugLineNum = 80;BA.debugLine="hc.Execute(job.GetRequest, TaskId)";
_hc.Execute(ba,_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (),_taskid);
 };
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
}
