package stringfunctions;

public class StringExample1 {

	public static void main(String[] args) {
		String s = "java";
		System.out.println(s.length());
		System.out.println("index "+s.charAt(1));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		//Diference btw equals and equal igno cases
		String a = "Java";
		String b = "java";
		System.out.println(a.equals(b));//False
		System.out.println(a.equalsIgnoreCase(b));
		String s1= "Hello ";
		String s2 = "World";
		System.out.println(s1.concat(s2));

	}

}
