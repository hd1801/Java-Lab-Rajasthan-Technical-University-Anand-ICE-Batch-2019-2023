/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *lab 4.3 parameterized constructor
 * @author karti
 */
public class Parameterized_Student {

    int id;
    String name;
    public Parameterized_Student(int i, String n) {
        id = i;
        name = n;
    }
    public void display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String args[]){
   Parameterized_Student s1 =  new Parameterized_Student(10,"Hardik");
   Parameterized_Student s2 =  new Parameterized_Student(123,"Ajay");
    s1.display();
    s2.display();
    }
    
    
    
}
