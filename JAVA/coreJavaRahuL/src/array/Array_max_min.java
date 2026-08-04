package array;

public class Array_max_min {

	public static void main(String[] args) {

		int a[]= {20,4,54,14,65,484,5,422,2,77,99,65,41,6,646,8,4451,2,-1};
		
		int max=0;
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		
		
		
		
		
	}
}


