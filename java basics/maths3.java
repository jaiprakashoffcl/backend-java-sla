//with parameter, with return type

import java.util.*;
import java.io.*;

class maths{

    public int addition(int a,int b){
          int c = a+b;
          return c; 
    }
}

public class maths3{
      public static void main(String []args){
            maths m1= new maths();

            int a=100,b=200;
            int res = m1.addition(a,b);
            System.out.println("result:"+res);
      }
}
