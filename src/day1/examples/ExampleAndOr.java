package day1.examples;

public class ExampleAndOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		x = 10;
		y = -10;
		// && and
		// || or 	(same as in javascript)
		// & 	the single and is used for bit operations.
		if (x > 0 && y > 0) {
			System.out.println("Both numbers are +ve");
		} else if ( x > 0 || y > 0) {
			System.out.println("at least one is +ve");
		} else {
			System.out.println("both are below zero");
		}
	}

}
