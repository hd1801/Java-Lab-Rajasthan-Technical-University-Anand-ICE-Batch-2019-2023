import java.util.*; 
	class palindrome
{
	public static void main(String args[])
	{	
	Scanner s = new Scanner(System.in);
	int a=s.nextInt();
	int n=a;
	int sum =r=0; 
	while(n!=0)
	{
	 r=n%10;    
   	sum=(sum*10)+r;    
   	n=n/10;   		
	}
	if(sum==a)	
	System.out.println("its a palindrome");
	else
	System.out.println("its a palindrome"); 
}
}