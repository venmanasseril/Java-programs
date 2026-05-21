package arrayprograms;

public class ArrayExampleTwo {

	public static void main(String[] args) {
	                	
		int[] num = {22, 44,67,12,100};
		int max = num[0];   //max=22
		
		for(int i=1; i<num.length;i++)// i=1,1<5 2<5 3<5 4<5 5<5 False
		{
			if(num[i]> max)        //44>22 true 67>44 12>67 false 100>67
			{// 44>22 true,
				max = num[i];// 44,67,100
				
			}
		}
		System.out.println("Largest :"+max);
		

	}

}
