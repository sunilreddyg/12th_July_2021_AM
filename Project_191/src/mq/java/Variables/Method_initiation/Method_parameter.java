package mq.java.Variables.Method_initiation;

public class Method_parameter 
{
	
	int a;
	int b;
	
	//Here method is initlilize data to global varible
	public void mehtodA(int x , int y)
	{
		a=x;
		b=y;
	}
	
	

	public static void main(String[] args) {
		
		Method_parameter obj=new Method_parameter();
		obj.mehtodA(100, 200);    
		System.out.println(obj.a);
		System.out.println(obj.b);
	}

}
