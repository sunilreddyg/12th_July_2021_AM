package mq.java.methods;

public class TVRemote 
{
	
	public void TurnON()      //Reusable method
	{
		System.out.println("Telivision is on");
	}
	
	public void TurnOff()	   //Reusable method
	{
		System.out.println("Television is off");
	}
	
	
	public static void main(String args[])   //Runnable method
	{
		new TVRemote().TurnON();
		new TVRemote().TurnOff();
	}
	
	
}
