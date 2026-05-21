package module3assessmentproblems;
import java.util.*;
public class Factorial {
	int input;     				//user input number
	
	Factorial(int input){ 		//parameterized constructor
		this.input = input; 	// current class instance initialized
	}
	
	public int factorial() {
		int temp=1;  			// local loop variable set to 1
								//for compute compounding
		if(this.input > 0)
		{
			do
			{	
				temp *= this.input; //1*10, 10*9, 90*8...
				this.input --;      // 10, 9, 8, 7, 6 
			
			}while(this.input >0);	//non zero or exit loop
		
			return temp; // n! value send back to main function to display
		}
		else
			return 1;   //  0! value send back to main function to display
		}
		//n! output return to function call
		

	public static void main(String[] args) {
		
		int number;				// local for user input
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Input : ");
		number =scanner.nextInt();  //user input received in number
		Factorial object = new Factorial(number);// class object creation for factorial call
		System.out.println("Factorial of "+number+" is "+object.factorial()); // return of function call is displayed
	}

}
