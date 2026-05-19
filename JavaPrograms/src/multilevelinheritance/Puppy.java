package multilevelinheritance;

public class Puppy extends Dog{
	public void weep() {
		System.out.println("Puppy is weeping");
	}

	public static void main(String[] args) {
		Puppy p = new Puppy();
		p.eat();//animal
		p.bark();//dog
		p.weep();

	}

}
