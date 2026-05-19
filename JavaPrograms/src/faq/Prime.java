package faq;

import java.util.Scanner;



public class Prime {
	
	public static boolean isPrime(int n) {
	    if (n <= 1)        return false;
	    if (n == 2)        return true;
	    if (n % 2 == 0)    return false;

	    for (int i = 3; i * i <= n; i += 2) {
	        if (n % i == 0) return false;
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (> 1) to check if prime: ");
		// Usage in main:
		int num = sc.nextInt();
		System.out.println(num + (isPrime(num) ? " is PRIME" : " is NOT prime"));
		sc.close();
	}

}
