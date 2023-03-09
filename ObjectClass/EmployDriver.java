package ObjectClass;

import method_overloding.Calculator;

public class EmployDriver {
	public static void main(String[] args) {
		Employ e1=new Employ("Mohan", 203, 34457.56);
		Employ e2=new Employ("Sohan", 403, 54457.56);
		Employ e3=new Employ("Mohan", 203, 34457.56);
		System.out.println(e1.getClass());
		
		Calculator c2=new Calculator();
		System.out.println(c2.getClass());
		System.out.println("============toString()=====");
		System.out.println(e1);
		System.out.println(e1.toString());
		
		System.out.println(e2);
		System.out.println("========hashCode============");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println("======equals()==============");
		System.out.println(e1==e3);
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
	}		
}
