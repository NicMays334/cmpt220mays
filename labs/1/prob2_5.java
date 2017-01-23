import java.util.Scanner;
public class prob2_5 
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		double amount;
		double grat;
		
		System.out.print("Enter the subtotal and a gratuity rate: ");
		amount = reader.nextDouble();
		grat = reader.nextDouble();
		reader.close();
		
		grat = grat/100.0;
		System.out.print("The gratuity is $"+(grat*amount)+" and total is $"+(grat*amount+amount));
	}
}
