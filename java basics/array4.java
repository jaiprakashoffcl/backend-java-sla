import java.util.*;
import java.io.*;

public class array4{
   public static void main(String[] args){
        char []letter = new char[5];
        
         Scanner sc=new Scanner(System.in);
         for(int i=0;i<5;i++){
             System.out.println("Enter letters");
             letter[i] = sc.next().charAt(0);
         }
         for(int i=0;i<letter.length;i++){
             System.out.println(""+letter[i]);
         }

}
}