package coding_test.inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class T0103 {

    public static void main(String[] args){
        String result = "";
        int start = 0;

        Scanner in=new Scanner(System.in);
        String input = in.nextLine();

        String[] inputSplit = input.split(" ");
        for (String s : inputSplit) {
            if (start < s.length()) {
                result = s;
                start = s.length();
            }
        }
        System.out.println(result);
    }

}
