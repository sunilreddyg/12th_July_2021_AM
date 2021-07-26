package mq.java.methods.types;

public class MethodTypes 
{
	
	//Void method types doesn't return value to methodname
	public void methodA()
	{
		int a=10;
	}
	
	
	//Otherthan void all types return value to methodname
	public String getname()
	{
		return "sunil";
		
	}
	
	//Otherthan void all types return value to methodname
	public int getcount()
	{
		return 10;
	}
	

	public static void main(String[] args)
	{
		
		MethodTypes MT=new MethodTypes();
		
		//Calling void method
		MT.methodA();
		
		//Calling String return method
		String user=MT.getname();
		System.out.println(user);
		
		//Calling int return method
		int count=MT.getcount();
		System.out.println(count);

	}

}
