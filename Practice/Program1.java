package Practice;
import java.util.Scanner;
public class Program1 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
int n=sc.nextInt();
int i=2;
int count=0;
while(i<n/2)
{
	if(n%i==0)
	{
		count++;
	}
	i++;
	}
if(count==0)
{
	System.out.println("This is Prime Number");
}
else
{
	System.out.println("This is not a Prime Number");
}
}

}
