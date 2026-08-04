package oOOps;

class p
{
	p()
	{
		System.out.println(" p comsrtructor calling :");
	}
	
}
class q extends p
{
	q()
	{
		System.out.println(" q constructor calling : ");
	}
	q(int i)
	{
		this();
		System.out.println("  q ="+i);
	}
}
class r extends q
{
	r()
	{
		super(10);
		System.out.println(" r constructor calling :");
	}
}
public class ConstructorChaining {

	public static void main(String[] args) {

		r R=new r();
		
		// up casting 
		// can access parent class to child class
		p P1 =new q();
		
		// down casting
		// child class cannot access parent class
		 
		 // q Q1=new p();
		
		
		// instance of operator - 
		
//		System.out.println(new p() instanceof q);
//		System.out.println(new q() instanceof p);
	}

}
