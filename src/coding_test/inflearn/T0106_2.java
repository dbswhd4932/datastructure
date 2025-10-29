package coding_test.inflearn;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class T0106_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        char[] charArray = input.toCharArray();

        Set<Character> charSet = new LinkedHashSet<>();

        for (char c : charArray) {
            charSet.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (Character c : charSet) {
            result.append(c);
        }

        System.out.println(result);
    }

}
