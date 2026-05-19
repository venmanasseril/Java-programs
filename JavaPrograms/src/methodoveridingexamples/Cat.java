package methodoveridingexamples;

public class Cat extends Animal{
	public void sound() {
		System.out.println("This is a child cat");
	}
	
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound();//child class method overide animal sound()
		

	}

}
