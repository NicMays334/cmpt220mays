public class prob1_4 
{
	public static void main(String[] args)
	{
		System.out.println("a\t"+"a^2\t"+"a^3");
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=3; j++)
				System.out.print( (int) (Math.pow(i, j))+"\t");
			System.out.println();
		}
	}
}
