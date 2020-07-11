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
RDebugUtils.currentLine=22020096;
 //BA.debugLineNum = 22020096;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=22020098;
 //BA.debugLineNum = 22020098;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22085633;
 //BA.debugLineNum = 22085633;BA.debugLine="xDialog = Dialog";
__ref._xdialog /*cloyd.blink.b4xdialog*/  = _dialog;
RDebugUtils.currentLine=22085634;
 //BA.debugLineNum = 22085634;BA.debugLine="xDialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
__ref._xdialog /*cloyd.blink.b4xdialog*/ ._putattop /*boolean*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i();
RDebugUtils.currentLine=22085635;
 //BA.debugLineNum = 22085635;BA.debugLine="CustomListView1.AsView.Color = xui.Color_Transpar";
__ref._customlistview1 /*b4j.example.customlistview*/ ._asview().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=22085636;
 //BA.debugLineNum = 22085636;BA.debugLine="CustomListView1.sv.Color = xui.Color_Transparent";
__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=22085637;
 //BA.debugLineNum = 22085637;BA.debugLine="mBase.Color = xui.Color_Transparent";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=22085638;
 //BA.debugLineNum = 22085638;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xsearchtemplate", "show"),(int) (20));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=22085639;
 //BA.debugLineNum = 22085639;BA.debugLine="Update(\"\", True)";
__ref._update /*String*/ (null,"",parent.__c.True);
RDebugUtils.currentLine=22085640;
 //BA.debugLineNum = 22085640;BA.debugLine="CustomListView1.JumpToItem(0)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._jumptoitem((int) (0));
RDebugUtils.currentLine=22085641;
 //BA.debugLineNum = 22085641;BA.debugLine="SearchField.Text = \"\"";
__ref._searchfield /*cloyd.blink.b4xfloattextfield*/ ._settext /*String*/ (null,"");
RDebugUtils.currentLine=22085642;
 //BA.debugLineNum = 22085642;BA.debugLine="SearchField.TextField.RequestFocus";
__ref._searchfield /*cloyd.blink.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).RequestFocus();
RDebugUtils.currentLine=22085646;
 //BA.debugLineNum = 22085646;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22609920;
 //BA.debugLineNum = 22609920;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=22609922;
 //BA.debugLineNum = 22609922;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22413312;
 //BA.debugLineNum = 22413312;BA.debugLine="Private Sub AddItemsToList(li As List, full As Str";
RDebugUtils.currentLine=22413313;
 //BA.debugLineNum = 22413313;BA.debugLine="If li.IsInitialized = False Then Return";
if (_li.IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=22413315;
 //BA.debugLineNum = 22413315;BA.debugLine="Dim tf As B4JTextFlow";
_tf = new cloyd.blink.b4jtextflow();
RDebugUtils.currentLine=22413316;
 //BA.debugLineNum = 22413316;BA.debugLine="tf.Initialize";
_tf._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=22413318;
 //BA.debugLineNum = 22413318;BA.debugLine="For i = 0 To li.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_li.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=22413319;
 //BA.debugLineNum = 22413319;BA.debugLine="If CustomListView1.Size >= MaxNumberOfItemsToSho";
if (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()>=__ref._maxnumberofitemstoshow /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=22413320;
 //BA.debugLineNum = 22413320;BA.debugLine="Dim item As String = li.Get(i)";
_item = BA.ObjectToString(_li.Get(_i));
RDebugUtils.currentLine=22413321;
 //BA.debugLineNum = 22413321;BA.debugLine="Dim x As Int = item.ToLowerCase.IndexOf(full)";
_x = _item.toLowerCase().indexOf(_full);
RDebugUtils.currentLine=22413322;
 //BA.debugLineNum = 22413322;BA.debugLine="If x = -1 Then";
if (_x==-1) { 
RDebugUtils.currentLine=22413323;
 //BA.debugLineNum = 22413323;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=22413325;
 //BA.debugLineNum = 22413325;BA.debugLine="Dim pnlColor As Int";
_pnlcolor = 0;
RDebugUtils.currentLine=22413326;
 //BA.debugLineNum = 22413326;BA.debugLine="If CustomListView1.Size = 0 And full.Length > 0";
if (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()==0 && _full.length()>0) { 
_pnlcolor = __ref._itemhightlightcolor /*int*/ ;}
else {
_pnlcolor = __ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor;};
RDebugUtils.currentLine=22413346;
 //BA.debugLineNum = 22413346;BA.debugLine="tf.Reset";
