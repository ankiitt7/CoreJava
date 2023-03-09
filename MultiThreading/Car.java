package MultiThreading;

public class Car extends Thread{
	String name;
	int price;
	String color;
	Car(String name, int price, String color)
	{
		this.name=name;
		this.price=price;
		this.color=color;
	}
	public void displayCar()
	{
		System.out.println("Name is: "+name);
		System.out.println("pricer is: "+price);
		System.out.println("color is: "+color);
		System.out.println("======================");
	}
	public void run()
	{
		displayCar();
	}
}
