import java.util.*;
import java.io.*;

public class swapping{
     public static void main(String[] args){
            int a,b;
            int temp=0;

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter A:");
            a = sc.nextInt();
            System.out.println("Enter B:");
            b = sc.nextInt();

            temp=a;
            a=b;
            b=temp;
            
           System.out.println("Swapp of A:"+a);
           System.out.println("Swapp of B:"+b);
           
           sc.close();           
     }
}