package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {
public static void main(String[] args) {
	
	Collection c1=new ArrayList();
	
	c1.add(37);
	c1.add(37);
	c1.add(45);
	c1.add("hello");
	c1.add(null);
	c1.add(35346);
	c1.add(3744);
	System.out.println(c1);
	System.out.println("===============================================");
	
	
	Collection c2=new ArrayList();
	c2.addAll(c1);
	c2.add(456);
	System.out.println(c2);
	System.out.println(c2.contains(370));
	System.out.println(c2.containsAll(c1));
	c2.remove(null);
	System.out.println(c2);
//	c2.retainAll(c1);
//	System.out.println(c2);
	
	for(Object x:c2)
	{
		System.out.print(x+" ");
	}
	System.out.println();
	System.out.println(c1.size());
	System.out.println(c1.isEmpty());
	
	Object [] a=c1.toArray();
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
	System.out.println(c1.hashCode());
	
	System.out.println(c1.equals(c2));
}
}
