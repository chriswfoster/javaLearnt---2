package day1.examples;

public class ExampleArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {10, 20, 30, 40, 50};
//		System.out.println(a[2]);
		
		//can use for each statement, or enhanced for statement
		for(int temp : a) {
			System.out.println(temp);
		}
		
		System.out.println("--------");
		
		
		// initializing an empty array below:
		// this will populate an array with integers of zero
		int [] x = new int[5];
		x[3] = 44; // can update indexes of that array;
		for (int temp : x) {
			System.out.println(temp);
		}
		System.out.println("--------");
		// below is a string array
		String[] st = {"one", "two", "three"};
		
		for (String temp : st) {
			System.out.println(temp);
		}		
		
		//EMPTY string array;
		String [] stx = new String[5];
		stx[2] = "25";
		for (String temp : stx) {
			System.out.println(temp);
		}
		
	}

}
