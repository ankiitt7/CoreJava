package constructor;

public class StudentDriver {
public static void main(String[] args) {
	Student s1=new Student();
	Student s2=new Student();
	s1.setvalue(101,"Mohan");
	s2.setvalue(102, "Rohan");
	s1.displayStudent();
	s2.displayStudent();
	
}
}
