package static_keyword;

public class Program3 {
	static int a=40;
	public static void main(String[] args) {
		System.out.println(a);
		a=50;
		System.out.println(a);
		int a=90;
		System.out.println(a);
		System.out.println(Program3.a);
		Program3.a=100;
		System.out.println(a);
		System.out.println(Program3.a);
	}

}
