package venu1;

public class BankApplication {

	public static void main(String[] args) {

BankAccount acc1=new BankAccount("743884",500);

acc1.setName("Venu");
System.out.println("The AccountHolder name is "+acc1.getName());
acc1.deposit(500);
acc1.deposit(2000);
acc1.paybill(320);
acc1.accure();
System.out.println(acc1.toString());
}}
class BankAccount implements Intrest
 {
private int ID=1000;
private String accountnumber;
private static String RoutingNumber="5555";
private String name;
private String SSN;
private int balance;

BankAccount(String SSN,int Initdeposit)
{
	balance=Initdeposit;
	System.out.println("New Account Created");
	ID++;
	this.SSN=SSN;
	System.out.println(ID);
	System.out.println(SSN);
	System.out.println(RoutingNumber);
	setAccountNumber();}
private void setAccountNumber()
{
int Rand=(int) (Math.random()*100);
accountnumber=ID+""+Rand+""+SSN.substring(0,2);
System.out.println(accountnumber);
}
public void setName(String name)
{this.name=name;	}
public String getName()
{return name;}

public void deposit(int deposit)
{
System.out.println("Deposited Amount "+deposit);
balance=deposit+balance;
System.out.println("Account Balance is "+balance);
}

public void paybill(int amount)
{
System.out.println("Your bill amount"+amount);
balance=balance-amount;
System.out.println("The remaining amount "+balance);

}
@Override
public void accure() {
	balance=balance+(1+rate/100);
	System.out.println("Intrest for Your Account"+balance);
	
}
@Override
public String toString()
{
	return "[Name: "+name+ "Account Number "+ accountnumber +"RoutingNumber "+RoutingNumber +"SSN "+ SSN +"]"; }
 }
