/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg220761305059;

/**
 *
 * @author Students
 */

public class program8 {
     static int factorial(int n)
    { 
     if(n<=0||n==1)
     {
      return 1;   
     }
      int ans;
      ans= n*factorial(n-1);
      return ans;
    }
     public static void main(String[] args){
         
      // int ans=factorial(10);  
        int b=Integer.parseInt(args[0]);
        int c = factorial(b);
        System.out.println(c);
         
         
     }
}
