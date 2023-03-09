package Jan31;

public class Largest {
public static void main(String[] args) {
	int [] a= {10,20,30,40,50};
	int largest=a[0];
	int secondlargst=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>largest)
		{
			secondlargst=largest;
			largest=a[i];
		}
		else if(a[i]>secondlargst && a[i]<largest)
		{
			
			secondlargst=a[i];
		}
	}
	System.out.println("Largest number is:"+largest);
	System.out.println("secondlargest number is:"+secondlargst);
}
}
