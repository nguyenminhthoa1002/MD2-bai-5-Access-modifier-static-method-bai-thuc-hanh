package rikkeiAcademy;

import rikkeiAcademy.Student;

public class Main {
    public static void main(String[] args) {
        Student.change();

        Student st1 = new Student(1, "Thoa");
        Student st2 = new Student(2,"Trang");
        Student st3 = new Student(3, "Linh");

        st1.display();
        st2.display();
        st3.display();

    }
}