package statments;

import java.util.Scanner;

public class S002_If_Ladder {

	public static void main(String[] args) {
               
		Scanner s =new Scanner(System.in);
	    
	    System.out.println(" Enter a marks of student :");
	    int a =s.nextInt();
	    
	    if(a>80 || a>=100) {
	    	System.out.println("Grade A :");
	    }
	    else if(a>60) {
	    	System.out.println("Grade B :");
	    }
	    else if(a>40) {
	    	System.out.println("Grade C :");
	    }
	    else if(a>28) {
	    	System.out.println("Grade D :");
	    }
	    else {
	    	System.out.println("fail");
	    }
	    s.close();
	}

}
