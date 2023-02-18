package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SkillraryDemoAppPage {
	// declaration
	@FindBy(xpath = "//a[@class='navbar-brand']")
	private WebElement pageheader;
	@FindBy(id = "course")
	private WebElement courseButton;
	@FindBy(xpath = "//span[@class=\"wrappers\"]/a[text()='Selenium Training']")
	private WebElement seleniumTrainingLink;
	@FindBy(name = "addresstype")
	private WebElement categorydropdown;
	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contactUsLink;

	// Initialization
	public SkillraryDemoAppPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public WebElement getPageHeader() {
		return pageheader;
	}

	public void mouseHoverToCourse(WebDriverUtility web) {
		web.mouseHover(courseButton);
	}

	public void clickSeleniumTraining() {
		seleniumTrainingLink.click();
	}

	public void selectCategory(WebDriverUtility web, int index) {
		web.dropDown(categorydropdown, index);
	}

	public WebElement getContactUs() {
		return contactUsLink;
	}

	public void clickContactUs() {
		contactUsLink.click();
	}

}
