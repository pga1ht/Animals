package excercises1;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input radius: ");
		double radius = in.nextDouble();
	
		double perimeter = 0;
		double area = 0;
		
		area = calcArea(radius);
		
		perimeter = calcPerim(radius);

		System.out.println("Perimeter is = " + perimeter);
		
		System.out.println("Area is = " + area);
		
		in.close();
	}
	
	public static double calcArea(double r) {
		double a = Math.PI*(r*r);
		return a;
	}
	
	public static double calcPerim(double r) {
		double p = 2*Math.PI*r;
		return p;
	}
}

