package mq.java.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_Login 
{

	public static void main(String[] args) throws Exception 
	{
		/*
		 * example:--> Perform user-login with multiple set of table driven data.
		 */
	
		//Set Runtime environment variable for chrome driver
		String chrome_path="drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
				
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//Double dimensional runtime array
		String userdata[][]=
			{
					{"Newuser1","Newpwd1"},
					{"Newuser2","Newpwd2"},
					{"Newuser3","Newpwd3"},
					{"Newuser4","Newpwd4"},
					{"Newuser5","Newpwd5"},
					{"Newuser6","Newpwd6"},
					{"Newuser7","Newpwd7"},
					{"Newuser8","Newpwd8"},
			};
		
		
		//Iterate for array length
	    for (int i = 0; i < userdata.length; i++) 
	    {
			String username=userdata[i][0];
			String password=userdata[i][1];
			
			WebElement UID=driver.findElement(By.id("email"));
			UID.clear();
			UID.sendKeys(username);
			
			WebElement PWD=driver.findElement(By.id("pass"));
			PWD.clear();
			PWD.sendKeys(password);
			
			Thread.sleep(2000);
			
			
		}
		

	}

}
