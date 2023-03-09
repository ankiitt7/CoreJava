package jan29;

public class StringReverse {
public static void main(String[] args) {
	String str="Ankit";
	int length=str.length();
	String rev="";
	System.out.println("Original String is:"+str);
	for(int i=length-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	System.out.println("Reverse String is:"+rev);
}
}
