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
public class programno11 {

    public static int[] reverse(int a[]){
        
        int[] c= new int[10];  
  int i =0;
  int j=0;
  for(i=9;i>=0;i--){
   
     c[j]=a[i];
      j++;
      
  }     
        
        
        return c;

    }
    public static void main(String[] args){
     Scanner input=new Scanner(System.in);
     int arr[]=new int[10];
     System.out.println("enter the 10 number");
     for(int i=0;i<arr.length;i++){
         arr[i]=input.nextInt();
       
     }
     int k[]=new int[10];
     k=reverse(arr); 
     
    for(int i=0;i<=9;i++){
      System.out.println("REVERSE ANS "+k[i]);  
    
}
    }
}

            
    

