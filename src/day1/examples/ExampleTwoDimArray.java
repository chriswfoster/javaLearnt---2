package day1.examples;

public class ExampleTwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] TwoDim = new int [4][3];
		int temp = 10;
	TwoDim[2][2] = 10;
	
//	System.out.print(TwoDim[2][2]);
	for (int i = 0; i < 4; i++) {
		for(int j = 0; j < 3; j++) {
			temp += 10;
			TwoDim[i][j] = temp;
			System.out.print(TwoDim[i][j] + " ");
			

		}
		System.out.println();
	}
	
	
	
	}

}
