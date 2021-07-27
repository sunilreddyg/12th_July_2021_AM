package mq.java.methods.types;

public class Calculator 
{

	public int add()
	{
		int a=100;
		int b=200;
		
		int c=a+b;
		return c;
	}
	
	public int sub()
	{
		int x=300;
		int y=200;
		
		int z=x-y;
		return z;
		
	}


	public static void main(String[] args) 
	{
		
		Calculator cal=new Calculator();
		int total=cal.add();
		System.out.println("total displayed is -> "+total);
		
		int finalsub=cal.sub();
		System.out.println(finalsub);

	}

}
