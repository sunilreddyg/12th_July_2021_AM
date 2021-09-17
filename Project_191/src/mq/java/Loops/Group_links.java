package mq.java.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_links {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		String links[]={"Sign Up","Log In","Messenger",
				"Games","Terms","Services","Careers","Cookies","Jobs","About"};
		
		
		for (int i = 0; i < links.length; i++) 
		{
			String Eachlink = links[i];
			driver.findElement(By.linkText(Eachlink)).click();
			System.out.println(driver.getTitle());
			
			Thread.sleep(2000);
			driver.navigate().back();
			
		}
		
		
		
		

	}

}
