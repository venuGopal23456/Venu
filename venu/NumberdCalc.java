package venu;

public class NumberdCalc {
	public static void main(String[] args)
	{
		printname();
		int a=10,b=25;
		addnumbers(a,b);
		int product=multiplynumbers(a,b);
		System.out.println(product);
		
	}
	public static void printname()
	{
		
		System.out.println("I am Google CEO");
	}
	static void addnumbers(int a, int b)
	{
	int sum=a+b;
	System.out.println("Sum of the numbers is:"+sum);
		
	}
	static int multiplynumbers(int c,int d)
	{int product=c*d;
	addnumbers(product,product);
	return product;
	}

}
