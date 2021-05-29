/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karti
 */
import java.util.Scanner;
        
public class reverseNumber {
    private static int reverse(int a){
     int x,r=0;
     while(a!=0){
         x=a%10;
         r=r*10 +x;
         a=a/10;
     }
        return r;
    }
    public static void main(String args[]){
        
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=reverse(a);
        System.out.println("reverse of " + a + " is " + b);
    }
    
}
