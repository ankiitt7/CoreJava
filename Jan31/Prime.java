package Jan31;

public class Prime {
public static void main(String[] args) {
	for(int n=2;n<=100;n++)
	{
	
	int count=0;
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}	
	if(count==0)
	{
		System.out.println(n+":Prime");
	}
	else
	{
		System.out.println(n+":Not prime");
	}
}
}
}
