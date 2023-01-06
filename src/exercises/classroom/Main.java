package exercises.classroom;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Classroom classroom = new Classroom();

        // Add some students to the class
        Student s1 = new Student("Alice", 123);
        Student s2 = new Student("Bob", 456);
        Student s3 = new Student("Charlie", 789);

        classroom.addStudent(s1);
        classroom.addStudent(s2);
        classroom.addStudent(s3);

        // Add some grades for the students
        classroom.addGrade(123, 90);
        classroom.addGrade(123, 95);
        classroom.addGrade(456, 80);
        classroom.addGrade(456, 85);
        classroom.addGrade(456, 90);
        classroom.addGrade(789, 70);
        classroom.addGrade(789, 75);

        // Print the grades for all students
        for (Student s : classroom.getStudents()) {
            System.out.println(s.getName() + ": " + Arrays.toString(s.getGrades()));
        }

        // Print the average grade for the class
        System.out.println("Class average: " + classroom.getClassAverage());
    }
}
