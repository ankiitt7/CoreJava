package practicee;

public class Armstrong {
public static void main(String[] args) {
	int no=154;
	int t1=no;
	int count=0;
	while(t1 !=0)
	{
		count++;
		t1=t1/10;
	}
	int t2=no;
	int arm=0;
		while(t2 !=0)
		{
			int rem=t2%10;
			int mul=1;
			for(int i=1;i<=count;i++)
			{
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		if(arm==no)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not a armstrong");
		}
	}
}

