package cloyd.blink;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xinputtemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("cloyd.blink", "cloyd.blink.b4xinputtemplate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", cloyd.blink.b4xinputtemplate.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public String _text = "";
public cloyd.blink.b4xdialog _xdialog = null;
public String _regexpattern = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _textfield1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltitle = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public cloyd.blink.main _main = null;
public cloyd.blink.httputils2service _httputils2service = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 3;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Public Text As String";
_text = "";
 //BA.debugLineNum = 5;BA.debugLine="Private xDialog As B4XDialog";
_xdialog = new cloyd.blink.b4xdialog();
 //BA.debugLineNum = 6;BA.debugLine="Public RegexPattern As String";
_regexpattern = "";
 //BA.debugLineNum = 7;BA.debugLine="Public TextField1 As B4XView";
_textfield1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Public lblTitle As Label";
_lbltitle = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public String  _configurefornumbers(boolean _allowdecimals,boolean _allownegative) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Public Sub ConfigureForNumbers (AllowDecimals As B";
 //BA.debugLineNum = 49;BA.debugLine="If AllowDecimals And AllowNegative Then";
if (_allowdecimals && _allownegative) { 
 //BA.debugLineNum = 50;BA.debugLine="RegexPattern = \"^-?(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
_regexpattern = "^-?(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
 }else if(_allowdecimals && _allownegative==__c.False) { 
 //BA.debugLineNum = 52;BA.debugLine="RegexPattern = \"^(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$\"";
_regexpattern = "^(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
 }else if(_allowdecimals==__c.False && _allownegative==__c.True) { 
 //BA.debugLineNum = 54;BA.debugLine="RegexPattern = \"^-?(0|[1-9]\\d*)$\"";
_regexpattern = "^-?(0|[1-9]\\d*)$";
 }else if(_allowdecimals==__c.False && _allownegative==__c.False) { 
 //BA.debugLineNum = 56;BA.debugLine="RegexPattern = \"^(0|[1-9]\\d*)$\"";
_regexpattern = "^(0|[1-9]\\d*)$";
 };
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(int _result) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Private Sub DialogClosed(Result As Int)";
 //BA.debugLineNum = 112;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (_result==_xui.DialogResponse_Positive) { 
 //BA.debugLineNum = 113;BA.debugLine="Text = TextField1.Text";
_text = _textfield1.getText();
 };
 //BA.debugLineNum = 115;BA.debugLine="TextField1.Text = Text";
_textfield1.setText(_text);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(cloyd.blink.b4xdialog _dialog) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
 //BA.debugLineNum = 91;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 15;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
_mbase = _xui.CreatePanel(ba,"mBase");
 //BA.debugLineNum = 16;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 80dip)";
_mbase.SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (80)));
 //BA.debugLineNum = 17;BA.debugLine="mBase.LoadLayout(\"B4XInputTemplate\")";
_mbase.LoadLayout("B4XInputTemplate",ba);
 //BA.debugLineNum = 18;BA.debugLine="TextField1.TextColor = xui.Color_White";
_textfield1.setTextColor(_xui.Color_White);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public boolean  _isvalid(String _new) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Private Sub IsValid(New As String) As Boolean";
 //BA.debugLineNum = 78;BA.debugLine="Return RegexPattern = \"\" Or Regex.IsMatch(RegexPa";
if (true) return (_regexpattern).equals("") || __c.Regex.IsMatch(_regexpattern,_new);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return false;
}
public void  _show(cloyd.blink.b4xdialog _dialog) throws Exception{
ResumableSub_Show rsub = new ResumableSub_Show(this,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(cloyd.blink.b4xinputtemplate parent,cloyd.blink.b4xdialog _dialog) {
this.parent = parent;
this._dialog = _dialog;
}
cloyd.blink.b4xinputtemplate parent;
cloyd.blink.b4xdialog _dialog;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 95;BA.debugLine="xDialog = Dialog";
parent._xdialog = _dialog;
 //BA.debugLineNum = 96;BA.debugLine="xDialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
parent._xdialog._putattop /*boolean*/  = parent._xui.getIsB4A() || parent._xui.getIsB4i();
 //BA.debugLineNum = 97;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,this,(int) (20));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 98;BA.debugLine="TextField1.Text = Text";
parent._textfield1.setText(parent._text);
 //BA.debugLineNum = 99;BA.debugLine="Validate(Text)";
parent._validate(parent._text);
 //BA.debugLineNum = 100;BA.debugLine="TextField1.RequestFocus";
parent._textfield1.RequestFocus();
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _textfield1_action() throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Private Sub TextField1_Action";
 //BA.debugLineNum = 82;BA.debugLine="TextField1_EnterPressed";
_textfield1_enterpressed();
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public String  _textfield1_enterpressed() throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Private Sub TextField1_EnterPressed";
 //BA.debugLineNum = 86;BA.debugLine="If IsValid(TextField1.Text) Then xDialog.Close(xu";
if (_isvalid(_textfield1.getText())) { 
_xdialog._close /*boolean*/ (_xui.DialogResponse_Positive);};
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public String  _textfield1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Private Sub TextField1_TextChanged (Old As String,";
 //BA.debugLineNum = 61;BA.debugLine="Validate (New)";
_validate(_new);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public String  _validate(String _new) throws Exception{
int _bordercolor = 0;
boolean _enabled = false;
 //BA.debugLineNum = 64;BA.debugLine="Private Sub Validate (New As String)";
 //BA.debugLineNum = 65;BA.debugLine="Dim BorderColor As Int = xui.Color_White";
_bordercolor = _xui.Color_White;
 //BA.debugLineNum = 66;BA.debugLine="Dim enabled As Boolean = True";
_enabled = __c.True;
 //BA.debugLineNum = 67;BA.debugLine="If IsValid(New) = False Then";
if (_isvalid(_new)==__c.False) { 
 //BA.debugLineNum = 68;BA.debugLine="If New.Length > 0 Then";
if (_new.length()>0) { 
 //BA.debugLineNum = 69;BA.debugLine="BorderColor = xui.Color_Red";
_bordercolor = _xui.Color_Red;
 };
 //BA.debugLineNum = 71;BA.debugLine="enabled = False";
_enabled = __c.False;
 };
 //BA.debugLineNum = 73;BA.debugLine="xDialog.SetButtonState(xui.DialogResponse_Positiv";
_xdialog._setbuttonstate /*String*/ (_xui.DialogResponse_Positive,_enabled);
 //BA.debugLineNum = 74;BA.debugLine="TextField1.SetColorAndBorder(xui.Color_Transparen";
_textfield1.SetColorAndBorder(_xui.Color_Transparent,__c.DipToCurrent((int) (1)),_bordercolor,__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "DIALOGCLOSED"))
	return _dialogclosed(((Number)args[0]).intValue());
if (BA.fastSubCompare(sub, "GETPANEL"))
	return _getpanel((cloyd.blink.b4xdialog) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
