import java.util.*;
import java.io.*;

public class findarr{
     public static void main(String[] args){
            int []arr ={100,200,450,650,20};
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter element to found in arr:");
            int find = sc.nextInt();
            
            boolean isFound = false;
            for(int i=0;i<5;i++){
                if(arr[i] == find){
                    isFound = true;
                    break;
                }
            }
            
            if(isFound){
               System.out.println("Element Found ");
            }
            else{
                System.out.println("Invalid Number");
            }
     }
}