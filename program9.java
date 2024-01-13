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
public class program9 {
   
    public static void main(String[] args){
        
        Scanner s =new Scanner(System.in);
        int a=s.nextInt();
     
        for(int i=2;i<=a;i++)
        {            
         if(a%i==0)
             {  
                   System.out.println(i);
                   a=a/i;
                   i--;
                   
             }
         else if(a==1){
             System.out.println(1);
 
         }
         
    
        }
    }
}
