package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	//store all webelements of login page
	
	@FindBy(name = "username") private WebElement usnTB;
	@FindBy(name = "pwd") private WebElement passTB;
	@FindBy(id = "loginButton") private WebElement loginbutton;
	@FindBy(name = "remember") private WebElement keepmelogincheckbox;
	@FindBy(partialLinkText = "Actimin") private WebElement actimindlink;
	@FindBy(partialLinkText = "License") private WebElement licenselink;

	//initialization
	public LoginPage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getUsnTB() {
		return usnTB;
	}

	public WebElement getPassTB() {
		return passTB;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public WebElement getKeepmelogincheckbox() {
		return keepmelogincheckbox;
	}

	public WebElement getActimindlink() {
		return actimindlink;
	}

	public WebElement getLicenselink() {
		return licenselink;
	}
	
	//operational methods
	public void validLogin(String validusn,String validpass) 
	{
		usnTB.sendKeys(validusn);
		passTB.sendKeys(validpass);
		loginbutton.click();
	}
	public void invalidLogin(String invalidusn,String invalidpass) 
	{
		usnTB.sendKeys(invalidusn);
		passTB.sendKeys(invalidpass);
		loginbutton.click();
	}
}