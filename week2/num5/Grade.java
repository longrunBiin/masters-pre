package week2.num5;

public class Grade {
    private String studentName;
    private int studentNumber;
    private int averageScore;
    private int totalScore;
    private int numberOfCount;

    public Grade(String studentName, int studentNumber, int averageScore, int totalScore, int numberOfCount) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.averageScore = averageScore;
        this.totalScore = totalScore;
        this.numberOfCount = numberOfCount;
    }

    public void printData() {
        System.out.println(studentName + " 학생은 " + numberOfCount + "과목을 수강했습니다.");
        System.out.println("총점은 " + totalScore + "점이고 평균은" + averageScore + "점입니다.");
    }
}
