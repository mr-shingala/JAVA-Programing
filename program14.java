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
public class program14 {
      public static void main(String[] args){
          
        Scanner input=new Scanner(System.in);
        System.out.println("enter equstion:= ");
        String a;
        String r;
        r = null;
        a = input.nextLine();
          char  b=0;int ig=0;
          
           for (int i = 0; i < a.length(); i++) {
    r = a.replace(" ", "");
           }

          System.out.println(r);
        for (int i = 0; i < a.length(); i++) {
            
      
           if (r.charAt(i)=='+'||r.charAt(i)=='-'||r.charAt(i)=='/'||r.charAt(i)=='*') {
          b = r.charAt(i);
            ig=i;
               break;
            }
       
        }
//        System.out.println(b);
        
       int c;
       c=0;
       
       switch(b){
       
           case ('+'):
               c=(Integer.parseInt(r.substring(0, ig)) + Integer.parseInt(r.substring(ig + 1, r.length())));
               break;
           case ('/'): 
               c=Integer.parseInt(r.substring(0, ig)) / Integer.parseInt(r.substring(ig + 1, r.length()));
               break;
           case ('*'):
               c=Integer.parseInt(r.substring(0, ig)) * Integer.parseInt(r.substring(ig + 1, r.length()));
               break;
           case ('-'):
               c=Integer.parseInt(r.substring(0, ig)) - Integer.parseInt(r.substring(ig + 1, r.length()));
               break;

       }

       System.out.println(c);
    
}
}
