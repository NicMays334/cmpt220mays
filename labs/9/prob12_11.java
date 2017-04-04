/**
 *	@author Nic Mays
 *	@version problem 12.11 
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class prob12_11 
{
	public static String remove(String element, String line) 
	{
		StringBuilder sb = new StringBuilder(line);
		int start = sb.indexOf(element); 
		int end = element.length(); 

		while(start>=0) 
		{
			end = start + end;
			sb = sb.delete(start, end);
			start = sb.indexOf(element, start); 
		}
		return sb.toString();
	}
	
	public static void main(String[] args) throws Exception 
	{
		//arg check
		if(args.length != 2) 
		{
			System.out.println("Usage: java textToRemove FileName");
			System.exit(-1);
		}

		File file = new File(args[1]);
		if(!file.exists()) 
		{
			System.out.println("Bad File Name");
			System.exit(-1);
		}

		ArrayList<String> list = new ArrayList<>(); 
		String s;
		
		//input
		try(Scanner reader = new Scanner(file);) 
		{
			while(reader.hasNext()) 
			{
				s=reader.nextLine();
				list.add(remove(args[0], s));
			}
		}
		
		//output
		try(PrintWriter output = new PrintWriter(file);) 
		{
			for(int i=0; i<list.size(); i++) 
				output.println(list.get(i));
		}
	}	
}
