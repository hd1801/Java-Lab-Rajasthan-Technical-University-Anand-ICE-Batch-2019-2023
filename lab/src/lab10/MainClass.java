/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author karti
 */
public class MainClass {
    
    public static void main(String args[]){
        C c=new C();
        System.out.println(c.s);
    }
}
class A{
    String s="class A";
}
class B extends A{ 
    String s="class B";
    {
        System.out.println(super.s);
    }  
}
class C extends B{
    String s ="class C";
    {
        System.out.println(super.s);
    }
}

