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
interface Printable1{
    void print();
}   
interface Showable1{
    void show();
}    

public class Demo2 implements Showable1,Printable1 {
    
    @Override
    public void print(){
       System.out.println("HELLO!!!");
    }
    @Override
    public void show(){
       System.out.println("HI!!!");
    }
    public static void main(String args[]){
        Demo2 d = new Demo2();
        d.print();
        d.show();
    }    
}
