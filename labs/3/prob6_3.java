/**
 *	@author Nic Mays
 *	@version problem 6.3
 */
import java.util.Scanner;
public class prob6_3 
{
	public static int reverse(int n)
	{
		
		StringBuilder s = new StringBuilder(Integer.toString(n));
		s=s.reverse();
		return(Integer.parseInt(s.toString()));
	}
	
	public static boolean isPalindrome(int n)
	{
		if(reverse(n)==n)
			return true;
		
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		int n;
		System.out.print("Enter an integer: ");
		n=reader.nextInt();
		
		if(isPalindrome(n))
			System.out.println(n+" is a palindrome");
		
		reader.close();
	}
}