package javakeywordsexamples;

public class Teacher extends Person{
	
	public void show() {
		super.display();//parent class method access
		System.out.println("Child class method");
	}
	
	
	
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.show();

	}

}
