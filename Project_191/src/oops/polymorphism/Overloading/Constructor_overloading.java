package oops.polymorphism.Overloading;

import org.openqa.selenium.WebDriver;

public class Constructor_overloading 
{

	public Constructor_overloading() 
	{
		System.out.println("Default value");
	}
	
	
	public Constructor_overloading(String name) 
	{
		System.out.println(name);
	}
	
	public Constructor_overloading(WebDriver driver) 
	{
		System.out.println(driver.getTitle());
	}
	
}
