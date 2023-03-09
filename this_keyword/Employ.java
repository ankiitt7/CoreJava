package this_keyword;

public class Employ {
	String name;
	int empId;
	double salary;
	int age;
	public Employ()
	{
		System.out.println("Employ is created"); 
	}
	Employ(String name)
	{
		this();
		this.name=name;
	}
	Employ(String name,int empId)
	{
		this(name);
		this.empId=empId;
	}
	Employ(String name,int empId,double salary)
	{
		this(name,empId);
		this.salary=salary;
	}
	Employ(String name,int empId,double salary,int age)
	{
		this(name,empId,salary);
		this.age=age;
	}
	public void displayEmploy()
	{
		System.out.println("Name is: "+name);
		System.out.println("Empid is "+empId);
		System.out.println("Salary is "+salary);
		System.out.println("Age is: "+age);
		System.out.println("======================");
		
	}
}
