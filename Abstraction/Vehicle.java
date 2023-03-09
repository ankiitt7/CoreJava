package Abstraction;

public abstract class Vehicle {

	public abstract void start();
	
	public abstract void drive();
	
	public void stop() {
		System.out.println("stop the vehicle");
	}
	
	public void playMusic() {
		System.out.println("play music in the vehicle");
	}
}
