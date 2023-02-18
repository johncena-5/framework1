package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testing {

	@FindBy(xpath = "//h1[text()='Testing']")
	private WebElement pageHeader;
	@FindBy(id = "Selenium Training")
	private WebElement seleniumImage;
	@FindBy(id = "cartArea")
	private WebElement cartArea;
	@FindBy(xpath = "//ul[@class=\"list-socialicons\"]/li[2]")
	private WebElement facebookIcon;

	public Testing(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String getPageHeader() {
		return pageHeader.getText();
	}

	public WebElement getSeleniumImage() {
		return seleniumImage;
	}

	public WebElement getcartArea() {
		return cartArea;
	}

	public WebElement getFacebookIcon() {
		return facebookIcon;
	}

	public void clickFacebookIcon() {
		facebookIcon.click();
	}

}
