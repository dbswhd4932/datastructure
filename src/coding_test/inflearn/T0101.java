package coding_test.inflearn;

import java.util.Scanner;

public class T0101 {

    public static void main(String[] args) {

        int answer = 0;

        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();

        String input1UpperCase = input1.toUpperCase();
        String input2UpperCase = input2.toUpperCase();

        for (String s : input1UpperCase.split("")) {
            if(s.equals(input2UpperCase)) {
              answer++;
            }
        }
        System.out.println(answer);
    }
}
