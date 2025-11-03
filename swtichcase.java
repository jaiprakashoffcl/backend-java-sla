import java.util.*;
import java.io.*;

public class switchcase{

public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Color:");
  String color = sc.nextLine();

  switch(color)
   {
    case "red":
         System.out.println("red color");
         break;
    case "black":
         System.out.println("black color");
          break;
    case "green":
          System.out.println("Green color");
          break;
     default:
          System.out.println("Invalid color");
          break;

}  
}