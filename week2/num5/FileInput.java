package week2.num5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileInput {

    public ArrayList<String[]> getDataFromFile() {
        ArrayList<String[]> studentData = new ArrayList<>();
        try (BufferedReader bin = new BufferedReader(new FileReader("./week2/num5/input.txt"))) {
            String line;
            while((line = bin.readLine()) != null) {
                String[] splitLine = line.split(",");
                studentData.add(splitLine);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return studentData;
    }
}
