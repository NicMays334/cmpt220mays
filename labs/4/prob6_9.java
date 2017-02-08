/**
 *	@author Nic Mays
 *	@version problem 6.9
 */


/*
 * Problem 6.9
Problem 6.12
Problem 6.16
Problem 6.18
Problem 7.2
Problem 7.4
Problem 7.8

 */
public class prob6_9 
{
	/*converts feet to meters*/
	public static double footToMeter(double foot)
	{
		return(0.305*foot);
	}
	
	/*converts meters to feet*/
	/**
	 
	 * @param meter
	 * @return 3.279*meter
	 */
	public static double meterToFoot(double meter)
	{
		return(3.279*meter);
	}

	public static void main(String[] args) 
	{
		System.out.println("Feet      "+"Meters      "+"|      "+"Meters      "+"Feet");
		System.out.println("--------------------------------------------------------------");
		for(double feet=1, meters=20; feet<=10; feet++, meters+=5)
		{
			System.out.printf(feet+"          ");
			
		System.out.printf("%.3f", footToMeter(feet));
		System.out.print("        ");
		System.out.printf(meters+"           ");
		System.out.printf("%.3f", meterToFoot(meters));
		System.out.print("            ");
		System.out.println();
		}
	}

}
