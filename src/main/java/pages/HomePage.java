package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends TestBase {

	public WebDriverWait wait=new WebDriverWait(driver, 30);

	@FindBy(css="p.guidance-link-text")
	protected WebElement TellMe_More;

	@FindBy(css="span.header__my-gumtree-trigger-text")
	protected WebElement span_Elm;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public TravelMoneyPage clickTravelLinkPage() {
		wait.until(ExpectedConditions.elementToBeClickable(TellMe_More)).click();
		return new TravelMoneyPage(driver);
	}

	public String returnLoggedInUser() {return span_Elm.getText();}

}
