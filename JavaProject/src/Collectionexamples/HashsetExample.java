package Collectionexamples;
import java.util.HashSet;
public class HashsetExample {

	public static void main(String[] args) {
		// no duplicate elements, unordered set of elements
		
		HashSet<Integer>numbers =new HashSet<>();
		numbers.add(20);
		numbers.add(100);
		numbers.add(34);
		numbers.add(20);
		System.out.println("Numbers :"+numbers);

	}

}
