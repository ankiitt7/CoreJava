package constructorOverloading;

public class EmployDriver {
public static void main(String[] args) {
	Employ e1=new Employ(101);
	Employ e2=new Employ(102,"Mohan");
	Employ e3=new Employ(103,"Mohan","Patna");
	e3.displayEmploye();
}
}
