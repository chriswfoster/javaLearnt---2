package day1.exercises;

public class ExerciseB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nums = {"10", "20", "30", "40", "50"};
		int sum = 0;
		for(String number : nums ) {
			sum += Integer.parseInt(number);
		}
		System.out.println(sum);
	}

}
