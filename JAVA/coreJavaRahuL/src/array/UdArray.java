package array;

import java.util.Scanner;

public class UdArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int sum=0;
		
		System.out.println("enter a size of an array :");
		int size=sc.nextInt();
		
		int a[]=new int [size];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("enter a index of an array :");
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
			sum+=a[i];
			
		}System.out.println(sum);
		
		sc.close();
		
		
		
		
	}

}
