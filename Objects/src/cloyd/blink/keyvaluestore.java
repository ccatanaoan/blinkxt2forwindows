package cloyd.blink;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class keyvaluestore extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("cloyd.blink", "cloyd.blink.keyvaluestore", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", cloyd.blink.keyvaluestore.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.SQL _sql1 = null;
public anywheresoftware.b4a.randomaccessfile.B4XSerializator _ser = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public cloyd.blink.main _main = null;
public cloyd.blink.httputils2service _httputils2service = null;
public String  _initialize(cloyd.blink.keyvaluestore __ref,anywheresoftware.b4a.BA _ba,String _dir,String _filename) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_dir,_filename}));}
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Public Sub Initialize (Dir As String, FileName As";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="If sql1.IsInitialized Then sql1.Close";
if (__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();};
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="sql1.InitializeSQLite(Dir, FileName, True)";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(_dir,_filename,__c.True);
RDebugUtils.currentLine=6029319;
 //BA.debugLineNum = 6029319;BA.debugLine="CreateTable";
__ref._createtable /*String*/ (null);
RDebugUtils.currentLine=6029320;
 //BA.debugLineNum = 6029320;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _listkeys(cloyd.blink.keyvaluestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "listkeys", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "listkeys", null));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _c = null;
anywheresoftware.b4a.objects.collections.List _res = null;
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Public Sub ListKeys As List";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="Dim c As ResultSet = sql1.ExecQuery(\"SELECT key F";
_c = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_c = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT key FROM main order by key desc");
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="Do While c.NextRow";
while (_c.NextRow()) {
RDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="res.Add(c.GetString2(0))";
_res.Add((Object)(_c.GetString2((int) (0))));
 }
;
RDebugUtils.currentLine=6619143;
 //BA.debugLineNum = 6619143;BA.debugLine="c.Close";
_c.Close();
RDebugUtils.currentLine=6619144;
 //BA.debugLineNum = 6619144;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=6619145;
 //BA.debugLineNum = 6619145;BA.debugLine="End Sub";
return null;
}
public Object  _get(cloyd.blink.keyvaluestore __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "get", false))
	 {return ((Object) Debug.delegate(ba, "get", new Object[] {_key}));}
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
Object _result = null;
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Public Sub Get(Key As String) As Object";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="Dim rs As ResultSet = sql1.ExecQuery2(\"SELECT val";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2("SELECT value FROM main WHERE key = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_key}));
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="Dim result As Object = Null";
_result = __c.Null;
RDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="If rs.NextRow Then";
if (_rs.NextRow()) { 
RDebugUtils.currentLine=6160388;
 //BA.debugLineNum = 6160388;BA.debugLine="result = ser.ConvertBytesToObject(rs.GetBlob2(0)";
_result = __ref._ser /*anywheresoftware.b4a.randomaccessfile.B4XSerializator*/ .ConvertBytesToObject(_rs.GetBlob2((int) (0)));
 };
RDebugUtils.currentLine=6160390;
 //BA.debugLineNum = 6160390;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=6160391;
 //BA.debugLineNum = 6160391;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=6160392;
 //BA.debugLineNum = 6160392;BA.debugLine="End Sub";
return null;
}
public String  _put(cloyd.blink.keyvaluestore __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "put", false))
	 {return ((String) Debug.delegate(ba, "put", new Object[] {_key,_value}));}
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Public Sub Put(Key As String, Value As Object)";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="sql1.ExecNonQuery2(\"INSERT OR REPLACE INTO main V";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("INSERT OR REPLACE INTO main VALUES(?, ?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_key),(Object)(__ref._ser /*anywheresoftware.b4a.randomaccessfile.B4XSerializator*/ .ConvertObjectToBytes(_value))}));
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="End Sub";
return "";
}
public boolean  _containskey(cloyd.blink.keyvaluestore __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "containskey", false))
	 {return ((Boolean) Debug.delegate(ba, "containskey", new Object[] {_key}));}
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Public Sub ContainsKey(Key As String) As Boolean";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Return sql1.ExecQuerySingleResult2(\"SELECT count(";
if (true) return (double)(Double.parseDouble(__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("SELECT count(key) FROM main WHERE key = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_key}))))>0;
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="End Sub";
return false;
}
public String  _remove(cloyd.blink.keyvaluestore __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "remove", false))
	 {return ((String) Debug.delegate(ba, "remove", new Object[] {_key}));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Public Sub Remove(Key As String)";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="sql1.ExecNonQuery2(\"DELETE FROM main WHERE key =";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("DELETE FROM main WHERE key = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_key)}));
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(cloyd.blink.keyvaluestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="Private ser As B4XSerializator";
_ser = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="End Sub";
return "";
}
public String  _close(cloyd.blink.keyvaluestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "close", false))
	 {return ((String) Debug.delegate(ba, "close", null));}
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Public Sub Close";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="sql1.Close";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .Close();
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="End Sub";
return "";
}
public String  _createtable(cloyd.blink.keyvaluestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "createtable", false))
	 {return ((String) Debug.delegate(ba, "createtable", null));}
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Private Sub CreateTable";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="sql1.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS mai";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("CREATE TABLE IF NOT EXISTS main(key TEXT PRIMARY KEY, value NONE)");
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="End Sub";
return "";
}
public String  _deleteall(cloyd.blink.keyvaluestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "deleteall", false))
	 {return ((String) Debug.delegate(ba, "deleteall", null));}
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Public Sub DeleteAll";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="sql1.ExecNonQuery(\"DROP TABLE main\")";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("DROP TABLE main");
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="CreateTable";
__ref._createtable /*String*/ (null);
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="End Sub";
return "";
}
public Object  _getdefault(cloyd.blink.keyvaluestore __ref,String _key,Object _defaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "getdefault", false))
	 {return ((Object) Debug.delegate(ba, "getdefault", new Object[] {_key,_defaultvalue}));}
