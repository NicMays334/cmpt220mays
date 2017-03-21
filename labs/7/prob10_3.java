/**
 * 	@author Nic Mays	
 *	@version problem 10.3
 */

class MyInteger
{
	private int value;
	
	MyInteger(int arg0)
	{
		this.value=arg0;
	}
	
	//getter method for value
	public int getValue()
	{
		return(this.value);
	}
	
	//returns true if specified is even
	public boolean isEven()
	{
		return(this.value%2==0);
	}
	
	//returns true if specified is odd
	public boolean isOdd()
	{
		return(this.value%2!=0);
	}
	
	//returns true if specified is prime
	public boolean isPrime()
	{
		    for(int i=2; i<=Math.sqrt(this.value); i++) 
		        if(this.value%i==0)
		        	return false;
		    return true;
	}
	
	//returns true if arg is Even
	public static boolean isEven(int n)
	{
		return(n%2==0);
	}
	
	//returns true if arg is Odd
	public static boolean isOdd(int n)
	{
		return(n%2!=0);
	}
	
	//returns true if arg is Prime
	public static boolean isPrime(int n)
	{
		    for(int i=2; i<=Math.sqrt(n); i++) 
		        if(n%i==0)
		        	return false;
		    return true;
	}
	
	//returns true if specified MyInteger arg is Even
	public static boolean isEven(MyInteger n)
	{
		return(n.value%2==0);
	}
	
	//returns true if specified MyInteger arg is Odd
	public static boolean isOdd(MyInteger n)
	{
		return(n.value%2!=0);
	}
	
	//returns true if specified MyInteger arg is Prime
	public static boolean isPrime(MyInteger n)
	{
		    for(int i=2; i<=Math.sqrt(n.value); i++) 
		        if(n.value%i==0)
		        	return false;
		    return true;
	}
	
	//returns true if the value of the specified integer is equal to the arg
	public boolean equals(int n)
	{
		return(this.value==n);
	}
	
	/*returns true if the value of the specified integer is equal
	 	to the value of the MyInteger arg*/
	public boolean equals(MyInteger n)
	{
		return(this.value==n.value);
	}
	
	//converts a character of digits to a single MyInteger object
	public static int parseInt(char[] bits)
	{
		String s = "";
		for(int i=0; i<bits.length; i++)
			s+=bits[i];
		return(Integer.valueOf(s));
	}
	
	//converts a string of digits to a MyInteger object
	public static int parseInt(String s)
	{
		return(Integer.parseInt(s));
	}
	
}

public class prob10_3
{
	public static void main(String[] args)
	{
		MyInteger n = new MyInteger(42);
		char[] chars = {'5', '3', '2', '7', '6', '1','9'};
		System.out.println("Get Value Test: "+n.getValue());
		
		//Even Odd Prime Test
		System.out.println("\n42 Is Even Test: "+n.isEven());
		System.out.println("42 Is Odd Test: "+n.isOdd());
		System.out.println("42 Is Prime Test: "+n.isPrime());
		
		//Static even odd prime test with int as arg
		System.out.println("\n83 isEven(int): "+MyInteger.isEven(83));
		System.out.println("83 isOdd(int): "+MyInteger.isOdd(83));
		System.out.println("83 isPrime(int): "+MyInteger.isPrime(83));
		
		//Static evem odd prime test with MyInteger as arg
		System.out.println("\n2 isEven(MyInteger): "+MyInteger.isEven(new MyInteger(2)));
		System.out.println("2 isOdd(MyInteger): "+MyInteger.isOdd(new MyInteger(2)));
		System.out.println("2 isPrime(MyInteger): "+MyInteger.isPrime(new MyInteger(2)));
		
		//Comparison Test with int as arg
		n = new MyInteger(453);
		System.out.println("\nEquals(int) Test 453 v.s. 453: "+n.equals(453));
		System.out.println("Equals(int) Test 453 v.s. 17: "+n.equals(17));
		
		//comparision Test with MyInteger as arg
		System.out.println("\nEquals(MyInteger) Test 453 v.s. 453: "+n.equals(new MyInteger(453)));
		System.out.println("Equals(MyInteger) Test 453 v.s. 12: "+n.equals(new MyInteger(12)));
		
		//parseInt Test with char array
		System.out.print("\nParseInt(chars[]) Test: 5, 3, 2, 7, 6, 1, 9: ");
		System.out.println(MyInteger.parseInt(chars));
		
		//parseInt Test with String
		System.out.print("ParseInt(String) Test: \"5327619\": ");
		System.out.println(MyInteger.parseInt("5327619"));
	}
}

