package launch_Browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_Browser 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Note:--> Inorder to open chrome browser using webdriver script
		 * 			we need to downlaod chromedriver.exe file first, Then
		 * 			set environment variable for chromedriver.exe file.
		 * 
		 * 
		 * 			1. https://chromedriver.chromium.org/downloads
		 * 			2. Find your chrome browser version
		 * 					OPen Chrome Settings ---> Hover on Help Menu -->Select About google chrome
		 * 			3. If you are using Chrome version 92, please download ChromeDriver 92.0.4515.43
		 * 			4. Click on ChromeDriver 92.0.4515.43 link
		 * 			5. Select operating system [for windows machine downlaod zip format file]
		 * 			6. After downloaded save file into backupdrive and unzip file
		 * 			7. for this action we receive chromedriver.exe file	
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://facebook.com");
		
		System.out.println(chrome.getTitle());
		
		
		
		
		

	}

}
