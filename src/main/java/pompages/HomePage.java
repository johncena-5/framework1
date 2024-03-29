package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.BaseClass;


public class HomePage {
	
	
	// Declaration
	
	
	@FindBy(xpath = "//img[@alt=\"SkillRary\"]")
	private WebElement logo;
	@FindBy(name = "q")
	private WebElement searchTF;
	@FindBy(xpath = "//input[@value=\"go\"]")
	private WebElement searchButton;
	@FindBy(xpath = "//a[.=' GEARS ']")
	private WebElement gearstab;
	@FindBy(xpath = "//ul[@class=\"dropdown-menu gear_menu\"]/li/a[text()=' SkillRary Demo APP']")
	private WebElement demoApplink;

	// Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public WebElement getlogo() {
		return logo;
	}
	
	public void searchFor(String data)
	{
		searchTF.sendKeys(data);
		searchButton.click();
	}
	public void search_in( String data  ,WebDriver driver)
	{
		WebElement element = searchTF;
		String js = "arguments[0].setAttribute('value','"+data+"')";
		((JavascriptExecutor)driver).executeScript(js,element);
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",searchButton);
	}

	public void clickGears() {
		gearstab.click();
	}

	public void clickSkillraryDemoApp() {
		demoApplink.click();
	}
}
