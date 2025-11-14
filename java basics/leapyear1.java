//leap year no parameter no return type

import java.util.*;
import java.io.*;

class leapyear{

     public void leap(){

          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the year:");
          int year = sc.nextInt();
          if(year%400 == 0){
             System.out.println("Leap year");
          }
          else if(year%4 == 0 && year%100 !=0){
                 System.out.println("Leap year");
          }
          else{
              System.out.println("Not leap year");
          }
     }
}

public class leapyear1{
       public static void main(String []args){
             leapyear x1 = new leapyear();

             x1.leap();
       }
}
