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
public class Fibo {
    public static void main(String args[]){
        int n=6;
        Fib(n);
        
    }
   public static void Fib(int n){
       int a[]=new int[n];
       a[0]=0;
       a[1]=1;
       for (int i=2;i<n;i++){
           a[i]=a[i-1]+a[i-2];
       }
       for (int i=0;i<n;i++){
           System.out.println(" "+a[i]);
       }
   }
}
