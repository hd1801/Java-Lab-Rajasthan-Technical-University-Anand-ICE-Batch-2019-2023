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
public class BinarySearch {
    
    public static int Search(int a[],int k,int h,int l){
        if(h>=l)
        {   int mid =(h+l)/2;
            if(k==a[mid])
            {  return mid;}
            else if (a[mid] > k){
               return Search(a,k,mid-1,l);}
            else
               return Search(a,k,h,mid+1);
        }
        return -1;
    }
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a[]={1,5,7,21,26,34,53};
        System.out.print("enter the key to search : ");
        int k=s.nextInt();
        int x=Search(a,k,a.length-1,0);
        if(x==-1) 
            System.out.println(k + " doesnt exist in the array");
        else
        System.out.println(k + " found at index " + x );
       
        
      
    }
    
    
}
