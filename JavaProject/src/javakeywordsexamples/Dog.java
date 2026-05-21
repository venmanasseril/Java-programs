package javakeywordsexamples;

public class Dog extends Animal{
	
		String color = "Black";
		
		public void printColor() {
			System.out.println(color);  //dog v
			System.out.println(super.color); //animal v
		}
		
		public static void main(String[] args) {
			Dog d = new Dog();
			d.printColor();

		}

	}


