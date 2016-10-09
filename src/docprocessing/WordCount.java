import java.io.*;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class WordCount{
	public static void main(String[] args){
		if (args.length != 1)
			System.err.printf("Usage WordCount <file>\n");

		try{
			File fileStream = new File(args[0]);
			if (!fileStream.canRead())
				System.err.printf("File not readable.\n");
			Scanner input = new Scanner (fileStream);
			int count = 0;
			while(input.hasNext()){
				count++;
				input.next();
			}
			System.out.printf("Total Word Numbers: %d\n",count);
			input.close();
		}
		catch (FileNotFoundException e){
			System.err.printf("File Not Found\n");
		}
		catch (NoSuchElementException e){
			System.out.printf("Close Program\n");
			System.exit(0);
		}
	}
}