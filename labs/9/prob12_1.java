/**
 * 	@author Nic Mays	
 *	@version problem 12.1
 */

public class prob12_1 
{
	public static void main(String[] args) throws NumberFormatException 
	{
		// Check number of strings passed
		if (args.length != 3) {
			System.out.println(
				"Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}

		// The result of the operation
		int result = 0;

		// Exeception handler to deal with nonnumeric operands
		try {
			// Determine the operator
			switch (args[1].charAt(0)) {
				case '+' : result = Integer.parseInt(args[0]) +
										  Integer.parseInt(args[2]);
							  break;
				case '-' : result = Integer.parseInt(args[0]) -
										  Integer.parseInt(args[2]);
							  break;
				case '.' : result = Integer.parseInt(args[0]) *
										  Integer.parseInt(args[2]);
							  break;
				case '/' : result = Integer.parseInt(args[0]) /
										  Integer.parseInt(args[2]);
							  break;
			}	
			
			// Display result
			System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
				+ " = " + result);
			
		}catch (NumberFormatException x) 
		{
			System.out.println("Non numeric input.\n"+x.getMessage());
		}
	}
}
