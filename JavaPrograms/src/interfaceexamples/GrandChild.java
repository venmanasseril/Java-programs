package interfaceexamples;

public class GrandChild extends Child{
	public void business() {
		System.out.println("Grand child");
	}
	public static void main(String[] args) {
		GrandChild grandchild = new GrandChild();
		grandchild.house();
		grandchild.key();
		grandchild.education();
		grandchild.business();

	}

}
