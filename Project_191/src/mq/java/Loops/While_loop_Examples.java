package mq.java.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class While_loop_Examples {

	public static void main(String[] args) throws Exception 
	{
		
		
		
		int a=0;
		while(a < 10)    //True Condition
		{
			System.out.println(a);
			a=a+1;
		}
		
		
		int b=10;
		while(b < 0)
		{
			System.out.println("false Condition");
		}
		
		
		
		//Manage explicit wait using while loop
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		WebElement Retype_password=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		
		
		int i=0;
		//Condition loop to accepi on Element Hidden State
		while(!Retype_password.isDisplayed())
		{
			System.out.println("Object is Hidden");
			Thread.sleep(1000);
			i=i+1;
			if(i==100)
			{
				throw new Exception("Object is not visible , Attempted 10 Seconds to validate");
			}
		}
		
		
		

	}

}
