package venu;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount b1=new BankAccount();
		b1.intrest();
		b1.setSsn("22222");
		System.out.println(b1.getSsn);
		
		b1.balance=4444;
		System.out.println(b1.toString());
		BankAccount b2=new BankAccount(10);
		
	
		BankAccount b3=new BankAccount("Savings Account",255);
	
		CDAccount a=new CDAccount();
		
		a.balance=555555;
		System.out.println(a.toString());	}

	

	
}
