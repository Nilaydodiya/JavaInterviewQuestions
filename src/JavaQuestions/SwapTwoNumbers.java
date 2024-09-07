package JavaQuestions;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a,b,temp;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter value of A:");
		a=reader.nextInt();
		
		System.out.println("Enter value of B:");
		b=reader.nextInt();
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Value of A:"+a);
		System.out.println("Value of B:"+b);
		
		reader.close();
	}

}
