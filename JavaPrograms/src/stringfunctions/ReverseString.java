package stringfunctions;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Hello";//5
		String reverse = "";
		for(int i=s.length()-1; i>=0; i--) //i=4 3 2    1    0
		{
			reverse = reverse + s.charAt(i);//o ol oll olle olleH
		}
		System.out.println("Reverse string :"+reverse);

	}

}
