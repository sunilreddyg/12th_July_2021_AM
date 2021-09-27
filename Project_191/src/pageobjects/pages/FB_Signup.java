package pageobjects.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FB_Signup
{
	
    WebDriver driver;
	
	public FB_Signup(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}


@FindBy(xpath = "//input[@name='firstname']")
public WebElement  reg_firstname;

@FindBy(xpath = "//input[@name='lastname']")
public WebElement  reg_lastname;

@FindBy(xpath = "//input[@name='reg_email__']")
public WebElement  reg_email;

@FindBy(xpath = "//input[@name='reg_email_confirmation__']")
public WebElement  reg_retype_email;

@FindBy(xpath = "//input[@name='reg_passwd__']")
public WebElement  password;

@FindBy(xpath = "//select[@name='birthday_day']")
public WebElement  dob_day;

@FindBy(xpath = "//select[@name='birthday_month']")
public WebElement  dob_month;

@FindBy(xpath = "//select[@name='birthday_year']")
public WebElement  dob_year;

@FindBy(xpath = "//input[@value='1']")
public WebElement  female_gender;

@FindBy(xpath = "//input[@value='2']")
public WebElement  male_gender;

@FindBy(xpath = "//input[@value='-1']")
public WebElement  custom_gender;

@FindBy(xpath = "//button[@name='websubmit']")
public WebElement  signUp;


public void enterfistname(String fname)
{
	reg_firstname.sendKeys(fname);
}


public void enterlastname(String lname)
{
	reg_lastname.sendKeys(lname);
}

public void enteremailormobile(String email_or_mobile)
{
	reg_email.sendKeys(email_or_mobile);
}

public void enter_retype_emailormobile(String email_or_mobile)
{
	reg_retype_email.sendKeys(email_or_mobile);
}

public void enterpassword(String pwd)
{
	password.sendKeys(pwd);
}

public void select_date(String date)
{
	new Select(dob_day).selectByVisibleText(date);
}


public void select_month(String month)
{
	new Select(dob_month).selectByVisibleText(month);
}

public void select_year(String year)
{
	new Select(dob_year).selectByVisibleText(year);
}


public void select_female_gender()
{
	female_gender.click();
}


public void select_male_gender()
{
	male_gender.click();
}

public void select_custom_gender()
{
	custom_gender.click();
}

public void click_Singup_button()
{
	signUp.click();
}


}