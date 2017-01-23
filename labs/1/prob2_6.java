import java.util.Scanner;
public class prob2_6 
{

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		int n=0;
		String s;
		
		System.out.print("Enter a number between 0 and 1000: ");
		n=reader.nextInt();
		reader.close();
		
		s=Integer.toString(n);
		n=0;
		
		for(int i=0; i<s.length(); i++)
			n+=Character.getNumericValue(s.charAt(i));
		System.out.println("The sum of the digits is " + n);
	}
}
