package oops.polymorphism.Overloading;

public class Sequence_parameter 
{
	
	
	public void method1(int a, String name)
	{
		System.out.println(a+name);
	}
	
	public void method1(String name, int a)
	{
		System.out.println(name+(a));
	}

	public static void main(String[] args) {
		
		Sequence_parameter obj=new Sequence_parameter();
		obj.method1(10, "Sunil");
		obj.method1("hello", 20);

	}

}
