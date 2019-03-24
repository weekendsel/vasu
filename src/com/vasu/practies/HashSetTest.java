package com.vasu.practies;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest 
{
	public static void main(String[] args) 
	{
		Set<String> h=new HashSet<>();
		h.add("Vasu");
		h.add("Selenium");
		h.add("UFT");
		h.add("QTP");
		h.add("Selenium");
		Iterator<String> it=h.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		/*System.out.println(h.size());
		for (String item : h) 
		{
			System.out.println(item);
		}*/

	}

}
