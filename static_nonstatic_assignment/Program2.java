package static_nonstatic_assignment;

public class Program2 {
	static int i=52;
	static int j;
	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(j);
		i=63;
		j=34;
		System.out.println(i);
		System.out.println(j);
		test();
		System.out.println(i);
		int i=88;
		System.out.println(j);
		System.out.println(i);
		System.out.println(Program2.i);
	}
	public static void test()
	{
		System.out.println(i);
		i=90;
		System.out.println(i);
		j=78;
		int i=32;
		System.out.println(i);
		System.out.println(Program2.i);
	}
}
