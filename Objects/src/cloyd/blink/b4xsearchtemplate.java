package cloyd.blink;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xsearchtemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("cloyd.blink", "cloyd.blink.b4xsearchtemplate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", cloyd.blink.b4xsearchtemplate.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public b4j.example.customlistview _customlistview1 = null;
public cloyd.blink.b4xdialog _xdialog = null;
public cloyd.blink.b4xfloattextfield _searchfield = null;
public anywheresoftware.b4a.objects.collections.Map _prefixlist = null;
public anywheresoftware.b4a.objects.collections.Map _substringlist = null;
public int _texthighlightcolor = 0;
public int _itemhightlightcolor = 0;
public int _max_limit = 0;
public int _maxnumberofitemstoshow = 0;
public anywheresoftware.b4a.objects.collections.List _itemscache = null;
public anywheresoftware.b4a.objects.collections.List _allitems = null;
public String _selecteditem = "";
public String _lastterm = "";
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public cloyd.blink.main _main = null;
public cloyd.blink.httputils2service _httputils2service = null;
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(cloyd.blink.b4xsearchtemplate __ref,cloyd.blink.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="End Sub";
return null;
}
public void  _show(cloyd.blink.b4xsearchtemplate __ref,cloyd.blink.b4xdialog _dialog) throws Exception{
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_dialog}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(cloyd.blink.b4xsearchtemplate parent,cloyd.blink.b4xsearchtemplate __ref,cloyd.blink.b4xdialog _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
this.__ref = parent;
}
cloyd.blink.b4xsearchtemplate __ref;
cloyd.blink.b4xsearchtemplate parent;
cloyd.blink.b4xdialog _dialog;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xsearchtemplate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="xDialog = Dialog";
__ref._xdialog /*cloyd.blink.b4xdialog*/  = _dialog;
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="xDialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
__ref._xdialog /*cloyd.blink.b4xdialog*/ ._putattop /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i();
RDebugUtils.currentLine=15007747;
 //BA.debugLineNum = 15007747;BA.debugLine="CustomListView1.AsView.Color = xui.Color_Transpar";
__ref._customlistview1 /*b4j.example.customlistview*/ ._asview().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=15007748;
 //BA.debugLineNum = 15007748;BA.debugLine="CustomListView1.sv.Color = xui.Color_Transparent";
__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=15007749;
 //BA.debugLineNum = 15007749;BA.debugLine="mBase.Color = xui.Color_Transparent";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=15007750;
 //BA.debugLineNum = 15007750;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xsearchtemplate", "show"),(int) (20));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=15007751;
 //BA.debugLineNum = 15007751;BA.debugLine="Update(\"\", True)";
__ref._update /*String*/ (null,"",parent.__c.True);
RDebugUtils.currentLine=15007752;
 //BA.debugLineNum = 15007752;BA.debugLine="CustomListView1.JumpToItem(0)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._jumptoitem((int) (0));
RDebugUtils.currentLine=15007753;
 //BA.debugLineNum = 15007753;BA.debugLine="SearchField.Text = \"\"";
__ref._searchfield /*cloyd.blink.b4xfloattextfield*/ ._settext /*String*/ (null,"");
RDebugUtils.currentLine=15007754;
 //BA.debugLineNum = 15007754;BA.debugLine="SearchField.TextField.RequestFocus";
__ref._searchfield /*cloyd.blink.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).RequestFocus();
RDebugUtils.currentLine=15007758;
 //BA.debugLineNum = 15007758;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _dialogclosed(cloyd.blink.b4xsearchtemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=15532034;
 //BA.debugLineNum = 15532034;BA.debugLine="End Sub";
return "";
}
public String  _additemstolist(cloyd.blink.b4xsearchtemplate __ref,anywheresoftware.b4a.objects.collections.List _li,String _full) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "additemstolist", true))
	 {return ((String) Debug.delegate(ba, "additemstolist", new Object[] {_li,_full}));}
cloyd.blink.b4jtextflow _tf = null;
int _i = 0;
String _item = "";
int _x = 0;
int _pnlcolor = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _textpane = null;
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Private Sub AddItemsToList(li As List, full As Str";
RDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="If li.IsInitialized = False Then Return";
if (_li.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=15335427;
 //BA.debugLineNum = 15335427;BA.debugLine="Dim tf As B4JTextFlow";
_tf = new cloyd.blink.b4jtextflow();
RDebugUtils.currentLine=15335428;
 //BA.debugLineNum = 15335428;BA.debugLine="tf.Initialize";
_tf._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15335430;
 //BA.debugLineNum = 15335430;BA.debugLine="For i = 0 To li.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_li.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=15335431;
 //BA.debugLineNum = 15335431;BA.debugLine="If CustomListView1.Size >= MaxNumberOfItemsToSho";
if (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()>=__ref._maxnumberofitemstoshow /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=15335432;
 //BA.debugLineNum = 15335432;BA.debugLine="Dim item As String = li.Get(i)";
_item = BA.ObjectToString(_li.Get(_i));
RDebugUtils.currentLine=15335433;
 //BA.debugLineNum = 15335433;BA.debugLine="Dim x As Int = item.ToLowerCase.IndexOf(full)";
_x = _item.toLowerCase().indexOf(_full);
RDebugUtils.currentLine=15335434;
 //BA.debugLineNum = 15335434;BA.debugLine="If x = -1 Then";
if (_x==-1) { 
RDebugUtils.currentLine=15335435;
 //BA.debugLineNum = 15335435;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=15335437;
 //BA.debugLineNum = 15335437;BA.debugLine="Dim pnlColor As Int";
_pnlcolor = 0;
RDebugUtils.currentLine=15335438;
 //BA.debugLineNum = 15335438;BA.debugLine="If CustomListView1.Size = 0 And full.Length > 0";
if (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()==0 && _full.length()>0) { 
_pnlcolor = __ref._itemhightlightcolor /*int*/ ;}
else {
_pnlcolor = __ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor;};
RDebugUtils.currentLine=15335458;
 //BA.debugLineNum = 15335458;BA.debugLine="tf.Reset";
