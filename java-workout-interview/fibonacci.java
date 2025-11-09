import java.util.*;
import java.io.*;

public class fibonacci{
      public static void main(String[] args){
            
              int a1=0;
              int a2=1;
              int a3;
              
              for(int i=2;i<=10;i++){
                 a3 = a1+a2;
                 System.out.println("" + a3);
                 a1=a2;
                 a2=a3;
              }
      }
}

