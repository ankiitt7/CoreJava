package String;

public class P1 {
public static void main(String[] args) {
	//String creation by keyword String
	String s1="Ankit"; //object create in SCP(string constant pool)
	String s2="Saini";
	String s3="Hello";
	String s4="String";
	System.out.println(s1);
	
	
	//String creation by using new keyword
	String s5=new String("Mohan");  //in this two objects are created one in heap area and second in SCP
	System.out.println(s5);
	
	
	//String creation by using character sequence
	char [] p= {'a','n','k','i','t'}; //object created same as using new keyword
	String s8=new String(p);
	System.out.println(s8);
}
}