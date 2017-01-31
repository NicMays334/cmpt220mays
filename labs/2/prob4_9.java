/** 
 *	@author Nic Mays 
 *	@version problem 4.9
 */

import java.util.Scanner;
public class prob4_9
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		char c;
		
		System.out.print("Enter a character: ");
		c=reader.nextLine().charAt(0);
		
		//Converts to Unicode
		System.out.print("The unicode for the character "+c+" is "+(int) c);
		reader.close();
	}
}