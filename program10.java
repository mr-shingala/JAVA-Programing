/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg220761305059;

/**
 *i
 * @author Students
 */
public class program10 {

    public static int gcd(int num1, int num2) {
        int gcd=0;
        for (int i = 2; i <=num2; i++) {

            if (num1 % i == 0 && num2 % i == 0) {

                gcd = i;

            }

        }
        return gcd;

    }

    public static void main(String[] args) {

        System.out.println(gcd(60, 120));
    }
}
