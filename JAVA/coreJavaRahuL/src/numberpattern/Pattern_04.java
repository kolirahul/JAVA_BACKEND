package numberpattern;

public class Pattern_04 {

	public static void main(String[] args) {

//		0
//		10
//		010
//		1010
//		01010
		
		
		
		int line=5;
		 
		for(int j=1;j<=line;j++) {
			 for(int i=1;i<=j;i++) {
				 System.out.print((i+j)%2);
			 }
			 System.out.println();
		}
		
//		1
//		01
//		101
//		0101
//		10101
		
		for(int j=1;j<=line;j++) {
			 for(int i=1;i<=j;i++) {
				 System.out.print((i+j+1)%2);
			 }
			 System.out.println();
		}
		

	}

}
