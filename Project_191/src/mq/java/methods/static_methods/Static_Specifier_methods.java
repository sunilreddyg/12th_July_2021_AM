package mq.java.methods.static_methods;


public class Static_Specifier_methods 
{
	
	public static void method1()     //Static method/class method
	{
		System.out.println("method1 executed");
		new Static_Specifier_methods().method2();  
		/*
		 * With in static method instant method to call we should 
		 * follow object creation.
		 */
	}
	
	public void method2()			//Instant method
	{
		System.out.println("method2 executed");
		method1(); 
		/*
		 * With in non static method any static method to call no need
		 * to follow object creation.
		 */
	}

	public static void main(String[] args) 
	{
		
		/*
		 * Calling static method and Non static method with in class
		 */
		
		method1();  				//Static mehtod
		new Static_Specifier_methods().method2();    //Non-static method
	}

}
