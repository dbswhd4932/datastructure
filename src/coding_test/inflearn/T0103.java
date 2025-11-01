package coding_test.inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class T0103 {

    public String solution(String str) {
        String answer = "";
        int length = 0;

        String[] array = str.split(" ");
        for (String s : array) {
            if (length < s.length()) {
                length = s.length();
                answer = s;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();

        T0103 t=new T0103();
        System.out.println(t.solution(input));

    }

}
