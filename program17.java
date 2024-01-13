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

class student
{
    int roll;
    String name,gander;
    
    void setdata(int r,String n,String g){
        roll=r;
        name=n;
        gander=g;
    }
    int getr()
    {
        return roll;
    }
    String getn()
    {
        return name;
    }
    String getg()
    {
        return gander;
    }
}
public class program17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               // TODO code application logic here
        
        student s=new student();
        Scanner input=new Scanner(System.in);
        System.out.print("enter gander=");
        String gg=input.nextLine();
        System.out.print("enter name=");
        String nam=input.nextLine();
        System.out.print("enter roll no=");
        int ro=input.nextInt();

        s.setdata(ro, nam, gg);
        System.out.println("roll no.="+s.getr());
        System.out.println("name="+s.getn());
        System.out.print("gander="+s.getg());
    }
}
