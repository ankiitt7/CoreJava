package ArrayProgram;

public class DuplicateArray {
public static void main(String[] args) {
	int [] a= {10,20,30,40};
	int [] dup=new int[a.length];
	
	for(int i=0;i<a.length;i++)
	{
		dup[i]=a[i];
	}
	
	for(int i=0;i<dup.length;i++)
	{
		
		System.out.print(dup[i]+" ");
	}
}
}
