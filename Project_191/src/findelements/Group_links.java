package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_links {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Close the tool tip window
		driver.findElement(By.className("closeit")).click();
		Thread.sleep(3000);
		
		
		WebElement Footer_Area=driver.findElement(By.xpath("//ul[@class='fs-2 flex ls-reset']"));
		//Find list of links under footer area using tagname
		List<WebElement> Footer_links=Footer_Area.findElements(By.tagName("a"));
		System.out.println("Number of footer links available is --> "+Footer_links.size());
		
		//Iterator for number of links
		for (int i = 0; i < Footer_links.size(); i++) 
		{
				//Read each object from list using index number
				WebElement Eachlink=Footer_links.get(i);
				String Linkname=Eachlink.getText();
				String LinkHref=Eachlink.getAttribute("href");
				System.out.println(Linkname+"         "+LinkHref);
				
				//Click Each link
				Eachlink.click();
				Thread.sleep(2000);
				
				System.out.println("for link -> "+Linkname+" title presented is -->  "+driver.getTitle());
				
				//Navigate to Previous page [SO that we can click on Next link]
				driver.navigate().back();
				
				//Restore all Page references to avoid staleElement Reference exception
				Footer_Area=driver.findElement(By.xpath("//ul[@class='fs-2 flex ls-reset']"));
				Footer_links=Footer_Area.findElements(By.tagName("a"));
		}

	}

}
