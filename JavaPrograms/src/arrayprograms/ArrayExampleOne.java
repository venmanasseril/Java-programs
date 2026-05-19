package arrayprograms;

public class ArrayExampleOne {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50}; 
		for(int i=0; i<arr.length; i++) {// 0<5 1<5 true 2<5 3<5 4<5 5<5 false
			System.out.println(arr[i]);//10 20 30 40 50
		}
	}

}
