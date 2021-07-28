package launch_Browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_Browser {

	public static void main(String[] args) 
	{
		/*
		 * Download geckodriver.exe file
		 * 
		 * 		1. https://github.com/mozilla/geckodriver/releases
		 * 		2. Find firefox browser current version
		 * 		3. Under geckodriver latest releases
		 * 		4. Download geckodriver zip format file w.r.t Operating system
		 */
		
		
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("http://makemytrip.com");
		
		System.out.println(firefox.getTitle());

	}

}
