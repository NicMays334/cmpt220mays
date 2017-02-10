/**
 *	@author Nic Mays
 *	@version problem 6.9
 */

public class prob6_9 
{
	/*converts feet to meters*/
	public static double footToMeter(double foot)
	{
		return(0.305*foot);
	}
	
	/*converts meters to feet*/
	public static double meterToFoot(double meter)
	{
		return(3.279*meter);
	}

	public static void main(String[] args) 
	{
		System.out.println("Feet      "+"Meters      "+"|      "+"Meters      "+"Feet");
		System.out.println("-------------------------------------------------");
		for(double feet=1, meters=20; feet<=10; feet++, meters+=5)
		{
			
			System.out.printf("%4.1f", feet);
			System.out.printf("%11.3f", footToMeter(feet));
			System.out.printf("%8s", "|");
			System.out.printf("%11.1f", meters);
			System.out.printf("%13.3f", meterToFoot(meters));
			
		    //System.out.print(feet+"          ");
		    //System.out.printf("%-1.2f", footToMeter(feet));
		    System.out.println();
		    //System.out.printf("%20s %15.2 \n", meters, meterToFoot(meters) );
		//System.out.printf("%.3f", footToMeter(feet));
		//ystem.out.print("        ");
		//System.out.printf(meters+"           ");
		//System.out.printf("%.3f", meterToFoot(meters));
		//System.out.print("            ");
		//System.out.println();
		}
	}

}
