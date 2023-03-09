package constructor;

public class Student {

	int id;
	String name;
	
	void setvalue(int i,String n)
	{
		id=i;
		name=n;
	}
	
	void displayStudent()
	{
		System.out.println("Id of student is:"+id);
		System.out.println("Name of student is:"+name);
		System.out.println("==============================");
	}
}
