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
public class program4 {
       public static void main(String[] args){
          Scanner s = new Scanner(System.in);
          
          System.out.println("enter youre weight in pond");
          double weight=s.nextDouble();
          System.out.println("youre weight is "+weight);
          
          System.out.println("enter youre hight in ench");
          double ench=s.nextDouble();
          System.out.println("youre hight is "+ench);
          
          
          double  kg =weight *0.45359237;
          double  meter =ench *0.0254;
          
          double BMI = (kg)/(meter*meter);                            
        System.out.print("youre bmi is "+BMI);
}
}