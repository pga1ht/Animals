package excercises1;

import java.util.Scanner;

public class InputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character");
		char c = scanner.next().charAt(0);  //chaAt(0) gets character at index <value)
		System.out.println("Value entered = " + c);
		
		
		scanner.close();

	}

}
