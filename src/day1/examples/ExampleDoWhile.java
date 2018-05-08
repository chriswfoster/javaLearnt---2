package day1.examples;

public class ExampleDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// while loop checks FIRST for the condition. 
		//However, a do while does the work first, then checks for the condition.
		int x = 10;
		do {
			System.out.println("x = " + x);
			x--;
		} while (x > 0);
	}

}
