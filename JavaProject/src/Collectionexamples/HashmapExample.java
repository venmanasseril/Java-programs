package Collectionexamples;
import java.util.HashMap;
public class HashmapExample {
	
	
	public static void main(String[] args) {
		HashMap<Integer,String>students = new HashMap<>();//obj created
		students.put(10, "Neena");
		students.put(12, "JAy");
		students.put(20,"ROy");
		System.out.println("Students :"+students);
		System.out.println("Student with ID :10 "+students.get(10));
	}

}
