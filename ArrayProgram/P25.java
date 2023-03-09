package ArrayProgram;

public class P25 {
public static void main(String[] args) {
	int [] a= {10,30,24,54,98};
	
	int max=0;
	int min=1000000;
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println(max);
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println(min);
}
}
