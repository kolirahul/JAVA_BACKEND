package array;

public class Array_multiplaication {
 public static void main(String[] args) {
	 
	 int a[][]= {   
			        {1,2,3},
			        {4,5,6},
			        {1,2,3}
			     };
	 int b[][]= { 
			         {3,3,3},
			         {2,2,2},
			         {2,2,2}
			    };
	 int c[][]= new int [3][3];
	 
	 for(int i= 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			for (int k = 0; k < 3; k++) {
				c[i][j] += a[i][k]*b[k][j];
				
			}
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
 } 
 }