package wrapperexamples;

public class ManuelUnboxingExample1 {

	public static void main(String[] args) {
		//Manually unboxing 
		Integer obj = Integer.valueOf(15);
		int num = obj.intValue();
		System.out.println("Primitive value "+num);

	}

}
