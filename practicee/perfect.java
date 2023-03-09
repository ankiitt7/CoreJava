package practicee;

public class perfect {
	public static void main(String[] args) {
		int i=1;
		int n=6;
		int sum=0;
		while(i<=n/2)
		{
			if(n%i==0)
				sum=sum+i;
			i++;
		}
		if(sum==n)
		{
			System.out.println("perfect No");
		}
		else
		{
			System.out.println("Not a perfect no");
		}
	}
}
