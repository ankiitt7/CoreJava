package method_chaining;

public class Employ {
	String name;
	int age;
	double salary;
	
	public static Employ obj()
	{
		return new Employ();
	}
 public Employ setValue(String name, int age, double salary)
 {
	 this.name=name;
	 this.age=age;
	 this.salary=salary;
	 return this;
 }
 public void displayEmploy()
 {
	 System.out.println("name is: "+name);
	 System.out.println("age is: "+age);
	 System.out.println("salary is: "+salary);
	 System.out.println("========================");
 }
	

}
