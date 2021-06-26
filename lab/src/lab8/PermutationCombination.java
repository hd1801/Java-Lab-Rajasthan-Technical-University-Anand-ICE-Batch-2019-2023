/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;
import java.util.*;
/**
 *
 * @author karti
 */
public class PermutationCombination {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int r=s.nextInt();
        System.out.println("nCr = "+combination(n,r));
        System.out.println("nPr = "+permutation(n,r));
    }
    public static double combination(int n,int r){
        return fact(n)/(fact(n-r)*fact(r));
    }
    public static double permutation(int n,int r){
        return fact(n)/fact(n-r);
    }
    public static int fact(int n){
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }
}
