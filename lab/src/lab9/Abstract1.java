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
    
   abstract class bike{
    abstract void run();    
    }
class honda4 extends bike{
  
    @Override
    void run(){    
       System.out.println("running safely");
    }
    public static void main(String args[]){
        bike obj = new honda4();
        obj.run();
    }
}

