import java.util.*;
import java.io.*;

class restaurant {

private String itemName;
private int price;
private String category;
private String spiceLevel;
private String description;


public void getdetails(){
      System.out.println(" Enter Name of the item, Price, Category (veg / non-veg), spiceLevel (mild / medium / spicy), description (short info about the dish you need)");
      Scanner s=new Scanner(System.in);

      itemName = s.next();
      price = s.nextInt();
      category = s.next();
      spiceLevel = s.next();
      description = s.next();

}

public void display(){
       System.out.println("Item Name : "+ itemName + "Price : "+ price + "Category you choose : "+category+ "Spice Level : "+spiceLevel+ "Description you given :"+description);
}
}

public class resturant1 {
 
 public static void main (String []args){
        restaurant r1 = new restaurant();
        restaurant r2 = new restaurant();

        r1.getdetails();
        r2.getdetails();
        
        r1.display();
        r2.display();
 }
}