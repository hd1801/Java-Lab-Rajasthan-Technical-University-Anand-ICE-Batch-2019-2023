import java.util.*;
public class multiply {
    public static void main(String args[]){	
	Scanner s = new Scanner(System.in);
	int a=s.nextInt();
	int n=s.nextInt();
    int x=0;
    while (n!=0)
    {
        x=x+a;
        n--;
    }
    System.out.println("a * b = "+x);
    s.close();
}
    
}
