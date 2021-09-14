package mq.java.Arrays;

public class Runtime_Arrays {

	public static void main(String[] args) {
		
		
			//Runtime array to store group of Strings
			String browsers[]= {"chrome","firefox","safari","edge","opera","ie"};
			System.out.println(browsers[2]);
			System.out.println("Object count at array is -> "+browsers.length);
			
			
			//Runtime array to store group of numbers
			int num[]= {100,200,300,400,500,600};
			System.out.println(num[4]);
			System.out.println("Object count at array is -> "+num.length);
			
			//Runtime array to store group of values
			Object obj[]= {"iphone",4,40000.00};
			String phonename=(String) obj[0];
			int quantity=(int) obj[1];
			double price=(double) obj[2];
			System.out.println("Object count at array is -> "+obj.length);
			
			
			//Runtime double dimensional array
			String data[][]= {
								{"Arjay","Ajay@123"},
								{"kranthi","Kranthi@123"},
								{"nikil","nikil@123"},
							 };
			
			System.out.println(data[1][1]);
			System.out.println("Object count at array is -> "+data.length);
			
			

	}

}
