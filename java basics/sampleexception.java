import java.io.*;
import java.util.*;

class sampleexception{

 public static void main(String []args){
       System.out.println("Enter two numbers");
       Scanner sc = new Scanner(System.in);

       try
       {
           int a = sc.nextInt();
           int b = sc.nextInt();
           int c = a/b;
           System.out.println("Result: "+c);
        }
      catch(ArithmeticException ex){
        System.out.println(ex.getMessage());
      }
        System.out.println("thank you!");
 }
}