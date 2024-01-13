/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg220761305059;

import java.util.*;

/**
 *
 * @author Students
 */
public class program12 {

    public static void main(String[] args) {
    int sum = 0;
        int a[][] = new int[6][6];
        Random sc = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt(2);
                System.out.print(a[i][j] + " ");

            }
            System.out.println(" ");
        }
        
          System.out.println(" ");
         System.out.println("this is for row");
         System.out.println(" ");

        //this for loop count sum of row
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum += a[i][j];
            }
            if (sum % 2 == 0) {
                System.out.println("row " + (i+1) + ":- even");

            } else {
                System.out.println("row " + (i+1) + ":- odd");

            }
            sum = 0;
        }
     
         System.out.println(" ");
         System.out.println("this is for column");
         System.out.println(" ");
        int j=0;
        //this for loop count sum of column
           for ( j = 0; j < a.length; j++) {
        for (int i = 0; i < a.length; i++) {

                sum += a[j][i];
            }
            if (sum % 2 == 0) {
                System.out.println("column " + (j+1) + ":- even");

            } else {
                System.out.println("column " + (j+1) + ":- odd");

            }
            sum = 0;
        }

    
        
    }
}
