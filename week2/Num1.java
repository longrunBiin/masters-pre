package week2;

public class Num1 {
    public static void main(String[] args) {
        char[] arr = new char[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) ('A' + i);
        }
        for (char c : arr) {
            System.out.print(c + " ");
        }
    }

}
