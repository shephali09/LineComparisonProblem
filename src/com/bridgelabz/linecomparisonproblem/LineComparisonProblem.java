package com.bridgelabz.linecomparisonproblem;

/*model a line based on a point consisting of (x, y) co-ordinates using the Cartesian system,
So that calculate its length
.- A Length as 2 Points (x1, y1) and (x2, y2) - Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2)*/

import java.util.Scanner;

public class LineComparisonProblem {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison Computation Program!");
		
		Scanner scanner = new Scanner(System.in);
		
		//Get co-ordinates of two points
		System.out.println("Enter the co-ordinates of point 1 (x1,y1): ");
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		System.out.println("Enter the co-cordinates of point 2 (x2,y2): " );
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		
		//calculate length of the line
		double length = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		
		System.out.println("The length of the line is: " + length);
	}
}
