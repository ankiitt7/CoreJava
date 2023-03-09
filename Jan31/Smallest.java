package Jan31;

public class Smallest {
	public static void main(String[] args) {
		
	int [] a= {90,20,30,40,50};
	int smallest=a[0];
	int secondsmallest=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<=smallest)
		{
			secondsmallest=smallest;
			smallest=a[i];
		}
		else if(a[i]<=secondsmallest && a[i]>smallest)
		{
			
			secondsmallest=a[i];
		}
	}
	System.out.println("smallest number is:"+smallest);
	System.out.println("secondsmallest number is:"+secondsmallest);
}
}