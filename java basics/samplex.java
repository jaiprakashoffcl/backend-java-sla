//Compile-time Polymorphism

import java.util.*;

class myclass{

public void addition(int a,int b, int c){
   System.out.println("int , int , int");
}
public void addition(int a,int b){
   System.out.println("int , int");
}
public void addition(float a,float b){
   System.out.println("float , float ");
}
public void addition(int a,float b){
   System.out.println("int , float");
}
public void addition(float a,int b){
   System.out.println("float , int");
}
}

public class samplex{
  public static void main(String []args){
   myclass m1 = new myclass();
 
    m1.addition(10,20,30);
    m1.addition(40,60);
    m1.addition(10.5f,20.4f);
    m1.addition(10,20.2f);
    m1.addition(10.5f,20);
  }
}