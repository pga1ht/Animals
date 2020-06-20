package excercises1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
//		int one = 1;
//		int two = 2;
//		int three = 3;
		
		int average = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input first number: ");
		int one = in.nextInt();
		
		System.out.print("Input second number: ");
		int two = in.nextInt();

		System.out.print("Input third number: ");
		int three = in.nextInt();		
		
		average = (one+two+three)/3;
		
		System.out.println("Average = " + average);
		
		in.close();
	}

}
