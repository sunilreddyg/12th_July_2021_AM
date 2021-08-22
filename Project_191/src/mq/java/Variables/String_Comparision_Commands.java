package mq.java.Variables;

public class String_Comparision_Commands {

	public static void main(String[] args) 
	{
		
		
		/*
		 * => String accept set of characters to store
		 * => String is a non-primitive datatype
		 * => String is not only a datatype and it is also called class
		 * => String contains set of events [Methods] to validate
		 * 			store characters
		 */
		
		
		String act_result="Account Created";
		String Exp_result="account created";
		
		
		/*
		 * equals:-->
		 * 			Method verify equal comparision between two strigs and return 
		 * 			boolean value true/false.
		 * 
		 * 			Note:--> Comparision is case sensitive
		 */
		boolean flag=act_result.equals(Exp_result);
		System.out.println("Equal comparision is ----> "+flag);
		
		
		
		/*
		 * EqualIgnorecase:-->
		 * 			Method verify equal comparision between two string by ignoring
		 * 			case sensitive and return boolean value true/false.
		 */
		boolean flag1=act_result.equalsIgnoreCase(Exp_result);
		System.out.println("EqualIngore case comparision is ---> "+flag1);
		
		
		/*
		 * contains:-->
		 * 			Method verify partial sequence characters available at expected
		 * 			string and return boolean value true/false.
		 */
		String Status="Account 100 Created Sucessfull";
		boolean flag2=Status.contains("100");
		System.out.println("partial charactes available status is ---> "+flag2);
		
		
		
		/*
		 * length:-->
		 * 			Method return number of characters availabe in string 
		 * 			with in numeric format.
		 */
		String Mobile_number="9030248855";
		int num=Mobile_number.length();
		System.out.println("Mobile number length available --> "+num);
		
		
		/*
		 * trim:-->
		 * 			Method trim extra spaces from string. It only
		 * 			trim left and right space
		 */
		String pincode="    500035   ";
		System.out.println("before trim pincode length is --> "+pincode.length());
		
		String new_pincode=pincode.trim();
		System.out.println("After trim pincode length is ---> "+new_pincode.length());
		
		
		
		/*
		 * subString:-->
		 * 			Method get subString characters from Main String 
		 */
		String Account_number="3456789878744";
		
		//Get First starting 4 characters from account number
		String firstvalues=Account_number.substring(0, 4);
		System.out.println("first 4 characters are --> "+firstvalues);
		
		//Get Last four characters from account number
		String Lastvalues=Account_number.substring(9);
		System.out.println("last 4 characters are ---> "+Lastvalues);
		
		
		
		/*
		 * ToUppercase:-->
		 * 			Method convert all lowercase characters with in string
		 * 			into uppercase
		 */
		String toolname="wEbdRiver";
		System.out.println("toolname is uppercase characters --> "+toolname.toUpperCase());
		
		
		
		/*
		 * ToLowercase:-->
		 * 			Method convert all Uppercase characters with in string
		 * 			into Lowercase
		 */
		String modelname="wEbdRiver";
		System.out.println("modelname is lowercase characters --> "+modelname.toLowerCase());
		
		
		 /*
		  * Startswith:-->
		  * 	Method return boolean value true/false when given string
		  * 	start with expected characters
		  */
		 String IFSC_Code="HDFC12345";
		 boolean flag4=IFSC_Code.startsWith("HDFC");
		 System.out.println("Start with status is --> "+flag4);
		 
		 
		 /*
		  * Endswith:-->
		  * 	Method return boolean value true/false when given string
		  * 	ends with expected characters
		  */
		 boolean flag5=IFSC_Code.endsWith("2345");
		 System.out.println("ends with status is ---> "+flag5);
		
		
		 
		 /*
		  * isempty:-->
		  * 	 method return true when give string has no characters and method
		  * 	 return false when given string have some characters
		  */
		 String name="";
		 String name1="MQ";
		 System.out.println("name variable empty status is ---> "+name.isEmpty());
		 System.out.println("name1 variable empty status is ---> "+name1.isEmpty());
		 
		 
		 /*
		  * concat:-->
		  * 	Method club two string
		  */
		 String str1="Hi";
		 String str2="Friends";
		 System.out.println(str1+str2);     //Here plus operator club two strings
		 System.out.println(str1.concat(str2));
		 
		 
		 
		 /*
		  * Replace:-->
		  * 	methd replace existing characters with new character
		  */
		 String cname="MQ-SYS";
		 String new_cname=cname.replace("M", "B");
		 System.out.println(new_cname);
		 System.out.println("replacing sequcen of chars -->  "+cname.replace("MQ", "BQ"));
		 
		 String msg="Hello world";
		 System.out.println("Replacing all "+msg.replaceAll("l", "L"));
		 
		 
		 /*
		  * CharAt:-->
		  * 		Method usefull to get any single characters with in string using
		  * 		index number. FInally it store into char datatype.
		  */
		 char ch=cname.charAt(1);
		 System.out.println("charcters at first index is --> "+ch);
		 
		 
	}

}
