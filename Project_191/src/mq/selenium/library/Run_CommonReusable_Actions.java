package mq.selenium.library;


public class Run_CommonReusable_Actions 
{

	public static void main(String[] args) 
	{
		
				CommonReusableActions actions=new CommonReusableActions();
				actions.launch_browser("edge");
				actions.Loadwebpage("https://opensource-demo.orangehrmlive.com/");
				actions.set_implicitwait(20);
				actions.set_explicitwait_time(30);
				actions.wait_until_object_visibleAt_page("//input[@id='txtUsername']");
				actions.Type_text("//input[@id='txtUsername']", "Admin");
				actions.Type_text("//input[@id='txtPassword']", "admin123");
				actions.click_element("//input[@id='btnLogin']");
				actions.javawait(5000);
				actions.click_element("//b[contains(.,'Admin')]");
				actions.Type_text("//input[contains(@id,'userName')]", "Aravind");
				actions.select_dropdown("//select[contains(@id,'userType')]", "ESS", "text");

	}

}
