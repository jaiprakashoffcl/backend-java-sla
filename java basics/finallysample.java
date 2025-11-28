import java.io.*;
import java.util.*;

class finallysample
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
     }

     catch(ArithmeticException ex)
     {
       System.out.println( ex.getMessage());
     }
    
     finally{
          System.out.println("Final message");
     }

      System.out.println(" thank you ");

 }
}