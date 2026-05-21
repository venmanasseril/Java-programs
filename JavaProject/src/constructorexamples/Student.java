package constructorexamples;

public class Student {
	String name;//null
	int age;//0
	
	//default constructor
	public Student(){
		System.out.println("Default Constructor");
	}
	public void display() {
		System.out.println("Name "+name);
		System.out.println("Age "+age);
	}
	
	public static void main(String[] args) {
		Student student = new Student();//automatic call
		student.display();

	}

}
