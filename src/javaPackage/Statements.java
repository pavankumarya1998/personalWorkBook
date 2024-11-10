package javaPackage;

import java.util.Scanner;

public class Statements {

	/// Program for the Marksheet Creation

	public static void main(String[] args) {

//		Scanner inp = new Scanner(System.in);
//
//		System.out.println("Obtained mark in English:-");
//		int english = inp.nextInt();
//
//		System.out.println("Obtained mark in Marathi:-");
//		int marathi = inp.nextInt();
//
//		System.out.println("Obtained mark in Hindi:-");
//		int hindi = inp.nextInt();
//
//		System.out.println("Obtained mark in Math:-");
//		int Math = inp.nextInt();
//
//		System.out.println("Obtained mark in Science:-");
//		int Science = inp.nextInt();
//
//		System.out.println("Obtained mark in GK and Comp:-");
//		int GKcomp = inp.nextInt();
//
//		double total = english + marathi + hindi + Math + Science + GKcomp;
//
//		double percentage = (total / 480) * 100;
//
//		System.out.println("percentage = " + percentage + "%");
//
//		// on the percentage need to decide the
//		// A+ = 91 to 100
//		// A = 85 to 90
//		// B+ = 80 to 85
//		// B = 70 to 80
//		// C+ = 60 to 70
//
//		if (percentage > 90 && percentage <= 100) {
//			System.out.println("Grade Achived :- A+ ");
//			System.out.println("Student Progress is Excellent");
//		} else if (percentage > 85 && percentage <= 90) {
//			System.out.println("Grade Achived :- A ");
//			System.out.println("Student Progress is very good");
//		} else if (percentage > 80 && percentage <= 85) {
//			System.out.println("Grade Achived :- B+ ");
//			System.out.println("Student Progress is good ");
//		} else if (percentage > 70 && percentage <= 80) {
//			System.out.println("Grade Achived :- B ");
//			System.out.println("Student Progress is Average ");
//		} else if (percentage > 60 && percentage <= 70) {
//			System.out.println("Grade Achived :- C+ ");
//			System.out.println("need to focus on progress ");
//		} else {
//			System.out.println("Student failed");
//		}
//
////	
//		/// Program for to check wehter the boy is Healthy or not
//
//		/// if Boy age is less than the 50 or Heart rate is less than the 100 and the
//		/// BMI
//		/// should between the 30 to 35
//
//		Scanner age = new Scanner(System.in);
//
//		System.out.println("Enter the Age of Boy ");
//		int boyage = age.nextInt();
//		System.out.println("Entre the Heart rate");
//		int heartRate = age.nextInt();
//		System.out.println("Enter the BMI");
//		int BMI = age.nextInt();
//
//		if (boyage < 50 && boyage > 0 && heartRate < 100 && heartRate > 50 && BMI >= 30 && BMI <= 35) {
//			System.out.println("The Boy is Heathy..");
//		}
//		else {
//			System.out.println("The Boy is Unheathy");
//		}

		// Verify to User is Eligible for the Graduation in IIT

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'Yes' if you give the JEE exam, either entre 'NO' ");
		String eligibility = sc.nextLine().trim();
		if (eligibility.equalsIgnoreCase("Yes")) {
			System.out.println("Entre Obtained marks..");
			int mark = sc.nextInt();
			if (mark >= 150) {
				System.out.println("Congratulations !.. You are eligible for IIT ");
			} else {
				System.out.println("You are not eligible for the IIT graduation");
			}

		} else {
			System.out.println("Student is not eligible for the IIT Graduation");
		}
		sc.close();

	}
}
