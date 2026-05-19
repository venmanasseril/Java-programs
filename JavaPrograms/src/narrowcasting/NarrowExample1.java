package narrowcasting;

public class NarrowExample1 {

	public static void main(String[] args) {
		// double to int
		double d =100.50;
		int num = (int) d;//explicitly casted data loss .5
		System.out.println("double value :"+d);
		System.out.println("after casting to int :"+num);

	}

}
