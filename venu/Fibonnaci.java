package venu;

public class Fibonnaci {

	public static void main(String[] args) {
		// Sum of two previous numbers
	int[] fib=new int[20];
fib[0]=0;
fib[1]=1;
int i;
for(i=0;i<=5;i++)
{
fib[i+2]=fib[i]+fib[i+1];
}
System.out.println(fib[5]);

}}
