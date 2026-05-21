package arrayprograms;

public class ArrayExampleThree {

	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6 }; 
		
		for(int i=0; i< number.length; i++) //0,0<6,1<6,2<6 3<6 4<6 5<6 6<6
		{
			if(number[i]%2 == 0)           // false,true true true false true
			{
				System.out.println(number[i]); //2 4 6
			}
		}
	}

}
