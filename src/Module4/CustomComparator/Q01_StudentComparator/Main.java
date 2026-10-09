package Module4.CustomComparator.Q01_StudentComparator;

// Sort students by marks using Comparator

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name; int marks;
    Student(String name, int marks) { this.name = name; this.marks = marks; }
    public String toString() { return name + " (" + marks + ")"; }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Krisha", 82));
        students.add(new Student("Shivaaya", 95));
        students.add(new Student("Rasika", 93));
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                return Integer.compare(a.marks, b.marks); // Ascending marks.
            }
        });
        System.out.println(students);
    }
}