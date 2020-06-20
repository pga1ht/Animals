package excercises1;

public class VariableSwap {

	public static void main(String[] args) {
		int v1 = 1;
		int v2 = 2;
		int hold; 
		
		System.out.println("V1 = " + v1);
		System.out.println("V2 = " + v2);

		System.out.println("Swap");
		
		hold = v1;
		v1 = v2;
		v2 = hold;
		
		System.out.println("V1 = " + v1);
		System.out.println("V2 = " + v2);

	}

}
