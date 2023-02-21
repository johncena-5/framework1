package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class Script1 extends BaseClass{
	
	
	@Test
	public void firstTest()
	{
		SoftAssert soft = new SoftAssert();
		home.clickGears();
		home.clickSkillraryDemoApp();
		web.handleChildBrowser();
	
	    
		soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());
		skillraryDemo.mouseHoverToCourse(web);
		skillraryDemo.clickSeleniumTraining();
		
		soft.assertTrue(selenium.pageHeader().isDisplayed());
		training.doubleClickPlusButton(web);
		training.addToCart();
		web.acceptAlert();
		web.explicitlyWait(time, training.getItemAddedMessage());
		web.takeScreenshot();
		soft.assertTrue(training.getItemAddedMessage().isDisplayed());
		soft.assertAll();

	}
}
