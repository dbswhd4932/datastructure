package coding_test.inflearn;

import java.util.Scanner;

public class T0102 {

    public String solution(String str) {
        StringBuilder answer = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer.append(Character.toLowerCase(c));
            } else {
                answer.append(Character.toUpperCase(c));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.next();

        T0102 t = new T0102();
        System.out.println(t.solution(input));

    }
}
