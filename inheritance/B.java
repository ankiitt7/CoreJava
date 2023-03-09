package inheritance;

public class B extends A {
	int p=345;
	int q=452;
	
	public void demo()
	{
		System.out.println("demo method of b class");
		System.out.println("The sum is: "+(p+q+a+b));
		test();
	}

}
