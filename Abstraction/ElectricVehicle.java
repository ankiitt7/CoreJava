package Abstraction;

public abstract class ElectricVehicle extends Vehicle {

	public abstract void charge();
	
	public void on() {
		System.out.println("On the electric car");
	}
}
