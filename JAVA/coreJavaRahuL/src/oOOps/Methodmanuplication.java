package oOOps;

class calc
{
	public void mesage() { // without return type and without parameter
		System.out.println(" Message calling :");
	}
	
	public void sqaure(int a) { // without return type and with parameter
		int sq=a*a;
		System.out.println(sq);	
		}
	   
	  public int add(int a,int b) { // with return type and with parameter
		int c=a+b;
		System.out.println(c);
		return c;
	}
	    public void arraysum(int a[]) { // Array with parameter
	    	int sum=0;
	    	for(int i=0;i<a.length;i++) {
	    		sum+=a[i];
	    		
	    	}
	    	System.out.println(sum);
	    }
	    
	    public int [] revarray(int a[]) {
	    	
	      	int b[]=new int[a.length];
	    	int c=0;
	      	for(int i=a.length-1;i>=0;i--) {
	      		b[c]=a[i];
	      		c++;
	      	}
	    	return b;
	    }
	    
	    public void allargs(int...a) {
	    	for(int i=0;i<a.length;i++) {
	    		System.out.println(a[i]);
	    	}
	    }
}
public class Methodmanuplication {

	public static void main(String[] args) {

		calc c=new calc();
		c.mesage();
		c.sqaure(6);
		c.add(5, 6);
        int a[]= {10,20,30,40,50};
        int b[]= {1,2,3};
        c.arraysum(a);
        
        int k[] = c.revarray(b);
		for (int i = 0; i < k.length; i++) {
			System.out.print(k[i]+" ");
		}System.out.println();
		
		c.allargs(10,20,30,40,50,50,60);
	}

}
