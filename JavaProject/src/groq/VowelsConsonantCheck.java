package groq;
import java.util.*;
public class VowelsConsonantCheck {

	public static void main(String[] args) {
		// Read input string
		//Find length and loop to fetch characters
		//check for letters
		//vowels detected set count
		//consonent detected set count
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a String:");
		String input = scan.nextLine().toLowerCase();
		int vowelCount = 0;
		int consonentCount = 0;
		for(int i=0; i< input.length(); i++)
		{
			if(Character.isLetter(input.charAt(i)))
			{
				char temp = input.charAt(i);
				if(temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u')
				{
					vowelCount++;
				}
				else consonentCount++;
			}
		}
		System.out.println("Vowels :"+vowelCount);
		System.out.println("Consonents :"+consonentCount);
		scan.close();
	}

}
