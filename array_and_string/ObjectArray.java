package array_and_string;

public class ObjectArray {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sayantan";
        s1.age = 25;
        s1.marks = 100;

        Student s2 = new Student();
        s2.name = "Sekhar";
        s2.age = 29;
        s2.marks = 90;

        Student s3 = new Student();
        s3.name = "Pabitra";
        s3.age = 27;
        s3.marks = 70;

        // Student[] students = {s1, s2, s3};
        // Or,
        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student stud : students)   {
            System.out.println("Name: " + stud.name + ", age: " + stud.age + ", marks: " + stud.marks);
        }
    }
}

class Student   {
    String name = "";
    int age = 0;
    int marks = 0;
}