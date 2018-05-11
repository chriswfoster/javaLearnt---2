package day1.examples;

public class ExampleDatatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Datatypes listed below:
/*		
 		byte	-	8 bits	-	-128 to 127
		short	-	16 bits	-	-32,769 to 32,767
		int		-	32 bits	-	-2,147,483,648 to 2,147,483,647
		long	-	64 bits	-	-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		float	-	32 bits	-	1.4e-045 to 3.4e+038 
		double	-	64 bits	-	4.9e-324 to 1.8e+308
		char	-	16 bits	-	'y' // also String is a class, made up of chars.
		boolean	-	1	bit -	true or false
		*/
		// you will primarily use int, double, or booleans.
		double a = 5368709.12;
		long x = (long) a * 2; 
		System.out.println(x);
//		System.out.println(a);
//		for (int i = 0; i < 30; i++) {
//			System.out.println(a *= 2); // gives you 1.073741824E7
//		}
	}

}
