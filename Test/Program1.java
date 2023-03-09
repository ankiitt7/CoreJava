package Test;


public class Program1 {
	public static void main(String[] args) {
		String n="11";
	
		for(int k=1;k<=2;k++)
		{
			 n=n+n;
		}
		System.out.println("Output is:"+n);
		
		Integer s=Integer.valueOf(n);
		System.out.println(s);
	Integer sum=0;
		while(s>0)
		{
	
	Integer rem=s%10;
		sum=sum+rem;
		s=s/10;
	
	}
		System.out.println("Super digit:"+sum);
	}
}

