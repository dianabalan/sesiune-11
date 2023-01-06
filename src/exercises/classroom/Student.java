package exercises.classroom;

import java.util.Arrays;

public class Student {
    private String name;
    private int id;
    private int[] grades;
    private int gradeCount;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        grades = new int[10];
        gradeCount = 0;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void addGrade(int grade) {
        grades[gradeCount] = grade;
        gradeCount++;
    }

    public int[] getGrades() {
        return Arrays.copyOfRange(grades, 0, gradeCount);
    }

    public double getAverageGrade() {
        if (gradeCount == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < gradeCount; i++) {
            sum += grades[i];
        }
        return sum / gradeCount;
    }
}