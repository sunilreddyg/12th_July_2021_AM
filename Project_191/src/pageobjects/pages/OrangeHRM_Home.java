package pageobjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRM_Home 
{
	
	
	@FindBy(xpath="//input[@id='txtUsername']") public WebElement login_username;
	@FindBy(id="txtPassword") public WebElement login_password;
	@FindBy(xpath = "//input[@id='btnLogin']") public WebElement login_submit_button;
	@FindBy(xpath = "//a[contains(.,'Forgot your password?')]") public WebElement forgot_your_password;

}
