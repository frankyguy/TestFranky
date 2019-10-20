package StepDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.NetBankLoginPage;
import pages.TravelMoneyPage;
import utils.BaseUtil;
import utils.TestUtils;

import java.util.ArrayList;
import java.util.List;

public class loginSteps {

    private BaseUtil base;
    HomePage homePage;
    TravelMoneyPage loginPage;
    NetBankLoginPage netbankPage;

    public loginSteps(BaseUtil base) {
        this.base = base;
    }

    @Given("^I am on CBA home page$")
    public void iAmOnCBAHomePage() {
        base.driver.get(base.projectProperties.getProperty("url"));
        homePage=new HomePage(base.driver);
    }

    @When("^I click tell me more in travel money section$")
    public void iClickTellMeMoreInTravelMoneySection() {
        loginPage=homePage.clickTravelLinkPage();
    }

    @Then("^verify all sub topics exist$")
    public void verifyAllSubTopicsExist() {
        //List<WebElement> subTopics = base.driver.findElements(By.xpath("//div[@itemprop=\"articleBody\"]//h2"));

        for(WebElement subTopic : loginPage.SubTopics()) {
            System.out.println(subTopic.getText()); // just to show that it prints text
            Assert.assertTrue(TestUtils.Sub_Topics.contains(subTopic.getText()));
        }
        Assert.assertTrue(loginPage.SubTopics().size()==loginPage.SubTopics().size());
    }

    @And("^Click netbank logon link$")
    public void clickNetbankLogonLink() {
        //base.driver.findElement(By.xpath("//div[@itemprop=\"articleBody\"]//p[contains(.,\"Log on to \")]//a")).click();
        netbankPage = loginPage.clickNetBankLink();
        ArrayList<String> tabs2 = new ArrayList<String> (base.driver.getWindowHandles());
        base.driver.switchTo().window(tabs2.get(1));
    }
    @Then("^verify username and password exists$")
    public void verifyUsernameAndPasswordExists() {
        Assert.assertTrue(netbankPage.UserName());
        Assert.assertTrue(netbankPage.UserPassword());
    }



    /*@And("^I click SignIn link$")
    public void iClickSignInLink() {
        loginPage = homePage.clickLogInButton();
        Assert.assertTrue(loginPage.getLogInPageTitle().contains("commbank"));
    }

    @And("^I sign in with ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String username, String password) {
        homePage = loginPage.logIn(username,password);
    }

    @Then("^I should see the home page with user as \"([^\"]*)\" logged in$")
    public void iShouldSeeTheHomePageWithUserAsLoggedIn(String spanTxt) throws Throwable {
        Assert.assertTrue(homePage.returnLoggedInUser().contains(spanTxt));
    }*/
}