_tf._reset /*cloyd.blink.b4jtextflow*/ (null);
RDebugUtils.currentLine=22413347;
 //BA.debugLineNum = 22413347;BA.debugLine="If x > 0 Then";
if (_x>0) { 
RDebugUtils.currentLine=22413348;
 //BA.debugLineNum = 22413348;BA.debugLine="tf.Append(item.SubString2(0, x)).SetColor(Custo";
_tf._append /*cloyd.blink.b4jtextflow*/ (null,_item.substring((int) (0),_x))._setcolor /*cloyd.blink.b4jtextflow*/ (null,__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextcolor);
 };
RDebugUtils.currentLine=22413350;
 //BA.debugLineNum = 22413350;BA.debugLine="If full.Length > 0 Then";
if (_full.length()>0) { 
RDebugUtils.currentLine=22413351;
 //BA.debugLineNum = 22413351;BA.debugLine="tf.Append(item.SubString2(x, x + full.Length)).";
_tf._append /*cloyd.blink.b4jtextflow*/ (null,_item.substring(_x,(int) (_x+_full.length())))._setcolor /*cloyd.blink.b4jtextflow*/ (null,__ref._texthighlightcolor /*int*/ );
 };
RDebugUtils.currentLine=22413353;
 //BA.debugLineNum = 22413353;BA.debugLine="If x + full.Length < item.Length Then";
if (_x+_full.length()<_item.length()) { 
RDebugUtils.currentLine=22413354;
 //BA.debugLineNum = 22413354;BA.debugLine="tf.Append(item.SubString(x + full.Length)).SetC";
_tf._append /*cloyd.blink.b4jtextflow*/ (null,_item.substring((int) (_x+_full.length())))._setcolor /*cloyd.blink.b4jtextflow*/ (null,__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextcolor);
 };
RDebugUtils.currentLine=22413356;
 //BA.debugLineNum = 22413356;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=22413357;
 //BA.debugLineNum = 22413357;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, CustomListView1.AsV";
_p.SetLayoutAnimated((int) (0),0,0,__ref._customlistview1 /*b4j.example.customlistview*/ ._asview().getWidth(),__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=22413358;
 //BA.debugLineNum = 22413358;BA.debugLine="Dim TextPane As B4XView = tf.CreateTextFlow";
_textpane = new anywheresoftware.b4a.objects.B4XViewWrapper();
_textpane = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tf._createtextflow /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ (null).getObject()));
RDebugUtils.currentLine=22413359;
 //BA.debugLineNum = 22413359;BA.debugLine="p.AddView(TextPane, 0, p.Height / 2 - 12, p.Widt";
_p.AddView((javafx.scene.Node)(_textpane.getObject()),0,_p.getHeight()/(double)2-12,_p.getWidth(),_p.getHeight()/(double)2);
RDebugUtils.currentLine=22413360;
 //BA.debugLineNum = 22413360;BA.debugLine="p.Color = pnlColor";
