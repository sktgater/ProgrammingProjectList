// CD-Key Verifier. Ask user to enter a 11-digit number and test if
// it is a valid CD-Key.
import java.util.Scanner;

public class CDKey{
	public static void main(String[] args){
		System.out.printf("Please Enter The CD-Key:\n");
		Scanner input = new Scanner(System.in);
		long key = input.nextLong();
		int lastDigit = (int)(key % 10);
		int sum = 0;
		while (key > 9){
			sum = sum + (int)(key % 10);
			key = key/10;
		}
		if (sum == lastDigit)
			System.out.println("CD-Key is Valid");
		else
			System.out.println("CD-Key is Not Valid");
	}
}