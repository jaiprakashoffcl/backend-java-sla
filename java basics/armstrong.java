import java.util.*;
import java.io.*;

public class armstrong{
      public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
             int number = sc.nextInt();
             int temp = number;
             int r;
             int s=0;


             while (number > 0){
                  r= number % 10;
                  s = s+r*r*r;
                  number /= 10;
             }
             if (s == temp){
                 System.out.println("Armstrong Number");
             }
             else{
                System.out.println("Not Armstrong Number");
             }
      }
}