package emrahsteps;

import org.testng.Assert;

import emrahutils.EmrahCommonMethods;
import emrahutils.EmrahConfigsReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberTestNGLogin2 extends EmrahCommonMethods{



	@When("Dogru deger giriyorum")
	public void dogru_deger_giriyorum() {
	    sendText(login.username, EmrahConfigsReader.getProperty("username"));
	    sendText(login.password, EmrahConfigsReader.getProperty("password"));
	}

	@When("kayit ol butona tikliyorum")
	public void kayit_ol_butona_tikliyorum() {
	    click(login.loginBtn);
	}

	@Then("basligi kontrol ediyorum")
	public void basligi_kontrol_ediyorum() {
	    waitForVisibility(login.quickAccessText);
	    String expectedText = login.quickAccessText.getText();
	    String actualText = "Quick Access";
	    
	    Assert.assertEquals(expectedText, actualText);
	    
	}

}
