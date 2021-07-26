package mq.java.constructors;

public class SmartDoor
{

	public SmartDoor()   //Constructor
	{
		System.out.println("Activate door");
	}
	
	
	public void opendoor()     //Reusable methods
	{
		System.out.println("Door opened");
	}
	
	public void closedoor()		//Reusable methods
	{
		System.out.println("Door closed");
	}

	public static void main(String[] args) 
	{
		new SmartDoor().opendoor();
		new SmartDoor().closedoor();
			
	}

}
