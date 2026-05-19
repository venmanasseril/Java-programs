package faq;
import java.util.Scanner;


public class PrimeCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number for check");
		int num = scanner.nextInt();
		boolean flag = false;
		
		if(num > 1)
		{
			
			
		
		
		if(num <=3 && num >1) {
			// only even prime number
			System.out.println("A prime number");
		}
		else if((num%2 == 0 || num%3 ==0 )&& num>0)
		{
			System.out.println("Not a prime number, multiples of 2 or 3");
		}
		else
		{
			for(int i=2;i<= num/2; i++) {
				if(num%i == 0)
				{
					
					flag =true;
					break;
				}
			}
			if(flag) {
				System.out.println("Not a Prime");
			}
			else {
				System.out.println("A Prime number");
			}
		}
		}
		System.out.println("Not a prime.");
		
		
		scanner.close();
	}

}
