package typesofmethods;

public class StaticToStatic {
	
	public static void method1() {
		System.out.println("Inside static method 1");
		}
	
	public static void method2() {
		System.out.println("Inside static method 2");
		method1();
	}
	public static void main(String[] args) {
		// static call static
		method2();

	}

}
