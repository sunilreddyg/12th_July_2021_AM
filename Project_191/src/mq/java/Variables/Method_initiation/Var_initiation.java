package mq.java.Variables.Method_initiation;

public class Var_initiation 
{
	
	
	int a;
	int b;
	
	
	//Here methodA intilize data to global variable
	public void methodA()
	{
		a=200;
		b=300;
	}
	
	//Here methodB intilize data to global variable
	public void methodB()
	{
			a=1000;
			b=2000;
	}
		
	

	public static void main(String[] args)
	{
		Var_initiation var=new Var_initiation();
		System.out.println("before initialized value --> "+var.a);
		System.out.println("before initialized value --> "+var.b);
		
		var.methodB();
		var.methodA();
		
		System.out.println("after initialized value --> "+var.a);
		System.out.println("after initialized value --> "+var.b);

	}

}