_p.setColor(_pnlcolor);
RDebugUtils.currentLine=22413361;
 //BA.debugLineNum = 22413361;BA.debugLine="CustomListView1.Add(p, item)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._add(_p,(Object)(_item));
 }
};
RDebugUtils.currentLine=22413364;
 //BA.debugLineNum = 22413364;BA.debugLine="For i = 0 To li.Size - 1";
{
final int step30 = 1;
final int limit30 = (int) (_li.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit30 ;_i = _i + step30 ) {
RDebugUtils.currentLine=22413365;
 //BA.debugLineNum = 22413365;BA.debugLine="Dim item As String = li.Get(i)";
_item = BA.ObjectToString(_li.Get(_i));
RDebugUtils.currentLine=22413366;
 //BA.debugLineNum = 22413366;BA.debugLine="Dim x As Int = item.ToLowerCase.IndexOf(full)";
_x = _item.toLowerCase().indexOf(_full);
RDebugUtils.currentLine=22413367;
 //BA.debugLineNum = 22413367;BA.debugLine="If x = -1 Then";
if (_x==-1) { 
RDebugUtils.currentLine=22413368;
 //BA.debugLineNum = 22413368;BA.debugLine="Continue";
if (true) continue;
 };
 }
};
RDebugUtils.currentLine=22413371;
 //BA.debugLineNum = 22413371;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(cloyd.blink.b4xsearchtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=21823491;
 //BA.debugLineNum = 21823491;BA.debugLine="Public CustomListView1 As CustomListView";
_customlistview1 = new b4j.example.customlistview();
RDebugUtils.currentLine=21823492;
 //BA.debugLineNum = 21823492;BA.debugLine="Private xDialog As B4XDialog";
_xdialog = new cloyd.blink.b4xdialog();
RDebugUtils.currentLine=21823493;
 //BA.debugLineNum = 21823493;BA.debugLine="Public SearchField As B4XFloatTextField";
_searchfield = new cloyd.blink.b4xfloattextfield();
RDebugUtils.currentLine=21823494;
 //BA.debugLineNum = 21823494;BA.debugLine="Private prefixList As Map";
_prefixlist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=21823495;
 //BA.debugLineNum = 21823495;BA.debugLine="Private substringList As Map";
_substringlist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=21823496;
 //BA.debugLineNum = 21823496;BA.debugLine="Public TextHighlightColor As Int = 0xFFFD5C5C";
_texthighlightcolor = (int) (0xfffd5c5c);
RDebugUtils.currentLine=21823497;
 //BA.debugLineNum = 21823497;BA.debugLine="Public ItemHightlightColor As Int = 0x7E008EFF";
_itemhightlightcolor = (int) (0x7e008eff);
RDebugUtils.currentLine=21823498;
 //BA.debugLineNum = 21823498;BA.debugLine="Private MAX_LIMIT = 4 As Int";
_max_limit = (int) (4);
RDebugUtils.currentLine=21823499;
 //BA.debugLineNum = 21823499;BA.debugLine="Public MaxNumberOfItemsToShow As Int = 100";
_maxnumberofitemstoshow = (int) (100);
RDebugUtils.currentLine=21823500;
 //BA.debugLineNum = 21823500;BA.debugLine="Private ItemsCache As List";
_itemscache = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21823501;
 //BA.debugLineNum = 21823501;BA.debugLine="Private AllItems As List";
_allitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21823502;
 //BA.debugLineNum = 21823502;BA.debugLine="Public SelectedItem As String";
_selecteditem = "";
RDebugUtils.currentLine=21823503;
 //BA.debugLineNum = 21823503;BA.debugLine="Private LastTerm As String";
_lastterm = "";
RDebugUtils.currentLine=21823507;
 //BA.debugLineNum = 21823507;BA.debugLine="End Sub";
