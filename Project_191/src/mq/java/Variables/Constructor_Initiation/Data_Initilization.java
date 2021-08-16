package mq.java.Variables.Constructor_Initiation;

public class Data_Initilization 
{
	

	
	int a;
	int b;
	
	public Data_Initilization(int x, int y)    //Initializing Data through constructor
	{
		a=x;
		b=y;
	}
	
	public void methodA()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	

	public static void main(String[] args) {
		
		
			Data_Initilization data=new Data_Initilization(100, 200);
			data.methodA();

	}

}
