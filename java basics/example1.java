import java.util.*;

public class example1{

public static void main(String[] args){

  System.out.println("Enter English, Tamil, Maths marks:");
  Scanner sc = new Scanner(System.in);
  int english = sc.nextInt();
  int tamil = sc.nextInt();
  int maths = sc.nextInt();

  if (tamil >= 35 && english >= 35 && maths >= 35){
     System.out.println("You passed all subjects");
  }
  else{
     System.out.println("You Failed in some subjects");
  }
}
}