return "";
}
public String  _customlistview1_itemclick(cloyd.blink.b4xsearchtemplate __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "customlistview1_itemclick", true))
	 {return ((String) Debug.delegate(ba, "customlistview1_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Private Sub CustomListView1_ItemClick (Index As In";
RDebugUtils.currentLine=22347777;
 //BA.debugLineNum = 22347777;BA.debugLine="If Value = \"\" Then Return";
if ((_value).equals((Object)(""))) { 
if (true) return "";};
RDebugUtils.currentLine=22347778;
 //BA.debugLineNum = 22347778;BA.debugLine="SelectedItem = Value";
__ref._selecteditem /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=22347779;
 //BA.debugLineNum = 22347779;BA.debugLine="xDialog.Close(xui.DialogResponse_Positive)";
__ref._xdialog /*cloyd.blink.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=22347780;
 //BA.debugLineNum = 22347780;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=21889027;
 //BA.debugLineNum = 21889027;BA.debugLine="Dim height As Int";
_height = 0;
RDebugUtils.currentLine=21889028;
 //BA.debugLineNum = 21889028;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then height = 220dip El";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
_height = __c.DipToCurrent((int) (220));}
else {
_height = __c.DipToCurrent((int) (300));};
RDebugUtils.currentLine=21889029;
 //BA.debugLineNum = 21889029;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (300)),_height);
RDebugUtils.currentLine=21889030;
 //BA.debugLineNum = 21889030;BA.debugLine="mBase.LoadLayout(\"SearchTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("SearchTemplate",ba);
RDebugUtils.currentLine=21889031;
 //BA.debugLineNum = 21889031;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=21889032;
 //BA.debugLineNum = 21889032;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=21889033;
 //BA.debugLineNum = 21889033;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = 0xFF";
__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor = (int) (0xff555555);
RDebugUtils.currentLine=21889034;
 //BA.debugLineNum = 21889034;BA.debugLine="CustomListView1.DefaultTextColor = xui.Color_Whit";
__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=21889036;
 //BA.debugLineNum = 21889036;BA.debugLine="Dim sv As ScrollPane = CustomListView1.sv";
_sv = new anywheresoftware.b4j.objects.ScrollPaneWrapper();
_sv = (anywheresoftware.b4j.objects.ScrollPaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ScrollPaneWrapper(), (javafx.scene.control.ScrollPane)(__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getObject()));
RDebugUtils.currentLine=21889037;
 //BA.debugLineNum = 21889037;BA.debugLine="sv.StyleClasses.Add(\"b4xdialog\")";
_sv.getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=21889038;
 //BA.debugLineNum = 21889038;BA.debugLine="sv.InnerNode.StyleClasses.Add(\"b4xdialog\")";
_sv.getInnerNode().getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=21889040;
 //BA.debugLineNum = 21889040;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=21889041;
 //BA.debugLineNum = 21889041;BA.debugLine="jo.RunMethod(\"RemoveWarning\", Null)";
_jo.RunMethod("RemoveWarning",(Object[])(__c.Null));
RDebugUtils.currentLine=21889044;
 //BA.debugLineNum = 21889044;BA.debugLine="ItemsCache.Initialize";
__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=21889045;
 //BA.debugLineNum = 21889045;BA.debugLine="prefixList.Initialize";
__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=21889046;
 //BA.debugLineNum = 21889046;BA.debugLine="substringList.Initialize";
__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=21889052;
 //BA.debugLineNum = 21889052;BA.debugLine="End Sub";
return "";
}
public String  _resize(cloyd.blink.b4xsearchtemplate __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "resize", true))
	 {return ((String) Debug.delegate(ba, "resize", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper _c = null;
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
RDebugUtils.currentLine=21954561;
 //BA.debugLineNum = 21954561;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="Dim c As B4XView = CustomListView1.AsView";
_c = new anywheresoftware.b4a.objects.B4XViewWrapper();
_c = __ref._customlistview1 /*b4j.example.customlistview*/ ._asview();
RDebugUtils.currentLine=21954563;
 //BA.debugLineNum = 21954563;BA.debugLine="c.SetLayoutAnimated(0, 0, c.Top, Width, Height -";
_c.SetLayoutAnimated((int) (0),0,_c.getTop(),_width,_height-_c.getTop());
RDebugUtils.currentLine=21954564;
 //BA.debugLineNum = 21954564;BA.debugLine="CustomListView1.Base_Resize(Width, c.Height)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._base_resize(_width,_c.getHeight());
RDebugUtils.currentLine=21954565;
 //BA.debugLineNum = 21954565;BA.debugLine="End Sub";
return "";
}
public String  _searchfield_enterpressed(cloyd.blink.b4xsearchtemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "searchfield_enterpressed", true))
	 {return ((String) Debug.delegate(ba, "searchfield_enterpressed", null));}
RDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Private Sub SearchField_EnterPressed";
RDebugUtils.currentLine=22282241;
 //BA.debugLineNum = 22282241;BA.debugLine="If CustomListView1.Size > 0 And LastTerm.Length >";
if (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()>0 && __ref._lastterm /*String*/ .length()>0) { 
RDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="CustomListView1_ItemClick(0, CustomListView1.Get";
__ref._customlistview1_itemclick /*String*/ (null,(int) (0),__ref._customlistview1 /*b4j.example.customlistview*/ ._getvalue((int) (0)));
 };
RDebugUtils.currentLine=22282244;
 //BA.debugLineNum = 22282244;BA.debugLine="End Sub";
return "";
}
public String  _searchfield_textchanged(cloyd.blink.b4xsearchtemplate __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "searchfield_textchanged", true))
	 {return ((String) Debug.delegate(ba, "searchfield_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Private Sub SearchField_TextChanged (Old As String";
RDebugUtils.currentLine=22151169;
 //BA.debugLineNum = 22151169;BA.debugLine="Update(New, False)";
__ref._update /*String*/ (null,_new,__c.False);
RDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Private Sub Update(Term As String, Force As Boolea";
RDebugUtils.currentLine=22216705;
 //BA.debugLineNum = 22216705;BA.debugLine="If Term = LastTerm And Force = False Then Return";
if ((_term).equals(__ref._lastterm /*String*/ ) && _force==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="LastTerm = Term";
__ref._lastterm /*String*/  = _term;
RDebugUtils.currentLine=22216707;
 //BA.debugLineNum = 22216707;BA.debugLine="If xui.IsB4J = False Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()==__c.False) { 
RDebugUtils.currentLine=22216708;
 //BA.debugLineNum = 22216708;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._customlistview1 /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=22216709;
 //BA.debugLineNum = 22216709;BA.debugLine="Dim p As B4XView = CustomListView1.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=22216710;
 //BA.debugLineNum = 22216710;BA.debugLine="p.RemoveViewFromParent";
_p.RemoveViewFromParent();
RDebugUtils.currentLine=22216711;
 //BA.debugLineNum = 22216711;BA.debugLine="ItemsCache.Add(p)";
__ref._itemscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_p.getObject()));
 }
};
 };
