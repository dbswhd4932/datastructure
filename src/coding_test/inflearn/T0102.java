package coding_test.inflearn;

import java.util.Scanner;

public class T0102 {

    public static void main(String[] args){

        StringBuilder result = new StringBuilder();

        Scanner in=new Scanner(System.in);
        String input = in.next();

        for (String s : input.split("")) {
            if (s.matches("[a-z]")) {
                result.append(s.toUpperCase());
            } else {
                result.append(s.toLowerCase());
            }
        }

        System.out.println(result);
    }
}
