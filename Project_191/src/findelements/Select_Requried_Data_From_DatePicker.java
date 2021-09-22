package findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Requried_Data_From_DatePicker 
{

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		WebElement Datepicker=driver.findElement(By.xpath("//input[contains(@title,'Journey date')]"));
		Datepicker.click();
		Thread.sleep(4000);
		
		
		String Exp_month="September 2021";
		String Exp_Date="26";
		
		for (int i = 0; i < 4; i++) 
		{
			//Reading First Table header
			WebElement FistTable=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
			String FirstTable_Header=FistTable.findElement(By.tagName("tr")).getText();
			if(FirstTable_Header.equals(Exp_month))
			{
				driver.findElement(By.linkText(Exp_Date)).click();
				break;
			}
			
			//Reading second table header
			WebElement SecondTable=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[2]"));
			String SecondTable_Header=SecondTable.findElement(By.tagName("tr")).getText();
			if(SecondTable_Header.equals(Exp_month))
			{
				driver.findElement(By.linkText(Exp_Date)).click();
				break;
			}
			
			WebElement Next_button=driver.findElement(By.id("cal_showNextMonth"));
			Next_button.click();
			Thread.sleep(1000);
			
		}
		

	}

}
