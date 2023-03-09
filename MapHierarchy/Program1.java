package MapHierarchy;

import java.util.HashMap;


public class Program1 {
public static void main(String[] args) {
	
	HashMap hm1=new HashMap();
	hm1.put(55,"Ankit");
	hm1.put("Ankit", 77);
	System.out.println(hm1);
	hm1.remove("Ankit",77);
	System.out.println(hm1);
}
}
