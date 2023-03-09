package composition;

public class Car {
String name;
Double price;
Engine e=new Engine(60,6,"diesel");

Car()
{
}

Car(String name,Double price)
{
	this.name=name;
	this.price=price;
}
}
