/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

/**
 *
 * @author karti
 */
public class AccessMods {
    public static void main(String args[]){
            Demo d1= new Demo();
            Demo1 d2= new Demo1();
            
        }    

class Demo {
    private int n_pri=1;
    int n=2;
    public int n_pub=3;
    protected int n_pro=4;
    
    Demo(){
        System.out.println(n_pri);
        System.out.println(n);
        System.out.println(n_pub);
        System.out.println(n_pro);
    }
}

class Demo1 extends Demo {
    
    Demo1(){
        //System.out.println(n_pri);
        System.out.println(n);
        System.out.println(n_pub);
        System.out.println(n_pro);
        }
}   

}