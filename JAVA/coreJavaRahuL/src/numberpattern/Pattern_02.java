package numberpattern;

public class Pattern_02 {
 public static void main(String[] args) {
	
//	 1
//	 23
//	 456
//	 78910
//	 1112131415
	 
	 int line=5;
	 int c=1;
		
		for(int j=1;j<=line;j++) {
			for(int i =1;i<=j;i++) {
				System.out.print(c+" ");
				c+=1;
			}
			System.out.println();
		}
		
}
}
