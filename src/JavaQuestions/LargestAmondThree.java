package JavaQuestions;

import java.util.Scanner;

public class LargestAmondThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter value of A:");		
		a = reader.nextInt();
		
		System.out.println("Enter value of B:");		
		b = reader.nextInt();
		
		System.out.println("Enter value of C:");		
		c = reader.nextInt();

		if (a>b && a>c)
		{
			System.out.println("A is greatest number");
		}
		else if (c>b)
		{
			System.out.println("C is greatest number");
		}
		else 
		{
			System.out.println("B is greatest number");
		}
		reader.close();
	}
}
