package iterativestatement;

public class SkipAndExit 
{

	public static void main(String[] args) 
	{
		//print 1-20 numbers, skip 3multiples and stop it after 15.
		for(int i=1;i<=20;i++)
		{
			if(i==16)
			{
				break;
			}
			if(i%3 == 0)
			{
				continue;
			}
			System.out.println(i);	
		}

	}

}
