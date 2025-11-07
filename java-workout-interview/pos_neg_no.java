import java.util.*;
import java.io.*;

public class pos_neg_no{
       public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the number:");
             int number = sc.nextInt();
             
             if (number > 0){
                System.out.println("Positive Number");
             }
             else{
                System.out.println("Negative Number");
             }
       }
}