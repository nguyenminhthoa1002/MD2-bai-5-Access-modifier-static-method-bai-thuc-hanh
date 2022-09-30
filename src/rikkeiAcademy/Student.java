package rikkeiAcademy;

public class Student {
    private int studentID;
    private String name;
    private static String university = "BBDIT" ;

    Student(int r, String n) {
        studentID = r;
        name = n;
    }

    static void change() {
        university = "University of Languages & International Studies";
    }

    void display(){
        System.out.println(studentID + " " + name + " "+ university);
    }
}
