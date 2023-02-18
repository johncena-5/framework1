package testScripts;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class Script4 extends BaseClass{
	
	@Test
	public void forthTest()
	{
		SoftAssert soft = new SoftAssert();
		home.clickGears();
		home.clickSkillraryDemoApp();
		web.handleChildBrowser();
		soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());
		web.scrollToElement(skillraryDemo.getContactUs());
		skillraryDemo.clickContactUs();
		soft.assertTrue(contactus.pageHeader().isDisplayed());
		
		List<String> data = excel.fetchDatatFromExcel("Sheet1");
		contactus.submitDetails(data.get(0), data.get(1), data.get(2), data.get(3));
		
		soft.assertAll();
	}

}
