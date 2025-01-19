package week2.num5;

import java.util.ArrayList;

public class GradeManagementSystem {
    FileInput fileInput;
    FileOutput userInput;

    public GradeManagementSystem() {
        fileInput = new FileInput();
        userInput = new FileOutput();
    }

    public void manage() {
        userInput.addNewStudent();
        ArrayList<String[]> studentData = fileInput.getDataFromFile();
        ArrayList<Student> students = parsingData(studentData);

        for (Student student : students) {
            Grade gradeData = student.getGradeData();
            gradeData.printData();
        }
    }
    private ArrayList<Student> parsingData(ArrayList<String[]> studentData) {
        ArrayList<Student> students = new ArrayList<>();
        for (String[] data : studentData) {
            validateScore(data);
            students.add(new Student(data[0], Integer.parseInt(data[1]), data[2], Integer.parseInt(data[3]),
                    Integer.parseInt(data[4]), Integer.parseInt(data[5])));
        }
        return students;
    }

    private void validateScore(String[] data) {
        for (int i = 3; i < 6; i++) {
            if (data[i].equals("null")){
                data[i] = "-1";
            }
        }
    }
}
