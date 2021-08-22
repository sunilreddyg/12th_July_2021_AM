package mq.java.Conditional_Statements;

public class SwitchCase_Statements {

	public static void main(String[] args)
	{
		
		/*
		 * Switch-case:-->
		 * 		=> switch execute multiple decisions same
		 * 			as else if. only diff switch execute
		 * 			only selected case instead verifing
		 * 			everfy case. 
		 */		
		
		
		String month="dec";
		
		
		switch (month) {
		
		case "jan":
			System.out.println("10% discount available");
			break;
			
		case "feb":
			System.out.println("20% discount available");
			break;
			
		case "mar":
			System.out.println("30% discount available");
			break;
			
		case "apr":
			System.out.println("40% discount available");
			break;

		default: System.out.println("month name is mismatch");
			break;
		}
		
		
		
		
		
		
		
		
		

	}

}
