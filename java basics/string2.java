import java.util.*;
import java.io.*;

public class string2 {
    public static void main(String[] args) {
        
        String[] names = new String[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++){
           System.out.println("Enter name");
           names[i] = sc.nextLine();
        }
        for(int i=0;i<names.length;i++){
           System.out.println(""+names[i]);
        }
    }
}
