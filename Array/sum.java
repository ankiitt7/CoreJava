package Array;

import java.util.ArrayList;

public class sum {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(23);
		a1.add(45);
		a1.add(57);
		a1.add(87);
		a1.add(78);
		a1.add(78);
		System.out.println(a1);
		int sum=0;
		for(int i=0;i<a1.size();i++)
		{
			sum=sum+a1.get(i);
		}
		System.out.println(sum);
	}

}
