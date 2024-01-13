/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg220761305059;

import java.util.Scanner;

/**
 *
 * @author Students
 */
class studentt {

    int age;
    String name, city;

    void takedata() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter name=");
        name = input.nextLine();
        System.out.print("enter city=");
        city = input.nextLine();
        System.out.print("enter age=");
        age = input.nextInt();
    }

    void printdata() {
        System.out.println(name);
        System.out.println(city);
        System.out.println(age);
    }
}

public class programno20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        studentt s1 = new studentt();
        s1.takedata();
        s1.printdata();
        studentt s2 = new studentt();
        s2.takedata();
        s2.printdata();
    }
}
