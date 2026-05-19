package Collectionexamples;
import java.util.ArrayList;
public class ArrayListExamples {
	public static void main(String args[]) {
		ArrayList<String>students=new ArrayList<>();//Create of list object
		students.add("Anu");
		students.add("Binu");
		students.add("Lulu");
		System.out.println("Stuenlist :"+students);
		students.remove("Lulu");
		System.out.println("After removal :"+students);
		System.out.println("First String  :"+students.get(0));
	}
}
