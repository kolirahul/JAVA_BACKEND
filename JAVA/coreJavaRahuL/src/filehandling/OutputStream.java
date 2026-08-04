package filehandling;

import java.io.File;
import java.util.Scanner;

public class OutputStream {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		
		System.out.println(" enter a name of a file :");
		String name=sc.next();
		
		System.out.println(" enter a email");
		String email=sc.next();
		
	File file=new File(name+".txt");
	
		
		
		
	}

}
