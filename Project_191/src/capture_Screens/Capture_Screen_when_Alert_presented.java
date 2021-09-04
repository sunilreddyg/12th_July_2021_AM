package capture_Screens;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Screen_when_Alert_presented {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		//Click on Alert,Frames and windows menu tab
		driver.findElement(By.xpath("//a[@id='v-pills-messages-tab']")).click();
		Thread.sleep(3000);
		
		//Clicking on Alerts Menu
		driver.findElement(By.xpath("//button[contains(.,'Alerts')]")).click();
		Thread.sleep(2000);
		
		//Click on click me button [This action will bring alert at webpage]
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(5000);
		
		
		//Create obeject for robot class
		Robot robot=new Robot();
		//Creating scree in image format
		BufferedImage image=robot.createScreenCapture(new Rectangle(1300, 800));
		//Using Imageio writer copy image to local utilities
		ImageIO.write(image, "PNG", new File("screens\\alertimage.png"));
		

	}

}
