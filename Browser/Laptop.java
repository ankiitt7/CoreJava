package Browser;
import java.util.*;
public class Laptop {
static String laptopName="HP";
Browser selectButton()
{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the range: ");
	int range=sc.nextInt();
	if(range<=100)
	{
		System.out.println("Chrome works");
		Chrome c=new Chrome();
		return c;
	}
	else if(range>100 && range<=200)
	{
		System.out.println("Edge works");
		Edge e=new Edge();
		return e;
	}
	else
	{
		System.out.println("Firefox works");
		Firefox f=new Firefox();
		return f;
	}
}
}
