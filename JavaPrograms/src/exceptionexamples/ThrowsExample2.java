package exceptionexamples;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample2 {

	public static void test() throws IOException, ArithmeticException{
		FileReader file = new FileReader("Test.txt");
		int a = 10/0;
		
	}
	
	public static void main(String[] args) {
		try {
			test();//call
		}
		catch(Exception e) {
			System.out.println("Exception occured :"+e);
		}

	}

}
