package mq.java.constructors;

public class Change_Gear 
{

	public Change_Gear() 			//Constructor
	{
		System.out.println("Hold clutch");
	}
	
	
	public void Gear1()				//Reusable method
	{
		System.out.println("First gear changed");
	}
	
	public void Gear2()				//Reusable method
	{
		System.out.println("Second gear changed");
	}
	
	public static void main(String[] args) 	//Runnable method[We can write runnable method anywhere with in project]
	{
		new Change_Gear().Gear1();
		new Change_Gear().Gear2();
		
		
		//Object creation for class
		Change_Gear obj=new Change_Gear();
		obj.Gear1();
		obj.Gear2();
		

	}

}
