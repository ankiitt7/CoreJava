package practicemethods;

public class findFactorialofeachdigit {
	public static void main(String[] args) {
		int n=2345;
		while(n>0)
		{
			int r=n%10;
			int f=findFactorial(r);
			System.out.println(f);
			n=n/10;
		}
	}
		static int findFactorial(int n)
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
