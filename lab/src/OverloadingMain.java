/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karti
 */

public class  OverloadingMain {
    public static void main(String[] args)
    {
        System.out.println("Main with args array");
        OverloadingMain.main("abc");
        OverloadingMain.main();
    }
    public static void main(String args)
    {
        System.out.println("Main with args");
    }
    public static void main()
    {
        System.out.println("Main without arguments");
    }
}

