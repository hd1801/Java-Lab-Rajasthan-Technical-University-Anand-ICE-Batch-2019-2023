/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;
import java.util.*;
/**
 * Q- WAP to create calculator using JAVA with operators 
 * @author karti
 */
public class Calculator {
    public static double calculate(double a,double b,String c){
        return switch (c) {
            case "+" -> a+b;
            case "-" -> a-b;
            case "*" -> a*b;
            case "/" -> a/b;
            default -> -1;
        };
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = scan.nextDouble();
        System.out.println("Enter b:");
        double b= scan.nextDouble();
        System.out.println("Enter the operation to perform from + - * / :");
        String operator = scan.next();
        System.out.println("result ="+calculate(a,b,operator));
        
    }
    
}
