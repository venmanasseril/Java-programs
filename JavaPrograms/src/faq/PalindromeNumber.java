package faq;
import java.util.*;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isPalindrome(num)) {
            System.out.println(num + " is a PALINDROME number");
        } else {
            System.out.println(num + " is NOT a palindrome number");
        }
        
        sc.close();
    }
    
    public static boolean isPalindrome(int number) {
        // Handle negative numbers (optional - usually not considered palindromes)
        if (number < 0) {
            return false;
        }
        
        int original = number;
        int reversed = 0;
        
        while (number > 0) {
            int digit = number % 10;           // get last digit
            reversed = reversed * 10 + digit;  // build reversed number
            number = number / 10;              // remove last digit
        }
        
        return original == reversed;
    }
}
