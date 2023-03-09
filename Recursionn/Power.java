package Recursionn;

public class Power {
public static void main(String[] args) {
	int base=5;
	int exp=3;
	System.out.println("Req power is:"+power(base,exp));
}

public static int power(int base,int exp)
{
	if(exp==0)
	{
		return 1;
	}
	else
	{
		return (base*power(base,exp-1));
	}
}


}

