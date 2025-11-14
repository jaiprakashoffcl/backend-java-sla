//leap year with parameter with return type

import java.util.*;
import java.io.*;

class leapyear{
      public boolean leap(int year){
            if(year%400 == 0){
               return true;
            }
            else if(year%4 == 0 && year%100 !=0){
               return true;
            }
            else{
               return false;
            }        
      }
}

public class leapyear3{
     public static void main(String []args){
 
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a year :");
          int year = sc.nextInt();
 
          leapyear x1= new leapyear();
          boolean y = x1.leap(year);

          if(y){
            System.out.println("Leap year");
          }
          else{
            System.out.println("Not leap year");
          }
     }
}