package mq.java.Loops;

public class ForEach_Example {

	public static void main(String[] args) 
	{
		
		

		String browsers[]= {"firefox","chrome","safari","opera","edge"};
		
		for (String eachbrowser : browsers) 
		{
			System.out.println(eachbrowser);
		}
		
		
		//Read multiple dimensional array values
		String data[][]= {
				{"Ajay","Ajay@123"},
				{"kranthi","Kranthi@123"},
				{"nikil","nikil@123"},
			 };
		
		
		
		
		for (String[] arr : data) 
		{
			for (String eachvalue : arr) 
			{
				System.out.println(eachvalue);
			}
		}
		

	}

}
