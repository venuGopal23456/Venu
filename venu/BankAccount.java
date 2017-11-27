package venu;

public class BankAccount implements Inter1 {
	/*String Acc;
	int n1;*/
	static  int routingno=585454;
	private String name;
	private String ssn;
	int balance;
	public String getSsn;
		
	BankAccount()
	{
		
		System.out.println("New Account Created");
	}
	BankAccount(int a)
	{
		System.out.println("Account no " + a);
	}
	BankAccount(String Acc,int n1)
	{
		System.out.print("The Account type is "+Acc+"and No is "+n1);
	}
	
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	@Override
	public void intrest() {
	System.out.println("Google");
	}
	
	
	/*@Override
	public String toString()
	{
		
		return "[The Name is "+name+ " Balance is " +balance ;
	}
	public String getSetName() {
		return setName;
	}
	public void setSetName(String setName) {
		this.setName = setName;
	}*/
}
