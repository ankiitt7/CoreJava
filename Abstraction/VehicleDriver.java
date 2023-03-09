package Abstraction;

public class VehicleDriver {
public static void main(String[] args) {
	Vehicle v=new Tesla();
	v.start();
	v.drive();
	v.playMusic();
	v.stop();
	Tesla t1=(Tesla)v;

	
}
}
