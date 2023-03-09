package inheritance;

public class Vehicle {   
	int x=10;
	
	public void test()
	{
		int x=20;
        System.out.println("Local x of test(): "+x);
        System.out.println("global x of vehicle: "+this.x);
	}

}
