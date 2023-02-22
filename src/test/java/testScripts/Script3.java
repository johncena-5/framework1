package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class Script3 extends BaseClass {
	
	@Test
	public void thirdTest()
	{
		SoftAssert soft = new SoftAssert();
		home.searchFor("core java for selenium");
		
		soft.assertTrue(coreJava.pageHeader().isDisplayed());
		coreJava.clickCoreJavaForSelenium();
		soft.assertTrue(selenium.pageHeader().isDisplayed());
	   
		selenium.crossMark();
		
		web.switchToFrame();
		selenium.clickPlayButton();
		selenium.clickPauseButton();
		web.switchBackToFrame();
		selenium.addToWishlistTab();
		soft.assertAll();
	}

}
