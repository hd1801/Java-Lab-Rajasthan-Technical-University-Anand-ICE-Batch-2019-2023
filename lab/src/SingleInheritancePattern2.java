/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karti
 */
public class SingleInheritancePattern2 {
    
}

class Super{
    int num=20;
     public void display(){
        System.out.println("This is the display method of super class");
    }
}
class Sub extends Super{
    int num=10;
  
    @Override
    public void display(){
        System.out.println("This is the display method of sub class");
    }
    public void My(){
        Sub s = new Sub();
        s.display();
        super.display();
        System.out.println("The value of variable in sub class is "+num);
        System.out.println("The value of variable in super class is "+ super.num);
    }
    public static void main(String args[])
    {
        Sub s1 = new Sub();
        s1.My();
        
    }
   
}
