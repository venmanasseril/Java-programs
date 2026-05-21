package module3assessmentproblems;

public class FibonacciSeriesGeneration {
	
	
	public void series() {
		
		int first = 0;
		int second = 1;//the first two numbers are always 0 and 1.
		System.out.printf(first+", "+second+", ");
		while((first + second)<50) //less than 50 or exit
		{
			
		int next = first + second;
		System.out.printf(next+", ");
		first = second;
		second = next;
		
		}
		
	}

	public static void main(String[] args) {
		FibonacciSeriesGeneration object = new FibonacciSeriesGeneration();// class object creation for factorial call
		object.series();

	}

}
