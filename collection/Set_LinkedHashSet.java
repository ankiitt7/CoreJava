package collection;

import java.util.LinkedHashSet;

public class Set_LinkedHashSet {
public static void main(String[] args) {
	//sequence
	LinkedHashSet lhs1=new LinkedHashSet();
	
	lhs1.add(232434);
	lhs1.add(425432432);
	lhs1.add("hello");
	lhs1.add("Ankit");
	lhs1.add(null);
	lhs1.add("");
	lhs1.add("hello");
	lhs1.remove(232434);
	System.out.println(lhs1);
	
	
}
}
