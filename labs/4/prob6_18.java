/** 
 *	@author Nic Mays
 *	@version problem 6.18
 */
import java.util.Scanner;
public class prob6_18 
{	
	public static boolean checkLength(String password)
	{
		if(password.length()>=8)
			return true;
		else
			return false;
	}
	
	public static boolean lettersAndDigits(String password)
	{
		char c;
		for(int i=0; i<password.length(); i++)
		{
			c=password.charAt(i);
				if(!Character.isAlphabetic(c) && !Character.isDigit(c))
					return false;
		}
		return(true);
	}
			
	public static boolean contains2Digits(String password)
	{
		int digitCounter = 0;
		for(int i=0; i<password.length(); i++)
		{
			if(Character.isDigit(password.charAt(i)))
				digitCounter++;
			
			if(digitCounter==2)
				return true;
		}
		
		return(false);
	}
	
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		String pass;
		boolean strong = false;
		
		do{
			System.out.print("Enter a password to be checked: ");
			pass = reader.nextLine();
			if(contains2Digits(pass)&&lettersAndDigits(pass)&&checkLength(pass))
				strong=true;
			else
				System.out.println("Invalid Password\n");
			
		}while(!strong);
		
		System.out.println("Valid Password");
		reader.close();
	}
}
