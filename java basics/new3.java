class student {

    public static int totalcount;

    int marks;

    public void setMarks(int m) {
        marks = m;
        totalcount++;
    }

    public void display() {
        System.out.println("marks: " + marks);
    }

    public static void total() {
        System.out.println("total students: " + totalcount);
    }
}

class new3 {

    public static void main(String[] args) {

        student s1 = new student();
        student s2 = new student();
        student s3 = new student();

        s1.setMarks(90);
        s2.setMarks(85);
        s3.setMarks(78);

        s1.display();
        s2.display();
        s3.display();

        student.total();
    }
}
