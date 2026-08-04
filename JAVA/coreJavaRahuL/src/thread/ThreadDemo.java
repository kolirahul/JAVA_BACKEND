package thread;

class t1 extends Thread
{
	public void run()
    {
		for(int i=0;i<=15;i++) {
			System.out.println(" T1: "+i);
		}
    }
}
class t2 extends Thread
{
	public void run()
    {
		for(int i=0;i<=10;i++) {
			System.out.println("T2: "+i);
		}
    }
}
public class ThreadDemo {

	public static void main(String[] args) {

		t1 t1=new t1();
		t2 t2=new t2();
		
		t1.start();
		t2.start();
	}

}
