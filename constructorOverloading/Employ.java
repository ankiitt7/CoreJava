package constructorOverloading;

public class Employ {
int id;
String name;
String city;

Employ(int id)
{
	this.id=id;
}

Employ(int id,String name)
{
	this.id=id;
	this.name=name;
}

Employ(int id,String name,String city)
{
	this.id=id;
	this.name=name;
	this.city=city;
}
public void displayEmploye()
{
	System.out.println("id is:"+id);
	System.out.println("name is:"+name);
	System.out.println("city is:"+city);
}

}
