package stringfunctions;

public class StringExample4 {

	public static void main(String[] args) {
		String s1 = "Hello";
		s1.concat("World");
		System.out.println(s1);
		StringBuilder sb = new StringBuilder("Java "); 
		sb.append("World");
		System.out.println(sb);
	}

}
