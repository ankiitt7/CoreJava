package has_a;

public class LaptopDetailsDriver {
	public static void main(String[] args) {
		LaptopDetails c1=new LaptopDetails("Black","HD");
	System.out.println("Laptop Color: "+c1.color);	
	System.out.println("Laptop display: "+c1.display);
	System.out.println("Laptop Name: "+c1.e.name);
	System.out.println("Laptop Processor: "+c1.e.processor);
	System.out.println("Laptop Price: "+c1.e.price);
	}

}
