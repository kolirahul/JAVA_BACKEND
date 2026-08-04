package array;

public class Array_copyMethod {

	public static void main(String[] args) {

		// Method 1: 
		
		int a[]= {10,20,30,40,50,60,70,80};
		int b[]= new int [a.length];
		
		System.arraycopy(a, 2, b, 3, 3);
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
			
		}
		
//		Method 2:
		
//		int a[]= {10,20,30,40,50,60,70,80};
//		int b[]= new int [a.length];
//		
//		for (int i = 0; i < b.length; i++) {
//			b[i]=a[i];
//			}
//		for (int i = 0; i < b.length; i++) {
//			System.out.println(b[i]);
//			}
		
		
////		Method 3:
//		
//		int a[]= {10,20,30,40,50,60,70,80};
//		int b[]= {90,100,110};
//		int c[]= new int [a.length + b.length];
//		
//		for (int i = 0; i < a.length; i++) {
//			c[i]=a[i];
//			}
//		for (int i = 0; i < b.length; i++) {
//			c[a.length + i]=b[i];
//			}
//		for (int i = 0; i < c.length; i++) {
//			System.out.println(c[i]);
//		}

}
}