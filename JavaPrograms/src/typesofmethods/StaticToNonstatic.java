package typesofmethods;

public class StaticToNonstatic {

	public void method1() {
		System.out.println("Inside non static method 1");
	}
	
	public static void method2() {
		System.out.println("Inside static method 2");
		StaticToNonstatic obj = new StaticToNonstatic();
		obj.method1();
	}
	
	public static void main(String[] args) {
		method2();
		//static2static = methodname;
		//n static2 nstatic = methodname;
	}

}
