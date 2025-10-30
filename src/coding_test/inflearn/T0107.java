package coding_test.inflearn;

import java.util.Scanner;

public class T0107 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        char[] charArray = input.toUpperCase().toCharArray();

        int left = 0;
        int right = input.length() - 1;
        String result = "";

        while (left < right) {
            if (charArray[left] == charArray[right]) {
                result = "YES";
                left ++;
                right --;
            } else {
                result = "NO";
                break;
            }
        }
        System.out.println(result);
    }

}
