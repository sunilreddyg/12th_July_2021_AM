package mq.selenium.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pom_CommonResuableActions 
{
	WebDriver driver;
	WebDriverWait wait;
	
	public Pom_CommonResuableActions(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	 /*
	 * KeyWord:--> This keyword Manage timeout until expected object visible at webpage
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	 public void wait_until_object_visibleAt_page(String element_xpath)
	 {
		 try {
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element_xpath)));
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
	 }
	 
	 /*
	 * POM
	 * KeyWord:--> This keyword Manage timeout until expected object visible at webpage
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	 public void wait_until_object_visibleAt_page(WebElement Element)
	 {
		 try {
			
			wait.until(ExpectedConditions.visibilityOf(Element));
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
	 }
	 
	 /*
	 * POM
	 * KeyWord:--> This keyword click on element
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	 public void clickon_element(WebElement Element)
	 {
		 try {
			
			wait.until(ExpectedConditions.visibilityOf(Element)).click();
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
	 }
	 
	 
	 
	 
	 

}
