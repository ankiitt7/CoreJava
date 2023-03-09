package practicemethods;

public class findFactorial {
	public static void main(String[] args) {
		int r=findFactorial(16);
		System.out.println(r);
	}
	public static int findFactorial(int n)
	{
	int fact=1;
	while(n>0)
	{
	fact=fact*n;
	n--;
	}
	return fact;
	}
	
	

}
