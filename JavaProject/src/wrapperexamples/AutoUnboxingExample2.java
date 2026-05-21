package wrapperexamples;

public class AutoUnboxingExample2 {

	public static void main(String[] args) {
		Integer obj = 100;
		int num = obj;// java is converting to primitive auto.
		System.out.println("Primitive value :"+num);
	}

}
