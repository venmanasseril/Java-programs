package singleinheritance;

public class Dog extends Animal{

	public void bark() {
		System.out.println("dog is barking");
	}
	
	public static void main(String[] args) {
		Dog obj = new Dog();	
		obj.eat();
		obj.bark();
	}

}
