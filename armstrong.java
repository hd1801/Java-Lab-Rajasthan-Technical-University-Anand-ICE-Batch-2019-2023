import java.util.*;
class armstrong
{
	public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	int a=s.nextInt();
	int n=a;
	int sum=0,r=0; 
	while(n!=0)
	{
	 r=n%10;    
   	sum=sum+r*r*r;    
   	n=n/10;   		
	}
	if (sum==a)
	System.out.print("armstrong number");		
	else	
	System.out.print("not an armstrong number");
	
	}
	
}