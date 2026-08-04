package libarary;

import java.util.Scanner;

public class Admin {

	public static void main(String[] args) {

		
		String c="y";
		
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter your choice :");
		System.out.println("1: Add Book");
		System.out.println("2: View Book");
		System.out.println("3: Update Book");
        System.out.println("4 :Issue Book");
        
        int choice=sc.nextInt();
        Operation op= new Operation();
        if(choice==1) 
        {
        	System.out.println("*********Add book********");
            op.addbook();	
        }
        else if(choice==2)
        {
        	System.out.println("*********view book********");
        	op.viewbook();
        }
        else if (choice==3)
        {
        	System.out.println("*********delete book********");
        	op.updatebook();
        }
        else if(choice==4)
        {
        	System.out.println("*********issue book********");
        	op.issuebook();
        }
        else
        {
        	System.out.println("Invalid choice ");
        }
        System.out.println("Do you want to Continue press y or n");
        c=sc.next();
	}  
	     while(c.equalsIgnoreCase("y"));
	}

}
