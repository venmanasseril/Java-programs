package Collectionexamples;
import java.util.HashSet;
public class HAshsetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>animals =new HashSet<>();
		animals.add("Cat");
		animals.add("Tiger");
		animals.add("Dog");
		for(String x:animals) {
			System.out.println("Animals"+x);
		}

	}

}
