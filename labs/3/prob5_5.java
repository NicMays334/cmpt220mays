/**
 *	@author Nic Mays
 *	@version problem 5.5
 */

public class prob5_5 
{
	public static void main(String[] args) 
	{
		final double KILO = 2.2;

		System.out.println("Kilograms    Pounds     |     Pounds      Kilograms");
		
		for (int k = 1, p = 20; k <= 199 && p <= 515; k += 2, p += 5) {
			//format
			System.out.printf("%-12d%7.1f", k, (k * KILO));
			
			System.out.print("     |     ");
			
			System.out.printf("%-9d%12.2f\n", p, (p / KILO));
		}
	}
}
