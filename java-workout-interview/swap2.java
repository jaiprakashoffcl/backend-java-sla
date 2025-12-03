import java.util.*;
import java.io.*;

class swap2{
  public static void main(String []args){
           Scanner sc = new Scanner(System.in);
           int a = sc.nextInt();
           int b = sc.nextInt();

          //swap concept without third variable
           a = a+b;
           b = a-b;
           a= a-b;
           System.out.println(" a: "+ a +" b: "+ b);    
  }
}