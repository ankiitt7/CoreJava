package Jan16;

public class fabi2 {
static int n1=0,n2=1,n3=0;
public static void main(String[] args) {
	int count=10;
	System.out.print(n1+" "+n2);
	printFab(count-2);
	
}

public static void printFab(int count)
{
	if(count>0)
	{
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(" "+n3);
		printFab(count-1);
	}
}
}
