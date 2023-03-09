package Practice;
public class Program7{
	public static void main(String[] args) {
		for(int i=10;i<200;i++)
		{
			int n=i;
		int rev=0;
		int temp=n;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
			if(rev==temp)
			{
				System.out.println("Palindrone No"+rev);
		}
		}
	}
}
