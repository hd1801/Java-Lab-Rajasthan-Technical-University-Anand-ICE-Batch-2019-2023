/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karti
 */
public class MethodOverloading2 {
}

class adder{
       public static int add(int a,int b){
            return a+b;
        }
       
       public static int add(int a,int b,int c){
            return a+b+c;
        }
          public static void main(String args[]){
            int a=9,b=2,c=23;
            
            System.out.println(adder.add(a, b));
            System.out.println(adder.add(a,b,c));
        }
    }
    

