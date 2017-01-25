import java.util.Scanner;
import java.util.Arrays;
public class prob4_13 
{
	public static void main(String[] args) 
	{
		Character[] vowels = {'a', 'e', 'i', 'o', 'u'};
		char letter;
		Scanner reader = new Scanner(System.in);
	
		System.out.print("Enter a letter: ");
		letter = reader.next().charAt(0);
		letter = Character.toLowerCase(letter);
		
		System.out.print(letter+" is a ");
		if(Arrays.binarySearch(vowels, letter)>=0)
			System.out.println("vowel.");
		
		else
			System.out.println("consonant.");
		reader.close();	
	}
}









/*////////////char ch = 'E';
		String hex = String.format("%04x", (int) ch);
		System.out.println(hex);*/