package has_a;

public class Car {
	String name;
	double price;
	Engine e=new Engine(60,6,"diesel");
	Car()
	{
		
	}
Car(String name,double price)
{
	this.name=name;
	this.price=price;
}
public void displayCar()
{
	System.out.println("Car name is: "+name);
	System.out.println("Car price is: "+price);
	System.out.println("Car engine hp is: "+e.hp);
	System.out.println("Engine strokes is: "+e.strokes);
	System.out.println("Engine type is: "+e.type);
}
}
