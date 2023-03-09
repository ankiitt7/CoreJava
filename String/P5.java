package String;

public class P5 {
public static void main(String[] args) {
	String s="My Name is ankit";
	
	int leng=s.length();
	String rev="";
	for(int i= leng-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	
}
}
