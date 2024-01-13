/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg220761305059;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Students
 */
class game{
    
int numberofguess=0;
int b;
int a;

//constror for generate the random number
  public game(){
 
   Random input=new Random();
//   b=input.nextInt(0,100);
   
   }
  
  //show the constructor output
  public void takeinputc(){
 //int g=input.nextInt();
 System.out.println(b);
}

//take input from the user
public int takeinput(){
 Scanner input=new Scanner(System.in);
 a=input.nextInt();
 System.out.println(a);
 return 0;
}
public int iscorrectnumber(){

    if(b==a)
    {
        System.out.println("you guess the righ number");
        numberofguess++;
    }
    else if(b>a)
    {
        System.out.println("you guess small number");
       takeinput();
       iscorrectnumber();
       numberofguess++;
               
    }
    else if(b<a)
    {
        System.out.println("you guess the big number");
       takeinput();
       iscorrectnumber();
       numberofguess++;
       
    }
 return 0;
}
  //number of gesses
public int setnog(int n){
  numberofguess=n;
    return 0;
}
public int getnog(){
  return numberofguess;
    
}

}
   


public class test {

    public static void main(String[] args){
    //int n;
    game play=new game();
    play.takeinputc();
     play.takeinput();
     play.iscorrectnumber();
     //int i=10;
    
          System.out.println("you play "+play.getnog()+" try");
    
        }

    }        


    
