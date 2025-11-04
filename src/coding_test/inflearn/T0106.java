package coding_test.inflearn;

import java.util.Scanner;

public class T0106 {

    public String solution(String str) {
        StringBuilder builder = new StringBuilder();

        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char c = str.charAt(i);

            if (str.indexOf(c) == i) {
                builder.append(charArray[i]);
            }
        }

        return builder.toString();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        T0106 t = new T0106();
        System.out.println(t.solution(input));
    }

}
