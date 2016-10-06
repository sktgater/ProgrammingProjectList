// Author: Li Wang
// GitHub: https://github.com/sktgater
// This program takes user input and count how many vowel letters inside the string
// Exit the program by pressing CTRL + D

import java.util.*;

public class VowelStat{
	public static void main(String[] args){
		try{
			System.out.printf("Please Enter a String:\n");
			Scanner stream = new Scanner(System.in);
			StringBuilder input = new StringBuilder(stream.nextLine());
			Hashtable<Character,Integer> dict = new Hashtable<Character, Integer>(5);
			dict.put('a',0);
			dict.put('e',0);
			dict.put('i',0);
			dict.put('o',0);
			dict.put('u',0);
			for (int i = 0; i < input.length(); i++){
				char test = Character.toLowerCase(input.charAt(i));
				if (dict.containsKey(test))
					dict.put(test,dict.get(test)+1);
			}
			System.out.printf("Total Vowel Count: %s\n", dict.toString());
		}
		catch (NoSuchElementException e){
			System.out.printf("Closing Program\n");
		}
	}
}
