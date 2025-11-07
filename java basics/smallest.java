import java.util.*;
import java.io.*;

public class smallest{
      public static void main(String[] args){
             int []values= {100,500,600,20,40};
             int small = values[0];
             for(int i=1;i<5;i++){
                 if(small > values[i]){
                    small = values[i];
                 } 
             }
         System.out.println("biggest: "+small);
      }
}