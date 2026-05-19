package faq;

public class LargeSmallArrayValues {

	public static void main(String[] args) {
		int[] a = {12, 45, 2, 67, 34};
		//int[] a= {};
		if(a == null || a.length == 0)
		{
			System.out.println("Empty array");
			return;
		}
		int large = a[0];
		int small = a[0];
		for(int temp: a)
		{
			if(large<temp)large = temp;
			if(small>temp)small = temp;
		}
		System.out.println("Largest = "+large);
		System.out.println("Smallest = "+small);
	}

}
