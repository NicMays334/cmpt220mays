/**
 * 	@author Nic Mays
 *	@version problem 7.14
 */
public class prob7_14 
{
	public static int gcd(int[] array)
	{
		int min = Integer.MAX_VALUE;
		for(int i=0; i<array.length; i++)
		{
			min = min < array[i]? min : array[i];
		}
		int divisor = 1;
		int iterator = 0;
		while(divisor<=min)
		{
			if(array[iterator]%divisor==0)
				iterator++;
			
			if(iterator==array.length)
				iterator=0;
				divisor++;
		}
		return(divisor);
	}
	public static void main(String[] args) 
	{
		int array [] = {45, 60, 75};
		System.out.println(gcd(array));
	}

}
