import java.util.Random;

public class Database {

	public static void main(String[] args) {
	
	Student s1=new Student("Venu","58692453");
	s1.enroll();
	s1.pay();
	s1.Checkpay();
	s1.toString();
	System.out.println(s1.toString());
	s1.showCourse();
	
	}}
	
	class Student
	{
		private String name;
		private int   SSN;
		private String EMail;
		private static String ID="5555";
		private String UserID;
		int max=3000,min=2000;
	Student(String name,String SSN)
	{
		System.out.println("The name is "+name);
		System.out.println("The Student SSN is "+SSN); 
		System.out.println("Your ID is "+ID);
		EMail=name;
		System.out.println("Your EMail ID is "+EMail+ "@gmail.com");
		Random random=new Random();
		int value=1000+random.nextInt(1005);
		
		UserID=ID+value+SSN.substring(4,8);
		System.out.println("UserID is "+UserID);
	}
	public void enroll()
	{System.out.println("You are Succesfully Enrolled for the Course");}
	public void pay()
	{System.out.println("You Need to Pay $3000 for each Credit Hours");}
	@Override
	public String toString()
	{return "[Name is "+ name + "ID is "+ ID + "EMail is "+ EMail +" SSN is "+SSN +" UserID"+ UserID +"]";}
	public void Checkpay()
	{System.out.println("You need to Pay more To Enroll for the Course");}
	public void showCourse()
	{System.out.println("1.Computer Science \n 2.CA");}
	}
	
