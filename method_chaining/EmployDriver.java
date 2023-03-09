package method_chaining;

public class EmployDriver {
	public static void main(String[] args) {
		Employ.obj().setValue("Mohan",23,758758.98).displayEmploy();
		
		Employ e1=Employ.obj();
		e1.setValue("Sohan",33,87087.99).displayEmploy();
	}

}
