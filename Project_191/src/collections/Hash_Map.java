package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Hash_Map {

	public static void main(String[] args)
	{
		
		
			Map<Integer, String> map=new HashMap<Integer,String>();
			map.put(100, "Iphone");
			map.put(101, "Samsung");
			map.put(102, "Vivo");
			map.put(103, "Blackberry");
			
			
			//Get any product value using it's keyname
			String mobilename=map.get(101);
			System.out.println(mobilename);
			
			//Reach all object from map using Keyset...
			for (Integer eachkey : map.keySet())
			{
				System.out.println(map.get(eachkey));
			}
			

	}

}
