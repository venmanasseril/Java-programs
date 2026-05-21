package heirarchicalinheritance;
//Parent 1, multiple child:Cat,Dog
public class Cat extends Animal{
	int n=0;//instance v
	public void meow() {
		int j=0;//local v
		System.out.println("Caat is walking");
	}

	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();//animal method
		c.meow();
		Dog d = new Dog();
		d.bark();//dog method
		d.eat();//animal method
	}

}
