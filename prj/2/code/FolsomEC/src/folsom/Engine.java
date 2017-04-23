package folsom;

import java.io.IOException;
import java.util.Scanner;
public class Engine
{
	public static void main(String[] args) throws IOException
	{

		Scanner reader = new Scanner(System.in);
		FileReadWrite fwr = new FileReadWrite();
		String filename = "";
		String key = "";
		byte choice = 0;
		System.out.println("Folsom: ");
		System.out.println("\t1. Encrypt text file (.txt)");
		System.out.println("\t2. Decrypt text file (.txt)");
		System.out.print("choice: ");
		choice = reader.nextByte();
		double start;
		double finish;
		// M8pm1K60AX
		switch(choice)
		{
			case 1:
			{
				//file name entry
				System.out.print("\nEnter File Name (.txt) ex. Cash.txt: ");
				filename = reader.next();
				
				//key selection
				System.out.println("\nKey Options: ");
				System.out.println("\t1. Use own key");
				System.out.println("\t2. Generate key");
				System.out.print("choice: ");
				TextEncryptor te = new TextEncryptor(fwr.readTxt(filename), "", false);
				choice = reader.nextByte();
				
				//enter key
				if(choice==1)
				{
					System.out.print("\nEnter a key: ");
					key=reader.next();
					te.setKey(key);
				}
				
				//generate key
				else if(choice==2)
				{
					te.generateKey();
					System.out.println("Your key: "+te.getKey());
				}
				
				//reads, encrypts, and writes with time stamp
				start = System.currentTimeMillis();
				
				te.dynamicEncrypt();
				
				fwr.writeCypher(filename, te.getMessage());
				finish = System.currentTimeMillis();
				
				System.out.println("\nEncrypting . . .");
				if(te.getMessage().compareTo("")==0)
					System.err.print("Encryption failed.");					
				else
				{
					System.out.println("Successful encryption of "+filename);
					System.out.println("Executed in: "+((finish-start)/1000)+" seconds.");
				}
				reader.close();
				te.terminate();
			}
			break;
			
			case 2:
			{
				System.out.print("\nEnter File Name (.txt) ex. Cash.txt: ");
				filename = reader.next();
				System.out.print("\nEnter a key: ");
				key = reader.next();
				
				//reads, decrypts and writes with time stamp
				start = System.currentTimeMillis();
				TextEncryptor td = new TextEncryptor(fwr.readCypher(filename), key, true);
				td.dynamicDecrypt();
				
				fwr.writeTxt(filename, td.getMessage());
				finish = System.currentTimeMillis();
				           
				if(td.getMessage().compareTo("")==0)
					System.err.println("Decryption failed.");

				else
				{
					System.out.println("Successful encryption of "+filename);
					System.out.println("Executed in: "+((finish-start)/1000)+" seconds.");
				}
				reader.close();
				td.terminate();
			}
			break;
		}
	}
}
