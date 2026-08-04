package pattern;

public class Pattern_Lefthand_IncreaseStar {

	public static void main(String[] args) {

		for(int k=1;k<=5;k++) {
		 for(int j=1;j<=5-k;j++) {
			 System.out.print(" ");
		 }
			 for(int i=1;i<=k;i++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		}
		
	}



