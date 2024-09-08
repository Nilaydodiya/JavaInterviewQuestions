package JavaQuestions;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter any Number:");
		double a = reader.nextDouble();
		
		if (a > 0.0)
		{
			System.out.println("Number is Positive Number");
		}
		else if (a == 0.0)
		{
			System.out.println("Number is Zero Number");
		}
		else 
		{
			System.out.println("Number is Negative Number");
		}
		reader.close();

	}

}
