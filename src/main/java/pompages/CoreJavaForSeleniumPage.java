package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSeleniumPage {

	@FindBy(xpath = "//h2[text()='core java for selenium']")
	private WebElement pageHeader;
	@FindBy(xpath = "//a[text()=' Core Java For Selenium Trainin']")
	private WebElement coreJavaForSelenium;

	public CoreJavaForSeleniumPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public WebElement pageHeader() {
		return pageHeader;
	}

	public void clickCoreJavaForSelenium() {
		coreJavaForSelenium.click();
	}

}
