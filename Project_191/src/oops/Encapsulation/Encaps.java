package oops.Encapsulation;

public class Encaps 
{
	private String url;
	private String name;
	private String email;
	
	
	public String getUrl() 
	{
		System.out.println("value accesed by the user "+name);
		return url;
		
	}
	public void setUrl(String url) {
		System.out.println(name+" set url to global variable");
		this.url = url;
	}
	
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	

	

}
