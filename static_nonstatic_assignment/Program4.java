package static_nonstatic_assignment;

public class Program4 {
	static int i=72;
	static int j;
	public static void demo()
	{
		j=45;
		int i=34;
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(j);
		i=63;
		j=34;
		System.out.println(i);
		System.out.println(j);
		test();
		demo();
		System.out.println(i);
		int i=88;
		System.out.println(j);
		System.out.println(i);
		System.out.println(Program4.i);
	}
	public static void test()
	{
		int i=32;
		System.out.println(i);
		System.out.println(j);
		System.out.println(Program4.i);
	}

}
