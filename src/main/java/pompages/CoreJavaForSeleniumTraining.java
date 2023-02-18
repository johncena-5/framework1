package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSeleniumTraining {

	@FindBy(xpath = "//h1")
	private WebElement pageHeader;
	@FindBy(xpath = "//a[text()='X']")
	private WebElement crossMark;
	@FindBy(xpath = "//button[@aria-label=\"Play\"]")
	private WebElement playButton;
	@FindBy(xpath = "//button[@aria-label=\"Pause\"]")
	private WebElement pauseButton;
	@FindBy(xpath = "//span[text()='Add To Wishlist']")
	private WebElement addTowishlistTab;

	public CoreJavaForSeleniumTraining(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement pageHeader() {
		return pageHeader;
	}

	public void crossMark() {
		crossMark.click();
	}

	public void clickPlayButton() {
		playButton.click();
	}

	public void clickPauseButton() {
		pauseButton.click();
	}

	public void addToWishlistTab() {
		addTowishlistTab.click();
	}

}
