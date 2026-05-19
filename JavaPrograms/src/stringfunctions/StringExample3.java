package stringfunctions;

public class StringExample3 {

	public static void main(String[] args) {
		String s4 = " Java ";
		System.out.println(s4.trim());
		
		String s5 = "Java,Python,C++";
		String[] arr = s5.split(",");
		for(String item:arr)System.out.println(item);
		String s6 = "Java";
		System.out.println(s6.replace('J','G'));
	}

}
