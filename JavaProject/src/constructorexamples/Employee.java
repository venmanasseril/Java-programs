package constructorexamples;

public class Employee {
	
	String name;
	double salary;
	//Parameterized Constructor
	public Employee(String n, double s) {
		name = n;//initialized
		salary= s;
	}
	
	public void display() {
		System.out.println("Employee name "+name);
		System.out.println("Employee salary "+salary);
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee("Ajay", 5000.00);
		Employee employee1 = new Employee("Jay", 25000.00);
		Employee employee2 = new Employee("leela", 20005.00);
		employee.display();
		employee1.display();
		employee2.display();
	}

}
