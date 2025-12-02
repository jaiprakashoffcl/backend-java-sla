import java.io.*;
import java.util.*;

public class factorial{
   public static void main(String []args){
  
     int n;
     int ans =1;
     Scanner sc = new Scanner(System.in);
     n = sc.nextInt();

     for(int i=1;i<=n;i++){
         ans *= i;
     }
     System.out.println("Factorial is: "+ans);
}
}