package practicee;

import java.util.Scanner;

public class Fibonacci {
	public static void main (String[] args){
		
		Scanner sc=new Scanner(System.in);
	        System.out.println("enter the number for fabonaccie series");
	        int n=sc.nextInt();
	        for(int i=-1,j=1;i<=n;){
	             int k=i+j;
	             System.out.print( k + " ");
	             i=j;
	             j=k;
	        }
	        }
}
