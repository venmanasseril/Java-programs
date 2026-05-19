package javakeywordsexamples;

public class FinalExample {
	final int speed = 100;//
	public void display() {
		System.out.println("Speed :"+speed);
		//speed = 200;
	}
	public static void main(String[] args) {
		FinalExample f = new FinalExample();
		f.display();
		
	}
}
