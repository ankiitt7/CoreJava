package method_overridng;

public class B extends A{

	@Override
	public void drive()
	{
		System.out.println("Class B drive()");
	}
	
	public void test()
	{
		System.out.println("Test Method");
	}
}
