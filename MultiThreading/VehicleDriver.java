package MultiThreading;

public class VehicleDriver {
	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		Vehicle v2=new Vehicle();
		Vehicle v3=new Vehicle();
		Vehicle v4=new Vehicle();
		v1.setName("Bullock cart");
		v2.setName("Car");
		v3.setName("Bike");
		v4.setName("Cycle");
		
		System.out.println("Thread name is: "+Thread.currentThread().getName());
		System.out.println("Thread id is: "+Thread.currentThread().getId());
		v2.setPriority(10);
		v1.setPriority(1);
		v1.start();
		v2.start();
		v3.start();
		v4.start();
	}

}
