import java.util.*;
import java.io.*;

public class findoccurence{
     public static void main(String[] args){
           int []arr={10,20,30,40,50,10,20,30,10,20};
           
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a number :");
           int number = sc.nextInt();
           
           int findnum = 0;
           for(int i=0;i<arr.length;i++){
              if(number == arr[i]){
                 findnum++;
              }
           }
          System.out.println("no of occurrence: " + findnum);
     }
}