RDebugUtils.currentLine=22216714;
 //BA.debugLineNum = 22216714;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4j.example.customlistview*/ ._clear();
RDebugUtils.currentLine=22216716;
 //BA.debugLineNum = 22216716;BA.debugLine="Dim str1, str2 As String";
_str1 = "";
_str2 = "";
RDebugUtils.currentLine=22216717;
 //BA.debugLineNum = 22216717;BA.debugLine="str1 = Term.ToLowerCase";
_str1 = _term.toLowerCase();
RDebugUtils.currentLine=22216718;
 //BA.debugLineNum = 22216718;BA.debugLine="If Term = \"\" Then";
if ((_term).equals("")) { 
RDebugUtils.currentLine=22216719;
 //BA.debugLineNum = 22216719;BA.debugLine="AddItemsToList(AllItems, str1)";
__ref._additemstolist /*String*/ (null,__ref._allitems /*anywheresoftware.b4a.objects.collections.List*/ ,_str1);
 }else {
RDebugUtils.currentLine=22216721;
 //BA.debugLineNum = 22216721;BA.debugLine="If str1.Length > MAX_LIMIT Then";
if (_str1.length()>__ref._max_limit /*int*/ ) { 
RDebugUtils.currentLine=22216722;
 //BA.debugLineNum = 22216722;BA.debugLine="str2 = str1.SubString2(0, MAX_LIMIT)";
_str2 = _str1.substring((int) (0),__ref._max_limit /*int*/ );
 }else {
RDebugUtils.currentLine=22216724;
 //BA.debugLineNum = 22216724;BA.debugLine="str2 = str1";
_str2 = _str1;
 };
RDebugUtils.currentLine=22216726;
 //BA.debugLineNum = 22216726;BA.debugLine="AddItemsToList(prefixList.Get(str2), str1)";
__ref._additemstolist /*String*/ (null,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_str2)))),_str1);
RDebugUtils.currentLine=22216727;
 //BA.debugLineNum = 22216727;BA.debugLine="AddItemsToList(substringList.Get(str2), str1)";
