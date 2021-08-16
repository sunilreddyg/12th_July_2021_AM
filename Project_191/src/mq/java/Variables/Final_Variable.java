package mq.java.Variables;

public class Final_Variable 
{
	
	int a=100;
	String url="http://facebook.com";
	
	final int c=300;
	final String browser="chrome";
	
	public static void main(String[] args) 
	{
		
		Final_Variable var=new Final_Variable();
		System.out.println("a value is ---> "+var.a);
		
		//Changing variable value at runtime [All global variables accept runtime changes]
		int b=var.a=200;   //New value assigning to variable
		
		System.out.println("b value is ---> "+b);
		
		
		//You can't change final variable value at runtime
		String bname=var.browser;
		System.out.println("final value is --> "+bname);

	}

}
