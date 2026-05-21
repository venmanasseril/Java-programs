package iterativestatement;

public class WhileExampleTwo {

	public static void main(String[] args) {
		int i = 1;
		int sum =0; 
		while(i<=10) {
			sum = sum + i;// 1,3,6..55
			i++;// i=11
			
		}
		System.out.println(sum);

	}

}
