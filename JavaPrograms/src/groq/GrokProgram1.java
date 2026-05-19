package groq;
import java.util.Scanner;
public class GrokProgram1 {
    public static void main(String[] args) {
        System.out.println("Enter number of rows :");
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        System.out.println("Enter number of columns :");
        int column = scan.nextInt();
        int[][] matrx = new int[row][column];
        
        for(int i=0; i<row; i++)
        {
        	for(int j=0;j<column;j++)
        	{
        		System.out.println("Enter element at ["+i+"]["+j+"]");
        		matrx[i][j] = scan.nextInt();
        	}
        	
        }
        int matrixSum = 0;
        for(int i=0; i<row; i++)
        {
        	for(int j=0;j<column;j++)
        	{
        		System.out.print(matrx[i][j]+" ");
        		matrixSum += matrx[i][j];
        		
        	}
        	System.out.println();	
        }
        System.out.println("Total sum of elements :"+matrixSum);
    }
}