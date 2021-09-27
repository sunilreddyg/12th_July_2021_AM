package mq.selenium.library;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonReusableActions 
{
	
	public WebDriver driver;
	String drivers_path="drivers\\";
	public WebDriverWait wait;
	String mainwindow;
	
	
	/*
	 * KeyWord:--> This keyword launch any browsers [chrome,Firefox,Edge]
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	
	public void launch_browser(String browsername)
	{
		switch (browsername) 
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", drivers_path+"chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", drivers_path+"geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
		case "edge":
			System.setProperty("webdriver.edge.driver", drivers_path+"msedgedriver.exe");
			driver=new EdgeDriver();
			break;

		default: 
			System.err.println("The defined browser name is mismatched");
		break;
		}
	}
	
	
	/*
	 * KeyWord:--> This keyword load webpage [http://  or https://]
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	 public void Loadwebpage(String url)
	 {
		driver.get(url);
		driver.manage().window().maximize();
	 }
	 
	 
	 /*
	 * KeyWord:--> This keyword manage implicit timeout
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	 public void set_implicitwait(int time_in_sec)
	 {
		 driver.manage().timeouts().implicitlyWait(time_in_sec, TimeUnit.SECONDS);
	 }
	 
	 /*
	 * KeyWord:--> This keyword manage Page laod timeout
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	 public void set_page_load_timeout(int time_in_sec)
	 {
		 driver.manage().timeouts().pageLoadTimeout(time_in_sec, TimeUnit.SECONDS);
	 }
		
	 
	 /*
	 * KeyWord:--> This keyword manage asynchronized timeout
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	 public void set_async_timeout(int time_in_sec)
	 {
		 driver.manage().timeouts().setScriptTimeout(time_in_sec, TimeUnit.SECONDS);
	 }
	 
	 
	 /*
	 * KeyWord:--> This keyword set explicit wait time
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	 public void set_explicitwait_time(int Time_in_sec)
	 {
		wait=new WebDriverWait(driver, Time_in_sec);
	 }
	 
	 
	 /*
	 * KeyWord:--> This keyword Manage timeout until expected visible
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
	 * KeyWord:--> This keyword Type text into editbox
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void Type_text(String xpath,String inputdata)
	{
		wait_until_object_visibleAt_page(xpath);
		driver.findElement(By.xpath(xpath)).clear();
		driver.findElement(By.xpath(xpath)).sendKeys(inputdata);
	}
	
	 /*
	 * KeyWord:--> This keyword Click on location [Buttons,Radio,Checkbox,list---etc]
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void click_element(String xpath)
	{
		wait_until_object_visibleAt_page(xpath);
		driver.findElement(By.xpath(xpath)).click();
	}
	
	
	/*
	 * KeyWord:--> This keyword Click on location [Buttons,Radio,Checkbox,list---etc]
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void click_element__with_js(String xpath)
	{
		
		wait_until_object_visibleAt_page(xpath);
		WebElement element=driver.findElement(By.xpath(xpath));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
	}
	
	
	/*
	 * Manage static timeout
	 */
	public void javawait(int ms)
	{
		try {
			Thread.sleep(ms);
		} catch (Exception e) {
			
		}
	}
	
	
	/*
	 * KeyWord:--> This keyword Select Dropdown Option using [visibletext,value,index] numbers
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void select_dropdown(String xpath,String option,String selector)
	{
		wait_until_object_visibleAt_page(xpath);
		Select dropdown_selector=new Select(driver.findElement(By.xpath(xpath)));
		switch (selector) {
		case "text":
			dropdown_selector.selectByVisibleText(option);
			break;
			
		case "value":
			dropdown_selector.selectByValue(option);
			break;
			
		case "index":
			int index = Integer.parseInt(option);
			dropdown_selector.selectByIndex(index);
			break;

		default:
			break;
		}
	}
	
	
	/*
	 * KeyWord:--> This keyword perform mouseHover action on element
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void mousehover(String xpath)
	{
		wait_until_object_visibleAt_page(xpath);
		WebElement element=driver.findElement(By.xpath(xpath));
		new Actions(driver).moveToElement(element).perform();
	}
	
	
	/*
	 * KeyWord:--> This keyword perform RightClick action on element
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void RightClick_Action(String xpath)
	{
		wait_until_object_visibleAt_page(xpath);
		WebElement element=driver.findElement(By.xpath(xpath));
		new Actions(driver).contextClick(element).perform();
	}
	
	/*
	 * KeyWord:--> This keyword perform DragAndDrop option
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void drag_element_to_Target(String Sourcexpath,String targetxpath)
	{
		
		WebElement Src=driver.findElement(By.xpath(Sourcexpath));
		WebElement Target=driver.findElement(By.xpath(targetxpath));
		new Actions(driver).dragAndDrop(Src, Target).perform();
	}
	
	
	/*
	 * KeyWord:--> This keyword drag object to requried target
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void drag_element_to_required_coordinates(String Sourcexpath,int xcoord, int ycoord)
	{
		
		WebElement Src=driver.findElement(By.xpath(Sourcexpath));
		new Actions(driver).dragAndDropBy(Src, xcoord, ycoord).perform();
	}
	
	/*
	 * KeyWord:--> Send keys any requied location
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void Send_keyboard_keys(String xpath,Keys key)
	{
		
		WebElement Src=driver.findElement(By.xpath(xpath));
		new Actions(driver).sendKeys(Src, key).perform();
	}
	
	
	/*
	 * KeyWord:--> CaptureScreen
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void capturescreen(String imagename)
	{
		//Get System Default Time
				Date date=new Date();    //import java.util;
				//create simple dataformat
				DateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
				//Cover default system date using date formatter
				String time=df.format(date);
				
				
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
		try {
			FileUtils.copyFile(src, new File("screens\\"+time+imagename+".png"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	
	/*
	 * KeyWord:--> Switch to Next window
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void switchto_next_window()
	{
		mainwindow=driver.getWindowHandle();
		Set<String> allwindowids=driver.getWindowHandles();
		for (String eachwindow : allwindowids) {
			driver.switchTo().window(eachwindow);
		}
	}
	
	
	/*
	 * KeyWord:--> Switch back to mainwindow
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void switchto_mainwindow()
	{
		driver.switchTo().window(mainwindow);
	}
	
	

	/*
	 * KeyWord:--> Switch requried window using it's title
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void swithcto_window_using_page_title(String exp_title)
	{
		//Get All Dynamic WIndow ID's
		Set<String> AllWindowIDS=driver.getWindowHandles();
		//Using foreach loop iterate for number of windows
		for (String EachWindowID : AllWindowIDS) 
		{
			driver.switchTo().window(EachWindowID);
			
			//Get Current FoCused window tilte
			String runtime_title=driver.getTitle();
			//System.out.println(runtime_title);
			
			if(runtime_title.contains(exp_title))
			{
				break;  //IT stop iteration   [Break will stop iteration when required title found]
			}
			
		}
	}
	
	
	/*
	 * KeyWord:--> CLose alert 
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	
	public void close_alert()
	{
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * KeyWord:-->Verify alert text
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public boolean verify_alert_text(String Exp_text)
	{
		boolean flag=false;
		try {
			String alert_text=driver.switchTo().alert().getText();
			flag=alert_text.equals(Exp_text);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
		
	}
	
	
	

	/*
	 * KeyWord:-->Switch To frame
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void switchto_Frame(int frameindex)
	{
		try {
			driver.switchTo().frame(frameindex);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	/*
	 * KeyWord:-->Verify title presented at webpage
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public boolean verify_title_presented(String exp_title)
	{
		String Runtime_title=driver.getTitle();
		boolean flag=Runtime_title.contains(exp_title);
		return flag;
	}
	
	
	/*
	 * KeyWord:-->Verify Url presented
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public boolean verify_url_presented(String exp_url)
	{
		String Runtime_url=driver.getCurrentUrl();
		boolean flag=Runtime_url.contains(exp_url);
		return flag;
	}
	
	
	/*
	 * KeyWord:-->Verify required element presented at source
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public boolean verify_element_presented_at_source(String exp_source)
	{
		String Runtime_page_Source=driver.getPageSource();
		boolean flag=Runtime_page_Source.contains(exp_source);
		return flag;
	}
	
	
	/*
	 * KeyWord:-->THis keyword verify text presented at required location
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public boolean get_element_text(String xpath,String exp_text)
	{
		String element_text=driver.findElement(By.xpath(xpath)).getText();
		boolean flag=element_text.equalsIgnoreCase(exp_text);
		return flag;
	}
	
	/*
	 * Keyword:-->This keyword return selected value from dropdown
	 * Author:-->
	 * Parameters used:-->
	 */
	public String getSelectedValueInDropDown(String xpath)
	{
		String OptionText=new Select(driver.findElement(By.xpath(xpath))).getFirstSelectedOption().getText();
		return OptionText;
	}

	
	/*
	 * Keyword:-->This keyword return all selected options
	 * Author:-->
	 * Parameters used:-->
	 */
	public List<WebElement> getAll_Dropdown_Options(String xpath)
	{
			WebElement Dropdown=driver.findElement(By.xpath(xpath));
			return new Select(driver.findElement(By.xpath(xpath))).getOptions();
	}
	
	/*
	 * Keyword:-->This keyword return selected value from dropdown
	 * Author:-->
	 * Parameters used:-->
	 */
	public boolean Verify_RequiredOption_Available(String xpath,String optioname)
	{
			return getAll_Dropdown_Options(xpath).contains(optioname);
	}


}
