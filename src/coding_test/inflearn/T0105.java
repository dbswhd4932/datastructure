package coding_test.inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class T0105 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        char[] charArray = input.toCharArray();

        int left = 0;
        int right = input.length() - 1;

        while(left < right) {
            // 왼쪽이 알파벳이 아니면
            if (!Character.isAlphabetic(charArray[left])) {
                left ++;
                // 오른쪽이 알파벳이 아니면
            } else if (!Character.isAlphabetic(charArray[right])) {
                right --;
                // 둘다 알파벳이면
            } else {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;

                // 포인터 이동
                left ++;
                right --;
            }
        }

        String result = String.valueOf(charArray);
        System.out.println(result);

    }

}
