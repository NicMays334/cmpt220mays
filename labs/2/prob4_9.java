import java.util.Scanner;
public class prob4_9
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		char c;
		
		System.out.print("Enter a character: ");
		c=input.nextLine().charAt(0);
		
		//Converts to Unicode
		System.out.print("The unicode for the character "+c+" is "+(int) c);
		input.close();
	}
}