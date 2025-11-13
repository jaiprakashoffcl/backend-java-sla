//with parameter, no return type

import java.util.*;
import java.io.*;


class maths{
 
  public void addition(int a, int b){  // formal parameters
        
       int c = a+b;
       System.out.println("result :"+c);
  }
}

public class maths2{

      public static void main(String []args){
            maths m1 = new maths();

           int a=100,b=200;
           m1.addition(a,b); // actual parameters
      }
}