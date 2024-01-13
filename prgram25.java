/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg220761305059;
import java.util.Scanner;

class binaryexception extends Exception {

    public String tostring() {
        return "enter only 0 and 1";
    }
};

public class prgram25 {

    /**
     * @param args the command line arguments
     */
        public static void bin2Dec(String binary_string) {
         
         if("1".equals(binary_string)||"0".equals(binary_string)){
        
        System.out.println("ans is "+binary_string);
         }
        else{
        int index1 = binary_string.indexOf('.');
        System.out.println(index1);
        int index = binary_string.indexOf('.');
        float sum1 = 0;
        if (index1 != -1) {
              
            String new2 = binary_string.substring(index + 1, binary_string.length());
            StringBuilder sbr = new StringBuilder(new2);
            sbr.reverse();
            String new1 = sbr.toString();
          //  System.out.println(new1);
            int b = Integer.parseInt(new1);
           // System.out.println(new1);
            int i = 0;
            while (b != 0) {
                i--;
                //System.out.println(i);
                int num = b % 10;
                // System.out.println("num:="+num);
                sum1 += num * (Math.pow(2, i));
                // System.out.println("sum:="+sum1);
                b = b / 10;

            }
             String new3 = binary_string.substring(0,index);
       int a = Integer.parseInt(new3);
         int sum=0;
         i=0;
        while (a != 0) {
           int num=a%10;//1
           //System.out.println("num is "+num);
            sum+=num*(Math.pow(2, i));
          // System.out.println(sum);//1//3
            i++;
            a=a/10;//11
            
        }
         System.out.println("ans is := "+(sum+sum1));
          
        }
       
        else{
       int a = Integer.parseInt(binary_string);
         int sum=0;
         int i=0;
        while (a != 0) {
           int num=a%10;//1
           //System.out.println("num is "+num);
            sum+=num*(Math.pow(2, i));
          // System.out.println(sum);//1//3
            i++;
            a=a/10;//11
            
        }
         System.out.println("ans is := "+(sum+sum1));
        }   
         
                }
   }

    public static void main(String[] args) {
        // TODO code application logic here
                Scanner sc = new Scanner(System.in);
        System.out.println("ente binary string := ");
        
       
        String B = sc.nextLine();
 
         String binaryPattern = "^[01.]+$";

        if (B.matches(binaryPattern)) {
            bin2Dec(B);
        } else {
            
            try {

                    throw new binaryexception();


                } catch (binaryexception e) {

                    System.out.println(e+"::"+e.tostring());
                }
        }

    }

}
    

