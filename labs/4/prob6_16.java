/**
 *	@author Nic Mays
 *	@version problem 6.16
 */
public class prob6_16 
{
	public static int numberOfDaysInAYear(int year)
	{
		if(year%4==0)
			return(366);
		else
			return(365);
	}
	public static void main(String[] args) 
	{
		System.out.println("Year  | Days");
		System.out.println("-------------");
		for(int i=2000; i<2020; i++)
			System.out.println(i+"  |  "+numberOfDaysInAYear(i));
	}

}
