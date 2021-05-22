/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karti
 */
public class student_overload {
        int id;
        int age;
        String name;
    public student_overload(int i,String n,int a) {
        id=i;
        name=n;
        age=a;
    }
    public student_overload(int i,String n) {
        id=i;
        name=n;
    }
     public void display()
    {
        System.out.println(id+" "+name+" "+ age);
    }
    public static void main(String args[]){
   student_overload s1 =  new student_overload(10,"Hardik",19);
   student_overload s2 =  new student_overload(123,"Ajay");
    s1.display();
    s2.display();
    }
}
