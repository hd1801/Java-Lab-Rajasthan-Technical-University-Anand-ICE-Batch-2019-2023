/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karti
 */
public class complex_number {
    int r,i;

    public complex_number(int r) {
        this.r = r;
    }

    public complex_number(int r, int i) {
        this.r = r;
        this.i = i;
    }
    public void show()
    {
        System.out.println(r+" + i"+i);
    }
    public void add(complex_number a)
    {
        r=r+a.r;
        i=i+a.i;
    }
    public static void main(String args[])
    {
        complex_number a=new complex_number(10);
        complex_number b=new complex_number(12,2);
        a.show();
        b.show();
        a.add(b);
        a.show();
    }
    
}