_tf._reset /*cloyd.blink.b4jtextflow*/ (null);
RDebugUtils.currentLine=15335459;
 //BA.debugLineNum = 15335459;BA.debugLine="If x > 0 Then";
if (_x>0) { 
RDebugUtils.currentLine=15335460;
 //BA.debugLineNum = 15335460;BA.debugLine="tf.Append(item.SubString2(0, x)).SetColor(Custo";
_tf._append /*cloyd.blink.b4jtextflow*/ (null,_item.substring((int) (0),_x))._setcolor /*cloyd.blink.b4jtextflow*/ (null,__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextcolor);
 };
RDebugUtils.currentLine=15335462;
 //BA.debugLineNum = 15335462;BA.debugLine="If full.Length > 0 Then";
if (_full.length()>0) { 
RDebugUtils.currentLine=15335463;
 //BA.debugLineNum = 15335463;BA.debugLine="tf.Append(item.SubString2(x, x + full.Length)).";
_tf._append /*cloyd.blink.b4jtextflow*/ (null,_item.substring(_x,(int) (_x+_full.length())))._setcolor /*cloyd.blink.b4jtextflow*/ (null,__ref._texthighlightcolor /*int*/ );
 };
RDebugUtils.currentLine=15335465;
 //BA.debugLineNum = 15335465;BA.debugLine="If x + full.Length < item.Length Then";
if (_x+_full.length()<_item.length()) { 
RDebugUtils.currentLine=15335466;
 //BA.debugLineNum = 15335466;BA.debugLine="tf.Append(item.SubString(x + full.Length)).SetC";
_tf._append /*cloyd.blink.b4jtextflow*/ (null,_item.substring((int) (_x+_full.length())))._setcolor /*cloyd.blink.b4jtextflow*/ (null,__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextcolor);
 };
RDebugUtils.currentLine=15335468;
 //BA.debugLineNum = 15335468;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=15335469;
 //BA.debugLineNum = 15335469;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, CustomListView1.AsV";
