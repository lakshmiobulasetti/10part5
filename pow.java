import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	long n,p,res=1;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	n=s.nextLong();
	System.out.println("enter the power");
	p=s.nextLong();
	while(p!=0)
	{
		res=res*n;
		--p;
	}
	System.out.println("res="+res);
	
	}
}
