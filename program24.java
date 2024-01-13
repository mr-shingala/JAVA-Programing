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

class notsufficientfund extends Exception {

    public String tostring() {
        return "not sufficent fund";
    }
}

public class program24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
     double deposits = 1000.00;
        System.out.println("your banck blance is =" + deposits);
        Scanner inpute = new Scanner(System.in);
        double withdraw;
        int i = 1;

        while (i < 4) {
            withdraw = inpute.nextDouble();
            deposits -= withdraw;
            if (deposits < withdraw) {
                try {


                    throw new notsufficientfund();


                } catch (notsufficientfund e) {

                    System.out.println("not sufficent fund");
                }
            }

            i++;

        }
    }
}
        
        