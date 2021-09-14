package mq.java.Arrays;

public class Static_Arrays {

	public static void main(String[] args) 
	{
		
			//String array to store set of strings
			String browsers[]=new String[4];
			browsers[0]="chrome";
			browsers[1]="firefox";
			browsers[2]="safari";
			browsers[3]="edge";
			
			System.out.println(browsers[2]);
			System.out.println("Number of browsers available "+browsers.length);
			
			
			//Integer array to store set of numbers
			int num[]=new int[5];
			num[0]=100;
			num[1]=200;
			num[2]=300;
			num[3]=400;
			num[4]=500;
			
			System.out.println("number of objects "+num.length);
			
			
			//Store mixed values into array
			Object obj[]=new Object[3];
			obj[0]="iphone";
			obj[1]=4;
			obj[2]=25000.00;
			System.out.println("Productnam is "+obj[0]);
			System.out.println("Quantity"+obj[1]);
			System.out.println("Product price "+obj[2]);
			
			
			//Static Double dimensional array
			String data[][]=new String[3][2];
			
			//1sr row data
			data[0][0]="Arjun";
			data[0][1]="@Arjun123";
			
			//2nd row data
			data[1][0]="Raji";
			data[1][1]="Raj123";
			
			//3rd row data
			data[2][0]="yasin";
			data[2][1]="@yasin123";
			
			System.out.println(data[1][0]);
			System.out.println("Number of rows data available "+data.length);
			

	}

}
