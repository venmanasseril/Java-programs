package abstractionexamples;

public class Circle extends Shape {
	
	public void draw() {
		System.out.println("This is a abstract method");
	}

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.draw();
		circle.display();

	}

}
