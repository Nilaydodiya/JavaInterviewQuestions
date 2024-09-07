	package JavaQuestions;

import java.util.Scanner;

public class PrintInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter any integer value:");
		a = reader.nextInt();
		System.out.println("Entered value is "+a);
		reader.close();
	}

}
