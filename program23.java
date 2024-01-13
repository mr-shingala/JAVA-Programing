/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg220761305059;

/**
 *
 * @author Students
 */
class A {

    static int X = 40;
}

class B extends A {

    int X = 20;

    public void display() {


        System.out.println(A.X);//40
        System.out.println(X);//20


    }
}

public class program23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        B sc=new B();
        sc.display();
    }
}
