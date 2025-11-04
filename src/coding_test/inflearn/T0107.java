package coding_test.inflearn;

import java.util.Scanner;

public class T0107 {

    public String solution(String str) {
        String answer = "YES";

        String upperCase = str.toUpperCase();
        int left = 0;
        int right = upperCase.length() - 1;
        char[] charArray = upperCase.toCharArray();

        while (left <= right) {
            if (charArray[left] != charArray[right]) {
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

        T0107 t = new T0107();
        System.out.println(t.solution(input));
    }
}
