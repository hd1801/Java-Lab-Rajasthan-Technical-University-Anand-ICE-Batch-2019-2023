/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author karti
 */
abstract class bike1{
    bike1() {System.out.println("bike is created");}
    abstract void run();
    void changegear(){
        System.out.println("gear changed");
    }
}
class honda extends bike1{
    @Override
    void run(){
        System.out.println("running safely");
    }
}
public class TestAbstraction1 {
public static void main(String args[]){
    bike1 obj = new honda();
    obj.run();
    obj.changegear();
}    
}
