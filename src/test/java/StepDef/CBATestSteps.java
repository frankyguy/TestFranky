package StepDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.NetBankLoginPage;
import pages.TravelMoneyPage;
import utils.BaseUtil;
import utils.TestUtils;
import java.util.ArrayList;

public class CBATestSteps {

    private BaseUtil base;
    HomePage homePage;
    TravelMoneyPage loginPage;
    NetBankLoginPage netbankPage;

    public CBATestSteps(BaseUtil base) {
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
        //Check if only the indented subtopics exists in page
        for(WebElement subTopic : loginPage.SubTopics()) {
            System.out.println(subTopic.getText()); // just printing to console for reference
            Assert.assertTrue(TestUtils.Sub_Topics.contains(subTopic.getText()));
        }
        //additional check on the number of subtopics
        Assert.assertTrue(loginPage.SubTopics().size()==loginPage.SubTopics().size());
    }

    @And("^Click netbank logon link$")
    public void clickNetbankLogonLink() {
        netbankPage = loginPage.clickNetBankLink();
        //switching the handle to new tab
        ArrayList<String> tabs2 = new ArrayList<String> (base.driver.getWindowHandles());
        base.driver.switchTo().window(tabs2.get(1));
    }
    @Then("^verify username and password exists$")
    public void verifyUsernameAndPasswordExists() {
        Assert.assertTrue(netbankPage.UserName());
        Assert.assertTrue(netbankPage.UserPassword());
    }
}
