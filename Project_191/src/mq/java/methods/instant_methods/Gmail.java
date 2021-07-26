package mq.java.methods.instant_methods;

public class Gmail 
{
	
	public void Create_account()          		//Instant Method [Because it doesn't have static specifier]
	{
		System.out.println("Account Created");
	}
	
	
	public void Signin()				  		//Instant method
	{
		System.out.println("User logged in");
	}
	
	public void Send_email_to_individual()		//Instant method
	{
		System.out.println("email sent to individual");
	}
	
	public void Send_email_to_Group()			//Instant method
	{
		System.out.println("email sent to group users");
	}
	

	public static void main(String[] args) 		//Runnable class
	{
			Gmail gmail=new Gmail();
			gmail.Create_account();
			gmail.Signin();
			gmail.Send_email_to_individual();

	}

}
