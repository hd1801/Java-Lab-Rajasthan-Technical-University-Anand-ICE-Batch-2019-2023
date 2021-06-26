/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *WAP TO CREATE A PATTERN : 
 * @author karti
 */
public class Pattern1 {
    public static void main(String args[])
    {
        display(7);
    }
    public static void display(int n){
        int i,j;
        for(i=1;i<=n;i++)
        {
            for (j=1;j<=n;j++)
            { 
                if(((j == 1 || (j == n && i != 1)) || i == 1) || (i == n/2+1 && j >= 2 && j <= n) )
                    System.out.print("*");
                else
                    System.out.print(" ");    
            }
            System.out.println("");
        }
    }
    
}
