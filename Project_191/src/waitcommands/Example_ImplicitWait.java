package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_ImplicitWait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();// TODO Auto-generated method stub
		
		
		long start_time=System.currentTimeMillis();
		
		
			try {
				driver.findElement(By.id("email"));     //Implicitwait enable on NoSuchElemnet Exception
			} catch (Exception e) {
				
			}
		
		System.out.println(System.currentTimeMillis()-start_time+"  ---> Time in milliseconds");

	}

}
