import java.io.*;

class student {

    public int count;

    public student() {
        count = 0;
    }

    public void increment() {
        count++;
    }

 
    public static void display() {
        System.out.println("count is " + count);
    }
}

class new2 {

    public static void main(String[] args) {

        student s1 = new student();
        student s2 = new student();
        student s3 = new student();

        s1.increment();  
        s2.increment();  
        s3.increment(); 
 
        s1.display();    
        s2.display();    
        s3.display();    
    }
}
