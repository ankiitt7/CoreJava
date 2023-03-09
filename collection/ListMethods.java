package collection;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
public static void main(String[] args) {
	
List l=new ArrayList();
	
	l.add(34);
	l.add(56.45);
	l.add(0,99);
	l.add(355);
	System.out.println(l);
	System.out.println(l.indexOf(34));
//	l.remove(2);
//	System.out.println(l);
	
	System.out.println(l.get(1));
}
}
