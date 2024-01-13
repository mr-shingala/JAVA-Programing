/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg220761305059;

/**
 *
 * @author Students
 */
class test1 {

    int id;
    String name;

    test1(int id, String name) {

        this.id = id;
        this.name = name;

    }
    
    void printdata(){
    
    System.out.println(id);
     System.out.println(name);
    
    }
}

public class program21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        test1 sc = new test1(10, "ramu");
        test1 obj = new test1(20, "joy");
        sc.printdata();
        obj.printdata();
    }
}
