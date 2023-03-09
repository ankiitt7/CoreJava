package String;

public class P4 {
public static void main(String[] args) {
	
	String s="dad";
	
	int leng=s.length();
	String rev="";
	for(int i=leng-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	if(s.equalsIgnoreCase(rev))
	{
		System.out.println(s+" Palindrone");
	}
	else
	{
		System.out.println(" Not a palindrone");
	}
}
}
