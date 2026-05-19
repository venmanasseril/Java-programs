package Collectionexamples;
import java.util.LinkedList;
public class LinklistEample {
	public static void main(String[] args) {
		LinkedList<String>list =new LinkedList<>();//Object name list
		list.add("hello");
		list.add("World");
		list.addFirst("Playwright");
		
		list.addLast("Hai");
		System.out.println("List :"+list);
	}

}
