/**
 * @author Nic Mays
 * @version problem 9.5
 */

import java.util.GregorianCalendar;
public class prob9_5 
{
	public static void main(String[] args)
	{
		GregorianCalendar date = new GregorianCalendar();
		
		//print today's date
		System.out.println("Todays Date:");
		System.out.print(date.get(GregorianCalendar.YEAR));
		System.out.print(" / ");
		System.out.print(date.get(GregorianCalendar.MONTH));
		System.out.print(" / ");
		System.out.println(date.get(GregorianCalendar.DAY_OF_MONTH));
		
		//Sees date after x amount of time has past since 1/1/1970
		date.setTimeInMillis(1234567898765L);
		System.out.println("\nTime Lapse Test: ");
//		System.out.print(date.YEAR);
		System.out.print(date.get(GregorianCalendar.YEAR));
		System.out.print(" / ");
//		System.out.print(date.MONTH);
		System.out.print(date.get(GregorianCalendar.MONTH));
		System.out.print(" / ");
//		System.out.println(date.DAY_OF_MONTH);
		System.out.println(date.get(GregorianCalendar.DAY_OF_MONTH));
	}
}
