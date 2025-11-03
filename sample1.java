import java.util.*;

public class sample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Favorite Color:");
        String fav_color = sc.nextLine();

        System.out.println("Enter Favorite Number:");
        int fav_number = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Favorite Place:");
        String fav_place = sc.nextLine();

        System.out.println("Enter Favorite Food:");
        String fav_food = sc.nextLine();

        System.out.println("Favorite Color : " + fav_color);
        System.out.println("Favorite Number: " + fav_number);
        System.out.println("Favorite Place : " + fav_place);
        System.out.println("Favorite Food  : " + fav_food);
    }
}