__ref._additemstolist /*String*/ (null,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_str2)))),_str1);
 };
RDebugUtils.currentLine=22216729;
 //BA.debugLineNum = 22216729;BA.debugLine="End Sub";
return "";
}
public String  _setindex(cloyd.blink.b4xsearchtemplate __ref,Object _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xsearchtemplate";
if (Debug.shouldDelegate(ba, "setindex", true))
	 {return ((String) Debug.delegate(ba, "setindex", new Object[] {_index}));}
Object[] _obj = null;
RDebugUtils.currentLine=22544384;
 //BA.debugLineNum = 22544384;BA.debugLine="Public Sub SetIndex(Index As Object)";
RDebugUtils.currentLine=22544385;
 //BA.debugLineNum = 22544385;BA.debugLine="Dim obj() As Object";
_obj = new Object[(int) (0)];
{
int d0 = _obj.length;
for (int i0 = 0;i0 < d0;i0++) {
_obj[i0] = new Object();
}
}
;
RDebugUtils.currentLine=22544386;
 //BA.debugLineNum = 22544386;BA.debugLine="obj = Index";
_obj = (Object[])(_index);
RDebugUtils.currentLine=22544387;
 //BA.debugLineNum = 22544387;BA.debugLine="prefixList = obj(0)";
__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_obj[(int) (0)]));
RDebugUtils.currentLine=22544388;
 //BA.debugLineNum = 22544388;BA.debugLine="substringList = obj(1)";
__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/  = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_obj[(int) (1)]));
RDebugUtils.currentLine=22544389;
 //BA.debugLineNum = 22544389;BA.debugLine="Dim AllItems As List = obj(2)";
_allitems = new anywheresoftware.b4a.objects.collections.List();
_allitems = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_obj[(int) (2)]));
RDebugUtils.currentLine=22544390;
 //BA.debugLineNum = 22544390;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22478848;
 //BA.debugLineNum = 22478848;BA.debugLine="Public Sub SetItems(Items As List) As Object";
RDebugUtils.currentLine=22478849;
 //BA.debugLineNum = 22478849;BA.debugLine="Dim startTime As Long";
_starttime = 0L;
RDebugUtils.currentLine=22478850;
 //BA.debugLineNum = 22478850;BA.debugLine="startTime = DateTime.Now";
_starttime = __c.DateTime.getNow();
RDebugUtils.currentLine=22478851;
 //BA.debugLineNum = 22478851;BA.debugLine="Dim noDuplicates As Map";
_noduplicates = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=22478852;
 //BA.debugLineNum = 22478852;BA.debugLine="noDuplicates.Initialize";
_noduplicates.Initialize();
RDebugUtils.currentLine=22478853;
 //BA.debugLineNum = 22478853;BA.debugLine="prefixList.Clear";
__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=22478854;
 //BA.debugLineNum = 22478854;BA.debugLine="substringList.Clear";
__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=22478855;
 //BA.debugLineNum = 22478855;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=22478856;
 //BA.debugLineNum = 22478856;BA.debugLine="Dim li As List";
_li = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22478857;
 //BA.debugLineNum = 22478857;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=22478858;
 //BA.debugLineNum = 22478858;BA.debugLine="Dim item As String";
_item = "";
RDebugUtils.currentLine=22478859;
 //BA.debugLineNum = 22478859;BA.debugLine="item = Items.Get(i)";
_item = BA.ObjectToString(_items.Get(_i));
RDebugUtils.currentLine=22478860;
 //BA.debugLineNum = 22478860;BA.debugLine="item = item.ToLowerCase";
