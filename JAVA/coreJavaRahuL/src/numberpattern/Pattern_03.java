package numberpattern;

public class Pattern_03 {

	public static void main(String[] args) {

//		5
//		45
//		345
//		2345
//		12345
	
		 int line=5;
		 
			
			for(int j=line;j>=1;j--) {
				for(int i =0;i<=5-j;i++) {
					System.out.print(i+j);
					
				}
				System.out.println();
			}
	}

}
