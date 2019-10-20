package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class NetBankLoginPage extends TestBase {
    public NetBankLoginPage(WebDriver driver) {
        super(driver);
    }
    public WebDriverWait wait=new WebDriverWait(driver, 30);
    @FindBy(name="txtMyClientNumber$field")
    protected WebElement userName;

    @FindBy(name="txtMyPassword$field")
    protected WebElement userPass;

    public boolean UserName() {
        wait.until(ExpectedConditions.elementToBeClickable(userName));
        return userName.isDisplayed();
    }

    public boolean UserPassword() {
        wait.until(ExpectedConditions.elementToBeClickable(userPass));
        return userPass.isDisplayed();
    }
}
