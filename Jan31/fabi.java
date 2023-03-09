package Jan31;

public class fabi {
public static void main(String[] args) {
	int n=10;
	int a=0;
	int b=1;
	System.out.print(a+" ");
	System.out.print(b+" ");
	for(int i=1;i<=n;i++)
	{
	int c=a+b;
	a=b;
	b=c;
	System.out.print(c+" ");
}
}
}