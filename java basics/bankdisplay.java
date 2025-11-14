import java.util.*;
import java.io.*;

class bank{

public int accno;
public String name;
public int balance;


public void getdetails(){  //method - block of statement to do a particular task.

       System.out.println("Enter Account Number,Holder's Name,Balance");
       Scanner sc = new Scanner(System.in);

       accno = sc.nextInt();
       name = sc.next();
       balance = sc.nextInt();
}

public void displaydetails(){ // method implementation
       System.out.println("Account Number: "+ accno + "Holder's Name: "+ name + "Balance :"+balance);
}
}

public class bankdisplay{
      public static void main(String []args){ //public - access specifier static-access modifier void-return type main-methodname(parameter)
             bank a1 = new bank();
             bank a2 = new bank();

             a1.getdetails();
             a2.getdetails();
 
             a1.displaydetails(); //method call
             a2.displaydetails(); 
      }
}