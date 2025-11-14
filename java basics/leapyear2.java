//leap year with parameter no return type

import java.util.*;
import java.io.*;

class leapyear{

     public void leap(int year){
            if(year%400 == 0){
              System.out.println("Leap year");
            }
            else if(year%4 == 0 && year!= 100){
               System.out.println("Leap year");
            }
            else{
               System.out.println("Not a leap year");
            }
     }
}

public class leapyear2{
   public static void main(String []args){
        leapyear x1= new leapyear();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        
        x1.leap(year);	 
   }
}