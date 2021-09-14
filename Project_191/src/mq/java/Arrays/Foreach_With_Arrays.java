package mq.java.Arrays;

public class Foreach_With_Arrays {

	public static void main(String[] args) 
	{
		
		/*
		 * foreach loop is designed to read array values only
		 */
		
		
		String browsers[]= {"firefox","chrome","safari","opera","edge"};
		
		for (String eachbrowser : browsers) 
		{
			System.out.println(eachbrowser);
		}
		
		
		
		//Runtime double dimensional array
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
