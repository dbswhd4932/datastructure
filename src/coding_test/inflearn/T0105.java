package coding_test.inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class T0105 {

    public String solution(String str) {
        String answer = "";

        char[] charArray = str.toCharArray();

        int left = 0;
        int right = str.length() - 1;
        while (left <= right) {
            if (!Character.isAlphabetic(charArray[left])) {
                left ++;
            } else if (!Character.isAlphabetic(charArray[right])) {
                right --;
            } else {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left ++;
                right --;
            }
        }
        answer = String.valueOf(charArray);
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        T0105 t = new T0105();
        System.out.println(t.solution(input));
    }
}
