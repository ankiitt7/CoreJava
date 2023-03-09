package interface_;

public class BankDriver {
public static void main(String[] args) {
			Bank b1=new SBI();
			b1.rateofInterst();
			Bank b2=new HDFC();
			b2.rateofInterst();
			Bank b3=new ICICI();
			b3.rateofInterst();
}
}
