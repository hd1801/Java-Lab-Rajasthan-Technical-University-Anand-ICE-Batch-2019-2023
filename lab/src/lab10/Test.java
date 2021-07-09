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
interface Drawable{
    void draw();
    default void msg(){
        System.out.println("Default method");
    }
}
public class Test implements Drawable {
    
    @Override
    public void draw(){
        System.out.println("drawing");
    }
    public static void main(String args[]){
        Test t = new Test();
        t.draw();
        t.msg();
    }
}
