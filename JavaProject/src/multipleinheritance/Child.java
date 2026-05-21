package multipleinheritance;

public class Child implements Father, Mother{
	public void money() {
		System.out.println("Father");
	}
	public void top() {
		System.out.println("Mother");
	}
	
	public static void main(String[] args) {
		Child obj  =new Child();
		obj.money();
		obj.top();

	}

}
