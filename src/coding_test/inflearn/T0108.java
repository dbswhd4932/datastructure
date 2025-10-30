package coding_test.inflearn;

import java.util.Scanner;

public class T0108 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String result = "";

        String alphabetInput = input.toUpperCase().replaceAll("[^A-Z]", "");
        char[] charArray = alphabetInput.toCharArray();

        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            if (charArray[left] == charArray[right]) {
                result = "YES";
                left++;
                right--;
            } else {
                result = "NO";
                break;
            }
        }
        System.out.println(result);
    }
}
