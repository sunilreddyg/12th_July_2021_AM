package mq.selenium.library;

public class Run_Common_Reusable_Action_With_Inheritance extends CommonReusableActions
{

	public void setup_browser(String browsername,String url,int ims,int ems)
	{
		launch_browser(browsername);
		Loadwebpage(url);
		set_implicitwait(ims);
		set_explicitwait_time(ems);
		
	}
	
	public void user_login()
	{
		Type_text("//input[@id='txtUsername']", "Admin");
		Type_text("//input[@id='txtPassword']", "admin123");
		click_element("//input[@id='btnLogin']");
	}
	
	public void close_browser()
	{
		driver.close();
	}
	
	public static void main(String args[])
	{
		Run_Common_Reusable_Action_With_Inheritance obj=new Run_Common_Reusable_Action_With_Inheritance();
		String appurl="https://opensource-demo.orangehrmlive.com/";
		obj.setup_browser("chrome", appurl, 30, 20);
		obj.user_login();
	}

}
