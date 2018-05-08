package day1.examples;

public class ExampleSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 33;
		
		switch(j) {
		case 0: 
			System.out.println("Value is zero");
			break;
		case 1:
			System.out.println("Value is 1");
			break;
		case 2: 
			System.out.println("Value is 2");
			break;
		default: 
				System.out.println("Value is something else");
		}
		
		//BEFORE JAVA 7,  YOU COULD NOT USE STRINGS IN SWITCHES
		
		String x = "Two";
		
		switch(x) {
		case "Zero": 
			System.out.println("Value is zero");
			break;
		case "One":
			System.out.println("Value is 1");
			break;
		case "Two": 
			System.out.println("Value is 2");
			break;
		default: 
				System.out.println("Value is something else");
		}
	}

}
