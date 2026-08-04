package numbersystem;

public class N003_DecimalToHexa {

	public static void main(String[] args) {

		int num=155;
		String sum  ="";
		
		while(num!=0);
		{
			int rem =num % 16;
			if(num>=10) {
				rem =rem +55;
				char k=(char) rem;
				sum =k + sum;
			}
			else {
				sum =rem +sum;
			}
			num/=16;
		}
		System.out.println(sum);
	}

}
