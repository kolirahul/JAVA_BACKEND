package operators;

import java.util.Scanner;

public class O001_arithmetic_operators {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		float a =sc.nextInt();
		System.out.println("Enter a second number :");
		float b =sc.nextInt();
		
		System.out.println("addition :"+(a+b));
		System.out.println("multiplication :"+(a*b));
		System.out.println("division :"+(a/b));
		System.out.println("subtraction :"+(a-b));

		sc.close();
	}
	

}
