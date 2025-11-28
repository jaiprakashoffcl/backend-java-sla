import java.io.*;
import java.util.*;

class mutliplecatchsample
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
              System.out.println(num[10]);  //kandipa error varum 
                                            // as i got Index 10 out of bounds for length 5
     }
     catch(ArithmeticException ex)
     {
       System.out.println( ex.getMessage());
     }
     catch(ArrayIndexOutOfBoundsException ex)
       {
         System.out.println( ex.getMessage() );
       }

      System.out.println(" thank you ");

   }


}