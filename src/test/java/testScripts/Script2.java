package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class Script2 extends BaseClass {
	
	@Test
	public void secondTest()
	{
		home.search_in("gears",driver);
		home.clickGears();
		home.clickSkillraryDemoApp();
		web.handleChildBrowser();
		
		soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());
		skillraryDemo.selectCategory(web, 1);
		//soft.assertEquals(false, false);
		web.dragAndDrop(testing.getSeleniumImage(), testing.getcartArea());
		web.scrollToElement(testing.getFacebookIcon());
		testing.clickFacebookIcon();
		soft.assertAll();
		
	}
}
