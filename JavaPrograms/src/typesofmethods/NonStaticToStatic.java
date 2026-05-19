package typesofmethods;

public class NonStaticToStatic {
	
	public static void method1() {
		System.out.println("Inside static method1");
	}
	
	public void method2() {
		System.out.println("Inside non static method2");
		NonStaticToStatic.method1();
	}
	
	public static void main(String[] args) {
		NonStaticToStatic obj = new NonStaticToStatic();
		obj.method2();

	}

}
