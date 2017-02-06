
public class prob5_5 {

	public static void main(String[] args) 
	{
		final float KILO = (float) 2.20462;
		System.out.println("Kilograms    Pounds  |  Pounds    Kilograms");
		int kilograms = 1;
		int pounds = 20;
		while(pounds<516)
		{
			System.out.print(kilograms+"    ");
			System.out.printf("%.1f",kilograms*KILO);
			
			System.out.print("  |  ");
			System.out.print(pounds+"    ");
			System.out.printf("%.2f",pounds/KILO);
			System.out.println();
			
			
			
			
			kilograms+=2;
			pounds+=5;
		}
	}

}
