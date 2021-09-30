package oops.Abstract;

public class Runner {

	public static void main(String[] args) 
	{
		
		Dog obj=new Dog();
		obj.makesound();
		obj.sleep();
		
		System.out.println("\n");
		
		Cat cat=new Cat();
		cat.makesound();
		cat.sleep();
		
		//Abstract class allow static methods to call directly...
		System.out.println(Animal.life);


	}

}
