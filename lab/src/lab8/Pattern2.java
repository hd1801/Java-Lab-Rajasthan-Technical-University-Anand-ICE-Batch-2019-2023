/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author karti
 */
public class Pattern2 {
    public static void main(String args[])
    {
        int i,j,s;
        for(i=1;i<6;i++)
        {
            for (s=6;s>i;s--)
                System.out.print(" ");
            for (j=1;j<=2*i-1;j++)
            { 
                
                System.out.print("*");
            }
            System.out.println("");
        }
        for(i=6;i>=1;i--)
        {
            for (s=6;s>i;s--)
                System.out.print(" ");
            for (j=1;j<=2*i-1;j++)
            { 
                
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
