package pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skynet_HomePage 
{
	WebDriver driver;
	String exP_page_title="My Store";

	public Skynet_HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//It look for object at webpage
	@FindBy(xpath="//a[contains(@class,'login')]") public WebElement Signin;
	
	
	@FindBy(xpath="//input[@id='search_query_top']") public WebElement Search_textbox;
	
	
	public void Verify_page_title()
	{
		String page_title=driver.getTitle();
		System.out.println(page_title.equals(exP_page_title));
	}
	
	
	public void click_signin()
	{
		Signin.click();
	}
	
	public void Enter_text_At_Search_textbox(String text)
	{
		Search_textbox.sendKeys(text);
	}
	
	
	
	
	

}
