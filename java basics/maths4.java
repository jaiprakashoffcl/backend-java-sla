// no parameter, with return type

import java.util.*;
import java.io.*;

class maths{

public int addition(){
       int a=100,b=200;
       int x = a+b;
       return x;
} 
}

public class maths4{
     public static void main(String []args){
             maths m1= new maths();
             int res = m1.addition();
             System.out.println("result :"+res);
     }
}

