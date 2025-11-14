//leap year no parameter with return type

import java.util.*;
import java.io.*;

class leapyear{

      public boolean leap(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a year: ");
            int year = sc.nextInt();
            
            if(year%400==0){
              return true;
            }
            else if(year%4==0 && year%100 !=0){
               return true;
            }
            else{
               return false;
            }
      }
}

public class leapyear4{
      public static void main(String []args){
            leapyear x1= new leapyear();
            boolean y = x1.leap();

           if(y){
              System.out.println("Leap year");
           }
           else{
              System.out.println("Not a leap year");
           }
      }
}