package coding_test.inflearn;

import java.util.Scanner;

public class T0111_2 {

    public String solution(String str) {
        str = str + " ";
        int length = str.length();
        StringBuilder answerBuilder = new StringBuilder();

        char[] charArray = str.toCharArray();
        int count = 1;
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == charArray[i + 1]) {
                count++;
            } else {
                answerBuilder.append(charArray[i]);
                if (count > 1) {
                    answerBuilder.append(count);
                }
                count = 1;

            }
        }

        return answerBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        T0111_2 t = new T0111_2();
        System.out.println(t.solution(input));
    }

}
