package Test;

public class Program2 {
 
public static int superdigit(int n)
{
	int sum=0;
	while(n>0)
	{
	
	int rem=n%10;
	sum=sum+rem;
	n=n/10;
	
	}
	n=sum;
	
	return sum;
}

public static void main(String[] args) {

	
	int s=superdigit(9875);
	int p=superdigit(29);
	int r=superdigit(11);
	
	
	System.out.println("super digit of 9875 is:"+s);
	System.out.println("super digit of 29 is:"+p);
	System.out.println("super digit of 11 is:"+r);
	
	
	
}
}
