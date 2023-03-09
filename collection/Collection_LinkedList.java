package collection;

import java.util.LinkedList;

public class Collection_LinkedList {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	
	l1.add(23);
	l1.add(45);
	l1.add(233);
	l1.add(435);
	l1.add(2673);
	l1.add(465445);
	l1.add("ankit");
	l1.add(null);
	
	for(int i=0;i<l1.size();i++)
	{
		System.out.println(l1.get(i));
	}
}
}
