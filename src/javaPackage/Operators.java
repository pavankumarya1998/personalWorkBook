package javaPackage;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		Scanner sec = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int a = sec.nextInt();
		System.out.println("Enter the Number");
		int b = sec.nextInt();

		int c = a + b;

		System.out.println("addition of both number is :- " + c);

		++c;

//		int e = c++;

		System.out.println("addition of both number -1 :-" + c);
//	System.out.println(e);

	}

}
