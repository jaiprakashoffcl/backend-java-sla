import java.util.*;
import java.io.*;

public class biggest{
    public static void main(String[] args) {
  
           int []numbers={10,500,20,600,250};

           int bigg = numbers[0];

           for (int i=1;i<5;i++){
               if(numbers[i] > bigg){
                  bigg = numbers[i];
               }
           }
     System.out.println("biggest num is " + bigg);
}
}