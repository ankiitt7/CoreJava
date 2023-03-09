package inheritance;

public class Car extends Vehicle {
	int x=30;
	
	public void demo()
	{
		int x=40;
		System.out.println("Local varible for demo: "+x); 
		System.out.println("Global x of car: "+this.x);
		System.out.println("Vehicle clss x is: "+super.x);
	}

}
