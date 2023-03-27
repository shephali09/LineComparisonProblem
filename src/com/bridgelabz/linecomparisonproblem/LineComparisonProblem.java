package com.bridgelabz.linecomparisonproblem;

/*Use Java Object Oriented Programming Concepts of Line and Point as well as equals and
compareTo methods. - Using Java compareTo method to compare 2 Lengths is*/

import java.util.Scanner;

public class LineComparisonProblem {

	public static void LineComparison() {

		System.out.println("Welcome to Line Comparison Computation Program!");

		Scanner scanner = new Scanner(System.in);

		// Get co-ordinates of two points for line 1
		System.out.println("Enter the co-ordinates of point 1 of (x1,y1) of line 1: ");
		double x1 = scanner.nextInt();
		double y1 = scanner.nextInt();
		System.out.println("Enter the co-cordinates of point 2 (x2,y2) of line 1: ");
		double x2 = scanner.nextInt();
		double y2 = scanner.nextInt();

		// Get co-ordinates of two points for line 2
		System.out.println("Enter the co-ordinates of point 1 (p1,q1) of line 2: ");
		double p1 = scanner.nextInt();
		double q1 = scanner.nextInt();
		System.out.println("Enter the co-cordinates of point 2 (p2,p2) of line 2: ");
		double p2 = scanner.nextInt();
		double q2 = scanner.nextInt();

		// calculate length of the line
		double lengthOne = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		double lengthTwo = Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));

		// convert double into string
		String stringOne = Double.toString(lengthOne);
		String stringTwo = Double.toString(lengthTwo);

		// checking if two lines are equal or not
		int check = stringOne.compareTo(stringTwo);
		if (check == 0) {
			System.out.println("Line 1 and line 2 are equal in length");
		} else {
			System.out.println("Line 1 and line 2 are not equal in length");
		}

	}

	public static void main(String[] args) {

		LineComparison();
	}
}
