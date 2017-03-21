/**
 *	@author Nic Mays
 *	@version problem 10.21
 */

import java.math.BigInteger;
public class prob10_21 
{
	public static void main(String[] args) 
	{
		BigInteger n = new BigInteger(Long.toString(Long.MAX_VALUE));
		BigInteger FIVE = new BigInteger("5");
		BigInteger SIX = new BigInteger("6");
		byte counter = 1;
		
		/*prints 10 numbers larger than Long.MAX_Value 
		 * that are divisible by 5 or 6*/
		System.out.println("First 10 numbers larger than "+Long.MAX_VALUE);
		System.out.println("divisble by 5 or 6\n");
		while(counter<=10)
		{
			if(n.mod(FIVE).compareTo(BigInteger.ZERO)==0
					||n.mod(SIX).compareTo(BigInteger.ZERO)==0)
			{
				System.out.println(n);
				counter++;
			}
			 n = n.add(BigInteger.ONE);
		}
	}
}
