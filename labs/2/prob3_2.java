import java.util.Scanner;
public class prob3_2 
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		int n1 = (int) (Math.random()*9 + 1);
		int n2 = (int) (Math.random()*9 + 1);
		int n3 = (int) (Math.random()*9 + 1);
		int answer;
		
		System.out.print("What is " + n1 + " + " + n2 + " + " + n3 + "?: ");
		answer=reader.nextInt();
		
		System.out.println(n1 + " + " + n2 + " + " + n3 + " = " + (n1+n2+n3) 
				+ " is "+(n1+n2+n3==answer));
		
		
	}
}
