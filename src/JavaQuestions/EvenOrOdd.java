package JavaQuestions;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		int a;
		System.out.println("Enter on Digit:");
		a = reader.nextInt();
		
		if (a % 2 == 0)
		{
			System.out.println("Your number is Even");
		}
		else
		{
			System.out.println("Your number is Odd");
		}
		reader.close();
	}

}
