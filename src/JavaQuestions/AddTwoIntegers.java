package JavaQuestions;

import java.util.Scanner;

public class AddTwoIntegers {

	public static void main(String[] args) {

		int a,b,c;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter value of A:");
		a = reader.nextInt();
		
		System.out.println("Entetr value of B");
		b = reader.nextInt();
		
		c=a+b;
		System.out.println("Sum of two value is:"+c);
		
		reader.close();
		
	}

}
