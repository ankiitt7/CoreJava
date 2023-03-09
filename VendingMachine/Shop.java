package VendingMachine;
import java.util.*;
public class Shop {
static String shopName="Q Spider Tapri";
VendingMachine pressButton()
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Press the Price: ");
	int price=sc.nextInt();
	if(price==100)
	{
		System.out.println("hey enjoy your coffee");
		Coffee c=new Coffee();
		return c;
	}
	else if(price==200)
	{
		System.out.println("hey enjoy your juice");
		Juice j=new Juice();
		return j;
	}
	else if(price==2000)
	{
		System.out.println("hey enjoy your wine");
		Wine w=new Wine();
		return w;
	}
	else
	{
		System.out.println("Please enter valid amount");
		NotValid n=new NotValid();
		return n;
	}
}
}
