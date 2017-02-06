/**
 *	@author Nic Mays
 *	@version problem 5.16
 */
import java.util.Scanner;
public class prob5_16 
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		String output = "The factors are: ";
		int n;
		boolean format = false;
		
		System.out.print("Enter an Integer: ");
		n=reader.nextInt();
		
		for(int i=2; i<=n;)
		{
				
			if(n%i==0)
			{
				//formatting commas.
				if(format)
					output+=", ";		
				
				output+=i;
				n=n/i;
				format=true;
			}
			
			else
				i++;
		}
		
		System.out.println(output+".");
	}
  }
