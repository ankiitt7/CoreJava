package VendingMachine;

public class Customer {
public static void main(String[] args) {
	Shop s=new Shop();
	VendingMachine v=s.pressButton();
	v.use();
}
}
