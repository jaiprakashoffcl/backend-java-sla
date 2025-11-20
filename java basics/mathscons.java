import java.io.*;

class maths{

private int a,b,c;

public maths(){
    a = 100;
    b = 200;
}
public maths(int x,int y){
    a = x;
    b = y;
}
public void addition(){
      c = a+b;
      System.out.println(""+c);
}
}

public class mathscons{

public static void main(String []args){
    maths m1 = new maths();
    maths m2 = new maths(1002,400);
    m1.addition();
    m2.addition();
  }
}