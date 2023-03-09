package constructor;

public class Employe {
	String name;
	int age;
	double salary;
	Employe(String name, int age, double salary )
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
public void displayEmploye()
{
	System.out.println("Name is:"+name);
	System.out.println("Age is:"+age);
	System.out.println("Salary is:"+salary);
}
}
