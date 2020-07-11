package cloyd.blink;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class keyvaluestore_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private sql1 As SQL";
keyvaluestore._sql1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql1",keyvaluestore._sql1);
 //BA.debugLineNum = 4;BA.debugLine="Private ser As B4XSerializator";
keyvaluestore._ser = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.B4XSerializator");__ref.setField("_ser",keyvaluestore._ser);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _close(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Close (keyvaluestore) ","keyvaluestore",4,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("close")) { return __ref.runUserSub(false, "keyvaluestore","close", __ref);}
 BA.debugLineNum = 163;BA.debugLine="Public Sub Close";
Debug.ShouldStop(4);
 BA.debugLineNum = 164;BA.debugLine="sql1.Close";
Debug.ShouldStop(8);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _containskey(RemoteObject __ref,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("ContainsKey (keyvaluestore) ","keyvaluestore",4,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("containskey")) { return __ref.runUserSub(false, "keyvaluestore","containskey", __ref, _key);}
Debug.locals.put("Key", _key);
 BA.debugLineNum = 150;BA.debugLine="Public Sub ContainsKey(Key As String) As Boolean";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 151;BA.debugLine="Return sql1.ExecQuerySingleResult2(\"SELECT count(";
Debug.ShouldStop(4194304);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("SELECT count(key) FROM main WHERE key = ?")),(Object)(keyvaluestore.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_key})))))),BA.numberCast(double.class, 0)));
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtable(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateTable (keyvaluestore) ","keyvaluestore",4,__ref.getField(false, "ba"),__ref,169);
if (RapidSub.canDelegate("createtable")) { return __ref.runUserSub(false, "keyvaluestore","createtable", __ref);}
 BA.debugLineNum = 169;BA.debugLine="Private Sub CreateTable";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="sql1.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS mai";
Debug.ShouldStop(512);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS main(key TEXT PRIMARY KEY, value NONE)")));
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deleteall(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DeleteAll (keyvaluestore) ","keyvaluestore",4,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("deleteall")) { return __ref.runUserSub(false, "keyvaluestore","deleteall", __ref);}
 BA.debugLineNum = 156;BA.debugLine="Public Sub DeleteAll";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="sql1.ExecNonQuery(\"DROP TABLE main\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DROP TABLE main")));
 BA.debugLineNum = 158;BA.debugLine="CreateTable";
Debug.ShouldStop(536870912);
__ref.runClassMethod (cloyd.blink.keyvaluestore.class, "_createtable" /*RemoteObject*/ );
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _get(RemoteObject __ref,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("Get (keyvaluestore) ","keyvaluestore",4,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("get")) { return __ref.runUserSub(false, "keyvaluestore","get", __ref, _key);}
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _result = RemoteObject.declareNull("Object");
Debug.locals.put("Key", _key);
 BA.debugLineNum = 22;BA.debugLine="Public Sub Get(Key As String) As Object";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Dim rs As ResultSet = sql1.ExecQuery2(\"SELECT val";
Debug.ShouldStop(4194304);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("SELECT value FROM main WHERE key = ?")),(Object)(keyvaluestore.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_key})))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 24;BA.debugLine="Dim result As Object = Null";
Debug.ShouldStop(8388608);
_result = keyvaluestore.__c.getField(false,"Null");Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 25;BA.debugLine="If rs.NextRow Then";
Debug.ShouldStop(16777216);
if (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 26;BA.debugLine="result = ser.ConvertBytesToObject(rs.GetBlob2(0)";
Debug.ShouldStop(33554432);
_result = __ref.getField(false,"_ser" /*RemoteObject*/ ).runMethod(false,"ConvertBytesToObject",(Object)(_rs.runMethod(false,"GetBlob2",(Object)(BA.numberCast(int.class, 0)))));Debug.locals.put("result", _result);
 };
 BA.debugLineNum = 28;BA.debugLine="rs.Close";
