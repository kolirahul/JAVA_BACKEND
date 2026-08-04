package statments;

import java.util.Scanner;

public class S004_loopDoWhile {

	public static void main(String[] args) {

Scanner s =new Scanner(System.in);
       int c=0;
	    do {
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
	    
	    System.out.println(" want to continue : press 1 and press 0 for exit");
	     c =s.nextInt();
	    }
	     while(c!=0);
	    
	     s.close();
}
}