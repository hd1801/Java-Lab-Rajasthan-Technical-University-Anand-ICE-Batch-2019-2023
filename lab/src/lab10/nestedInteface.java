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
interface Drawable1{
    void draw();
    interface message{
        void msg();
    }
}
public class nestedInteface implements Drawable1.message {
    
    public void msg(){
        System.out.println("hello");
    }
    public static void main(String args[]){
        Drawable1.message m = new nestedInteface();
        m.msg();
        
    }
}
