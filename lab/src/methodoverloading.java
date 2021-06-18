/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karti
 */
public class methodoverloading {

}    
class test{
       
        public static int add(int a,int b){
            return a+b;
        }
        public static double add(double a,double b){
            return a+b;
        }
        public static void main(String args[]){
            int a=9,b=2;
            double x=12.2,y=13.2;
           
            System.out.println(test.add(a, b));
            System.out.println(test.add(x, y));
        }
    }


