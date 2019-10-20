package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class TravelMoneyPage extends TestBase {

	public TravelMoneyPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@itemprop=\"articleBody\"]//h2")
	protected List<WebElement> subTopics;
	
	@FindBy(xpath="//div[@itemprop=\"articleBody\"]//p[contains(.,\"Log on to \")]//a")
	protected WebElement netBank;

	public String getLogInPageTitle() {
		return driver.getTitle();
	}
	
	public List<WebElement> SubTopics() {
		return subTopics;
	}

	public NetBankLoginPage clickNetBankLink() {
		netBank.click();
		return new NetBankLoginPage(driver);
	}


}
