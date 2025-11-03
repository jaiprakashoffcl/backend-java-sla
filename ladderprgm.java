import java.util.*;
import java.io.*;

public class ladderprgm {

  public static void main(String[] args){

    System.out.println("Enter marks");
    Scanner sc = new Scanner(System.in);

    int marks = sc.nextInt();

    if(marks>=80){
       System.out.println("Grade A");
    }
    else if(marks>=70){
       System.out.println("Grade B");
    }
    else if(marks>=60){
       System.out.println("Grade C");
    }
    else {
       System.out.println("Fail");
    } 
}
}