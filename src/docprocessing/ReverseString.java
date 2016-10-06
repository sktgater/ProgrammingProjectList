// Author: Li Wang
// GitHub: https://github.com/sktgater
// This program takes a string from standard input, and output the original 
// string with reversed string
// Exit the program by pressing CTRL + D


import java.util.Scanner;
import java.util.NoSuchElementException;

public class ReverseString{
	public static void main(String[] args){
		try{
			System.out.printf("Please Enter a String:\n");
			Scanner stream = new Scanner(System.in);
			StringBuilder input = new StringBuilder(stream.next());
			System.out.printf("Input String: %s\n", input);
			System.out.printf("Reverse String: %s\n", input.reverse());
			stream.close();
		}
		catch (NoSuchElementException e){
			System.out.printf("Closing Program\n");
		}
	}
}

