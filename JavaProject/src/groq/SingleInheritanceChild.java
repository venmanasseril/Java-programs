package groq;

public class SingleInheritanceChild extends SingleInheritance {
	public String child_method(String s) {
		return "Yes";
	}
	
	
	public static void main(String[] args) {
		SingleInheritanceChild c = new SingleInheritanceChild();
		String j=c.child_method("No");
		System.out.println(j);
		c.parent_method(2);

	}

}
