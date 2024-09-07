package JavaQuestions;

import java.util.Scanner;

public class MultiplyFlotNumbers {
	public static void main(String[] args) {
		
		float a,b,c;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter 1st float value: ");
		a = reader.nextFloat();
		
		System.out.println("Enter 2nd flot value: ");
		b = reader.nextFloat();
		
		c = a*b;
		
		System.out.println("Multiplication of two value is: "+c);
		
		reader.close();
	}
}
