import java.util.*;
import java.io.*;

public class swhile{

public static void main(String[] args){
  
  Scanner sc = new Scanner(System.in);
        int correctpin = 1234;
        int enterpin;

        System.out.println("Enter pin");
        enteredPin = sc.nextInt();

        while (enteredPin != correctPin) {
            System.out.print("Wrong Pin, Try again:");
            enteredPin = sc.nextInt();
        }

        System.out.println("Yes, you are in!");
}
}