package webdriver_colors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Colors_example {

	public static void main(String[] args) {
		
		
		final Color HEX_COLOUR = Color.fromString("#2F7ED8");
		System.out.println("Color is displayed in RGB format "+HEX_COLOUR.asRgb());
		System.out.println("Color is displayed in RGBA format is --> "+HEX_COLOUR.asRgba());
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		Color Loging_btn_color=Color.fromString(driver.findElement(By.xpath("//input[@id='btnLogin']")).getCssValue("color"));
		System.out.println(Loging_btn_color.asHex());
		System.out.println(Loging_btn_color.asRgb());
		System.out.println(Loging_btn_color.asRgba());
		System.out.println(Loging_btn_color.equals("white"));
		
		
		
		
		
		
		
		

	}

}
