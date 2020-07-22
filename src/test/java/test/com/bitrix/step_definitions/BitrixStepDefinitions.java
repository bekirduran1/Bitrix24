package test.com.bitrix.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import test.com.bitrix.pages.BitrixLoginPage;
import test.com.bitrix.utilities.ConfigurationReader;
import test.com.bitrix.utilities.Driver;

public class BitrixStepDefinitions {

    BitrixLoginPage bitrixLoginPage=new BitrixLoginPage();



    @When("User should access login page")
    public void user_should_access_login_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get(ConfigurationReader.getProperty("qaEnvironment"));
    }




    @Then("User should enter credentials")
    public void user_should_enter_credentials() {
        // Write code here that turns the phrase above into concrete actions
        bitrixLoginPage.usernamebox.sendKeys(ConfigurationReader.getProperty("usernamehelpdesk1"));
        bitrixLoginPage.passwordbox.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @Then("User should click Log In button")
    public void user_should_click_log_ın_button() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get(ConfigurationReader.getProperty("qaEnvironment"));
    }

}
