import java.util.*;
import java.io.*;

public class array2{
   public static void main(String[] args){
         int []numbers=new int[5];
         Scanner sc=new Scanner(System.in);
         
         for(int i=0;i<5;i++){
                System.out.println("Enter values:");
                numbers[i]=sc.nextInt();
          }
         for(int i=0;i<numbers.length;i++){
               System.out.println(""+numbers[i]);
         }
   }
}