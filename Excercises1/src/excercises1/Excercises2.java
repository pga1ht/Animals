package excercises1;

import java.util.Scanner;

public class Excercises2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Input number: ");
		int num1 = in.nextInt();

		int index;

		for(index = 1; index < 11; index++) {
			System.out.println(num1 + " X " + index + " = " + num1*index);
		}

		in.close();
	}

}
