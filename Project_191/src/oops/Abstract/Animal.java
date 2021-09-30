package oops.Abstract;

abstract class Animal 
{
	
	static String life="Wild";
	
	abstract void makesound();
	
	
	public void sleep()
	{
		System.out.println("I am going to Sleep");
	}
	
	public static void wakup()
	{
		System.out.println("Wake up");
	}

}
