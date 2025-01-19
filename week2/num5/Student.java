package week2.num5;

import java.util.ArrayList;

public class Student {
    private String name;
    private static int studentNumber = 1003;
    private String major;
    private int korean;
    private int math;
    private int english;

    public Student(String name, int studentNumber, String major, int korean, int math, int english) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.major = major;
        this.korean = korean;
        this.math = math;
        this.english = english;
    }

    public static int getStudentNumber() {
        return studentNumber++;
    }

    public Grade getGradeData() {
        ArrayList<Integer> numberOfSubject = getNumberOfSubject();
        int total = getTotalScore(numberOfSubject);
        int average = total/numberOfSubject.size();
        return new Grade(name, studentNumber, average, total, numberOfSubject.size());
    }

    private int getTotalScore(ArrayList<Integer> numberOfSubject) {
        int total = 0;
        for (Integer score : numberOfSubject) {
            total += score;
        }
        return total;
    }

    private ArrayList<Integer> getNumberOfSubject() {
        ArrayList<Integer> subjects = new ArrayList<>();
        if (korean != -1) {
            subjects.add(korean);
        }
        if (math != -1) {
            subjects.add(math);
        }
        if (english != -1) {
            subjects.add(english);
        }

        return subjects;
    }
}
