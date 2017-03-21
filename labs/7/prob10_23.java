/**
 * 	@author Nic Mays	
 *	@version problem 10.23
 */
class MyString2 
{
	private String value;

	/* Create a new Mystring2 object */
	public MyString2(String s)
	{
		this.value=s;
	}

	/* Compares 2 string objects and returns 0 if they're equal
	 * -1 if less than
	 * 1 if greater than*/
	public int compare(String s) 
	{
		int index = 0;
		
		if (this.value.length()<s.length())
		{
			index = -1;
			return(index);
		}
		
		if (this.value.length()> s.length())
		{
			index = 1;
			return(index);
		}

		
		for (int i = 0; i<this.value.length(); i++) 
		{
			if (this.value.charAt(i)>s.charAt(i))
				index = -1*(i + 1);
			
			else if (this.value.charAt(i)<s.charAt(i))
				index = i + 1;
		}
		if(index>0)
			return(1);
		
		else if(index<0)
			return(-1);
		
		else
			return(0);
	}

	/* returns substring at the specified start */
	public MyString2 substring(int begin) 
	{
		String s = "";
		for (int i=begin; i<this.value.length(); i++) 
		{
			s+=value.charAt(i);
		}
		return new MyString2(s);
	}

	/* returns the string in all uppercase characters */
	public MyString2 toUpperCase() 
	{
			String s = "";
			for (int i = 0; i < this.value.length(); i++) 
			{
				if (this.value.charAt(i) >= 'a' && this.value.charAt(i) <= 'z')
					s += String.valueOf((char)(this.value.charAt(i) - 32));
				else
					s += String.valueOf(this.value.charAt(i));
			}
			return new MyString2(s);
	}

	/* Return string as a character array */
	public char[] toChars() 
	{
		char[] chars = new char[this.value.length()];
		
		for (int i=0;i<this.value.length();i++) 
			chars[i] = this.value.charAt(i);
		
		return chars;
	}

	/* Returns a boolean as a new MyString object */
	public static MyString2 valueOf(boolean b) 
	{
		if(b)
			return(new MyString2("true"));
		else
			return(new MyString2("false"));
	}
	
	public String toString()
	{
		return(this.value);
	}

}

public class prob10_23
{
	public static void main(String[] args)
	{
		MyString2 s = new MyString2("onomatopoeia");
		
		System.out.println("Compare test: onomatopoeia to ANOMATOPOEIA");
		System.out.println(s.compare("ONOMATOPOEIA"));
		
		System.out.println("Compare test: onomatopoeia to zeta");
		System.out.println(s.compare("Zeta"));
		
		System.out.println("Compare test: onomatopoeia to onomatopoeia");
		System.out.println(s.compare("onomatopoeia"));
		
		System.out.println("\nSubstring Test at index 4: ");
		System.out.println(s.substring(4));
		
		System.out.println("\nTo Upper Case Test: ");
		System.out.println(s.toUpperCase());
		
		System.out.println("\nTo character test: ");
		char[] chars = s.toChars();
		for(int i=0; i<chars.length; i++)
			System.out.print(chars[i]+" ");
		System.out.println();
		
		System.out.println("\nboolean test: TRUE");
		System.out.println(MyString2.valueOf(true));
		
		System.out.println("\nboolean test: False");
		System.out.println(MyString2.valueOf(false));
		
	}
}
