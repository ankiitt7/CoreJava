package collection;

import java.util.Vector;

public class Collection_Vector {
public static void main(String[] args) {
	Vector v1=new Vector(); //default
	v1.add(34);
	v1.add(43);
	v1.add(34);
	v1.add(43);
	v1.add(34);
	v1.add(43);
	
	Vector v2=new Vector(48); //initialize the capacity or size
	
	Vector v3=new Vector(48,3); //initialize capacity and how many percent we want to grow the size
	
	Vector v4=new Vector(v1); //we can pass a collection
}
}
