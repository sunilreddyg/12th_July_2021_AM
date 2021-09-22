package findelements.WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Read_Next_page_Records {

	public static void main(String[] args) throws Exception
	{
		

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/exchange-traded-funds-etf");
		driver.manage().window().maximize();
		
		
		
		WebElement Next_button=driver.findElement(By.id("bestETFLong_next"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", Next_button);
		
		boolean flag=false;
		do {
			
			//Target Table Location at webpage
			WebElement Table=driver.findElement(By.xpath("//table[@id='bestETFLong']/tbody"));
			//Get all Rows inside table
			List<WebElement> rows=Table.findElements(By.tagName("tr"));
			System.out.println(rows.size());
			//Iterate for number or rows
			for (int i = 0; i < rows.size(); i++) 
			{
				//Each Dynamic row
				String ShareName=rows.get(i).findElements(By.tagName("td")).get(0).getText();
				System.out.println(ShareName);
			}
		
			
		

			//Get Runtime attribute value
			Next_button=driver.findElement(By.id("bestETFLong_next"));
			String Next_btn_runtime_class=Next_button.getAttribute("class");
			flag=Next_btn_runtime_class.contains("disabled");
			
			if(flag==false)
			{
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", Next_button);
				Next_button.click();
				System.out.println("Next button clicked");
			}
			
		} while (flag==false);   //When Next button get disable it stop iteration
		
		
		
		

	}

}