_p.SetLayoutAnimated((int) (0),0,0,__ref._customlistview1 /*b4j.example.customlistview*/ ._asview().getWidth(),__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=15335470;
 //BA.debugLineNum = 15335470;BA.debugLine="Dim TextPane As B4XView = tf.CreateTextFlow";
_textpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
_textpane.setObject((java.lang.Object)(_tf._createtextflow /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ (null).getObject()));
RDebugUtils.currentLine=15335471;
 //BA.debugLineNum = 15335471;BA.debugLine="p.AddView(TextPane, 0, p.Height / 2 - 12, p.Widt";
_p.AddView((javafx.scene.Node)(_textpane.getObject()),0,_p.getHeight()/(double)2-12,_p.getWidth(),_p.getHeight()/(double)2);
RDebugUtils.currentLine=15335472;
 //BA.debugLineNum = 15335472;BA.debugLine="p.Color = pnlColor";
_p.setColor(_pnlcolor);
RDebugUtils.currentLine=15335473;
 //BA.debugLineNum = 15335473;BA.debugLine="CustomListView1.Add(p, item)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._add(_p,(Object)(_item));
 }
};
RDebugUtils.currentLine=15335476;
 //BA.debugLineNum = 15335476;BA.debugLine="For i = 0 To li.Size - 1";
{
final int step30 = 1;
final int limit30 = (int) (_li.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit30 ;_i = _i + step30 ) {
RDebugUtils.currentLine=15335477;
 //BA.debugLineNum = 15335477;BA.debugLine="Dim item As String = li.Get(i)";
_item = BA.ObjectToString(_li.Get(_i));
RDebugUtils.currentLine=15335478;
 //BA.debugLineNum = 15335478;BA.debugLine="Dim x As Int = item.ToLowerCase.IndexOf(full)";
_x = _item.toLowerCase().indexOf(_full);
RDebugUtils.currentLine=15335479;
 //BA.debugLineNum = 15335479;BA.debugLine="If x = -1 Then";
if (_x==-1) { 
RDebugUtils.currentLine=15335480;
 //BA.debugLineNum = 15335480;BA.debugLine="Continue";
if (true) continue;
 };
 }
};
RDebugUtils.currentLine=15335483;
 //BA.debugLineNum = 15335483;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(cloyd.blink.b4xsearchtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=14745603;
 //BA.debugLineNum = 14745603;BA.debugLine="Public CustomListView1 As CustomListView";
_customlistview1 = new b4j.example.customlistview();
RDebugUtils.currentLine=14745604;
 //BA.debugLineNum = 14745604;BA.debugLine="Private xDialog As B4XDialog";
_xdialog = new cloyd.blink.b4xdialog();
RDebugUtils.currentLine=14745605;
 //BA.debugLineNum = 14745605;BA.debugLine="Public SearchField As B4XFloatTextField";
_searchfield = new cloyd.blink.b4xfloattextfield();
RDebugUtils.currentLine=14745606;
 //BA.debugLineNum = 14745606;BA.debugLine="Private prefixList As Map";
_prefixlist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14745607;
 //BA.debugLineNum = 14745607;BA.debugLine="Private substringList As Map";
_substringlist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14745608;
 //BA.debugLineNum = 14745608;BA.debugLine="Public TextHighlightColor As Int = 0xFFFD5C5C";
_texthighlightcolor = (int) (0xfffd5c5c);
RDebugUtils.currentLine=14745609;
 //BA.debugLineNum = 14745609;BA.debugLine="Public ItemHightlightColor As Int = 0x7E008EFF";
_itemhightlightcolor = (int) (0x7e008eff);
RDebugUtils.currentLine=14745610;
 //BA.debugLineNum = 14745610;BA.debugLine="Private MAX_LIMIT = 4 As Int";
_max_limit = (int) (4);
RDebugUtils.currentLine=14745611;
 //BA.debugLineNum = 14745611;BA.debugLine="Public MaxNumberOfItemsToShow As Int = 100";
_maxnumberofitemstoshow = (int) (100);
RDebugUtils.currentLine=14745612;
 //BA.debugLineNum = 14745612;BA.debugLine="Private ItemsCache As List";
_itemscache = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14745613;
 //BA.debugLineNum = 14745613;BA.debugLine="Private AllItems As List";
_allitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14745614;
 //BA.debugLineNum = 14745614;BA.debugLine="Public SelectedItem As String";
_selecteditem = "";
RDebugUtils.currentLine=14745615;
 //BA.debugLineNum = 14745615;BA.debugLine="Private LastTerm As String";
_lastterm = "";
RDebugUtils.currentLine=14745619;
 //BA.debugLineNum = 14745619;BA.debugLine="End Sub";
return "";
}
public String  _customlistview1_itemclick(cloyd.blink.b4xsearchtemplate __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "customlistview1_itemclick", true))
	 {return ((String) Debug.delegate(ba, "customlistview1_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Private Sub CustomListView1_ItemClick (Index As In";
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="If Value = \"\" Then Return";
if ((_value).equals((Object)(""))) { 
if (true) return "";};
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="SelectedItem = Value";
__ref._selecteditem /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=15269891;
 //BA.debugLineNum = 15269891;BA.debugLine="xDialog.Close(xui.DialogResponse_Positive)";
__ref._xdialog /*cloyd.blink.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=15269892;
 //BA.debugLineNum = 15269892;BA.debugLine="End Sub";
return "";
}
public String  _initialize(cloyd.blink.b4xsearchtemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
int _height = 0;
anywheresoftware.b4j.objects.ScrollPaneWrapper _sv = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=14811139;
 //BA.debugLineNum = 14811139;BA.debugLine="Dim height As Int";
_height = 0;
RDebugUtils.currentLine=14811140;
 //BA.debugLineNum = 14811140;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then height = 220dip El";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
_height = __c.DipToCurrent((int) (220));}
else {
_height = __c.DipToCurrent((int) (300));};
RDebugUtils.currentLine=14811141;
 //BA.debugLineNum = 14811141;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (300)),_height);
RDebugUtils.currentLine=14811142;
 //BA.debugLineNum = 14811142;BA.debugLine="mBase.LoadLayout(\"SearchTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("SearchTemplate",ba);
RDebugUtils.currentLine=14811143;
 //BA.debugLineNum = 14811143;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=14811144;
 //BA.debugLineNum = 14811144;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=14811145;
 //BA.debugLineNum = 14811145;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = 0xFF";
__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor = (int) (0xff555555);
RDebugUtils.currentLine=14811146;
 //BA.debugLineNum = 14811146;BA.debugLine="CustomListView1.DefaultTextColor = xui.Color_Whit";
__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=14811148;
 //BA.debugLineNum = 14811148;BA.debugLine="Dim sv As ScrollPane = CustomListView1.sv";
_sv = new anywheresoftware.b4j.objects.ScrollPaneWrapper();
_sv.setObject((javafx.scene.control.ScrollPane)(__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getObject()));
RDebugUtils.currentLine=14811149;
 //BA.debugLineNum = 14811149;BA.debugLine="sv.StyleClasses.Add(\"b4xdialog\")";
_sv.getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=14811150;
 //BA.debugLineNum = 14811150;BA.debugLine="sv.InnerNode.StyleClasses.Add(\"b4xdialog\")";
_sv.getInnerNode().getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=14811152;
 //BA.debugLineNum = 14811152;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(this));
RDebugUtils.currentLine=14811153;
 //BA.debugLineNum = 14811153;BA.debugLine="jo.RunMethod(\"RemoveWarning\", Null)";
_jo.RunMethod("RemoveWarning",(Object[])(__c.Null));
RDebugUtils.currentLine=14811156;
 //BA.debugLineNum = 14811156;BA.debugLine="ItemsCache.Initialize";
__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=14811157;
 //BA.debugLineNum = 14811157;BA.debugLine="prefixList.Initialize";
__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=14811158;
 //BA.debugLineNum = 14811158;BA.debugLine="substringList.Initialize";
__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=14811164;
 //BA.debugLineNum = 14811164;BA.debugLine="End Sub";
return "";
}
public String  _resize(cloyd.blink.b4xsearchtemplate __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "resize", true))
	 {return ((String) Debug.delegate(ba, "resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="CustomListView1.Base_Resize(Width, Height)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._base_resize(_width,_height);
RDebugUtils.currentLine=14876675;
 //BA.debugLineNum = 14876675;BA.debugLine="End Sub";
return "";
}
public String  _searchfield_enterpressed(cloyd.blink.b4xsearchtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "searchfield_enterpressed", true))
	 {return ((String) Debug.delegate(ba, "searchfield_enterpressed", null));}
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Private Sub SearchField_EnterPressed";
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="If CustomListView1.Size > 0 And LastTerm.Length >";
if (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()>0 && __ref._lastterm /*String*/ .length()>0) { 
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="CustomListView1_ItemClick(0, CustomListView1.Get";
__ref._customlistview1_itemclick /*String*/ (null,(int) (0),__ref._customlistview1 /*b4j.example.customlistview*/ ._getvalue((int) (0)));
 };
RDebugUtils.currentLine=15204356;
 //BA.debugLineNum = 15204356;BA.debugLine="End Sub";
return "";
}
public String  _searchfield_textchanged(cloyd.blink.b4xsearchtemplate __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "searchfield_textchanged", true))
	 {return ((String) Debug.delegate(ba, "searchfield_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Private Sub SearchField_TextChanged (Old As String";
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="Update(New, False)";
__ref._update /*String*/ (null,_new,__c.False);
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="End Sub";
return "";
}
public String  _update(cloyd.blink.b4xsearchtemplate __ref,String _term,boolean _force) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", new Object[] {_term,_force}));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
String _str1 = "";
String _str2 = "";
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Private Sub Update(Term As String, Force As Boolea";
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="If Term = LastTerm And Force = False Then Return";
if ((_term).equals(__ref._lastterm /*String*/ ) && _force==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="LastTerm = Term";
__ref._lastterm /*String*/  = _term;
RDebugUtils.currentLine=15138819;
 //BA.debugLineNum = 15138819;BA.debugLine="If xui.IsB4J = False Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()==__c.False) { 
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=15138821;
 //BA.debugLineNum = 15138821;BA.debugLine="Dim p As B4XView = CustomListView1.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="p.RemoveViewFromParent";
_p.RemoveViewFromParent();
RDebugUtils.currentLine=15138823;
 //BA.debugLineNum = 15138823;BA.debugLine="ItemsCache.Add(p)";
__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_p.getObject()));
 }
};
 };
