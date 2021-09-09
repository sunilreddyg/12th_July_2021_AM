package chrome_options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InternetExplore_Options {

	public static void main(String[] args) 
	{
		
		 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		 capabilities.setCapability("requireWindowFocus", true);
		 capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 
		 
		 InternetExplorerOptions options=new InternetExplorerOptions();
		 options.ignoreZoomSettings();
		 options.requireWindowFocus();
		 options.takeFullPageScreenshot();
		 options.introduceFlakinessByIgnoringSecurityDomains();
		 options.merge(capabilities);
		 
		 
		 
		 
		 
		 System.setProperty("webdriver.ie.driver", "driver\\IEDriverServer.exe");
		 WebDriver driver=new InternetExplorerDriver(options);
		 driver.get("http://facebook/com");
		 

	}

}
