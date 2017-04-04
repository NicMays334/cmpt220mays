/**
 * 	@author Nic Mays	
 *	@version problem 12.13
 */

import java.io.File;
import java.util.Scanner;
public class prob12_13 
{

	public static void main(String[] args) throws Exception
	{
		//arg check
		if(args.length!=1)
		{
			System.out.println("Usage: java FileName");
			System.exit(-1);
		}

		File file = new File(args[0]);
		if(!file.exists())
		{
			System.out.println("Bad File Name");
			System.exit(-1);
		}

		String s;
		int chars=0;
		int words=0;
		int lines=0;

		//input
		try(Scanner reader = new Scanner(System.in);)
		{
			while(reader.hasNext())
			{
				lines++;
				s = reader.nextLine();
				chars+=s.length();
			}
		}

		//output
		try(Scanner reader = new Scanner(file);)
		{
			while(reader.hasNext())
			{
				s = reader.next();
				words++;
			}
		}

		//print results
		System.out.println("File " + file.getName() + " has");
		System.out.println(chars + " characters");
		System.out.println(words + " words");
		System.out.println(lines + " lines");	
	}
}
