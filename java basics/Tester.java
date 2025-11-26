import java.util.*;
import java.io.*;

class Shape {
    public void display() {
        System.out.println("displaying....");
    }
}

class Rectangle extends Shape {
    public void area(double length, double width) {
        double area = length * width;
        System.out.println("area of rect: " + area);
    }
}

class Cube extends Rectangle {
    public void volume(double side) {
        double volume = side * side * side;
        System.out.println("volume of cube: " + volume);
    }
}

public class Tester {
    public static void main(String[] args) {
        Cube cube = new Cube();
        cube.display();
        cube.area(5, 5);   
        cube.volume(5);    
    }
}