Debug.ShouldStop(134217728);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 29;BA.debugLine="Return result";
Debug.ShouldStop(268435456);
if (true) return _result;
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdefault(RemoteObject __ref,RemoteObject _key,RemoteObject _defaultvalue) throws Exception{
try {
		Debug.PushSubsStack("GetDefault (keyvaluestore) ","keyvaluestore",4,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("getdefault")) { return __ref.runUserSub(false, "keyvaluestore","getdefault", __ref, _key, _defaultvalue);}
RemoteObject _res = RemoteObject.declareNull("Object");
Debug.locals.put("Key", _key);
Debug.locals.put("DefaultValue", _defaultvalue);
 BA.debugLineNum = 84;BA.debugLine="Public Sub GetDefault(Key As String, DefaultValue";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="Dim res As Object = Get(Key)";
Debug.ShouldStop(1048576);
_res = __ref.runClassMethod (cloyd.blink.keyvaluestore.class, "_get" /*RemoteObject*/ ,(Object)(_key));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 86;BA.debugLine="If res = Null Then Return DefaultValue";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("n",_res)) { 
if (true) return _defaultvalue;};
 BA.debugLineNum = 87;BA.debugLine="Return res";
Debug.ShouldStop(4194304);
if (true) return _res;
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getencrypted(RemoteObject __ref,RemoteObject _key,RemoteObject _password) throws Exception{
try {
		Debug.PushSubsStack("GetEncrypted (keyvaluestore) ","keyvaluestore",4,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("getencrypted")) { return __ref.runUserSub(false, "keyvaluestore","getencrypted", __ref, _key, _password);}
RemoteObject _cipher = RemoteObject.declareNull("anywheresoftware.b4x.object.B4XEncryption");
RemoteObject _b = null;
Debug.locals.put("Key", _key);
Debug.locals.put("Password", _password);
 BA.debugLineNum = 100;BA.debugLine="Public Sub GetEncrypted (Key As String, Password A";
Debug.ShouldStop(8);
 BA.debugLineNum = 104;BA.debugLine="Dim cipher As B4XCipher";
Debug.ShouldStop(128);
_cipher = RemoteObject.createNew ("anywheresoftware.b4x.object.B4XEncryption");Debug.locals.put("cipher", _cipher);
 BA.debugLineNum = 106;BA.debugLine="Dim b() As Byte = Get(Key)";
Debug.ShouldStop(512);
_b = (__ref.runClassMethod (cloyd.blink.keyvaluestore.class, "_get" /*RemoteObject*/ ,(Object)(_key)));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 107;BA.debugLine="If b = Null Then Return Null";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("n",_b)) { 
if (true) return keyvaluestore.__c.getField(false,"Null");};
 BA.debugLineNum = 108;BA.debugLine="Return ser.ConvertBytesToObject(cipher.Decrypt(b,";
Debug.ShouldStop(2048);
if (true) return __ref.getField(false,"_ser" /*RemoteObject*/ ).runMethod(false,"ConvertBytesToObject",(Object)(_cipher.runMethod(false,"Decrypt",(Object)(_b),(Object)(_password))));
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmapasync(RemoteObject __ref,RemoteObject _keys) throws Exception{
try {
		Debug.PushSubsStack("GetMapAsync (keyvaluestore) ","keyvaluestore",4,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("getmapasync")) { return __ref.runUserSub(false, "keyvaluestore","getmapasync", __ref, _keys);}
ResumableSub_GetMapAsync rsub = new ResumableSub_GetMapAsync(null,__ref,_keys);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetMapAsync extends BA.ResumableSub {
public ResumableSub_GetMapAsync(cloyd.blink.keyvaluestore parent,RemoteObject __ref,RemoteObject _keys) {
this.parent = parent;
this.__ref = __ref;
this._keys = _keys;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
cloyd.blink.keyvaluestore parent;
RemoteObject _keys;
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
RemoteObject _senderfilter = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _myser = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.B4XSerializator");
RemoteObject _newobject = RemoteObject.declareNull("Object");
int step4;
int limit4;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetMapAsync (keyvaluestore) ","keyvaluestore",4,__ref.getField(false, "ba"),__ref,37);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Keys", _keys);
 BA.debugLineNum = 38;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(32);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 39;BA.debugLine="sb.Initialize";
Debug.ShouldStop(64);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 40;BA.debugLine="sb.Append(\"SELECT key, value FROM main WHERE \")";
Debug.ShouldStop(128);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("SELECT key, value FROM main WHERE ")));
 BA.debugLineNum = 41;BA.debugLine="For i = 0 To Keys.Size - 1";
Debug.ShouldStop(256);
if (true) break;

case 1:
//for
this.state = 10;
step4 = 1;
limit4 = RemoteObject.solve(new RemoteObject[] {_keys.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 25;
if (true) break;

case 25:
//C
this.state = 10;
if ((step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4)) this.state = 3;
if (true) break;

case 26:
//C
this.state = 25;
_i = ((int)(0 + _i + step4)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 42;BA.debugLine="If i > 0 Then sb.Append(\" OR \")";
Debug.ShouldStop(512);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(int.class, 0))) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" OR ")));
if (true) break;

case 9:
//C
this.state = 26;
;
 BA.debugLineNum = 43;BA.debugLine="sb.Append(\" key = ? \")";
Debug.ShouldStop(1024);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" key = ? ")));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 45;BA.debugLine="Dim SenderFilter As Object = sql1.ExecQueryAsync(";
Debug.ShouldStop(4096);
_senderfilter = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQueryAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("SQL")),(Object)(_sb.runMethod(true,"ToString")),(Object)(_keys));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 46;BA.debugLine="Wait For (SenderFilter) SQL_QueryComplete (Succes";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","sql_querycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "keyvaluestore", "getmapasync"), _senderfilter);
this.state = 27;
return;
case 27:
//C
this.state = 11;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_rs = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("rs", _rs);
;
 BA.debugLineNum = 47;BA.debugLine="Dim m As Map";
