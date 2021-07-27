package mq.java.Variables;

public class Variables 
{
	
	int a=100;
	String name="MINDQ";
	double version=1.2345;
	static String browsername="chrome";
	

	public static void main(String[] args) 
	{
		
		/*
		 * Inorder to access any public class instant varaibles we should
		 * create object to class
		 * 
		 * 	Note:--> Method may retur or may not but variable return value..
		 */
		
		Variables var=new Variables();
		int num=var.a;
		String instname=var.name;
		double ver=var.version;
		
		System.out.println(num);
		System.out.println(instname);
		System.out.println(ver);
		
		/*
		 * Static variable called with help of classname
		 * 		Classname.variablename;
		 */
		String brname=Variables.browsername;
		System.out.println("browsername is --> "+brname);

	}

}
