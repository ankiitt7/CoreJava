package MultiThreading;

public class RocketDriver {
	public static void main(String[] args) {
		Rocket r1=new Rocket();
		Rocket r2=new Rocket();
		Rocket r3=new Rocket();
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		t1.setName("Appolo");
		t2.setName("Chandrayan");
		t3.setName("Aryabhatt");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}
}
