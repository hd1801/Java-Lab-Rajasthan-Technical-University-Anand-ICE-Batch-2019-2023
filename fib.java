import java.util.*;
class fibonacci
{
	public static void main(String args[]){
	int n=0;
	int sum=1;
	int b=0,a=1;
	System.out.println(0);
	while (n<10)
	{
	System.out.println(a);
	a=sum+b;
	b=sum;
	sum=a;
		
	n++;
	}
	
}}