Debug.ShouldStop(16384);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 48;BA.debugLine="m.Initialize";
Debug.ShouldStop(32768);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 49;BA.debugLine="If Success Then";
Debug.ShouldStop(65536);
if (true) break;

case 11:
//if
this.state = 24;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 23;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 50;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(131072);
if (true) break;

case 14:
//do while
this.state = 21;
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 16;
if (true) break;
}
if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 51;BA.debugLine="Dim myser As B4XSerializator";
Debug.ShouldStop(262144);
_myser = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.B4XSerializator");Debug.locals.put("myser", _myser);
 BA.debugLineNum = 52;BA.debugLine="myser.ConvertBytesToObjectAsync(rs.GetBlob2(1),";
Debug.ShouldStop(524288);
_myser.runVoidMethod ("ConvertBytesToObjectAsync",__ref.getField(false, "ba"),(Object)(_rs.runMethod(false,"GetBlob2",(Object)(BA.numberCast(int.class, 1)))),(Object)(RemoteObject.createImmutable("myser")));
 BA.debugLineNum = 53;BA.debugLine="Wait For (myser) myser_BytesToObject (Success A";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","myser_bytestoobject", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "keyvaluestore", "getmapasync"), (_myser));
this.state = 28;
return;
case 28:
//C
this.state = 17;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_newobject = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("NewObject", _newobject);
;
 BA.debugLineNum = 54;BA.debugLine="If Success Then";
Debug.ShouldStop(2097152);
if (true) break;

case 17:
//if
this.state = 20;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 55;BA.debugLine="m.Put(rs.GetString2(0), NewObject)";
Debug.ShouldStop(4194304);
_m.runVoidMethod ("Put",(Object)((_rs.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0))))),(Object)(_newobject));
 if (true) break;

case 20:
//C
this.state = 14;
;
 if (true) break;

case 21:
//C
this.state = 24;
;
 BA.debugLineNum = 58;BA.debugLine="rs.Close";
