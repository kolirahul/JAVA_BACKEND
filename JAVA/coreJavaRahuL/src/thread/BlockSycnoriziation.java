package thread;

import java.util.Scanner;

class Account
{
	double balance;
	Account(double balance)
	{
		this.balance=balance;
	}
	public boolean checkBalance(double amount)
	{
		boolean b= false;
		if(amount<=balance)
		{
			b=true;
		}
		return b;
	}
	public void withdraw(double amount)
	{
		balance-=amount;
		
	}
	
}
class Customer extends Thread
{
    String name;
    Account account;
    public Customer(String name,Account account)
    {
    	this.name=name;
    	this.account=account;
    }
    Scanner sc=new Scanner(System.in);
    
    public void run()
    {
    	synchronized (account) {
    		System.out.println(" enter amount by "+name);
    		double amount=sc.nextDouble();
    		if(account.checkBalance(amount))
    		{
    			account.withdraw(amount);
    		}
    		else
    		{
    			System.out.println(" insufficient balance");
    		}
			
		}
    }
	 
}
public class BlockSycnoriziation {

	public static void main(String[] args) {

		Account account =new Account(5000);
		
		Customer c1=new Customer(" sahil ",account);
		
		
		
		
	}

}
