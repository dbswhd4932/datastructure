package coding_test.inflearn;

import java.util.Scanner;

public class T0112 {

    public String solution(int n,
                           String str) {
        StringBuilder answerBuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String binaryChunk = str.substring(i * 7, (i * 7) + 7);
            String binaryString = binaryChunk.replace('#', '1').replace('*', '0');
            int decimalValue = Integer.parseInt(binaryString, 2);
            char decodeChar = (char) (decimalValue);
            answerBuilder.append(decodeChar);

        }

        return answerBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        T0112 t = new T0112();
        System.out.println(t.solution(n, str));
    }
}

// 0 ~ 6
// 7 ~ 13
// 14 ~ 20
// 21 ~ 27

// 1000011 -> 67
// 1001111
// 1001111
// 1001100