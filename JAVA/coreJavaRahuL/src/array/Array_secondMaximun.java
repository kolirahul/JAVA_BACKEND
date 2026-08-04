package array;


public class Array_secondMaximun {
	public static void main(String[] args) {
		
		int a[]= {20,4,54,14,65,484,5,422,2,77,99,65,41,6,646,8,451,2,01};
		
		int max = a[0];
		int smax = a[0];
		
		for (int i=0;i<a.length;i++) {
			if(a[i]>max) {
				smax=max;
				max=a[i];
				
			}
			else if(a[i]>max && a[i]!=max) {
				smax=a[i];
				
			}
		}
		System.out.println(max);
		System.out.println(smax);
		
		
	}

}