RDebugUtils.currentLine=15138826;
 //BA.debugLineNum = 15138826;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4j.example.customlistview*/ ._clear();
RDebugUtils.currentLine=15138828;
 //BA.debugLineNum = 15138828;BA.debugLine="Dim str1, str2 As String";
_str1 = "";
_str2 = "";
RDebugUtils.currentLine=15138829;
 //BA.debugLineNum = 15138829;BA.debugLine="str1 = Term.ToLowerCase";
_str1 = _term.toLowerCase();
RDebugUtils.currentLine=15138830;
 //BA.debugLineNum = 15138830;BA.debugLine="If Term = \"\" Then";
if ((_term).equals("")) { 
RDebugUtils.currentLine=15138831;
 //BA.debugLineNum = 15138831;BA.debugLine="AddItemsToList(AllItems, str1)";
__ref._additemstolist /*String*/ (null,__ref._allitems /*anywheresoftware.b4a.objects.collections.List*/ ,_str1);
 }else {
RDebugUtils.currentLine=15138833;
 //BA.debugLineNum = 15138833;BA.debugLine="If str1.Length > MAX_LIMIT Then";
if (_str1.length()>__ref._max_limit /*int*/ ) { 
RDebugUtils.currentLine=15138834;
 //BA.debugLineNum = 15138834;BA.debugLine="str2 = str1.SubString2(0, MAX_LIMIT)";
_str2 = _str1.substring((int) (0),__ref._max_limit /*int*/ );
 }else {
RDebugUtils.currentLine=15138836;
 //BA.debugLineNum = 15138836;BA.debugLine="str2 = str1";
_str2 = _str1;
 };
RDebugUtils.currentLine=15138838;
 //BA.debugLineNum = 15138838;BA.debugLine="AddItemsToList(prefixList.Get(str2), str1)";
__ref._additemstolist /*String*/ (null,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_str2)))),_str1);
RDebugUtils.currentLine=15138839;
 //BA.debugLineNum = 15138839;BA.debugLine="AddItemsToList(substringList.Get(str2), str1)";
