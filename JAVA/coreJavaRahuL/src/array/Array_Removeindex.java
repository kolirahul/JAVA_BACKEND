package array;

public class Array_Removeindex {

	public static void main(String[] args) {

		int a[]= {10,20,30,40,50,60,70};
		int index=2;
		
		for(int i=index;i<a.length -1;i++) {
			a[i]=a[i +1];
		}
		for(int i=0;i<a.length -1;i++) {
			System.out.println(a[i]+" ");
		}
		 
	}

}
