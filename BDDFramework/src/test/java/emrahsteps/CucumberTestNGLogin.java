package emrahsteps;

import org.testng.Assert;

import emrahutils.EmrahCommonMethods;
import emrahutils.EmrahConfigsReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberTestNGLogin extends EmrahCommonMethods{



	@When("I enter valid credentials")
	public void i_enter_valid_credentials() {
	    sendText(login.username, EmrahConfigsReader.getProperty("username"));
	    sendText(login.password, EmrahConfigsReader.getProperty("password"));
	}

	@When("click on login button")
	public void click_on_login_button() {
	    click(login.loginBtn);
	}

	@Then("I validate home page title")
	public void i_validate_home_page_title() {
	    waitForVisibility(login.quickAccessText);
	    String expectedText = login.quickAccessText.getText();
	    String actualText = "Quick Access";
	    
	    Assert.assertEquals(expectedText, actualText);
	    
	}

}
