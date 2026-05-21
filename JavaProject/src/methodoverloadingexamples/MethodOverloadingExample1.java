package methodoverloadingexamples;

public class MethodOverloadingExample1 {
	
	public void add(int a, int b) {
		System.out.println("sum :"+(a+b));
	}
	
	public void add(double a, double b) {
		System.out.println("sum :"+(a+b));
	}
	
	public void add(int a, int b, int c) {
		System.out.println("sum :"+(a+b+c));
	}
	
	public static void main(String[] args) {
		MethodOverloadingExample1 methodoverloadingexample1 = new MethodOverloadingExample1();
		methodoverloadingexample1.add(5,6);
		methodoverloadingexample1.add(5.54, 6.56);
		methodoverloadingexample1.add(10, 20, 30);
		
	}

}
