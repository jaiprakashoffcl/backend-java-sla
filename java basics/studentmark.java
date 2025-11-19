import java.io.*;
import java.util.*;

class student {

public int rollno;
public String name;
public int mark;

    public void getdetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number, name and mark:");
        rollno = sc.nextInt();
        name = sc.next();
        mark = sc.nextInt();
    }

    public void displaydetails() {
        System.out.println(rollno + " " + name + " " + mark);
    }
}

public class studentmark {
  public static void main(String[] args) {
     student s1 = new student();
      student s2 = new student();
     student s3 = new student();

     s1.getdetails();
     s2.getdetails();
     s3.getdetails();

     s1.displaydetails();
     s2.displaydetails();
     s3.displaydetails();

     if (s1.mark > s2.mark && s1.mark > s3.mark) {
         System.out.println("Student 1 mark is high");
      } else if (s2.mark > s1.mark && s2.mark > s3.mark) {
         System.out.println("Student 2 mark is high");
      } else {
            System.out.println("Student 3 mark is high");
      }
}
}
