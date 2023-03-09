package constructorChaining;

public class Student {


Student()
{
	this(5,9);
	System.out.println("This is default constructor");
	
}

Student(int n)
{
	System.out.println("This is parameterized constructor");
	System.out.println(n);
}
Student(int a,int b)
{
	
	System.out.println(a+b);
}
}
