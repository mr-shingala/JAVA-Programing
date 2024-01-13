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
public class program2 {
    
     public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        double a=s.nextDouble();     
      System.out.println("value of a is"+a);
      
       double b=s.nextDouble();     
      System.out.println("value of b is"+b);
      
       double c=s.nextDouble();       
      System.out.println("value of c is"+c);
      
       double d=s.nextDouble();        
      System.out.println("value of d is"+d);
     
       double e=s.nextDouble();        
      System.out.println("value of e is"+e);
      
       double f=s.nextDouble();    
      System.out.println("value of f is"+f);
      
      
       System.out.println("value of x and y is");
      
     double x = ((e *d)-(b*f))/((a-d)-(b*c));
     System.out.println("value of x is "+x);
         
       double y = ((a *f)-(e*c))/((a-d)-(b*c));
     System.out.println("value of y is "+y);
     }
    
    
}
