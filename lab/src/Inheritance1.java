/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karti
 * There are two pattern of single inheritance #1 is shown here (without super keyword.
 */
public class Inheritance1 {
    
}
class Calculation{
    int z;
    public void add(int x,int y){
        z=x+y;
        System.out.println("The sum is " + z);
        
    }
    public void sub(int x,int y){
        z=x-y;
        System.out.println("The sub is " + z);
        
    }
}
class My extends Calculation {
public void mul(int x,int y){
        z=x*y;
        System.out.println("The multiplication  is " + z);
        
    }
public static void main(String args[]){
    My demo= new My();
    demo.add(12, 32);
    demo.sub(22, 12);
    demo.mul(5, 7);
}
}

