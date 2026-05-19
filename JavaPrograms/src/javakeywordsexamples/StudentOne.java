package javakeywordsexamples;

public class StudentOne {
	StudentOne(int id){
		System.out.println("Student id:"+id);
	}
	StudentOne(){  
		this(100);// parameterized constructor call
		System.out.println("Default constructor");
	}
	
	public static void main(String[] args) {
		StudentOne sone = new StudentOne();// default contructor call
	}

}
