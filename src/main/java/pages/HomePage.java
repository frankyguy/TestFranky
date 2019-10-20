package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.TestUtils;


public class HomePage extends TestBase {

	public WebDriverWait wait=new WebDriverWait(driver, TestUtils.WAIT_FOR_ELEMENT);

	@FindBy(css="p.guidance-link-text")
	protected WebElement TellMe_More;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public TravelMoneyPage clickTravelLinkPage() {
		wait.until(ExpectedConditions.elementToBeClickable(TellMe_More)).click();
		return new TravelMoneyPage(driver);
	}

}
