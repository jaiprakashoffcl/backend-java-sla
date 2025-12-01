import java.util.*;

interface Add{
   int add();
}

class Additionlamda{
  public static void main(String []args){
      int a,b; 
      Scanner sc = new Scanner(System.in);
      a = sc.nextInt();
      b = sc.nextInt();
  
      Add addx = () -> a+b; //lambda expression 
   
      int res  = addx.add();
      System.out.println(""+res);
}
}