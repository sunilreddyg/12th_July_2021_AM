package mq.java.methods.paremeters;


public class RobotB 
{
	
	void walk()     //Method without parameter
	{
		System.out.println("Walk finished in 5 KMS ");
	}
	
	
	void customwalk(int speed )
	{
		System.out.println("walk finished in speed -> "+speed);
	}
	

	public static void main(String[] args) 
	{
		new RobotB().walk();
		new RobotB().customwalk(8);
		new RobotB().customwalk(3);

	}


}
