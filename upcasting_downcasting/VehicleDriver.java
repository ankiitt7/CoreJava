package upcasting_downcasting;

public class VehicleDriver {
	public static void main(String[] args) {
		Vehicle v1=new ElectricCar();
		System.out.println(v1.i);
		System.out.println("=================================");
		ElectricCar e1=(ElectricCar)v1;
		System.out.println(e1.i);
		System.out.println(e1.j);
		System.out.println(e1.k);
	}

}
