package launch_Browsers;

import org.openqa.selenium.edge.EdgeDriver;

public class Launch_EdgerBrowser 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * Inorder to launch edge browser we need to download msedgedriver.exe file
		 * and need to setup runtime environment variable before launching edge browser
		 * 
		 * 		1.https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/
		 * 		2. Find your edge browser version
		 * 		3. Download msedgedriver.exe w.r.t edge browser version
		 * 
		 */
		
		System.setProperty("webdriver.edge.driver", "E:\\New_browser_Drivers\\msedgedriver.exe");
		EdgeDriver edge=new EdgeDriver();
		edge.get("http://google.com");
		
		System.out.println(edge.getTitle());

	}

}
