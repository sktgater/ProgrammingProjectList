// Author: Li Wang
// GitHub: https://github.com/sktgater
// This program takes a string from the standard input and test 
// if it is palindrome
// Exit the program by pressing CTRL + D

import java.util.Scanner;
import java.util.NoSuchElementException;

public class Palindrome{
	public static void main(String[] args){
		try{
			System.out.printf("Please Enter a String:\n");
			Scanner stream = new Scanner(System.in);
			String input = stream.next();
			System.out.printf("Input String: %s\n", input);
			if (input.equalsIgnoreCase((new StringBuilder(input)).reverse().toString())){
				System.out.printf("It is a Palindrome\n");
			}
			else
				System.out.printf("It is Not a Palindrome\n");
			stream.close();
		}
		catch (NoSuchElementException e){
			System.out.printf("Closing Program\n");
		}
	}
}

