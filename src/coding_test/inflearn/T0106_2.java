package coding_test.inflearn;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class T0106_2 {

    public String solution(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            set.add(c);
        }

        for (Character c : set) {
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        T0106_2 t = new T0106_2();
        System.out.println(t.solution(input));

    }

}
