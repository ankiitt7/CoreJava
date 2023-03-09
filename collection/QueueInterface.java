package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
public static void main(String[] args) {
	
	Queue q1=new LinkedList();
	q1.add(76543);
	q1.add(45);
	q1.add(78);
	q1.add(465);
	q1.add(786);
	q1.add(45);
	q1.add(78);
//	q1.clear();
	q1.poll();
	System.out.println(q1);
	System.out.println(q1.peek());
	System.out.println(q1.element());
}
}
