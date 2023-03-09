package method_overloding;

public class MainOverload {
	public static void main(String[] args) {
			System.out.println("Main with String[] parameter");
			main(12);
			main(34.6);
		}
		public static void main(int a)
		{
			System.out.println("Main with int parameter");
		}
		public static void main(double b)
		{
			System.out.println("Main with double parameter");
		}
		public static void main(char a)
		{
			System.out.println("Main with char parameter");
		}
		public static void main(String a)
		{
			System.out.println("Main with String parameter");
		}
	}