Debug.ShouldStop(33554432);
_rs.runVoidMethod ("Close");
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 60;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 62;BA.debugLine="Return m";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_m));return;};
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _sql_querycomplete(RemoteObject __ref,RemoteObject _success,RemoteObject _rs) throws Exception{
}
public static void  _myser_bytestoobject(RemoteObject __ref,RemoteObject _success,RemoteObject _newobject) throws Exception{
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("Initialize (keyvaluestore) ","keyvaluestore",4,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "keyvaluestore","initialize", __ref, _ba, _dir, _filename);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize (Dir As String, FileName As";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="If sql1.IsInitialized Then sql1.Close";
Debug.ShouldStop(256);
if (__ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("Close");};
 BA.debugLineNum = 11;BA.debugLine="sql1.InitializeSQLite(Dir, FileName, True)";
Debug.ShouldStop(1024);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(_dir),(Object)(_filename),(Object)(keyvaluestore.__c.getField(true,"True")));
 BA.debugLineNum = 15;BA.debugLine="CreateTable";
Debug.ShouldStop(16384);
__ref.runClassMethod (cloyd.blink.keyvaluestore.class, "_createtable" /*RemoteObject*/ );
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listkeys(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ListKeys (keyvaluestore) ","keyvaluestore",4,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("listkeys")) { return __ref.runUserSub(false, "keyvaluestore","listkeys", __ref);}
RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 138;BA.debugLine="Public Sub ListKeys As List";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="Dim c As ResultSet = sql1.ExecQuery(\"SELECT key F";
Debug.ShouldStop(1024);
_c = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_c = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT key FROM main order by key desc")));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 140;BA.debugLine="Dim res As List";
Debug.ShouldStop(2048);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 141;BA.debugLine="res.Initialize";
Debug.ShouldStop(4096);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 142;BA.debugLine="Do While c.NextRow";
Debug.ShouldStop(8192);
while (_c.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 143;BA.debugLine="res.Add(c.GetString2(0))";
Debug.ShouldStop(16384);
_res.runVoidMethod ("Add",(Object)((_c.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, 0))))));
 }
;
 BA.debugLineNum = 145;BA.debugLine="c.Close";
Debug.ShouldStop(65536);
_c.runVoidMethod ("Close");
 BA.debugLineNum = 146;BA.debugLine="Return res";
