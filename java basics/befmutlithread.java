import java.util.*;

class myclassx{

 public void method1(){
   try{
     for(int i = 1;i<=5;i++){
          System.out.println("Result 1:"+i);
          Thread.sleep(2000);
     }
   }
   catch(InterruptedException ex){

   }
 }
}

class myclassy {

 public void method2(){
   try{
     for(int i = 1;i<=5;i++){
          System.out.println("Result 2:"+i);
          Thread.sleep(3000);
     }
   }
   catch(InterruptedException ex){

   }
 }
}

class befmutlithread{
    public static void main(String []args){
        myclassx m1 = new myclassx();
        myclassy m2 = new myclassy();

        m1.method1();
        m2.method2();
    }
}