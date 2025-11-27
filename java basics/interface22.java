//multi-level inheritance

import java.io.*;

interface interface1{

void displaydate();
void displaymonth();

}

interface interface2 extends interface1{
void displayyear();
}

class myclass1 implements interface2{

public void displaydate(){
  System.out.println("27");
}
public void displaymonth(){
 System.out.println("November");
}
public void displayyear(){
 System.out.println("2025");
}
}

class interface22{

public static void main(String []args){

   myclass1 m1 = new myclass1();
   m1.displaydate();
   m1.displaymonth();
   m1.displayyear();
}
}