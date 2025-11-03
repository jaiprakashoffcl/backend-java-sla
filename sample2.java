import java.util.*;

public class sample2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter total amount");
        double amount =s.nextDouble();

        System.out.println("Enter Quantity");
        int Quantity= s.nextInt();  

         double unitprice = amount / Quantity;

         System.out.println("Unit Price"+ unitprice);
    }
}