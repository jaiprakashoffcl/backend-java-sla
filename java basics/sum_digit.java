import java.util.*;
import java.io.*;

public class sum_digit{
     public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            int number = sc.nextInt();
             
            int x;
            int y = 0;

           while(number > 0){
                x = number%10;
                y = y+x;
                number = number/10;
           }
           System.out.println("sum : "+y);
     }
}