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
public class program5 {
    
     public static void main(String[] args){
          Scanner s = new Scanner(System.in);
          
           double a=s.nextDouble();     
      //System.out.println("value of a is"+a);
      
       double b=s.nextDouble();     
      //System.out.println("value of b is"+b);
      
       double c=s.nextDouble();       
      //System.out.println("value of c is"+c);
      
      
      if(b>a&&b>c&&a>c)
      {
          
          System.out.println("value of b is"+b);
          System.out.println("value of a is"+a);
          System.out.println("value of c is"+c);
      }
      
      else if(a>b&&a>b&&b>c)
      {
          
           System.out.println("value of a is"+a);
          System.out.println("value of b is"+b);
          System.out.println("value of c is"+c);
      }
      
      else if(c>a&&c>b&&a>b)
      {
          
           System.out.println("value of c is"+c);
          System.out.println("value of a is"+a);
          System.out.println("value of b is"+b);
      }
      else if(b>a&&c>b&&c>a)
      {
           System.out.println("value of c is"+c);
          System.out.println("value of b is"+b);
          System.out.println("value of a is"+a);
      }
      
      else if(a>b&&a>c&&c>b)
      {
          
           System.out.println("value of a is"+a);
          System.out.println("value of c is"+c);
          System.out.println("value of b is"+b);
      }
      
      else if(c>a&&c>b&&b>a)
      {
          
           System.out.println("value of c is"+c);
          System.out.println("value of b is"+b);
          System.out.println("value of a is"+a);
      }
      else if(b>c&&b>a&&c>a)
      {
          
           System.out.println("value of b is"+b);
          System.out.println("value of c is"+c);
          System.out.println("value of a is"+a);
      }
      
      
      
}
}

