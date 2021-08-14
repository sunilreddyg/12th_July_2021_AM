package mq.java.Variables;

public class Variable_Types 
{
	String email="info.dsnr@gmail.com";   //Global variable [Instant method]
	int b=200;							  //Global variable
	
	static String mobile="903024885";     //Global variable [Static method]
	
	public void method1()
	{
		String name="mindq";          //Local variables access only inside a method
		int x=100;
		
		System.out.println(name);
		System.out.println(x);
	}
	
	
	public static void main(String args[])
	{
		
		//Calling Istant Variable
		Variable_Types var=new Variable_Types();
		String my_email=var.email;
		System.out.println(my_email);
		
		//Calling Static Variable
		String My_num=Variable_Types.mobile;
		System.out.println(My_num);
	
	}
	


}
