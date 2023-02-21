package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class Script3 extends BaseClass {
	
	@Test
	public void thirdTest()
	{
		SoftAssert soft = new SoftAssert();
		home.SearchFor("core java for selenium");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		home.clickSearchButton();
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
