/**
 * 	@author Nic Mays	
 *	@version problem 12.7
 */

import java.util.Scanner;
public class prob12_7 
{
	//converts a binary string to decimal format
	public static int bin2Dec(String binary) throws NumberFormatException
	{
		int decimal=0;
		int bit;
		for(int i=0, j=binary.length()-1; i<binary.length(); i++, j--)
		{
			bit = Character.getNumericValue(binary.charAt(i));
			
			//throws exception if bit isnt 0 or 1
			if(bit!=1&&bit!=0)
				throw new NumberFormatException("Not a Binary String");
			
			decimal+=bit*(int)Math.pow(2, j);
		}
		
		return decimal;
	}
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		String binary;
		System.out.println("Enter a binary string: ");
		binary = reader.next();
		
		try
		{
			System.out.println(bin2Dec(binary));
		}
		catch(NumberFormatException x)
		{
			System.err.println(x.getMessage());
		}
		reader.close();
	}
}
