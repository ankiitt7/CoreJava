package practicee;

public class Swap {
public static void main(String[] args) {
	int a=10;
	int b=20;
	System.out.println("Before swap: "+a);
	System.out.println("Before swap: "+b);
	
	
	int temp=a;
	a=b;
	b=temp;
	System.out.println("After swap: "+a);
	System.out.println("After swap: "+b);
}
}
