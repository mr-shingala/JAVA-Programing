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
class circle {

    double a;

    circle(double b) {
        this.a = b;


    }
}

class LOAN {
//
//    double a;
//
//    LOAN(double b) {
//        this.a = b;
//
//
//    }
}

public class program15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Object> obj = new ArrayList<Object>();
        obj.add(new circle(1000));
        obj.add(new LOAN());
        obj.add(new String("this is shrey"));
        obj.add(new Date());


        //System.out.print(obj.toString());
         for(int i=0;i<obj.size();i++){
         
          System.out.println(obj.get(i).toString());
         
         }

        
    }
}

//[pkg220761305059.circle@cd73c3c, pkg220761305059.LOAN@6b38dba, this is shrey, Mon Sep 25 15:14:12 IST 2023]BUILD SUCCESSFUL (total time: 0 seconds)
//circle@4bea71d4
//circle@4bea71d4,




//ircle@4bea71d4,
//.circle@cd73c3
//circle@4bea71d4t