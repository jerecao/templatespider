package com.xnx3.spider;

import org.jvnet.substance.theme.SubstanceCremeTheme;

import com.xnx3.UI;
import com.xnx3.util.AutoRun;

/**
 * 入口
 * @author 管雷鸣
 */
public class Entry {
	public static void main(String[] args) {
//		SubstanceOfficeBlue2007LookAndFeel s = new UI().UseLookAndFeelBySubstance();
//		s.setCurrentTheme(new SubstanceCremeTheme());
//		s.setCurrentBorderPainter(new StandardBorderPainter());
//		s.setCurrentWatermark(new SubstanceBubblesWatermark());
		new UI().UseLookAndFeelBySubstance().setCurrentTheme(new SubstanceCremeTheme());
		
		Global.mainUI.setVisible(true);
		Global.mainUI.getTextArea_url().setText(Global.TEXTAREA_REMIND);
		Global.mainUI.moreSetPanel_showAndHidden();
		
		AutoRun.versionCheck();//版本检测
	}
}
