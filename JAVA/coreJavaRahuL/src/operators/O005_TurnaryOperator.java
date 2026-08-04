package operators;

public class O005_TurnaryOperator {

	public static void main(String[] args) {
 
		int a = 500;
		int b = 600;
		int c =300;
		
		String u = a > b ?
				   a > c ? "A is greater" : "c is greater"
					:
					b > c ? "B is greater " : "c is Greater ";
					System.out.println(u);
				   
				   
	}

}
