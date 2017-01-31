/** 
 *	@author Nic Mays 
 *	@version problem 4.20
 */

import java.util.Scanner;
public class prob4_20
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		String s;
		
		System.out.print("Enter a string: ");
		s=reader.next();
		
		System.out.println("First Letter: "+s.charAt(0));
		System.out.println("Length: "+s.length());
		reader.close();
	}
}
