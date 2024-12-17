package emrahpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import emrahbase.EmrahBaseClass;

public class HRMWebPage {
	
	@FindBy(id="txtUsername")
	public WebElement username;
	
	@FindBy(id="txtPassword")
	public WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement loginBtn;
	
	@FindBy(xpath="//span[text()='Quick Access']")
	public WebElement quickAccessText;
	
	
	public HRMWebPage() {
		PageFactory.initElements(EmrahBaseClass.driver, this);
	}

}
