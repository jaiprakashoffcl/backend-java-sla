// create a custom class with necessary data and methods.

import java.io.*;
import java.util.*;

class company{

public String employeename;
public int empid;
public int salary;
public String shift;
public int deptid;

public void getdetails(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Employee Name , Employee Id, Salary, Shift(Day/Night), Department ID:");
       employeename = sc.next();
       empid = sc.nextInt();
       salary = sc.nextInt();
       shift = sc.next();
       deptid = sc.nextInt();
}
public void displaydetails(){
       System.out.println("Name of the employee : "+employeename+" Employee ID: "+empid+" Employee Salary: "+salary+" Shift : "+shift+" Department ID:" +deptid);
}
}

public class company1{

public static void main(String []args){
       company c1= new company();
       c1.getdetails();
       c1.displaydetails();
}
}