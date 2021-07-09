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
public class Degree {
    void getDegree(){
        System.out.print("I got degree");
    }
}
class postgraduate extends Degree{
    postgraduate(){
        System.out.print("I am post graduate");
    }
}
class undergraduate extends Degree{
    undergraduate(){
        System.out.print("I am under graduate");
    }
    public static void main(String args[]){
        postgraduate a = new postgraduate();
           a.getDegree();
         undergraduate b = new undergraduate();
           b.getDegree();
    }
}
