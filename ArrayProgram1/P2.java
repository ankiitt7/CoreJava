package ArrayProgram1;

public class P2 {
public static void main(String[] args) {
	int [] a= {10,20,30,40,50,60};
	int temp;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length-1 && j!=3;j++)
		{
		if(a[j]<a[j+1])
		{
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}
	}
	}
	for(int j=0;j<a.length;j++)
	{
		System.out.print(a[j]+" ");
	}
}
}
