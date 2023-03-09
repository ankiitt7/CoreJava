package String;

public class P3 {
public static void main(String[] args) {
	String s="Ankit123";
	
	s=s.replaceAll("[a-z]", "");
	System.out.println(s);
	s=s.replaceAll("[A-Z]", "");
	System.out.println(s);
}
}
