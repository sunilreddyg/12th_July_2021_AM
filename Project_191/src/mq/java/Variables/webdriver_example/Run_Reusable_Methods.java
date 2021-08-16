package mq.java.Variables.webdriver_example;

public class Run_Reusable_Methods 
{

	public static void main(String[] args) 
	{
		
		
		Reusable_methods obj=new Reusable_methods();
		obj.launch_chrome_browser();
		
		
		obj.url="http://facebook.com";  //New url is assigned at runtime to global variable
		obj.Load_Webpage();
		

	}

}
