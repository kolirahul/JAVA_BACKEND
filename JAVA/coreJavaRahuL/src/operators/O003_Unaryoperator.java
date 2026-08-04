package operators;

public class O003_Unaryoperator {

	public static void main(String[] args) {

		int a = 10;
		int f=(a++ + --a +  ++a - ++a -  ++a+   --a);
		
		System.out.println(a);
		System.out.println(f);
		
	}

}
