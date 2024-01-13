/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg220761305059;

/**
 *
 * @author Students
 */
class vehicles{
String vihecl_type="supercar";

public void display(){
;
   System.out.println(vihecl_type);


}
}
class car extends vehicles{


String model_type="007";
String company_name="TATA";
    @Override
 public void display(){
System.out.println(model_type);
System.out.println(company_name);
 }

  

}

public class programno22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      vehicles sc=new vehicles();  
      car sc1=new car();  
      
      sc1.display();
      sc.display();
      
    }
}