Debug.ShouldStop(131072);
if (true) return _res;
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _put(RemoteObject __ref,RemoteObject _key,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Put (keyvaluestore) ","keyvaluestore",4,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("put")) { return __ref.runUserSub(false, "keyvaluestore","put", __ref, _key, _value);}
Debug.locals.put("Key", _key);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Put(Key As String, Value As Object)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="sql1.ExecNonQuery2(\"INSERT OR REPLACE INTO main V";
Debug.ShouldStop(262144);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT OR REPLACE INTO main VALUES(?, ?)")),(Object)(keyvaluestore.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_key),(__ref.getField(false,"_ser" /*RemoteObject*/ ).runMethod(false,"ConvertObjectToBytes",(Object)(_value)))})))));
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _putencrypted(RemoteObject __ref,RemoteObject _key,RemoteObject _value,RemoteObject _password) throws Exception{
try {
		Debug.PushSubsStack("PutEncrypted (keyvaluestore) ","keyvaluestore",4,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("putencrypted")) { return __ref.runUserSub(false, "keyvaluestore","putencrypted", __ref, _key, _value, _password);}
RemoteObject _cipher = RemoteObject.declareNull("anywheresoftware.b4x.object.B4XEncryption");
Debug.locals.put("Key", _key);
Debug.locals.put("Value", _value);
Debug.locals.put("Password", _password);
 BA.debugLineNum = 90;BA.debugLine="Public Sub PutEncrypted (Key As String, Value As O";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 94;BA.debugLine="Dim cipher As B4XCipher";
Debug.ShouldStop(536870912);
_cipher = RemoteObject.createNew ("anywheresoftware.b4x.object.B4XEncryption");Debug.locals.put("cipher", _cipher);
 BA.debugLineNum = 96;BA.debugLine="Put(Key, cipher.Encrypt(ser.ConvertObjectToBytes(";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (cloyd.blink.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(_key),(Object)((_cipher.runMethod(false,"Encrypt",(Object)(__ref.getField(false,"_ser" /*RemoteObject*/ ).runMethod(false,"ConvertObjectToBytes",(Object)(_value))),(Object)(_password)))));
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _putmapasync(RemoteObject __ref,RemoteObject _map) throws Exception{
try {
		Debug.PushSubsStack("PutMapAsync (keyvaluestore) ","keyvaluestore",4,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("putmapasync")) { return __ref.runUserSub(false, "keyvaluestore","putmapasync", __ref, _map);}
ResumableSub_PutMapAsync rsub = new ResumableSub_PutMapAsync(null,__ref,_map);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PutMapAsync extends BA.ResumableSub {
public ResumableSub_PutMapAsync(cloyd.blink.keyvaluestore parent,RemoteObject __ref,RemoteObject _map) {
this.parent = parent;
this.__ref = __ref;
this._map = _map;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
cloyd.blink.keyvaluestore parent;
RemoteObject _map;
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _myser = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.B4XSerializator");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _bytes = null;
RemoteObject _senderfilter = RemoteObject.declareNull("Object");
RemoteObject group1;
int index1;
int groupLen1;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PutMapAsync (keyvaluestore) ","keyvaluestore",4,__ref.getField(false, "ba"),__ref,68);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Map", _map);
 BA.debugLineNum = 69;BA.debugLine="For Each key As String In Map.Keys";
Debug.ShouldStop(16);
if (true) break;

case 1:
//for
this.state = 10;
group1 = _map.runMethod(false,"Keys");
index1 = 0;
groupLen1 = group1.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("key", _key);
this.state = 11;
if (true) break;

case 11:
//C
this.state = 10;
if (index1 < groupLen1) {
this.state = 3;
_key = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("key", _key);}
if (true) break;

case 12:
//C
this.state = 11;
index1++;
Debug.locals.put("key", _key);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 70;BA.debugLine="Dim myser As B4XSerializator";
Debug.ShouldStop(32);
_myser = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.B4XSerializator");Debug.locals.put("myser", _myser);
 BA.debugLineNum = 71;BA.debugLine="myser.ConvertObjectToBytesAsync(Map.Get(key), \"m";
Debug.ShouldStop(64);
_myser.runVoidMethod ("ConvertObjectToBytesAsync",__ref.getField(false, "ba"),(Object)(_map.runMethod(false,"Get",(Object)((_key)))),(Object)(RemoteObject.createImmutable("myser")));
 BA.debugLineNum = 72;BA.debugLine="Wait For (myser) myser_ObjectToBytes (Success As";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","myser_objecttobytes", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "keyvaluestore", "putmapasync"), (_myser));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_bytes = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Bytes", _bytes);
;
 BA.debugLineNum = 73;BA.debugLine="If Success Then";
Debug.ShouldStop(256);
if (true) break;

case 4:
//if
this.state = 9;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 74;BA.debugLine="sql1.AddNonQueryToBatch(\"INSERT OR REPLACE INTO";
Debug.ShouldStop(512);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(BA.ObjectToString("INSERT OR REPLACE INTO main VALUES(?, ?)")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_key),(_bytes)})))));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 76;BA.debugLine="Log(\"Failed to serialize object: \" & Map.Get(ke";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Failed to serialize object: "),_map.runMethod(false,"Get",(Object)((_key))))));
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
Debug.locals.put("key", _key);
;
 BA.debugLineNum = 79;BA.debugLine="Dim SenderFilter As Object = sql1.ExecNonQueryBat";
Debug.ShouldStop(16384);
_senderfilter = __ref.getField(false,"_sql1" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 80;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "keyvaluestore", "putmapasync"), _senderfilter);
this.state = 14;
return;
case 14:
//C
this.state = -1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 81;BA.debugLine="Return Success";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_success));return;};
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _myser_objecttobytes(RemoteObject __ref,RemoteObject _success,RemoteObject _bytes) throws Exception{
}
public static void  _sql_nonquerycomplete(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static RemoteObject  _remove(RemoteObject __ref,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("Remove (keyvaluestore) ","keyvaluestore",4,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("remove")) { return __ref.runUserSub(false, "keyvaluestore","remove", __ref, _key);}
Debug.locals.put("Key", _key);
 BA.debugLineNum = 133;BA.debugLine="Public Sub Remove(Key As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 134;BA.debugLine="sql1.ExecNonQuery2(\"DELETE FROM main WHERE key =";
Debug.ShouldStop(32);
__ref.getField(false,"_sql1" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("DELETE FROM main WHERE key = ?")),(Object)(keyvaluestore.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_key)})))));
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}