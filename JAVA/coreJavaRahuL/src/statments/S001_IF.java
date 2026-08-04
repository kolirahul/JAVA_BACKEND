package statments;

import java.util.Scanner;

public class S001_IF {

	public static void main(String[] args) {

		    Scanner s =new Scanner(System.in);
		    
		    System.out.println(" Enter a marks of student :");
		    int a =s.nextInt();
		    
		    if(a>=35) {
		    	System.out.println("student passed examation :");
		    }
		    else {
		    	System.out.println("Student is failed");
		    }
		    s.close();
	}

}
