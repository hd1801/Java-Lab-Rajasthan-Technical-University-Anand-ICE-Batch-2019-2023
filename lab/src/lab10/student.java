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
public class student {
    String Name;
    student(){
       this.Name="Unknown";
    }
    student(String Name){
       this.Name=Name;
    }
    void print(){
        System.out.print(this.Name);
    }
    public static void main(String args[]){
        student s1 = new student();
        student s2 = new student("Hardik");
        s1.print();
        s2.print();
    }
    
}
