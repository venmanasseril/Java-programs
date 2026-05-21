package interfaceexamples;
//multiple inheritance via interface
public class Child implements Father, Mother{
	public void house() {
		System.out.println("Father's house :");
	}
	
	public void key() {
		System.out.println("house key :");
	}
	public void education() {
		System.out.println("Child is educated");
	}

}
