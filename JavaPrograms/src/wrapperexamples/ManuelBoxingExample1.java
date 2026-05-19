package wrapperexamples;

public class ManuelBoxingExample1 {

	public static void main(String[] args) {
		// int to integer (wrapper class object)
		int num = 10;
		Integer obj = Integer.valueOf(num);//converted manuelly
		System.out.println("Primitive value "+num);
		System.out.println("Wrapper object "+obj);

	}

}
