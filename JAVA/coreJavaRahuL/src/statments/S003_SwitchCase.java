package statments;

import java.util.Scanner;

public class S003_SwitchCase {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		float a =s.nextFloat();

		System.out.println("Enter a number :");
		float b =s.nextFloat();
		
		System.out.println("press 1: for addtion");
		System.out.println("press 2: for subtraction");
		System.out.println("press 3: for multiplication");
		System.out.println("press 4: for division");
		
		System.out.println("enter a choice :");
		int choice=s.nextInt();
		
		switch(choice) {
		case 1 :
			System.out.println("addtion"+ (a+b));
			break;
		case 2 :
			System.out.println("subtraction"+ (a-b));
			break;
		case 3 :
			System.out.println("multiplication"+ (a*b));
			break;
		case 4 :
			System.out.println("division"+ (a/b));
			break;
			default :
				System.out.println("invalid choice :");
		}
		s.close();
	}
}
