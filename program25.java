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
public class program25 {

    /**
     * @param args the command line arguments
     */
  public static  void decimall(String ss) throws NumberFormatException{
      try
      {
        int n=Integer.parseInt(ss, 2);
        System.out.print("Desimal=");
        System.out.print(n);
      }
      catch(NumberFormatException e)
      {
          System.out.println("Input must be binary");
      }
    }
  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Entr number=");
        String s=sc.nextLine();
        decimall(s);
        
    }
}
