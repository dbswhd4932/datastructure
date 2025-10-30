package coding_test.inflearn;

import com.sun.jdi.IntegerValue;
import java.util.Scanner;

public class T0109 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = input.toCharArray();

        for (char c : charArray) {
            if (Character.isDigit(c)) {
                stringBuilder.append(c);
            }
        }

        Integer result = Integer.valueOf(stringBuilder.toString());

        System.out.println(result);

    }

}
