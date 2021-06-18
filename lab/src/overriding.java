/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karti
 */
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}
   

public class overriding extends Vehicle {
    @Override
    void run() {
        super.run();
        //System.out.println("Bike is running");
    }
    
    public static void main(String[] args){
        overriding obj = new overriding();
        obj.run();
    }
}
