package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Interface_HashSet
{

	public static void main(String[] args) 
	{
		/*
		 * Set:--> 
		 * 			=> Set is a unorder collection of objects
		 * 			=> Set doesn'ta allow duplicate values to store
		 */
		
		
		Set<String> set= new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("six");
		set.add("seven");
		set.add("two");
		
		
		
		//Remove one object from collection
		set.remove("one");
		
		
		//Get Object count
		int count=set.size();
		System.out.println("object count is --> "+count);
		
		
		//Verify object contains at collection
		boolean flag=set.contains("one");
		System.out.println("Object status --> "+flag);
		
		
		//Read Next Iterator value
		String Next_iterator_value=set.iterator().next();
		System.out.println("Next iterator value is ---> "+Next_iterator_value);
		
		//Clear all collection fo objects at runtime
		//set.clear();
		
		//Verify Collection Empty status
		boolean flag1=set.isEmpty();
		System.out.println("Collection Available status is --> "+flag1);
		
		
		
		//Read all objects using foreach
		for (String EachObj : set) 
		{
			System.out.println(EachObj);
		}
		
		
		
		//Read all object using iterator class
		//Iterator class convert collection of objects into individual tokens and 
		//can access each token with next keyword
		Iterator<String> itr=set.iterator();
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
