package cloyd.blink.designerscripts;
import anywheresoftware.b4a.BA;


public class LS_cellitem{

public static void LS_general(anywheresoftware.b4j.objects.LayoutBuilder.LayoutData views, int width, int height, float scale) {
;
//BA.debugLineNum = 2;BA.debugLine="ivwatched.Top = (80dip - ivwatched.Height) / 2"[cellitem/General script]
views.get("ivwatched").setTop((int)(((80d * scale)-(views.get("ivwatched").getPrefHeight()))/2d));

}
}