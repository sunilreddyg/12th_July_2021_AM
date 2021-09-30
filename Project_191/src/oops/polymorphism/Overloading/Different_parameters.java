package oops.polymorphism.Overloading;

public class Different_parameters 
{
	
	public void print(String name)
	{
		System.out.println("productname is --> "+name);
	}
	
	public void print(double price)
	{
		System.out.println("prdocut price is ---> "+price);
	}

	
	public static void main(String[] args) 
	{
		Different_parameters obj=new Different_parameters();
		obj.print("Iphone");
		obj.print(35000.00);

	}

}
