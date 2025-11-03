import java.util.*;

class marks{

    public static void main(String[] args) {
        
        System.out.println("Enter marks");
        Scanner s=new Scanner(System.in);

        int a=s.nextInt();
        if (a>=35){
            System.out.println("Pass");
        }
        else {
            System.out.println("fail");
        }
    }
}