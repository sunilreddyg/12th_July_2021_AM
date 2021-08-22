package ui_verificationCommands.GetText;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Element_Text {

	public static void main(String[] args) {
		
		/*
		 * Scenario:-->
		 * 			Verify login with invalid email
		 * 	
		 * 			Given site url http://outlook.com
		 * 			And click signin button
		 * 			When user Enter invalid email "info3efdf@gmail.com"
		 * 			And click Next button
		 * 			Then verify Error message displayed at error location
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement Singin_button=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Singin_button.click();
		
		
		//Type Invalid email
		WebElement Email_Textbox=driver.findElement(By.xpath("//input[@id='i0116']"));
		Email_Textbox.clear();
		Email_Textbox.sendKeys("qadarshan@gmail.com"+Keys.ENTER);
		
		
		//Identifying error location and reading text at location
		WebElement Error_location=driver.findElement(By.xpath("//div[@id='usernameError']"));
		String Error_msg=Error_location.getText();
		System.out.println(Error_msg);
		
		
		String Exp_error_msg="That Microsoft account doesn't exist. Enter a different account or get a new one.";
		
		
		if(Error_msg.equals(Exp_error_msg))
			System.out.println("Testpass, As expected error messge displayed at webpage");
		else
			System.out.println("Testfail,Error message not displayed at webpage");

	}

}
