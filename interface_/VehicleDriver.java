package interface_;

public class VehicleDriver {
public static void main(String[] args) {
	Vehicle v1=new ElectricCar();
	v1.start();
	v1.stop();
	Car c1=new ElectricCar();
	c1.start();
	c1.stop();
	c1.playMusic();
}
}
