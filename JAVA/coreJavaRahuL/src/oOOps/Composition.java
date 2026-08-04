package oOOps;

class sample{
	public void display(int a) {
		System.out.println(" message calling :");
		int sq=a*a;
		System.out.println(sq);
	}
}

class pratice{
	static sample sample=new sample();
}

public class Composition {

	public static void main(String[] args) {

		pratice.sample.display(10);
		
	}

}
