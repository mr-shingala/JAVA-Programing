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
public class NewClass {
    public static void main(String[] args){
          Scanner s = new Scanner(System.in);
          
           double a=s.nextDouble();     
      System.out.println("value of a is"+a);
      
       double b=s.nextDouble();     
      System.out.println("value of b is"+b);
      
       double c=s.nextDouble();       
      System.out.println("value of c is"+c);
      
      
      if(b>a && b>c && a>c)
      {
          
          System.out.println("value of b is"+b);
          System.out.println("value of a is"+a);
          System.out.println("value of c is"+c);
      }
      
      if(a>b && a>b && b>c)
      {
          
           System.out.println("value of a is"+a);
          System.out.println("value of b is"+b);
          System.out.println("value of c is"+c);
      }
      
      if(c>a && c>b && a>b)
      {
          
           System.out.println("value of c is"+c);
          System.out.println("value of a is"+a);
          System.out.println("value of b is"+b);
      }
      if(c>a && c>b && a>b)
      {
          
           System.out.println("value of c is"+c);
          System.out.println("value of a is"+a);
          System.out.println("value of b is"+b);
      }
      
}
}



