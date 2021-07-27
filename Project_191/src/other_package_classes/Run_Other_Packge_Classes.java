package other_package_classes;

import mq.java.methods.instant_methods.Gmail;
import mq.java.methods.static_methods.InputDevices;

public class Run_Other_Packge_Classes 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * Inorder to run other package classes we should
		 * follow few rules
		 * 
		 * 	Rule1:--> Only public modifier method and variable we can access
		 * 			  outside a package
		 * 
		 *  Rule2:--> We should import other pakages to current constructed class
		 *  
		 *  
		 *  	Syntax:->
		 *  			import packagename.*;
		 *  			import packagename.Classname;
		 *  
		 *  
		 *  	Where to write import:-->
		 *  
		 *  			Under current Package and Before class
		 */
		
		
		Gmail gmail=new Gmail();
		gmail.Create_account();
		gmail.Signin();
		gmail.Send_email_to_individual();
		
	
		InputDevices.mouse();
		InputDevices.keyboard();
		
		
			
	}

}
