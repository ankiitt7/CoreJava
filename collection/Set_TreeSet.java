package collection;

import java.util.TreeSet;

public class Set_TreeSet {
public static void main(String[] args) {
	
	//Sorted data
	//homogeneous data
//	TreeSet ts1=new TreeSet();
//	
//	ts1.add(45);
//	ts1.add(4554);
//	ts1.add(22);
//	ts1.add(333);
//	ts1.add(22);
//	ts1.add(442);
//	ts1.add(45);
//	
//	
//	System.out.println(ts1);
	
	int [] a= {10,10,20,20,30,40,50};
	
	TreeSet t=new TreeSet();
	for(int x:a)
	{
		if(t.add(x));
	}
	System.out.println(t);
}
}
