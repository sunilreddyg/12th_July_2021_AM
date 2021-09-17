package mq.java.Loops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Do_While_Example {

	public static void main(String[] args) throws Exception 
	{
		
		
		int a=10;
		while(a < 0)   //False Condition
		{
			System.out.println("This statement not going to be printed because Condition is false");
		}
		
		
		int b=10;
		do {
			System.out.println(b+"DO condition");
		} while (b < 0);
		
		
		
		//Dowhile with true condition
		int c=0;
		do {
			c=c+1;
			System.out.println(c);
		} while (c < 10);
		
		
		/*
		 * Dowhile Example:--> Reload page until Expected Title is loaded
		 */
		
		
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		int count=0;
		boolean title_status=false;
		do {
			
			driver.get("https://www.instagram.com");
			try {
				new WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("Instagram"));
				title_status=true;
			} catch (Exception e) {
				
			}
			
			
			count=count+1;
			if(count==10)
			{
				throw new Exception("expected title not loaded ,After 10 attempts breaking iteration");
			}
			
		} while (title_status==false);
		
		System.out.println("Expected page loaded");
		
		
		

	}

}
