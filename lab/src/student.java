/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * lab 4.2
 * default constructor 2 
 * @author karti
 */
public class student {
   int id;
   String name;
    void Display()
    {
        System.out.println(id+" "+ name);
    }
    public static void main(String args[])
    {
        student s1= new student();
        student s2= new student();
        s1.Display();
        s2.Display();
       
    }
    
}
