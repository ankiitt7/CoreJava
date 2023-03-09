package method_overridng;

public class ABCDDriver {
public static void main(String[] args) {
	A a1=new A();
	a1.drive();
	
	A a2=new C();
	a2.drive();
}
}
