package greatest;

public class threeGreatest {
public static void main(String[] args) {
	int num1=55;
	int num2=66;
	int num3=33;
	
	if(num1>num2 && num1>num3)
	{
		System.out.println(num1+":is greatest");
	}
	else if(num2>num1 && num2>num3)
	{
		System.out.println(num2+":is greatest");
	}
	else if(num3>num1 && num3>num2)
	{
		System.out.println("num3+:is greatest");
	}
	
}
}
