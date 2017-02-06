/**
 *	@author Nic Mays
 *	@version problem 6.1
 */
public class prob6_1
{
	public static int getPentagonalNumber(int n)
	{
		n = n*((3*n)-1)/2;
		return (n);
	}
	
	public static void main(String[] args) 
	{
		int counter=0;
		for(int i=1; i<=100; i++)
		{
			if(counter==10)
			{
				System.out.println("\n");
				counter=0;
			}
			System.out.print(getPentagonalNumber(i)+" ");
			counter++;
		}
	}
}