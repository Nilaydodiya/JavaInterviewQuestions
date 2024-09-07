package JavaQuestions;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,d;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter Dividend value: ");
		a = reader.nextInt();
		System.out.println("Enter Divisior value: ");
		b = reader.nextInt();
		c = a/b;
		d = a%b;
		System.out.println("Quotient value is:"+c);
		System.out.println("Remainder value is:"+d);
		
		reader.close();
	}

}