Object _res = null;
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Public Sub GetDefault(Key As String, DefaultValue";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Dim res As Object = Get(Key)";
_res = __ref._get /*Object*/ (null,_key);
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="If res = Null Then Return DefaultValue";
if (_res== null) { 
if (true) return _defaultvalue;};
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="End Sub";
return null;
}
public Object  _getencrypted(cloyd.blink.keyvaluestore __ref,String _key,String _password) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "getencrypted", false))
	 {return ((Object) Debug.delegate(ba, "getencrypted", new Object[] {_key,_password}));}
anywheresoftware.b4x.object.B4XEncryption _cipher = null;
byte[] _b = null;
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Public Sub GetEncrypted (Key As String, Password A";
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="Dim cipher As B4XCipher";
_cipher = new anywheresoftware.b4x.object.B4XEncryption();
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="Dim b() As Byte = Get(Key)";
_b = (byte[])(__ref._get /*Object*/ (null,_key));
RDebugUtils.currentLine=6488071;
 //BA.debugLineNum = 6488071;BA.debugLine="If b = Null Then Return Null";
if (_b== null) { 
if (true) return __c.Null;};
RDebugUtils.currentLine=6488072;
 //BA.debugLineNum = 6488072;BA.debugLine="Return ser.ConvertBytesToObject(cipher.Decrypt(b,";
if (true) return __ref._ser /*anywheresoftware.b4a.randomaccessfile.B4XSerializator*/ .ConvertBytesToObject(_cipher.Decrypt(_b,_password));
RDebugUtils.currentLine=6488073;
 //BA.debugLineNum = 6488073;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getmapasync(cloyd.blink.keyvaluestore __ref,anywheresoftware.b4a.objects.collections.List _keys) throws Exception{
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "getmapasync", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "getmapasync", new Object[] {_keys}));}
ResumableSub_GetMapAsync rsub = new ResumableSub_GetMapAsync(this,__ref,_keys);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetMapAsync extends BA.ResumableSub {
public ResumableSub_GetMapAsync(cloyd.blink.keyvaluestore parent,cloyd.blink.keyvaluestore __ref,anywheresoftware.b4a.objects.collections.List _keys) {
this.parent = parent;
this.__ref = __ref;
this._keys = _keys;
this.__ref = parent;
}
cloyd.blink.keyvaluestore __ref;
cloyd.blink.keyvaluestore parent;
anywheresoftware.b4a.objects.collections.List _keys;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
Object _senderfilter = null;
boolean _success = false;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.randomaccessfile.B4XSerializator _myser = null;
Object _newobject = null;
int step4;
int limit4;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="keyvaluestore";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="sb.Append(\"SELECT key, value FROM main WHERE \")";
_sb.Append("SELECT key, value FROM main WHERE ");
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="For i = 0 To Keys.Size - 1";
if (true) break;

case 1:
//for
this.state = 10;
step4 = 1;
limit4 = (int) (_keys.getSize()-1);
_i = (int) (0) ;
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
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=6225925;
 //BA.debugLineNum = 6225925;BA.debugLine="If i > 0 Then sb.Append(\" OR \")";
if (true) break;

case 4:
//if
this.state = 9;
if (_i>0) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_sb.Append(" OR ");
if (true) break;

case 9:
//C
this.state = 26;
;
RDebugUtils.currentLine=6225926;
 //BA.debugLineNum = 6225926;BA.debugLine="sb.Append(\" key = ? \")";
_sb.Append(" key = ? ");
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=6225928;
 //BA.debugLineNum = 6225928;BA.debugLine="Dim SenderFilter As Object = sql1.ExecQueryAsync(";
_senderfilter = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecQueryAsync(ba,"SQL",_sb.ToString(),_keys);
RDebugUtils.currentLine=6225929;
 //BA.debugLineNum = 6225929;BA.debugLine="Wait For (SenderFilter) SQL_QueryComplete (Succes";
parent.__c.WaitFor("sql_querycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "keyvaluestore", "getmapasync"), _senderfilter);
this.state = 27;
return;
case 27:
//C
this.state = 11;
_success = (boolean) result[1];
_rs = (anywheresoftware.b4j.objects.SQL.ResultSetWrapper) result[2];
;
RDebugUtils.currentLine=6225930;
 //BA.debugLineNum = 6225930;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6225931;
 //BA.debugLineNum = 6225931;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=6225932;
 //BA.debugLineNum = 6225932;BA.debugLine="If Success Then";
if (true) break;

case 11:
//if
this.state = 24;
if (_success) { 
this.state = 13;
}else {
this.state = 23;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=6225933;
 //BA.debugLineNum = 6225933;BA.debugLine="Do While rs.NextRow";
if (true) break;

case 14:
//do while
this.state = 21;
while (_rs.NextRow()) {
this.state = 16;
if (true) break;
}
if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=6225934;
 //BA.debugLineNum = 6225934;BA.debugLine="Dim myser As B4XSerializator";
_myser = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
RDebugUtils.currentLine=6225935;
 //BA.debugLineNum = 6225935;BA.debugLine="myser.ConvertBytesToObjectAsync(rs.GetBlob2(1),";
_myser.ConvertBytesToObjectAsync(ba,_rs.GetBlob2((int) (1)),"myser");
RDebugUtils.currentLine=6225936;
 //BA.debugLineNum = 6225936;BA.debugLine="Wait For (myser) myser_BytesToObject (Success A";
parent.__c.WaitFor("myser_bytestoobject", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "keyvaluestore", "getmapasync"), (Object)(_myser));
this.state = 28;
return;
case 28:
//C
this.state = 17;
_success = (boolean) result[1];
_newobject = (Object) result[2];
;
RDebugUtils.currentLine=6225937;
 //BA.debugLineNum = 6225937;BA.debugLine="If Success Then";
if (true) break;

case 17:
//if
this.state = 20;
if (_success) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=6225938;
 //BA.debugLineNum = 6225938;BA.debugLine="m.Put(rs.GetString2(0), NewObject)";
_m.Put((Object)(_rs.GetString2((int) (0))),_newobject);
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
RDebugUtils.currentLine=6225941;
 //BA.debugLineNum = 6225941;BA.debugLine="rs.Close";
_rs.Close();
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=6225943;
 //BA.debugLineNum = 6225943;BA.debugLine="Log(LastException)";
parent.__c.Log(BA.ObjectToString(parent.__c.LastException(ba)));
 if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=6225945;
 //BA.debugLineNum = 6225945;BA.debugLine="Return m";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_m));return;};
RDebugUtils.currentLine=6225946;
 //BA.debugLineNum = 6225946;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _putencrypted(cloyd.blink.keyvaluestore __ref,String _key,Object _value,String _password) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "putencrypted", false))
	 {return ((String) Debug.delegate(ba, "putencrypted", new Object[] {_key,_value,_password}));}
anywheresoftware.b4x.object.B4XEncryption _cipher = null;
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Public Sub PutEncrypted (Key As String, Value As O";
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="Dim cipher As B4XCipher";
_cipher = new anywheresoftware.b4x.object.B4XEncryption();
RDebugUtils.currentLine=6422534;
 //BA.debugLineNum = 6422534;BA.debugLine="Put(Key, cipher.Encrypt(ser.ConvertObjectToBytes(";
__ref._put /*String*/ (null,_key,(Object)(_cipher.Encrypt(__ref._ser /*anywheresoftware.b4a.randomaccessfile.B4XSerializator*/ .ConvertObjectToBytes(_value),_password)));
RDebugUtils.currentLine=6422535;
 //BA.debugLineNum = 6422535;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _putmapasync(cloyd.blink.keyvaluestore __ref,anywheresoftware.b4a.objects.collections.Map _map) throws Exception{
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "putmapasync", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "putmapasync", new Object[] {_map}));}
ResumableSub_PutMapAsync rsub = new ResumableSub_PutMapAsync(this,__ref,_map);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PutMapAsync extends BA.ResumableSub {
public ResumableSub_PutMapAsync(cloyd.blink.keyvaluestore parent,cloyd.blink.keyvaluestore __ref,anywheresoftware.b4a.objects.collections.Map _map) {
this.parent = parent;
this.__ref = __ref;
this._map = _map;
this.__ref = parent;
}
cloyd.blink.keyvaluestore __ref;
cloyd.blink.keyvaluestore parent;
anywheresoftware.b4a.objects.collections.Map _map;
String _key = "";
anywheresoftware.b4a.randomaccessfile.B4XSerializator _myser = null;
boolean _success = false;
byte[] _bytes = null;
Object _senderfilter = null;
anywheresoftware.b4a.BA.IterableList group1;
int index1;
int groupLen1;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="keyvaluestore";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="For Each key As String In Map.Keys";
if (true) break;

case 1:
//for
this.state = 10;
group1 = _map.Keys();
index1 = 0;
groupLen1 = group1.getSize();
this.state = 11;
if (true) break;

case 11:
//C
this.state = 10;
if (index1 < groupLen1) {
this.state = 3;
_key = BA.ObjectToString(group1.Get(index1));}
if (true) break;

case 12:
//C
this.state = 11;
index1++;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="Dim myser As B4XSerializator";
_myser = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="myser.ConvertObjectToBytesAsync(Map.Get(key), \"m";
_myser.ConvertObjectToBytesAsync(ba,_map.Get((Object)(_key)),"myser");
RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="Wait For (myser) myser_ObjectToBytes (Success As";
parent.__c.WaitFor("myser_objecttobytes", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "keyvaluestore", "putmapasync"), (Object)(_myser));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (boolean) result[1];
_bytes = (byte[]) result[2];
;
RDebugUtils.currentLine=6291461;
 //BA.debugLineNum = 6291461;BA.debugLine="If Success Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_success) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=6291462;
 //BA.debugLineNum = 6291462;BA.debugLine="sql1.AddNonQueryToBatch(\"INSERT OR REPLACE INTO";
__ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch("INSERT OR REPLACE INTO main VALUES(?, ?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_key),(Object)(_bytes)}));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=6291464;
 //BA.debugLineNum = 6291464;BA.debugLine="Log(\"Failed to serialize object: \" & Map.Get(ke";
parent.__c.Log("Failed to serialize object: "+BA.ObjectToString(_map.Get((Object)(_key))));
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
;
RDebugUtils.currentLine=6291467;
 //BA.debugLineNum = 6291467;BA.debugLine="Dim SenderFilter As Object = sql1.ExecNonQueryBat";
_senderfilter = __ref._sql1 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=6291468;
 //BA.debugLineNum = 6291468;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "keyvaluestore", "putmapasync"), _senderfilter);
this.state = 14;
return;
case 14:
//C
this.state = -1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=6291469;
 //BA.debugLineNum = 6291469;BA.debugLine="Return Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_success));return;};
RDebugUtils.currentLine=6291470;
 //BA.debugLineNum = 6291470;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}