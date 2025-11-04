package coding_test.inflearn;

import java.util.Scanner;

public class T0108 {

    public String solution(String str) {
        String answer = "YES";

        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                stringBuilder.append(c);
            }
        }

        int left = 0;
        int right = stringBuilder.toString().length() - 1;

        char[] charArray1 = stringBuilder.toString().toUpperCase().toCharArray();

        while (left <= right) {
            if (charArray1[left] != charArray1[right]) {
                answer = "NO";
                break;
            } else {
                left++;
                right--;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        T0108 t = new T0108();
        System.out.println(t.solution(input));

    }

}
