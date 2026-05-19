package faq;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a String :");
        String input= sc.nextLine();
        String reverse = new StringBuilder(input).reverse().toString();
        System.out.println("Reverse is :"+reverse);
        
    }
}
