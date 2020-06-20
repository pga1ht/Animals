package excercises1;

//Write a Java program to compare two numbers. Go to the editor
//Input Data:
//Input first integer: 25
//Input second integer: 39
//Expected Output
//
//25 != 39                                                                          
//25 < 39                                                                           
//25 <= 39

import java.util.Scanner;
import java.lang.Integer;

public class CompareTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.print("Input first integer: ");
		int one = in.nextInt();
		
		System.out.print("Input second integer: ");
		int two = in.nextInt();
		
		int result = Integer.compare(one, two);
//		compare method returns 0 if values are equal, -1 if one < two, +1 if one > two		
		
		if (result == 0 ) {
			System.out.println(one + " = " + two);
		}
		else if (result < 0) {
			System.out.println(one + " < " + two);
		}
		else {
			System.out.println(one + " > " + two);
		}
		
		
		in.close();
	}

}