_item = _item.toLowerCase();
RDebugUtils.currentLine=22478861;
 //BA.debugLineNum = 22478861;BA.debugLine="noDuplicates.Clear";
_noduplicates.Clear();
RDebugUtils.currentLine=22478862;
 //BA.debugLineNum = 22478862;BA.debugLine="For start = 0 To item.Length";
{
final int step14 = 1;
final int limit14 = _item.length();
_start = (int) (0) ;
for (;_start <= limit14 ;_start = _start + step14 ) {
RDebugUtils.currentLine=22478863;
 //BA.debugLineNum = 22478863;BA.debugLine="Dim count As Int = 1";
_count = (int) (1);
RDebugUtils.currentLine=22478864;
 //BA.debugLineNum = 22478864;BA.debugLine="Do While count <= MAX_LIMIT And start + count <";
while (_count<=__ref._max_limit /*int*/  && _start+_count<=_item.length()) {
RDebugUtils.currentLine=22478865;
 //BA.debugLineNum = 22478865;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=22478866;
 //BA.debugLineNum = 22478866;BA.debugLine="str = item.SubString2(start, start + count)";
_str = _item.substring(_start,(int) (_start+_count));
RDebugUtils.currentLine=22478867;
 //BA.debugLineNum = 22478867;BA.debugLine="If noDuplicates.ContainsKey(str) = False Then";
if (_noduplicates.ContainsKey((Object)(_str))==__c.False) { 
RDebugUtils.currentLine=22478868;
 //BA.debugLineNum = 22478868;BA.debugLine="noDuplicates.Put(str, \"\")";
_noduplicates.Put((Object)(_str),(Object)(""));
RDebugUtils.currentLine=22478869;
 //BA.debugLineNum = 22478869;BA.debugLine="If start = 0 Then m = prefixList Else m = sub";
if (_start==0) { 
_m = __ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ ;}
else {
_m = __ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ ;};
RDebugUtils.currentLine=22478870;
 //BA.debugLineNum = 22478870;BA.debugLine="li = m.Get(str)";
_li = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.Get((Object)(_str))));
RDebugUtils.currentLine=22478871;
 //BA.debugLineNum = 22478871;BA.debugLine="If li.IsInitialized = False Then";
if (_li.IsInitialized()==__c.False) { 
RDebugUtils.currentLine=22478872;
 //BA.debugLineNum = 22478872;BA.debugLine="li.Initialize";
_li.Initialize();
RDebugUtils.currentLine=22478873;
 //BA.debugLineNum = 22478873;BA.debugLine="m.Put(str, li)";
_m.Put((Object)(_str),(Object)(_li.getObject()));
 };
RDebugUtils.currentLine=22478875;
 //BA.debugLineNum = 22478875;BA.debugLine="li.Add(Items.Get(i)) 'Preserve the original c";
_li.Add(_items.Get(_i));
 };
RDebugUtils.currentLine=22478877;
 //BA.debugLineNum = 22478877;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
 }
;
 }
};
 }
};
RDebugUtils.currentLine=22478881;
 //BA.debugLineNum = 22478881;BA.debugLine="Log(\"Index time: \" & (DateTime.Now - startTime) &";
__c.Log("Index time: "+BA.NumberToString((__c.DateTime.getNow()-_starttime))+" ms ("+BA.NumberToString(_items.getSize())+" Items)");
RDebugUtils.currentLine=22478882;
 //BA.debugLineNum = 22478882;BA.debugLine="AllItems = Items";
__ref._allitems /*anywheresoftware.b4a.objects.collections.List*/  = _items;
RDebugUtils.currentLine=22478883;
 //BA.debugLineNum = 22478883;BA.debugLine="Return Array(prefixList, substringList, AllItems)";
if (true) return (Object)(new Object[]{(Object)(__ref._prefixlist /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()),(Object)(__ref._substringlist /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()),(Object)(__ref._allitems /*anywheresoftware.b4a.objects.collections.List*/ .getObject())});
RDebugUtils.currentLine=22478884;
 //BA.debugLineNum = 22478884;BA.debugLine="End Sub";
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