/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karti
 * // we are using super keyword to call constructor of parent class and checking it by using a parent class function and variable 
 */
public class SuperClassInheritance {
    
}
class Super_Class{
    int age;

    public void getAge() {
        System.out.println("The value of variable named age is "+age);
    }
    Super_Class(int age){
        this.age=age;
    }
}
class Sub_Class extends Super_Class{
 
    Sub_Class(int age){
     super(age);
    }
 public static void main(String args[]){
     
     Sub_Class a =new Sub_Class(12);
     a.getAge();
 }
}