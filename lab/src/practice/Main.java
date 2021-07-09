/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author karti
 */
public class Main {
    public static void main(String args[]){
        Sub1 a= new Sub1();
           a.message();
        Sub2 b= new Sub2();
        b.message();
    }
}
abstract class parent{
    abstract void message();
}
class Sub1 extends parent{
    @Override
    void message(){
        System.out.println("this is first subclass");
    }
}
class Sub2 extends parent{
    @Override
    void message(){
        System.out.println("this is second subclass");
    }
}
