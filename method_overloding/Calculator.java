package method_overloding;

public class Calculator {
	public static void main(String[] args) {
		sum(23,45,6);
		sum(24,56.7,32);
		sum(45.6,65.8);
	}
	public static void sum(int a,int b)
	{
		System.out.println("sum with two parameter int, int");
		System.out.println("the sum is: "+(a+b));
	}
	public static void sum(int x,int y,int z)
	{
		System.out.println("sum with three parameter int, int, int");
		System.out.println("the sum is: "+(x+y+z));
	}
	public static void sum(int a,double b)
	{
		System.out.println("sum with two parameter int, double");
		System.out.println("the sum is: "+(a+b));
	}
	public static void sum(double a,int b)
	{
		System.out.println("sum with two parameter double, int");
		System.out.println("the sum is: "+(a+b));
	}
	public static void sum(double a,double b)
	{
		System.out.println("sum with two parameter double, double");
		System.out.println("the sum is: "+(a+b));
	}
	public static void sum(int a,double b, double c)
	{
		System.out.println("sum with three parameter int, double, int");
		System.out.println("the sum is: "+(a+b+c));
	}
	}

