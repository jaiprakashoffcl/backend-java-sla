import java.io.*;
import java.util.*;

class Exceptionsample
{

  public static void main(String []args)
   {
 
      System.out.println("enter two numbers ");
      Scanner s=new Scanner(System.in);

     try
     {
	      int a=s.nextInt();
	      int b=s.nextInt();
	      int c=a/b;
	      System.out.println(" division result is " + c);

              int []num = {10,20,30,40,50};
              System.out.println(num[10]);  
     }
     catch(Exception ex){
              System.out.println(ex.getMessage());
     }

      
      System.out.println(" thank you ");

   }


}