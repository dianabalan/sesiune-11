package exercises.classroom;

import java.util.Arrays;

public class Classroom {
    private Student[] students;
    private int studentCount;

    public Classroom() {
        students = new Student[10];
        studentCount = 0;
    }

    public void addStudent(Student student) {
        students[studentCount] = student;
        studentCount++;
    }

    public void addGrade(int studentId, int grade) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == studentId) {
                students[i].addGrade(grade);
                return;
            }
        }
        System.out.println("Error: could not find student with ID " + studentId);
    }

    public Student[] getStudents() {
        return Arrays.copyOfRange(students, 0, studentCount);
    }

    public double getClassAverage() {
        if (studentCount == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < studentCount; i++) {
            sum += students[i].getAverageGrade();
        }
        return sum / studentCount;
    }
}