package oops.polymorphism.Overloading;

public class Same_Parameters 
{
	
	public void print()
	{
		System.out.println("default");
	}

	public void print(int a)
	{
		System.out.println(a);
	}
	
	public void print(int a, int b)
	{
		System.out.println(a+b);
	}


	public static void main(String[] args) 
	{
		Same_Parameters  obj=new Same_Parameters();
		obj.print();
		obj.print(10);
		obj.print(100, 200);

	}

}
