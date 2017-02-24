/**
 *	@author Nic Mays
 *	@version problem 7.14
 */

// JA: Always add comments to your code
import java.util.Scanner;
public class prob7_14
{
	public static int gcd(int... numbers) 
	{
		int min=0;
		int gcd = 1;			
		boolean divisor;
		
		for(int i=0; i<numbers.length; i++)
			if(numbers[min]>numbers[i])
				min=i; // JA: This should be the value, not the index
		
		for (int i = 2; i < min ; i++) // JA: You have to include min (<=)
		{
			divisor = true;
			
			for (int j: numbers) 
			{
				if (j % i != 0)
					divisor = false;
			}
			if (divisor)
				gcd = i;
		}
		
		return gcd;
	}

	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in); 
		int[] array = new int[5]; 
		
		System.out.print("Enter five numbers: ");
		for (int i = 0; i < array.length; i++) 
			array[i] = reader.nextInt();

		System.out.println("The greatest common divisor is " + gcd(array));
		reader.close();
	}
}