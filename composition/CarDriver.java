package composition;

public class CarDriver {
public static void main(String[] args) {
	Car c=new Car("Audi",10000000.00);
	
	System.out.println(c);
	System.out.println(c.e);
	System.out.println(c.name);
	System.out.println(c.price);
	System.out.println(c.e.hp);
	System.out.println(c.e.strokes);
	System.out.println(c.e.type);
	c.e.start();
}
}
