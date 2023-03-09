package collection;

import java.util.HashSet;

public class Set_HashSet {
public static void main(String[] args) {
	//no sequence
	HashSet hs1=new HashSet();
	hs1.add(45);
	hs1.add(454);
	hs1.add(4432345);
	hs1.add(4232354);
	hs1.add(23345);
	hs1.add(2424454);
	
	System.out.println(hs1);
	
	
	HashSet hs2=new HashSet(hs1);
	System.out.println(hs2);
}
}
