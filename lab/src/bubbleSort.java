/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karti
 */

public class bubbleSort {
    public static void printArray(int a[]){
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
    public static int[] Sort(int arr[])
    {
        int t;
        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length-1;j++)
            {
                if(arr[j+1]<arr[j])
                {  
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t; }
            }
        }
        return arr;
    }
    public static void main(String arg[])
    {
        int a[]={4,21,3,55,1,25,6};
        printArray(a);
        a=Sort(a);
        printArray(a);
    }
}
