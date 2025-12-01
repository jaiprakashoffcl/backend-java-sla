import java.io.*;

class myclass1 extends Thread
{

public void run()
{

try
{

 for(int i=1; i<=10; i++)
  {
    System.out.println(" method1: "+ i);
    Thread.sleep(3000); // 1000ms=1sec
  }

}
catch(InterruptedException ex)
{

}

}


}

class myclass2 extends Thread
{

public void run()
{

try
{

for(int i=1; i<=10; i++)
  {
    System.out.println(" method2: "+ i);
    Thread.sleep(1000);
  }

}
catch(InterruptedException ex)
{

}

}


}

public class aftermultithread
{

 public static void main(String []args)
 {

   myclass1 m1=new myclass1();
   myclass2 m2=new myclass2();

   m1.start();
   m2.start();

 }
}