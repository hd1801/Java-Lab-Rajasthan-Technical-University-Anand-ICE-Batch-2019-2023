/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.Scanner;

/**
 *
 * @author karti
 */
public class BinarySeach {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a[]={1,5,21,53,75,89,96};
        int k=s.nextInt();
        int n=a.length;
        System.out.println("key found at index:"+BS(a,0,n-1,k));
        
    }
    public static int BS(int a[],int i,int j,int k){
        if(i==j){
            return i;
        }
        else{
           int mid =(i+j)/2;
            if(a[mid]==k){
                return mid;
            }
            if (a[mid]>k){
                return BS(a,i,mid-1,k);
            }
            else{
               return BS(a,mid+1,j,k);
            }
        }
    }
}
