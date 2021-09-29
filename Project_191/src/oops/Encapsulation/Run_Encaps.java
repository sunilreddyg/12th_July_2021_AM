package oops.Encapsulation;

public class Run_Encaps 
{

	public static void main(String[] args) 
	{
		
		Encaps ecaps=new Encaps();
		ecaps.setEmail("info.mindqsystems.com");
		ecaps.setName("SunilReddy");
		
		//Get Input Values
		String username=ecaps.getName();
		String useremail=ecaps.getEmail();
		
		System.out.println(username+"   "+useremail);
		
		
		ecaps.setUrl("http://facebook.com");
		String appurl=ecaps.getUrl();
		System.out.println(appurl);
		
	}

}
