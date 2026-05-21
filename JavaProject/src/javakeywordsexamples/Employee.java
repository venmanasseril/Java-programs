package javakeywordsexamples;

public class Employee {

	public void display() {
		System.out.println("Employee details:");
	}
	
	public void show() {
		this.display();
		System.out.println("Inside show()");
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.show();

	}

}
