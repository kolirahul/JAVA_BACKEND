package oOOps;

class Demo
{
	static int count = 0;
	Demo()
	{
		count++;
		//System.out.println("const calling"+count);
		
	}
}
public class ObjectCount {

	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		Demo d4 = new Demo();
//		Demo d5 = new Demo();
		
		
		System.out.println("Total : "+Demo.count);


	}

}
