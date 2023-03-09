package Recursionn;

public class fabii {
public static void main(String[] args) {
	int length=9;
	for(int i=0;i<length;i++)
	{
	System.out.print(fib(i)+" ");
	}
}
static int fib(int count)
{
	if(count==0)
	{
		return 0;
	}
	if(count==1 || count==2)
	{
		return 1;
	}
	return fib(count-1)+fib(count-2);
	
}
}
