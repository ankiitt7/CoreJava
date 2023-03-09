package Pattern;

public class Program4 {//most Imp
public static void main(String[] args) {
	for(int i=1;i<=5;i++)//row
	{
		for(int j=5;j>i;j--)//space
		{
			System.out.print("  ");
		}
		for(int k=1;k<=2*i-1;k++)//star
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	
	for(int i=4;i>=1;i--)//row
	{
		for(int j=5;j>i;j--)//space
		{
			System.out.print("  ");
		}
		for(int k=1;k<=2*i-1;k++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
