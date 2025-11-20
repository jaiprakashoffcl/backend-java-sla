import java.io.*;

class maths
{

  private int a, b, c;

  public maths()
   {
     a=100;
     b=200;
   }

 public void addition()
   {
     c=a+b;
     System.out.println(" addition result is " +c);
   }

}


class sample1
{

  public static void main(String []args)
    {
       maths m1=new maths();

       m1.addition();


    }


}