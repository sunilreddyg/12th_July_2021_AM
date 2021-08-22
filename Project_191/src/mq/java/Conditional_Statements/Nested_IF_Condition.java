package mq.java.Conditional_Statements;

public class Nested_IF_Condition {

	public static void main(String[] args) 
	{
		
		
		/*
		 * Allow Condition INside condition
		 */
		
		
		int Age=19;
		String health_status="good";
		
		
		if(Age > 19)
		{
			System.out.println("Age is approved");
			
					//Nested if condition
					if(health_status.equals("good"))
					{
						System.out.println("Accept application");
					}
					else
					{
						System.out.println("Reject application");
					}
		}
		else
		{
			System.out.println("Age is Not approved");
		}
		

	}

}
