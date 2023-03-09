package collection;
import java.util.*;
public class Collection_ArrayList {
public static void main(String[] args) {
	
	//No Argument
	ArrayList a=new ArrayList();
	a.add(56);
	a.add(55);
	a.add(null);
	a.add(2, 456);
	a.add("Ankit");
	System.out.println(a);
	System.out.println("========================================================================");
	
	//Fixed Size, so load factor work on 15 not on default value 10
	ArrayList b=new ArrayList(15);
	
	b.addAll(a);
	b.addAll(b);
	b.addAll(b);
	System.out.println(b);
	System.out.println("========================================================================");
	
	//Generic
	ArrayList <Integer> c=new ArrayList <Integer>();
	
	
	ArrayList d=new ArrayList(b);
	System.out.println(d);
	
}
}
