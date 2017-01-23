import java.util.Scanner;
public class prob2_9 
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		double v0;
		double v1;
		double t;
		
		System.out.print("Enter v0, v1, and t: ");
		v0=reader.nextDouble();
		v1=reader.nextDouble();
		t=reader.nextDouble();
		
		System.out.println("The average acceleration is: " + (v1-v0)/t);
		reader.close();
	}
}
