package week2.num5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FileOutput {
    BufferedReader bufferedReader;
    BufferedWriter bufferedWriter;

    public FileOutput(){
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("./week2/num5/input.txt", true));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addNewStudent() {
        System.out.println("이름, 전공과목, 국어, 수학, 영어 점수를 쉼표로 구분하여 입력하세요");
        try {
            int number = Student.getStudentNumber();
            String[] split = bufferedReader.readLine().split(",");
            split[0] += "," + number;
            String data = String.join(",", split);

            bufferedWriter.write("\n"+ data);
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
