/**
 * 	@author Nic Mays	
 *	@version problem 8.10
 */

public class prob8_10 
{
	public static int greatestColumn(int matrix[][])
	{
		int sum=0;
		int maxSum = 0;
		int index=0;
		
		for(int i=0; i<4; i++)
		{
			sum=0;
			
			for(int j=0; j<4; j++)
			{
				sum+=matrix[j][i];
			}
			
			if(sum>maxSum)
			{
				maxSum=sum;
				index=i;
			}
		}
		
		return(index);
	}
	
	public static int greatestRow(int matrix[][])
	{
		int sum=0;
		int maxSum = 0;
		int index=0;
		
		for(int i=0; i<4; i++)
		{
			sum=0;
			
			for(int j=0; j<4; j++)
			{
				sum+=matrix[i][j];
			}
			
			if(sum>maxSum)
			{
				maxSum=sum;
				index=i;
			}
		}
		
		return(index);
	}
	
	public static void main(String[] args) 
	{
		int matrix[][] = new int[4][4];
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				matrix[i][j] = (int) (Math.random()*2);
			}
		}
		
		for(int i=0; i<4; i++)
		{
			System.out.println();
			
			for(int j=0; j<4; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
		}
		
		System.out.println();
		System.out.println("\nThe largest row index: "+greatestRow(matrix));
		System.out.println("The largest column index: "+greatestColumn(matrix));
	}
}