__ref._additemstolist /*String*/ (null,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_str2)))),_str1);
 };
RDebugUtils.currentLine=15138841;
 //BA.debugLineNum = 15138841;BA.debugLine="End Sub";
return "";
}
public String  _setindex(cloyd.blink.b4xsearchtemplate __ref,Object _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "setindex", true))
	 {return ((String) Debug.delegate(ba, "setindex", new Object[] {_index}));}
Object[] _obj = null;
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Public Sub SetIndex(Index As Object)";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="Dim obj() As Object";
_obj = new Object[(int) (0)];
{
int d0 = _obj.length;
for (int i0 = 0;i0 < d0;i0++) {
_obj[i0] = new Object();
}
}
;
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="obj = Index";
_obj = (Object[])(_index);
RDebugUtils.currentLine=15466499;
 //BA.debugLineNum = 15466499;BA.debugLine="prefixList = obj(0)";
__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_obj[(int) (0)]));
RDebugUtils.currentLine=15466500;
 //BA.debugLineNum = 15466500;BA.debugLine="substringList = obj(1)";
__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_obj[(int) (1)]));
RDebugUtils.currentLine=15466501;
 //BA.debugLineNum = 15466501;BA.debugLine="AllItems = obj(2)";
__ref._allitems /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(_obj[(int) (2)]));
RDebugUtils.currentLine=15466502;
 //BA.debugLineNum = 15466502;BA.debugLine="End Sub";
return "";
}
public Object  _setitems(cloyd.blink.b4xsearchtemplate __ref,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "setitems", true))
	 {return ((Object) Debug.delegate(ba, "setitems", new Object[] {_items}));}
long _starttime = 0L;
anywheresoftware.b4a.objects.collections.Map _noduplicates = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.List _li = null;
int _i = 0;
String _item = "";
int _start = 0;
int _count = 0;
String _str = "";
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Public Sub SetItems(Items As List) As Object";
RDebugUtils.currentLine=15400961;
 //BA.debugLineNum = 15400961;BA.debugLine="Dim startTime As Long";
_starttime = 0L;
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="startTime = DateTime.Now";
_starttime = __c.DateTime.getNow();
RDebugUtils.currentLine=15400963;
 //BA.debugLineNum = 15400963;BA.debugLine="Dim noDuplicates As Map";
_noduplicates = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15400964;
 //BA.debugLineNum = 15400964;BA.debugLine="noDuplicates.Initialize";
_noduplicates.Initialize();
RDebugUtils.currentLine=15400965;
 //BA.debugLineNum = 15400965;BA.debugLine="prefixList.Clear";
__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=15400966;
 //BA.debugLineNum = 15400966;BA.debugLine="substringList.Clear";
__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=15400967;
 //BA.debugLineNum = 15400967;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15400968;
 //BA.debugLineNum = 15400968;BA.debugLine="Dim li As List";
_li = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15400969;
 //BA.debugLineNum = 15400969;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=15400970;
 //BA.debugLineNum = 15400970;BA.debugLine="Dim item As String";
_item = "";
RDebugUtils.currentLine=15400971;
 //BA.debugLineNum = 15400971;BA.debugLine="item = Items.Get(i)";
_item = BA.ObjectToString(_items.Get(_i));
RDebugUtils.currentLine=15400972;
 //BA.debugLineNum = 15400972;BA.debugLine="item = item.ToLowerCase";
_item = _item.toLowerCase();
RDebugUtils.currentLine=15400973;
 //BA.debugLineNum = 15400973;BA.debugLine="noDuplicates.Clear";
