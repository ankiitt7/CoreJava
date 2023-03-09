package Pattern;

public class Program2 {

public static void main(String[] args) {
	int n=5;
	
	for(int i=0;i<n;i++)//row
	{
		char k='A';
		for(int j=0;j<n;j++)//column
		{
			if(i>=j)
			{
				System.out.print(k++%2 + " ");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
