package has_a;

public class CarDriver {
	public static void main(String[] args) {
	Car c1=new Car("Maruti",123456.5);
	System.out.println(c1);
	System.out.println(c1.e);
	System.out.println(c1.name);
	System.out.println(c1.e.hp);
	System.out.println(c1.e.strokes);
	System.out.println(c1.e.type);
	}
}
