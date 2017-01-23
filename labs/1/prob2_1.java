import java.util.Scanner;
public class prob2_1 
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius: ");
		double celsius = reader.nextDouble();
		reader.close();
		
		double fahrenheit =  ((9.0/5.0) * celsius) + 32;
		System.out.print(celsius+" Celsius is "+fahrenheit+" Fahrenheit.");
	}
}