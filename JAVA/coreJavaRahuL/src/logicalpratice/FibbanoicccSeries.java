package logicalpratice;

import java.util.Scanner;

public class FibbanoicccSeries {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int r=1;
		do {
			
		
		
		System.out.println("to find fibanoicc enter a number :");
		int n=s.nextInt();
		
		int a=0,b=1;
	
		System.out.print(a+" ");
		System.out.print(b+" ");
		
		for(int i=3;i<=n;i++) {
			
			int c= a + b;
            System.out.print(c+" ");
			a=b;
			b=c;
		}
		System.out.println(" want to check more 1 and exit 0");
		 r=s.nextInt();
		
		}
		while(r!=0);
		s.close();
	}

}
