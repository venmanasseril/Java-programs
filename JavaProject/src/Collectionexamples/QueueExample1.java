package Collectionexamples;
import java.util.*;
public class QueueExample1 {

	public static void main(String[] args) {
		PriorityQueue<String>Queue= new PriorityQueue<>();
		Queue.add("Task 1");
		Queue.add("Task 2");
		Queue.add("Task 3");
		System.out.println(Queue);//ordered list
		Queue.remove();
		System.out.println("After removal:"+Queue);//First in first out
		

	}

}
