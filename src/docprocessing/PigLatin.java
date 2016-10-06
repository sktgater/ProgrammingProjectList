// Author: Li Wang
// GitHub: https://github.com/sktgater
// This program takes user input and return the Pig-Latin conversion
// Exit the program by pressing CTRL + D

import java.util.Scanner;
import java.util.NoSuchElementException;

public class PigLatin{
	public static void main(String[] args){
		System.out.printf("Please enter a string:\n");
		try{
			Scanner stream = new Scanner(System.in);
			StringBuilder input = new StringBuilder(stream.next().toString().toLowerCase());
			System.out.printf("Original Input: %s\n", input);
			switch (input.charAt(0)){
				case 'a': 
				case 'e': 
				case 'i': 
				case 'o': 
				case 'u':
					System.out.printf("After Pig Latin: %s\n", input + "-ay");
					break;
				default:
					char first = input.charAt(0);
					StringBuilder last = input.deleteCharAt(0); 
					System.out.printf("After Pig Latin: %s\n", last.toString() + "-" + first + "ay");
			}
		}
		catch (NoSuchElementException e){
			System.out.printf("Closing Program\n");
		}
		
	}
}