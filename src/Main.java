package src;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("graYson", "zeTIc", 1217611, null);
        System.out.println("Name: " + student1.getFirstName() + " " + student1.getLastName());
        System.out.println("Student ID: " + student1.getStudentNum());
        System.out.println("Activities: " + student1.getActivities());
    }
}