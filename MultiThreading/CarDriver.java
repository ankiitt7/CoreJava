package MultiThreading;

public class CarDriver {
	public static void main(String[] args) {
		Car c1=new Car("MAruti800", 4654764, "White");
		Car c2=new Car("Audi", 567889, "Black");
		Car c3=new Car("BMW", 879080, "Red");
		Car c4=new Car("TATA", 7876899, "Blue");
		
		c2.setPriority(10);
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		
	}
}
