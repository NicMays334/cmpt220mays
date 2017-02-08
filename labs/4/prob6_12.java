/**
 *	@author Nic Mays
 *	@version problem 6.9
 */
public class prob6_12 
{

	public static void printChars(char ch1, char ch2, int numberPerLine)
	{
		int counter = 1;
		while(ch1<=ch2)
		{
			System.out.print(ch1+" ");
			if(counter==numberPerLine)
			{
				System.out.println();
				counter=0;
			}
			ch1++;
			counter++;
		}
	}
	public static void main(String[] args)
	{
		printChars('1', 'Z', 10);
	}

}
