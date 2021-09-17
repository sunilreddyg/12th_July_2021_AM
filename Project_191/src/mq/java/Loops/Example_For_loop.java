package mq.java.Loops;

public class Example_For_loop {

	public static void main(String[] args) {
		
		
		//Print numbers from 1 to 10
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(i);
		}
		
		
		//Print numbers from 100-90
		for (int i = 100; i >= 90; i--) 
		{
			System.out.println(i);
		}
		
		
		//Print Array value using index number
		String tools[]= {"ide","webdriver","grid","cucumber","appium"};
		//Iterate using for loop
		for (int i = 0; i < tools.length; i++) 
		{
			String toolname = tools[i];
			System.out.println(toolname);
			
		}
		
		
		
		//Conduct sum between 1 to 100
		int sum=0;
		for (int i = 1; i <= 100; i++) 
		{
			sum=sum+i;
		}
		System.out.println("total value is --> "+sum);
		
		
		//How to revers a string
		String toolname="webdriver";
		char ch[]=toolname.toCharArray();
		System.out.println(ch.length);
		
		String str ="";
		for (int i = ch.length-1; i >=0 ; i--) 
		{
			str=str+ch[i];
		}
		System.out.println(str);
		
		
		//How to Reverse a string using string builder
		String name="sunil";
		StringBuilder builder=new StringBuilder(name);
		StringBuilder rev=builder.reverse();
		System.out.println(rev.toString());
		
		
		
	}

}
