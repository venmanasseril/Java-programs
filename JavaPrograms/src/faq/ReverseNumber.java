package faq;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		//input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = sc.nextInt(); //1234
		sc.close();
		//1. using algorithm
		int reverse = 0; 
		StringBuffer sb= new StringBuffer(String.valueOf(number));
		StringBuffer rev = sb.reverse();
		System.out.println("Reverse number String buffer "+rev);
		StringBuilder x= new StringBuilder();
		x.append(number);
		StringBuilder xx= x.reverse();
		System.out.println("Reverse number StringBuilder "+xx);
		
		while(number !=0)
		{
			reverse = reverse*10 + number%10;
			number /=10;
		}
		
		System.out.println("Reverse number is "+reverse);
		
		
		

	}

}