_noduplicates.Clear();
RDebugUtils.currentLine=15400974;
 //BA.debugLineNum = 15400974;BA.debugLine="For start = 0 To item.Length";
{
final int step14 = 1;
final int limit14 = _item.length();
_start = (int) (0) ;
for (;_start <= limit14 ;_start = _start + step14 ) {
RDebugUtils.currentLine=15400975;
 //BA.debugLineNum = 15400975;BA.debugLine="Dim count As Int = 1";
_count = (int) (1);
RDebugUtils.currentLine=15400976;
 //BA.debugLineNum = 15400976;BA.debugLine="Do While count <= MAX_LIMIT And start + count <";
while (_count<=__ref._max_limit /*int*/  && _start+_count<=_item.length()) {
RDebugUtils.currentLine=15400977;
 //BA.debugLineNum = 15400977;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=15400978;
 //BA.debugLineNum = 15400978;BA.debugLine="str = item.SubString2(start, start + count)";
_str = _item.substring(_start,(int) (_start+_count));
RDebugUtils.currentLine=15400979;
 //BA.debugLineNum = 15400979;BA.debugLine="If noDuplicates.ContainsKey(str) = False Then";
if (_noduplicates.ContainsKey((Object)(_str))==__c.False) { 
RDebugUtils.currentLine=15400980;
 //BA.debugLineNum = 15400980;BA.debugLine="noDuplicates.Put(str, \"\")";
_noduplicates.Put((Object)(_str),(Object)(""));
RDebugUtils.currentLine=15400981;
 //BA.debugLineNum = 15400981;BA.debugLine="If start = 0 Then m = prefixList Else m = sub";
if (_start==0) { 
_m = __ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ ;}
else {
_m = __ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ ;};
RDebugUtils.currentLine=15400982;
 //BA.debugLineNum = 15400982;BA.debugLine="li = m.Get(str)";
_li.setObject((java.util.List)(_m.Get((Object)(_str))));
RDebugUtils.currentLine=15400983;
 //BA.debugLineNum = 15400983;BA.debugLine="If li.IsInitialized = False Then";
if (_li.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=15400984;
 //BA.debugLineNum = 15400984;BA.debugLine="li.Initialize";
_li.Initialize();
RDebugUtils.currentLine=15400985;
 //BA.debugLineNum = 15400985;BA.debugLine="m.Put(str, li)";
_m.Put((Object)(_str),(Object)(_li.getObject()));
 };
RDebugUtils.currentLine=15400987;
 //BA.debugLineNum = 15400987;BA.debugLine="li.Add(Items.Get(i)) 'Preserve the original c";
_li.Add(_items.Get(_i));
 };
RDebugUtils.currentLine=15400989;
 //BA.debugLineNum = 15400989;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
 }
;
 }
};
 }
};
RDebugUtils.currentLine=15400993;
 //BA.debugLineNum = 15400993;BA.debugLine="Log(\"Index time: \" & (DateTime.Now - startTime) &";
__c.Log("Index time: "+BA.NumberToString((__c.DateTime.getNow()-_starttime))+" ms ("+BA.NumberToString(_items.getSize())+" Items)");
RDebugUtils.currentLine=15400994;
 //BA.debugLineNum = 15400994;BA.debugLine="AllItems = Items";
__ref._allitems /*anywheresoftware.b4a.objects.collections.List*/  = _items;
RDebugUtils.currentLine=15400995;
 //BA.debugLineNum = 15400995;BA.debugLine="Return Array(prefixList, substringList, AllItems)";
if (true) return (Object)(new Object[]{(Object)(__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()),(Object)(__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()),(Object)(__ref._allitems /*anywheresoftware.b4a.objects.collections.List*/ .getObject())});
RDebugUtils.currentLine=15400996;
 //BA.debugLineNum = 15400996;BA.debugLine="End Sub";
return null;
}
public void RemoveWarning() throws Exception{
	anywheresoftware.b4a.shell.Shell s = anywheresoftware.b4a.shell.Shell.INSTANCE;
	java.lang.reflect.Field f = s.getClass().getDeclaredField("errorMessagesForSyncEvents");
	f.setAccessible(true);
	java.util.HashSet<String> h = (java.util.HashSet<String>)f.get(s);
	if (h == null) {
		h = new java.util.HashSet<String>();
		f.set(s, h);
	}
	h.add("tf_focuschanged");
}
}