package inheritance;

public class ABDriver {
	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1.a);
		System.out.println(a1.b);
		a1.test();
		System.out.println("=======================");
		B b1=new B();
		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println(b1.p);
		System.out.println(b1.q);
		b1.test();
		b1.demo();
	}

}
