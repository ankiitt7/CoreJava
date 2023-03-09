package jan10;

import java.util.Scanner;

public class fabionci {
public static void main(String[] args) {
	System.out.println("Enter the no of fabonici series");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	for(int i=-1,j=1;i<=n;)
	{
		int k=i+j;
		System.out.print(k+" ");
		i=j;
		j=k;
	}
}
}
