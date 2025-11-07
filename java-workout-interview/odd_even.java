import java.util.*;
import java.io.*;

public class odd_even{
     public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            
            System.out.println("Enter the number to check:");
            int num = s.nextInt();
            
            if(num%2 == 0){
               System.out.println("Number is even, "+num);
            }
            else{
               System.out.println("Number is odd, "+num);
            }
     }
}