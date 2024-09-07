package JavaQuestions;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		
		int year;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter year:");
		year = reader.nextInt();
		
		if ((year%400==0) || (year%4==0 && year%100!=0) )
		{
			System.out.println(year+" is leap year");
		}
		else
		{
			System.out.println(year+" is Not a leap year");
		}
		
		reader.close();
		
		
	}

}
