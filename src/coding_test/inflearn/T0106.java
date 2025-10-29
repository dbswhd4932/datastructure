package coding_test.inflearn;

import java.util.Scanner;
import java.util.Set;

public class T0106 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (input.indexOf(c) == i) {
                result += c;
            }
        }

        System.out.println(result);
    }

}
