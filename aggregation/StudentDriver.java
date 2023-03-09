package aggregation;

public class StudentDriver {
	public static void main(String args[]){
	       address ad = new address(55, "Agra", "UP", "India");
	       student obj = new student(123, "Chaitanya", ad);
	       System.out.println(obj.rollNum);
	       System.out.println(obj.studentName);
	       System.out.println(obj.studentAddr.streetNum);
	       System.out.println(obj.studentAddr.city);
	       System.out.println(obj.studentAddr.state);
	       System.out.println(obj.studentAddr.country);
}
}
