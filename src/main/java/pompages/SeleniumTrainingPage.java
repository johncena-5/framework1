package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SeleniumTrainingPage {

	// Declaration
	@FindBy(xpath = "//h1[text()='Selenium Training']")
	private WebElement PageHeader;
	@FindBy(id = "add")
	private WebElement plusButton;
	@FindBy(xpath = "//button[text()=' Add to Cart']")
	private WebElement addToCartButton;
	@FindBy(id = "callout")
	private WebElement itemAddedMessage;

	// Initialization
	public SeleniumTrainingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilization
	public WebElement getPageHeader() {
		return PageHeader;
	}

	public void doubleClickPlusButton(WebDriverUtility web) {
		web.doubleClick(plusButton);
	}

	public void addToCart() {
		addToCartButton.submit();
	}

	public WebElement getItemAddedMessage() {
		return itemAddedMessage;					
	}
}
