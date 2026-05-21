package groq;

public class MultilevelInhertance extends SingleInheritanceChild implements Mega{
	public static String cmethod(String s) {
		return "Yes";
	}
	public void mega() {
		System.out.println("Yo :");
	}
	
	public static void main(String[] args) {
		MultilevelInhertance c = new MultilevelInhertance();
		String j=cmethod("No");
		System.out.println(j);
		c.parent_method(2);
		c.child_method("h");
		c.mega();

	}

}
