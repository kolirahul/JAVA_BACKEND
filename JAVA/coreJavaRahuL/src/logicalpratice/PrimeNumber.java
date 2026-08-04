package logicalpratice;

public class PrimeNumber {

	public static void main(String[] args) {
	
		int num=100;
		for(int i=3;i<=num;i++) 
		
		{
			int flag=0;

			for(int j=2;j<i;j++) {
			if(i%j==0) {
			flag=1;
			break;
			}
		}
		if(flag==0) {
			System.out.println(i+ "prime number :");
		}
		else {
			System.out.println(i+"not prime number :");
		}
			
		}
		
	}
	}
		


	
