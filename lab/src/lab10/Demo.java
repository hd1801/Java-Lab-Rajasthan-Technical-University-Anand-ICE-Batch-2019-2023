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
interface Printable{
    void print();
}
public class Demo implements Printable {
    
    @Override
    public void print(){
       System.out.println("HELLO!!!");
    }
    public static void main(String args[]){
        Demo d = new Demo();
        d.print();
    }
}
