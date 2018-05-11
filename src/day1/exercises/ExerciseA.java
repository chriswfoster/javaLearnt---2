package day1.exercises;

public class ExerciseA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary = 78678.65;
		
		
		if (salary < 15000) {
			System.out.println(salary * .10);
		} else if (salary > 15000 && salary < 40000) {
			System.out.println(salary * .20);
		} else {
			System.out.println(salary * .30);
		}
		
		
	}

}
