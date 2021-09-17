package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class List_Interface_ArrayList {

	public static void main(String[] args) 
	{
		
		/*
		 * List store collection of objects inorder
		 * List accept duplicate values also
		 */
		

		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");
		list.add("seven");
		list.add("two");
		
		
		
		//Remove one object from collection
		list.remove("one");
		
		
		//Get Any object from list using index number
		String indexObj=list.get(3);
		System.out.println("3rd index object is --> "+indexObj);
		
		
		//Get Object count
		int count=list.size();
		System.out.println("object count is --> "+count);
		
		
		//Verify object contains at collection
		boolean flag=list.contains("one");
		System.out.println("Object status --> "+flag);
		
		
		//Read Next Iterator value
		String Next_iterator_value=list.iterator().next();
		System.out.println("Next iterator value is ---> "+Next_iterator_value);
		
		//Clear all collection fo objects at runtime
		//list.clear();
		
		//Verify Collection Empty status
		boolean flag1=list.isEmpty();
		System.out.println("Collection Available status is --> "+flag1);
		
		
		//Read all collectino of objects using for loop
		for (int i = 0; i < list.size(); i++) 
		{
			String index_object=list.get(i);
			System.out.println("=>"+index_object);
		}
		System.out.println("\n");  //Creating new line at console
		
		

		//Read all objects using foreach
		for (String EachObj : list) 
		{
			System.out.println(EachObj);
		}
		
		
		
		//Read all object using iterator class
		//Iterator class convert collection of objects into individual tokens and 
		//can access each token with next keyword
		Iterator<String> itr=list.iterator();
		System.out.println("first iterator --> "+itr.next());
		System.out.println("Second iterator--> "+itr.next());
		
		
		//Using While loop read all iterator value
		while(itr.hasNext())
		{
			String each_itr_obj=itr.next();
			System.out.println(each_itr_obj);
		}
			
	}

}
