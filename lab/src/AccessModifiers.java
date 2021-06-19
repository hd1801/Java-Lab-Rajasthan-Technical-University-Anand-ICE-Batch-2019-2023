/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karti
 *  there are 2 types of modifiers  access modifiers , non access modifiers.
 * Access Modifier: 
 * 4 types :                    Default, private , public , protected
 * Uses->
 * 1- with class                yes      yes       yes       yes
 * 2- Same package              
 *    sub class                 no       yes       yes       yes
 *    non sub class             no       no        yes       -
 *     
 * 3- Different Package
 *      sub class               no       no        yes       yes
 *      non sub class           no       no        yes       no
 * Package: a kind of folder
 */
        
public class AccessModifiers {
        public static void main(String args[]){
            Demo d1= new Demo();
            Demo1 d2= new Demo1();
            
        }
}




