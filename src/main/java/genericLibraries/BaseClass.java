package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompages.ContactUsPage;
import pompages.CoreJavaForSeleniumPage;
import pompages.CoreJavaForSeleniumTraining;
import pompages.HomePage;
import pompages.SeleniumTrainingPage;
import pompages.SkillraryDemoAppPage;
import pompages.Testing;

public class BaseClass {

	protected PropertiesFileUtility property;
	protected ExcelUtility excel;
	protected WebDriverUtility web;
	protected WebDriver driver;
	protected HomePage home;
	protected SkillraryDemoAppPage skillraryDemo;
	protected CoreJavaForSeleniumTraining selenium;
	protected Testing testing;
	protected CoreJavaForSeleniumPage coreJava;
	protected SeleniumTrainingPage training;
	protected ContactUsPage contactus;
	protected long time;
   
	// @BeforSuite
	// @BeforeTest
	@BeforeClass
	public void classConfiguration() {
		property = new PropertiesFileUtility();
		excel = new ExcelUtility();
		web = new WebDriverUtility();

		property.propertyFileInitialization(IConstantPath.PROPERTIES_FILE_PATH);
		excel.excelIntialization(IConstantPath.Excel_FILE_PATH);
	}

	@BeforeMethod
	public void methodConfiguration() {
		time = Long.parseLong(property.fetchProperty("timeouts"));
		driver = web.openApplication(property.fetchProperty("browser"), property.fetchProperty("url"), time);

		home = new HomePage(driver);
		Assert.assertTrue(home.getlogo().isDisplayed());
		skillraryDemo = new SkillraryDemoAppPage(driver);
		selenium = new CoreJavaForSeleniumTraining(driver);
		testing = new Testing(driver);
		coreJava = new CoreJavaForSeleniumPage(driver);
		training = new SeleniumTrainingPage(driver);
		contactus = new ContactUsPage(driver);
	}

	@AfterMethod

	public void methodTearDown() {
		web.quitBrowser();
	}

	@AfterClass
	public void classTearDown() {
		excel.closeExcel();
	}
	// @AfterTest
	// @AfterSuite

}
