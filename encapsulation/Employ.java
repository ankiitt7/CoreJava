package encapsulation;
import java.util.*;
public class Employ {
	static int pin=12345;
	private String name;
	
	public String getName()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password to access the name: ");
		int x=sc.nextInt();
		if(pin==x)
		{
			return name;
		}
		else
			
		{
			return null;
		}
	}
	
	public void setName(String name)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password to set name: ");
		int x=sc.nextInt();
		if(pin==x)
		{
			System.out.println("Validation is successful and name is set");
			this.name=name;
		}
		else
		{
			System.out.println("Password is not valid. Name is not set.");
		}
	}
}

